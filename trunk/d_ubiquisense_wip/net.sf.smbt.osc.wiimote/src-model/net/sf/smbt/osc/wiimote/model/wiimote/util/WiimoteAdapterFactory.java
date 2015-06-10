/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.osc.wiimote.model.wiimote.util;

import net.sf.smbt.osc.wiimote.model.wiimote.*;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor;
import net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage;
import net.sf.smbt.osccmd.OscCmd;
import net.sf.smbt.osccmd.OscRcvCmd;
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
 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimotePackage
 * @generated
 */
public class WiimoteAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WiimotePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WiimoteAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WiimotePackage.eINSTANCE;
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
	protected WiimoteSwitch<Adapter> modelSwitch =
		new WiimoteSwitch<Adapter>() {
			@Override
			public Adapter caseWiimoteCmd(WiimoteCmd object) {
				return createWiimoteCmdAdapter();
			}
			@Override
			public Adapter caseWiiAccelXYZCmd(WiiAccelXYZCmd object) {
				return createWiiAccelXYZCmdAdapter();
			}
			@Override
			public Adapter caseWiiAccelPryCmd(WiiAccelPryCmd object) {
				return createWiiAccelPryCmdAdapter();
			}
			@Override
			public Adapter caseWiiButtonCmd(WiiButtonCmd object) {
				return createWiiButtonCmdAdapter();
			}
			@Override
			public Adapter caseWiiIrXYSpeedCmd(WiiIrXYSpeedCmd object) {
				return createWiiIrXYSpeedCmdAdapter();
			}
			@Override
			public Adapter caseWiiMotionAnglesCmd(WiiMotionAnglesCmd object) {
				return createWiiMotionAnglesCmdAdapter();
			}
			@Override
			public Adapter caseWiiMotionVeloCmd(WiiMotionVeloCmd object) {
				return createWiiMotionVeloCmdAdapter();
			}
			@Override
			public Adapter caseWiiNunchukAccelPryCmd(WiiNunchukAccelPryCmd object) {
				return createWiiNunchukAccelPryCmdAdapter();
			}
			@Override
			public Adapter caseWiiNunchukButtonCmd(WiiNunchukButtonCmd object) {
				return createWiiNunchukButtonCmdAdapter();
			}
			@Override
			public Adapter caseWiiNunchukJoyCmd(WiiNunchukJoyCmd object) {
				return createWiiNunchukJoyCmdAdapter();
			}
			@Override
			public Adapter caseWiiNunchukAccelXyzCmd(WiiNunchukAccelXyzCmd object) {
				return createWiiNunchukAccelXyzCmdAdapter();
			}
			@Override
			public Adapter caseWiiIrCmd(WiiIrCmd object) {
				return createWiiIrCmdAdapter();
			}
			@Override
			public Adapter caseWiiAnglesCmd(WiiAnglesCmd object) {
				return createWiiAnglesCmdAdapter();
			}
			@Override
			public Adapter caseWiimoteMonitor(WiimoteMonitor object) {
				return createWiimoteMonitorAdapter();
			}
			@Override
			public Adapter caseWiimoteLiveSettings(WiimoteLiveSettings object) {
				return createWiimoteLiveSettingsAdapter();
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
			public Adapter caseOscRcvCmd(OscRcvCmd object) {
				return createOscRcvCmdAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteCmd
	 * @generated
	 */
	public Adapter createWiimoteCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd <em>Wii Accel XYZ Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelXYZCmd
	 * @generated
	 */
	public Adapter createWiiAccelXYZCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd <em>Wii Accel Pry Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAccelPryCmd
	 * @generated
	 */
	public Adapter createWiiAccelPryCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd <em>Wii Button Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiButtonCmd
	 * @generated
	 */
	public Adapter createWiiButtonCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd <em>Wii Ir XY Speed Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrXYSpeedCmd
	 * @generated
	 */
	public Adapter createWiiIrXYSpeedCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd <em>Wii Motion Angles Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionAnglesCmd
	 * @generated
	 */
	public Adapter createWiiMotionAnglesCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd <em>Wii Motion Velo Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiMotionVeloCmd
	 * @generated
	 */
	public Adapter createWiiMotionVeloCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd <em>Wii Nunchuk Accel Pry Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelPryCmd
	 * @generated
	 */
	public Adapter createWiiNunchukAccelPryCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd <em>Wii Nunchuk Button Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukButtonCmd
	 * @generated
	 */
	public Adapter createWiiNunchukButtonCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd <em>Wii Nunchuk Joy Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukJoyCmd
	 * @generated
	 */
	public Adapter createWiiNunchukJoyCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd <em>Wii Nunchuk Accel Xyz Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiNunchukAccelXyzCmd
	 * @generated
	 */
	public Adapter createWiiNunchukAccelXyzCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd <em>Wii Ir Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiIrCmd
	 * @generated
	 */
	public Adapter createWiiIrCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd <em>Wii Angles Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiiAnglesCmd
	 * @generated
	 */
	public Adapter createWiiAnglesCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor <em>Monitor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteMonitor
	 * @generated
	 */
	public Adapter createWiimoteMonitorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings <em>Live Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osc.wiimote.model.wiimote.WiimoteLiveSettings
	 * @generated
	 */
	public Adapter createWiimoteLiveSettingsAdapter() {
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.osccmd.OscRcvCmd <em>Osc Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.osccmd.OscRcvCmd
	 * @generated
	 */
	public Adapter createOscRcvCmdAdapter() {
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

} //WiimoteAdapterFactory
