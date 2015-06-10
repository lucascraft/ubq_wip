/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import net.sf.smbt.osc.oscDsl.EzAliasCmd;
import net.sf.smbt.osc.oscDsl.EzListCmd;
import net.sf.smbt.osc.oscDsl.OscDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ez List Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.EzListCmdImpl#getAddr <em>Addr</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EzListCmdImpl extends MinimalEObjectImpl.Container implements EzListCmd
{
  /**
   * The cached value of the '{@link #getAddr() <em>Addr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddr()
   * @generated
   * @ordered
   */
  protected EzAliasCmd addr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EzListCmdImpl()
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
    return OscDslPackage.Literals.EZ_LIST_CMD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzAliasCmd getAddr()
  {
    if (addr != null && addr.eIsProxy())
    {
      InternalEObject oldAddr = (InternalEObject)addr;
      addr = (EzAliasCmd)eResolveProxy(oldAddr);
      if (addr != oldAddr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, OscDslPackage.EZ_LIST_CMD__ADDR, oldAddr, addr));
      }
    }
    return addr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzAliasCmd basicGetAddr()
  {
    return addr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddr(EzAliasCmd newAddr)
  {
    EzAliasCmd oldAddr = addr;
    addr = newAddr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_LIST_CMD__ADDR, oldAddr, addr));
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
      case OscDslPackage.EZ_LIST_CMD__ADDR:
        if (resolve) return getAddr();
        return basicGetAddr();
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
      case OscDslPackage.EZ_LIST_CMD__ADDR:
        setAddr((EzAliasCmd)newValue);
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
      case OscDslPackage.EZ_LIST_CMD__ADDR:
        setAddr((EzAliasCmd)null);
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
      case OscDslPackage.EZ_LIST_CMD__ADDR:
        return addr != null;
    }
    return super.eIsSet(featureID);
  }

} //EzListCmdImpl
