/**
 */
package net.sf.smbt.ezmppt.impl;

import java.util.Date;

import net.sf.smbt.ezmppt.EzmpptPackage;
import net.sf.smbt.ezmppt.MpptCmd;

import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mppt Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl#getCrc1 <em>Crc1</em>}</li>
 *   <li>{@link net.sf.smbt.ezmppt.impl.MpptCmdImpl#getCrc2 <em>Crc2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MpptCmdImpl extends CmdImpl implements MpptCmd {
	/**
	 * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected static final byte DEVICE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDevice()
	 * @generated
	 * @ordered
	 */
	protected byte device = DEVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected static final byte COMMAND_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getCommand() <em>Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommand()
	 * @generated
	 * @ordered
	 */
	protected byte command = COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final byte LENGTH_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected byte length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected byte[] data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrc1() <em>Crc1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc1()
	 * @generated
	 * @ordered
	 */
	protected static final byte CRC1_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getCrc1() <em>Crc1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc1()
	 * @generated
	 * @ordered
	 */
	protected byte crc1 = CRC1_EDEFAULT;

	/**
	 * The default value of the '{@link #getCrc2() <em>Crc2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc2()
	 * @generated
	 * @ordered
	 */
	protected static final byte CRC2_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getCrc2() <em>Crc2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCrc2()
	 * @generated
	 * @ordered
	 */
	protected byte crc2 = CRC2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MpptCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzmpptPackage.Literals.MPPT_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getDevice() {
		return device;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(byte newDevice) {
		byte oldDevice = device;
		device = newDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.MPPT_CMD__DEVICE, oldDevice, device));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCommand() {
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommand(byte newCommand) {
		byte oldCommand = command;
		command = newCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.MPPT_CMD__COMMAND, oldCommand, command));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(byte newLength) {
		byte oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.MPPT_CMD__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		byte[] oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.MPPT_CMD__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCrc1() {
		return crc1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrc1(byte newCrc1) {
		byte oldCrc1 = crc1;
		crc1 = newCrc1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.MPPT_CMD__CRC1, oldCrc1, crc1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getCrc2() {
		return crc2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCrc2(byte newCrc2) {
		byte oldCrc2 = crc2;
		crc2 = newCrc2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EzmpptPackage.MPPT_CMD__CRC2, oldCrc2, crc2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EzmpptPackage.MPPT_CMD__DEVICE:
				return getDevice();
			case EzmpptPackage.MPPT_CMD__COMMAND:
				return getCommand();
			case EzmpptPackage.MPPT_CMD__LENGTH:
				return getLength();
			case EzmpptPackage.MPPT_CMD__DATA:
				return getData();
			case EzmpptPackage.MPPT_CMD__CRC1:
				return getCrc1();
			case EzmpptPackage.MPPT_CMD__CRC2:
				return getCrc2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EzmpptPackage.MPPT_CMD__DEVICE:
				setDevice((Byte)newValue);
				return;
			case EzmpptPackage.MPPT_CMD__COMMAND:
				setCommand((Byte)newValue);
				return;
			case EzmpptPackage.MPPT_CMD__LENGTH:
				setLength((Byte)newValue);
				return;
			case EzmpptPackage.MPPT_CMD__DATA:
				setData((byte[])newValue);
				return;
			case EzmpptPackage.MPPT_CMD__CRC1:
				setCrc1((Byte)newValue);
				return;
			case EzmpptPackage.MPPT_CMD__CRC2:
				setCrc2((Byte)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EzmpptPackage.MPPT_CMD__DEVICE:
				setDevice(DEVICE_EDEFAULT);
				return;
			case EzmpptPackage.MPPT_CMD__COMMAND:
				setCommand(COMMAND_EDEFAULT);
				return;
			case EzmpptPackage.MPPT_CMD__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case EzmpptPackage.MPPT_CMD__DATA:
				setData(DATA_EDEFAULT);
				return;
			case EzmpptPackage.MPPT_CMD__CRC1:
				setCrc1(CRC1_EDEFAULT);
				return;
			case EzmpptPackage.MPPT_CMD__CRC2:
				setCrc2(CRC2_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EzmpptPackage.MPPT_CMD__DEVICE:
				return device != DEVICE_EDEFAULT;
			case EzmpptPackage.MPPT_CMD__COMMAND:
				return command != COMMAND_EDEFAULT;
			case EzmpptPackage.MPPT_CMD__LENGTH:
				return length != LENGTH_EDEFAULT;
			case EzmpptPackage.MPPT_CMD__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case EzmpptPackage.MPPT_CMD__CRC1:
				return crc1 != CRC1_EDEFAULT;
			case EzmpptPackage.MPPT_CMD__CRC2:
				return crc2 != CRC2_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (device: ");
		result.append(device);
		result.append(", command: ");
		result.append(command);
		result.append(", length: ");
		result.append(length);
		result.append(", data: ");
		result.append(data);
		result.append(", crc1: ");
		result.append(crc1);
		result.append(", crc2: ");
		result.append(crc2);
		result.append(')');
		return result.toString();
	}

} //MpptCmdImpl
