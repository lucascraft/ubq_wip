/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.impl;

import java.util.Collection;
import net.sf.smbt.touchosc.touchoscapp.MultiToggle;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Toggle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getW <em>W</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#isInverted <em>Inverted</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getValues <em>Values</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchoscapp.impl.MultiToggleImpl#isLocalFeedbackOff <em>Local Feedback Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiToggleImpl extends EObjectImpl implements MultiToggle {
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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> values;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiToggleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscappPackage.Literals.MULTI_TOGGLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__W, oldW, w));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__H, oldH, h));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__COLOR, oldColor, color));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__CENTERED, oldCentered, centered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__INVERTED, oldInverted, inverted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__OSC, oldOsc, osc));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__NUMBER, oldNumber, number));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<Integer>(Integer.class, this, TouchoscappPackage.MULTI_TOGGLE__VALUES);
		}
		return values;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__ROWS, oldRows, rows));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__COLUMNS, oldColumns, columns));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscappPackage.MULTI_TOGGLE__LOCAL_FEEDBACK_OFF, oldLocalFeedbackOff, localFeedbackOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscappPackage.MULTI_TOGGLE__X:
				return getX();
			case TouchoscappPackage.MULTI_TOGGLE__Y:
				return getY();
			case TouchoscappPackage.MULTI_TOGGLE__W:
				return getW();
			case TouchoscappPackage.MULTI_TOGGLE__H:
				return getH();
			case TouchoscappPackage.MULTI_TOGGLE__COLOR:
				return getColor();
			case TouchoscappPackage.MULTI_TOGGLE__CENTERED:
				return isCentered();
			case TouchoscappPackage.MULTI_TOGGLE__INVERTED:
				return isInverted();
			case TouchoscappPackage.MULTI_TOGGLE__OSC:
				return getOsc();
			case TouchoscappPackage.MULTI_TOGGLE__NUMBER:
				return getNumber();
			case TouchoscappPackage.MULTI_TOGGLE__NAME:
				return getName();
			case TouchoscappPackage.MULTI_TOGGLE__TYPE:
				return getType();
			case TouchoscappPackage.MULTI_TOGGLE__VALUES:
				return getValues();
			case TouchoscappPackage.MULTI_TOGGLE__ROWS:
				return getRows();
			case TouchoscappPackage.MULTI_TOGGLE__COLUMNS:
				return getColumns();
			case TouchoscappPackage.MULTI_TOGGLE__LOCAL_FEEDBACK_OFF:
				return isLocalFeedbackOff();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TouchoscappPackage.MULTI_TOGGLE__X:
				setX((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__Y:
				setY((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__W:
				setW((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__H:
				setH((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__COLOR:
				setColor((String)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__CENTERED:
				setCentered((Boolean)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__INVERTED:
				setInverted((Boolean)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__OSC:
				setOsc((String)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__NUMBER:
				setNumber((String)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__NAME:
				setName((String)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__TYPE:
				setType((String)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Integer>)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__ROWS:
				setRows((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__COLUMNS:
				setColumns((Integer)newValue);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__LOCAL_FEEDBACK_OFF:
				setLocalFeedbackOff((Boolean)newValue);
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
			case TouchoscappPackage.MULTI_TOGGLE__X:
				setX(X_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__Y:
				setY(Y_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__W:
				setW(W_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__H:
				setH(H_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__INVERTED:
				setInverted(INVERTED_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__OSC:
				setOsc(OSC_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__VALUES:
				getValues().clear();
				return;
			case TouchoscappPackage.MULTI_TOGGLE__ROWS:
				setRows(ROWS_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__COLUMNS:
				setColumns(COLUMNS_EDEFAULT);
				return;
			case TouchoscappPackage.MULTI_TOGGLE__LOCAL_FEEDBACK_OFF:
				setLocalFeedbackOff(LOCAL_FEEDBACK_OFF_EDEFAULT);
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
			case TouchoscappPackage.MULTI_TOGGLE__X:
				return x != X_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__Y:
				return y != Y_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__W:
				return w != W_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__H:
				return h != H_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case TouchoscappPackage.MULTI_TOGGLE__CENTERED:
				return centered != CENTERED_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__INVERTED:
				return inverted != INVERTED_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__OSC:
				return OSC_EDEFAULT == null ? osc != null : !OSC_EDEFAULT.equals(osc);
			case TouchoscappPackage.MULTI_TOGGLE__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TouchoscappPackage.MULTI_TOGGLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouchoscappPackage.MULTI_TOGGLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TouchoscappPackage.MULTI_TOGGLE__VALUES:
				return values != null && !values.isEmpty();
			case TouchoscappPackage.MULTI_TOGGLE__ROWS:
				return rows != ROWS_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__COLUMNS:
				return columns != COLUMNS_EDEFAULT;
			case TouchoscappPackage.MULTI_TOGGLE__LOCAL_FEEDBACK_OFF:
				return localFeedbackOff != LOCAL_FEEDBACK_OFF_EDEFAULT;
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
		result.append(", values: ");
		result.append(values);
		result.append(", rows: ");
		result.append(rows);
		result.append(", columns: ");
		result.append(columns);
		result.append(", localFeedbackOff: ");
		result.append(localFeedbackOff);
		result.append(')');
		return result.toString();
	}

} //MultiToggleImpl
