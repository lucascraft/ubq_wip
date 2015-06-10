/**
 */
package net.sf.smbt.ezmppt;

import java.util.Date;

import net.sf.xqz.model.cmd.Cmd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mppt Cmd</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmppt.MpptCmd#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.MpptCmd#getCommand <em>Command</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.MpptCmd#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.MpptCmd#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.MpptCmd#getCrc1 <em>Crc1</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.MpptCmd#getCrc2 <em>Crc2</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd()
 * @model
 * @generated
 */
public interface MpptCmd extends Cmd {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device</em>' attribute.
	 * @see #setDevice(byte)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd_Device()
	 * @model
	 * @generated
	 */
	byte getDevice();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.MpptCmd#getDevice <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' attribute.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(byte value);

	/**
	 * Returns the value of the '<em><b>Command</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' attribute.
	 * @see #setCommand(byte)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd_Command()
	 * @model
	 * @generated
	 */
	byte getCommand();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.MpptCmd#getCommand <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' attribute.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(byte value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(byte)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd_Length()
	 * @model
	 * @generated
	 */
	byte getLength();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.MpptCmd#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(byte value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(byte[])
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd_Data()
	 * @model
	 * @generated
	 */
	byte[] getData();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.MpptCmd#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(byte[] value);

	/**
	 * Returns the value of the '<em><b>Crc1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crc1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crc1</em>' attribute.
	 * @see #setCrc1(byte)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd_Crc1()
	 * @model
	 * @generated
	 */
	byte getCrc1();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.MpptCmd#getCrc1 <em>Crc1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crc1</em>' attribute.
	 * @see #getCrc1()
	 * @generated
	 */
	void setCrc1(byte value);

	/**
	 * Returns the value of the '<em><b>Crc2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crc2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crc2</em>' attribute.
	 * @see #setCrc2(byte)
	 * @see net.sf.smbt.ezmppt.EzmpptPackage#getMpptCmd_Crc2()
	 * @model
	 * @generated
	 */
	byte getCrc2();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezmppt.MpptCmd#getCrc2 <em>Crc2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crc2</em>' attribute.
	 * @see #getCrc2()
	 * @generated
	 */
	void setCrc2(byte value);

} // MpptCmd
