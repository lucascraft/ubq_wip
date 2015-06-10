/**
 */
package net.sf.smbt.nikeplus.impl;

import net.sf.smbt.comm.httpcmd.impl.HttpCommCmdImpl;

import net.sf.smbt.nikeplus.NikeplusCmd;
import net.sf.smbt.nikeplus.NikeplusPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class NikeplusCmdImpl extends HttpCommCmdImpl implements NikeplusCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NikeplusCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NikeplusPackage.Literals.NIKEPLUS_CMD;
	}

} //NikeplusCmdImpl
