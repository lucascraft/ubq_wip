/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.ui.touchoscgui.impl;

import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscBatteryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscControl;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscEncoder;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLED;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLabelV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscLayout;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiFaderV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscMultiToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscPush;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscRotaryV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTabPage;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeH;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscTimeV;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscToggle;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchOscXYPad;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiFactory;
import net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.swt.graphics.Color;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TouchoscguiPackageImpl extends EPackageImpl implements TouchoscguiPackage {
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
	private EClass touchOscLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscTabPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscFaderHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscFaderVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscPushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscXYPadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscLabelHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscLabelVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscLEDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscMultiFaderHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscMultiFaderVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscMultiToggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscRotaryHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscRotaryVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscToggleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscEncoderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscBatteryVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscBatteryHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscTimeHEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscTimeVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass touchOscMultiPushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

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
	 * @see net.sf.smbt.touchosc.ui.touchoscgui.TouchoscguiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TouchoscguiPackageImpl() {
		super(eNS_URI, TouchoscguiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TouchoscguiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TouchoscguiPackage init() {
		if (isInited) return (TouchoscguiPackage)EPackage.Registry.INSTANCE.getEPackage(TouchoscguiPackage.eNS_URI);

		// Obtain or create and register package
		TouchoscguiPackageImpl theTouchoscguiPackage = (TouchoscguiPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TouchoscguiPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TouchoscguiPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theTouchoscguiPackage.createPackageContents();

		// Initialize created meta-data
		theTouchoscguiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTouchoscguiPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TouchoscguiPackage.eNS_URI, theTouchoscguiPackage);
		return theTouchoscguiPackage;
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
	public EReference getTOP_Layouts() {
		return (EReference)topEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscLayout() {
		return touchOscLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscLayout_Tabs() {
		return (EReference)touchOscLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscLayout_Mode() {
		return (EAttribute)touchOscLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscLayout_Orientation() {
		return (EAttribute)touchOscLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscLayout_Version() {
		return (EAttribute)touchOscLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscLayout_Widgets() {
		return (EReference)touchOscLayoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscLayout_Width() {
		return (EAttribute)touchOscLayoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscLayout_Height() {
		return (EAttribute)touchOscLayoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscTabPage() {
		return touchOscTabPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_FadersH() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscTabPage_Name() {
		return (EAttribute)touchOscTabPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_XyPads() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_FadersV() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_LabelsH() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_Pushes() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_LabelsV() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_MultiToggles() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_Leds() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_RotariesV() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_RotariesH() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_Toggles() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_Encoders() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_BatteriesH() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_BatteriesV() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_TimesV() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_TimesH() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_MultiPushes() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_MultiFadersH() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_MultiFadersV() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTouchOscTabPage_Layout() {
		return (EReference)touchOscTabPageEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscControl() {
		return touchOscControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Fg() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Centered() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_H() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_W() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_X() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Y() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Inverted() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Name() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Number() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Osc_cs() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Outline() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Size() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Text() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Type() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Number_x() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Number_y() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Scalef() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Scalet() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Response() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Inverted_x() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Inverted_y() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Seconds() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_Background() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTouchOscControl_LocalFeedbackOff() {
		return (EAttribute)touchOscControlEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscFaderH() {
		return touchOscFaderHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscFaderV() {
		return touchOscFaderVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscPush() {
		return touchOscPushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscXYPad() {
		return touchOscXYPadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscLabelH() {
		return touchOscLabelHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscLabelV() {
		return touchOscLabelVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscLED() {
		return touchOscLEDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscMultiFaderH() {
		return touchOscMultiFaderHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscMultiFaderV() {
		return touchOscMultiFaderVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscMultiToggle() {
		return touchOscMultiToggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscRotaryH() {
		return touchOscRotaryHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscRotaryV() {
		return touchOscRotaryVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscToggle() {
		return touchOscToggleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscEncoder() {
		return touchOscEncoderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscBatteryV() {
		return touchOscBatteryVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscBatteryH() {
		return touchOscBatteryHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscTimeH() {
		return touchOscTimeHEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscTimeV() {
		return touchOscTimeVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTouchOscMultiPush() {
		return touchOscMultiPushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TouchoscguiFactory getTouchoscguiFactory() {
		return (TouchoscguiFactory)getEFactoryInstance();
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
		topEClass = createEClass(TOP);
		createEReference(topEClass, TOP__LAYOUTS);

		touchOscLayoutEClass = createEClass(TOUCH_OSC_LAYOUT);
		createEReference(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__TABS);
		createEAttribute(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__MODE);
		createEAttribute(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__ORIENTATION);
		createEAttribute(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__VERSION);
		createEReference(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__WIDGETS);
		createEAttribute(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__WIDTH);
		createEAttribute(touchOscLayoutEClass, TOUCH_OSC_LAYOUT__HEIGHT);

		touchOscTabPageEClass = createEClass(TOUCH_OSC_TAB_PAGE);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__FADERS_H);
		createEAttribute(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__NAME);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__XY_PADS);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__FADERS_V);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__LABELS_H);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__PUSHES);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__LABELS_V);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__MULTI_TOGGLES);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__LEDS);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__ROTARIES_V);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__ROTARIES_H);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__TOGGLES);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__ENCODERS);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__BATTERIES_H);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__BATTERIES_V);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__TIMES_V);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__TIMES_H);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__MULTI_PUSHES);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__MULTI_FADERS_H);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__MULTI_FADERS_V);
		createEReference(touchOscTabPageEClass, TOUCH_OSC_TAB_PAGE__LAYOUT);

		touchOscControlEClass = createEClass(TOUCH_OSC_CONTROL);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__FG);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__CENTERED);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__H);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__W);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__X);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__Y);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__INVERTED);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__NAME);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__NUMBER);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__OSC_CS);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__OUTLINE);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__SIZE);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__TEXT);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__TYPE);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__NUMBER_X);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__NUMBER_Y);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__SCALEF);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__SCALET);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__RESPONSE);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__INVERTED_X);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__INVERTED_Y);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__SECONDS);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__BACKGROUND);
		createEAttribute(touchOscControlEClass, TOUCH_OSC_CONTROL__LOCAL_FEEDBACK_OFF);

		touchOscFaderHEClass = createEClass(TOUCH_OSC_FADER_H);

		touchOscFaderVEClass = createEClass(TOUCH_OSC_FADER_V);

		touchOscPushEClass = createEClass(TOUCH_OSC_PUSH);

		touchOscXYPadEClass = createEClass(TOUCH_OSC_XY_PAD);

		touchOscLabelHEClass = createEClass(TOUCH_OSC_LABEL_H);

		touchOscLabelVEClass = createEClass(TOUCH_OSC_LABEL_V);

		touchOscLEDEClass = createEClass(TOUCH_OSC_LED);

		touchOscMultiFaderHEClass = createEClass(TOUCH_OSC_MULTI_FADER_H);

		touchOscMultiFaderVEClass = createEClass(TOUCH_OSC_MULTI_FADER_V);

		touchOscMultiToggleEClass = createEClass(TOUCH_OSC_MULTI_TOGGLE);

		touchOscRotaryHEClass = createEClass(TOUCH_OSC_ROTARY_H);

		touchOscRotaryVEClass = createEClass(TOUCH_OSC_ROTARY_V);

		touchOscToggleEClass = createEClass(TOUCH_OSC_TOGGLE);

		touchOscEncoderEClass = createEClass(TOUCH_OSC_ENCODER);

		touchOscBatteryVEClass = createEClass(TOUCH_OSC_BATTERY_V);

		touchOscBatteryHEClass = createEClass(TOUCH_OSC_BATTERY_H);

		touchOscTimeHEClass = createEClass(TOUCH_OSC_TIME_H);

		touchOscTimeVEClass = createEClass(TOUCH_OSC_TIME_V);

		touchOscMultiPushEClass = createEClass(TOUCH_OSC_MULTI_PUSH);

		// Create data types
		colorEDataType = createEDataType(COLOR);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		touchOscFaderHEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscFaderVEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscPushEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscXYPadEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscLabelHEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscLabelVEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscLEDEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscMultiFaderHEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscMultiFaderVEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscMultiToggleEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscRotaryHEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscRotaryVEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscToggleEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscEncoderEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscBatteryVEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscBatteryHEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscTimeHEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscTimeVEClass.getESuperTypes().add(this.getTouchOscControl());
		touchOscMultiPushEClass.getESuperTypes().add(this.getTouchOscControl());

		// Initialize classes and features; add operations and parameters
		initEClass(topEClass, net.sf.smbt.touchosc.ui.touchoscgui.TOP.class, "TOP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTOP_Layouts(), this.getTouchOscLayout(), null, "layouts", null, 0, 1, net.sf.smbt.touchosc.ui.touchoscgui.TOP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchOscLayoutEClass, TouchOscLayout.class, "TouchOscLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTouchOscLayout_Tabs(), this.getTouchOscTabPage(), null, "tabs", null, 0, -1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscLayout_Mode(), ecorePackage.getEString(), "mode", null, 0, 1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscLayout_Orientation(), ecorePackage.getEString(), "orientation", null, 0, 1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscLayout_Version(), ecorePackage.getEString(), "version", null, 0, 1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscLayout_Widgets(), this.getTouchOscControl(), null, "widgets", null, 0, -1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscLayout_Width(), ecorePackage.getEInt(), "width", null, 0, 1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscLayout_Height(), ecorePackage.getEInt(), "height", null, 0, 1, TouchOscLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchOscTabPageEClass, TouchOscTabPage.class, "TouchOscTabPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTouchOscTabPage_FadersH(), this.getTouchOscFaderH(), null, "fadersH", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscTabPage_Name(), ecorePackage.getEString(), "name", null, 0, 1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_XyPads(), this.getTouchOscXYPad(), null, "xyPads", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_FadersV(), this.getTouchOscFaderV(), null, "fadersV", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_LabelsH(), this.getTouchOscLabelH(), null, "labelsH", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_Pushes(), this.getTouchOscPush(), null, "pushes", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_LabelsV(), this.getTouchOscLabelV(), null, "labelsV", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_MultiToggles(), this.getTouchOscMultiToggle(), null, "multiToggles", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_Leds(), this.getTouchOscLED(), null, "leds", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_RotariesV(), this.getTouchOscRotaryV(), null, "rotariesV", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_RotariesH(), this.getTouchOscRotaryH(), null, "rotariesH", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_Toggles(), this.getTouchOscToggle(), null, "toggles", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_Encoders(), this.getTouchOscEncoder(), null, "encoders", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_BatteriesH(), this.getTouchOscBatteryH(), null, "batteriesH", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_BatteriesV(), this.getTouchOscBatteryV(), null, "batteriesV", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_TimesV(), this.getTouchOscTimeV(), null, "timesV", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_TimesH(), this.getTouchOscTimeH(), null, "timesH", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_MultiPushes(), this.getTouchOscMultiPush(), null, "multiPushes", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_MultiFadersH(), this.getTouchOscMultiFaderH(), null, "multiFadersH", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_MultiFadersV(), this.getTouchOscMultiFaderV(), null, "multiFadersV", null, 0, -1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTouchOscTabPage_Layout(), this.getTouchOscLayout(), null, "layout", null, 0, 1, TouchOscTabPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchOscControlEClass, TouchOscControl.class, "TouchOscControl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTouchOscControl_Fg(), ecorePackage.getEString(), "fg", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Centered(), ecorePackage.getEBoolean(), "centered", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_H(), ecorePackage.getEInt(), "h", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_W(), ecorePackage.getEInt(), "w", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_X(), ecorePackage.getEInt(), "x", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Y(), ecorePackage.getEInt(), "y", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Inverted(), ecorePackage.getEBoolean(), "inverted", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Number(), ecorePackage.getEInt(), "number", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Osc_cs(), ecorePackage.getEString(), "osc_cs", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Outline(), ecorePackage.getEBoolean(), "outline", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Size(), ecorePackage.getEInt(), "size", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Text(), ecorePackage.getEString(), "text", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Type(), ecorePackage.getEString(), "type", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Number_x(), ecorePackage.getEInt(), "number_x", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Number_y(), ecorePackage.getEInt(), "number_y", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Scalef(), ecorePackage.getEInt(), "scalef", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Scalet(), ecorePackage.getEInt(), "scalet", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Response(), ecorePackage.getEString(), "response", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Inverted_x(), ecorePackage.getEBoolean(), "inverted_x", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Inverted_y(), ecorePackage.getEBoolean(), "inverted_y", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Seconds(), ecorePackage.getEBoolean(), "seconds", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_Background(), ecorePackage.getEBoolean(), "background", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTouchOscControl_LocalFeedbackOff(), ecorePackage.getEBoolean(), "localFeedbackOff", null, 0, 1, TouchOscControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(touchOscFaderHEClass, TouchOscFaderH.class, "TouchOscFaderH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscFaderVEClass, TouchOscFaderV.class, "TouchOscFaderV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscPushEClass, TouchOscPush.class, "TouchOscPush", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscXYPadEClass, TouchOscXYPad.class, "TouchOscXYPad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscLabelHEClass, TouchOscLabelH.class, "TouchOscLabelH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscLabelVEClass, TouchOscLabelV.class, "TouchOscLabelV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscLEDEClass, TouchOscLED.class, "TouchOscLED", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscMultiFaderHEClass, TouchOscMultiFaderH.class, "TouchOscMultiFaderH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscMultiFaderVEClass, TouchOscMultiFaderV.class, "TouchOscMultiFaderV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscMultiToggleEClass, TouchOscMultiToggle.class, "TouchOscMultiToggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscRotaryHEClass, TouchOscRotaryH.class, "TouchOscRotaryH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscRotaryVEClass, TouchOscRotaryV.class, "TouchOscRotaryV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscToggleEClass, TouchOscToggle.class, "TouchOscToggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscEncoderEClass, TouchOscEncoder.class, "TouchOscEncoder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscBatteryVEClass, TouchOscBatteryV.class, "TouchOscBatteryV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscBatteryHEClass, TouchOscBatteryH.class, "TouchOscBatteryH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscTimeHEClass, TouchOscTimeH.class, "TouchOscTimeH", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscTimeVEClass, TouchOscTimeV.class, "TouchOscTimeV", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(touchOscMultiPushEClass, TouchOscMultiPush.class, "TouchOscMultiPush", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(colorEDataType, Color.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //TouchoscguiPackageImpl
