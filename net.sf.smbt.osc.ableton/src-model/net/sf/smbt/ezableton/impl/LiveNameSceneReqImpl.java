/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveNameSceneReq;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Name Scene Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameSceneReqImpl#getSceneID <em>Scene ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveNameSceneReqImpl#getSceneName <em>Scene Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveNameSceneReqImpl extends AbletonLiveSndCmdImpl implements LiveNameSceneReq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveNameSceneReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_NAME_SCENE_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSceneID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_NAME_SCENE_REQ__SCENE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneID(int newSceneID) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_SCENE_REQ__SCENE_ID, newSceneID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSceneName() {
		return (String)eGet(EzabletonPackage.Literals.LIVE_NAME_SCENE_REQ__SCENE_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneName(String newSceneName) {
		eSet(EzabletonPackage.Literals.LIVE_NAME_SCENE_REQ__SCENE_NAME, newSceneName);
	}

} //LiveNameSceneReqImpl
