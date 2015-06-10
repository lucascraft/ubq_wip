/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.util;

import net.sf.smbt.osc.oscDsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage
 * @generated
 */
public class OscDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OscDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OscDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = OscDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OscDslSwitch<Adapter> modelSwitch =
    new OscDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseEzModel(EzModel object)
      {
        return createEzModelAdapter();
      }
      @Override
      public Adapter caseEzCmd(EzCmd object)
      {
        return createEzCmdAdapter();
      }
      @Override
      public Adapter caseEzOpenCmd(EzOpenCmd object)
      {
        return createEzOpenCmdAdapter();
      }
      @Override
      public Adapter caseEzCloseCmd(EzCloseCmd object)
      {
        return createEzCloseCmdAdapter();
      }
      @Override
      public Adapter caseEzHookCmd(EzHookCmd object)
      {
        return createEzHookCmdAdapter();
      }
      @Override
      public Adapter caseEzUnhookCmd(EzUnhookCmd object)
      {
        return createEzUnhookCmdAdapter();
      }
      @Override
      public Adapter caseEzAliasCmd(EzAliasCmd object)
      {
        return createEzAliasCmdAdapter();
      }
      @Override
      public Adapter caseEzStatusCmd(EzStatusCmd object)
      {
        return createEzStatusCmdAdapter();
      }
      @Override
      public Adapter caseEzResetCmd(EzResetCmd object)
      {
        return createEzResetCmdAdapter();
      }
      @Override
      public Adapter caseEzHelpCmd(EzHelpCmd object)
      {
        return createEzHelpCmdAdapter();
      }
      @Override
      public Adapter caseEzClearCmd(EzClearCmd object)
      {
        return createEzClearCmdAdapter();
      }
      @Override
      public Adapter caseEzProtocolCmd(EzProtocolCmd object)
      {
        return createEzProtocolCmdAdapter();
      }
      @Override
      public Adapter caseEzListCmd(EzListCmd object)
      {
        return createEzListCmdAdapter();
      }
      @Override
      public Adapter caseEzMsg(EzMsg object)
      {
        return createEzMsgAdapter();
      }
      @Override
      public Adapter caseEzMsgRemove(EzMsgRemove object)
      {
        return createEzMsgRemoveAdapter();
      }
      @Override
      public Adapter caseEzMsgGet(EzMsgGet object)
      {
        return createEzMsgGetAdapter();
      }
      @Override
      public Adapter caseEzMsgBind(EzMsgBind object)
      {
        return createEzMsgBindAdapter();
      }
      @Override
      public Adapter caseEzMsgListen(EzMsgListen object)
      {
        return createEzMsgListenAdapter();
      }
      @Override
      public Adapter caseEzMsgService(EzMsgService object)
      {
        return createEzMsgServiceAdapter();
      }
      @Override
      public Adapter caseEzMsgUnlisten(EzMsgUnlisten object)
      {
        return createEzMsgUnlistenAdapter();
      }
      @Override
      public Adapter caseEzMsgCmd(EzMsgCmd object)
      {
        return createEzMsgCmdAdapter();
      }
      @Override
      public Adapter caseEzMsgClock(EzMsgClock object)
      {
        return createEzMsgClockAdapter();
      }
      @Override
      public Adapter caseEzMsgToggle(EzMsgToggle object)
      {
        return createEzMsgToggleAdapter();
      }
      @Override
      public Adapter caseEzMsgBang(EzMsgBang object)
      {
        return createEzMsgBangAdapter();
      }
      @Override
      public Adapter caseEzMsgUnforward(EzMsgUnforward object)
      {
        return createEzMsgUnforwardAdapter();
      }
      @Override
      public Adapter caseEzMsgForward(EzMsgForward object)
      {
        return createEzMsgForwardAdapter();
      }
      @Override
      public Adapter caseEzMsgSet(EzMsgSet object)
      {
        return createEzMsgSetAdapter();
      }
      @Override
      public Adapter caseEzMsgLegacySet(EzMsgLegacySet object)
      {
        return createEzMsgLegacySetAdapter();
      }
      @Override
      public Adapter caseEzMsgSelect(EzMsgSelect object)
      {
        return createEzMsgSelectAdapter();
      }
      @Override
      public Adapter caseEzMsgKinematics(EzMsgKinematics object)
      {
        return createEzMsgKinematicsAdapter();
      }
      @Override
      public Adapter caseEzMsgTrigger(EzMsgTrigger object)
      {
        return createEzMsgTriggerAdapter();
      }
      @Override
      public Adapter caseOSCExpr(OSCExpr object)
      {
        return createOSCExprAdapter();
      }
      @Override
      public Adapter caseOSCSubDomain(OSCSubDomain object)
      {
        return createOSCSubDomainAdapter();
      }
      @Override
      public Adapter caseOSCUDPTarget(OSCUDPTarget object)
      {
        return createOSCUDPTargetAdapter();
      }
      @Override
      public Adapter caseOSCTCPTarget(OSCTCPTarget object)
      {
        return createOSCTCPTargetAdapter();
      }
      @Override
      public Adapter caseOSCXBeeTarget(OSCXBeeTarget object)
      {
        return createOSCXBeeTargetAdapter();
      }
      @Override
      public Adapter caseOSCHttpTarget(OSCHttpTarget object)
      {
        return createOSCHttpTargetAdapter();
      }
      @Override
      public Adapter caseOSCBluetoothTarget(OSCBluetoothTarget object)
      {
        return createOSCBluetoothTargetAdapter();
      }
      @Override
      public Adapter caseOSCUSBTarget(OSCUSBTarget object)
      {
        return createOSCUSBTargetAdapter();
      }
      @Override
      public Adapter caseOSCUbqTarget(OSCUbqTarget object)
      {
        return createOSCUbqTargetAdapter();
      }
      @Override
      public Adapter caseSpeed(Speed object)
      {
        return createSpeedAdapter();
      }
      @Override
      public Adapter caseJvmVar(JvmVar object)
      {
        return createJvmVarAdapter();
      }
      @Override
      public Adapter caseExprModel(ExprModel object)
      {
        return createExprModelAdapter();
      }
      @Override
      public Adapter caseUsing(Using object)
      {
        return createUsingAdapter();
      }
      @Override
      public Adapter caseElement(Element object)
      {
        return createElementAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseReturn(Return object)
      {
        return createReturnAdapter();
      }
      @Override
      public Adapter caseEnumDecl(EnumDecl object)
      {
        return createEnumDeclAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object)
      {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseArrayType(ArrayType object)
      {
        return createArrayTypeAdapter();
      }
      @Override
      public Adapter caseEnumType(EnumType object)
      {
        return createEnumTypeAdapter();
      }
      @Override
      public Adapter caseIntType(IntType object)
      {
        return createIntTypeAdapter();
      }
      @Override
      public Adapter caseBoolType(BoolType object)
      {
        return createBoolTypeAdapter();
      }
      @Override
      public Adapter caseFloatType(FloatType object)
      {
        return createFloatTypeAdapter();
      }
      @Override
      public Adapter caseStringType(StringType object)
      {
        return createStringTypeAdapter();
      }
      @Override
      public Adapter caseExpr(Expr object)
      {
        return createExprAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseFunctionDeclaration(FunctionDeclaration object)
      {
        return createFunctionDeclarationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseEnumLiteral(EnumLiteral object)
      {
        return createEnumLiteralAdapter();
      }
      @Override
      public Adapter caseVarDecl(VarDecl object)
      {
        return createVarDeclAdapter();
      }
      @Override
      public Adapter caseFormula(Formula object)
      {
        return createFormulaAdapter();
      }
      @Override
      public Adapter caseEquals(Equals object)
      {
        return createEqualsAdapter();
      }
      @Override
      public Adapter casePlus(Plus object)
      {
        return createPlusAdapter();
      }
      @Override
      public Adapter caseMulti(Multi object)
      {
        return createMultiAdapter();
      }
      @Override
      public Adapter caseArrayAccess(ArrayAccess object)
      {
        return createArrayAccessAdapter();
      }
      @Override
      public Adapter caseSymbolRef(SymbolRef object)
      {
        return createSymbolRefAdapter();
      }
      @Override
      public Adapter caseNumberLiteral(NumberLiteral object)
      {
        return createNumberLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzModel <em>Ez Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzModel
   * @generated
   */
  public Adapter createEzModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzCmd <em>Ez Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzCmd
   * @generated
   */
  public Adapter createEzCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzOpenCmd <em>Ez Open Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzOpenCmd
   * @generated
   */
  public Adapter createEzOpenCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzCloseCmd <em>Ez Close Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzCloseCmd
   * @generated
   */
  public Adapter createEzCloseCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzHookCmd <em>Ez Hook Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzHookCmd
   * @generated
   */
  public Adapter createEzHookCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzUnhookCmd <em>Ez Unhook Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzUnhookCmd
   * @generated
   */
  public Adapter createEzUnhookCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzAliasCmd <em>Ez Alias Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzAliasCmd
   * @generated
   */
  public Adapter createEzAliasCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzStatusCmd <em>Ez Status Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzStatusCmd
   * @generated
   */
  public Adapter createEzStatusCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzResetCmd <em>Ez Reset Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzResetCmd
   * @generated
   */
  public Adapter createEzResetCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzHelpCmd <em>Ez Help Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzHelpCmd
   * @generated
   */
  public Adapter createEzHelpCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzClearCmd <em>Ez Clear Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzClearCmd
   * @generated
   */
  public Adapter createEzClearCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd <em>Ez Protocol Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzProtocolCmd
   * @generated
   */
  public Adapter createEzProtocolCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzListCmd <em>Ez List Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzListCmd
   * @generated
   */
  public Adapter createEzListCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsg <em>Ez Msg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsg
   * @generated
   */
  public Adapter createEzMsgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgRemove <em>Ez Msg Remove</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgRemove
   * @generated
   */
  public Adapter createEzMsgRemoveAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgGet <em>Ez Msg Get</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgGet
   * @generated
   */
  public Adapter createEzMsgGetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgBind <em>Ez Msg Bind</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgBind
   * @generated
   */
  public Adapter createEzMsgBindAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgListen <em>Ez Msg Listen</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgListen
   * @generated
   */
  public Adapter createEzMsgListenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgService <em>Ez Msg Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgService
   * @generated
   */
  public Adapter createEzMsgServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgUnlisten <em>Ez Msg Unlisten</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgUnlisten
   * @generated
   */
  public Adapter createEzMsgUnlistenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgCmd <em>Ez Msg Cmd</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgCmd
   * @generated
   */
  public Adapter createEzMsgCmdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgClock <em>Ez Msg Clock</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgClock
   * @generated
   */
  public Adapter createEzMsgClockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgToggle <em>Ez Msg Toggle</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgToggle
   * @generated
   */
  public Adapter createEzMsgToggleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgBang <em>Ez Msg Bang</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgBang
   * @generated
   */
  public Adapter createEzMsgBangAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgUnforward <em>Ez Msg Unforward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgUnforward
   * @generated
   */
  public Adapter createEzMsgUnforwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgForward <em>Ez Msg Forward</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgForward
   * @generated
   */
  public Adapter createEzMsgForwardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgSet <em>Ez Msg Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgSet
   * @generated
   */
  public Adapter createEzMsgSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgLegacySet <em>Ez Msg Legacy Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgLegacySet
   * @generated
   */
  public Adapter createEzMsgLegacySetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgSelect <em>Ez Msg Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgSelect
   * @generated
   */
  public Adapter createEzMsgSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgKinematics <em>Ez Msg Kinematics</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgKinematics
   * @generated
   */
  public Adapter createEzMsgKinematicsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EzMsgTrigger <em>Ez Msg Trigger</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EzMsgTrigger
   * @generated
   */
  public Adapter createEzMsgTriggerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCExpr <em>OSC Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCExpr
   * @generated
   */
  public Adapter createOSCExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCSubDomain <em>OSC Sub Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCSubDomain
   * @generated
   */
  public Adapter createOSCSubDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCUDPTarget <em>OSCUDP Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCUDPTarget
   * @generated
   */
  public Adapter createOSCUDPTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCTCPTarget <em>OSCTCP Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCTCPTarget
   * @generated
   */
  public Adapter createOSCTCPTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCXBeeTarget <em>OSCX Bee Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCXBeeTarget
   * @generated
   */
  public Adapter createOSCXBeeTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCHttpTarget <em>OSC Http Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCHttpTarget
   * @generated
   */
  public Adapter createOSCHttpTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCBluetoothTarget <em>OSC Bluetooth Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCBluetoothTarget
   * @generated
   */
  public Adapter createOSCBluetoothTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget <em>OSCUSB Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCUSBTarget
   * @generated
   */
  public Adapter createOSCUSBTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.OSCUbqTarget <em>OSC Ubq Target</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.OSCUbqTarget
   * @generated
   */
  public Adapter createOSCUbqTargetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Speed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Speed
   * @generated
   */
  public Adapter createSpeedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.JvmVar <em>Jvm Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.JvmVar
   * @generated
   */
  public Adapter createJvmVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.ExprModel <em>Expr Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.ExprModel
   * @generated
   */
  public Adapter createExprModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Using
   * @generated
   */
  public Adapter createUsingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Element
   * @generated
   */
  public Adapter createElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Return
   * @generated
   */
  public Adapter createReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EnumDecl
   * @generated
   */
  public Adapter createEnumDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.ArrayType
   * @generated
   */
  public Adapter createArrayTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EnumType
   * @generated
   */
  public Adapter createEnumTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.IntType
   * @generated
   */
  public Adapter createIntTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.BoolType
   * @generated
   */
  public Adapter createBoolTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.FloatType
   * @generated
   */
  public Adapter createFloatTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.StringType
   * @generated
   */
  public Adapter createStringTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Expr
   * @generated
   */
  public Adapter createExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.FunctionDeclaration
   * @generated
   */
  public Adapter createFunctionDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.EnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.EnumLiteral
   * @generated
   */
  public Adapter createEnumLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.VarDecl
   * @generated
   */
  public Adapter createVarDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Formula
   * @generated
   */
  public Adapter createFormulaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Equals
   * @generated
   */
  public Adapter createEqualsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Plus
   * @generated
   */
  public Adapter createPlusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.Multi
   * @generated
   */
  public Adapter createMultiAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.ArrayAccess
   * @generated
   */
  public Adapter createArrayAccessAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.SymbolRef
   * @generated
   */
  public Adapter createSymbolRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.NumberLiteral
   * @generated
   */
  public Adapter createNumberLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link net.sf.smbt.osc.oscDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see net.sf.smbt.osc.oscDsl.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //OscDslAdapterFactory
