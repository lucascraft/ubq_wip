/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.touchosc.touchosc;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.touchosc.touchosc.TouchoscFactory
 * @model kind="package"
 * @generated
 */
public interface TouchoscPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "touchosc";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///net.sf.smbt.touchosc/src/net/sf/smbt/touchosc/model/touchosc.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "touchosc";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TouchoscPackage eINSTANCE = net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl <em>Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchosc.impl.ControlImpl
	 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getControl()
	 * @generated
	 */
	int CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Midi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__MIDI = 0;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__BACKGROUND = 1;

	/**
	 * The feature id for the '<em><b>Centered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__CENTERED = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__COLOR = 3;

	/**
	 * The feature id for the '<em><b>H</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__H = 4;

	/**
	 * The feature id for the '<em><b>Inverted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__INVERTED = 5;

	/**
	 * The feature id for the '<em><b>Inverted X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__INVERTED_X = 6;

	/**
	 * The feature id for the '<em><b>Inverted Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__INVERTED_Y = 7;

	/**
	 * The feature id for the '<em><b>Local Off</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__LOCAL_OFF = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NAME = 9;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Number X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NUMBER_X = 11;

	/**
	 * The feature id for the '<em><b>Number Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__NUMBER_Y = 12;

	/**
	 * The feature id for the '<em><b>Osc Cs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OSC_CS = 13;

	/**
	 * The feature id for the '<em><b>Outline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__OUTLINE = 14;

	/**
	 * The feature id for the '<em><b>Response</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__RESPONSE = 15;

	/**
	 * The feature id for the '<em><b>Scalef</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SCALEF = 16;

	/**
	 * The feature id for the '<em><b>Scalet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SCALET = 17;

	/**
	 * The feature id for the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SECONDS = 18;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__SIZE = 19;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TEXT = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__TYPE = 21;

	/**
	 * The feature id for the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__W = 22;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__X = 23;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL__Y = 24;

	/**
	 * The number of structural features of the '<em>Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FEATURE_COUNT = 25;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchosc.impl.LayoutImpl <em>Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchosc.impl.LayoutImpl
	 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Tabpage</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__TABPAGE = 0;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__MODE = 1;

	/**
	 * The feature id for the '<em><b>Orientation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__ORIENTATION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAYOUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl <em>Midi</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchosc.impl.MidiImpl
	 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getMidi()
	 * @generated
	 */
	int MIDI = 2;

	/**
	 * The feature id for the '<em><b>Channel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI__CHANNEL = 0;

	/**
	 * The feature id for the '<em><b>Data1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI__DATA1 = 1;

	/**
	 * The feature id for the '<em><b>Data2f</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI__DATA2F = 2;

	/**
	 * The feature id for the '<em><b>Data2t</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI__DATA2T = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI__VAR = 5;

	/**
	 * The number of structural features of the '<em>Midi</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIDI_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchosc.impl.TabpageImpl <em>Tabpage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchosc.impl.TabpageImpl
	 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getTabpage()
	 * @generated
	 */
	int TABPAGE = 3;

	/**
	 * The feature id for the '<em><b>Control</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABPAGE__CONTROL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABPAGE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Tabpage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABPAGE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link net.sf.smbt.touchosc.touchosc.impl.TOPImpl <em>TOP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.sf.smbt.touchosc.touchosc.impl.TOPImpl
	 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getTOP()
	 * @generated
	 */
	int TOP = 4;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP__LAYOUT = 0;

	/**
	 * The number of structural features of the '<em>TOP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_FEATURE_COUNT = 1;

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchosc.Control <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control
	 * @generated
	 */
	EClass getControl();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.touchosc.touchosc.Control#getMidi <em>Midi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Midi</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getMidi()
	 * @see #getControl()
	 * @generated
	 */
	EReference getControl_Midi();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getBackground()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Background();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getCentered <em>Centered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Centered</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getCentered()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Centered();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getColor()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Color();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getH <em>H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>H</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getH()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_H();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getInverted <em>Inverted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getInverted()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Inverted();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getInvertedX <em>Inverted X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted X</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getInvertedX()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_InvertedX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getInvertedY <em>Inverted Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inverted Y</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getInvertedY()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_InvertedY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getLocalOff <em>Local Off</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Local Off</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getLocalOff()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_LocalOff();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getName()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getNumber()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Number();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getNumberX <em>Number X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number X</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getNumberX()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_NumberX();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getNumberY <em>Number Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Y</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getNumberY()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_NumberY();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getOscCs <em>Osc Cs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Osc Cs</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getOscCs()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_OscCs();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getOutline <em>Outline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outline</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getOutline()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Outline();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Response</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getResponse()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Response();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getScalef <em>Scalef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalef</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getScalef()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Scalef();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getScalet <em>Scalet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalet</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getScalet()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Scalet();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getSeconds <em>Seconds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seconds</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getSeconds()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Seconds();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getSize()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Size();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getText()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Text();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getType()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getW <em>W</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>W</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getW()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_W();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getX()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_X();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Control#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Control#getY()
	 * @see #getControl()
	 * @generated
	 */
	EAttribute getControl_Y();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchosc.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Layout</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Layout
	 * @generated
	 */
	EClass getLayout();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.touchosc.Layout#getTabpage <em>Tabpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tabpage</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Layout#getTabpage()
	 * @see #getLayout()
	 * @generated
	 */
	EReference getLayout_Tabpage();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Layout#getMode <em>Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Layout#getMode()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Mode();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Layout#getOrientation <em>Orientation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Orientation</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Layout#getOrientation()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Orientation();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Layout#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Layout#getVersion()
	 * @see #getLayout()
	 * @generated
	 */
	EAttribute getLayout_Version();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchosc.Midi <em>Midi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Midi</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi
	 * @generated
	 */
	EClass getMidi();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Midi#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Channel</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi#getChannel()
	 * @see #getMidi()
	 * @generated
	 */
	EAttribute getMidi_Channel();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Midi#getData1 <em>Data1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data1</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi#getData1()
	 * @see #getMidi()
	 * @generated
	 */
	EAttribute getMidi_Data1();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Midi#getData2f <em>Data2f</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data2f</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi#getData2f()
	 * @see #getMidi()
	 * @generated
	 */
	EAttribute getMidi_Data2f();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Midi#getData2t <em>Data2t</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data2t</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi#getData2t()
	 * @see #getMidi()
	 * @generated
	 */
	EAttribute getMidi_Data2t();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Midi#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi#getType()
	 * @see #getMidi()
	 * @generated
	 */
	EAttribute getMidi_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Midi#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Midi#getVar()
	 * @see #getMidi()
	 * @generated
	 */
	EAttribute getMidi_Var();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchosc.Tabpage <em>Tabpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tabpage</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Tabpage
	 * @generated
	 */
	EClass getTabpage();

	/**
	 * Returns the meta object for the containment reference list '{@link net.sf.smbt.touchosc.touchosc.Tabpage#getControl <em>Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Control</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Tabpage#getControl()
	 * @see #getTabpage()
	 * @generated
	 */
	EReference getTabpage_Control();

	/**
	 * Returns the meta object for the attribute '{@link net.sf.smbt.touchosc.touchosc.Tabpage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.Tabpage#getName()
	 * @see #getTabpage()
	 * @generated
	 */
	EAttribute getTabpage_Name();

	/**
	 * Returns the meta object for class '{@link net.sf.smbt.touchosc.touchosc.TOP <em>TOP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TOP</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.TOP
	 * @generated
	 */
	EClass getTOP();

	/**
	 * Returns the meta object for the containment reference '{@link net.sf.smbt.touchosc.touchosc.TOP#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see net.sf.smbt.touchosc.touchosc.TOP#getLayout()
	 * @see #getTOP()
	 * @generated
	 */
	EReference getTOP_Layout();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TouchoscFactory getTouchoscFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchosc.impl.ControlImpl <em>Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchosc.impl.ControlImpl
		 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getControl()
		 * @generated
		 */
		EClass CONTROL = eINSTANCE.getControl();

		/**
		 * The meta object literal for the '<em><b>Midi</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL__MIDI = eINSTANCE.getControl_Midi();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__BACKGROUND = eINSTANCE.getControl_Background();

		/**
		 * The meta object literal for the '<em><b>Centered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__CENTERED = eINSTANCE.getControl_Centered();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__COLOR = eINSTANCE.getControl_Color();

		/**
		 * The meta object literal for the '<em><b>H</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__H = eINSTANCE.getControl_H();

		/**
		 * The meta object literal for the '<em><b>Inverted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__INVERTED = eINSTANCE.getControl_Inverted();

		/**
		 * The meta object literal for the '<em><b>Inverted X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__INVERTED_X = eINSTANCE.getControl_InvertedX();

		/**
		 * The meta object literal for the '<em><b>Inverted Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__INVERTED_Y = eINSTANCE.getControl_InvertedY();

		/**
		 * The meta object literal for the '<em><b>Local Off</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__LOCAL_OFF = eINSTANCE.getControl_LocalOff();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NAME = eINSTANCE.getControl_Name();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NUMBER = eINSTANCE.getControl_Number();

		/**
		 * The meta object literal for the '<em><b>Number X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NUMBER_X = eINSTANCE.getControl_NumberX();

		/**
		 * The meta object literal for the '<em><b>Number Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__NUMBER_Y = eINSTANCE.getControl_NumberY();

		/**
		 * The meta object literal for the '<em><b>Osc Cs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__OSC_CS = eINSTANCE.getControl_OscCs();

		/**
		 * The meta object literal for the '<em><b>Outline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__OUTLINE = eINSTANCE.getControl_Outline();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__RESPONSE = eINSTANCE.getControl_Response();

		/**
		 * The meta object literal for the '<em><b>Scalef</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SCALEF = eINSTANCE.getControl_Scalef();

		/**
		 * The meta object literal for the '<em><b>Scalet</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SCALET = eINSTANCE.getControl_Scalet();

		/**
		 * The meta object literal for the '<em><b>Seconds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SECONDS = eINSTANCE.getControl_Seconds();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__SIZE = eINSTANCE.getControl_Size();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TEXT = eINSTANCE.getControl_Text();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__TYPE = eINSTANCE.getControl_Type();

		/**
		 * The meta object literal for the '<em><b>W</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__W = eINSTANCE.getControl_W();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__X = eINSTANCE.getControl_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL__Y = eINSTANCE.getControl_Y();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchosc.impl.LayoutImpl <em>Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchosc.impl.LayoutImpl
		 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getLayout()
		 * @generated
		 */
		EClass LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '<em><b>Tabpage</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAYOUT__TABPAGE = eINSTANCE.getLayout_Tabpage();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__MODE = eINSTANCE.getLayout_Mode();

		/**
		 * The meta object literal for the '<em><b>Orientation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__ORIENTATION = eINSTANCE.getLayout_Orientation();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LAYOUT__VERSION = eINSTANCE.getLayout_Version();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchosc.impl.MidiImpl <em>Midi</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchosc.impl.MidiImpl
		 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getMidi()
		 * @generated
		 */
		EClass MIDI = eINSTANCE.getMidi();

		/**
		 * The meta object literal for the '<em><b>Channel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI__CHANNEL = eINSTANCE.getMidi_Channel();

		/**
		 * The meta object literal for the '<em><b>Data1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI__DATA1 = eINSTANCE.getMidi_Data1();

		/**
		 * The meta object literal for the '<em><b>Data2f</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI__DATA2F = eINSTANCE.getMidi_Data2f();

		/**
		 * The meta object literal for the '<em><b>Data2t</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI__DATA2T = eINSTANCE.getMidi_Data2t();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI__TYPE = eINSTANCE.getMidi_Type();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MIDI__VAR = eINSTANCE.getMidi_Var();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchosc.impl.TabpageImpl <em>Tabpage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchosc.impl.TabpageImpl
		 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getTabpage()
		 * @generated
		 */
		EClass TABPAGE = eINSTANCE.getTabpage();

		/**
		 * The meta object literal for the '<em><b>Control</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABPAGE__CONTROL = eINSTANCE.getTabpage_Control();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABPAGE__NAME = eINSTANCE.getTabpage_Name();

		/**
		 * The meta object literal for the '{@link net.sf.smbt.touchosc.touchosc.impl.TOPImpl <em>TOP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.sf.smbt.touchosc.touchosc.impl.TOPImpl
		 * @see net.sf.smbt.touchosc.touchosc.impl.TouchoscPackageImpl#getTOP()
		 * @generated
		 */
		EClass TOP = eINSTANCE.getTOP();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOP__LAYOUT = eINSTANCE.getTOP_Layout();

	}

} //TouchoscPackage
