/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezableton.TRACK_ARM_STATUS;
import net.sf.smbt.ezableton.TRACK_MUTE_STATUS;
import net.sf.smbt.ezableton.TRACK_SOLO_STATUS;
import net.sf.smbt.ezabletonctrl.AbstractLiveDevice;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ezabletonctrl.LiveTrackView;
import net.sf.smbt.ezabletonctrl.TRACK_CONTROL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getTrackID <em>Track ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getSolo <em>Solo</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getSend <em>Send</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getArm <em>Arm</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getMute <em>Mute</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getDelay <em>Delay</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getCoarse <em>Coarse</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getFine <em>Fine</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getBeats <em>Beats</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getState <em>State</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getTrackName <em>Track Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getLeftMeter <em>Left Meter</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getRightMeter <em>Right Meter</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveTrackImpl#getView <em>View</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveTrackImpl extends MinimalEObjectImpl.Container implements LiveTrack {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveTrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.LIVE_TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrackID() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__TRACK_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackID(int newTrackID) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__TRACK_ID, newTrackID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVolume() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__VOLUME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(float newVolume) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__VOLUME, newVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPan() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__PAN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPan(float newPan) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__PAN, newPan);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_SOLO_STATUS getSolo() {
		return (TRACK_SOLO_STATUS)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__SOLO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolo(TRACK_SOLO_STATUS newSolo) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__SOLO, newSolo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSend() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__SEND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend(int newSend) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__SEND, newSend);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_ARM_STATUS getArm() {
		return (TRACK_ARM_STATUS)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__ARM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArm(TRACK_ARM_STATUS newArm) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__ARM, newArm);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_MUTE_STATUS getMute() {
		return (TRACK_MUTE_STATUS)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__MUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMute(TRACK_MUTE_STATUS newMute) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__MUTE, newMute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDelay() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__DELAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelay(float newDelay) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__DELAY, newDelay);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoarse() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__COARSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoarse(int newCoarse) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__COARSE, newCoarse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFine() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__FINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFine(int newFine) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__FINE, newFine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBeats() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__BEATS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeats(float newBeats) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__BEATS, newBeats);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<AbstractLiveDevice> getDevices() {
		return (EList<AbstractLiveDevice>)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__DEVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRACK_CONTROL getState() {
		return (TRACK_CONTROL)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(TRACK_CONTROL newState) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiveClip> getClips() {
		return (EList<LiveClip>)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__CLIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrackName() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__TRACK_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrackName(String newTrackName) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__TRACK_NAME, newTrackName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getColor() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(int newColor) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLeftMeter() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__LEFT_METER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftMeter(float newLeftMeter) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__LEFT_METER, newLeftMeter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRightMeter() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__RIGHT_METER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightMeter(float newRightMeter) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__RIGHT_METER, newRightMeter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastSeen() {
		return (Long)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__LAST_SEEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSeen(long newLastSeen) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__LAST_SEEN, newLastSeen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrackView getView() {
		return (LiveTrackView)eGet(EzabletonctrlPackage.Literals.LIVE_TRACK__VIEW, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setView(LiveTrackView newView) {
		eSet(EzabletonctrlPackage.Literals.LIVE_TRACK__VIEW, newView);
	}

} //LiveTrackImpl
