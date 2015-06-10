/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc.impl;

import net.sf.smbt.touchosc.touchosc.Control;
import net.sf.smbt.touchosc.touchosc.Midi;
import net.sf.smbt.touchosc.touchosc.TouchoscPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getMidi <em>Midi</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getCentered <em>Centered</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getH <em>H</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getInverted <em>Inverted</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getInvertedX <em>Inverted X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getInvertedY <em>Inverted Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getLocalOff <em>Local Off</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getNumberX <em>Number X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getNumberY <em>Number Y</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getOscCs <em>Osc Cs</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getOutline <em>Outline</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getResponse <em>Response</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getScalef <em>Scalef</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getScalet <em>Scalet</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getW <em>W</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlImpl extends EObjectImpl implements Control {
	/**
	 * The cached value of the '{@link #getMidi() <em>Midi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidi()
	 * @generated
	 * @ordered
	 */
	protected Midi midi;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected String background = BACKGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getCentered() <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentered()
	 * @generated
	 * @ordered
	 */
	protected static final String CENTERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCentered() <em>Centered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCentered()
	 * @generated
	 * @ordered
	 */
	protected String centered = CENTERED_EDEFAULT;

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
	 * The default value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected static final String H_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getH() <em>H</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getH()
	 * @generated
	 * @ordered
	 */
	protected String h = H_EDEFAULT;

	/**
	 * The default value of the '{@link #getInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverted()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERTED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInverted() <em>Inverted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInverted()
	 * @generated
	 * @ordered
	 */
	protected String inverted = INVERTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvertedX() <em>Inverted X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvertedX()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERTED_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvertedX() <em>Inverted X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvertedX()
	 * @generated
	 * @ordered
	 */
	protected String invertedX = INVERTED_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getInvertedY() <em>Inverted Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvertedY()
	 * @generated
	 * @ordered
	 */
	protected static final String INVERTED_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInvertedY() <em>Inverted Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvertedY()
	 * @generated
	 * @ordered
	 */
	protected String invertedY = INVERTED_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalOff() <em>Local Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOff()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalOff() <em>Local Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalOff()
	 * @generated
	 * @ordered
	 */
	protected String localOff = LOCAL_OFF_EDEFAULT;

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
	 * The default value of the '{@link #getNumberX() <em>Number X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberX()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberX() <em>Number X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberX()
	 * @generated
	 * @ordered
	 */
	protected String numberX = NUMBER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberY() <em>Number Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberY()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumberY() <em>Number Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberY()
	 * @generated
	 * @ordered
	 */
	protected String numberY = NUMBER_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscCs() <em>Osc Cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscCs()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_CS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscCs() <em>Osc Cs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscCs()
	 * @generated
	 * @ordered
	 */
	protected String oscCs = OSC_CS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutline()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutline()
	 * @generated
	 * @ordered
	 */
	protected String outline = OUTLINE_EDEFAULT;

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
	 * The default value of the '{@link #getScalef() <em>Scalef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalef()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALEF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalef() <em>Scalef</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalef()
	 * @generated
	 * @ordered
	 */
	protected String scalef = SCALEF_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalet() <em>Scalet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalet()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalet() <em>Scalet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalet()
	 * @generated
	 * @ordered
	 */
	protected String scalet = SCALET_EDEFAULT;

	/**
	 * The default value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final String SECONDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSeconds() <em>Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeconds()
	 * @generated
	 * @ordered
	 */
	protected String seconds = SECONDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

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
	 * The default value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected static final String W_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getW() <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getW()
	 * @generated
	 * @ordered
	 */
	protected String w = W_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TouchoscPackage.Literals.CONTROL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Midi getMidi() {
		return midi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMidi(Midi newMidi, NotificationChain msgs) {
		Midi oldMidi = midi;
		midi = newMidi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__MIDI, oldMidi, newMidi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidi(Midi newMidi) {
		if (newMidi != midi) {
			NotificationChain msgs = null;
			if (midi != null)
				msgs = ((InternalEObject)midi).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TouchoscPackage.CONTROL__MIDI, null, msgs);
			if (newMidi != null)
				msgs = ((InternalEObject)newMidi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TouchoscPackage.CONTROL__MIDI, null, msgs);
			msgs = basicSetMidi(newMidi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__MIDI, newMidi, newMidi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(String newBackground) {
		String oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCentered() {
		return centered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCentered(String newCentered) {
		String oldCentered = centered;
		centered = newCentered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__CENTERED, oldCentered, centered));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getH() {
		return h;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setH(String newH) {
		String oldH = h;
		h = newH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__H, oldH, h));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInverted() {
		return inverted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInverted(String newInverted) {
		String oldInverted = inverted;
		inverted = newInverted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__INVERTED, oldInverted, inverted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvertedX() {
		return invertedX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvertedX(String newInvertedX) {
		String oldInvertedX = invertedX;
		invertedX = newInvertedX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__INVERTED_X, oldInvertedX, invertedX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInvertedY() {
		return invertedY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvertedY(String newInvertedY) {
		String oldInvertedY = invertedY;
		invertedY = newInvertedY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__INVERTED_Y, oldInvertedY, invertedY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocalOff() {
		return localOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalOff(String newLocalOff) {
		String oldLocalOff = localOff;
		localOff = newLocalOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__LOCAL_OFF, oldLocalOff, localOff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumberX() {
		return numberX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberX(String newNumberX) {
		String oldNumberX = numberX;
		numberX = newNumberX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__NUMBER_X, oldNumberX, numberX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumberY() {
		return numberY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberY(String newNumberY) {
		String oldNumberY = numberY;
		numberY = newNumberY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__NUMBER_Y, oldNumberY, numberY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOscCs() {
		return oscCs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscCs(String newOscCs) {
		String oldOscCs = oscCs;
		oscCs = newOscCs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__OSC_CS, oldOscCs, oscCs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(String newOutline) {
		String oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__OUTLINE, oldOutline, outline));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__RESPONSE, oldResponse, response));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalef() {
		return scalef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalef(String newScalef) {
		String oldScalef = scalef;
		scalef = newScalef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__SCALEF, oldScalef, scalef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalet() {
		return scalet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalet(String newScalet) {
		String oldScalet = scalet;
		scalet = newScalet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__SCALET, oldScalet, scalet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSeconds() {
		return seconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeconds(String newSeconds) {
		String oldSeconds = seconds;
		seconds = newSeconds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__SECONDS, oldSeconds, seconds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getW() {
		return w;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setW(String newW) {
		String oldW = w;
		w = newW;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__W, oldW, w));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TouchoscPackage.CONTROL__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TouchoscPackage.CONTROL__MIDI:
				return basicSetMidi(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TouchoscPackage.CONTROL__MIDI:
				return getMidi();
			case TouchoscPackage.CONTROL__BACKGROUND:
				return getBackground();
			case TouchoscPackage.CONTROL__CENTERED:
				return getCentered();
			case TouchoscPackage.CONTROL__COLOR:
				return getColor();
			case TouchoscPackage.CONTROL__H:
				return getH();
			case TouchoscPackage.CONTROL__INVERTED:
				return getInverted();
			case TouchoscPackage.CONTROL__INVERTED_X:
				return getInvertedX();
			case TouchoscPackage.CONTROL__INVERTED_Y:
				return getInvertedY();
			case TouchoscPackage.CONTROL__LOCAL_OFF:
				return getLocalOff();
			case TouchoscPackage.CONTROL__NAME:
				return getName();
			case TouchoscPackage.CONTROL__NUMBER:
				return getNumber();
			case TouchoscPackage.CONTROL__NUMBER_X:
				return getNumberX();
			case TouchoscPackage.CONTROL__NUMBER_Y:
				return getNumberY();
			case TouchoscPackage.CONTROL__OSC_CS:
				return getOscCs();
			case TouchoscPackage.CONTROL__OUTLINE:
				return getOutline();
			case TouchoscPackage.CONTROL__RESPONSE:
				return getResponse();
			case TouchoscPackage.CONTROL__SCALEF:
				return getScalef();
			case TouchoscPackage.CONTROL__SCALET:
				return getScalet();
			case TouchoscPackage.CONTROL__SECONDS:
				return getSeconds();
			case TouchoscPackage.CONTROL__SIZE:
				return getSize();
			case TouchoscPackage.CONTROL__TEXT:
				return getText();
			case TouchoscPackage.CONTROL__TYPE:
				return getType();
			case TouchoscPackage.CONTROL__W:
				return getW();
			case TouchoscPackage.CONTROL__X:
				return getX();
			case TouchoscPackage.CONTROL__Y:
				return getY();
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
			case TouchoscPackage.CONTROL__MIDI:
				setMidi((Midi)newValue);
				return;
			case TouchoscPackage.CONTROL__BACKGROUND:
				setBackground((String)newValue);
				return;
			case TouchoscPackage.CONTROL__CENTERED:
				setCentered((String)newValue);
				return;
			case TouchoscPackage.CONTROL__COLOR:
				setColor((String)newValue);
				return;
			case TouchoscPackage.CONTROL__H:
				setH((String)newValue);
				return;
			case TouchoscPackage.CONTROL__INVERTED:
				setInverted((String)newValue);
				return;
			case TouchoscPackage.CONTROL__INVERTED_X:
				setInvertedX((String)newValue);
				return;
			case TouchoscPackage.CONTROL__INVERTED_Y:
				setInvertedY((String)newValue);
				return;
			case TouchoscPackage.CONTROL__LOCAL_OFF:
				setLocalOff((String)newValue);
				return;
			case TouchoscPackage.CONTROL__NAME:
				setName((String)newValue);
				return;
			case TouchoscPackage.CONTROL__NUMBER:
				setNumber((String)newValue);
				return;
			case TouchoscPackage.CONTROL__NUMBER_X:
				setNumberX((String)newValue);
				return;
			case TouchoscPackage.CONTROL__NUMBER_Y:
				setNumberY((String)newValue);
				return;
			case TouchoscPackage.CONTROL__OSC_CS:
				setOscCs((String)newValue);
				return;
			case TouchoscPackage.CONTROL__OUTLINE:
				setOutline((String)newValue);
				return;
			case TouchoscPackage.CONTROL__RESPONSE:
				setResponse((String)newValue);
				return;
			case TouchoscPackage.CONTROL__SCALEF:
				setScalef((String)newValue);
				return;
			case TouchoscPackage.CONTROL__SCALET:
				setScalet((String)newValue);
				return;
			case TouchoscPackage.CONTROL__SECONDS:
				setSeconds((String)newValue);
				return;
			case TouchoscPackage.CONTROL__SIZE:
				setSize((String)newValue);
				return;
			case TouchoscPackage.CONTROL__TEXT:
				setText((String)newValue);
				return;
			case TouchoscPackage.CONTROL__TYPE:
				setType((String)newValue);
				return;
			case TouchoscPackage.CONTROL__W:
				setW((String)newValue);
				return;
			case TouchoscPackage.CONTROL__X:
				setX((String)newValue);
				return;
			case TouchoscPackage.CONTROL__Y:
				setY((String)newValue);
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
			case TouchoscPackage.CONTROL__MIDI:
				setMidi((Midi)null);
				return;
			case TouchoscPackage.CONTROL__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__CENTERED:
				setCentered(CENTERED_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__H:
				setH(H_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__INVERTED:
				setInverted(INVERTED_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__INVERTED_X:
				setInvertedX(INVERTED_X_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__INVERTED_Y:
				setInvertedY(INVERTED_Y_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__LOCAL_OFF:
				setLocalOff(LOCAL_OFF_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__NUMBER_X:
				setNumberX(NUMBER_X_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__NUMBER_Y:
				setNumberY(NUMBER_Y_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__OSC_CS:
				setOscCs(OSC_CS_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__RESPONSE:
				setResponse(RESPONSE_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__SCALEF:
				setScalef(SCALEF_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__SCALET:
				setScalet(SCALET_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__SECONDS:
				setSeconds(SECONDS_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__W:
				setW(W_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__X:
				setX(X_EDEFAULT);
				return;
			case TouchoscPackage.CONTROL__Y:
				setY(Y_EDEFAULT);
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
			case TouchoscPackage.CONTROL__MIDI:
				return midi != null;
			case TouchoscPackage.CONTROL__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
			case TouchoscPackage.CONTROL__CENTERED:
				return CENTERED_EDEFAULT == null ? centered != null : !CENTERED_EDEFAULT.equals(centered);
			case TouchoscPackage.CONTROL__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case TouchoscPackage.CONTROL__H:
				return H_EDEFAULT == null ? h != null : !H_EDEFAULT.equals(h);
			case TouchoscPackage.CONTROL__INVERTED:
				return INVERTED_EDEFAULT == null ? inverted != null : !INVERTED_EDEFAULT.equals(inverted);
			case TouchoscPackage.CONTROL__INVERTED_X:
				return INVERTED_X_EDEFAULT == null ? invertedX != null : !INVERTED_X_EDEFAULT.equals(invertedX);
			case TouchoscPackage.CONTROL__INVERTED_Y:
				return INVERTED_Y_EDEFAULT == null ? invertedY != null : !INVERTED_Y_EDEFAULT.equals(invertedY);
			case TouchoscPackage.CONTROL__LOCAL_OFF:
				return LOCAL_OFF_EDEFAULT == null ? localOff != null : !LOCAL_OFF_EDEFAULT.equals(localOff);
			case TouchoscPackage.CONTROL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TouchoscPackage.CONTROL__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case TouchoscPackage.CONTROL__NUMBER_X:
				return NUMBER_X_EDEFAULT == null ? numberX != null : !NUMBER_X_EDEFAULT.equals(numberX);
			case TouchoscPackage.CONTROL__NUMBER_Y:
				return NUMBER_Y_EDEFAULT == null ? numberY != null : !NUMBER_Y_EDEFAULT.equals(numberY);
			case TouchoscPackage.CONTROL__OSC_CS:
				return OSC_CS_EDEFAULT == null ? oscCs != null : !OSC_CS_EDEFAULT.equals(oscCs);
			case TouchoscPackage.CONTROL__OUTLINE:
				return OUTLINE_EDEFAULT == null ? outline != null : !OUTLINE_EDEFAULT.equals(outline);
			case TouchoscPackage.CONTROL__RESPONSE:
				return RESPONSE_EDEFAULT == null ? response != null : !RESPONSE_EDEFAULT.equals(response);
			case TouchoscPackage.CONTROL__SCALEF:
				return SCALEF_EDEFAULT == null ? scalef != null : !SCALEF_EDEFAULT.equals(scalef);
			case TouchoscPackage.CONTROL__SCALET:
				return SCALET_EDEFAULT == null ? scalet != null : !SCALET_EDEFAULT.equals(scalet);
			case TouchoscPackage.CONTROL__SECONDS:
				return SECONDS_EDEFAULT == null ? seconds != null : !SECONDS_EDEFAULT.equals(seconds);
			case TouchoscPackage.CONTROL__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case TouchoscPackage.CONTROL__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case TouchoscPackage.CONTROL__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case TouchoscPackage.CONTROL__W:
				return W_EDEFAULT == null ? w != null : !W_EDEFAULT.equals(w);
			case TouchoscPackage.CONTROL__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case TouchoscPackage.CONTROL__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
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
		result.append(" (background: ");
		result.append(background);
		result.append(", centered: ");
		result.append(centered);
		result.append(", color: ");
		result.append(color);
		result.append(", h: ");
		result.append(h);
		result.append(", inverted: ");
		result.append(inverted);
		result.append(", invertedX: ");
		result.append(invertedX);
		result.append(", invertedY: ");
		result.append(invertedY);
		result.append(", localOff: ");
		result.append(localOff);
		result.append(", name: ");
		result.append(name);
		result.append(", number: ");
		result.append(number);
		result.append(", numberX: ");
		result.append(numberX);
		result.append(", numberY: ");
		result.append(numberY);
		result.append(", oscCs: ");
		result.append(oscCs);
		result.append(", outline: ");
		result.append(outline);
		result.append(", response: ");
		result.append(response);
		result.append(", scalef: ");
		result.append(scalef);
		result.append(", scalet: ");
		result.append(scalet);
		result.append(", seconds: ");
		result.append(seconds);
		result.append(", size: ");
		result.append(size);
		result.append(", text: ");
		result.append(text);
		result.append(", type: ");
		result.append(type);
		result.append(", w: ");
		result.append(w);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(')');
		return result.toString();
	}

} //ControlImpl
