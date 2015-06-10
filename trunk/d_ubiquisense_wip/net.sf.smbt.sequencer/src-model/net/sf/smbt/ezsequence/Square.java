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
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.Square#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Square#getTopRight <em>Top Right</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Square#getBottomRight <em>Bottom Right</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.Square#getBottomLeft <em>Bottom Left</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSquare()
 * @model
 * @generated
 */
public interface Square extends TimeBar {

	/**
	 * Returns the value of the '<em><b>Top Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Left</em>' attribute.
	 * @see #setTopLeft(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSquare_TopLeft()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getTopLeft();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Square#getTopLeft <em>Top Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Left</em>' attribute.
	 * @see #getTopLeft()
	 * @generated
	 */
	void setTopLeft(Point value);

	/**
	 * Returns the value of the '<em><b>Top Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Right</em>' attribute.
	 * @see #setTopRight(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSquare_TopRight()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getTopRight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Square#getTopRight <em>Top Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Right</em>' attribute.
	 * @see #getTopRight()
	 * @generated
	 */
	void setTopRight(Point value);

	/**
	 * Returns the value of the '<em><b>Bottom Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Right</em>' attribute.
	 * @see #setBottomRight(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSquare_BottomRight()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getBottomRight();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Square#getBottomRight <em>Bottom Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Right</em>' attribute.
	 * @see #getBottomRight()
	 * @generated
	 */
	void setBottomRight(Point value);

	/**
	 * Returns the value of the '<em><b>Bottom Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Left</em>' attribute.
	 * @see #setBottomLeft(Point)
	 * @see net.sf.smbt.ezsequence.EzsequencePackage#getSquare_BottomLeft()
	 * @model dataType="net.sf.smbt.ezsequence.Point"
	 * @generated
	 */
	Point getBottomLeft();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezsequence.Square#getBottomLeft <em>Bottom Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Left</em>' attribute.
	 * @see #getBottomLeft()
	 * @generated
	 */
	void setBottomLeft(Point value);
} // Square
