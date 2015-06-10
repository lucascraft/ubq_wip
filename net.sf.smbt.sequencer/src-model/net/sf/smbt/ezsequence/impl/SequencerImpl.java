/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.dmx.ezdmxctrl.DMXUniverseCtrl;
import net.sf.smbt.ezmojo.EZMojoRoot;
import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezsequence.EventCue;
import net.sf.smbt.ezsequence.EventListener;
import net.sf.smbt.ezsequence.EventSynchro;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Sequencer;
import net.sf.smbt.ezsequence.TimeBar;
import net.sf.smbt.ezsequence.TimeBox;
import net.sf.smbt.ezsequence.TimeCursor;
import net.sf.smbt.ezsequence.TimedLine;
import net.sf.smbt.ezsequence.TimedLink;
import net.sf.smbt.ezsequence.UIElem;
import net.sf.smbt.midi.ezmidi.DSLMidiMessage;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequencer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getTimelines <em>Timelines</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getTimebar <em>Timebar</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getBoxes <em>Boxes</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getTriggers <em>Triggers</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getTimeCursors <em>Time Cursors</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getCmdTypeCache <em>Cmd Type Cache</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getZoomFactor <em>Zoom Factor</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getSurface <em>Surface</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getCurrentActionMode <em>Current Action Mode</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getDefaultTargets <em>Default Targets</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getListeners <em>Listeners</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getCues <em>Cues</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getSynchros <em>Synchros</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getStoredCommands <em>Stored Commands</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getMojo <em>Mojo</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getDmxUniverse <em>Dmx Universe</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getMidiCommands <em>Midi Commands</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#isDragged <em>Dragged</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getMouseX <em>Mouse X</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SequencerImpl#getMouseY <em>Mouse Y</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequencerImpl extends TimedObjImpl implements Sequencer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequencerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.SEQUENCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getBounds() {
		return (Rectangle)eGet(EzsequencePackage.Literals.UI_ELEM__BOUNDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBounds(Rectangle newBounds) {
		eSet(EzsequencePackage.Literals.UI_ELEM__BOUNDS, newBounds);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getFg() {
		return (Color)eGet(EzsequencePackage.Literals.UI_ELEM__FG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFg(Color newFg) {
		eSet(EzsequencePackage.Literals.UI_ELEM__FG, newFg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Color getBg() {
		return (Color)eGet(EzsequencePackage.Literals.UI_ELEM__BG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBg(Color newBg) {
		eSet(EzsequencePackage.Literals.UI_ELEM__BG, newBg);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVisible() {
		return (Boolean)eGet(EzsequencePackage.Literals.UI_ELEM__VISIBLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVisible(boolean newVisible) {
		eSet(EzsequencePackage.Literals.UI_ELEM__VISIBLE, newVisible);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return (Boolean)eGet(EzsequencePackage.Literals.UI_ELEM__SELECTED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		eSet(EzsequencePackage.Literals.UI_ELEM__SELECTED, newSelected);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisabled() {
		return (Boolean)eGet(EzsequencePackage.Literals.UI_ELEM__DISABLED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisabled(boolean newDisabled) {
		eSet(EzsequencePackage.Literals.UI_ELEM__DISABLED, newDisabled);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return (String)eGet(EzsequencePackage.Literals.SEQUENCER__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		eSet(EzsequencePackage.Literals.SEQUENCER__ID, newID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimedLine> getTimelines() {
		return (EList<TimedLine>)eGet(EzsequencePackage.Literals.SEQUENCER__TIMELINES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimeBar> getTimebar() {
		return (EList<TimeBar>)eGet(EzsequencePackage.Literals.SEQUENCER__TIMEBAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimeBox> getBoxes() {
		return (EList<TimeBox>)eGet(EzsequencePackage.Literals.SEQUENCER__BOXES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimedLink> getLinks() {
		return (EList<TimedLink>)eGet(EzsequencePackage.Literals.SEQUENCER__LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventTrigger> getTriggers() {
		return (EList<EventTrigger>)eGet(EzsequencePackage.Literals.SEQUENCER__TRIGGERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TimeCursor> getTimeCursors() {
		return (EList<TimeCursor>)eGet(EzsequencePackage.Literals.SEQUENCER__TIME_CURSORS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Cmd> getCommands() {
		return (EList<Cmd>)eGet(EzsequencePackage.Literals.SEQUENCER__COMMANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventListener> getListeners() {
		return (EList<EventListener>)eGet(EzsequencePackage.Literals.SEQUENCER__LISTENERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventCue> getCues() {
		return (EList<EventCue>)eGet(EzsequencePackage.Literals.SEQUENCER__CUES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EventSynchro> getSynchros() {
		return (EList<EventSynchro>)eGet(EzsequencePackage.Literals.SEQUENCER__SYNCHROS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getOffset() {
		return (Point)eGet(EzsequencePackage.Literals.SEQUENCER__OFFSET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(Point newOffset) {
		eSet(EzsequencePackage.Literals.SEQUENCER__OFFSET, newOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Cmd> getStoredCommands() {
		return (EList<Cmd>)eGet(EzsequencePackage.Literals.SEQUENCER__STORED_COMMANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UIElem> getSelection() {
		return (EList<UIElem>)eGet(EzsequencePackage.Literals.SEQUENCER__SELECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EZMojoRoot getMojo() {
		return (EZMojoRoot)eGet(EzsequencePackage.Literals.SEQUENCER__MOJO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMojo(EZMojoRoot newMojo) {
		eSet(EzsequencePackage.Literals.SEQUENCER__MOJO, newMojo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DMXUniverseCtrl getDmxUniverse() {
		return (DMXUniverseCtrl)eGet(EzsequencePackage.Literals.SEQUENCER__DMX_UNIVERSE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmxUniverse(DMXUniverseCtrl newDmxUniverse) {
		eSet(EzsequencePackage.Literals.SEQUENCER__DMX_UNIVERSE, newDmxUniverse);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<DSLMidiMessage> getMidiCommands() {
		return (EList<DSLMidiMessage>)eGet(EzsequencePackage.Literals.SEQUENCER__MIDI_COMMANDS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDragged() {
		return (Boolean)eGet(EzsequencePackage.Literals.SEQUENCER__DRAGGED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDragged(boolean newDragged) {
		eSet(EzsequencePackage.Literals.SEQUENCER__DRAGGED, newDragged);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMouseX() {
		return (Double)eGet(EzsequencePackage.Literals.SEQUENCER__MOUSE_X, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouseX(double newMouseX) {
		eSet(EzsequencePackage.Literals.SEQUENCER__MOUSE_X, newMouseX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMouseY() {
		return (Double)eGet(EzsequencePackage.Literals.SEQUENCER__MOUSE_Y, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMouseY(double newMouseY) {
		eSet(EzsequencePackage.Literals.SEQUENCER__MOUSE_Y, newMouseY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == UIElem.class) {
			switch (derivedFeatureID) {
				case EzsequencePackage.SEQUENCER__BOUNDS: return EzsequencePackage.UI_ELEM__BOUNDS;
				case EzsequencePackage.SEQUENCER__FG: return EzsequencePackage.UI_ELEM__FG;
				case EzsequencePackage.SEQUENCER__BG: return EzsequencePackage.UI_ELEM__BG;
				case EzsequencePackage.SEQUENCER__VISIBLE: return EzsequencePackage.UI_ELEM__VISIBLE;
				case EzsequencePackage.SEQUENCER__SELECTED: return EzsequencePackage.UI_ELEM__SELECTED;
				case EzsequencePackage.SEQUENCER__DISABLED: return EzsequencePackage.UI_ELEM__DISABLED;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == UIElem.class) {
			switch (baseFeatureID) {
				case EzsequencePackage.UI_ELEM__BOUNDS: return EzsequencePackage.SEQUENCER__BOUNDS;
				case EzsequencePackage.UI_ELEM__FG: return EzsequencePackage.SEQUENCER__FG;
				case EzsequencePackage.UI_ELEM__BG: return EzsequencePackage.SEQUENCER__BG;
				case EzsequencePackage.UI_ELEM__VISIBLE: return EzsequencePackage.SEQUENCER__VISIBLE;
				case EzsequencePackage.UI_ELEM__SELECTED: return EzsequencePackage.SEQUENCER__SELECTED;
				case EzsequencePackage.UI_ELEM__DISABLED: return EzsequencePackage.SEQUENCER__DISABLED;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EClassifier> getCmdTypeCache() {
		return (EList<EClassifier>)eGet(EzsequencePackage.Literals.SEQUENCER__CMD_TYPE_CACHE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getZoomFactor() {
		return (Float)eGet(EzsequencePackage.Literals.SEQUENCER__ZOOM_FACTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoomFactor(float newZoomFactor) {
		eSet(EzsequencePackage.Literals.SEQUENCER__ZOOM_FACTOR, newZoomFactor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getSurface() {
		return (Rectangle)eGet(EzsequencePackage.Literals.SEQUENCER__SURFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurface(Rectangle newSurface) {
		eSet(EzsequencePackage.Literals.SEQUENCER__SURFACE, newSurface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentActionMode() {
		return (String)eGet(EzsequencePackage.Literals.SEQUENCER__CURRENT_ACTION_MODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentActionMode(String newCurrentActionMode) {
		eSet(EzsequencePackage.Literals.SEQUENCER__CURRENT_ACTION_MODE, newCurrentActionMode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getDefaultTargets() {
		return (EList<EZMojoTarget>)eGet(EzsequencePackage.Literals.SEQUENCER__DEFAULT_TARGETS, true);
	}

} //SequencerImpl
