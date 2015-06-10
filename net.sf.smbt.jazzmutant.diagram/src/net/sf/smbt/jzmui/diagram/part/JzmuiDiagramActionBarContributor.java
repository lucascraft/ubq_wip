package net.sf.smbt.jzmui.diagram.part;

import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramActionBarContributor;
import org.eclipse.gmf.runtime.diagram.ui.printing.render.actions.EnhancedPrintActionHelper;
import org.eclipse.gmf.runtime.diagram.ui.printing.render.actions.RenderedPrintPreviewAction;
import org.eclipse.jface.action.IAction;
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
public class JzmuiDiagramActionBarContributor extends
		DiagramActionBarContributor {

	private IWorkbenchAction saveAction;
	private IWorkbenchAction printAction;

	protected void makeActions(final IWorkbenchWindow window) {
		saveAction = ActionFactory.SAVE.create(window);
		printAction = ActionFactory.PRINT.create(window);

		getActionRegistry().registerAction(saveAction);
		getActionRegistry().registerAction(printAction);
	}

	/**
	 * @generated
	 */
	protected Class getEditorClass() {
		return JzmuiDiagramEditor.class;
	}

	/**
	 * @generated
	 */
	protected String getEditorId() {
		return JzmuiDiagramEditor.ID;
	}

	/**
	 * @generated NOT
	 */
	public void init(IActionBars bars, IWorkbenchPage page) {
		super.init(bars, page);
		// print preview
		IMenuManager fileMenu = bars.getMenuManager().findMenuUsingPath(IWorkbenchActionConstants.M_FILE);
		assert fileMenu != null;
		

		makeActions(getPage().getWorkbenchWindow());

		
		IAction printPreviewAction = new RenderedPrintPreviewAction(new EnhancedPrintActionHelper());
		
		//fileMenu.insertBefore("print", printPreviewAction); //$NON-NLS-1$
		//fileMenu.add(saveAction);

		bars.getToolBarManager().add(saveAction);
		bars.getToolBarManager().add(printPreviewAction);
	}
}
