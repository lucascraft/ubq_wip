/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveScene;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl#getSceneID <em>Scene ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl#getSceneName <em>Scene Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveSceneImpl#getLastSeen <em>Last Seen</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveSceneImpl extends MinimalEObjectImpl.Container implements LiveScene {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveSceneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.LIVE_SCENE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSceneID() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_SCENE__SCENE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneID(int newSceneID) {
		eSet(EzabletonctrlPackage.Literals.LIVE_SCENE__SCENE_ID, newSceneID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_SCENE__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		eSet(EzabletonctrlPackage.Literals.LIVE_SCENE__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSceneName() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_SCENE__SCENE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneName(String newSceneName) {
		eSet(EzabletonctrlPackage.Literals.LIVE_SCENE__SCENE_NAME, newSceneName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastSeen() {
		return (Long)eGet(EzabletonctrlPackage.Literals.LIVE_SCENE__LAST_SEEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSeen(long newLastSeen) {
		eSet(EzabletonctrlPackage.Literals.LIVE_SCENE__LAST_SEEN, newLastSeen);
	}

} //LiveSceneImpl
