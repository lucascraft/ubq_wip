package net.sf.smbt.ui.mppt.editors;
/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012 - 2013, Lucas Bigeardel
 * 
 * The library is released under:
 * 
 * A) LGPL
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor,
 * Boston, MA 02110-1301 USA
 * 
 * B) EPL
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Lucas Bigeardel <lucas.bigeardel@gmail.com> - Initial API and implementation
 ***********************************************************************************/


import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.ezmppt.EpSolarCmd;
import net.sf.smbt.ezmppt.util.EzmpptAdapterFactory;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.mppt.Activator;
import net.sf.smbt.ui.pachube.gmap.GMap;
import net.sf.smbt.ui.pachube.gmap.LatLng;
import net.sf.smbt.ui.widgets.common.GeoUtils;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.apache.derby.iapi.types.DataType;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.part.EditorPart;
import org.eclipse.ui.progress.UIJob;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;
//import net.sf.smbt.ui.pachube.views.PachubeDataWidget;

public class MpptEditor extends EditorPart implements ISelectionProvider, ITabbedPropertySheetPageContributor {
	 
	static final private String INIT_CENTER = "33.0,5.0";
	static final private int INIT_ZOOM = 2;
	static final private int INIT_TYPE = net.sf.smbt.ui.pachube.gmap.GMap.TYPE_ROADMAP;
	
	private net.sf.smbt.ui.pachube.gmap.GMap gmap = null;
	
	public net.sf.smbt.ui.pachube.gmap.GMap getGoogleMap() {
		return gmap;
	}


	private RefreshJob	ttl;
	private CmdPipe 	pachubeEngine;
	private boolean hideFrozenStreams = false;
	
	private int radius;

	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	private ComposedAdapterFactory adapterFactory;
	
	private Action manageTriggersAction;
	
	public CmdPipe getPachubeEngine() {
		return pachubeEngine;
	}
	public boolean isHideFrozenStreams() {
		return hideFrozenStreams;
	}
	public void setHideFrozenStreams(boolean hideFrozenStreams) {
		this.hideFrozenStreams = hideFrozenStreams;
	}
	
	private final class RefreshJob extends UIJob {
		public RefreshJob() {
			super("Cosm refresh job");
			setSystem(true);
			setPriority(INTERACTIVE);
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			if (gmap != null) {
				LatLng ll = gmap.getCenter();
			}
			
			schedule(10000);
			return Status.OK_STATUS;
		}
	}

	
	@Override
	public void dispose() {
		if (ttl != null) {
			ttl.cancel();
			ttl.done(Status.OK_STATUS);
		}
		super.dispose();
	}
	
   	private final static String datastreamKEY = "DATASTREAMS_JOB_KEY";
   	
