/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EventElem;
import net.sf.smbt.ezsequence.EzsequencePackage;

import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Elem</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventElemImpl#getBang <em>Bang</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventElemImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventElemImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link net.sf.smbt.ezsequence.impl.EventElemImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventElemImpl extends UIElemImpl implements EventElem {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventElemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.EVENT_ELEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBang() {
		return (Float)eGet(EzsequencePackage.Literals.EVENT_ELEM__BANG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBang(float newBang) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__BANG, newBang);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRadius() {
		return (Double)eGet(EzsequencePackage.Literals.EVENT_ELEM__RADIUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadius(double newRadius) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__RADIUS, newRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point getCenter() {
		return (Point)eGet(EzsequencePackage.Literals.EVENT_ELEM__CENTER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(Point newCenter) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__CENTER, newCenter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(EzsequencePackage.Literals.EVENT_ELEM__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(EzsequencePackage.Literals.EVENT_ELEM__ID, newId);
	}

} //EventElemImpl
