package net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.commands;

import net.sf.smbt.touchosc.diagram.utilities.TouchOscGuiUtilities;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiFactory;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers.ElementInitializers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TouchOscLabelHCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public TouchOscLabelHCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		TouchOscLabelH newElement = TouchoscguiFactory.eINSTANCE
				.createTouchOscLabelH();

		TouchOscTabPage owner = (TouchOscTabPage) getElementToEdit();
		owner.getLabelsH().add(newElement);

		ElementInitializers.getInstance().init_TouchOscLabelH_3003(newElement);
		newElement.setName("label" + TouchOscGuiUtilities.INSTANCE.getCounter("label"));

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(TouchOscLabelH newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
