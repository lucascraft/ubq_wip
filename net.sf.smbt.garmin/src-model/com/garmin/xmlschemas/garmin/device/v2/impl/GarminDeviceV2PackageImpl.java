/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.AppProtocolT;
import com.garmin.xmlschemas.garmin.device.v2.DataTypeT;
import com.garmin.xmlschemas.garmin.device.v2.DeviceT;
import com.garmin.xmlschemas.garmin.device.v2.DocumentRoot;
import com.garmin.xmlschemas.garmin.device.v2.ExtensionsT;
import com.garmin.xmlschemas.garmin.device.v2.FileT;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Factory;
import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;
import com.garmin.xmlschemas.garmin.device.v2.GarminModeT;
import com.garmin.xmlschemas.garmin.device.v2.InputToUnitT;
import com.garmin.xmlschemas.garmin.device.v2.LocationT;
import com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT;
import com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT;
import com.garmin.xmlschemas.garmin.device.v2.ModelT;
import com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT;
import com.garmin.xmlschemas.garmin.device.v2.ProtocolT;
import com.garmin.xmlschemas.garmin.device.v2.ProtocolsT;
import com.garmin.xmlschemas.garmin.device.v2.SpecificationT;
import com.garmin.xmlschemas.garmin.device.v2.TransferDirectionT;
import com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT;
import com.garmin.xmlschemas.garmin.device.v2.UpdateFileT;
import com.garmin.xmlschemas.garmin.device.v2.VersionT;