   	private class HandleDataJob extends UIJob {
   		private String feed;
   		private DataType datastream;
   		public HandleDataJob(String feed, DataType datastream) {
   			super(datastreamKEY);
   			this.feed = feed;
   			this.datastream = datastream;
		}
   		public String getFeed() {
			return feed;
		}
   		public DataType getDatastream() {
			return datastream;
		}
   		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
			return Status.OK_STATUS;
		}
   	}
   	
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
	}
	
	@Override
	public void doSaveAs() {
		doSave(new NullProgressMonitor());
	}
	
	public MpptEditor() {
		radius		= 25;
		listeners	= new ConcurrentLinkedQueue<ISelectionChangedListener>();
		
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		setSite(site);
		site.setSelectionProvider(
			this
		);
		setInput(input);
		
		
		initAdapterFactory();
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			//return new UbiquinoOutlinePage(this);
		} else if (adapter.equals(IPropertySheetPage.class)) {
			return new MpptPropertySheetPage(this);
		}
		return super.getAdapter(adapter);
	}
	
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzmpptAdapterFactory());
		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
	}
	
	@Override
	public boolean isDirty() {
		return false;
	}
	
	@Override
	public boolean isSaveAsAllowed() {
		return false;
	}
	
	@Override
	public void createPartControl(final Composite parent) {
		parent.setBackground(GUIToolkit.BG);
		
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		container.setBackground(GUIToolkit.BG);
		container.setLayout(GridLayoutFactory.fillDefaults().create());
		container.setLayoutData(GridDataFactory.fillDefaults().create());
		
		Button dmxPipeAction = new Button(container, SWT.PUSH);
		dmxPipeAction.setLayoutData(GridDataFactory.fillDefaults().grab(false, false).create());
		dmxPipeAction.setImage(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.dmx", 
				"icons/plug.png"
			).createImage()
		);
		dmxPipeAction.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					boolean createPipe = true;
					if (!QuanticMojo.INSTANCE.getEnginesByCommunication("dmx").isEmpty()) {
						CommPipeSelectionDialog dlg = new CommPipeSelectionDialog(new TRANSPORT_PROTOCOL[]{TRANSPORT_PROTOCOL.USB}, new String[]{"dmx"});
						int status = dlg.open();
						if (status == Window.OK) {
							Object[] results = dlg.getResult();
							if (results != null) {
								for (Object obj : results) {
									if (obj instanceof CmdPipe) {
										CmdPipe p = (CmdPipe) obj;
										pachubeEngine = p;
										createPipe = false;
									}
								}
							} else {
								createPipe = true;
							}
						}
					} 
					if (createPipe) {
						CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog(new TRANSPORT_PROTOCOL[] {TRANSPORT_PROTOCOL.USB}, new String[] {"dmx"});
						int status = pipeConfigWizardDialog.open();
						if (status == Window.OK) {
							CmdPipe pipe = pipeConfigWizardDialog.getSelection();
							if (pipe != null) {
								pachubeEngine = pipe;
							}
						}
					}
					if (pachubeEngine != null) {
						XCPAddress addr = XCPAddressUtils.INSTANCE.createEzTarget(pachubeEngine);
					}
					if (pachubeEngine != null) {
						pachubeEngine.setLocked(true);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);

	
	}
	
    private void layoutComposite(Control control) {
    	if (control instanceof Composite) {
    		Composite composite = (Composite) control;
    		for (Control c : composite.getChildren()) {
				if (!c.isDisposed()) {
					if (c instanceof Composite) {
						Composite cmp = (Composite) c;
						layoutComposite(cmp);
					}
					c.redraw();
				}
			}
    	}
    }

	private void createManageComponent(SashForm sashAdmin) {
		
        PatternFilter patternFilter = new PatternFilter() {
			protected boolean isLeafMatch(Viewer viewer, Object element) {
				if (element instanceof DataType) {
				}
				return false;
			}
        };
        
        sashAdmin.setWeights(new int[]{1, 5});
	}
	
	private void createBrowseComponent(SashForm sashBrowse) {
	    
	    makeActions();
	        
	    hookContextMenu();
	        
	    init();
	}
	
	private void hookContextMenu() {
		MenuManager menuMgr = new MenuManager("#PopupMenu");
		menuMgr.setRemoveAllWhenShown(true);
		menuMgr.addMenuListener(new IMenuListener() {
			public void menuAboutToShow(IMenuManager manager) {
				//fillContextMenu(manager);
			}
		});
	}
	
	@SuppressWarnings("unused")
	private void fillContextMenu(IMenuManager manager) {
	}

	
	
	Action filterDatastreamsAction;
	
	private void makeActions() {
		filterDatastreamsAction = new Action("Filter Data Streams", SWT.TOGGLE) {
			public void run() {
    			float lat = new Double(gmap.getCenter().latitude).floatValue();
    			float lon = new Double(gmap.getCenter().longitude).floatValue();
			}
		};	
		filterDatastreamsAction.setToolTipText("Filter Data Streams");
		filterDatastreamsAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/filter.png"
			)
		);
		manageTriggersAction = new Action("Manage Triggers", SWT.PUSH) {
			public void run() {
			}
		};	
		manageTriggersAction.setToolTipText("Manage Triggers");
		manageTriggersAction.setImageDescriptor(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui.pachube", 
				"icons/filter.png"
			)
		);
	}

	
    @SuppressWarnings("static-access")
	private void handleWidgets(DataType envType) {
    	if (envType instanceof DataType) {
 		}
    }



    void init() {
		ttl = new RefreshJob();
		ttl.schedule(3000);
		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(new IPropertyChangeListener() {
			@Override
			public void propertyChange(org.eclipse.jface.util.PropertyChangeEvent event) {
			}
		});
	}
	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}
	@Override
	public void setFocus() {}
	
	//
	// Selection
	//
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);
	}
	@Override
	public ISelection getSelection() {
		return new StructuredSelection();
	}
	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);
	}
	@Override
	public void setSelection(ISelection selection) {
		if (selection instanceof StructuredSelection) {
			Object obj = ((StructuredSelection)selection).getFirstElement();
		}
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}
	
	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.pachube";
	}
	
	
	private void createMap( final Composite parent ) {
	    gmap = new GMap( parent, SWT.NONE );
	    gmap.setCenter( GeoUtils.stringToLatLng( INIT_CENTER ) );
	    gmap.setZoom( INIT_ZOOM );
	    gmap.setType( INIT_TYPE );
	    gmap.addDisposeListener(
	    	new DisposeListener() {
				@Override
				public void widgetDisposed(DisposeEvent e) {
				   	pachubeEngine.setLocked(false);
					QuanticMojo.INSTANCE.closePipe(pachubeEngine, true);
					doSaveAs();
				}
			}
	    );
	}

	    
	public void stop() {}
}
