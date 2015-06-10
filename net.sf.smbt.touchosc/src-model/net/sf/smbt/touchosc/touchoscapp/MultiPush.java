/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Push</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#isLocalFeedbackOff <em>Local Feedback Off</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiPush()
 * @model
 * @generated
 */
public interface MultiPush extends Widget {

	/**
	 * Returns the value of the '<em><b>Local Feedback Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Feedback Off</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Feedback Off</em>' attribute.
	 * @see #setLocalFeedbackOff(boolean)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiPush_LocalFeedbackOff()
	 * @model
	 * @generated
	 */
	boolean isLocalFeedbackOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#isLocalFeedbackOff <em>Local Feedback Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Feedback Off</em>' attribute.
	 * @see #isLocalFeedbackOff()
	 * @generated
	 */
	void setLocalFeedbackOff(boolean value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiPush_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiPush_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiPush#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);
} // MultiPush
