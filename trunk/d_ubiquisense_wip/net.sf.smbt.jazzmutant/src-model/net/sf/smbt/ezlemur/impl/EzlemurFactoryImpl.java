/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur.impl;

import net.sf.smbt.ezlemur.*;
import net.sf.smbt.ezlemur.AbstractLemurOscCmd;
import net.sf.smbt.ezlemur.EzlemurFactory;
import net.sf.smbt.ezlemur.EzlemurPackage;
import net.sf.smbt.ezlemur.LemurDmxCmd;
import net.sf.smbt.ezlemur.LemurMidiCmd;
import net.sf.smbt.ezlemur.LemurOscCmd;

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
public class EzlemurFactoryImpl extends EFactoryImpl implements EzlemurFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EzlemurFactory init() {
		try {
			EzlemurFactory theEzlemurFactory = (EzlemurFactory)EPackage.Registry.INSTANCE.getEFactory("http://ezlemur/1.0"); 
			if (theEzlemurFactory != null) {
				return theEzlemurFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EzlemurFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzlemurFactoryImpl() {
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
			case EzlemurPackage.LEMUR_OSC_CMD: return createLemurOscCmd();
			case EzlemurPackage.LEMUR_MIDI_CMD: return createLemurMidiCmd();
			case EzlemurPackage.LEMUR_DMX_CMD: return createLemurDmxCmd();
			case EzlemurPackage.ABSTRACT_LEMUR_OSC_CMD: return createAbstractLemurOscCmd();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurOscCmd createLemurOscCmd() {
		LemurOscCmdImpl lemurOscCmd = new LemurOscCmdImpl();
		return lemurOscCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurMidiCmd createLemurMidiCmd() {
		LemurMidiCmdImpl lemurMidiCmd = new LemurMidiCmdImpl();
		return lemurMidiCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LemurDmxCmd createLemurDmxCmd() {
		LemurDmxCmdImpl lemurDmxCmd = new LemurDmxCmdImpl();
		return lemurDmxCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractLemurOscCmd createAbstractLemurOscCmd() {
		AbstractLemurOscCmdImpl abstractLemurOscCmd = new AbstractLemurOscCmdImpl();
		return abstractLemurOscCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzlemurPackage getEzlemurPackage() {
		return (EzlemurPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EzlemurPackage getPackage() {
		return EzlemurPackage.eINSTANCE;
	}

} //EzlemurFactoryImpl
