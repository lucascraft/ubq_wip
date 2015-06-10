/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.draw2d.Polyline;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.Track#getPolyline <em>Polyline</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends TimeBar {

	/**
	 * Returns the value of the '<em><b>Polyline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polyline</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polyline</em>' attribute.
	 * @see #setPolyline(Polyline)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getTrack_Polyline()
	 * @model dataType="net.sf.smbt.ezsequence.Polyline"
	 * @generated
	 */
	Polyline getPolyline();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Track#getPolyline <em>Polyline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polyline</em>' attribute.
	 * @see #getPolyline()
	 * @generated
	 */
	void setPolyline(Polyline value);
} // Track
