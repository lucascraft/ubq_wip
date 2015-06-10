/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Get3 DAccel Values Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getXAccel <em>XAccel</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getYAccel <em>YAccel</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getZAccel <em>ZAccel</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isCButtonDown <em>CButton Down</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isZButtonDown <em>ZButton Down</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyX <em>Joy X</em>}</li>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyY <em>Joy Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd()
 * @model
 * @generated
 */
public interface Get3DAccelValuesCmd extends NunchukCmd {

	/**
	 * Returns the value of the '<em><b>XAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XAccel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XAccel</em>' attribute.
	 * @see #setXAccel(int)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_XAccel()
	 * @model
	 * @generated
	 */
	int getXAccel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getXAccel <em>XAccel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAccel</em>' attribute.
	 * @see #getXAccel()
	 * @generated
	 */
	void setXAccel(int value);

	/**
	 * Returns the value of the '<em><b>YAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YAccel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YAccel</em>' attribute.
	 * @see #setYAccel(int)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_YAccel()
	 * @model
	 * @generated
	 */
	int getYAccel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getYAccel <em>YAccel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAccel</em>' attribute.
	 * @see #getYAccel()
	 * @generated
	 */
	void setYAccel(int value);

	/**
	 * Returns the value of the '<em><b>ZAccel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZAccel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZAccel</em>' attribute.
	 * @see #setZAccel(int)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_ZAccel()
	 * @model
	 * @generated
	 */
	int getZAccel();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getZAccel <em>ZAccel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZAccel</em>' attribute.
	 * @see #getZAccel()
	 * @generated
	 */
	void setZAccel(int value);

	/**
	 * Returns the value of the '<em><b>CButton Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CButton Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CButton Down</em>' attribute.
	 * @see #setCButtonDown(boolean)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_CButtonDown()
	 * @model
	 * @generated
	 */
	boolean isCButtonDown();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isCButtonDown <em>CButton Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CButton Down</em>' attribute.
	 * @see #isCButtonDown()
	 * @generated
	 */
	void setCButtonDown(boolean value);

	/**
	 * Returns the value of the '<em><b>ZButton Down</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ZButton Down</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZButton Down</em>' attribute.
	 * @see #setZButtonDown(boolean)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_ZButtonDown()
	 * @model
	 * @generated
	 */
	boolean isZButtonDown();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#isZButtonDown <em>ZButton Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZButton Down</em>' attribute.
	 * @see #isZButtonDown()
	 * @generated
	 */
	void setZButtonDown(boolean value);

	/**
	 * Returns the value of the '<em><b>Joy X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joy X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joy X</em>' attribute.
	 * @see #setJoyX(int)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_JoyX()
	 * @model
	 * @generated
	 */
	int getJoyX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyX <em>Joy X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joy X</em>' attribute.
	 * @see #getJoyX()
	 * @generated
	 */
	void setJoyX(int value);

	/**
	 * Returns the value of the '<em><b>Joy Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Joy Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Joy Y</em>' attribute.
	 * @see #setJoyY(int)
	 * @see net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage#getGet3DAccelValuesCmd_JoyY()
	 * @model
	 * @generated
	 */
	int getJoyY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.i2c.wii.nunchuck.commands.Get3DAccelValuesCmd#getJoyY <em>Joy Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Joy Y</em>' attribute.
	 * @see #getJoyY()
	 * @generated
	 */
	void setJoyY(int value);
} // Get3DAccelValuesCmd
