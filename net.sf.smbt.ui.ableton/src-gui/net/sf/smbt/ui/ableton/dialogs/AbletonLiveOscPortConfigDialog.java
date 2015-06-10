/***********************************************************************************
 * Ubiquisense - A smart ambient utilities framework 
 * 
 * Copyright (c) 2008 - 2010, Lucas Bigeardel
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

package net.sf.smbt.ui.ableton.dialogs;

import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.ui.hmi.GUIToolkit;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.SelectionDialog;

public class AbletonLiveOscPortConfigDialog extends SelectionDialog {
	List<Integer> avalaibleAbletonLiveOscPorts;
	/**
     * List height in characters.
     */
    private final static int LIST_HEIGHT = 10;
    
	/**
     * List width in characters.
     */
   private final static int LIST_WIDTH = 20;

   public final static int ADD_PORT_BUTTON_ID = 100;
   
   public final static int REMOVE_PORT_BUTTON_ID = 200;
   
   private Button addButton, removeButton;
   
   private Text portLabelEdit;
   
    /**
     * List to display the resolutions.
     */
    private ListViewer listViewer;

    /**
     * Constructor w/ arguments
     *  
     * @param parentShell parent {@link Shell}
     * @param shellTitle {@link Shell} title
     * @param shellMessage {@link Shell} message
     */
	public AbletonLiveOscPortConfigDialog(Shell parentShell, String shellTitle, String shellMessage) {
		super(parentShell);
		avalaibleAbletonLiveOscPorts = new ArrayList<Integer>();
	    setTitle(shellTitle);
	    setMessage(shellMessage);
	    
	    avalaibleAbletonLiveOscPorts.add(9000);
	    
	    setSelectionResult(avalaibleAbletonLiveOscPorts.toArray());
	}
	
    /* (non-Javadoc)
     * Method declared on Dialog.
     */
    protected Control createDialogArea(Composite parent) {
        Composite composite = (Composite) super.createDialogArea(parent);

        // Create label
        createMessageArea(composite);
        // Create list viewer	
        listViewer = new ListViewer(composite, SWT.SINGLE | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.BORDER);
        GridData data = new GridData(GridData.FILL_BOTH);
        data.heightHint = convertHeightInCharsToPixels(LIST_HEIGHT);
        data.widthHint = convertWidthInCharsToPixels(LIST_WIDTH);
        listViewer.getList().setLayoutData(data);
        listViewer.getList().setFont(parent.getFont());
        // Set the label provider		
        listViewer.setLabelProvider(new LabelProvider() {
            public String getText(Object element) {
                // Return the features's label.
                return element == null ? "" : element.toString(); //((CommPortIdentifier)element).getName(); //$NON-NLS-1$
            }
        });

        // Set the content provider
        ArrayContentProvider cp = new ArrayContentProvider();
        listViewer.setContentProvider(cp);
        listViewer.setInput(avalaibleAbletonLiveOscPorts);

        // Set the initial selection
        listViewer.setSelection(new StructuredSelection(
                getInitialElementSelections()), true);

        
        // Add a selection change listener
        listViewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                // Update OK button enablement
            	validateSelection(event);
            }
        });

        // Add double-click listener
        listViewer.addDoubleClickListener(new IDoubleClickListener() {
            public void doubleClick(DoubleClickEvent event) {
                okPressed();
            }
        });
        listViewer.getList().setBackground(GUIToolkit.BG);
        listViewer.getList().setForeground(GUIToolkit.FG);
        
        return composite;
    }
    
    private void validateSelection(SelectionChangedEvent event) {
    	String selectionLabel = ""+ (Integer)((IStructuredSelection)listViewer.getSelection()).getFirstElement();

        portLabelEdit.setText(selectionLabel);
        portLabelEdit.addVerifyListener(new VerifyListener() {
			@Override
			public void verifyText(VerifyEvent e) {
				int port = Integer.parseInt(e.text);
				portLabelEdit.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_LIST_FOREGROUND));
		        getOkButton().setEnabled(true);
		        try {					
					Integer.parseInt(e.text);
				} catch(NumberFormatException ex) {
					portLabelEdit.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
			        getOkButton().setEnabled(false);
			        return;
				}
				if (port > 99999 || port < 1000) {
					portLabelEdit.setForeground(Display.getDefault().getSystemColor(SWT.COLOR_RED));
			        getOkButton().setEnabled(false);
				}
			}
		});
        getOkButton().setEnabled(!event.getSelection().isEmpty());
    }
    
    @Override
    protected Label createMessageArea(Composite composite) {
    	portLabelEdit = new Text(composite, SWT.BORDER);
    	portLabelEdit.setLayoutData(GridDataFactory.fillDefaults().create());
    	return super.createMessageArea(composite);
    }
    
    @Override
    protected void createButtonsForButtonBar(Composite parent) {
    	addButton = createButton(parent, ADD_PORT_BUTTON_ID, "Add", false);
    	removeButton = createButton(parent, REMOVE_PORT_BUTTON_ID, "Remove", false);
    	
    	initAddAndRemoveButtons();
    	
    	super.createButtonsForButtonBar(parent);
    }

    private void handleRemovePort() {
		ISelection selection = listViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			Object obj = ((IStructuredSelection)selection).getFirstElement();
			if (obj instanceof Integer) {
				avalaibleAbletonLiveOscPorts.remove(obj);
				listViewer.refresh(true);
			}
		}
    }
    private void handleAddPort() {
		ISelection selection = listViewer.getSelection();
		if (selection instanceof IStructuredSelection) {
			@SuppressWarnings("unused")
			Object obj = ((IStructuredSelection)selection).getFirstElement();
			avalaibleAbletonLiveOscPorts.add(new Integer("9002"));
			listViewer.refresh(true);
		}
    }

    public void initAddAndRemoveButtons() {
    	addButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleAddPort();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
    	removeButton.addSelectionListener(new SelectionListener() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleRemovePort();
			}
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		});
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
		return avalaibleAbletonLiveOscPorts.toArray();
	}
}