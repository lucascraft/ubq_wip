/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.ofx3nity.impl;

import net.sf.smbt.osc.ofx3nity.*;
import net.sf.smbt.osc.ofx3nity.Ofx3RcvCmd;
import net.sf.smbt.osc.ofx3nity.Ofx3SndCmd;
import net.sf.smbt.osc.ofx3nity.Ofx3nityFactory;
import net.sf.smbt.osc.ofx3nity.Ofx3nityPackage;

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
public class Ofx3nityFactoryImpl extends EFactoryImpl implements Ofx3nityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ofx3nityFactory init() {
		try {
			Ofx3nityFactory theOfx3nityFactory = (Ofx3nityFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/osc/ofx3nity/1.0"); 
			if (theOfx3nityFactory != null) {
				return theOfx3nityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ofx3nityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ofx3nityFactoryImpl() {
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
			case Ofx3nityPackage.OFX3_RCV_CMD: return createOfx3RcvCmd();
			case Ofx3nityPackage.OFX3_SND_CMD: return createOfx3SndCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ofx3RcvCmd createOfx3RcvCmd() {
		Ofx3RcvCmdImpl ofx3RcvCmd = new Ofx3RcvCmdImpl();
		return ofx3RcvCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ofx3SndCmd createOfx3SndCmd() {
		Ofx3SndCmdImpl ofx3SndCmd = new Ofx3SndCmdImpl();
		return ofx3SndCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ofx3nityPackage getOfx3nityPackage() {
		return (Ofx3nityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ofx3nityPackage getPackage() {
		return Ofx3nityPackage.eINSTANCE;
	}

} //Ofx3nityFactoryImpl
