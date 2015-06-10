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

package net.sf.smbt.sequencer.diagram.custom.popups;

import java.util.Arrays;

import net.sf.smbt.sequencer.diagram.commands.EditTimedEventTransactionalCommand;
import net.sf.smbt.sequencer.diagram.custom.dialogs.XCmdChooserDialog;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class TimedEventPopupDialogEditAction extends Action implements IWorkbenchWindowActionDelegate {
	private IGraphicalEditPart part;

	public void run(IAction action) {
		if (part == null) return;
		
        TransactionalEditingDomain domain = part
                .getEditingDomain();
        EObject modelElement = part.resolveSemanticElement();

        
        XCmdChooserDialog dialog = new XCmdChooserDialog(Display.getDefault().getActiveShell(), false);
        if (Window.OK == dialog.open()) {
            AbstractTransactionalCommand semanticCommand = new EditTimedEventTransactionalCommand(
                    modelElement, domain, "Associate a command to a TimedEvent ",
                    Arrays.asList(dialog.getResult())
            );

            try {
                OperationHistoryFactory.getOperationHistory().execute(semanticCommand, null, null);
            } catch (ExecutionException e) {
            	e.printStackTrace();
            }

            CommandResult commandResult = semanticCommand.getCommandResult();

            if (commandResult != null && commandResult.getStatus().isOK()) {
                String result = (String) commandResult.getReturnValue();
                System.out.println(result);
            }
        }
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			if (((IStructuredSelection)selection).getFirstElement() instanceof IGraphicalEditPart) {
				part = (IGraphicalEditPart) ((IStructuredSelection)selection).getFirstElement();
			}
		}
		setEnabled(part!=null);
	}

	@Override
	public void dispose() {
		
	}


	@Override
	public void init(IWorkbenchWindow window) {
		
	}
}
