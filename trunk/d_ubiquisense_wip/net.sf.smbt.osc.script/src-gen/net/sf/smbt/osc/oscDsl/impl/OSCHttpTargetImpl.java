/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import net.sf.smbt.osc.oscDsl.EzFormats;
import net.sf.smbt.osc.oscDsl.OSCHttpTarget;
import net.sf.smbt.osc.oscDsl.OscDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>OSC Http Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl#getProto <em>Proto</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl#getAddr <em>Addr</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OSCHttpTargetImpl extends MinimalEObjectImpl.Container implements OSCHttpTarget
{
  /**
   * The default value of the '{@link #getProto() <em>Proto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProto()
   * @generated
   * @ordered
   */
  protected static final String PROTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProto() <em>Proto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProto()
   * @generated
   * @ordered
   */
  protected String proto = PROTO_EDEFAULT;

  /**
   * The default value of the '{@link #getAddr() <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddr()
   * @generated
   * @ordered
   */
  protected static final String ADDR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAddr() <em>Addr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddr()
   * @generated
   * @ordered
   */
  protected String addr = ADDR_EDEFAULT;

  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final EzFormats FORMAT_EDEFAULT = EzFormats.OSC;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected EzFormats format = FORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OSCHttpTargetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return OscDslPackage.Literals.OSC_HTTP_TARGET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getProto()
  {
    return proto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProto(String newProto)
  {
    String oldProto = proto;
    proto = newProto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.OSC_HTTP_TARGET__PROTO, oldProto, proto));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAddr()
  {
    return addr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddr(String newAddr)
  {
    String oldAddr = addr;
    addr = newAddr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.OSC_HTTP_TARGET__ADDR, oldAddr, addr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzFormats getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(EzFormats newFormat)
  {
    EzFormats oldFormat = format;
    format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.OSC_HTTP_TARGET__FORMAT, oldFormat, format));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case OscDslPackage.OSC_HTTP_TARGET__PROTO:
        return getProto();
      case OscDslPackage.OSC_HTTP_TARGET__ADDR:
        return getAddr();
      case OscDslPackage.OSC_HTTP_TARGET__FORMAT:
        return getFormat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OscDslPackage.OSC_HTTP_TARGET__PROTO:
        setProto((String)newValue);
        return;
      case OscDslPackage.OSC_HTTP_TARGET__ADDR:
        setAddr((String)newValue);
        return;
      case OscDslPackage.OSC_HTTP_TARGET__FORMAT:
        setFormat((EzFormats)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case OscDslPackage.OSC_HTTP_TARGET__PROTO:
        setProto(PROTO_EDEFAULT);
        return;
      case OscDslPackage.OSC_HTTP_TARGET__ADDR:
        setAddr(ADDR_EDEFAULT);
        return;
      case OscDslPackage.OSC_HTTP_TARGET__FORMAT:
        setFormat(FORMAT_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case OscDslPackage.OSC_HTTP_TARGET__PROTO:
        return PROTO_EDEFAULT == null ? proto != null : !PROTO_EDEFAULT.equals(proto);
      case OscDslPackage.OSC_HTTP_TARGET__ADDR:
        return ADDR_EDEFAULT == null ? addr != null : !ADDR_EDEFAULT.equals(addr);
      case OscDslPackage.OSC_HTTP_TARGET__FORMAT:
        return format != FORMAT_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (proto: ");
    result.append(proto);
    result.append(", addr: ");
    result.append(addr);
    result.append(", format: ");
    result.append(format);
    result.append(')');
    return result.toString();
  }

} //OSCHttpTargetImpl
