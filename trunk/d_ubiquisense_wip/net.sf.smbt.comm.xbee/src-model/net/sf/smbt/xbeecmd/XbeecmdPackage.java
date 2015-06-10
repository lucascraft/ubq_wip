/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbeecmd.XbeecmdFactory
 * @model kind="package"
 * @generated
 */
public interface XbeecmdPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xbeecmd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://xbeecmd/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xbeecmd";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeecmdPackage eINSTANCE = net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.XBeeSndCmdImpl <em>XBee Snd Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.XBeeSndCmdImpl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeSndCmd()
	 * @generated
	 */
	int XBEE_SND_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_SND_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>XBee Snd Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_SND_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.XBeeRcvCmdImpl <em>XBee Rcv Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.XBeeRcvCmdImpl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeRcvCmd()
	 * @generated
	 */
	int XBEE_RCV_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_RCV_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>XBee Rcv Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_RCV_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.XBeeAtSndCmdImpl <em>XBee At Snd Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.XBeeAtSndCmdImpl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeAtSndCmd()
	 * @generated
	 */
	int XBEE_AT_SND_CMD = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_AT_SND_CMD__PRIORITY = XBEE_SND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>At Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_AT_SND_CMD__AT_CMD = XBEE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XBee At Snd Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_AT_SND_CMD_FEATURE_COUNT = XBEE_SND_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.XBeeAtRcvCmdImpl <em>XBee At Rcv Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.XBeeAtRcvCmdImpl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeAtRcvCmd()
	 * @generated
	 */
	int XBEE_AT_RCV_CMD = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_AT_RCV_CMD__PRIORITY = XBEE_RCV_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>At Cmd</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_AT_RCV_CMD__AT_CMD = XBEE_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XBee At Rcv Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBEE_AT_RCV_CMD_FEATURE_COUNT = XBEE_RCV_CMD_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.TxRequest16Impl <em>Tx Request16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.TxRequest16Impl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getTxRequest16()
	 * @generated
	 */
	int TX_REQUEST16 = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_REQUEST16__PRIORITY = XBEE_SND_CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>Tx Request16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_REQUEST16_FEATURE_COUNT = XBEE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.TxRequest64Impl <em>Tx Request64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.TxRequest64Impl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getTxRequest64()
	 * @generated
	 */
	int TX_REQUEST64 = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_REQUEST64__PRIORITY = XBEE_SND_CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>Tx Request64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TX_REQUEST64_FEATURE_COUNT = XBEE_SND_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.RxResponse16Impl <em>Rx Response16</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.RxResponse16Impl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getRxResponse16()
	 * @generated
	 */
	int RX_RESPONSE16 = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_RESPONSE16__PRIORITY = XBEE_RCV_CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>Rx Response16</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_RESPONSE16_FEATURE_COUNT = XBEE_RCV_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.xbeecmd.impl.RxResponse64Impl <em>Rx Response64</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.xbeecmd.impl.RxResponse64Impl
	 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getRxResponse64()
	 * @generated
	 */
	int RX_RESPONSE64 = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_RESPONSE64__PRIORITY = XBEE_RCV_CMD__PRIORITY;

	/**
	 * The number of structural features of the '<em>Rx Response64</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RX_RESPONSE64_FEATURE_COUNT = XBEE_RCV_CMD_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.XBeeSndCmd <em>XBee Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee Snd Cmd</em>'.
	 * @see net.sf.smbt.xbeecmd.XBeeSndCmd
	 * @generated
	 */
	EClass getXBeeSndCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.XBeeRcvCmd <em>XBee Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee Rcv Cmd</em>'.
	 * @see net.sf.smbt.xbeecmd.XBeeRcvCmd
	 * @generated
	 */
	EClass getXBeeRcvCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.XBeeAtSndCmd <em>XBee At Snd Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee At Snd Cmd</em>'.
	 * @see net.sf.smbt.xbeecmd.XBeeAtSndCmd
	 * @generated
	 */
	EClass getXBeeAtSndCmd();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.xbeecmd.XBeeAtSndCmd#getAtCmd <em>At Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At Cmd</em>'.
	 * @see net.sf.smbt.xbeecmd.XBeeAtSndCmd#getAtCmd()
	 * @see #getXBeeAtSndCmd()
	 * @generated
	 */
	EReference getXBeeAtSndCmd_AtCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.XBeeAtRcvCmd <em>XBee At Rcv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBee At Rcv Cmd</em>'.
	 * @see net.sf.smbt.xbeecmd.XBeeAtRcvCmd
	 * @generated
	 */
	EClass getXBeeAtRcvCmd();

	/**
	 * Returns the meta object for the reference '{@link net.sf.smbt.xbeecmd.XBeeAtRcvCmd#getAtCmd <em>At Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>At Cmd</em>'.
	 * @see net.sf.smbt.xbeecmd.XBeeAtRcvCmd#getAtCmd()
	 * @see #getXBeeAtRcvCmd()
	 * @generated
	 */
	EReference getXBeeAtRcvCmd_AtCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.TxRequest16 <em>Tx Request16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tx Request16</em>'.
	 * @see net.sf.smbt.xbeecmd.TxRequest16
	 * @generated
	 */
	EClass getTxRequest16();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.TxRequest64 <em>Tx Request64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tx Request64</em>'.
	 * @see net.sf.smbt.xbeecmd.TxRequest64
	 * @generated
	 */
	EClass getTxRequest64();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.RxResponse16 <em>Rx Response16</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rx Response16</em>'.
	 * @see net.sf.smbt.xbeecmd.RxResponse16
	 * @generated
	 */
	EClass getRxResponse16();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.xbeecmd.RxResponse64 <em>Rx Response64</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rx Response64</em>'.
	 * @see net.sf.smbt.xbeecmd.RxResponse64
	 * @generated
	 */
	EClass getRxResponse64();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XbeecmdFactory getXbeecmdFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.XBeeSndCmdImpl <em>XBee Snd Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.XBeeSndCmdImpl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeSndCmd()
		 * @generated
		 */
		EClass XBEE_SND_CMD = eINSTANCE.getXBeeSndCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.XBeeRcvCmdImpl <em>XBee Rcv Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.XBeeRcvCmdImpl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeRcvCmd()
		 * @generated
		 */
		EClass XBEE_RCV_CMD = eINSTANCE.getXBeeRcvCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.XBeeAtSndCmdImpl <em>XBee At Snd Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.XBeeAtSndCmdImpl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeAtSndCmd()
		 * @generated
		 */
		EClass XBEE_AT_SND_CMD = eINSTANCE.getXBeeAtSndCmd();

		/**
		 * The meta object literal for the '<em><b>At Cmd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBEE_AT_SND_CMD__AT_CMD = eINSTANCE.getXBeeAtSndCmd_AtCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.XBeeAtRcvCmdImpl <em>XBee At Rcv Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.XBeeAtRcvCmdImpl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getXBeeAtRcvCmd()
		 * @generated
		 */
		EClass XBEE_AT_RCV_CMD = eINSTANCE.getXBeeAtRcvCmd();

		/**
		 * The meta object literal for the '<em><b>At Cmd</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XBEE_AT_RCV_CMD__AT_CMD = eINSTANCE.getXBeeAtRcvCmd_AtCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.TxRequest16Impl <em>Tx Request16</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.TxRequest16Impl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getTxRequest16()
		 * @generated
		 */
		EClass TX_REQUEST16 = eINSTANCE.getTxRequest16();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.TxRequest64Impl <em>Tx Request64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.TxRequest64Impl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getTxRequest64()
		 * @generated
		 */
		EClass TX_REQUEST64 = eINSTANCE.getTxRequest64();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.RxResponse16Impl <em>Rx Response16</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.RxResponse16Impl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getRxResponse16()
		 * @generated
		 */
		EClass RX_RESPONSE16 = eINSTANCE.getRxResponse16();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.xbeecmd.impl.RxResponse64Impl <em>Rx Response64</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.xbeecmd.impl.RxResponse64Impl
		 * @see net.sf.smbt.xbeecmd.impl.XbeecmdPackageImpl#getRxResponse64()
		 * @generated
		 */
		EClass RX_RESPONSE64 = eINSTANCE.getRxResponse64();

	}

} //XbeecmdPackage
