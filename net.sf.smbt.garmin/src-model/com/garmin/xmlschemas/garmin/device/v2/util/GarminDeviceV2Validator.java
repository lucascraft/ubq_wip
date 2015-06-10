/**
 */
package com.garmin.xmlschemas.garmin.device.v2.util;

import com.garmin.xmlschemas.garmin.device.v2.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package
 * @generated
 */
public class GarminDeviceV2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GarminDeviceV2Validator INSTANCE = new GarminDeviceV2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.garmin.xmlschemas.garmin.device.v2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GarminDeviceV2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GarminDeviceV2Package.APP_PROTOCOL_T:
				return validateAppProtocolT((AppProtocolT)value, diagnostics, context);
			case GarminDeviceV2Package.DATA_TYPE_T:
				return validateDataTypeT((DataTypeT)value, diagnostics, context);
			case GarminDeviceV2Package.DEVICE_T:
				return validateDeviceT((DeviceT)value, diagnostics, context);
			case GarminDeviceV2Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case GarminDeviceV2Package.EXTENSIONS_T:
				return validateExtensionsT((ExtensionsT)value, diagnostics, context);
			case GarminDeviceV2Package.FILE_T:
				return validateFileT((FileT)value, diagnostics, context);
			case GarminDeviceV2Package.GARMIN_MODE_T:
				return validateGarminModeT((GarminModeT)value, diagnostics, context);
			case GarminDeviceV2Package.INPUT_TO_UNIT_T:
				return validateInputToUnitT((InputToUnitT)value, diagnostics, context);
			case GarminDeviceV2Package.LOCATION_T:
				return validateLocationT((LocationT)value, diagnostics, context);
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T:
				return validateMassStorageModeT((MassStorageModeT)value, diagnostics, context);
			case GarminDeviceV2Package.MEMORY_REGION_T:
				return validateMemoryRegionT((MemoryRegionT)value, diagnostics, context);
			case GarminDeviceV2Package.MODEL_T:
				return validateModelT((ModelT)value, diagnostics, context);
			case GarminDeviceV2Package.OUTPUT_FROM_UNIT_T:
				return validateOutputFromUnitT((OutputFromUnitT)value, diagnostics, context);
			case GarminDeviceV2Package.PROTOCOLS_T:
				return validateProtocolsT((ProtocolsT)value, diagnostics, context);
			case GarminDeviceV2Package.PROTOCOL_T:
				return validateProtocolT((ProtocolT)value, diagnostics, context);
			case GarminDeviceV2Package.SPECIFICATION_T:
				return validateSpecificationT((SpecificationT)value, diagnostics, context);
			case GarminDeviceV2Package.UNLOCK_CODE_T:
				return validateUnlockCodeT((UnlockCodeT)value, diagnostics, context);
			case GarminDeviceV2Package.UPDATE_FILE_T:
				return validateUpdateFileT((UpdateFileT)value, diagnostics, context);
			case GarminDeviceV2Package.VERSION_T:
				return validateVersionT((VersionT)value, diagnostics, context);
			case GarminDeviceV2Package.TRANSFER_DIRECTION_T:
				return validateTransferDirectionT((TransferDirectionT)value, diagnostics, context);
			case GarminDeviceV2Package.CODE_T:
				return validateCodeT((String)value, diagnostics, context);
			case GarminDeviceV2Package.NON_ZERO_TOKEN_T:
				return validateNonZeroTokenT((String)value, diagnostics, context);
			case GarminDeviceV2Package.PART_NUMBER_T:
				return validatePartNumberT((String)value, diagnostics, context);
			case GarminDeviceV2Package.REGISTRATION_CODE_T:
				return validateRegistrationCodeT((String)value, diagnostics, context);
			case GarminDeviceV2Package.TRANSFER_DIRECTION_TOBJECT:
				return validateTransferDirectionTObject((TransferDirectionT)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppProtocolT(AppProtocolT appProtocolT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appProtocolT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataTypeT(DataTypeT dataTypeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataTypeT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeviceT(DeviceT deviceT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(deviceT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionsT(ExtensionsT extensionsT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionsT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFileT(FileT fileT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fileT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGarminModeT(GarminModeT garminModeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(garminModeT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputToUnitT(InputToUnitT inputToUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputToUnitT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLocationT(LocationT locationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(locationT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMassStorageModeT(MassStorageModeT massStorageModeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(massStorageModeT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryRegionT(MemoryRegionT memoryRegionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(memoryRegionT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateModelT(ModelT modelT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(modelT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputFromUnitT(OutputFromUnitT outputFromUnitT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputFromUnitT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolsT(ProtocolsT protocolsT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolsT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolT(ProtocolT protocolT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecificationT(SpecificationT specificationT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specificationT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnlockCodeT(UnlockCodeT unlockCodeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unlockCodeT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUpdateFileT(UpdateFileT updateFileT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(updateFileT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionT(VersionT versionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(versionT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferDirectionT(TransferDirectionT transferDirectionT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeT(String codeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCodeT_Pattern(codeT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCodeT_Pattern
	 */
	public static final  PatternMatcher [][] CODE_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{Lu}\\d]{25}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Code T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeT_Pattern(String codeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GarminDeviceV2Package.Literals.CODE_T, codeT, CODE_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonZeroTokenT(String nonZeroTokenT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonZeroTokenT_MinLength(nonZeroTokenT, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Non Zero Token T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonZeroTokenT_MinLength(String nonZeroTokenT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = nonZeroTokenT.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(GarminDeviceV2Package.Literals.NON_ZERO_TOKEN_T, nonZeroTokenT, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartNumberT(String partNumberT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePartNumberT_Pattern(partNumberT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePartNumberT_Pattern
	 */
	public static final  PatternMatcher [][] PART_NUMBER_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{Lu}\\d]{3}-[\\p{Lu}\\d]{5}-[\\p{Lu}\\d]{2}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Part Number T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartNumberT_Pattern(String partNumberT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GarminDeviceV2Package.Literals.PART_NUMBER_T, partNumberT, PART_NUMBER_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrationCodeT(String registrationCodeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateRegistrationCodeT_Pattern(registrationCodeT, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateRegistrationCodeT_Pattern
	 */
	public static final  PatternMatcher [][] REGISTRATION_CODE_T__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[\\p{Lu}\\d]{7}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Registration Code T</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRegistrationCodeT_Pattern(String registrationCodeT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GarminDeviceV2Package.Literals.REGISTRATION_CODE_T, registrationCodeT, REGISTRATION_CODE_T__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransferDirectionTObject(TransferDirectionT transferDirectionTObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GarminDeviceV2Validator
