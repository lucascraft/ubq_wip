/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezmojo.EZMojoTarget;
import net.sf.smbt.ezsequence.EmitInfo;
import net.sf.smbt.ezsequence.EventElem;
import net.sf.smbt.ezsequence.EventTrigger;
import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.TimedEvent;
import net.sf.smbt.ezsequence.UIElem;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#isDisabled <em>Disabled</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getBang <em>Bang</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getEmits <em>Emits</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getAfter <em>After</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventTriggerImpl#getTargets <em>Targets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventTriggerImpl extends TimedObjImpl implements EventTrigger {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventTriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.EVENT_TRIGGER;
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
	@SuppressWarnings("unchecked")
	public EList<EmitInfo> getEmits() {
		return (EList<EmitInfo>)eGet(EzsequencePackage.Literals.EVENT_TRIGGER__EMITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EzsequencePackage.Literals.EVENT_ELEM__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEvent getAfter() {
		return (TimedEvent)eGet(EzsequencePackage.Literals.EVENT_TRIGGER__AFTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAfter(TimedEvent newAfter) {
		eSet(EzsequencePackage.Literals.EVENT_TRIGGER__AFTER, newAfter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedEvent getBefore() {
		return (TimedEvent)eGet(EzsequencePackage.Literals.EVENT_TRIGGER__BEFORE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBefore(TimedEvent newBefore) {
		eSet(EzsequencePackage.Literals.EVENT_TRIGGER__BEFORE, newBefore);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EZMojoTarget> getTargets() {
		return (EList<EZMojoTarget>)eGet(EzsequencePackage.Literals.EVENT_TRIGGER__TARGETS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getCenter() {
		return (Point)eGet(EzsequencePackage.Literals.EVENT_ELEM__CENTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(Point newCenter) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__CENTER, newCenter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return (Double)eGet(EzsequencePackage.Literals.EVENT_ELEM__RADIUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__RADIUS, newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBang() {
		return (Float)eGet(EzsequencePackage.Literals.EVENT_ELEM__BANG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBang(float newBang) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__BANG, newBang);
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
				case EzsequencePackage.EVENT_TRIGGER__BOUNDS: return EzsequencePackage.UI_ELEM__BOUNDS;
				case EzsequencePackage.EVENT_TRIGGER__FG: return EzsequencePackage.UI_ELEM__FG;
				case EzsequencePackage.EVENT_TRIGGER__BG: return EzsequencePackage.UI_ELEM__BG;
				case EzsequencePackage.EVENT_TRIGGER__VISIBLE: return EzsequencePackage.UI_ELEM__VISIBLE;
				case EzsequencePackage.EVENT_TRIGGER__SELECTED: return EzsequencePackage.UI_ELEM__SELECTED;
				case EzsequencePackage.EVENT_TRIGGER__DISABLED: return EzsequencePackage.UI_ELEM__DISABLED;
				default: return -1;
			}
		}
		if (baseClass == EventElem.class) {
			switch (derivedFeatureID) {
				case EzsequencePackage.EVENT_TRIGGER__BANG: return EzsequencePackage.EVENT_ELEM__BANG;
				case EzsequencePackage.EVENT_TRIGGER__RADIUS: return EzsequencePackage.EVENT_ELEM__RADIUS;
				case EzsequencePackage.EVENT_TRIGGER__CENTER: return EzsequencePackage.EVENT_ELEM__CENTER;
				case EzsequencePackage.EVENT_TRIGGER__ID: return EzsequencePackage.EVENT_ELEM__ID;
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
				case EzsequencePackage.UI_ELEM__BOUNDS: return EzsequencePackage.EVENT_TRIGGER__BOUNDS;
				case EzsequencePackage.UI_ELEM__FG: return EzsequencePackage.EVENT_TRIGGER__FG;
				case EzsequencePackage.UI_ELEM__BG: return EzsequencePackage.EVENT_TRIGGER__BG;
				case EzsequencePackage.UI_ELEM__VISIBLE: return EzsequencePackage.EVENT_TRIGGER__VISIBLE;
				case EzsequencePackage.UI_ELEM__SELECTED: return EzsequencePackage.EVENT_TRIGGER__SELECTED;
				case EzsequencePackage.UI_ELEM__DISABLED: return EzsequencePackage.EVENT_TRIGGER__DISABLED;
				default: return -1;
			}
		}
		if (baseClass == EventElem.class) {
			switch (baseFeatureID) {
				case EzsequencePackage.EVENT_ELEM__BANG: return EzsequencePackage.EVENT_TRIGGER__BANG;
				case EzsequencePackage.EVENT_ELEM__RADIUS: return EzsequencePackage.EVENT_TRIGGER__RADIUS;
				case EzsequencePackage.EVENT_ELEM__CENTER: return EzsequencePackage.EVENT_TRIGGER__CENTER;
				case EzsequencePackage.EVENT_ELEM__ID: return EzsequencePackage.EVENT_TRIGGER__ID;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EventTriggerImpl
