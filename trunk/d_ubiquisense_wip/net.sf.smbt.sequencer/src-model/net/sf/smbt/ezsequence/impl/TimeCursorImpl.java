/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.TimeCursor;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Cursor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeCursorImpl#getCompletion <em>Completion</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeCursorImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeCursorImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeCursorImpl#getAccel <em>Accel</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeCursorImpl extends TimedObjImpl implements TimeCursor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeCursorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIME_CURSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCompletion() {
		return (Float)eGet(EzsequencePackage.Literals.TIME_CURSOR__COMPLETION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletion(float newCompletion) {
		eSet(EzsequencePackage.Literals.TIME_CURSOR__COMPLETION, newCompletion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLength() {
		return (Integer)eGet(EzsequencePackage.Literals.TIME_CURSOR__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(int newLength) {
		eSet(EzsequencePackage.Literals.TIME_CURSOR__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirection() {
		return (Integer)eGet(EzsequencePackage.Literals.TIME_CURSOR__DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(int newDirection) {
		eSet(EzsequencePackage.Literals.TIME_CURSOR__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAccel() {
		return (Float)eGet(EzsequencePackage.Literals.TIME_CURSOR__ACCEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccel(float newAccel) {
		eSet(EzsequencePackage.Literals.TIME_CURSOR__ACCEL, newAccel);
	}

} //TimeCursorImpl
