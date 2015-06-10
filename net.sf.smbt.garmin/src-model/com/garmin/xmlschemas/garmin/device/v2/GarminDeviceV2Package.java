/**
 */
package com.garmin.xmlschemas.garmin.device.v2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Factory
 * @model kind="package"
 * @generated
 */
public interface GarminDeviceV2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "v2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.garmin.com/xmlschemas/GarminDevice/v2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "v2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GarminDeviceV2Package eINSTANCE = com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl.init();

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.AppProtocolTImpl <em>App Protocol T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.AppProtocolTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getAppProtocolT()
	 * @generated
	 */
	int APP_PROTOCOL_T = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROTOCOL_T__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROTOCOL_T__ID = 1;

	/**
	 * The number of structural features of the '<em>App Protocol T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APP_PROTOCOL_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl <em>Data Type T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getDataTypeT()
	 * @generated
	 */
	int DATA_TYPE_T = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_T__NAME = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_T__FILE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_T__EXTENSIONS = 2;

	/**
	 * The number of structural features of the '<em>Data Type T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_T_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl <em>Device T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getDeviceT()
	 * @generated
	 */
	int DEVICE_T = 2;

	/**
	 * The feature id for the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__MODEL = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__ID = 1;

	/**
	 * The feature id for the '<em><b>Registration Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__REGISTRATION_CODE = 2;

	/**
	 * The feature id for the '<em><b>Unlock</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__UNLOCK = 3;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__DISPLAY_NAME = 4;

	/**
	 * The feature id for the '<em><b>Mass Storage Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__MASS_STORAGE_MODE = 5;

	/**
	 * The feature id for the '<em><b>Garmin Mode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__GARMIN_MODE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T__EXTENSIONS = 7;

	/**
	 * The number of structural features of the '<em>Device T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_T_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.DocumentRootImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Device</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEVICE = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ExtensionsTImpl <em>Extensions T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ExtensionsTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getExtensionsT()
	 * @generated
	 */
	int EXTENSIONS_T = 4;

	/**
	 * The feature id for the '<em><b>Any</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_T__ANY = 0;

	/**
	 * The number of structural features of the '<em>Extensions T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENSIONS_T_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl <em>File T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getFileT()
	 * @generated
	 */
	int FILE_T = 5;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_T__SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_T__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Transfer Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_T__TRANSFER_DIRECTION = 2;

	/**
	 * The number of structural features of the '<em>File T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_T_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl <em>Garmin Mode T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getGarminModeT()
	 * @generated
	 */
	int GARMIN_MODE_T = 6;

	/**
	 * The feature id for the '<em><b>Protocols</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARMIN_MODE_T__PROTOCOLS = 0;

	/**
	 * The feature id for the '<em><b>Memory Region</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARMIN_MODE_T__MEMORY_REGION = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARMIN_MODE_T__EXTENSIONS = 2;

	/**
	 * The number of structural features of the '<em>Garmin Mode T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GARMIN_MODE_T_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.InputToUnitTImpl <em>Input To Unit T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.InputToUnitTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getInputToUnitT()
	 * @generated
	 */
	int INPUT_TO_UNIT_T = 7;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TO_UNIT_T__SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TO_UNIT_T__FILE = 1;

	/**
	 * The number of structural features of the '<em>Input To Unit T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_TO_UNIT_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.LocationTImpl <em>Location T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.LocationTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getLocationT()
	 * @generated
	 */
	int LOCATION_T = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_T__PATH = 0;

	/**
	 * The feature id for the '<em><b>Base Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_T__BASE_NAME = 1;

	/**
	 * The feature id for the '<em><b>File Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_T__FILE_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_T__EXTENSIONS = 3;

	/**
	 * The number of structural features of the '<em>Location T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_T_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl <em>Mass Storage Mode T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getMassStorageModeT()
	 * @generated
	 */
	int MASS_STORAGE_MODE_T = 9;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_STORAGE_MODE_T__DATA_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Update File</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_STORAGE_MODE_T__UPDATE_FILE = 1;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_STORAGE_MODE_T__EXTENSIONS = 2;

	/**
	 * The number of structural features of the '<em>Mass Storage Mode T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MASS_STORAGE_MODE_T_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl <em>Memory Region T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getMemoryRegionT()
	 * @generated
	 */
	int MEMORY_REGION_T = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__ID = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__PART_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Is Erased</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__IS_ERASED = 4;

	/**
	 * The feature id for the '<em><b>Is Removed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__IS_REMOVED = 5;

	/**
	 * The feature id for the '<em><b>Is User Updateable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__IS_USER_UPDATEABLE = 6;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T__EXTENSIONS = 7;

	/**
	 * The number of structural features of the '<em>Memory Region T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_REGION_T_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ModelTImpl <em>Model T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ModelTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getModelT()
	 * @generated
	 */
	int MODEL_T = 11;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_T__PART_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Software Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_T__SOFTWARE_VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_T__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_T__EXTENSIONS = 3;

	/**
	 * The number of structural features of the '<em>Model T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_T_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.OutputFromUnitTImpl <em>Output From Unit T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.OutputFromUnitTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getOutputFromUnitT()
	 * @generated
	 */
	int OUTPUT_FROM_UNIT_T = 12;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FROM_UNIT_T__SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FROM_UNIT_T__FILE = 1;

	/**
	 * The number of structural features of the '<em>Output From Unit T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FROM_UNIT_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl <em>Protocols T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getProtocolsT()
	 * @generated
	 */
	int PROTOCOLS_T = 13;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOLS_T__LINK = 0;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOLS_T__APPLICATION = 1;

	/**
	 * The feature id for the '<em><b>Transport</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOLS_T__TRANSPORT = 2;

	/**
	 * The number of structural features of the '<em>Protocols T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOLS_T_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolTImpl <em>Protocol T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getProtocolT()
	 * @generated
	 */
	int PROTOCOL_T = 14;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_T__ID = 0;

	/**
	 * The number of structural features of the '<em>Protocol T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_T_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.SpecificationTImpl <em>Specification T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.SpecificationTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getSpecificationT()
	 * @generated
	 */
	int SPECIFICATION_T = 15;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_T__IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_T__DOCUMENTATION = 1;

	/**
	 * The number of structural features of the '<em>Specification T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.UnlockCodeTImpl <em>Unlock Code T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.UnlockCodeTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getUnlockCodeT()
	 * @generated
	 */
	int UNLOCK_CODE_T = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CODE_T__CODE = 0;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CODE_T__COMMENT = 1;

	/**
	 * The number of structural features of the '<em>Unlock Code T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNLOCK_CODE_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.UpdateFileTImpl <em>Update File T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.UpdateFileTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getUpdateFileT()
	 * @generated
	 */
	int UPDATE_FILE_T = 17;

	/**
	 * The feature id for the '<em><b>Part Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_T__PART_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_T__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_T__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_T__PATH = 3;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_T__FILE_NAME = 4;

	/**
	 * The number of structural features of the '<em>Update File T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPDATE_FILE_T_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.VersionTImpl <em>Version T</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.VersionTImpl
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getVersionT()
	 * @generated
	 */
	int VERSION_T = 18;

	/**
	 * The feature id for the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_T__MAJOR = 0;

	/**
	 * The feature id for the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_T__MINOR = 1;

	/**
	 * The number of structural features of the '<em>Version T</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSION_T_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT <em>Transfer Direction T</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getTransferDirectionT()
	 * @generated
	 */
	int TRANSFER_DIRECTION_T = 19;

	/**
	 * The meta object id for the '<em>Code T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getCodeT()
	 * @generated
	 */
	int CODE_T = 20;

	/**
	 * The meta object id for the '<em>Non Zero Token T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getNonZeroTokenT()
	 * @generated
	 */
	int NON_ZERO_TOKEN_T = 21;

	/**
	 * The meta object id for the '<em>Part Number T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getPartNumberT()
	 * @generated
	 */
	int PART_NUMBER_T = 22;

	/**
	 * The meta object id for the '<em>Registration Code T</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getRegistrationCodeT()
	 * @generated
	 */
	int REGISTRATION_CODE_T = 23;

	/**
	 * The meta object id for the '<em>Transfer Direction TObject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
	 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getTransferDirectionTObject()
	 * @generated
	 */
	int TRANSFER_DIRECTION_TOBJECT = 24;


	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.AppProtocolT <em>App Protocol T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Protocol T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.AppProtocolT
	 * @generated
	 */
	EClass getAppProtocolT();

	/**
	 * Returns the meta object for the attribute list '{@link com.garmin.xmlschemas.garmin.device.v2.AppProtocolT#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Type</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.AppProtocolT#getDataType()
	 * @see #getAppProtocolT()
	 * @generated
	 */
	EAttribute getAppProtocolT_DataType();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.AppProtocolT#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.AppProtocolT#getId()
	 * @see #getAppProtocolT()
	 * @generated
	 */
	EAttribute getAppProtocolT_Id();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT <em>Data Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DataTypeT
	 * @generated
	 */
	EClass getDataTypeT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getName()
	 * @see #getDataTypeT()
	 * @generated
	 */
	EAttribute getDataTypeT_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>File</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getFile()
	 * @see #getDataTypeT()
	 * @generated
	 */
	EReference getDataTypeT_File();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DataTypeT#getExtensions()
	 * @see #getDataTypeT()
	 * @generated
	 */
	EReference getDataTypeT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT <em>Device T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT
	 * @generated
	 */
	EClass getDeviceT();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Model</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getModel()
	 * @see #getDeviceT()
	 * @generated
	 */
	EReference getDeviceT_Model();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getId()
	 * @see #getDeviceT()
	 * @generated
	 */
	EAttribute getDeviceT_Id();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getRegistrationCode <em>Registration Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Registration Code</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getRegistrationCode()
	 * @see #getDeviceT()
	 * @generated
	 */
	EAttribute getDeviceT_RegistrationCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getUnlock <em>Unlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Unlock</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getUnlock()
	 * @see #getDeviceT()
	 * @generated
	 */
	EReference getDeviceT_Unlock();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getDisplayName()
	 * @see #getDeviceT()
	 * @generated
	 */
	EAttribute getDeviceT_DisplayName();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getMassStorageMode <em>Mass Storage Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mass Storage Mode</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getMassStorageMode()
	 * @see #getDeviceT()
	 * @generated
	 */
	EReference getDeviceT_MassStorageMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getGarminMode <em>Garmin Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Garmin Mode</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getGarminMode()
	 * @see #getDeviceT()
	 * @generated
	 */
	EReference getDeviceT_GarminMode();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT#getExtensions()
	 * @see #getDeviceT()
	 * @generated
	 */
	EReference getDeviceT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Device</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DocumentRoot#getDevice()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Device();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.ExtensionsT <em>Extensions T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extensions T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ExtensionsT
	 * @generated
	 */
	EClass getExtensionsT();

	/**
	 * Returns the meta object for the attribute list '{@link com.garmin.xmlschemas.garmin.device.v2.ExtensionsT#getAny <em>Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Any</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ExtensionsT#getAny()
	 * @see #getExtensionsT()
	 * @generated
	 */
	EAttribute getExtensionsT_Any();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.FileT <em>File T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.FileT
	 * @generated
	 */
	EClass getFileT();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.FileT#getSpecification()
	 * @see #getFileT()
	 * @generated
	 */
	EReference getFileT_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.FileT#getLocation()
	 * @see #getFileT()
	 * @generated
	 */
	EReference getFileT_Location();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.FileT#getTransferDirection <em>Transfer Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transfer Direction</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.FileT#getTransferDirection()
	 * @see #getFileT()
	 * @generated
	 */
	EAttribute getFileT_TransferDirection();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT <em>Garmin Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Garmin Mode T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminModeT
	 * @generated
	 */
	EClass getGarminModeT();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getProtocols <em>Protocols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Protocols</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getProtocols()
	 * @see #getGarminModeT()
	 * @generated
	 */
	EReference getGarminModeT_Protocols();

	/**
	 * Returns the meta object for the containment reference list '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getMemoryRegion <em>Memory Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memory Region</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getMemoryRegion()
	 * @see #getGarminModeT()
	 * @generated
	 */
	EReference getGarminModeT_MemoryRegion();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminModeT#getExtensions()
	 * @see #getGarminModeT()
	 * @generated
	 */
	EReference getGarminModeT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT <em>Input To Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input To Unit T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.InputToUnitT
	 * @generated
	 */
	EClass getInputToUnitT();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getSpecification()
	 * @see #getInputToUnitT()
	 * @generated
	 */
	EReference getInputToUnitT_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.InputToUnitT#getFile()
	 * @see #getInputToUnitT()
	 * @generated
	 */
	EReference getInputToUnitT_File();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT <em>Location T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.LocationT
	 * @generated
	 */
	EClass getLocationT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.LocationT#getPath()
	 * @see #getLocationT()
	 * @generated
	 */
	EAttribute getLocationT_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getBaseName <em>Base Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Name</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.LocationT#getBaseName()
	 * @see #getLocationT()
	 * @generated
	 */
	EAttribute getLocationT_BaseName();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getFileExtension <em>File Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Extension</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.LocationT#getFileExtension()
	 * @see #getLocationT()
	 * @generated
	 */
	EAttribute getLocationT_FileExtension();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.LocationT#getExtensions()
	 * @see #getLocationT()
	 * @generated
	 */
	EReference getLocationT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT <em>Mass Storage Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mass Storage Mode T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT
	 * @generated
	 */
	EClass getMassStorageModeT();

	/**
	 * Returns the meta object for the containment reference list '{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Type</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getDataType()
	 * @see #getMassStorageModeT()
	 * @generated
	 */
	EReference getMassStorageModeT_DataType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getUpdateFile <em>Update File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Update File</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getUpdateFile()
	 * @see #getMassStorageModeT()
	 * @generated
	 */
	EReference getMassStorageModeT_UpdateFile();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT#getExtensions()
	 * @see #getMassStorageModeT()
	 * @generated
	 */
	EReference getMassStorageModeT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT <em>Memory Region T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Region T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT
	 * @generated
	 */
	EClass getMemoryRegionT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getId()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EAttribute getMemoryRegionT_Id();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getVersion()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EReference getMemoryRegionT_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getDescription()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EAttribute getMemoryRegionT_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getPartNumber()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EAttribute getMemoryRegionT_PartNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsErased <em>Is Erased</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Erased</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsErased()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EAttribute getMemoryRegionT_IsErased();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsRemoved <em>Is Removed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Removed</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsRemoved()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EAttribute getMemoryRegionT_IsRemoved();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsUserUpdateable <em>Is User Updateable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is User Updateable</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#isIsUserUpdateable()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EAttribute getMemoryRegionT_IsUserUpdateable();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT#getExtensions()
	 * @see #getMemoryRegionT()
	 * @generated
	 */
	EReference getMemoryRegionT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT <em>Model T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ModelT
	 * @generated
	 */
	EClass getModelT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ModelT#getPartNumber()
	 * @see #getModelT()
	 * @generated
	 */
	EAttribute getModelT_PartNumber();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getSoftwareVersion <em>Software Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Software Version</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ModelT#getSoftwareVersion()
	 * @see #getModelT()
	 * @generated
	 */
	EAttribute getModelT_SoftwareVersion();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ModelT#getDescription()
	 * @see #getModelT()
	 * @generated
	 */
	EAttribute getModelT_Description();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT#getExtensions <em>Extensions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extensions</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ModelT#getExtensions()
	 * @see #getModelT()
	 * @generated
	 */
	EReference getModelT_Extensions();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT <em>Output From Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output From Unit T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT
	 * @generated
	 */
	EClass getOutputFromUnitT();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Specification</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT#getSpecification()
	 * @see #getOutputFromUnitT()
	 * @generated
	 */
	EReference getOutputFromUnitT_Specification();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT#getFile()
	 * @see #getOutputFromUnitT()
	 * @generated
	 */
	EReference getOutputFromUnitT_File();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT <em>Protocols T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocols T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolsT
	 * @generated
	 */
	EClass getProtocolsT();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getLink()
	 * @see #getProtocolsT()
	 * @generated
	 */
	EReference getProtocolsT_Link();

	/**
	 * Returns the meta object for the containment reference list '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getApplication()
	 * @see #getProtocolsT()
	 * @generated
	 */
	EReference getProtocolsT_Application();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getTransport <em>Transport</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transport</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolsT#getTransport()
	 * @see #getProtocolsT()
	 * @generated
	 */
	EReference getProtocolsT_Transport();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT <em>Protocol T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolT
	 * @generated
	 */
	EClass getProtocolT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolT#getId()
	 * @see #getProtocolT()
	 * @generated
	 */
	EAttribute getProtocolT_Id();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT <em>Specification T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.SpecificationT
	 * @generated
	 */
	EClass getSpecificationT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getIdentifier()
	 * @see #getSpecificationT()
	 * @generated
	 */
	EAttribute getSpecificationT_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.SpecificationT#getDocumentation()
	 * @see #getSpecificationT()
	 * @generated
	 */
	EAttribute getSpecificationT_Documentation();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT <em>Unlock Code T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unlock Code T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT
	 * @generated
	 */
	EClass getUnlockCodeT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getCode()
	 * @see #getUnlockCodeT()
	 * @generated
	 */
	EAttribute getUnlockCodeT_Code();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT#getComment()
	 * @see #getUnlockCodeT()
	 * @generated
	 */
	EAttribute getUnlockCodeT_Comment();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT <em>Update File T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Update File T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT
	 * @generated
	 */
	EClass getUpdateFileT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPartNumber <em>Part Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Part Number</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPartNumber()
	 * @see #getUpdateFileT()
	 * @generated
	 */
	EAttribute getUpdateFileT_PartNumber();

	/**
	 * Returns the meta object for the containment reference '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getVersion()
	 * @see #getUpdateFileT()
	 * @generated
	 */
	EReference getUpdateFileT_Version();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getDescription()
	 * @see #getUpdateFileT()
	 * @generated
	 */
	EAttribute getUpdateFileT_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getPath()
	 * @see #getUpdateFileT()
	 * @generated
	 */
	EAttribute getUpdateFileT_Path();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT#getFileName()
	 * @see #getUpdateFileT()
	 * @generated
	 */
	EAttribute getUpdateFileT_FileName();

	/**
	 * Returns the meta object for class '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT <em>Version T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Version T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.VersionT
	 * @generated
	 */
	EClass getVersionT();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMajor <em>Major</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Major</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.VersionT#getMajor()
	 * @see #getVersionT()
	 * @generated
	 */
	EAttribute getVersionT_Major();

	/**
	 * Returns the meta object for the attribute '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT#getMinor <em>Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minor</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.VersionT#getMinor()
	 * @see #getVersionT()
	 * @generated
	 */
	EAttribute getVersionT_Minor();

	/**
	 * Returns the meta object for enum '{@link com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT <em>Transfer Direction T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Direction T</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
	 * @generated
	 */
	EEnum getTransferDirectionT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Code T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Code T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Code_t' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[\\p{Lu}\\d]{25}'"
	 * @generated
	 */
	EDataType getCodeT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Non Zero Token T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Non Zero Token T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='NonZeroToken_t' baseType='http://www.eclipse.org/emf/2003/XMLType#token' minLength='1'"
	 * @generated
	 */
	EDataType getNonZeroTokenT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Part Number T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Part Number T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='PartNumber_t' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[\\p{Lu}\\d]{3}-[\\p{Lu}\\d]{5}-[\\p{Lu}\\d]{2}'"
	 * @generated
	 */
	EDataType getPartNumberT();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Registration Code T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Registration Code T</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='RegistrationCode_t' baseType='http://www.eclipse.org/emf/2003/XMLType#token' pattern='[\\p{Lu}\\d]{7}'"
	 * @generated
	 */
	EDataType getRegistrationCodeT();

	/**
	 * Returns the meta object for data type '{@link com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT <em>Transfer Direction TObject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Transfer Direction TObject</em>'.
	 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
	 * @model instanceClass="com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT"
	 *        extendedMetaData="name='TransferDirection_t:Object' baseType='TransferDirection_t'"
	 * @generated
	 */
	EDataType getTransferDirectionTObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GarminDeviceV2Factory getGarminDeviceV2Factory();

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
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.AppProtocolTImpl <em>App Protocol T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.AppProtocolTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getAppProtocolT()
		 * @generated
		 */
		EClass APP_PROTOCOL_T = eINSTANCE.getAppProtocolT();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROTOCOL_T__DATA_TYPE = eINSTANCE.getAppProtocolT_DataType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APP_PROTOCOL_T__ID = eINSTANCE.getAppProtocolT_Id();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl <em>Data Type T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.DataTypeTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getDataTypeT()
		 * @generated
		 */
		EClass DATA_TYPE_T = eINSTANCE.getDataTypeT();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_TYPE_T__NAME = eINSTANCE.getDataTypeT_Name();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_T__FILE = eINSTANCE.getDataTypeT_File();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_TYPE_T__EXTENSIONS = eINSTANCE.getDataTypeT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl <em>Device T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.DeviceTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getDeviceT()
		 * @generated
		 */
		EClass DEVICE_T = eINSTANCE.getDeviceT();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_T__MODEL = eINSTANCE.getDeviceT_Model();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_T__ID = eINSTANCE.getDeviceT_Id();

		/**
		 * The meta object literal for the '<em><b>Registration Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_T__REGISTRATION_CODE = eINSTANCE.getDeviceT_RegistrationCode();

		/**
		 * The meta object literal for the '<em><b>Unlock</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_T__UNLOCK = eINSTANCE.getDeviceT_Unlock();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEVICE_T__DISPLAY_NAME = eINSTANCE.getDeviceT_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Mass Storage Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_T__MASS_STORAGE_MODE = eINSTANCE.getDeviceT_MassStorageMode();

		/**
		 * The meta object literal for the '<em><b>Garmin Mode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_T__GARMIN_MODE = eINSTANCE.getDeviceT_GarminMode();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_T__EXTENSIONS = eINSTANCE.getDeviceT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.DocumentRootImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Device</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEVICE = eINSTANCE.getDocumentRoot_Device();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ExtensionsTImpl <em>Extensions T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ExtensionsTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getExtensionsT()
		 * @generated
		 */
		EClass EXTENSIONS_T = eINSTANCE.getExtensionsT();

		/**
		 * The meta object literal for the '<em><b>Any</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTENSIONS_T__ANY = eINSTANCE.getExtensionsT_Any();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl <em>File T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.FileTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getFileT()
		 * @generated
		 */
		EClass FILE_T = eINSTANCE.getFileT();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_T__SPECIFICATION = eINSTANCE.getFileT_Specification();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_T__LOCATION = eINSTANCE.getFileT_Location();

		/**
		 * The meta object literal for the '<em><b>Transfer Direction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_T__TRANSFER_DIRECTION = eINSTANCE.getFileT_TransferDirection();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl <em>Garmin Mode T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminModeTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getGarminModeT()
		 * @generated
		 */
		EClass GARMIN_MODE_T = eINSTANCE.getGarminModeT();

		/**
		 * The meta object literal for the '<em><b>Protocols</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARMIN_MODE_T__PROTOCOLS = eINSTANCE.getGarminModeT_Protocols();

		/**
		 * The meta object literal for the '<em><b>Memory Region</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARMIN_MODE_T__MEMORY_REGION = eINSTANCE.getGarminModeT_MemoryRegion();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GARMIN_MODE_T__EXTENSIONS = eINSTANCE.getGarminModeT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.InputToUnitTImpl <em>Input To Unit T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.InputToUnitTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getInputToUnitT()
		 * @generated
		 */
		EClass INPUT_TO_UNIT_T = eINSTANCE.getInputToUnitT();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_TO_UNIT_T__SPECIFICATION = eINSTANCE.getInputToUnitT_Specification();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_TO_UNIT_T__FILE = eINSTANCE.getInputToUnitT_File();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.LocationTImpl <em>Location T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.LocationTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getLocationT()
		 * @generated
		 */
		EClass LOCATION_T = eINSTANCE.getLocationT();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_T__PATH = eINSTANCE.getLocationT_Path();

		/**
		 * The meta object literal for the '<em><b>Base Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_T__BASE_NAME = eINSTANCE.getLocationT_BaseName();

		/**
		 * The meta object literal for the '<em><b>File Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION_T__FILE_EXTENSION = eINSTANCE.getLocationT_FileExtension();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION_T__EXTENSIONS = eINSTANCE.getLocationT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl <em>Mass Storage Mode T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.MassStorageModeTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getMassStorageModeT()
		 * @generated
		 */
		EClass MASS_STORAGE_MODE_T = eINSTANCE.getMassStorageModeT();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASS_STORAGE_MODE_T__DATA_TYPE = eINSTANCE.getMassStorageModeT_DataType();

		/**
		 * The meta object literal for the '<em><b>Update File</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASS_STORAGE_MODE_T__UPDATE_FILE = eINSTANCE.getMassStorageModeT_UpdateFile();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MASS_STORAGE_MODE_T__EXTENSIONS = eINSTANCE.getMassStorageModeT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl <em>Memory Region T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.MemoryRegionTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getMemoryRegionT()
		 * @generated
		 */
		EClass MEMORY_REGION_T = eINSTANCE.getMemoryRegionT();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REGION_T__ID = eINSTANCE.getMemoryRegionT_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_REGION_T__VERSION = eINSTANCE.getMemoryRegionT_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REGION_T__DESCRIPTION = eINSTANCE.getMemoryRegionT_Description();

		/**
		 * The meta object literal for the '<em><b>Part Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REGION_T__PART_NUMBER = eINSTANCE.getMemoryRegionT_PartNumber();

		/**
		 * The meta object literal for the '<em><b>Is Erased</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REGION_T__IS_ERASED = eINSTANCE.getMemoryRegionT_IsErased();

		/**
		 * The meta object literal for the '<em><b>Is Removed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REGION_T__IS_REMOVED = eINSTANCE.getMemoryRegionT_IsRemoved();

		/**
		 * The meta object literal for the '<em><b>Is User Updateable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_REGION_T__IS_USER_UPDATEABLE = eINSTANCE.getMemoryRegionT_IsUserUpdateable();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMORY_REGION_T__EXTENSIONS = eINSTANCE.getMemoryRegionT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ModelTImpl <em>Model T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ModelTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getModelT()
		 * @generated
		 */
		EClass MODEL_T = eINSTANCE.getModelT();

		/**
		 * The meta object literal for the '<em><b>Part Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_T__PART_NUMBER = eINSTANCE.getModelT_PartNumber();

		/**
		 * The meta object literal for the '<em><b>Software Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_T__SOFTWARE_VERSION = eINSTANCE.getModelT_SoftwareVersion();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_T__DESCRIPTION = eINSTANCE.getModelT_Description();

		/**
		 * The meta object literal for the '<em><b>Extensions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_T__EXTENSIONS = eINSTANCE.getModelT_Extensions();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.OutputFromUnitTImpl <em>Output From Unit T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.OutputFromUnitTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getOutputFromUnitT()
		 * @generated
		 */
		EClass OUTPUT_FROM_UNIT_T = eINSTANCE.getOutputFromUnitT();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FROM_UNIT_T__SPECIFICATION = eINSTANCE.getOutputFromUnitT_Specification();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_FROM_UNIT_T__FILE = eINSTANCE.getOutputFromUnitT_File();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl <em>Protocols T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolsTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getProtocolsT()
		 * @generated
		 */
		EClass PROTOCOLS_T = eINSTANCE.getProtocolsT();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOLS_T__LINK = eINSTANCE.getProtocolsT_Link();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOLS_T__APPLICATION = eINSTANCE.getProtocolsT_Application();

		/**
		 * The meta object literal for the '<em><b>Transport</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOLS_T__TRANSPORT = eINSTANCE.getProtocolsT_Transport();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolTImpl <em>Protocol T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.ProtocolTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getProtocolT()
		 * @generated
		 */
		EClass PROTOCOL_T = eINSTANCE.getProtocolT();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL_T__ID = eINSTANCE.getProtocolT_Id();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.SpecificationTImpl <em>Specification T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.SpecificationTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getSpecificationT()
		 * @generated
		 */
		EClass SPECIFICATION_T = eINSTANCE.getSpecificationT();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_T__IDENTIFIER = eINSTANCE.getSpecificationT_Identifier();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION_T__DOCUMENTATION = eINSTANCE.getSpecificationT_Documentation();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.UnlockCodeTImpl <em>Unlock Code T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.UnlockCodeTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getUnlockCodeT()
		 * @generated
		 */
		EClass UNLOCK_CODE_T = eINSTANCE.getUnlockCodeT();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLOCK_CODE_T__CODE = eINSTANCE.getUnlockCodeT_Code();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNLOCK_CODE_T__COMMENT = eINSTANCE.getUnlockCodeT_Comment();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.UpdateFileTImpl <em>Update File T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.UpdateFileTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getUpdateFileT()
		 * @generated
		 */
		EClass UPDATE_FILE_T = eINSTANCE.getUpdateFileT();

		/**
		 * The meta object literal for the '<em><b>Part Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FILE_T__PART_NUMBER = eINSTANCE.getUpdateFileT_PartNumber();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPDATE_FILE_T__VERSION = eINSTANCE.getUpdateFileT_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FILE_T__DESCRIPTION = eINSTANCE.getUpdateFileT_Description();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FILE_T__PATH = eINSTANCE.getUpdateFileT_Path();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPDATE_FILE_T__FILE_NAME = eINSTANCE.getUpdateFileT_FileName();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.impl.VersionTImpl <em>Version T</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.VersionTImpl
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getVersionT()
		 * @generated
		 */
		EClass VERSION_T = eINSTANCE.getVersionT();

		/**
		 * The meta object literal for the '<em><b>Major</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_T__MAJOR = eINSTANCE.getVersionT_Major();

		/**
		 * The meta object literal for the '<em><b>Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSION_T__MINOR = eINSTANCE.getVersionT_Minor();

		/**
		 * The meta object literal for the '{@link com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT <em>Transfer Direction T</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getTransferDirectionT()
		 * @generated
		 */
		EEnum TRANSFER_DIRECTION_T = eINSTANCE.getTransferDirectionT();

		/**
		 * The meta object literal for the '<em>Code T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getCodeT()
		 * @generated
		 */
		EDataType CODE_T = eINSTANCE.getCodeT();

		/**
		 * The meta object literal for the '<em>Non Zero Token T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getNonZeroTokenT()
		 * @generated
		 */
		EDataType NON_ZERO_TOKEN_T = eINSTANCE.getNonZeroTokenT();

		/**
		 * The meta object literal for the '<em>Part Number T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getPartNumberT()
		 * @generated
		 */
		EDataType PART_NUMBER_T = eINSTANCE.getPartNumberT();

		/**
		 * The meta object literal for the '<em>Registration Code T</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getRegistrationCodeT()
		 * @generated
		 */
		EDataType REGISTRATION_CODE_T = eINSTANCE.getRegistrationCodeT();

		/**
		 * The meta object literal for the '<em>Transfer Direction TObject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT
		 * @see com.garmin.xmlschemas.garmin.device.v2.impl.GarminDeviceV2PackageImpl#getTransferDirectionTObject()
		 * @generated
		 */
		EDataType TRANSFER_DIRECTION_TOBJECT = eINSTANCE.getTransferDirectionTObject();

	}

} //GarminDeviceV2Package
