/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2012, Lucas Bigeardel
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

package net.sf.smbt.ui.dmx.editors;


import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.sf.smbt.comm.script.netConf.TRANSPORT_PROTOCOL;
import net.sf.smbt.dmx.ezdmxctrl.DMXProject;
import net.sf.smbt.dmx.ezdmxctrl.provider.EzdmxctrlItemProviderAdapterFactory;
import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.dmx.model.ezdmx.provider.EzdmxItemProviderAdapterFactory;
import net.sf.smbt.dmx.model.qxf.Channel;
import net.sf.smbt.dmx.model.qxf.FixtureDefinition;
import net.sf.smbt.dmx.utils.DMXUtils;
import net.sf.smbt.dmx.utils.OpenDmxCmdUtils;
import net.sf.smbt.quantic.services.XCPAddressUtils;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.dmx.Activator;
import net.sf.smbt.ui.dmx.controller.DXMFixturesContentProvider;
import net.sf.smbt.ui.dmx.controller.OpenDMXCompseableAdapterFactory;
import net.sf.smbt.ui.dmx.controller.dialog.DMXFixtureSelectionDialog;
import net.sf.smbt.ui.dmx.properties.DMXPropertySheetPage;
import net.sf.smbt.ui.dmx.utils.DMXGraphicsUtil;
import net.sf.smbt.ui.dmx.views.DMXSceneWidget;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.smbt.xcp.XCPAddress;
import net.sf.xqz.model.engine.AbstractQxEventHandler;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EVENT_KIND;
import net.sf.xqz.model.engine.Event;
import net.sf.xqz.model.engine.impl.AbstractQxEventHandlerImpl;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.FilteredTree;
import org.eclipse.ui.dialogs.PatternFilter;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

public class DMXMultiPageEditor extends MultiPageEditorPart implements IResourceChangeListener, ISelectionProvider, ITabbedPropertySheetPageContributor {

	private DMXProject dmxProject;
	private ComposedAdapterFactory adapterFactory;
	private FilteredTree filteredTree;
	private DMXSceneWidget scene;
	private Label label;
	private ConcurrentLinkedQueue<ISelectionChangedListener> listeners;
	private AbstractQxEventHandler rdmEvtHandler;
	private ScrolledComposite sc;

	private CmdPipe dmxPipe;
	
	public void setActivePage(int p) {
		super.setActivePage(p);
	}
	
