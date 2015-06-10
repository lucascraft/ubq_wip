/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2011, Lucas Bigeardel
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

package net.sf.smbt.ui.wiimote.dialogs;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.bt.wiimote.utils.BluetoothIOUtils;
import net.sf.smbt.bt.wiimote.utils.WiiFinderListener;
import net.sf.smbt.quantic.warp.QuanticMojo;
import net.sf.smbt.ui.AbstractUITTLJob;
import net.sf.smbt.ui.hmi.UbiJob;
import net.sf.smbt.ui.wiimote.Activator;
import net.sf.smbt.wiimotectrl.WiimoteController;
import net.sf.smbt.wiimotectrl.WiimotectrlFactory;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.SelectionDialog;
import org.eclipse.ui.progress.UIJob;

public class WiimoteConnectionDialog extends SelectionDialog {
	static List<WiimoteController> wiimotes;
	
	private DiscoUIJob disco;
	private MoteDisco moteListener;
	private UIJob refreshJob;
	
	private Label msgLabel;
	
	/**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;
    
	/**
     * List width in characters.
     */
   private final static int LIST_WIDTH = 20;

    /**
     * List to display the resolutions.
     */
    private ListViewer listViewer;

	private class DiscoUIJob extends AbstractUITTLJob {
		private BluetoothIOUtils finder;
		public BluetoothIOUtils getFinder() {
			return finder;
		}
		public DiscoUIJob(MoteDisco listener) {
			super("Disco UI Job", 5000l);
		    finder = BluetoothIOUtils.INSTANCE;
	        finder.addMoteFinderListener(listener);
	        addJobChangeListener(
	        	new IJobChangeListener() {
	    			@Override
	    			public void sleeping(IJobChangeEvent event) {}
	    			@Override
	    			public void scheduled(IJobChangeEvent event) {
	    	        	if (Platform.inDebugMode()) {
	    					System.out.println("Start Wiimote discovery");
	    				}
	    		        finder.startDiscovery();
	    			}
	    			@Override
	    			public void running(IJobChangeEvent event) {}
	    			@Override
	    			public void done(IJobChangeEvent event) {
	    	        	if (Platform.inDebugMode()) {
	    					System.out.println("Stop Wiimote discovery");
	    				}
	    			    finder.stopDiscovery();
	    			}
	    			@Override
	    			public void awake(IJobChangeEvent event) {}
	    			@Override
	    			public void aboutToRun(IJobChangeEvent event) {}
	    	    }
	    	 );
		}
		@Override
		public IStatus runInUIThread(IProgressMonitor monitor) {
	        long t = System.currentTimeMillis();
	        int cpt = 1;
	        int dots = 1;
	        while(isRunning()) {
	        	long now = System.currentTimeMillis();
	        	if ((now - t) > 500) {
	        		cpt++;
	        		dots = (cpt+1)%3;
	        		t = System.currentTimeMillis();
	        	}
	        	String msg = "Press 1 + 2 Wiimote Buttons Please ";
	        	for (int i=0;i<=dots;i++) {
	        		msg += ".";
	        	}
	        	msgLabel.setText(msg);
	        	if (Platform.inDebugMode()) {
					System.out.println(msg);
				}
	        }
        	msgLabel.setText("");
			return Status.OK_STATUS;
		}
	}
	
