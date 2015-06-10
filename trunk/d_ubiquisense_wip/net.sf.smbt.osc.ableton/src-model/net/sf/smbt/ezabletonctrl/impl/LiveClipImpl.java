/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl.impl;

import net.sf.smbt.ezableton.CLIP_STATE;
import net.sf.smbt.ezabletonctrl.EzabletonctrlPackage;
import net.sf.smbt.ezabletonctrl.LiveClip;
import net.sf.smbt.ezabletonctrl.LiveTrack;
import net.sf.smbt.ezabletonctrl.MASTER_CTRL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Live Clip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getClipID <em>Clip ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getClipName <em>Clip Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getClipState <em>Clip State</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getSizeX <em>Size X</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getCoarse <em>Coarse</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getFine <em>Fine</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getLoopStart <em>Loop Start</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getLoopEnd <em>Loop End</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getTrack <em>Track</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#isIsAudioClip <em>Is Audio Clip</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#isIsMidiClip <em>Is Midi Clip</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#isIsTriggered <em>Is Triggered</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getPlayingStatus <em>Playing Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#isNotes <em>Notes</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getSignature_denominator <em>Signature denominator</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getSignature_numerator <em>Signature numerator</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#isWarping <em>Warping</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#isWill_recording_on_start <em>Will recording on start</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.impl.LiveClipImpl#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiveClipImpl extends MinimalEObjectImpl.Container implements LiveClip {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiveClipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzabletonctrlPackage.Literals.LIVE_CLIP;
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
	public int getClipID() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipID(int newClipID) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_ID, newClipID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClipName() {
		return (String)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipName(String newClipName) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_NAME, newClipName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CLIP_STATE getClipState() {
		return (CLIP_STATE)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClipState(CLIP_STATE newClipState) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__CLIP_STATE, newClipState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeX() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIZE_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeX(int newSizeX) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIZE_X, newSizeX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeY() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIZE_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeY(int newSizeY) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIZE_Y, newSizeY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCoarse() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__COARSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoarse(int newCoarse) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__COARSE, newCoarse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFine() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__FINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFine(int newFine) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__FINE, newFine);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getPosition() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(float newPosition) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLength() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__LENGTH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLength(float newLength) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__LENGTH, newLength);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoopStart() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__LOOP_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopStart(float newLoopStart) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__LOOP_START, newLoopStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getLoopEnd() {
		return (Float)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__LOOP_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopEnd(float newLoopEnd) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__LOOP_END, newLoopEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiveTrack getTrack() {
		return (LiveTrack)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__TRACK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrack(LiveTrack newTrack) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__TRACK, newTrack);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getLastSeen() {
		return (Long)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__LAST_SEEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastSeen(long newLastSeen) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__LAST_SEEN, newLastSeen);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAudioClip() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__IS_AUDIO_CLIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAudioClip(boolean newIsAudioClip) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__IS_AUDIO_CLIP, newIsAudioClip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsMidiClip() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__IS_MIDI_CLIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMidiClip(boolean newIsMidiClip) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__IS_MIDI_CLIP, newIsMidiClip);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsTriggered() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__IS_TRIGGERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTriggered(boolean newIsTriggered) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__IS_TRIGGERED, newIsTriggered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MASTER_CTRL getPlayingStatus() {
		return (MASTER_CTRL)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__PLAYING_STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayingStatus(MASTER_CTRL newPlayingStatus) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__PLAYING_STATUS, newPlayingStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNotes() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__NOTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(boolean newNotes) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__NOTES, newNotes);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignature_denominator() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIGNATURE_DENOMINATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature_denominator(int newSignature_denominator) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIGNATURE_DENOMINATOR, newSignature_denominator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSignature_numerator() {
		return (Integer)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIGNATURE_NUMERATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature_numerator(int newSignature_numerator) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__SIGNATURE_NUMERATOR, newSignature_numerator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWarping() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__WARPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarping(boolean newWarping) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__WARPING, newWarping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWill_recording_on_start() {
		return (Boolean)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__WILL_RECORDING_ON_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWill_recording_on_start(boolean newWill_recording_on_start) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__WILL_RECORDING_ON_START, newWill_recording_on_start);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getColor() {
		return (Color)eGet(EzabletonctrlPackage.Literals.LIVE_CLIP__COLOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(Color newColor) {
		eSet(EzabletonctrlPackage.Literals.LIVE_CLIP__COLOR, newColor);
	}

} //LiveClipImpl
