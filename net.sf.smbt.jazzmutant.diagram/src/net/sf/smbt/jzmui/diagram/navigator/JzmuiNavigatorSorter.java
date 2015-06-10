package net.sf.smbt.jzmui.diagram.navigator;

import net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class JzmuiNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof JzmuiNavigatorItem) {
			JzmuiNavigatorItem item = (JzmuiNavigatorItem) element;
			return JzmuiVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
