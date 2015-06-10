/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Cursor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.TimeCursor#getCompletion <em>Completion</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeCursor#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeCursor#getDirection <em>Direction</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.TimeCursor#getAccel <em>Accel</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeCursor()
 * @model
 * @generated
 */
public interface TimeCursor extends TimedObj {

	/**
	 * Returns the value of the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion</em>' attribute.
	 * @see #setCompletion(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeCursor_Completion()
	 * @model
	 * @generated
	 */
	float getCompletion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeCursor#getCompletion <em>Completion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion</em>' attribute.
	 * @see #getCompletion()
	 * @generated
	 */
	void setCompletion(float value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeCursor_Length()
	 * @model
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeCursor#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

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
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeCursor_Direction()
	 * @model
	 * @generated
	 */
	int getDirection();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeCursor#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(int value);

	/**
	 * Returns the value of the '<em><b>Accel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accel</em>' attribute.
	 * @see #setAccel(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTimeCursor_Accel()
	 * @model
	 * @generated
	 */
	float getAccel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.TimeCursor#getAccel <em>Accel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accel</em>' attribute.
	 * @see #getAccel()
	 * @generated
	 */
	void setAccel(float value);
} // TimeCursor
