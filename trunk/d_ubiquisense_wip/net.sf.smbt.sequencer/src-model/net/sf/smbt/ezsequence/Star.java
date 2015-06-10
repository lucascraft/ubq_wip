/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.draw2d.geometry.Point;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.Star#getCenter <em>Center</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Star#getRadius <em>Radius</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getStar()
 * @model
 * @generated
 */
public interface Star extends TimeBar {

	/**
	 * Returns the value of the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Center</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Center</em>' attribute.
	 * @see #setCenter(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getStar_Center()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Star#getCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getStar_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Star#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);
} // Star
