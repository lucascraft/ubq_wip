package net.sf.smbt.jzmui.diagram.edit.policies;

import net.sf.smbt.jzmui.diagram.edit.commands.JZJazzInterfaceCreateCommand;
import net.sf.smbt.jzmui.diagram.providers.JzmuiElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class JZJazzInterfaceItemSemanticEditPolicy extends
		JzmuiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public JZJazzInterfaceItemSemanticEditPolicy() {
		super(JzmuiElementTypes.JZJazzInterface_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (JzmuiElementTypes.JZJazzInterface_2001 == req.getElementType()) {
			return getGEFWrapper(new JZJazzInterfaceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
