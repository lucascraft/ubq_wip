package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.actions.ActionFactory;
import org.eclipse.ui.actions.ActionFactory.IWorkbenchAction;

/**
 * @generated
 */
public class TouchoscguiDiagramActionBarContributor extends
		DiagramActionBarContributor {

	private IWorkbenchAction saveAction;

	protected void makeActions(final IWorkbenchWindow window) {
		saveAction = ActionFactory.SAVE.create(window);

		getActionRegistry().registerAction(saveAction);
	}

	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return TouchoscguiDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return TouchoscguiDiagramEditor.ID;
	}

	/**
	 * @generated NOT
	 */
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(
				IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		//fileMenu.remove("pageSetupAction"); //$NON-NLS-1$

		makeActions(getPage().getWorkbenchWindow());

		//		fileMenu.add(saveAction);
		bars.getToolBarManager().add(saveAction);
	}
}
