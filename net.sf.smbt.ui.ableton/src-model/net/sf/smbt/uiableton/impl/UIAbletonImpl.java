/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton.impl;

import java.util.Collection;

import net.sf.smbt.uiableton.UIAbleton;
import net.sf.smbt.uiableton.UIAbletonClip;
import net.sf.smbt.uiableton.UIAbletonMasterTrack;
import net.sf.smbt.uiableton.UIAbletonScene;
import net.sf.smbt.uiableton.UIAbletonTrack;
import net.sf.smbt.uiableton.UiabletonPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Ableton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonImpl#getMasterTrack <em>Master Track</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.impl.UIAbletonImpl#getScenes <em>Scenes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIAbletonImpl extends EObjectImpl implements UIAbleton {
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAbletonTrack> tracks;

	/**
	 * The cached value of the '{@link #getMasterTrack() <em>Master Track</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterTrack()
	 * @generated
	 * @ordered
	 */
	protected UIAbletonMasterTrack masterTrack;

	/**
	 * The cached value of the '{@link #getClips() <em>Clips</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClips()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAbletonClip> clips;

	/**
	 * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenes()
	 * @generated
	 * @ordered
	 */
	protected EList<UIAbletonScene> scenes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIAbletonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiabletonPackage.Literals.UI_ABLETON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAbletonTrack> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<UIAbletonTrack>(UIAbletonTrack.class, this, UiabletonPackage.UI_ABLETON__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIAbletonMasterTrack getMasterTrack() {
		return masterTrack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterTrack(UIAbletonMasterTrack newMasterTrack, NotificationChain msgs) {
		UIAbletonMasterTrack oldMasterTrack = masterTrack;
		masterTrack = newMasterTrack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UiabletonPackage.UI_ABLETON__MASTER_TRACK, oldMasterTrack, newMasterTrack);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterTrack(UIAbletonMasterTrack newMasterTrack) {
		if (newMasterTrack != masterTrack) {
			NotificationChain msgs = null;
			if (masterTrack != null)
				msgs = ((InternalEObject)masterTrack).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UiabletonPackage.UI_ABLETON__MASTER_TRACK, null, msgs);
			if (newMasterTrack != null)
				msgs = ((InternalEObject)newMasterTrack).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UiabletonPackage.UI_ABLETON__MASTER_TRACK, null, msgs);
			msgs = basicSetMasterTrack(newMasterTrack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiabletonPackage.UI_ABLETON__MASTER_TRACK, newMasterTrack, newMasterTrack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAbletonClip> getClips() {
		if (clips == null) {
			clips = new EObjectContainmentEList<UIAbletonClip>(UIAbletonClip.class, this, UiabletonPackage.UI_ABLETON__CLIPS);
		}
		return clips;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UIAbletonScene> getScenes() {
		if (scenes == null) {
			scenes = new EObjectContainmentEList<UIAbletonScene>(UIAbletonScene.class, this, UiabletonPackage.UI_ABLETON__SCENES);
		}
		return scenes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UiabletonPackage.UI_ABLETON__TRACKS:
				return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
			case UiabletonPackage.UI_ABLETON__MASTER_TRACK:
				return basicSetMasterTrack(null, msgs);
			case UiabletonPackage.UI_ABLETON__CLIPS:
				return ((InternalEList<?>)getClips()).basicRemove(otherEnd, msgs);
			case UiabletonPackage.UI_ABLETON__SCENES:
				return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
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
			case UiabletonPackage.UI_ABLETON__TRACKS:
				return getTracks();
			case UiabletonPackage.UI_ABLETON__MASTER_TRACK:
				return getMasterTrack();
			case UiabletonPackage.UI_ABLETON__CLIPS:
				return getClips();
			case UiabletonPackage.UI_ABLETON__SCENES:
				return getScenes();
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
			case UiabletonPackage.UI_ABLETON__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends UIAbletonTrack>)newValue);
				return;
			case UiabletonPackage.UI_ABLETON__MASTER_TRACK:
				setMasterTrack((UIAbletonMasterTrack)newValue);
				return;
			case UiabletonPackage.UI_ABLETON__CLIPS:
				getClips().clear();
				getClips().addAll((Collection<? extends UIAbletonClip>)newValue);
				return;
			case UiabletonPackage.UI_ABLETON__SCENES:
				getScenes().clear();
				getScenes().addAll((Collection<? extends UIAbletonScene>)newValue);
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
			case UiabletonPackage.UI_ABLETON__TRACKS:
				getTracks().clear();
				return;
			case UiabletonPackage.UI_ABLETON__MASTER_TRACK:
				setMasterTrack((UIAbletonMasterTrack)null);
				return;
			case UiabletonPackage.UI_ABLETON__CLIPS:
				getClips().clear();
				return;
			case UiabletonPackage.UI_ABLETON__SCENES:
				getScenes().clear();
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
			case UiabletonPackage.UI_ABLETON__TRACKS:
				return tracks != null && !tracks.isEmpty();
			case UiabletonPackage.UI_ABLETON__MASTER_TRACK:
				return masterTrack != null;
			case UiabletonPackage.UI_ABLETON__CLIPS:
				return clips != null && !clips.isEmpty();
			case UiabletonPackage.UI_ABLETON__SCENES:
				return scenes != null && !scenes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UIAbletonImpl
