/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbee.impl;

import net.sf.smbt.xbee.*;
import net.sf.smbt.xbee.XBEE_COMM_MODE;
import net.sf.smbt.xbee.XBEE_FIRMAWARE;
import net.sf.smbt.xbee.XBEE_FREQ;
import net.sf.smbt.xbee.XBEE_MANUFACTURER_ID;
import net.sf.smbt.xbee.XBEE_SERIES;
import net.sf.smbt.xbee.Xbee;
import net.sf.smbt.xbee.XbeeFactory;
import net.sf.smbt.xbee.XbeePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XbeeFactoryImpl extends EFactoryImpl implements XbeeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XbeeFactory init() {
		try {
			XbeeFactory theXbeeFactory = (XbeeFactory)EPackage.Registry.INSTANCE.getEFactory("http://xbee/1.0"); 
			if (theXbeeFactory != null) {
				return theXbeeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XbeeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case XbeePackage.XBEE: return createXbee();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case XbeePackage.XBEE_SERIES:
				return createXBEE_SERIESFromString(eDataType, initialValue);
			case XbeePackage.XBEE_COMM_MODE:
				return createXBEE_COMM_MODEFromString(eDataType, initialValue);
			case XbeePackage.XBEE_FREQ:
				return createXBEE_FREQFromString(eDataType, initialValue);
			case XbeePackage.XBEE_FIRMAWARE:
				return createXBEE_FIRMAWAREFromString(eDataType, initialValue);
			case XbeePackage.XBEE_MANUFACTURER_ID:
				return createXBEE_MANUFACTURER_IDFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case XbeePackage.XBEE_SERIES:
				return convertXBEE_SERIESToString(eDataType, instanceValue);
			case XbeePackage.XBEE_COMM_MODE:
				return convertXBEE_COMM_MODEToString(eDataType, instanceValue);
			case XbeePackage.XBEE_FREQ:
				return convertXBEE_FREQToString(eDataType, instanceValue);
			case XbeePackage.XBEE_FIRMAWARE:
				return convertXBEE_FIRMAWAREToString(eDataType, instanceValue);
			case XbeePackage.XBEE_MANUFACTURER_ID:
				return convertXBEE_MANUFACTURER_IDToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xbee createXbee() {
		XbeeImpl xbee = new XbeeImpl();
		return xbee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_SERIES createXBEE_SERIESFromString(EDataType eDataType, String initialValue) {
		XBEE_SERIES result = XBEE_SERIES.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBEE_SERIESToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_COMM_MODE createXBEE_COMM_MODEFromString(EDataType eDataType, String initialValue) {
		XBEE_COMM_MODE result = XBEE_COMM_MODE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBEE_COMM_MODEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FREQ createXBEE_FREQFromString(EDataType eDataType, String initialValue) {
		XBEE_FREQ result = XBEE_FREQ.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBEE_FREQToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_FIRMAWARE createXBEE_FIRMAWAREFromString(EDataType eDataType, String initialValue) {
		XBEE_FIRMAWARE result = XBEE_FIRMAWARE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBEE_FIRMAWAREToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBEE_MANUFACTURER_ID createXBEE_MANUFACTURER_IDFromString(EDataType eDataType, String initialValue) {
		XBEE_MANUFACTURER_ID result = XBEE_MANUFACTURER_ID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXBEE_MANUFACTURER_IDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeePackage getXbeePackage() {
		return (XbeePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XbeePackage getPackage() {
		return XbeePackage.eINSTANCE;
	}

} //XbeeFactoryImpl
