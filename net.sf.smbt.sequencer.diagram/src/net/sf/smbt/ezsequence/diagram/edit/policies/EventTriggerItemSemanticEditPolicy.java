package net.sf.smbt.ezsequence.diagram.edit.policies;

import net.sf.smbt.ezsequence.diagram.providers.EzsequenceElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class EventTriggerItemSemanticEditPolicy extends
		EzsequenceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public EventTriggerItemSemanticEditPolicy() {
		super(EzsequenceElementTypes.EventTrigger_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
