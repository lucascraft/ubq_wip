/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc.impl;

import net.sf.smbt.touchosc.touchosc.Control;
import net.sf.smbt.touchosc.touchosc.Layout;
import net.sf.smbt.touchosc.touchosc.Midi;
import net.sf.smbt.touchosc.touchosc.Tabpage;
import net.sf.smbt.touchosc.touchosc.TouchoscFactory;
import net.sf.smbt.touchosc.touchosc.TouchoscPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchoscPackageImpl extends EPackageImpl implements TouchoscPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass layoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass midiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabpageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEClass = null;

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
	 * @see net.sf.smbt.touchosc.touchosc.TouchoscPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TouchoscPackageImpl() {
		super(eNS_URI, TouchoscFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TouchoscPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TouchoscPackage init() {
		if (isInited) return (TouchoscPackage)EPackage.Registry.INSTANCE.getEPackage(TouchoscPackage.eNS_URI);

		// Obtain or create and register package
		TouchoscPackageImpl theTouchoscPackage = (TouchoscPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TouchoscPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TouchoscPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTouchoscPackage.createPackageContents();

		// Initialize created meta-data
		theTouchoscPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTouchoscPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TouchoscPackage.eNS_URI, theTouchoscPackage);
		return theTouchoscPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControl() {
		return controlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControl_Midi() {
		return (EReference)controlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Background() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Centered() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Color() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_H() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Inverted() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_InvertedX() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_InvertedY() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_LocalOff() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Name() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Number() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_NumberX() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_NumberY() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_OscCs() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Outline() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Response() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Scalef() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Scalet() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Seconds() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Size() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Text() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Type() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_W() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_X() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getControl_Y() {
		return (EAttribute)controlEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLayout() {
		return layoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLayout_Tabpage() {
		return (EReference)layoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Mode() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Orientation() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLayout_Version() {
		return (EAttribute)layoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMidi() {
		return midiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidi_Channel() {
		return (EAttribute)midiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidi_Data1() {
		return (EAttribute)midiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidi_Data2f() {
		return (EAttribute)midiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidi_Data2t() {
		return (EAttribute)midiEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidi_Type() {
		return (EAttribute)midiEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMidi_Var() {
		return (EAttribute)midiEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabpage() {
		return tabpageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTabpage_Control() {
		return (EReference)tabpageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTabpage_Name() {
		return (EAttribute)tabpageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTOP() {
		return topEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTOP_Layout() {
		return (EReference)topEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscFactory getTouchoscFactory() {
		return (TouchoscFactory)getEFactoryInstance();
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
		controlEClass = createEClass(CONTROL);
		createEReference(controlEClass, CONTROL__MIDI);
		createEAttribute(controlEClass, CONTROL__BACKGROUND);
		createEAttribute(controlEClass, CONTROL__CENTERED);
		createEAttribute(controlEClass, CONTROL__COLOR);
		createEAttribute(controlEClass, CONTROL__H);
		createEAttribute(controlEClass, CONTROL__INVERTED);
		createEAttribute(controlEClass, CONTROL__INVERTED_X);
		createEAttribute(controlEClass, CONTROL__INVERTED_Y);
		createEAttribute(controlEClass, CONTROL__LOCAL_OFF);
		createEAttribute(controlEClass, CONTROL__NAME);
		createEAttribute(controlEClass, CONTROL__NUMBER);
		createEAttribute(controlEClass, CONTROL__NUMBER_X);
		createEAttribute(controlEClass, CONTROL__NUMBER_Y);
		createEAttribute(controlEClass, CONTROL__OSC_CS);
		createEAttribute(controlEClass, CONTROL__OUTLINE);
		createEAttribute(controlEClass, CONTROL__RESPONSE);
		createEAttribute(controlEClass, CONTROL__SCALEF);
		createEAttribute(controlEClass, CONTROL__SCALET);
		createEAttribute(controlEClass, CONTROL__SECONDS);
		createEAttribute(controlEClass, CONTROL__SIZE);
		createEAttribute(controlEClass, CONTROL__TEXT);
		createEAttribute(controlEClass, CONTROL__TYPE);
		createEAttribute(controlEClass, CONTROL__W);
		createEAttribute(controlEClass, CONTROL__X);
		createEAttribute(controlEClass, CONTROL__Y);

		layoutEClass = createEClass(LAYOUT);
		createEReference(layoutEClass, LAYOUT__TABPAGE);
		createEAttribute(layoutEClass, LAYOUT__MODE);
		createEAttribute(layoutEClass, LAYOUT__ORIENTATION);
		createEAttribute(layoutEClass, LAYOUT__VERSION);

		midiEClass = createEClass(MIDI);
		createEAttribute(midiEClass, MIDI__CHANNEL);
		createEAttribute(midiEClass, MIDI__DATA1);
		createEAttribute(midiEClass, MIDI__DATA2F);
		createEAttribute(midiEClass, MIDI__DATA2T);
		createEAttribute(midiEClass, MIDI__TYPE);
		createEAttribute(midiEClass, MIDI__VAR);

		tabpageEClass = createEClass(TABPAGE);
		createEReference(tabpageEClass, TABPAGE__CONTROL);
		createEAttribute(tabpageEClass, TABPAGE__NAME);

		topEClass = createEClass(TOP);
		createEReference(topEClass, TOP__LAYOUT);
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
		initEClass(controlEClass, Control.class, "Control", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControl_Midi(), this.getMidi(), null, "midi", null, 1, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Background(), theXMLTypePackage.getString(), "background", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Centered(), theXMLTypePackage.getString(), "centered", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Color(), theXMLTypePackage.getString(), "color", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_H(), theXMLTypePackage.getString(), "h", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Inverted(), theXMLTypePackage.getString(), "inverted", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_InvertedX(), theXMLTypePackage.getString(), "invertedX", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_InvertedY(), theXMLTypePackage.getString(), "invertedY", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_LocalOff(), theXMLTypePackage.getString(), "localOff", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Number(), theXMLTypePackage.getString(), "number", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_NumberX(), theXMLTypePackage.getString(), "numberX", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_NumberY(), theXMLTypePackage.getString(), "numberY", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_OscCs(), theXMLTypePackage.getString(), "oscCs", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Outline(), theXMLTypePackage.getString(), "outline", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Response(), theXMLTypePackage.getString(), "response", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Scalef(), theXMLTypePackage.getString(), "scalef", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Scalet(), theXMLTypePackage.getString(), "scalet", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Seconds(), theXMLTypePackage.getString(), "seconds", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Size(), theXMLTypePackage.getString(), "size", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_W(), theXMLTypePackage.getString(), "w", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_X(), theXMLTypePackage.getString(), "x", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getControl_Y(), theXMLTypePackage.getString(), "y", null, 0, 1, Control.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(layoutEClass, Layout.class, "Layout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLayout_Tabpage(), this.getTabpage(), null, "tabpage", null, 1, -1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Mode(), theXMLTypePackage.getString(), "mode", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Orientation(), theXMLTypePackage.getString(), "orientation", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLayout_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, Layout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(midiEClass, Midi.class, "Midi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMidi_Channel(), theXMLTypePackage.getString(), "channel", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidi_Data1(), theXMLTypePackage.getString(), "data1", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidi_Data2f(), theXMLTypePackage.getString(), "data2f", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidi_Data2t(), theXMLTypePackage.getString(), "data2t", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidi_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMidi_Var(), theXMLTypePackage.getString(), "var", null, 0, 1, Midi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabpageEClass, Tabpage.class, "Tabpage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTabpage_Control(), this.getControl(), null, "control", null, 1, -1, Tabpage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTabpage_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Tabpage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topEClass, net.sf.smbt.touchosc.touchosc.TOP.class, "TOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOP_Layout(), this.getLayout(), null, "layout", null, 1, 1, net.sf.smbt.touchosc.touchosc.TOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (controlEClass, 
		   source, 
		   new String[] {
			 "name", "control",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getControl_Midi(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "midi"
		   });		
		addAnnotation
		  (getControl_Background(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "background"
		   });		
		addAnnotation
		  (getControl_Centered(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "centered"
		   });		
		addAnnotation
		  (getControl_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color"
		   });		
		addAnnotation
		  (getControl_H(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "h"
		   });		
		addAnnotation
		  (getControl_Inverted(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inverted"
		   });		
		addAnnotation
		  (getControl_InvertedX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inverted_x"
		   });		
		addAnnotation
		  (getControl_InvertedY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inverted_y"
		   });		
		addAnnotation
		  (getControl_LocalOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "local_off"
		   });		
		addAnnotation
		  (getControl_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getControl_Number(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "number"
		   });		
		addAnnotation
		  (getControl_NumberX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "number_x"
		   });		
		addAnnotation
		  (getControl_NumberY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "number_y"
		   });		
		addAnnotation
		  (getControl_OscCs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_cs"
		   });		
		addAnnotation
		  (getControl_Outline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outline"
		   });		
		addAnnotation
		  (getControl_Response(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "response"
		   });		
		addAnnotation
		  (getControl_Scalef(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scalef"
		   });		
		addAnnotation
		  (getControl_Scalet(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scalet"
		   });		
		addAnnotation
		  (getControl_Seconds(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "seconds"
		   });		
		addAnnotation
		  (getControl_Size(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "size"
		   });		
		addAnnotation
		  (getControl_Text(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text"
		   });		
		addAnnotation
		  (getControl_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getControl_W(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "w"
		   });		
		addAnnotation
		  (getControl_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x"
		   });		
		addAnnotation
		  (getControl_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y"
		   });		
		addAnnotation
		  (layoutEClass, 
		   source, 
		   new String[] {
			 "name", "layout",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLayout_Tabpage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tabpage"
		   });		
		addAnnotation
		  (getLayout_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });		
		addAnnotation
		  (getLayout_Orientation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "orientation"
		   });		
		addAnnotation
		  (getLayout_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (midiEClass, 
		   source, 
		   new String[] {
			 "name", "midi",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getMidi_Channel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "channel"
		   });		
		addAnnotation
		  (getMidi_Data1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data1"
		   });		
		addAnnotation
		  (getMidi_Data2f(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data2f"
		   });		
		addAnnotation
		  (getMidi_Data2t(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "data2t"
		   });		
		addAnnotation
		  (getMidi_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type"
		   });		
		addAnnotation
		  (getMidi_Var(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "var"
		   });		
		addAnnotation
		  (tabpageEClass, 
		   source, 
		   new String[] {
			 "name", "tabpage",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTabpage_Control(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "control"
		   });		
		addAnnotation
		  (getTabpage_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (topEClass, 
		   source, 
		   new String[] {
			 "name", "TOP",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTOP_Layout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "layout"
		   });
	}

} //TouchoscPackageImpl
