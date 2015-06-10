/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezableton.impl;

import net.sf.smbt.ezableton.EzabletonPackage;
import net.sf.smbt.ezableton.LiveScenesQ;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Scenes Q</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezableton.impl.LiveScenesQImpl#getNumScenes <em>Num Scenes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveScenesQImpl extends AbletonLiveSndCmdImpl implements LiveScenesQ {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveScenesQImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonPackage.Literals.LIVE_SCENES_Q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumScenes() {
		return (Integer)eGet(EzabletonPackage.Literals.LIVE_SCENES_Q__NUM_SCENES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumScenes(int newNumScenes) {
		eSet(EzabletonPackage.Literals.LIVE_SCENES_Q__NUM_SCENES, newNumScenes);
	}

} //LiveScenesQImpl
