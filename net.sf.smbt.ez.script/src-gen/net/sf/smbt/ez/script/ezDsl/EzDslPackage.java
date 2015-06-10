/**
 * <copyright>
 * </copyright>
 *
 */
package net.sf.smbt.ez.script.ezDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see net.sf.smbt.ez.script.ezDsl.EzDslFactory
 * @model kind="package"
 * @generated
 */
public interface EzDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ezDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sf.net/smbt/ez/script/EzDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ezDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EzDslPackage eINSTANCE = net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl.init();

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ModelImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Is Tested</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__IS_TESTED = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 1;

  /**
   * The feature id for the '<em><b>Usings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USINGS = 2;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ELEMENTS = 3;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__FUNCTIONS = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.JvmVarImpl <em>Jvm Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.JvmVarImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getJvmVar()
   * @generated
   */
  int JVM_VAR = 1;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.MessageOutImpl <em>Message Out</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.MessageOutImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getMessageOut()
   * @generated
   */
  int MESSAGE_OUT = 2;

  /**
   * The feature id for the '<em><b>Osc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_OUT__OSC = 0;

  /**
   * The number of structural features of the '<em>Message Out</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_OUT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.TriggerImpl <em>Trigger</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.TriggerImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getTrigger()
   * @generated
   */
  int TRIGGER = 3;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER__TRIGGER = 0;

  /**
   * The number of structural features of the '<em>Trigger</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.MessageInImpl <em>Message In</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.MessageInImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getMessageIn()
   * @generated
   */
  int MESSAGE_IN = 4;

  /**
   * The feature id for the '<em><b>Osc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_IN__OSC = 0;

  /**
   * The feature id for the '<em><b>Trigger</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_IN__TRIGGER = 1;

  /**
   * The number of structural features of the '<em>Message In</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_IN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.DataTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getDataType()
   * @generated
   */
  int DATA_TYPE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Java Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE__JAVA_TYPE = 1;

  /**
   * The number of structural features of the '<em>Data Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.UsingImpl <em>Using</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.UsingImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getUsing()
   * @generated
   */
  int USING = 6;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ElementImpl <em>Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ElementImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getElement()
   * @generated
   */
  int ELEMENT = 7;

  /**
   * The number of structural features of the '<em>Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.SymbolImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 8;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.AssertImpl <em>Assert</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.AssertImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getAssert()
   * @generated
   */
  int ASSERT = 9;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__ACTUAL = ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expected</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__EXPECTED = ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT__MSG = ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Assert</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSERT_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ReturnImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 10;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.EnumDeclImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEnumDecl()
   * @generated
   */
  int ENUM_DECL = 11;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.TypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 12;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.PrimitiveTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 13;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ArrayTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getArrayType()
   * @generated
   */
  int ARRAY_TYPE = 14;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EnumTypeImpl <em>Enum Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.EnumTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEnumType()
   * @generated
   */
  int ENUM_TYPE = 15;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.IntTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getIntType()
   * @generated
   */
  int INT_TYPE = 16;

  /**
   * The number of structural features of the '<em>Int Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.BoolTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getBoolType()
   * @generated
   */
  int BOOL_TYPE = 17;

  /**
   * The number of structural features of the '<em>Bool Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.FloatTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getFloatType()
   * @generated
   */
  int FLOAT_TYPE = 18;

  /**
   * The number of structural features of the '<em>Float Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.StringTypeImpl <em>String Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.StringTypeImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getStringType()
   * @generated
   */
  int STRING_TYPE = 19;

  /**
   * The number of structural features of the '<em>String Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ExprImpl <em>Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ExprImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getExpr()
   * @generated
   */
  int EXPR = 20;

  /**
   * The number of structural features of the '<em>Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ExpressionImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 21;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getFunctionDeclaration()
   * @generated
   */
  int FUNCTION_DECLARATION = 22;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ParameterImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 23;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.EnumLiteralImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEnumLiteral()
   * @generated
   */
  int ENUM_LITERAL = 24;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.VarDeclImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getVarDecl()
   * @generated
   */
  int VAR_DECL = 25;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.FormulaImpl <em>Formula</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.FormulaImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getFormula()
   * @generated
   */
  int FORMULA = 26;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EqualsImpl <em>Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.EqualsImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEquals()
   * @generated
   */
  int EQUALS = 27;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.PlusImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getPlus()
   * @generated
   */
  int PLUS = 28;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.MultiImpl <em>Multi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.MultiImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getMulti()
   * @generated
   */
  int MULTI = 29;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ArrayAccessImpl <em>Array Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.ArrayAccessImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getArrayAccess()
   * @generated
   */
  int ARRAY_ACCESS = 30;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.SymbolRefImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getSymbolRef()
   * @generated
   */
  int SYMBOL_REF = 31;

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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.NumberLiteralImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getNumberLiteral()
   * @generated
   */
  int NUMBER_LITERAL = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
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
   * The meta object id for the '{@link net.sf.smbt.ez.script.ezDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see net.sf.smbt.ez.script.ezDsl.impl.StringLiteralImpl
   * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 33;

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
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.Model#isIsTested <em>Is Tested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Tested</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Model#isIsTested()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_IsTested();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.Model#getUsings <em>Usings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Usings</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Model#getUsings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Usings();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.Model#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Model#getElements()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Elements();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.Model#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Model#getFunctions()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Functions();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.JvmVar <em>Jvm Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jvm Var</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.JvmVar
   * @generated
   */
  EClass getJvmVar();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.JvmVar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.JvmVar#getName()
   * @see #getJvmVar()
   * @generated
   */
  EAttribute getJvmVar_Name();

  /**
   * Returns the meta object for the reference list '{@link net.sf.smbt.ez.script.ezDsl.JvmVar#getJavaTypes <em>Java Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Java Types</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.JvmVar#getJavaTypes()
   * @see #getJvmVar()
   * @generated
   */
  EReference getJvmVar_JavaTypes();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.MessageOut <em>Message Out</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message Out</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.MessageOut
   * @generated
   */
  EClass getMessageOut();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.ez.script.ezDsl.MessageOut#getOsc <em>Osc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Osc</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.MessageOut#getOsc()
   * @see #getMessageOut()
   * @generated
   */
  EReference getMessageOut_Osc();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Trigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Trigger
   * @generated
   */
  EClass getTrigger();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Trigger#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Trigger</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Trigger#getTrigger()
   * @see #getTrigger()
   * @generated
   */
  EReference getTrigger_Trigger();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.MessageIn <em>Message In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message In</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.MessageIn
   * @generated
   */
  EClass getMessageIn();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.ez.script.ezDsl.MessageIn#getOsc <em>Osc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Osc</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.MessageIn#getOsc()
   * @see #getMessageIn()
   * @generated
   */
  EReference getMessageIn_Osc();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.ez.script.ezDsl.MessageIn#getTrigger <em>Trigger</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Trigger</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.MessageIn#getTrigger()
   * @see #getMessageIn()
   * @generated
   */
  EReference getMessageIn_Trigger();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.DataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.DataType
   * @generated
   */
  EClass getDataType();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.DataType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.DataType#getName()
   * @see #getDataType()
   * @generated
   */
  EAttribute getDataType_Name();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.ez.script.ezDsl.DataType#getJavaType <em>Java Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Java Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.DataType#getJavaType()
   * @see #getDataType()
   * @generated
   */
  EReference getDataType_JavaType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Using <em>Using</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Using</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Using
   * @generated
   */
  EClass getUsing();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.Using#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Using#getImportedNamespace()
   * @see #getUsing()
   * @generated
   */
  EAttribute getUsing_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Element <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Element
   * @generated
   */
  EClass getElement();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.Symbol#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Symbol#getName()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Name();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Assert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assert</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Assert
   * @generated
   */
  EClass getAssert();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Assert#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Assert#getActual()
   * @see #getAssert()
   * @generated
   */
  EReference getAssert_Actual();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Assert#getExpected <em>Expected</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expected</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Assert#getExpected()
   * @see #getAssert()
   * @generated
   */
  EReference getAssert_Expected();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Assert#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Msg</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Assert#getMsg()
   * @see #getAssert()
   * @generated
   */
  EReference getAssert_Msg();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Return#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Return#getExpr()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Expr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.EnumDecl <em>Enum Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Decl</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.EnumDecl
   * @generated
   */
  EClass getEnumDecl();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.EnumDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.EnumDecl#getName()
   * @see #getEnumDecl()
   * @generated
   */
  EAttribute getEnumDecl_Name();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.EnumDecl#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.EnumDecl#getLiterals()
   * @see #getEnumDecl()
   * @generated
   */
  EReference getEnumDecl_Literals();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.ArrayType <em>Array Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.ArrayType
   * @generated
   */
  EClass getArrayType();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.ArrayType#getBaseType <em>Base Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Base Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.ArrayType#getBaseType()
   * @see #getArrayType()
   * @generated
   */
  EReference getArrayType_BaseType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.EnumType <em>Enum Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.EnumType
   * @generated
   */
  EClass getEnumType();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.ez.script.ezDsl.EnumType#getEnumRef <em>Enum Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum Ref</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.EnumType#getEnumRef()
   * @see #getEnumType()
   * @generated
   */
  EReference getEnumType_EnumRef();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.IntType <em>Int Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.IntType
   * @generated
   */
  EClass getIntType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.BoolType <em>Bool Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.BoolType
   * @generated
   */
  EClass getBoolType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.FloatType <em>Float Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.FloatType
   * @generated
   */
  EClass getFloatType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.StringType <em>String Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.StringType
   * @generated
   */
  EClass getStringType();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Expr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expr</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Expr
   * @generated
   */
  EClass getExpr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration <em>Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Declaration</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.FunctionDeclaration
   * @generated
   */
  EClass getFunctionDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getType()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Type();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getParams()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Params();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.FunctionDeclaration#getElements()
   * @see #getFunctionDeclaration()
   * @generated
   */
  EReference getFunctionDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.EnumLiteral <em>Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literal</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.EnumLiteral
   * @generated
   */
  EClass getEnumLiteral();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.VarDecl <em>Var Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var Decl</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.VarDecl
   * @generated
   */
  EClass getVarDecl();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.VarDecl#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.VarDecl#isReadonly()
   * @see #getVarDecl()
   * @generated
   */
  EAttribute getVarDecl_Readonly();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.VarDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.VarDecl#getType()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Type();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.VarDecl#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.VarDecl#getInit()
   * @see #getVarDecl()
   * @generated
   */
  EReference getVarDecl_Init();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Formula <em>Formula</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Formula</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Formula
   * @generated
   */
  EClass getFormula();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Formula#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Formula#getType()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Type();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Formula#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Formula#getExpr()
   * @see #getFormula()
   * @generated
   */
  EReference getFormula_Expr();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Equals <em>Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Equals
   * @generated
   */
  EClass getEquals();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Equals#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Equals#getLeft()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Equals#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Equals#getRight()
   * @see #getEquals()
   * @generated
   */
  EReference getEquals_Right();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.Multi <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Multi
   * @generated
   */
  EClass getMulti();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Multi#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Multi#getLeft()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Left();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.Multi#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.Multi#getRight()
   * @see #getMulti()
   * @generated
   */
  EReference getMulti_Right();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.ArrayAccess <em>Array Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Access</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.ArrayAccess
   * @generated
   */
  EClass getArrayAccess();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.ArrayAccess#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.ArrayAccess#getExpr()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Expr();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.ArrayAccess#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.ArrayAccess#getIndex()
   * @see #getArrayAccess()
   * @generated
   */
  EReference getArrayAccess_Index();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.SymbolRef <em>Symbol Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol Ref</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.SymbolRef
   * @generated
   */
  EClass getSymbolRef();

  /**
   * Returns the meta object for the reference '{@link net.sf.smbt.ez.script.ezDsl.SymbolRef#getSymbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbol</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.SymbolRef#getSymbol()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Symbol();

  /**
   * Returns the meta object for the containment reference list '{@link net.sf.smbt.ez.script.ezDsl.SymbolRef#getActuals <em>Actuals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actuals</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.SymbolRef#getActuals()
   * @see #getSymbolRef()
   * @generated
   */
  EReference getSymbolRef_Actuals();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.NumberLiteral <em>Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Number Literal</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.NumberLiteral
   * @generated
   */
  EClass getNumberLiteral();

  /**
   * Returns the meta object for the containment reference '{@link net.sf.smbt.ez.script.ezDsl.NumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.NumberLiteral#getValue()
   * @see #getNumberLiteral()
   * @generated
   */
  EReference getNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link net.sf.smbt.ez.script.ezDsl.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link net.sf.smbt.ez.script.ezDsl.StringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see net.sf.smbt.ez.script.ezDsl.StringLiteral#getValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EzDslFactory getEzDslFactory();

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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ModelImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Is Tested</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__IS_TESTED = eINSTANCE.getModel_IsTested();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Usings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__USINGS = eINSTANCE.getModel_Usings();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ELEMENTS = eINSTANCE.getModel_Elements();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__FUNCTIONS = eINSTANCE.getModel_Functions();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.JvmVarImpl <em>Jvm Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.JvmVarImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getJvmVar()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.MessageOutImpl <em>Message Out</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.MessageOutImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getMessageOut()
     * @generated
     */
    EClass MESSAGE_OUT = eINSTANCE.getMessageOut();

    /**
     * The meta object literal for the '<em><b>Osc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_OUT__OSC = eINSTANCE.getMessageOut_Osc();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.TriggerImpl <em>Trigger</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.TriggerImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getTrigger()
     * @generated
     */
    EClass TRIGGER = eINSTANCE.getTrigger();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER__TRIGGER = eINSTANCE.getTrigger_Trigger();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.MessageInImpl <em>Message In</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.MessageInImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getMessageIn()
     * @generated
     */
    EClass MESSAGE_IN = eINSTANCE.getMessageIn();

    /**
     * The meta object literal for the '<em><b>Osc</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_IN__OSC = eINSTANCE.getMessageIn_Osc();

    /**
     * The meta object literal for the '<em><b>Trigger</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE_IN__TRIGGER = eINSTANCE.getMessageIn_Trigger();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.DataTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getDataType()
     * @generated
     */
    EClass DATA_TYPE = eINSTANCE.getDataType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE__NAME = eINSTANCE.getDataType_Name();

    /**
     * The meta object literal for the '<em><b>Java Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DATA_TYPE__JAVA_TYPE = eINSTANCE.getDataType_JavaType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.UsingImpl <em>Using</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.UsingImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getUsing()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ElementImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getElement()
     * @generated
     */
    EClass ELEMENT = eINSTANCE.getElement();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.SymbolImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getSymbol()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.AssertImpl <em>Assert</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.AssertImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getAssert()
     * @generated
     */
    EClass ASSERT = eINSTANCE.getAssert();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT__ACTUAL = eINSTANCE.getAssert_Actual();

    /**
     * The meta object literal for the '<em><b>Expected</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT__EXPECTED = eINSTANCE.getAssert_Expected();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSERT__MSG = eINSTANCE.getAssert_Msg();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ReturnImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getReturn()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EnumDeclImpl <em>Enum Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.EnumDeclImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEnumDecl()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.TypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.PrimitiveTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ArrayTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getArrayType()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EnumTypeImpl <em>Enum Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.EnumTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEnumType()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.IntTypeImpl <em>Int Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.IntTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getIntType()
     * @generated
     */
    EClass INT_TYPE = eINSTANCE.getIntType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.BoolTypeImpl <em>Bool Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.BoolTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getBoolType()
     * @generated
     */
    EClass BOOL_TYPE = eINSTANCE.getBoolType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.FloatTypeImpl <em>Float Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.FloatTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getFloatType()
     * @generated
     */
    EClass FLOAT_TYPE = eINSTANCE.getFloatType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.StringTypeImpl <em>String Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.StringTypeImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getStringType()
     * @generated
     */
    EClass STRING_TYPE = eINSTANCE.getStringType();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ExprImpl <em>Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ExprImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getExpr()
     * @generated
     */
    EClass EXPR = eINSTANCE.getExpr();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ExpressionImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.FunctionDeclarationImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getFunctionDeclaration()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ParameterImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getParameter()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EnumLiteralImpl <em>Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.EnumLiteralImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEnumLiteral()
     * @generated
     */
    EClass ENUM_LITERAL = eINSTANCE.getEnumLiteral();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.VarDeclImpl <em>Var Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.VarDeclImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getVarDecl()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.FormulaImpl <em>Formula</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.FormulaImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getFormula()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.EqualsImpl <em>Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.EqualsImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getEquals()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.PlusImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getPlus()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.MultiImpl <em>Multi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.MultiImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getMulti()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.ArrayAccessImpl <em>Array Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.ArrayAccessImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getArrayAccess()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.SymbolRefImpl <em>Symbol Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.SymbolRefImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getSymbolRef()
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
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.NumberLiteralImpl <em>Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.NumberLiteralImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getNumberLiteral()
     * @generated
     */
    EClass NUMBER_LITERAL = eINSTANCE.getNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMBER_LITERAL__VALUE = eINSTANCE.getNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link net.sf.smbt.ez.script.ezDsl.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see net.sf.smbt.ez.script.ezDsl.impl.StringLiteralImpl
     * @see net.sf.smbt.ez.script.ezDsl.impl.EzDslPackageImpl#getStringLiteral()
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

  }

} //EzDslPackage
