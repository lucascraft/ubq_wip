/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.impl;

import net.sf.smbt.touchosc.touchoscapp.MultiPush;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Push</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getW <em>W</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#isInverted <em>Inverted</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#isLocalFeedbackOff <em>Local Feedback Off</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiPushImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiPushImpl extends EObjectImpl implements MultiPush {
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
	 * The default value of the '{@link #isLocalFeedbackOff() <em>Local Feedback Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalFeedbackOff()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOCAL_FEEDBACK_OFF_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLocalFeedbackOff() <em>Local Feedback Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLocalFeedbackOff()
	 * @generated
	 * @ordered
	 */
	protected boolean localFeedbackOff = LOCAL_FEEDBACK_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected static final int ROWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected int rows = ROWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMNS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected int columns = COLUMNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiPushImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscappPackage.Literals.MULTI_PUSH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__W, oldW, w));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__H, oldH, h));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__CENTERED, oldCentered, centered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__INVERTED, oldInverted, inverted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__OSC, oldOsc, osc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLocalFeedbackOff() {
		return localFeedbackOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalFeedbackOff(boolean newLocalFeedbackOff) {
		boolean oldLocalFeedbackOff = localFeedbackOff;
		localFeedbackOff = newLocalFeedbackOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__LOCAL_FEEDBACK_OFF, oldLocalFeedbackOff, localFeedbackOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRows() {
		return rows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRows(int newRows) {
		int oldRows = rows;
		rows = newRows;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__ROWS, oldRows, rows));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColumns() {
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumns(int newColumns) {
		int oldColumns = columns;
		columns = newColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_PUSH__COLUMNS, oldColumns, columns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscappPackage.MULTI_PUSH__X:
				return getX();
			case TouchoscappPackage.MULTI_PUSH__Y:
				return getY();
			case TouchoscappPackage.MULTI_PUSH__W:
				return getW();
			case TouchoscappPackage.MULTI_PUSH__H:
				return getH();
			case TouchoscappPackage.MULTI_PUSH__COLOR:
				return getColor();
			case TouchoscappPackage.MULTI_PUSH__CENTERED:
				return isCentered();
			case TouchoscappPackage.MULTI_PUSH__INVERTED:
				return isInverted();
			case TouchoscappPackage.MULTI_PUSH__OSC:
				return getOsc();
			case TouchoscappPackage.MULTI_PUSH__NUMBER:
				return getNumber();
			case TouchoscappPackage.MULTI_PUSH__NAME:
				return getName();
			case TouchoscappPackage.MULTI_PUSH__TYPE:
				return getType();
			case TouchoscappPackage.MULTI_PUSH__LOCAL_FEEDBACK_OFF:
				return isLocalFeedbackOff();
			case TouchoscappPackage.MULTI_PUSH__ROWS:
				return getRows();
			case TouchoscappPackage.MULTI_PUSH__COLUMNS:
				return getColumns();
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
			case TouchoscappPackage.MULTI_PUSH__X:
				setX((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__Y:
				setY((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__W:
				setW((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__H:
				setH((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__COLOR:
				setColor((String)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__CENTERED:
				setCentered((Boolean)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__INVERTED:
				setInverted((Boolean)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__OSC:
				setOsc((String)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__NUMBER:
				setNumber((String)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__NAME:
				setName((String)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__TYPE:
				setType((String)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__LOCAL_FEEDBACK_OFF:
				setLocalFeedbackOff((Boolean)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__ROWS:
				setRows((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_PUSH__COLUMNS:
				setColumns((Integer)newValue);
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
			case TouchoscappPackage.MULTI_PUSH__X:
				setX(X_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__Y:
				setY(Y_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__W:
				setW(W_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__H:
				setH(H_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__INVERTED:
				setInverted(INVERTED_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__OSC:
				setOsc(OSC_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__LOCAL_FEEDBACK_OFF:
				setLocalFeedbackOff(LOCAL_FEEDBACK_OFF_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_PUSH__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
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
			case TouchoscappPackage.MULTI_PUSH__X:
				return x != X_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__Y:
				return y != Y_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__W:
				return w != W_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__H:
				return h != H_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case TouchoscappPackage.MULTI_PUSH__CENTERED:
				return centered != CENTERED_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__INVERTED:
				return inverted != INVERTED_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__OSC:
				return OSC_EDEFAULT == null ? osc != null : !OSC_EDEFAULT.equals(osc);
			case TouchoscappPackage.MULTI_PUSH__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TouchoscappPackage.MULTI_PUSH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouchoscappPackage.MULTI_PUSH__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TouchoscappPackage.MULTI_PUSH__LOCAL_FEEDBACK_OFF:
				return localFeedbackOff != LOCAL_FEEDBACK_OFF_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__ROWS:
				return rows != ROWS_EDEFAULT;
			case TouchoscappPackage.MULTI_PUSH__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
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
		result.append(", localFeedbackOff: ");
		result.append(localFeedbackOff);
		result.append(", rows: ");
		result.append(rows);
		result.append(", columns: ");
		result.append(columns);
		result.append(')');
		return result.toString();
	}

} //MultiPushImpl
