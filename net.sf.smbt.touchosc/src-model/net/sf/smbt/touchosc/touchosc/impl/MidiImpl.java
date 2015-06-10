/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc.impl;

import net.sf.smbt.touchosc.touchosc.Midi;
import net.sf.smbt.touchosc.touchosc.TouchoscPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Midi</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl#getData1 <em>Data1</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl#getData2f <em>Data2f</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl#getData2t <em>Data2t</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl#getVar <em>Var</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MidiImpl extends EObjectImpl implements Midi {
	/**
	 * The default value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANNEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
	protected String channel = CHANNEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getData1() <em>Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData1()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData1() <em>Data1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData1()
	 * @generated
	 * @ordered
	 */
	protected String data1 = DATA1_EDEFAULT;

	/**
	 * The default value of the '{@link #getData2f() <em>Data2f</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData2f()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA2F_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData2f() <em>Data2f</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData2f()
	 * @generated
	 * @ordered
	 */
	protected String data2f = DATA2F_EDEFAULT;

	/**
	 * The default value of the '{@link #getData2t() <em>Data2t</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData2t()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA2T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData2t() <em>Data2t</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData2t()
	 * @generated
	 * @ordered
	 */
	protected String data2t = DATA2T_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVar() <em>Var</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVar()
	 * @generated
	 * @ordered
	 */
	protected String var = VAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MidiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscPackage.Literals.MIDI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChannel() {
		return channel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChannel(String newChannel) {
		String oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.MIDI__CHANNEL, oldChannel, channel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData1() {
		return data1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData1(String newData1) {
		String oldData1 = data1;
		data1 = newData1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.MIDI__DATA1, oldData1, data1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData2f() {
		return data2f;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData2f(String newData2f) {
		String oldData2f = data2f;
		data2f = newData2f;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.MIDI__DATA2F, oldData2f, data2f));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData2t() {
		return data2t;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData2t(String newData2t) {
		String oldData2t = data2t;
		data2t = newData2t;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.MIDI__DATA2T, oldData2t, data2t));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.MIDI__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVar() {
		return var;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVar(String newVar) {
		String oldVar = var;
		var = newVar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.MIDI__VAR, oldVar, var));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscPackage.MIDI__CHANNEL:
				return getChannel();
			case TouchoscPackage.MIDI__DATA1:
				return getData1();
			case TouchoscPackage.MIDI__DATA2F:
				return getData2f();
			case TouchoscPackage.MIDI__DATA2T:
				return getData2t();
			case TouchoscPackage.MIDI__TYPE:
				return getType();
			case TouchoscPackage.MIDI__VAR:
				return getVar();
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
			case TouchoscPackage.MIDI__CHANNEL:
				setChannel((String)newValue);
				return;
			case TouchoscPackage.MIDI__DATA1:
				setData1((String)newValue);
				return;
			case TouchoscPackage.MIDI__DATA2F:
				setData2f((String)newValue);
				return;
			case TouchoscPackage.MIDI__DATA2T:
				setData2t((String)newValue);
				return;
			case TouchoscPackage.MIDI__TYPE:
				setType((String)newValue);
				return;
			case TouchoscPackage.MIDI__VAR:
				setVar((String)newValue);
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
			case TouchoscPackage.MIDI__CHANNEL:
				setChannel(CHANNEL_EDEFAULT);
				return;
			case TouchoscPackage.MIDI__DATA1:
				setData1(DATA1_EDEFAULT);
				return;
			case TouchoscPackage.MIDI__DATA2F:
				setData2f(DATA2F_EDEFAULT);
				return;
			case TouchoscPackage.MIDI__DATA2T:
				setData2t(DATA2T_EDEFAULT);
				return;
			case TouchoscPackage.MIDI__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TouchoscPackage.MIDI__VAR:
				setVar(VAR_EDEFAULT);
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
			case TouchoscPackage.MIDI__CHANNEL:
				return CHANNEL_EDEFAULT == null ? channel != null : !CHANNEL_EDEFAULT.equals(channel);
			case TouchoscPackage.MIDI__DATA1:
				return DATA1_EDEFAULT == null ? data1 != null : !DATA1_EDEFAULT.equals(data1);
			case TouchoscPackage.MIDI__DATA2F:
				return DATA2F_EDEFAULT == null ? data2f != null : !DATA2F_EDEFAULT.equals(data2f);
			case TouchoscPackage.MIDI__DATA2T:
				return DATA2T_EDEFAULT == null ? data2t != null : !DATA2T_EDEFAULT.equals(data2t);
			case TouchoscPackage.MIDI__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TouchoscPackage.MIDI__VAR:
				return VAR_EDEFAULT == null ? var != null : !VAR_EDEFAULT.equals(var);
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
		result.append(" (channel: ");
		result.append(channel);
		result.append(", data1: ");
		result.append(data1);
		result.append(", data2f: ");
		result.append(data2f);
		result.append(", data2t: ");
		result.append(data2t);
		result.append(", type: ");
		result.append(type);
		result.append(", var: ");
		result.append(var);
		result.append(')');
		return result.toString();
	}

} //MidiImpl
