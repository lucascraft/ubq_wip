/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton.util;

import net.sf.smbt.uiableton.UIAbleton;
import net.sf.smbt.uiableton.UIAbletonClip;
import net.sf.smbt.uiableton.UIAbletonMasterTrack;
import net.sf.smbt.uiableton.UIAbletonScene;
import net.sf.smbt.uiableton.UIAbletonTrack;
import net.sf.smbt.uiableton.UIItem;
import net.sf.smbt.uiableton.UiabletonPackage;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.uiableton.UiabletonPackage
 * @generated
 */
public class UiabletonAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UiabletonPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UiabletonAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UiabletonPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UiabletonSwitch<Adapter> modelSwitch =
		new UiabletonSwitch<Adapter>() {
			@Override
			public Adapter caseUIAbleton(UIAbleton object) {
				return createUIAbletonAdapter();
			}
			@Override
			public Adapter caseUIAbletonTrack(UIAbletonTrack object) {
				return createUIAbletonTrackAdapter();
			}
			@Override
			public Adapter caseUIAbletonMasterTrack(UIAbletonMasterTrack object) {
				return createUIAbletonMasterTrackAdapter();
			}
			@Override
			public Adapter caseUIAbletonClip(UIAbletonClip object) {
				return createUIAbletonClipAdapter();
			}
			@Override
			public Adapter caseUIAbletonScene(UIAbletonScene object) {
				return createUIAbletonSceneAdapter();
			}
			@Override
			public Adapter caseUIItem(UIItem object) {
				return createUIItemAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.uiableton.UIAbleton <em>UI Ableton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.uiableton.UIAbleton
	 * @generated
	 */
	public Adapter createUIAbletonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.uiableton.UIAbletonTrack <em>UI Ableton Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.uiableton.UIAbletonTrack
	 * @generated
	 */
	public Adapter createUIAbletonTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.uiableton.UIAbletonMasterTrack <em>UI Ableton Master Track</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.uiableton.UIAbletonMasterTrack
	 * @generated
	 */
	public Adapter createUIAbletonMasterTrackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.uiableton.UIAbletonClip <em>UI Ableton Clip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.uiableton.UIAbletonClip
	 * @generated
	 */
	public Adapter createUIAbletonClipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.uiableton.UIAbletonScene <em>UI Ableton Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.uiableton.UIAbletonScene
	 * @generated
	 */
	public Adapter createUIAbletonSceneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.uiableton.UIItem <em>UI Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.uiableton.UIItem
	 * @generated
	 */
	public Adapter createUIItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UiabletonAdapterFactory
