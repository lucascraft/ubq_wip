/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveSceneReq;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Scene Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveSceneReqImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveSceneReqImpl#getSceneID <em>Scene ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveSceneReqImpl extends AbletonLiveSndCmdImpl implements LiveSceneReq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveSceneReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_SCENE_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return (String)eGet(EzabletonPackage.Literals.LIVE_SCENE_REQ__MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		eSet(EzabletonPackage.Literals.LIVE_SCENE_REQ__MODE, newMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSceneID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_SCENE_REQ__SCENE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneID(int newSceneID) {
		eSet(EzabletonPackage.Literals.LIVE_SCENE_REQ__SCENE_ID, newSceneID);
	}

} //LiveSceneReqImpl
