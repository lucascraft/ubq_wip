/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083.impl;

import net.sf.smbt.gps.nmea1083.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Nmea1083FactoryImpl extends EFactoryImpl implements Nmea1083Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Nmea1083Factory init() {
		try {
			Nmea1083Factory theNmea1083Factory = (Nmea1083Factory)EPackage.Registry.INSTANCE.getEFactory("http://nmea1083/1.0"); 
			if (theNmea1083Factory != null) {
				return theNmea1083Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Nmea1083FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nmea1083FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Nmea1083Package.NMEA_CMD: return createNmeaCmd();
			case Nmea1083Package.AAM: return createAAM();
			case Nmea1083Package.ALM: return createALM();
			case Nmea1083Package.APA: return createAPA();
			case Nmea1083Package.APB: return createAPB();
			case Nmea1083Package.ASD: return createASD();
			case Nmea1083Package.BEC: return createBEC();
			case Nmea1083Package.BOD: return createBOD();
			case Nmea1083Package.BWC: return createBWC();
			case Nmea1083Package.BWR: return createBWR();
			case Nmea1083Package.BWW: return createBWW();
			case Nmea1083Package.DBK: return createDBK();
			case Nmea1083Package.DBS: return createDBS();
			case Nmea1083Package.DBT: return createDBT();
			case Nmea1083Package.DPT: return createDPT();
			case Nmea1083Package.DSC: return createDSC();
			case Nmea1083Package.DSE: return createDSE();
			case Nmea1083Package.DSI: return createDSI();
			case Nmea1083Package.DSR: return createDSR();
			case Nmea1083Package.DTM: return createDTM();
			case Nmea1083Package.FSI: return createFSI();
			case Nmea1083Package.GBS: return createGBS();
			case Nmea1083Package.GGA: return createGGA();
			case Nmea1083Package.GLC: return createGLC();
			case Nmea1083Package.GLL: return createGLL();
			case Nmea1083Package.GRS: return createGRS();
			case Nmea1083Package.GST: return createGST();
			case Nmea1083Package.GSA: return createGSA();
			case Nmea1083Package.GSV: return createGSV();
			case Nmea1083Package.GTD: return createGTD();
			case Nmea1083Package.GXA: return createGXA();
			case Nmea1083Package.HDG: return createHDG();
			case Nmea1083Package.HDM: return createHDM();
			case Nmea1083Package.HDT: return createHDT();
			case Nmea1083Package.HSC: return createHSC();
			case Nmea1083Package.LCD: return createLCD();
			case Nmea1083Package.MSK: return createMSK();
			case Nmea1083Package.MSS: return createMSS();
			case Nmea1083Package.MWD: return createMWD();
			case Nmea1083Package.MTW: return createMTW();
			case Nmea1083Package.MWW: return createMWW();
			case Nmea1083Package.OLN: return createOLN();
			case Nmea1083Package.OSD: return createOSD();
			case Nmea1083Package.ROO: return createROO();
			case Nmea1083Package.RMA: return createRMA();
			case Nmea1083Package.RMB: return createRMB();
			case Nmea1083Package.RMC: return createRMC();
			case Nmea1083Package.ROT: return createROT();
			case Nmea1083Package.RPM: return createRPM();
			case Nmea1083Package.RSA: return createRSA();
			case Nmea1083Package.RSD: return createRSD();
			case Nmea1083Package.RTE: return createRTE();
			case Nmea1083Package.SFI: return createSFI();
			case Nmea1083Package.STN: return createSTN();
			case Nmea1083Package.TLL: return createTLL();
			case Nmea1083Package.TRF: return createTRF();
			case Nmea1083Package.TTM: return createTTM();
			case Nmea1083Package.VBW: return createVBW();
			case Nmea1083Package.VDR: return createVDR();
			case Nmea1083Package.VHW: return createVHW();
			case Nmea1083Package.VLW: return createVLW();
			case Nmea1083Package.VPW: return createVPW();
			case Nmea1083Package.VTG: return createVTG();
			case Nmea1083Package.VWR: return createVWR();
			case Nmea1083Package.WCV: return createWCV();
			case Nmea1083Package.WDC: return createWDC();
			case Nmea1083Package.WDR: return createWDR();
			case Nmea1083Package.WNC: return createWNC();
			case Nmea1083Package.WPL: return createWPL();
			case Nmea1083Package.XDR: return createXDR();
			case Nmea1083Package.XTE: return createXTE();
			case Nmea1083Package.XTR: return createXTR();
			case Nmea1083Package.ZDA: return createZDA();
			case Nmea1083Package.ZDL: return createZDL();
			case Nmea1083Package.ZFO: return createZFO();
			case Nmea1083Package.ZTG: return createZTG();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Nmea1083Package.NMEA_TALKER:
				return createNmeaTalkerFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Nmea1083Package.NMEA_TALKER:
				return convertNmeaTalkerToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NmeaCmd createNmeaCmd() {
		NmeaCmdImpl nmeaCmd = new NmeaCmdImpl();
		return nmeaCmd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAM createAAM() {
		AAMImpl aam = new AAMImpl();
		return aam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALM createALM() {
		ALMImpl alm = new ALMImpl();
		return alm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APA createAPA() {
		APAImpl apa = new APAImpl();
		return apa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APB createAPB() {
		APBImpl apb = new APBImpl();
		return apb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASD createASD() {
		ASDImpl asd = new ASDImpl();
		return asd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BEC createBEC() {
		BECImpl bec = new BECImpl();
		return bec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BOD createBOD() {
		BODImpl bod = new BODImpl();
		return bod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWC createBWC() {
		BWCImpl bwc = new BWCImpl();
		return bwc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWR createBWR() {
		BWRImpl bwr = new BWRImpl();
		return bwr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BWW createBWW() {
		BWWImpl bww = new BWWImpl();
		return bww;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBK createDBK() {
		DBKImpl dbk = new DBKImpl();
		return dbk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBS createDBS() {
		DBSImpl dbs = new DBSImpl();
		return dbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBT createDBT() {
		DBTImpl dbt = new DBTImpl();
		return dbt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPT createDPT() {
		DPTImpl dpt = new DPTImpl();
		return dpt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSC createDSC() {
		DSCImpl dsc = new DSCImpl();
		return dsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSE createDSE() {
		DSEImpl dse = new DSEImpl();
		return dse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSI createDSI() {
		DSIImpl dsi = new DSIImpl();
		return dsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSR createDSR() {
		DSRImpl dsr = new DSRImpl();
		return dsr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTM createDTM() {
		DTMImpl dtm = new DTMImpl();
		return dtm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FSI createFSI() {
		FSIImpl fsi = new FSIImpl();
		return fsi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GBS createGBS() {
		GBSImpl gbs = new GBSImpl();
		return gbs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGA createGGA() {
		GGAImpl gga = new GGAImpl();
		return gga;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GLC createGLC() {
		GLCImpl glc = new GLCImpl();
		return glc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GLL createGLL() {
		GLLImpl gll = new GLLImpl();
		return gll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRS createGRS() {
		GRSImpl grs = new GRSImpl();
		return grs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GST createGST() {
		GSTImpl gst = new GSTImpl();
		return gst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSA createGSA() {
		GSAImpl gsa = new GSAImpl();
		return gsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GSV createGSV() {
		GSVImpl gsv = new GSVImpl();
		return gsv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GTD createGTD() {
		GTDImpl gtd = new GTDImpl();
		return gtd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GXA createGXA() {
		GXAImpl gxa = new GXAImpl();
		return gxa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDG createHDG() {
		HDGImpl hdg = new HDGImpl();
		return hdg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDM createHDM() {
		HDMImpl hdm = new HDMImpl();
		return hdm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HDT createHDT() {
		HDTImpl hdt = new HDTImpl();
		return hdt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HSC createHSC() {
		HSCImpl hsc = new HSCImpl();
		return hsc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LCD createLCD() {
		LCDImpl lcd = new LCDImpl();
		return lcd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSK createMSK() {
		MSKImpl msk = new MSKImpl();
		return msk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSS createMSS() {
		MSSImpl mss = new MSSImpl();
		return mss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWD createMWD() {
		MWDImpl mwd = new MWDImpl();
		return mwd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTW createMTW() {
		MTWImpl mtw = new MTWImpl();
		return mtw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MWW createMWW() {
		MWWImpl mww = new MWWImpl();
		return mww;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OLN createOLN() {
		OLNImpl oln = new OLNImpl();
		return oln;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OSD createOSD() {
		OSDImpl osd = new OSDImpl();
		return osd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROO createROO() {
		ROOImpl roo = new ROOImpl();
		return roo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMA createRMA() {
		RMAImpl rma = new RMAImpl();
		return rma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMB createRMB() {
		RMBImpl rmb = new RMBImpl();
		return rmb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RMC createRMC() {
		RMCImpl rmc = new RMCImpl();
		return rmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROT createROT() {
		ROTImpl rot = new ROTImpl();
		return rot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RPM createRPM() {
		RPMImpl rpm = new RPMImpl();
		return rpm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSA createRSA() {
		RSAImpl rsa = new RSAImpl();
		return rsa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RSD createRSD() {
		RSDImpl rsd = new RSDImpl();
		return rsd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTE createRTE() {
		RTEImpl rte = new RTEImpl();
		return rte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFI createSFI() {
		SFIImpl sfi = new SFIImpl();
		return sfi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public STN createSTN() {
		STNImpl stn = new STNImpl();
		return stn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLL createTLL() {
		TLLImpl tll = new TLLImpl();
		return tll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRF createTRF() {
		TRFImpl trf = new TRFImpl();
		return trf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TTM createTTM() {
		TTMImpl ttm = new TTMImpl();
		return ttm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VBW createVBW() {
		VBWImpl vbw = new VBWImpl();
		return vbw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VDR createVDR() {
		VDRImpl vdr = new VDRImpl();
		return vdr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VHW createVHW() {
		VHWImpl vhw = new VHWImpl();
		return vhw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VLW createVLW() {
		VLWImpl vlw = new VLWImpl();
		return vlw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VPW createVPW() {
		VPWImpl vpw = new VPWImpl();
		return vpw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VTG createVTG() {
		VTGImpl vtg = new VTGImpl();
		return vtg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VWR createVWR() {
		VWRImpl vwr = new VWRImpl();
		return vwr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WCV createWCV() {
		WCVImpl wcv = new WCVImpl();
		return wcv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WDC createWDC() {
		WDCImpl wdc = new WDCImpl();
		return wdc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WDR createWDR() {
		WDRImpl wdr = new WDRImpl();
		return wdr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WNC createWNC() {
		WNCImpl wnc = new WNCImpl();
		return wnc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WPL createWPL() {
		WPLImpl wpl = new WPLImpl();
		return wpl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDR createXDR() {
		XDRImpl xdr = new XDRImpl();
		return xdr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTE createXTE() {
		XTEImpl xte = new XTEImpl();
		return xte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTR createXTR() {
		XTRImpl xtr = new XTRImpl();
		return xtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZDA createZDA() {
		ZDAImpl zda = new ZDAImpl();
		return zda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZDL createZDL() {
		ZDLImpl zdl = new ZDLImpl();
		return zdl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZFO createZFO() {
		ZFOImpl zfo = new ZFOImpl();
		return zfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZTG createZTG() {
		ZTGImpl ztg = new ZTGImpl();
		return ztg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NmeaTalker createNmeaTalkerFromString(EDataType eDataType, String initialValue) {
		NmeaTalker result = NmeaTalker.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNmeaTalkerToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nmea1083Package getNmea1083Package() {
		return (Nmea1083Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Nmea1083Package getPackage() {
		return Nmea1083Package.eINSTANCE;
	}

} //Nmea1083FactoryImpl
