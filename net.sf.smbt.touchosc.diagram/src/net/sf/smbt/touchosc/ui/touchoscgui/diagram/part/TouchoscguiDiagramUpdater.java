package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTabPageTouchOscTabPageCompartmentEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscToggleEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscXYPadEditPart;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class TouchoscguiDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<TouchoscguiNodeDescriptor> getSemanticChildren(View view) {
		switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			return getTouchOscLayout_1000SemanticChildren(view);
		case TouchOscTabPageTouchOscTabPageCompartmentEditPart.VISUAL_ID:
			return getTouchOscTabPageTouchOscTabPageCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiNodeDescriptor> getTouchOscLayout_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TouchOscLayout modelElement = (TouchOscLayout) view.getElement();
		LinkedList<TouchoscguiNodeDescriptor> result = new LinkedList<TouchoscguiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getTabs().iterator(); it.hasNext();) {
			TouchOscTabPage childElement = (TouchOscTabPage) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscTabPageEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiNodeDescriptor> getTouchOscTabPageTouchOscTabPageCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TouchOscTabPage modelElement = (TouchOscTabPage) containerView
				.getElement();
		LinkedList<TouchoscguiNodeDescriptor> result = new LinkedList<TouchoscguiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFadersH().iterator(); it
				.hasNext();) {
			TouchOscFaderH childElement = (TouchOscFaderH) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscFaderHEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getFadersV().iterator(); it
				.hasNext();) {
			TouchOscFaderV childElement = (TouchOscFaderV) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscFaderVEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLabelsH().iterator(); it
				.hasNext();) {
			TouchOscLabelH childElement = (TouchOscLabelH) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscLabelHEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLabelsV().iterator(); it
				.hasNext();) {
			TouchOscLabelV childElement = (TouchOscLabelV) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscLabelVEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getLeds().iterator(); it.hasNext();) {
			TouchOscLED childElement = (TouchOscLED) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscLEDEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiToggles().iterator(); it
				.hasNext();) {
			TouchOscMultiToggle childElement = (TouchOscMultiToggle) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscMultiToggleEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getPushes().iterator(); it.hasNext();) {
			TouchOscPush childElement = (TouchOscPush) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscPushEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRotariesH().iterator(); it
				.hasNext();) {
			TouchOscRotaryH childElement = (TouchOscRotaryH) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscRotaryHEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRotariesV().iterator(); it
				.hasNext();) {
			TouchOscRotaryV childElement = (TouchOscRotaryV) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscRotaryVEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getXyPads().iterator(); it.hasNext();) {
			TouchOscXYPad childElement = (TouchOscXYPad) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscXYPadEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getToggles().iterator(); it
				.hasNext();) {
			TouchOscToggle childElement = (TouchOscToggle) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscToggleEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTimesH().iterator(); it.hasNext();) {
			TouchOscTimeH childElement = (TouchOscTimeH) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscTimeHEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTimesV().iterator(); it.hasNext();) {
			TouchOscTimeV childElement = (TouchOscTimeV) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscTimeVEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEncoders().iterator(); it
				.hasNext();) {
			TouchOscEncoder childElement = (TouchOscEncoder) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscEncoderEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBatteriesH().iterator(); it
				.hasNext();) {
			TouchOscBatteryH childElement = (TouchOscBatteryH) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscBatteryHEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getBatteriesV().iterator(); it
				.hasNext();) {
			TouchOscBatteryV childElement = (TouchOscBatteryV) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscBatteryVEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiFadersH().iterator(); it
				.hasNext();) {
			TouchOscMultiFaderH childElement = (TouchOscMultiFaderH) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscMultiFaderHEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiFadersV().iterator(); it
				.hasNext();) {
			TouchOscMultiFaderV childElement = (TouchOscMultiFaderV) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscMultiFaderVEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiPushes().iterator(); it
				.hasNext();) {
			TouchOscMultiPush childElement = (TouchOscMultiPush) it.next();
			int visualID = TouchoscguiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TouchOscMultiPushEditPart.VISUAL_ID) {
				result.add(new TouchoscguiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getContainedLinks(View view) {
		switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			return getTouchOscLayout_1000ContainedLinks(view);
		case TouchOscTabPageEditPart.VISUAL_ID:
			return getTouchOscTabPage_2001ContainedLinks(view);
		case TouchOscFaderHEditPart.VISUAL_ID:
			return getTouchOscFaderH_3001ContainedLinks(view);
		case TouchOscFaderVEditPart.VISUAL_ID:
			return getTouchOscFaderV_3002ContainedLinks(view);
		case TouchOscLabelHEditPart.VISUAL_ID:
			return getTouchOscLabelH_3003ContainedLinks(view);
		case TouchOscLabelVEditPart.VISUAL_ID:
			return getTouchOscLabelV_3004ContainedLinks(view);
		case TouchOscLEDEditPart.VISUAL_ID:
			return getTouchOscLED_3005ContainedLinks(view);
		case TouchOscMultiToggleEditPart.VISUAL_ID:
			return getTouchOscMultiToggle_3006ContainedLinks(view);
		case TouchOscPushEditPart.VISUAL_ID:
			return getTouchOscPush_3007ContainedLinks(view);
		case TouchOscRotaryHEditPart.VISUAL_ID:
			return getTouchOscRotaryH_3008ContainedLinks(view);
		case TouchOscRotaryVEditPart.VISUAL_ID:
			return getTouchOscRotaryV_3009ContainedLinks(view);
		case TouchOscXYPadEditPart.VISUAL_ID:
			return getTouchOscXYPad_3010ContainedLinks(view);
		case TouchOscToggleEditPart.VISUAL_ID:
			return getTouchOscToggle_3011ContainedLinks(view);
		case TouchOscTimeHEditPart.VISUAL_ID:
			return getTouchOscTimeH_3012ContainedLinks(view);
		case TouchOscTimeVEditPart.VISUAL_ID:
			return getTouchOscTimeV_3013ContainedLinks(view);
		case TouchOscEncoderEditPart.VISUAL_ID:
			return getTouchOscEncoder_3014ContainedLinks(view);
		case TouchOscBatteryHEditPart.VISUAL_ID:
			return getTouchOscBatteryH_3015ContainedLinks(view);
		case TouchOscBatteryVEditPart.VISUAL_ID:
			return getTouchOscBatteryV_3016ContainedLinks(view);
		case TouchOscMultiFaderHEditPart.VISUAL_ID:
			return getTouchOscMultiFaderH_3017ContainedLinks(view);
		case TouchOscMultiFaderVEditPart.VISUAL_ID:
			return getTouchOscMultiFaderV_3018ContainedLinks(view);
		case TouchOscMultiPushEditPart.VISUAL_ID:
			return getTouchOscMultiPush_3019ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getIncomingLinks(View view) {
		switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {
		case TouchOscTabPageEditPart.VISUAL_ID:
			return getTouchOscTabPage_2001IncomingLinks(view);
		case TouchOscFaderHEditPart.VISUAL_ID:
			return getTouchOscFaderH_3001IncomingLinks(view);
		case TouchOscFaderVEditPart.VISUAL_ID:
			return getTouchOscFaderV_3002IncomingLinks(view);
		case TouchOscLabelHEditPart.VISUAL_ID:
			return getTouchOscLabelH_3003IncomingLinks(view);
		case TouchOscLabelVEditPart.VISUAL_ID:
			return getTouchOscLabelV_3004IncomingLinks(view);
		case TouchOscLEDEditPart.VISUAL_ID:
			return getTouchOscLED_3005IncomingLinks(view);
		case TouchOscMultiToggleEditPart.VISUAL_ID:
			return getTouchOscMultiToggle_3006IncomingLinks(view);
		case TouchOscPushEditPart.VISUAL_ID:
			return getTouchOscPush_3007IncomingLinks(view);
		case TouchOscRotaryHEditPart.VISUAL_ID:
			return getTouchOscRotaryH_3008IncomingLinks(view);
		case TouchOscRotaryVEditPart.VISUAL_ID:
			return getTouchOscRotaryV_3009IncomingLinks(view);
		case TouchOscXYPadEditPart.VISUAL_ID:
			return getTouchOscXYPad_3010IncomingLinks(view);
		case TouchOscToggleEditPart.VISUAL_ID:
			return getTouchOscToggle_3011IncomingLinks(view);
		case TouchOscTimeHEditPart.VISUAL_ID:
			return getTouchOscTimeH_3012IncomingLinks(view);
		case TouchOscTimeVEditPart.VISUAL_ID:
			return getTouchOscTimeV_3013IncomingLinks(view);
		case TouchOscEncoderEditPart.VISUAL_ID:
			return getTouchOscEncoder_3014IncomingLinks(view);
		case TouchOscBatteryHEditPart.VISUAL_ID:
			return getTouchOscBatteryH_3015IncomingLinks(view);
		case TouchOscBatteryVEditPart.VISUAL_ID:
			return getTouchOscBatteryV_3016IncomingLinks(view);
		case TouchOscMultiFaderHEditPart.VISUAL_ID:
			return getTouchOscMultiFaderH_3017IncomingLinks(view);
		case TouchOscMultiFaderVEditPart.VISUAL_ID:
			return getTouchOscMultiFaderV_3018IncomingLinks(view);
		case TouchOscMultiPushEditPart.VISUAL_ID:
			return getTouchOscMultiPush_3019IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getOutgoingLinks(View view) {
		switch (TouchoscguiVisualIDRegistry.getVisualID(view)) {
		case TouchOscTabPageEditPart.VISUAL_ID:
			return getTouchOscTabPage_2001OutgoingLinks(view);
		case TouchOscFaderHEditPart.VISUAL_ID:
			return getTouchOscFaderH_3001OutgoingLinks(view);
		case TouchOscFaderVEditPart.VISUAL_ID:
			return getTouchOscFaderV_3002OutgoingLinks(view);
		case TouchOscLabelHEditPart.VISUAL_ID:
			return getTouchOscLabelH_3003OutgoingLinks(view);
		case TouchOscLabelVEditPart.VISUAL_ID:
			return getTouchOscLabelV_3004OutgoingLinks(view);
		case TouchOscLEDEditPart.VISUAL_ID:
			return getTouchOscLED_3005OutgoingLinks(view);
		case TouchOscMultiToggleEditPart.VISUAL_ID:
			return getTouchOscMultiToggle_3006OutgoingLinks(view);
		case TouchOscPushEditPart.VISUAL_ID:
			return getTouchOscPush_3007OutgoingLinks(view);
		case TouchOscRotaryHEditPart.VISUAL_ID:
			return getTouchOscRotaryH_3008OutgoingLinks(view);
		case TouchOscRotaryVEditPart.VISUAL_ID:
			return getTouchOscRotaryV_3009OutgoingLinks(view);
		case TouchOscXYPadEditPart.VISUAL_ID:
			return getTouchOscXYPad_3010OutgoingLinks(view);
		case TouchOscToggleEditPart.VISUAL_ID:
			return getTouchOscToggle_3011OutgoingLinks(view);
		case TouchOscTimeHEditPart.VISUAL_ID:
			return getTouchOscTimeH_3012OutgoingLinks(view);
		case TouchOscTimeVEditPart.VISUAL_ID:
			return getTouchOscTimeV_3013OutgoingLinks(view);
		case TouchOscEncoderEditPart.VISUAL_ID:
			return getTouchOscEncoder_3014OutgoingLinks(view);
		case TouchOscBatteryHEditPart.VISUAL_ID:
			return getTouchOscBatteryH_3015OutgoingLinks(view);
		case TouchOscBatteryVEditPart.VISUAL_ID:
			return getTouchOscBatteryV_3016OutgoingLinks(view);
		case TouchOscMultiFaderHEditPart.VISUAL_ID:
			return getTouchOscMultiFaderH_3017OutgoingLinks(view);
		case TouchOscMultiFaderVEditPart.VISUAL_ID:
			return getTouchOscMultiFaderV_3018OutgoingLinks(view);
		case TouchOscMultiPushEditPart.VISUAL_ID:
			return getTouchOscMultiPush_3019OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLayout_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTabPage_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscFaderH_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscFaderV_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLabelH_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLabelV_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLED_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiToggle_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscPush_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscRotaryH_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscRotaryV_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscXYPad_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscToggle_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTimeH_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTimeV_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscEncoder_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscBatteryH_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscBatteryV_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiFaderH_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiFaderV_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiPush_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTabPage_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscFaderH_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscFaderV_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLabelH_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLabelV_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLED_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiToggle_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscPush_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscRotaryH_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscRotaryV_3009IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscXYPad_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscToggle_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTimeH_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTimeV_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscEncoder_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscBatteryH_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscBatteryV_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiFaderH_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiFaderV_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiPush_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTabPage_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscFaderH_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscFaderV_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLabelH_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLabelV_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscLED_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiToggle_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscPush_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscRotaryH_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscRotaryV_3009OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscXYPad_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscToggle_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTimeH_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscTimeV_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscEncoder_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscBatteryH_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscBatteryV_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiFaderH_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiFaderV_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<TouchoscguiLinkDescriptor> getTouchOscMultiPush_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
