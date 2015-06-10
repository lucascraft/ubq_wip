package net.sf.smbt.jzmui.diagram.part;

import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JzmuiPackage;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPoint2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZBreakPointEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainer2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainerEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZContainerJZContainerCompartmentEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButton2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZCustomButtonEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFader2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZFaderEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGesture2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZGestureEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterface2EditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceEditPart;
import net.sf.smbt.jzmui.diagram.edit.parts.JZJazzInterfaceJZJazzInterfaceCompartmentEditPart;
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
public class JzmuiVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.smbt.jazzmutant.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (JZJazzInterfaceEditPart.MODEL_ID.equals(view.getType())) {
				return JZJazzInterfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry
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
				JzmuiDiagramEditorPlugin.getInstance().logError(
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
		if (JzmuiPackage.eINSTANCE.getJZJazzInterface().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((JZJazzInterface) domainElement)) {
			return JZJazzInterfaceEditPart.VISUAL_ID;
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
		String containerModelID = net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry
				.getModelID(containerView);
		if (!JZJazzInterfaceEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (JZJazzInterfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = JZJazzInterfaceEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			if (JzmuiPackage.eINSTANCE.getJZJazzInterface().isSuperTypeOf(
					domainElement.eClass())) {
				return JZJazzInterface2EditPart.VISUAL_ID;
			}
			break;
		case JZContainerEditPart.VISUAL_ID:
			if (JzmuiPackage.eINSTANCE.getJZBreakPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return JZBreakPoint2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return JZContainer2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZCustomButton().isSuperTypeOf(
					domainElement.eClass())) {
				return JZCustomButtonEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZFader().isSuperTypeOf(
					domainElement.eClass())) {
				return JZFaderEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZGesture().isSuperTypeOf(
					domainElement.eClass())) {
				return JZGestureEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZKnob().isSuperTypeOf(
					domainElement.eClass())) {
				return JZKnobEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZLed().isSuperTypeOf(
					domainElement.eClass())) {
				return JZLedEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZLemurMenu().isSuperTypeOf(
					domainElement.eClass())) {
				return JZLemurMenuEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZLemurMonitor().isSuperTypeOf(
					domainElement.eClass())) {
				return JZLemurMonitorEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZMultiBalls().isSuperTypeOf(
					domainElement.eClass())) {
				return JZMultiBallsEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZPads().isSuperTypeOf(
					domainElement.eClass())) {
				return JZPadsEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZRange().isSuperTypeOf(
					domainElement.eClass())) {
				return JZRangeEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZRingArea().isSuperTypeOf(
					domainElement.eClass())) {
				return JZRingAreaEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZSignalScope().isSuperTypeOf(
					domainElement.eClass())) {
				return JZSignalScopeEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZSurfaceLCD().isSuperTypeOf(
					domainElement.eClass())) {
				return JZSurfaceLCDEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZSwitches().isSuperTypeOf(
					domainElement.eClass())) {
				return JZSwitchesEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZText().isSuperTypeOf(
					domainElement.eClass())) {
				return JZTextEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZTrack().isSuperTypeOf(
					domainElement.eClass())) {
				return JZTrackEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZmultiSlider().isSuperTypeOf(
					domainElement.eClass())) {
				return JZmultiSliderEditPart.VISUAL_ID;
			}
			break;
		case JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID:
			if (JzmuiPackage.eINSTANCE.getJZBreakPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return JZBreakPointEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZContainer().isSuperTypeOf(
					domainElement.eClass())) {
				return JZContainerEditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZCustomButton().isSuperTypeOf(
					domainElement.eClass())) {
				return JZCustomButton2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZFader().isSuperTypeOf(
					domainElement.eClass())) {
				return JZFader2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZGesture().isSuperTypeOf(
					domainElement.eClass())) {
				return JZGesture2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZKnob().isSuperTypeOf(
					domainElement.eClass())) {
				return JZKnob2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZLed().isSuperTypeOf(
					domainElement.eClass())) {
				return JZLed2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZLemurMenu().isSuperTypeOf(
					domainElement.eClass())) {
				return JZLemurMenu2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZLemurMonitor().isSuperTypeOf(
					domainElement.eClass())) {
				return JZLemurMonitor2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZMultiBalls().isSuperTypeOf(
					domainElement.eClass())) {
				return JZMultiBalls2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZmultiSlider().isSuperTypeOf(
					domainElement.eClass())) {
				return JZmultiSlider2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZPads().isSuperTypeOf(
					domainElement.eClass())) {
				return JZPads2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZRange().isSuperTypeOf(
					domainElement.eClass())) {
				return JZRange2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZRingArea().isSuperTypeOf(
					domainElement.eClass())) {
				return JZRingArea2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZSignalScope().isSuperTypeOf(
					domainElement.eClass())) {
				return JZSignalScope2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZSurfaceLCD().isSuperTypeOf(
					domainElement.eClass())) {
				return JZSurfaceLCD2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZSwitches().isSuperTypeOf(
					domainElement.eClass())) {
				return JZSwitches2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZText().isSuperTypeOf(
					domainElement.eClass())) {
				return JZText2EditPart.VISUAL_ID;
			}
			if (JzmuiPackage.eINSTANCE.getJZTrack().isSuperTypeOf(
					domainElement.eClass())) {
				return JZTrack2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry
				.getModelID(containerView);
		if (!JZJazzInterfaceEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (JZJazzInterfaceEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.smbt.jzmui.diagram.part.JzmuiVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = JZJazzInterfaceEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			if (JZJazzInterface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JZJazzInterface2EditPart.VISUAL_ID:
			if (JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JZContainerEditPart.VISUAL_ID:
			if (JZContainerJZContainerCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZBreakPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZContainer2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZCustomButtonEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZFaderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZGestureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZKnobEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZLedEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZLemurMenuEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZLemurMonitorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZMultiBallsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZPadsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZRangeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZRingAreaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZSignalScopeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZSurfaceLCDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZSwitchesEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZTextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZTrackEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZmultiSliderEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID:
			if (JZBreakPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZContainerEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZCustomButton2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZFader2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZGesture2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZKnob2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZLed2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZLemurMenu2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZLemurMonitor2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZMultiBalls2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZmultiSlider2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZPads2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZRange2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZRingArea2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZSignalScope2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZSurfaceLCD2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZSwitches2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZText2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JZTrack2EditPart.VISUAL_ID == nodeVisualID) {
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
	private static boolean isDiagram(JZJazzInterface element) {
		return true;
	}

}
