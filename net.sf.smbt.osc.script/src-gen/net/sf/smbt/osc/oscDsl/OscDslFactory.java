/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.oscDsl.OscDslPackage
 * @generated
 */
public interface OscDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OscDslFactory eINSTANCE = net.sf.smbt.osc.oscDsl.impl.OscDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Ez Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Model</em>'.
   * @generated
   */
  EzModel createEzModel();

  /**
   * Returns a new object of class '<em>Ez Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Cmd</em>'.
   * @generated
   */
  EzCmd createEzCmd();

  /**
   * Returns a new object of class '<em>Ez Open Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Open Cmd</em>'.
   * @generated
   */
  EzOpenCmd createEzOpenCmd();

  /**
   * Returns a new object of class '<em>Ez Close Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Close Cmd</em>'.
   * @generated
   */
  EzCloseCmd createEzCloseCmd();

  /**
   * Returns a new object of class '<em>Ez Hook Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Hook Cmd</em>'.
   * @generated
   */
  EzHookCmd createEzHookCmd();

  /**
   * Returns a new object of class '<em>Ez Unhook Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Unhook Cmd</em>'.
   * @generated
   */
  EzUnhookCmd createEzUnhookCmd();

  /**
   * Returns a new object of class '<em>Ez Alias Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Alias Cmd</em>'.
   * @generated
   */
  EzAliasCmd createEzAliasCmd();

  /**
   * Returns a new object of class '<em>Ez Status Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Status Cmd</em>'.
   * @generated
   */
  EzStatusCmd createEzStatusCmd();

  /**
   * Returns a new object of class '<em>Ez Reset Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Reset Cmd</em>'.
   * @generated
   */
  EzResetCmd createEzResetCmd();

  /**
   * Returns a new object of class '<em>Ez Help Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Help Cmd</em>'.
   * @generated
   */
  EzHelpCmd createEzHelpCmd();

  /**
   * Returns a new object of class '<em>Ez Clear Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Clear Cmd</em>'.
   * @generated
   */
  EzClearCmd createEzClearCmd();

  /**
   * Returns a new object of class '<em>Ez Protocol Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Protocol Cmd</em>'.
   * @generated
   */
  EzProtocolCmd createEzProtocolCmd();

  /**
   * Returns a new object of class '<em>Ez List Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez List Cmd</em>'.
   * @generated
   */
  EzListCmd createEzListCmd();

  /**
   * Returns a new object of class '<em>Ez Msg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg</em>'.
   * @generated
   */
  EzMsg createEzMsg();

  /**
   * Returns a new object of class '<em>Ez Msg Remove</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Remove</em>'.
   * @generated
   */
  EzMsgRemove createEzMsgRemove();

  /**
   * Returns a new object of class '<em>Ez Msg Get</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Get</em>'.
   * @generated
   */
  EzMsgGet createEzMsgGet();

  /**
   * Returns a new object of class '<em>Ez Msg Bind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Bind</em>'.
   * @generated
   */
  EzMsgBind createEzMsgBind();

  /**
   * Returns a new object of class '<em>Ez Msg Listen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Listen</em>'.
   * @generated
   */
  EzMsgListen createEzMsgListen();

  /**
   * Returns a new object of class '<em>Ez Msg Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Service</em>'.
   * @generated
   */
  EzMsgService createEzMsgService();

  /**
   * Returns a new object of class '<em>Ez Msg Unlisten</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Unlisten</em>'.
   * @generated
   */
  EzMsgUnlisten createEzMsgUnlisten();

  /**
   * Returns a new object of class '<em>Ez Msg Cmd</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Cmd</em>'.
   * @generated
   */
  EzMsgCmd createEzMsgCmd();

  /**
   * Returns a new object of class '<em>Ez Msg Clock</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Clock</em>'.
   * @generated
   */
  EzMsgClock createEzMsgClock();

  /**
   * Returns a new object of class '<em>Ez Msg Toggle</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Toggle</em>'.
   * @generated
   */
  EzMsgToggle createEzMsgToggle();

  /**
   * Returns a new object of class '<em>Ez Msg Bang</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Bang</em>'.
   * @generated
   */
  EzMsgBang createEzMsgBang();

  /**
   * Returns a new object of class '<em>Ez Msg Unforward</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Unforward</em>'.
   * @generated
   */
  EzMsgUnforward createEzMsgUnforward();

  /**
   * Returns a new object of class '<em>Ez Msg Forward</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Forward</em>'.
   * @generated
   */
  EzMsgForward createEzMsgForward();

  /**
   * Returns a new object of class '<em>Ez Msg Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Set</em>'.
   * @generated
   */
  EzMsgSet createEzMsgSet();

  /**
   * Returns a new object of class '<em>Ez Msg Legacy Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Legacy Set</em>'.
   * @generated
   */
  EzMsgLegacySet createEzMsgLegacySet();

  /**
   * Returns a new object of class '<em>Ez Msg Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Select</em>'.
   * @generated
   */
  EzMsgSelect createEzMsgSelect();

  /**
   * Returns a new object of class '<em>Ez Msg Kinematics</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Kinematics</em>'.
   * @generated
   */
  EzMsgKinematics createEzMsgKinematics();

  /**
   * Returns a new object of class '<em>Ez Msg Trigger</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ez Msg Trigger</em>'.
   * @generated
   */
  EzMsgTrigger createEzMsgTrigger();

  /**
   * Returns a new object of class '<em>OSC Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSC Expr</em>'.
   * @generated
   */
  OSCExpr createOSCExpr();

  /**
   * Returns a new object of class '<em>OSC Sub Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSC Sub Domain</em>'.
   * @generated
   */
  OSCSubDomain createOSCSubDomain();

  /**
   * Returns a new object of class '<em>OSCUDP Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSCUDP Target</em>'.
   * @generated
   */
  OSCUDPTarget createOSCUDPTarget();

  /**
   * Returns a new object of class '<em>OSCTCP Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSCTCP Target</em>'.
   * @generated
   */
  OSCTCPTarget createOSCTCPTarget();

  /**
   * Returns a new object of class '<em>OSCX Bee Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSCX Bee Target</em>'.
   * @generated
   */
  OSCXBeeTarget createOSCXBeeTarget();

  /**
   * Returns a new object of class '<em>OSC Http Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSC Http Target</em>'.
   * @generated
   */
  OSCHttpTarget createOSCHttpTarget();

  /**
   * Returns a new object of class '<em>OSC Bluetooth Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSC Bluetooth Target</em>'.
   * @generated
   */
  OSCBluetoothTarget createOSCBluetoothTarget();

  /**
   * Returns a new object of class '<em>OSCUSB Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSCUSB Target</em>'.
   * @generated
   */
  OSCUSBTarget createOSCUSBTarget();

  /**
   * Returns a new object of class '<em>OSC Ubq Target</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>OSC Ubq Target</em>'.
   * @generated
   */
  OSCUbqTarget createOSCUbqTarget();

  /**
   * Returns a new object of class '<em>Speed</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Speed</em>'.
   * @generated
   */
  Speed createSpeed();

  /**
   * Returns a new object of class '<em>Jvm Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jvm Var</em>'.
   * @generated
   */
  JvmVar createJvmVar();

  /**
   * Returns a new object of class '<em>Expr Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr Model</em>'.
   * @generated
   */
  ExprModel createExprModel();

  /**
   * Returns a new object of class '<em>Using</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Using</em>'.
   * @generated
   */
  Using createUsing();

  /**
   * Returns a new object of class '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element</em>'.
   * @generated
   */
  Element createElement();

  /**
   * Returns a new object of class '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol</em>'.
   * @generated
   */
  Symbol createSymbol();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

  /**
   * Returns a new object of class '<em>Enum Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Decl</em>'.
   * @generated
   */
  EnumDecl createEnumDecl();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primitive Type</em>'.
   * @generated
   */
  PrimitiveType createPrimitiveType();

  /**
   * Returns a new object of class '<em>Array Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Type</em>'.
   * @generated
   */
  ArrayType createArrayType();

  /**
   * Returns a new object of class '<em>Enum Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Type</em>'.
   * @generated
   */
  EnumType createEnumType();

  /**
   * Returns a new object of class '<em>Int Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Int Type</em>'.
   * @generated
   */
  IntType createIntType();

  /**
   * Returns a new object of class '<em>Bool Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Type</em>'.
   * @generated
   */
  BoolType createBoolType();

  /**
   * Returns a new object of class '<em>Float Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Type</em>'.
   * @generated
   */
  FloatType createFloatType();

  /**
   * Returns a new object of class '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Type</em>'.
   * @generated
   */
  StringType createStringType();

  /**
   * Returns a new object of class '<em>Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expr</em>'.
   * @generated
   */
  Expr createExpr();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Function Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Declaration</em>'.
   * @generated
   */
  FunctionDeclaration createFunctionDeclaration();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Literal</em>'.
   * @generated
   */
  EnumLiteral createEnumLiteral();

  /**
   * Returns a new object of class '<em>Var Decl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Var Decl</em>'.
   * @generated
   */
  VarDecl createVarDecl();

  /**
   * Returns a new object of class '<em>Formula</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Formula</em>'.
   * @generated
   */
  Formula createFormula();

  /**
   * Returns a new object of class '<em>Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equals</em>'.
   * @generated
   */
  Equals createEquals();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Multi</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi</em>'.
   * @generated
   */
  Multi createMulti();

  /**
   * Returns a new object of class '<em>Array Access</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array Access</em>'.
   * @generated
   */
  ArrayAccess createArrayAccess();

  /**
   * Returns a new object of class '<em>Symbol Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Symbol Ref</em>'.
   * @generated
   */
  SymbolRef createSymbolRef();

  /**
   * Returns a new object of class '<em>Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Literal</em>'.
   * @generated
   */
  NumberLiteral createNumberLiteral();

  /**
   * Returns a new object of class '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Literal</em>'.
   * @generated
   */
  StringLiteral createStringLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OscDslPackage getOscDslPackage();

} //OscDslFactory
