/**
 */
package com.garmin.xmlschemas.garmin.device.v2.util;

import com.garmin.xmlschemas.garmin.device.v2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package
 * @generated
 */
public class GarminDeviceV2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GarminDeviceV2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GarminDeviceV2Package.eINSTANCE;
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
	protected GarminDeviceV2Switch<Adapter> modelSwitch =
		new GarminDeviceV2Switch<Adapter>() {
			@Override
			public Adapter caseAppProtocolT(AppProtocolT object) {
				return createAppProtocolTAdapter();
			}
			@Override
			public Adapter caseDataTypeT(DataTypeT object) {
				return createDataTypeTAdapter();
			}
			@Override
			public Adapter caseDeviceT(DeviceT object) {
				return createDeviceTAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseExtensionsT(ExtensionsT object) {
				return createExtensionsTAdapter();
			}
			@Override
			public Adapter caseFileT(FileT object) {
				return createFileTAdapter();
			}
			@Override
			public Adapter caseGarminModeT(GarminModeT object) {
				return createGarminModeTAdapter();
			}
			@Override
			public Adapter caseInputToUnitT(InputToUnitT object) {
				return createInputToUnitTAdapter();
			}
			@Override
			public Adapter caseLocationT(LocationT object) {
				return createLocationTAdapter();
			}
			@Override
			public Adapter caseMassStorageModeT(MassStorageModeT object) {
				return createMassStorageModeTAdapter();
			}
			@Override
			public Adapter caseMemoryRegionT(MemoryRegionT object) {
				return createMemoryRegionTAdapter();
			}
			@Override
			public Adapter caseModelT(ModelT object) {
				return createModelTAdapter();
			}
			@Override
			public Adapter caseOutputFromUnitT(OutputFromUnitT object) {
				return createOutputFromUnitTAdapter();
			}
			@Override
			public Adapter caseProtocolsT(ProtocolsT object) {
				return createProtocolsTAdapter();
			}
			@Override
			public Adapter caseProtocolT(ProtocolT object) {
				return createProtocolTAdapter();
			}
			@Override
			public Adapter caseSpecificationT(SpecificationT object) {
				return createSpecificationTAdapter();
			}
			@Override
			public Adapter caseUnlockCodeT(UnlockCodeT object) {
				return createUnlockCodeTAdapter();
			}
			@Override
			public Adapter caseUpdateFileT(UpdateFileT object) {
				return createUpdateFileTAdapter();
			}
			@Override
			public Adapter caseVersionT(VersionT object) {
				return createVersionTAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.AppProtocolT <em>App Protocol T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.AppProtocolT
	 * @generated
	 */
	public Adapter createAppProtocolTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.DataTypeT <em>Data Type T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DataTypeT
	 * @generated
	 */
	public Adapter createDataTypeTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.DeviceT <em>Device T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DeviceT
	 * @generated
	 */
	public Adapter createDeviceTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.ExtensionsT <em>Extensions T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ExtensionsT
	 * @generated
	 */
	public Adapter createExtensionsTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.FileT <em>File T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.FileT
	 * @generated
	 */
	public Adapter createFileTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.GarminModeT <em>Garmin Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.GarminModeT
	 * @generated
	 */
	public Adapter createGarminModeTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.InputToUnitT <em>Input To Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.InputToUnitT
	 * @generated
	 */
	public Adapter createInputToUnitTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.LocationT <em>Location T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.LocationT
	 * @generated
	 */
	public Adapter createLocationTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT <em>Mass Storage Mode T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MassStorageModeT
	 * @generated
	 */
	public Adapter createMassStorageModeTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT <em>Memory Region T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.MemoryRegionT
	 * @generated
	 */
	public Adapter createMemoryRegionTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.ModelT <em>Model T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ModelT
	 * @generated
	 */
	public Adapter createModelTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT <em>Output From Unit T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.OutputFromUnitT
	 * @generated
	 */
	public Adapter createOutputFromUnitTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolsT <em>Protocols T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolsT
	 * @generated
	 */
	public Adapter createProtocolsTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.ProtocolT <em>Protocol T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.ProtocolT
	 * @generated
	 */
	public Adapter createProtocolTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.SpecificationT <em>Specification T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.SpecificationT
	 * @generated
	 */
	public Adapter createSpecificationTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT <em>Unlock Code T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UnlockCodeT
	 * @generated
	 */
	public Adapter createUnlockCodeTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.UpdateFileT <em>Update File T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.UpdateFileT
	 * @generated
	 */
	public Adapter createUpdateFileTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.garmin.xmlschemas.garmin.device.v2.VersionT <em>Version T</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.garmin.xmlschemas.garmin.device.v2.VersionT
	 * @generated
	 */
	public Adapter createVersionTAdapter() {
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

} //GarminDeviceV2AdapterFactory
