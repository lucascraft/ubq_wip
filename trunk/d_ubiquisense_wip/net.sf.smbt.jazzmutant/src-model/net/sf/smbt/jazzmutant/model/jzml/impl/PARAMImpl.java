/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PARAM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PARAM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getKbmouseMessage <em>Kbmouse Message</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getKbmouseScale <em>Kbmouse Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getKbmouseTarget <em>Kbmouse Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getKbmouseTrigger <em>Kbmouse Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getMidiMessage <em>Midi Message</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getMidiScale <em>Midi Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getMidiTarget <em>Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getMidiTrigger <em>Midi Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getOscMessage <em>Osc Message</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getOscScale <em>Osc Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getOscTarget <em>Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getOscTrigger <em>Osc Trigger</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getSend <em>Send</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getTabbar <em>Tabbar</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PARAMImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PARAMImpl extends MinimalEObjectImpl.Container implements PARAM {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKbmouseMessage() <em>Kbmouse Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String KBMOUSE_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKbmouseMessage() <em>Kbmouse Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseMessage()
	 * @generated
	 * @ordered
	 */
	protected String kbmouseMessage = KBMOUSE_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKbmouseScale() <em>Kbmouse Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseScale()
	 * @generated
	 * @ordered
	 */
	protected static final String KBMOUSE_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKbmouseScale() <em>Kbmouse Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseScale()
	 * @generated
	 * @ordered
	 */
	protected String kbmouseScale = KBMOUSE_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getKbmouseTarget() <em>Kbmouse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String KBMOUSE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKbmouseTarget() <em>Kbmouse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseTarget()
	 * @generated
	 * @ordered
	 */
	protected String kbmouseTarget = KBMOUSE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getKbmouseTrigger() <em>Kbmouse Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String KBMOUSE_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKbmouseTrigger() <em>Kbmouse Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseTrigger()
	 * @generated
	 * @ordered
	 */
	protected String kbmouseTrigger = KBMOUSE_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected static final String META_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected String meta = META_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiMessage() <em>Midi Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDI_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiMessage() <em>Midi Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiMessage()
	 * @generated
	 * @ordered
	 */
	protected String midiMessage = MIDI_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiScale() <em>Midi Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiScale()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDI_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiScale() <em>Midi Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiScale()
	 * @generated
	 * @ordered
	 */
	protected String midiScale = MIDI_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiTarget() <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDI_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiTarget() <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiTarget()
	 * @generated
	 * @ordered
	 */
	protected String midiTarget = MIDI_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiTrigger() <em>Midi Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDI_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiTrigger() <em>Midi Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiTrigger()
	 * @generated
	 * @ordered
	 */
	protected String midiTrigger = MIDI_TRIGGER_EDEFAULT;

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
	 * The default value of the '{@link #getOscMessage() <em>Osc Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscMessage() <em>Osc Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscMessage()
	 * @generated
	 * @ordered
	 */
	protected String oscMessage = OSC_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscScale() <em>Osc Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscScale()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscScale() <em>Osc Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscScale()
	 * @generated
	 * @ordered
	 */
	protected String oscScale = OSC_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscTarget() <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscTarget() <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscTarget()
	 * @generated
	 * @ordered
	 */
	protected String oscTarget = OSC_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscTrigger() <em>Osc Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscTrigger() <em>Osc Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscTrigger()
	 * @generated
	 * @ordered
	 */
	protected String oscTrigger = OSC_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSend() <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected String send = SEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabbar() <em>Tabbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabbar()
	 * @generated
	 * @ordered
	 */
	protected static final String TABBAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabbar() <em>Tabbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabbar()
	 * @generated
	 * @ordered
	 */
	protected String tabbar = TABBAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PARAMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmlPackage.Literals.PARAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSend() {
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend(String newSend) {
		String oldSend = send;
		send = newSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__SEND, oldSend, send));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOscTarget() {
		return oscTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscTarget(String newOscTarget) {
		String oldOscTarget = oscTarget;
		oscTarget = newOscTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__OSC_TARGET, oldOscTarget, oscTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOscTrigger() {
		return oscTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscTrigger(String newOscTrigger) {
		String oldOscTrigger = oscTrigger;
		oscTrigger = newOscTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__OSC_TRIGGER, oldOscTrigger, oscTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOscMessage() {
		return oscMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscMessage(String newOscMessage) {
		String oldOscMessage = oscMessage;
		oscMessage = newOscMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__OSC_MESSAGE, oldOscMessage, oscMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOscScale() {
		return oscScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscScale(String newOscScale) {
		String oldOscScale = oscScale;
		oscScale = newOscScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__OSC_SCALE, oldOscScale, oscScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMidiTarget() {
		return midiTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiTarget(String newMidiTarget) {
		String oldMidiTarget = midiTarget;
		midiTarget = newMidiTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__MIDI_TARGET, oldMidiTarget, midiTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMidiTrigger() {
		return midiTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiTrigger(String newMidiTrigger) {
		String oldMidiTrigger = midiTrigger;
		midiTrigger = newMidiTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__MIDI_TRIGGER, oldMidiTrigger, midiTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMidiMessage() {
		return midiMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiMessage(String newMidiMessage) {
		String oldMidiMessage = midiMessage;
		midiMessage = newMidiMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__MIDI_MESSAGE, oldMidiMessage, midiMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMidiScale() {
		return midiScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiScale(String newMidiScale) {
		String oldMidiScale = midiScale;
		midiScale = newMidiScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__MIDI_SCALE, oldMidiScale, midiScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKbmouseTarget() {
		return kbmouseTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKbmouseTarget(String newKbmouseTarget) {
		String oldKbmouseTarget = kbmouseTarget;
		kbmouseTarget = newKbmouseTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__KBMOUSE_TARGET, oldKbmouseTarget, kbmouseTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKbmouseTrigger() {
		return kbmouseTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKbmouseTrigger(String newKbmouseTrigger) {
		String oldKbmouseTrigger = kbmouseTrigger;
		kbmouseTrigger = newKbmouseTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__KBMOUSE_TRIGGER, oldKbmouseTrigger, kbmouseTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKbmouseMessage() {
		return kbmouseMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKbmouseMessage(String newKbmouseMessage) {
		String oldKbmouseMessage = kbmouseMessage;
		kbmouseMessage = newKbmouseMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__KBMOUSE_MESSAGE, oldKbmouseMessage, kbmouseMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKbmouseScale() {
		return kbmouseScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKbmouseScale(String newKbmouseScale) {
		String oldKbmouseScale = kbmouseScale;
		kbmouseScale = newKbmouseScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__KBMOUSE_SCALE, oldKbmouseScale, kbmouseScale));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabbar() {
		return tabbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabbar(String newTabbar) {
		String oldTabbar = tabbar;
		tabbar = newTabbar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__TABBAR, oldTabbar, tabbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(String newMeta) {
		String oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__META, oldMeta, meta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PARAM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JzmlPackage.PARAM__COLOR:
				return getColor();
			case JzmlPackage.PARAM__ID:
				return getId();
			case JzmlPackage.PARAM__KBMOUSE_MESSAGE:
				return getKbmouseMessage();
			case JzmlPackage.PARAM__KBMOUSE_SCALE:
				return getKbmouseScale();
			case JzmlPackage.PARAM__KBMOUSE_TARGET:
				return getKbmouseTarget();
			case JzmlPackage.PARAM__KBMOUSE_TRIGGER:
				return getKbmouseTrigger();
			case JzmlPackage.PARAM__LABEL:
				return getLabel();
			case JzmlPackage.PARAM__META:
				return getMeta();
			case JzmlPackage.PARAM__MIDI_MESSAGE:
				return getMidiMessage();
			case JzmlPackage.PARAM__MIDI_SCALE:
				return getMidiScale();
			case JzmlPackage.PARAM__MIDI_TARGET:
				return getMidiTarget();
			case JzmlPackage.PARAM__MIDI_TRIGGER:
				return getMidiTrigger();
			case JzmlPackage.PARAM__NAME:
				return getName();
			case JzmlPackage.PARAM__OSC_MESSAGE:
				return getOscMessage();
			case JzmlPackage.PARAM__OSC_SCALE:
				return getOscScale();
			case JzmlPackage.PARAM__OSC_TARGET:
				return getOscTarget();
			case JzmlPackage.PARAM__OSC_TRIGGER:
				return getOscTrigger();
			case JzmlPackage.PARAM__SEND:
				return getSend();
			case JzmlPackage.PARAM__TABBAR:
				return getTabbar();
			case JzmlPackage.PARAM__VALUE:
				return getValue();
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
			case JzmlPackage.PARAM__COLOR:
				setColor((String)newValue);
				return;
			case JzmlPackage.PARAM__ID:
				setId((String)newValue);
				return;
			case JzmlPackage.PARAM__KBMOUSE_MESSAGE:
				setKbmouseMessage((String)newValue);
				return;
			case JzmlPackage.PARAM__KBMOUSE_SCALE:
				setKbmouseScale((String)newValue);
				return;
			case JzmlPackage.PARAM__KBMOUSE_TARGET:
				setKbmouseTarget((String)newValue);
				return;
			case JzmlPackage.PARAM__KBMOUSE_TRIGGER:
				setKbmouseTrigger((String)newValue);
				return;
			case JzmlPackage.PARAM__LABEL:
				setLabel((String)newValue);
				return;
			case JzmlPackage.PARAM__META:
				setMeta((String)newValue);
				return;
			case JzmlPackage.PARAM__MIDI_MESSAGE:
				setMidiMessage((String)newValue);
				return;
			case JzmlPackage.PARAM__MIDI_SCALE:
				setMidiScale((String)newValue);
				return;
			case JzmlPackage.PARAM__MIDI_TARGET:
				setMidiTarget((String)newValue);
				return;
			case JzmlPackage.PARAM__MIDI_TRIGGER:
				setMidiTrigger((String)newValue);
				return;
			case JzmlPackage.PARAM__NAME:
				setName((String)newValue);
				return;
			case JzmlPackage.PARAM__OSC_MESSAGE:
				setOscMessage((String)newValue);
				return;
			case JzmlPackage.PARAM__OSC_SCALE:
				setOscScale((String)newValue);
				return;
			case JzmlPackage.PARAM__OSC_TARGET:
				setOscTarget((String)newValue);
				return;
			case JzmlPackage.PARAM__OSC_TRIGGER:
				setOscTrigger((String)newValue);
				return;
			case JzmlPackage.PARAM__SEND:
				setSend((String)newValue);
				return;
			case JzmlPackage.PARAM__TABBAR:
				setTabbar((String)newValue);
				return;
			case JzmlPackage.PARAM__VALUE:
				setValue((String)newValue);
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
			case JzmlPackage.PARAM__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case JzmlPackage.PARAM__ID:
				setId(ID_EDEFAULT);
				return;
			case JzmlPackage.PARAM__KBMOUSE_MESSAGE:
				setKbmouseMessage(KBMOUSE_MESSAGE_EDEFAULT);
				return;
			case JzmlPackage.PARAM__KBMOUSE_SCALE:
				setKbmouseScale(KBMOUSE_SCALE_EDEFAULT);
				return;
			case JzmlPackage.PARAM__KBMOUSE_TARGET:
				setKbmouseTarget(KBMOUSE_TARGET_EDEFAULT);
				return;
			case JzmlPackage.PARAM__KBMOUSE_TRIGGER:
				setKbmouseTrigger(KBMOUSE_TRIGGER_EDEFAULT);
				return;
			case JzmlPackage.PARAM__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case JzmlPackage.PARAM__META:
				setMeta(META_EDEFAULT);
				return;
			case JzmlPackage.PARAM__MIDI_MESSAGE:
				setMidiMessage(MIDI_MESSAGE_EDEFAULT);
				return;
			case JzmlPackage.PARAM__MIDI_SCALE:
				setMidiScale(MIDI_SCALE_EDEFAULT);
				return;
			case JzmlPackage.PARAM__MIDI_TARGET:
				setMidiTarget(MIDI_TARGET_EDEFAULT);
				return;
			case JzmlPackage.PARAM__MIDI_TRIGGER:
				setMidiTrigger(MIDI_TRIGGER_EDEFAULT);
				return;
			case JzmlPackage.PARAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JzmlPackage.PARAM__OSC_MESSAGE:
				setOscMessage(OSC_MESSAGE_EDEFAULT);
				return;
			case JzmlPackage.PARAM__OSC_SCALE:
				setOscScale(OSC_SCALE_EDEFAULT);
				return;
			case JzmlPackage.PARAM__OSC_TARGET:
				setOscTarget(OSC_TARGET_EDEFAULT);
				return;
			case JzmlPackage.PARAM__OSC_TRIGGER:
				setOscTrigger(OSC_TRIGGER_EDEFAULT);
				return;
			case JzmlPackage.PARAM__SEND:
				setSend(SEND_EDEFAULT);
				return;
			case JzmlPackage.PARAM__TABBAR:
				setTabbar(TABBAR_EDEFAULT);
				return;
			case JzmlPackage.PARAM__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case JzmlPackage.PARAM__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case JzmlPackage.PARAM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JzmlPackage.PARAM__KBMOUSE_MESSAGE:
				return KBMOUSE_MESSAGE_EDEFAULT == null ? kbmouseMessage != null : !KBMOUSE_MESSAGE_EDEFAULT.equals(kbmouseMessage);
			case JzmlPackage.PARAM__KBMOUSE_SCALE:
				return KBMOUSE_SCALE_EDEFAULT == null ? kbmouseScale != null : !KBMOUSE_SCALE_EDEFAULT.equals(kbmouseScale);
			case JzmlPackage.PARAM__KBMOUSE_TARGET:
				return KBMOUSE_TARGET_EDEFAULT == null ? kbmouseTarget != null : !KBMOUSE_TARGET_EDEFAULT.equals(kbmouseTarget);
			case JzmlPackage.PARAM__KBMOUSE_TRIGGER:
				return KBMOUSE_TRIGGER_EDEFAULT == null ? kbmouseTrigger != null : !KBMOUSE_TRIGGER_EDEFAULT.equals(kbmouseTrigger);
			case JzmlPackage.PARAM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case JzmlPackage.PARAM__META:
				return META_EDEFAULT == null ? meta != null : !META_EDEFAULT.equals(meta);
			case JzmlPackage.PARAM__MIDI_MESSAGE:
				return MIDI_MESSAGE_EDEFAULT == null ? midiMessage != null : !MIDI_MESSAGE_EDEFAULT.equals(midiMessage);
			case JzmlPackage.PARAM__MIDI_SCALE:
				return MIDI_SCALE_EDEFAULT == null ? midiScale != null : !MIDI_SCALE_EDEFAULT.equals(midiScale);
			case JzmlPackage.PARAM__MIDI_TARGET:
				return MIDI_TARGET_EDEFAULT == null ? midiTarget != null : !MIDI_TARGET_EDEFAULT.equals(midiTarget);
			case JzmlPackage.PARAM__MIDI_TRIGGER:
				return MIDI_TRIGGER_EDEFAULT == null ? midiTrigger != null : !MIDI_TRIGGER_EDEFAULT.equals(midiTrigger);
			case JzmlPackage.PARAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JzmlPackage.PARAM__OSC_MESSAGE:
				return OSC_MESSAGE_EDEFAULT == null ? oscMessage != null : !OSC_MESSAGE_EDEFAULT.equals(oscMessage);
			case JzmlPackage.PARAM__OSC_SCALE:
				return OSC_SCALE_EDEFAULT == null ? oscScale != null : !OSC_SCALE_EDEFAULT.equals(oscScale);
			case JzmlPackage.PARAM__OSC_TARGET:
				return OSC_TARGET_EDEFAULT == null ? oscTarget != null : !OSC_TARGET_EDEFAULT.equals(oscTarget);
			case JzmlPackage.PARAM__OSC_TRIGGER:
				return OSC_TRIGGER_EDEFAULT == null ? oscTrigger != null : !OSC_TRIGGER_EDEFAULT.equals(oscTrigger);
			case JzmlPackage.PARAM__SEND:
				return SEND_EDEFAULT == null ? send != null : !SEND_EDEFAULT.equals(send);
			case JzmlPackage.PARAM__TABBAR:
				return TABBAR_EDEFAULT == null ? tabbar != null : !TABBAR_EDEFAULT.equals(tabbar);
			case JzmlPackage.PARAM__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (color: ");
		result.append(color);
		result.append(", id: ");
		result.append(id);
		result.append(", kbmouseMessage: ");
		result.append(kbmouseMessage);
		result.append(", kbmouseScale: ");
		result.append(kbmouseScale);
		result.append(", kbmouseTarget: ");
		result.append(kbmouseTarget);
		result.append(", kbmouseTrigger: ");
		result.append(kbmouseTrigger);
		result.append(", label: ");
		result.append(label);
		result.append(", meta: ");
		result.append(meta);
		result.append(", midiMessage: ");
		result.append(midiMessage);
		result.append(", midiScale: ");
		result.append(midiScale);
		result.append(", midiTarget: ");
		result.append(midiTarget);
		result.append(", midiTrigger: ");
		result.append(midiTrigger);
		result.append(", name: ");
		result.append(name);
		result.append(", oscMessage: ");
		result.append(oscMessage);
		result.append(", oscScale: ");
		result.append(oscScale);
		result.append(", oscTarget: ");
		result.append(oscTarget);
		result.append(", oscTrigger: ");
		result.append(oscTrigger);
		result.append(", send: ");
		result.append(send);
		result.append(", tabbar: ");
		result.append(tabbar);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //PARAMImpl
