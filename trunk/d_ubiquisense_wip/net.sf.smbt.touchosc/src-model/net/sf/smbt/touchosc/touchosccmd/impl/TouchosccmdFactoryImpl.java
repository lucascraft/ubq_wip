/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosccmd.impl;

import net.sf.smbt.touchosc.touchosccmd.*;

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
public class TouchosccmdFactoryImpl extends EFactoryImpl implements TouchosccmdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TouchosccmdFactory init() {
		try {
			TouchosccmdFactory theTouchosccmdFactory = (TouchosccmdFactory)EPackage.Registry.INSTANCE.getEFactory("http://touchosccmd/1.0"); 
			if (theTouchosccmdFactory != null) {
				return theTouchosccmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TouchosccmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchosccmdFactoryImpl() {
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
			case TouchosccmdPackage.TOUCH_OSC_CMD: return createTouchOscCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchOscCmd createTouchOscCmd() {
		TouchOscCmdImpl touchOscCmd = new TouchOscCmdImpl();
		return touchOscCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchosccmdPackage getTouchosccmdPackage() {
		return (TouchosccmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TouchosccmdPackage getPackage() {
		return TouchosccmdPackage.eINSTANCE;
	}

} //TouchosccmdFactoryImpl
