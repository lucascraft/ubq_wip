/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchoscapp.impl;

import net.sf.smbt.touchosc.touchoscapp.BatteryH;
import net.sf.smbt.touchosc.touchoscapp.BatteryV;
import net.sf.smbt.touchosc.touchoscapp.ControlType;
import net.sf.smbt.touchosc.touchoscapp.Encoder;
import net.sf.smbt.touchosc.touchoscapp.FaderH;
import net.sf.smbt.touchosc.touchoscapp.FaderV;
import net.sf.smbt.touchosc.touchoscapp.LabelH;
import net.sf.smbt.touchosc.touchoscapp.LabelV;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderH;
import net.sf.smbt.touchosc.touchoscapp.MultiFaderV;
import net.sf.smbt.touchosc.touchoscapp.MultiPush;
import net.sf.smbt.touchosc.touchoscapp.MultiToggle;
import net.sf.smbt.touchosc.touchoscapp.Orientation;
import net.sf.smbt.touchosc.touchoscapp.Push;
import net.sf.smbt.touchosc.touchoscapp.RotaryH;
import net.sf.smbt.touchosc.touchoscapp.RotaryV;
import net.sf.smbt.touchosc.touchoscapp.Tab;
import net.sf.smbt.touchosc.touchoscapp.TimeH;
import net.sf.smbt.touchosc.touchoscapp.TimeV;
import net.sf.smbt.touchosc.touchoscapp.Toggle;
import net.sf.smbt.touchosc.touchoscapp.TouchOscApp;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappFactory;
import net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage;

import net.sf.smbt.touchosc.touchoscapp.Widget;
import net.sf.smbt.touchosc.touchoscapp.XYPad;
import net.sf.xqz.model.cmd.CmdPackage;

