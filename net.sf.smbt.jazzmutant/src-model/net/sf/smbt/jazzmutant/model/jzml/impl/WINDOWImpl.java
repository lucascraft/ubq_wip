/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.jazzmutant.model.jzml.impl;

import java.util.Collection;

import net.sf.smbt.jazzmutant.model.jzml.JzmlPackage;
import net.sf.smbt.jazzmutant.model.jzml.PARAM;
import net.sf.smbt.jazzmutant.model.jzml.VARIABLE;
import net.sf.smbt.jazzmutant.model.jzml.WINDOW;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>WINDOW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getWINDOW <em>WINDOW</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPARAM <em>PARAM</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getVARIABLE <em>VARIABLE</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAcceleration <em>Acceleration</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAttraction <em>Attraction</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAttractionX <em>Attraction X</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAttractionY <em>Attraction Y</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getBalls <em>Balls</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getBargraph <em>Bargraph</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getBipolar <em>Bipolar</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getBitmap <em>Bitmap</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getBoundaries <em>Boundaries</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getCapture <em>Capture</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getColor <em>Color</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getConstrained <em>Constrained</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getContent <em>Content</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getCursor <em>Cursor</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getDecay <em>Decay</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getEdit <em>Edit</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getEditable <em>Editable</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getEphemere <em>Ephemere</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getFont <em>Font</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getFree <em>Free</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getFriction <em>Friction</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getGradient <em>Gradient</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getGridSteps <em>Grid Steps</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getHold <em>Hold</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getHoldX <em>Hold X</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getHoldY <em>Hold Y</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getHorizontal <em>Horizontal</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getKbmouseTarget <em>Kbmouse Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getLabelOff <em>Label Off</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getLabelOn <em>Label On</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getLight <em>Light</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getMidiTarget <em>Midi Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getMulticolor <em>Multicolor</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getMultilabel <em>Multilabel</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getNbr <em>Nbr</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getOscTarget <em>Osc Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getOutline <em>Outline</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPaint <em>Paint</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPan <em>Pan</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPhysic <em>Physic</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPinch <em>Pinch</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPolyphony <em>Polyphony</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getRadio <em>Radio</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getRelease <em>Release</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getRest <em>Rest</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getRow <em>Row</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getScale <em>Scale</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getSend <em>Send</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getState <em>State</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getSustain <em>Sustain</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getTabbar <em>Tabbar</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getTension <em>Tension</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getText <em>Text</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getValue <em>Value</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getX <em>X</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getY <em>Y</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getZ <em>Z</em>}</li>
 *   <li>{@link net.sf.smbt.jazzmutant.model.jzml.impl.WINDOWImpl#getZoom <em>Zoom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WINDOWImpl extends MinimalEObjectImpl.Container implements WINDOW {
	/**
	 * The cached value of the '{@link #getWINDOW() <em>WINDOW</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWINDOW()
	 * @generated
	 * @ordered
	 */
	protected EList<WINDOW> wINDOW;

	/**
	 * The cached value of the '{@link #getPARAM() <em>PARAM</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPARAM()
	 * @generated
	 * @ordered
	 */
	protected EList<PARAM> pARAM;

	/**
	 * The cached value of the '{@link #getVARIABLE() <em>VARIABLE</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVARIABLE()
	 * @generated
	 * @ordered
	 */
	protected EList<VARIABLE> vARIABLE;

	/**
	 * The default value of the '{@link #getAcceleration() <em>Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCELERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAcceleration() <em>Acceleration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcceleration()
	 * @generated
	 * @ordered
	 */
	protected String acceleration = ACCELERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected static final String ANGLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngle()
	 * @generated
	 * @ordered
	 */
	protected String angle = ANGLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected String attack = ATTACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttraction() <em>Attraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttraction()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttraction() <em>Attraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttraction()
	 * @generated
	 * @ordered
	 */
	protected String attraction = ATTRACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttractionX() <em>Attraction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttractionX()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRACTION_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttractionX() <em>Attraction X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttractionX()
	 * @generated
	 * @ordered
	 */
	protected String attractionX = ATTRACTION_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttractionY() <em>Attraction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttractionY()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTRACTION_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttractionY() <em>Attraction Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttractionY()
	 * @generated
	 * @ordered
	 */
	protected String attractionY = ATTRACTION_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final String AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected String axis = AXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBalls() <em>Balls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalls()
	 * @generated
	 * @ordered
	 */
	protected static final String BALLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBalls() <em>Balls</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalls()
	 * @generated
	 * @ordered
	 */
	protected String balls = BALLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBargraph() <em>Bargraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBargraph()
	 * @generated
	 * @ordered
	 */
	protected static final String BARGRAPH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBargraph() <em>Bargraph</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBargraph()
	 * @generated
	 * @ordered
	 */
	protected String bargraph = BARGRAPH_EDEFAULT;

	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final String BEHAVIOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected String behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBipolar() <em>Bipolar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBipolar()
	 * @generated
	 * @ordered
	 */
	protected static final String BIPOLAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBipolar() <em>Bipolar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBipolar()
	 * @generated
	 * @ordered
	 */
	protected String bipolar = BIPOLAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getBitmap() <em>Bitmap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitmap()
	 * @generated
	 * @ordered
	 */
	protected static final String BITMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBitmap() <em>Bitmap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitmap()
	 * @generated
	 * @ordered
	 */
	protected String bitmap = BITMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoundaries() <em>Boundaries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaries()
	 * @generated
	 * @ordered
	 */
	protected static final String BOUNDARIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoundaries() <em>Boundaries</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoundaries()
	 * @generated
	 * @ordered
	 */
	protected String boundaries = BOUNDARIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapture() <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapture()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapture() <em>Capture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapture()
	 * @generated
	 * @ordered
	 */
	protected String capture = CAPTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumn()
	 * @generated
	 * @ordered
	 */
	protected String column = COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrained()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstrained() <em>Constrained</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstrained()
	 * @generated
	 * @ordered
	 */
	protected String constrained = CONSTRAINED_EDEFAULT;

	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDINATES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected String coordinates = COORDINATES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected static final String CURSOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCursor() <em>Cursor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCursor()
	 * @generated
	 * @ordered
	 */
	protected String cursor = CURSOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecay() <em>Decay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecay()
	 * @generated
	 * @ordered
	 */
	protected static final String DECAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecay() <em>Decay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecay()
	 * @generated
	 * @ordered
	 */
	protected String decay = DECAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplay() <em>Display</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplay()
	 * @generated
	 * @ordered
	 */
	protected String display = DISPLAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getEdit() <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit()
	 * @generated
	 * @ordered
	 */
	protected static final String EDIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEdit() <em>Edit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdit()
	 * @generated
	 * @ordered
	 */
	protected String edit = EDIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected static final String EDITABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditable()
	 * @generated
	 * @ordered
	 */
	protected String editable = EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEphemere() <em>Ephemere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEphemere()
	 * @generated
	 * @ordered
	 */
	protected static final String EPHEMERE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEphemere() <em>Ephemere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEphemere()
	 * @generated
	 * @ordered
	 */
	protected String ephemere = EPHEMERE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFont() <em>Font</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFont()
	 * @generated
	 * @ordered
	 */
	protected String font = FONT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final String FREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected String free = FREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFriction() <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected static final String FRICTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFriction() <em>Friction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriction()
	 * @generated
	 * @ordered
	 */
	protected String friction = FRICTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGradient() <em>Gradient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradient()
	 * @generated
	 * @ordered
	 */
	protected String gradient = GRADIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrid() <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected static final String GRID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected String grid = GRID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGridSteps() <em>Grid Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSteps()
	 * @generated
	 * @ordered
	 */
	protected static final String GRID_STEPS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGridSteps() <em>Grid Steps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridSteps()
	 * @generated
	 * @ordered
	 */
	protected String gridSteps = GRID_STEPS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected String group = GROUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHold() <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHold()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHold() <em>Hold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHold()
	 * @generated
	 * @ordered
	 */
	protected String hold = HOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldX() <em>Hold X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldX()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLD_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoldX() <em>Hold X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldX()
	 * @generated
	 * @ordered
	 */
	protected String holdX = HOLD_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getHoldY() <em>Hold Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldY()
	 * @generated
	 * @ordered
	 */
	protected static final String HOLD_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHoldY() <em>Hold Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHoldY()
	 * @generated
	 * @ordered
	 */
	protected String holdY = HOLD_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontal()
	 * @generated
	 * @ordered
	 */
	protected static final String HORIZONTAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontal() <em>Horizontal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontal()
	 * @generated
	 * @ordered
	 */
	protected String horizontal = HORIZONTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getKbmouseTarget() <em>Kbmouse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String KBMOUSE_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKbmouseTarget() <em>Kbmouse Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKbmouseTarget()
	 * @generated
	 * @ordered
	 */
	protected String kbmouseTarget = KBMOUSE_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelOff() <em>Label Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelOff()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_OFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelOff() <em>Label Off</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelOff()
	 * @generated
	 * @ordered
	 */
	protected String labelOff = LABEL_OFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelOn() <em>Label On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelOn()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelOn() <em>Label On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelOn()
	 * @generated
	 * @ordered
	 */
	protected String labelOn = LABEL_ON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected static final String LIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected String light = LIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected static final String META_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected String meta = META_EDEFAULT;

	/**
	 * The default value of the '{@link #getMidiTarget() <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String MIDI_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMidiTarget() <em>Midi Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMidiTarget()
	 * @generated
	 * @ordered
	 */
	protected String midiTarget = MIDI_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final String MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected String mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMulticolor() <em>Multicolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticolor()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTICOLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMulticolor() <em>Multicolor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMulticolor()
	 * @generated
	 * @ordered
	 */
	protected String multicolor = MULTICOLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultilabel() <em>Multilabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultilabel()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTILABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultilabel() <em>Multilabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultilabel()
	 * @generated
	 * @ordered
	 */
	protected String multilabel = MULTILABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbr() <em>Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNbr() <em>Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbr()
	 * @generated
	 * @ordered
	 */
	protected String nbr = NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscTarget() <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String OSC_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscTarget() <em>Osc Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscTarget()
	 * @generated
	 * @ordered
	 */
	protected String oscTarget = OSC_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutline()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTLINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutline() <em>Outline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutline()
	 * @generated
	 * @ordered
	 */
	protected String outline = OUTLINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaint() <em>Paint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaint()
	 * @generated
	 * @ordered
	 */
	protected static final String PAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaint() <em>Paint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaint()
	 * @generated
	 * @ordered
	 */
	protected String paint = PAINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected static final String PAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPan() <em>Pan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPan()
	 * @generated
	 * @ordered
	 */
	protected String pan = PAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhysic() <em>Physic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysic()
	 * @generated
	 * @ordered
	 */
	protected static final String PHYSIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhysic() <em>Physic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhysic()
	 * @generated
	 * @ordered
	 */
	protected String physic = PHYSIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getPinch() <em>Pinch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinch()
	 * @generated
	 * @ordered
	 */
	protected static final String PINCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPinch() <em>Pinch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPinch()
	 * @generated
	 * @ordered
	 */
	protected String pinch = PINCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPolyphony() <em>Polyphony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyphony()
	 * @generated
	 * @ordered
	 */
	protected static final String POLYPHONY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPolyphony() <em>Polyphony</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPolyphony()
	 * @generated
	 * @ordered
	 */
	protected String polyphony = POLYPHONY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final String PRECISION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected String precision = PRECISION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected static final String RADIO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRadio() <em>Radio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadio()
	 * @generated
	 * @ordered
	 */
	protected String radio = RADIO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelease() <em>Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelease()
	 * @generated
	 * @ordered
	 */
	protected String release = RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRest() <em>Rest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRest()
	 * @generated
	 * @ordered
	 */
	protected String rest = REST_EDEFAULT;

	/**
	 * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected static final String ROW_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRow()
	 * @generated
	 * @ordered
	 */
	protected String row = ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScale()
	 * @generated
	 * @ordered
	 */
	protected String scale = SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSend() <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected static final String SEND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSend() <em>Send</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSend()
	 * @generated
	 * @ordered
	 */
	protected String send = SEND_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final String SPEED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected String speed = SPEED_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSustain() <em>Sustain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSustain()
	 * @generated
	 * @ordered
	 */
	protected static final String SUSTAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSustain() <em>Sustain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSustain()
	 * @generated
	 * @ordered
	 */
	protected String sustain = SUSTAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getTabbar() <em>Tabbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabbar()
	 * @generated
	 * @ordered
	 */
	protected static final String TABBAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabbar() <em>Tabbar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabbar()
	 * @generated
	 * @ordered
	 */
	protected String tabbar = TABBAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getTension() <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTension()
	 * @generated
	 * @ordered
	 */
	protected static final String TENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTension() <em>Tension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTension()
	 * @generated
	 * @ordered
	 */
	protected String tension = TENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected String unit = UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final String X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected String x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final String Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected String y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected static final String Z_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZ() <em>Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZ()
	 * @generated
	 * @ordered
	 */
	protected String z = Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected static final String ZOOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZoom() <em>Zoom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected String zoom = ZOOM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WINDOWImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JzmlPackage.Literals.WINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(String newUnit) {
		String oldUnit = unit;
		unit = newUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__UNIT, oldUnit, unit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(String newX) {
		String oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(String newY) {
		String oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZ() {
		return z;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZ(String newZ) {
		String oldZ = z;
		z = newZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__Z, oldZ, z));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHold() {
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHold(String newHold) {
		String oldHold = hold;
		hold = newHold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__HOLD, oldHold, hold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoldX() {
		return holdX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldX(String newHoldX) {
		String oldHoldX = holdX;
		holdX = newHoldX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__HOLD_X, oldHoldX, holdX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHoldY() {
		return holdY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHoldY(String newHoldY) {
		String oldHoldY = holdY;
		holdY = newHoldY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__HOLD_Y, oldHoldY, holdY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHorizontal() {
		return horizontal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontal(String newHorizontal) {
		String oldHorizontal = horizontal;
		horizontal = newHorizontal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__HORIZONTAL, oldHorizontal, horizontal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSustain() {
		return sustain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSustain(String newSustain) {
		String oldSustain = sustain;
		sustain = newSustain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__SUSTAIN, oldSustain, sustain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(String newGroup) {
		String oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFont() {
		return font;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFont(String newFont) {
		String oldFont = font;
		font = newFont;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__FONT, oldFont, font));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSend() {
		return send;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSend(String newSend) {
		String oldSend = send;
		send = newSend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__SEND, oldSend, send));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(String newSpeed) {
		String oldSpeed = speed;
		speed = newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOscTarget() {
		return oscTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOscTarget(String newOscTarget) {
		String oldOscTarget = oscTarget;
		oscTarget = newOscTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__OSC_TARGET, oldOscTarget, oscTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutline() {
		return outline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutline(String newOutline) {
		String oldOutline = outline;
		outline = newOutline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__OUTLINE, oldOutline, outline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaint() {
		return paint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaint(String newPaint) {
		String oldPaint = paint;
		paint = newPaint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__PAINT, oldPaint, paint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPan() {
		return pan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPan(String newPan) {
		String oldPan = pan;
		pan = newPan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__PAN, oldPan, pan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMidiTarget() {
		return midiTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMidiTarget(String newMidiTarget) {
		String oldMidiTarget = midiTarget;
		midiTarget = newMidiTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__MIDI_TARGET, oldMidiTarget, midiTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(String newMode) {
		String oldMode = mode;
		mode = newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMulticolor() {
		return multicolor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticolor(String newMulticolor) {
		String oldMulticolor = multicolor;
		multicolor = newMulticolor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__MULTICOLOR, oldMulticolor, multicolor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultilabel() {
		return multilabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultilabel(String newMultilabel) {
		String oldMultilabel = multilabel;
		multilabel = newMultilabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__MULTILABEL, oldMultilabel, multilabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKbmouseTarget() {
		return kbmouseTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKbmouseTarget(String newKbmouseTarget) {
		String oldKbmouseTarget = kbmouseTarget;
		kbmouseTarget = newKbmouseTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__KBMOUSE_TARGET, oldKbmouseTarget, kbmouseTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getColumn() {
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColumn(String newColumn) {
		String oldColumn = column;
		column = newColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__COLUMN, oldColumn, column));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConstrained() {
		return constrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstrained(String newConstrained) {
		String oldConstrained = constrained;
		constrained = newConstrained;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__CONSTRAINED, oldConstrained, constrained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__CONTENT, oldContent, content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelOff() {
		return labelOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelOff(String newLabelOff) {
		String oldLabelOff = labelOff;
		labelOff = newLabelOff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__LABEL_OFF, oldLabelOff, labelOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelOn() {
		return labelOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelOn(String newLabelOn) {
		String oldLabelOn = labelOn;
		labelOn = newLabelOn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__LABEL_ON, oldLabelOn, labelOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(String newLight) {
		String oldLight = light;
		light = newLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__LIGHT, oldLight, light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTabbar() {
		return tabbar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabbar(String newTabbar) {
		String oldTabbar = tabbar;
		tabbar = newTabbar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__TABBAR, oldTabbar, tabbar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTension() {
		return tension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTension(String newTension) {
		String oldTension = tension;
		tension = newTension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__TENSION, oldTension, tension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeta(String newMeta) {
		String oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__META, oldMeta, meta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(String newCoordinates) {
		String oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__COORDINATES, oldCoordinates, coordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCursor() {
		return cursor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCursor(String newCursor) {
		String oldCursor = cursor;
		cursor = newCursor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__CURSOR, oldCursor, cursor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDecay() {
		return decay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecay(String newDecay) {
		String oldDecay = decay;
		decay = newDecay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__DECAY, oldDecay, decay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplay(String newDisplay) {
		String oldDisplay = display;
		display = newDisplay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__DISPLAY, oldDisplay, display));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEdit() {
		return edit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEdit(String newEdit) {
		String oldEdit = edit;
		edit = newEdit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__EDIT, oldEdit, edit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(String newEditable) {
		String oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__EDITABLE, oldEditable, editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEphemere() {
		return ephemere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEphemere(String newEphemere) {
		String oldEphemere = ephemere;
		ephemere = newEphemere;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__EPHEMERE, oldEphemere, ephemere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(String newFree) {
		String oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFriction() {
		return friction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriction(String newFriction) {
		String oldFriction = friction;
		friction = newFriction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__FRICTION, oldFriction, friction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGradient() {
		return gradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradient(String newGradient) {
		String oldGradient = gradient;
		gradient = newGradient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__GRADIENT, oldGradient, gradient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(String newGrid) {
		String oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGridSteps() {
		return gridSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGridSteps(String newGridSteps) {
		String oldGridSteps = gridSteps;
		gridSteps = newGridSteps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__GRID_STEPS, oldGridSteps, gridSteps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNbr() {
		return nbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbr(String newNbr) {
		String oldNbr = nbr;
		nbr = newNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__NBR, oldNbr, nbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhysic() {
		return physic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhysic(String newPhysic) {
		String oldPhysic = physic;
		physic = newPhysic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__PHYSIC, oldPhysic, physic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPinch() {
		return pinch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPinch(String newPinch) {
		String oldPinch = pinch;
		pinch = newPinch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__PINCH, oldPinch, pinch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPolyphony() {
		return polyphony;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPolyphony(String newPolyphony) {
		String oldPolyphony = polyphony;
		polyphony = newPolyphony;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__POLYPHONY, oldPolyphony, polyphony));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrecision() {
		return precision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecision(String newPrecision) {
		String oldPrecision = precision;
		precision = newPrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__PRECISION, oldPrecision, precision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRadio() {
		return radio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRadio(String newRadio) {
		String oldRadio = radio;
		radio = newRadio;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__RADIO, oldRadio, radio));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRelease() {
		return release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelease(String newRelease) {
		String oldRelease = release;
		release = newRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__RELEASE, oldRelease, release));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRest() {
		return rest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRest(String newRest) {
		String oldRest = rest;
		rest = newRest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__REST, oldRest, rest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRow() {
		return row;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRow(String newRow) {
		String oldRow = row;
		row = newRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ROW, oldRow, row));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScale(String newScale) {
		String oldScale = scale;
		scale = newScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__SCALE, oldScale, scale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZoom() {
		return zoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZoom(String newZoom) {
		String oldZoom = zoom;
		zoom = newZoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ZOOM, oldZoom, zoom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WINDOW> getWINDOW() {
		if (wINDOW == null) {
			wINDOW = new EObjectContainmentEList<WINDOW>(WINDOW.class, this, JzmlPackage.WINDOW__WINDOW);
		}
		return wINDOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PARAM> getPARAM() {
		if (pARAM == null) {
			pARAM = new EObjectContainmentEList<PARAM>(PARAM.class, this, JzmlPackage.WINDOW__PARAM);
		}
		return pARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VARIABLE> getVARIABLE() {
		if (vARIABLE == null) {
			vARIABLE = new EObjectContainmentEList<VARIABLE>(VARIABLE.class, this, JzmlPackage.WINDOW__VARIABLE);
		}
		return vARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAcceleration() {
		return acceleration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAcceleration(String newAcceleration) {
		String oldAcceleration = acceleration;
		acceleration = newAcceleration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ACCELERATION, oldAcceleration, acceleration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAngle() {
		return angle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAngle(String newAngle) {
		String oldAngle = angle;
		angle = newAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ANGLE, oldAngle, angle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttack() {
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttack(String newAttack) {
		String oldAttack = attack;
		attack = newAttack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ATTACK, oldAttack, attack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttraction() {
		return attraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttraction(String newAttraction) {
		String oldAttraction = attraction;
		attraction = newAttraction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ATTRACTION, oldAttraction, attraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttractionX() {
		return attractionX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttractionX(String newAttractionX) {
		String oldAttractionX = attractionX;
		attractionX = newAttractionX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ATTRACTION_X, oldAttractionX, attractionX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttractionY() {
		return attractionY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttractionY(String newAttractionY) {
		String oldAttractionY = attractionY;
		attractionY = newAttractionY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ATTRACTION_Y, oldAttractionY, attractionY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(String newAxis) {
		String oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBalls() {
		return balls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalls(String newBalls) {
		String oldBalls = balls;
		balls = newBalls;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__BALLS, oldBalls, balls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBargraph() {
		return bargraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBargraph(String newBargraph) {
		String oldBargraph = bargraph;
		bargraph = newBargraph;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__BARGRAPH, oldBargraph, bargraph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(String newBehavior) {
		String oldBehavior = behavior;
		behavior = newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBipolar() {
		return bipolar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBipolar(String newBipolar) {
		String oldBipolar = bipolar;
		bipolar = newBipolar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__BIPOLAR, oldBipolar, bipolar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBitmap() {
		return bitmap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitmap(String newBitmap) {
		String oldBitmap = bitmap;
		bitmap = newBitmap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__BITMAP, oldBitmap, bitmap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBoundaries() {
		return boundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoundaries(String newBoundaries) {
		String oldBoundaries = boundaries;
		boundaries = newBoundaries;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__BOUNDARIES, oldBoundaries, boundaries));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapture() {
		return capture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapture(String newCapture) {
		String oldCapture = capture;
		capture = newCapture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__CAPTURE, oldCapture, capture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JzmlPackage.WINDOW__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JzmlPackage.WINDOW__WINDOW:
				return ((InternalEList<?>)getWINDOW()).basicRemove(otherEnd, msgs);
			case JzmlPackage.WINDOW__PARAM:
				return ((InternalEList<?>)getPARAM()).basicRemove(otherEnd, msgs);
			case JzmlPackage.WINDOW__VARIABLE:
				return ((InternalEList<?>)getVARIABLE()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JzmlPackage.WINDOW__WINDOW:
				return getWINDOW();
			case JzmlPackage.WINDOW__PARAM:
				return getPARAM();
			case JzmlPackage.WINDOW__VARIABLE:
				return getVARIABLE();
			case JzmlPackage.WINDOW__ACCELERATION:
				return getAcceleration();
			case JzmlPackage.WINDOW__ANGLE:
				return getAngle();
			case JzmlPackage.WINDOW__ATTACK:
				return getAttack();
			case JzmlPackage.WINDOW__ATTRACTION:
				return getAttraction();
			case JzmlPackage.WINDOW__ATTRACTION_X:
				return getAttractionX();
			case JzmlPackage.WINDOW__ATTRACTION_Y:
				return getAttractionY();
			case JzmlPackage.WINDOW__AXIS:
				return getAxis();
			case JzmlPackage.WINDOW__BALLS:
				return getBalls();
			case JzmlPackage.WINDOW__BARGRAPH:
				return getBargraph();
			case JzmlPackage.WINDOW__BEHAVIOR:
				return getBehavior();
			case JzmlPackage.WINDOW__BIPOLAR:
				return getBipolar();
			case JzmlPackage.WINDOW__BITMAP:
				return getBitmap();
			case JzmlPackage.WINDOW__BOUNDARIES:
				return getBoundaries();
			case JzmlPackage.WINDOW__CAPTURE:
				return getCapture();
			case JzmlPackage.WINDOW__CLASS:
				return getClass_();
			case JzmlPackage.WINDOW__COLOR:
				return getColor();
			case JzmlPackage.WINDOW__COLUMN:
				return getColumn();
			case JzmlPackage.WINDOW__CONSTRAINED:
				return getConstrained();
			case JzmlPackage.WINDOW__CONTENT:
				return getContent();
			case JzmlPackage.WINDOW__COORDINATES:
				return getCoordinates();
			case JzmlPackage.WINDOW__CURSOR:
				return getCursor();
			case JzmlPackage.WINDOW__DECAY:
				return getDecay();
			case JzmlPackage.WINDOW__DISPLAY:
				return getDisplay();
			case JzmlPackage.WINDOW__EDIT:
				return getEdit();
			case JzmlPackage.WINDOW__EDITABLE:
				return getEditable();
			case JzmlPackage.WINDOW__EPHEMERE:
				return getEphemere();
			case JzmlPackage.WINDOW__FONT:
				return getFont();
			case JzmlPackage.WINDOW__FREE:
				return getFree();
			case JzmlPackage.WINDOW__FRICTION:
				return getFriction();
			case JzmlPackage.WINDOW__GRADIENT:
				return getGradient();
			case JzmlPackage.WINDOW__GRID:
				return getGrid();
			case JzmlPackage.WINDOW__GRID_STEPS:
				return getGridSteps();
			case JzmlPackage.WINDOW__GROUP:
				return getGroup();
			case JzmlPackage.WINDOW__HEIGHT:
				return getHeight();
			case JzmlPackage.WINDOW__HOLD:
				return getHold();
			case JzmlPackage.WINDOW__HOLD_X:
				return getHoldX();
			case JzmlPackage.WINDOW__HOLD_Y:
				return getHoldY();
			case JzmlPackage.WINDOW__HORIZONTAL:
				return getHorizontal();
			case JzmlPackage.WINDOW__ID:
				return getId();
			case JzmlPackage.WINDOW__KBMOUSE_TARGET:
				return getKbmouseTarget();
			case JzmlPackage.WINDOW__LABEL:
				return getLabel();
			case JzmlPackage.WINDOW__LABEL_OFF:
				return getLabelOff();
			case JzmlPackage.WINDOW__LABEL_ON:
				return getLabelOn();
			case JzmlPackage.WINDOW__LIGHT:
				return getLight();
			case JzmlPackage.WINDOW__META:
				return getMeta();
			case JzmlPackage.WINDOW__MIDI_TARGET:
				return getMidiTarget();
			case JzmlPackage.WINDOW__MODE:
				return getMode();
			case JzmlPackage.WINDOW__MULTICOLOR:
				return getMulticolor();
			case JzmlPackage.WINDOW__MULTILABEL:
				return getMultilabel();
			case JzmlPackage.WINDOW__NBR:
				return getNbr();
			case JzmlPackage.WINDOW__OSC_TARGET:
				return getOscTarget();
			case JzmlPackage.WINDOW__OUTLINE:
				return getOutline();
			case JzmlPackage.WINDOW__PAINT:
				return getPaint();
			case JzmlPackage.WINDOW__PAN:
				return getPan();
			case JzmlPackage.WINDOW__PHYSIC:
				return getPhysic();
			case JzmlPackage.WINDOW__PINCH:
				return getPinch();
			case JzmlPackage.WINDOW__POLYPHONY:
				return getPolyphony();
			case JzmlPackage.WINDOW__PRECISION:
				return getPrecision();
			case JzmlPackage.WINDOW__RADIO:
				return getRadio();
			case JzmlPackage.WINDOW__RELEASE:
				return getRelease();
			case JzmlPackage.WINDOW__REST:
				return getRest();
			case JzmlPackage.WINDOW__ROW:
				return getRow();
			case JzmlPackage.WINDOW__SCALE:
				return getScale();
			case JzmlPackage.WINDOW__SEND:
				return getSend();
			case JzmlPackage.WINDOW__SPEED:
				return getSpeed();
			case JzmlPackage.WINDOW__STATE:
				return getState();
			case JzmlPackage.WINDOW__SUSTAIN:
				return getSustain();
			case JzmlPackage.WINDOW__TABBAR:
				return getTabbar();
			case JzmlPackage.WINDOW__TARGET:
				return getTarget();
			case JzmlPackage.WINDOW__TENSION:
				return getTension();
			case JzmlPackage.WINDOW__TEXT:
				return getText();
			case JzmlPackage.WINDOW__UNIT:
				return getUnit();
			case JzmlPackage.WINDOW__VALUE:
				return getValue();
			case JzmlPackage.WINDOW__WIDTH:
				return getWidth();
			case JzmlPackage.WINDOW__X:
				return getX();
			case JzmlPackage.WINDOW__Y:
				return getY();
			case JzmlPackage.WINDOW__Z:
				return getZ();
			case JzmlPackage.WINDOW__ZOOM:
				return getZoom();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JzmlPackage.WINDOW__WINDOW:
				getWINDOW().clear();
				getWINDOW().addAll((Collection<? extends WINDOW>)newValue);
				return;
			case JzmlPackage.WINDOW__PARAM:
				getPARAM().clear();
				getPARAM().addAll((Collection<? extends PARAM>)newValue);
				return;
			case JzmlPackage.WINDOW__VARIABLE:
				getVARIABLE().clear();
				getVARIABLE().addAll((Collection<? extends VARIABLE>)newValue);
				return;
			case JzmlPackage.WINDOW__ACCELERATION:
				setAcceleration((String)newValue);
				return;
			case JzmlPackage.WINDOW__ANGLE:
				setAngle((String)newValue);
				return;
			case JzmlPackage.WINDOW__ATTACK:
				setAttack((String)newValue);
				return;
			case JzmlPackage.WINDOW__ATTRACTION:
				setAttraction((String)newValue);
				return;
			case JzmlPackage.WINDOW__ATTRACTION_X:
				setAttractionX((String)newValue);
				return;
			case JzmlPackage.WINDOW__ATTRACTION_Y:
				setAttractionY((String)newValue);
				return;
			case JzmlPackage.WINDOW__AXIS:
				setAxis((String)newValue);
				return;
			case JzmlPackage.WINDOW__BALLS:
				setBalls((String)newValue);
				return;
			case JzmlPackage.WINDOW__BARGRAPH:
				setBargraph((String)newValue);
				return;
			case JzmlPackage.WINDOW__BEHAVIOR:
				setBehavior((String)newValue);
				return;
			case JzmlPackage.WINDOW__BIPOLAR:
				setBipolar((String)newValue);
				return;
			case JzmlPackage.WINDOW__BITMAP:
				setBitmap((String)newValue);
				return;
			case JzmlPackage.WINDOW__BOUNDARIES:
				setBoundaries((String)newValue);
				return;
			case JzmlPackage.WINDOW__CAPTURE:
				setCapture((String)newValue);
				return;
			case JzmlPackage.WINDOW__CLASS:
				setClass((String)newValue);
				return;
			case JzmlPackage.WINDOW__COLOR:
				setColor((String)newValue);
				return;
			case JzmlPackage.WINDOW__COLUMN:
				setColumn((String)newValue);
				return;
			case JzmlPackage.WINDOW__CONSTRAINED:
				setConstrained((String)newValue);
				return;
			case JzmlPackage.WINDOW__CONTENT:
				setContent((String)newValue);
				return;
			case JzmlPackage.WINDOW__COORDINATES:
				setCoordinates((String)newValue);
				return;
			case JzmlPackage.WINDOW__CURSOR:
				setCursor((String)newValue);
				return;
			case JzmlPackage.WINDOW__DECAY:
				setDecay((String)newValue);
				return;
			case JzmlPackage.WINDOW__DISPLAY:
				setDisplay((String)newValue);
				return;
			case JzmlPackage.WINDOW__EDIT:
				setEdit((String)newValue);
				return;
			case JzmlPackage.WINDOW__EDITABLE:
				setEditable((String)newValue);
				return;
			case JzmlPackage.WINDOW__EPHEMERE:
				setEphemere((String)newValue);
				return;
			case JzmlPackage.WINDOW__FONT:
				setFont((String)newValue);
				return;
			case JzmlPackage.WINDOW__FREE:
				setFree((String)newValue);
				return;
			case JzmlPackage.WINDOW__FRICTION:
				setFriction((String)newValue);
				return;
			case JzmlPackage.WINDOW__GRADIENT:
				setGradient((String)newValue);
				return;
			case JzmlPackage.WINDOW__GRID:
				setGrid((String)newValue);
				return;
			case JzmlPackage.WINDOW__GRID_STEPS:
				setGridSteps((String)newValue);
				return;
			case JzmlPackage.WINDOW__GROUP:
				setGroup((String)newValue);
				return;
			case JzmlPackage.WINDOW__HEIGHT:
				setHeight((String)newValue);
				return;
			case JzmlPackage.WINDOW__HOLD:
				setHold((String)newValue);
				return;
			case JzmlPackage.WINDOW__HOLD_X:
				setHoldX((String)newValue);
				return;
			case JzmlPackage.WINDOW__HOLD_Y:
				setHoldY((String)newValue);
				return;
			case JzmlPackage.WINDOW__HORIZONTAL:
				setHorizontal((String)newValue);
				return;
			case JzmlPackage.WINDOW__ID:
				setId((String)newValue);
				return;
			case JzmlPackage.WINDOW__KBMOUSE_TARGET:
				setKbmouseTarget((String)newValue);
				return;
			case JzmlPackage.WINDOW__LABEL:
				setLabel((String)newValue);
				return;
			case JzmlPackage.WINDOW__LABEL_OFF:
				setLabelOff((String)newValue);
				return;
			case JzmlPackage.WINDOW__LABEL_ON:
				setLabelOn((String)newValue);
				return;
			case JzmlPackage.WINDOW__LIGHT:
				setLight((String)newValue);
				return;
			case JzmlPackage.WINDOW__META:
				setMeta((String)newValue);
				return;
			case JzmlPackage.WINDOW__MIDI_TARGET:
				setMidiTarget((String)newValue);
				return;
			case JzmlPackage.WINDOW__MODE:
				setMode((String)newValue);
				return;
			case JzmlPackage.WINDOW__MULTICOLOR:
				setMulticolor((String)newValue);
				return;
			case JzmlPackage.WINDOW__MULTILABEL:
				setMultilabel((String)newValue);
				return;
			case JzmlPackage.WINDOW__NBR:
				setNbr((String)newValue);
				return;
			case JzmlPackage.WINDOW__OSC_TARGET:
				setOscTarget((String)newValue);
				return;
			case JzmlPackage.WINDOW__OUTLINE:
				setOutline((String)newValue);
				return;
			case JzmlPackage.WINDOW__PAINT:
				setPaint((String)newValue);
				return;
			case JzmlPackage.WINDOW__PAN:
				setPan((String)newValue);
				return;
			case JzmlPackage.WINDOW__PHYSIC:
				setPhysic((String)newValue);
				return;
			case JzmlPackage.WINDOW__PINCH:
				setPinch((String)newValue);
				return;
			case JzmlPackage.WINDOW__POLYPHONY:
				setPolyphony((String)newValue);
				return;
			case JzmlPackage.WINDOW__PRECISION:
				setPrecision((String)newValue);
				return;
			case JzmlPackage.WINDOW__RADIO:
				setRadio((String)newValue);
				return;
			case JzmlPackage.WINDOW__RELEASE:
				setRelease((String)newValue);
				return;
			case JzmlPackage.WINDOW__REST:
				setRest((String)newValue);
				return;
			case JzmlPackage.WINDOW__ROW:
				setRow((String)newValue);
				return;
			case JzmlPackage.WINDOW__SCALE:
				setScale((String)newValue);
				return;
			case JzmlPackage.WINDOW__SEND:
				setSend((String)newValue);
				return;
			case JzmlPackage.WINDOW__SPEED:
				setSpeed((String)newValue);
				return;
			case JzmlPackage.WINDOW__STATE:
				setState((String)newValue);
				return;
			case JzmlPackage.WINDOW__SUSTAIN:
				setSustain((String)newValue);
				return;
			case JzmlPackage.WINDOW__TABBAR:
				setTabbar((String)newValue);
				return;
			case JzmlPackage.WINDOW__TARGET:
				setTarget((String)newValue);
				return;
			case JzmlPackage.WINDOW__TENSION:
				setTension((String)newValue);
				return;
			case JzmlPackage.WINDOW__TEXT:
				setText((String)newValue);
				return;
			case JzmlPackage.WINDOW__UNIT:
				setUnit((String)newValue);
				return;
			case JzmlPackage.WINDOW__VALUE:
				setValue((String)newValue);
				return;
			case JzmlPackage.WINDOW__WIDTH:
				setWidth((String)newValue);
				return;
			case JzmlPackage.WINDOW__X:
				setX((String)newValue);
				return;
			case JzmlPackage.WINDOW__Y:
				setY((String)newValue);
				return;
			case JzmlPackage.WINDOW__Z:
				setZ((String)newValue);
				return;
			case JzmlPackage.WINDOW__ZOOM:
				setZoom((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JzmlPackage.WINDOW__WINDOW:
				getWINDOW().clear();
				return;
			case JzmlPackage.WINDOW__PARAM:
				getPARAM().clear();
				return;
			case JzmlPackage.WINDOW__VARIABLE:
				getVARIABLE().clear();
				return;
			case JzmlPackage.WINDOW__ACCELERATION:
				setAcceleration(ACCELERATION_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ANGLE:
				setAngle(ANGLE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ATTACK:
				setAttack(ATTACK_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ATTRACTION:
				setAttraction(ATTRACTION_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ATTRACTION_X:
				setAttractionX(ATTRACTION_X_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ATTRACTION_Y:
				setAttractionY(ATTRACTION_Y_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__BALLS:
				setBalls(BALLS_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__BARGRAPH:
				setBargraph(BARGRAPH_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__BIPOLAR:
				setBipolar(BIPOLAR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__BITMAP:
				setBitmap(BITMAP_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__BOUNDARIES:
				setBoundaries(BOUNDARIES_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__CAPTURE:
				setCapture(CAPTURE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__COLUMN:
				setColumn(COLUMN_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__CONSTRAINED:
				setConstrained(CONSTRAINED_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__CONTENT:
				setContent(CONTENT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__COORDINATES:
				setCoordinates(COORDINATES_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__CURSOR:
				setCursor(CURSOR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__DECAY:
				setDecay(DECAY_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__DISPLAY:
				setDisplay(DISPLAY_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__EDIT:
				setEdit(EDIT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__EDITABLE:
				setEditable(EDITABLE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__EPHEMERE:
				setEphemere(EPHEMERE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__FONT:
				setFont(FONT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__FRICTION:
				setFriction(FRICTION_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__GRADIENT:
				setGradient(GRADIENT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__GRID:
				setGrid(GRID_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__GRID_STEPS:
				setGridSteps(GRID_STEPS_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__GROUP:
				setGroup(GROUP_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__HOLD:
				setHold(HOLD_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__HOLD_X:
				setHoldX(HOLD_X_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__HOLD_Y:
				setHoldY(HOLD_Y_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__HORIZONTAL:
				setHorizontal(HORIZONTAL_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ID:
				setId(ID_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__KBMOUSE_TARGET:
				setKbmouseTarget(KBMOUSE_TARGET_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__LABEL_OFF:
				setLabelOff(LABEL_OFF_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__LABEL_ON:
				setLabelOn(LABEL_ON_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__LIGHT:
				setLight(LIGHT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__META:
				setMeta(META_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__MIDI_TARGET:
				setMidiTarget(MIDI_TARGET_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__MULTICOLOR:
				setMulticolor(MULTICOLOR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__MULTILABEL:
				setMultilabel(MULTILABEL_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__NBR:
				setNbr(NBR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__OSC_TARGET:
				setOscTarget(OSC_TARGET_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__OUTLINE:
				setOutline(OUTLINE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__PAINT:
				setPaint(PAINT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__PAN:
				setPan(PAN_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__PHYSIC:
				setPhysic(PHYSIC_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__PINCH:
				setPinch(PINCH_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__POLYPHONY:
				setPolyphony(POLYPHONY_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__RADIO:
				setRadio(RADIO_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__RELEASE:
				setRelease(RELEASE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__REST:
				setRest(REST_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ROW:
				setRow(ROW_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__SCALE:
				setScale(SCALE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__SEND:
				setSend(SEND_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__STATE:
				setState(STATE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__SUSTAIN:
				setSustain(SUSTAIN_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__TABBAR:
				setTabbar(TABBAR_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__TENSION:
				setTension(TENSION_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__UNIT:
				setUnit(UNIT_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__X:
				setX(X_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__Y:
				setY(Y_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__Z:
				setZ(Z_EDEFAULT);
				return;
			case JzmlPackage.WINDOW__ZOOM:
				setZoom(ZOOM_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JzmlPackage.WINDOW__WINDOW:
				return wINDOW != null && !wINDOW.isEmpty();
			case JzmlPackage.WINDOW__PARAM:
				return pARAM != null && !pARAM.isEmpty();
			case JzmlPackage.WINDOW__VARIABLE:
				return vARIABLE != null && !vARIABLE.isEmpty();
			case JzmlPackage.WINDOW__ACCELERATION:
				return ACCELERATION_EDEFAULT == null ? acceleration != null : !ACCELERATION_EDEFAULT.equals(acceleration);
			case JzmlPackage.WINDOW__ANGLE:
				return ANGLE_EDEFAULT == null ? angle != null : !ANGLE_EDEFAULT.equals(angle);
			case JzmlPackage.WINDOW__ATTACK:
				return ATTACK_EDEFAULT == null ? attack != null : !ATTACK_EDEFAULT.equals(attack);
			case JzmlPackage.WINDOW__ATTRACTION:
				return ATTRACTION_EDEFAULT == null ? attraction != null : !ATTRACTION_EDEFAULT.equals(attraction);
			case JzmlPackage.WINDOW__ATTRACTION_X:
				return ATTRACTION_X_EDEFAULT == null ? attractionX != null : !ATTRACTION_X_EDEFAULT.equals(attractionX);
			case JzmlPackage.WINDOW__ATTRACTION_Y:
				return ATTRACTION_Y_EDEFAULT == null ? attractionY != null : !ATTRACTION_Y_EDEFAULT.equals(attractionY);
			case JzmlPackage.WINDOW__AXIS:
				return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
			case JzmlPackage.WINDOW__BALLS:
				return BALLS_EDEFAULT == null ? balls != null : !BALLS_EDEFAULT.equals(balls);
			case JzmlPackage.WINDOW__BARGRAPH:
				return BARGRAPH_EDEFAULT == null ? bargraph != null : !BARGRAPH_EDEFAULT.equals(bargraph);
			case JzmlPackage.WINDOW__BEHAVIOR:
				return BEHAVIOR_EDEFAULT == null ? behavior != null : !BEHAVIOR_EDEFAULT.equals(behavior);
			case JzmlPackage.WINDOW__BIPOLAR:
				return BIPOLAR_EDEFAULT == null ? bipolar != null : !BIPOLAR_EDEFAULT.equals(bipolar);
			case JzmlPackage.WINDOW__BITMAP:
				return BITMAP_EDEFAULT == null ? bitmap != null : !BITMAP_EDEFAULT.equals(bitmap);
			case JzmlPackage.WINDOW__BOUNDARIES:
				return BOUNDARIES_EDEFAULT == null ? boundaries != null : !BOUNDARIES_EDEFAULT.equals(boundaries);
			case JzmlPackage.WINDOW__CAPTURE:
				return CAPTURE_EDEFAULT == null ? capture != null : !CAPTURE_EDEFAULT.equals(capture);
			case JzmlPackage.WINDOW__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case JzmlPackage.WINDOW__COLOR:
				return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
			case JzmlPackage.WINDOW__COLUMN:
				return COLUMN_EDEFAULT == null ? column != null : !COLUMN_EDEFAULT.equals(column);
			case JzmlPackage.WINDOW__CONSTRAINED:
				return CONSTRAINED_EDEFAULT == null ? constrained != null : !CONSTRAINED_EDEFAULT.equals(constrained);
			case JzmlPackage.WINDOW__CONTENT:
				return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
			case JzmlPackage.WINDOW__COORDINATES:
				return COORDINATES_EDEFAULT == null ? coordinates != null : !COORDINATES_EDEFAULT.equals(coordinates);
			case JzmlPackage.WINDOW__CURSOR:
				return CURSOR_EDEFAULT == null ? cursor != null : !CURSOR_EDEFAULT.equals(cursor);
			case JzmlPackage.WINDOW__DECAY:
				return DECAY_EDEFAULT == null ? decay != null : !DECAY_EDEFAULT.equals(decay);
			case JzmlPackage.WINDOW__DISPLAY:
				return DISPLAY_EDEFAULT == null ? display != null : !DISPLAY_EDEFAULT.equals(display);
			case JzmlPackage.WINDOW__EDIT:
				return EDIT_EDEFAULT == null ? edit != null : !EDIT_EDEFAULT.equals(edit);
			case JzmlPackage.WINDOW__EDITABLE:
				return EDITABLE_EDEFAULT == null ? editable != null : !EDITABLE_EDEFAULT.equals(editable);
			case JzmlPackage.WINDOW__EPHEMERE:
				return EPHEMERE_EDEFAULT == null ? ephemere != null : !EPHEMERE_EDEFAULT.equals(ephemere);
			case JzmlPackage.WINDOW__FONT:
				return FONT_EDEFAULT == null ? font != null : !FONT_EDEFAULT.equals(font);
			case JzmlPackage.WINDOW__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
			case JzmlPackage.WINDOW__FRICTION:
				return FRICTION_EDEFAULT == null ? friction != null : !FRICTION_EDEFAULT.equals(friction);
			case JzmlPackage.WINDOW__GRADIENT:
				return GRADIENT_EDEFAULT == null ? gradient != null : !GRADIENT_EDEFAULT.equals(gradient);
			case JzmlPackage.WINDOW__GRID:
				return GRID_EDEFAULT == null ? grid != null : !GRID_EDEFAULT.equals(grid);
			case JzmlPackage.WINDOW__GRID_STEPS:
				return GRID_STEPS_EDEFAULT == null ? gridSteps != null : !GRID_STEPS_EDEFAULT.equals(gridSteps);
			case JzmlPackage.WINDOW__GROUP:
				return GROUP_EDEFAULT == null ? group != null : !GROUP_EDEFAULT.equals(group);
			case JzmlPackage.WINDOW__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case JzmlPackage.WINDOW__HOLD:
				return HOLD_EDEFAULT == null ? hold != null : !HOLD_EDEFAULT.equals(hold);
			case JzmlPackage.WINDOW__HOLD_X:
				return HOLD_X_EDEFAULT == null ? holdX != null : !HOLD_X_EDEFAULT.equals(holdX);
			case JzmlPackage.WINDOW__HOLD_Y:
				return HOLD_Y_EDEFAULT == null ? holdY != null : !HOLD_Y_EDEFAULT.equals(holdY);
			case JzmlPackage.WINDOW__HORIZONTAL:
				return HORIZONTAL_EDEFAULT == null ? horizontal != null : !HORIZONTAL_EDEFAULT.equals(horizontal);
			case JzmlPackage.WINDOW__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case JzmlPackage.WINDOW__KBMOUSE_TARGET:
				return KBMOUSE_TARGET_EDEFAULT == null ? kbmouseTarget != null : !KBMOUSE_TARGET_EDEFAULT.equals(kbmouseTarget);
			case JzmlPackage.WINDOW__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case JzmlPackage.WINDOW__LABEL_OFF:
				return LABEL_OFF_EDEFAULT == null ? labelOff != null : !LABEL_OFF_EDEFAULT.equals(labelOff);
			case JzmlPackage.WINDOW__LABEL_ON:
				return LABEL_ON_EDEFAULT == null ? labelOn != null : !LABEL_ON_EDEFAULT.equals(labelOn);
			case JzmlPackage.WINDOW__LIGHT:
				return LIGHT_EDEFAULT == null ? light != null : !LIGHT_EDEFAULT.equals(light);
			case JzmlPackage.WINDOW__META:
				return META_EDEFAULT == null ? meta != null : !META_EDEFAULT.equals(meta);
			case JzmlPackage.WINDOW__MIDI_TARGET:
				return MIDI_TARGET_EDEFAULT == null ? midiTarget != null : !MIDI_TARGET_EDEFAULT.equals(midiTarget);
			case JzmlPackage.WINDOW__MODE:
				return MODE_EDEFAULT == null ? mode != null : !MODE_EDEFAULT.equals(mode);
			case JzmlPackage.WINDOW__MULTICOLOR:
				return MULTICOLOR_EDEFAULT == null ? multicolor != null : !MULTICOLOR_EDEFAULT.equals(multicolor);
			case JzmlPackage.WINDOW__MULTILABEL:
				return MULTILABEL_EDEFAULT == null ? multilabel != null : !MULTILABEL_EDEFAULT.equals(multilabel);
			case JzmlPackage.WINDOW__NBR:
				return NBR_EDEFAULT == null ? nbr != null : !NBR_EDEFAULT.equals(nbr);
			case JzmlPackage.WINDOW__OSC_TARGET:
				return OSC_TARGET_EDEFAULT == null ? oscTarget != null : !OSC_TARGET_EDEFAULT.equals(oscTarget);
			case JzmlPackage.WINDOW__OUTLINE:
				return OUTLINE_EDEFAULT == null ? outline != null : !OUTLINE_EDEFAULT.equals(outline);
			case JzmlPackage.WINDOW__PAINT:
				return PAINT_EDEFAULT == null ? paint != null : !PAINT_EDEFAULT.equals(paint);
			case JzmlPackage.WINDOW__PAN:
				return PAN_EDEFAULT == null ? pan != null : !PAN_EDEFAULT.equals(pan);
			case JzmlPackage.WINDOW__PHYSIC:
				return PHYSIC_EDEFAULT == null ? physic != null : !PHYSIC_EDEFAULT.equals(physic);
			case JzmlPackage.WINDOW__PINCH:
				return PINCH_EDEFAULT == null ? pinch != null : !PINCH_EDEFAULT.equals(pinch);
			case JzmlPackage.WINDOW__POLYPHONY:
				return POLYPHONY_EDEFAULT == null ? polyphony != null : !POLYPHONY_EDEFAULT.equals(polyphony);
			case JzmlPackage.WINDOW__PRECISION:
				return PRECISION_EDEFAULT == null ? precision != null : !PRECISION_EDEFAULT.equals(precision);
			case JzmlPackage.WINDOW__RADIO:
				return RADIO_EDEFAULT == null ? radio != null : !RADIO_EDEFAULT.equals(radio);
			case JzmlPackage.WINDOW__RELEASE:
				return RELEASE_EDEFAULT == null ? release != null : !RELEASE_EDEFAULT.equals(release);
			case JzmlPackage.WINDOW__REST:
				return REST_EDEFAULT == null ? rest != null : !REST_EDEFAULT.equals(rest);
			case JzmlPackage.WINDOW__ROW:
				return ROW_EDEFAULT == null ? row != null : !ROW_EDEFAULT.equals(row);
			case JzmlPackage.WINDOW__SCALE:
				return SCALE_EDEFAULT == null ? scale != null : !SCALE_EDEFAULT.equals(scale);
			case JzmlPackage.WINDOW__SEND:
				return SEND_EDEFAULT == null ? send != null : !SEND_EDEFAULT.equals(send);
			case JzmlPackage.WINDOW__SPEED:
				return SPEED_EDEFAULT == null ? speed != null : !SPEED_EDEFAULT.equals(speed);
			case JzmlPackage.WINDOW__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case JzmlPackage.WINDOW__SUSTAIN:
				return SUSTAIN_EDEFAULT == null ? sustain != null : !SUSTAIN_EDEFAULT.equals(sustain);
			case JzmlPackage.WINDOW__TABBAR:
				return TABBAR_EDEFAULT == null ? tabbar != null : !TABBAR_EDEFAULT.equals(tabbar);
			case JzmlPackage.WINDOW__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case JzmlPackage.WINDOW__TENSION:
				return TENSION_EDEFAULT == null ? tension != null : !TENSION_EDEFAULT.equals(tension);
			case JzmlPackage.WINDOW__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case JzmlPackage.WINDOW__UNIT:
				return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
			case JzmlPackage.WINDOW__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case JzmlPackage.WINDOW__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case JzmlPackage.WINDOW__X:
				return X_EDEFAULT == null ? x != null : !X_EDEFAULT.equals(x);
			case JzmlPackage.WINDOW__Y:
				return Y_EDEFAULT == null ? y != null : !Y_EDEFAULT.equals(y);
			case JzmlPackage.WINDOW__Z:
				return Z_EDEFAULT == null ? z != null : !Z_EDEFAULT.equals(z);
			case JzmlPackage.WINDOW__ZOOM:
				return ZOOM_EDEFAULT == null ? zoom != null : !ZOOM_EDEFAULT.equals(zoom);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (acceleration: ");
		result.append(acceleration);
		result.append(", angle: ");
		result.append(angle);
		result.append(", attack: ");
		result.append(attack);
		result.append(", attraction: ");
		result.append(attraction);
		result.append(", attractionX: ");
		result.append(attractionX);
		result.append(", attractionY: ");
		result.append(attractionY);
		result.append(", axis: ");
		result.append(axis);
		result.append(", balls: ");
		result.append(balls);
		result.append(", bargraph: ");
		result.append(bargraph);
		result.append(", behavior: ");
		result.append(behavior);
		result.append(", bipolar: ");
		result.append(bipolar);
		result.append(", bitmap: ");
		result.append(bitmap);
		result.append(", boundaries: ");
		result.append(boundaries);
		result.append(", capture: ");
		result.append(capture);
		result.append(", class: ");
		result.append(class_);
		result.append(", color: ");
		result.append(color);
		result.append(", column: ");
		result.append(column);
		result.append(", constrained: ");
		result.append(constrained);
		result.append(", content: ");
		result.append(content);
		result.append(", coordinates: ");
		result.append(coordinates);
		result.append(", cursor: ");
		result.append(cursor);
		result.append(", decay: ");
		result.append(decay);
		result.append(", display: ");
		result.append(display);
		result.append(", edit: ");
		result.append(edit);
		result.append(", editable: ");
		result.append(editable);
		result.append(", ephemere: ");
		result.append(ephemere);
		result.append(", font: ");
		result.append(font);
		result.append(", free: ");
		result.append(free);
		result.append(", friction: ");
		result.append(friction);
		result.append(", gradient: ");
		result.append(gradient);
		result.append(", grid: ");
		result.append(grid);
		result.append(", gridSteps: ");
		result.append(gridSteps);
		result.append(", group: ");
		result.append(group);
		result.append(", height: ");
		result.append(height);
		result.append(", hold: ");
		result.append(hold);
		result.append(", holdX: ");
		result.append(holdX);
		result.append(", holdY: ");
		result.append(holdY);
		result.append(", horizontal: ");
		result.append(horizontal);
		result.append(", id: ");
		result.append(id);
		result.append(", kbmouseTarget: ");
		result.append(kbmouseTarget);
		result.append(", label: ");
		result.append(label);
		result.append(", labelOff: ");
		result.append(labelOff);
		result.append(", labelOn: ");
		result.append(labelOn);
		result.append(", light: ");
		result.append(light);
		result.append(", meta: ");
		result.append(meta);
		result.append(", midiTarget: ");
		result.append(midiTarget);
		result.append(", mode: ");
		result.append(mode);
		result.append(", multicolor: ");
		result.append(multicolor);
		result.append(", multilabel: ");
		result.append(multilabel);
		result.append(", nbr: ");
		result.append(nbr);
		result.append(", oscTarget: ");
		result.append(oscTarget);
		result.append(", outline: ");
		result.append(outline);
		result.append(", paint: ");
		result.append(paint);
		result.append(", pan: ");
		result.append(pan);
		result.append(", physic: ");
		result.append(physic);
		result.append(", pinch: ");
		result.append(pinch);
		result.append(", polyphony: ");
		result.append(polyphony);
		result.append(", precision: ");
		result.append(precision);
		result.append(", radio: ");
		result.append(radio);
		result.append(", release: ");
		result.append(release);
		result.append(", rest: ");
		result.append(rest);
		result.append(", row: ");
		result.append(row);
		result.append(", scale: ");
		result.append(scale);
		result.append(", send: ");
		result.append(send);
		result.append(", speed: ");
		result.append(speed);
		result.append(", state: ");
		result.append(state);
		result.append(", sustain: ");
		result.append(sustain);
		result.append(", tabbar: ");
		result.append(tabbar);
		result.append(", target: ");
		result.append(target);
		result.append(", tension: ");
		result.append(tension);
		result.append(", text: ");
		result.append(text);
		result.append(", unit: ");
		result.append(unit);
		result.append(", value: ");
		result.append(value);
		result.append(", width: ");
		result.append(width);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", z: ");
		result.append(z);
		result.append(", zoom: ");
		result.append(zoom);
		result.append(')');
		return result.toString();
	}

} //WINDOWImpl
