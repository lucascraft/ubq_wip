/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OSCUSB Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getProto <em>Proto</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getSpeed <em>Speed</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCUSBTarget()
 * @model
 * @generated
 */
public interface OSCUSBTarget extends EObject
{
  /**
   * Returns the value of the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proto</em>' attribute.
   * @see #setProto(String)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCUSBTarget_Proto()
   * @model
   * @generated
   */
  String getProto();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getProto <em>Proto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proto</em>' attribute.
   * @see #getProto()
   * @generated
   */
  void setProto(String value);

  /**
   * Returns the value of the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr</em>' attribute.
   * @see #setAddr(String)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCUSBTarget_Addr()
   * @model
   * @generated
   */
  String getAddr();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getAddr <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr</em>' attribute.
   * @see #getAddr()
   * @generated
   */
  void setAddr(String value);

  /**
   * Returns the value of the '<em><b>Speed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Speed</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Speed</em>' containment reference.
   * @see #setSpeed(Speed)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCUSBTarget_Speed()
   * @model containment="true"
   * @generated
   */
  Speed getSpeed();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getSpeed <em>Speed</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Speed</em>' containment reference.
   * @see #getSpeed()
   * @generated
   */
  void setSpeed(Speed value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * The literals are from the enumeration {@link net.sf.smbt.osc.oscDsl.EzFormats}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see net.sf.smbt.osc.oscDsl.EzFormats
   * @see #setFormat(EzFormats)
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#getOSCUSBTarget_Format()
   * @model
   * @generated
   */
  EzFormats getFormat();

  /**
   * Sets the value of the '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see net.sf.smbt.osc.oscDsl.EzFormats
   * @see #getFormat()
   * @generated
   */
  void setFormat(EzFormats value);

} // OSCUSBTarget
