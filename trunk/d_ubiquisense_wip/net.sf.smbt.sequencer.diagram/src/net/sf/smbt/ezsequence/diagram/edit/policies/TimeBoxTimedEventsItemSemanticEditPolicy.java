package net.sf.smbt.ezsequence.diagram.edit.policies;

import net.sf.smbt.ezsequence.diagram.edit.commands.TimedEventCreateCommand;
import net.sf.smbt.ezsequence.diagram.providers.EzsequenceElementTypes;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TimeBoxTimedEventsItemSemanticEditPolicy extends
		EzsequenceBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public TimeBoxTimedEventsItemSemanticEditPolicy() {
		super(EzsequenceElementTypes.TimeBox_2001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (EzsequenceElementTypes.TimedEvent_3001 == req.getElementType()) {
			return getGEFWrapper(new TimedEventCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
