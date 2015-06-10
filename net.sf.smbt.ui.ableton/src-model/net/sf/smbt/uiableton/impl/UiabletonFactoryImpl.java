/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton.impl;

import net.sf.smbt.uiableton.UIAbleton;
import net.sf.smbt.uiableton.UIAbletonClip;
import net.sf.smbt.uiableton.UIAbletonMasterTrack;
import net.sf.smbt.uiableton.UIAbletonScene;
import net.sf.smbt.uiableton.UIAbletonTrack;
import net.sf.smbt.uiableton.UiabletonFactory;
import net.sf.smbt.uiableton.UiabletonPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiabletonFactoryImpl extends EFactoryImpl implements UiabletonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UiabletonFactory init() {
		try {
			UiabletonFactory theUiabletonFactory = (UiabletonFactory)EPackage.Registry.INSTANCE.getEFactory("http://uiableton/1.0"); 
			if (theUiabletonFactory != null) {
				return theUiabletonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UiabletonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiabletonFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UiabletonPackage.UI_ABLETON: return createUIAbleton();
			case UiabletonPackage.UI_ABLETON_TRACK: return createUIAbletonTrack();
			case UiabletonPackage.UI_ABLETON_MASTER_TRACK: return createUIAbletonMasterTrack();
			case UiabletonPackage.UI_ABLETON_CLIP: return createUIAbletonClip();
			case UiabletonPackage.UI_ABLETON_SCENE: return createUIAbletonScene();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case UiabletonPackage.IMAGE:
				return createImageFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case UiabletonPackage.IMAGE:
				return convertImageToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAbleton createUIAbleton() {
		UIAbletonImpl uiAbleton = new UIAbletonImpl();
		return uiAbleton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAbletonTrack createUIAbletonTrack() {
		UIAbletonTrackImpl uiAbletonTrack = new UIAbletonTrackImpl();
		return uiAbletonTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAbletonMasterTrack createUIAbletonMasterTrack() {
		UIAbletonMasterTrackImpl uiAbletonMasterTrack = new UIAbletonMasterTrackImpl();
		return uiAbletonMasterTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAbletonClip createUIAbletonClip() {
		UIAbletonClipImpl uiAbletonClip = new UIAbletonClipImpl();
		return uiAbletonClip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAbletonScene createUIAbletonScene() {
		UIAbletonSceneImpl uiAbletonScene = new UIAbletonSceneImpl();
		return uiAbletonScene;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image createImageFromString(EDataType eDataType, String initialValue) {
		return (Image)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertImageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiabletonPackage getUiabletonPackage() {
		return (UiabletonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UiabletonPackage getPackage() {
		return UiabletonPackage.eINSTANCE;
	}

} //UiabletonFactoryImpl
