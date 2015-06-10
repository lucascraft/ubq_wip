/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.util;

import net.sf.smbt.osc.oscDsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage
 * @generated
 */
public class OscDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static OscDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OscDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = OscDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case OscDslPackage.EZ_MODEL:
      {
        EzModel ezModel = (EzModel)theEObject;
        T result = caseEzModel(ezModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_CMD:
      {
        EzCmd ezCmd = (EzCmd)theEObject;
        T result = caseEzCmd(ezCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_OPEN_CMD:
      {
        EzOpenCmd ezOpenCmd = (EzOpenCmd)theEObject;
        T result = caseEzOpenCmd(ezOpenCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_CLOSE_CMD:
      {
        EzCloseCmd ezCloseCmd = (EzCloseCmd)theEObject;
        T result = caseEzCloseCmd(ezCloseCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_HOOK_CMD:
      {
        EzHookCmd ezHookCmd = (EzHookCmd)theEObject;
        T result = caseEzHookCmd(ezHookCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_UNHOOK_CMD:
      {
        EzUnhookCmd ezUnhookCmd = (EzUnhookCmd)theEObject;
        T result = caseEzUnhookCmd(ezUnhookCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_ALIAS_CMD:
      {
        EzAliasCmd ezAliasCmd = (EzAliasCmd)theEObject;
        T result = caseEzAliasCmd(ezAliasCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_STATUS_CMD:
      {
        EzStatusCmd ezStatusCmd = (EzStatusCmd)theEObject;
        T result = caseEzStatusCmd(ezStatusCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_RESET_CMD:
      {
        EzResetCmd ezResetCmd = (EzResetCmd)theEObject;
        T result = caseEzResetCmd(ezResetCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_HELP_CMD:
      {
        EzHelpCmd ezHelpCmd = (EzHelpCmd)theEObject;
        T result = caseEzHelpCmd(ezHelpCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_CLEAR_CMD:
      {
        EzClearCmd ezClearCmd = (EzClearCmd)theEObject;
        T result = caseEzClearCmd(ezClearCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_PROTOCOL_CMD:
      {
        EzProtocolCmd ezProtocolCmd = (EzProtocolCmd)theEObject;
        T result = caseEzProtocolCmd(ezProtocolCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_LIST_CMD:
      {
        EzListCmd ezListCmd = (EzListCmd)theEObject;
        T result = caseEzListCmd(ezListCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG:
      {
        EzMsg ezMsg = (EzMsg)theEObject;
        T result = caseEzMsg(ezMsg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_REMOVE:
      {
        EzMsgRemove ezMsgRemove = (EzMsgRemove)theEObject;
        T result = caseEzMsgRemove(ezMsgRemove);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_GET:
      {
        EzMsgGet ezMsgGet = (EzMsgGet)theEObject;
        T result = caseEzMsgGet(ezMsgGet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_BIND:
      {
        EzMsgBind ezMsgBind = (EzMsgBind)theEObject;
        T result = caseEzMsgBind(ezMsgBind);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_LISTEN:
      {
        EzMsgListen ezMsgListen = (EzMsgListen)theEObject;
        T result = caseEzMsgListen(ezMsgListen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_SERVICE:
      {
        EzMsgService ezMsgService = (EzMsgService)theEObject;
        T result = caseEzMsgService(ezMsgService);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_UNLISTEN:
      {
        EzMsgUnlisten ezMsgUnlisten = (EzMsgUnlisten)theEObject;
        T result = caseEzMsgUnlisten(ezMsgUnlisten);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_CMD:
      {
        EzMsgCmd ezMsgCmd = (EzMsgCmd)theEObject;
        T result = caseEzMsgCmd(ezMsgCmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_CLOCK:
      {
        EzMsgClock ezMsgClock = (EzMsgClock)theEObject;
        T result = caseEzMsgClock(ezMsgClock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_TOGGLE:
      {
        EzMsgToggle ezMsgToggle = (EzMsgToggle)theEObject;
        T result = caseEzMsgToggle(ezMsgToggle);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_BANG:
      {
        EzMsgBang ezMsgBang = (EzMsgBang)theEObject;
        T result = caseEzMsgBang(ezMsgBang);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_UNFORWARD:
      {
        EzMsgUnforward ezMsgUnforward = (EzMsgUnforward)theEObject;
        T result = caseEzMsgUnforward(ezMsgUnforward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_FORWARD:
      {
        EzMsgForward ezMsgForward = (EzMsgForward)theEObject;
        T result = caseEzMsgForward(ezMsgForward);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_SET:
      {
        EzMsgSet ezMsgSet = (EzMsgSet)theEObject;
        T result = caseEzMsgSet(ezMsgSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_LEGACY_SET:
      {
        EzMsgLegacySet ezMsgLegacySet = (EzMsgLegacySet)theEObject;
        T result = caseEzMsgLegacySet(ezMsgLegacySet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_SELECT:
      {
        EzMsgSelect ezMsgSelect = (EzMsgSelect)theEObject;
        T result = caseEzMsgSelect(ezMsgSelect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_KINEMATICS:
      {
        EzMsgKinematics ezMsgKinematics = (EzMsgKinematics)theEObject;
        T result = caseEzMsgKinematics(ezMsgKinematics);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EZ_MSG_TRIGGER:
      {
        EzMsgTrigger ezMsgTrigger = (EzMsgTrigger)theEObject;
        T result = caseEzMsgTrigger(ezMsgTrigger);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSC_EXPR:
      {
        OSCExpr oscExpr = (OSCExpr)theEObject;
        T result = caseOSCExpr(oscExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSC_SUB_DOMAIN:
      {
        OSCSubDomain oscSubDomain = (OSCSubDomain)theEObject;
        T result = caseOSCSubDomain(oscSubDomain);
        if (result == null) result = caseEzMsg(oscSubDomain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSCUDP_TARGET:
      {
        OSCUDPTarget oscudpTarget = (OSCUDPTarget)theEObject;
        T result = caseOSCUDPTarget(oscudpTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSCTCP_TARGET:
      {
        OSCTCPTarget osctcpTarget = (OSCTCPTarget)theEObject;
        T result = caseOSCTCPTarget(osctcpTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSCX_BEE_TARGET:
      {
        OSCXBeeTarget oscxBeeTarget = (OSCXBeeTarget)theEObject;
        T result = caseOSCXBeeTarget(oscxBeeTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSC_HTTP_TARGET:
      {
        OSCHttpTarget oscHttpTarget = (OSCHttpTarget)theEObject;
        T result = caseOSCHttpTarget(oscHttpTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSC_BLUETOOTH_TARGET:
      {
        OSCBluetoothTarget oscBluetoothTarget = (OSCBluetoothTarget)theEObject;
        T result = caseOSCBluetoothTarget(oscBluetoothTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSCUSB_TARGET:
      {
        OSCUSBTarget oscusbTarget = (OSCUSBTarget)theEObject;
        T result = caseOSCUSBTarget(oscusbTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.OSC_UBQ_TARGET:
      {
        OSCUbqTarget oscUbqTarget = (OSCUbqTarget)theEObject;
        T result = caseOSCUbqTarget(oscUbqTarget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.SPEED:
      {
        Speed speed = (Speed)theEObject;
        T result = caseSpeed(speed);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.JVM_VAR:
      {
        JvmVar jvmVar = (JvmVar)theEObject;
        T result = caseJvmVar(jvmVar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EXPR_MODEL:
      {
        ExprModel exprModel = (ExprModel)theEObject;
        T result = caseExprModel(exprModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.USING:
      {
        Using using = (Using)theEObject;
        T result = caseUsing(using);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.ELEMENT:
      {
        Element element = (Element)theEObject;
        T result = caseElement(element);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.SYMBOL:
      {
        Symbol symbol = (Symbol)theEObject;
        T result = caseSymbol(symbol);
        if (result == null) result = caseElement(symbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.RETURN:
      {
        Return return_ = (Return)theEObject;
        T result = caseReturn(return_);
        if (result == null) result = caseElement(return_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.ENUM_DECL:
      {
        EnumDecl enumDecl = (EnumDecl)theEObject;
        T result = caseEnumDecl(enumDecl);
        if (result == null) result = caseElement(enumDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.PRIMITIVE_TYPE:
      {
        PrimitiveType primitiveType = (PrimitiveType)theEObject;
        T result = casePrimitiveType(primitiveType);
        if (result == null) result = caseType(primitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.ARRAY_TYPE:
      {
        ArrayType arrayType = (ArrayType)theEObject;
        T result = caseArrayType(arrayType);
        if (result == null) result = caseType(arrayType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.ENUM_TYPE:
      {
        EnumType enumType = (EnumType)theEObject;
        T result = caseEnumType(enumType);
        if (result == null) result = casePrimitiveType(enumType);
        if (result == null) result = caseType(enumType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.INT_TYPE:
      {
        IntType intType = (IntType)theEObject;
        T result = caseIntType(intType);
        if (result == null) result = casePrimitiveType(intType);
        if (result == null) result = caseType(intType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.BOOL_TYPE:
      {
        BoolType boolType = (BoolType)theEObject;
        T result = caseBoolType(boolType);
        if (result == null) result = casePrimitiveType(boolType);
        if (result == null) result = caseType(boolType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.FLOAT_TYPE:
      {
        FloatType floatType = (FloatType)theEObject;
        T result = caseFloatType(floatType);
        if (result == null) result = casePrimitiveType(floatType);
        if (result == null) result = caseType(floatType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.STRING_TYPE:
      {
        StringType stringType = (StringType)theEObject;
        T result = caseStringType(stringType);
        if (result == null) result = casePrimitiveType(stringType);
        if (result == null) result = caseType(stringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EXPR:
      {
        Expr expr = (Expr)theEObject;
        T result = caseExpr(expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = caseExpr(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.FUNCTION_DECLARATION:
      {
        FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
        T result = caseFunctionDeclaration(functionDeclaration);
        if (result == null) result = caseSymbol(functionDeclaration);
        if (result == null) result = caseElement(functionDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseSymbol(parameter);
        if (result == null) result = caseElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.ENUM_LITERAL:
      {
        EnumLiteral enumLiteral = (EnumLiteral)theEObject;
        T result = caseEnumLiteral(enumLiteral);
        if (result == null) result = caseSymbol(enumLiteral);
        if (result == null) result = caseElement(enumLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.VAR_DECL:
      {
        VarDecl varDecl = (VarDecl)theEObject;
        T result = caseVarDecl(varDecl);
        if (result == null) result = caseSymbol(varDecl);
        if (result == null) result = caseElement(varDecl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.FORMULA:
      {
        Formula formula = (Formula)theEObject;
        T result = caseFormula(formula);
        if (result == null) result = caseSymbol(formula);
        if (result == null) result = caseElement(formula);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.EQUALS:
      {
        Equals equals = (Equals)theEObject;
        T result = caseEquals(equals);
        if (result == null) result = caseExpression(equals);
        if (result == null) result = caseExpr(equals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = caseExpr(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.MULTI:
      {
        Multi multi = (Multi)theEObject;
        T result = caseMulti(multi);
        if (result == null) result = caseExpression(multi);
        if (result == null) result = caseExpr(multi);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.ARRAY_ACCESS:
      {
        ArrayAccess arrayAccess = (ArrayAccess)theEObject;
        T result = caseArrayAccess(arrayAccess);
        if (result == null) result = caseExpression(arrayAccess);
        if (result == null) result = caseExpr(arrayAccess);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.SYMBOL_REF:
      {
        SymbolRef symbolRef = (SymbolRef)theEObject;
        T result = caseSymbolRef(symbolRef);
        if (result == null) result = caseExpression(symbolRef);
        if (result == null) result = caseExpr(symbolRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.NUMBER_LITERAL:
      {
        NumberLiteral numberLiteral = (NumberLiteral)theEObject;
        T result = caseNumberLiteral(numberLiteral);
        if (result == null) result = caseExpression(numberLiteral);
        if (result == null) result = caseExpr(numberLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case OscDslPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = caseExpr(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzModel(EzModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzCmd(EzCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Open Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Open Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzOpenCmd(EzOpenCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Close Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Close Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzCloseCmd(EzCloseCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Hook Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Hook Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzHookCmd(EzHookCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Unhook Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Unhook Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzUnhookCmd(EzUnhookCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Alias Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Alias Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzAliasCmd(EzAliasCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Status Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Status Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzStatusCmd(EzStatusCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Reset Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Reset Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzResetCmd(EzResetCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Help Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Help Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzHelpCmd(EzHelpCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Clear Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Clear Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzClearCmd(EzClearCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Protocol Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Protocol Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzProtocolCmd(EzProtocolCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez List Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez List Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzListCmd(EzListCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsg(EzMsg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Remove</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Remove</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgRemove(EzMsgRemove object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Get</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Get</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgGet(EzMsgGet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Bind</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Bind</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgBind(EzMsgBind object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Listen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Listen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgListen(EzMsgListen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgService(EzMsgService object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Unlisten</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Unlisten</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgUnlisten(EzMsgUnlisten object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgCmd(EzMsgCmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Clock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Clock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgClock(EzMsgClock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Toggle</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Toggle</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgToggle(EzMsgToggle object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Bang</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Bang</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgBang(EzMsgBang object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Unforward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Unforward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgUnforward(EzMsgUnforward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Forward</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Forward</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgForward(EzMsgForward object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgSet(EzMsgSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Legacy Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Legacy Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgLegacySet(EzMsgLegacySet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgSelect(EzMsgSelect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Kinematics</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Kinematics</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgKinematics(EzMsgKinematics object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ez Msg Trigger</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ez Msg Trigger</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEzMsgTrigger(EzMsgTrigger object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSC Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSC Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCExpr(OSCExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSC Sub Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSC Sub Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCSubDomain(OSCSubDomain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSCUDP Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSCUDP Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCUDPTarget(OSCUDPTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSCTCP Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSCTCP Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCTCPTarget(OSCTCPTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSCX Bee Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSCX Bee Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCXBeeTarget(OSCXBeeTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSC Http Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSC Http Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCHttpTarget(OSCHttpTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSC Bluetooth Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSC Bluetooth Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCBluetoothTarget(OSCBluetoothTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSCUSB Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSCUSB Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCUSBTarget(OSCUSBTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>OSC Ubq Target</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>OSC Ubq Target</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOSCUbqTarget(OSCUbqTarget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Speed</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Speed</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpeed(Speed object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Jvm Var</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Jvm Var</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseJvmVar(JvmVar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExprModel(ExprModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Using</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Using</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUsing(Using object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbol(Symbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturn(Return object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumDecl(EnumDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveType(PrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayType(ArrayType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumType(EnumType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntType(IntType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolType(BoolType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatType(FloatType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringType(StringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpr(Expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionDeclaration(FunctionDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLiteral(EnumLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Decl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDecl(VarDecl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formula</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formula</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormula(Formula object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquals(Equals object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulti(Multi object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Access</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayAccess(ArrayAccess object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbolRef(SymbolRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumberLiteral(NumberLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //OscDslSwitch