	public DMXMultiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		listeners = new ConcurrentLinkedQueue<ISelectionChangedListener>();
		rdmEvtHandler = new AbstractQxEventHandlerImpl() {
			@Override
			public synchronized void handleQxEvent(Event event) {
				if (event.getKind().equals(EVENT_KIND.RX_DONE)) {
					if (event.getCmd() instanceof OpenDMXCmd) {
						@SuppressWarnings("unused")
						OpenDMXCmd openDMXCmd = (OpenDMXCmd) event.getCmd();
					}
				}
			}
		};
	}

	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	/**
	 * Creates page 0 of the multi-page editor,
	 * which contains a text editor.
	 */
	void createPage0() {
		AdapterFactoryLabelProvider labelProvider = new AdapterFactoryLabelProvider(
			new OpenDMXCompseableAdapterFactory()
		);

	    sc = GUIToolkit.INSTANCE.createScrolledComposite(getContainer(), SWT.V_SCROLL | SWT.BORDER);
	    sc.setBackground(ColorConstants.cyan);

		final Composite container = GUIToolkit.INSTANCE.createComposite(sc);
		container.setLayout(
			GridLayoutFactory.fillDefaults().create()
		);
		container.setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		
		filteredTree = GUIToolkit.INSTANCE.createFilteredTree(
			container, SWT.MULTI | SWT.FULL_SELECTION,
			new PatternFilter(),
			true
		);
		filteredTree.setLayout(GridLayoutFactory.fillDefaults().create());
		filteredTree.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		
		filteredTree.getViewer().getTree().setHeaderVisible(true);
		
		filteredTree.getViewer().setContentProvider(new DXMFixturesContentProvider(true));
		filteredTree.getViewer().setLabelProvider(labelProvider);
		
		filteredTree.getViewer().setInput(dmxProject.getFixtureDefinitions());
		
		filteredTree.getViewer().addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				try {
					PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.views.PropertySheet");
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
		
		getSite().setSelectionProvider(
			this
		);
		
		filteredTree.getViewer().addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setSelection(
					event.getSelection()
				);
			}
		});

		createTableViewerColumn(filteredTree.getViewer(), labelProvider, "Universe", 120);
		createTableViewerColumn(filteredTree.getViewer(), labelProvider, "Addresses", 120);
		createTableViewerColumn(filteredTree.getViewer(), labelProvider, "Fixture", 120);
		createTableViewerColumn(filteredTree.getViewer(), labelProvider, "Jumpers", 120);
		
		
		if (!dmxProject.getFixtureDefinitions().isEmpty()) {
			filteredTree.getViewer().setSelection(new StructuredSelection(dmxProject.getFixtureDefinitions().get(0)));
		}
		
		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.views.PropertySheet");
		} catch (PartInitException e) {
			e.printStackTrace();
		}
		
		Composite buttonBar2 = new Composite(container, SWT.NONE);
		buttonBar2.setLayout(GridLayoutFactory.fillDefaults().numColumns(4).create());
		buttonBar2.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		   
		Button addMsgButton = new Button(buttonBar2, SWT.PUSH);
		addMsgButton.setImage(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/actions/list-add.png"
			).createImage()
		);		
		addMsgButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					DMXFixtureSelectionDialog dlg = new DMXFixtureSelectionDialog(
						Display.getDefault().getActiveShell(), 
						"Fixture Selection", 
						"Fixture Selection",
						dmxProject.getLibrary()
					);
					dlg.open();
					Object[] results = dlg.getResult();
					if (results != null && results.length>0) {
						for (Object o : results) {
							if (o instanceof FixtureDefinition) {
								FixtureDefinition def = (FixtureDefinition) o;
								dmxProject.getFixtureDefinitions().add(def);
								filteredTree.getViewer().setSelection(new StructuredSelection(def));
								filteredTree.getViewer().refresh(true);
								scene.reset();
							}
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		addMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		Button deleteMsgButton = new Button(buttonBar2, SWT.PUSH);
		deleteMsgButton.setImage(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/actions/list-remove.png"
			).createImage()
		);		
		deleteMsgButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
			        ISelection sel = filteredTree.getViewer().getSelection();
			        if (sel instanceof IStructuredSelection) {
			        	Object obj = ((StructuredSelection)sel).getFirstElement();
			        	if (obj instanceof FixtureDefinition) {
			        		dmxProject.getFixtureDefinitions().remove((FixtureDefinition) obj);
			        		if (!dmxProject.getFixtureDefinitions().isEmpty()) {
			        			filteredTree.getViewer().setSelection(new StructuredSelection(dmxProject.getFixtureDefinitions().get(0)));
			        		}
			        		filteredTree.getViewer().refresh(true);
			        		scene.reset();
			        	}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		deleteMsgButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());

		
		Button downButton = new Button(buttonBar2, SWT.PUSH);
		downButton.setImage(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/actions/go-down.png"
			).createImage()
		);
		downButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
			        ISelection sel = filteredTree.getViewer().getSelection();
			        if (sel instanceof IStructuredSelection) {
			        	Object obj = ((StructuredSelection)sel).getFirstElement();
			        	if (obj instanceof FixtureDefinition) {
			        		int idx = dmxProject.getFixtureDefinitions().indexOf((FixtureDefinition) obj);
			        		
			        		if (idx==dmxProject.getFixtureDefinitions().size() - 1) {
			        			idx = 0;
			        		} else {
			        			idx++;
			        		}
			        		
			        		dmxProject.getFixtureDefinitions().remove((FixtureDefinition) obj);
			        		dmxProject.getFixtureDefinitions().add(idx, (FixtureDefinition) obj);
							filteredTree.getViewer().setSelection(new StructuredSelection(obj));

			        		filteredTree.getViewer().refresh(true);
			        		scene.reset();
			        	}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);

		Button upButton = new Button(buttonBar2, SWT.PUSH);
		upButton.setImage(
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/actions/go-up.png"
			).createImage()
		);
		upButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
			        ISelection sel = filteredTree.getViewer().getSelection();
			        if (sel instanceof IStructuredSelection) {
			        	Object obj = ((StructuredSelection)sel).getFirstElement();
			        	if (obj instanceof FixtureDefinition) {
			        		int idx = dmxProject.getFixtureDefinitions().indexOf((FixtureDefinition) obj);
			        		
			        		if (idx==0) {
			        			idx = dmxProject.getFixtureDefinitions().size() - 1;
			        		} else {
			        			idx--;
			        		}
			        		
			        		dmxProject.getFixtureDefinitions().remove((FixtureDefinition) obj);
			        		dmxProject.getFixtureDefinitions().add(idx, (FixtureDefinition) obj);
							filteredTree.getViewer().setSelection(new StructuredSelection(obj));
							
			        		filteredTree.getViewer().refresh(true);
			        		scene.reset();
			        	}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);
		
		
        sc.setAlwaysShowScrollBars(true);
        sc.setExpandVertical(true);
        sc.setExpandHorizontal(true);
        sc.setContent(container);
        sc.addControlListener(
        	new ControlListener() {
				@Override
				public void controlResized(ControlEvent e) {
					Rectangle r = sc.getClientArea();
					sc.setMinSize(container.computeSize(r.width, SWT.DEFAULT));
			        sc.layout(true);
			        container.layout(true);
			        container.redraw();
				}
				@Override
				public void controlMoved(ControlEvent e) {}
			}
        );
		Rectangle r = sc.getClientArea();
		sc.setMinSize(container.computeSize(r.width, SWT.DEFAULT));
  
		
		int index = addPage(sc);
		setPageText(index, "Config");
		setPageImage(
			index, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/categories/preferences-system.png"
			).createImage()
		);
	}
	
	private TreeViewerColumn createTableViewerColumn(final TreeViewer treeViewer, final AdapterFactoryLabelProvider labelProvider, String title, int bound) {
		final TreeViewerColumn viewerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		final TreeColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		
		viewerColumn.setLabelProvider(new StyledCellLabelProvider() {
			@Override
			public void update(ViewerCell cell) {
				super.update(cell);

				Object[] children = ((ITreeContentProvider)treeViewer.getContentProvider()).getElements(dmxProject.getFixtureDefinitions());
				int start	= 0;
				int end		= 0;
				for (Object o : children) {
					if (o instanceof FixtureDefinition) {
						FixtureDefinition def = (FixtureDefinition) o;
						List<Channel> channels = def.getChannel();
						if (!def.getMode().isEmpty()) {
							end		+= channels.size();
							start	= end - channels.size();
							if (def.equals(cell.getElement())) {
								end--;
								break;
							}
						}
					}
				}
				
				int idx = cell.getColumnIndex();
				if (idx==0) {
					cell.setText("0");
				} else if (idx == 1) {
					cell.setText(start + " - " + end);
				} else if (idx == 2) {
					cell.setText(labelProvider.getText(cell.getElement()));
					cell.setImage(labelProvider.getImage(cell.getElement()));
				} else if (idx == 3) {
					cell.setImage(DMXGraphicsUtil.INSTANCE.getDMXFixtureJumpersImage(start));
				}
			}
		});
		return viewerColumn;
	}

	void createPage2() {
		Composite container = GUIToolkit.INSTANCE.createComposite(getContainer());
		container.setLayout(
			GridLayoutFactory.fillDefaults().create()
		);
		container.setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		
		Composite topPanel = new Composite(container, SWT.NONE);
		topPanel.setLayout(
			GridLayoutFactory.fillDefaults().numColumns(2).create()
		);
		topPanel.setLayoutData(
			GridDataFactory.fillDefaults().grab(true, false).create()
		);
		topPanel.setBackground(GUIToolkit.BG);
		
		Button dmxPipeAction = new Button(topPanel, SWT.PUSH);
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
										dmxPipe = p;
										scene.setDMXPipe(dmxPipe);
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
								dmxPipe = pipe;
								scene.setDMXPipe(dmxPipe);
							}
						}
					}
					if (dmxPipe != null) {
						XCPAddress addr = XCPAddressUtils.INSTANCE.createEzTarget(dmxPipe);
						dmxProject.setLastAddress(addr);
						label.setText(addr.toString());
						label.setForeground(ColorConstants.lightGreen);
					}
					if (dmxPipe != null) {
						dmxPipe.setLocked(true);
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
					widgetSelected(e);
				}
			}
		);

		label = new Label(topPanel, SWT.NONE);
		label.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).hint(1000, SWT.DEFAULT).align(SWT.LEFT, SWT.CENTER).create());
		label.setForeground(ColorConstants.orange);
		label.setBackground(GUIToolkit.BG);
		if (dmxPipe != null) {
			label.setForeground(ColorConstants.lightGreen);
			label.setText(dmxProject.getLastAddress().toString());
		} else {
			label.setText("Not Connected");
			label.setForeground(ColorConstants.orange);
		}
		
        sc = GUIToolkit.INSTANCE.createScrolledComposite(container, SWT.V_SCROLL | SWT.BORDER);
        sc.setBackground(ColorConstants.cyan);

		
		
		scene = new DMXSceneWidget(sc, this, dmxProject, dmxPipe);
		
		
		
	       sc.setAlwaysShowScrollBars(true);
	        sc.setExpandVertical(true);
	        sc.setExpandHorizontal(true);
	        sc.setContent(scene);
	        sc.addControlListener(
	        	new ControlListener() {
					@Override
					public void controlResized(ControlEvent e) {
						Rectangle r = sc.getClientArea();
						sc.setMinSize(scene.computeSize(r.width, SWT.DEFAULT));
				        sc.layout(true);
				        scene.layout(true);
				        scene.redraw();
					}
					@Override
					public void controlMoved(ControlEvent e) {}
				}
	        );
	        sc.setMinSize(SWT.DEFAULT, 200);
	  
			Rectangle r = sc.getClientArea();
			sc.setMinSize(scene.computeSize(r.width, SWT.DEFAULT));

		
		int index = addPage(container);
		setPageText(index, "Control");
		setPageImage(
			index, 
			Activator.imageDescriptorFromPlugin(
				"net.sf.smbt.ui", 
				"icons/new/control_wheel.png"
			).createImage()
		);
		
		addPageChangedListener(new IPageChangedListener() {
			@Override
			public void pageChanged(PageChangedEvent event) {
				Object o = event.getSelectedPage();
				if (o instanceof Composite) {
					boolean doit = true;
					for (Control c : ((Composite)o).getChildren()) {
						if (c instanceof DMXSceneWidget) {
							TabFolder folder = ((DMXSceneWidget)c).getTabFolder();
							setSelection(new StructuredSelection(dmxProject));
							if (folder.getItemCount() > 1) {
								folder.setSelection(1);
								folder.setSelection(0);
								doit = false;
							}
						} 
					}
					if (doit) {
						setSelection(filteredTree.getViewer().getSelection());
					}
					try {
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().showView("org.eclipse.ui.views.PropertySheet");
					} catch (PartInitException e) {
						e.printStackTrace();
					}
				}
			}
		});
		
		
	}
	
	void createPage1() {
		Composite container = GUIToolkit.INSTANCE.createComposite(getContainer());
		container.setLayout(
			GridLayoutFactory.fillDefaults().create()
		);
		container.setLayoutData(
			GridDataFactory.fillDefaults().grab(true, true).create()
		);
		
		Composite topPanel = new Composite(container, SWT.NONE);
		topPanel.setLayout(
			GridLayoutFactory.fillDefaults().numColumns(2).create()
		);
		topPanel.setLayoutData(
			GridDataFactory.fillDefaults().grab(true, false).create()
		);
		topPanel.setBackground(GUIToolkit.BG);
		
		Image refreshImg = Activator.imageDescriptorFromPlugin(
			"net.sf.smbt.ui", 
			"icons/actions/view-refresh.png"
		).createImage();
		
		int index = addPage(container);
		setPageText(index, "RDM");
		setPageImage(
			index, 
			refreshImg
		);
		
		Button refreshButton = new Button(topPanel, SWT.PUSH);
		refreshButton.setImage(refreshImg);
		refreshButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleRDMRefresh();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
	}
	
	/**
	 * Creates the pages of the multi-page editor.
	 */
	protected void createPages() {
		createPage0();
		createPage2();
	}

	private void handleRDMRefresh() {
		if (dmxPipe != null) {
			dmxPipe.removeQxEventHandler(rdmEvtHandler);
			dmxPipe.addQxEventHandler(rdmEvtHandler);
			dmxPipe.send(OpenDmxCmdUtils.INSTANCE.createOpenDMXGetWidgetSerialNumberRequestCmd());
			dmxPipe.send(OpenDmxCmdUtils.INSTANCE.createOpenDMXSendRDMDiscoveryRequestCmd());
		}
	}
	/**
	 * The <code>MultiPageEditorPart</code> implementation of this 
	 * <code>IWorkbenchPart</code> method disposes all nested editors.
	 * Subclasses may extend.
	 */
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		DMXUtils.INSTANCE.save(getEditorInput(), dmxProject);
		dmxPipe.setLocked(false);
		QuanticMojo.INSTANCE.closePipe(dmxPipe, true);
		super.dispose();
	}
	
	/**
	 * Saves the multi-page editor's document.
	 */
	public void doSave(IProgressMonitor monitor) {
		getEditor(0).doSave(monitor); // config
		getEditor(2).doSave(monitor); // console
		DMXUtils.INSTANCE.save(getEditorInput(), dmxProject);
	}
	
	/**
	 * Saves the multi-page editor's document as another file.
	 * Also updates the text for page 0's tab, and updates this multi-page editor's input
	 * to correspond to the nested editor's.
	 */
	public void doSaveAs() {
		IEditorPart editor0 = getEditor(0);
		editor0.doSaveAs();
		setPageText(0, editor0.getTitle());
		setInput(editor0.getEditorInput());
		DMXUtils.INSTANCE.save(getEditorInput(), dmxProject);
	}
	
	/* (non-Javadoc)
	 * Method declared on IEditorPart
	 */
	public void gotoMarker(IMarker marker) {
		setActivePage(0);
		IDE.gotoMarker(getEditor(0), marker);
	}
	
	/**
	 * The <code>MultiPageEditorExample</code> implementation of this method
	 * checks that the input is an instance of <code>IFileEditorInput</code>.
	 */
	public void init(IEditorSite site, IEditorInput editorInput)
		throws PartInitException {
		if (!(editorInput instanceof IFileEditorInput))
			throw new PartInitException("Invalid Input: Must be IFileEditorInput");
		super.init(site, editorInput);
		setSite(site);
		DMXProject proj = DMXUtils.INSTANCE.load(editorInput);
		dmxProject = (proj.getLibrary() == null && proj.getUniverses().isEmpty()) ? DMXUtils.INSTANCE.initDMXProject() : proj;
		if (dmxProject.getLastAddress() != null) {
			if (dmxPipe == null) {
				MessageDialog dlg = new MessageDialog(
					Display.getDefault().getActiveShell(),
					"DMX connection question",
					Activator.imageDescriptorFromPlugin(
						"net.sf.smbt.ui", 
						"icons/new/control_wheel.png"
					).createImage(),
					"Reconnect to last known DMX connection ?\n\n" + dmxProject.getLastAddress().toString(),
					MessageDialog.QUESTION_WITH_CANCEL,
					new String[] { 
						"Yes", 
						"No", 
						"Cancel" 
					},
					0
				);
				if (dlg.open() == 0) {
					CmdPipe pipe = XCPAddressUtils.INSTANCE.getCmdPipe(
						dmxProject.getLastAddress(), 
						true
					);
					if (pipe == null) {
						dmxProject.setLastAddress(null);
						label.setText("Not connected !");
						label.setForeground(ColorConstants.orange);
					} else {
						dmxPipe = pipe;
					}
				}
			}
		}
		initAdapterFactory();
		setInput(editorInput);
	}
	
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			//return new GroovixOutlinePage(this);
		} else if (adapter.equals(IPropertySheetPage.class)) {
			return new DMXPropertySheetPage(this);
		}
		return super.getAdapter(adapter);
	}
	
	private void initAdapterFactory() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzdmxctrlItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new EzdmxItemProviderAdapterFactory());
	}

	/* (non-Javadoc)
	 * Method declared on IEditorPart.
	 */
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	/**
	 * Calculates the contents of page 2 when the it is activated.
	 */
	protected void pageChange(int newPageIndex) {
		super.pageChange(newPageIndex);
		
		if (newPageIndex == 0) {} 
		else if (newPageIndex == 1) {}
		else if (newPageIndex == 2) {}
	}
	
	/**
	 * Closes all project files on project close.
	 */
	public void resourceChanged(final IResourceChangeEvent event){
		if(event.getType() == IResourceChangeEvent.PRE_CLOSE){
			Display.getDefault().asyncExec(new Runnable(){
				public void run(){
					IWorkbenchPage[] pages = getSite().getWorkbenchWindow().getPages();
					for (int i = 0; i<pages.length; i++){
					}
				}            
			});
		}
	}
	
	@Override
	public boolean isSaveOnCloseNeeded() {
		return true;
	}
	
	@Override
	public String getContributorId() {
		return "net.sf.smbt.ui.dmx";
	}

	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.add(listener);		
	}

	@Override
	public ISelection getSelection() {
		return dmxProject != null ? new StructuredSelection(dmxProject.getSelection()) : new StructuredSelection();
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		listeners.remove(listener);		
	}

	@Override
	public void setSelection(ISelection selection) {
		if (dmxProject != null) { 
			if (selection instanceof StructuredSelection) {
				Object obj = ((StructuredSelection)selection).getFirstElement();
				if (obj instanceof EObject) {
					dmxProject.setSelection((EObject) obj);
				}
			}
		}
		for (ISelectionChangedListener l : listeners) {
			l.selectionChanged(new SelectionChangedEvent(this, getSelection()));
		}
	}
}
