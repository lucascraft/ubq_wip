/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import java.util.Collection;

import net.sf.smbt.osc.oscDsl.Element;
import net.sf.smbt.osc.oscDsl.ExprModel;
import net.sf.smbt.osc.oscDsl.OscDslPackage;
import net.sf.smbt.osc.oscDsl.Symbol;
import net.sf.smbt.osc.oscDsl.Using;

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
 * An implementation of the model object '<em><b>Expr Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl#isIsTested <em>Is Tested</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl#getUsings <em>Usings</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl#getFunctions <em>Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExprModelImpl extends MinimalEObjectImpl.Container implements ExprModel
{
  /**
   * The default value of the '{@link #isIsTested() <em>Is Tested</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTested()
   * @generated
   * @ordered
   */
  protected static final boolean IS_TESTED_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsTested() <em>Is Tested</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsTested()
   * @generated
   * @ordered
   */
  protected boolean isTested = IS_TESTED_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getUsings() <em>Usings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUsings()
   * @generated
   * @ordered
   */
  protected EList<Using> usings;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Element> elements;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Symbol> functions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExprModelImpl()
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
    return OscDslPackage.Literals.EXPR_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsTested()
  {
    return isTested;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsTested(boolean newIsTested)
  {
    boolean oldIsTested = isTested;
    isTested = newIsTested;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EXPR_MODEL__IS_TESTED, oldIsTested, isTested));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OscDslPackage.EXPR_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Using> getUsings()
  {
    if (usings == null)
    {
      usings = new EObjectContainmentEList<Using>(Using.class, this, OscDslPackage.EXPR_MODEL__USINGS);
    }
    return usings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Element>(Element.class, this, OscDslPackage.EXPR_MODEL__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Symbol> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Symbol>(Symbol.class, this, OscDslPackage.EXPR_MODEL__FUNCTIONS);
    }
    return functions;
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
      case OscDslPackage.EXPR_MODEL__USINGS:
        return ((InternalEList<?>)getUsings()).basicRemove(otherEnd, msgs);
      case OscDslPackage.EXPR_MODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
      case OscDslPackage.EXPR_MODEL__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
      case OscDslPackage.EXPR_MODEL__IS_TESTED:
        return isIsTested();
      case OscDslPackage.EXPR_MODEL__NAME:
        return getName();
      case OscDslPackage.EXPR_MODEL__USINGS:
        return getUsings();
      case OscDslPackage.EXPR_MODEL__ELEMENTS:
        return getElements();
      case OscDslPackage.EXPR_MODEL__FUNCTIONS:
        return getFunctions();
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
      case OscDslPackage.EXPR_MODEL__IS_TESTED:
        setIsTested((Boolean)newValue);
        return;
      case OscDslPackage.EXPR_MODEL__NAME:
        setName((String)newValue);
        return;
      case OscDslPackage.EXPR_MODEL__USINGS:
        getUsings().clear();
        getUsings().addAll((Collection<? extends Using>)newValue);
        return;
      case OscDslPackage.EXPR_MODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
        return;
      case OscDslPackage.EXPR_MODEL__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Symbol>)newValue);
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
      case OscDslPackage.EXPR_MODEL__IS_TESTED:
        setIsTested(IS_TESTED_EDEFAULT);
        return;
      case OscDslPackage.EXPR_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case OscDslPackage.EXPR_MODEL__USINGS:
        getUsings().clear();
        return;
      case OscDslPackage.EXPR_MODEL__ELEMENTS:
        getElements().clear();
        return;
      case OscDslPackage.EXPR_MODEL__FUNCTIONS:
        getFunctions().clear();
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
      case OscDslPackage.EXPR_MODEL__IS_TESTED:
        return isTested != IS_TESTED_EDEFAULT;
      case OscDslPackage.EXPR_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case OscDslPackage.EXPR_MODEL__USINGS:
        return usings != null && !usings.isEmpty();
      case OscDslPackage.EXPR_MODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case OscDslPackage.EXPR_MODEL__FUNCTIONS:
        return functions != null && !functions.isEmpty();
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
    result.append(" (isTested: ");
    result.append(isTested);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ExprModelImpl
