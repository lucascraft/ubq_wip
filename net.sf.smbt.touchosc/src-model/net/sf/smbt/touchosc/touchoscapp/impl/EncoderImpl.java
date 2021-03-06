/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.impl;

import net.sf.smbt.touchosc.touchoscapp.Encoder;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Encoder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getW <em>W</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#isInverted <em>Inverted</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getFrom <em>From</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getTo <em>To</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.EncoderImpl#getResponse <em>Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncoderImpl extends EObjectImpl implements Encoder {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final int W_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected int w = W_EDEFAULT;

	/**
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final int H_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected int h = H_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isCentered() <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCentered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CENTERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCentered() <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCentered()
	 * @generated
	 * @ordered
	 */
	protected boolean centered = CENTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted()
	 * @generated
	 * @ordered
	 */
	protected boolean inverted = INVERTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsc() <em>Osc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsc()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsc() <em>Osc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsc()
	 * @generated
	 * @ordered
	 */
	protected String osc = OSC_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final int FROM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected int from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final int TO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected int to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected static final String RESPONSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResponse() <em>Response</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponse()
	 * @generated
	 * @ordered
	 */
	protected String response = RESPONSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncoderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscappPackage.Literals.ENCODER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(int newW) {
		int oldW = w;
		w = newW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__W, oldW, w));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(int newH) {
		int oldH = h;
		h = newH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__H, oldH, h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCentered() {
		return centered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentered(boolean newCentered) {
		boolean oldCentered = centered;
		centered = newCentered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__CENTERED, oldCentered, centered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverted() {
		return inverted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverted(boolean newInverted) {
		boolean oldInverted = inverted;
		inverted = newInverted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__INVERTED, oldInverted, inverted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsc() {
		return osc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsc(String newOsc) {
		String oldOsc = osc;
		osc = newOsc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__OSC, oldOsc, osc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(int newFrom) {
		int oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(int newTo) {
		int oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponse(String newResponse) {
		String oldResponse = response;
		response = newResponse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.ENCODER__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscappPackage.ENCODER__X:
				return getX();
			case TouchoscappPackage.ENCODER__Y:
				return getY();
			case TouchoscappPackage.ENCODER__W:
				return getW();
			case TouchoscappPackage.ENCODER__H:
				return getH();
			case TouchoscappPackage.ENCODER__COLOR:
				return getColor();
			case TouchoscappPackage.ENCODER__CENTERED:
				return isCentered();
			case TouchoscappPackage.ENCODER__INVERTED:
				return isInverted();
			case TouchoscappPackage.ENCODER__OSC:
				return getOsc();
			case TouchoscappPackage.ENCODER__NUMBER:
				return getNumber();
			case TouchoscappPackage.ENCODER__NAME:
				return getName();
			case TouchoscappPackage.ENCODER__TYPE:
				return getType();
			case TouchoscappPackage.ENCODER__FROM:
				return getFrom();
			case TouchoscappPackage.ENCODER__TO:
				return getTo();
			case TouchoscappPackage.ENCODER__RESPONSE:
				return getResponse();
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
			case TouchoscappPackage.ENCODER__X:
				setX((Integer)newValue);
				return;
			case TouchoscappPackage.ENCODER__Y:
				setY((Integer)newValue);
				return;
			case TouchoscappPackage.ENCODER__W:
				setW((Integer)newValue);
				return;
			case TouchoscappPackage.ENCODER__H:
				setH((Integer)newValue);
				return;
			case TouchoscappPackage.ENCODER__COLOR:
				setColor((String)newValue);
				return;
			case TouchoscappPackage.ENCODER__CENTERED:
				setCentered((Boolean)newValue);
				return;
			case TouchoscappPackage.ENCODER__INVERTED:
				setInverted((Boolean)newValue);
				return;
			case TouchoscappPackage.ENCODER__OSC:
				setOsc((String)newValue);
				return;
			case TouchoscappPackage.ENCODER__NUMBER:
				setNumber((String)newValue);
				return;
			case TouchoscappPackage.ENCODER__NAME:
				setName((String)newValue);
				return;
			case TouchoscappPackage.ENCODER__TYPE:
				setType((String)newValue);
				return;
			case TouchoscappPackage.ENCODER__FROM:
				setFrom((Integer)newValue);
				return;
			case TouchoscappPackage.ENCODER__TO:
				setTo((Integer)newValue);
				return;
			case TouchoscappPackage.ENCODER__RESPONSE:
				setResponse((String)newValue);
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
			case TouchoscappPackage.ENCODER__X:
				setX(X_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__Y:
				setY(Y_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__W:
				setW(W_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__H:
				setH(H_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__INVERTED:
				setInverted(INVERTED_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__OSC:
				setOsc(OSC_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__FROM:
				setFrom(FROM_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__TO:
				setTo(TO_EDEFAULT);
				return;
			case TouchoscappPackage.ENCODER__RESPONSE:
				setResponse(RESPONSE_EDEFAULT);
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
			case TouchoscappPackage.ENCODER__X:
				return x != X_EDEFAULT;
			case TouchoscappPackage.ENCODER__Y:
				return y != Y_EDEFAULT;
			case TouchoscappPackage.ENCODER__W:
				return w != W_EDEFAULT;
			case TouchoscappPackage.ENCODER__H:
				return h != H_EDEFAULT;
			case TouchoscappPackage.ENCODER__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case TouchoscappPackage.ENCODER__CENTERED:
				return centered != CENTERED_EDEFAULT;
			case TouchoscappPackage.ENCODER__INVERTED:
				return inverted != INVERTED_EDEFAULT;
			case TouchoscappPackage.ENCODER__OSC:
				return OSC_EDEFAULT == null ? osc != null : !OSC_EDEFAULT.equals(osc);
			case TouchoscappPackage.ENCODER__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TouchoscappPackage.ENCODER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouchoscappPackage.ENCODER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TouchoscappPackage.ENCODER__FROM:
				return from != FROM_EDEFAULT;
			case TouchoscappPackage.ENCODER__TO:
				return to != TO_EDEFAULT;
			case TouchoscappPackage.ENCODER__RESPONSE:
				return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
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
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", w: ");
		result.append(w);
		result.append(", h: ");
		result.append(h);
		result.append(", color: ");
		result.append(color);
		result.append(", centered: ");
		result.append(centered);
		result.append(", inverted: ");
		result.append(inverted);
		result.append(", osc: ");
		result.append(osc);
		result.append(", number: ");
		result.append(number);
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", response: ");
		result.append(response);
		result.append(')');
		return result.toString();
	}

} //EncoderImpl
