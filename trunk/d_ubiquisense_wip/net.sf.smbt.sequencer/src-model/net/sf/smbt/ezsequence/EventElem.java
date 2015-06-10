/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Elem</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.EventElem#getBang <em>Bang</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventElem#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventElem#getCenter <em>Center</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.EventElem#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventElem()
 * @model
 * @generated
 */
public interface EventElem extends UIElem {
	/**
	 * Returns the value of the '<em><b>Bang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bang</em>' attribute.
	 * @see #setBang(float)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventElem_Bang()
	 * @model
	 * @generated
	 */
	float getBang();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventElem#getBang <em>Bang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bang</em>' attribute.
	 * @see #getBang()
	 * @generated
	 */
	void setBang(float value);

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
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventElem_Radius()
	 * @model
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventElem#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

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
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventElem_Center()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getCenter();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventElem#getCenter <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Center</em>' attribute.
	 * @see #getCenter()
	 * @generated
	 */
	void setCenter(Point value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getEventElem_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.EventElem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // EventElem
