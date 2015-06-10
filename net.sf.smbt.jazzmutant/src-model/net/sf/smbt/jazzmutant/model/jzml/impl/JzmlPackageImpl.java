/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import net.sf.smbt.jazzmutant.model.jzml.JzmlFactory;
import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;

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
public class JzmlPackageImpl extends EPackageImpl implements JzmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jzmlEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass topEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;
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
	 * @see net.sf.smbt.jazzmutant.model.jzml.JzmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JzmlPackageImpl() {
		super(eNS_URI, JzmlFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JzmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JzmlPackage init() {
		if (isInited) return (JzmlPackage)EPackage.Registry.INSTANCE.getEPackage(JzmlPackage.eNS_URI);

		// Obtain or create and register package
		JzmlPackageImpl theJzmlPackage = (JzmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JzmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JzmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJzmlPackage.createPackageContents();

		// Initialize created meta-data
		theJzmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJzmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JzmlPackage.eNS_URI, theJzmlPackage);
		return theJzmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJZML() {
		return jzmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZML_PROJECT() {
		return (EReference)jzmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJZML_WINDOW() {
		return (EReference)jzmlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPARAM() {
		return paramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Name() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Value() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Send() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_OscTarget() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_OscTrigger() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_OscMessage() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_OscScale() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_MidiTarget() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_MidiTrigger() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_MidiMessage() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_MidiScale() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_KbmouseTarget() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_KbmouseTrigger() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_KbmouseMessage() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_KbmouseScale() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Color() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Label() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Tabbar() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Meta() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPARAM_Id() {
		return (EAttribute)paramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPROJECT() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Height() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Version() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_OscTarget() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_MidiTarget() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_KbmouseTarget() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Startpage() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Welcometext() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Width() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Title() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPROJECT_Id() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(1);
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
	public EReference getTOP_JZML() {
		return (EReference)topEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVARIABLE() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Send() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_OscTarget() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_OscTrigger() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_OscMessage() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_OscScale() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_MidiTarget() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_MidiTrigger() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_MidiMessage() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_MidiScale() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_KbmouseTarget() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_KbmouseTrigger() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_KbmouseMessage() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_KbmouseScale() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Color() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Label() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Tabbar() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Meta() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVARIABLE_Id() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWINDOW() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Class() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Text() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Unit() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Value() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_X() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Y() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Z() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Width() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Height() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Hold() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_HoldX() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_HoldY() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Horizontal() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_State() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Sustain() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Group() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Font() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Send() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Speed() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_OscTarget() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Outline() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Paint() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Pan() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_MidiTarget() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Mode() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Multicolor() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Multilabel() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_KbmouseTarget() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Color() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Column() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Constrained() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Content() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Label() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_LabelOff() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_LabelOn() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Light() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Tabbar() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Target() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Tension() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Meta() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Coordinates() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Cursor() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Decay() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Display() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Edit() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Editable() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Ephemere() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Free() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Friction() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Gradient() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Grid() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_GridSteps() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Nbr() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Physic() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Pinch() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Polyphony() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Precision() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Radio() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Release() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Rest() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Row() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Scale() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Zoom() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWINDOW_WINDOW() {
		return (EReference)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWINDOW_PARAM() {
		return (EReference)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWINDOW_VARIABLE() {
		return (EReference)windowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Acceleration() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Angle() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Attack() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Attraction() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_AttractionX() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_AttractionY() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Axis() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Balls() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Bargraph() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Behavior() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Bipolar() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Bitmap() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Boundaries() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Capture() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWINDOW_Id() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JzmlFactory getJzmlFactory() {
		return (JzmlFactory)getEFactoryInstance();
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
		jzmlEClass = createEClass(JZML);
		createEReference(jzmlEClass, JZML__PROJECT);
		createEReference(jzmlEClass, JZML__WINDOW);

		paramEClass = createEClass(PARAM);
		createEAttribute(paramEClass, PARAM__COLOR);
		createEAttribute(paramEClass, PARAM__ID);
		createEAttribute(paramEClass, PARAM__KBMOUSE_MESSAGE);
		createEAttribute(paramEClass, PARAM__KBMOUSE_SCALE);
		createEAttribute(paramEClass, PARAM__KBMOUSE_TARGET);
		createEAttribute(paramEClass, PARAM__KBMOUSE_TRIGGER);
		createEAttribute(paramEClass, PARAM__LABEL);
		createEAttribute(paramEClass, PARAM__META);
		createEAttribute(paramEClass, PARAM__MIDI_MESSAGE);
		createEAttribute(paramEClass, PARAM__MIDI_SCALE);
		createEAttribute(paramEClass, PARAM__MIDI_TARGET);
		createEAttribute(paramEClass, PARAM__MIDI_TRIGGER);
		createEAttribute(paramEClass, PARAM__NAME);
		createEAttribute(paramEClass, PARAM__OSC_MESSAGE);
		createEAttribute(paramEClass, PARAM__OSC_SCALE);
		createEAttribute(paramEClass, PARAM__OSC_TARGET);
		createEAttribute(paramEClass, PARAM__OSC_TRIGGER);
		createEAttribute(paramEClass, PARAM__SEND);
		createEAttribute(paramEClass, PARAM__TABBAR);
		createEAttribute(paramEClass, PARAM__VALUE);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__HEIGHT);
		createEAttribute(projectEClass, PROJECT__ID);
		createEAttribute(projectEClass, PROJECT__KBMOUSE_TARGET);
		createEAttribute(projectEClass, PROJECT__MIDI_TARGET);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__OSC_TARGET);
		createEAttribute(projectEClass, PROJECT__STARTPAGE);
		createEAttribute(projectEClass, PROJECT__TITLE);
		createEAttribute(projectEClass, PROJECT__VERSION);
		createEAttribute(projectEClass, PROJECT__WELCOMETEXT);
		createEAttribute(projectEClass, PROJECT__WIDTH);

		topEClass = createEClass(TOP);
		createEReference(topEClass, TOP__JZML);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__COLOR);
		createEAttribute(variableEClass, VARIABLE__ID);
		createEAttribute(variableEClass, VARIABLE__KBMOUSE_MESSAGE);
		createEAttribute(variableEClass, VARIABLE__KBMOUSE_SCALE);
		createEAttribute(variableEClass, VARIABLE__KBMOUSE_TARGET);
		createEAttribute(variableEClass, VARIABLE__KBMOUSE_TRIGGER);
		createEAttribute(variableEClass, VARIABLE__LABEL);
		createEAttribute(variableEClass, VARIABLE__META);
		createEAttribute(variableEClass, VARIABLE__MIDI_MESSAGE);
		createEAttribute(variableEClass, VARIABLE__MIDI_SCALE);
		createEAttribute(variableEClass, VARIABLE__MIDI_TARGET);
		createEAttribute(variableEClass, VARIABLE__MIDI_TRIGGER);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__OSC_MESSAGE);
		createEAttribute(variableEClass, VARIABLE__OSC_SCALE);
		createEAttribute(variableEClass, VARIABLE__OSC_TARGET);
		createEAttribute(variableEClass, VARIABLE__OSC_TRIGGER);
		createEAttribute(variableEClass, VARIABLE__SEND);
		createEAttribute(variableEClass, VARIABLE__TABBAR);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		windowEClass = createEClass(WINDOW);
		createEReference(windowEClass, WINDOW__WINDOW);
		createEReference(windowEClass, WINDOW__PARAM);
		createEReference(windowEClass, WINDOW__VARIABLE);
		createEAttribute(windowEClass, WINDOW__ACCELERATION);
		createEAttribute(windowEClass, WINDOW__ANGLE);
		createEAttribute(windowEClass, WINDOW__ATTACK);
		createEAttribute(windowEClass, WINDOW__ATTRACTION);
		createEAttribute(windowEClass, WINDOW__ATTRACTION_X);
		createEAttribute(windowEClass, WINDOW__ATTRACTION_Y);
		createEAttribute(windowEClass, WINDOW__AXIS);
		createEAttribute(windowEClass, WINDOW__BALLS);
		createEAttribute(windowEClass, WINDOW__BARGRAPH);
		createEAttribute(windowEClass, WINDOW__BEHAVIOR);
		createEAttribute(windowEClass, WINDOW__BIPOLAR);
		createEAttribute(windowEClass, WINDOW__BITMAP);
		createEAttribute(windowEClass, WINDOW__BOUNDARIES);
		createEAttribute(windowEClass, WINDOW__CAPTURE);
		createEAttribute(windowEClass, WINDOW__CLASS);
		createEAttribute(windowEClass, WINDOW__COLOR);
		createEAttribute(windowEClass, WINDOW__COLUMN);
		createEAttribute(windowEClass, WINDOW__CONSTRAINED);
		createEAttribute(windowEClass, WINDOW__CONTENT);
		createEAttribute(windowEClass, WINDOW__COORDINATES);
		createEAttribute(windowEClass, WINDOW__CURSOR);
		createEAttribute(windowEClass, WINDOW__DECAY);
		createEAttribute(windowEClass, WINDOW__DISPLAY);
		createEAttribute(windowEClass, WINDOW__EDIT);
		createEAttribute(windowEClass, WINDOW__EDITABLE);
		createEAttribute(windowEClass, WINDOW__EPHEMERE);
		createEAttribute(windowEClass, WINDOW__FONT);
		createEAttribute(windowEClass, WINDOW__FREE);
		createEAttribute(windowEClass, WINDOW__FRICTION);
		createEAttribute(windowEClass, WINDOW__GRADIENT);
		createEAttribute(windowEClass, WINDOW__GRID);
		createEAttribute(windowEClass, WINDOW__GRID_STEPS);
		createEAttribute(windowEClass, WINDOW__GROUP);
		createEAttribute(windowEClass, WINDOW__HEIGHT);
		createEAttribute(windowEClass, WINDOW__HOLD);
		createEAttribute(windowEClass, WINDOW__HOLD_X);
		createEAttribute(windowEClass, WINDOW__HOLD_Y);
		createEAttribute(windowEClass, WINDOW__HORIZONTAL);
		createEAttribute(windowEClass, WINDOW__ID);
		createEAttribute(windowEClass, WINDOW__KBMOUSE_TARGET);
		createEAttribute(windowEClass, WINDOW__LABEL);
		createEAttribute(windowEClass, WINDOW__LABEL_OFF);
		createEAttribute(windowEClass, WINDOW__LABEL_ON);
		createEAttribute(windowEClass, WINDOW__LIGHT);
		createEAttribute(windowEClass, WINDOW__META);
		createEAttribute(windowEClass, WINDOW__MIDI_TARGET);
		createEAttribute(windowEClass, WINDOW__MODE);
		createEAttribute(windowEClass, WINDOW__MULTICOLOR);
		createEAttribute(windowEClass, WINDOW__MULTILABEL);
		createEAttribute(windowEClass, WINDOW__NBR);
		createEAttribute(windowEClass, WINDOW__OSC_TARGET);
		createEAttribute(windowEClass, WINDOW__OUTLINE);
		createEAttribute(windowEClass, WINDOW__PAINT);
		createEAttribute(windowEClass, WINDOW__PAN);
		createEAttribute(windowEClass, WINDOW__PHYSIC);
		createEAttribute(windowEClass, WINDOW__PINCH);
		createEAttribute(windowEClass, WINDOW__POLYPHONY);
		createEAttribute(windowEClass, WINDOW__PRECISION);
		createEAttribute(windowEClass, WINDOW__RADIO);
		createEAttribute(windowEClass, WINDOW__RELEASE);
		createEAttribute(windowEClass, WINDOW__REST);
		createEAttribute(windowEClass, WINDOW__ROW);
		createEAttribute(windowEClass, WINDOW__SCALE);
		createEAttribute(windowEClass, WINDOW__SEND);
		createEAttribute(windowEClass, WINDOW__SPEED);
		createEAttribute(windowEClass, WINDOW__STATE);
		createEAttribute(windowEClass, WINDOW__SUSTAIN);
		createEAttribute(windowEClass, WINDOW__TABBAR);
		createEAttribute(windowEClass, WINDOW__TARGET);
		createEAttribute(windowEClass, WINDOW__TENSION);
		createEAttribute(windowEClass, WINDOW__TEXT);
		createEAttribute(windowEClass, WINDOW__UNIT);
		createEAttribute(windowEClass, WINDOW__VALUE);
		createEAttribute(windowEClass, WINDOW__WIDTH);
		createEAttribute(windowEClass, WINDOW__X);
		createEAttribute(windowEClass, WINDOW__Y);
		createEAttribute(windowEClass, WINDOW__Z);
		createEAttribute(windowEClass, WINDOW__ZOOM);
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
		initEClass(jzmlEClass, net.sf.smbt.jazzmutant.model.jzml.JZML.class, "JZML", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJZML_PROJECT(), this.getPROJECT(), null, "pROJECT", null, 1, 1, net.sf.smbt.jazzmutant.model.jzml.JZML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJZML_WINDOW(), this.getWINDOW(), null, "wINDOW", null, 1, -1, net.sf.smbt.jazzmutant.model.jzml.JZML.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramEClass, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, "PARAM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPARAM_Color(), theXMLTypePackage.getString(), "color", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_KbmouseMessage(), theXMLTypePackage.getString(), "kbmouseMessage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_KbmouseScale(), theXMLTypePackage.getString(), "kbmouseScale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_KbmouseTarget(), theXMLTypePackage.getString(), "kbmouseTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_KbmouseTrigger(), theXMLTypePackage.getString(), "kbmouseTrigger", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Meta(), theXMLTypePackage.getString(), "meta", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_MidiMessage(), theXMLTypePackage.getString(), "midiMessage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_MidiScale(), theXMLTypePackage.getString(), "midiScale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_MidiTarget(), theXMLTypePackage.getString(), "midiTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_MidiTrigger(), theXMLTypePackage.getString(), "midiTrigger", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_OscMessage(), theXMLTypePackage.getString(), "oscMessage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_OscScale(), theXMLTypePackage.getString(), "oscScale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_OscTarget(), theXMLTypePackage.getString(), "oscTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_OscTrigger(), theXMLTypePackage.getString(), "oscTrigger", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Send(), theXMLTypePackage.getString(), "send", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Tabbar(), theXMLTypePackage.getString(), "tabbar", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPARAM_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PARAM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, "PROJECT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPROJECT_Height(), theXMLTypePackage.getString(), "height", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_KbmouseTarget(), theXMLTypePackage.getIDREF(), "kbmouseTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_MidiTarget(), theXMLTypePackage.getIDREF(), "midiTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_OscTarget(), theXMLTypePackage.getIDREF(), "oscTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Startpage(), theXMLTypePackage.getIDREF(), "startpage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Title(), theXMLTypePackage.getString(), "title", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Welcometext(), theXMLTypePackage.getString(), "welcometext", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPROJECT_Width(), theXMLTypePackage.getString(), "width", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.PROJECT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(topEClass, net.sf.smbt.jazzmutant.model.jzml.TOP.class, "TOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOP_JZML(), this.getJZML(), null, "jZML", null, 1, 1, net.sf.smbt.jazzmutant.model.jzml.TOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, "VARIABLE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVARIABLE_Color(), theXMLTypePackage.getString(), "color", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_KbmouseMessage(), theXMLTypePackage.getString(), "kbmouseMessage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_KbmouseScale(), theXMLTypePackage.getString(), "kbmouseScale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_KbmouseTarget(), theXMLTypePackage.getString(), "kbmouseTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_KbmouseTrigger(), theXMLTypePackage.getString(), "kbmouseTrigger", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Meta(), theXMLTypePackage.getString(), "meta", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_MidiMessage(), theXMLTypePackage.getString(), "midiMessage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_MidiScale(), theXMLTypePackage.getString(), "midiScale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_MidiTarget(), theXMLTypePackage.getString(), "midiTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_MidiTrigger(), theXMLTypePackage.getString(), "midiTrigger", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_OscMessage(), theXMLTypePackage.getString(), "oscMessage", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_OscScale(), theXMLTypePackage.getString(), "oscScale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_OscTarget(), theXMLTypePackage.getString(), "oscTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_OscTrigger(), theXMLTypePackage.getString(), "oscTrigger", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Send(), theXMLTypePackage.getString(), "send", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Tabbar(), theXMLTypePackage.getString(), "tabbar", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVARIABLE_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.VARIABLE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, "WINDOW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWINDOW_WINDOW(), this.getWINDOW(), null, "wINDOW", null, 1, -1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWINDOW_PARAM(), this.getPARAM(), null, "pARAM", null, 1, -1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWINDOW_VARIABLE(), this.getVARIABLE(), null, "vARIABLE", null, 1, -1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Acceleration(), theXMLTypePackage.getString(), "acceleration", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Angle(), theXMLTypePackage.getString(), "angle", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Attack(), theXMLTypePackage.getString(), "attack", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Attraction(), theXMLTypePackage.getString(), "attraction", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_AttractionX(), theXMLTypePackage.getString(), "attractionX", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_AttractionY(), theXMLTypePackage.getString(), "attractionY", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Axis(), theXMLTypePackage.getString(), "axis", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Balls(), theXMLTypePackage.getString(), "balls", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Bargraph(), theXMLTypePackage.getString(), "bargraph", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Behavior(), theXMLTypePackage.getString(), "behavior", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Bipolar(), theXMLTypePackage.getString(), "bipolar", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Bitmap(), theXMLTypePackage.getString(), "bitmap", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Boundaries(), theXMLTypePackage.getString(), "boundaries", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Capture(), theXMLTypePackage.getString(), "capture", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Class(), theXMLTypePackage.getString(), "class", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Color(), theXMLTypePackage.getString(), "color", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Column(), theXMLTypePackage.getString(), "column", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Constrained(), theXMLTypePackage.getString(), "constrained", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Content(), theXMLTypePackage.getString(), "content", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Coordinates(), theXMLTypePackage.getString(), "coordinates", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Cursor(), theXMLTypePackage.getString(), "cursor", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Decay(), theXMLTypePackage.getString(), "decay", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Display(), theXMLTypePackage.getString(), "display", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Edit(), theXMLTypePackage.getString(), "edit", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Editable(), theXMLTypePackage.getString(), "editable", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Ephemere(), theXMLTypePackage.getString(), "ephemere", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Font(), theXMLTypePackage.getString(), "font", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Free(), theXMLTypePackage.getString(), "free", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Friction(), theXMLTypePackage.getString(), "friction", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Gradient(), theXMLTypePackage.getString(), "gradient", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Grid(), theXMLTypePackage.getString(), "grid", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_GridSteps(), theXMLTypePackage.getString(), "gridSteps", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Group(), theXMLTypePackage.getString(), "group", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Height(), theXMLTypePackage.getString(), "height", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Hold(), theXMLTypePackage.getString(), "hold", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_HoldX(), theXMLTypePackage.getString(), "holdX", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_HoldY(), theXMLTypePackage.getString(), "holdY", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Horizontal(), theXMLTypePackage.getString(), "horizontal", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Id(), theXMLTypePackage.getID(), "id", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_KbmouseTarget(), theXMLTypePackage.getString(), "kbmouseTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Label(), theXMLTypePackage.getString(), "label", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_LabelOff(), theXMLTypePackage.getString(), "labelOff", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_LabelOn(), theXMLTypePackage.getString(), "labelOn", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Light(), theXMLTypePackage.getString(), "light", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Meta(), theXMLTypePackage.getString(), "meta", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_MidiTarget(), theXMLTypePackage.getString(), "midiTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Mode(), theXMLTypePackage.getString(), "mode", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Multicolor(), theXMLTypePackage.getString(), "multicolor", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Multilabel(), theXMLTypePackage.getString(), "multilabel", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Nbr(), theXMLTypePackage.getString(), "nbr", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_OscTarget(), theXMLTypePackage.getString(), "oscTarget", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Outline(), theXMLTypePackage.getString(), "outline", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Paint(), theXMLTypePackage.getString(), "paint", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Pan(), theXMLTypePackage.getString(), "pan", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Physic(), theXMLTypePackage.getString(), "physic", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Pinch(), theXMLTypePackage.getString(), "pinch", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Polyphony(), theXMLTypePackage.getString(), "polyphony", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Precision(), theXMLTypePackage.getString(), "precision", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Radio(), theXMLTypePackage.getString(), "radio", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Release(), theXMLTypePackage.getString(), "release", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Rest(), theXMLTypePackage.getString(), "rest", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Row(), theXMLTypePackage.getString(), "row", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Scale(), theXMLTypePackage.getString(), "scale", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Send(), theXMLTypePackage.getString(), "send", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Speed(), theXMLTypePackage.getString(), "speed", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_State(), theXMLTypePackage.getString(), "state", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Sustain(), theXMLTypePackage.getString(), "sustain", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Tabbar(), theXMLTypePackage.getString(), "tabbar", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Target(), theXMLTypePackage.getString(), "target", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Tension(), theXMLTypePackage.getString(), "tension", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Text(), theXMLTypePackage.getString(), "text", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Unit(), theXMLTypePackage.getString(), "unit", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Width(), theXMLTypePackage.getString(), "width", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_X(), theXMLTypePackage.getString(), "x", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Y(), theXMLTypePackage.getString(), "y", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Z(), theXMLTypePackage.getString(), "z", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWINDOW_Zoom(), theXMLTypePackage.getString(), "zoom", null, 0, 1, net.sf.smbt.jazzmutant.model.jzml.WINDOW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (jzmlEClass, 
		   source, 
		   new String[] {
			 "name", "JZML",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getJZML_PROJECT(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PROJECT"
		   });		
		addAnnotation
		  (getJZML_WINDOW(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WINDOW"
		   });		
		addAnnotation
		  (paramEClass, 
		   source, 
		   new String[] {
			 "name", "PARAM",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPARAM_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color"
		   });		
		addAnnotation
		  (getPARAM_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPARAM_KbmouseMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_message"
		   });		
		addAnnotation
		  (getPARAM_KbmouseScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_scale"
		   });		
		addAnnotation
		  (getPARAM_KbmouseTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_target"
		   });		
		addAnnotation
		  (getPARAM_KbmouseTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_trigger"
		   });		
		addAnnotation
		  (getPARAM_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label"
		   });		
		addAnnotation
		  (getPARAM_Meta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "meta"
		   });		
		addAnnotation
		  (getPARAM_MidiMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_message"
		   });		
		addAnnotation
		  (getPARAM_MidiScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_scale"
		   });		
		addAnnotation
		  (getPARAM_MidiTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_target"
		   });		
		addAnnotation
		  (getPARAM_MidiTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_trigger"
		   });		
		addAnnotation
		  (getPARAM_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPARAM_OscMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_message"
		   });		
		addAnnotation
		  (getPARAM_OscScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_scale"
		   });		
		addAnnotation
		  (getPARAM_OscTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_target"
		   });		
		addAnnotation
		  (getPARAM_OscTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_trigger"
		   });		
		addAnnotation
		  (getPARAM_Send(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "send"
		   });		
		addAnnotation
		  (getPARAM_Tabbar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tabbar"
		   });		
		addAnnotation
		  (getPARAM_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (projectEClass, 
		   source, 
		   new String[] {
			 "name", "PROJECT",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPROJECT_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height"
		   });		
		addAnnotation
		  (getPROJECT_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getPROJECT_KbmouseTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_target"
		   });		
		addAnnotation
		  (getPROJECT_MidiTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_target"
		   });		
		addAnnotation
		  (getPROJECT_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getPROJECT_OscTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_target"
		   });		
		addAnnotation
		  (getPROJECT_Startpage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "startpage"
		   });		
		addAnnotation
		  (getPROJECT_Title(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "title"
		   });		
		addAnnotation
		  (getPROJECT_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (getPROJECT_Welcometext(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "welcometext"
		   });		
		addAnnotation
		  (getPROJECT_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (topEClass, 
		   source, 
		   new String[] {
			 "name", "TOP",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTOP_JZML(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "JZML"
		   });		
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "name", "VARIABLE",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getVARIABLE_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color"
		   });		
		addAnnotation
		  (getVARIABLE_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getVARIABLE_KbmouseMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_message"
		   });		
		addAnnotation
		  (getVARIABLE_KbmouseScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_scale"
		   });		
		addAnnotation
		  (getVARIABLE_KbmouseTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_target"
		   });		
		addAnnotation
		  (getVARIABLE_KbmouseTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_trigger"
		   });		
		addAnnotation
		  (getVARIABLE_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label"
		   });		
		addAnnotation
		  (getVARIABLE_Meta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "meta"
		   });		
		addAnnotation
		  (getVARIABLE_MidiMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_message"
		   });		
		addAnnotation
		  (getVARIABLE_MidiScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_scale"
		   });		
		addAnnotation
		  (getVARIABLE_MidiTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_target"
		   });		
		addAnnotation
		  (getVARIABLE_MidiTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_trigger"
		   });		
		addAnnotation
		  (getVARIABLE_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });		
		addAnnotation
		  (getVARIABLE_OscMessage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_message"
		   });		
		addAnnotation
		  (getVARIABLE_OscScale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_scale"
		   });		
		addAnnotation
		  (getVARIABLE_OscTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_target"
		   });		
		addAnnotation
		  (getVARIABLE_OscTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_trigger"
		   });		
		addAnnotation
		  (getVARIABLE_Send(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "send"
		   });		
		addAnnotation
		  (getVARIABLE_Tabbar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tabbar"
		   });		
		addAnnotation
		  (getVARIABLE_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (windowEClass, 
		   source, 
		   new String[] {
			 "name", "WINDOW",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getWINDOW_WINDOW(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "WINDOW"
		   });		
		addAnnotation
		  (getWINDOW_PARAM(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PARAM"
		   });		
		addAnnotation
		  (getWINDOW_VARIABLE(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "VARIABLE"
		   });		
		addAnnotation
		  (getWINDOW_Acceleration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "acceleration"
		   });		
		addAnnotation
		  (getWINDOW_Angle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "angle"
		   });		
		addAnnotation
		  (getWINDOW_Attack(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attack"
		   });		
		addAnnotation
		  (getWINDOW_Attraction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attraction"
		   });		
		addAnnotation
		  (getWINDOW_AttractionX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attraction_x"
		   });		
		addAnnotation
		  (getWINDOW_AttractionY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "attraction_y"
		   });		
		addAnnotation
		  (getWINDOW_Axis(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "axis"
		   });		
		addAnnotation
		  (getWINDOW_Balls(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "balls"
		   });		
		addAnnotation
		  (getWINDOW_Bargraph(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bargraph"
		   });		
		addAnnotation
		  (getWINDOW_Behavior(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "behavior"
		   });		
		addAnnotation
		  (getWINDOW_Bipolar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bipolar"
		   });		
		addAnnotation
		  (getWINDOW_Bitmap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "bitmap"
		   });		
		addAnnotation
		  (getWINDOW_Boundaries(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "boundaries"
		   });		
		addAnnotation
		  (getWINDOW_Capture(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "capture"
		   });		
		addAnnotation
		  (getWINDOW_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });		
		addAnnotation
		  (getWINDOW_Color(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "color"
		   });		
		addAnnotation
		  (getWINDOW_Column(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "column"
		   });		
		addAnnotation
		  (getWINDOW_Constrained(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "constrained"
		   });		
		addAnnotation
		  (getWINDOW_Content(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "content"
		   });		
		addAnnotation
		  (getWINDOW_Coordinates(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "coordinates"
		   });		
		addAnnotation
		  (getWINDOW_Cursor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cursor"
		   });		
		addAnnotation
		  (getWINDOW_Decay(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "decay"
		   });		
		addAnnotation
		  (getWINDOW_Display(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "display"
		   });		
		addAnnotation
		  (getWINDOW_Edit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "edit"
		   });		
		addAnnotation
		  (getWINDOW_Editable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "editable"
		   });		
		addAnnotation
		  (getWINDOW_Ephemere(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ephemere"
		   });		
		addAnnotation
		  (getWINDOW_Font(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "font"
		   });		
		addAnnotation
		  (getWINDOW_Free(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "free"
		   });		
		addAnnotation
		  (getWINDOW_Friction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "friction"
		   });		
		addAnnotation
		  (getWINDOW_Gradient(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "gradient"
		   });		
		addAnnotation
		  (getWINDOW_Grid(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grid"
		   });		
		addAnnotation
		  (getWINDOW_GridSteps(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "grid_steps"
		   });		
		addAnnotation
		  (getWINDOW_Group(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "group"
		   });		
		addAnnotation
		  (getWINDOW_Height(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "height"
		   });		
		addAnnotation
		  (getWINDOW_Hold(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "hold"
		   });		
		addAnnotation
		  (getWINDOW_HoldX(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "holdX"
		   });		
		addAnnotation
		  (getWINDOW_HoldY(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "holdY"
		   });		
		addAnnotation
		  (getWINDOW_Horizontal(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "horizontal"
		   });		
		addAnnotation
		  (getWINDOW_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id"
		   });		
		addAnnotation
		  (getWINDOW_KbmouseTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "kbmouse_target"
		   });		
		addAnnotation
		  (getWINDOW_Label(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label"
		   });		
		addAnnotation
		  (getWINDOW_LabelOff(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label_off"
		   });		
		addAnnotation
		  (getWINDOW_LabelOn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "label_on"
		   });		
		addAnnotation
		  (getWINDOW_Light(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "light"
		   });		
		addAnnotation
		  (getWINDOW_Meta(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "meta"
		   });		
		addAnnotation
		  (getWINDOW_MidiTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "midi_target"
		   });		
		addAnnotation
		  (getWINDOW_Mode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "mode"
		   });		
		addAnnotation
		  (getWINDOW_Multicolor(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "multicolor"
		   });		
		addAnnotation
		  (getWINDOW_Multilabel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "multilabel"
		   });		
		addAnnotation
		  (getWINDOW_Nbr(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nbr"
		   });		
		addAnnotation
		  (getWINDOW_OscTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "osc_target"
		   });		
		addAnnotation
		  (getWINDOW_Outline(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "outline"
		   });		
		addAnnotation
		  (getWINDOW_Paint(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "paint"
		   });		
		addAnnotation
		  (getWINDOW_Pan(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pan"
		   });		
		addAnnotation
		  (getWINDOW_Physic(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "physic"
		   });		
		addAnnotation
		  (getWINDOW_Pinch(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "pinch"
		   });		
		addAnnotation
		  (getWINDOW_Polyphony(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "polyphony"
		   });		
		addAnnotation
		  (getWINDOW_Precision(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "precision"
		   });		
		addAnnotation
		  (getWINDOW_Radio(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "radio"
		   });		
		addAnnotation
		  (getWINDOW_Release(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "release"
		   });		
		addAnnotation
		  (getWINDOW_Rest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rest"
		   });		
		addAnnotation
		  (getWINDOW_Row(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "row"
		   });		
		addAnnotation
		  (getWINDOW_Scale(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "scale"
		   });		
		addAnnotation
		  (getWINDOW_Send(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "send"
		   });		
		addAnnotation
		  (getWINDOW_Speed(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "speed"
		   });		
		addAnnotation
		  (getWINDOW_State(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "state"
		   });		
		addAnnotation
		  (getWINDOW_Sustain(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "sustain"
		   });		
		addAnnotation
		  (getWINDOW_Tabbar(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tabbar"
		   });		
		addAnnotation
		  (getWINDOW_Target(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "target"
		   });		
		addAnnotation
		  (getWINDOW_Tension(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "tension"
		   });		
		addAnnotation
		  (getWINDOW_Text(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "text"
		   });		
		addAnnotation
		  (getWINDOW_Unit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "unit"
		   });		
		addAnnotation
		  (getWINDOW_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });		
		addAnnotation
		  (getWINDOW_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width"
		   });		
		addAnnotation
		  (getWINDOW_X(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "x"
		   });		
		addAnnotation
		  (getWINDOW_Y(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "y"
		   });		
		addAnnotation
		  (getWINDOW_Z(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "z"
		   });		
		addAnnotation
		  (getWINDOW_Zoom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "zoom"
		   });
	}

} //JzmlPackageImpl
