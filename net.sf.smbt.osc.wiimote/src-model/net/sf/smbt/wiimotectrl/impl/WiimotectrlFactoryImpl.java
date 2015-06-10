/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.wiimotectrl.impl;

import net.sf.smbt.wiimotectrl.WiimoteController;
import net.sf.smbt.wiimotectrl.WiimotectrlFactory;
import net.sf.smbt.wiimotectrl.WiimotectrlPackage;

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
public class WiimotectrlFactoryImpl extends EFactoryImpl implements WiimotectrlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WiimotectrlFactory init() {
		try {
			WiimotectrlFactory theWiimotectrlFactory = (WiimotectrlFactory)EPackage.Registry.INSTANCE.getEFactory("http://wiimotectrl/1.0"); 
			if (theWiimotectrlFactory != null) {
				return theWiimotectrlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WiimotectrlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimotectrlFactoryImpl() {
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
			case WiimotectrlPackage.WIIMOTE_CONTROLLER: return createWiimoteController();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteController createWiimoteController() {
		WiimoteControllerImpl wiimoteController = new WiimoteControllerImpl();
		return wiimoteController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimotectrlPackage getWiimotectrlPackage() {
		return (WiimotectrlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WiimotectrlPackage getPackage() {
		return WiimotectrlPackage.eINSTANCE;
	}

} //WiimotectrlFactoryImpl
