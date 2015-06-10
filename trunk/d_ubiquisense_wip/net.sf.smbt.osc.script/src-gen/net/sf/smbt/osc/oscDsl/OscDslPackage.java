/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.osc.oscDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.sf.smbt.osc.oscDsl.OscDslFactory
 * @model kind="package"
 * @generated
 */
public interface OscDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "oscDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/smbt/osc/OscDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "oscDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OscDslPackage eINSTANCE = net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzModelImpl <em>Ez Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzModelImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzModel()
   * @generated
   */
  int EZ_MODEL = 0;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MODEL__CMD = 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MODEL__MSG = 1;

  /**
   * The number of structural features of the '<em>Ez Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzCmdImpl <em>Ez Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzCmd()
   * @generated
   */
  int EZ_CMD = 1;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CMD__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzOpenCmdImpl <em>Ez Open Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzOpenCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzOpenCmd()
   * @generated
   */
  int EZ_OPEN_CMD = 2;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_OPEN_CMD__TARGETS = 0;

  /**
   * The number of structural features of the '<em>Ez Open Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_OPEN_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzCloseCmdImpl <em>Ez Close Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzCloseCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzCloseCmd()
   * @generated
   */
  int EZ_CLOSE_CMD = 3;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CLOSE_CMD__TARGETS = 0;

  /**
   * The number of structural features of the '<em>Ez Close Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CLOSE_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzHookCmdImpl <em>Ez Hook Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzHookCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzHookCmd()
   * @generated
   */
  int EZ_HOOK_CMD = 4;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_HOOK_CMD__TARGETS = 0;

  /**
   * The number of structural features of the '<em>Ez Hook Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_HOOK_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzUnhookCmdImpl <em>Ez Unhook Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzUnhookCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzUnhookCmd()
   * @generated
   */
  int EZ_UNHOOK_CMD = 5;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_UNHOOK_CMD__TARGETS = 0;

  /**
   * The number of structural features of the '<em>Ez Unhook Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_UNHOOK_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzAliasCmdImpl <em>Ez Alias Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzAliasCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzAliasCmd()
   * @generated
   */
  int EZ_ALIAS_CMD = 6;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_ALIAS_CMD__ALIAS = 0;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_ALIAS_CMD__TARGETS = 1;

  /**
   * The number of structural features of the '<em>Ez Alias Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_ALIAS_CMD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzStatusCmdImpl <em>Ez Status Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzStatusCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzStatusCmd()
   * @generated
   */
  int EZ_STATUS_CMD = 7;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_STATUS_CMD__TARGETS = 0;

  /**
   * The number of structural features of the '<em>Ez Status Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_STATUS_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzResetCmdImpl <em>Ez Reset Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzResetCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzResetCmd()
   * @generated
   */
  int EZ_RESET_CMD = 8;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_RESET_CMD__ID = 0;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_RESET_CMD__VERBOSE = 1;

  /**
   * The number of structural features of the '<em>Ez Reset Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_RESET_CMD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzHelpCmdImpl <em>Ez Help Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzHelpCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzHelpCmd()
   * @generated
   */
  int EZ_HELP_CMD = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_HELP_CMD__ID = 0;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_HELP_CMD__VERBOSE = 1;

  /**
   * The number of structural features of the '<em>Ez Help Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_HELP_CMD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzClearCmdImpl <em>Ez Clear Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzClearCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzClearCmd()
   * @generated
   */
  int EZ_CLEAR_CMD = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CLEAR_CMD__ID = 0;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CLEAR_CMD__VERBOSE = 1;

  /**
   * The number of structural features of the '<em>Ez Clear Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_CLEAR_CMD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzProtocolCmdImpl <em>Ez Protocol Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzProtocolCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzProtocolCmd()
   * @generated
   */
  int EZ_PROTOCOL_CMD = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_PROTOCOL_CMD__ID = 0;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_PROTOCOL_CMD__VERBOSE = 1;

  /**
   * The number of structural features of the '<em>Ez Protocol Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_PROTOCOL_CMD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzListCmdImpl <em>Ez List Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzListCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzListCmd()
   * @generated
   */
  int EZ_LIST_CMD = 12;

  /**
   * The feature id for the '<em><b>Addr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_LIST_CMD__ADDR = 0;

  /**
   * The number of structural features of the '<em>Ez List Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_LIST_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgImpl <em>Ez Msg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsg()
   * @generated
   */
  int EZ_MSG = 13;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG__MSG = 0;

  /**
   * The number of structural features of the '<em>Ez Msg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgRemoveImpl <em>Ez Msg Remove</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgRemoveImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgRemove()
   * @generated
   */
  int EZ_MSG_REMOVE = 14;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_REMOVE__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Remove</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_REMOVE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgGetImpl <em>Ez Msg Get</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgGetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgGet()
   * @generated
   */
  int EZ_MSG_GET = 15;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_GET__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Get</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_GET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgBindImpl <em>Ez Msg Bind</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgBindImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgBind()
   * @generated
   */
  int EZ_MSG_BIND = 16;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_BIND__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Bind</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_BIND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgListenImpl <em>Ez Msg Listen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgListenImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgListen()
   * @generated
   */
  int EZ_MSG_LISTEN = 17;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_LISTEN__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Listen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_LISTEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgServiceImpl <em>Ez Msg Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgServiceImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgService()
   * @generated
   */
  int EZ_MSG_SERVICE = 18;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_SERVICE__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_SERVICE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgUnlistenImpl <em>Ez Msg Unlisten</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgUnlistenImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgUnlisten()
   * @generated
   */
  int EZ_MSG_UNLISTEN = 19;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_UNLISTEN__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Unlisten</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_UNLISTEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgCmdImpl <em>Ez Msg Cmd</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgCmdImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgCmd()
   * @generated
   */
  int EZ_MSG_CMD = 20;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_CMD__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Cmd</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_CMD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgClockImpl <em>Ez Msg Clock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgClockImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgClock()
   * @generated
   */
  int EZ_MSG_CLOCK = 21;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_CLOCK__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Clock</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_CLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgToggleImpl <em>Ez Msg Toggle</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgToggleImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgToggle()
   * @generated
   */
  int EZ_MSG_TOGGLE = 22;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_TOGGLE__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Toggle</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_TOGGLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgBangImpl <em>Ez Msg Bang</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgBangImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgBang()
   * @generated
   */
  int EZ_MSG_BANG = 23;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_BANG__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Bang</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_BANG_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgUnforwardImpl <em>Ez Msg Unforward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgUnforwardImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgUnforward()
   * @generated
   */
  int EZ_MSG_UNFORWARD = 24;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_UNFORWARD__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Unforward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_UNFORWARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgForwardImpl <em>Ez Msg Forward</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgForwardImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgForward()
   * @generated
   */
  int EZ_MSG_FORWARD = 25;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_FORWARD__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Forward</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_FORWARD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgSetImpl <em>Ez Msg Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgSetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgSet()
   * @generated
   */
  int EZ_MSG_SET = 26;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_SET__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgLegacySetImpl <em>Ez Msg Legacy Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgLegacySetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgLegacySet()
   * @generated
   */
  int EZ_MSG_LEGACY_SET = 27;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_LEGACY_SET__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Legacy Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_LEGACY_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgSelectImpl <em>Ez Msg Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgSelectImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgSelect()
   * @generated
   */
  int EZ_MSG_SELECT = 28;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_SELECT__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_SELECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgKinematicsImpl <em>Ez Msg Kinematics</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgKinematicsImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgKinematics()
   * @generated
   */
  int EZ_MSG_KINEMATICS = 29;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_KINEMATICS__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Kinematics</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_KINEMATICS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgTriggerImpl <em>Ez Msg Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EzMsgTriggerImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgTrigger()
   * @generated
   */
  int EZ_MSG_TRIGGER = 30;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_TRIGGER__CMD = 0;

  /**
   * The number of structural features of the '<em>Ez Msg Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EZ_MSG_TRIGGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCExprImpl <em>OSC Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCExprImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCExpr()
   * @generated
   */
  int OSC_EXPR = 31;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_EXPR__PATH = 0;

  /**
   * The feature id for the '<em><b>Args</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_EXPR__ARGS = 1;

  /**
   * The feature id for the '<em><b>Targets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_EXPR__TARGETS = 2;

  /**
   * The number of structural features of the '<em>OSC Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_EXPR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCSubDomainImpl <em>OSC Sub Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCSubDomainImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCSubDomain()
   * @generated
   */
  int OSC_SUB_DOMAIN = 32;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_SUB_DOMAIN__MSG = EZ_MSG__MSG;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_SUB_DOMAIN__EXPR = EZ_MSG_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>OSC Sub Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_SUB_DOMAIN_FEATURE_COUNT = EZ_MSG_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCUDPTargetImpl <em>OSCUDP Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCUDPTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCUDPTarget()
   * @generated
   */
  int OSCUDP_TARGET = 33;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUDP_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUDP_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUDP_TARGET__FORMAT = 2;

  /**
   * The number of structural features of the '<em>OSCUDP Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUDP_TARGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCTCPTargetImpl <em>OSCTCP Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCTCPTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCTCPTarget()
   * @generated
   */
  int OSCTCP_TARGET = 34;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCTCP_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCTCP_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCTCP_TARGET__FORMAT = 2;

  /**
   * The number of structural features of the '<em>OSCTCP Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCTCP_TARGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCXBeeTargetImpl <em>OSCX Bee Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCXBeeTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCXBeeTarget()
   * @generated
   */
  int OSCX_BEE_TARGET = 35;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCX_BEE_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCX_BEE_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCX_BEE_TARGET__FORMAT = 2;

  /**
   * The number of structural features of the '<em>OSCX Bee Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCX_BEE_TARGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl <em>OSC Http Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCHttpTarget()
   * @generated
   */
  int OSC_HTTP_TARGET = 36;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_HTTP_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_HTTP_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_HTTP_TARGET__FORMAT = 2;

  /**
   * The number of structural features of the '<em>OSC Http Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_HTTP_TARGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCBluetoothTargetImpl <em>OSC Bluetooth Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCBluetoothTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCBluetoothTarget()
   * @generated
   */
  int OSC_BLUETOOTH_TARGET = 37;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_BLUETOOTH_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_BLUETOOTH_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_BLUETOOTH_TARGET__FORMAT = 2;

  /**
   * The number of structural features of the '<em>OSC Bluetooth Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_BLUETOOTH_TARGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCUSBTargetImpl <em>OSCUSB Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCUSBTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCUSBTarget()
   * @generated
   */
  int OSCUSB_TARGET = 38;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUSB_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUSB_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Speed</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUSB_TARGET__SPEED = 2;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUSB_TARGET__FORMAT = 3;

  /**
   * The number of structural features of the '<em>OSCUSB Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSCUSB_TARGET_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCUbqTargetImpl <em>OSC Ubq Target</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.OSCUbqTargetImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCUbqTarget()
   * @generated
   */
  int OSC_UBQ_TARGET = 39;

  /**
   * The feature id for the '<em><b>Proto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_UBQ_TARGET__PROTO = 0;

  /**
   * The feature id for the '<em><b>Addr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_UBQ_TARGET__ADDR = 1;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_UBQ_TARGET__FORMAT = 2;

  /**
   * The number of structural features of the '<em>OSC Ubq Target</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OSC_UBQ_TARGET_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.SpeedImpl <em>Speed</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.SpeedImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getSpeed()
   * @generated
   */
  int SPEED = 40;

  /**
   * The feature id for the '<em><b>Speed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEED__SPEED = 0;

  /**
   * The number of structural features of the '<em>Speed</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPEED_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.JvmVarImpl <em>Jvm Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.JvmVarImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getJvmVar()
   * @generated
   */
  int JVM_VAR = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_VAR__NAME = 0;

  /**
   * The feature id for the '<em><b>Java Types</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_VAR__JAVA_TYPES = 1;

  /**
   * The number of structural features of the '<em>Jvm Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JVM_VAR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl <em>Expr Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ExprModelImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getExprModel()
   * @generated
   */
  int EXPR_MODEL = 42;

  /**
   * The feature id for the '<em><b>Is Tested</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MODEL__IS_TESTED = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MODEL__NAME = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MODEL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MODEL__ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MODEL__FUNCTIONS = 4;

  /**
   * The number of structural features of the '<em>Expr Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.UsingImpl <em>Using</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.UsingImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getUsing()
   * @generated
   */
  int USING = 43;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Using</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ElementImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 44;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.SymbolImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ReturnImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 46;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__EXPR = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EnumDeclImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEnumDecl()
   * @generated
   */
  int ENUM_DECL = 47;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__NAME = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL__LITERALS = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_DECL_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.TypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 48;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.PrimitiveTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 49;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ArrayTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 50;

  /**
   * The feature id for the '<em><b>Base Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE__BASE_TYPE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EnumTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 51;

  /**
   * The feature id for the '<em><b>Enum Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE__ENUM_REF = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.IntTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 52;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.BoolTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 53;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.FloatTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 54;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.StringTypeImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 55;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ExprImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 56;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ExpressionImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 57;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.FunctionDeclarationImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 58;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__NAME = SYMBOL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__TYPE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__PARAMS = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION__ELEMENTS = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DECLARATION_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ParameterImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 59;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = SYMBOL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EnumLiteralImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEnumLiteral()
   * @generated
   */
  int ENUM_LITERAL = 60;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL__NAME = SYMBOL__NAME;

  /**
   * The number of structural features of the '<em>Enum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.VarDeclImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 61;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__NAME = SYMBOL__NAME;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__READONLY = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__TYPE = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL__INIT = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Var Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_DECL_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.FormulaImpl <em>Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.FormulaImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getFormula()
   * @generated
   */
  int FORMULA = 62;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__NAME = SYMBOL__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__TYPE = SYMBOL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA__EXPR = SYMBOL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Formula</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMULA_FEATURE_COUNT = SYMBOL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.EqualsImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 63;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.PlusImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 64;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.MultiImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 65;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Multi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.ArrayAccessImpl <em>Array Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.ArrayAccessImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getArrayAccess()
   * @generated
   */
  int ARRAY_ACCESS = 66;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__EXPR = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS__INDEX = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_ACCESS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.SymbolRefImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getSymbolRef()
   * @generated
   */
  int SYMBOL_REF = 67;

  /**
   * The feature id for the '<em><b>Symbol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__SYMBOL = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Actuals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF__ACTUALS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Symbol Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_REF_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.NumberLiteralImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 68;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMBER_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.impl.StringLiteralImpl
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 69;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.osc.oscDsl.EzFormats <em>Ez Formats</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.osc.oscDsl.EzFormats
   * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzFormats()
   * @generated
   */
  int EZ_FORMATS = 70;


  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzModel <em>Ez Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Model</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzModel
   * @generated
   */
  EClass getEzModel();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzModel#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzModel#getCmd()
   * @see #getEzModel()
   * @generated
   */
  EReference getEzModel_Cmd();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzModel#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msg</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzModel#getMsg()
   * @see #getEzModel()
   * @generated
   */
  EReference getEzModel_Msg();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzCmd <em>Ez Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzCmd
   * @generated
   */
  EClass getEzCmd();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzCmd#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzCmd#getCmd()
   * @see #getEzCmd()
   * @generated
   */
  EReference getEzCmd_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzOpenCmd <em>Ez Open Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Open Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzOpenCmd
   * @generated
   */
  EClass getEzOpenCmd();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzOpenCmd#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzOpenCmd#getTargets()
   * @see #getEzOpenCmd()
   * @generated
   */
  EReference getEzOpenCmd_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzCloseCmd <em>Ez Close Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Close Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzCloseCmd
   * @generated
   */
  EClass getEzCloseCmd();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzCloseCmd#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzCloseCmd#getTargets()
   * @see #getEzCloseCmd()
   * @generated
   */
  EReference getEzCloseCmd_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzHookCmd <em>Ez Hook Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Hook Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzHookCmd
   * @generated
   */
  EClass getEzHookCmd();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzHookCmd#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzHookCmd#getTargets()
   * @see #getEzHookCmd()
   * @generated
   */
  EReference getEzHookCmd_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzUnhookCmd <em>Ez Unhook Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Unhook Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzUnhookCmd
   * @generated
   */
  EClass getEzUnhookCmd();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzUnhookCmd#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzUnhookCmd#getTargets()
   * @see #getEzUnhookCmd()
   * @generated
   */
  EReference getEzUnhookCmd_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzAliasCmd <em>Ez Alias Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Alias Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzAliasCmd
   * @generated
   */
  EClass getEzAliasCmd();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzAliasCmd#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzAliasCmd#getAlias()
   * @see #getEzAliasCmd()
   * @generated
   */
  EAttribute getEzAliasCmd_Alias();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzAliasCmd#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzAliasCmd#getTargets()
   * @see #getEzAliasCmd()
   * @generated
   */
  EReference getEzAliasCmd_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzStatusCmd <em>Ez Status Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Status Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzStatusCmd
   * @generated
   */
  EClass getEzStatusCmd();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EzStatusCmd#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzStatusCmd#getTargets()
   * @see #getEzStatusCmd()
   * @generated
   */
  EReference getEzStatusCmd_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzResetCmd <em>Ez Reset Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Reset Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzResetCmd
   * @generated
   */
  EClass getEzResetCmd();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzResetCmd#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzResetCmd#getId()
   * @see #getEzResetCmd()
   * @generated
   */
  EAttribute getEzResetCmd_Id();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzResetCmd#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verbose</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzResetCmd#getVerbose()
   * @see #getEzResetCmd()
   * @generated
   */
  EAttribute getEzResetCmd_Verbose();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzHelpCmd <em>Ez Help Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Help Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzHelpCmd
   * @generated
   */
  EClass getEzHelpCmd();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzHelpCmd#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzHelpCmd#getId()
   * @see #getEzHelpCmd()
   * @generated
   */
  EAttribute getEzHelpCmd_Id();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzHelpCmd#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verbose</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzHelpCmd#getVerbose()
   * @see #getEzHelpCmd()
   * @generated
   */
  EAttribute getEzHelpCmd_Verbose();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzClearCmd <em>Ez Clear Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Clear Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzClearCmd
   * @generated
   */
  EClass getEzClearCmd();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzClearCmd#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzClearCmd#getId()
   * @see #getEzClearCmd()
   * @generated
   */
  EAttribute getEzClearCmd_Id();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzClearCmd#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verbose</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzClearCmd#getVerbose()
   * @see #getEzClearCmd()
   * @generated
   */
  EAttribute getEzClearCmd_Verbose();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd <em>Ez Protocol Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Protocol Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzProtocolCmd
   * @generated
   */
  EClass getEzProtocolCmd();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzProtocolCmd#getId()
   * @see #getEzProtocolCmd()
   * @generated
   */
  EAttribute getEzProtocolCmd_Id();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EzProtocolCmd#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Verbose</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzProtocolCmd#getVerbose()
   * @see #getEzProtocolCmd()
   * @generated
   */
  EAttribute getEzProtocolCmd_Verbose();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzListCmd <em>Ez List Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez List Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzListCmd
   * @generated
   */
  EClass getEzListCmd();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.osc.oscDsl.EzListCmd#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzListCmd#getAddr()
   * @see #getEzListCmd()
   * @generated
   */
  EReference getEzListCmd_Addr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsg <em>Ez Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsg
   * @generated
   */
  EClass getEzMsg();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsg#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Msg</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsg#getMsg()
   * @see #getEzMsg()
   * @generated
   */
  EReference getEzMsg_Msg();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgRemove <em>Ez Msg Remove</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Remove</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgRemove
   * @generated
   */
  EClass getEzMsgRemove();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgRemove#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgRemove#getCmd()
   * @see #getEzMsgRemove()
   * @generated
   */
  EReference getEzMsgRemove_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgGet <em>Ez Msg Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Get</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgGet
   * @generated
   */
  EClass getEzMsgGet();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgGet#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgGet#getCmd()
   * @see #getEzMsgGet()
   * @generated
   */
  EReference getEzMsgGet_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgBind <em>Ez Msg Bind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Bind</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgBind
   * @generated
   */
  EClass getEzMsgBind();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgBind#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgBind#getCmd()
   * @see #getEzMsgBind()
   * @generated
   */
  EReference getEzMsgBind_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgListen <em>Ez Msg Listen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Listen</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgListen
   * @generated
   */
  EClass getEzMsgListen();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgListen#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgListen#getCmd()
   * @see #getEzMsgListen()
   * @generated
   */
  EReference getEzMsgListen_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgService <em>Ez Msg Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Service</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgService
   * @generated
   */
  EClass getEzMsgService();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgService#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgService#getCmd()
   * @see #getEzMsgService()
   * @generated
   */
  EReference getEzMsgService_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgUnlisten <em>Ez Msg Unlisten</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Unlisten</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgUnlisten
   * @generated
   */
  EClass getEzMsgUnlisten();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgUnlisten#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgUnlisten#getCmd()
   * @see #getEzMsgUnlisten()
   * @generated
   */
  EReference getEzMsgUnlisten_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgCmd <em>Ez Msg Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgCmd
   * @generated
   */
  EClass getEzMsgCmd();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgCmd#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgCmd#getCmd()
   * @see #getEzMsgCmd()
   * @generated
   */
  EReference getEzMsgCmd_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgClock <em>Ez Msg Clock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Clock</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgClock
   * @generated
   */
  EClass getEzMsgClock();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgClock#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgClock#getCmd()
   * @see #getEzMsgClock()
   * @generated
   */
  EReference getEzMsgClock_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgToggle <em>Ez Msg Toggle</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Toggle</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgToggle
   * @generated
   */
  EClass getEzMsgToggle();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgToggle#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgToggle#getCmd()
   * @see #getEzMsgToggle()
   * @generated
   */
  EReference getEzMsgToggle_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgBang <em>Ez Msg Bang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Bang</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgBang
   * @generated
   */
  EClass getEzMsgBang();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgBang#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgBang#getCmd()
   * @see #getEzMsgBang()
   * @generated
   */
  EReference getEzMsgBang_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgUnforward <em>Ez Msg Unforward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Unforward</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgUnforward
   * @generated
   */
  EClass getEzMsgUnforward();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgUnforward#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgUnforward#getCmd()
   * @see #getEzMsgUnforward()
   * @generated
   */
  EReference getEzMsgUnforward_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgForward <em>Ez Msg Forward</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Forward</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgForward
   * @generated
   */
  EClass getEzMsgForward();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgForward#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgForward#getCmd()
   * @see #getEzMsgForward()
   * @generated
   */
  EReference getEzMsgForward_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgSet <em>Ez Msg Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Set</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgSet
   * @generated
   */
  EClass getEzMsgSet();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgSet#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgSet#getCmd()
   * @see #getEzMsgSet()
   * @generated
   */
  EReference getEzMsgSet_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgLegacySet <em>Ez Msg Legacy Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Legacy Set</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgLegacySet
   * @generated
   */
  EClass getEzMsgLegacySet();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgLegacySet#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgLegacySet#getCmd()
   * @see #getEzMsgLegacySet()
   * @generated
   */
  EReference getEzMsgLegacySet_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgSelect <em>Ez Msg Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Select</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgSelect
   * @generated
   */
  EClass getEzMsgSelect();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgSelect#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgSelect#getCmd()
   * @see #getEzMsgSelect()
   * @generated
   */
  EReference getEzMsgSelect_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgKinematics <em>Ez Msg Kinematics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Kinematics</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgKinematics
   * @generated
   */
  EClass getEzMsgKinematics();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgKinematics#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgKinematics#getCmd()
   * @see #getEzMsgKinematics()
   * @generated
   */
  EReference getEzMsgKinematics_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EzMsgTrigger <em>Ez Msg Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ez Msg Trigger</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgTrigger
   * @generated
   */
  EClass getEzMsgTrigger();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.EzMsgTrigger#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cmd</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzMsgTrigger#getCmd()
   * @see #getEzMsgTrigger()
   * @generated
   */
  EReference getEzMsgTrigger_Cmd();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCExpr <em>OSC Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSC Expr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCExpr
   * @generated
   */
  EClass getOSCExpr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCExpr#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCExpr#getPath()
   * @see #getOSCExpr()
   * @generated
   */
  EAttribute getOSCExpr_Path();

  /**
   * Returns the meta object for the attribute list '{@link net.sf.smbt.osc.oscDsl.OSCExpr#getArgs <em>Args</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Args</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCExpr#getArgs()
   * @see #getOSCExpr()
   * @generated
   */
  EAttribute getOSCExpr_Args();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.OSCExpr#getTargets <em>Targets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Targets</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCExpr#getTargets()
   * @see #getOSCExpr()
   * @generated
   */
  EReference getOSCExpr_Targets();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCSubDomain <em>OSC Sub Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSC Sub Domain</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCSubDomain
   * @generated
   */
  EClass getOSCSubDomain();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.OSCSubDomain#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCSubDomain#getExpr()
   * @see #getOSCSubDomain()
   * @generated
   */
  EReference getOSCSubDomain_Expr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCUDPTarget <em>OSCUDP Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSCUDP Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUDPTarget
   * @generated
   */
  EClass getOSCUDPTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUDPTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUDPTarget#getProto()
   * @see #getOSCUDPTarget()
   * @generated
   */
  EAttribute getOSCUDPTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUDPTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUDPTarget#getAddr()
   * @see #getOSCUDPTarget()
   * @generated
   */
  EAttribute getOSCUDPTarget_Addr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUDPTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUDPTarget#getFormat()
   * @see #getOSCUDPTarget()
   * @generated
   */
  EAttribute getOSCUDPTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCTCPTarget <em>OSCTCP Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSCTCP Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCTCPTarget
   * @generated
   */
  EClass getOSCTCPTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCTCPTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCTCPTarget#getProto()
   * @see #getOSCTCPTarget()
   * @generated
   */
  EAttribute getOSCTCPTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCTCPTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCTCPTarget#getAddr()
   * @see #getOSCTCPTarget()
   * @generated
   */
  EAttribute getOSCTCPTarget_Addr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCTCPTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCTCPTarget#getFormat()
   * @see #getOSCTCPTarget()
   * @generated
   */
  EAttribute getOSCTCPTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCXBeeTarget <em>OSCX Bee Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSCX Bee Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCXBeeTarget
   * @generated
   */
  EClass getOSCXBeeTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCXBeeTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCXBeeTarget#getProto()
   * @see #getOSCXBeeTarget()
   * @generated
   */
  EAttribute getOSCXBeeTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCXBeeTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCXBeeTarget#getAddr()
   * @see #getOSCXBeeTarget()
   * @generated
   */
  EAttribute getOSCXBeeTarget_Addr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCXBeeTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCXBeeTarget#getFormat()
   * @see #getOSCXBeeTarget()
   * @generated
   */
  EAttribute getOSCXBeeTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCHttpTarget <em>OSC Http Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSC Http Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCHttpTarget
   * @generated
   */
  EClass getOSCHttpTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCHttpTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCHttpTarget#getProto()
   * @see #getOSCHttpTarget()
   * @generated
   */
  EAttribute getOSCHttpTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCHttpTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCHttpTarget#getAddr()
   * @see #getOSCHttpTarget()
   * @generated
   */
  EAttribute getOSCHttpTarget_Addr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCHttpTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCHttpTarget#getFormat()
   * @see #getOSCHttpTarget()
   * @generated
   */
  EAttribute getOSCHttpTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCBluetoothTarget <em>OSC Bluetooth Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSC Bluetooth Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCBluetoothTarget
   * @generated
   */
  EClass getOSCBluetoothTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCBluetoothTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCBluetoothTarget#getProto()
   * @see #getOSCBluetoothTarget()
   * @generated
   */
  EAttribute getOSCBluetoothTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCBluetoothTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCBluetoothTarget#getAddr()
   * @see #getOSCBluetoothTarget()
   * @generated
   */
  EAttribute getOSCBluetoothTarget_Addr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCBluetoothTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCBluetoothTarget#getFormat()
   * @see #getOSCBluetoothTarget()
   * @generated
   */
  EAttribute getOSCBluetoothTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget <em>OSCUSB Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSCUSB Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUSBTarget
   * @generated
   */
  EClass getOSCUSBTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUSBTarget#getProto()
   * @see #getOSCUSBTarget()
   * @generated
   */
  EAttribute getOSCUSBTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUSBTarget#getAddr()
   * @see #getOSCUSBTarget()
   * @generated
   */
  EAttribute getOSCUSBTarget_Addr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Speed</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUSBTarget#getSpeed()
   * @see #getOSCUSBTarget()
   * @generated
   */
  EReference getOSCUSBTarget_Speed();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUSBTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUSBTarget#getFormat()
   * @see #getOSCUSBTarget()
   * @generated
   */
  EAttribute getOSCUSBTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.OSCUbqTarget <em>OSC Ubq Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OSC Ubq Target</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUbqTarget
   * @generated
   */
  EClass getOSCUbqTarget();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUbqTarget#getProto <em>Proto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Proto</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUbqTarget#getProto()
   * @see #getOSCUbqTarget()
   * @generated
   */
  EAttribute getOSCUbqTarget_Proto();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUbqTarget#getAddr <em>Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Addr</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUbqTarget#getAddr()
   * @see #getOSCUbqTarget()
   * @generated
   */
  EAttribute getOSCUbqTarget_Addr();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.OSCUbqTarget#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see net.sf.smbt.osc.oscDsl.OSCUbqTarget#getFormat()
   * @see #getOSCUbqTarget()
   * @generated
   */
  EAttribute getOSCUbqTarget_Format();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Speed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Speed</em>'.
   * @see net.sf.smbt.osc.oscDsl.Speed
   * @generated
   */
  EClass getSpeed();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.Speed#getSpeed <em>Speed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Speed</em>'.
   * @see net.sf.smbt.osc.oscDsl.Speed#getSpeed()
   * @see #getSpeed()
   * @generated
   */
  EAttribute getSpeed_Speed();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.JvmVar <em>Jvm Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jvm Var</em>'.
   * @see net.sf.smbt.osc.oscDsl.JvmVar
   * @generated
   */
  EClass getJvmVar();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.JvmVar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.osc.oscDsl.JvmVar#getName()
   * @see #getJvmVar()
   * @generated
   */
  EAttribute getJvmVar_Name();

  /**
   * Returns the meta object for the reference list '{@link net.sf.smbt.osc.oscDsl.JvmVar#getJavaTypes <em>Java Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Java Types</em>'.
   * @see net.sf.smbt.osc.oscDsl.JvmVar#getJavaTypes()
   * @see #getJvmVar()
   * @generated
   */
  EReference getJvmVar_JavaTypes();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.ExprModel <em>Expr Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr Model</em>'.
   * @see net.sf.smbt.osc.oscDsl.ExprModel
   * @generated
   */
  EClass getExprModel();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.ExprModel#isIsTested <em>Is Tested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tested</em>'.
   * @see net.sf.smbt.osc.oscDsl.ExprModel#isIsTested()
   * @see #getExprModel()
   * @generated
   */
  EAttribute getExprModel_IsTested();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.ExprModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.osc.oscDsl.ExprModel#getName()
   * @see #getExprModel()
   * @generated
   */
  EAttribute getExprModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.ExprModel#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see net.sf.smbt.osc.oscDsl.ExprModel#getUsings()
   * @see #getExprModel()
   * @generated
   */
  EReference getExprModel_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.ExprModel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see net.sf.smbt.osc.oscDsl.ExprModel#getElements()
   * @see #getExprModel()
   * @generated
   */
  EReference getExprModel_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.ExprModel#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see net.sf.smbt.osc.oscDsl.ExprModel#getFunctions()
   * @see #getExprModel()
   * @generated
   */
  EReference getExprModel_Functions();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using</em>'.
   * @see net.sf.smbt.osc.oscDsl.Using
   * @generated
   */
  EClass getUsing();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.Using#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see net.sf.smbt.osc.oscDsl.Using#getImportedNamespace()
   * @see #getUsing()
   * @generated
   */
  EAttribute getUsing_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see net.sf.smbt.osc.oscDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see net.sf.smbt.osc.oscDsl.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.Symbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.osc.oscDsl.Symbol#getName()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Name();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see net.sf.smbt.osc.oscDsl.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Return#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.osc.oscDsl.Return#getExpr()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Expr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Decl</em>'.
   * @see net.sf.smbt.osc.oscDsl.EnumDecl
   * @generated
   */
  EClass getEnumDecl();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.EnumDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.osc.oscDsl.EnumDecl#getName()
   * @see #getEnumDecl()
   * @generated
   */
  EAttribute getEnumDecl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.EnumDecl#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see net.sf.smbt.osc.oscDsl.EnumDecl#getLiterals()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Literals();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.ArrayType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.ArrayType#getBaseType()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_BaseType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.osc.oscDsl.EnumType#getEnumRef <em>Enum Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum Ref</em>'.
   * @see net.sf.smbt.osc.oscDsl.EnumType#getEnumRef()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_EnumRef();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see net.sf.smbt.osc.oscDsl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see net.sf.smbt.osc.oscDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see net.sf.smbt.osc.oscDsl.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.FunctionDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.FunctionDeclaration#getType()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.FunctionDeclaration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see net.sf.smbt.osc.oscDsl.FunctionDeclaration#getParams()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Params();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.FunctionDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see net.sf.smbt.osc.oscDsl.FunctionDeclaration#getElements()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see net.sf.smbt.osc.oscDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.EnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literal</em>'.
   * @see net.sf.smbt.osc.oscDsl.EnumLiteral
   * @generated
   */
  EClass getEnumLiteral();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see net.sf.smbt.osc.oscDsl.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.VarDecl#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see net.sf.smbt.osc.oscDsl.VarDecl#isReadonly()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Readonly();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.VarDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.VarDecl#getType()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.VarDecl#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see net.sf.smbt.osc.oscDsl.VarDecl#getInit()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Init();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula</em>'.
   * @see net.sf.smbt.osc.oscDsl.Formula
   * @generated
   */
  EClass getFormula();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Formula#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.osc.oscDsl.Formula#getType()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Type();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Formula#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.osc.oscDsl.Formula#getExpr()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Expr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see net.sf.smbt.osc.oscDsl.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.smbt.osc.oscDsl.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.smbt.osc.oscDsl.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see net.sf.smbt.osc.oscDsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.smbt.osc.oscDsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.smbt.osc.oscDsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see net.sf.smbt.osc.oscDsl.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.smbt.osc.oscDsl.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.smbt.osc.oscDsl.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Access</em>'.
   * @see net.sf.smbt.osc.oscDsl.ArrayAccess
   * @generated
   */
  EClass getArrayAccess();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.ArrayAccess#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.osc.oscDsl.ArrayAccess#getExpr()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.osc.oscDsl.ArrayAccess#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see net.sf.smbt.osc.oscDsl.ArrayAccess#getIndex()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Index();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref</em>'.
   * @see net.sf.smbt.osc.oscDsl.SymbolRef
   * @generated
   */
  EClass getSymbolRef();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.osc.oscDsl.SymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see net.sf.smbt.osc.oscDsl.SymbolRef#getSymbol()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Symbol();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.osc.oscDsl.SymbolRef#getActuals <em>Actuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actuals</em>'.
   * @see net.sf.smbt.osc.oscDsl.SymbolRef#getActuals()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Actuals();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see net.sf.smbt.osc.oscDsl.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sf.smbt.osc.oscDsl.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EAttribute getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.osc.oscDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see net.sf.smbt.osc.oscDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.osc.oscDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sf.smbt.osc.oscDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the meta object for enum '{@link net.sf.smbt.osc.oscDsl.EzFormats <em>Ez Formats</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Ez Formats</em>'.
   * @see net.sf.smbt.osc.oscDsl.EzFormats
   * @generated
   */
  EEnum getEzFormats();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  OscDslFactory getOscDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzModelImpl <em>Ez Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzModelImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzModel()
     * @generated
     */
    EClass EZ_MODEL = eINSTANCE.getEzModel();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MODEL__CMD = eINSTANCE.getEzModel_Cmd();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MODEL__MSG = eINSTANCE.getEzModel_Msg();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzCmdImpl <em>Ez Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzCmd()
     * @generated
     */
    EClass EZ_CMD = eINSTANCE.getEzCmd();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_CMD__CMD = eINSTANCE.getEzCmd_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzOpenCmdImpl <em>Ez Open Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzOpenCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzOpenCmd()
     * @generated
     */
    EClass EZ_OPEN_CMD = eINSTANCE.getEzOpenCmd();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_OPEN_CMD__TARGETS = eINSTANCE.getEzOpenCmd_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzCloseCmdImpl <em>Ez Close Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzCloseCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzCloseCmd()
     * @generated
     */
    EClass EZ_CLOSE_CMD = eINSTANCE.getEzCloseCmd();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_CLOSE_CMD__TARGETS = eINSTANCE.getEzCloseCmd_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzHookCmdImpl <em>Ez Hook Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzHookCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzHookCmd()
     * @generated
     */
    EClass EZ_HOOK_CMD = eINSTANCE.getEzHookCmd();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_HOOK_CMD__TARGETS = eINSTANCE.getEzHookCmd_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzUnhookCmdImpl <em>Ez Unhook Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzUnhookCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzUnhookCmd()
     * @generated
     */
    EClass EZ_UNHOOK_CMD = eINSTANCE.getEzUnhookCmd();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_UNHOOK_CMD__TARGETS = eINSTANCE.getEzUnhookCmd_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzAliasCmdImpl <em>Ez Alias Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzAliasCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzAliasCmd()
     * @generated
     */
    EClass EZ_ALIAS_CMD = eINSTANCE.getEzAliasCmd();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_ALIAS_CMD__ALIAS = eINSTANCE.getEzAliasCmd_Alias();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_ALIAS_CMD__TARGETS = eINSTANCE.getEzAliasCmd_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzStatusCmdImpl <em>Ez Status Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzStatusCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzStatusCmd()
     * @generated
     */
    EClass EZ_STATUS_CMD = eINSTANCE.getEzStatusCmd();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_STATUS_CMD__TARGETS = eINSTANCE.getEzStatusCmd_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzResetCmdImpl <em>Ez Reset Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzResetCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzResetCmd()
     * @generated
     */
    EClass EZ_RESET_CMD = eINSTANCE.getEzResetCmd();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_RESET_CMD__ID = eINSTANCE.getEzResetCmd_Id();

    /**
     * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_RESET_CMD__VERBOSE = eINSTANCE.getEzResetCmd_Verbose();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzHelpCmdImpl <em>Ez Help Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzHelpCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzHelpCmd()
     * @generated
     */
    EClass EZ_HELP_CMD = eINSTANCE.getEzHelpCmd();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_HELP_CMD__ID = eINSTANCE.getEzHelpCmd_Id();

    /**
     * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_HELP_CMD__VERBOSE = eINSTANCE.getEzHelpCmd_Verbose();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzClearCmdImpl <em>Ez Clear Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzClearCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzClearCmd()
     * @generated
     */
    EClass EZ_CLEAR_CMD = eINSTANCE.getEzClearCmd();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_CLEAR_CMD__ID = eINSTANCE.getEzClearCmd_Id();

    /**
     * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_CLEAR_CMD__VERBOSE = eINSTANCE.getEzClearCmd_Verbose();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzProtocolCmdImpl <em>Ez Protocol Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzProtocolCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzProtocolCmd()
     * @generated
     */
    EClass EZ_PROTOCOL_CMD = eINSTANCE.getEzProtocolCmd();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_PROTOCOL_CMD__ID = eINSTANCE.getEzProtocolCmd_Id();

    /**
     * The meta object literal for the '<em><b>Verbose</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EZ_PROTOCOL_CMD__VERBOSE = eINSTANCE.getEzProtocolCmd_Verbose();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzListCmdImpl <em>Ez List Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzListCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzListCmd()
     * @generated
     */
    EClass EZ_LIST_CMD = eINSTANCE.getEzListCmd();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_LIST_CMD__ADDR = eINSTANCE.getEzListCmd_Addr();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgImpl <em>Ez Msg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsg()
     * @generated
     */
    EClass EZ_MSG = eINSTANCE.getEzMsg();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG__MSG = eINSTANCE.getEzMsg_Msg();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgRemoveImpl <em>Ez Msg Remove</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgRemoveImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgRemove()
     * @generated
     */
    EClass EZ_MSG_REMOVE = eINSTANCE.getEzMsgRemove();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_REMOVE__CMD = eINSTANCE.getEzMsgRemove_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgGetImpl <em>Ez Msg Get</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgGetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgGet()
     * @generated
     */
    EClass EZ_MSG_GET = eINSTANCE.getEzMsgGet();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_GET__CMD = eINSTANCE.getEzMsgGet_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgBindImpl <em>Ez Msg Bind</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgBindImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgBind()
     * @generated
     */
    EClass EZ_MSG_BIND = eINSTANCE.getEzMsgBind();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_BIND__CMD = eINSTANCE.getEzMsgBind_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgListenImpl <em>Ez Msg Listen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgListenImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgListen()
     * @generated
     */
    EClass EZ_MSG_LISTEN = eINSTANCE.getEzMsgListen();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_LISTEN__CMD = eINSTANCE.getEzMsgListen_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgServiceImpl <em>Ez Msg Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgServiceImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgService()
     * @generated
     */
    EClass EZ_MSG_SERVICE = eINSTANCE.getEzMsgService();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_SERVICE__CMD = eINSTANCE.getEzMsgService_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgUnlistenImpl <em>Ez Msg Unlisten</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgUnlistenImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgUnlisten()
     * @generated
     */
    EClass EZ_MSG_UNLISTEN = eINSTANCE.getEzMsgUnlisten();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_UNLISTEN__CMD = eINSTANCE.getEzMsgUnlisten_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgCmdImpl <em>Ez Msg Cmd</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgCmdImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgCmd()
     * @generated
     */
    EClass EZ_MSG_CMD = eINSTANCE.getEzMsgCmd();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_CMD__CMD = eINSTANCE.getEzMsgCmd_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgClockImpl <em>Ez Msg Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgClockImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgClock()
     * @generated
     */
    EClass EZ_MSG_CLOCK = eINSTANCE.getEzMsgClock();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_CLOCK__CMD = eINSTANCE.getEzMsgClock_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgToggleImpl <em>Ez Msg Toggle</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgToggleImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgToggle()
     * @generated
     */
    EClass EZ_MSG_TOGGLE = eINSTANCE.getEzMsgToggle();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_TOGGLE__CMD = eINSTANCE.getEzMsgToggle_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgBangImpl <em>Ez Msg Bang</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgBangImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgBang()
     * @generated
     */
    EClass EZ_MSG_BANG = eINSTANCE.getEzMsgBang();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_BANG__CMD = eINSTANCE.getEzMsgBang_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgUnforwardImpl <em>Ez Msg Unforward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgUnforwardImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgUnforward()
     * @generated
     */
    EClass EZ_MSG_UNFORWARD = eINSTANCE.getEzMsgUnforward();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_UNFORWARD__CMD = eINSTANCE.getEzMsgUnforward_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgForwardImpl <em>Ez Msg Forward</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgForwardImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgForward()
     * @generated
     */
    EClass EZ_MSG_FORWARD = eINSTANCE.getEzMsgForward();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_FORWARD__CMD = eINSTANCE.getEzMsgForward_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgSetImpl <em>Ez Msg Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgSetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgSet()
     * @generated
     */
    EClass EZ_MSG_SET = eINSTANCE.getEzMsgSet();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_SET__CMD = eINSTANCE.getEzMsgSet_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgLegacySetImpl <em>Ez Msg Legacy Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgLegacySetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgLegacySet()
     * @generated
     */
    EClass EZ_MSG_LEGACY_SET = eINSTANCE.getEzMsgLegacySet();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_LEGACY_SET__CMD = eINSTANCE.getEzMsgLegacySet_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgSelectImpl <em>Ez Msg Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgSelectImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgSelect()
     * @generated
     */
    EClass EZ_MSG_SELECT = eINSTANCE.getEzMsgSelect();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_SELECT__CMD = eINSTANCE.getEzMsgSelect_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgKinematicsImpl <em>Ez Msg Kinematics</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgKinematicsImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgKinematics()
     * @generated
     */
    EClass EZ_MSG_KINEMATICS = eINSTANCE.getEzMsgKinematics();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_KINEMATICS__CMD = eINSTANCE.getEzMsgKinematics_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EzMsgTriggerImpl <em>Ez Msg Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EzMsgTriggerImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzMsgTrigger()
     * @generated
     */
    EClass EZ_MSG_TRIGGER = eINSTANCE.getEzMsgTrigger();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EZ_MSG_TRIGGER__CMD = eINSTANCE.getEzMsgTrigger_Cmd();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCExprImpl <em>OSC Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCExprImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCExpr()
     * @generated
     */
    EClass OSC_EXPR = eINSTANCE.getOSCExpr();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_EXPR__PATH = eINSTANCE.getOSCExpr_Path();

    /**
     * The meta object literal for the '<em><b>Args</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_EXPR__ARGS = eINSTANCE.getOSCExpr_Args();

    /**
     * The meta object literal for the '<em><b>Targets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OSC_EXPR__TARGETS = eINSTANCE.getOSCExpr_Targets();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCSubDomainImpl <em>OSC Sub Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCSubDomainImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCSubDomain()
     * @generated
     */
    EClass OSC_SUB_DOMAIN = eINSTANCE.getOSCSubDomain();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OSC_SUB_DOMAIN__EXPR = eINSTANCE.getOSCSubDomain_Expr();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCUDPTargetImpl <em>OSCUDP Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCUDPTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCUDPTarget()
     * @generated
     */
    EClass OSCUDP_TARGET = eINSTANCE.getOSCUDPTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCUDP_TARGET__PROTO = eINSTANCE.getOSCUDPTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCUDP_TARGET__ADDR = eINSTANCE.getOSCUDPTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCUDP_TARGET__FORMAT = eINSTANCE.getOSCUDPTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCTCPTargetImpl <em>OSCTCP Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCTCPTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCTCPTarget()
     * @generated
     */
    EClass OSCTCP_TARGET = eINSTANCE.getOSCTCPTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCTCP_TARGET__PROTO = eINSTANCE.getOSCTCPTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCTCP_TARGET__ADDR = eINSTANCE.getOSCTCPTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCTCP_TARGET__FORMAT = eINSTANCE.getOSCTCPTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCXBeeTargetImpl <em>OSCX Bee Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCXBeeTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCXBeeTarget()
     * @generated
     */
    EClass OSCX_BEE_TARGET = eINSTANCE.getOSCXBeeTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCX_BEE_TARGET__PROTO = eINSTANCE.getOSCXBeeTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCX_BEE_TARGET__ADDR = eINSTANCE.getOSCXBeeTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCX_BEE_TARGET__FORMAT = eINSTANCE.getOSCXBeeTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl <em>OSC Http Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCHttpTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCHttpTarget()
     * @generated
     */
    EClass OSC_HTTP_TARGET = eINSTANCE.getOSCHttpTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_HTTP_TARGET__PROTO = eINSTANCE.getOSCHttpTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_HTTP_TARGET__ADDR = eINSTANCE.getOSCHttpTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_HTTP_TARGET__FORMAT = eINSTANCE.getOSCHttpTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCBluetoothTargetImpl <em>OSC Bluetooth Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCBluetoothTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCBluetoothTarget()
     * @generated
     */
    EClass OSC_BLUETOOTH_TARGET = eINSTANCE.getOSCBluetoothTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_BLUETOOTH_TARGET__PROTO = eINSTANCE.getOSCBluetoothTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_BLUETOOTH_TARGET__ADDR = eINSTANCE.getOSCBluetoothTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_BLUETOOTH_TARGET__FORMAT = eINSTANCE.getOSCBluetoothTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCUSBTargetImpl <em>OSCUSB Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCUSBTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCUSBTarget()
     * @generated
     */
    EClass OSCUSB_TARGET = eINSTANCE.getOSCUSBTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCUSB_TARGET__PROTO = eINSTANCE.getOSCUSBTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCUSB_TARGET__ADDR = eINSTANCE.getOSCUSBTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OSCUSB_TARGET__SPEED = eINSTANCE.getOSCUSBTarget_Speed();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSCUSB_TARGET__FORMAT = eINSTANCE.getOSCUSBTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.OSCUbqTargetImpl <em>OSC Ubq Target</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.OSCUbqTargetImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getOSCUbqTarget()
     * @generated
     */
    EClass OSC_UBQ_TARGET = eINSTANCE.getOSCUbqTarget();

    /**
     * The meta object literal for the '<em><b>Proto</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_UBQ_TARGET__PROTO = eINSTANCE.getOSCUbqTarget_Proto();

    /**
     * The meta object literal for the '<em><b>Addr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_UBQ_TARGET__ADDR = eINSTANCE.getOSCUbqTarget_Addr();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OSC_UBQ_TARGET__FORMAT = eINSTANCE.getOSCUbqTarget_Format();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.SpeedImpl <em>Speed</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.SpeedImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getSpeed()
     * @generated
     */
    EClass SPEED = eINSTANCE.getSpeed();

    /**
     * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPEED__SPEED = eINSTANCE.getSpeed_Speed();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.JvmVarImpl <em>Jvm Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.JvmVarImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getJvmVar()
     * @generated
     */
    EClass JVM_VAR = eINSTANCE.getJvmVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JVM_VAR__NAME = eINSTANCE.getJvmVar_Name();

    /**
     * The meta object literal for the '<em><b>Java Types</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JVM_VAR__JAVA_TYPES = eINSTANCE.getJvmVar_JavaTypes();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ExprModelImpl <em>Expr Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ExprModelImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getExprModel()
     * @generated
     */
    EClass EXPR_MODEL = eINSTANCE.getExprModel();

    /**
     * The meta object literal for the '<em><b>Is Tested</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_MODEL__IS_TESTED = eINSTANCE.getExprModel_IsTested();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPR_MODEL__NAME = eINSTANCE.getExprModel_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MODEL__USINGS = eINSTANCE.getExprModel_Usings();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MODEL__ELEMENTS = eINSTANCE.getExprModel_Elements();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPR_MODEL__FUNCTIONS = eINSTANCE.getExprModel_Functions();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.UsingImpl <em>Using</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.UsingImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getUsing()
     * @generated
     */
    EClass USING = eINSTANCE.getUsing();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USING__IMPORTED_NAMESPACE = eINSTANCE.getUsing_ImportedNamespace();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ElementImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.SymbolImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__NAME = eINSTANCE.getSymbol_Name();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ReturnImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getReturn()
     * @generated
     */
    EClass RETURN = eINSTANCE.getReturn();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__EXPR = eINSTANCE.getReturn_Expr();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EnumDeclImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEnumDecl()
     * @generated
     */
    EClass ENUM_DECL = eINSTANCE.getEnumDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_DECL__NAME = eINSTANCE.getEnumDecl_Name();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_DECL__LITERALS = eINSTANCE.getEnumDecl_Literals();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.TypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.PrimitiveTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ArrayTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getArrayType()
     * @generated
     */
    EClass ARRAY_TYPE = eINSTANCE.getArrayType();

    /**
     * The meta object literal for the '<em><b>Base Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_TYPE__BASE_TYPE = eINSTANCE.getArrayType_BaseType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EnumTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEnumType()
     * @generated
     */
    EClass ENUM_TYPE = eINSTANCE.getEnumType();

    /**
     * The meta object literal for the '<em><b>Enum Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_TYPE__ENUM_REF = eINSTANCE.getEnumType_EnumRef();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.IntTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.BoolTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.FloatTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.StringTypeImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ExprImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ExpressionImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.FunctionDeclarationImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getFunctionDeclaration()
     * @generated
     */
    EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__TYPE = eINSTANCE.getFunctionDeclaration_Type();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__PARAMS = eINSTANCE.getFunctionDeclaration_Params();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DECLARATION__ELEMENTS = eINSTANCE.getFunctionDeclaration_Elements();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ParameterImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EnumLiteralImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEnumLiteral()
     * @generated
     */
    EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.VarDeclImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getVarDecl()
     * @generated
     */
    EClass VAR_DECL = eINSTANCE.getVarDecl();

    /**
     * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR_DECL__READONLY = eINSTANCE.getVarDecl_Readonly();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__TYPE = eINSTANCE.getVarDecl_Type();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR_DECL__INIT = eINSTANCE.getVarDecl_Init();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.FormulaImpl <em>Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.FormulaImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getFormula()
     * @generated
     */
    EClass FORMULA = eINSTANCE.getFormula();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA__TYPE = eINSTANCE.getFormula_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORMULA__EXPR = eINSTANCE.getFormula_Expr();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.EqualsImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEquals()
     * @generated
     */
    EClass EQUALS = eINSTANCE.getEquals();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__LEFT = eINSTANCE.getEquals_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS__RIGHT = eINSTANCE.getEquals_Right();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.PlusImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.MultiImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getMulti()
     * @generated
     */
    EClass MULTI = eINSTANCE.getMulti();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__LEFT = eINSTANCE.getMulti_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI__RIGHT = eINSTANCE.getMulti_Right();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.ArrayAccessImpl <em>Array Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.ArrayAccessImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getArrayAccess()
     * @generated
     */
    EClass ARRAY_ACCESS = eINSTANCE.getArrayAccess();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ACCESS__EXPR = eINSTANCE.getArrayAccess_Expr();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_ACCESS__INDEX = eINSTANCE.getArrayAccess_Index();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.SymbolRefImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getSymbolRef()
     * @generated
     */
    EClass SYMBOL_REF = eINSTANCE.getSymbolRef();

    /**
     * The meta object literal for the '<em><b>Symbol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__SYMBOL = eINSTANCE.getSymbolRef_Symbol();

    /**
     * The meta object literal for the '<em><b>Actuals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL_REF__ACTUALS = eINSTANCE.getSymbolRef_Actuals();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.NumberLiteralImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.impl.StringLiteralImpl
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

    /**
     * The meta object literal for the '{@link net.sf.smbt.osc.oscDsl.EzFormats <em>Ez Formats</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.osc.oscDsl.EzFormats
     * @see net.sf.smbt.osc.oscDsl.impl.OscDslPackageImpl#getEzFormats()
     * @generated
     */
    EEnum EZ_FORMATS = eINSTANCE.getEzFormats();

  }

} //OscDslPackage
