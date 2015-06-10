/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.SEQ_TYPE;
import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.TimeNode;
import net.sf.smbt.ezsequence.TimeSlot;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Bar</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getTimecursor <em>Timecursor</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getSeqKind <em>Seq Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBarImpl#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeBarImpl extends UIElemImpl implements TimeBar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIME_BAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeCursor getTimecursor() {
		return (TimeCursor)eGet(EzsequencePackage.Literals.TIME_BAR__TIMECURSOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimecursor(TimeCursor newTimecursor) {
		eSet(EzsequencePackage.Literals.TIME_BAR__TIMECURSOR, newTimecursor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimeSlot> getSlots() {
		return (EList<TimeSlot>)eGet(EzsequencePackage.Literals.TIME_BAR__SLOTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(EzsequencePackage.Literals.TIME_BAR__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(EzsequencePackage.Literals.TIME_BAR__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimeNode> getNodes() {
		return (EList<TimeNode>)eGet(EzsequencePackage.Literals.TIME_BAR__NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScale() {
		return (Float)eGet(EzsequencePackage.Literals.TIME_BAR__SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(float newScale) {
		eSet(EzsequencePackage.Literals.TIME_BAR__SCALE, newScale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSpeed() {
		return (Float)eGet(EzsequencePackage.Literals.TIME_BAR__SPEED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(float newSpeed) {
		eSet(EzsequencePackage.Literals.TIME_BAR__SPEED, newSpeed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SEQ_TYPE getSeqKind() {
		return (SEQ_TYPE)eGet(EzsequencePackage.Literals.TIME_BAR__SEQ_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqKind(SEQ_TYPE newSeqKind) {
		eSet(EzsequencePackage.Literals.TIME_BAR__SEQ_KIND, newSeqKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDirection() {
		return (Integer)eGet(EzsequencePackage.Literals.TIME_BAR__DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(int newDirection) {
		eSet(EzsequencePackage.Literals.TIME_BAR__DIRECTION, newDirection);
	}

} //TimeBarImpl
