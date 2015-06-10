package net.sf.smbt.ezsequence.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.diagram.edit.parts.EventTriggerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortInEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.PortOutEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.SequencerEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeBoxEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeCursorEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimeLineEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedEventEditPart;
import net.sf.smbt.ezsequence.diagram.edit.parts.TimedLinkEditPart;
import net.sf.smbt.ezsequence.diagram.part.EzsequenceDiagramEditorPlugin;
import net.sf.xqz.model.temporal.TemporalPackage;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class EzsequenceElementTypes {

	/**
	 * @generated
	 */
	private EzsequenceElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Sequencer_1000 = getElementType("net.sf.smbt.sequencer.diagram.Sequencer_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeBox_2001 = getElementType("net.sf.smbt.sequencer.diagram.TimeBox_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimeLine_2002 = getElementType("net.sf.smbt.sequencer.diagram.TimeLine_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TimeCursor_2003 = getElementType("net.sf.smbt.sequencer.diagram.TimeCursor_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TimedEvent_3001 = getElementType("net.sf.smbt.sequencer.diagram.TimedEvent_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortIn_3002 = getElementType("net.sf.smbt.sequencer.diagram.PortIn_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PortOut_3003 = getElementType("net.sf.smbt.sequencer.diagram.PortOut_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TimedLink_4001 = getElementType("net.sf.smbt.sequencer.diagram.TimedLink_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType EventTrigger_4002 = getElementType("net.sf.smbt.sequencer.diagram.EventTrigger_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return EzsequenceDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Sequencer_1000,
					EzsequencePackage.eINSTANCE.getSequencer());

			elements.put(TimeBox_2001, EzsequencePackage.eINSTANCE.getTimeBox());

			elements.put(TimeLine_2002, TemporalPackage.eINSTANCE.getTimeLine());

			elements.put(TimeCursor_2003,
					EzsequencePackage.eINSTANCE.getTimeCursor());

			elements.put(TimedEvent_3001,
					EzsequencePackage.eINSTANCE.getTimedEvent());

			elements.put(PortIn_3002, EzsequencePackage.eINSTANCE.getPortIn());

			elements.put(PortOut_3003, EzsequencePackage.eINSTANCE.getPortOut());

			elements.put(TimedLink_4001,
					EzsequencePackage.eINSTANCE.getTimedLink());

			elements.put(EventTrigger_4002,
					EzsequencePackage.eINSTANCE.getEventTrigger());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Sequencer_1000);
			KNOWN_ELEMENT_TYPES.add(TimeBox_2001);
			KNOWN_ELEMENT_TYPES.add(TimeLine_2002);
			KNOWN_ELEMENT_TYPES.add(TimeCursor_2003);
			KNOWN_ELEMENT_TYPES.add(TimedEvent_3001);
			KNOWN_ELEMENT_TYPES.add(PortIn_3002);
			KNOWN_ELEMENT_TYPES.add(PortOut_3003);
			KNOWN_ELEMENT_TYPES.add(TimedLink_4001);
			KNOWN_ELEMENT_TYPES.add(EventTrigger_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SequencerEditPart.VISUAL_ID:
			return Sequencer_1000;
		case TimeBoxEditPart.VISUAL_ID:
			return TimeBox_2001;
		case TimeLineEditPart.VISUAL_ID:
			return TimeLine_2002;
		case TimeCursorEditPart.VISUAL_ID:
			return TimeCursor_2003;
		case TimedEventEditPart.VISUAL_ID:
			return TimedEvent_3001;
		case PortInEditPart.VISUAL_ID:
			return PortIn_3002;
		case PortOutEditPart.VISUAL_ID:
			return PortOut_3003;
		case TimedLinkEditPart.VISUAL_ID:
			return TimedLink_4001;
		case EventTriggerEditPart.VISUAL_ID:
			return EventTrigger_4002;
		}
		return null;
	}

}
