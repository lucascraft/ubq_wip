package net.sf.smbt.jzmui.diagram.navigator;

import net.sf.smbt.jzmui.JZBreakPoint;
import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZCustomButton;
import net.sf.smbt.jzmui.JZFader;
import net.sf.smbt.jzmui.JZGesture;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JZKnob;
import net.sf.smbt.jzmui.JZLed;
import net.sf.smbt.jzmui.JZLemurMenu;
import net.sf.smbt.jzmui.JZLemurMonitor;
import net.sf.smbt.jzmui.JZMultiBalls;
import net.sf.smbt.jzmui.JZPads;
import net.sf.smbt.jzmui.JZRange;
import net.sf.smbt.jzmui.JZRingArea;
import net.sf.smbt.jzmui.JZSignalScope;
import net.sf.smbt.jzmui.JZSurfaceLCD;
import net.sf.smbt.jzmui.JZSwitches;
import net.sf.smbt.jzmui.JZText;
import net.sf.smbt.jzmui.JZTrack;
import net.sf.smbt.jzmui.JZmultiSlider;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPoint2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPointEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainer2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainerEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButton2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButtonEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFader2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFaderEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGesture2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGestureEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterface2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnob2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZKnobEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLed2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLedEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMenu2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMenuEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMonitor2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZLemurMonitorEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBalls2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZMultiBallsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPads2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZPadsEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRange2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRangeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingArea2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZRingAreaEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScope2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSignalScopeEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSurfaceLCD2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSurfaceLCDEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitches2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZSwitchesEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZText2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTextEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTrack2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZTrackEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSlider2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZmultiSliderEditPart;
import net.sf.smbt.jzmui.diagram.part.JzmuiDiagramEditorPlugin;
import net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry;
import net.sf.smbt.jzmui.diagram.providers.JzmuiElementTypes;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class JzmuiNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		JzmuiDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		JzmuiDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof JzmuiNavigatorItem
				&& !isOwnView(((JzmuiNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof JzmuiNavigatorGroup) {
			JzmuiNavigatorGroup group = (JzmuiNavigatorGroup) element;
			return JzmuiDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof JzmuiNavigatorItem) {
			JzmuiNavigatorItem navigatorItem = (JzmuiNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://jzmui/1.0?JZJazzInterface", JzmuiElementTypes.JZJazzInterface_1000); //$NON-NLS-1$
		case JZJazzInterface2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://jzmui/1.0?JZJazzInterface", JzmuiElementTypes.JZJazzInterface_2001); //$NON-NLS-1$
		case JZBreakPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZBreakPoint", JzmuiElementTypes.JZBreakPoint_3001); //$NON-NLS-1$
		case JZContainerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZContainer", JzmuiElementTypes.JZContainer_3002); //$NON-NLS-1$
		case JZBreakPoint2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZBreakPoint", JzmuiElementTypes.JZBreakPoint_3003); //$NON-NLS-1$
		case JZContainer2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZContainer", JzmuiElementTypes.JZContainer_3004); //$NON-NLS-1$
		case JZCustomButtonEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZCustomButton", JzmuiElementTypes.JZCustomButton_3005); //$NON-NLS-1$
		case JZFaderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZFader", JzmuiElementTypes.JZFader_3006); //$NON-NLS-1$
		case JZGestureEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZGesture", JzmuiElementTypes.JZGesture_3007); //$NON-NLS-1$
		case JZKnobEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZKnob", JzmuiElementTypes.JZKnob_3008); //$NON-NLS-1$
		case JZLedEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZLed", JzmuiElementTypes.JZLed_3009); //$NON-NLS-1$
		case JZLemurMenuEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZLemurMenu", JzmuiElementTypes.JZLemurMenu_3010); //$NON-NLS-1$
		case JZLemurMonitorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZLemurMonitor", JzmuiElementTypes.JZLemurMonitor_3011); //$NON-NLS-1$
		case JZMultiBallsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZMultiBalls", JzmuiElementTypes.JZMultiBalls_3012); //$NON-NLS-1$
		case JZPadsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZPads", JzmuiElementTypes.JZPads_3013); //$NON-NLS-1$
		case JZRangeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZRange", JzmuiElementTypes.JZRange_3014); //$NON-NLS-1$
		case JZRingAreaEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZRingArea", JzmuiElementTypes.JZRingArea_3015); //$NON-NLS-1$
		case JZSignalScopeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZSignalScope", JzmuiElementTypes.JZSignalScope_3016); //$NON-NLS-1$
		case JZSurfaceLCDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZSurfaceLCD", JzmuiElementTypes.JZSurfaceLCD_3017); //$NON-NLS-1$
		case JZSwitchesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZSwitches", JzmuiElementTypes.JZSwitches_3018); //$NON-NLS-1$
		case JZTextEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZText", JzmuiElementTypes.JZText_3019); //$NON-NLS-1$
		case JZTrackEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZTrack", JzmuiElementTypes.JZTrack_3020); //$NON-NLS-1$
		case JZmultiSliderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZmultiSlider", JzmuiElementTypes.JZmultiSlider_3021); //$NON-NLS-1$
		case JZCustomButton2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZCustomButton", JzmuiElementTypes.JZCustomButton_3022); //$NON-NLS-1$
		case JZFader2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZFader", JzmuiElementTypes.JZFader_3023); //$NON-NLS-1$
		case JZGesture2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZGesture", JzmuiElementTypes.JZGesture_3024); //$NON-NLS-1$
		case JZKnob2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZKnob", JzmuiElementTypes.JZKnob_3025); //$NON-NLS-1$
		case JZLed2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZLed", JzmuiElementTypes.JZLed_3026); //$NON-NLS-1$
		case JZLemurMenu2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZLemurMenu", JzmuiElementTypes.JZLemurMenu_3027); //$NON-NLS-1$
		case JZLemurMonitor2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZLemurMonitor", JzmuiElementTypes.JZLemurMonitor_3028); //$NON-NLS-1$
		case JZMultiBalls2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZMultiBalls", JzmuiElementTypes.JZMultiBalls_3029); //$NON-NLS-1$
		case JZmultiSlider2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZmultiSlider", JzmuiElementTypes.JZmultiSlider_3030); //$NON-NLS-1$
		case JZPads2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZPads", JzmuiElementTypes.JZPads_3031); //$NON-NLS-1$
		case JZRange2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZRange", JzmuiElementTypes.JZRange_3032); //$NON-NLS-1$
		case JZRingArea2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZRingArea", JzmuiElementTypes.JZRingArea_3033); //$NON-NLS-1$
		case JZSignalScope2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZSignalScope", JzmuiElementTypes.JZSignalScope_3034); //$NON-NLS-1$
		case JZSurfaceLCD2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZSurfaceLCD", JzmuiElementTypes.JZSurfaceLCD_3035); //$NON-NLS-1$
		case JZSwitches2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZSwitches", JzmuiElementTypes.JZSwitches_3036); //$NON-NLS-1$
		case JZText2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZText", JzmuiElementTypes.JZText_3037); //$NON-NLS-1$
		case JZTrack2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://jzmui/1.0?JZTrack", JzmuiElementTypes.JZTrack_3038); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = JzmuiDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& JzmuiElementTypes.isKnownElementType(elementType)) {
			image = JzmuiElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof JzmuiNavigatorGroup) {
			JzmuiNavigatorGroup group = (JzmuiNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof JzmuiNavigatorItem) {
			JzmuiNavigatorItem navigatorItem = (JzmuiNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			return getJZJazzInterface_1000Text(view);
		case JZJazzInterface2EditPart.VISUAL_ID:
			return getJZJazzInterface_2001Text(view);
		case JZBreakPointEditPart.VISUAL_ID:
			return getJZBreakPoint_3001Text(view);
		case JZContainerEditPart.VISUAL_ID:
			return getJZContainer_3002Text(view);
		case JZBreakPoint2EditPart.VISUAL_ID:
			return getJZBreakPoint_3003Text(view);
		case JZContainer2EditPart.VISUAL_ID:
			return getJZContainer_3004Text(view);
		case JZCustomButtonEditPart.VISUAL_ID:
			return getJZCustomButton_3005Text(view);
		case JZFaderEditPart.VISUAL_ID:
			return getJZFader_3006Text(view);
		case JZGestureEditPart.VISUAL_ID:
			return getJZGesture_3007Text(view);
		case JZKnobEditPart.VISUAL_ID:
			return getJZKnob_3008Text(view);
		case JZLedEditPart.VISUAL_ID:
			return getJZLed_3009Text(view);
		case JZLemurMenuEditPart.VISUAL_ID:
			return getJZLemurMenu_3010Text(view);
		case JZLemurMonitorEditPart.VISUAL_ID:
			return getJZLemurMonitor_3011Text(view);
		case JZMultiBallsEditPart.VISUAL_ID:
			return getJZMultiBalls_3012Text(view);
		case JZPadsEditPart.VISUAL_ID:
			return getJZPads_3013Text(view);
		case JZRangeEditPart.VISUAL_ID:
			return getJZRange_3014Text(view);
		case JZRingAreaEditPart.VISUAL_ID:
			return getJZRingArea_3015Text(view);
		case JZSignalScopeEditPart.VISUAL_ID:
			return getJZSignalScope_3016Text(view);
		case JZSurfaceLCDEditPart.VISUAL_ID:
			return getJZSurfaceLCD_3017Text(view);
		case JZSwitchesEditPart.VISUAL_ID:
			return getJZSwitches_3018Text(view);
		case JZTextEditPart.VISUAL_ID:
			return getJZText_3019Text(view);
		case JZTrackEditPart.VISUAL_ID:
			return getJZTrack_3020Text(view);
		case JZmultiSliderEditPart.VISUAL_ID:
			return getJZmultiSlider_3021Text(view);
		case JZCustomButton2EditPart.VISUAL_ID:
			return getJZCustomButton_3022Text(view);
		case JZFader2EditPart.VISUAL_ID:
			return getJZFader_3023Text(view);
		case JZGesture2EditPart.VISUAL_ID:
			return getJZGesture_3024Text(view);
		case JZKnob2EditPart.VISUAL_ID:
			return getJZKnob_3025Text(view);
		case JZLed2EditPart.VISUAL_ID:
			return getJZLed_3026Text(view);
		case JZLemurMenu2EditPart.VISUAL_ID:
			return getJZLemurMenu_3027Text(view);
		case JZLemurMonitor2EditPart.VISUAL_ID:
			return getJZLemurMonitor_3028Text(view);
		case JZMultiBalls2EditPart.VISUAL_ID:
			return getJZMultiBalls_3029Text(view);
		case JZmultiSlider2EditPart.VISUAL_ID:
			return getJZmultiSlider_3030Text(view);
		case JZPads2EditPart.VISUAL_ID:
			return getJZPads_3031Text(view);
		case JZRange2EditPart.VISUAL_ID:
			return getJZRange_3032Text(view);
		case JZRingArea2EditPart.VISUAL_ID:
			return getJZRingArea_3033Text(view);
		case JZSignalScope2EditPart.VISUAL_ID:
			return getJZSignalScope_3034Text(view);
		case JZSurfaceLCD2EditPart.VISUAL_ID:
			return getJZSurfaceLCD_3035Text(view);
		case JZSwitches2EditPart.VISUAL_ID:
			return getJZSwitches_3036Text(view);
		case JZText2EditPart.VISUAL_ID:
			return getJZText_3037Text(view);
		case JZTrack2EditPart.VISUAL_ID:
			return getJZTrack_3038Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getJZJazzInterface_1000Text(View view) {
		JZJazzInterface domainModelElement = (JZJazzInterface) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZJazzInterface_2001Text(View view) {
		JZJazzInterface domainModelElement = (JZJazzInterface) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZBreakPoint_3001Text(View view) {
		JZBreakPoint domainModelElement = (JZBreakPoint) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZContainer_3002Text(View view) {
		JZContainer domainModelElement = (JZContainer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZBreakPoint_3003Text(View view) {
		JZBreakPoint domainModelElement = (JZBreakPoint) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZContainer_3004Text(View view) {
		JZContainer domainModelElement = (JZContainer) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZCustomButton_3005Text(View view) {
		JZCustomButton domainModelElement = (JZCustomButton) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZFader_3006Text(View view) {
		JZFader domainModelElement = (JZFader) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZGesture_3007Text(View view) {
		JZGesture domainModelElement = (JZGesture) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZKnob_3008Text(View view) {
		JZKnob domainModelElement = (JZKnob) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZLed_3009Text(View view) {
		JZLed domainModelElement = (JZLed) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZLemurMenu_3010Text(View view) {
		JZLemurMenu domainModelElement = (JZLemurMenu) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZLemurMonitor_3011Text(View view) {
		JZLemurMonitor domainModelElement = (JZLemurMonitor) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZMultiBalls_3012Text(View view) {
		JZMultiBalls domainModelElement = (JZMultiBalls) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZPads_3013Text(View view) {
		JZPads domainModelElement = (JZPads) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZRange_3014Text(View view) {
		JZRange domainModelElement = (JZRange) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZRingArea_3015Text(View view) {
		JZRingArea domainModelElement = (JZRingArea) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZSignalScope_3016Text(View view) {
		JZSignalScope domainModelElement = (JZSignalScope) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZSurfaceLCD_3017Text(View view) {
		JZSurfaceLCD domainModelElement = (JZSurfaceLCD) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZSwitches_3018Text(View view) {
		JZSwitches domainModelElement = (JZSwitches) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZText_3019Text(View view) {
		JZText domainModelElement = (JZText) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZTrack_3020Text(View view) {
		JZTrack domainModelElement = (JZTrack) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZmultiSlider_3021Text(View view) {
		JZmultiSlider domainModelElement = (JZmultiSlider) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZCustomButton_3022Text(View view) {
		JZCustomButton domainModelElement = (JZCustomButton) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZFader_3023Text(View view) {
		JZFader domainModelElement = (JZFader) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZGesture_3024Text(View view) {
		JZGesture domainModelElement = (JZGesture) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZKnob_3025Text(View view) {
		JZKnob domainModelElement = (JZKnob) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZLed_3026Text(View view) {
		JZLed domainModelElement = (JZLed) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZLemurMenu_3027Text(View view) {
		JZLemurMenu domainModelElement = (JZLemurMenu) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZLemurMonitor_3028Text(View view) {
		JZLemurMonitor domainModelElement = (JZLemurMonitor) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZMultiBalls_3029Text(View view) {
		JZMultiBalls domainModelElement = (JZMultiBalls) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZmultiSlider_3030Text(View view) {
		JZmultiSlider domainModelElement = (JZmultiSlider) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZPads_3031Text(View view) {
		JZPads domainModelElement = (JZPads) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZRange_3032Text(View view) {
		JZRange domainModelElement = (JZRange) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZRingArea_3033Text(View view) {
		JZRingArea domainModelElement = (JZRingArea) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZSignalScope_3034Text(View view) {
		JZSignalScope domainModelElement = (JZSignalScope) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZSurfaceLCD_3035Text(View view) {
		JZSurfaceLCD domainModelElement = (JZSurfaceLCD) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZSwitches_3036Text(View view) {
		JZSwitches domainModelElement = (JZSwitches) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZText_3037Text(View view) {
		JZText domainModelElement = (JZText) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getJZTrack_3038Text(View view) {
		JZTrack domainModelElement = (JZTrack) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			JzmuiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return JZJazzInterfaceEditPart.MODEL_ID.equals(JzmuiVisualIDRegistry
				.getModelID(view));
	}

}
