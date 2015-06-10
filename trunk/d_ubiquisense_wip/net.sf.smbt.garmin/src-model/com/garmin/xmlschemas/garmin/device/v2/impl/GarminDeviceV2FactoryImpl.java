/**
 */
package com.garmin.xmlschemas.garmin.device.v2.impl;

import com.garmin.xmlschemas.garmin.device.v2.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GarminDeviceV2FactoryImpl extends EFactoryImpl implements GarminDeviceV2Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GarminDeviceV2Factory init() {
		try {
			GarminDeviceV2Factory theGarminDeviceV2Factory = (GarminDeviceV2Factory)EPackage.Registry.INSTANCE.getEFactory("http://www.garmin.com/xmlschemas/GarminDevice/v2"); 
			if (theGarminDeviceV2Factory != null) {
				return theGarminDeviceV2Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GarminDeviceV2FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2FactoryImpl() {
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
			case GarminDeviceV2Package.APP_PROTOCOL_T: return createAppProtocolT();
			case GarminDeviceV2Package.DATA_TYPE_T: return createDataTypeT();
			case GarminDeviceV2Package.DEVICE_T: return createDeviceT();
			case GarminDeviceV2Package.DOCUMENT_ROOT: return createDocumentRoot();
			case GarminDeviceV2Package.EXTENSIONS_T: return createExtensionsT();
			case GarminDeviceV2Package.FILE_T: return createFileT();
			case GarminDeviceV2Package.GARMIN_MODE_T: return createGarminModeT();
			case GarminDeviceV2Package.INPUT_TO_UNIT_T: return createInputToUnitT();
			case GarminDeviceV2Package.LOCATION_T: return createLocationT();
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T: return createMassStorageModeT();
			case GarminDeviceV2Package.MEMORY_REGION_T: return createMemoryRegionT();
			case GarminDeviceV2Package.MODEL_T: return createModelT();
			case GarminDeviceV2Package.OUTPUT_FROM_UNIT_T: return createOutputFromUnitT();
			case GarminDeviceV2Package.PROTOCOLS_T: return createProtocolsT();
			case GarminDeviceV2Package.PROTOCOL_T: return createProtocolT();
			case GarminDeviceV2Package.SPECIFICATION_T: return createSpecificationT();
			case GarminDeviceV2Package.UNLOCK_CODE_T: return createUnlockCodeT();
			case GarminDeviceV2Package.UPDATE_FILE_T: return createUpdateFileT();
			case GarminDeviceV2Package.VERSION_T: return createVersionT();
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
			case GarminDeviceV2Package.TRANSFER_DIRECTION_T:
				return createTransferDirectionTFromString(eDataType, initialValue);
			case GarminDeviceV2Package.CODE_T:
				return createCodeTFromString(eDataType, initialValue);
			case GarminDeviceV2Package.NON_ZERO_TOKEN_T:
				return createNonZeroTokenTFromString(eDataType, initialValue);
			case GarminDeviceV2Package.PART_NUMBER_T:
				return createPartNumberTFromString(eDataType, initialValue);
			case GarminDeviceV2Package.REGISTRATION_CODE_T:
				return createRegistrationCodeTFromString(eDataType, initialValue);
			case GarminDeviceV2Package.TRANSFER_DIRECTION_TOBJECT:
				return createTransferDirectionTObjectFromString(eDataType, initialValue);
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
			case GarminDeviceV2Package.TRANSFER_DIRECTION_T:
				return convertTransferDirectionTToString(eDataType, instanceValue);
			case GarminDeviceV2Package.CODE_T:
				return convertCodeTToString(eDataType, instanceValue);
			case GarminDeviceV2Package.NON_ZERO_TOKEN_T:
				return convertNonZeroTokenTToString(eDataType, instanceValue);
			case GarminDeviceV2Package.PART_NUMBER_T:
				return convertPartNumberTToString(eDataType, instanceValue);
			case GarminDeviceV2Package.REGISTRATION_CODE_T:
				return convertRegistrationCodeTToString(eDataType, instanceValue);
			case GarminDeviceV2Package.TRANSFER_DIRECTION_TOBJECT:
				return convertTransferDirectionTObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppProtocolT createAppProtocolT() {
		AppProtocolTImpl appProtocolT = new AppProtocolTImpl();
		return appProtocolT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypeT createDataTypeT() {
		DataTypeTImpl dataTypeT = new DataTypeTImpl();
		return dataTypeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceT createDeviceT() {
		DeviceTImpl deviceT = new DeviceTImpl();
		return deviceT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionsT createExtensionsT() {
		ExtensionsTImpl extensionsT = new ExtensionsTImpl();
		return extensionsT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileT createFileT() {
		FileTImpl fileT = new FileTImpl();
		return fileT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminModeT createGarminModeT() {
		GarminModeTImpl garminModeT = new GarminModeTImpl();
		return garminModeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputToUnitT createInputToUnitT() {
		InputToUnitTImpl inputToUnitT = new InputToUnitTImpl();
		return inputToUnitT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationT createLocationT() {
		LocationTImpl locationT = new LocationTImpl();
		return locationT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MassStorageModeT createMassStorageModeT() {
		MassStorageModeTImpl massStorageModeT = new MassStorageModeTImpl();
		return massStorageModeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemoryRegionT createMemoryRegionT() {
		MemoryRegionTImpl memoryRegionT = new MemoryRegionTImpl();
		return memoryRegionT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelT createModelT() {
		ModelTImpl modelT = new ModelTImpl();
		return modelT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputFromUnitT createOutputFromUnitT() {
		OutputFromUnitTImpl outputFromUnitT = new OutputFromUnitTImpl();
		return outputFromUnitT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolsT createProtocolsT() {
		ProtocolsTImpl protocolsT = new ProtocolsTImpl();
		return protocolsT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolT createProtocolT() {
		ProtocolTImpl protocolT = new ProtocolTImpl();
		return protocolT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationT createSpecificationT() {
		SpecificationTImpl specificationT = new SpecificationTImpl();
		return specificationT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnlockCodeT createUnlockCodeT() {
		UnlockCodeTImpl unlockCodeT = new UnlockCodeTImpl();
		return unlockCodeT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateFileT createUpdateFileT() {
		UpdateFileTImpl updateFileT = new UpdateFileTImpl();
		return updateFileT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionT createVersionT() {
		VersionTImpl versionT = new VersionTImpl();
		return versionT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferDirectionT createTransferDirectionTFromString(EDataType eDataType, String initialValue) {
		TransferDirectionT result = TransferDirectionT.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferDirectionTToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCodeTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonZeroTokenTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonZeroTokenTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPartNumberTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPartNumberTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegistrationCodeTFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.TOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegistrationCodeTToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.TOKEN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferDirectionT createTransferDirectionTObjectFromString(EDataType eDataType, String initialValue) {
		return createTransferDirectionTFromString(GarminDeviceV2Package.Literals.TRANSFER_DIRECTION_T, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferDirectionTObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTransferDirectionTToString(GarminDeviceV2Package.Literals.TRANSFER_DIRECTION_T, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2Package getGarminDeviceV2Package() {
		return (GarminDeviceV2Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GarminDeviceV2Package getPackage() {
		return GarminDeviceV2Package.eINSTANCE;
	}

} //GarminDeviceV2FactoryImpl
