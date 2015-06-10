package net.sf.smbt.ezsequence.diagram.edit.commands;

import net.sf.smbt.ezsequence.AbstractPort;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimedLink;
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
public class TimedLinkReorientCommand extends EditElementCommand {

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
	public TimedLinkReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof TimedLink) {
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
		if (!(oldEnd instanceof AbstractPort && newEnd instanceof AbstractPort)) {
			return false;
		}
		AbstractPort target = getLink().getBefore();
		if (!(getLink().eContainer() instanceof Sequencer)) {
			return false;
		}
		Sequencer container = (Sequencer) getLink().eContainer();
		return EzsequenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTimedLink_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof AbstractPort && newEnd instanceof AbstractPort)) {
			return false;
		}
		AbstractPort source = getLink().getAfter();
		if (!(getLink().eContainer() instanceof Sequencer)) {
			return false;
		}
		Sequencer container = (Sequencer) getLink().eContainer();
		return EzsequenceBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTimedLink_4001(container, getLink(), source,
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
	protected TimedLink getLink() {
		return (TimedLink) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected AbstractPort getOldSource() {
		return (AbstractPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractPort getNewSource() {
		return (AbstractPort) newEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractPort getOldTarget() {
		return (AbstractPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected AbstractPort getNewTarget() {
		return (AbstractPort) newEnd;
	}
}
