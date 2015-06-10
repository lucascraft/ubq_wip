package net.sf.smbt.touchosc.ui.touchoscgui.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

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
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeHEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscTimeVEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscToggleEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.edit.parts.TouchOscXYPadEditPart;
import net.sf.smbt.touchosc.ui.touchoscgui.diagram.part.TouchoscguiDiagramEditorPlugin;

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
public class TouchoscguiElementTypes {

	/**
	 * @generated
	 */
	private TouchoscguiElementTypes() {
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
	public static final IElementType TouchOscLayout_1000 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscLayout_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TouchOscTabPage_2001 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscTabPage_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscFaderH_3001 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscFaderH_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscFaderV_3002 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscFaderV_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscLabelH_3003 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscLabelH_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscLabelV_3004 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscLabelV_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscLED_3005 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscLED_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscMultiToggle_3006 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscMultiToggle_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscPush_3007 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscPush_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscRotaryH_3008 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscRotaryH_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscRotaryV_3009 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscRotaryV_3009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscXYPad_3010 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscXYPad_3010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscToggle_3011 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscToggle_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscTimeH_3012 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscTimeH_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscTimeV_3013 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscTimeV_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscEncoder_3014 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscEncoder_3014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscBatteryH_3015 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscBatteryH_3015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscBatteryV_3016 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscBatteryV_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscMultiFaderH_3017 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscMultiFaderH_3017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscMultiFaderV_3018 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscMultiFaderV_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TouchOscMultiPush_3019 = getElementType("net.sf.smbt.touchosc.diagram.TouchOscMultiPush_3019"); //$NON-NLS-1$

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
				return TouchoscguiDiagramEditorPlugin.getInstance()
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

			elements.put(TouchOscLayout_1000,
					TouchoscguiPackage.eINSTANCE.getTouchOscLayout());

			elements.put(TouchOscTabPage_2001,
					TouchoscguiPackage.eINSTANCE.getTouchOscTabPage());

			elements.put(TouchOscFaderH_3001,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderH());

			elements.put(TouchOscFaderV_3002,
					TouchoscguiPackage.eINSTANCE.getTouchOscFaderV());

			elements.put(TouchOscLabelH_3003,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelH());

			elements.put(TouchOscLabelV_3004,
					TouchoscguiPackage.eINSTANCE.getTouchOscLabelV());

			elements.put(TouchOscLED_3005,
					TouchoscguiPackage.eINSTANCE.getTouchOscLED());

			elements.put(TouchOscMultiToggle_3006,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiToggle());

			elements.put(TouchOscPush_3007,
					TouchoscguiPackage.eINSTANCE.getTouchOscPush());

			elements.put(TouchOscRotaryH_3008,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryH());

			elements.put(TouchOscRotaryV_3009,
					TouchoscguiPackage.eINSTANCE.getTouchOscRotaryV());

			elements.put(TouchOscXYPad_3010,
					TouchoscguiPackage.eINSTANCE.getTouchOscXYPad());

			elements.put(TouchOscToggle_3011,
					TouchoscguiPackage.eINSTANCE.getTouchOscToggle());

			elements.put(TouchOscTimeH_3012,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeH());

			elements.put(TouchOscTimeV_3013,
					TouchoscguiPackage.eINSTANCE.getTouchOscTimeV());

			elements.put(TouchOscEncoder_3014,
					TouchoscguiPackage.eINSTANCE.getTouchOscEncoder());

			elements.put(TouchOscBatteryH_3015,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryH());

			elements.put(TouchOscBatteryV_3016,
					TouchoscguiPackage.eINSTANCE.getTouchOscBatteryV());

			elements.put(TouchOscMultiFaderH_3017,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiFaderH());

			elements.put(TouchOscMultiFaderV_3018,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiFaderV());

			elements.put(TouchOscMultiPush_3019,
					TouchoscguiPackage.eINSTANCE.getTouchOscMultiPush());
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
			KNOWN_ELEMENT_TYPES.add(TouchOscLayout_1000);
			KNOWN_ELEMENT_TYPES.add(TouchOscTabPage_2001);
			KNOWN_ELEMENT_TYPES.add(TouchOscFaderH_3001);
			KNOWN_ELEMENT_TYPES.add(TouchOscFaderV_3002);
			KNOWN_ELEMENT_TYPES.add(TouchOscLabelH_3003);
			KNOWN_ELEMENT_TYPES.add(TouchOscLabelV_3004);
			KNOWN_ELEMENT_TYPES.add(TouchOscLED_3005);
			KNOWN_ELEMENT_TYPES.add(TouchOscMultiToggle_3006);
			KNOWN_ELEMENT_TYPES.add(TouchOscPush_3007);
			KNOWN_ELEMENT_TYPES.add(TouchOscRotaryH_3008);
			KNOWN_ELEMENT_TYPES.add(TouchOscRotaryV_3009);
			KNOWN_ELEMENT_TYPES.add(TouchOscXYPad_3010);
			KNOWN_ELEMENT_TYPES.add(TouchOscToggle_3011);
			KNOWN_ELEMENT_TYPES.add(TouchOscTimeH_3012);
			KNOWN_ELEMENT_TYPES.add(TouchOscTimeV_3013);
			KNOWN_ELEMENT_TYPES.add(TouchOscEncoder_3014);
			KNOWN_ELEMENT_TYPES.add(TouchOscBatteryH_3015);
			KNOWN_ELEMENT_TYPES.add(TouchOscBatteryV_3016);
			KNOWN_ELEMENT_TYPES.add(TouchOscMultiFaderH_3017);
			KNOWN_ELEMENT_TYPES.add(TouchOscMultiFaderV_3018);
			KNOWN_ELEMENT_TYPES.add(TouchOscMultiPush_3019);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case TouchOscLayoutEditPart.VISUAL_ID:
			return TouchOscLayout_1000;
		case TouchOscTabPageEditPart.VISUAL_ID:
			return TouchOscTabPage_2001;
		case TouchOscFaderHEditPart.VISUAL_ID:
			return TouchOscFaderH_3001;
		case TouchOscFaderVEditPart.VISUAL_ID:
			return TouchOscFaderV_3002;
		case TouchOscLabelHEditPart.VISUAL_ID:
			return TouchOscLabelH_3003;
		case TouchOscLabelVEditPart.VISUAL_ID:
			return TouchOscLabelV_3004;
		case TouchOscLEDEditPart.VISUAL_ID:
			return TouchOscLED_3005;
		case TouchOscMultiToggleEditPart.VISUAL_ID:
			return TouchOscMultiToggle_3006;
		case TouchOscPushEditPart.VISUAL_ID:
			return TouchOscPush_3007;
		case TouchOscRotaryHEditPart.VISUAL_ID:
			return TouchOscRotaryH_3008;
		case TouchOscRotaryVEditPart.VISUAL_ID:
			return TouchOscRotaryV_3009;
		case TouchOscXYPadEditPart.VISUAL_ID:
			return TouchOscXYPad_3010;
		case TouchOscToggleEditPart.VISUAL_ID:
			return TouchOscToggle_3011;
		case TouchOscTimeHEditPart.VISUAL_ID:
			return TouchOscTimeH_3012;
		case TouchOscTimeVEditPart.VISUAL_ID:
			return TouchOscTimeV_3013;
		case TouchOscEncoderEditPart.VISUAL_ID:
			return TouchOscEncoder_3014;
		case TouchOscBatteryHEditPart.VISUAL_ID:
			return TouchOscBatteryH_3015;
		case TouchOscBatteryVEditPart.VISUAL_ID:
			return TouchOscBatteryV_3016;
		case TouchOscMultiFaderHEditPart.VISUAL_ID:
			return TouchOscMultiFaderH_3017;
		case TouchOscMultiFaderVEditPart.VISUAL_ID:
			return TouchOscMultiFaderV_3018;
		case TouchOscMultiPushEditPart.VISUAL_ID:
			return TouchOscMultiPush_3019;
		}
		return null;
	}

}
