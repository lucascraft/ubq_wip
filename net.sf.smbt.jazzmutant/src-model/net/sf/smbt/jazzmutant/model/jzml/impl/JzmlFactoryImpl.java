/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import net.sf.smbt.jazzmutant.model.jzml.*;
import net.sf.smbt.jazzmutant.model.jzml.JZML;
import net.sf.smbt.jazzmutant.model.jzml.JzmlFactory;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PARAM;
import net.sf.smbt.jazzmutant.model.jzml.PROJECT;
import net.sf.smbt.jazzmutant.model.jzml.TOP;
import net.sf.smbt.jazzmutant.model.jzml.VARIABLE;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;

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
public class JzmlFactoryImpl extends EFactoryImpl implements JzmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JzmlFactory init() {
		try {
			JzmlFactory theJzmlFactory = (JzmlFactory)EPackage.Registry.INSTANCE.getEFactory("http:///net.sf.smbt.jazzmutant/model/jzml.xsd"); 
			if (theJzmlFactory != null) {
				return theJzmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JzmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmlFactoryImpl() {
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
			case JzmlPackage.JZML: return createJZML();
			case JzmlPackage.PARAM: return createPARAM();
			case JzmlPackage.PROJECT: return createPROJECT();
			case JzmlPackage.TOP: return createTOP();
			case JzmlPackage.VARIABLE: return createVARIABLE();
			case JzmlPackage.WINDOW: return createWINDOW();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JZML createJZML() {
		JZMLImpl jzml = new JZMLImpl();
		return jzml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PARAM createPARAM() {
		PARAMImpl param = new PARAMImpl();
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PROJECT createPROJECT() {
		PROJECTImpl project = new PROJECTImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOP createTOP() {
		TOPImpl top = new TOPImpl();
		return top;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VARIABLE createVARIABLE() {
		VARIABLEImpl variable = new VARIABLEImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WINDOW createWINDOW() {
		WINDOWImpl window = new WINDOWImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmlPackage getJzmlPackage() {
		return (JzmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JzmlPackage getPackage() {
		return JzmlPackage.eINSTANCE;
	}

} //JzmlFactoryImpl
