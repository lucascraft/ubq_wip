/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapCmd;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.smbt.ezdxxp.HttpProperty;
import net.sf.xqz.model.cmd.impl.CmdImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapCmdImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapCmdImpl#getHttpProperties <em>Http Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapCmdImpl extends CmdImpl implements DaapCmd {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapCmdImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_CMD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getTag() {
		return (byte[])eGet(EzdxxpPackage.Literals.DAAP_CMD__TAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTag(byte[] newTag) {
		eSet(EzdxxpPackage.Literals.DAAP_CMD__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<HttpProperty> getHttpProperties() {
		return (EList<HttpProperty>)eGet(EzdxxpPackage.Literals.DAAP_CMD__HTTP_PROPERTIES, true);
	}

} //DaapCmdImpl
