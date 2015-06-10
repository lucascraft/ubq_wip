/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import net.sf.smbt.osc.oscDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscDslFactoryImpl extends EFactoryImpl implements OscDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static OscDslFactory init()
  {
    try
    {
      OscDslFactory theOscDslFactory = (OscDslFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.sf.net/smbt/osc/OscDsl"); 
      if (theOscDslFactory != null)
      {
        return theOscDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new OscDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OscDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case OscDslPackage.EZ_MODEL: return createEzModel();
      case OscDslPackage.EZ_CMD: return createEzCmd();
      case OscDslPackage.EZ_OPEN_CMD: return createEzOpenCmd();
      case OscDslPackage.EZ_CLOSE_CMD: return createEzCloseCmd();
      case OscDslPackage.EZ_HOOK_CMD: return createEzHookCmd();
      case OscDslPackage.EZ_UNHOOK_CMD: return createEzUnhookCmd();
      case OscDslPackage.EZ_ALIAS_CMD: return createEzAliasCmd();
      case OscDslPackage.EZ_STATUS_CMD: return createEzStatusCmd();
      case OscDslPackage.EZ_RESET_CMD: return createEzResetCmd();
      case OscDslPackage.EZ_HELP_CMD: return createEzHelpCmd();
      case OscDslPackage.EZ_CLEAR_CMD: return createEzClearCmd();
      case OscDslPackage.EZ_PROTOCOL_CMD: return createEzProtocolCmd();
      case OscDslPackage.EZ_LIST_CMD: return createEzListCmd();
      case OscDslPackage.EZ_MSG: return createEzMsg();
      case OscDslPackage.EZ_MSG_REMOVE: return createEzMsgRemove();
      case OscDslPackage.EZ_MSG_GET: return createEzMsgGet();
      case OscDslPackage.EZ_MSG_BIND: return createEzMsgBind();
      case OscDslPackage.EZ_MSG_LISTEN: return createEzMsgListen();
      case OscDslPackage.EZ_MSG_SERVICE: return createEzMsgService();
      case OscDslPackage.EZ_MSG_UNLISTEN: return createEzMsgUnlisten();
      case OscDslPackage.EZ_MSG_CMD: return createEzMsgCmd();
      case OscDslPackage.EZ_MSG_CLOCK: return createEzMsgClock();
      case OscDslPackage.EZ_MSG_TOGGLE: return createEzMsgToggle();
      case OscDslPackage.EZ_MSG_BANG: return createEzMsgBang();
      case OscDslPackage.EZ_MSG_UNFORWARD: return createEzMsgUnforward();
      case OscDslPackage.EZ_MSG_FORWARD: return createEzMsgForward();
      case OscDslPackage.EZ_MSG_SET: return createEzMsgSet();
      case OscDslPackage.EZ_MSG_LEGACY_SET: return createEzMsgLegacySet();
      case OscDslPackage.EZ_MSG_SELECT: return createEzMsgSelect();
      case OscDslPackage.EZ_MSG_KINEMATICS: return createEzMsgKinematics();
      case OscDslPackage.EZ_MSG_TRIGGER: return createEzMsgTrigger();
      case OscDslPackage.OSC_EXPR: return createOSCExpr();
      case OscDslPackage.OSC_SUB_DOMAIN: return createOSCSubDomain();
      case OscDslPackage.OSCUDP_TARGET: return createOSCUDPTarget();
      case OscDslPackage.OSCTCP_TARGET: return createOSCTCPTarget();
      case OscDslPackage.OSCX_BEE_TARGET: return createOSCXBeeTarget();
      case OscDslPackage.OSC_HTTP_TARGET: return createOSCHttpTarget();
      case OscDslPackage.OSC_BLUETOOTH_TARGET: return createOSCBluetoothTarget();
      case OscDslPackage.OSCUSB_TARGET: return createOSCUSBTarget();
      case OscDslPackage.OSC_UBQ_TARGET: return createOSCUbqTarget();
      case OscDslPackage.SPEED: return createSpeed();
      case OscDslPackage.JVM_VAR: return createJvmVar();
      case OscDslPackage.EXPR_MODEL: return createExprModel();
      case OscDslPackage.USING: return createUsing();
      case OscDslPackage.ELEMENT: return createElement();
      case OscDslPackage.SYMBOL: return createSymbol();
      case OscDslPackage.RETURN: return createReturn();
      case OscDslPackage.ENUM_DECL: return createEnumDecl();
      case OscDslPackage.TYPE: return createType();
      case OscDslPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case OscDslPackage.ARRAY_TYPE: return createArrayType();
      case OscDslPackage.ENUM_TYPE: return createEnumType();
      case OscDslPackage.INT_TYPE: return createIntType();
      case OscDslPackage.BOOL_TYPE: return createBoolType();
      case OscDslPackage.FLOAT_TYPE: return createFloatType();
      case OscDslPackage.STRING_TYPE: return createStringType();
      case OscDslPackage.EXPR: return createExpr();
      case OscDslPackage.EXPRESSION: return createExpression();
      case OscDslPackage.FUNCTION_DECLARATION: return createFunctionDeclaration();
      case OscDslPackage.PARAMETER: return createParameter();
      case OscDslPackage.ENUM_LITERAL: return createEnumLiteral();
      case OscDslPackage.VAR_DECL: return createVarDecl();
      case OscDslPackage.FORMULA: return createFormula();
      case OscDslPackage.EQUALS: return createEquals();
      case OscDslPackage.PLUS: return createPlus();
      case OscDslPackage.MULTI: return createMulti();
      case OscDslPackage.ARRAY_ACCESS: return createArrayAccess();
      case OscDslPackage.SYMBOL_REF: return createSymbolRef();
      case OscDslPackage.NUMBER_LITERAL: return createNumberLiteral();
      case OscDslPackage.STRING_LITERAL: return createStringLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OscDslPackage.EZ_FORMATS:
        return createEzFormatsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case OscDslPackage.EZ_FORMATS:
        return convertEzFormatsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzModel createEzModel()
  {
    EzModelImpl ezModel = new EzModelImpl();
    return ezModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzCmd createEzCmd()
  {
    EzCmdImpl ezCmd = new EzCmdImpl();
    return ezCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzOpenCmd createEzOpenCmd()
  {
    EzOpenCmdImpl ezOpenCmd = new EzOpenCmdImpl();
    return ezOpenCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzCloseCmd createEzCloseCmd()
  {
    EzCloseCmdImpl ezCloseCmd = new EzCloseCmdImpl();
    return ezCloseCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzHookCmd createEzHookCmd()
  {
    EzHookCmdImpl ezHookCmd = new EzHookCmdImpl();
    return ezHookCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzUnhookCmd createEzUnhookCmd()
  {
    EzUnhookCmdImpl ezUnhookCmd = new EzUnhookCmdImpl();
    return ezUnhookCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzAliasCmd createEzAliasCmd()
  {
    EzAliasCmdImpl ezAliasCmd = new EzAliasCmdImpl();
    return ezAliasCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzStatusCmd createEzStatusCmd()
  {
    EzStatusCmdImpl ezStatusCmd = new EzStatusCmdImpl();
    return ezStatusCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzResetCmd createEzResetCmd()
  {
    EzResetCmdImpl ezResetCmd = new EzResetCmdImpl();
    return ezResetCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzHelpCmd createEzHelpCmd()
  {
    EzHelpCmdImpl ezHelpCmd = new EzHelpCmdImpl();
    return ezHelpCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzClearCmd createEzClearCmd()
  {
    EzClearCmdImpl ezClearCmd = new EzClearCmdImpl();
    return ezClearCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzProtocolCmd createEzProtocolCmd()
  {
    EzProtocolCmdImpl ezProtocolCmd = new EzProtocolCmdImpl();
    return ezProtocolCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzListCmd createEzListCmd()
  {
    EzListCmdImpl ezListCmd = new EzListCmdImpl();
    return ezListCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsg createEzMsg()
  {
    EzMsgImpl ezMsg = new EzMsgImpl();
    return ezMsg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgRemove createEzMsgRemove()
  {
    EzMsgRemoveImpl ezMsgRemove = new EzMsgRemoveImpl();
    return ezMsgRemove;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgGet createEzMsgGet()
  {
    EzMsgGetImpl ezMsgGet = new EzMsgGetImpl();
    return ezMsgGet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgBind createEzMsgBind()
  {
    EzMsgBindImpl ezMsgBind = new EzMsgBindImpl();
    return ezMsgBind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgListen createEzMsgListen()
  {
    EzMsgListenImpl ezMsgListen = new EzMsgListenImpl();
    return ezMsgListen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgService createEzMsgService()
  {
    EzMsgServiceImpl ezMsgService = new EzMsgServiceImpl();
    return ezMsgService;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgUnlisten createEzMsgUnlisten()
  {
    EzMsgUnlistenImpl ezMsgUnlisten = new EzMsgUnlistenImpl();
    return ezMsgUnlisten;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgCmd createEzMsgCmd()
  {
    EzMsgCmdImpl ezMsgCmd = new EzMsgCmdImpl();
    return ezMsgCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgClock createEzMsgClock()
  {
    EzMsgClockImpl ezMsgClock = new EzMsgClockImpl();
    return ezMsgClock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgToggle createEzMsgToggle()
  {
    EzMsgToggleImpl ezMsgToggle = new EzMsgToggleImpl();
    return ezMsgToggle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgBang createEzMsgBang()
  {
    EzMsgBangImpl ezMsgBang = new EzMsgBangImpl();
    return ezMsgBang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgUnforward createEzMsgUnforward()
  {
    EzMsgUnforwardImpl ezMsgUnforward = new EzMsgUnforwardImpl();
    return ezMsgUnforward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgForward createEzMsgForward()
  {
    EzMsgForwardImpl ezMsgForward = new EzMsgForwardImpl();
    return ezMsgForward;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgSet createEzMsgSet()
  {
    EzMsgSetImpl ezMsgSet = new EzMsgSetImpl();
    return ezMsgSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgLegacySet createEzMsgLegacySet()
  {
    EzMsgLegacySetImpl ezMsgLegacySet = new EzMsgLegacySetImpl();
    return ezMsgLegacySet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgSelect createEzMsgSelect()
  {
    EzMsgSelectImpl ezMsgSelect = new EzMsgSelectImpl();
    return ezMsgSelect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgKinematics createEzMsgKinematics()
  {
    EzMsgKinematicsImpl ezMsgKinematics = new EzMsgKinematicsImpl();
    return ezMsgKinematics;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzMsgTrigger createEzMsgTrigger()
  {
    EzMsgTriggerImpl ezMsgTrigger = new EzMsgTriggerImpl();
    return ezMsgTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCExpr createOSCExpr()
  {
    OSCExprImpl oscExpr = new OSCExprImpl();
    return oscExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCSubDomain createOSCSubDomain()
  {
    OSCSubDomainImpl oscSubDomain = new OSCSubDomainImpl();
    return oscSubDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCUDPTarget createOSCUDPTarget()
  {
    OSCUDPTargetImpl oscudpTarget = new OSCUDPTargetImpl();
    return oscudpTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCTCPTarget createOSCTCPTarget()
  {
    OSCTCPTargetImpl osctcpTarget = new OSCTCPTargetImpl();
    return osctcpTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCXBeeTarget createOSCXBeeTarget()
  {
    OSCXBeeTargetImpl oscxBeeTarget = new OSCXBeeTargetImpl();
    return oscxBeeTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCHttpTarget createOSCHttpTarget()
  {
    OSCHttpTargetImpl oscHttpTarget = new OSCHttpTargetImpl();
    return oscHttpTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCBluetoothTarget createOSCBluetoothTarget()
  {
    OSCBluetoothTargetImpl oscBluetoothTarget = new OSCBluetoothTargetImpl();
    return oscBluetoothTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCUSBTarget createOSCUSBTarget()
  {
    OSCUSBTargetImpl oscusbTarget = new OSCUSBTargetImpl();
    return oscusbTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OSCUbqTarget createOSCUbqTarget()
  {
    OSCUbqTargetImpl oscUbqTarget = new OSCUbqTargetImpl();
    return oscUbqTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Speed createSpeed()
  {
    SpeedImpl speed = new SpeedImpl();
    return speed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmVar createJvmVar()
  {
    JvmVarImpl jvmVar = new JvmVarImpl();
    return jvmVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExprModel createExprModel()
  {
    ExprModelImpl exprModel = new ExprModelImpl();
    return exprModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Using createUsing()
  {
    UsingImpl using = new UsingImpl();
    return using;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumDecl createEnumDecl()
  {
    EnumDeclImpl enumDecl = new EnumDeclImpl();
    return enumDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayType createArrayType()
  {
    ArrayTypeImpl arrayType = new ArrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntType createIntType()
  {
    IntTypeImpl intType = new IntTypeImpl();
    return intType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolType createBoolType()
  {
    BoolTypeImpl boolType = new BoolTypeImpl();
    return boolType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatType createFloatType()
  {
    FloatTypeImpl floatType = new FloatTypeImpl();
    return floatType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringType createStringType()
  {
    StringTypeImpl stringType = new StringTypeImpl();
    return stringType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expr createExpr()
  {
    ExprImpl expr = new ExprImpl();
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDeclaration createFunctionDeclaration()
  {
    FunctionDeclarationImpl functionDeclaration = new FunctionDeclarationImpl();
    return functionDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumLiteral createEnumLiteral()
  {
    EnumLiteralImpl enumLiteral = new EnumLiteralImpl();
    return enumLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarDecl createVarDecl()
  {
    VarDeclImpl varDecl = new VarDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Formula createFormula()
  {
    FormulaImpl formula = new FormulaImpl();
    return formula;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equals createEquals()
  {
    EqualsImpl equals = new EqualsImpl();
    return equals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multi createMulti()
  {
    MultiImpl multi = new MultiImpl();
    return multi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayAccess createArrayAccess()
  {
    ArrayAccessImpl arrayAccess = new ArrayAccessImpl();
    return arrayAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SymbolRef createSymbolRef()
  {
    SymbolRefImpl symbolRef = new SymbolRefImpl();
    return symbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberLiteral createNumberLiteral()
  {
    NumberLiteralImpl numberLiteral = new NumberLiteralImpl();
    return numberLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EzFormats createEzFormatsFromString(EDataType eDataType, String initialValue)
  {
    EzFormats result = EzFormats.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEzFormatsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OscDslPackage getOscDslPackage()
  {
    return (OscDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static OscDslPackage getPackage()
  {
    return OscDslPackage.eINSTANCE;
  }

} //OscDslFactoryImpl
