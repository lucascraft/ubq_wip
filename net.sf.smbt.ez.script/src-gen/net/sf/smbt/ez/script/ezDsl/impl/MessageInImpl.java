/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl.impl;

import net.sf.smbt.ez.script.ezDsl.EzDslPackage;
import net.sf.smbt.ez.script.ezDsl.MessageIn;
import net.sf.smbt.ez.script.ezDsl.Trigger;

import net.sf.smbt.osc.oscDsl.OSCExpr;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message In</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.impl.MessageInImpl#getOsc <em>Osc</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.impl.MessageInImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageInImpl extends MinimalEObjectImpl.Container implements MessageIn
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
   * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrigger()
   * @generated
   * @ordered
   */
  protected Trigger trigger;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MessageInImpl()
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
    return EzDslPackage.Literals.MESSAGE_IN;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzDslPackage.MESSAGE_IN__OSC, oldOsc, osc));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EzDslPackage.MESSAGE_IN__OSC, oldOsc, osc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger getTrigger()
  {
    if (trigger != null && trigger.eIsProxy())
    {
      InternalEObject oldTrigger = (InternalEObject)trigger;
      trigger = (Trigger)eResolveProxy(oldTrigger);
      if (trigger != oldTrigger)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EzDslPackage.MESSAGE_IN__TRIGGER, oldTrigger, trigger));
      }
    }
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trigger basicGetTrigger()
  {
    return trigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrigger(Trigger newTrigger)
  {
    Trigger oldTrigger = trigger;
    trigger = newTrigger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EzDslPackage.MESSAGE_IN__TRIGGER, oldTrigger, trigger));
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
      case EzDslPackage.MESSAGE_IN__OSC:
        if (resolve) return getOsc();
        return basicGetOsc();
      case EzDslPackage.MESSAGE_IN__TRIGGER:
        if (resolve) return getTrigger();
        return basicGetTrigger();
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
      case EzDslPackage.MESSAGE_IN__OSC:
        setOsc((OSCExpr)newValue);
        return;
      case EzDslPackage.MESSAGE_IN__TRIGGER:
        setTrigger((Trigger)newValue);
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
      case EzDslPackage.MESSAGE_IN__OSC:
        setOsc((OSCExpr)null);
        return;
      case EzDslPackage.MESSAGE_IN__TRIGGER:
        setTrigger((Trigger)null);
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
      case EzDslPackage.MESSAGE_IN__OSC:
        return osc != null;
      case EzDslPackage.MESSAGE_IN__TRIGGER:
        return trigger != null;
    }
    return super.eIsSet(featureID);
  }

} //MessageInImpl
