/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.impl;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Touch Osc Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isCentered <em>Centered</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getW <em>W</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isInverted <em>Inverted</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getOsc_cs <em>Osc cs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isOutline <em>Outline</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getNumber_x <em>Number x</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getNumber_y <em>Number y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getScalef <em>Scalef</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getScalet <em>Scalet</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isInverted_x <em>Inverted x</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isInverted_y <em>Inverted y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isSeconds <em>Seconds</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isBackground <em>Background</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.ui.touchoscgui.impl.TouchOscControlImpl#isLocalFeedbackOff <em>Local Feedback Off</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TouchOscControlImpl extends EObjectImpl implements TouchOscControl {
	/**
	 * The default value of the '{@link #getFg() <em>Fg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFg()
	 * @generated
	 * @ordered
	 */
	protected static final String FG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFg() <em>Fg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFg()
	 * @generated
	 * @ordered
	 */
	protected String fg = FG_EDEFAULT;

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
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsc_cs() <em>Osc cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsc_cs()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_CS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsc_cs() <em>Osc cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsc_cs()
	 * @generated
	 * @ordered
	 */
	protected String osc_cs = OSC_CS_EDEFAULT;

	/**
	 * The default value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OUTLINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOutline()
	 * @generated
	 * @ordered
	 */
	protected boolean outline = OUTLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	 * The default value of the '{@link #getNumber_x() <em>Number x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_x()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_x() <em>Number x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_x()
	 * @generated
	 * @ordered
	 */
	protected int number_x = NUMBER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumber_y() <em>Number y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_y()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber_y() <em>Number y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_y()
	 * @generated
	 * @ordered
	 */
	protected int number_y = NUMBER_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalef() <em>Scalef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalef()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALEF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalef() <em>Scalef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalef()
	 * @generated
	 * @ordered
	 */
	protected int scalef = SCALEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalet() <em>Scalet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalet()
	 * @generated
	 * @ordered
	 */
	protected static final int SCALET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getScalet() <em>Scalet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalet()
	 * @generated
	 * @ordered
	 */
	protected int scalet = SCALET_EDEFAULT;

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
	 * The default value of the '{@link #isInverted_x() <em>Inverted x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted_x()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERTED_X_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverted_x() <em>Inverted x</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted_x()
	 * @generated
	 * @ordered
	 */
	protected boolean inverted_x = INVERTED_X_EDEFAULT;

	/**
	 * The default value of the '{@link #isInverted_y() <em>Inverted y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted_y()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INVERTED_Y_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInverted_y() <em>Inverted y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInverted_y()
	 * @generated
	 * @ordered
	 */
	protected boolean inverted_y = INVERTED_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #isSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECONDS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeconds()
	 * @generated
	 * @ordered
	 */
	protected boolean seconds = SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BACKGROUND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBackground()
	 * @generated
	 * @ordered
	 */
	protected boolean background = BACKGROUND_EDEFAULT;

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
	protected TouchOscControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscguiPackage.Literals.TOUCH_OSC_CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFg() {
		return fg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFg(String newFg) {
		String oldFg = fg;
		fg = newFg;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__FG, oldFg, fg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__CENTERED, oldCentered, centered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__H, oldH, h));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__W, oldW, w));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__Y, oldY, y));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED, oldInverted, inverted));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsc_cs() {
		return osc_cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsc_cs(String newOsc_cs) {
		String oldOsc_cs = osc_cs;
		osc_cs = newOsc_cs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__OSC_CS, oldOsc_cs, osc_cs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(boolean newOutline) {
		boolean oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__OUTLINE, oldOutline, outline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_x() {
		return number_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_x(int newNumber_x) {
		int oldNumber_x = number_x;
		number_x = newNumber_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_X, oldNumber_x, number_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_y() {
		return number_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber_y(int newNumber_y) {
		int oldNumber_y = number_y;
		number_y = newNumber_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_Y, oldNumber_y, number_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScalef() {
		return scalef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalef(int newScalef) {
		int oldScalef = scalef;
		scalef = newScalef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALEF, oldScalef, scalef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getScalet() {
		return scalet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalet(int newScalet) {
		int oldScalet = scalet;
		scalet = newScalet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALET, oldScalet, scalet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverted_x() {
		return inverted_x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverted_x(boolean newInverted_x) {
		boolean oldInverted_x = inverted_x;
		inverted_x = newInverted_x;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_X, oldInverted_x, inverted_x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInverted_y() {
		return inverted_y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverted_y(boolean newInverted_y) {
		boolean oldInverted_y = inverted_y;
		inverted_y = newInverted_y;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_Y, oldInverted_y, inverted_y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSeconds() {
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeconds(boolean newSeconds) {
		boolean oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(boolean newBackground) {
		boolean oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__BACKGROUND, oldBackground, background));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscguiPackage.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF, oldLocalFeedbackOff, localFeedbackOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__FG:
				return getFg();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__CENTERED:
				return isCentered();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__H:
				return getH();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__W:
				return getW();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__X:
				return getX();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__Y:
				return getY();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED:
				return isInverted();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NAME:
				return getName();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER:
				return getNumber();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OSC_CS:
				return getOsc_cs();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OUTLINE:
				return isOutline();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SIZE:
				return getSize();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TEXT:
				return getText();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TYPE:
				return getType();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_X:
				return getNumber_x();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_Y:
				return getNumber_y();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALEF:
				return getScalef();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALET:
				return getScalet();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__RESPONSE:
				return getResponse();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_X:
				return isInverted_x();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_Y:
				return isInverted_y();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SECONDS:
				return isSeconds();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__BACKGROUND:
				return isBackground();
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF:
				return isLocalFeedbackOff();
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
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__FG:
				setFg((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__CENTERED:
				setCentered((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__H:
				setH((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__W:
				setW((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__X:
				setX((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__Y:
				setY((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED:
				setInverted((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NAME:
				setName((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER:
				setNumber((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OSC_CS:
				setOsc_cs((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OUTLINE:
				setOutline((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SIZE:
				setSize((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TEXT:
				setText((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TYPE:
				setType((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_X:
				setNumber_x((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_Y:
				setNumber_y((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALEF:
				setScalef((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALET:
				setScalet((Integer)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__RESPONSE:
				setResponse((String)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_X:
				setInverted_x((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_Y:
				setInverted_y((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SECONDS:
				setSeconds((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__BACKGROUND:
				setBackground((Boolean)newValue);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF:
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
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__FG:
				setFg(FG_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__H:
				setH(H_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__W:
				setW(W_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__X:
				setX(X_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__Y:
				setY(Y_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED:
				setInverted(INVERTED_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OSC_CS:
				setOsc_cs(OSC_CS_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_X:
				setNumber_x(NUMBER_X_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_Y:
				setNumber_y(NUMBER_Y_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALEF:
				setScalef(SCALEF_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALET:
				setScalet(SCALET_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__RESPONSE:
				setResponse(RESPONSE_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_X:
				setInverted_x(INVERTED_X_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_Y:
				setInverted_y(INVERTED_Y_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF:
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
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__FG:
				return FG_EDEFAULT == null ? fg != null : !FG_EDEFAULT.equals(fg);
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__CENTERED:
				return centered != CENTERED_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__H:
				return h != H_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__W:
				return w != W_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__X:
				return x != X_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__Y:
				return y != Y_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED:
				return inverted != INVERTED_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER:
				return number != NUMBER_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OSC_CS:
				return OSC_CS_EDEFAULT == null ? osc_cs != null : !OSC_CS_EDEFAULT.equals(osc_cs);
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__OUTLINE:
				return outline != OUTLINE_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SIZE:
				return size != SIZE_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_X:
				return number_x != NUMBER_X_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__NUMBER_Y:
				return number_y != NUMBER_Y_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALEF:
				return scalef != SCALEF_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SCALET:
				return scalet != SCALET_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__RESPONSE:
				return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_X:
				return inverted_x != INVERTED_X_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__INVERTED_Y:
				return inverted_y != INVERTED_Y_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__SECONDS:
				return seconds != SECONDS_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__BACKGROUND:
				return background != BACKGROUND_EDEFAULT;
			case TouchoscguiPackage.TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF:
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
		result.append(" (fg: ");
		result.append(fg);
		result.append(", centered: ");
		result.append(centered);
		result.append(", h: ");
		result.append(h);
		result.append(", w: ");
		result.append(w);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", inverted: ");
		result.append(inverted);
		result.append(", name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(", osc_cs: ");
		result.append(osc_cs);
		result.append(", outline: ");
		result.append(outline);
		result.append(", size: ");
		result.append(size);
		result.append(", text: ");
		result.append(text);
		result.append(", type: ");
		result.append(type);
		result.append(", number_x: ");
		result.append(number_x);
		result.append(", number_y: ");
		result.append(number_y);
		result.append(", scalef: ");
		result.append(scalef);
		result.append(", scalet: ");
		result.append(scalet);
		result.append(", response: ");
		result.append(response);
		result.append(", inverted_x: ");
		result.append(inverted_x);
		result.append(", inverted_y: ");
		result.append(inverted_y);
		result.append(", seconds: ");
		result.append(seconds);
		result.append(", background: ");
		result.append(background);
		result.append(", localFeedbackOff: ");
		result.append(localFeedbackOff);
		result.append(')');
		return result.toString();
	}

} //TouchOscControlImpl