	private class MoteDisco implements WiiFinderListener {
		@Override
		public void moteFound(String addr) {
			final WiimoteController mote = WiimotectrlFactory.eINSTANCE.createWiimoteController();
			mote.setAddr(addr);
			if (Platform.inDebugMode()) {
				System.out.println("Found mote: " + addr);
			}
            wiimotes.add(mote);
            new UbiJob("Mote Disco refresh job") {
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					listViewer.refresh();
					listViewer.setSelection(new StructuredSelection(mote));
					return Status.OK_STATUS;
				}
            }.schedule();
		}
	}
	
	private void terminate() {
		if (disco != null) {
			if (moteListener != null) {
				disco.getFinder().removeMoteFinderListener(moteListener);
			}
			disco.getFinder().stopDiscovery();
			disco.done(Status.CANCEL_STATUS);
			disco = null;
		}
		if (refreshJob != null) {
			refreshJob.cancel();
			refreshJob.done(Status.CANCEL_STATUS);
			refreshJob = null;
		}
		if (Platform.inDebugMode()) {
			System.out.println("Wiimote connection dialog terminated");
		}
	}
	@Override
	protected void cancelPressed() {
		terminate();
		super.cancelPressed();
	}
	
	@Override
	public boolean close() {
		terminate();
		return super.close();
	}
	
	@Override
	protected Point getInitialSize() {
		return new Point(350, 300);
	}
	
	public WiimoteConnectionDialog(Shell parentShell, String shellTitle, String shellMessage) {
		super(parentShell);
		disco = new DiscoUIJob(moteListener = new MoteDisco());
		disco.schedule();
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	    
	    for (CmdPipe p : QuanticMojo.INSTANCE.getPipes()) {
	    	if (p.getCommunicationProtocol().equals("oscwiimote")) {
	    		// TODO : LB to add wiimotes here !	
	    	}
	    }
	    wiimotes = new ArrayList<WiimoteController>();
	}
	
	@Override
	protected Label createMessageArea(Composite composite) {
		Label label = new Label(composite, SWT.WRAP);
		label.setLayoutData(GridDataFactory.fillDefaults().create());
		if (getMessage() != null) {
			label.setText(getMessage());
		}
		label.setFont(composite.getFont());
		return label;
	}
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        // Create label
        msgLabel = createMessageArea(composite);
        
        // Create list viewer	
        listViewer = new ListViewer(
        	composite, 
        	SWT.SINGLE | 
        	SWT.H_SCROLL | 
        	SWT.V_SCROLL | 
        	SWT.BORDER
        );
        
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        
        listViewer.getList().setLayoutData(data);
        listViewer.getList().setFont(parent.getFont());
        // Set the label provider		
        listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
                return element == null ? "" : "Mote " + ((WiimoteController)element).getAddr(); //$NON-NLS-1$
            }
        });

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        listViewer.setContentProvider(cp);
        listViewer.setInput(wiimotes);

        // Set the initial selection
        listViewer.setSelection(
        	new StructuredSelection(
                getInitialElementSelections()
            ), 
            true
        );

        // Add a selection change listener
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
                getOkButton().setEnabled(!event.getSelection().isEmpty());
            }
        });

        // Add double-click listener
        listViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        
        Composite buttonBar = new Composite(composite, SWT.NONE);
        buttonBar.setLayout(GridLayoutFactory.fillDefaults().create());
        buttonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
        
        Button createArduinoConnectionButton = new Button(buttonBar, SWT.PUSH);
        createArduinoConnectionButton.setImage(
        	Activator.imageDescriptorFromPlugin(
        		Activator.PLUGIN_ID, 
        		"icons/refresh.png"
        	).createImage()
        );
        createArduinoConnectionButton.setToolTipText("Start a new Wiimote Discovery ...");
        createArduinoConnectionButton.addSelectionListener(
        	new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (Platform.inDebugMode()) {
						System.out.println("Start a new Wiimote Discovery ...");
					}
					disco.schedule();				
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {}
			}
        );
		
	    refreshJob = new UbiJob("Wiimote dialog refresh job") {
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				if (listViewer != null && listViewer.getControl() != null && !listViewer.getControl().isDisposed()) {
					listViewer.refresh();
					schedule(500);
					return Status.OK_STATUS;
				}
				return Status.CANCEL_STATUS;
			}
		};
		refreshJob.schedule(500l);

        return composite;
    }
    

    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected void okPressed() {
        IStructuredSelection selection = (IStructuredSelection) listViewer.getSelection();
        setResult(selection.toList());
        super.okPressed();
    }
	
	@Override
	public void setInitialSelections(Object[] selectedElements) {
		super.setInitialSelections(selectedElements);
	}
	
	@Override
	public Object[] getResult() {
		return wiimotes.toArray();
	}
}