import com.garmin.xmlschemas.garmin.device.v2.util.GarminDeviceV2Validator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GarminDeviceV2PackageImpl extends EPackageImpl implements GarminDeviceV2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appProtocolTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionsTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass garminModeTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputToUnitTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massStorageModeTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass memoryRegionTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputFromUnitTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolsTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unlockCodeTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateFileTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferDirectionTEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType codeTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonZeroTokenTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType partNumberTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType registrationCodeTEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType transferDirectionTObjectEDataType = null;

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
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GarminDeviceV2PackageImpl() {
		super(eNS_URI, GarminDeviceV2Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GarminDeviceV2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GarminDeviceV2Package init() {
		if (isInited) return (GarminDeviceV2Package)EPackage.Registry.INSTANCE.getEPackage(GarminDeviceV2Package.eNS_URI);

		// Obtain or create and register package
		GarminDeviceV2PackageImpl theGarminDeviceV2Package = (GarminDeviceV2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GarminDeviceV2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GarminDeviceV2PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGarminDeviceV2Package.createPackageContents();

		// Initialize created meta-data
		theGarminDeviceV2Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGarminDeviceV2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GarminDeviceV2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGarminDeviceV2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GarminDeviceV2Package.eNS_URI, theGarminDeviceV2Package);
		return theGarminDeviceV2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppProtocolT() {
		return appProtocolTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppProtocolT_DataType() {
		return (EAttribute)appProtocolTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppProtocolT_Id() {
		return (EAttribute)appProtocolTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypeT() {
		return dataTypeTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypeT_Name() {
		return (EAttribute)dataTypeTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeT_File() {
		return (EReference)dataTypeTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypeT_Extensions() {
		return (EReference)dataTypeTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceT() {
		return deviceTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceT_Model() {
		return (EReference)deviceTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceT_Id() {
		return (EAttribute)deviceTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceT_RegistrationCode() {
		return (EAttribute)deviceTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceT_Unlock() {
		return (EReference)deviceTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceT_DisplayName() {
		return (EAttribute)deviceTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceT_MassStorageMode() {
		return (EReference)deviceTEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceT_GarminMode() {
		return (EReference)deviceTEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceT_Extensions() {
		return (EReference)deviceTEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Device() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionsT() {
		return extensionsTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionsT_Any() {
		return (EAttribute)extensionsTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileT() {
		return fileTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileT_Specification() {
		return (EReference)fileTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileT_Location() {
		return (EReference)fileTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileT_TransferDirection() {
		return (EAttribute)fileTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGarminModeT() {
		return garminModeTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGarminModeT_Protocols() {
		return (EReference)garminModeTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGarminModeT_MemoryRegion() {
		return (EReference)garminModeTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGarminModeT_Extensions() {
		return (EReference)garminModeTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputToUnitT() {
		return inputToUnitTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputToUnitT_Specification() {
		return (EReference)inputToUnitTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputToUnitT_File() {
		return (EReference)inputToUnitTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocationT() {
		return locationTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationT_Path() {
		return (EAttribute)locationTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationT_BaseName() {
		return (EAttribute)locationTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocationT_FileExtension() {
		return (EAttribute)locationTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLocationT_Extensions() {
		return (EReference)locationTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMassStorageModeT() {
		return massStorageModeTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassStorageModeT_DataType() {
		return (EReference)massStorageModeTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassStorageModeT_UpdateFile() {
		return (EReference)massStorageModeTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMassStorageModeT_Extensions() {
		return (EReference)massStorageModeTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemoryRegionT() {
		return memoryRegionTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryRegionT_Id() {
		return (EAttribute)memoryRegionTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryRegionT_Version() {
		return (EReference)memoryRegionTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryRegionT_Description() {
		return (EAttribute)memoryRegionTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryRegionT_PartNumber() {
		return (EAttribute)memoryRegionTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryRegionT_IsErased() {
		return (EAttribute)memoryRegionTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryRegionT_IsRemoved() {
		return (EAttribute)memoryRegionTEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMemoryRegionT_IsUserUpdateable() {
		return (EAttribute)memoryRegionTEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemoryRegionT_Extensions() {
		return (EReference)memoryRegionTEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelT() {
		return modelTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelT_PartNumber() {
		return (EAttribute)modelTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelT_SoftwareVersion() {
		return (EAttribute)modelTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelT_Description() {
		return (EAttribute)modelTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelT_Extensions() {
		return (EReference)modelTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputFromUnitT() {
		return outputFromUnitTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputFromUnitT_Specification() {
		return (EReference)outputFromUnitTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputFromUnitT_File() {
		return (EReference)outputFromUnitTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolsT() {
		return protocolsTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolsT_Link() {
		return (EReference)protocolsTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolsT_Application() {
		return (EReference)protocolsTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolsT_Transport() {
		return (EReference)protocolsTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolT() {
		return protocolTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProtocolT_Id() {
		return (EAttribute)protocolTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecificationT() {
		return specificationTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationT_Identifier() {
		return (EAttribute)specificationTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecificationT_Documentation() {
		return (EAttribute)specificationTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnlockCodeT() {
		return unlockCodeTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnlockCodeT_Code() {
		return (EAttribute)unlockCodeTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnlockCodeT_Comment() {
		return (EAttribute)unlockCodeTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateFileT() {
		return updateFileTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateFileT_PartNumber() {
		return (EAttribute)updateFileTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateFileT_Version() {
		return (EReference)updateFileTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateFileT_Description() {
		return (EAttribute)updateFileTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateFileT_Path() {
		return (EAttribute)updateFileTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateFileT_FileName() {
		return (EAttribute)updateFileTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionT() {
		return versionTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionT_Major() {
		return (EAttribute)versionTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVersionT_Minor() {
		return (EAttribute)versionTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferDirectionT() {
		return transferDirectionTEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCodeT() {
		return codeTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonZeroTokenT() {
		return nonZeroTokenTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPartNumberT() {
		return partNumberTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRegistrationCodeT() {
		return registrationCodeTEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTransferDirectionTObject() {
		return transferDirectionTObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2Factory getGarminDeviceV2Factory() {
		return (GarminDeviceV2Factory)getEFactoryInstance();
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
		appProtocolTEClass = createEClass(APP_PROTOCOL_T);
		createEAttribute(appProtocolTEClass, APP_PROTOCOL_T__DATA_TYPE);
		createEAttribute(appProtocolTEClass, APP_PROTOCOL_T__ID);

		dataTypeTEClass = createEClass(DATA_TYPE_T);
		createEAttribute(dataTypeTEClass, DATA_TYPE_T__NAME);
		createEReference(dataTypeTEClass, DATA_TYPE_T__FILE);
		createEReference(dataTypeTEClass, DATA_TYPE_T__EXTENSIONS);

		deviceTEClass = createEClass(DEVICE_T);
		createEReference(deviceTEClass, DEVICE_T__MODEL);
		createEAttribute(deviceTEClass, DEVICE_T__ID);
		createEAttribute(deviceTEClass, DEVICE_T__REGISTRATION_CODE);
		createEReference(deviceTEClass, DEVICE_T__UNLOCK);
		createEAttribute(deviceTEClass, DEVICE_T__DISPLAY_NAME);
		createEReference(deviceTEClass, DEVICE_T__MASS_STORAGE_MODE);
		createEReference(deviceTEClass, DEVICE_T__GARMIN_MODE);
		createEReference(deviceTEClass, DEVICE_T__EXTENSIONS);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__DEVICE);

		extensionsTEClass = createEClass(EXTENSIONS_T);
		createEAttribute(extensionsTEClass, EXTENSIONS_T__ANY);

		fileTEClass = createEClass(FILE_T);
		createEReference(fileTEClass, FILE_T__SPECIFICATION);
		createEReference(fileTEClass, FILE_T__LOCATION);
		createEAttribute(fileTEClass, FILE_T__TRANSFER_DIRECTION);

		garminModeTEClass = createEClass(GARMIN_MODE_T);
		createEReference(garminModeTEClass, GARMIN_MODE_T__PROTOCOLS);
		createEReference(garminModeTEClass, GARMIN_MODE_T__MEMORY_REGION);
		createEReference(garminModeTEClass, GARMIN_MODE_T__EXTENSIONS);

		inputToUnitTEClass = createEClass(INPUT_TO_UNIT_T);
		createEReference(inputToUnitTEClass, INPUT_TO_UNIT_T__SPECIFICATION);
		createEReference(inputToUnitTEClass, INPUT_TO_UNIT_T__FILE);

		locationTEClass = createEClass(LOCATION_T);
		createEAttribute(locationTEClass, LOCATION_T__PATH);
		createEAttribute(locationTEClass, LOCATION_T__BASE_NAME);
		createEAttribute(locationTEClass, LOCATION_T__FILE_EXTENSION);
		createEReference(locationTEClass, LOCATION_T__EXTENSIONS);

		massStorageModeTEClass = createEClass(MASS_STORAGE_MODE_T);
		createEReference(massStorageModeTEClass, MASS_STORAGE_MODE_T__DATA_TYPE);
		createEReference(massStorageModeTEClass, MASS_STORAGE_MODE_T__UPDATE_FILE);
		createEReference(massStorageModeTEClass, MASS_STORAGE_MODE_T__EXTENSIONS);

		memoryRegionTEClass = createEClass(MEMORY_REGION_T);
		createEAttribute(memoryRegionTEClass, MEMORY_REGION_T__ID);
		createEReference(memoryRegionTEClass, MEMORY_REGION_T__VERSION);
		createEAttribute(memoryRegionTEClass, MEMORY_REGION_T__DESCRIPTION);
		createEAttribute(memoryRegionTEClass, MEMORY_REGION_T__PART_NUMBER);
		createEAttribute(memoryRegionTEClass, MEMORY_REGION_T__IS_ERASED);
		createEAttribute(memoryRegionTEClass, MEMORY_REGION_T__IS_REMOVED);
		createEAttribute(memoryRegionTEClass, MEMORY_REGION_T__IS_USER_UPDATEABLE);
		createEReference(memoryRegionTEClass, MEMORY_REGION_T__EXTENSIONS);

		modelTEClass = createEClass(MODEL_T);
		createEAttribute(modelTEClass, MODEL_T__PART_NUMBER);
		createEAttribute(modelTEClass, MODEL_T__SOFTWARE_VERSION);
		createEAttribute(modelTEClass, MODEL_T__DESCRIPTION);
		createEReference(modelTEClass, MODEL_T__EXTENSIONS);

		outputFromUnitTEClass = createEClass(OUTPUT_FROM_UNIT_T);
		createEReference(outputFromUnitTEClass, OUTPUT_FROM_UNIT_T__SPECIFICATION);
		createEReference(outputFromUnitTEClass, OUTPUT_FROM_UNIT_T__FILE);

		protocolsTEClass = createEClass(PROTOCOLS_T);
		createEReference(protocolsTEClass, PROTOCOLS_T__LINK);
		createEReference(protocolsTEClass, PROTOCOLS_T__APPLICATION);
		createEReference(protocolsTEClass, PROTOCOLS_T__TRANSPORT);

		protocolTEClass = createEClass(PROTOCOL_T);
		createEAttribute(protocolTEClass, PROTOCOL_T__ID);

		specificationTEClass = createEClass(SPECIFICATION_T);
		createEAttribute(specificationTEClass, SPECIFICATION_T__IDENTIFIER);
		createEAttribute(specificationTEClass, SPECIFICATION_T__DOCUMENTATION);

		unlockCodeTEClass = createEClass(UNLOCK_CODE_T);
		createEAttribute(unlockCodeTEClass, UNLOCK_CODE_T__CODE);
		createEAttribute(unlockCodeTEClass, UNLOCK_CODE_T__COMMENT);

		updateFileTEClass = createEClass(UPDATE_FILE_T);
		createEAttribute(updateFileTEClass, UPDATE_FILE_T__PART_NUMBER);
		createEReference(updateFileTEClass, UPDATE_FILE_T__VERSION);
		createEAttribute(updateFileTEClass, UPDATE_FILE_T__DESCRIPTION);
		createEAttribute(updateFileTEClass, UPDATE_FILE_T__PATH);
		createEAttribute(updateFileTEClass, UPDATE_FILE_T__FILE_NAME);

		versionTEClass = createEClass(VERSION_T);
		createEAttribute(versionTEClass, VERSION_T__MAJOR);
		createEAttribute(versionTEClass, VERSION_T__MINOR);

		// Create enums
		transferDirectionTEEnum = createEEnum(TRANSFER_DIRECTION_T);

		// Create data types
		codeTEDataType = createEDataType(CODE_T);
		nonZeroTokenTEDataType = createEDataType(NON_ZERO_TOKEN_T);
		partNumberTEDataType = createEDataType(PART_NUMBER_T);
		registrationCodeTEDataType = createEDataType(REGISTRATION_CODE_T);
		transferDirectionTObjectEDataType = createEDataType(TRANSFER_DIRECTION_TOBJECT);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(appProtocolTEClass, AppProtocolT.class, "AppProtocolT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppProtocolT_DataType(), theXMLTypePackage.getUnsignedShort(), "dataType", null, 0, -1, AppProtocolT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppProtocolT_Id(), theXMLTypePackage.getUnsignedShort(), "id", null, 1, 1, AppProtocolT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataTypeTEClass, DataTypeT.class, "DataTypeT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataTypeT_Name(), this.getNonZeroTokenT(), "name", null, 1, 1, DataTypeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeT_File(), this.getFileT(), null, "file", null, 1, -1, DataTypeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataTypeT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, DataTypeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTEClass, DeviceT.class, "DeviceT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceT_Model(), this.getModelT(), null, "model", null, 1, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceT_Id(), theXMLTypePackage.getUnsignedInt(), "id", null, 1, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceT_RegistrationCode(), this.getRegistrationCodeT(), "registrationCode", null, 0, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceT_Unlock(), this.getUnlockCodeT(), null, "unlock", null, 0, -1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeviceT_DisplayName(), theXMLTypePackage.getToken(), "displayName", null, 0, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceT_MassStorageMode(), this.getMassStorageModeT(), null, "massStorageMode", null, 0, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceT_GarminMode(), this.getGarminModeT(), null, "garminMode", null, 0, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, DeviceT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Device(), this.getDeviceT(), null, "device", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(extensionsTEClass, ExtensionsT.class, "ExtensionsT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtensionsT_Any(), ecorePackage.getEFeatureMapEntry(), "any", null, 0, -1, ExtensionsT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileTEClass, FileT.class, "FileT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileT_Specification(), this.getSpecificationT(), null, "specification", null, 1, 1, FileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileT_Location(), this.getLocationT(), null, "location", null, 1, 1, FileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFileT_TransferDirection(), this.getTransferDirectionT(), "transferDirection", null, 1, 1, FileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(garminModeTEClass, GarminModeT.class, "GarminModeT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGarminModeT_Protocols(), this.getProtocolsT(), null, "protocols", null, 1, 1, GarminModeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGarminModeT_MemoryRegion(), this.getMemoryRegionT(), null, "memoryRegion", null, 0, -1, GarminModeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGarminModeT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, GarminModeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputToUnitTEClass, InputToUnitT.class, "InputToUnitT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputToUnitT_Specification(), this.getSpecificationT(), null, "specification", null, 1, 1, InputToUnitT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputToUnitT_File(), this.getFileT(), null, "file", null, 1, 1, InputToUnitT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationTEClass, LocationT.class, "LocationT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLocationT_Path(), theXMLTypePackage.getAnyURI(), "path", null, 0, 1, LocationT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationT_BaseName(), theXMLTypePackage.getToken(), "baseName", null, 0, 1, LocationT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLocationT_FileExtension(), theXMLTypePackage.getToken(), "fileExtension", null, 1, 1, LocationT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLocationT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, LocationT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(massStorageModeTEClass, MassStorageModeT.class, "MassStorageModeT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMassStorageModeT_DataType(), this.getDataTypeT(), null, "dataType", null, 0, -1, MassStorageModeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMassStorageModeT_UpdateFile(), this.getUpdateFileT(), null, "updateFile", null, 1, -1, MassStorageModeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMassStorageModeT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, MassStorageModeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(memoryRegionTEClass, MemoryRegionT.class, "MemoryRegionT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMemoryRegionT_Id(), theXMLTypePackage.getUnsignedByte(), "id", null, 1, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryRegionT_Version(), this.getVersionT(), null, "version", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryRegionT_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryRegionT_PartNumber(), this.getPartNumberT(), "partNumber", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryRegionT_IsErased(), theXMLTypePackage.getBoolean(), "isErased", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryRegionT_IsRemoved(), theXMLTypePackage.getBoolean(), "isRemoved", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMemoryRegionT_IsUserUpdateable(), theXMLTypePackage.getBoolean(), "isUserUpdateable", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMemoryRegionT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, MemoryRegionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelTEClass, ModelT.class, "ModelT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelT_PartNumber(), this.getPartNumberT(), "partNumber", null, 1, 1, ModelT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelT_SoftwareVersion(), theXMLTypePackage.getUnsignedShort(), "softwareVersion", null, 1, 1, ModelT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelT_Description(), this.getNonZeroTokenT(), "description", null, 1, 1, ModelT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelT_Extensions(), this.getExtensionsT(), null, "extensions", null, 0, 1, ModelT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputFromUnitTEClass, OutputFromUnitT.class, "OutputFromUnitT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputFromUnitT_Specification(), this.getSpecificationT(), null, "specification", null, 1, 1, OutputFromUnitT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputFromUnitT_File(), this.getFileT(), null, "file", null, 1, 1, OutputFromUnitT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolsTEClass, ProtocolsT.class, "ProtocolsT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolsT_Link(), this.getProtocolT(), null, "link", null, 0, 1, ProtocolsT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolsT_Application(), this.getAppProtocolT(), null, "application", null, 1, -1, ProtocolsT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtocolsT_Transport(), this.getProtocolT(), null, "transport", null, 0, 1, ProtocolsT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolTEClass, ProtocolT.class, "ProtocolT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtocolT_Id(), theXMLTypePackage.getUnsignedShort(), "id", null, 1, 1, ProtocolT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationTEClass, SpecificationT.class, "SpecificationT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecificationT_Identifier(), this.getNonZeroTokenT(), "identifier", null, 0, 1, SpecificationT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecificationT_Documentation(), theXMLTypePackage.getAnyURI(), "documentation", null, 0, 1, SpecificationT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unlockCodeTEClass, UnlockCodeT.class, "UnlockCodeT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnlockCodeT_Code(), this.getCodeT(), "code", null, 1, 1, UnlockCodeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnlockCodeT_Comment(), theXMLTypePackage.getString(), "comment", null, 0, 1, UnlockCodeT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(updateFileTEClass, UpdateFileT.class, "UpdateFileT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUpdateFileT_PartNumber(), this.getPartNumberT(), "partNumber", null, 1, 1, UpdateFileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUpdateFileT_Version(), this.getVersionT(), null, "version", null, 1, 1, UpdateFileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateFileT_Description(), theXMLTypePackage.getString(), "description", null, 0, 1, UpdateFileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateFileT_Path(), theXMLTypePackage.getAnyURI(), "path", null, 0, 1, UpdateFileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUpdateFileT_FileName(), theXMLTypePackage.getToken(), "fileName", null, 0, 1, UpdateFileT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionTEClass, VersionT.class, "VersionT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionT_Major(), theXMLTypePackage.getUnsignedShort(), "major", null, 1, 1, VersionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersionT_Minor(), theXMLTypePackage.getUnsignedShort(), "minor", null, 1, 1, VersionT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transferDirectionTEEnum, TransferDirectionT.class, "TransferDirectionT");
		addEEnumLiteral(transferDirectionTEEnum, TransferDirectionT.INPUT_OUTPUT);
		addEEnumLiteral(transferDirectionTEEnum, TransferDirectionT.INPUT_TO_UNIT);
		addEEnumLiteral(transferDirectionTEEnum, TransferDirectionT.OUTPUT_FROM_UNIT);

		// Initialize data types
		initEDataType(codeTEDataType, String.class, "CodeT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nonZeroTokenTEDataType, String.class, "NonZeroTokenT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(partNumberTEDataType, String.class, "PartNumberT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(registrationCodeTEDataType, String.class, "RegistrationCodeT", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(transferDirectionTObjectEDataType, TransferDirectionT.class, "TransferDirectionTObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";			
		addAnnotation
		  (appProtocolTEClass, 
		   source, 
		   new String[] {
			 "name", "AppProtocol_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAppProtocolT_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DataType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAppProtocolT_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (codeTEDataType, 
		   source, 
		   new String[] {
			 "name", "Code_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "[\\p{Lu}\\d]{25}"
		   });		
		addAnnotation
		  (dataTypeTEClass, 
		   source, 
		   new String[] {
			 "name", "DataType_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDataTypeT_Name(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataTypeT_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "File",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDataTypeT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (deviceTEClass, 
		   source, 
		   new String[] {
			 "name", "Device_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getDeviceT_Model(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Model",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDeviceT_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceT_RegistrationCode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "RegistrationCode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceT_Unlock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Unlock",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getDeviceT_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DisplayName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceT_MassStorageMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MassStorageMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceT_GarminMode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "GarminMode",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDeviceT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Device(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Device",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (extensionsTEClass, 
		   source, 
		   new String[] {
			 "name", "Extensions_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getExtensionsT_Any(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "wildcards", "##other",
			 "name", ":0",
			 "processing", "lax"
		   });		
		addAnnotation
		  (fileTEClass, 
		   source, 
		   new String[] {
			 "name", "File_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFileT_Specification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Specification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileT_Location(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Location",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFileT_TransferDirection(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TransferDirection",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (garminModeTEClass, 
		   source, 
		   new String[] {
			 "name", "GarminMode_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getGarminModeT_Protocols(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Protocols",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGarminModeT_MemoryRegion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "MemoryRegion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getGarminModeT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (inputToUnitTEClass, 
		   source, 
		   new String[] {
			 "name", "InputToUnit_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInputToUnitT_Specification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Specification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInputToUnitT_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "File",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (locationTEClass, 
		   source, 
		   new String[] {
			 "name", "Location_t",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getLocationT_Path(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Path",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getLocationT_BaseName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BaseName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationT_FileExtension(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FileExtension",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getLocationT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (massStorageModeTEClass, 
		   source, 
		   new String[] {
			 "name", "MassStorageMode_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMassStorageModeT_DataType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "DataType",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMassStorageModeT_UpdateFile(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "UpdateFile",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMassStorageModeT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (memoryRegionTEClass, 
		   source, 
		   new String[] {
			 "name", "MemoryRegion_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMemoryRegionT_Id(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_PartNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_IsErased(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IsErased",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_IsRemoved(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IsRemoved",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_IsUserUpdateable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "IsUserUpdateable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getMemoryRegionT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (modelTEClass, 
		   source, 
		   new String[] {
			 "name", "Model_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getModelT_PartNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelT_SoftwareVersion(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "SoftwareVersion",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelT_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getModelT_Extensions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Extensions",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (nonZeroTokenTEDataType, 
		   source, 
		   new String[] {
			 "name", "NonZeroToken_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "minLength", "1"
		   });		
		addAnnotation
		  (outputFromUnitTEClass, 
		   source, 
		   new String[] {
			 "name", "OutputFromUnit_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOutputFromUnitT_Specification(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Specification",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOutputFromUnitT_File(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "File",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (partNumberTEDataType, 
		   source, 
		   new String[] {
			 "name", "PartNumber_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[\\p{Lu}\\d]{3}-[\\p{Lu}\\d]{5}-[\\p{Lu}\\d]{2}"
		   });			
		addAnnotation
		  (protocolsTEClass, 
		   source, 
		   new String[] {
			 "name", "Protocols_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getProtocolsT_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Link",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProtocolsT_Application(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Application",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getProtocolsT_Transport(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Transport",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (protocolTEClass, 
		   source, 
		   new String[] {
			 "name", "Protocol_t",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getProtocolT_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Id"
		   });		
		addAnnotation
		  (registrationCodeTEDataType, 
		   source, 
		   new String[] {
			 "name", "RegistrationCode_t",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#token",
			 "pattern", "[\\p{Lu}\\d]{7}"
		   });		
		addAnnotation
		  (specificationTEClass, 
		   source, 
		   new String[] {
			 "name", "Specification_t",
			 "kind", "elementOnly"
		   });			
		addAnnotation
		  (getSpecificationT_Identifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Identifier",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getSpecificationT_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Documentation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (transferDirectionTEEnum, 
		   source, 
		   new String[] {
			 "name", "TransferDirection_t"
		   });		
		addAnnotation
		  (transferDirectionTObjectEDataType, 
		   source, 
		   new String[] {
			 "name", "TransferDirection_t:Object",
			 "baseType", "TransferDirection_t"
		   });			
		addAnnotation
		  (unlockCodeTEClass, 
		   source, 
		   new String[] {
			 "name", "UnlockCode_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUnlockCodeT_Code(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Code",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUnlockCodeT_Comment(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Comment",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (updateFileTEClass, 
		   source, 
		   new String[] {
			 "name", "UpdateFile_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getUpdateFileT_PartNumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PartNumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUpdateFileT_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Version",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUpdateFileT_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getUpdateFileT_Path(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Path",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getUpdateFileT_FileName(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "FileName",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (versionTEClass, 
		   source, 
		   new String[] {
			 "name", "Version_t",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVersionT_Major(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Major",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getVersionT_Minor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Minor",
			 "namespace", "##targetNamespace"
		   });
	}

} //GarminDeviceV2PackageImpl
