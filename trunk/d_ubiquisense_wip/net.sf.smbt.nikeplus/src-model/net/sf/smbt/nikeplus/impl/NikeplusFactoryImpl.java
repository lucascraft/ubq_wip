/**
 */
package net.sf.smbt.nikeplus.impl;

import net.sf.smbt.nikeplus.*;

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
public class NikeplusFactoryImpl extends EFactoryImpl implements NikeplusFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NikeplusFactory init() {
		try {
			NikeplusFactory theNikeplusFactory = (NikeplusFactory)EPackage.Registry.INSTANCE.getEFactory("http://nikeplus/1.0"); 
			if (theNikeplusFactory != null) {
				return theNikeplusFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NikeplusFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NikeplusFactoryImpl() {
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
			case NikeplusPackage.NIKEPLUS_CMD: return createNikeplusCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NikeplusCmd createNikeplusCmd() {
		NikeplusCmdImpl nikeplusCmd = new NikeplusCmdImpl();
		return nikeplusCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NikeplusPackage getNikeplusPackage() {
		return (NikeplusPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NikeplusPackage getPackage() {
		return NikeplusPackage.eINSTANCE;
	}

} //NikeplusFactoryImpl
