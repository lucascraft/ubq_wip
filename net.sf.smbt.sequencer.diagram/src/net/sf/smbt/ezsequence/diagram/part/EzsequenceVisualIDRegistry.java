package net.sf.smbt.ezsequence.diagram.part;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.diagram.edit.parts.EventTriggerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortInEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortOutEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.SequencerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxIDEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxTimedEventsEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeCursorEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeLineEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedEventEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedLinkEditPart;
import net.sf.xqz.model.temporal.TemporalPackage;

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
public class EzsequenceVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "net.sf.smbt.sequencer.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SequencerEditPart.MODEL_ID.equals(view.getType())) {
				return SequencerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry
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
				EzsequenceDiagramEditorPlugin.getInstance().logError(
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
		if (EzsequencePackage.eINSTANCE.getSequencer().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((Sequencer) domainElement)) {
			return SequencerEditPart.VISUAL_ID;
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
		String containerModelID = net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry
				.getModelID(containerView);
		if (!SequencerEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SequencerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SequencerEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SequencerEditPart.VISUAL_ID:
			if (EzsequencePackage.eINSTANCE.getTimeBox().isSuperTypeOf(
					domainElement.eClass())) {
				return TimeBoxEditPart.VISUAL_ID;
			}
			if (TemporalPackage.eINSTANCE.getTimeLine().isSuperTypeOf(
					domainElement.eClass())) {
				return TimeLineEditPart.VISUAL_ID;
			}
			if (EzsequencePackage.eINSTANCE.getTimeCursor().isSuperTypeOf(
					domainElement.eClass())) {
				return TimeCursorEditPart.VISUAL_ID;
			}
			break;
		case TimeBoxEditPart.VISUAL_ID:
			if (EzsequencePackage.eINSTANCE.getPortIn().isSuperTypeOf(
					domainElement.eClass())) {
				return PortInEditPart.VISUAL_ID;
			}
			if (EzsequencePackage.eINSTANCE.getPortOut().isSuperTypeOf(
					domainElement.eClass())) {
				return PortOutEditPart.VISUAL_ID;
			}
			break;
		case TimeBoxTimedEventsEditPart.VISUAL_ID:
			if (EzsequencePackage.eINSTANCE.getTimedEvent().isSuperTypeOf(
					domainElement.eClass())) {
				return TimedEventEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry
				.getModelID(containerView);
		if (!SequencerEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SequencerEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = net.sf.smbt.ezsequence.diagram.part.EzsequenceVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SequencerEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SequencerEditPart.VISUAL_ID:
			if (TimeBoxEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeLineEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeCursorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeBoxEditPart.VISUAL_ID:
			if (TimeBoxIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TimeBoxTimedEventsEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortInEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PortOutEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TimeBoxTimedEventsEditPart.VISUAL_ID:
			if (TimedEventEditPart.VISUAL_ID == nodeVisualID) {
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
		if (EzsequencePackage.eINSTANCE.getTimedLink().isSuperTypeOf(
				domainElement.eClass())) {
			return TimedLinkEditPart.VISUAL_ID;
		}
		if (EzsequencePackage.eINSTANCE.getEventTrigger().isSuperTypeOf(
				domainElement.eClass())) {
			return EventTriggerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Sequencer element) {
		return true;
	}

}
