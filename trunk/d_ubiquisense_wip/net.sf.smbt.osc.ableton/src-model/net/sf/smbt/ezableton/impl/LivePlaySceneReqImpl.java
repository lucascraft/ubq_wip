/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LivePlaySceneReq;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Play Scene Req</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LivePlaySceneReqImpl#getSceneID <em>Scene ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LivePlaySceneReqImpl extends AbletonLiveSndCmdImpl implements LivePlaySceneReq {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LivePlaySceneReqImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_PLAY_SCENE_REQ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSceneID() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_PLAY_SCENE_REQ__SCENE_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSceneID(int newSceneID) {
		eSet(EzabletonPackage.Literals.LIVE_PLAY_SCENE_REQ__SCENE_ID, newSceneID);
	}

} //LivePlaySceneReqImpl
