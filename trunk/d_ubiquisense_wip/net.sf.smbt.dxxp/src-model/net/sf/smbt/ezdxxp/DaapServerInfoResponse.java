/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daap Server Info Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 	 msrv
 * 	   mstt - status
 * 	   apro - daap protocol
 * 	   msix - does the server support indexing?
 * 	   msex - does the server support extensions?
 * 	   msup - does the server support update?
 * 	   msal - does the server support auto-logout?
 * 	   mstm - timeout interval
 * 	   mslr - is login required?
 * 	   msqy - does the server support queries?
 * 	   minm - server name
 * 	   msrs - does the server support resolve?  (needs persistent ids)
 * 	   msbr - does the server support browsing?
 *   	   mspi - does the server support persistent ids?
 * 	   mpro - dmap protocol version
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDaapProtocolVersion <em>Daap Protocol Version</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isIndexingSupport <em>Indexing Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isExtensionSupport <em>Extension Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isUpdateSupport <em>Update Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isAutologoutSupport <em>Autologout Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getTimeoutInterval <em>Timeout Interval</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isLoginRequired <em>Login Required</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isQueriesSupport <em>Queries Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getServerName <em>Server Name</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isResolveSupport <em>Resolve Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isBrowsingSupport <em>Browsing Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isPersitenceSupport <em>Persitence Support</em>}</li>
 *   <li>{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDmapProtocolVersion <em>Dmap Protocol Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse()
 * @model
 * @generated
 */
public interface DaapServerInfoResponse extends DaapCmdChunk, DaapCmdResponse {

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link net.sf.smbt.ezdxxp.ServerInfoStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ezdxxp.ServerInfoStatus
	 * @see #setStatus(ServerInfoStatus)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_Status()
	 * @model
	 * @generated
	 */
	ServerInfoStatus getStatus();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see net.sf.smbt.ezdxxp.ServerInfoStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ServerInfoStatus value);

	/**
	 * Returns the value of the '<em><b>Daap Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daap Protocol Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daap Protocol Version</em>' attribute.
	 * @see #setDaapProtocolVersion(double)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_DaapProtocolVersion()
	 * @model
	 * @generated
	 */
	double getDaapProtocolVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDaapProtocolVersion <em>Daap Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daap Protocol Version</em>' attribute.
	 * @see #getDaapProtocolVersion()
	 * @generated
	 */
	void setDaapProtocolVersion(double value);

	/**
	 * Returns the value of the '<em><b>Indexing Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indexing Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indexing Support</em>' attribute.
	 * @see #setIndexingSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_IndexingSupport()
	 * @model
	 * @generated
	 */
	boolean isIndexingSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isIndexingSupport <em>Indexing Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indexing Support</em>' attribute.
	 * @see #isIndexingSupport()
	 * @generated
	 */
	void setIndexingSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Extension Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extension Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extension Support</em>' attribute.
	 * @see #setExtensionSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_ExtensionSupport()
	 * @model
	 * @generated
	 */
	boolean isExtensionSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isExtensionSupport <em>Extension Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extension Support</em>' attribute.
	 * @see #isExtensionSupport()
	 * @generated
	 */
	void setExtensionSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Update Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Support</em>' attribute.
	 * @see #setUpdateSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_UpdateSupport()
	 * @model
	 * @generated
	 */
	boolean isUpdateSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isUpdateSupport <em>Update Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Support</em>' attribute.
	 * @see #isUpdateSupport()
	 * @generated
	 */
	void setUpdateSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Autologout Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Autologout Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Autologout Support</em>' attribute.
	 * @see #setAutologoutSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_AutologoutSupport()
	 * @model
	 * @generated
	 */
	boolean isAutologoutSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isAutologoutSupport <em>Autologout Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Autologout Support</em>' attribute.
	 * @see #isAutologoutSupport()
	 * @generated
	 */
	void setAutologoutSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Timeout Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout Interval</em>' attribute.
	 * @see #setTimeoutInterval(long)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_TimeoutInterval()
	 * @model
	 * @generated
	 */
	long getTimeoutInterval();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getTimeoutInterval <em>Timeout Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout Interval</em>' attribute.
	 * @see #getTimeoutInterval()
	 * @generated
	 */
	void setTimeoutInterval(long value);

	/**
	 * Returns the value of the '<em><b>Login Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login Required</em>' attribute.
	 * @see #setLoginRequired(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_LoginRequired()
	 * @model
	 * @generated
	 */
	boolean isLoginRequired();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isLoginRequired <em>Login Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login Required</em>' attribute.
	 * @see #isLoginRequired()
	 * @generated
	 */
	void setLoginRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Queries Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries Support</em>' attribute.
	 * @see #setQueriesSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_QueriesSupport()
	 * @model
	 * @generated
	 */
	boolean isQueriesSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isQueriesSupport <em>Queries Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queries Support</em>' attribute.
	 * @see #isQueriesSupport()
	 * @generated
	 */
	void setQueriesSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Name</em>' attribute.
	 * @see #setServerName(String)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_ServerName()
	 * @model
	 * @generated
	 */
	String getServerName();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getServerName <em>Server Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Name</em>' attribute.
	 * @see #getServerName()
	 * @generated
	 */
	void setServerName(String value);

	/**
	 * Returns the value of the '<em><b>Resolve Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolve Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolve Support</em>' attribute.
	 * @see #setResolveSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_ResolveSupport()
	 * @model
	 * @generated
	 */
	boolean isResolveSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isResolveSupport <em>Resolve Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolve Support</em>' attribute.
	 * @see #isResolveSupport()
	 * @generated
	 */
	void setResolveSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Browsing Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Browsing Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Browsing Support</em>' attribute.
	 * @see #setBrowsingSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_BrowsingSupport()
	 * @model
	 * @generated
	 */
	boolean isBrowsingSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isBrowsingSupport <em>Browsing Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Browsing Support</em>' attribute.
	 * @see #isBrowsingSupport()
	 * @generated
	 */
	void setBrowsingSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Persitence Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persitence Support</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persitence Support</em>' attribute.
	 * @see #setPersitenceSupport(boolean)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_PersitenceSupport()
	 * @model
	 * @generated
	 */
	boolean isPersitenceSupport();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isPersitenceSupport <em>Persitence Support</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persitence Support</em>' attribute.
	 * @see #isPersitenceSupport()
	 * @generated
	 */
	void setPersitenceSupport(boolean value);

	/**
	 * Returns the value of the '<em><b>Dmap Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dmap Protocol Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dmap Protocol Version</em>' attribute.
	 * @see #setDmapProtocolVersion(double)
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#getDaapServerInfoResponse_DmapProtocolVersion()
	 * @model
	 * @generated
	 */
	double getDmapProtocolVersion();

	/**
	 * Sets the value of the '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDmapProtocolVersion <em>Dmap Protocol Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dmap Protocol Version</em>' attribute.
	 * @see #getDmapProtocolVersion()
	 * @generated
	 */
	void setDmapProtocolVersion(double value);
} // DaapServerInfoResponse
