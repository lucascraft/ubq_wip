/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequencer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getTimebar <em>Timebar</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getLinks <em>Links</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getTimeCursors <em>Time Cursors</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getCommands <em>Commands</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getCmdTypeCache <em>Cmd Type Cache</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getZoomFactor <em>Zoom Factor</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getSurface <em>Surface</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getCurrentActionMode <em>Current Action Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getDefaultTargets <em>Default Targets</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getListeners <em>Listeners</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getCues <em>Cues</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getSynchros <em>Synchros</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getOffset <em>Offset</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getStoredCommands <em>Stored Commands</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getSelection <em>Selection</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getMojo <em>Mojo</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getDmxUniverse <em>Dmx Universe</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getMidiCommands <em>Midi Commands</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#isDragged <em>Dragged</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getMouseX <em>Mouse X</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Sequencer#getMouseY <em>Mouse Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer()
 * @model
 * @generated
 */
public interface Sequencer extends TimedObj, UIElem {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Timelines</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimedLine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timelines</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timelines</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Timelines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedLine> getTimelines();

	/**
	 * Returns the value of the '<em><b>Timebar</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimeBar}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timebar</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timebar</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Timebar()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeBar> getTimebar();

	/**
	 * Returns the value of the '<em><b>Boxes</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimeBox}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boxes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boxes</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Boxes()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimeBox> getBoxes();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimedLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<TimedLink> getLinks();

	/**
	 * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.EventTrigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggers</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Triggers()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventTrigger> getTriggers();

	/**
	 * Returns the value of the '<em><b>Time Cursors</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.TimeCursor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Cursors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Cursors</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_TimeCursors()
	 * @model
	 * @generated
	 */
	EList<TimeCursor> getTimeCursors();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.cmd.Cmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cmd> getCommands();

	/**
	 * Returns the value of the '<em><b>Listeners</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.EventListener}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listeners</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listeners</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Listeners()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventListener> getListeners();

	/**
	 * Returns the value of the '<em><b>Cues</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.EventCue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cues</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cues</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Cues()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventCue> getCues();

	/**
	 * Returns the value of the '<em><b>Synchros</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.EventSynchro}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchros</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchros</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Synchros()
	 * @model containment="true"
	 * @generated
	 */
	EList<EventSynchro> getSynchros();

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Offset()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getOffset();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Point value);

	/**
	 * Returns the value of the '<em><b>Stored Commands</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.xqz.model.cmd.Cmd}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stored Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stored Commands</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_StoredCommands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Cmd> getStoredCommands();

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.ezsequence.UIElem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Selection()
	 * @model
	 * @generated
	 */
	EList<UIElem> getSelection();

	/**
	 * Returns the value of the '<em><b>Mojo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mojo</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mojo</em>' containment reference.
	 * @see #setMojo(EZMojoRoot)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Mojo()
	 * @model containment="true"
	 * @generated
	 */
	EZMojoRoot getMojo();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getMojo <em>Mojo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mojo</em>' containment reference.
	 * @see #getMojo()
	 * @generated
	 */
	void setMojo(EZMojoRoot value);

	/**
	 * Returns the value of the '<em><b>Dmx Universe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmx Universe</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmx Universe</em>' containment reference.
	 * @see #setDmxUniverse(DMXUniverseCtrl)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_DmxUniverse()
	 * @model containment="true"
	 * @generated
	 */
	DMXUniverseCtrl getDmxUniverse();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getDmxUniverse <em>Dmx Universe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmx Universe</em>' containment reference.
	 * @see #getDmxUniverse()
	 * @generated
	 */
	void setDmxUniverse(DMXUniverseCtrl value);

	/**
	 * Returns the value of the '<em><b>Midi Commands</b></em>' reference list.
	 * The list contents are of type {@link net.sf.smbt.midi.ezmidi.DSLMidiMessage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Midi Commands</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Midi Commands</em>' reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_MidiCommands()
	 * @model
	 * @generated
	 */
	EList<DSLMidiMessage> getMidiCommands();

	/**
	 * Returns the value of the '<em><b>Dragged</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dragged</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dragged</em>' attribute.
	 * @see #setDragged(boolean)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Dragged()
	 * @model
	 * @generated
	 */
	boolean isDragged();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#isDragged <em>Dragged</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dragged</em>' attribute.
	 * @see #isDragged()
	 * @generated
	 */
	void setDragged(boolean value);

	/**
	 * Returns the value of the '<em><b>Mouse X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse X</em>' attribute.
	 * @see #setMouseX(double)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_MouseX()
	 * @model
	 * @generated
	 */
	double getMouseX();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getMouseX <em>Mouse X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse X</em>' attribute.
	 * @see #getMouseX()
	 * @generated
	 */
	void setMouseX(double value);

	/**
	 * Returns the value of the '<em><b>Mouse Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mouse Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mouse Y</em>' attribute.
	 * @see #setMouseY(double)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_MouseY()
	 * @model
	 * @generated
	 */
	double getMouseY();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getMouseY <em>Mouse Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mouse Y</em>' attribute.
	 * @see #getMouseY()
	 * @generated
	 */
	void setMouseY(double value);

	/**
	 * Returns the value of the '<em><b>Cmd Type Cache</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmd Type Cache</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmd Type Cache</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_CmdTypeCache()
	 * @model containment="true"
	 * @generated
	 */
	EList<EClassifier> getCmdTypeCache();

	/**
	 * Returns the value of the '<em><b>Zoom Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoom Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom Factor</em>' attribute.
	 * @see #setZoomFactor(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_ZoomFactor()
	 * @model
	 * @generated
	 */
	float getZoomFactor();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getZoomFactor <em>Zoom Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zoom Factor</em>' attribute.
	 * @see #getZoomFactor()
	 * @generated
	 */
	void setZoomFactor(float value);

	/**
	 * Returns the value of the '<em><b>Surface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface</em>' attribute.
	 * @see #setSurface(Rectangle)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_Surface()
	 * @model dataType="net.sf.smbt.ezsequence.Rectangle"
	 * @generated
	 */
	Rectangle getSurface();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getSurface <em>Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface</em>' attribute.
	 * @see #getSurface()
	 * @generated
	 */
	void setSurface(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Current Action Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Action Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Action Mode</em>' attribute.
	 * @see #setCurrentActionMode(String)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_CurrentActionMode()
	 * @model
	 * @generated
	 */
	String getCurrentActionMode();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Sequencer#getCurrentActionMode <em>Current Action Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Action Mode</em>' attribute.
	 * @see #getCurrentActionMode()
	 * @generated
	 */
	void setCurrentActionMode(String value);

	/**
	 * Returns the value of the '<em><b>Default Targets</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.ezmojo.EZMojoTarget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Targets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Targets</em>' containment reference list.
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSequencer_DefaultTargets()
	 * @model containment="true"
	 * @generated
	 */
	EList<EZMojoTarget> getDefaultTargets();

} // Sequencer
