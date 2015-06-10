/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.ezdxxp.impl;

import net.sf.smbt.ezdxxp.Chunk;
import net.sf.smbt.ezdxxp.DaapAply;
import net.sf.smbt.ezdxxp.DaapApsoRet;
import net.sf.smbt.ezdxxp.DaapAvdb;
import net.sf.smbt.ezdxxp.DaapCmd;
import net.sf.smbt.ezdxxp.DaapCmdChunk;
import net.sf.smbt.ezdxxp.DaapCmdResponse;
import net.sf.smbt.ezdxxp.DaapContentCodesRequest;
import net.sf.smbt.ezdxxp.DaapContentCodesResponse;
import net.sf.smbt.ezdxxp.DaapDBRecords;
import net.sf.smbt.ezdxxp.DaapDatabaseRequest;
import net.sf.smbt.ezdxxp.DaapDatabseResponse;
import net.sf.smbt.ezdxxp.DaapDictionnaryEntry;
import net.sf.smbt.ezdxxp.DaapListCmd;
import net.sf.smbt.ezdxxp.DaapListOfPlaylistsInDB;
import net.sf.smbt.ezdxxp.DaapListOfSongsInDB;
import net.sf.smbt.ezdxxp.DaapListOfSongsInPlaylist;
import net.sf.smbt.ezdxxp.DaapLogin;
import net.sf.smbt.ezdxxp.DaapLoginResponse;
import net.sf.smbt.ezdxxp.DaapLogout;
import net.sf.smbt.ezdxxp.DaapMccr;
import net.sf.smbt.ezdxxp.DaapMlog;
import net.sf.smbt.ezdxxp.DaapMsrvCmd;
import net.sf.smbt.ezdxxp.DaapMupd;
import net.sf.smbt.ezdxxp.DaapQueryCmd;
import net.sf.smbt.ezdxxp.DaapRequestForContentCodes;
import net.sf.smbt.ezdxxp.DaapRequestMediaStream;
import net.sf.smbt.ezdxxp.DaapRequestPlaylist;
import net.sf.smbt.ezdxxp.DaapRequestPlaylists;
import net.sf.smbt.ezdxxp.DaapRequestSongs;
import net.sf.smbt.ezdxxp.DaapRequestTag;
import net.sf.smbt.ezdxxp.DaapServerInfoRequest;
import net.sf.smbt.ezdxxp.DaapServerInfoResponse;
import net.sf.smbt.ezdxxp.DaapStreamResponse;
import net.sf.smbt.ezdxxp.DaapUpdateRequest;
import net.sf.smbt.ezdxxp.DaapUpdateResponse;
import net.sf.smbt.ezdxxp.EzdxxpFactory;
import net.sf.smbt.ezdxxp.EzdxxpPackage;
import net.sf.smbt.ezdxxp.HttpProperty;
import net.sf.smbt.ezdxxp.ServerInfoStatus;
import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EzdxxpPackageImpl extends EPackageImpl implements EzdxxpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapCmdChunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapListCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapServerInfoRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapServerInfoResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapRequestForContentCodesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapContentCodesResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapLoginEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapLoginResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapUpdateRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapDatabaseRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapDatabseResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapRequestSongsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapListOfSongsInDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapRequestPlaylistsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapListOfPlaylistsInDBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapRequestPlaylistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapListOfSongsInPlaylistEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapRequestMediaStreamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapStreamResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapQueryCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapMsrvCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapMccrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapMlogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapMupdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapAvdbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapApsoRetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapAplyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapUpdateResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapCmdResponseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapContentCodesRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapDictionnaryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapDBRecordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daapLogoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daaP_HTTP_CONSTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daapRequestTagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverInfoStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.sf.smbt.ezdxxp.EzdxxpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EzdxxpPackageImpl() {
		super(eNS_URI, EzdxxpFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EzdxxpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EzdxxpPackage init() {
		if (isInited) return (EzdxxpPackage)EPackage.Registry.INSTANCE.getEPackage(EzdxxpPackage.eNS_URI);

		// Obtain or create and register package
		EzdxxpPackageImpl theEzdxxpPackage = (EzdxxpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EzdxxpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EzdxxpPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEzdxxpPackage.createPackageContents();

		// Initialize created meta-data
		theEzdxxpPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEzdxxpPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EzdxxpPackage.eNS_URI, theEzdxxpPackage);
		return theEzdxxpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapCmdChunk() {
		return daapCmdChunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapCmdChunk_Size() {
		return (EAttribute)daapCmdChunkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapCmdChunk_Data() {
		return (EAttribute)daapCmdChunkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapCmdChunk_Req() {
		return (EAttribute)daapCmdChunkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapListCmd() {
		return daapListCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapServerInfoRequest() {
		return daapServerInfoRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapServerInfoResponse() {
		return daapServerInfoResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_Status() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_DaapProtocolVersion() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_IndexingSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_ExtensionSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_UpdateSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_AutologoutSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_TimeoutInterval() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_LoginRequired() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_QueriesSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_ServerName() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_ResolveSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_BrowsingSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_PersitenceSupport() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapServerInfoResponse_DmapProtocolVersion() {
		return (EAttribute)daapServerInfoResponseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapRequestForContentCodes() {
		return daapRequestForContentCodesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapContentCodesResponse() {
		return daapContentCodesResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapLogin() {
		return daapLoginEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapLoginResponse() {
		return daapLoginResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapLoginResponse_Status() {
		return (EAttribute)daapLoginResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapLoginResponse_SessionID() {
		return (EAttribute)daapLoginResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapUpdateRequest() {
		return daapUpdateRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapUpdateRequest_SessionID() {
		return (EAttribute)daapUpdateRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapUpdateRequest_RevisionID() {
		return (EAttribute)daapUpdateRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapDatabaseRequest() {
		return daapDatabaseRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDatabaseRequest_SessionID() {
		return (EAttribute)daapDatabaseRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDatabaseRequest_RevisionID() {
		return (EAttribute)daapDatabaseRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapDatabseResponse() {
		return daapDatabseResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDatabseResponse_Status() {
		return (EAttribute)daapDatabseResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDatabseResponse_MatchingRecords() {
		return (EAttribute)daapDatabseResponseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDatabseResponse_RecordsReturned() {
		return (EAttribute)daapDatabseResponseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaapDatabseResponse_Records() {
		return (EReference)daapDatabseResponseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapRequestSongs() {
		return daapRequestSongsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapListOfSongsInDB() {
		return daapListOfSongsInDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapRequestPlaylists() {
		return daapRequestPlaylistsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapListOfPlaylistsInDB() {
		return daapListOfPlaylistsInDBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapRequestPlaylist() {
		return daapRequestPlaylistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapListOfSongsInPlaylist() {
		return daapListOfSongsInPlaylistEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapRequestMediaStream() {
		return daapRequestMediaStreamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapStreamResponse() {
		return daapStreamResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapQueryCmd() {
		return daapQueryCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapQueryCmd_Query() {
		return (EAttribute)daapQueryCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapMsrvCmd() {
		return daapMsrvCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapMccr() {
		return daapMccrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapMlog() {
		return daapMlogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapMupd() {
		return daapMupdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapAvdb() {
		return daapAvdbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapApsoRet() {
		return daapApsoRetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapAply() {
		return daapAplyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapCmd() {
		return daapCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapCmd_Tag() {
		return (EAttribute)daapCmdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaapCmd_HttpProperties() {
		return (EReference)daapCmdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapUpdateResponse() {
		return daapUpdateResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapUpdateResponse_RevisionID() {
		return (EAttribute)daapUpdateResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunk() {
		return chunkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_Data() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_Name() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_Offset() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunk_Size() {
		return (EAttribute)chunkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapCmdResponse() {
		return daapCmdResponseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDaapCmdResponse_Chunks() {
		return (EReference)daapCmdResponseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapContentCodesRequest() {
		return daapContentCodesRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapDictionnaryEntry() {
		return daapDictionnaryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDictionnaryEntry_Name() {
		return (EAttribute)daapDictionnaryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDictionnaryEntry_Number() {
		return (EAttribute)daapDictionnaryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapDictionnaryEntry_Type() {
		return (EAttribute)daapDictionnaryEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapDBRecords() {
		return daapDBRecordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDaapLogout() {
		return daapLogoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDaapLogout_SessionID() {
		return (EAttribute)daapLogoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpProperty() {
		return httpPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpProperty_Key() {
		return (EAttribute)httpPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpProperty_Value() {
		return (EAttribute)httpPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDAAP_HTTP_CONST() {
		return daaP_HTTP_CONSTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaapRequestTag() {
		return daapRequestTagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServerInfoStatus() {
		return serverInfoStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EzdxxpFactory getEzdxxpFactory() {
		return (EzdxxpFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		daapCmdChunkEClass = createEClass(DAAP_CMD_CHUNK);
		createEAttribute(daapCmdChunkEClass, DAAP_CMD_CHUNK__SIZE);
		createEAttribute(daapCmdChunkEClass, DAAP_CMD_CHUNK__DATA);
		createEAttribute(daapCmdChunkEClass, DAAP_CMD_CHUNK__REQ);

		daapListCmdEClass = createEClass(DAAP_LIST_CMD);

		daapServerInfoRequestEClass = createEClass(DAAP_SERVER_INFO_REQUEST);

		daapServerInfoResponseEClass = createEClass(DAAP_SERVER_INFO_RESPONSE);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__STATUS);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__DAAP_PROTOCOL_VERSION);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__INDEXING_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__EXTENSION_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__UPDATE_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__AUTOLOGOUT_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__TIMEOUT_INTERVAL);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__LOGIN_REQUIRED);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__QUERIES_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__SERVER_NAME);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__RESOLVE_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__BROWSING_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__PERSITENCE_SUPPORT);
		createEAttribute(daapServerInfoResponseEClass, DAAP_SERVER_INFO_RESPONSE__DMAP_PROTOCOL_VERSION);

		daapRequestForContentCodesEClass = createEClass(DAAP_REQUEST_FOR_CONTENT_CODES);

		daapContentCodesResponseEClass = createEClass(DAAP_CONTENT_CODES_RESPONSE);

		daapLoginEClass = createEClass(DAAP_LOGIN);

		daapLoginResponseEClass = createEClass(DAAP_LOGIN_RESPONSE);
		createEAttribute(daapLoginResponseEClass, DAAP_LOGIN_RESPONSE__STATUS);
		createEAttribute(daapLoginResponseEClass, DAAP_LOGIN_RESPONSE__SESSION_ID);

		daapUpdateRequestEClass = createEClass(DAAP_UPDATE_REQUEST);
		createEAttribute(daapUpdateRequestEClass, DAAP_UPDATE_REQUEST__SESSION_ID);
		createEAttribute(daapUpdateRequestEClass, DAAP_UPDATE_REQUEST__REVISION_ID);

		daapDatabaseRequestEClass = createEClass(DAAP_DATABASE_REQUEST);
		createEAttribute(daapDatabaseRequestEClass, DAAP_DATABASE_REQUEST__SESSION_ID);
		createEAttribute(daapDatabaseRequestEClass, DAAP_DATABASE_REQUEST__REVISION_ID);

		daapDatabseResponseEClass = createEClass(DAAP_DATABSE_RESPONSE);
		createEAttribute(daapDatabseResponseEClass, DAAP_DATABSE_RESPONSE__STATUS);
		createEAttribute(daapDatabseResponseEClass, DAAP_DATABSE_RESPONSE__MATCHING_RECORDS);
		createEAttribute(daapDatabseResponseEClass, DAAP_DATABSE_RESPONSE__RECORDS_RETURNED);
		createEReference(daapDatabseResponseEClass, DAAP_DATABSE_RESPONSE__RECORDS);

		daapRequestSongsEClass = createEClass(DAAP_REQUEST_SONGS);

		daapListOfSongsInDBEClass = createEClass(DAAP_LIST_OF_SONGS_IN_DB);

		daapRequestPlaylistsEClass = createEClass(DAAP_REQUEST_PLAYLISTS);

		daapListOfPlaylistsInDBEClass = createEClass(DAAP_LIST_OF_PLAYLISTS_IN_DB);

		daapRequestPlaylistEClass = createEClass(DAAP_REQUEST_PLAYLIST);

		daapListOfSongsInPlaylistEClass = createEClass(DAAP_LIST_OF_SONGS_IN_PLAYLIST);

		daapRequestMediaStreamEClass = createEClass(DAAP_REQUEST_MEDIA_STREAM);

		daapStreamResponseEClass = createEClass(DAAP_STREAM_RESPONSE);

		daapQueryCmdEClass = createEClass(DAAP_QUERY_CMD);
		createEAttribute(daapQueryCmdEClass, DAAP_QUERY_CMD__QUERY);

		daapMsrvCmdEClass = createEClass(DAAP_MSRV_CMD);

		daapMccrEClass = createEClass(DAAP_MCCR);

		daapMlogEClass = createEClass(DAAP_MLOG);

		daapMupdEClass = createEClass(DAAP_MUPD);

		daapAvdbEClass = createEClass(DAAP_AVDB);

		daapApsoRetEClass = createEClass(DAAP_APSO_RET);

		daapAplyEClass = createEClass(DAAP_APLY);

		daapCmdEClass = createEClass(DAAP_CMD);
		createEAttribute(daapCmdEClass, DAAP_CMD__TAG);
		createEReference(daapCmdEClass, DAAP_CMD__HTTP_PROPERTIES);

		daapUpdateResponseEClass = createEClass(DAAP_UPDATE_RESPONSE);
		createEAttribute(daapUpdateResponseEClass, DAAP_UPDATE_RESPONSE__REVISION_ID);

		chunkEClass = createEClass(CHUNK);
		createEAttribute(chunkEClass, CHUNK__DATA);
		createEAttribute(chunkEClass, CHUNK__NAME);
		createEAttribute(chunkEClass, CHUNK__OFFSET);
		createEAttribute(chunkEClass, CHUNK__SIZE);

		daapCmdResponseEClass = createEClass(DAAP_CMD_RESPONSE);
		createEReference(daapCmdResponseEClass, DAAP_CMD_RESPONSE__CHUNKS);

		daapContentCodesRequestEClass = createEClass(DAAP_CONTENT_CODES_REQUEST);

		daapDictionnaryEntryEClass = createEClass(DAAP_DICTIONNARY_ENTRY);
		createEAttribute(daapDictionnaryEntryEClass, DAAP_DICTIONNARY_ENTRY__NAME);
		createEAttribute(daapDictionnaryEntryEClass, DAAP_DICTIONNARY_ENTRY__NUMBER);
		createEAttribute(daapDictionnaryEntryEClass, DAAP_DICTIONNARY_ENTRY__TYPE);

		daapDBRecordsEClass = createEClass(DAAP_DB_RECORDS);

		daapLogoutEClass = createEClass(DAAP_LOGOUT);
		createEAttribute(daapLogoutEClass, DAAP_LOGOUT__SESSION_ID);

		httpPropertyEClass = createEClass(HTTP_PROPERTY);
		createEAttribute(httpPropertyEClass, HTTP_PROPERTY__KEY);
		createEAttribute(httpPropertyEClass, HTTP_PROPERTY__VALUE);

		// Create enums
		daaP_HTTP_CONSTEEnum = createEEnum(DAAP_HTTP_CONST);
		daapRequestTagEEnum = createEEnum(DAAP_REQUEST_TAG);
		serverInfoStatusEEnum = createEEnum(SERVER_INFO_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CmdPackage theCmdPackage = (CmdPackage)EPackage.Registry.INSTANCE.getEPackage(CmdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		daapCmdChunkEClass.getESuperTypes().add(this.getDaapCmd());
		daapListCmdEClass.getESuperTypes().add(theCmdPackage.getCompoundCmd());
		daapListCmdEClass.getESuperTypes().add(this.getDaapCmd());
		daapServerInfoRequestEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapServerInfoResponseEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapServerInfoResponseEClass.getESuperTypes().add(this.getDaapCmdResponse());
		daapRequestForContentCodesEClass.getESuperTypes().add(this.getDaapListCmd());
		daapContentCodesResponseEClass.getESuperTypes().add(this.getDaapListCmd());
		daapContentCodesResponseEClass.getESuperTypes().add(this.getDaapCmdResponse());
		daapLoginEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapLoginResponseEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapLoginResponseEClass.getESuperTypes().add(this.getDaapCmdResponse());
		daapUpdateRequestEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapDatabaseRequestEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapDatabseResponseEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapDatabseResponseEClass.getESuperTypes().add(this.getDaapCmdResponse());
		daapRequestSongsEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapListOfSongsInDBEClass.getESuperTypes().add(this.getDaapListCmd());
		daapRequestPlaylistsEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapListOfPlaylistsInDBEClass.getESuperTypes().add(this.getDaapListCmd());
		daapRequestPlaylistEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapListOfSongsInPlaylistEClass.getESuperTypes().add(this.getDaapListCmd());
		daapRequestMediaStreamEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapStreamResponseEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapStreamResponseEClass.getESuperTypes().add(this.getDaapCmdResponse());
		daapQueryCmdEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapMsrvCmdEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapMccrEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapMlogEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapMupdEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapAvdbEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapApsoRetEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapAplyEClass.getESuperTypes().add(this.getDaapQueryCmd());
		daapCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		daapUpdateResponseEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapUpdateResponseEClass.getESuperTypes().add(this.getDaapCmdResponse());
		daapContentCodesRequestEClass.getESuperTypes().add(this.getDaapCmdChunk());
		daapLogoutEClass.getESuperTypes().add(this.getDaapCmdChunk());

		// Initialize classes and features; add operations and parameters
		initEClass(daapCmdChunkEClass, DaapCmdChunk.class, "DaapCmdChunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapCmdChunk_Size(), ecorePackage.getEByteArray(), "size", null, 0, 1, DaapCmdChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapCmdChunk_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, DaapCmdChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapCmdChunk_Req(), ecorePackage.getEString(), "req", null, 0, 1, DaapCmdChunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapListCmdEClass, DaapListCmd.class, "DaapListCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapServerInfoRequestEClass, DaapServerInfoRequest.class, "DaapServerInfoRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapServerInfoResponseEClass, DaapServerInfoResponse.class, "DaapServerInfoResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapServerInfoResponse_Status(), this.getServerInfoStatus(), "status", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_DaapProtocolVersion(), ecorePackage.getEDouble(), "daapProtocolVersion", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_IndexingSupport(), ecorePackage.getEBoolean(), "indexingSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_ExtensionSupport(), ecorePackage.getEBoolean(), "extensionSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_UpdateSupport(), ecorePackage.getEBoolean(), "updateSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_AutologoutSupport(), ecorePackage.getEBoolean(), "autologoutSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_TimeoutInterval(), ecorePackage.getELong(), "timeoutInterval", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_LoginRequired(), ecorePackage.getEBoolean(), "loginRequired", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_QueriesSupport(), ecorePackage.getEBoolean(), "queriesSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_ServerName(), ecorePackage.getEString(), "serverName", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_ResolveSupport(), ecorePackage.getEBoolean(), "resolveSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_BrowsingSupport(), ecorePackage.getEBoolean(), "browsingSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_PersitenceSupport(), ecorePackage.getEBoolean(), "persitenceSupport", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapServerInfoResponse_DmapProtocolVersion(), ecorePackage.getEDouble(), "dmapProtocolVersion", null, 0, 1, DaapServerInfoResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapRequestForContentCodesEClass, DaapRequestForContentCodes.class, "DaapRequestForContentCodes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapContentCodesResponseEClass, DaapContentCodesResponse.class, "DaapContentCodesResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapLoginEClass, DaapLogin.class, "DaapLogin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapLoginResponseEClass, DaapLoginResponse.class, "DaapLoginResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapLoginResponse_Status(), ecorePackage.getEInt(), "status", null, 0, 1, DaapLoginResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapLoginResponse_SessionID(), ecorePackage.getEInt(), "sessionID", null, 0, 1, DaapLoginResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapUpdateRequestEClass, DaapUpdateRequest.class, "DaapUpdateRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapUpdateRequest_SessionID(), ecorePackage.getEInt(), "sessionID", null, 0, 1, DaapUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapUpdateRequest_RevisionID(), ecorePackage.getEInt(), "revisionID", "1", 0, 1, DaapUpdateRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapDatabaseRequestEClass, DaapDatabaseRequest.class, "DaapDatabaseRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapDatabaseRequest_SessionID(), ecorePackage.getEInt(), "sessionID", null, 0, 1, DaapDatabaseRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapDatabaseRequest_RevisionID(), ecorePackage.getEInt(), "revisionID", "1", 0, 1, DaapDatabaseRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapDatabseResponseEClass, DaapDatabseResponse.class, "DaapDatabseResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapDatabseResponse_Status(), ecorePackage.getEInt(), "status", null, 0, 1, DaapDatabseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapDatabseResponse_MatchingRecords(), ecorePackage.getEInt(), "matchingRecords", null, 0, 1, DaapDatabseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapDatabseResponse_RecordsReturned(), ecorePackage.getEInt(), "recordsReturned", null, 0, 1, DaapDatabseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaapDatabseResponse_Records(), this.getDaapDBRecords(), null, "records", null, 0, -1, DaapDatabseResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapRequestSongsEClass, DaapRequestSongs.class, "DaapRequestSongs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapListOfSongsInDBEClass, DaapListOfSongsInDB.class, "DaapListOfSongsInDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapRequestPlaylistsEClass, DaapRequestPlaylists.class, "DaapRequestPlaylists", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapListOfPlaylistsInDBEClass, DaapListOfPlaylistsInDB.class, "DaapListOfPlaylistsInDB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapRequestPlaylistEClass, DaapRequestPlaylist.class, "DaapRequestPlaylist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapListOfSongsInPlaylistEClass, DaapListOfSongsInPlaylist.class, "DaapListOfSongsInPlaylist", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapRequestMediaStreamEClass, DaapRequestMediaStream.class, "DaapRequestMediaStream", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapStreamResponseEClass, DaapStreamResponse.class, "DaapStreamResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapQueryCmdEClass, DaapQueryCmd.class, "DaapQueryCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapQueryCmd_Query(), ecorePackage.getEString(), "query", null, 0, 1, DaapQueryCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapMsrvCmdEClass, DaapMsrvCmd.class, "DaapMsrvCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapMccrEClass, DaapMccr.class, "DaapMccr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapMlogEClass, DaapMlog.class, "DaapMlog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapMupdEClass, DaapMupd.class, "DaapMupd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapAvdbEClass, DaapAvdb.class, "DaapAvdb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapApsoRetEClass, DaapApsoRet.class, "DaapApsoRet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapAplyEClass, DaapAply.class, "DaapAply", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapCmdEClass, DaapCmd.class, "DaapCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapCmd_Tag(), ecorePackage.getEByteArray(), "tag", null, 0, 1, DaapCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDaapCmd_HttpProperties(), this.getHttpProperty(), null, "httpProperties", null, 0, -1, DaapCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapUpdateResponseEClass, DaapUpdateResponse.class, "DaapUpdateResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapUpdateResponse_RevisionID(), ecorePackage.getEInt(), "revisionID", "1", 0, 1, DaapUpdateResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chunkEClass, Chunk.class, "Chunk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChunk_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_Name(), ecorePackage.getEString(), "name", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_Offset(), ecorePackage.getEInt(), "offset", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChunk_Size(), ecorePackage.getEInt(), "size", null, 0, 1, Chunk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapCmdResponseEClass, DaapCmdResponse.class, "DaapCmdResponse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDaapCmdResponse_Chunks(), this.getChunk(), null, "chunks", null, 0, -1, DaapCmdResponse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapContentCodesRequestEClass, DaapContentCodesRequest.class, "DaapContentCodesRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapDictionnaryEntryEClass, DaapDictionnaryEntry.class, "DaapDictionnaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapDictionnaryEntry_Name(), ecorePackage.getEString(), "name", null, 0, 1, DaapDictionnaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapDictionnaryEntry_Number(), ecorePackage.getEString(), "number", null, 0, 1, DaapDictionnaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDaapDictionnaryEntry_Type(), ecorePackage.getEString(), "type", null, 0, 1, DaapDictionnaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daapDBRecordsEClass, DaapDBRecords.class, "DaapDBRecords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daapLogoutEClass, DaapLogout.class, "DaapLogout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDaapLogout_SessionID(), ecorePackage.getEInt(), "sessionID", null, 0, 1, DaapLogout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpPropertyEClass, HttpProperty.class, "HttpProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, HttpProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, HttpProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(daaP_HTTP_CONSTEEnum, net.sf.smbt.ezdxxp.DAAP_HTTP_CONST.class, "DAAP_HTTP_CONST");
		addEEnumLiteral(daaP_HTTP_CONSTEEnum, net.sf.smbt.ezdxxp.DAAP_HTTP_CONST.DEFAULT_PORT);

		initEEnum(daapRequestTagEEnum, DaapRequestTag.class, "DaapRequestTag");
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.SERVER_INFO);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.CONTENT_CODES);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.LOGIN);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.UPDATE_SESSION);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.DB_LIST);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.SONG_LIST);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.PLAYLIST_LIST);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.PLAYLIST);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.STREAM_SONG);
		addEEnumLiteral(daapRequestTagEEnum, DaapRequestTag.LOGOUT);

		initEEnum(serverInfoStatusEEnum, ServerInfoStatus.class, "ServerInfoStatus");
		addEEnumLiteral(serverInfoStatusEEnum, ServerInfoStatus.OK_200);
		addEEnumLiteral(serverInfoStatusEEnum, ServerInfoStatus.NOT_FOUND_404);

		// Create resource
		createResource(eNS_URI);
	}

} //EzdxxpPackageImpl
