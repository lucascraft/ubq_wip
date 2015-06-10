/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.UIElem#getBounds <em>Bounds</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.UIElem#getFg <em>Fg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.UIElem#getBg <em>Bg</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.UIElem#isVisible <em>Visible</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.UIElem#isSelected <em>Selected</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.UIElem#isDisabled <em>Disabled</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem()
 * @model
 * @generated
 */
public interface UIElem extends EObject {
	/**
	 * Returns the value of the '<em><b>Bounds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bounds</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bounds</em>' attribute.
	 * @see #setBounds(Rectangle)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem_Bounds()
	 * @model dataType="net.sf.smbt.ezsequence.Rectangle"
	 * @generated
	 */
	Rectangle getBounds();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.UIElem#getBounds <em>Bounds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bounds</em>' attribute.
	 * @see #getBounds()
	 * @generated
	 */
	void setBounds(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Fg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fg</em>' attribute.
	 * @see #setFg(Color)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem_Fg()
	 * @model dataType="net.sf.smbt.ezsequence.Color"
	 * @generated
	 */
	Color getFg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.UIElem#getFg <em>Fg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fg</em>' attribute.
	 * @see #getFg()
	 * @generated
	 */
	void setFg(Color value);

	/**
	 * Returns the value of the '<em><b>Bg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bg</em>' attribute.
	 * @see #setBg(Color)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem_Bg()
	 * @model dataType="net.sf.smbt.ezsequence.Color"
	 * @generated
	 */
	Color getBg();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.UIElem#getBg <em>Bg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bg</em>' attribute.
	 * @see #getBg()
	 * @generated
	 */
	void setBg(Color value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(boolean)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem_Visible()
	 * @model
	 * @generated
	 */
	boolean isVisible();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.UIElem#isVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #isVisible()
	 * @generated
	 */
	void setVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.UIElem#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

	/**
	 * Returns the value of the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disabled</em>' attribute.
	 * @see #setDisabled(boolean)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getUIElem_Disabled()
	 * @model
	 * @generated
	 */
	boolean isDisabled();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.UIElem#isDisabled <em>Disabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disabled</em>' attribute.
	 * @see #isDisabled()
	 * @generated
	 */
	void setDisabled(boolean value);

} // UIElem
