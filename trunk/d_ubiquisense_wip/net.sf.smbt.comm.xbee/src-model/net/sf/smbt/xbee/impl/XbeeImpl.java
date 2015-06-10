/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbee.impl;

import net.sf.smbt.xbee.XBEE_COMM_MODE;
import net.sf.smbt.xbee.XBEE_FIRMAWARE;
import net.sf.smbt.xbee.XBEE_FREQ;
import net.sf.smbt.xbee.XBEE_SERIES;
import net.sf.smbt.xbee.Xbee;
import net.sf.smbt.xbee.XbeePackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Xbee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.xbee.impl.XbeeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.impl.XbeeImpl#getSeries <em>Series</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.impl.XbeeImpl#getFreq <em>Freq</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.impl.XbeeImpl#getModes <em>Modes</em>}</li>
 *   <li>{@link net.sf.smbt.xbee.impl.XbeeImpl#getFirmaware <em>Firmaware</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XbeeImpl extends MinimalEObjectImpl.Container implements Xbee {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XbeeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XbeePackage.Literals.XBEE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(XbeePackage.Literals.XBEE__LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(XbeePackage.Literals.XBEE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_SERIES getSeries() {
		return (XBEE_SERIES)eGet(XbeePackage.Literals.XBEE__SERIES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeries(XBEE_SERIES newSeries) {
		eSet(XbeePackage.Literals.XBEE__SERIES, newSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FREQ getFreq() {
		return (XBEE_FREQ)eGet(XbeePackage.Literals.XBEE__FREQ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFreq(XBEE_FREQ newFreq) {
		eSet(XbeePackage.Literals.XBEE__FREQ, newFreq);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<XBEE_COMM_MODE> getModes() {
		return (EList<XBEE_COMM_MODE>)eGet(XbeePackage.Literals.XBEE__MODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FIRMAWARE getFirmaware() {
		return (XBEE_FIRMAWARE)eGet(XbeePackage.Literals.XBEE__FIRMAWARE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmaware(XBEE_FIRMAWARE newFirmaware) {
		eSet(XbeePackage.Literals.XBEE__FIRMAWARE, newFirmaware);
	}

} //XbeeImpl
