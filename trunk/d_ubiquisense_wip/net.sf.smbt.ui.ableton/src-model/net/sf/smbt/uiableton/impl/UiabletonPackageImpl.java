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
import net.sf.smbt.uiableton.UIItem;
import net.sf.smbt.uiableton.UiabletonFactory;
import net.sf.smbt.uiableton.UiabletonPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UiabletonPackageImpl extends EPackageImpl implements UiabletonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAbletonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAbletonTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAbletonMasterTrackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAbletonClipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiAbletonSceneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType imageEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.uiableton.UiabletonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UiabletonPackageImpl() {
		super(eNS_URI, UiabletonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UiabletonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UiabletonPackage init() {
		if (isInited) return (UiabletonPackage)EPackage.Registry.INSTANCE.getEPackage(UiabletonPackage.eNS_URI);

		// Obtain or create and register package
		UiabletonPackageImpl theUiabletonPackage = (UiabletonPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UiabletonPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UiabletonPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theUiabletonPackage.createPackageContents();

		// Initialize created meta-data
		theUiabletonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUiabletonPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UiabletonPackage.eNS_URI, theUiabletonPackage);
		return theUiabletonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAbleton() {
		return uiAbletonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAbleton_Tracks() {
		return (EReference)uiAbletonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAbleton_MasterTrack() {
		return (EReference)uiAbletonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAbleton_Clips() {
		return (EReference)uiAbletonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAbleton_Scenes() {
		return (EReference)uiAbletonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAbletonTrack() {
		return uiAbletonTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIAbletonTrack_Clips() {
		return (EReference)uiAbletonTrackEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAbletonMasterTrack() {
		return uiAbletonMasterTrackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAbletonClip() {
		return uiAbletonClipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIAbletonScene() {
		return uiAbletonSceneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIAbletonScene_Id() {
		return (EAttribute)uiAbletonSceneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIItem() {
		return uiItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIItem_Text() {
		return (EAttribute)uiItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUIItem_Image() {
		return (EAttribute)uiItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getImage() {
		return imageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiabletonFactory getUiabletonFactory() {
		return (UiabletonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		uiAbletonEClass = createEClass(UI_ABLETON);
		createEReference(uiAbletonEClass, UI_ABLETON__TRACKS);
		createEReference(uiAbletonEClass, UI_ABLETON__MASTER_TRACK);
		createEReference(uiAbletonEClass, UI_ABLETON__CLIPS);
		createEReference(uiAbletonEClass, UI_ABLETON__SCENES);

		uiAbletonTrackEClass = createEClass(UI_ABLETON_TRACK);
		createEReference(uiAbletonTrackEClass, UI_ABLETON_TRACK__CLIPS);

		uiAbletonMasterTrackEClass = createEClass(UI_ABLETON_MASTER_TRACK);

		uiAbletonClipEClass = createEClass(UI_ABLETON_CLIP);

		uiAbletonSceneEClass = createEClass(UI_ABLETON_SCENE);
		createEAttribute(uiAbletonSceneEClass, UI_ABLETON_SCENE__ID);

		uiItemEClass = createEClass(UI_ITEM);
		createEAttribute(uiItemEClass, UI_ITEM__TEXT);
		createEAttribute(uiItemEClass, UI_ITEM__IMAGE);

		// Create data types
		imageEDataType = createEDataType(IMAGE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		uiAbletonTrackEClass.getESuperTypes().add(this.getUIItem());
		uiAbletonMasterTrackEClass.getESuperTypes().add(this.getUIAbletonTrack());
		uiAbletonClipEClass.getESuperTypes().add(this.getUIItem());
		uiAbletonSceneEClass.getESuperTypes().add(this.getUIItem());

		// Initialize classes and features; add operations and parameters
		initEClass(uiAbletonEClass, UIAbleton.class, "UIAbleton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIAbleton_Tracks(), this.getUIAbletonTrack(), null, "tracks", null, 0, -1, UIAbleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAbleton_MasterTrack(), this.getUIAbletonMasterTrack(), null, "masterTrack", null, 0, 1, UIAbleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAbleton_Clips(), this.getUIAbletonClip(), null, "clips", null, 0, -1, UIAbleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUIAbleton_Scenes(), this.getUIAbletonScene(), null, "scenes", null, 0, -1, UIAbleton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiAbletonTrackEClass, UIAbletonTrack.class, "UIAbletonTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIAbletonTrack_Clips(), this.getUIAbletonClip(), null, "clips", null, 0, -1, UIAbletonTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiAbletonMasterTrackEClass, UIAbletonMasterTrack.class, "UIAbletonMasterTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiAbletonClipEClass, UIAbletonClip.class, "UIAbletonClip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiAbletonSceneEClass, UIAbletonScene.class, "UIAbletonScene", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIAbletonScene_Id(), ecorePackage.getEInt(), "id", null, 0, 1, UIAbletonScene.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiItemEClass, UIItem.class, "UIItem", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUIItem_Text(), ecorePackage.getEString(), "text", null, 0, 1, UIItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUIItem_Image(), this.getImage(), "image", null, 0, 1, UIItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(imageEDataType, Image.class, "Image", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //UiabletonPackageImpl
