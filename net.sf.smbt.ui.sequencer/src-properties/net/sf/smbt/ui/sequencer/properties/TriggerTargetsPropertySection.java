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

package net.sf.smbt.ui.sequencer.properties;

import net.sf.smbt.ezmojo.EZMojoKind;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezsequence.EmitInfo;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.osc.ezmojo.utils.EZMojoTargetUtils;
import net.sf.smbt.ui.Activator;
import net.sf.smbt.ui.dialogs.CommPipeSelectionDialog;
import net.sf.smbt.ui.dialogs.LinkMessagesSelectionDialog;
import net.sf.smbt.ui.hmi.GUIToolkit;
import net.sf.smbt.ui.wizards.CommPipeConfigWizardDialog;
import net.sf.xqz.model.cmd.Cmd;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
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
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.views.properties.tabbed.AbstractPropertySection;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;

import com.illposed.osc.OSCMessage;

public class TriggerTargetsPropertySection extends AbstractPropertySection {
	private EventTrigger trigger;
	
	public TriggerTargetsPropertySection() {}
	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);

		parent.setLayout(GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).create());
		
		Composite container = GUIToolkit.INSTANCE.createComposite(parent);
		
		container.setLayout(GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).create());
		container.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
	
		createContent(container);
	}
	
	
	private static ListViewer targetsListViewer, cmdListViewer;
	
	private void createContent(Composite parent) {
		Composite container = createDefaultComposite(parent);
		
		// Label for owner field
		Label ownerLabel = new Label(container, SWT.NONE);
		ownerLabel.setText("Forward Targets : ");

		// Owner text field
		
		targetsListViewer = new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
	    targetsListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().minSize(200, 100).hint(200, 100).grab(true, true).create());
	    targetsListViewer.getList().setFont(parent.getFont());
	    
	    // Set the label provider		
	    targetsListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            if (element instanceof EZMojoTarget) {
	            	return ((EZMojoTarget) element).toString(); //$NON-NLS-1$
	            }
	            return "???";
	         }
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZMojoTarget) {
	            	return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/forward.png").createImage();
	            }
	        	return super.getImage(element);
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp = new ArrayContentProvider();
	    targetsListViewer.setContentProvider(cp);
	    
	        // Add a selection change listener
	    targetsListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	                // Update OK button enablement
	            ISelection sel = targetsListViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	updateTargetDetails((EZMojoTarget)((IStructuredSelection)sel).getFirstElement());
	            }
	        }
	    });

	   // Add double-click listener
	   targetsListViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	   targetsListViewer.refresh();

	   Composite tatgetButtonBar = new Composite(container, SWT.NONE);
	   tatgetButtonBar.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
	   tatgetButtonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
	   
	   Button addTargetButton = new Button(tatgetButtonBar, SWT.PUSH);
	   addTargetButton.setText("+");
	   addTargetButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					CommPipeSelectionDialog dlg = new CommPipeSelectionDialog();
					if (dlg.open() == Window.OK) {
						Object[] r = dlg.getResult();
						if (r!=null && r.length>0) {
							CmdPipe pipe = (CmdPipe) r[0];
							EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
							if (t instanceof EZMojoTarget) {
								if (!trigger.getEmits().isEmpty()) {
									if (trigger.getEmits().get(0) instanceof EmitInfo) {
										
										trigger.getEmits().get(0).getTargets().remove(t);
										
										targetsListViewer.setInput(trigger.getEmits().get(0).getTargets());
										targetsListViewer.refresh(true);
									}
								}
							}
						} else {
							CommPipeConfigWizardDialog pipeConfigWizardDialog = new CommPipeConfigWizardDialog();
							int status = pipeConfigWizardDialog.open();
							if (status == Window.OK) {
								CmdPipe pipe = pipeConfigWizardDialog.getSelection();
								EZMojoTarget t = EZMojoTargetUtils.INSTANCE.createEzTarget(pipe, EZMojoKind.FORWARD);
								if (t instanceof EZMojoTarget) {
									if (!trigger.getEmits().isEmpty()) {
										if (trigger.getEmits().get(0) instanceof EmitInfo) {
											trigger.getEmits().get(0).getTargets().add(t);
											targetsListViewer.setInput(trigger.getEmits().get(0).getTargets());
											targetsListViewer.refresh(true);
										}
									}
								}
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
	   addTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

	   
	   Button deleteTargetButton = new Button(tatgetButtonBar, SWT.PUSH);
	   deleteTargetButton.setText("-");
	   deleteTargetButton.addSelectionListener(
			   new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
		            ISelection sel = targetsListViewer.getSelection();
		            if (sel instanceof IStructuredSelection) {
						EZMojoTarget t = (EZMojoTarget)((IStructuredSelection)sel).getFirstElement();
						if (t instanceof EZMojoTarget) {
							if (!trigger.getEmits().isEmpty()) {
								if (trigger.getEmits().get(0) instanceof EmitInfo) {
									trigger.getEmits().get(0).getTargets().remove(t);
									targetsListViewer.setInput(trigger.getEmits().get(0).getTargets());
									targetsListViewer.refresh(true);
								}
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
	   deleteTargetButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
	   
	   
	   
	   
	   
	   
	   
	   
		// Label for owner field
		Label cmdLabel = new Label(container, SWT.NONE);
		cmdLabel.setText("Commands : ");

		// Owner text field
		
		cmdListViewer = new ListViewer(container, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		cmdListViewer.getList().setLayoutData(GridDataFactory.fillDefaults().minSize(200, 100).hint(200, 100).grab(true, true).create());
		cmdListViewer.getList().setFont(parent.getFont());
	    
	    // Set the label provider		
		cmdListViewer.setLabelProvider(new LabelProvider() {
	        public String getText(Object element) {
	            // Return the features's label.
	            if (element instanceof Cmd) {
	            	return ((Cmd) element).toString(); //$NON-NLS-1$
	            }
	            return "???";
	         }
	        @Override
	        public Image getImage(Object element) {
	            if (element instanceof EZMojoTarget) {
	            	return Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/ezcmd/forward.png").createImage();
	            }
	        	return super.getImage(element);
	        }
	    });

	    // Set the content provider
	    ArrayContentProvider cp2 = new ArrayContentProvider();
	    cmdListViewer.setContentProvider(cp2);
	    
	        // Add a selection change listener
	    cmdListViewer.addSelectionChangedListener(new ISelectionChangedListener() {
	        public void selectionChanged(SelectionChangedEvent event) {
	                // Update OK button enablement
	            ISelection sel = cmdListViewer.getSelection();
	            if (sel instanceof IStructuredSelection) {
	            	updateCommandDetails((Cmd)((IStructuredSelection)sel).getFirstElement());
	            }
	        }
	    });

	        // Add double-click listener
	    cmdListViewer.addDoubleClickListener(new IDoubleClickListener() {
	        public void doubleClick(DoubleClickEvent event) {
	        	//okPressed();
	        }
	    });
	    cmdListViewer.refresh();

	   
	   
		Composite cmdButtonBar = new Composite(container, SWT.NONE);
		cmdButtonBar.setLayout(GridLayoutFactory.fillDefaults().numColumns(2).create());
		cmdButtonBar.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		   
		Button addCmdButton = new Button(cmdButtonBar, SWT.PUSH);
		addCmdButton.setText("+");
		addCmdButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					//OscMessageCreationDialog dlg = new OscMessageCreationDialog(Display.getDefault().getActiveShell(), "OSC Message", "OSC Message");
					
					LinkMessagesSelectionDialog dlg = new LinkMessagesSelectionDialog(Display.getDefault().getActiveShell(), "OSC Message", "OSC Message");
					
					int status = dlg.open();
					if (status == Window.OK) {
						Object[] commands = dlg.getResult();
						for (Object o : commands) {
							if (o instanceof OSCMessage) {
								@SuppressWarnings("unused")
								OSCMessage msg = (OSCMessage) o;
								if (!trigger.getEmits().isEmpty()) {
									if (trigger.getEmits().get(0) instanceof EmitInfo) {
										trigger.getEmits().get(0).getCmd().add((Cmd)o);
										targetsListViewer.setInput(trigger.getEmits().get(0).getCmd());
										targetsListViewer.refresh(true);
									}
								}
							} 
						}
					}
				}
				@Override
				public void widgetDefaultSelected(SelectionEvent e) {
			}
		}
		);
		addCmdButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.BEGINNING, SWT.CENTER).create());

		   
		Button deleteCmdButton = new Button(cmdButtonBar, SWT.PUSH);
		deleteCmdButton.setText("-");
		deleteCmdButton.addSelectionListener(
			new SelectionListener() {
				@Override
				public void widgetSelected(SelectionEvent e) {
			        ISelection sel = targetsListViewer.getSelection();
			        if (sel instanceof IStructuredSelection) {
			        	Object t = (Object)((IStructuredSelection)sel).getFirstElement();
						if (t instanceof Cmd) {
							if (!trigger.getEmits().isEmpty()) {
								if (trigger.getEmits().get(0) instanceof EmitInfo) {
									trigger.getEmits().get(0).getCmd().remove(t);
									targetsListViewer.setInput(trigger.getEmits().get(0).getCmd());
									targetsListViewer.refresh(true);
								}
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
		deleteCmdButton.setLayoutData(GridDataFactory.swtDefaults().align(SWT.END, SWT.CENTER).create());
	   
	   
	   
	   container.layout(true);
	   container.pack(true);
	}
	
	void updateTargetDetails(EZMojoTarget target) {
		
	}
	
	void updateCommandDetails(Cmd cmd) {
		
	}
	
	/**
	 * @see PreferencePage#createContents(Composite)
	 */
	protected Control createContents(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		composite.setLayout(layout);
		GridData data = new GridData(GridData.FILL);
		data.grabExcessHorizontalSpace = true;
		composite.setLayoutData(data);

		//addFirstSection(composite);
		//addSeparator(composite);
		createContent(composite);
		return composite;
	}

	private Composite createDefaultComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(GridLayoutFactory.fillDefaults().create());
		composite.setLayoutData(GridDataFactory.fillDefaults().grab(true, true).create());
		return composite;
	}

	
	//
	//
	//
	
	
	@Override
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
	    Object o = unwrap(selection);
		if (o instanceof EventTrigger) {
			trigger = (EventTrigger) o;
			if (!trigger.getEmits().isEmpty()) {
				if (trigger.getEmits().get(0) instanceof EmitInfo) {
					if (targetsListViewer != null && !targetsListViewer.getControl().isDisposed()) {
						targetsListViewer.setInput(trigger.getEmits().get(0).getTargets());
						if (!trigger.getEmits().get(0).getTargets().isEmpty()) {
							targetsListViewer.setSelection(
								new StructuredSelection(
									trigger.getEmits().get(0).getTargets().get(0)
								), 
								true
							);
						}
						targetsListViewer.refresh(true);
					}
				}
			}
			refreshContent();
		}
	}
	
	private void refreshContent() {}
	
	@Override
	public void aboutToBeHidden() {
		super.aboutToBeHidden();
	}
	
	@Override
	public void aboutToBeShown() {
		super.aboutToBeShown();
	}
	
	private Object unwrap(Object element) {
		if (element instanceof IStructuredSelection) {
			return ((IStructuredSelection) element).getFirstElement();
		}
		return element;
	}
}
