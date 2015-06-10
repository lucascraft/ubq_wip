/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.DaapCmdChunk;
import net.sf.smbt.ezdxxp.EzdxxpPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Cmd Chunk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl#getSize <em>Size</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl#getData <em>Data</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl#getReq <em>Req</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapCmdChunkImpl extends DaapCmdImpl implements DaapCmdChunk {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapCmdChunkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_CMD_CHUNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getSize() {
		return (byte[])eGet(EzdxxpPackage.Literals.DAAP_CMD_CHUNK__SIZE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(byte[] newSize) {
		eSet(EzdxxpPackage.Literals.DAAP_CMD_CHUNK__SIZE, newSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getData() {
		return (byte[])eGet(EzdxxpPackage.Literals.DAAP_CMD_CHUNK__DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(byte[] newData) {
		eSet(EzdxxpPackage.Literals.DAAP_CMD_CHUNK__DATA, newData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReq() {
		return (String)eGet(EzdxxpPackage.Literals.DAAP_CMD_CHUNK__REQ, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReq(String newReq) {
		eSet(EzdxxpPackage.Literals.DAAP_CMD_CHUNK__REQ, newReq);
	}

} //DaapCmdChunkImpl
