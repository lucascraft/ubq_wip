package net.sf.smbt.touchosc.ui.touchoscgui.diagram.part;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;
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

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class TouchoscguiVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.smbt.touchosc.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (TouchOscLayoutEditPart.MODEL_ID.equals(view.getType())) {
				return TouchOscLayoutEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				TouchoscguiDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (TouchoscguiPackage.eINSTANCE.getTouchOscLayout().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((TouchOscLayout) domainElement)) {
			return TouchOscLayoutEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry
				.getModelID(containerView);
		if (!TouchOscLayoutEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (TouchOscLayoutEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TouchOscLayoutEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			if (TouchoscguiPackage.eINSTANCE.getTouchOscTabPage()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscTabPageEditPart.VISUAL_ID;
			}
			break;
		case TouchOscTabPageTouchOscTabPageCompartmentEditPart.VISUAL_ID:
			if (TouchoscguiPackage.eINSTANCE.getTouchOscFaderH().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscFaderHEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscFaderV().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscFaderVEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscLabelH().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscLabelHEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscLabelV().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscLabelVEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscLED().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscLEDEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscMultiToggle()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscMultiToggleEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscPush().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscPushEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscRotaryHEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscRotaryVEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscXYPad().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscXYPadEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscToggle().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscToggleEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscTimeH().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscTimeHEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscTimeV().isSuperTypeOf(
					domainElement.eClass())) {
				return TouchOscTimeVEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscEncoder()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscEncoderEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscBatteryHEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscBatteryVEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscMultiFaderH()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscMultiFaderHEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscMultiFaderV()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscMultiFaderVEditPart.VISUAL_ID;
			}
			if (TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush()
					.isSuperTypeOf(domainElement.eClass())) {
				return TouchOscMultiPushEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry
				.getModelID(containerView);
		if (!TouchOscLayoutEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (TouchOscLayoutEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = TouchOscLayoutEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			if (TouchOscTabPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TouchOscTabPageEditPart.VISUAL_ID:
			if (TouchOscTabPageTouchOscTabPageCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TouchOscTabPageTouchOscTabPageCompartmentEditPart.VISUAL_ID:
			if (TouchOscFaderHEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscFaderVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscLabelHEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscLabelVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscLEDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscMultiToggleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscPushEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscRotaryHEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscRotaryVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscXYPadEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscToggleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscTimeHEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscTimeVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscEncoderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscBatteryHEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscBatteryVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscMultiFaderHEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscMultiFaderVEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TouchOscMultiPushEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(TouchOscLayout element) {
		return true;
	}

}
