/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import java.util.List;

import net.sf.smbt.ezabletonctrl.AbletonLive;
import net.sf.smbt.ezabletonctrl.ControlSurface;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ezabletonctrl.LiveMaster;
import net.sf.smbt.ezabletonctrl.LiveScene;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ezabletonctrl.MASTER_CTRL;
import net.sf.xqz.model.engine.CmdPipe;
import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ableton Live</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getEngines <em>Engines</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getVer <em>Ver</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getMasterTrack <em>Master Track</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getScenes <em>Scenes</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getClips <em>Clips</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getCurrentScene <em>Current Scene</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getState <em>State</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#isOverdub <em>Overdub</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getTime <em>Time</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getTempo <em>Tempo</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#isUbqtNotificationOn <em>Ubqt Notification On</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.AbletonLiveImpl#getControlSurfaces <em>Control Surfaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbletonLiveImpl extends MinimalEObjectImpl.Container implements AbletonLive {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbletonLiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.ABLETON_LIVE;
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
	@SuppressWarnings("unchecked")
	public List<CmdPipe> getEngines() {
		return (List<CmdPipe>)eGet(EnginePackage.Literals.ICONNECTED_UNIT__ENGINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVer() {
		return (String)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__VER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVer(String newVer) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__VER, newVer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiveTrack> getTracks() {
		return (EList<LiveTrack>)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__TRACKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiveScene> getScenes() {
		return (EList<LiveScene>)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__SCENES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<LiveClip> getClips() {
		return (EList<LiveClip>)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__CLIPS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveScene getCurrentScene() {
		return (LiveScene)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__CURRENT_SCENE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentScene(LiveScene newCurrentScene) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__CURRENT_SCENE, newCurrentScene);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveMaster getMasterTrack() {
		return (LiveMaster)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__MASTER_TRACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterTrack(LiveMaster newMasterTrack) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__MASTER_TRACK, newMasterTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MASTER_CTRL getState() {
		return (MASTER_CTRL)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(MASTER_CTRL newState) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__STATE, newState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOverdub() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__OVERDUB, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOverdub(boolean newOverdub) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__OVERDUB, newOverdub);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getVolume() {
		return (Float)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__VOLUME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(float newVolume) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__VOLUME, newVolume);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTime() {
		return (Long)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__TIME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(long newTime) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__TIME, newTime);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTempo() {
		return (Float)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__TEMPO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTempo(float newTempo) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__TEMPO, newTempo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdPipe getDefault() {
		return (CmdPipe)eGet(EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(CmdPipe newDefault) {
		eSet(EnginePackage.Literals.ICONNECTED_UNIT__DEFAULT, newDefault);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUbqtNotificationOn() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__UBQT_NOTIFICATION_ON, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUbqtNotificationOn(boolean newUbqtNotificationOn) {
		eSet(EzabletonctrlPackage.Literals.ABLETON_LIVE__UBQT_NOTIFICATION_ON, newUbqtNotificationOn);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ControlSurface> getControlSurfaces() {
		return (EList<ControlSurface>)eGet(EzabletonctrlPackage.Literals.ABLETON_LIVE__CONTROL_SURFACES, true);
	}

} //AbletonLiveImpl
