/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.TOP#getJZML <em>JZML</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getTOP()
 * @model extendedMetaData="name='TOP' kind='elementOnly'"
 * @generated
 */
public interface TOP extends EObject {
	/**
	 * Returns the value of the '<em><b>JZML</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JZML</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JZML</em>' containment reference.
	 * @see #setJZML(JZML)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getTOP_JZML()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='JZML'"
	 * @generated
	 */
	JZML getJZML();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.TOP#getJZML <em>JZML</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JZML</em>' containment reference.
	 * @see #getJZML()
	 * @generated
	 */
	void setJZML(JZML value);

} // TOP
