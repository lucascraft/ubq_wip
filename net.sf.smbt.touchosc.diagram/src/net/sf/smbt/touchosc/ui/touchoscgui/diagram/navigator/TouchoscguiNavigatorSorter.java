package net.sf.smbt.touchosc.ui.touchoscgui.diagram.navigator;

import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class TouchoscguiNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TouchoscguiNavigatorItem) {
			TouchoscguiNavigatorItem item = (TouchoscguiNavigatorItem) element;
			return TouchoscguiVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
