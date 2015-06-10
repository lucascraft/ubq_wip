/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd.util;

import net.sf.smbt.xbeecmd.RxResponse16;
import net.sf.smbt.xbeecmd.RxResponse64;
import net.sf.smbt.xbeecmd.TxRequest16;
import net.sf.smbt.xbeecmd.TxRequest64;
import net.sf.smbt.xbeecmd.XBeeAtRcvCmd;
import net.sf.smbt.xbeecmd.XBeeAtSndCmd;
import net.sf.smbt.xbeecmd.XBeeRcvCmd;
import net.sf.smbt.xbeecmd.XBeeSndCmd;
import net.sf.smbt.xbeecmd.XbeecmdPackage;
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
 * @see net.sf.smbt.xbeecmd.XbeecmdPackage
 * @generated
 */
public class XbeecmdAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static XbeecmdPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecmdAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = XbeecmdPackage.eINSTANCE;
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
	protected XbeecmdSwitch<Adapter> modelSwitch =
		new XbeecmdSwitch<Adapter>() {
			@Override
			public Adapter caseXBeeSndCmd(XBeeSndCmd object) {
				return createXBeeSndCmdAdapter();
			}
			@Override
			public Adapter caseXBeeRcvCmd(XBeeRcvCmd object) {
				return createXBeeRcvCmdAdapter();
			}
			@Override
			public Adapter caseXBeeAtSndCmd(XBeeAtSndCmd object) {
				return createXBeeAtSndCmdAdapter();
			}
			@Override
			public Adapter caseXBeeAtRcvCmd(XBeeAtRcvCmd object) {
				return createXBeeAtRcvCmdAdapter();
			}
			@Override
			public Adapter caseTxRequest16(TxRequest16 object) {
				return createTxRequest16Adapter();
			}
			@Override
			public Adapter caseTxRequest64(TxRequest64 object) {
				return createTxRequest64Adapter();
			}
			@Override
			public Adapter caseRxResponse16(RxResponse16 object) {
				return createRxResponse16Adapter();
			}
			@Override
			public Adapter caseRxResponse64(RxResponse64 object) {
				return createRxResponse64Adapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
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
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.XBeeSndCmd <em>XBee Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.XBeeSndCmd
	 * @generated
	 */
	public Adapter createXBeeSndCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.XBeeRcvCmd <em>XBee Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.XBeeRcvCmd
	 * @generated
	 */
	public Adapter createXBeeRcvCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.XBeeAtSndCmd <em>XBee At Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.XBeeAtSndCmd
	 * @generated
	 */
	public Adapter createXBeeAtSndCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.XBeeAtRcvCmd <em>XBee At Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.XBeeAtRcvCmd
	 * @generated
	 */
	public Adapter createXBeeAtRcvCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.TxRequest16 <em>Tx Request16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.TxRequest16
	 * @generated
	 */
	public Adapter createTxRequest16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.TxRequest64 <em>Tx Request64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.TxRequest64
	 * @generated
	 */
	public Adapter createTxRequest64Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.RxResponse16 <em>Rx Response16</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.RxResponse16
	 * @generated
	 */
	public Adapter createRxResponse16Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.xbeecmd.RxResponse64 <em>Rx Response64</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.xbeecmd.RxResponse64
	 * @generated
	 */
	public Adapter createRxResponse64Adapter() {
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

} //XbeecmdAdapterFactory
