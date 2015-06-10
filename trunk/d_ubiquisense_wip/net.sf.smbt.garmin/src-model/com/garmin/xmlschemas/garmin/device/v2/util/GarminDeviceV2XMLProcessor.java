/**
 */
package com.garmin.xmlschemas.garmin.device.v2.util;

import com.garmin.xmlschemas.garmin.device.v2.GarminDeviceV2Package;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GarminDeviceV2XMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GarminDeviceV2XMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		GarminDeviceV2Package.eINSTANCE.eClass();
	}
	
	/**
	 * Register for "*" and "xml" file extensions the GarminDeviceV2ResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new GarminDeviceV2ResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new GarminDeviceV2ResourceFactoryImpl());
		}
		return registrations;
	}

} //GarminDeviceV2XMLProcessor
