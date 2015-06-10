/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd.impl;

import net.sf.smbt.xbeecmd.RxResponse16;
import net.sf.smbt.xbeecmd.RxResponse64;
import net.sf.smbt.xbeecmd.TxRequest16;
import net.sf.smbt.xbeecmd.TxRequest64;
import net.sf.smbt.xbeecmd.XBeeAtRcvCmd;
import net.sf.smbt.xbeecmd.XBeeAtSndCmd;
import net.sf.smbt.xbeecmd.XBeeRcvCmd;
import net.sf.smbt.xbeecmd.XBeeSndCmd;
import net.sf.smbt.xbeecmd.XbeecmdFactory;
import net.sf.smbt.xbeecmd.XbeecmdPackage;

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
public class XbeecmdFactoryImpl extends EFactoryImpl implements XbeecmdFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XbeecmdFactory init() {
		try {
			XbeecmdFactory theXbeecmdFactory = (XbeecmdFactory)EPackage.Registry.INSTANCE.getEFactory("http://xbeecmd/1.0"); 
			if (theXbeecmdFactory != null) {
				return theXbeecmdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XbeecmdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecmdFactoryImpl() {
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
			case XbeecmdPackage.XBEE_SND_CMD: return createXBeeSndCmd();
			case XbeecmdPackage.XBEE_RCV_CMD: return createXBeeRcvCmd();
			case XbeecmdPackage.XBEE_AT_SND_CMD: return createXBeeAtSndCmd();
			case XbeecmdPackage.XBEE_AT_RCV_CMD: return createXBeeAtRcvCmd();
			case XbeecmdPackage.TX_REQUEST16: return createTxRequest16();
			case XbeecmdPackage.TX_REQUEST64: return createTxRequest64();
			case XbeecmdPackage.RX_RESPONSE16: return createRxResponse16();
			case XbeecmdPackage.RX_RESPONSE64: return createRxResponse64();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeSndCmd createXBeeSndCmd() {
		XBeeSndCmdImpl xBeeSndCmd = new XBeeSndCmdImpl();
		return xBeeSndCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeRcvCmd createXBeeRcvCmd() {
		XBeeRcvCmdImpl xBeeRcvCmd = new XBeeRcvCmdImpl();
		return xBeeRcvCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeAtSndCmd createXBeeAtSndCmd() {
		XBeeAtSndCmdImpl xBeeAtSndCmd = new XBeeAtSndCmdImpl();
		return xBeeAtSndCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBeeAtRcvCmd createXBeeAtRcvCmd() {
		XBeeAtRcvCmdImpl xBeeAtRcvCmd = new XBeeAtRcvCmdImpl();
		return xBeeAtRcvCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TxRequest16 createTxRequest16() {
		TxRequest16Impl txRequest16 = new TxRequest16Impl();
		return txRequest16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TxRequest64 createTxRequest64() {
		TxRequest64Impl txRequest64 = new TxRequest64Impl();
		return txRequest64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RxResponse16 createRxResponse16() {
		RxResponse16Impl rxResponse16 = new RxResponse16Impl();
		return rxResponse16;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RxResponse64 createRxResponse64() {
		RxResponse64Impl rxResponse64 = new RxResponse64Impl();
		return rxResponse64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XbeecmdPackage getXbeecmdPackage() {
		return (XbeecmdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XbeecmdPackage getPackage() {
		return XbeecmdPackage.eINSTANCE;
	}

} //XbeecmdFactoryImpl
