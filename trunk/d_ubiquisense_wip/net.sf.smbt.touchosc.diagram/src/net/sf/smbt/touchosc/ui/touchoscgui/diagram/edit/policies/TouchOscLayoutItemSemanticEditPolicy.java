package net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.policies;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands.TouchOscTabPageCreateCommand;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers.TouchoscguiElementTypes;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class TouchOscLayoutItemSemanticEditPolicy extends
		TouchoscguiBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TouchOscLayoutItemSemanticEditPolicy() {
		super(TouchoscguiElementTypes.TouchOscLayout_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TouchoscguiElementTypes.TouchOscTabPage_2001 == req
				.getElementType()) {
			return getGEFWrapper(new TouchOscTabPageCreateCommand(req));
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
