/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083.impl;

import net.sf.smbt.gps.nmea1083.Nmea1083Factory;
import net.sf.smbt.gps.nmea1083.Nmea1083Package;
import net.sf.smbt.gps.nmea1083.NmeaCmd;
import net.sf.smbt.gps.nmea1083.NmeaTalker;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Nmea1083PackageImpl extends EPackageImpl implements Nmea1083Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nmeaCmdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass almEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass becEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bwcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bwrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bwwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dbtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dscEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dsrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dtmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fsiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gbsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ggaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gstEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gtdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gxaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hdtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hscEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lcdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mssEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mwwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass olnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass osdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rooEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rpmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rsdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tllEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ttmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vbwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vdrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vhwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vlwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vpwEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vtgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vwrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wcvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wdcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wdrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wncEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wplEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xdrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xtrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zdaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zdlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ztgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nmeaTalkerEEnum = null;

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
	 * @see net.sf.smbt.gps.nmea1083.Nmea1083Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Nmea1083PackageImpl() {
		super(eNS_URI, Nmea1083Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Nmea1083Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Nmea1083Package init() {
		if (isInited) return (Nmea1083Package)EPackage.Registry.INSTANCE.getEPackage(Nmea1083Package.eNS_URI);

		// Obtain or create and register package
		Nmea1083PackageImpl theNmea1083Package = (Nmea1083PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Nmea1083PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Nmea1083PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theNmea1083Package.createPackageContents();

		// Initialize created meta-data
		theNmea1083Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNmea1083Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Nmea1083Package.eNS_URI, theNmea1083Package);
		return theNmea1083Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNmeaCmd() {
		return nmeaCmdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAM() {
		return aamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAM_ArrivalCircleEntered() {
		return (EAttribute)aamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAM_PerpendicularPassedAtWaypoint() {
		return (EAttribute)aamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAM_ArrivalCircleRadius() {
		return (EAttribute)aamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAM_UnitOfRadiusInMiles() {
		return (EAttribute)aamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAM_WaypointID() {
		return (EAttribute)aamEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAM_Chechksum() {
		return (EAttribute)aamEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALM() {
		return almEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPA() {
		return apaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPB() {
		return apbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASD() {
		return asdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEC() {
		return becEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOD() {
		return bodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBWC() {
		return bwcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBWR() {
		return bwrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBWW() {
		return bwwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBK() {
		return dbkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBS() {
		return dbsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDBT() {
		return dbtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDPT() {
		return dptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSC() {
		return dscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSE() {
		return dseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSI() {
		return dsiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDSR() {
		return dsrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDTM() {
		return dtmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFSI() {
		return fsiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGBS() {
		return gbsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGGA() {
		return ggaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGLC() {
		return glcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGLL() {
		return gllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGRS() {
		return grsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGST() {
		return gstEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSA() {
		return gsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGSV() {
		return gsvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGTD() {
		return gtdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGXA() {
		return gxaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDG() {
		return hdgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDM() {
		return hdmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHDT() {
		return hdtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHSC() {
		return hscEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLCD() {
		return lcdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSK() {
		return mskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMSS() {
		return mssEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWD() {
		return mwdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTW() {
		return mtwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMWW() {
		return mwwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOLN() {
		return olnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOSD() {
		return osdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROO() {
		return rooEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMA() {
		return rmaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMB() {
		return rmbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRMC() {
		return rmcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getROT() {
		return rotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRPM() {
		return rpmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSA() {
		return rsaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRSD() {
		return rsdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRTE() {
		return rteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFI() {
		return sfiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSTN() {
		return stnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLL() {
		return tllEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTRF() {
		return trfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTTM() {
		return ttmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVBW() {
		return vbwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVDR() {
		return vdrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVHW() {
		return vhwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVLW() {
		return vlwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVPW() {
		return vpwEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVTG() {
		return vtgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVWR() {
		return vwrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWCV() {
		return wcvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWDC() {
		return wdcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWDR() {
		return wdrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWNC() {
		return wncEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWPL() {
		return wplEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDR() {
		return xdrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTE() {
		return xteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTR() {
		return xtrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZDA() {
		return zdaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZDL() {
		return zdlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZFO() {
		return zfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZTG() {
		return ztgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNmeaTalker() {
		return nmeaTalkerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Nmea1083Factory getNmea1083Factory() {
		return (Nmea1083Factory)getEFactoryInstance();
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
		nmeaCmdEClass = createEClass(NMEA_CMD);

		aamEClass = createEClass(AAM);
		createEAttribute(aamEClass, AAM__ARRIVAL_CIRCLE_ENTERED);
		createEAttribute(aamEClass, AAM__PERPENDICULAR_PASSED_AT_WAYPOINT);
		createEAttribute(aamEClass, AAM__ARRIVAL_CIRCLE_RADIUS);
		createEAttribute(aamEClass, AAM__UNIT_OF_RADIUS_IN_MILES);
		createEAttribute(aamEClass, AAM__WAYPOINT_ID);
		createEAttribute(aamEClass, AAM__CHECHKSUM);

		almEClass = createEClass(ALM);

		apaEClass = createEClass(APA);

		apbEClass = createEClass(APB);

		asdEClass = createEClass(ASD);

		becEClass = createEClass(BEC);

		bodEClass = createEClass(BOD);

		bwcEClass = createEClass(BWC);

		bwrEClass = createEClass(BWR);

		bwwEClass = createEClass(BWW);

		dbkEClass = createEClass(DBK);

		dbsEClass = createEClass(DBS);

		dbtEClass = createEClass(DBT);

		dptEClass = createEClass(DPT);

		dscEClass = createEClass(DSC);

		dseEClass = createEClass(DSE);

		dsiEClass = createEClass(DSI);

		dsrEClass = createEClass(DSR);

		dtmEClass = createEClass(DTM);

		fsiEClass = createEClass(FSI);

		gbsEClass = createEClass(GBS);

		ggaEClass = createEClass(GGA);

		glcEClass = createEClass(GLC);

		gllEClass = createEClass(GLL);

		grsEClass = createEClass(GRS);

		gstEClass = createEClass(GST);

		gsaEClass = createEClass(GSA);

		gsvEClass = createEClass(GSV);

		gtdEClass = createEClass(GTD);

		gxaEClass = createEClass(GXA);

		hdgEClass = createEClass(HDG);

		hdmEClass = createEClass(HDM);

		hdtEClass = createEClass(HDT);

		hscEClass = createEClass(HSC);

		lcdEClass = createEClass(LCD);

		mskEClass = createEClass(MSK);

		mssEClass = createEClass(MSS);

		mwdEClass = createEClass(MWD);

		mtwEClass = createEClass(MTW);

		mwwEClass = createEClass(MWW);

		olnEClass = createEClass(OLN);

		osdEClass = createEClass(OSD);

		rooEClass = createEClass(ROO);

		rmaEClass = createEClass(RMA);

		rmbEClass = createEClass(RMB);

		rmcEClass = createEClass(RMC);

		rotEClass = createEClass(ROT);

		rpmEClass = createEClass(RPM);

		rsaEClass = createEClass(RSA);

		rsdEClass = createEClass(RSD);

		rteEClass = createEClass(RTE);

		sfiEClass = createEClass(SFI);

		stnEClass = createEClass(STN);

		tllEClass = createEClass(TLL);

		trfEClass = createEClass(TRF);

		ttmEClass = createEClass(TTM);

		vbwEClass = createEClass(VBW);

		vdrEClass = createEClass(VDR);

		vhwEClass = createEClass(VHW);

		vlwEClass = createEClass(VLW);

		vpwEClass = createEClass(VPW);

		vtgEClass = createEClass(VTG);

		vwrEClass = createEClass(VWR);

		wcvEClass = createEClass(WCV);

		wdcEClass = createEClass(WDC);

		wdrEClass = createEClass(WDR);

		wncEClass = createEClass(WNC);

		wplEClass = createEClass(WPL);

		xdrEClass = createEClass(XDR);

		xteEClass = createEClass(XTE);

		xtrEClass = createEClass(XTR);

		zdaEClass = createEClass(ZDA);

		zdlEClass = createEClass(ZDL);

		zfoEClass = createEClass(ZFO);

		ztgEClass = createEClass(ZTG);

		// Create enums
		nmeaTalkerEEnum = createEEnum(NMEA_TALKER);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nmeaCmdEClass.getESuperTypes().add(theCmdPackage.getCmd());
		aamEClass.getESuperTypes().add(this.getNmeaCmd());

		// Initialize classes and features; add operations and parameters
		initEClass(nmeaCmdEClass, NmeaCmd.class, "NmeaCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aamEClass, net.sf.smbt.gps.nmea1083.AAM.class, "AAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAAM_ArrivalCircleEntered(), theEcorePackage.getEBoolean(), "arrivalCircleEntered", null, 0, 1, net.sf.smbt.gps.nmea1083.AAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAM_PerpendicularPassedAtWaypoint(), theEcorePackage.getEBoolean(), "perpendicularPassedAtWaypoint", null, 0, 1, net.sf.smbt.gps.nmea1083.AAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAM_ArrivalCircleRadius(), theEcorePackage.getEInt(), "arrivalCircleRadius", null, 0, 1, net.sf.smbt.gps.nmea1083.AAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAM_UnitOfRadiusInMiles(), theEcorePackage.getEFloat(), "unitOfRadiusInMiles", null, 0, 1, net.sf.smbt.gps.nmea1083.AAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAM_WaypointID(), theEcorePackage.getEString(), "waypointID", null, 0, 1, net.sf.smbt.gps.nmea1083.AAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAM_Chechksum(), theEcorePackage.getELong(), "chechksum", null, 0, 1, net.sf.smbt.gps.nmea1083.AAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(almEClass, net.sf.smbt.gps.nmea1083.ALM.class, "ALM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apaEClass, net.sf.smbt.gps.nmea1083.APA.class, "APA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(apbEClass, net.sf.smbt.gps.nmea1083.APB.class, "APB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(asdEClass, net.sf.smbt.gps.nmea1083.ASD.class, "ASD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(becEClass, net.sf.smbt.gps.nmea1083.BEC.class, "BEC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bodEClass, net.sf.smbt.gps.nmea1083.BOD.class, "BOD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bwcEClass, net.sf.smbt.gps.nmea1083.BWC.class, "BWC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bwrEClass, net.sf.smbt.gps.nmea1083.BWR.class, "BWR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bwwEClass, net.sf.smbt.gps.nmea1083.BWW.class, "BWW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbkEClass, net.sf.smbt.gps.nmea1083.DBK.class, "DBK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbsEClass, net.sf.smbt.gps.nmea1083.DBS.class, "DBS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dbtEClass, net.sf.smbt.gps.nmea1083.DBT.class, "DBT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dptEClass, net.sf.smbt.gps.nmea1083.DPT.class, "DPT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dscEClass, net.sf.smbt.gps.nmea1083.DSC.class, "DSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dseEClass, net.sf.smbt.gps.nmea1083.DSE.class, "DSE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsiEClass, net.sf.smbt.gps.nmea1083.DSI.class, "DSI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dsrEClass, net.sf.smbt.gps.nmea1083.DSR.class, "DSR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dtmEClass, net.sf.smbt.gps.nmea1083.DTM.class, "DTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fsiEClass, net.sf.smbt.gps.nmea1083.FSI.class, "FSI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gbsEClass, net.sf.smbt.gps.nmea1083.GBS.class, "GBS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ggaEClass, net.sf.smbt.gps.nmea1083.GGA.class, "GGA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glcEClass, net.sf.smbt.gps.nmea1083.GLC.class, "GLC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gllEClass, net.sf.smbt.gps.nmea1083.GLL.class, "GLL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grsEClass, net.sf.smbt.gps.nmea1083.GRS.class, "GRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gstEClass, net.sf.smbt.gps.nmea1083.GST.class, "GST", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gsaEClass, net.sf.smbt.gps.nmea1083.GSA.class, "GSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gsvEClass, net.sf.smbt.gps.nmea1083.GSV.class, "GSV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gtdEClass, net.sf.smbt.gps.nmea1083.GTD.class, "GTD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(gxaEClass, net.sf.smbt.gps.nmea1083.GXA.class, "GXA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hdgEClass, net.sf.smbt.gps.nmea1083.HDG.class, "HDG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hdmEClass, net.sf.smbt.gps.nmea1083.HDM.class, "HDM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hdtEClass, net.sf.smbt.gps.nmea1083.HDT.class, "HDT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hscEClass, net.sf.smbt.gps.nmea1083.HSC.class, "HSC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lcdEClass, net.sf.smbt.gps.nmea1083.LCD.class, "LCD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mskEClass, net.sf.smbt.gps.nmea1083.MSK.class, "MSK", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mssEClass, net.sf.smbt.gps.nmea1083.MSS.class, "MSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mwdEClass, net.sf.smbt.gps.nmea1083.MWD.class, "MWD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mtwEClass, net.sf.smbt.gps.nmea1083.MTW.class, "MTW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mwwEClass, net.sf.smbt.gps.nmea1083.MWW.class, "MWW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(olnEClass, net.sf.smbt.gps.nmea1083.OLN.class, "OLN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(osdEClass, net.sf.smbt.gps.nmea1083.OSD.class, "OSD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rooEClass, net.sf.smbt.gps.nmea1083.ROO.class, "ROO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rmaEClass, net.sf.smbt.gps.nmea1083.RMA.class, "RMA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rmbEClass, net.sf.smbt.gps.nmea1083.RMB.class, "RMB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rmcEClass, net.sf.smbt.gps.nmea1083.RMC.class, "RMC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rotEClass, net.sf.smbt.gps.nmea1083.ROT.class, "ROT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rpmEClass, net.sf.smbt.gps.nmea1083.RPM.class, "RPM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rsaEClass, net.sf.smbt.gps.nmea1083.RSA.class, "RSA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rsdEClass, net.sf.smbt.gps.nmea1083.RSD.class, "RSD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rteEClass, net.sf.smbt.gps.nmea1083.RTE.class, "RTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sfiEClass, net.sf.smbt.gps.nmea1083.SFI.class, "SFI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stnEClass, net.sf.smbt.gps.nmea1083.STN.class, "STN", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tllEClass, net.sf.smbt.gps.nmea1083.TLL.class, "TLL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trfEClass, net.sf.smbt.gps.nmea1083.TRF.class, "TRF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ttmEClass, net.sf.smbt.gps.nmea1083.TTM.class, "TTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vbwEClass, net.sf.smbt.gps.nmea1083.VBW.class, "VBW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vdrEClass, net.sf.smbt.gps.nmea1083.VDR.class, "VDR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vhwEClass, net.sf.smbt.gps.nmea1083.VHW.class, "VHW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vlwEClass, net.sf.smbt.gps.nmea1083.VLW.class, "VLW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vpwEClass, net.sf.smbt.gps.nmea1083.VPW.class, "VPW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vtgEClass, net.sf.smbt.gps.nmea1083.VTG.class, "VTG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vwrEClass, net.sf.smbt.gps.nmea1083.VWR.class, "VWR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wcvEClass, net.sf.smbt.gps.nmea1083.WCV.class, "WCV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wdcEClass, net.sf.smbt.gps.nmea1083.WDC.class, "WDC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wdrEClass, net.sf.smbt.gps.nmea1083.WDR.class, "WDR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wncEClass, net.sf.smbt.gps.nmea1083.WNC.class, "WNC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(wplEClass, net.sf.smbt.gps.nmea1083.WPL.class, "WPL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xdrEClass, net.sf.smbt.gps.nmea1083.XDR.class, "XDR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xteEClass, net.sf.smbt.gps.nmea1083.XTE.class, "XTE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xtrEClass, net.sf.smbt.gps.nmea1083.XTR.class, "XTR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zdaEClass, net.sf.smbt.gps.nmea1083.ZDA.class, "ZDA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zdlEClass, net.sf.smbt.gps.nmea1083.ZDL.class, "ZDL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(zfoEClass, net.sf.smbt.gps.nmea1083.ZFO.class, "ZFO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ztgEClass, net.sf.smbt.gps.nmea1083.ZTG.class, "ZTG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(nmeaTalkerEEnum, NmeaTalker.class, "NmeaTalker");
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.AG);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.AP);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.CD);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.CR);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.CS);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.CT);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.CV);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.CX);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.DF);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.EC);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.EP);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.ER);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.GP);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.HC);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.HE);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.HN);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.II);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.IN);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.LC);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.P);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.RA);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.SD);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.SN);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.SS);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.TI);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.VD);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.DM);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.VW);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.WI);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.YX);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.ZA);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.ZC);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.ZQ);
		addEEnumLiteral(nmeaTalkerEEnum, NmeaTalker.ZV);

		// Create resource
		createResource(eNS_URI);
	}

} //Nmea1083PackageImpl
