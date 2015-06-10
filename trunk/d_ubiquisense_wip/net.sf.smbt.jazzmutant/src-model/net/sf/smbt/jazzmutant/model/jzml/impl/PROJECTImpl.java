/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PROJECT;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PROJECT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getKbmouseTarget <em>Kbmouse Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getMidiTarget <em>Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getOscTarget <em>Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getStartpage <em>Startpage</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getWelcometext <em>Welcometext</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.PROJECTImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PROJECTImpl extends MinimalEObjectImpl.Container implements PROJECT {
	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getStartpage() <em>Startpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartpage()
	 * @generated
	 * @ordered
	 */
	protected static final String STARTPAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartpage() <em>Startpage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartpage()
	 * @generated
	 * @ordered
	 */
	protected String startpage = STARTPAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getWelcometext() <em>Welcometext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcometext()
	 * @generated
	 * @ordered
	 */
	protected static final String WELCOMETEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWelcometext() <em>Welcometext</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcometext()
	 * @generated
	 * @ordered
	 */
	protected String welcometext = WELCOMETEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PROJECTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmlPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__VERSION, oldVersion, version));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__OSC_TARGET, oldOscTarget, oscTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__MIDI_TARGET, oldMidiTarget, midiTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__KBMOUSE_TARGET, oldKbmouseTarget, kbmouseTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartpage() {
		return startpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartpage(String newStartpage) {
		String oldStartpage = startpage;
		startpage = newStartpage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__STARTPAGE, oldStartpage, startpage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWelcometext() {
		return welcometext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcometext(String newWelcometext) {
		String oldWelcometext = welcometext;
		welcometext = newWelcometext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__WELCOMETEXT, oldWelcometext, welcometext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.PROJECT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JzmlPackage.PROJECT__HEIGHT:
				return getHeight();
			case JzmlPackage.PROJECT__ID:
				return getId();
			case JzmlPackage.PROJECT__KBMOUSE_TARGET:
				return getKbmouseTarget();
			case JzmlPackage.PROJECT__MIDI_TARGET:
				return getMidiTarget();
			case JzmlPackage.PROJECT__NAME:
				return getName();
			case JzmlPackage.PROJECT__OSC_TARGET:
				return getOscTarget();
			case JzmlPackage.PROJECT__STARTPAGE:
				return getStartpage();
			case JzmlPackage.PROJECT__TITLE:
				return getTitle();
			case JzmlPackage.PROJECT__VERSION:
				return getVersion();
			case JzmlPackage.PROJECT__WELCOMETEXT:
				return getWelcometext();
			case JzmlPackage.PROJECT__WIDTH:
				return getWidth();
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
			case JzmlPackage.PROJECT__HEIGHT:
				setHeight((String)newValue);
				return;
			case JzmlPackage.PROJECT__ID:
				setId((String)newValue);
				return;
			case JzmlPackage.PROJECT__KBMOUSE_TARGET:
				setKbmouseTarget((String)newValue);
				return;
			case JzmlPackage.PROJECT__MIDI_TARGET:
				setMidiTarget((String)newValue);
				return;
			case JzmlPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case JzmlPackage.PROJECT__OSC_TARGET:
				setOscTarget((String)newValue);
				return;
			case JzmlPackage.PROJECT__STARTPAGE:
				setStartpage((String)newValue);
				return;
			case JzmlPackage.PROJECT__TITLE:
				setTitle((String)newValue);
				return;
			case JzmlPackage.PROJECT__VERSION:
				setVersion((String)newValue);
				return;
			case JzmlPackage.PROJECT__WELCOMETEXT:
				setWelcometext((String)newValue);
				return;
			case JzmlPackage.PROJECT__WIDTH:
				setWidth((String)newValue);
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
			case JzmlPackage.PROJECT__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__ID:
				setId(ID_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__KBMOUSE_TARGET:
				setKbmouseTarget(KBMOUSE_TARGET_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__MIDI_TARGET:
				setMidiTarget(MIDI_TARGET_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__OSC_TARGET:
				setOscTarget(OSC_TARGET_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__STARTPAGE:
				setStartpage(STARTPAGE_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__WELCOMETEXT:
				setWelcometext(WELCOMETEXT_EDEFAULT);
				return;
			case JzmlPackage.PROJECT__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case JzmlPackage.PROJECT__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case JzmlPackage.PROJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JzmlPackage.PROJECT__KBMOUSE_TARGET:
				return KBMOUSE_TARGET_EDEFAULT == null ? kbmouseTarget != null : !KBMOUSE_TARGET_EDEFAULT.equals(kbmouseTarget);
			case JzmlPackage.PROJECT__MIDI_TARGET:
				return MIDI_TARGET_EDEFAULT == null ? midiTarget != null : !MIDI_TARGET_EDEFAULT.equals(midiTarget);
			case JzmlPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JzmlPackage.PROJECT__OSC_TARGET:
				return OSC_TARGET_EDEFAULT == null ? oscTarget != null : !OSC_TARGET_EDEFAULT.equals(oscTarget);
			case JzmlPackage.PROJECT__STARTPAGE:
				return STARTPAGE_EDEFAULT == null ? startpage != null : !STARTPAGE_EDEFAULT.equals(startpage);
			case JzmlPackage.PROJECT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case JzmlPackage.PROJECT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case JzmlPackage.PROJECT__WELCOMETEXT:
				return WELCOMETEXT_EDEFAULT == null ? welcometext != null : !WELCOMETEXT_EDEFAULT.equals(welcometext);
			case JzmlPackage.PROJECT__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", kbmouseTarget: ");
		result.append(kbmouseTarget);
		result.append(", midiTarget: ");
		result.append(midiTarget);
		result.append(", name: ");
		result.append(name);
		result.append(", oscTarget: ");
		result.append(oscTarget);
		result.append(", startpage: ");
		result.append(startpage);
		result.append(", title: ");
		result.append(title);
		result.append(", version: ");
		result.append(version);
		result.append(", welcometext: ");
		result.append(welcometext);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //PROJECTImpl
