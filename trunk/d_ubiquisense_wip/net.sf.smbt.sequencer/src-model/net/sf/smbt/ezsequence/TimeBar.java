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
 * A representation of the model object '<em><b>Time Bar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getTimecursor <em>Timecursor</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getSlots <em>Slots</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getNodes <em>Nodes</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getScale <em>Scale</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getSeqKind <em>Seq Kind</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeBar#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar()
 * @model
 * @generated
 */
public interface TimeBar extends UIElem {
	/**
	 * Returns the value of the '<em><b>Timecursor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timecursor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timecursor</em>' containment reference.
	 * @see #setTimecursor(TimeCursor)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Timecursor()
	 * @model containment="true"
	 * @generated
	 */
	TimeCursor getTimecursor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBar#getTimecursor <em>Timecursor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timecursor</em>' containment reference.
	 * @see #getTimecursor()
	 * @generated
	 */
	void setTimecursor(TimeCursor value);

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimeSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Slots()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeSlot> getSlots();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBar#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimeNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeNode> getNodes();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute.
	 * @see #setScale(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Scale()
	 * @model
	 * @generated
	 */
	float getScale();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBar#getScale <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale</em>' attribute.
	 * @see #getScale()
	 * @generated
	 */
	void setScale(float value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see #setSpeed(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Speed()
	 * @model
	 * @generated
	 */
	float getSpeed();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBar#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(float value);

	/**
	 * Returns the value of the '<em><b>Seq Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezsequence.SEQ_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Kind</em>' attribute.
	 * @see net.sf.smbt.ezsequence.SEQ_TYPE
	 * @see #setSeqKind(SEQ_TYPE)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_SeqKind()
	 * @model
	 * @generated
	 */
	SEQ_TYPE getSeqKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBar#getSeqKind <em>Seq Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Kind</em>' attribute.
	 * @see net.sf.smbt.ezsequence.SEQ_TYPE
	 * @see #getSeqKind()
	 * @generated
	 */
	void setSeqKind(SEQ_TYPE value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(int)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeBar_Direction()
	 * @model
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeBar#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(int value);

} // TimeBar
