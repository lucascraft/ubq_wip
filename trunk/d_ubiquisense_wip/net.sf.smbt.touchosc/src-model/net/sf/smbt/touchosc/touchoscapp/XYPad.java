/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XY Pad</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.XYPad#getXVal <em>XVal</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.XYPad#getYVal <em>YVal</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getXYPad()
 * @model
 * @generated
 */
public interface XYPad extends Widget {

	/**
	 * Returns the value of the '<em><b>XVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XVal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XVal</em>' attribute.
	 * @see #setXVal(float)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getXYPad_XVal()
	 * @model
	 * @generated
	 */
	float getXVal();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.XYPad#getXVal <em>XVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XVal</em>' attribute.
	 * @see #getXVal()
	 * @generated
	 */
	void setXVal(float value);

	/**
	 * Returns the value of the '<em><b>YVal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YVal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YVal</em>' attribute.
	 * @see #setYVal(float)
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#getXYPad_YVal()
	 * @model
	 * @generated
	 */
	float getYVal();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchoscapp.XYPad#getYVal <em>YVal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YVal</em>' attribute.
	 * @see #getYVal()
	 * @generated
	 */
	void setYVal(float value);
} // XYPad
