/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.wiimotectrl.impl;

import java.util.Collection;
import java.util.List;

import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings;
import net.sf.smbt.wiimotectrl.WiimoteController;
import net.sf.smbt.wiimotectrl.WiimotectrlPackage;
import net.sf.xqz.model.engine.CmdPipe;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wiimote Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl#getWiiid <em>Wiiid</em>}</li>
 *   <li>{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.wiimotectrl.impl.WiimoteControllerImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WiimoteControllerImpl extends MinimalEObjectImpl.Container implements WiimoteController {
	/**
	 * The cached value of the '{@link #getEngines() <em>Engines</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEngines()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdPipe> engines;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected CmdPipe default_;

	/**
	 * The default value of the '{@link #getWiiid() <em>Wiiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiiid()
	 * @generated
	 * @ordered
	 */
	protected static final String WIIID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWiiid() <em>Wiiid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWiiid()
	 * @generated
	 * @ordered
	 */
	protected String wiiid = WIIID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddr()
	 * @generated
	 * @ordered
	 */
	protected String addr = ADDR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected WiimoteLiveSettings properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WiimoteControllerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WiimotectrlPackage.Literals.WIIMOTE_CONTROLLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<CmdPipe> getEngines() {
		if (engines == null) {
			engines = new EObjectResolvingEList<CmdPipe>(CmdPipe.class, this, WiimotectrlPackage.WIIMOTE_CONTROLLER__ENGINES);
		}
		return engines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		if (default_ != null && default_.eIsProxy()) {
			InternalEObject oldDefault = (InternalEObject)default_;
			default_ = (CmdPipe)eResolveProxy(oldDefault);
			if (default_ != oldDefault) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WiimotectrlPackage.WIIMOTE_CONTROLLER__DEFAULT, oldDefault, default_));
			}
		}
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		CmdPipe oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiimotectrlPackage.WIIMOTE_CONTROLLER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWiiid() {
		return wiiid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWiiid(String newWiiid) {
		String oldWiiid = wiiid;
		wiiid = newWiiid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiimotectrlPackage.WIIMOTE_CONTROLLER__WIIID, oldWiiid, wiiid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return addr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		String oldAddr = addr;
		addr = newAddr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiimotectrlPackage.WIIMOTE_CONTROLLER__ADDR, oldAddr, addr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteLiveSettings getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(WiimoteLiveSettings newProperties, NotificationChain msgs) {
		WiimoteLiveSettings oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(WiimoteLiveSettings newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES, null, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES, null, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES:
				return basicSetProperties(null, msgs);
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
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ENGINES:
				return getEngines();
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__DEFAULT:
				return getDefault();
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__WIIID:
				return getWiiid();
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ADDR:
				return getAddr();
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES:
				return getProperties();
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
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ENGINES:
				getEngines().clear();
				getEngines().addAll((Collection<? extends CmdPipe>)newValue);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__DEFAULT:
				setDefault((CmdPipe)newValue);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__WIIID:
				setWiiid((String)newValue);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ADDR:
				setAddr((String)newValue);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES:
				setProperties((WiimoteLiveSettings)newValue);
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
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ENGINES:
				getEngines().clear();
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__DEFAULT:
				setDefault((CmdPipe)null);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__WIIID:
				setWiiid(WIIID_EDEFAULT);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ADDR:
				setAddr(ADDR_EDEFAULT);
				return;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES:
				setProperties((WiimoteLiveSettings)null);
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
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ENGINES:
				return engines != null && !engines.isEmpty();
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__DEFAULT:
				return default_ != null;
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__WIIID:
				return WIIID_EDEFAULT == null ? wiiid != null : !WIIID_EDEFAULT.equals(wiiid);
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__ADDR:
				return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
			case WiimotectrlPackage.WIIMOTE_CONTROLLER__PROPERTIES:
				return properties != null;
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
		result.append(" (wiiid: ");
		result.append(wiiid);
		result.append(", addr: ");
		result.append(addr);
		result.append(')');
		return result.toString();
	}

} //WiimoteControllerImpl
