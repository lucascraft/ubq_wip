/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.gps.nmea1083;

import net.sf.xqz.model.cmd.CmdPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
 * @see net.sf.smbt.gps.nmea1083.Nmea1083Factory
 * @model kind="package"
 * @generated
 */
public interface Nmea1083Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "nmea1083";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://nmea1083/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "nmea1083";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Nmea1083Package eINSTANCE = net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.NmeaCmdImpl <em>Nmea Cmd</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.NmeaCmdImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getNmeaCmd()
	 * @generated
	 */
	int NMEA_CMD = 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NMEA_CMD__PRIORITY = CmdPackage.CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NMEA_CMD__STAMP = CmdPackage.CMD__STAMP;

	/**
	 * The number of structural features of the '<em>Nmea Cmd</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NMEA_CMD_FEATURE_COUNT = CmdPackage.CMD_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl <em>AAM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.AAMImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getAAM()
	 * @generated
	 */
	int AAM = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__PRIORITY = NMEA_CMD__PRIORITY;

	/**
	 * The feature id for the '<em><b>Stamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__STAMP = NMEA_CMD__STAMP;

	/**
	 * The feature id for the '<em><b>Arrival Circle Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__ARRIVAL_CIRCLE_ENTERED = NMEA_CMD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Perpendicular Passed At Waypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__PERPENDICULAR_PASSED_AT_WAYPOINT = NMEA_CMD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arrival Circle Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__ARRIVAL_CIRCLE_RADIUS = NMEA_CMD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unit Of Radius In Miles</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__UNIT_OF_RADIUS_IN_MILES = NMEA_CMD_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Waypoint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__WAYPOINT_ID = NMEA_CMD_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Chechksum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM__CHECHKSUM = NMEA_CMD_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>AAM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAM_FEATURE_COUNT = NMEA_CMD_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ALMImpl <em>ALM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ALMImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getALM()
	 * @generated
	 */
	int ALM = 2;

	/**
	 * The number of structural features of the '<em>ALM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.APAImpl <em>APA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.APAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getAPA()
	 * @generated
	 */
	int APA = 3;

	/**
	 * The number of structural features of the '<em>APA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.APBImpl <em>APB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.APBImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getAPB()
	 * @generated
	 */
	int APB = 4;

	/**
	 * The number of structural features of the '<em>APB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APB_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ASDImpl <em>ASD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ASDImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getASD()
	 * @generated
	 */
	int ASD = 5;

	/**
	 * The number of structural features of the '<em>ASD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.BECImpl <em>BEC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.BECImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBEC()
	 * @generated
	 */
	int BEC = 6;

	/**
	 * The number of structural features of the '<em>BEC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.BODImpl <em>BOD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.BODImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBOD()
	 * @generated
	 */
	int BOD = 7;

	/**
	 * The number of structural features of the '<em>BOD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.BWCImpl <em>BWC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.BWCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBWC()
	 * @generated
	 */
	int BWC = 8;

	/**
	 * The number of structural features of the '<em>BWC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.BWRImpl <em>BWR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.BWRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBWR()
	 * @generated
	 */
	int BWR = 9;

	/**
	 * The number of structural features of the '<em>BWR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.BWWImpl <em>BWW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.BWWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBWW()
	 * @generated
	 */
	int BWW = 10;

	/**
	 * The number of structural features of the '<em>BWW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BWW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DBKImpl <em>DBK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DBKImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDBK()
	 * @generated
	 */
	int DBK = 11;

	/**
	 * The number of structural features of the '<em>DBK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DBSImpl <em>DBS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DBSImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDBS()
	 * @generated
	 */
	int DBS = 12;

	/**
	 * The number of structural features of the '<em>DBS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DBTImpl <em>DBT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DBTImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDBT()
	 * @generated
	 */
	int DBT = 13;

	/**
	 * The number of structural features of the '<em>DBT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DBT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DPTImpl <em>DPT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DPTImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDPT()
	 * @generated
	 */
	int DPT = 14;

	/**
	 * The number of structural features of the '<em>DPT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DSCImpl <em>DSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DSCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSC()
	 * @generated
	 */
	int DSC = 15;

	/**
	 * The number of structural features of the '<em>DSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DSEImpl <em>DSE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DSEImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSE()
	 * @generated
	 */
	int DSE = 16;

	/**
	 * The number of structural features of the '<em>DSE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DSIImpl <em>DSI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DSIImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSI()
	 * @generated
	 */
	int DSI = 17;

	/**
	 * The number of structural features of the '<em>DSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSI_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DSRImpl <em>DSR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DSRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSR()
	 * @generated
	 */
	int DSR = 18;

	/**
	 * The number of structural features of the '<em>DSR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DSR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.DTMImpl <em>DTM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.DTMImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDTM()
	 * @generated
	 */
	int DTM = 19;

	/**
	 * The number of structural features of the '<em>DTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DTM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.FSIImpl <em>FSI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.FSIImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getFSI()
	 * @generated
	 */
	int FSI = 20;

	/**
	 * The number of structural features of the '<em>FSI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FSI_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GBSImpl <em>GBS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GBSImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGBS()
	 * @generated
	 */
	int GBS = 21;

	/**
	 * The number of structural features of the '<em>GBS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GBS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GGAImpl <em>GGA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GGAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGGA()
	 * @generated
	 */
	int GGA = 22;

	/**
	 * The number of structural features of the '<em>GGA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GGA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GLCImpl <em>GLC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GLCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGLC()
	 * @generated
	 */
	int GLC = 23;

	/**
	 * The number of structural features of the '<em>GLC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GLLImpl <em>GLL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GLLImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGLL()
	 * @generated
	 */
	int GLL = 24;

	/**
	 * The number of structural features of the '<em>GLL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GRSImpl <em>GRS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GRSImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGRS()
	 * @generated
	 */
	int GRS = 25;

	/**
	 * The number of structural features of the '<em>GRS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GSTImpl <em>GST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GSTImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGST()
	 * @generated
	 */
	int GST = 26;

	/**
	 * The number of structural features of the '<em>GST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GST_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GSAImpl <em>GSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GSAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGSA()
	 * @generated
	 */
	int GSA = 27;

	/**
	 * The number of structural features of the '<em>GSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GSVImpl <em>GSV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GSVImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGSV()
	 * @generated
	 */
	int GSV = 28;

	/**
	 * The number of structural features of the '<em>GSV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GSV_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GTDImpl <em>GTD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GTDImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGTD()
	 * @generated
	 */
	int GTD = 29;

	/**
	 * The number of structural features of the '<em>GTD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GTD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.GXAImpl <em>GXA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.GXAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGXA()
	 * @generated
	 */
	int GXA = 30;

	/**
	 * The number of structural features of the '<em>GXA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GXA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.HDGImpl <em>HDG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.HDGImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHDG()
	 * @generated
	 */
	int HDG = 31;

	/**
	 * The number of structural features of the '<em>HDG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.HDMImpl <em>HDM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.HDMImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHDM()
	 * @generated
	 */
	int HDM = 32;

	/**
	 * The number of structural features of the '<em>HDM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.HDTImpl <em>HDT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.HDTImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHDT()
	 * @generated
	 */
	int HDT = 33;

	/**
	 * The number of structural features of the '<em>HDT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HDT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.HSCImpl <em>HSC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.HSCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHSC()
	 * @generated
	 */
	int HSC = 34;

	/**
	 * The number of structural features of the '<em>HSC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HSC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.LCDImpl <em>LCD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.LCDImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getLCD()
	 * @generated
	 */
	int LCD = 35;

	/**
	 * The number of structural features of the '<em>LCD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LCD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.MSKImpl <em>MSK</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.MSKImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMSK()
	 * @generated
	 */
	int MSK = 36;

	/**
	 * The number of structural features of the '<em>MSK</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.MSSImpl <em>MSS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.MSSImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMSS()
	 * @generated
	 */
	int MSS = 37;

	/**
	 * The number of structural features of the '<em>MSS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MSS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.MWDImpl <em>MWD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.MWDImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMWD()
	 * @generated
	 */
	int MWD = 38;

	/**
	 * The number of structural features of the '<em>MWD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.MTWImpl <em>MTW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.MTWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMTW()
	 * @generated
	 */
	int MTW = 39;

	/**
	 * The number of structural features of the '<em>MTW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.MWWImpl <em>MWW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.MWWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMWW()
	 * @generated
	 */
	int MWW = 40;

	/**
	 * The number of structural features of the '<em>MWW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MWW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.OLNImpl <em>OLN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.OLNImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getOLN()
	 * @generated
	 */
	int OLN = 41;

	/**
	 * The number of structural features of the '<em>OLN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.OSDImpl <em>OSD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.OSDImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getOSD()
	 * @generated
	 */
	int OSD = 42;

	/**
	 * The number of structural features of the '<em>OSD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OSD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ROOImpl <em>ROO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ROOImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getROO()
	 * @generated
	 */
	int ROO = 43;

	/**
	 * The number of structural features of the '<em>ROO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RMAImpl <em>RMA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RMAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRMA()
	 * @generated
	 */
	int RMA = 44;

	/**
	 * The number of structural features of the '<em>RMA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RMBImpl <em>RMB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RMBImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRMB()
	 * @generated
	 */
	int RMB = 45;

	/**
	 * The number of structural features of the '<em>RMB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMB_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RMCImpl <em>RMC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RMCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRMC()
	 * @generated
	 */
	int RMC = 46;

	/**
	 * The number of structural features of the '<em>RMC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RMC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ROTImpl <em>ROT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ROTImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getROT()
	 * @generated
	 */
	int ROT = 47;

	/**
	 * The number of structural features of the '<em>ROT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RPMImpl <em>RPM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RPMImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRPM()
	 * @generated
	 */
	int RPM = 48;

	/**
	 * The number of structural features of the '<em>RPM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RPM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RSAImpl <em>RSA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RSAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRSA()
	 * @generated
	 */
	int RSA = 49;

	/**
	 * The number of structural features of the '<em>RSA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RSDImpl <em>RSD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RSDImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRSD()
	 * @generated
	 */
	int RSD = 50;

	/**
	 * The number of structural features of the '<em>RSD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RSD_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.RTEImpl <em>RTE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.RTEImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRTE()
	 * @generated
	 */
	int RTE = 51;

	/**
	 * The number of structural features of the '<em>RTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.SFIImpl <em>SFI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.SFIImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getSFI()
	 * @generated
	 */
	int SFI = 52;

	/**
	 * The number of structural features of the '<em>SFI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFI_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.STNImpl <em>STN</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.STNImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getSTN()
	 * @generated
	 */
	int STN = 53;

	/**
	 * The number of structural features of the '<em>STN</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STN_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.TLLImpl <em>TLL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.TLLImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getTLL()
	 * @generated
	 */
	int TLL = 54;

	/**
	 * The number of structural features of the '<em>TLL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.TRFImpl <em>TRF</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.TRFImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getTRF()
	 * @generated
	 */
	int TRF = 55;

	/**
	 * The number of structural features of the '<em>TRF</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRF_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.TTMImpl <em>TTM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.TTMImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getTTM()
	 * @generated
	 */
	int TTM = 56;

	/**
	 * The number of structural features of the '<em>TTM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TTM_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VBWImpl <em>VBW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VBWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVBW()
	 * @generated
	 */
	int VBW = 57;

	/**
	 * The number of structural features of the '<em>VBW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VBW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VDRImpl <em>VDR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VDRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVDR()
	 * @generated
	 */
	int VDR = 58;

	/**
	 * The number of structural features of the '<em>VDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VDR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VHWImpl <em>VHW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VHWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVHW()
	 * @generated
	 */
	int VHW = 59;

	/**
	 * The number of structural features of the '<em>VHW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VHW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VLWImpl <em>VLW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VLWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVLW()
	 * @generated
	 */
	int VLW = 60;

	/**
	 * The number of structural features of the '<em>VLW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VLW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VPWImpl <em>VPW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VPWImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVPW()
	 * @generated
	 */
	int VPW = 61;

	/**
	 * The number of structural features of the '<em>VPW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VPW_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VTGImpl <em>VTG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VTGImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVTG()
	 * @generated
	 */
	int VTG = 62;

	/**
	 * The number of structural features of the '<em>VTG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VTG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.VWRImpl <em>VWR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.VWRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVWR()
	 * @generated
	 */
	int VWR = 63;

	/**
	 * The number of structural features of the '<em>VWR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VWR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.WCVImpl <em>WCV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.WCVImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWCV()
	 * @generated
	 */
	int WCV = 64;

	/**
	 * The number of structural features of the '<em>WCV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WCV_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.WDCImpl <em>WDC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.WDCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWDC()
	 * @generated
	 */
	int WDC = 65;

	/**
	 * The number of structural features of the '<em>WDC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.WDRImpl <em>WDR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.WDRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWDR()
	 * @generated
	 */
	int WDR = 66;

	/**
	 * The number of structural features of the '<em>WDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WDR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.WNCImpl <em>WNC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.WNCImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWNC()
	 * @generated
	 */
	int WNC = 67;

	/**
	 * The number of structural features of the '<em>WNC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WNC_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.WPLImpl <em>WPL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.WPLImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWPL()
	 * @generated
	 */
	int WPL = 68;

	/**
	 * The number of structural features of the '<em>WPL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WPL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.XDRImpl <em>XDR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.XDRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getXDR()
	 * @generated
	 */
	int XDR = 69;

	/**
	 * The number of structural features of the '<em>XDR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.XTEImpl <em>XTE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.XTEImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getXTE()
	 * @generated
	 */
	int XTE = 70;

	/**
	 * The number of structural features of the '<em>XTE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.XTRImpl <em>XTR</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.XTRImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getXTR()
	 * @generated
	 */
	int XTR = 71;

	/**
	 * The number of structural features of the '<em>XTR</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ZDAImpl <em>ZDA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ZDAImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZDA()
	 * @generated
	 */
	int ZDA = 72;

	/**
	 * The number of structural features of the '<em>ZDA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDA_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ZDLImpl <em>ZDL</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ZDLImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZDL()
	 * @generated
	 */
	int ZDL = 73;

	/**
	 * The number of structural features of the '<em>ZDL</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZDL_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ZFOImpl <em>ZFO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ZFOImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZFO()
	 * @generated
	 */
	int ZFO = 74;

	/**
	 * The number of structural features of the '<em>ZFO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZFO_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.impl.ZTGImpl <em>ZTG</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.impl.ZTGImpl
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZTG()
	 * @generated
	 */
	int ZTG = 75;

	/**
	 * The number of structural features of the '<em>ZTG</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZTG_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.sf.smbt.gps.nmea1083.NmeaTalker <em>Nmea Talker</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.gps.nmea1083.NmeaTalker
	 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getNmeaTalker()
	 * @generated
	 */
	int NMEA_TALKER = 76;


	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.NmeaCmd <em>Nmea Cmd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nmea Cmd</em>'.
	 * @see net.sf.smbt.gps.nmea1083.NmeaCmd
	 * @generated
	 */
	EClass getNmeaCmd();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.AAM <em>AAM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAM</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM
	 * @generated
	 */
	EClass getAAM();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.gps.nmea1083.AAM#isArrivalCircleEntered <em>Arrival Circle Entered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Circle Entered</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM#isArrivalCircleEntered()
	 * @see #getAAM()
	 * @generated
	 */
	EAttribute getAAM_ArrivalCircleEntered();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.gps.nmea1083.AAM#isPerpendicularPassedAtWaypoint <em>Perpendicular Passed At Waypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perpendicular Passed At Waypoint</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM#isPerpendicularPassedAtWaypoint()
	 * @see #getAAM()
	 * @generated
	 */
	EAttribute getAAM_PerpendicularPassedAtWaypoint();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.gps.nmea1083.AAM#getArrivalCircleRadius <em>Arrival Circle Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arrival Circle Radius</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM#getArrivalCircleRadius()
	 * @see #getAAM()
	 * @generated
	 */
	EAttribute getAAM_ArrivalCircleRadius();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.gps.nmea1083.AAM#getUnitOfRadiusInMiles <em>Unit Of Radius In Miles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Of Radius In Miles</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM#getUnitOfRadiusInMiles()
	 * @see #getAAM()
	 * @generated
	 */
	EAttribute getAAM_UnitOfRadiusInMiles();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.gps.nmea1083.AAM#getWaypointID <em>Waypoint ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Waypoint ID</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM#getWaypointID()
	 * @see #getAAM()
	 * @generated
	 */
	EAttribute getAAM_WaypointID();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.gps.nmea1083.AAM#getChechksum <em>Chechksum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Chechksum</em>'.
	 * @see net.sf.smbt.gps.nmea1083.AAM#getChechksum()
	 * @see #getAAM()
	 * @generated
	 */
	EAttribute getAAM_Chechksum();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ALM <em>ALM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALM</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ALM
	 * @generated
	 */
	EClass getALM();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.APA <em>APA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.APA
	 * @generated
	 */
	EClass getAPA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.APB <em>APB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APB</em>'.
	 * @see net.sf.smbt.gps.nmea1083.APB
	 * @generated
	 */
	EClass getAPB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ASD <em>ASD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ASD
	 * @generated
	 */
	EClass getASD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.BEC <em>BEC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BEC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.BEC
	 * @generated
	 */
	EClass getBEC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.BOD <em>BOD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.BOD
	 * @generated
	 */
	EClass getBOD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.BWC <em>BWC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.BWC
	 * @generated
	 */
	EClass getBWC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.BWR <em>BWR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.BWR
	 * @generated
	 */
	EClass getBWR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.BWW <em>BWW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BWW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.BWW
	 * @generated
	 */
	EClass getBWW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DBK <em>DBK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBK</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DBK
	 * @generated
	 */
	EClass getDBK();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DBS <em>DBS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBS</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DBS
	 * @generated
	 */
	EClass getDBS();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DBT <em>DBT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DBT</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DBT
	 * @generated
	 */
	EClass getDBT();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DPT <em>DPT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DPT</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DPT
	 * @generated
	 */
	EClass getDPT();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DSC <em>DSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DSC
	 * @generated
	 */
	EClass getDSC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DSE <em>DSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSE</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DSE
	 * @generated
	 */
	EClass getDSE();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DSI <em>DSI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSI</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DSI
	 * @generated
	 */
	EClass getDSI();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DSR <em>DSR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DSR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DSR
	 * @generated
	 */
	EClass getDSR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.DTM <em>DTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DTM</em>'.
	 * @see net.sf.smbt.gps.nmea1083.DTM
	 * @generated
	 */
	EClass getDTM();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.FSI <em>FSI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FSI</em>'.
	 * @see net.sf.smbt.gps.nmea1083.FSI
	 * @generated
	 */
	EClass getFSI();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GBS <em>GBS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GBS</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GBS
	 * @generated
	 */
	EClass getGBS();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GGA <em>GGA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GGA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GGA
	 * @generated
	 */
	EClass getGGA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GLC <em>GLC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GLC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GLC
	 * @generated
	 */
	EClass getGLC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GLL <em>GLL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GLL</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GLL
	 * @generated
	 */
	EClass getGLL();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GRS <em>GRS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GRS</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GRS
	 * @generated
	 */
	EClass getGRS();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GST <em>GST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GST</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GST
	 * @generated
	 */
	EClass getGST();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GSA <em>GSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GSA
	 * @generated
	 */
	EClass getGSA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GSV <em>GSV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GSV</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GSV
	 * @generated
	 */
	EClass getGSV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GTD <em>GTD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GTD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GTD
	 * @generated
	 */
	EClass getGTD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.GXA <em>GXA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>GXA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.GXA
	 * @generated
	 */
	EClass getGXA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.HDG <em>HDG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDG</em>'.
	 * @see net.sf.smbt.gps.nmea1083.HDG
	 * @generated
	 */
	EClass getHDG();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.HDM <em>HDM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDM</em>'.
	 * @see net.sf.smbt.gps.nmea1083.HDM
	 * @generated
	 */
	EClass getHDM();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.HDT <em>HDT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HDT</em>'.
	 * @see net.sf.smbt.gps.nmea1083.HDT
	 * @generated
	 */
	EClass getHDT();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.HSC <em>HSC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HSC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.HSC
	 * @generated
	 */
	EClass getHSC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.LCD <em>LCD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LCD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.LCD
	 * @generated
	 */
	EClass getLCD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.MSK <em>MSK</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSK</em>'.
	 * @see net.sf.smbt.gps.nmea1083.MSK
	 * @generated
	 */
	EClass getMSK();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.MSS <em>MSS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MSS</em>'.
	 * @see net.sf.smbt.gps.nmea1083.MSS
	 * @generated
	 */
	EClass getMSS();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.MWD <em>MWD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MWD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.MWD
	 * @generated
	 */
	EClass getMWD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.MTW <em>MTW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.MTW
	 * @generated
	 */
	EClass getMTW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.MWW <em>MWW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MWW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.MWW
	 * @generated
	 */
	EClass getMWW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.OLN <em>OLN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OLN</em>'.
	 * @see net.sf.smbt.gps.nmea1083.OLN
	 * @generated
	 */
	EClass getOLN();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.OSD <em>OSD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>OSD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.OSD
	 * @generated
	 */
	EClass getOSD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ROO <em>ROO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROO</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ROO
	 * @generated
	 */
	EClass getROO();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RMA <em>RMA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RMA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RMA
	 * @generated
	 */
	EClass getRMA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RMB <em>RMB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RMB</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RMB
	 * @generated
	 */
	EClass getRMB();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RMC <em>RMC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RMC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RMC
	 * @generated
	 */
	EClass getRMC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ROT <em>ROT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ROT</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ROT
	 * @generated
	 */
	EClass getROT();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RPM <em>RPM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RPM</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RPM
	 * @generated
	 */
	EClass getRPM();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RSA <em>RSA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RSA
	 * @generated
	 */
	EClass getRSA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RSD <em>RSD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RSD</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RSD
	 * @generated
	 */
	EClass getRSD();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.RTE <em>RTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RTE</em>'.
	 * @see net.sf.smbt.gps.nmea1083.RTE
	 * @generated
	 */
	EClass getRTE();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.SFI <em>SFI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFI</em>'.
	 * @see net.sf.smbt.gps.nmea1083.SFI
	 * @generated
	 */
	EClass getSFI();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.STN <em>STN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>STN</em>'.
	 * @see net.sf.smbt.gps.nmea1083.STN
	 * @generated
	 */
	EClass getSTN();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.TLL <em>TLL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLL</em>'.
	 * @see net.sf.smbt.gps.nmea1083.TLL
	 * @generated
	 */
	EClass getTLL();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.TRF <em>TRF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TRF</em>'.
	 * @see net.sf.smbt.gps.nmea1083.TRF
	 * @generated
	 */
	EClass getTRF();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.TTM <em>TTM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TTM</em>'.
	 * @see net.sf.smbt.gps.nmea1083.TTM
	 * @generated
	 */
	EClass getTTM();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VBW <em>VBW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VBW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VBW
	 * @generated
	 */
	EClass getVBW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VDR <em>VDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VDR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VDR
	 * @generated
	 */
	EClass getVDR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VHW <em>VHW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VHW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VHW
	 * @generated
	 */
	EClass getVHW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VLW <em>VLW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VLW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VLW
	 * @generated
	 */
	EClass getVLW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VPW <em>VPW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VPW</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VPW
	 * @generated
	 */
	EClass getVPW();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VTG <em>VTG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VTG</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VTG
	 * @generated
	 */
	EClass getVTG();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.VWR <em>VWR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VWR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.VWR
	 * @generated
	 */
	EClass getVWR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.WCV <em>WCV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WCV</em>'.
	 * @see net.sf.smbt.gps.nmea1083.WCV
	 * @generated
	 */
	EClass getWCV();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.WDC <em>WDC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WDC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.WDC
	 * @generated
	 */
	EClass getWDC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.WDR <em>WDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WDR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.WDR
	 * @generated
	 */
	EClass getWDR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.WNC <em>WNC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WNC</em>'.
	 * @see net.sf.smbt.gps.nmea1083.WNC
	 * @generated
	 */
	EClass getWNC();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.WPL <em>WPL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>WPL</em>'.
	 * @see net.sf.smbt.gps.nmea1083.WPL
	 * @generated
	 */
	EClass getWPL();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.XDR <em>XDR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.XDR
	 * @generated
	 */
	EClass getXDR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.XTE <em>XTE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTE</em>'.
	 * @see net.sf.smbt.gps.nmea1083.XTE
	 * @generated
	 */
	EClass getXTE();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.XTR <em>XTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTR</em>'.
	 * @see net.sf.smbt.gps.nmea1083.XTR
	 * @generated
	 */
	EClass getXTR();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ZDA <em>ZDA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZDA</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ZDA
	 * @generated
	 */
	EClass getZDA();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ZDL <em>ZDL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZDL</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ZDL
	 * @generated
	 */
	EClass getZDL();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ZFO <em>ZFO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZFO</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ZFO
	 * @generated
	 */
	EClass getZFO();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.gps.nmea1083.ZTG <em>ZTG</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ZTG</em>'.
	 * @see net.sf.smbt.gps.nmea1083.ZTG
	 * @generated
	 */
	EClass getZTG();

	/**
	 * Returns the meta object for enum '{@link net.sf.smbt.gps.nmea1083.NmeaTalker <em>Nmea Talker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Nmea Talker</em>'.
	 * @see net.sf.smbt.gps.nmea1083.NmeaTalker
	 * @generated
	 */
	EEnum getNmeaTalker();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Nmea1083Factory getNmea1083Factory();

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
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.NmeaCmdImpl <em>Nmea Cmd</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.NmeaCmdImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getNmeaCmd()
		 * @generated
		 */
		EClass NMEA_CMD = eINSTANCE.getNmeaCmd();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.AAMImpl <em>AAM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.AAMImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getAAM()
		 * @generated
		 */
		EClass AAM = eINSTANCE.getAAM();

		/**
		 * The meta object literal for the '<em><b>Arrival Circle Entered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAM__ARRIVAL_CIRCLE_ENTERED = eINSTANCE.getAAM_ArrivalCircleEntered();

		/**
		 * The meta object literal for the '<em><b>Perpendicular Passed At Waypoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAM__PERPENDICULAR_PASSED_AT_WAYPOINT = eINSTANCE.getAAM_PerpendicularPassedAtWaypoint();

		/**
		 * The meta object literal for the '<em><b>Arrival Circle Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAM__ARRIVAL_CIRCLE_RADIUS = eINSTANCE.getAAM_ArrivalCircleRadius();

		/**
		 * The meta object literal for the '<em><b>Unit Of Radius In Miles</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAM__UNIT_OF_RADIUS_IN_MILES = eINSTANCE.getAAM_UnitOfRadiusInMiles();

		/**
		 * The meta object literal for the '<em><b>Waypoint ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAM__WAYPOINT_ID = eINSTANCE.getAAM_WaypointID();

		/**
		 * The meta object literal for the '<em><b>Chechksum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAM__CHECHKSUM = eINSTANCE.getAAM_Chechksum();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ALMImpl <em>ALM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ALMImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getALM()
		 * @generated
		 */
		EClass ALM = eINSTANCE.getALM();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.APAImpl <em>APA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.APAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getAPA()
		 * @generated
		 */
		EClass APA = eINSTANCE.getAPA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.APBImpl <em>APB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.APBImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getAPB()
		 * @generated
		 */
		EClass APB = eINSTANCE.getAPB();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ASDImpl <em>ASD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ASDImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getASD()
		 * @generated
		 */
		EClass ASD = eINSTANCE.getASD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.BECImpl <em>BEC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.BECImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBEC()
		 * @generated
		 */
		EClass BEC = eINSTANCE.getBEC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.BODImpl <em>BOD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.BODImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBOD()
		 * @generated
		 */
		EClass BOD = eINSTANCE.getBOD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.BWCImpl <em>BWC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.BWCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBWC()
		 * @generated
		 */
		EClass BWC = eINSTANCE.getBWC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.BWRImpl <em>BWR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.BWRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBWR()
		 * @generated
		 */
		EClass BWR = eINSTANCE.getBWR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.BWWImpl <em>BWW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.BWWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getBWW()
		 * @generated
		 */
		EClass BWW = eINSTANCE.getBWW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DBKImpl <em>DBK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DBKImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDBK()
		 * @generated
		 */
		EClass DBK = eINSTANCE.getDBK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DBSImpl <em>DBS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DBSImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDBS()
		 * @generated
		 */
		EClass DBS = eINSTANCE.getDBS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DBTImpl <em>DBT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DBTImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDBT()
		 * @generated
		 */
		EClass DBT = eINSTANCE.getDBT();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DPTImpl <em>DPT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DPTImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDPT()
		 * @generated
		 */
		EClass DPT = eINSTANCE.getDPT();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DSCImpl <em>DSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DSCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSC()
		 * @generated
		 */
		EClass DSC = eINSTANCE.getDSC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DSEImpl <em>DSE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DSEImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSE()
		 * @generated
		 */
		EClass DSE = eINSTANCE.getDSE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DSIImpl <em>DSI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DSIImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSI()
		 * @generated
		 */
		EClass DSI = eINSTANCE.getDSI();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DSRImpl <em>DSR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DSRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDSR()
		 * @generated
		 */
		EClass DSR = eINSTANCE.getDSR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.DTMImpl <em>DTM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.DTMImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getDTM()
		 * @generated
		 */
		EClass DTM = eINSTANCE.getDTM();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.FSIImpl <em>FSI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.FSIImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getFSI()
		 * @generated
		 */
		EClass FSI = eINSTANCE.getFSI();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GBSImpl <em>GBS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GBSImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGBS()
		 * @generated
		 */
		EClass GBS = eINSTANCE.getGBS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GGAImpl <em>GGA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GGAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGGA()
		 * @generated
		 */
		EClass GGA = eINSTANCE.getGGA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GLCImpl <em>GLC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GLCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGLC()
		 * @generated
		 */
		EClass GLC = eINSTANCE.getGLC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GLLImpl <em>GLL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GLLImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGLL()
		 * @generated
		 */
		EClass GLL = eINSTANCE.getGLL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GRSImpl <em>GRS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GRSImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGRS()
		 * @generated
		 */
		EClass GRS = eINSTANCE.getGRS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GSTImpl <em>GST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GSTImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGST()
		 * @generated
		 */
		EClass GST = eINSTANCE.getGST();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GSAImpl <em>GSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GSAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGSA()
		 * @generated
		 */
		EClass GSA = eINSTANCE.getGSA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GSVImpl <em>GSV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GSVImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGSV()
		 * @generated
		 */
		EClass GSV = eINSTANCE.getGSV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GTDImpl <em>GTD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GTDImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGTD()
		 * @generated
		 */
		EClass GTD = eINSTANCE.getGTD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.GXAImpl <em>GXA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.GXAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getGXA()
		 * @generated
		 */
		EClass GXA = eINSTANCE.getGXA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.HDGImpl <em>HDG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.HDGImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHDG()
		 * @generated
		 */
		EClass HDG = eINSTANCE.getHDG();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.HDMImpl <em>HDM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.HDMImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHDM()
		 * @generated
		 */
		EClass HDM = eINSTANCE.getHDM();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.HDTImpl <em>HDT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.HDTImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHDT()
		 * @generated
		 */
		EClass HDT = eINSTANCE.getHDT();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.HSCImpl <em>HSC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.HSCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getHSC()
		 * @generated
		 */
		EClass HSC = eINSTANCE.getHSC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.LCDImpl <em>LCD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.LCDImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getLCD()
		 * @generated
		 */
		EClass LCD = eINSTANCE.getLCD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.MSKImpl <em>MSK</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.MSKImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMSK()
		 * @generated
		 */
		EClass MSK = eINSTANCE.getMSK();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.MSSImpl <em>MSS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.MSSImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMSS()
		 * @generated
		 */
		EClass MSS = eINSTANCE.getMSS();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.MWDImpl <em>MWD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.MWDImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMWD()
		 * @generated
		 */
		EClass MWD = eINSTANCE.getMWD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.MTWImpl <em>MTW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.MTWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMTW()
		 * @generated
		 */
		EClass MTW = eINSTANCE.getMTW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.MWWImpl <em>MWW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.MWWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getMWW()
		 * @generated
		 */
		EClass MWW = eINSTANCE.getMWW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.OLNImpl <em>OLN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.OLNImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getOLN()
		 * @generated
		 */
		EClass OLN = eINSTANCE.getOLN();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.OSDImpl <em>OSD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.OSDImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getOSD()
		 * @generated
		 */
		EClass OSD = eINSTANCE.getOSD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ROOImpl <em>ROO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ROOImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getROO()
		 * @generated
		 */
		EClass ROO = eINSTANCE.getROO();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RMAImpl <em>RMA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RMAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRMA()
		 * @generated
		 */
		EClass RMA = eINSTANCE.getRMA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RMBImpl <em>RMB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RMBImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRMB()
		 * @generated
		 */
		EClass RMB = eINSTANCE.getRMB();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RMCImpl <em>RMC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RMCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRMC()
		 * @generated
		 */
		EClass RMC = eINSTANCE.getRMC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ROTImpl <em>ROT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ROTImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getROT()
		 * @generated
		 */
		EClass ROT = eINSTANCE.getROT();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RPMImpl <em>RPM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RPMImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRPM()
		 * @generated
		 */
		EClass RPM = eINSTANCE.getRPM();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RSAImpl <em>RSA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RSAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRSA()
		 * @generated
		 */
		EClass RSA = eINSTANCE.getRSA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RSDImpl <em>RSD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RSDImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRSD()
		 * @generated
		 */
		EClass RSD = eINSTANCE.getRSD();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.RTEImpl <em>RTE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.RTEImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getRTE()
		 * @generated
		 */
		EClass RTE = eINSTANCE.getRTE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.SFIImpl <em>SFI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.SFIImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getSFI()
		 * @generated
		 */
		EClass SFI = eINSTANCE.getSFI();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.STNImpl <em>STN</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.STNImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getSTN()
		 * @generated
		 */
		EClass STN = eINSTANCE.getSTN();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.TLLImpl <em>TLL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.TLLImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getTLL()
		 * @generated
		 */
		EClass TLL = eINSTANCE.getTLL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.TRFImpl <em>TRF</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.TRFImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getTRF()
		 * @generated
		 */
		EClass TRF = eINSTANCE.getTRF();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.TTMImpl <em>TTM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.TTMImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getTTM()
		 * @generated
		 */
		EClass TTM = eINSTANCE.getTTM();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VBWImpl <em>VBW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VBWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVBW()
		 * @generated
		 */
		EClass VBW = eINSTANCE.getVBW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VDRImpl <em>VDR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VDRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVDR()
		 * @generated
		 */
		EClass VDR = eINSTANCE.getVDR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VHWImpl <em>VHW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VHWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVHW()
		 * @generated
		 */
		EClass VHW = eINSTANCE.getVHW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VLWImpl <em>VLW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VLWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVLW()
		 * @generated
		 */
		EClass VLW = eINSTANCE.getVLW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VPWImpl <em>VPW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VPWImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVPW()
		 * @generated
		 */
		EClass VPW = eINSTANCE.getVPW();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VTGImpl <em>VTG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VTGImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVTG()
		 * @generated
		 */
		EClass VTG = eINSTANCE.getVTG();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.VWRImpl <em>VWR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.VWRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getVWR()
		 * @generated
		 */
		EClass VWR = eINSTANCE.getVWR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.WCVImpl <em>WCV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.WCVImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWCV()
		 * @generated
		 */
		EClass WCV = eINSTANCE.getWCV();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.WDCImpl <em>WDC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.WDCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWDC()
		 * @generated
		 */
		EClass WDC = eINSTANCE.getWDC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.WDRImpl <em>WDR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.WDRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWDR()
		 * @generated
		 */
		EClass WDR = eINSTANCE.getWDR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.WNCImpl <em>WNC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.WNCImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWNC()
		 * @generated
		 */
		EClass WNC = eINSTANCE.getWNC();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.WPLImpl <em>WPL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.WPLImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getWPL()
		 * @generated
		 */
		EClass WPL = eINSTANCE.getWPL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.XDRImpl <em>XDR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.XDRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getXDR()
		 * @generated
		 */
		EClass XDR = eINSTANCE.getXDR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.XTEImpl <em>XTE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.XTEImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getXTE()
		 * @generated
		 */
		EClass XTE = eINSTANCE.getXTE();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.XTRImpl <em>XTR</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.XTRImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getXTR()
		 * @generated
		 */
		EClass XTR = eINSTANCE.getXTR();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ZDAImpl <em>ZDA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ZDAImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZDA()
		 * @generated
		 */
		EClass ZDA = eINSTANCE.getZDA();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ZDLImpl <em>ZDL</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ZDLImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZDL()
		 * @generated
		 */
		EClass ZDL = eINSTANCE.getZDL();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ZFOImpl <em>ZFO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ZFOImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZFO()
		 * @generated
		 */
		EClass ZFO = eINSTANCE.getZFO();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.impl.ZTGImpl <em>ZTG</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.impl.ZTGImpl
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getZTG()
		 * @generated
		 */
		EClass ZTG = eINSTANCE.getZTG();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.gps.nmea1083.NmeaTalker <em>Nmea Talker</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.gps.nmea1083.NmeaTalker
		 * @see net.sf.smbt.gps.nmea1083.impl.Nmea1083PackageImpl#getNmeaTalker()
		 * @generated
		 */
		EEnum NMEA_TALKER = eINSTANCE.getNmeaTalker();

	}

} //Nmea1083Package
