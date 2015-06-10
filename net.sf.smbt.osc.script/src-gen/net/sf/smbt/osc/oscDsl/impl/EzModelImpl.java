/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import java.util.Collection;

import net.sf.smbt.osc.oscDsl.EzCmd;
import net.sf.smbt.osc.oscDsl.EzModel;
import net.sf.smbt.osc.oscDsl.EzMsg;
import net.sf.smbt.osc.oscDsl.OscDslPackage;

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
 * An implementation of the model object '<em><b>Ez Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.EzModelImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.EzModelImpl#getMsg <em>Msg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EzModelImpl extends MinimalEObjectImpl.Container implements EzModel
{
  /**
   * The cached value of the '{@link #getCmd() <em>Cmd</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmd()
   * @generated
   * @ordered
   */
  protected EzCmd cmd;

  /**
   * The cached value of the '{@link #getMsg() <em>Msg</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMsg()
   * @generated
   * @ordered
   */
  protected EList<EzMsg> msg;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EzModelImpl()
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
    return OscDslPackage.Literals.EZ_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzCmd getCmd()
  {
    return cmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCmd(EzCmd newCmd, NotificationChain msgs)
  {
    EzCmd oldCmd = cmd;
    cmd = newCmd;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_MODEL__CMD, oldCmd, newCmd);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmd(EzCmd newCmd)
  {
    if (newCmd != cmd)
    {
      NotificationChain msgs = null;
      if (cmd != null)
        msgs = ((InternalEObject)cmd).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OscDslPackage.EZ_MODEL__CMD, null, msgs);
      if (newCmd != null)
        msgs = ((InternalEObject)newCmd).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OscDslPackage.EZ_MODEL__CMD, null, msgs);
      msgs = basicSetCmd(newCmd, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_MODEL__CMD, newCmd, newCmd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EzMsg> getMsg()
  {
    if (msg == null)
    {
      msg = new EObjectContainmentEList<EzMsg>(EzMsg.class, this, OscDslPackage.EZ_MODEL__MSG);
    }
    return msg;
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
      case OscDslPackage.EZ_MODEL__CMD:
        return basicSetCmd(null, msgs);
      case OscDslPackage.EZ_MODEL__MSG:
        return ((InternalEList<?>)getMsg()).basicRemove(otherEnd, msgs);
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
      case OscDslPackage.EZ_MODEL__CMD:
        return getCmd();
      case OscDslPackage.EZ_MODEL__MSG:
        return getMsg();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case OscDslPackage.EZ_MODEL__CMD:
        setCmd((EzCmd)newValue);
        return;
      case OscDslPackage.EZ_MODEL__MSG:
        getMsg().clear();
        getMsg().addAll((Collection<? extends EzMsg>)newValue);
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
      case OscDslPackage.EZ_MODEL__CMD:
        setCmd((EzCmd)null);
        return;
      case OscDslPackage.EZ_MODEL__MSG:
        getMsg().clear();
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
      case OscDslPackage.EZ_MODEL__CMD:
        return cmd != null;
      case OscDslPackage.EZ_MODEL__MSG:
        return msg != null && !msg.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EzModelImpl
