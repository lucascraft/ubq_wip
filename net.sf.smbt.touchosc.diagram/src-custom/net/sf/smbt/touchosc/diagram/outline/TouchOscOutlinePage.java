package net.sf.smbt.touchosc.diagram.outline;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorPlugin;

import org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage;
import org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractModelNavigator;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IPageSite;

public class TouchOscOutlinePage extends AbstractDiagramsOutlinePage {

	/**
	 * Constructor
	 * 
	 * @param editor
	 *            the Editor
	 */
	public TouchOscOutlinePage(DiagramEditor editor) {
		super(editor);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage#createNavigator(org.eclipse.swt.widgets.Composite,
	 *      org.eclipse.ui.part.IPageSite)
	 */
	@Override
	protected AbstractModelNavigator createNavigator(Composite parent, IPageSite pageSite) {
		return new TouchOscModelNavigator(parent, getEditor(), pageSite);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage#getPreferenceStore()
	 */
	@Override
	protected IPreferenceStore getPreferenceStore() {
		return TouchoscguiDiagramEditorPlugin.getInstance().getPreferenceStore();
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractDiagramsOutlinePage#getEditorID()
	 */
	@Override
	protected String getEditorID() {
		return "net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorID"; //$NON-NLS-1$
	}

	/**
	 * Open the new diagram in the same editor
	 */
	@Override
	protected void handleDoubleClickEvent() {
		IStructuredSelection selection = (IStructuredSelection) getSelection();
		Object selectedObject = selection.getFirstElement();
		if (selectedObject != null && selectedObject instanceof Diagram && getEditor().getDiagram() != selectedObject
				&& getEditor().getDiagram().eResource().equals(((Diagram) selectedObject).eResource())) {
			//((JzmuiDiagramEditor) getEditor()).setDiagram((Diagram) selectedObject);
		}
	}

}
