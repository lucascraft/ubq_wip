package net.sf.smbt.touchosc.diagram.outline;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorPlugin;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractModelNavigator;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.IPageSite;

public class TouchOscModelNavigator extends AbstractModelNavigator {

	/**
	 * Constructor
	 * 
	 * @param parent
	 *            the parent Composite
	 * @param diagEditor
	 *            the diagram editor
	 * @param pageSite
	 *            the IPageSite
	 */
	public TouchOscModelNavigator(Composite parent, IDiagramWorkbenchPart diagEditor, IPageSite pageSite) {
		super(parent, diagEditor, pageSite);
	}

	/**
	 * @see org.eclipse.emf.ecoretools.diagram.ui.outline.AbstractModelNavigator#getAdapterFactory()
	 */
	@Override
	protected AdapterFactory getAdapterFactory() {
		return TouchoscguiDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory();
	}
}
