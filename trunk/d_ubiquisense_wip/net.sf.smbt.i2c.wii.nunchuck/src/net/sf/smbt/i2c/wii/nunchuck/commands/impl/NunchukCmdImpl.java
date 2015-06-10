/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.i2c.wii.nunchuck.commands.impl;

import net.sf.smbt.i2c.wii.nunchuck.commands.CommandsPackage;
import net.sf.smbt.i2c.wii.nunchuck.commands.NunchukCmd;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nunchuk Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.i2c.wii.nunchuck.commands.impl.NunchukCmdImpl#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NunchukCmdImpl extends CmdImpl implements NunchukCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NunchukCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CommandsPackage.Literals.NUNCHUK_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddr() {
		return (String)eGet(CommandsPackage.Literals.NUNCHUK_CMD__ADDR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddr(String newAddr) {
		eSet(CommandsPackage.Literals.NUNCHUK_CMD__ADDR, newAddr);
	}

} //NunchukCmdImpl
