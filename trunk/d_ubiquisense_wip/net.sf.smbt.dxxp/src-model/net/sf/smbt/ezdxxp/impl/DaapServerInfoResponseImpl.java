/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapCmdResponse;
import net.sf.smbt.ezdxxp.DaapServerInfoResponse;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.smbt.ezdxxp.ServerInfoStatus;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daap Server Info Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#getChunks <em>Chunks</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#getDaapProtocolVersion <em>Daap Protocol Version</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isIndexingSupport <em>Indexing Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isExtensionSupport <em>Extension Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isUpdateSupport <em>Update Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isAutologoutSupport <em>Autologout Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#getTimeoutInterval <em>Timeout Interval</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isLoginRequired <em>Login Required</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isQueriesSupport <em>Queries Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#getServerName <em>Server Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isResolveSupport <em>Resolve Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isBrowsingSupport <em>Browsing Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#isPersitenceSupport <em>Persitence Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl#getDmapProtocolVersion <em>Dmap Protocol Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DaapServerInfoResponseImpl extends DaapCmdChunkImpl implements DaapServerInfoResponse {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaapServerInfoResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Chunk> getChunks() {
		return (EList<Chunk>)eGet(EzdxxpPackage.Literals.DAAP_CMD_RESPONSE__CHUNKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerInfoStatus getStatus() {
		return (ServerInfoStatus)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__STATUS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ServerInfoStatus newStatus) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__STATUS, newStatus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDaapProtocolVersion() {
		return (Double)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDaapProtocolVersion(double newDaapProtocolVersion) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION, newDaapProtocolVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIndexingSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexingSupport(boolean newIndexingSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT, newIndexingSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExtensionSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionSupport(boolean newExtensionSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT, newExtensionSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdateSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateSupport(boolean newUpdateSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT, newUpdateSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAutologoutSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutologoutSupport(boolean newAutologoutSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT, newAutologoutSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getTimeoutInterval() {
		return (Long)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutInterval(long newTimeoutInterval) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL, newTimeoutInterval);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoginRequired() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoginRequired(boolean newLoginRequired) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED, newLoginRequired);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isQueriesSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueriesSupport(boolean newQueriesSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT, newQueriesSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServerName() {
		return (String)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__SERVER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServerName(String newServerName) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__SERVER_NAME, newServerName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolveSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResolveSupport(boolean newResolveSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT, newResolveSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBrowsingSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrowsingSupport(boolean newBrowsingSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT, newBrowsingSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPersitenceSupport() {
		return (Boolean)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersitenceSupport(boolean newPersitenceSupport) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT, newPersitenceSupport);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDmapProtocolVersion() {
		return (Double)eGet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDmapProtocolVersion(double newDmapProtocolVersion) {
		eSet(EzdxxpPackage.Literals.DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION, newDmapProtocolVersion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DaapCmdResponse.class) {
			switch (derivedFeatureID) {
				case EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__CHUNKS: return EzdxxpPackage.DAAP_CMD_RESPONSE__CHUNKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DaapCmdResponse.class) {
			switch (baseFeatureID) {
				case EzdxxpPackage.DAAP_CMD_RESPONSE__CHUNKS: return EzdxxpPackage.DAAP_SERVER_INFO_RESPONSE__CHUNKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //DaapServerInfoResponseImpl
