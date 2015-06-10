package net.sf.smbt.touchosc.ui.touchoscgui.diagram.navigator;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscBatteryHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscBatteryVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscEncoderEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscFaderHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscFaderVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLEDEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLabelHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLabelVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscLayoutEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiFaderHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiFaderVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiPushEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscMultiToggleEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscPushEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscRotaryHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscRotaryVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTabPageEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscToggleEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscXYPadEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorPlugin;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers.TouchoscguiElementTypes;

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
public class TouchoscguiNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		TouchoscguiDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		TouchoscguiDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof TouchoscguiNavigatorItem
				&& !isOwnView(((TouchoscguiNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof TouchoscguiNavigatorGroup) {
			TouchoscguiNavigatorGroup group = (TouchoscguiNavigatorGroup) element;
			return TouchoscguiDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof TouchoscguiNavigatorItem) {
			TouchoscguiNavigatorItem navigatorItem = (TouchoscguiNavigatorItem) element;
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
		switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://touchoscgui/1.0?TouchOscLayout", TouchoscguiElementTypes.TouchOscLayout_1000); //$NON-NLS-1$
		case TouchOscTabPageEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://touchoscgui/1.0?TouchOscTabPage", TouchoscguiElementTypes.TouchOscTabPage_2001); //$NON-NLS-1$
		case TouchOscFaderHEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscFaderH", TouchoscguiElementTypes.TouchOscFaderH_3001); //$NON-NLS-1$
		case TouchOscFaderVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscFaderV", TouchoscguiElementTypes.TouchOscFaderV_3002); //$NON-NLS-1$
		case TouchOscLabelHEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscLabelH", TouchoscguiElementTypes.TouchOscLabelH_3003); //$NON-NLS-1$
		case TouchOscLabelVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscLabelV", TouchoscguiElementTypes.TouchOscLabelV_3004); //$NON-NLS-1$
		case TouchOscLEDEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscLED", TouchoscguiElementTypes.TouchOscLED_3005); //$NON-NLS-1$
		case TouchOscMultiToggleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscMultiToggle", TouchoscguiElementTypes.TouchOscMultiToggle_3006); //$NON-NLS-1$
		case TouchOscPushEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscPush", TouchoscguiElementTypes.TouchOscPush_3007); //$NON-NLS-1$
		case TouchOscRotaryHEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscRotaryH", TouchoscguiElementTypes.TouchOscRotaryH_3008); //$NON-NLS-1$
		case TouchOscRotaryVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscRotaryV", TouchoscguiElementTypes.TouchOscRotaryV_3009); //$NON-NLS-1$
		case TouchOscXYPadEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscXYPad", TouchoscguiElementTypes.TouchOscXYPad_3010); //$NON-NLS-1$
		case TouchOscToggleEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscToggle", TouchoscguiElementTypes.TouchOscToggle_3011); //$NON-NLS-1$
		case TouchOscTimeHEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscTimeH", TouchoscguiElementTypes.TouchOscTimeH_3012); //$NON-NLS-1$
		case TouchOscTimeVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscTimeV", TouchoscguiElementTypes.TouchOscTimeV_3013); //$NON-NLS-1$
		case TouchOscEncoderEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscEncoder", TouchoscguiElementTypes.TouchOscEncoder_3014); //$NON-NLS-1$
		case TouchOscBatteryHEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscBatteryH", TouchoscguiElementTypes.TouchOscBatteryH_3015); //$NON-NLS-1$
		case TouchOscBatteryVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscBatteryV", TouchoscguiElementTypes.TouchOscBatteryV_3016); //$NON-NLS-1$
		case TouchOscMultiFaderHEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscMultiFaderH", TouchoscguiElementTypes.TouchOscMultiFaderH_3017); //$NON-NLS-1$
		case TouchOscMultiFaderVEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscMultiFaderV", TouchoscguiElementTypes.TouchOscMultiFaderV_3018); //$NON-NLS-1$
		case TouchOscMultiPushEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://touchoscgui/1.0?TouchOscMultiPush", TouchoscguiElementTypes.TouchOscMultiPush_3019); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = TouchoscguiDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& TouchoscguiElementTypes.isKnownElementType(elementType)) {
			image = TouchoscguiElementTypes.getImage(elementType);
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
		if (element instanceof TouchoscguiNavigatorGroup) {
			TouchoscguiNavigatorGroup group = (TouchoscguiNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof TouchoscguiNavigatorItem) {
			TouchoscguiNavigatorItem navigatorItem = (TouchoscguiNavigatorItem) element;
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
		switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			return getTouchOscLayout_1000Text(view);
		case TouchOscTabPageEditPart.VISUAL_ID:
			return getTouchOscTabPage_2001Text(view);
		case TouchOscFaderHEditPart.VISUAL_ID:
			return getTouchOscFaderH_3001Text(view);
		case TouchOscFaderVEditPart.VISUAL_ID:
			return getTouchOscFaderV_3002Text(view);
		case TouchOscLabelHEditPart.VISUAL_ID:
			return getTouchOscLabelH_3003Text(view);
		case TouchOscLabelVEditPart.VISUAL_ID:
			return getTouchOscLabelV_3004Text(view);
		case TouchOscLEDEditPart.VISUAL_ID:
			return getTouchOscLED_3005Text(view);
		case TouchOscMultiToggleEditPart.VISUAL_ID:
			return getTouchOscMultiToggle_3006Text(view);
		case TouchOscPushEditPart.VISUAL_ID:
			return getTouchOscPush_3007Text(view);
		case TouchOscRotaryHEditPart.VISUAL_ID:
			return getTouchOscRotaryH_3008Text(view);
		case TouchOscRotaryVEditPart.VISUAL_ID:
			return getTouchOscRotaryV_3009Text(view);
		case TouchOscXYPadEditPart.VISUAL_ID:
			return getTouchOscXYPad_3010Text(view);
		case TouchOscToggleEditPart.VISUAL_ID:
			return getTouchOscToggle_3011Text(view);
		case TouchOscTimeHEditPart.VISUAL_ID:
			return getTouchOscTimeH_3012Text(view);
		case TouchOscTimeVEditPart.VISUAL_ID:
			return getTouchOscTimeV_3013Text(view);
		case TouchOscEncoderEditPart.VISUAL_ID:
			return getTouchOscEncoder_3014Text(view);
		case TouchOscBatteryHEditPart.VISUAL_ID:
			return getTouchOscBatteryH_3015Text(view);
		case TouchOscBatteryVEditPart.VISUAL_ID:
			return getTouchOscBatteryV_3016Text(view);
		case TouchOscMultiFaderHEditPart.VISUAL_ID:
			return getTouchOscMultiFaderH_3017Text(view);
		case TouchOscMultiFaderVEditPart.VISUAL_ID:
			return getTouchOscMultiFaderV_3018Text(view);
		case TouchOscMultiPushEditPart.VISUAL_ID:
			return getTouchOscMultiPush_3019Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getTouchOscLayout_1000Text(View view) {
		TouchOscLayout domainModelElement = (TouchOscLayout) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getMode();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscTabPage_2001Text(View view) {
		TouchOscTabPage domainModelElement = (TouchOscTabPage) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscFaderH_3001Text(View view) {
		TouchOscFaderH domainModelElement = (TouchOscFaderH) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscFaderV_3002Text(View view) {
		TouchOscFaderV domainModelElement = (TouchOscFaderV) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscLabelH_3003Text(View view) {
		TouchOscLabelH domainModelElement = (TouchOscLabelH) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscLabelV_3004Text(View view) {
		TouchOscLabelV domainModelElement = (TouchOscLabelV) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscLED_3005Text(View view) {
		TouchOscLED domainModelElement = (TouchOscLED) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscMultiToggle_3006Text(View view) {
		TouchOscMultiToggle domainModelElement = (TouchOscMultiToggle) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscPush_3007Text(View view) {
		TouchOscPush domainModelElement = (TouchOscPush) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscRotaryH_3008Text(View view) {
		TouchOscRotaryH domainModelElement = (TouchOscRotaryH) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscRotaryV_3009Text(View view) {
		TouchOscRotaryV domainModelElement = (TouchOscRotaryV) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscXYPad_3010Text(View view) {
		TouchOscXYPad domainModelElement = (TouchOscXYPad) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscToggle_3011Text(View view) {
		TouchOscToggle domainModelElement = (TouchOscToggle) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscTimeH_3012Text(View view) {
		TouchOscTimeH domainModelElement = (TouchOscTimeH) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscTimeV_3013Text(View view) {
		TouchOscTimeV domainModelElement = (TouchOscTimeV) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscEncoder_3014Text(View view) {
		TouchOscEncoder domainModelElement = (TouchOscEncoder) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscBatteryH_3015Text(View view) {
		TouchOscBatteryH domainModelElement = (TouchOscBatteryH) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscBatteryV_3016Text(View view) {
		TouchOscBatteryV domainModelElement = (TouchOscBatteryV) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscMultiFaderH_3017Text(View view) {
		TouchOscMultiFaderH domainModelElement = (TouchOscMultiFaderH) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscMultiFaderV_3018Text(View view) {
		TouchOscMultiFaderV domainModelElement = (TouchOscMultiFaderV) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTouchOscMultiPush_3019Text(View view) {
		TouchOscMultiPush domainModelElement = (TouchOscMultiPush) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			TouchoscguiDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 3019); //$NON-NLS-1$
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
		return TouchOscLayoutEditPart.MODEL_ID
				.equals(TouchoscguiVisualIDRegistry.getModelID(view));
	}

}
