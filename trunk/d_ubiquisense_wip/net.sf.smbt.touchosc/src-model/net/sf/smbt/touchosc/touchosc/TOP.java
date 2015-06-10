/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.touchosc.touchosc.TOP#getLayout <em>Layout</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getTOP()
 * @model extendedMetaData="name='TOP' kind='elementOnly'"
 * @generated
 */
public interface TOP extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(Layout)
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#getTOP_Layout()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='layout'"
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link net.sf.smbt.touchosc.touchosc.TOP#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

} // TOP
