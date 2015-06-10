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

package net.sf.smbt.jazzmutant.diagram.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.sf.smbt.ezlemur.provider.EzlemurItemProviderAdapterFactory;
import net.sf.smbt.jzmui.JZUIElem;
import net.sf.smbt.jzmui.provider.JzmuiItemProviderAdapterFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.provider.EcoreItemProviderAdapterFactory;
import org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractModelNavigator;
import org.eclipse.emf.ecoretools.diagram.ui.outline.internal.Messages;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.action.CopyAction;
import org.eclipse.emf.edit.ui.action.CreateChildAction;
import org.eclipse.emf.edit.ui.action.CutAction;
import org.eclipse.emf.edit.ui.action.DeleteAction;
import org.eclipse.emf.edit.ui.action.PasteAction;
import org.eclipse.emf.edit.ui.action.RedoAction;
import org.eclipse.emf.edit.ui.action.UndoAction;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.IPageSite;

public class JZUIModelNavigator extends AbstractModelNavigator {

	/**
	 * Constructor
	 * 
	 * @param parent
	 *            the parent Composite
	 * @param diagEditor
	 *            the diagram editor
	 * @param pageSite
	 *            the IPageSite
	 */
	public JZUIModelNavigator(Composite parent, IDiagramWorkbenchPart diagEditor, IPageSite pageSite) {
		super(parent, diagEditor, pageSite);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractModelNavigator#getAdapterFactory()
	 */
	@Override
	protected AdapterFactory getAdapterFactory() {
		ArrayList<AdapterFactory> factories = new ArrayList<AdapterFactory>();
		factories.add(new JzmuiItemProviderAdapterFactory());
		factories.add(new EzlemurItemProviderAdapterFactory());
		factories.add(new EcoreItemProviderAdapterFactory());
		factories.add(new ResourceItemProviderAdapterFactory());
		factories.add(new ReflectiveItemProviderAdapterFactory());
		return new ComposedAdapterFactory(factories);
	}
	
	
	@Override
	protected void createEMFMenu(IMenuManager manager, EObject selectedObject) {
		if (!isEMFMenuEnabledFor(selectedObject)) {
			return;
		}
		
		ISharedImages sharedImages = PlatformUI.getWorkbench().getSharedImages();

		final TransactionalEditingDomain editingDomain = TransactionUtil.getEditingDomain(getDiagramResource());
		final IStructuredSelection structuredSelection = new StructuredSelection(selectedObject);

		
		IEditingDomainItemProvider itemProvider = (IEditingDomainItemProvider) getAdapterFactory().adapt(selectedObject, IEditingDomainItemProvider.class);
		
		Collection<CommandParameter> newChildDescriptors = (Collection<CommandParameter>) itemProvider.getNewChildDescriptors(selectedObject, editingDomain, null);
		
		List<CommandParameter> parameters = new ArrayList<CommandParameter>();
		for (CommandParameter cp : newChildDescriptors) {
			if (! (cp.getValue() instanceof JZUIElem)) {
				parameters.add(cp);
			}
		}
		
		if (parameters.size() > 0) {
			MenuManager menuManager = new MenuManager(Messages.AbstractModelNavigator_NewChild);
			for (Object descriptor : parameters) {
				menuManager.add(new CreateChildAction(editingDomain, structuredSelection, descriptor));
			}
			manager.add(menuManager);
		}
		manager.add(new Separator());

		UndoAction undoAction = new UndoAction(editingDomain);
		undoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_UNDO));
		manager.add(new ActionContributionItem(undoAction));

		RedoAction redoAction = new RedoAction(editingDomain);
		redoAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_REDO));
		manager.add(new ActionContributionItem(redoAction));

		manager.add(new Separator());

		CopyAction copyAction = new CopyAction(editingDomain);
		copyAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_COPY));
		manager.add(new ActionContributionItem(copyAction));

		CutAction cutAction = new CutAction(editingDomain);
		cutAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_CUT));
		manager.add(new ActionContributionItem(cutAction));

		PasteAction pasteAction = new PasteAction(editingDomain);
		pasteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_PASTE));
		manager.add(new ActionContributionItem(pasteAction));

		manager.add(new Separator());

		DeleteAction deleteAction = new DeleteAction(editingDomain, true);
		deleteAction.setImageDescriptor(sharedImages.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));
		manager.add(new ActionContributionItem(deleteAction));

		/*
		manager.add(new Separator());

		ValidateAction validateAction = new ValidateAction();
		manager.add(new ActionContributionItem(validateAction));

		ControlAction controlAction = new ControlAction(editingDomain);
		manager.add(new ActionContributionItem(controlAction));
*/
		manager.add(new Separator());

		copyAction.updateSelection(structuredSelection);
		cutAction.updateSelection(structuredSelection);
		pasteAction.updateSelection(structuredSelection);
		deleteAction.updateSelection(structuredSelection);
//		validateAction.updateSelection(structuredSelection);
//		controlAction.updateSelection(structuredSelection);
	}

}
