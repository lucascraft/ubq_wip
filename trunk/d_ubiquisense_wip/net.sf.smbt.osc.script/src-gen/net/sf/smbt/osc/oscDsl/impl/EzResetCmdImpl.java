/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import net.sf.smbt.osc.oscDsl.EzResetCmd;
import net.sf.smbt.osc.oscDsl.OscDslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ez Reset Cmd</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.EzResetCmdImpl#getId <em>Id</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.EzResetCmdImpl#getVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EzResetCmdImpl extends MinimalEObjectImpl.Container implements EzResetCmd
{
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
   * The default value of the '{@link #getVerbose() <em>Verbose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbose()
   * @generated
   * @ordered
   */
  protected static final String VERBOSE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVerbose() <em>Verbose</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbose()
   * @generated
   * @ordered
   */
  protected String verbose = VERBOSE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EzResetCmdImpl()
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
    return OscDslPackage.Literals.EZ_RESET_CMD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_RESET_CMD__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVerbose()
  {
    return verbose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVerbose(String newVerbose)
  {
    String oldVerbose = verbose;
    verbose = newVerbose;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EZ_RESET_CMD__VERBOSE, oldVerbose, verbose));
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
      case OscDslPackage.EZ_RESET_CMD__ID:
        return getId();
      case OscDslPackage.EZ_RESET_CMD__VERBOSE:
        return getVerbose();
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
      case OscDslPackage.EZ_RESET_CMD__ID:
        setId((String)newValue);
        return;
      case OscDslPackage.EZ_RESET_CMD__VERBOSE:
        setVerbose((String)newValue);
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
      case OscDslPackage.EZ_RESET_CMD__ID:
        setId(ID_EDEFAULT);
        return;
      case OscDslPackage.EZ_RESET_CMD__VERBOSE:
        setVerbose(VERBOSE_EDEFAULT);
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
      case OscDslPackage.EZ_RESET_CMD__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case OscDslPackage.EZ_RESET_CMD__VERBOSE:
        return VERBOSE_EDEFAULT == null ? verbose != null : !VERBOSE_EDEFAULT.equals(verbose);
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
    result.append(" (id: ");
    result.append(id);
    result.append(", verbose: ");
    result.append(verbose);
    result.append(')');
    return result.toString();
  }

} //EzResetCmdImpl
