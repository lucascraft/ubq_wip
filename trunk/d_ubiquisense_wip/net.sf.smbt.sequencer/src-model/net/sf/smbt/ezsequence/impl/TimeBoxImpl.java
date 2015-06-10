/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.PortIn;
import net.sf.smbt.ezsequence.PortOut;
import net.sf.smbt.ezsequence.TimeBox;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.TimedLine;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getIn <em>In</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getOut <em>Out</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getDist <em>Dist</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getOnEnter <em>On Enter</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TimeBoxImpl#getOnExit <em>On Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeBoxImpl extends TimedObjImpl implements TimeBox {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TIME_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(EzsequencePackage.Literals.TIME_BOX__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(EzsequencePackage.Literals.TIME_BOX__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortIn getIn() {
		return (PortIn)eGet(EzsequencePackage.Literals.TIME_BOX__IN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(PortIn newIn) {
		eSet(EzsequencePackage.Literals.TIME_BOX__IN, newIn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortOut getOut() {
		return (PortOut)eGet(EzsequencePackage.Literals.TIME_BOX__OUT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOut(PortOut newOut) {
		eSet(EzsequencePackage.Literals.TIME_BOX__OUT, newOut);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDuration() {
		return (Long)eGet(EzsequencePackage.Literals.TIME_BOX__DURATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(long newDuration) {
		eSet(EzsequencePackage.Literals.TIME_BOX__DURATION, newDuration);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimedEvent> getEvents() {
		return (EList<TimedEvent>)eGet(EzsequencePackage.Literals.TIME_BOX__EVENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedLine getTimeline() {
		return (TimedLine)eGet(EzsequencePackage.Literals.TIME_BOX__TIMELINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeline(TimedLine newTimeline) {
		eSet(EzsequencePackage.Literals.TIME_BOX__TIMELINE, newTimeline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDist() {
		return (Integer)eGet(EzsequencePackage.Literals.TIME_BOX__DIST, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDist(int newDist) {
		eSet(EzsequencePackage.Literals.TIME_BOX__DIST, newDist);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTrigger getOnEnter() {
		return (EventTrigger)eGet(EzsequencePackage.Literals.TIME_BOX__ON_ENTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnEnter(EventTrigger newOnEnter) {
		eSet(EzsequencePackage.Literals.TIME_BOX__ON_ENTER, newOnEnter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventTrigger getOnExit() {
		return (EventTrigger)eGet(EzsequencePackage.Literals.TIME_BOX__ON_EXIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnExit(EventTrigger newOnExit) {
		eSet(EzsequencePackage.Literals.TIME_BOX__ON_EXIT, newOnExit);
	}

} //TimeBoxImpl
