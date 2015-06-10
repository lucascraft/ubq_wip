package net.sf.smbt.ezsequence.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.smbt.ezsequence.AbstractPort;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.PortIn;
import net.sf.smbt.ezsequence.PortOut;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimeBox;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.TimedLink;
import net.sf.smbt.ezsequence.diagram.edit.parts.EventTriggerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortInEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortOutEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.SequencerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxTimedEventsEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeCursorEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeLineEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedEventEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedLinkEditPart;
import net.sf.smbt.ezsequence.diagram.providers.EzsequenceElementTypes;

import net.sf.xqz.model.temporal.TimeLine;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EzsequenceDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<EzsequenceNodeDescriptor> getSemanticChildren(View view) {
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_1000SemanticChildren(view);
		case TimeBoxEditPart.VISUAL_ID:
			return getTimeBox_2001SemanticChildren(view);
		case TimeBoxTimedEventsEditPart.VISUAL_ID:
			return getTimeBoxTimedEvents_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceNodeDescriptor> getSequencer_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Sequencer modelElement = (Sequencer) view.getElement();
		LinkedList<EzsequenceNodeDescriptor> result = new LinkedList<EzsequenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getBoxes().iterator(); it.hasNext();) {
			TimeBox childElement = (TimeBox) it.next();
			int visualID = EzsequenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TimeBoxEditPart.VISUAL_ID) {
				result.add(new EzsequenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTimelines().iterator(); it
				.hasNext();) {
			TimeLine childElement = (TimeLine) it.next();
			int visualID = EzsequenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TimeLineEditPart.VISUAL_ID) {
				result.add(new EzsequenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			TimeCursor childElement = modelElement.getTimeCursor();
			int visualID = EzsequenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TimeCursorEditPart.VISUAL_ID) {
				result.add(new EzsequenceNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceNodeDescriptor> getTimeBox_2001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		TimeBox modelElement = (TimeBox) view.getElement();
		LinkedList<EzsequenceNodeDescriptor> result = new LinkedList<EzsequenceNodeDescriptor>();
		{
			PortIn childElement = modelElement.getIn();
			int visualID = EzsequenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PortInEditPart.VISUAL_ID) {
				result.add(new EzsequenceNodeDescriptor(childElement, visualID));
			}
		}
		{
			PortOut childElement = modelElement.getOut();
			int visualID = EzsequenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == PortOutEditPart.VISUAL_ID) {
				result.add(new EzsequenceNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceNodeDescriptor> getTimeBoxTimedEvents_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		TimeBox modelElement = (TimeBox) containerView.getElement();
		LinkedList<EzsequenceNodeDescriptor> result = new LinkedList<EzsequenceNodeDescriptor>();
		for (Iterator<?> it = modelElement.getEvents().iterator(); it.hasNext();) {
			TimedEvent childElement = (TimedEvent) it.next();
			int visualID = EzsequenceVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TimedEventEditPart.VISUAL_ID) {
				result.add(new EzsequenceNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getContainedLinks(View view) {
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {
		case SequencerEditPart.VISUAL_ID:
			return getSequencer_1000ContainedLinks(view);
		case TimeBoxEditPart.VISUAL_ID:
			return getTimeBox_2001ContainedLinks(view);
		case TimeLineEditPart.VISUAL_ID:
			return getTimeLine_2002ContainedLinks(view);
		case TimeCursorEditPart.VISUAL_ID:
			return getTimeCursor_2003ContainedLinks(view);
		case TimedEventEditPart.VISUAL_ID:
			return getTimedEvent_3001ContainedLinks(view);
		case PortInEditPart.VISUAL_ID:
			return getPortIn_3002ContainedLinks(view);
		case PortOutEditPart.VISUAL_ID:
			return getPortOut_3003ContainedLinks(view);
		case TimedLinkEditPart.VISUAL_ID:
			return getTimedLink_4001ContainedLinks(view);
		case EventTriggerEditPart.VISUAL_ID:
			return getEventTrigger_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getIncomingLinks(View view) {
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {
		case TimeBoxEditPart.VISUAL_ID:
			return getTimeBox_2001IncomingLinks(view);
		case TimeLineEditPart.VISUAL_ID:
			return getTimeLine_2002IncomingLinks(view);
		case TimeCursorEditPart.VISUAL_ID:
			return getTimeCursor_2003IncomingLinks(view);
		case TimedEventEditPart.VISUAL_ID:
			return getTimedEvent_3001IncomingLinks(view);
		case PortInEditPart.VISUAL_ID:
			return getPortIn_3002IncomingLinks(view);
		case PortOutEditPart.VISUAL_ID:
			return getPortOut_3003IncomingLinks(view);
		case TimedLinkEditPart.VISUAL_ID:
			return getTimedLink_4001IncomingLinks(view);
		case EventTriggerEditPart.VISUAL_ID:
			return getEventTrigger_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getOutgoingLinks(View view) {
		switch (EzsequenceVisualIDRegistry.getVisualID(view)) {
		case TimeBoxEditPart.VISUAL_ID:
			return getTimeBox_2001OutgoingLinks(view);
		case TimeLineEditPart.VISUAL_ID:
			return getTimeLine_2002OutgoingLinks(view);
		case TimeCursorEditPart.VISUAL_ID:
			return getTimeCursor_2003OutgoingLinks(view);
		case TimedEventEditPart.VISUAL_ID:
			return getTimedEvent_3001OutgoingLinks(view);
		case PortInEditPart.VISUAL_ID:
			return getPortIn_3002OutgoingLinks(view);
		case PortOutEditPart.VISUAL_ID:
			return getPortOut_3003OutgoingLinks(view);
		case TimedLinkEditPart.VISUAL_ID:
			return getTimedLink_4001OutgoingLinks(view);
		case EventTriggerEditPart.VISUAL_ID:
			return getEventTrigger_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getSequencer_1000ContainedLinks(
			View view) {
		Sequencer modelElement = (Sequencer) view.getElement();
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_TimedLink_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_EventTrigger_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeBox_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeLine_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeCursor_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimedEvent_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getPortIn_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getPortOut_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimedLink_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getEventTrigger_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeBox_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeLine_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeCursor_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimedEvent_3001IncomingLinks(
			View view) {
		TimedEvent modelElement = (TimedEvent) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_EventTrigger_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getPortIn_3002IncomingLinks(
			View view) {
		PortIn modelElement = (PortIn) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TimedLink_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getPortOut_3003IncomingLinks(
			View view) {
		PortOut modelElement = (PortOut) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_TimedLink_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimedLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getEventTrigger_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeBox_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeLine_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimeCursor_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimedEvent_3001OutgoingLinks(
			View view) {
		TimedEvent modelElement = (TimedEvent) view.getElement();
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_EventTrigger_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getPortIn_3002OutgoingLinks(
			View view) {
		PortIn modelElement = (PortIn) view.getElement();
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TimedLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getPortOut_3003OutgoingLinks(
			View view) {
		PortOut modelElement = (PortOut) view.getElement();
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_TimedLink_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getTimedLink_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<EzsequenceLinkDescriptor> getEventTrigger_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<EzsequenceLinkDescriptor> getContainedTypeModelFacetLinks_TimedLink_4001(
			Sequencer container) {
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TimedLink) {
				continue;
			}
			TimedLink link = (TimedLink) linkObject;
			if (TimedLinkEditPart.VISUAL_ID != EzsequenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractPort dst = link.getBefore();
			AbstractPort src = link.getAfter();
			result.add(new EzsequenceLinkDescriptor(src, dst, link,
					EzsequenceElementTypes.TimedLink_4001,
					TimedLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EzsequenceLinkDescriptor> getContainedTypeModelFacetLinks_EventTrigger_4002(
			Sequencer container) {
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		for (Iterator<?> links = container.getTriggers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EventTrigger) {
				continue;
			}
			EventTrigger link = (EventTrigger) linkObject;
			if (EventTriggerEditPart.VISUAL_ID != EzsequenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TimedEvent dst = link.getBefore();
			TimedEvent src = link.getAfter();
			result.add(new EzsequenceLinkDescriptor(src, dst, link,
					EzsequenceElementTypes.EventTrigger_4002,
					EventTriggerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EzsequenceLinkDescriptor> getIncomingTypeModelFacetLinks_TimedLink_4001(
			AbstractPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EzsequencePackage.eINSTANCE
					.getTimedLink_Before()
					|| false == setting.getEObject() instanceof TimedLink) {
				continue;
			}
			TimedLink link = (TimedLink) setting.getEObject();
			if (TimedLinkEditPart.VISUAL_ID != EzsequenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractPort src = link.getAfter();
			result.add(new EzsequenceLinkDescriptor(src, target, link,
					EzsequenceElementTypes.TimedLink_4001,
					TimedLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EzsequenceLinkDescriptor> getIncomingTypeModelFacetLinks_EventTrigger_4002(
			TimedEvent target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != EzsequencePackage.eINSTANCE
					.getEventTrigger_Before()
					|| false == setting.getEObject() instanceof EventTrigger) {
				continue;
			}
			EventTrigger link = (EventTrigger) setting.getEObject();
			if (EventTriggerEditPart.VISUAL_ID != EzsequenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TimedEvent src = link.getAfter();
			result.add(new EzsequenceLinkDescriptor(src, target, link,
					EzsequenceElementTypes.EventTrigger_4002,
					EventTriggerEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EzsequenceLinkDescriptor> getOutgoingTypeModelFacetLinks_TimedLink_4001(
			AbstractPort source) {
		Sequencer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Sequencer) {
				container = (Sequencer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof TimedLink) {
				continue;
			}
			TimedLink link = (TimedLink) linkObject;
			if (TimedLinkEditPart.VISUAL_ID != EzsequenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			AbstractPort dst = link.getBefore();
			AbstractPort src = link.getAfter();
			if (src != source) {
				continue;
			}
			result.add(new EzsequenceLinkDescriptor(src, dst, link,
					EzsequenceElementTypes.TimedLink_4001,
					TimedLinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<EzsequenceLinkDescriptor> getOutgoingTypeModelFacetLinks_EventTrigger_4002(
			TimedEvent source) {
		Sequencer container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Sequencer) {
				container = (Sequencer) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<EzsequenceLinkDescriptor> result = new LinkedList<EzsequenceLinkDescriptor>();
		for (Iterator<?> links = container.getTriggers().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof EventTrigger) {
				continue;
			}
			EventTrigger link = (EventTrigger) linkObject;
			if (EventTriggerEditPart.VISUAL_ID != EzsequenceVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			TimedEvent dst = link.getBefore();
			TimedEvent src = link.getAfter();
			if (src != source) {
				continue;
			}
			result.add(new EzsequenceLinkDescriptor(src, dst, link,
					EzsequenceElementTypes.EventTrigger_4002,
					EventTriggerEditPart.VISUAL_ID));
		}
		return result;
	}

}
