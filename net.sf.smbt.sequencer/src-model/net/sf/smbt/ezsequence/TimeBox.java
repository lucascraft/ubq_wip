/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getIn <em>In</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getOut <em>Out</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getEvents <em>Events</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getTimeline <em>Timeline</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getDist <em>Dist</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getOnEnter <em>On Enter</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBox#getOnExit <em>On Exit</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox()
 * @model
 * @generated
 */
public interface TimeBox extends TimedObj {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * The default value is <code>"T"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_ID()
	 * @model default="T"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>In</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' containment reference.
	 * @see #setIn(PortIn)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_In()
	 * @model containment="true"
	 * @generated
	 */
	PortIn getIn();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getIn <em>In</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' containment reference.
	 * @see #getIn()
	 * @generated
	 */
	void setIn(PortIn value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' containment reference.
	 * @see #setOut(PortOut)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_Out()
	 * @model containment="true"
	 * @generated
	 */
	PortOut getOut();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getOut <em>Out</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' containment reference.
	 * @see #getOut()
	 * @generated
	 */
	void setOut(PortOut value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(long)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_Duration()
	 * @model
	 * @generated
	 */
	long getDuration();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(long value);

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimedEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedEvent> getEvents();

	/**
	 * Returns the value of the '<em><b>Timeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeline</em>' reference.
	 * @see #setTimeline(TimedLine)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_Timeline()
	 * @model
	 * @generated
	 */
	TimedLine getTimeline();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getTimeline <em>Timeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeline</em>' reference.
	 * @see #getTimeline()
	 * @generated
	 */
	void setTimeline(TimedLine value);

	/**
	 * Returns the value of the '<em><b>Dist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dist</em>' attribute.
	 * @see #setDist(int)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_Dist()
	 * @model
	 * @generated
	 */
	int getDist();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getDist <em>Dist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dist</em>' attribute.
	 * @see #getDist()
	 * @generated
	 */
	void setDist(int value);

	/**
	 * Returns the value of the '<em><b>On Enter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Enter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Enter</em>' reference.
	 * @see #setOnEnter(EventTrigger)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_OnEnter()
	 * @model
	 * @generated
	 */
	EventTrigger getOnEnter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getOnEnter <em>On Enter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Enter</em>' reference.
	 * @see #getOnEnter()
	 * @generated
	 */
	void setOnEnter(EventTrigger value);

	/**
	 * Returns the value of the '<em><b>On Exit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>On Exit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On Exit</em>' reference.
	 * @see #setOnExit(EventTrigger)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBox_OnExit()
	 * @model
	 * @generated
	 */
	EventTrigger getOnExit();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBox#getOnExit <em>On Exit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Exit</em>' reference.
	 * @see #getOnExit()
	 * @generated
	 */
	void setOnExit(EventTrigger value);

} // TimeBox
