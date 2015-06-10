/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.TimedLine;
import net.sf.xqz.model.temporal.EXECUTION_STATUS;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getStart <em>Start</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getFactor <em>Factor</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimedLineImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimedLineImpl extends MinimalEObjectImpl.Container implements TimedLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIMED_LINE;
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
	public long getStart() {
		return (Long)eGet(EzsequencePackage.Literals.TIMED_LINE__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(long newStart) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getFinish() {
		return (Long)eGet(EzsequencePackage.Literals.TIMED_LINE__FINISH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(long newFinish) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__FINISH, newFinish);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return (Long)eGet(EzsequencePackage.Literals.TIMED_LINE__TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__TIME, newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EzsequencePackage.Literals.TIMED_LINE__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EXECUTION_STATUS getStatus() {
		return (EXECUTION_STATUS)eGet(EzsequencePackage.Literals.TIMED_LINE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(EXECUTION_STATUS newStatus) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFactor() {
		return (Float)eGet(EzsequencePackage.Literals.TIMED_LINE__FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFactor(float newFactor) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__FACTOR, newFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return (Float)eGet(EzsequencePackage.Literals.TIMED_LINE__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		eSet(EzsequencePackage.Literals.TIMED_LINE__SPEED, newSpeed);
	}

} //TimedLineImpl
