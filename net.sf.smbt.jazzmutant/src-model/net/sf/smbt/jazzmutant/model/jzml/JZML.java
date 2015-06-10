/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JZML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.JZML#getPROJECT <em>PROJECT</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.JZML#getWINDOW <em>WINDOW</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getJZML()
 * @model extendedMetaData="name='JZML' kind='elementOnly'"
 * @generated
 */
public interface JZML extends EObject {
	/**
	 * Returns the value of the '<em><b>PROJECT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PROJECT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PROJECT</em>' containment reference.
	 * @see #setPROJECT(PROJECT)
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getJZML_PROJECT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PROJECT'"
	 * @generated
	 */
	PROJECT getPROJECT();

	/**
	 * Sets the value of the '{@link net.sf.smbt.jazzmutant.model.jzml.JZML#getPROJECT <em>PROJECT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PROJECT</em>' containment reference.
	 * @see #getPROJECT()
	 * @generated
	 */
	void setPROJECT(PROJECT value);

	/**
	 * Returns the value of the '<em><b>WINDOW</b></em>' containment reference list.
	 * The list contents are of type {@link net.sf.smbt.jazzmutant.model.jzml.WINDOW}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>WINDOW</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WINDOW</em>' containment reference list.
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#getJZML_WINDOW()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='WINDOW'"
	 * @generated
	 */
	EList<WINDOW> getWINDOW();

} // JZML
