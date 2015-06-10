/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.UIElem;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UI Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.UIElemImpl#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.UIElemImpl#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.UIElemImpl#getBg <em>Bg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.UIElemImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.UIElemImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.UIElemImpl#isDisabled <em>Disabled</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UIElemImpl extends MinimalEObjectImpl.Container implements UIElem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UIElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.UI_ELEM;
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

} //UIElemImpl
