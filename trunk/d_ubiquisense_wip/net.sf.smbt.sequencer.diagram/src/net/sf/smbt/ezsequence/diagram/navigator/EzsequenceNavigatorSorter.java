package net.sf.smbt.ezsequence.diagram.navigator;

import net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class EzsequenceNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof EzsequenceNavigatorItem) {
			EzsequenceNavigatorItem item = (EzsequenceNavigatorItem) element;
			return EzsequenceVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
