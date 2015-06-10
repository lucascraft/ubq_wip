/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezsequence.impl;

import net.sf.smbt.ezsequence.EzsequencePackage;
import net.sf.smbt.ezsequence.Track;

import org.eclipse.draw2d.Polyline;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezsequence.impl.TrackImpl#getPolyline <em>Polyline</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackImpl extends TimeBarImpl implements Track {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzsequencePackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Polyline getPolyline() {
		return (Polyline)eGet(EzsequencePackage.Literals.TRACK__POLYLINE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyline(Polyline newPolyline) {
		eSet(EzsequencePackage.Literals.TRACK__POLYLINE, newPolyline);
	}

} //TrackImpl
