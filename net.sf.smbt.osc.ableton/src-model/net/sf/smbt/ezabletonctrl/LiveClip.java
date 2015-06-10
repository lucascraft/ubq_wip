/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezabletonctrl;

import net.sf.smbt.ezableton.CLIP_STATE;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Live Clip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipID <em>Clip ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipName <em>Clip Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipState <em>Clip State</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getSizeX <em>Size X</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getSizeY <em>Size Y</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getCoarse <em>Coarse</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getFine <em>Fine</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getPosition <em>Position</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getLength <em>Length</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getLoopStart <em>Loop Start</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getLoopEnd <em>Loop End</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getTrack <em>Track</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsAudioClip <em>Is Audio Clip</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsMidiClip <em>Is Midi Clip</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsTriggered <em>Is Triggered</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getPlayingStatus <em>Playing Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#isNotes <em>Notes</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getSignature_denominator <em>Signature denominator</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getSignature_numerator <em>Signature numerator</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#isWarping <em>Warping</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#isWill_recording_on_start <em>Will recording on start</em>}</li>
 *   <li>{@link net.sf.smbt.ezabletonctrl.LiveClip#getColor <em>Color</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip()
 * @model
 * @generated
 */
public interface LiveClip extends EObject {
	/**
	 * Returns the value of the '<em><b>Clip ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip ID</em>' attribute.
	 * @see #setClipID(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_ClipID()
	 * @model
	 * @generated
	 */
	int getClipID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipID <em>Clip ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip ID</em>' attribute.
	 * @see #getClipID()
	 * @generated
	 */
	void setClipID(int value);

	/**
	 * Returns the value of the '<em><b>Clip Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip Name</em>' attribute.
	 * @see #setClipName(String)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_ClipName()
	 * @model
	 * @generated
	 */
	String getClipName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipName <em>Clip Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip Name</em>' attribute.
	 * @see #getClipName()
	 * @generated
	 */
	void setClipName(String value);

	/**
	 * Returns the value of the '<em><b>Clip State</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezableton.CLIP_STATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clip State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clip State</em>' attribute.
	 * @see net.sf.smbt.ezableton.CLIP_STATE
	 * @see #setClipState(CLIP_STATE)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_ClipState()
	 * @model
	 * @generated
	 */
	CLIP_STATE getClipState();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getClipState <em>Clip State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clip State</em>' attribute.
	 * @see net.sf.smbt.ezableton.CLIP_STATE
	 * @see #getClipState()
	 * @generated
	 */
	void setClipState(CLIP_STATE value);

	/**
	 * Returns the value of the '<em><b>Size X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size X</em>' attribute.
	 * @see #setSizeX(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_SizeX()
	 * @model
	 * @generated
	 */
	int getSizeX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSizeX <em>Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size X</em>' attribute.
	 * @see #getSizeX()
	 * @generated
	 */
	void setSizeX(int value);

	/**
	 * Returns the value of the '<em><b>Size Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size Y</em>' attribute.
	 * @see #setSizeY(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_SizeY()
	 * @model
	 * @generated
	 */
	int getSizeY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSizeY <em>Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size Y</em>' attribute.
	 * @see #getSizeY()
	 * @generated
	 */
	void setSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Coarse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coarse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coarse</em>' attribute.
	 * @see #setCoarse(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Coarse()
	 * @model
	 * @generated
	 */
	int getCoarse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getCoarse <em>Coarse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coarse</em>' attribute.
	 * @see #getCoarse()
	 * @generated
	 */
	void setCoarse(int value);

	/**
	 * Returns the value of the '<em><b>Fine</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fine</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fine</em>' attribute.
	 * @see #setFine(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Fine()
	 * @model
	 * @generated
	 */
	int getFine();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getFine <em>Fine</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fine</em>' attribute.
	 * @see #getFine()
	 * @generated
	 */
	void setFine(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Position()
	 * @model
	 * @generated
	 */
	float getPosition();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(float value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Length()
	 * @model
	 * @generated
	 */
	float getLength();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(float value);

	/**
	 * Returns the value of the '<em><b>Loop Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Start</em>' attribute.
	 * @see #setLoopStart(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_LoopStart()
	 * @model
	 * @generated
	 */
	float getLoopStart();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLoopStart <em>Loop Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Start</em>' attribute.
	 * @see #getLoopStart()
	 * @generated
	 */
	void setLoopStart(float value);

	/**
	 * Returns the value of the '<em><b>Loop End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop End</em>' attribute.
	 * @see #setLoopEnd(float)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_LoopEnd()
	 * @model
	 * @generated
	 */
	float getLoopEnd();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLoopEnd <em>Loop End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop End</em>' attribute.
	 * @see #getLoopEnd()
	 * @generated
	 */
	void setLoopEnd(float value);

	/**
	 * Returns the value of the '<em><b>Track</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' reference.
	 * @see #setTrack(LiveTrack)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Track()
	 * @model
	 * @generated
	 */
	LiveTrack getTrack();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getTrack <em>Track</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' reference.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(LiveTrack value);

	/**
	 * Returns the value of the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Seen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Seen</em>' attribute.
	 * @see #setLastSeen(long)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_LastSeen()
	 * @model
	 * @generated
	 */
	long getLastSeen();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getLastSeen <em>Last Seen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Seen</em>' attribute.
	 * @see #getLastSeen()
	 * @generated
	 */
	void setLastSeen(long value);

	/**
	 * Returns the value of the '<em><b>Is Audio Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Audio Clip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Audio Clip</em>' attribute.
	 * @see #setIsAudioClip(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_IsAudioClip()
	 * @model
	 * @generated
	 */
	boolean isIsAudioClip();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsAudioClip <em>Is Audio Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Audio Clip</em>' attribute.
	 * @see #isIsAudioClip()
	 * @generated
	 */
	void setIsAudioClip(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Midi Clip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Midi Clip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Midi Clip</em>' attribute.
	 * @see #setIsMidiClip(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_IsMidiClip()
	 * @model
	 * @generated
	 */
	boolean isIsMidiClip();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsMidiClip <em>Is Midi Clip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Midi Clip</em>' attribute.
	 * @see #isIsMidiClip()
	 * @generated
	 */
	void setIsMidiClip(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Triggered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Triggered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Triggered</em>' attribute.
	 * @see #setIsTriggered(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_IsTriggered()
	 * @model
	 * @generated
	 */
	boolean isIsTriggered();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#isIsTriggered <em>Is Triggered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Triggered</em>' attribute.
	 * @see #isIsTriggered()
	 * @generated
	 */
	void setIsTriggered(boolean value);

	/**
	 * Returns the value of the '<em><b>Playing Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezabletonctrl.MASTER_CTRL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Playing Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playing Status</em>' attribute.
	 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
	 * @see #setPlayingStatus(MASTER_CTRL)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_PlayingStatus()
	 * @model
	 * @generated
	 */
	MASTER_CTRL getPlayingStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getPlayingStatus <em>Playing Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Playing Status</em>' attribute.
	 * @see net.sf.smbt.ezabletonctrl.MASTER_CTRL
	 * @see #getPlayingStatus()
	 * @generated
	 */
	void setPlayingStatus(MASTER_CTRL value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Notes()
	 * @model
	 * @generated
	 */
	boolean isNotes();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#isNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #isNotes()
	 * @generated
	 */
	void setNotes(boolean value);

	/**
	 * Returns the value of the '<em><b>Signature denominator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature denominator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature denominator</em>' attribute.
	 * @see #setSignature_denominator(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Signature_denominator()
	 * @model
	 * @generated
	 */
	int getSignature_denominator();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSignature_denominator <em>Signature denominator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature denominator</em>' attribute.
	 * @see #getSignature_denominator()
	 * @generated
	 */
	void setSignature_denominator(int value);

	/**
	 * Returns the value of the '<em><b>Signature numerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature numerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature numerator</em>' attribute.
	 * @see #setSignature_numerator(int)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Signature_numerator()
	 * @model
	 * @generated
	 */
	int getSignature_numerator();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getSignature_numerator <em>Signature numerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature numerator</em>' attribute.
	 * @see #getSignature_numerator()
	 * @generated
	 */
	void setSignature_numerator(int value);

	/**
	 * Returns the value of the '<em><b>Warping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warping</em>' attribute.
	 * @see #setWarping(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Warping()
	 * @model
	 * @generated
	 */
	boolean isWarping();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#isWarping <em>Warping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warping</em>' attribute.
	 * @see #isWarping()
	 * @generated
	 */
	void setWarping(boolean value);

	/**
	 * Returns the value of the '<em><b>Will recording on start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Will recording on start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Will recording on start</em>' attribute.
	 * @see #setWill_recording_on_start(boolean)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Will_recording_on_start()
	 * @model
	 * @generated
	 */
	boolean isWill_recording_on_start();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#isWill_recording_on_start <em>Will recording on start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Will recording on start</em>' attribute.
	 * @see #isWill_recording_on_start()
	 * @generated
	 */
	void setWill_recording_on_start(boolean value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(Color)
	 * @see net.sf.smbt.ezabletonctrl.EzabletonctrlPackage#getLiveClip_Color()
	 * @model dataType="net.sf.smbt.ezabletonctrl.Color"
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezabletonctrl.LiveClip#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

} // LiveClip
