package net.sf.smbt.jzmui.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import net.sf.smbt.jzmui.JzmuiPackage;
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
public class JzmuiElementTypes {

	/**
	 * @generated
	 */
	private JzmuiElementTypes() {
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
	public static final IElementType JZJazzInterface_1000 = getElementType("net.sf.smbt.jazzmutant.diagram.JZJazzInterface_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZJazzInterface_2001 = getElementType("net.sf.smbt.jazzmutant.diagram.JZJazzInterface_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZBreakPoint_3001 = getElementType("net.sf.smbt.jazzmutant.diagram.JZBreakPoint_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZContainer_3002 = getElementType("net.sf.smbt.jazzmutant.diagram.JZContainer_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZBreakPoint_3003 = getElementType("net.sf.smbt.jazzmutant.diagram.JZBreakPoint_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZContainer_3004 = getElementType("net.sf.smbt.jazzmutant.diagram.JZContainer_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZCustomButton_3005 = getElementType("net.sf.smbt.jazzmutant.diagram.JZCustomButton_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZFader_3006 = getElementType("net.sf.smbt.jazzmutant.diagram.JZFader_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZGesture_3007 = getElementType("net.sf.smbt.jazzmutant.diagram.JZGesture_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZKnob_3008 = getElementType("net.sf.smbt.jazzmutant.diagram.JZKnob_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZLed_3009 = getElementType("net.sf.smbt.jazzmutant.diagram.JZLed_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZLemurMenu_3010 = getElementType("net.sf.smbt.jazzmutant.diagram.JZLemurMenu_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZLemurMonitor_3011 = getElementType("net.sf.smbt.jazzmutant.diagram.JZLemurMonitor_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZMultiBalls_3012 = getElementType("net.sf.smbt.jazzmutant.diagram.JZMultiBalls_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZPads_3013 = getElementType("net.sf.smbt.jazzmutant.diagram.JZPads_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZRange_3014 = getElementType("net.sf.smbt.jazzmutant.diagram.JZRange_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZRingArea_3015 = getElementType("net.sf.smbt.jazzmutant.diagram.JZRingArea_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZSignalScope_3016 = getElementType("net.sf.smbt.jazzmutant.diagram.JZSignalScope_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZSurfaceLCD_3017 = getElementType("net.sf.smbt.jazzmutant.diagram.JZSurfaceLCD_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZSwitches_3018 = getElementType("net.sf.smbt.jazzmutant.diagram.JZSwitches_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZText_3019 = getElementType("net.sf.smbt.jazzmutant.diagram.JZText_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZTrack_3020 = getElementType("net.sf.smbt.jazzmutant.diagram.JZTrack_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZmultiSlider_3021 = getElementType("net.sf.smbt.jazzmutant.diagram.JZmultiSlider_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZCustomButton_3022 = getElementType("net.sf.smbt.jazzmutant.diagram.JZCustomButton_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZFader_3023 = getElementType("net.sf.smbt.jazzmutant.diagram.JZFader_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZGesture_3024 = getElementType("net.sf.smbt.jazzmutant.diagram.JZGesture_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZKnob_3025 = getElementType("net.sf.smbt.jazzmutant.diagram.JZKnob_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZLed_3026 = getElementType("net.sf.smbt.jazzmutant.diagram.JZLed_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZLemurMenu_3027 = getElementType("net.sf.smbt.jazzmutant.diagram.JZLemurMenu_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZLemurMonitor_3028 = getElementType("net.sf.smbt.jazzmutant.diagram.JZLemurMonitor_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZMultiBalls_3029 = getElementType("net.sf.smbt.jazzmutant.diagram.JZMultiBalls_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZmultiSlider_3030 = getElementType("net.sf.smbt.jazzmutant.diagram.JZmultiSlider_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZPads_3031 = getElementType("net.sf.smbt.jazzmutant.diagram.JZPads_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZRange_3032 = getElementType("net.sf.smbt.jazzmutant.diagram.JZRange_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZRingArea_3033 = getElementType("net.sf.smbt.jazzmutant.diagram.JZRingArea_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZSignalScope_3034 = getElementType("net.sf.smbt.jazzmutant.diagram.JZSignalScope_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZSurfaceLCD_3035 = getElementType("net.sf.smbt.jazzmutant.diagram.JZSurfaceLCD_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZSwitches_3036 = getElementType("net.sf.smbt.jazzmutant.diagram.JZSwitches_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZText_3037 = getElementType("net.sf.smbt.jazzmutant.diagram.JZText_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JZTrack_3038 = getElementType("net.sf.smbt.jazzmutant.diagram.JZTrack_3038"); //$NON-NLS-1$

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
				return JzmuiDiagramEditorPlugin.getInstance()
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

			elements.put(JZJazzInterface_1000,
					JzmuiPackage.eINSTANCE.getJZJazzInterface());

			elements.put(JZJazzInterface_2001,
					JzmuiPackage.eINSTANCE.getJZJazzInterface());

			elements.put(JZBreakPoint_3001,
					JzmuiPackage.eINSTANCE.getJZBreakPoint());

			elements.put(JZContainer_3002,
					JzmuiPackage.eINSTANCE.getJZContainer());

			elements.put(JZBreakPoint_3003,
					JzmuiPackage.eINSTANCE.getJZBreakPoint());

			elements.put(JZContainer_3004,
					JzmuiPackage.eINSTANCE.getJZContainer());

			elements.put(JZCustomButton_3005,
					JzmuiPackage.eINSTANCE.getJZCustomButton());

			elements.put(JZFader_3006, JzmuiPackage.eINSTANCE.getJZFader());

			elements.put(JZGesture_3007, JzmuiPackage.eINSTANCE.getJZGesture());

			elements.put(JZKnob_3008, JzmuiPackage.eINSTANCE.getJZKnob());

			elements.put(JZLed_3009, JzmuiPackage.eINSTANCE.getJZLed());

			elements.put(JZLemurMenu_3010,
					JzmuiPackage.eINSTANCE.getJZLemurMenu());

			elements.put(JZLemurMonitor_3011,
					JzmuiPackage.eINSTANCE.getJZLemurMonitor());

			elements.put(JZMultiBalls_3012,
					JzmuiPackage.eINSTANCE.getJZMultiBalls());

			elements.put(JZPads_3013, JzmuiPackage.eINSTANCE.getJZPads());

			elements.put(JZRange_3014, JzmuiPackage.eINSTANCE.getJZRange());

			elements.put(JZRingArea_3015,
					JzmuiPackage.eINSTANCE.getJZRingArea());

			elements.put(JZSignalScope_3016,
					JzmuiPackage.eINSTANCE.getJZSignalScope());

			elements.put(JZSurfaceLCD_3017,
					JzmuiPackage.eINSTANCE.getJZSurfaceLCD());

			elements.put(JZSwitches_3018,
					JzmuiPackage.eINSTANCE.getJZSwitches());

			elements.put(JZText_3019, JzmuiPackage.eINSTANCE.getJZText());

			elements.put(JZTrack_3020, JzmuiPackage.eINSTANCE.getJZTrack());

			elements.put(JZmultiSlider_3021,
					JzmuiPackage.eINSTANCE.getJZmultiSlider());

			elements.put(JZCustomButton_3022,
					JzmuiPackage.eINSTANCE.getJZCustomButton());

			elements.put(JZFader_3023, JzmuiPackage.eINSTANCE.getJZFader());

			elements.put(JZGesture_3024, JzmuiPackage.eINSTANCE.getJZGesture());

			elements.put(JZKnob_3025, JzmuiPackage.eINSTANCE.getJZKnob());

			elements.put(JZLed_3026, JzmuiPackage.eINSTANCE.getJZLed());

			elements.put(JZLemurMenu_3027,
					JzmuiPackage.eINSTANCE.getJZLemurMenu());

			elements.put(JZLemurMonitor_3028,
					JzmuiPackage.eINSTANCE.getJZLemurMonitor());

			elements.put(JZMultiBalls_3029,
					JzmuiPackage.eINSTANCE.getJZMultiBalls());

			elements.put(JZmultiSlider_3030,
					JzmuiPackage.eINSTANCE.getJZmultiSlider());

			elements.put(JZPads_3031, JzmuiPackage.eINSTANCE.getJZPads());

			elements.put(JZRange_3032, JzmuiPackage.eINSTANCE.getJZRange());

			elements.put(JZRingArea_3033,
					JzmuiPackage.eINSTANCE.getJZRingArea());

			elements.put(JZSignalScope_3034,
					JzmuiPackage.eINSTANCE.getJZSignalScope());

			elements.put(JZSurfaceLCD_3035,
					JzmuiPackage.eINSTANCE.getJZSurfaceLCD());

			elements.put(JZSwitches_3036,
					JzmuiPackage.eINSTANCE.getJZSwitches());

			elements.put(JZText_3037, JzmuiPackage.eINSTANCE.getJZText());

			elements.put(JZTrack_3038, JzmuiPackage.eINSTANCE.getJZTrack());
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
			KNOWN_ELEMENT_TYPES.add(JZJazzInterface_1000);
			KNOWN_ELEMENT_TYPES.add(JZJazzInterface_2001);
			KNOWN_ELEMENT_TYPES.add(JZBreakPoint_3001);
			KNOWN_ELEMENT_TYPES.add(JZContainer_3002);
			KNOWN_ELEMENT_TYPES.add(JZBreakPoint_3003);
			KNOWN_ELEMENT_TYPES.add(JZContainer_3004);
			KNOWN_ELEMENT_TYPES.add(JZCustomButton_3005);
			KNOWN_ELEMENT_TYPES.add(JZFader_3006);
			KNOWN_ELEMENT_TYPES.add(JZGesture_3007);
			KNOWN_ELEMENT_TYPES.add(JZKnob_3008);
			KNOWN_ELEMENT_TYPES.add(JZLed_3009);
			KNOWN_ELEMENT_TYPES.add(JZLemurMenu_3010);
			KNOWN_ELEMENT_TYPES.add(JZLemurMonitor_3011);
			KNOWN_ELEMENT_TYPES.add(JZMultiBalls_3012);
			KNOWN_ELEMENT_TYPES.add(JZPads_3013);
			KNOWN_ELEMENT_TYPES.add(JZRange_3014);
			KNOWN_ELEMENT_TYPES.add(JZRingArea_3015);
			KNOWN_ELEMENT_TYPES.add(JZSignalScope_3016);
			KNOWN_ELEMENT_TYPES.add(JZSurfaceLCD_3017);
			KNOWN_ELEMENT_TYPES.add(JZSwitches_3018);
			KNOWN_ELEMENT_TYPES.add(JZText_3019);
			KNOWN_ELEMENT_TYPES.add(JZTrack_3020);
			KNOWN_ELEMENT_TYPES.add(JZmultiSlider_3021);
			KNOWN_ELEMENT_TYPES.add(JZCustomButton_3022);
			KNOWN_ELEMENT_TYPES.add(JZFader_3023);
			KNOWN_ELEMENT_TYPES.add(JZGesture_3024);
			KNOWN_ELEMENT_TYPES.add(JZKnob_3025);
			KNOWN_ELEMENT_TYPES.add(JZLed_3026);
			KNOWN_ELEMENT_TYPES.add(JZLemurMenu_3027);
			KNOWN_ELEMENT_TYPES.add(JZLemurMonitor_3028);
			KNOWN_ELEMENT_TYPES.add(JZMultiBalls_3029);
			KNOWN_ELEMENT_TYPES.add(JZmultiSlider_3030);
			KNOWN_ELEMENT_TYPES.add(JZPads_3031);
			KNOWN_ELEMENT_TYPES.add(JZRange_3032);
			KNOWN_ELEMENT_TYPES.add(JZRingArea_3033);
			KNOWN_ELEMENT_TYPES.add(JZSignalScope_3034);
			KNOWN_ELEMENT_TYPES.add(JZSurfaceLCD_3035);
			KNOWN_ELEMENT_TYPES.add(JZSwitches_3036);
			KNOWN_ELEMENT_TYPES.add(JZText_3037);
			KNOWN_ELEMENT_TYPES.add(JZTrack_3038);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case JZJazzInterfaceEditPart.VISUAL_ID:
			return JZJazzInterface_1000;
		case JZJazzInterface2EditPart.VISUAL_ID:
			return JZJazzInterface_2001;
		case JZBreakPointEditPart.VISUAL_ID:
			return JZBreakPoint_3001;
		case JZContainerEditPart.VISUAL_ID:
			return JZContainer_3002;
		case JZBreakPoint2EditPart.VISUAL_ID:
			return JZBreakPoint_3003;
		case JZContainer2EditPart.VISUAL_ID:
			return JZContainer_3004;
		case JZCustomButtonEditPart.VISUAL_ID:
			return JZCustomButton_3005;
		case JZFaderEditPart.VISUAL_ID:
			return JZFader_3006;
		case JZGestureEditPart.VISUAL_ID:
			return JZGesture_3007;
		case JZKnobEditPart.VISUAL_ID:
			return JZKnob_3008;
		case JZLedEditPart.VISUAL_ID:
			return JZLed_3009;
		case JZLemurMenuEditPart.VISUAL_ID:
			return JZLemurMenu_3010;
		case JZLemurMonitorEditPart.VISUAL_ID:
			return JZLemurMonitor_3011;
		case JZMultiBallsEditPart.VISUAL_ID:
			return JZMultiBalls_3012;
		case JZPadsEditPart.VISUAL_ID:
			return JZPads_3013;
		case JZRangeEditPart.VISUAL_ID:
			return JZRange_3014;
		case JZRingAreaEditPart.VISUAL_ID:
			return JZRingArea_3015;
		case JZSignalScopeEditPart.VISUAL_ID:
			return JZSignalScope_3016;
		case JZSurfaceLCDEditPart.VISUAL_ID:
			return JZSurfaceLCD_3017;
		case JZSwitchesEditPart.VISUAL_ID:
			return JZSwitches_3018;
		case JZTextEditPart.VISUAL_ID:
			return JZText_3019;
		case JZTrackEditPart.VISUAL_ID:
			return JZTrack_3020;
		case JZmultiSliderEditPart.VISUAL_ID:
			return JZmultiSlider_3021;
		case JZCustomButton2EditPart.VISUAL_ID:
			return JZCustomButton_3022;
		case JZFader2EditPart.VISUAL_ID:
			return JZFader_3023;
		case JZGesture2EditPart.VISUAL_ID:
			return JZGesture_3024;
		case JZKnob2EditPart.VISUAL_ID:
			return JZKnob_3025;
		case JZLed2EditPart.VISUAL_ID:
			return JZLed_3026;
		case JZLemurMenu2EditPart.VISUAL_ID:
			return JZLemurMenu_3027;
		case JZLemurMonitor2EditPart.VISUAL_ID:
			return JZLemurMonitor_3028;
		case JZMultiBalls2EditPart.VISUAL_ID:
			return JZMultiBalls_3029;
		case JZmultiSlider2EditPart.VISUAL_ID:
			return JZmultiSlider_3030;
		case JZPads2EditPart.VISUAL_ID:
			return JZPads_3031;
		case JZRange2EditPart.VISUAL_ID:
			return JZRange_3032;
		case JZRingArea2EditPart.VISUAL_ID:
			return JZRingArea_3033;
		case JZSignalScope2EditPart.VISUAL_ID:
			return JZSignalScope_3034;
		case JZSurfaceLCD2EditPart.VISUAL_ID:
			return JZSurfaceLCD_3035;
		case JZSwitches2EditPart.VISUAL_ID:
			return JZSwitches_3036;
		case JZText2EditPart.VISUAL_ID:
			return JZText_3037;
		case JZTrack2EditPart.VISUAL_ID:
			return JZTrack_3038;
		}
		return null;
	}

}
