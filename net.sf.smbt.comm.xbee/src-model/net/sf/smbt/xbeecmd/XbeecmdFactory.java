/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.xbeecmd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.xbeecmd.XbeecmdPackage
 * @generated
 */
public interface XbeecmdFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XbeecmdFactory eINSTANCE = net.sf.smbt.xbeecmd.impl.XbeecmdFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XBee Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee Snd Cmd</em>'.
	 * @generated
	 */
	XBeeSndCmd createXBeeSndCmd();

	/**
	 * Returns a new object of class '<em>XBee Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee Rcv Cmd</em>'.
	 * @generated
	 */
	XBeeRcvCmd createXBeeRcvCmd();

	/**
	 * Returns a new object of class '<em>XBee At Snd Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee At Snd Cmd</em>'.
	 * @generated
	 */
	XBeeAtSndCmd createXBeeAtSndCmd();

	/**
	 * Returns a new object of class '<em>XBee At Rcv Cmd</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XBee At Rcv Cmd</em>'.
	 * @generated
	 */
	XBeeAtRcvCmd createXBeeAtRcvCmd();

	/**
	 * Returns a new object of class '<em>Tx Request16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tx Request16</em>'.
	 * @generated
	 */
	TxRequest16 createTxRequest16();

	/**
	 * Returns a new object of class '<em>Tx Request64</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tx Request64</em>'.
	 * @generated
	 */
	TxRequest64 createTxRequest64();

	/**
	 * Returns a new object of class '<em>Rx Response16</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rx Response16</em>'.
	 * @generated
	 */
	RxResponse16 createRxResponse16();

	/**
	 * Returns a new object of class '<em>Rx Response64</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rx Response64</em>'.
	 * @generated
	 */
	RxResponse64 createRxResponse64();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XbeecmdPackage getXbeecmdPackage();

} //XbeecmdFactory
