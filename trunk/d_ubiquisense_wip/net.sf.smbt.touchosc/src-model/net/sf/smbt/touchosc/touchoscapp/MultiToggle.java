/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Toggle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#isLocalFeedbackOff <em>Local Feedback Off</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiToggle()
 * @model
 * @generated
 */
public interface MultiToggle extends Widget {

	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiToggle_Values()
	 * @model
	 * @generated
	 */
	EList<Integer> getValues();

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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiToggle_Rows()
	 * @model
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getRows <em>Rows</em>}' attribute.
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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiToggle_Columns()
	 * @model
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getMultiToggle_LocalFeedbackOff()
	 * @model
	 * @generated
	 */
	boolean isLocalFeedbackOff();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.MultiToggle#isLocalFeedbackOff <em>Local Feedback Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Feedback Off</em>' attribute.
	 * @see #isLocalFeedbackOff()
	 * @generated
	 */
	void setLocalFeedbackOff(boolean value);
} // MultiToggle
