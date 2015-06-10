/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import net.sf.smbt.osc.oscDsl.EzMsg;
import net.sf.smbt.osc.oscDsl.OscDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ez Msg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.EzMsgImpl#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EzMsgImpl extends MinimalEObjectImpl.Container implements EzMsg
{
  /**
   * The cached value of the '{@link #getMsg() <em>Msg</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsg()
   * @generated
   * @ordered
   */
  protected EObject msg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EzMsgImpl()
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
    return OscDslPackage.Literals.EZ_MSG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getMsg()
  {
    return msg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMsg(EObject newMsg, NotificationChain msgs)
  {
    EObject oldMsg = msg;
    msg = newMsg;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_MSG__MSG, oldMsg, newMsg);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMsg(EObject newMsg)
  {
    if (newMsg != msg)
    {
      NotificationChain msgs = null;
      if (msg != null)
        msgs = ((InternalEObject)msg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscDslPackage.EZ_MSG__MSG, null, msgs);
      if (newMsg != null)
        msgs = ((InternalEObject)newMsg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscDslPackage.EZ_MSG__MSG, null, msgs);
      msgs = basicSetMsg(newMsg, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_MSG__MSG, newMsg, newMsg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case OscDslPackage.EZ_MSG__MSG:
        return basicSetMsg(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case OscDslPackage.EZ_MSG__MSG:
        return getMsg();
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
      case OscDslPackage.EZ_MSG__MSG:
        setMsg((EObject)newValue);
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
      case OscDslPackage.EZ_MSG__MSG:
        setMsg((EObject)null);
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
      case OscDslPackage.EZ_MSG__MSG:
        return msg != null;
    }
    return super.eIsSet(featureID);
  }

} //EzMsgImpl
