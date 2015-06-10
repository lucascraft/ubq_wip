/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl.impl;

import net.sf.smbt.ez.script.ezDsl.EzDslPackage;
import net.sf.smbt.ez.script.ezDsl.MessageOut;

import net.sf.smbt.osc.oscDsl.OSCExpr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.impl.MessageOutImpl#getOsc <em>Osc</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageOutImpl extends MinimalEObjectImpl.Container implements MessageOut
{
  /**
   * The cached value of the '{@link #getOsc() <em>Osc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOsc()
   * @generated
   * @ordered
   */
  protected OSCExpr osc;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageOutImpl()
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
    return EzDslPackage.Literals.MESSAGE_OUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCExpr getOsc()
  {
    if (osc != null && osc.eIsProxy())
    {
      InternalEObject oldOsc = (InternalEObject)osc;
      osc = (OSCExpr)eResolveProxy(oldOsc);
      if (osc != oldOsc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzDslPackage.MESSAGE_OUT__OSC, oldOsc, osc));
      }
    }
    return osc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCExpr basicGetOsc()
  {
    return osc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOsc(OSCExpr newOsc)
  {
    OSCExpr oldOsc = osc;
    osc = newOsc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EzDslPackage.MESSAGE_OUT__OSC, oldOsc, osc));
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
      case EzDslPackage.MESSAGE_OUT__OSC:
        if (resolve) return getOsc();
        return basicGetOsc();
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
      case EzDslPackage.MESSAGE_OUT__OSC:
        setOsc((OSCExpr)newValue);
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
      case EzDslPackage.MESSAGE_OUT__OSC:
        setOsc((OSCExpr)null);
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
      case EzDslPackage.MESSAGE_OUT__OSC:
        return osc != null;
    }
    return super.eIsSet(featureID);
  }

} //MessageOutImpl
