/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.uiableton;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UI Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.uiableton.UIItem#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.uiableton.UIItem#getImage <em>Image</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIItem()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface UIItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIItem_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link net.sf.smbt.uiableton.UIItem#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(Image)
	 * @see net.sf.smbt.uiableton.UiabletonPackage#getUIItem_Image()
	 * @model dataType="net.sf.smbt.uiableton.Image"
	 * @generated
	 */
	Image getImage();

	/**
	 * Sets the value of the '{@link net.sf.smbt.uiableton.UIItem#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(Image value);

} // UIItem
