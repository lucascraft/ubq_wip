/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl.impl;

import net.sf.smbt.osc.oscDsl.ArrayAccess;
import net.sf.smbt.osc.oscDsl.ArrayType;
import net.sf.smbt.osc.oscDsl.BoolType;
import net.sf.smbt.osc.oscDsl.Element;
import net.sf.smbt.osc.oscDsl.EnumDecl;
import net.sf.smbt.osc.oscDsl.EnumLiteral;
import net.sf.smbt.osc.oscDsl.EnumType;
import net.sf.smbt.osc.oscDsl.Equals;
import net.sf.smbt.osc.oscDsl.Expr;
import net.sf.smbt.osc.oscDsl.ExprModel;
import net.sf.smbt.osc.oscDsl.Expression;
import net.sf.smbt.osc.oscDsl.EzAliasCmd;
import net.sf.smbt.osc.oscDsl.EzClearCmd;
import net.sf.smbt.osc.oscDsl.EzCloseCmd;
import net.sf.smbt.osc.oscDsl.EzCmd;
import net.sf.smbt.osc.oscDsl.EzFormats;
import net.sf.smbt.osc.oscDsl.EzHelpCmd;
import net.sf.smbt.osc.oscDsl.EzHookCmd;
import net.sf.smbt.osc.oscDsl.EzListCmd;
import net.sf.smbt.osc.oscDsl.EzModel;
import net.sf.smbt.osc.oscDsl.EzMsg;
import net.sf.smbt.osc.oscDsl.EzMsgBang;
import net.sf.smbt.osc.oscDsl.EzMsgBind;
import net.sf.smbt.osc.oscDsl.EzMsgClock;
import net.sf.smbt.osc.oscDsl.EzMsgCmd;
import net.sf.smbt.osc.oscDsl.EzMsgForward;
import net.sf.smbt.osc.oscDsl.EzMsgGet;
import net.sf.smbt.osc.oscDsl.EzMsgKinematics;
import net.sf.smbt.osc.oscDsl.EzMsgLegacySet;
import net.sf.smbt.osc.oscDsl.EzMsgListen;
import net.sf.smbt.osc.oscDsl.EzMsgRemove;
import net.sf.smbt.osc.oscDsl.EzMsgSelect;
import net.sf.smbt.osc.oscDsl.EzMsgService;
import net.sf.smbt.osc.oscDsl.EzMsgSet;
import net.sf.smbt.osc.oscDsl.EzMsgToggle;
import net.sf.smbt.osc.oscDsl.EzMsgTrigger;
import net.sf.smbt.osc.oscDsl.EzMsgUnforward;
import net.sf.smbt.osc.oscDsl.EzMsgUnlisten;
import net.sf.smbt.osc.oscDsl.EzOpenCmd;
import net.sf.smbt.osc.oscDsl.EzProtocolCmd;
import net.sf.smbt.osc.oscDsl.EzResetCmd;
import net.sf.smbt.osc.oscDsl.EzStatusCmd;
import net.sf.smbt.osc.oscDsl.EzUnhookCmd;
import net.sf.smbt.osc.oscDsl.FloatType;
import net.sf.smbt.osc.oscDsl.Formula;
import net.sf.smbt.osc.oscDsl.FunctionDeclaration;
import net.sf.smbt.osc.oscDsl.IntType;
import net.sf.smbt.osc.oscDsl.JvmVar;
import net.sf.smbt.osc.oscDsl.Multi;
import net.sf.smbt.osc.oscDsl.NumberLiteral;
import net.sf.smbt.osc.oscDsl.OSCBluetoothTarget;
import net.sf.smbt.osc.oscDsl.OSCExpr;
import net.sf.smbt.osc.oscDsl.OSCHttpTarget;
import net.sf.smbt.osc.oscDsl.OSCSubDomain;
import net.sf.smbt.osc.oscDsl.OSCTCPTarget;
import net.sf.smbt.osc.oscDsl.OSCUDPTarget;
import net.sf.smbt.osc.oscDsl.OSCUSBTarget;
import net.sf.smbt.osc.oscDsl.OSCUbqTarget;
import net.sf.smbt.osc.oscDsl.OSCXBeeTarget;
import net.sf.smbt.osc.oscDsl.OscDslFactory;
import net.sf.smbt.osc.oscDsl.OscDslPackage;
import net.sf.smbt.osc.oscDsl.Parameter;
import net.sf.smbt.osc.oscDsl.Plus;
import net.sf.smbt.osc.oscDsl.PrimitiveType;
import net.sf.smbt.osc.oscDsl.Return;
import net.sf.smbt.osc.oscDsl.Speed;
import net.sf.smbt.osc.oscDsl.StringLiteral;
import net.sf.smbt.osc.oscDsl.StringType;
import net.sf.smbt.osc.oscDsl.Symbol;
import net.sf.smbt.osc.oscDsl.SymbolRef;
import net.sf.smbt.osc.oscDsl.Type;
import net.sf.smbt.osc.oscDsl.Using;
import net.sf.smbt.osc.oscDsl.VarDecl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OscDslPackageImpl extends EPackageImpl implements OscDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezOpenCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezCloseCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezHookCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezUnhookCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezAliasCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezStatusCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezResetCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezHelpCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezClearCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezProtocolCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezListCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgRemoveEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgGetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgBindEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgListenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgServiceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgUnlistenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgCmdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgClockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgToggleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgBangEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgUnforwardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgForwardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgLegacySetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgSelectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgKinematicsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ezMsgTriggerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscExprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscSubDomainEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscudpTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass osctcpTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscxBeeTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscHttpTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscBluetoothTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscusbTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass oscUbqTargetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass speedEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jvmVarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass usingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitiveTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass boolTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass floatTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass varDeclEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formulaEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass equalsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass plusEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arrayAccessEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numberLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringLiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum ezFormatsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see net.sf.smbt.osc.oscDsl.OscDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private OscDslPackageImpl()
  {
    super(eNS_URI, OscDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link OscDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static OscDslPackage init()
  {
    if (isInited) return (OscDslPackage)EPackage.Registry.INSTANCE.getEPackage(OscDslPackage.eNS_URI);

    // Obtain or create and register package
    OscDslPackageImpl theOscDslPackage = (OscDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OscDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OscDslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theOscDslPackage.createPackageContents();

    // Initialize created meta-data
    theOscDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theOscDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(OscDslPackage.eNS_URI, theOscDslPackage);
    return theOscDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzModel()
  {
    return ezModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzModel_Cmd()
  {
    return (EReference)ezModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzModel_Msg()
  {
    return (EReference)ezModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzCmd()
  {
    return ezCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzCmd_Cmd()
  {
    return (EReference)ezCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzOpenCmd()
  {
    return ezOpenCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzOpenCmd_Targets()
  {
    return (EReference)ezOpenCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzCloseCmd()
  {
    return ezCloseCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzCloseCmd_Targets()
  {
    return (EReference)ezCloseCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzHookCmd()
  {
    return ezHookCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzHookCmd_Targets()
  {
    return (EReference)ezHookCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzUnhookCmd()
  {
    return ezUnhookCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzUnhookCmd_Targets()
  {
    return (EReference)ezUnhookCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzAliasCmd()
  {
    return ezAliasCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzAliasCmd_Alias()
  {
    return (EAttribute)ezAliasCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzAliasCmd_Targets()
  {
    return (EReference)ezAliasCmdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzStatusCmd()
  {
    return ezStatusCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzStatusCmd_Targets()
  {
    return (EReference)ezStatusCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzResetCmd()
  {
    return ezResetCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzResetCmd_Id()
  {
    return (EAttribute)ezResetCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzResetCmd_Verbose()
  {
    return (EAttribute)ezResetCmdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzHelpCmd()
  {
    return ezHelpCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzHelpCmd_Id()
  {
    return (EAttribute)ezHelpCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzHelpCmd_Verbose()
  {
    return (EAttribute)ezHelpCmdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzClearCmd()
  {
    return ezClearCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzClearCmd_Id()
  {
    return (EAttribute)ezClearCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzClearCmd_Verbose()
  {
    return (EAttribute)ezClearCmdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzProtocolCmd()
  {
    return ezProtocolCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzProtocolCmd_Id()
  {
    return (EAttribute)ezProtocolCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEzProtocolCmd_Verbose()
  {
    return (EAttribute)ezProtocolCmdEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzListCmd()
  {
    return ezListCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzListCmd_Addr()
  {
    return (EReference)ezListCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsg()
  {
    return ezMsgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsg_Msg()
  {
    return (EReference)ezMsgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgRemove()
  {
    return ezMsgRemoveEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgRemove_Cmd()
  {
    return (EReference)ezMsgRemoveEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgGet()
  {
    return ezMsgGetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgGet_Cmd()
  {
    return (EReference)ezMsgGetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgBind()
  {
    return ezMsgBindEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgBind_Cmd()
  {
    return (EReference)ezMsgBindEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgListen()
  {
    return ezMsgListenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgListen_Cmd()
  {
    return (EReference)ezMsgListenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgService()
  {
    return ezMsgServiceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgService_Cmd()
  {
    return (EReference)ezMsgServiceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgUnlisten()
  {
    return ezMsgUnlistenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgUnlisten_Cmd()
  {
    return (EReference)ezMsgUnlistenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgCmd()
  {
    return ezMsgCmdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgCmd_Cmd()
  {
    return (EReference)ezMsgCmdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgClock()
  {
    return ezMsgClockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgClock_Cmd()
  {
    return (EReference)ezMsgClockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgToggle()
  {
    return ezMsgToggleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgToggle_Cmd()
  {
    return (EReference)ezMsgToggleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgBang()
  {
    return ezMsgBangEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgBang_Cmd()
  {
    return (EReference)ezMsgBangEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgUnforward()
  {
    return ezMsgUnforwardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgUnforward_Cmd()
  {
    return (EReference)ezMsgUnforwardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgForward()
  {
    return ezMsgForwardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgForward_Cmd()
  {
    return (EReference)ezMsgForwardEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgSet()
  {
    return ezMsgSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgSet_Cmd()
  {
    return (EReference)ezMsgSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgLegacySet()
  {
    return ezMsgLegacySetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgLegacySet_Cmd()
  {
    return (EReference)ezMsgLegacySetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgSelect()
  {
    return ezMsgSelectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgSelect_Cmd()
  {
    return (EReference)ezMsgSelectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgKinematics()
  {
    return ezMsgKinematicsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgKinematics_Cmd()
  {
    return (EReference)ezMsgKinematicsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEzMsgTrigger()
  {
    return ezMsgTriggerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEzMsgTrigger_Cmd()
  {
    return (EReference)ezMsgTriggerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCExpr()
  {
    return oscExprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCExpr_Path()
  {
    return (EAttribute)oscExprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCExpr_Args()
  {
    return (EAttribute)oscExprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOSCExpr_Targets()
  {
    return (EReference)oscExprEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCSubDomain()
  {
    return oscSubDomainEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOSCSubDomain_Expr()
  {
    return (EReference)oscSubDomainEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCUDPTarget()
  {
    return oscudpTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUDPTarget_Proto()
  {
    return (EAttribute)oscudpTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUDPTarget_Addr()
  {
    return (EAttribute)oscudpTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUDPTarget_Format()
  {
    return (EAttribute)oscudpTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCTCPTarget()
  {
    return osctcpTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCTCPTarget_Proto()
  {
    return (EAttribute)osctcpTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCTCPTarget_Addr()
  {
    return (EAttribute)osctcpTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCTCPTarget_Format()
  {
    return (EAttribute)osctcpTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCXBeeTarget()
  {
    return oscxBeeTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCXBeeTarget_Proto()
  {
    return (EAttribute)oscxBeeTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCXBeeTarget_Addr()
  {
    return (EAttribute)oscxBeeTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCXBeeTarget_Format()
  {
    return (EAttribute)oscxBeeTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCHttpTarget()
  {
    return oscHttpTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCHttpTarget_Proto()
  {
    return (EAttribute)oscHttpTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCHttpTarget_Addr()
  {
    return (EAttribute)oscHttpTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCHttpTarget_Format()
  {
    return (EAttribute)oscHttpTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCBluetoothTarget()
  {
    return oscBluetoothTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCBluetoothTarget_Proto()
  {
    return (EAttribute)oscBluetoothTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCBluetoothTarget_Addr()
  {
    return (EAttribute)oscBluetoothTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCBluetoothTarget_Format()
  {
    return (EAttribute)oscBluetoothTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCUSBTarget()
  {
    return oscusbTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUSBTarget_Proto()
  {
    return (EAttribute)oscusbTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUSBTarget_Addr()
  {
    return (EAttribute)oscusbTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOSCUSBTarget_Speed()
  {
    return (EReference)oscusbTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUSBTarget_Format()
  {
    return (EAttribute)oscusbTargetEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOSCUbqTarget()
  {
    return oscUbqTargetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUbqTarget_Proto()
  {
    return (EAttribute)oscUbqTargetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUbqTarget_Addr()
  {
    return (EAttribute)oscUbqTargetEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOSCUbqTarget_Format()
  {
    return (EAttribute)oscUbqTargetEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSpeed()
  {
    return speedEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSpeed_Speed()
  {
    return (EAttribute)speedEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJvmVar()
  {
    return jvmVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJvmVar_Name()
  {
    return (EAttribute)jvmVarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJvmVar_JavaTypes()
  {
    return (EReference)jvmVarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExprModel()
  {
    return exprModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprModel_IsTested()
  {
    return (EAttribute)exprModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExprModel_Name()
  {
    return (EAttribute)exprModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprModel_Usings()
  {
    return (EReference)exprModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprModel_Elements()
  {
    return (EReference)exprModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExprModel_Functions()
  {
    return (EReference)exprModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUsing()
  {
    return usingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUsing_ImportedNamespace()
  {
    return (EAttribute)usingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElement()
  {
    return elementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbol()
  {
    return symbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Name()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturn()
  {
    return returnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturn_Expr()
  {
    return (EReference)returnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumDecl()
  {
    return enumDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumDecl_Name()
  {
    return (EAttribute)enumDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumDecl_Literals()
  {
    return (EReference)enumDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitiveType()
  {
    return primitiveTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayType()
  {
    return arrayTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayType_BaseType()
  {
    return (EReference)arrayTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumType()
  {
    return enumTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumType_EnumRef()
  {
    return (EReference)enumTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIntType()
  {
    return intTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBoolType()
  {
    return boolTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloatType()
  {
    return floatTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringType()
  {
    return stringTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpr()
  {
    return exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionDeclaration()
  {
    return functionDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDeclaration_Type()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDeclaration_Params()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionDeclaration_Elements()
  {
    return (EReference)functionDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumLiteral()
  {
    return enumLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVarDecl()
  {
    return varDeclEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVarDecl_Readonly()
  {
    return (EAttribute)varDeclEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDecl_Type()
  {
    return (EReference)varDeclEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVarDecl_Init()
  {
    return (EReference)varDeclEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormula()
  {
    return formulaEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormula_Type()
  {
    return (EReference)formulaEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFormula_Expr()
  {
    return (EReference)formulaEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEquals()
  {
    return equalsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquals_Left()
  {
    return (EReference)equalsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEquals_Right()
  {
    return (EReference)equalsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPlus()
  {
    return plusEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Left()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPlus_Right()
  {
    return (EReference)plusEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMulti()
  {
    return multiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Left()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMulti_Right()
  {
    return (EReference)multiEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArrayAccess()
  {
    return arrayAccessEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayAccess_Expr()
  {
    return (EReference)arrayAccessEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArrayAccess_Index()
  {
    return (EReference)arrayAccessEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbolRef()
  {
    return symbolRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRef_Symbol()
  {
    return (EReference)symbolRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbolRef_Actuals()
  {
    return (EReference)symbolRefEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumberLiteral()
  {
    return numberLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumberLiteral_Value()
  {
    return (EAttribute)numberLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStringLiteral()
  {
    return stringLiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStringLiteral_Value()
  {
    return (EAttribute)stringLiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEzFormats()
  {
    return ezFormatsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OscDslFactory getOscDslFactory()
  {
    return (OscDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    ezModelEClass = createEClass(EZ_MODEL);
    createEReference(ezModelEClass, EZ_MODEL__CMD);
    createEReference(ezModelEClass, EZ_MODEL__MSG);

    ezCmdEClass = createEClass(EZ_CMD);
    createEReference(ezCmdEClass, EZ_CMD__CMD);

    ezOpenCmdEClass = createEClass(EZ_OPEN_CMD);
    createEReference(ezOpenCmdEClass, EZ_OPEN_CMD__TARGETS);

    ezCloseCmdEClass = createEClass(EZ_CLOSE_CMD);
    createEReference(ezCloseCmdEClass, EZ_CLOSE_CMD__TARGETS);

    ezHookCmdEClass = createEClass(EZ_HOOK_CMD);
    createEReference(ezHookCmdEClass, EZ_HOOK_CMD__TARGETS);

    ezUnhookCmdEClass = createEClass(EZ_UNHOOK_CMD);
    createEReference(ezUnhookCmdEClass, EZ_UNHOOK_CMD__TARGETS);

    ezAliasCmdEClass = createEClass(EZ_ALIAS_CMD);
    createEAttribute(ezAliasCmdEClass, EZ_ALIAS_CMD__ALIAS);
    createEReference(ezAliasCmdEClass, EZ_ALIAS_CMD__TARGETS);

    ezStatusCmdEClass = createEClass(EZ_STATUS_CMD);
    createEReference(ezStatusCmdEClass, EZ_STATUS_CMD__TARGETS);

    ezResetCmdEClass = createEClass(EZ_RESET_CMD);
    createEAttribute(ezResetCmdEClass, EZ_RESET_CMD__ID);
    createEAttribute(ezResetCmdEClass, EZ_RESET_CMD__VERBOSE);

    ezHelpCmdEClass = createEClass(EZ_HELP_CMD);
    createEAttribute(ezHelpCmdEClass, EZ_HELP_CMD__ID);
    createEAttribute(ezHelpCmdEClass, EZ_HELP_CMD__VERBOSE);

    ezClearCmdEClass = createEClass(EZ_CLEAR_CMD);
    createEAttribute(ezClearCmdEClass, EZ_CLEAR_CMD__ID);
    createEAttribute(ezClearCmdEClass, EZ_CLEAR_CMD__VERBOSE);

    ezProtocolCmdEClass = createEClass(EZ_PROTOCOL_CMD);
    createEAttribute(ezProtocolCmdEClass, EZ_PROTOCOL_CMD__ID);
    createEAttribute(ezProtocolCmdEClass, EZ_PROTOCOL_CMD__VERBOSE);

    ezListCmdEClass = createEClass(EZ_LIST_CMD);
    createEReference(ezListCmdEClass, EZ_LIST_CMD__ADDR);

    ezMsgEClass = createEClass(EZ_MSG);
    createEReference(ezMsgEClass, EZ_MSG__MSG);

    ezMsgRemoveEClass = createEClass(EZ_MSG_REMOVE);
    createEReference(ezMsgRemoveEClass, EZ_MSG_REMOVE__CMD);

    ezMsgGetEClass = createEClass(EZ_MSG_GET);
    createEReference(ezMsgGetEClass, EZ_MSG_GET__CMD);

    ezMsgBindEClass = createEClass(EZ_MSG_BIND);
    createEReference(ezMsgBindEClass, EZ_MSG_BIND__CMD);

    ezMsgListenEClass = createEClass(EZ_MSG_LISTEN);
    createEReference(ezMsgListenEClass, EZ_MSG_LISTEN__CMD);

    ezMsgServiceEClass = createEClass(EZ_MSG_SERVICE);
    createEReference(ezMsgServiceEClass, EZ_MSG_SERVICE__CMD);

    ezMsgUnlistenEClass = createEClass(EZ_MSG_UNLISTEN);
    createEReference(ezMsgUnlistenEClass, EZ_MSG_UNLISTEN__CMD);

    ezMsgCmdEClass = createEClass(EZ_MSG_CMD);
    createEReference(ezMsgCmdEClass, EZ_MSG_CMD__CMD);

    ezMsgClockEClass = createEClass(EZ_MSG_CLOCK);
    createEReference(ezMsgClockEClass, EZ_MSG_CLOCK__CMD);

    ezMsgToggleEClass = createEClass(EZ_MSG_TOGGLE);
    createEReference(ezMsgToggleEClass, EZ_MSG_TOGGLE__CMD);

    ezMsgBangEClass = createEClass(EZ_MSG_BANG);
    createEReference(ezMsgBangEClass, EZ_MSG_BANG__CMD);

    ezMsgUnforwardEClass = createEClass(EZ_MSG_UNFORWARD);
    createEReference(ezMsgUnforwardEClass, EZ_MSG_UNFORWARD__CMD);

    ezMsgForwardEClass = createEClass(EZ_MSG_FORWARD);
    createEReference(ezMsgForwardEClass, EZ_MSG_FORWARD__CMD);

    ezMsgSetEClass = createEClass(EZ_MSG_SET);
    createEReference(ezMsgSetEClass, EZ_MSG_SET__CMD);

    ezMsgLegacySetEClass = createEClass(EZ_MSG_LEGACY_SET);
    createEReference(ezMsgLegacySetEClass, EZ_MSG_LEGACY_SET__CMD);

    ezMsgSelectEClass = createEClass(EZ_MSG_SELECT);
    createEReference(ezMsgSelectEClass, EZ_MSG_SELECT__CMD);

    ezMsgKinematicsEClass = createEClass(EZ_MSG_KINEMATICS);
    createEReference(ezMsgKinematicsEClass, EZ_MSG_KINEMATICS__CMD);

    ezMsgTriggerEClass = createEClass(EZ_MSG_TRIGGER);
    createEReference(ezMsgTriggerEClass, EZ_MSG_TRIGGER__CMD);

    oscExprEClass = createEClass(OSC_EXPR);
    createEAttribute(oscExprEClass, OSC_EXPR__PATH);
    createEAttribute(oscExprEClass, OSC_EXPR__ARGS);
    createEReference(oscExprEClass, OSC_EXPR__TARGETS);

    oscSubDomainEClass = createEClass(OSC_SUB_DOMAIN);
    createEReference(oscSubDomainEClass, OSC_SUB_DOMAIN__EXPR);

    oscudpTargetEClass = createEClass(OSCUDP_TARGET);
    createEAttribute(oscudpTargetEClass, OSCUDP_TARGET__PROTO);
    createEAttribute(oscudpTargetEClass, OSCUDP_TARGET__ADDR);
    createEAttribute(oscudpTargetEClass, OSCUDP_TARGET__FORMAT);

    osctcpTargetEClass = createEClass(OSCTCP_TARGET);
    createEAttribute(osctcpTargetEClass, OSCTCP_TARGET__PROTO);
    createEAttribute(osctcpTargetEClass, OSCTCP_TARGET__ADDR);
    createEAttribute(osctcpTargetEClass, OSCTCP_TARGET__FORMAT);

    oscxBeeTargetEClass = createEClass(OSCX_BEE_TARGET);
    createEAttribute(oscxBeeTargetEClass, OSCX_BEE_TARGET__PROTO);
    createEAttribute(oscxBeeTargetEClass, OSCX_BEE_TARGET__ADDR);
    createEAttribute(oscxBeeTargetEClass, OSCX_BEE_TARGET__FORMAT);

    oscHttpTargetEClass = createEClass(OSC_HTTP_TARGET);
    createEAttribute(oscHttpTargetEClass, OSC_HTTP_TARGET__PROTO);
    createEAttribute(oscHttpTargetEClass, OSC_HTTP_TARGET__ADDR);
    createEAttribute(oscHttpTargetEClass, OSC_HTTP_TARGET__FORMAT);

    oscBluetoothTargetEClass = createEClass(OSC_BLUETOOTH_TARGET);
    createEAttribute(oscBluetoothTargetEClass, OSC_BLUETOOTH_TARGET__PROTO);
    createEAttribute(oscBluetoothTargetEClass, OSC_BLUETOOTH_TARGET__ADDR);
    createEAttribute(oscBluetoothTargetEClass, OSC_BLUETOOTH_TARGET__FORMAT);

    oscusbTargetEClass = createEClass(OSCUSB_TARGET);
    createEAttribute(oscusbTargetEClass, OSCUSB_TARGET__PROTO);
    createEAttribute(oscusbTargetEClass, OSCUSB_TARGET__ADDR);
    createEReference(oscusbTargetEClass, OSCUSB_TARGET__SPEED);
    createEAttribute(oscusbTargetEClass, OSCUSB_TARGET__FORMAT);

    oscUbqTargetEClass = createEClass(OSC_UBQ_TARGET);
    createEAttribute(oscUbqTargetEClass, OSC_UBQ_TARGET__PROTO);
    createEAttribute(oscUbqTargetEClass, OSC_UBQ_TARGET__ADDR);
    createEAttribute(oscUbqTargetEClass, OSC_UBQ_TARGET__FORMAT);

    speedEClass = createEClass(SPEED);
    createEAttribute(speedEClass, SPEED__SPEED);

    jvmVarEClass = createEClass(JVM_VAR);
    createEAttribute(jvmVarEClass, JVM_VAR__NAME);
    createEReference(jvmVarEClass, JVM_VAR__JAVA_TYPES);

    exprModelEClass = createEClass(EXPR_MODEL);
    createEAttribute(exprModelEClass, EXPR_MODEL__IS_TESTED);
    createEAttribute(exprModelEClass, EXPR_MODEL__NAME);
    createEReference(exprModelEClass, EXPR_MODEL__USINGS);
    createEReference(exprModelEClass, EXPR_MODEL__ELEMENTS);
    createEReference(exprModelEClass, EXPR_MODEL__FUNCTIONS);

    usingEClass = createEClass(USING);
    createEAttribute(usingEClass, USING__IMPORTED_NAMESPACE);

    elementEClass = createEClass(ELEMENT);

    symbolEClass = createEClass(SYMBOL);
    createEAttribute(symbolEClass, SYMBOL__NAME);

    returnEClass = createEClass(RETURN);
    createEReference(returnEClass, RETURN__EXPR);

    enumDeclEClass = createEClass(ENUM_DECL);
    createEAttribute(enumDeclEClass, ENUM_DECL__NAME);
    createEReference(enumDeclEClass, ENUM_DECL__LITERALS);

    typeEClass = createEClass(TYPE);

    primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

    arrayTypeEClass = createEClass(ARRAY_TYPE);
    createEReference(arrayTypeEClass, ARRAY_TYPE__BASE_TYPE);

    enumTypeEClass = createEClass(ENUM_TYPE);
    createEReference(enumTypeEClass, ENUM_TYPE__ENUM_REF);

    intTypeEClass = createEClass(INT_TYPE);

    boolTypeEClass = createEClass(BOOL_TYPE);

    floatTypeEClass = createEClass(FLOAT_TYPE);

    stringTypeEClass = createEClass(STRING_TYPE);

    exprEClass = createEClass(EXPR);

    expressionEClass = createEClass(EXPRESSION);

    functionDeclarationEClass = createEClass(FUNCTION_DECLARATION);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__TYPE);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__PARAMS);
    createEReference(functionDeclarationEClass, FUNCTION_DECLARATION__ELEMENTS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);

    enumLiteralEClass = createEClass(ENUM_LITERAL);

    varDeclEClass = createEClass(VAR_DECL);
    createEAttribute(varDeclEClass, VAR_DECL__READONLY);
    createEReference(varDeclEClass, VAR_DECL__TYPE);
    createEReference(varDeclEClass, VAR_DECL__INIT);

    formulaEClass = createEClass(FORMULA);
    createEReference(formulaEClass, FORMULA__TYPE);
    createEReference(formulaEClass, FORMULA__EXPR);

    equalsEClass = createEClass(EQUALS);
    createEReference(equalsEClass, EQUALS__LEFT);
    createEReference(equalsEClass, EQUALS__RIGHT);

    plusEClass = createEClass(PLUS);
    createEReference(plusEClass, PLUS__LEFT);
    createEReference(plusEClass, PLUS__RIGHT);

    multiEClass = createEClass(MULTI);
    createEReference(multiEClass, MULTI__LEFT);
    createEReference(multiEClass, MULTI__RIGHT);

    arrayAccessEClass = createEClass(ARRAY_ACCESS);
    createEReference(arrayAccessEClass, ARRAY_ACCESS__EXPR);
    createEReference(arrayAccessEClass, ARRAY_ACCESS__INDEX);

    symbolRefEClass = createEClass(SYMBOL_REF);
    createEReference(symbolRefEClass, SYMBOL_REF__SYMBOL);
    createEReference(symbolRefEClass, SYMBOL_REF__ACTUALS);

    numberLiteralEClass = createEClass(NUMBER_LITERAL);
    createEAttribute(numberLiteralEClass, NUMBER_LITERAL__VALUE);

    stringLiteralEClass = createEClass(STRING_LITERAL);
    createEAttribute(stringLiteralEClass, STRING_LITERAL__VALUE);

    // Create enums
    ezFormatsEEnum = createEEnum(EZ_FORMATS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    oscSubDomainEClass.getESuperTypes().add(this.getEzMsg());
    symbolEClass.getESuperTypes().add(this.getElement());
    returnEClass.getESuperTypes().add(this.getElement());
    enumDeclEClass.getESuperTypes().add(this.getElement());
    primitiveTypeEClass.getESuperTypes().add(this.getType());
    arrayTypeEClass.getESuperTypes().add(this.getType());
    enumTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    intTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    boolTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    floatTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    stringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
    expressionEClass.getESuperTypes().add(this.getExpr());
    functionDeclarationEClass.getESuperTypes().add(this.getSymbol());
    parameterEClass.getESuperTypes().add(this.getSymbol());
    enumLiteralEClass.getESuperTypes().add(this.getSymbol());
    varDeclEClass.getESuperTypes().add(this.getSymbol());
    formulaEClass.getESuperTypes().add(this.getSymbol());
    equalsEClass.getESuperTypes().add(this.getExpression());
    plusEClass.getESuperTypes().add(this.getExpression());
    multiEClass.getESuperTypes().add(this.getExpression());
    arrayAccessEClass.getESuperTypes().add(this.getExpression());
    symbolRefEClass.getESuperTypes().add(this.getExpression());
    numberLiteralEClass.getESuperTypes().add(this.getExpression());
    stringLiteralEClass.getESuperTypes().add(this.getExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(ezModelEClass, EzModel.class, "EzModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzModel_Cmd(), this.getEzCmd(), null, "cmd", null, 0, 1, EzModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEzModel_Msg(), this.getEzMsg(), null, "msg", null, 0, -1, EzModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezCmdEClass, EzCmd.class, "EzCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzCmd_Cmd(), ecorePackage.getEObject(), null, "cmd", null, 0, 1, EzCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezOpenCmdEClass, EzOpenCmd.class, "EzOpenCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzOpenCmd_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, EzOpenCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezCloseCmdEClass, EzCloseCmd.class, "EzCloseCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzCloseCmd_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, EzCloseCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezHookCmdEClass, EzHookCmd.class, "EzHookCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzHookCmd_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, EzHookCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezUnhookCmdEClass, EzUnhookCmd.class, "EzUnhookCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzUnhookCmd_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, EzUnhookCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezAliasCmdEClass, EzAliasCmd.class, "EzAliasCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEzAliasCmd_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, EzAliasCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEzAliasCmd_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, EzAliasCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezStatusCmdEClass, EzStatusCmd.class, "EzStatusCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzStatusCmd_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, EzStatusCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezResetCmdEClass, EzResetCmd.class, "EzResetCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEzResetCmd_Id(), ecorePackage.getEString(), "id", null, 0, 1, EzResetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEzResetCmd_Verbose(), ecorePackage.getEString(), "verbose", null, 0, 1, EzResetCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezHelpCmdEClass, EzHelpCmd.class, "EzHelpCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEzHelpCmd_Id(), ecorePackage.getEString(), "id", null, 0, 1, EzHelpCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEzHelpCmd_Verbose(), ecorePackage.getEString(), "verbose", null, 0, 1, EzHelpCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezClearCmdEClass, EzClearCmd.class, "EzClearCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEzClearCmd_Id(), ecorePackage.getEString(), "id", null, 0, 1, EzClearCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEzClearCmd_Verbose(), ecorePackage.getEString(), "verbose", null, 0, 1, EzClearCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezProtocolCmdEClass, EzProtocolCmd.class, "EzProtocolCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEzProtocolCmd_Id(), ecorePackage.getEString(), "id", null, 0, 1, EzProtocolCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEzProtocolCmd_Verbose(), ecorePackage.getEString(), "verbose", null, 0, 1, EzProtocolCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezListCmdEClass, EzListCmd.class, "EzListCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzListCmd_Addr(), this.getEzAliasCmd(), null, "addr", null, 0, 1, EzListCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgEClass, EzMsg.class, "EzMsg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsg_Msg(), ecorePackage.getEObject(), null, "msg", null, 0, 1, EzMsg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgRemoveEClass, EzMsgRemove.class, "EzMsgRemove", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgRemove_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgRemove.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgGetEClass, EzMsgGet.class, "EzMsgGet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgGet_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgGet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgBindEClass, EzMsgBind.class, "EzMsgBind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgBind_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgBind.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgListenEClass, EzMsgListen.class, "EzMsgListen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgListen_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgListen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgServiceEClass, EzMsgService.class, "EzMsgService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgService_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgUnlistenEClass, EzMsgUnlisten.class, "EzMsgUnlisten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgUnlisten_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgUnlisten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgCmdEClass, EzMsgCmd.class, "EzMsgCmd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgCmd_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgCmd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgClockEClass, EzMsgClock.class, "EzMsgClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgClock_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgToggleEClass, EzMsgToggle.class, "EzMsgToggle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgToggle_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgToggle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgBangEClass, EzMsgBang.class, "EzMsgBang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgBang_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgBang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgUnforwardEClass, EzMsgUnforward.class, "EzMsgUnforward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgUnforward_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgUnforward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgForwardEClass, EzMsgForward.class, "EzMsgForward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgForward_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgForward.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgSetEClass, EzMsgSet.class, "EzMsgSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgSet_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgLegacySetEClass, EzMsgLegacySet.class, "EzMsgLegacySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgLegacySet_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgLegacySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgSelectEClass, EzMsgSelect.class, "EzMsgSelect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgSelect_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgSelect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgKinematicsEClass, EzMsgKinematics.class, "EzMsgKinematics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgKinematics_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgKinematics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ezMsgTriggerEClass, EzMsgTrigger.class, "EzMsgTrigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEzMsgTrigger_Cmd(), this.getOSCExpr(), null, "cmd", null, 0, 1, EzMsgTrigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscExprEClass, OSCExpr.class, "OSCExpr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCExpr_Path(), ecorePackage.getEString(), "path", null, 0, 1, OSCExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCExpr_Args(), ecorePackage.getEString(), "args", null, 0, -1, OSCExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOSCExpr_Targets(), ecorePackage.getEObject(), null, "targets", null, 0, -1, OSCExpr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscSubDomainEClass, OSCSubDomain.class, "OSCSubDomain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOSCSubDomain_Expr(), this.getEzMsg(), null, "expr", null, 0, 1, OSCSubDomain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscudpTargetEClass, OSCUDPTarget.class, "OSCUDPTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCUDPTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCUDPTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCUDPTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCUDPTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCUDPTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCUDPTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(osctcpTargetEClass, OSCTCPTarget.class, "OSCTCPTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCTCPTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCTCPTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCTCPTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCTCPTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCTCPTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCTCPTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscxBeeTargetEClass, OSCXBeeTarget.class, "OSCXBeeTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCXBeeTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCXBeeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCXBeeTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCXBeeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCXBeeTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCXBeeTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscHttpTargetEClass, OSCHttpTarget.class, "OSCHttpTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCHttpTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCHttpTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCHttpTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCHttpTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCHttpTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCHttpTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscBluetoothTargetEClass, OSCBluetoothTarget.class, "OSCBluetoothTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCBluetoothTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCBluetoothTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCBluetoothTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCBluetoothTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCBluetoothTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCBluetoothTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscusbTargetEClass, OSCUSBTarget.class, "OSCUSBTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCUSBTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCUSBTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCUSBTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCUSBTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOSCUSBTarget_Speed(), this.getSpeed(), null, "speed", null, 0, 1, OSCUSBTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCUSBTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCUSBTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(oscUbqTargetEClass, OSCUbqTarget.class, "OSCUbqTarget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOSCUbqTarget_Proto(), ecorePackage.getEString(), "proto", null, 0, 1, OSCUbqTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCUbqTarget_Addr(), ecorePackage.getEString(), "addr", null, 0, 1, OSCUbqTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOSCUbqTarget_Format(), this.getEzFormats(), "format", null, 0, 1, OSCUbqTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(speedEClass, Speed.class, "Speed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSpeed_Speed(), ecorePackage.getEString(), "speed", null, 0, 1, Speed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jvmVarEClass, JvmVar.class, "JvmVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJvmVar_Name(), ecorePackage.getEString(), "name", null, 0, 1, JvmVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJvmVar_JavaTypes(), theTypesPackage.getJvmType(), null, "javaTypes", null, 0, -1, JvmVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exprModelEClass, ExprModel.class, "ExprModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExprModel_IsTested(), ecorePackage.getEBoolean(), "isTested", null, 0, 1, ExprModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExprModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, ExprModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprModel_Usings(), this.getUsing(), null, "usings", null, 0, -1, ExprModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprModel_Elements(), this.getElement(), null, "elements", null, 0, -1, ExprModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExprModel_Functions(), this.getSymbol(), null, "functions", null, 0, -1, ExprModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(usingEClass, Using.class, "Using", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUsing_ImportedNamespace(), ecorePackage.getEString(), "importedNamespace", null, 0, 1, Using.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbol_Name(), ecorePackage.getEString(), "name", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturn_Expr(), this.getExpr(), null, "expr", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumDeclEClass, EnumDecl.class, "EnumDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumDecl_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumDecl_Literals(), this.getSymbol(), null, "literals", null, 0, -1, EnumDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayType_BaseType(), this.getType(), null, "baseType", null, 0, 1, ArrayType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumTypeEClass, EnumType.class, "EnumType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnumType_EnumRef(), this.getEnumDecl(), null, "enumRef", null, 0, 1, EnumType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intTypeEClass, IntType.class, "IntType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(boolTypeEClass, BoolType.class, "BoolType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(floatTypeEClass, FloatType.class, "FloatType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(exprEClass, Expr.class, "Expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(functionDeclarationEClass, FunctionDeclaration.class, "FunctionDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionDeclaration_Type(), this.getType(), null, "type", null, 0, 1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDeclaration_Params(), this.getSymbol(), null, "params", null, 0, -1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionDeclaration_Elements(), this.getElement(), null, "elements", null, 0, -1, FunctionDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumLiteralEClass, EnumLiteral.class, "EnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(varDeclEClass, VarDecl.class, "VarDecl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVarDecl_Readonly(), ecorePackage.getEBoolean(), "readonly", null, 0, 1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVarDecl_Type(), this.getType(), null, "type", null, 0, 1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVarDecl_Init(), this.getExpr(), null, "init", null, 0, 1, VarDecl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formulaEClass, Formula.class, "Formula", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFormula_Type(), this.getType(), null, "type", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFormula_Expr(), this.getExpr(), null, "expr", null, 0, 1, Formula.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEquals_Left(), this.getExpression(), null, "left", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEquals_Right(), this.getExpression(), null, "right", null, 0, 1, Equals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPlus_Left(), this.getExpression(), null, "left", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPlus_Right(), this.getExpression(), null, "right", null, 0, 1, Plus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiEClass, Multi.class, "Multi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMulti_Left(), this.getExpression(), null, "left", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMulti_Right(), this.getExpression(), null, "right", null, 0, 1, Multi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arrayAccessEClass, ArrayAccess.class, "ArrayAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArrayAccess_Expr(), this.getExpression(), null, "expr", null, 0, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArrayAccess_Index(), this.getExpr(), null, "index", null, 0, 1, ArrayAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbolRefEClass, SymbolRef.class, "SymbolRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSymbolRef_Symbol(), this.getSymbol(), null, "symbol", null, 0, 1, SymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSymbolRef_Actuals(), this.getExpr(), null, "actuals", null, 0, -1, SymbolRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numberLiteralEClass, NumberLiteral.class, "NumberLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumberLiteral_Value(), ecorePackage.getEFloatObject(), "value", null, 0, 1, NumberLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringLiteralEClass, StringLiteral.class, "StringLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStringLiteral_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(ezFormatsEEnum, EzFormats.class, "EzFormats");
    addEEnumLiteral(ezFormatsEEnum, EzFormats.OSC);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.MIDI);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.DMX);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.OSCABLETON);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.OSCWIIMOTE);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.OSCRESOLUME);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.TUIO);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.TUIO2);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.THINGM);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.FIRMATA);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.I2CFIRMATA);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.PACHUBE);
    addEEnumLiteral(ezFormatsEEnum, EzFormats.UBIQUINO);

    // Create resource
    createResource(eNS_URI);
  }

} //OscDslPackageImpl