import net.sf.xqz.model.engine.EnginePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchoscappPackageImpl extends EPackageImpl implements TouchoscappPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faderVEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass faderHEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xyPadEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotaryHEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rotaryVEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelHEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelVEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiToggleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFaderHEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFaderVEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ledEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass widgetEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass batteryVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encoderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass toggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orientationEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum controlTypeEEnum = null;

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
	 * @see net.sf.smbt.touchosc.touchoscapp.TouchoscappPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TouchoscappPackageImpl() {
		super(eNS_URI, TouchoscappFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TouchoscappPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TouchoscappPackage init() {
		if (isInited) return (TouchoscappPackage)EPackage.Registry.INSTANCE.getEPackage(TouchoscappPackage.eNS_URI);

		// Obtain or create and register package
		TouchoscappPackageImpl theTouchoscappPackage = (TouchoscappPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TouchoscappPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TouchoscappPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EnginePackage.eINSTANCE.eClass();
		CmdPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTouchoscappPackage.createPackageContents();

		// Initialize created meta-data
		theTouchoscappPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTouchoscappPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TouchoscappPackage.eNS_URI, theTouchoscappPackage);
		return theTouchoscappPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscApp() {
		return touchOscAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscApp_Tabs() {
		return (EReference)touchOscAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscApp_Orientation() {
		return (EAttribute)touchOscAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscApp_Mode() {
		return (EAttribute)touchOscAppEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscApp_Version() {
		return (EAttribute)touchOscAppEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscApp_Width() {
		return (EAttribute)touchOscAppEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscApp_Height() {
		return (EAttribute)touchOscAppEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaderV() {
		return faderVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderV_Value() {
		return (EAttribute)faderVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderV_From() {
		return (EAttribute)faderVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderV_To() {
		return (EAttribute)faderVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderV_Response() {
		return (EAttribute)faderVEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFaderH() {
		return faderHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderH_Value() {
		return (EAttribute)faderHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderH_From() {
		return (EAttribute)faderHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderH_To() {
		return (EAttribute)faderHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFaderH_Response() {
		return (EAttribute)faderHEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXYPad() {
		return xyPadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYPad_XVal() {
		return (EAttribute)xyPadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXYPad_YVal() {
		return (EAttribute)xyPadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotaryH() {
		return rotaryHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryH_Value() {
		return (EAttribute)rotaryHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryH_From() {
		return (EAttribute)rotaryHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryH_To() {
		return (EAttribute)rotaryHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryH_Response() {
		return (EAttribute)rotaryHEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRotaryV() {
		return rotaryVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryV_Value() {
		return (EAttribute)rotaryVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryV_From() {
		return (EAttribute)rotaryVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryV_To() {
		return (EAttribute)rotaryVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRotaryV_Response() {
		return (EAttribute)rotaryVEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelH() {
		return labelHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelH_Text() {
		return (EAttribute)labelHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelH_Background() {
		return (EAttribute)labelHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelH_Outline() {
		return (EAttribute)labelHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelH_Size() {
		return (EAttribute)labelHEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLabelV() {
		return labelVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelV_Text() {
		return (EAttribute)labelVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelV_Background() {
		return (EAttribute)labelVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelV_Outline() {
		return (EAttribute)labelVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLabelV_Size() {
		return (EAttribute)labelVEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiToggle() {
		return multiToggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiToggle_Values() {
		return (EAttribute)multiToggleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiToggle_Rows() {
		return (EAttribute)multiToggleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiToggle_Columns() {
		return (EAttribute)multiToggleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiToggle_LocalFeedbackOff() {
		return (EAttribute)multiToggleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiFaderH() {
		return multiFaderHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFaderH_Values() {
		return (EAttribute)multiFaderHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFaderH_NumFaders() {
		return (EAttribute)multiFaderHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFaderH_Response() {
		return (EAttribute)multiFaderHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiFaderV() {
		return multiFaderVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFaderV_Values() {
		return (EAttribute)multiFaderVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFaderV_NumFaders() {
		return (EAttribute)multiFaderVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFaderV_Response() {
		return (EAttribute)multiFaderVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLED() {
		return ledEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Rows() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLED_Columns() {
		return (EAttribute)ledEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWidget() {
		return widgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_X() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Y() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_W() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_H() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Color() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Centered() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Inverted() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Osc() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Number() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Name() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWidget_Type() {
		return (EAttribute)widgetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTab_Widgets() {
		return (EReference)tabEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTab_Name() {
		return (EAttribute)tabEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPush() {
		return pushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPush_LocalFeedbackOff() {
		return (EAttribute)pushEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeH() {
		return timeHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeH_Text() {
		return (EAttribute)timeHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeH_Outline() {
		return (EAttribute)timeHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeH_Background() {
		return (EAttribute)timeHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeH_Size() {
		return (EAttribute)timeHEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeV() {
		return timeVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeV_Text() {
		return (EAttribute)timeVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeV_Background() {
		return (EAttribute)timeVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeV_Outline() {
		return (EAttribute)timeVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeV_Size() {
		return (EAttribute)timeVEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryH() {
		return batteryHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryH_Text() {
		return (EAttribute)batteryHEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryH_Background() {
		return (EAttribute)batteryHEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryH_Outline() {
		return (EAttribute)batteryHEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryH_Size() {
		return (EAttribute)batteryHEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBatteryV() {
		return batteryVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryV_Text() {
		return (EAttribute)batteryVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryV_Background() {
		return (EAttribute)batteryVEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryV_Outline() {
		return (EAttribute)batteryVEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBatteryV_Size() {
		return (EAttribute)batteryVEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncoder() {
		return encoderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncoder_From() {
		return (EAttribute)encoderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncoder_To() {
		return (EAttribute)encoderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncoder_Response() {
		return (EAttribute)encoderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPush() {
		return multiPushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPush_LocalFeedbackOff() {
		return (EAttribute)multiPushEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPush_Rows() {
		return (EAttribute)multiPushEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPush_Columns() {
		return (EAttribute)multiPushEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToggle() {
		return toggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getToggle_LocalFeedbackOff() {
		return (EAttribute)toggleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrientation() {
		return orientationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getControlType() {
		return controlTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscappFactory getTouchoscappFactory() {
		return (TouchoscappFactory)getEFactoryInstance();
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
		touchOscAppEClass = createEClass(TOUCH_OSC_APP);
		createEReference(touchOscAppEClass, TOUCH_OSC_APP__TABS);
		createEAttribute(touchOscAppEClass, TOUCH_OSC_APP__ORIENTATION);
		createEAttribute(touchOscAppEClass, TOUCH_OSC_APP__MODE);
		createEAttribute(touchOscAppEClass, TOUCH_OSC_APP__VERSION);
		createEAttribute(touchOscAppEClass, TOUCH_OSC_APP__WIDTH);
		createEAttribute(touchOscAppEClass, TOUCH_OSC_APP__HEIGHT);

		faderVEClass = createEClass(FADER_V);
		createEAttribute(faderVEClass, FADER_V__VALUE);
		createEAttribute(faderVEClass, FADER_V__FROM);
		createEAttribute(faderVEClass, FADER_V__TO);
		createEAttribute(faderVEClass, FADER_V__RESPONSE);

		faderHEClass = createEClass(FADER_H);
		createEAttribute(faderHEClass, FADER_H__VALUE);
		createEAttribute(faderHEClass, FADER_H__FROM);
		createEAttribute(faderHEClass, FADER_H__TO);
		createEAttribute(faderHEClass, FADER_H__RESPONSE);

		xyPadEClass = createEClass(XY_PAD);
		createEAttribute(xyPadEClass, XY_PAD__XVAL);
		createEAttribute(xyPadEClass, XY_PAD__YVAL);

		rotaryHEClass = createEClass(ROTARY_H);
		createEAttribute(rotaryHEClass, ROTARY_H__VALUE);
		createEAttribute(rotaryHEClass, ROTARY_H__FROM);
		createEAttribute(rotaryHEClass, ROTARY_H__TO);
		createEAttribute(rotaryHEClass, ROTARY_H__RESPONSE);

		rotaryVEClass = createEClass(ROTARY_V);
		createEAttribute(rotaryVEClass, ROTARY_V__VALUE);
		createEAttribute(rotaryVEClass, ROTARY_V__FROM);
		createEAttribute(rotaryVEClass, ROTARY_V__TO);
		createEAttribute(rotaryVEClass, ROTARY_V__RESPONSE);

		labelHEClass = createEClass(LABEL_H);
		createEAttribute(labelHEClass, LABEL_H__TEXT);
		createEAttribute(labelHEClass, LABEL_H__BACKGROUND);
		createEAttribute(labelHEClass, LABEL_H__OUTLINE);
		createEAttribute(labelHEClass, LABEL_H__SIZE);

		labelVEClass = createEClass(LABEL_V);
		createEAttribute(labelVEClass, LABEL_V__TEXT);
		createEAttribute(labelVEClass, LABEL_V__BACKGROUND);
		createEAttribute(labelVEClass, LABEL_V__OUTLINE);
		createEAttribute(labelVEClass, LABEL_V__SIZE);

		multiToggleEClass = createEClass(MULTI_TOGGLE);
		createEAttribute(multiToggleEClass, MULTI_TOGGLE__VALUES);
		createEAttribute(multiToggleEClass, MULTI_TOGGLE__ROWS);
		createEAttribute(multiToggleEClass, MULTI_TOGGLE__COLUMNS);
		createEAttribute(multiToggleEClass, MULTI_TOGGLE__LOCAL_FEEDBACK_OFF);

		multiFaderHEClass = createEClass(MULTI_FADER_H);
		createEAttribute(multiFaderHEClass, MULTI_FADER_H__VALUES);
		createEAttribute(multiFaderHEClass, MULTI_FADER_H__NUM_FADERS);
		createEAttribute(multiFaderHEClass, MULTI_FADER_H__RESPONSE);

		multiFaderVEClass = createEClass(MULTI_FADER_V);
		createEAttribute(multiFaderVEClass, MULTI_FADER_V__VALUES);
		createEAttribute(multiFaderVEClass, MULTI_FADER_V__NUM_FADERS);
		createEAttribute(multiFaderVEClass, MULTI_FADER_V__RESPONSE);

		ledEClass = createEClass(LED);
		createEAttribute(ledEClass, LED__ROWS);
		createEAttribute(ledEClass, LED__COLUMNS);

		widgetEClass = createEClass(WIDGET);
		createEAttribute(widgetEClass, WIDGET__X);
		createEAttribute(widgetEClass, WIDGET__Y);
		createEAttribute(widgetEClass, WIDGET__W);
		createEAttribute(widgetEClass, WIDGET__H);
		createEAttribute(widgetEClass, WIDGET__COLOR);
		createEAttribute(widgetEClass, WIDGET__CENTERED);
		createEAttribute(widgetEClass, WIDGET__INVERTED);
		createEAttribute(widgetEClass, WIDGET__OSC);
		createEAttribute(widgetEClass, WIDGET__NUMBER);
		createEAttribute(widgetEClass, WIDGET__NAME);
		createEAttribute(widgetEClass, WIDGET__TYPE);

		tabEClass = createEClass(TAB);
		createEReference(tabEClass, TAB__WIDGETS);
		createEAttribute(tabEClass, TAB__NAME);

		pushEClass = createEClass(PUSH);
		createEAttribute(pushEClass, PUSH__LOCAL_FEEDBACK_OFF);

		timeHEClass = createEClass(TIME_H);
		createEAttribute(timeHEClass, TIME_H__TEXT);
		createEAttribute(timeHEClass, TIME_H__OUTLINE);
		createEAttribute(timeHEClass, TIME_H__BACKGROUND);
		createEAttribute(timeHEClass, TIME_H__SIZE);

		timeVEClass = createEClass(TIME_V);
		createEAttribute(timeVEClass, TIME_V__TEXT);
		createEAttribute(timeVEClass, TIME_V__BACKGROUND);
		createEAttribute(timeVEClass, TIME_V__OUTLINE);
		createEAttribute(timeVEClass, TIME_V__SIZE);

		batteryHEClass = createEClass(BATTERY_H);
		createEAttribute(batteryHEClass, BATTERY_H__TEXT);
		createEAttribute(batteryHEClass, BATTERY_H__BACKGROUND);
		createEAttribute(batteryHEClass, BATTERY_H__OUTLINE);
		createEAttribute(batteryHEClass, BATTERY_H__SIZE);

		batteryVEClass = createEClass(BATTERY_V);
		createEAttribute(batteryVEClass, BATTERY_V__TEXT);
		createEAttribute(batteryVEClass, BATTERY_V__BACKGROUND);
		createEAttribute(batteryVEClass, BATTERY_V__OUTLINE);
		createEAttribute(batteryVEClass, BATTERY_V__SIZE);

		encoderEClass = createEClass(ENCODER);
		createEAttribute(encoderEClass, ENCODER__FROM);
		createEAttribute(encoderEClass, ENCODER__TO);
		createEAttribute(encoderEClass, ENCODER__RESPONSE);

		multiPushEClass = createEClass(MULTI_PUSH);
		createEAttribute(multiPushEClass, MULTI_PUSH__LOCAL_FEEDBACK_OFF);
		createEAttribute(multiPushEClass, MULTI_PUSH__ROWS);
		createEAttribute(multiPushEClass, MULTI_PUSH__COLUMNS);

		toggleEClass = createEClass(TOGGLE);
		createEAttribute(toggleEClass, TOGGLE__LOCAL_FEEDBACK_OFF);

		// Create enums
		orientationEEnum = createEEnum(ORIENTATION);
		controlTypeEEnum = createEEnum(CONTROL_TYPE);
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
		EnginePackage theEnginePackage = (EnginePackage)EPackage.Registry.INSTANCE.getEPackage(EnginePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		touchOscAppEClass.getESuperTypes().add(theEnginePackage.getIConnectedUnit());
		faderVEClass.getESuperTypes().add(this.getWidget());
		faderHEClass.getESuperTypes().add(this.getWidget());
		xyPadEClass.getESuperTypes().add(this.getWidget());
		rotaryHEClass.getESuperTypes().add(this.getWidget());
		rotaryVEClass.getESuperTypes().add(this.getWidget());
		labelHEClass.getESuperTypes().add(this.getWidget());
		labelVEClass.getESuperTypes().add(this.getWidget());
		multiToggleEClass.getESuperTypes().add(this.getWidget());
		multiFaderHEClass.getESuperTypes().add(this.getWidget());
		multiFaderVEClass.getESuperTypes().add(this.getWidget());
		ledEClass.getESuperTypes().add(this.getWidget());
		pushEClass.getESuperTypes().add(this.getWidget());
		timeHEClass.getESuperTypes().add(this.getWidget());
		timeVEClass.getESuperTypes().add(this.getWidget());
		batteryHEClass.getESuperTypes().add(this.getWidget());
		batteryVEClass.getESuperTypes().add(this.getWidget());
		encoderEClass.getESuperTypes().add(this.getWidget());
		multiPushEClass.getESuperTypes().add(this.getWidget());
		toggleEClass.getESuperTypes().add(this.getWidget());

		// Initialize classes and features; add operations and parameters
		initEClass(touchOscAppEClass, TouchOscApp.class, "TouchOscApp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTouchOscApp_Tabs(), this.getTab(), null, "tabs", null, 0, -1, TouchOscApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscApp_Orientation(), this.getOrientation(), "orientation", null, 0, 1, TouchOscApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscApp_Mode(), theEcorePackage.getEString(), "mode", null, 0, 1, TouchOscApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscApp_Version(), theEcorePackage.getEString(), "version", null, 0, 1, TouchOscApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscApp_Width(), theEcorePackage.getEInt(), "width", null, 0, 1, TouchOscApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscApp_Height(), theEcorePackage.getEInt(), "height", null, 0, 1, TouchOscApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faderVEClass, FaderV.class, "FaderV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaderV_Value(), theEcorePackage.getEFloat(), "value", null, 0, 1, FaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaderV_From(), theEcorePackage.getEInt(), "from", null, 0, 1, FaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaderV_To(), theEcorePackage.getEInt(), "to", null, 0, 1, FaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaderV_Response(), theEcorePackage.getEString(), "response", null, 0, 1, FaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(faderHEClass, FaderH.class, "FaderH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFaderH_Value(), theEcorePackage.getEFloat(), "value", null, 0, 1, FaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaderH_From(), theEcorePackage.getEInt(), "from", null, 0, 1, FaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaderH_To(), theEcorePackage.getEInt(), "to", null, 0, 1, FaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFaderH_Response(), theEcorePackage.getEString(), "response", null, 0, 1, FaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xyPadEClass, XYPad.class, "XYPad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXYPad_XVal(), theEcorePackage.getEFloat(), "xVal", null, 0, 1, XYPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXYPad_YVal(), theEcorePackage.getEFloat(), "yVal", null, 0, 1, XYPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotaryHEClass, RotaryH.class, "RotaryH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotaryH_Value(), theEcorePackage.getEFloat(), "value", null, 0, 1, RotaryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryH_From(), theEcorePackage.getEInt(), "from", null, 0, 1, RotaryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryH_To(), theEcorePackage.getEInt(), "to", null, 0, 1, RotaryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryH_Response(), theEcorePackage.getEString(), "response", null, 0, 1, RotaryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rotaryVEClass, RotaryV.class, "RotaryV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRotaryV_Value(), theEcorePackage.getEFloat(), "value", null, 0, 1, RotaryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryV_From(), theEcorePackage.getEInt(), "from", null, 0, 1, RotaryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryV_To(), theEcorePackage.getEInt(), "to", null, 0, 1, RotaryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRotaryV_Response(), theEcorePackage.getEString(), "response", null, 0, 1, RotaryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelHEClass, LabelH.class, "LabelH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelH_Text(), theEcorePackage.getEString(), "text", null, 0, 1, LabelH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelH_Background(), theEcorePackage.getEBoolean(), "background", null, 0, 1, LabelH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelH_Outline(), theEcorePackage.getEBoolean(), "outline", null, 0, 1, LabelH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelH_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, LabelH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelVEClass, LabelV.class, "LabelV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabelV_Text(), theEcorePackage.getEString(), "text", null, 0, 1, LabelV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelV_Background(), theEcorePackage.getEBoolean(), "background", null, 0, 1, LabelV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelV_Outline(), theEcorePackage.getEBoolean(), "outline", null, 0, 1, LabelV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabelV_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, LabelV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiToggleEClass, MultiToggle.class, "MultiToggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiToggle_Values(), theEcorePackage.getEInt(), "values", null, 0, -1, MultiToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiToggle_Rows(), theEcorePackage.getEInt(), "rows", null, 0, 1, MultiToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiToggle_Columns(), theEcorePackage.getEInt(), "columns", null, 0, 1, MultiToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiToggle_LocalFeedbackOff(), theEcorePackage.getEBoolean(), "localFeedbackOff", null, 0, 1, MultiToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFaderHEClass, MultiFaderH.class, "MultiFaderH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiFaderH_Values(), theEcorePackage.getEFloat(), "values", null, 0, -1, MultiFaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFaderH_NumFaders(), theEcorePackage.getEInt(), "numFaders", null, 0, 1, MultiFaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFaderH_Response(), theEcorePackage.getEString(), "response", null, 0, 1, MultiFaderH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFaderVEClass, MultiFaderV.class, "MultiFaderV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiFaderV_Values(), theEcorePackage.getEFloat(), "values", null, 0, -1, MultiFaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFaderV_NumFaders(), theEcorePackage.getEInt(), "numFaders", null, 0, 1, MultiFaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFaderV_Response(), theEcorePackage.getEString(), "response", null, 0, 1, MultiFaderV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ledEClass, net.sf.smbt.touchosc.touchoscapp.LED.class, "LED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLED_Rows(), theEcorePackage.getEInt(), "rows", null, 0, 1, net.sf.smbt.touchosc.touchoscapp.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLED_Columns(), theEcorePackage.getEInt(), "columns", null, 0, 1, net.sf.smbt.touchosc.touchoscapp.LED.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(widgetEClass, Widget.class, "Widget", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWidget_X(), theEcorePackage.getEInt(), "x", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Y(), theEcorePackage.getEInt(), "y", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_W(), theEcorePackage.getEInt(), "w", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_H(), theEcorePackage.getEInt(), "h", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Color(), theEcorePackage.getEString(), "color", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Centered(), theEcorePackage.getEBoolean(), "centered", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Inverted(), theEcorePackage.getEBoolean(), "inverted", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Osc(), theEcorePackage.getEString(), "osc", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Number(), theEcorePackage.getEString(), "number", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getWidget_Type(), theEcorePackage.getEString(), "type", null, 0, 1, Widget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tabEClass, Tab.class, "Tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTab_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTab_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Tab.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pushEClass, Push.class, "Push", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPush_LocalFeedbackOff(), theEcorePackage.getEBoolean(), "localFeedbackOff", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeHEClass, TimeH.class, "TimeH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeH_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TimeH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeH_Outline(), theEcorePackage.getEBoolean(), "outline", null, 0, 1, TimeH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeH_Background(), theEcorePackage.getEBoolean(), "background", null, 0, 1, TimeH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeH_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, TimeH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timeVEClass, TimeV.class, "TimeV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeV_Text(), theEcorePackage.getEString(), "text", null, 0, 1, TimeV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeV_Background(), theEcorePackage.getEBoolean(), "background", null, 0, 1, TimeV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeV_Outline(), theEcorePackage.getEBoolean(), "outline", null, 0, 1, TimeV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimeV_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, TimeV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryHEClass, BatteryH.class, "BatteryH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryH_Text(), theEcorePackage.getEString(), "text", null, 0, 1, BatteryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryH_Background(), theEcorePackage.getEBoolean(), "background", null, 0, 1, BatteryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryH_Outline(), theEcorePackage.getEBoolean(), "outline", null, 0, 1, BatteryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryH_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, BatteryH.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(batteryVEClass, BatteryV.class, "BatteryV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBatteryV_Text(), theEcorePackage.getEString(), "text", null, 0, 1, BatteryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryV_Background(), theEcorePackage.getEBoolean(), "background", null, 0, 1, BatteryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryV_Outline(), theEcorePackage.getEBoolean(), "outline", null, 0, 1, BatteryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBatteryV_Size(), theEcorePackage.getEInt(), "size", null, 0, 1, BatteryV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(encoderEClass, Encoder.class, "Encoder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEncoder_From(), theEcorePackage.getEInt(), "from", null, 0, 1, Encoder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncoder_To(), theEcorePackage.getEInt(), "to", null, 0, 1, Encoder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEncoder_Response(), theEcorePackage.getEString(), "response", null, 0, 1, Encoder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPushEClass, MultiPush.class, "MultiPush", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiPush_LocalFeedbackOff(), theEcorePackage.getEBoolean(), "localFeedbackOff", null, 0, 1, MultiPush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiPush_Rows(), theEcorePackage.getEInt(), "rows", null, 0, 1, MultiPush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiPush_Columns(), theEcorePackage.getEInt(), "columns", null, 0, 1, MultiPush.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(toggleEClass, Toggle.class, "Toggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToggle_LocalFeedbackOff(), theEcorePackage.getEBoolean(), "localFeedbackOff", null, 0, 1, Toggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orientationEEnum, Orientation.class, "Orientation");
		addEEnumLiteral(orientationEEnum, Orientation.HORIZONTAL);
		addEEnumLiteral(orientationEEnum, Orientation.VERTICAL);

		initEEnum(controlTypeEEnum, ControlType.class, "ControlType");
		addEEnumLiteral(controlTypeEEnum, ControlType.LABEL_V);
		addEEnumLiteral(controlTypeEEnum, ControlType.FADER_H);
		addEEnumLiteral(controlTypeEEnum, ControlType.FADER_V);
		addEEnumLiteral(controlTypeEEnum, ControlType.LED);
		addEEnumLiteral(controlTypeEEnum, ControlType.ROTARY_H);
		addEEnumLiteral(controlTypeEEnum, ControlType.ROTARY_V);
		addEEnumLiteral(controlTypeEEnum, ControlType.XYPAD);
		addEEnumLiteral(controlTypeEEnum, ControlType.LABEL_H);
		addEEnumLiteral(controlTypeEEnum, ControlType.MULTI_TOGGLE);
		addEEnumLiteral(controlTypeEEnum, ControlType.MULTI_FADER_H);
		addEEnumLiteral(controlTypeEEnum, ControlType.MULTI_FADER_V);
		addEEnumLiteral(controlTypeEEnum, ControlType.PUSH);
		addEEnumLiteral(controlTypeEEnum, ControlType.ENCODER);
		addEEnumLiteral(controlTypeEEnum, ControlType.MULTI_PUSH);
		addEEnumLiteral(controlTypeEEnum, ControlType.BATTERY_H);
		addEEnumLiteral(controlTypeEEnum, ControlType.BATTERY_V);
		addEEnumLiteral(controlTypeEEnum, ControlType.TIME_H);
		addEEnumLiteral(controlTypeEEnum, ControlType.TIME_V);
		addEEnumLiteral(controlTypeEEnum, ControlType.TOGGLE);

		// Create resource
		createResource(eNS_URI);
	}

} //TouchoscappPackageImpl
