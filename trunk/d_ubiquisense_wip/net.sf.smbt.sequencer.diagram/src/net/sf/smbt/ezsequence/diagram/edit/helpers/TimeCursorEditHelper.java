package net.sf.smbt.ezsequence.diagram.edit.helpers;

import org.eclipse.core.runtime.Status;
import org.eclipse.gmf.runtime.common.core.command.CompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyDependentsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;

/**
 * @generated NOT
 */
public class TimeCursorEditHelper extends EzsequenceBaseEditHelper {

	@Override
	protected boolean approveRequest(IEditCommandRequest request) {
		if (request instanceof DestroyElementRequest) {
			return false;
		}
		return super.approveRequest(request);
	}

	@Override
	protected ICompositeCommand createCommand(IEditCommandRequest req) {
		CompositeCommand cc = new CompositeCommand("");
		cc.compose(new UnexecutableCommand(Status.OK_STATUS));
		return cc;
	}

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		return new UnexecutableCommand(Status.OK_STATUS);
	}

	@Override
	protected ICommand getBasicDestroyElementCommand(DestroyElementRequest req) {
		return new UnexecutableCommand(Status.OK_STATUS);
	}

	@Override
	protected ICommand getDestroyElementWithDependentsCommand(
			DestroyElementRequest req) {
		return new UnexecutableCommand(Status.OK_STATUS);
	}

	@Override
	protected ICommand getDestroyDependentsCommand(DestroyDependentsRequest req) {
		return new UnexecutableCommand(Status.OK_STATUS);
	}

	@Override
	protected ICommand getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return new UnexecutableCommand(Status.OK_STATUS);
	}

	@Override
	public boolean canEdit(IEditCommandRequest req) {
		return false;
	}
}
