/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Square;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SquareImpl#getTopLeft <em>Top Left</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SquareImpl#getTopRight <em>Top Right</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SquareImpl#getBottomRight <em>Bottom Right</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.SquareImpl#getBottomLeft <em>Bottom Left</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SquareImpl extends TimeBarImpl implements Square {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getTopLeft() {
		return (Point)eGet(EzsequencePackage.Literals.SQUARE__TOP_LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopLeft(Point newTopLeft) {
		eSet(EzsequencePackage.Literals.SQUARE__TOP_LEFT, newTopLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getTopRight() {
		return (Point)eGet(EzsequencePackage.Literals.SQUARE__TOP_RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopRight(Point newTopRight) {
		eSet(EzsequencePackage.Literals.SQUARE__TOP_RIGHT, newTopRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getBottomRight() {
		return (Point)eGet(EzsequencePackage.Literals.SQUARE__BOTTOM_RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomRight(Point newBottomRight) {
		eSet(EzsequencePackage.Literals.SQUARE__BOTTOM_RIGHT, newBottomRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getBottomLeft() {
		return (Point)eGet(EzsequencePackage.Literals.SQUARE__BOTTOM_LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottomLeft(Point newBottomLeft) {
		eSet(EzsequencePackage.Literals.SQUARE__BOTTOM_LEFT, newBottomLeft);
	}

} //SquareImpl
