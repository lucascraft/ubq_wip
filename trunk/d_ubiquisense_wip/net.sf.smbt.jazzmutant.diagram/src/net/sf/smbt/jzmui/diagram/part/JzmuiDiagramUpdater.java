package net.sf.smbt.jzmui.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import net.sf.smbt.jzmui.JZContainer;
import net.sf.smbt.jzmui.JZJazzInterface;
import net.sf.smbt.jzmui.JZUIElem;
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

import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class JzmuiDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<JzmuiNodeDescriptor> getSemanticChildren(View view) {
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			return getJZJazzInterface_1000SemanticChildren(view);
		case JZContainerEditPart.VISUAL_ID:
			return getJZContainer_3002SemanticChildren(view);
		case JZJazzInterfaceJZJazzInterfaceCompartmentEditPart.VISUAL_ID:
			return getJZJazzInterfaceJZJazzInterfaceCompartment_7001SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiNodeDescriptor> getJZJazzInterface_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		JZJazzInterface modelElement = (JZJazzInterface) view.getElement();
		LinkedList<JzmuiNodeDescriptor> result = new LinkedList<JzmuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			JZUIElem childElement = (JZUIElem) it.next();
			int visualID = JzmuiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JZJazzInterface2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<JzmuiNodeDescriptor> getJZContainer_3002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		JZContainer modelElement = (JZContainer) view.getElement();
		LinkedList<JzmuiNodeDescriptor> result = new LinkedList<JzmuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			JZUIElem childElement = (JZUIElem) it.next();
			int visualID = JzmuiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JZBreakPoint2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZContainer2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZCustomButtonEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZFaderEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZGestureEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZKnobEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZLedEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZLemurMenuEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZLemurMonitorEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZMultiBallsEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZPadsEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZRangeEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZRingAreaEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZSignalScopeEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZSurfaceLCDEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZSwitchesEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZTextEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZTrackEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZmultiSliderEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<JzmuiNodeDescriptor> getJZJazzInterfaceJZJazzInterfaceCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		JZJazzInterface modelElement = (JZJazzInterface) containerView
				.getElement();
		LinkedList<JzmuiNodeDescriptor> result = new LinkedList<JzmuiNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			JZUIElem childElement = (JZUIElem) it.next();
			int visualID = JzmuiVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == JZBreakPointEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZContainerEditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZCustomButton2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZFader2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZGesture2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZKnob2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZLed2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZLemurMenu2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZLemurMonitor2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZMultiBalls2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZmultiSlider2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZPads2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZRange2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZRingArea2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZSignalScope2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZSurfaceLCD2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZSwitches2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZText2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == JZTrack2EditPart.VISUAL_ID) {
				result.add(new JzmuiNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getContainedLinks(View view) {
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			return getJZJazzInterface_1000ContainedLinks(view);
		case JZJazzInterface2EditPart.VISUAL_ID:
			return getJZJazzInterface_2001ContainedLinks(view);
		case JZBreakPointEditPart.VISUAL_ID:
			return getJZBreakPoint_3001ContainedLinks(view);
		case JZContainerEditPart.VISUAL_ID:
			return getJZContainer_3002ContainedLinks(view);
		case JZBreakPoint2EditPart.VISUAL_ID:
			return getJZBreakPoint_3003ContainedLinks(view);
		case JZContainer2EditPart.VISUAL_ID:
			return getJZContainer_3004ContainedLinks(view);
		case JZCustomButtonEditPart.VISUAL_ID:
			return getJZCustomButton_3005ContainedLinks(view);
		case JZFaderEditPart.VISUAL_ID:
			return getJZFader_3006ContainedLinks(view);
		case JZGestureEditPart.VISUAL_ID:
			return getJZGesture_3007ContainedLinks(view);
		case JZKnobEditPart.VISUAL_ID:
			return getJZKnob_3008ContainedLinks(view);
		case JZLedEditPart.VISUAL_ID:
			return getJZLed_3009ContainedLinks(view);
		case JZLemurMenuEditPart.VISUAL_ID:
			return getJZLemurMenu_3010ContainedLinks(view);
		case JZLemurMonitorEditPart.VISUAL_ID:
			return getJZLemurMonitor_3011ContainedLinks(view);
		case JZMultiBallsEditPart.VISUAL_ID:
			return getJZMultiBalls_3012ContainedLinks(view);
		case JZPadsEditPart.VISUAL_ID:
			return getJZPads_3013ContainedLinks(view);
		case JZRangeEditPart.VISUAL_ID:
			return getJZRange_3014ContainedLinks(view);
		case JZRingAreaEditPart.VISUAL_ID:
			return getJZRingArea_3015ContainedLinks(view);
		case JZSignalScopeEditPart.VISUAL_ID:
			return getJZSignalScope_3016ContainedLinks(view);
		case JZSurfaceLCDEditPart.VISUAL_ID:
			return getJZSurfaceLCD_3017ContainedLinks(view);
		case JZSwitchesEditPart.VISUAL_ID:
			return getJZSwitches_3018ContainedLinks(view);
		case JZTextEditPart.VISUAL_ID:
			return getJZText_3019ContainedLinks(view);
		case JZTrackEditPart.VISUAL_ID:
			return getJZTrack_3020ContainedLinks(view);
		case JZmultiSliderEditPart.VISUAL_ID:
			return getJZmultiSlider_3021ContainedLinks(view);
		case JZCustomButton2EditPart.VISUAL_ID:
			return getJZCustomButton_3022ContainedLinks(view);
		case JZFader2EditPart.VISUAL_ID:
			return getJZFader_3023ContainedLinks(view);
		case JZGesture2EditPart.VISUAL_ID:
			return getJZGesture_3024ContainedLinks(view);
		case JZKnob2EditPart.VISUAL_ID:
			return getJZKnob_3025ContainedLinks(view);
		case JZLed2EditPart.VISUAL_ID:
			return getJZLed_3026ContainedLinks(view);
		case JZLemurMenu2EditPart.VISUAL_ID:
			return getJZLemurMenu_3027ContainedLinks(view);
		case JZLemurMonitor2EditPart.VISUAL_ID:
			return getJZLemurMonitor_3028ContainedLinks(view);
		case JZMultiBalls2EditPart.VISUAL_ID:
			return getJZMultiBalls_3029ContainedLinks(view);
		case JZmultiSlider2EditPart.VISUAL_ID:
			return getJZmultiSlider_3030ContainedLinks(view);
		case JZPads2EditPart.VISUAL_ID:
			return getJZPads_3031ContainedLinks(view);
		case JZRange2EditPart.VISUAL_ID:
			return getJZRange_3032ContainedLinks(view);
		case JZRingArea2EditPart.VISUAL_ID:
			return getJZRingArea_3033ContainedLinks(view);
		case JZSignalScope2EditPart.VISUAL_ID:
			return getJZSignalScope_3034ContainedLinks(view);
		case JZSurfaceLCD2EditPart.VISUAL_ID:
			return getJZSurfaceLCD_3035ContainedLinks(view);
		case JZSwitches2EditPart.VISUAL_ID:
			return getJZSwitches_3036ContainedLinks(view);
		case JZText2EditPart.VISUAL_ID:
			return getJZText_3037ContainedLinks(view);
		case JZTrack2EditPart.VISUAL_ID:
			return getJZTrack_3038ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getIncomingLinks(View view) {
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {
		case JZJazzInterface2EditPart.VISUAL_ID:
			return getJZJazzInterface_2001IncomingLinks(view);
		case JZBreakPointEditPart.VISUAL_ID:
			return getJZBreakPoint_3001IncomingLinks(view);
		case JZContainerEditPart.VISUAL_ID:
			return getJZContainer_3002IncomingLinks(view);
		case JZBreakPoint2EditPart.VISUAL_ID:
			return getJZBreakPoint_3003IncomingLinks(view);
		case JZContainer2EditPart.VISUAL_ID:
			return getJZContainer_3004IncomingLinks(view);
		case JZCustomButtonEditPart.VISUAL_ID:
			return getJZCustomButton_3005IncomingLinks(view);
		case JZFaderEditPart.VISUAL_ID:
			return getJZFader_3006IncomingLinks(view);
		case JZGestureEditPart.VISUAL_ID:
			return getJZGesture_3007IncomingLinks(view);
		case JZKnobEditPart.VISUAL_ID:
			return getJZKnob_3008IncomingLinks(view);
		case JZLedEditPart.VISUAL_ID:
			return getJZLed_3009IncomingLinks(view);
		case JZLemurMenuEditPart.VISUAL_ID:
			return getJZLemurMenu_3010IncomingLinks(view);
		case JZLemurMonitorEditPart.VISUAL_ID:
			return getJZLemurMonitor_3011IncomingLinks(view);
		case JZMultiBallsEditPart.VISUAL_ID:
			return getJZMultiBalls_3012IncomingLinks(view);
		case JZPadsEditPart.VISUAL_ID:
			return getJZPads_3013IncomingLinks(view);
		case JZRangeEditPart.VISUAL_ID:
			return getJZRange_3014IncomingLinks(view);
		case JZRingAreaEditPart.VISUAL_ID:
			return getJZRingArea_3015IncomingLinks(view);
		case JZSignalScopeEditPart.VISUAL_ID:
			return getJZSignalScope_3016IncomingLinks(view);
		case JZSurfaceLCDEditPart.VISUAL_ID:
			return getJZSurfaceLCD_3017IncomingLinks(view);
		case JZSwitchesEditPart.VISUAL_ID:
			return getJZSwitches_3018IncomingLinks(view);
		case JZTextEditPart.VISUAL_ID:
			return getJZText_3019IncomingLinks(view);
		case JZTrackEditPart.VISUAL_ID:
			return getJZTrack_3020IncomingLinks(view);
		case JZmultiSliderEditPart.VISUAL_ID:
			return getJZmultiSlider_3021IncomingLinks(view);
		case JZCustomButton2EditPart.VISUAL_ID:
			return getJZCustomButton_3022IncomingLinks(view);
		case JZFader2EditPart.VISUAL_ID:
			return getJZFader_3023IncomingLinks(view);
		case JZGesture2EditPart.VISUAL_ID:
			return getJZGesture_3024IncomingLinks(view);
		case JZKnob2EditPart.VISUAL_ID:
			return getJZKnob_3025IncomingLinks(view);
		case JZLed2EditPart.VISUAL_ID:
			return getJZLed_3026IncomingLinks(view);
		case JZLemurMenu2EditPart.VISUAL_ID:
			return getJZLemurMenu_3027IncomingLinks(view);
		case JZLemurMonitor2EditPart.VISUAL_ID:
			return getJZLemurMonitor_3028IncomingLinks(view);
		case JZMultiBalls2EditPart.VISUAL_ID:
			return getJZMultiBalls_3029IncomingLinks(view);
		case JZmultiSlider2EditPart.VISUAL_ID:
			return getJZmultiSlider_3030IncomingLinks(view);
		case JZPads2EditPart.VISUAL_ID:
			return getJZPads_3031IncomingLinks(view);
		case JZRange2EditPart.VISUAL_ID:
			return getJZRange_3032IncomingLinks(view);
		case JZRingArea2EditPart.VISUAL_ID:
			return getJZRingArea_3033IncomingLinks(view);
		case JZSignalScope2EditPart.VISUAL_ID:
			return getJZSignalScope_3034IncomingLinks(view);
		case JZSurfaceLCD2EditPart.VISUAL_ID:
			return getJZSurfaceLCD_3035IncomingLinks(view);
		case JZSwitches2EditPart.VISUAL_ID:
			return getJZSwitches_3036IncomingLinks(view);
		case JZText2EditPart.VISUAL_ID:
			return getJZText_3037IncomingLinks(view);
		case JZTrack2EditPart.VISUAL_ID:
			return getJZTrack_3038IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getOutgoingLinks(View view) {
		switch (JzmuiVisualIDRegistry.getVisualID(view)) {
		case JZJazzInterface2EditPart.VISUAL_ID:
			return getJZJazzInterface_2001OutgoingLinks(view);
		case JZBreakPointEditPart.VISUAL_ID:
			return getJZBreakPoint_3001OutgoingLinks(view);
		case JZContainerEditPart.VISUAL_ID:
			return getJZContainer_3002OutgoingLinks(view);
		case JZBreakPoint2EditPart.VISUAL_ID:
			return getJZBreakPoint_3003OutgoingLinks(view);
		case JZContainer2EditPart.VISUAL_ID:
			return getJZContainer_3004OutgoingLinks(view);
		case JZCustomButtonEditPart.VISUAL_ID:
			return getJZCustomButton_3005OutgoingLinks(view);
		case JZFaderEditPart.VISUAL_ID:
			return getJZFader_3006OutgoingLinks(view);
		case JZGestureEditPart.VISUAL_ID:
			return getJZGesture_3007OutgoingLinks(view);
		case JZKnobEditPart.VISUAL_ID:
			return getJZKnob_3008OutgoingLinks(view);
		case JZLedEditPart.VISUAL_ID:
			return getJZLed_3009OutgoingLinks(view);
		case JZLemurMenuEditPart.VISUAL_ID:
			return getJZLemurMenu_3010OutgoingLinks(view);
		case JZLemurMonitorEditPart.VISUAL_ID:
			return getJZLemurMonitor_3011OutgoingLinks(view);
		case JZMultiBallsEditPart.VISUAL_ID:
			return getJZMultiBalls_3012OutgoingLinks(view);
		case JZPadsEditPart.VISUAL_ID:
			return getJZPads_3013OutgoingLinks(view);
		case JZRangeEditPart.VISUAL_ID:
			return getJZRange_3014OutgoingLinks(view);
		case JZRingAreaEditPart.VISUAL_ID:
			return getJZRingArea_3015OutgoingLinks(view);
		case JZSignalScopeEditPart.VISUAL_ID:
			return getJZSignalScope_3016OutgoingLinks(view);
		case JZSurfaceLCDEditPart.VISUAL_ID:
			return getJZSurfaceLCD_3017OutgoingLinks(view);
		case JZSwitchesEditPart.VISUAL_ID:
			return getJZSwitches_3018OutgoingLinks(view);
		case JZTextEditPart.VISUAL_ID:
			return getJZText_3019OutgoingLinks(view);
		case JZTrackEditPart.VISUAL_ID:
			return getJZTrack_3020OutgoingLinks(view);
		case JZmultiSliderEditPart.VISUAL_ID:
			return getJZmultiSlider_3021OutgoingLinks(view);
		case JZCustomButton2EditPart.VISUAL_ID:
			return getJZCustomButton_3022OutgoingLinks(view);
		case JZFader2EditPart.VISUAL_ID:
			return getJZFader_3023OutgoingLinks(view);
		case JZGesture2EditPart.VISUAL_ID:
			return getJZGesture_3024OutgoingLinks(view);
		case JZKnob2EditPart.VISUAL_ID:
			return getJZKnob_3025OutgoingLinks(view);
		case JZLed2EditPart.VISUAL_ID:
			return getJZLed_3026OutgoingLinks(view);
		case JZLemurMenu2EditPart.VISUAL_ID:
			return getJZLemurMenu_3027OutgoingLinks(view);
		case JZLemurMonitor2EditPart.VISUAL_ID:
			return getJZLemurMonitor_3028OutgoingLinks(view);
		case JZMultiBalls2EditPart.VISUAL_ID:
			return getJZMultiBalls_3029OutgoingLinks(view);
		case JZmultiSlider2EditPart.VISUAL_ID:
			return getJZmultiSlider_3030OutgoingLinks(view);
		case JZPads2EditPart.VISUAL_ID:
			return getJZPads_3031OutgoingLinks(view);
		case JZRange2EditPart.VISUAL_ID:
			return getJZRange_3032OutgoingLinks(view);
		case JZRingArea2EditPart.VISUAL_ID:
			return getJZRingArea_3033OutgoingLinks(view);
		case JZSignalScope2EditPart.VISUAL_ID:
			return getJZSignalScope_3034OutgoingLinks(view);
		case JZSurfaceLCD2EditPart.VISUAL_ID:
			return getJZSurfaceLCD_3035OutgoingLinks(view);
		case JZSwitches2EditPart.VISUAL_ID:
			return getJZSwitches_3036OutgoingLinks(view);
		case JZText2EditPart.VISUAL_ID:
			return getJZText_3037OutgoingLinks(view);
		case JZTrack2EditPart.VISUAL_ID:
			return getJZTrack_3038OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZJazzInterface_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZJazzInterface_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZBreakPoint_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZContainer_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZBreakPoint_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZContainer_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZCustomButton_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZFader_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZGesture_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZKnob_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLed_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMenu_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMonitor_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZMultiBalls_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZPads_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRange_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRingArea_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSignalScope_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSurfaceLCD_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSwitches_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZText_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZTrack_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZmultiSlider_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZCustomButton_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZFader_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZGesture_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZKnob_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLed_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMenu_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMonitor_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZMultiBalls_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZmultiSlider_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZPads_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRange_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRingArea_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSignalScope_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSurfaceLCD_3035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSwitches_3036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZText_3037ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZTrack_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZJazzInterface_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZBreakPoint_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZContainer_3002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZBreakPoint_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZContainer_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZCustomButton_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZFader_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZGesture_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZKnob_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLed_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMenu_3010IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMonitor_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZMultiBalls_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZPads_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRange_3014IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRingArea_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSignalScope_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSurfaceLCD_3017IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSwitches_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZText_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZTrack_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZmultiSlider_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZCustomButton_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZFader_3023IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZGesture_3024IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZKnob_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLed_3026IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMenu_3027IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMonitor_3028IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZMultiBalls_3029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZmultiSlider_3030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZPads_3031IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRange_3032IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRingArea_3033IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSignalScope_3034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSurfaceLCD_3035IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSwitches_3036IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZText_3037IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZTrack_3038IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZJazzInterface_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZBreakPoint_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZContainer_3002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZBreakPoint_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZContainer_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZCustomButton_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZFader_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZGesture_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZKnob_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLed_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMenu_3010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMonitor_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZMultiBalls_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZPads_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRange_3014OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRingArea_3015OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSignalScope_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSurfaceLCD_3017OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSwitches_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZText_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZTrack_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZmultiSlider_3021OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZCustomButton_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZFader_3023OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZGesture_3024OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZKnob_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLed_3026OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMenu_3027OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZLemurMonitor_3028OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZMultiBalls_3029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZmultiSlider_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZPads_3031OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRange_3032OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZRingArea_3033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSignalScope_3034OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSurfaceLCD_3035OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZSwitches_3036OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZText_3037OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<JzmuiLinkDescriptor> getJZTrack_3038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
