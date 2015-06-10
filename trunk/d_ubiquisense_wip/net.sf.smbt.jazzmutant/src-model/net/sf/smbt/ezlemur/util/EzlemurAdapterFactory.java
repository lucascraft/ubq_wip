/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezlemur.util;

import net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd;
import net.sf.smbt.ezlemur.*;
import net.sf.smbt.ezlemur.AbstractLemurOscCmd;
import net.sf.smbt.ezlemur.EzlemurPackage;
import net.sf.smbt.ezlemur.LemurDmxCmd;
import net.sf.smbt.ezlemur.LemurMidiCmd;
import net.sf.smbt.ezlemur.LemurOscCmd;
import net.sf.smbt.midi.ezmidi.AbstractMidiCmd;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.ezlemur.EzlemurPackage
 * @generated
 */
public class EzlemurAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EzlemurPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzlemurAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EzlemurPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EzlemurSwitch<Adapter> modelSwitch =
		new EzlemurSwitch<Adapter>() {
			@Override
			public Adapter caseLemurOscCmd(LemurOscCmd object) {
				return createLemurOscCmdAdapter();
			}
			@Override
			public Adapter caseLemurMidiCmd(LemurMidiCmd object) {
				return createLemurMidiCmdAdapter();
			}
			@Override
			public Adapter caseLemurDmxCmd(LemurDmxCmd object) {
				return createLemurDmxCmdAdapter();
			}
			@Override
			public Adapter caseAbstractLemurOscCmd(AbstractLemurOscCmd object) {
				return createAbstractLemurOscCmdAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter caseOscCmd(OscCmd object) {
				return createOscCmdAdapter();
			}
			@Override
			public Adapter caseAbstractMidiCmd(AbstractMidiCmd object) {
				return createAbstractMidiCmdAdapter();
			}
			@Override
			public Adapter caseOpenDMXCmd(OpenDMXCmd object) {
				return createOpenDMXCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezlemur.LemurOscCmd <em>Lemur Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezlemur.LemurOscCmd
	 * @generated
	 */
	public Adapter createLemurOscCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezlemur.LemurMidiCmd <em>Lemur Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezlemur.LemurMidiCmd
	 * @generated
	 */
	public Adapter createLemurMidiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezlemur.LemurDmxCmd <em>Lemur Dmx Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezlemur.LemurDmxCmd
	 * @generated
	 */
	public Adapter createLemurDmxCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.ezlemur.AbstractLemurOscCmd <em>Abstract Lemur Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.ezlemur.AbstractLemurOscCmd
	 * @generated
	 */
	public Adapter createAbstractLemurOscCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscCmd <em>Osc Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscCmd
	 * @generated
	 */
	public Adapter createOscCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.midi.ezmidi.AbstractMidiCmd <em>Abstract Midi Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.midi.ezmidi.AbstractMidiCmd
	 * @generated
	 */
	public Adapter createAbstractMidiCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd <em>Open DMX Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.dmx.model.ezdmx.OpenDMXCmd
	 * @generated
	 */
	public Adapter createOpenDMXCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EzlemurAdapterFactory
