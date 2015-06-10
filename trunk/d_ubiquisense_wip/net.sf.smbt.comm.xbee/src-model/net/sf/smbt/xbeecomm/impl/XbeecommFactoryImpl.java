/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecomm.impl;

import net.sf.smbt.xbeecomm.XbeePort;
import net.sf.smbt.xbeecomm.XbeecommFactory;
import net.sf.smbt.xbeecomm.XbeecommPackage;

import org.eclipse.emf.ecore.EClass;
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
public class XbeecommFactoryImpl extends EFactoryImpl implements XbeecommFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XbeecommFactory init() {
		try {
			XbeecommFactory theXbeecommFactory = (XbeecommFactory)EPackage.Registry.INSTANCE.getEFactory("http://xbeecomm/1.0"); 
			if (theXbeecommFactory != null) {
				return theXbeecommFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XbeecommFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecommFactoryImpl() {
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
			case XbeecommPackage.XBEE_PORT: return createXbeePort();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeePort createXbeePort() {
		XbeePortImpl xbeePort = new XbeePortImpl();
		return xbeePort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecommPackage getXbeecommPackage() {
		return (XbeecommPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XbeecommPackage getPackage() {
		return XbeecommPackage.eINSTANCE;
	}

} //XbeecommFactoryImpl
