package net.sf.smbt.ezsequence.diagram.edit.commands;

import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.diagram.edit.policies.EzsequenceBaseItemSemanticEditPolicy;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EventTriggerReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public EventTriggerReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof EventTrigger) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof TimedEvent && newEnd instanceof TimedEvent)) {
			return false;
		}
		TimedEvent target = getLink().getBefore();
		if (!(getLink().eContainer() instanceof Sequencer)) {
			return false;
		}
		Sequencer container = (Sequencer) getLink().eContainer();
		return EzsequenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEventTrigger_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof TimedEvent && newEnd instanceof TimedEvent)) {
			return false;
		}
		TimedEvent source = getLink().getAfter();
		if (!(getLink().eContainer() instanceof Sequencer)) {
			return false;
		}
		Sequencer container = (Sequencer) getLink().eContainer();
		return EzsequenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEventTrigger_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setAfter(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setBefore(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected EventTrigger getLink() {
		return (EventTrigger) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected TimedEvent getOldSource() {
		return (TimedEvent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TimedEvent getNewSource() {
		return (TimedEvent) newEnd;
	}

	/**
	 * @generated
	 */
	protected TimedEvent getOldTarget() {
		return (TimedEvent) oldEnd;
	}

	/**
	 * @generated
	 */
	protected TimedEvent getNewTarget() {
		return (TimedEvent) newEnd;
	}
}
