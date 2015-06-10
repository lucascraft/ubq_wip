/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see net.sf.smbt.ezdxxp.EzdxxpFactory
 * @model kind="package"
 * @generated
 */
public interface EzdxxpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ezdxxp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ezdxxp/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ezdxxp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EzdxxpPackage eINSTANCE = net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapCmdImpl <em>Daap Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapCmdImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapCmd()
	 * @generated
	 */
	int DAAP_CMD = 27;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD__TAG = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD__HTTP_PROPERTIES = CmdPackage.CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Daap Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl <em>Daap Cmd Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapCmdChunk()
	 * @generated
	 */
	int DAAP_CMD_CHUNK = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK__PRIORITY = DAAP_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK__TAG = DAAP_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK__HTTP_PROPERTIES = DAAP_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK__SIZE = DAAP_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK__DATA = DAAP_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK__REQ = DAAP_CMD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Daap Cmd Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_CHUNK_FEATURE_COUNT = DAAP_CMD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapListCmdImpl <em>Daap List Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapListCmdImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListCmd()
	 * @generated
	 */
	int DAAP_LIST_CMD = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_CMD__PRIORITY = CmdPackage.COMPOUND_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_CMD__CHILDREN = CmdPackage.COMPOUND_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_CMD__TAG = CmdPackage.COMPOUND_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_CMD__HTTP_PROPERTIES = CmdPackage.COMPOUND_CMD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Daap List Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_CMD_FEATURE_COUNT = CmdPackage.COMPOUND_CMD_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoRequestImpl <em>Daap Server Info Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapServerInfoRequestImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapServerInfoRequest()
	 * @generated
	 */
	int DAAP_SERVER_INFO_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Server Info Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_REQUEST_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl <em>Daap Server Info Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapServerInfoResponse()
	 * @generated
	 */
	int DAAP_SERVER_INFO_RESPONSE = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__CHUNKS = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__STATUS = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Daap Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION = DAAP_CMD_CHUNK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indexing Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Extension Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Update Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Autologout Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timeout Interval</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL = DAAP_CMD_CHUNK_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Login Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED = DAAP_CMD_CHUNK_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Queries Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Server Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__SERVER_NAME = DAAP_CMD_CHUNK_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Resolve Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Browsing Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Persitence Support</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT = DAAP_CMD_CHUNK_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Dmap Protocol Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION = DAAP_CMD_CHUNK_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Daap Server Info Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_SERVER_INFO_RESPONSE_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestForContentCodesImpl <em>Daap Request For Content Codes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapRequestForContentCodesImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestForContentCodes()
	 * @generated
	 */
	int DAAP_REQUEST_FOR_CONTENT_CODES = 4;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_FOR_CONTENT_CODES__PRIORITY = DAAP_LIST_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_FOR_CONTENT_CODES__CHILDREN = DAAP_LIST_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_FOR_CONTENT_CODES__TAG = DAAP_LIST_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_FOR_CONTENT_CODES__HTTP_PROPERTIES = DAAP_LIST_CMD__HTTP_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Daap Request For Content Codes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_FOR_CONTENT_CODES_FEATURE_COUNT = DAAP_LIST_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapContentCodesResponseImpl <em>Daap Content Codes Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapContentCodesResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapContentCodesResponse()
	 * @generated
	 */
	int DAAP_CONTENT_CODES_RESPONSE = 5;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_RESPONSE__PRIORITY = DAAP_LIST_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_RESPONSE__CHILDREN = DAAP_LIST_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_RESPONSE__TAG = DAAP_LIST_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_RESPONSE__HTTP_PROPERTIES = DAAP_LIST_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_RESPONSE__CHUNKS = DAAP_LIST_CMD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Daap Content Codes Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_RESPONSE_FEATURE_COUNT = DAAP_LIST_CMD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapLoginImpl <em>Daap Login</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapLoginImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapLogin()
	 * @generated
	 */
	int DAAP_LOGIN = 6;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Login</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl <em>Daap Login Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapLoginResponse()
	 * @generated
	 */
	int DAAP_LOGIN_RESPONSE = 7;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__CHUNKS = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__STATUS = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE__SESSION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Daap Login Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGIN_RESPONSE_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapUpdateRequestImpl <em>Daap Update Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapUpdateRequestImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapUpdateRequest()
	 * @generated
	 */
	int DAAP_UPDATE_REQUEST = 8;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__SESSION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST__REVISION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Daap Update Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_REQUEST_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapDatabaseRequestImpl <em>Daap Database Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapDatabaseRequestImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDatabaseRequest()
	 * @generated
	 */
	int DAAP_DATABASE_REQUEST = 9;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__SESSION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST__REVISION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Daap Database Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABASE_REQUEST_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl <em>Daap Databse Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDatabseResponse()
	 * @generated
	 */
	int DAAP_DATABSE_RESPONSE = 10;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__CHUNKS = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__STATUS = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Matching Records</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__MATCHING_RECORDS = DAAP_CMD_CHUNK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Records Returned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__RECORDS_RETURNED = DAAP_CMD_CHUNK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE__RECORDS = DAAP_CMD_CHUNK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Daap Databse Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DATABSE_RESPONSE_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestSongsImpl <em>Daap Request Songs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapRequestSongsImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestSongs()
	 * @generated
	 */
	int DAAP_REQUEST_SONGS = 11;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Request Songs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_SONGS_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapListOfSongsInDBImpl <em>Daap List Of Songs In DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapListOfSongsInDBImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListOfSongsInDB()
	 * @generated
	 */
	int DAAP_LIST_OF_SONGS_IN_DB = 12;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_DB__PRIORITY = DAAP_LIST_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_DB__CHILDREN = DAAP_LIST_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_DB__TAG = DAAP_LIST_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_DB__HTTP_PROPERTIES = DAAP_LIST_CMD__HTTP_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Daap List Of Songs In DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_DB_FEATURE_COUNT = DAAP_LIST_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistsImpl <em>Daap Request Playlists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistsImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestPlaylists()
	 * @generated
	 */
	int DAAP_REQUEST_PLAYLISTS = 13;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Request Playlists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLISTS_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapListOfPlaylistsInDBImpl <em>Daap List Of Playlists In DB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapListOfPlaylistsInDBImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListOfPlaylistsInDB()
	 * @generated
	 */
	int DAAP_LIST_OF_PLAYLISTS_IN_DB = 14;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_PLAYLISTS_IN_DB__PRIORITY = DAAP_LIST_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_PLAYLISTS_IN_DB__CHILDREN = DAAP_LIST_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_PLAYLISTS_IN_DB__TAG = DAAP_LIST_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_PLAYLISTS_IN_DB__HTTP_PROPERTIES = DAAP_LIST_CMD__HTTP_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Daap List Of Playlists In DB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_PLAYLISTS_IN_DB_FEATURE_COUNT = DAAP_LIST_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistImpl <em>Daap Request Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestPlaylist()
	 * @generated
	 */
	int DAAP_REQUEST_PLAYLIST = 15;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Request Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_PLAYLIST_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapListOfSongsInPlaylistImpl <em>Daap List Of Songs In Playlist</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapListOfSongsInPlaylistImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListOfSongsInPlaylist()
	 * @generated
	 */
	int DAAP_LIST_OF_SONGS_IN_PLAYLIST = 16;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_PLAYLIST__PRIORITY = DAAP_LIST_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_PLAYLIST__CHILDREN = DAAP_LIST_CMD__CHILDREN;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_PLAYLIST__TAG = DAAP_LIST_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_PLAYLIST__HTTP_PROPERTIES = DAAP_LIST_CMD__HTTP_PROPERTIES;

	/**
	 * The number of structural features of the '<em>Daap List Of Songs In Playlist</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LIST_OF_SONGS_IN_PLAYLIST_FEATURE_COUNT = DAAP_LIST_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestMediaStreamImpl <em>Daap Request Media Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapRequestMediaStreamImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestMediaStream()
	 * @generated
	 */
	int DAAP_REQUEST_MEDIA_STREAM = 17;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Request Media Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_REQUEST_MEDIA_STREAM_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapStreamResponseImpl <em>Daap Stream Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapStreamResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapStreamResponse()
	 * @generated
	 */
	int DAAP_STREAM_RESPONSE = 18;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE__CHUNKS = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Daap Stream Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_STREAM_RESPONSE_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapQueryCmdImpl <em>Daap Query Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapQueryCmdImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapQueryCmd()
	 * @generated
	 */
	int DAAP_QUERY_CMD = 19;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD__QUERY = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Daap Query Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_QUERY_CMD_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapMsrvCmdImpl <em>Daap Msrv Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapMsrvCmdImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMsrvCmd()
	 * @generated
	 */
	int DAAP_MSRV_CMD = 20;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Msrv Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MSRV_CMD_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapMccrImpl <em>Daap Mccr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapMccrImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMccr()
	 * @generated
	 */
	int DAAP_MCCR = 21;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Mccr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MCCR_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapMlogImpl <em>Daap Mlog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapMlogImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMlog()
	 * @generated
	 */
	int DAAP_MLOG = 22;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Mlog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MLOG_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapMupdImpl <em>Daap Mupd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapMupdImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMupd()
	 * @generated
	 */
	int DAAP_MUPD = 23;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Mupd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_MUPD_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapAvdbImpl <em>Daap Avdb</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapAvdbImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapAvdb()
	 * @generated
	 */
	int DAAP_AVDB = 24;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Avdb</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_AVDB_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapApsoRetImpl <em>Daap Apso Ret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapApsoRetImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapApsoRet()
	 * @generated
	 */
	int DAAP_APSO_RET = 25;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Apso Ret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APSO_RET_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapAplyImpl <em>Daap Aply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapAplyImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapAply()
	 * @generated
	 */
	int DAAP_APLY = 26;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__PRIORITY = DAAP_QUERY_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__TAG = DAAP_QUERY_CMD__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__HTTP_PROPERTIES = DAAP_QUERY_CMD__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__SIZE = DAAP_QUERY_CMD__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__DATA = DAAP_QUERY_CMD__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__REQ = DAAP_QUERY_CMD__REQ;

	/**
	 * The feature id for the '<em><b>Query</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY__QUERY = DAAP_QUERY_CMD__QUERY;

	/**
	 * The number of structural features of the '<em>Daap Aply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_APLY_FEATURE_COUNT = DAAP_QUERY_CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapUpdateResponseImpl <em>Daap Update Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapUpdateResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapUpdateResponse()
	 * @generated
	 */
	int DAAP_UPDATE_RESPONSE = 28;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__CHUNKS = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Revision ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE__REVISION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Daap Update Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_UPDATE_RESPONSE_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.ChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.ChunkImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getChunk()
	 * @generated
	 */
	int CHUNK = 29;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__DATA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__OFFSET = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK__SIZE = 3;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHUNK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapCmdResponseImpl <em>Daap Cmd Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapCmdResponseImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapCmdResponse()
	 * @generated
	 */
	int DAAP_CMD_RESPONSE = 30;

	/**
	 * The feature id for the '<em><b>Chunks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_RESPONSE__CHUNKS = 0;

	/**
	 * The number of structural features of the '<em>Daap Cmd Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CMD_RESPONSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapContentCodesRequestImpl <em>Daap Content Codes Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapContentCodesRequestImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapContentCodesRequest()
	 * @generated
	 */
	int DAAP_CONTENT_CODES_REQUEST = 31;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The number of structural features of the '<em>Daap Content Codes Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_CONTENT_CODES_REQUEST_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl <em>Daap Dictionnary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDictionnaryEntry()
	 * @generated
	 */
	int DAAP_DICTIONNARY_ENTRY = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DICTIONNARY_ENTRY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DICTIONNARY_ENTRY__NUMBER = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DICTIONNARY_ENTRY__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Daap Dictionnary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DICTIONNARY_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapDBRecordsImpl <em>Daap DB Records</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapDBRecordsImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDBRecords()
	 * @generated
	 */
	int DAAP_DB_RECORDS = 33;

	/**
	 * The number of structural features of the '<em>Daap DB Records</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_DB_RECORDS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.DaapLogoutImpl <em>Daap Logout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.DaapLogoutImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapLogout()
	 * @generated
	 */
	int DAAP_LOGOUT = 34;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__PRIORITY = DAAP_CMD_CHUNK__PRIORITY;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__TAG = DAAP_CMD_CHUNK__TAG;

	/**
	 * The feature id for the '<em><b>Http Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__HTTP_PROPERTIES = DAAP_CMD_CHUNK__HTTP_PROPERTIES;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__SIZE = DAAP_CMD_CHUNK__SIZE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__DATA = DAAP_CMD_CHUNK__DATA;

	/**
	 * The feature id for the '<em><b>Req</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__REQ = DAAP_CMD_CHUNK__REQ;

	/**
	 * The feature id for the '<em><b>Session ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT__SESSION_ID = DAAP_CMD_CHUNK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Daap Logout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAAP_LOGOUT_FEATURE_COUNT = DAAP_CMD_CHUNK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.impl.HttpPropertyImpl <em>Http Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.impl.HttpPropertyImpl
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getHttpProperty()
	 * @generated
	 */
	int HTTP_PROPERTY = 35;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PROPERTY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Http Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.DAAP_HTTP_CONST <em>DAAP HTTP CONST</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.DAAP_HTTP_CONST
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDAAP_HTTP_CONST()
	 * @generated
	 */
	int DAAP_HTTP_CONST = 36;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.DaapRequestTag <em>Daap Request Tag</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.DaapRequestTag
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestTag()
	 * @generated
	 */
	int DAAP_REQUEST_TAG = 37;


	/**
	 * The meta object id for the '{@link net.sf.smbt.ezdxxp.ServerInfoStatus <em>Server Info Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.ezdxxp.ServerInfoStatus
	 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getServerInfoStatus()
	 * @generated
	 */
	int SERVER_INFO_STATUS = 38;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapCmdChunk <em>Daap Cmd Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Cmd Chunk</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmdChunk
	 * @generated
	 */
	EClass getDaapCmdChunk();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmdChunk#getSize()
	 * @see #getDaapCmdChunk()
	 * @generated
	 */
	EAttribute getDaapCmdChunk_Size();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmdChunk#getData()
	 * @see #getDaapCmdChunk()
	 * @generated
	 */
	EAttribute getDaapCmdChunk_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapCmdChunk#getReq <em>Req</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Req</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmdChunk#getReq()
	 * @see #getDaapCmdChunk()
	 * @generated
	 */
	EAttribute getDaapCmdChunk_Req();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapListCmd <em>Daap List Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap List Cmd</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapListCmd
	 * @generated
	 */
	EClass getDaapListCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapServerInfoRequest <em>Daap Server Info Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Server Info Request</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoRequest
	 * @generated
	 */
	EClass getDaapServerInfoRequest();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse <em>Daap Server Info Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Server Info Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse
	 * @generated
	 */
	EClass getDaapServerInfoResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#getStatus()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDaapProtocolVersion <em>Daap Protocol Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daap Protocol Version</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDaapProtocolVersion()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_DaapProtocolVersion();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isIndexingSupport <em>Indexing Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indexing Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isIndexingSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_IndexingSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isExtensionSupport <em>Extension Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isExtensionSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_ExtensionSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isUpdateSupport <em>Update Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isUpdateSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_UpdateSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isAutologoutSupport <em>Autologout Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Autologout Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isAutologoutSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_AutologoutSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getTimeoutInterval <em>Timeout Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Interval</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#getTimeoutInterval()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_TimeoutInterval();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isLoginRequired <em>Login Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Login Required</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isLoginRequired()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_LoginRequired();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isQueriesSupport <em>Queries Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queries Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isQueriesSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_QueriesSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getServerName <em>Server Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Server Name</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#getServerName()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_ServerName();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isResolveSupport <em>Resolve Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resolve Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isResolveSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_ResolveSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isBrowsingSupport <em>Browsing Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Browsing Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isBrowsingSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_BrowsingSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#isPersitenceSupport <em>Persitence Support</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persitence Support</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#isPersitenceSupport()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_PersitenceSupport();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDmapProtocolVersion <em>Dmap Protocol Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dmap Protocol Version</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapServerInfoResponse#getDmapProtocolVersion()
	 * @see #getDaapServerInfoResponse()
	 * @generated
	 */
	EAttribute getDaapServerInfoResponse_DmapProtocolVersion();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapRequestForContentCodes <em>Daap Request For Content Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Request For Content Codes</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapRequestForContentCodes
	 * @generated
	 */
	EClass getDaapRequestForContentCodes();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapContentCodesResponse <em>Daap Content Codes Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Content Codes Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapContentCodesResponse
	 * @generated
	 */
	EClass getDaapContentCodesResponse();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapLogin <em>Daap Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Login</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapLogin
	 * @generated
	 */
	EClass getDaapLogin();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapLoginResponse <em>Daap Login Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Login Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapLoginResponse
	 * @generated
	 */
	EClass getDaapLoginResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapLoginResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapLoginResponse#getStatus()
	 * @see #getDaapLoginResponse()
	 * @generated
	 */
	EAttribute getDaapLoginResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapLoginResponse#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapLoginResponse#getSessionID()
	 * @see #getDaapLoginResponse()
	 * @generated
	 */
	EAttribute getDaapLoginResponse_SessionID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapUpdateRequest <em>Daap Update Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Update Request</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateRequest
	 * @generated
	 */
	EClass getDaapUpdateRequest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapUpdateRequest#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateRequest#getSessionID()
	 * @see #getDaapUpdateRequest()
	 * @generated
	 */
	EAttribute getDaapUpdateRequest_SessionID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapUpdateRequest#getRevisionID <em>Revision ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateRequest#getRevisionID()
	 * @see #getDaapUpdateRequest()
	 * @generated
	 */
	EAttribute getDaapUpdateRequest_RevisionID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest <em>Daap Database Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Database Request</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabaseRequest
	 * @generated
	 */
	EClass getDaapDatabaseRequest();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabaseRequest#getSessionID()
	 * @see #getDaapDatabaseRequest()
	 * @generated
	 */
	EAttribute getDaapDatabaseRequest_SessionID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDatabaseRequest#getRevisionID <em>Revision ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabaseRequest#getRevisionID()
	 * @see #getDaapDatabaseRequest()
	 * @generated
	 */
	EAttribute getDaapDatabaseRequest_RevisionID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse <em>Daap Databse Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Databse Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabseResponse
	 * @generated
	 */
	EClass getDaapDatabseResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabseResponse#getStatus()
	 * @see #getDaapDatabseResponse()
	 * @generated
	 */
	EAttribute getDaapDatabseResponse_Status();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getMatchingRecords <em>Matching Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matching Records</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabseResponse#getMatchingRecords()
	 * @see #getDaapDatabseResponse()
	 * @generated
	 */
	EAttribute getDaapDatabseResponse_MatchingRecords();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecordsReturned <em>Records Returned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Records Returned</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecordsReturned()
	 * @see #getDaapDatabseResponse()
	 * @generated
	 */
	EAttribute getDaapDatabseResponse_RecordsReturned();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDatabseResponse#getRecords()
	 * @see #getDaapDatabseResponse()
	 * @generated
	 */
	EReference getDaapDatabseResponse_Records();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapRequestSongs <em>Daap Request Songs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Request Songs</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapRequestSongs
	 * @generated
	 */
	EClass getDaapRequestSongs();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapListOfSongsInDB <em>Daap List Of Songs In DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap List Of Songs In DB</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapListOfSongsInDB
	 * @generated
	 */
	EClass getDaapListOfSongsInDB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapRequestPlaylists <em>Daap Request Playlists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Request Playlists</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapRequestPlaylists
	 * @generated
	 */
	EClass getDaapRequestPlaylists();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapListOfPlaylistsInDB <em>Daap List Of Playlists In DB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap List Of Playlists In DB</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapListOfPlaylistsInDB
	 * @generated
	 */
	EClass getDaapListOfPlaylistsInDB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapRequestPlaylist <em>Daap Request Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Request Playlist</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapRequestPlaylist
	 * @generated
	 */
	EClass getDaapRequestPlaylist();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapListOfSongsInPlaylist <em>Daap List Of Songs In Playlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap List Of Songs In Playlist</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapListOfSongsInPlaylist
	 * @generated
	 */
	EClass getDaapListOfSongsInPlaylist();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapRequestMediaStream <em>Daap Request Media Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Request Media Stream</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapRequestMediaStream
	 * @generated
	 */
	EClass getDaapRequestMediaStream();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapStreamResponse <em>Daap Stream Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Stream Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapStreamResponse
	 * @generated
	 */
	EClass getDaapStreamResponse();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapQueryCmd <em>Daap Query Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Query Cmd</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapQueryCmd
	 * @generated
	 */
	EClass getDaapQueryCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapQueryCmd#getQuery <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapQueryCmd#getQuery()
	 * @see #getDaapQueryCmd()
	 * @generated
	 */
	EAttribute getDaapQueryCmd_Query();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapMsrvCmd <em>Daap Msrv Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Msrv Cmd</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapMsrvCmd
	 * @generated
	 */
	EClass getDaapMsrvCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapMccr <em>Daap Mccr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Mccr</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapMccr
	 * @generated
	 */
	EClass getDaapMccr();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapMlog <em>Daap Mlog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Mlog</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapMlog
	 * @generated
	 */
	EClass getDaapMlog();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapMupd <em>Daap Mupd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Mupd</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapMupd
	 * @generated
	 */
	EClass getDaapMupd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapAvdb <em>Daap Avdb</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Avdb</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapAvdb
	 * @generated
	 */
	EClass getDaapAvdb();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapApsoRet <em>Daap Apso Ret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Apso Ret</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapApsoRet
	 * @generated
	 */
	EClass getDaapApsoRet();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapAply <em>Daap Aply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Aply</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapAply
	 * @generated
	 */
	EClass getDaapAply();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapCmd <em>Daap Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Cmd</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmd
	 * @generated
	 */
	EClass getDaapCmd();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapCmd#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmd#getTag()
	 * @see #getDaapCmd()
	 * @generated
	 */
	EAttribute getDaapCmd_Tag();

	/**
	 * Returns the meta object for the reference list '{@link net.sf.smbt.ezdxxp.DaapCmd#getHttpProperties <em>Http Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Http Properties</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmd#getHttpProperties()
	 * @see #getDaapCmd()
	 * @generated
	 */
	EReference getDaapCmd_HttpProperties();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapUpdateResponse <em>Daap Update Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Update Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateResponse
	 * @generated
	 */
	EClass getDaapUpdateResponse();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapUpdateResponse#getRevisionID <em>Revision ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Revision ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapUpdateResponse#getRevisionID()
	 * @see #getDaapUpdateResponse()
	 * @generated
	 */
	EAttribute getDaapUpdateResponse_RevisionID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.Chunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see net.sf.smbt.ezdxxp.Chunk
	 * @generated
	 */
	EClass getChunk();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.Chunk#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see net.sf.smbt.ezdxxp.Chunk#getData()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_Data();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.Chunk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezdxxp.Chunk#getName()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.Chunk#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see net.sf.smbt.ezdxxp.Chunk#getOffset()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_Offset();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.Chunk#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.ezdxxp.Chunk#getSize()
	 * @see #getChunk()
	 * @generated
	 */
	EAttribute getChunk_Size();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapCmdResponse <em>Daap Cmd Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Cmd Response</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmdResponse
	 * @generated
	 */
	EClass getDaapCmdResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.ezdxxp.DaapCmdResponse#getChunks <em>Chunks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chunks</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapCmdResponse#getChunks()
	 * @see #getDaapCmdResponse()
	 * @generated
	 */
	EReference getDaapCmdResponse_Chunks();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapContentCodesRequest <em>Daap Content Codes Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Content Codes Request</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapContentCodesRequest
	 * @generated
	 */
	EClass getDaapContentCodesRequest();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapDictionnaryEntry <em>Daap Dictionnary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Dictionnary Entry</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDictionnaryEntry
	 * @generated
	 */
	EClass getDaapDictionnaryEntry();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDictionnaryEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDictionnaryEntry#getName()
	 * @see #getDaapDictionnaryEntry()
	 * @generated
	 */
	EAttribute getDaapDictionnaryEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDictionnaryEntry#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDictionnaryEntry#getNumber()
	 * @see #getDaapDictionnaryEntry()
	 * @generated
	 */
	EAttribute getDaapDictionnaryEntry_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapDictionnaryEntry#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDictionnaryEntry#getType()
	 * @see #getDaapDictionnaryEntry()
	 * @generated
	 */
	EAttribute getDaapDictionnaryEntry_Type();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapDBRecords <em>Daap DB Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap DB Records</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapDBRecords
	 * @generated
	 */
	EClass getDaapDBRecords();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.DaapLogout <em>Daap Logout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Daap Logout</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapLogout
	 * @generated
	 */
	EClass getDaapLogout();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.DaapLogout#getSessionID <em>Session ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Session ID</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapLogout#getSessionID()
	 * @see #getDaapLogout()
	 * @generated
	 */
	EAttribute getDaapLogout_SessionID();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.ezdxxp.HttpProperty <em>Http Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Property</em>'.
	 * @see net.sf.smbt.ezdxxp.HttpProperty
	 * @generated
	 */
	EClass getHttpProperty();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.HttpProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see net.sf.smbt.ezdxxp.HttpProperty#getKey()
	 * @see #getHttpProperty()
	 * @generated
	 */
	EAttribute getHttpProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.ezdxxp.HttpProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.sf.smbt.ezdxxp.HttpProperty#getValue()
	 * @see #getHttpProperty()
	 * @generated
	 */
	EAttribute getHttpProperty_Value();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezdxxp.DAAP_HTTP_CONST <em>DAAP HTTP CONST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DAAP HTTP CONST</em>'.
	 * @see net.sf.smbt.ezdxxp.DAAP_HTTP_CONST
	 * @generated
	 */
	EEnum getDAAP_HTTP_CONST();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezdxxp.DaapRequestTag <em>Daap Request Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Daap Request Tag</em>'.
	 * @see net.sf.smbt.ezdxxp.DaapRequestTag
	 * @generated
	 */
	EEnum getDaapRequestTag();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.ezdxxp.ServerInfoStatus <em>Server Info Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Server Info Status</em>'.
	 * @see net.sf.smbt.ezdxxp.ServerInfoStatus
	 * @generated
	 */
	EEnum getServerInfoStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EzdxxpFactory getEzdxxpFactory();

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
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl <em>Daap Cmd Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapCmdChunkImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapCmdChunk()
		 * @generated
		 */
		EClass DAAP_CMD_CHUNK = eINSTANCE.getDaapCmdChunk();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_CMD_CHUNK__SIZE = eINSTANCE.getDaapCmdChunk_Size();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_CMD_CHUNK__DATA = eINSTANCE.getDaapCmdChunk_Data();

		/**
		 * The meta object literal for the '<em><b>Req</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_CMD_CHUNK__REQ = eINSTANCE.getDaapCmdChunk_Req();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapListCmdImpl <em>Daap List Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapListCmdImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListCmd()
		 * @generated
		 */
		EClass DAAP_LIST_CMD = eINSTANCE.getDaapListCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoRequestImpl <em>Daap Server Info Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapServerInfoRequestImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapServerInfoRequest()
		 * @generated
		 */
		EClass DAAP_SERVER_INFO_REQUEST = eINSTANCE.getDaapServerInfoRequest();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl <em>Daap Server Info Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapServerInfoResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapServerInfoResponse()
		 * @generated
		 */
		EClass DAAP_SERVER_INFO_RESPONSE = eINSTANCE.getDaapServerInfoResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__STATUS = eINSTANCE.getDaapServerInfoResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Daap Protocol Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION = eINSTANCE.getDaapServerInfoResponse_DaapProtocolVersion();

		/**
		 * The meta object literal for the '<em><b>Indexing Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT = eINSTANCE.getDaapServerInfoResponse_IndexingSupport();

		/**
		 * The meta object literal for the '<em><b>Extension Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT = eINSTANCE.getDaapServerInfoResponse_ExtensionSupport();

		/**
		 * The meta object literal for the '<em><b>Update Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT = eINSTANCE.getDaapServerInfoResponse_UpdateSupport();

		/**
		 * The meta object literal for the '<em><b>Autologout Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT = eINSTANCE.getDaapServerInfoResponse_AutologoutSupport();

		/**
		 * The meta object literal for the '<em><b>Timeout Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL = eINSTANCE.getDaapServerInfoResponse_TimeoutInterval();

		/**
		 * The meta object literal for the '<em><b>Login Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED = eINSTANCE.getDaapServerInfoResponse_LoginRequired();

		/**
		 * The meta object literal for the '<em><b>Queries Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT = eINSTANCE.getDaapServerInfoResponse_QueriesSupport();

		/**
		 * The meta object literal for the '<em><b>Server Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__SERVER_NAME = eINSTANCE.getDaapServerInfoResponse_ServerName();

		/**
		 * The meta object literal for the '<em><b>Resolve Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT = eINSTANCE.getDaapServerInfoResponse_ResolveSupport();

		/**
		 * The meta object literal for the '<em><b>Browsing Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT = eINSTANCE.getDaapServerInfoResponse_BrowsingSupport();

		/**
		 * The meta object literal for the '<em><b>Persitence Support</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT = eINSTANCE.getDaapServerInfoResponse_PersitenceSupport();

		/**
		 * The meta object literal for the '<em><b>Dmap Protocol Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION = eINSTANCE.getDaapServerInfoResponse_DmapProtocolVersion();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestForContentCodesImpl <em>Daap Request For Content Codes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapRequestForContentCodesImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestForContentCodes()
		 * @generated
		 */
		EClass DAAP_REQUEST_FOR_CONTENT_CODES = eINSTANCE.getDaapRequestForContentCodes();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapContentCodesResponseImpl <em>Daap Content Codes Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapContentCodesResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapContentCodesResponse()
		 * @generated
		 */
		EClass DAAP_CONTENT_CODES_RESPONSE = eINSTANCE.getDaapContentCodesResponse();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapLoginImpl <em>Daap Login</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapLoginImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapLogin()
		 * @generated
		 */
		EClass DAAP_LOGIN = eINSTANCE.getDaapLogin();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl <em>Daap Login Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapLoginResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapLoginResponse()
		 * @generated
		 */
		EClass DAAP_LOGIN_RESPONSE = eINSTANCE.getDaapLoginResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_LOGIN_RESPONSE__STATUS = eINSTANCE.getDaapLoginResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_LOGIN_RESPONSE__SESSION_ID = eINSTANCE.getDaapLoginResponse_SessionID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapUpdateRequestImpl <em>Daap Update Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapUpdateRequestImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapUpdateRequest()
		 * @generated
		 */
		EClass DAAP_UPDATE_REQUEST = eINSTANCE.getDaapUpdateRequest();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_UPDATE_REQUEST__SESSION_ID = eINSTANCE.getDaapUpdateRequest_SessionID();

		/**
		 * The meta object literal for the '<em><b>Revision ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_UPDATE_REQUEST__REVISION_ID = eINSTANCE.getDaapUpdateRequest_RevisionID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapDatabaseRequestImpl <em>Daap Database Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapDatabaseRequestImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDatabaseRequest()
		 * @generated
		 */
		EClass DAAP_DATABASE_REQUEST = eINSTANCE.getDaapDatabaseRequest();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DATABASE_REQUEST__SESSION_ID = eINSTANCE.getDaapDatabaseRequest_SessionID();

		/**
		 * The meta object literal for the '<em><b>Revision ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DATABASE_REQUEST__REVISION_ID = eINSTANCE.getDaapDatabaseRequest_RevisionID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl <em>Daap Databse Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapDatabseResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDatabseResponse()
		 * @generated
		 */
		EClass DAAP_DATABSE_RESPONSE = eINSTANCE.getDaapDatabseResponse();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DATABSE_RESPONSE__STATUS = eINSTANCE.getDaapDatabseResponse_Status();

		/**
		 * The meta object literal for the '<em><b>Matching Records</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DATABSE_RESPONSE__MATCHING_RECORDS = eINSTANCE.getDaapDatabseResponse_MatchingRecords();

		/**
		 * The meta object literal for the '<em><b>Records Returned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DATABSE_RESPONSE__RECORDS_RETURNED = eINSTANCE.getDaapDatabseResponse_RecordsReturned();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAAP_DATABSE_RESPONSE__RECORDS = eINSTANCE.getDaapDatabseResponse_Records();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestSongsImpl <em>Daap Request Songs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapRequestSongsImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestSongs()
		 * @generated
		 */
		EClass DAAP_REQUEST_SONGS = eINSTANCE.getDaapRequestSongs();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapListOfSongsInDBImpl <em>Daap List Of Songs In DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapListOfSongsInDBImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListOfSongsInDB()
		 * @generated
		 */
		EClass DAAP_LIST_OF_SONGS_IN_DB = eINSTANCE.getDaapListOfSongsInDB();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistsImpl <em>Daap Request Playlists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistsImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestPlaylists()
		 * @generated
		 */
		EClass DAAP_REQUEST_PLAYLISTS = eINSTANCE.getDaapRequestPlaylists();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapListOfPlaylistsInDBImpl <em>Daap List Of Playlists In DB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapListOfPlaylistsInDBImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListOfPlaylistsInDB()
		 * @generated
		 */
		EClass DAAP_LIST_OF_PLAYLISTS_IN_DB = eINSTANCE.getDaapListOfPlaylistsInDB();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistImpl <em>Daap Request Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapRequestPlaylistImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestPlaylist()
		 * @generated
		 */
		EClass DAAP_REQUEST_PLAYLIST = eINSTANCE.getDaapRequestPlaylist();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapListOfSongsInPlaylistImpl <em>Daap List Of Songs In Playlist</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapListOfSongsInPlaylistImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapListOfSongsInPlaylist()
		 * @generated
		 */
		EClass DAAP_LIST_OF_SONGS_IN_PLAYLIST = eINSTANCE.getDaapListOfSongsInPlaylist();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapRequestMediaStreamImpl <em>Daap Request Media Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapRequestMediaStreamImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestMediaStream()
		 * @generated
		 */
		EClass DAAP_REQUEST_MEDIA_STREAM = eINSTANCE.getDaapRequestMediaStream();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapStreamResponseImpl <em>Daap Stream Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapStreamResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapStreamResponse()
		 * @generated
		 */
		EClass DAAP_STREAM_RESPONSE = eINSTANCE.getDaapStreamResponse();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapQueryCmdImpl <em>Daap Query Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapQueryCmdImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapQueryCmd()
		 * @generated
		 */
		EClass DAAP_QUERY_CMD = eINSTANCE.getDaapQueryCmd();

		/**
		 * The meta object literal for the '<em><b>Query</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_QUERY_CMD__QUERY = eINSTANCE.getDaapQueryCmd_Query();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapMsrvCmdImpl <em>Daap Msrv Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapMsrvCmdImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMsrvCmd()
		 * @generated
		 */
		EClass DAAP_MSRV_CMD = eINSTANCE.getDaapMsrvCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapMccrImpl <em>Daap Mccr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapMccrImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMccr()
		 * @generated
		 */
		EClass DAAP_MCCR = eINSTANCE.getDaapMccr();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapMlogImpl <em>Daap Mlog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapMlogImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMlog()
		 * @generated
		 */
		EClass DAAP_MLOG = eINSTANCE.getDaapMlog();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapMupdImpl <em>Daap Mupd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapMupdImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapMupd()
		 * @generated
		 */
		EClass DAAP_MUPD = eINSTANCE.getDaapMupd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapAvdbImpl <em>Daap Avdb</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapAvdbImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapAvdb()
		 * @generated
		 */
		EClass DAAP_AVDB = eINSTANCE.getDaapAvdb();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapApsoRetImpl <em>Daap Apso Ret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapApsoRetImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapApsoRet()
		 * @generated
		 */
		EClass DAAP_APSO_RET = eINSTANCE.getDaapApsoRet();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapAplyImpl <em>Daap Aply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapAplyImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapAply()
		 * @generated
		 */
		EClass DAAP_APLY = eINSTANCE.getDaapAply();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapCmdImpl <em>Daap Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapCmdImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapCmd()
		 * @generated
		 */
		EClass DAAP_CMD = eINSTANCE.getDaapCmd();

		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_CMD__TAG = eINSTANCE.getDaapCmd_Tag();

		/**
		 * The meta object literal for the '<em><b>Http Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAAP_CMD__HTTP_PROPERTIES = eINSTANCE.getDaapCmd_HttpProperties();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapUpdateResponseImpl <em>Daap Update Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapUpdateResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapUpdateResponse()
		 * @generated
		 */
		EClass DAAP_UPDATE_RESPONSE = eINSTANCE.getDaapUpdateResponse();

		/**
		 * The meta object literal for the '<em><b>Revision ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_UPDATE_RESPONSE__REVISION_ID = eINSTANCE.getDaapUpdateResponse_RevisionID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.ChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.ChunkImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getChunk()
		 * @generated
		 */
		EClass CHUNK = eINSTANCE.getChunk();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__DATA = eINSTANCE.getChunk_Data();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__NAME = eINSTANCE.getChunk_Name();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__OFFSET = eINSTANCE.getChunk_Offset();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHUNK__SIZE = eINSTANCE.getChunk_Size();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapCmdResponseImpl <em>Daap Cmd Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapCmdResponseImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapCmdResponse()
		 * @generated
		 */
		EClass DAAP_CMD_RESPONSE = eINSTANCE.getDaapCmdResponse();

		/**
		 * The meta object literal for the '<em><b>Chunks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAAP_CMD_RESPONSE__CHUNKS = eINSTANCE.getDaapCmdResponse_Chunks();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapContentCodesRequestImpl <em>Daap Content Codes Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapContentCodesRequestImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapContentCodesRequest()
		 * @generated
		 */
		EClass DAAP_CONTENT_CODES_REQUEST = eINSTANCE.getDaapContentCodesRequest();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl <em>Daap Dictionnary Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapDictionnaryEntryImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDictionnaryEntry()
		 * @generated
		 */
		EClass DAAP_DICTIONNARY_ENTRY = eINSTANCE.getDaapDictionnaryEntry();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DICTIONNARY_ENTRY__NAME = eINSTANCE.getDaapDictionnaryEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DICTIONNARY_ENTRY__NUMBER = eINSTANCE.getDaapDictionnaryEntry_Number();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_DICTIONNARY_ENTRY__TYPE = eINSTANCE.getDaapDictionnaryEntry_Type();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapDBRecordsImpl <em>Daap DB Records</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapDBRecordsImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapDBRecords()
		 * @generated
		 */
		EClass DAAP_DB_RECORDS = eINSTANCE.getDaapDBRecords();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.DaapLogoutImpl <em>Daap Logout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.DaapLogoutImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapLogout()
		 * @generated
		 */
		EClass DAAP_LOGOUT = eINSTANCE.getDaapLogout();

		/**
		 * The meta object literal for the '<em><b>Session ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAAP_LOGOUT__SESSION_ID = eINSTANCE.getDaapLogout_SessionID();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.impl.HttpPropertyImpl <em>Http Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.impl.HttpPropertyImpl
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getHttpProperty()
		 * @generated
		 */
		EClass HTTP_PROPERTY = eINSTANCE.getHttpProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_PROPERTY__KEY = eINSTANCE.getHttpProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_PROPERTY__VALUE = eINSTANCE.getHttpProperty_Value();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.DAAP_HTTP_CONST <em>DAAP HTTP CONST</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.DAAP_HTTP_CONST
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDAAP_HTTP_CONST()
		 * @generated
		 */
		EEnum DAAP_HTTP_CONST = eINSTANCE.getDAAP_HTTP_CONST();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.DaapRequestTag <em>Daap Request Tag</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.DaapRequestTag
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getDaapRequestTag()
		 * @generated
		 */
		EEnum DAAP_REQUEST_TAG = eINSTANCE.getDaapRequestTag();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.ezdxxp.ServerInfoStatus <em>Server Info Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.ezdxxp.ServerInfoStatus
		 * @see net.sf.smbt.ezdxxp.impl.EzdxxpPackageImpl#getServerInfoStatus()
		 * @generated
		 */
		EEnum SERVER_INFO_STATUS = eINSTANCE.getServerInfoStatus();

	}

} //EzdxxpPackage
