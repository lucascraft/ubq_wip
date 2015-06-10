/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083.util;

import net.sf.smbt.gps.nmea1083.*;

import net.sf.xqz.model.cmd.Cmd;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package
 * @generated
 */
public class Nmea1083AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Nmea1083Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nmea1083AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Nmea1083Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Nmea1083Switch<Adapter> modelSwitch =
		new Nmea1083Switch<Adapter>() {
			@Override
			public Adapter caseNmeaCmd(NmeaCmd object) {
				return createNmeaCmdAdapter();
			}
			@Override
			public Adapter caseAAM(AAM object) {
				return createAAMAdapter();
			}
			@Override
			public Adapter caseALM(ALM object) {
				return createALMAdapter();
			}
			@Override
			public Adapter caseAPA(APA object) {
				return createAPAAdapter();
			}
			@Override
			public Adapter caseAPB(APB object) {
				return createAPBAdapter();
			}
			@Override
			public Adapter caseASD(ASD object) {
				return createASDAdapter();
			}
			@Override
			public Adapter caseBEC(BEC object) {
				return createBECAdapter();
			}
			@Override
			public Adapter caseBOD(BOD object) {
				return createBODAdapter();
			}
			@Override
			public Adapter caseBWC(BWC object) {
				return createBWCAdapter();
			}
			@Override
			public Adapter caseBWR(BWR object) {
				return createBWRAdapter();
			}
			@Override
			public Adapter caseBWW(BWW object) {
				return createBWWAdapter();
			}
			@Override
			public Adapter caseDBK(DBK object) {
				return createDBKAdapter();
			}
			@Override
			public Adapter caseDBS(DBS object) {
				return createDBSAdapter();
			}
			@Override
			public Adapter caseDBT(DBT object) {
				return createDBTAdapter();
			}
			@Override
			public Adapter caseDPT(DPT object) {
				return createDPTAdapter();
			}
			@Override
			public Adapter caseDSC(DSC object) {
				return createDSCAdapter();
			}
			@Override
			public Adapter caseDSE(DSE object) {
				return createDSEAdapter();
			}
			@Override
			public Adapter caseDSI(DSI object) {
				return createDSIAdapter();
			}
			@Override
			public Adapter caseDSR(DSR object) {
				return createDSRAdapter();
			}
			@Override
			public Adapter caseDTM(DTM object) {
				return createDTMAdapter();
			}
			@Override
			public Adapter caseFSI(FSI object) {
				return createFSIAdapter();
			}
			@Override
			public Adapter caseGBS(GBS object) {
				return createGBSAdapter();
			}
			@Override
			public Adapter caseGGA(GGA object) {
				return createGGAAdapter();
			}
			@Override
			public Adapter caseGLC(GLC object) {
				return createGLCAdapter();
			}
			@Override
			public Adapter caseGLL(GLL object) {
				return createGLLAdapter();
			}
			@Override
			public Adapter caseGRS(GRS object) {
				return createGRSAdapter();
			}
			@Override
			public Adapter caseGST(GST object) {
				return createGSTAdapter();
			}
			@Override
			public Adapter caseGSA(GSA object) {
				return createGSAAdapter();
			}
			@Override
			public Adapter caseGSV(GSV object) {
				return createGSVAdapter();
			}
			@Override
			public Adapter caseGTD(GTD object) {
				return createGTDAdapter();
			}
			@Override
			public Adapter caseGXA(GXA object) {
				return createGXAAdapter();
			}
			@Override
			public Adapter caseHDG(HDG object) {
				return createHDGAdapter();
			}
			@Override
			public Adapter caseHDM(HDM object) {
				return createHDMAdapter();
			}
			@Override
			public Adapter caseHDT(HDT object) {
				return createHDTAdapter();
			}
			@Override
			public Adapter caseHSC(HSC object) {
				return createHSCAdapter();
			}
			@Override
			public Adapter caseLCD(LCD object) {
				return createLCDAdapter();
			}
			@Override
			public Adapter caseMSK(MSK object) {
				return createMSKAdapter();
			}
			@Override
			public Adapter caseMSS(MSS object) {
				return createMSSAdapter();
			}
			@Override
			public Adapter caseMWD(MWD object) {
				return createMWDAdapter();
			}
			@Override
			public Adapter caseMTW(MTW object) {
				return createMTWAdapter();
			}
			@Override
			public Adapter caseMWW(MWW object) {
				return createMWWAdapter();
			}
			@Override
			public Adapter caseOLN(OLN object) {
				return createOLNAdapter();
			}
			@Override
			public Adapter caseOSD(OSD object) {
				return createOSDAdapter();
			}
			@Override
			public Adapter caseROO(ROO object) {
				return createROOAdapter();
			}
			@Override
			public Adapter caseRMA(RMA object) {
				return createRMAAdapter();
			}
			@Override
			public Adapter caseRMB(RMB object) {
				return createRMBAdapter();
			}
			@Override
			public Adapter caseRMC(RMC object) {
				return createRMCAdapter();
			}
			@Override
			public Adapter caseROT(ROT object) {
				return createROTAdapter();
			}
			@Override
			public Adapter caseRPM(RPM object) {
				return createRPMAdapter();
			}
			@Override
			public Adapter caseRSA(RSA object) {
				return createRSAAdapter();
			}
			@Override
			public Adapter caseRSD(RSD object) {
				return createRSDAdapter();
			}
			@Override
			public Adapter caseRTE(RTE object) {
				return createRTEAdapter();
			}
			@Override
			public Adapter caseSFI(SFI object) {
				return createSFIAdapter();
			}
			@Override
			public Adapter caseSTN(STN object) {
				return createSTNAdapter();
			}
			@Override
			public Adapter caseTLL(TLL object) {
				return createTLLAdapter();
			}
			@Override
			public Adapter caseTRF(TRF object) {
				return createTRFAdapter();
			}
			@Override
			public Adapter caseTTM(TTM object) {
				return createTTMAdapter();
			}
			@Override
			public Adapter caseVBW(VBW object) {
				return createVBWAdapter();
			}
			@Override
			public Adapter caseVDR(VDR object) {
				return createVDRAdapter();
			}
			@Override
			public Adapter caseVHW(VHW object) {
				return createVHWAdapter();
			}
			@Override
			public Adapter caseVLW(VLW object) {
				return createVLWAdapter();
			}
			@Override
			public Adapter caseVPW(VPW object) {
				return createVPWAdapter();
			}
			@Override
			public Adapter caseVTG(VTG object) {
				return createVTGAdapter();
			}
			@Override
			public Adapter caseVWR(VWR object) {
				return createVWRAdapter();
			}
			@Override
			public Adapter caseWCV(WCV object) {
				return createWCVAdapter();
			}
			@Override
			public Adapter caseWDC(WDC object) {
				return createWDCAdapter();
			}
			@Override
			public Adapter caseWDR(WDR object) {
				return createWDRAdapter();
			}
			@Override
			public Adapter caseWNC(WNC object) {
				return createWNCAdapter();
			}
			@Override
			public Adapter caseWPL(WPL object) {
				return createWPLAdapter();
			}
			@Override
			public Adapter caseXDR(XDR object) {
				return createXDRAdapter();
			}
			@Override
			public Adapter caseXTE(XTE object) {
				return createXTEAdapter();
			}
			@Override
			public Adapter caseXTR(XTR object) {
				return createXTRAdapter();
			}
			@Override
			public Adapter caseZDA(ZDA object) {
				return createZDAAdapter();
			}
			@Override
			public Adapter caseZDL(ZDL object) {
				return createZDLAdapter();
			}
			@Override
			public Adapter caseZFO(ZFO object) {
				return createZFOAdapter();
			}
			@Override
			public Adapter caseZTG(ZTG object) {
				return createZTGAdapter();
			}
			@Override
			public Adapter caseCmd(Cmd object) {
				return createCmdAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.NmeaCmd <em>Nmea Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.NmeaCmd
	 * @generated
	 */
	public Adapter createNmeaCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.AAM <em>AAM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.AAM
	 * @generated
	 */
	public Adapter createAAMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ALM <em>ALM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ALM
	 * @generated
	 */
	public Adapter createALMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.APA <em>APA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.APA
	 * @generated
	 */
	public Adapter createAPAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.APB <em>APB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.APB
	 * @generated
	 */
	public Adapter createAPBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ASD <em>ASD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ASD
	 * @generated
	 */
	public Adapter createASDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.BEC <em>BEC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.BEC
	 * @generated
	 */
	public Adapter createBECAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.BOD <em>BOD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.BOD
	 * @generated
	 */
	public Adapter createBODAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.BWC <em>BWC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.BWC
	 * @generated
	 */
	public Adapter createBWCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.BWR <em>BWR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.BWR
	 * @generated
	 */
	public Adapter createBWRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.BWW <em>BWW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.BWW
	 * @generated
	 */
	public Adapter createBWWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DBK <em>DBK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DBK
	 * @generated
	 */
	public Adapter createDBKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DBS <em>DBS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DBS
	 * @generated
	 */
	public Adapter createDBSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DBT <em>DBT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DBT
	 * @generated
	 */
	public Adapter createDBTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DPT <em>DPT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DPT
	 * @generated
	 */
	public Adapter createDPTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DSC <em>DSC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DSC
	 * @generated
	 */
	public Adapter createDSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DSE <em>DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DSE
	 * @generated
	 */
	public Adapter createDSEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DSI <em>DSI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DSI
	 * @generated
	 */
	public Adapter createDSIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DSR <em>DSR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DSR
	 * @generated
	 */
	public Adapter createDSRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.DTM <em>DTM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.DTM
	 * @generated
	 */
	public Adapter createDTMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.FSI <em>FSI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.FSI
	 * @generated
	 */
	public Adapter createFSIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GBS <em>GBS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GBS
	 * @generated
	 */
	public Adapter createGBSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GGA <em>GGA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GGA
	 * @generated
	 */
	public Adapter createGGAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GLC <em>GLC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GLC
	 * @generated
	 */
	public Adapter createGLCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GLL <em>GLL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GLL
	 * @generated
	 */
	public Adapter createGLLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GRS <em>GRS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GRS
	 * @generated
	 */
	public Adapter createGRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GST <em>GST</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GST
	 * @generated
	 */
	public Adapter createGSTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GSA <em>GSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GSA
	 * @generated
	 */
	public Adapter createGSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GSV <em>GSV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GSV
	 * @generated
	 */
	public Adapter createGSVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GTD <em>GTD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GTD
	 * @generated
	 */
	public Adapter createGTDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.GXA <em>GXA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.GXA
	 * @generated
	 */
	public Adapter createGXAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.HDG <em>HDG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.HDG
	 * @generated
	 */
	public Adapter createHDGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.HDM <em>HDM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.HDM
	 * @generated
	 */
	public Adapter createHDMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.HDT <em>HDT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.HDT
	 * @generated
	 */
	public Adapter createHDTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.HSC <em>HSC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.HSC
	 * @generated
	 */
	public Adapter createHSCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.LCD <em>LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.LCD
	 * @generated
	 */
	public Adapter createLCDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.MSK <em>MSK</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.MSK
	 * @generated
	 */
	public Adapter createMSKAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.MSS <em>MSS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.MSS
	 * @generated
	 */
	public Adapter createMSSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.MWD <em>MWD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.MWD
	 * @generated
	 */
	public Adapter createMWDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.MTW <em>MTW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.MTW
	 * @generated
	 */
	public Adapter createMTWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.MWW <em>MWW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.MWW
	 * @generated
	 */
	public Adapter createMWWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.OLN <em>OLN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.OLN
	 * @generated
	 */
	public Adapter createOLNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.OSD <em>OSD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.OSD
	 * @generated
	 */
	public Adapter createOSDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ROO <em>ROO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ROO
	 * @generated
	 */
	public Adapter createROOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RMA <em>RMA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RMA
	 * @generated
	 */
	public Adapter createRMAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RMB <em>RMB</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RMB
	 * @generated
	 */
	public Adapter createRMBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RMC <em>RMC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RMC
	 * @generated
	 */
	public Adapter createRMCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ROT <em>ROT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ROT
	 * @generated
	 */
	public Adapter createROTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RPM
	 * @generated
	 */
	public Adapter createRPMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RSA <em>RSA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RSA
	 * @generated
	 */
	public Adapter createRSAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RSD <em>RSD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RSD
	 * @generated
	 */
	public Adapter createRSDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.RTE <em>RTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.RTE
	 * @generated
	 */
	public Adapter createRTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.SFI <em>SFI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.SFI
	 * @generated
	 */
	public Adapter createSFIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.STN <em>STN</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.STN
	 * @generated
	 */
	public Adapter createSTNAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.TLL <em>TLL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.TLL
	 * @generated
	 */
	public Adapter createTLLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.TRF <em>TRF</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.TRF
	 * @generated
	 */
	public Adapter createTRFAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.TTM <em>TTM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.TTM
	 * @generated
	 */
	public Adapter createTTMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VBW <em>VBW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VBW
	 * @generated
	 */
	public Adapter createVBWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VDR <em>VDR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VDR
	 * @generated
	 */
	public Adapter createVDRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VHW <em>VHW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VHW
	 * @generated
	 */
	public Adapter createVHWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VLW <em>VLW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VLW
	 * @generated
	 */
	public Adapter createVLWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VPW <em>VPW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VPW
	 * @generated
	 */
	public Adapter createVPWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VTG <em>VTG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VTG
	 * @generated
	 */
	public Adapter createVTGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.VWR <em>VWR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.VWR
	 * @generated
	 */
	public Adapter createVWRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.WCV <em>WCV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.WCV
	 * @generated
	 */
	public Adapter createWCVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.WDC <em>WDC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.WDC
	 * @generated
	 */
	public Adapter createWDCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.WDR <em>WDR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.WDR
	 * @generated
	 */
	public Adapter createWDRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.WNC <em>WNC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.WNC
	 * @generated
	 */
	public Adapter createWNCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.WPL <em>WPL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.WPL
	 * @generated
	 */
	public Adapter createWPLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.XDR <em>XDR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.XDR
	 * @generated
	 */
	public Adapter createXDRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.XTE <em>XTE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.XTE
	 * @generated
	 */
	public Adapter createXTEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.XTR <em>XTR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.XTR
	 * @generated
	 */
	public Adapter createXTRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ZDA <em>ZDA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ZDA
	 * @generated
	 */
	public Adapter createZDAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ZDL <em>ZDL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ZDL
	 * @generated
	 */
	public Adapter createZDLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ZFO <em>ZFO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ZFO
	 * @generated
	 */
	public Adapter createZFOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.smbt.gps.nmea1083.ZTG <em>ZTG</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.smbt.gps.nmea1083.ZTG
	 * @generated
	 */
	public Adapter createZTGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.sf.xqz.model.cmd.Cmd <em>Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.sf.xqz.model.cmd.Cmd
	 * @generated
	 */
	public Adapter createCmdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Nmea1083AdapterFactory
