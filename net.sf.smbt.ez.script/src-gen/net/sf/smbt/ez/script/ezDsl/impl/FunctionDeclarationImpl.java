/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl.impl;

import java.util.Collection;

import net.sf.smbt.ez.script.ezDsl.Element;
import net.sf.smbt.ez.script.ezDsl.EzDslPackage;
import net.sf.smbt.ez.script.ezDsl.FunctionDeclaration;
import net.sf.smbt.ez.script.ezDsl.Symbol;
import net.sf.smbt.ez.script.ezDsl.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl#getParams <em>Params</em>}</li>
 *   <li>{@link net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDeclarationImpl extends SymbolImpl implements FunctionDeclaration
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Type type;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<Symbol> params;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDeclarationImpl()
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
    return EzDslPackage.Literals.FUNCTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Type newType, NotificationChain msgs)
  {
    Type oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EzDslPackage.FUNCTION_DECLARATION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Type newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EzDslPackage.FUNCTION_DECLARATION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EzDslPackage.FUNCTION_DECLARATION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EzDslPackage.FUNCTION_DECLARATION__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Symbol> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<Symbol>(Symbol.class, this, EzDslPackage.FUNCTION_DECLARATION__PARAMS);
    }
    return params;
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
      elements = new EObjectContainmentEList<Element>(Element.class, this, EzDslPackage.FUNCTION_DECLARATION__ELEMENTS);
    }
    return elements;
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
      case EzDslPackage.FUNCTION_DECLARATION__TYPE:
        return basicSetType(null, msgs);
      case EzDslPackage.FUNCTION_DECLARATION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case EzDslPackage.FUNCTION_DECLARATION__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case EzDslPackage.FUNCTION_DECLARATION__TYPE:
        return getType();
      case EzDslPackage.FUNCTION_DECLARATION__PARAMS:
        return getParams();
      case EzDslPackage.FUNCTION_DECLARATION__ELEMENTS:
        return getElements();
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
      case EzDslPackage.FUNCTION_DECLARATION__TYPE:
        setType((Type)newValue);
        return;
      case EzDslPackage.FUNCTION_DECLARATION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends Symbol>)newValue);
        return;
      case EzDslPackage.FUNCTION_DECLARATION__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Element>)newValue);
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
      case EzDslPackage.FUNCTION_DECLARATION__TYPE:
        setType((Type)null);
        return;
      case EzDslPackage.FUNCTION_DECLARATION__PARAMS:
        getParams().clear();
        return;
      case EzDslPackage.FUNCTION_DECLARATION__ELEMENTS:
        getElements().clear();
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
      case EzDslPackage.FUNCTION_DECLARATION__TYPE:
        return type != null;
      case EzDslPackage.FUNCTION_DECLARATION__PARAMS:
        return params != null && !params.isEmpty();
      case EzDslPackage.FUNCTION_DECLARATION__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionDeclarationImpl
