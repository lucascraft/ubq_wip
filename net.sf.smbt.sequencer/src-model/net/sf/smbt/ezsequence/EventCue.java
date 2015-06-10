/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Cue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.EventCue#getJump <em>Jump</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventCue#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventCue()
 * @model
 * @generated
 */
public interface EventCue extends EventElem {

	/**
	 * Returns the value of the '<em><b>Jump</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jump</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jump</em>' attribute.
	 * @see #setJump(long)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventCue_Jump()
	 * @model
	 * @generated
	 */
	long getJump();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventCue#getJump <em>Jump</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jump</em>' attribute.
	 * @see #getJump()
	 * @generated
	 */
	void setJump(long value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezsequence.CUE_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezsequence.CUE_TYPE
	 * @see #setKind(CUE_TYPE)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventCue_Kind()
	 * @model
	 * @generated
	 */
	CUE_TYPE getKind();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventCue#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see net.sf.smbt.ezsequence.CUE_TYPE
	 * @see #getKind()
	 * @generated
	 */
	void setKind(CUE_TYPE value);
} // EventCue