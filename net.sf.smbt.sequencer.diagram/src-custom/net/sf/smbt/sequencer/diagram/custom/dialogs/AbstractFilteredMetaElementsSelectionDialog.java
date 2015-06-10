/***********************************************************************************
 * Smbt - A smart ambient utilities framework 
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

package net.sf.smbt.sequencer.diagram.custom.dialogs;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;
import org.eclipse.ui.dialogs.SearchPattern;

/**
 * This class has responsability to present the list of all reachable EClassifier for 
 * current workspace. Extending {@link FilteredItemsSelectionDialog}
 * allows to take advantage of the regex based query filtering system to discriminate EClass
 * based elements on their (non fully qualified) names. 
 * 
 * @author <a href="mailto:lucas.bigeardel@gmail.com">Lucas Bigeardel</a>
 *
 */
public abstract class AbstractFilteredMetaElementsSelectionDialog extends
		FilteredItemsSelectionDialog {
	// controls
	private IDialogSettings settings;
	
	// Default minimal set of Ecore related ILabelProvider
	protected ComposeableAdapterFactory listMetaElementParticipantAdapterFactory;
	protected ILabelProvider listMetaElementParticipantLabelProvider;
	
	protected ComposeableAdapterFactory detailsMetaElementParticipantAdapterFactory;
	protected ILabelProvider detailsMetaElementParticipantLabelProvider;
	
	// 
	protected Map<String, AdapterFactory> adapterFactories;
	
	protected abstract boolean isAnElementToConsider(Object item);

	private class MetaElementsFilter extends ItemsFilter {
		@Override
		public boolean isConsistentItem(Object item) {
			return isAnElementToConsider(item);
		}
		@Override
		public boolean matchItem(Object item) {
			if (isConsistentItem(item)) {
				return matches(getElementName(item));
			}
			return false;
		}
		@Override
		public boolean isSubFilter(ItemsFilter filter) {
			return false;
		}
		@Override
		public boolean equalsFilter(ItemsFilter filter) {
			return false;
		}
		@Override
		public int getMatchRule() {
			return SearchPattern.RULE_CAMELCASE_MATCH;
		}
	}
	
	public AbstractFilteredMetaElementsSelectionDialog(Shell shell, boolean multi) {
		super(shell, multi);
		
		listMetaElementParticipantLabelProvider = new AdapterFactoryLabelProvider(
			new ComposedAdapterFactory(
				getMetaElementComposeableAdapterFactories()
			)
		);
		setListLabelProvider(listMetaElementParticipantLabelProvider);

		detailsMetaElementParticipantLabelProvider = new AdapterFactoryLabelProvider(
			new ComposedAdapterFactory(
				getMetaElementComposeableAdapterFactories()
			)
		);
		setDetailsLabelProvider(detailsMetaElementParticipantLabelProvider);
		
		setTitle("dfsdfsfsdfs"); //$NON-NLS-1$
	}

	/**
	 * 
	 * @return
	 */
	protected Map<String, List<EClassifier>> getCmdSetMap() {
		return new HashMap<String, List<EClassifier>>();
	}
	
	@Override
	public void create() {
		super.create();
		if (getPatternControl() instanceof Text) {
			((Text)getPatternControl()).setText("?"); //$NON-NLS-1$
		}
	}
	

	/**
	 * Implement few Ecore basic composeable Adapter Factories.
	 * This will be overidden by user. This would allow to avoid void lists ... ^^
	 */
	protected abstract List<AdapterFactory> getMetaElementComposeableAdapterFactories();
	
    public class CmdSetInfo {
    	public CmdSetInfo(String id, List<Cmd> cmdList) {
    		setID = id;
    		commands = cmdList;
    	}
    	public String setID;
    	public List<Cmd> commands;
    }
    
	@Override
	protected ItemsFilter createFilter() {
		return new MetaElementsFilter();
	}
	
	@Override
	public abstract String getElementName(Object item);
	
	@Override
	protected Comparator<Cmd> getItemsComparator() {
		return new Comparator<Cmd>() {
			public int compare(Cmd arg0, Cmd arg1) {
				String id0 = arg0.eClass().getName()==null?"":arg0.eClass().getName();
				String id1 = arg1.eClass().getName()==null?"":arg1.eClass().getName();
				return id0.compareTo(id1);
			}
		};
	}

	@Override
	protected IStatus validateItem(Object item) {
		return Status.OK_STATUS;//item instanceof IModelResultEntry?Status.OK_STATUS:Status.CANCEL_STATUS;
	}
	
	@Override
	protected Control createExtendedContentArea(Composite parent) {
		ViewForm viewForm = new ViewForm(parent, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gd.heightHint = 50;
		viewForm.setLayoutData(gd);
		final Button editorModeCheckBox = new Button(viewForm, SWT.CHECK);
		editorModeCheckBox.setLayoutData(gd);
		editorModeCheckBox.setText("qdksjdkjqsgdkjgqkjdgq"); //$NON-NLS-1$
		editorModeCheckBox.addSelectionListener(new SelectionListener() {
			public void widgetSelected(SelectionEvent e) {
//
				}
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);
			}
		
		});
		viewForm.setContent(editorModeCheckBox);
		
		IDialogSettings openDiagramDialogSettings;
		boolean openEditorButtonToggleMode = false;
		if (getDialogSettings()!= null) {
			if ((openDiagramDialogSettings = getDialogSettings().getSection("AZERTY"))!=null) {
				openEditorButtonToggleMode = openDiagramDialogSettings.getBoolean("AZERTY");
			}
		}
		return viewForm;
	}
	
	@Override
	protected IDialogSettings getDialogSettings() {
		if (settings != null) {
			return settings;
		} else {
			return settings = new DialogSettings("AZERTY");
		}
	}

	@Override
	protected void restoreDialog(IDialogSettings settings) {
		if (settings != null) {
			super.restoreDialog(settings);
		} else {
			if (this.settings != null) {
				super.restoreDialog(this.settings);
			} else {
				this.settings = new DialogSettings("AZERTY");
				super.restoreDialog(this.settings);
			}
		}
	}
	
	@Override
	protected void storeDialog(IDialogSettings settings) {
		if (settings != null) {
			IDialogSettings openDiagramDialogSettings;
			if ((openDiagramDialogSettings = settings.getSection("AZERTY"))==null) {
				openDiagramDialogSettings = settings.addNewSection("AZERTY");
			}
		} else {
			settings = new DialogSettings("AZERTY");
		}
	}
	
	@Override
	protected void okPressed() {
		super.okPressed();		
	}
}
