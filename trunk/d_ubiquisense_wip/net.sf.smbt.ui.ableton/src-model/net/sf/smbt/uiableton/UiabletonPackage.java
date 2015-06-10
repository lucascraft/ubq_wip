/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.uiableton.UiabletonFactory
 * @model kind="package"
 * @generated
 */
public interface UiabletonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "uiableton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://uiableton/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uiableton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiabletonPackage eINSTANCE = net.sf.smbt.uiableton.impl.UiabletonPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.uiableton.impl.UIAbletonImpl <em>UI Ableton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.uiableton.impl.UIAbletonImpl
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbleton()
	 * @generated
	 */
	int UI_ABLETON = 0;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON__TRACKS = 0;

	/**
	 * The feature id for the '<em><b>Master Track</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON__MASTER_TRACK = 1;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON__CLIPS = 2;

	/**
	 * The feature id for the '<em><b>Scenes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON__SCENES = 3;

	/**
	 * The number of structural features of the '<em>UI Ableton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.uiableton.UIItem <em>UI Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.uiableton.UIItem
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIItem()
	 * @generated
	 */
	int UI_ITEM = 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ITEM__TEXT = 0;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ITEM__IMAGE = 1;

	/**
	 * The number of structural features of the '<em>UI Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.uiableton.impl.UIAbletonTrackImpl <em>UI Ableton Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.uiableton.impl.UIAbletonTrackImpl
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonTrack()
	 * @generated
	 */
	int UI_ABLETON_TRACK = 1;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_TRACK__TEXT = UI_ITEM__TEXT;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_TRACK__IMAGE = UI_ITEM__IMAGE;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_TRACK__CLIPS = UI_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Ableton Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_TRACK_FEATURE_COUNT = UI_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.uiableton.impl.UIAbletonMasterTrackImpl <em>UI Ableton Master Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.uiableton.impl.UIAbletonMasterTrackImpl
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonMasterTrack()
	 * @generated
	 */
	int UI_ABLETON_MASTER_TRACK = 2;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_MASTER_TRACK__TEXT = UI_ABLETON_TRACK__TEXT;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_MASTER_TRACK__IMAGE = UI_ABLETON_TRACK__IMAGE;

	/**
	 * The feature id for the '<em><b>Clips</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_MASTER_TRACK__CLIPS = UI_ABLETON_TRACK__CLIPS;

	/**
	 * The number of structural features of the '<em>UI Ableton Master Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_MASTER_TRACK_FEATURE_COUNT = UI_ABLETON_TRACK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.uiableton.impl.UIAbletonClipImpl <em>UI Ableton Clip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.uiableton.impl.UIAbletonClipImpl
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonClip()
	 * @generated
	 */
	int UI_ABLETON_CLIP = 3;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_CLIP__TEXT = UI_ITEM__TEXT;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_CLIP__IMAGE = UI_ITEM__IMAGE;

	/**
	 * The number of structural features of the '<em>UI Ableton Clip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_CLIP_FEATURE_COUNT = UI_ITEM_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.uiableton.impl.UIAbletonSceneImpl <em>UI Ableton Scene</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.uiableton.impl.UIAbletonSceneImpl
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonScene()
	 * @generated
	 */
	int UI_ABLETON_SCENE = 4;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_SCENE__TEXT = UI_ITEM__TEXT;

	/**
	 * The feature id for the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_SCENE__IMAGE = UI_ITEM__IMAGE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_SCENE__ID = UI_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>UI Ableton Scene</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UI_ABLETON_SCENE_FEATURE_COUNT = UI_ITEM_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '<em>Image</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.swt.graphics.Image
	 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 6;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.uiableton.UIAbleton <em>UI Ableton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ableton</em>'.
	 * @see net.sf.smbt.uiableton.UIAbleton
	 * @generated
	 */
	EClass getUIAbleton();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.uiableton.UIAbleton#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see net.sf.smbt.uiableton.UIAbleton#getTracks()
	 * @see #getUIAbleton()
	 * @generated
	 */
	EReference getUIAbleton_Tracks();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.uiableton.UIAbleton#getMasterTrack <em>Master Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Master Track</em>'.
	 * @see net.sf.smbt.uiableton.UIAbleton#getMasterTrack()
	 * @see #getUIAbleton()
	 * @generated
	 */
	EReference getUIAbleton_MasterTrack();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.uiableton.UIAbleton#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.uiableton.UIAbleton#getClips()
	 * @see #getUIAbleton()
	 * @generated
	 */
	EReference getUIAbleton_Clips();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.uiableton.UIAbleton#getScenes <em>Scenes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scenes</em>'.
	 * @see net.sf.smbt.uiableton.UIAbleton#getScenes()
	 * @see #getUIAbleton()
	 * @generated
	 */
	EReference getUIAbleton_Scenes();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.uiableton.UIAbletonTrack <em>UI Ableton Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ableton Track</em>'.
	 * @see net.sf.smbt.uiableton.UIAbletonTrack
	 * @generated
	 */
	EClass getUIAbletonTrack();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.uiableton.UIAbletonTrack#getClips <em>Clips</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Clips</em>'.
	 * @see net.sf.smbt.uiableton.UIAbletonTrack#getClips()
	 * @see #getUIAbletonTrack()
	 * @generated
	 */
	EReference getUIAbletonTrack_Clips();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.uiableton.UIAbletonMasterTrack <em>UI Ableton Master Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ableton Master Track</em>'.
	 * @see net.sf.smbt.uiableton.UIAbletonMasterTrack
	 * @generated
	 */
	EClass getUIAbletonMasterTrack();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.uiableton.UIAbletonClip <em>UI Ableton Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ableton Clip</em>'.
	 * @see net.sf.smbt.uiableton.UIAbletonClip
	 * @generated
	 */
	EClass getUIAbletonClip();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.uiableton.UIAbletonScene <em>UI Ableton Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Ableton Scene</em>'.
	 * @see net.sf.smbt.uiableton.UIAbletonScene
	 * @generated
	 */
	EClass getUIAbletonScene();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.uiableton.UIAbletonScene#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see net.sf.smbt.uiableton.UIAbletonScene#getId()
	 * @see #getUIAbletonScene()
	 * @generated
	 */
	EAttribute getUIAbletonScene_Id();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.uiableton.UIItem <em>UI Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UI Item</em>'.
	 * @see net.sf.smbt.uiableton.UIItem
	 * @generated
	 */
	EClass getUIItem();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.uiableton.UIItem#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.uiableton.UIItem#getText()
	 * @see #getUIItem()
	 * @generated
	 */
	EAttribute getUIItem_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.uiableton.UIItem#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image</em>'.
	 * @see net.sf.smbt.uiableton.UIItem#getImage()
	 * @see #getUIItem()
	 * @generated
	 */
	EAttribute getUIItem_Image();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.swt.graphics.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Image</em>'.
	 * @see org.eclipse.swt.graphics.Image
	 * @model instanceClass="org.eclipse.swt.graphics.Image"
	 * @generated
	 */
	EDataType getImage();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiabletonFactory getUiabletonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.uiableton.impl.UIAbletonImpl <em>UI Ableton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.uiableton.impl.UIAbletonImpl
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbleton()
		 * @generated
		 */
		EClass UI_ABLETON = eINSTANCE.getUIAbleton();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ABLETON__TRACKS = eINSTANCE.getUIAbleton_Tracks();

		/**
		 * The meta object literal for the '<em><b>Master Track</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ABLETON__MASTER_TRACK = eINSTANCE.getUIAbleton_MasterTrack();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ABLETON__CLIPS = eINSTANCE.getUIAbleton_Clips();

		/**
		 * The meta object literal for the '<em><b>Scenes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ABLETON__SCENES = eINSTANCE.getUIAbleton_Scenes();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.uiableton.impl.UIAbletonTrackImpl <em>UI Ableton Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.uiableton.impl.UIAbletonTrackImpl
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonTrack()
		 * @generated
		 */
		EClass UI_ABLETON_TRACK = eINSTANCE.getUIAbletonTrack();

		/**
		 * The meta object literal for the '<em><b>Clips</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UI_ABLETON_TRACK__CLIPS = eINSTANCE.getUIAbletonTrack_Clips();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.uiableton.impl.UIAbletonMasterTrackImpl <em>UI Ableton Master Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.uiableton.impl.UIAbletonMasterTrackImpl
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonMasterTrack()
		 * @generated
		 */
		EClass UI_ABLETON_MASTER_TRACK = eINSTANCE.getUIAbletonMasterTrack();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.uiableton.impl.UIAbletonClipImpl <em>UI Ableton Clip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.uiableton.impl.UIAbletonClipImpl
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonClip()
		 * @generated
		 */
		EClass UI_ABLETON_CLIP = eINSTANCE.getUIAbletonClip();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.uiableton.impl.UIAbletonSceneImpl <em>UI Ableton Scene</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.uiableton.impl.UIAbletonSceneImpl
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIAbletonScene()
		 * @generated
		 */
		EClass UI_ABLETON_SCENE = eINSTANCE.getUIAbletonScene();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ABLETON_SCENE__ID = eINSTANCE.getUIAbletonScene_Id();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.uiableton.UIItem <em>UI Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.uiableton.UIItem
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getUIItem()
		 * @generated
		 */
		EClass UI_ITEM = eINSTANCE.getUIItem();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ITEM__TEXT = eINSTANCE.getUIItem_Text();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UI_ITEM__IMAGE = eINSTANCE.getUIItem_Image();

		/**
		 * The meta object literal for the '<em>Image</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.swt.graphics.Image
		 * @see net.sf.smbt.uiableton.impl.UiabletonPackageImpl#getImage()
		 * @generated
		 */
		EDataType IMAGE = eINSTANCE.getImage();

	}

} //UiabletonPackage
