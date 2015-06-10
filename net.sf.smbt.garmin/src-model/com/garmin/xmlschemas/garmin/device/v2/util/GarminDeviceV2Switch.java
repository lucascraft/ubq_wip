/**
 */
package com.garmin.xmlschemas.garmin.device.v2.util;

import com.garmin.xmlschemas.garmin.device.v2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package
 * @generated
 */
public class GarminDeviceV2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GarminDeviceV2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2Switch() {
		if (modelPackage == null) {
			modelPackage = GarminDeviceV2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GarminDeviceV2Package.APP_PROTOCOL_T: {
				AppProtocolT appProtocolT = (AppProtocolT)theEObject;
				T result = caseAppProtocolT(appProtocolT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.DATA_TYPE_T: {
				DataTypeT dataTypeT = (DataTypeT)theEObject;
				T result = caseDataTypeT(dataTypeT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.DEVICE_T: {
				DeviceT deviceT = (DeviceT)theEObject;
				T result = caseDeviceT(deviceT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.EXTENSIONS_T: {
				ExtensionsT extensionsT = (ExtensionsT)theEObject;
				T result = caseExtensionsT(extensionsT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.FILE_T: {
				FileT fileT = (FileT)theEObject;
				T result = caseFileT(fileT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.GARMIN_MODE_T: {
				GarminModeT garminModeT = (GarminModeT)theEObject;
				T result = caseGarminModeT(garminModeT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.INPUT_TO_UNIT_T: {
				InputToUnitT inputToUnitT = (InputToUnitT)theEObject;
				T result = caseInputToUnitT(inputToUnitT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.LOCATION_T: {
				LocationT locationT = (LocationT)theEObject;
				T result = caseLocationT(locationT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.MASS_STORAGE_MODE_T: {
				MassStorageModeT massStorageModeT = (MassStorageModeT)theEObject;
				T result = caseMassStorageModeT(massStorageModeT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.MEMORY_REGION_T: {
				MemoryRegionT memoryRegionT = (MemoryRegionT)theEObject;
				T result = caseMemoryRegionT(memoryRegionT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.MODEL_T: {
				ModelT modelT = (ModelT)theEObject;
				T result = caseModelT(modelT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.OUTPUT_FROM_UNIT_T: {
				OutputFromUnitT outputFromUnitT = (OutputFromUnitT)theEObject;
				T result = caseOutputFromUnitT(outputFromUnitT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.PROTOCOLS_T: {
				ProtocolsT protocolsT = (ProtocolsT)theEObject;
				T result = caseProtocolsT(protocolsT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.PROTOCOL_T: {
				ProtocolT protocolT = (ProtocolT)theEObject;
				T result = caseProtocolT(protocolT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.SPECIFICATION_T: {
				SpecificationT specificationT = (SpecificationT)theEObject;
				T result = caseSpecificationT(specificationT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.UNLOCK_CODE_T: {
				UnlockCodeT unlockCodeT = (UnlockCodeT)theEObject;
				T result = caseUnlockCodeT(unlockCodeT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.UPDATE_FILE_T: {
				UpdateFileT updateFileT = (UpdateFileT)theEObject;
				T result = caseUpdateFileT(updateFileT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GarminDeviceV2Package.VERSION_T: {
				VersionT versionT = (VersionT)theEObject;
				T result = caseVersionT(versionT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Protocol T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Protocol T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppProtocolT(AppProtocolT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataTypeT(DataTypeT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeviceT(DeviceT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensions T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensions T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionsT(ExtensionsT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileT(FileT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Garmin Mode T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Garmin Mode T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGarminModeT(GarminModeT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input To Unit T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input To Unit T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputToUnitT(InputToUnitT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocationT(LocationT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mass Storage Mode T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mass Storage Mode T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassStorageModeT(MassStorageModeT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memory Region T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memory Region T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryRegionT(MemoryRegionT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelT(ModelT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output From Unit T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output From Unit T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputFromUnitT(OutputFromUnitT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocols T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocols T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolsT(ProtocolsT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolT(ProtocolT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Specification T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Specification T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecificationT(SpecificationT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unlock Code T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unlock Code T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnlockCodeT(UnlockCodeT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Update File T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Update File T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpdateFileT(UpdateFileT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version T</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version T</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionT(VersionT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GarminDeviceV2Switch
