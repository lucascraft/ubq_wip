package net.sf.smbt.ez.script.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import net.sf.smbt.ez.script.ezDsl.ArrayAccess;
import net.sf.smbt.ez.script.ezDsl.ArrayType;
import net.sf.smbt.ez.script.ezDsl.Assert;
import net.sf.smbt.ez.script.ezDsl.BoolType;
import net.sf.smbt.ez.script.ezDsl.DataType;
import net.sf.smbt.ez.script.ezDsl.EnumDecl;
import net.sf.smbt.ez.script.ezDsl.EnumLiteral;
import net.sf.smbt.ez.script.ezDsl.EnumType;
import net.sf.smbt.ez.script.ezDsl.Equals;
import net.sf.smbt.ez.script.ezDsl.EzDslPackage;
import net.sf.smbt.ez.script.ezDsl.FloatType;
import net.sf.smbt.ez.script.ezDsl.Formula;
import net.sf.smbt.ez.script.ezDsl.FunctionDeclaration;
import net.sf.smbt.ez.script.ezDsl.IntType;
import net.sf.smbt.ez.script.ezDsl.JvmVar;
import net.sf.smbt.ez.script.ezDsl.Model;
import net.sf.smbt.ez.script.ezDsl.Multi;
import net.sf.smbt.ez.script.ezDsl.NumberLiteral;
import net.sf.smbt.ez.script.ezDsl.Parameter;
import net.sf.smbt.ez.script.ezDsl.Plus;
import net.sf.smbt.ez.script.ezDsl.Return;
import net.sf.smbt.ez.script.ezDsl.StringLiteral;
import net.sf.smbt.ez.script.ezDsl.StringType;
import net.sf.smbt.ez.script.ezDsl.SymbolRef;
import net.sf.smbt.ez.script.ezDsl.Using;
import net.sf.smbt.ez.script.ezDsl.VarDecl;
import net.sf.smbt.ez.script.services.EzDslGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XBinaryOperation;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XCastedExpression;
import org.eclipse.xtext.xbase.XCatchClause;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XConstructorCall;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XIfExpression;
import org.eclipse.xtext.xbase.XInstanceOfExpression;
//import org.eclipse.xtext.xbase.XIntLiteral;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XSwitchExpression;
import org.eclipse.xtext.xbase.XThrowExpression;
import org.eclipse.xtext.xbase.XTryCatchFinallyExpression;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XUnaryOperation;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.serializer.XbaseSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("restriction")
public class AbstractEzDslSemanticSequencer { // extends AbstractSemanticSequencer {
//
//	@Inject
//	protected EzDslGrammarAccess grammarAccess;
//	
//	@Inject
//	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
//	
//	@Inject
//	protected ITransientValueService transientValues;
//	
//	@Inject
//	@GenericSequencer
//	protected Provider<ISemanticSequencer> genericSequencerProvider;
//	
//	protected ISemanticSequencer genericSequencer;
//	
//	@Inject
//	protected Provider<XbaseSemanticSequencer> superSequencerProvider;
//	 
//	protected XbaseSemanticSequencer superSequencer; 
//	
//	@Override
//	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
//		super.init(sequencer, sequenceAcceptor, errorAcceptor);
//		this.genericSequencer = genericSequencerProvider.get();
//		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
//		this.superSequencer = superSequencerProvider.get();
//		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
//	}
//	
//	public void createSequence(EObject context, EObject semanticObject) {
//		if(semanticObject.eClass().getEPackage() == EzDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
//			case EzDslPackage.ARRAY_ACCESS:
//				if(context == grammarAccess.getAdditionRule() ||
//				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0() ||
//				   context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0() ||
//				   context == grammarAccess.getExprRule() ||
//				   context == grammarAccess.getMultiplicationRule() ||
//				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0() ||
//				   context == grammarAccess.getPostfixOperatorsRule()) {
//					sequence_PostfixOperators(context, (ArrayAccess) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.ARRAY_TYPE:
//				if(context == grammarAccess.getArrayTypeRule() ||
//				   context == grammarAccess.getTypeRule()) {
//					sequence_ArrayType(context, (ArrayType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.ASSERT:
//				if(context == grammarAccess.getAssertRule() ||
//				   context == grammarAccess.getElementRule()) {
//					sequence_Assert(context, (Assert) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.BOOL_TYPE:
//				if(context == grammarAccess.getBoolTypeRule() ||
//				   context == grammarAccess.getPrimitiveTypeRule() ||
//				   context == grammarAccess.getTypeRule()) {
//					sequence_Type(context, (BoolType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.DATA_TYPE:
//				if(context == grammarAccess.getDataTypeRule()) {
//					sequence_DataType(context, (DataType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.ENUM_DECL:
//				if(context == grammarAccess.getElementRule() ||
//				   context == grammarAccess.getEnumDeclRule()) {
//					sequence_EnumDecl(context, (EnumDecl) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.ENUM_LITERAL:
//				if(context == grammarAccess.getEnumLiteralRule()) {
//					sequence_EnumLiteral(context, (EnumLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.ENUM_TYPE:
//				if(context == grammarAccess.getEnumTypeRule() ||
//				   context == grammarAccess.getPrimitiveTypeRule() ||
//				   context == grammarAccess.getTypeRule()) {
//					sequence_EnumType(context, (EnumType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.EQUALS:
//				if(context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getExprRule()) {
//					sequence_Comparison(context, (Equals) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.FLOAT_TYPE:
//				if(context == grammarAccess.getFloatTypeRule() ||
//				   context == grammarAccess.getPrimitiveTypeRule() ||
//				   context == grammarAccess.getTypeRule()) {
//					sequence_Type(context, (FloatType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.FORMULA:
//				if(context == grammarAccess.getElementRule() ||
//				   context == grammarAccess.getFormulaRule()) {
//					sequence_Formula(context, (Formula) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.FUNCTION_DECLARATION:
//				if(context == grammarAccess.getFunctionDeclarationRule()) {
//					sequence_FunctionDeclaration(context, (FunctionDeclaration) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.INT_TYPE:
//				if(context == grammarAccess.getIntTypeRule() ||
//				   context == grammarAccess.getPrimitiveTypeRule() ||
//				   context == grammarAccess.getTypeRule()) {
//					sequence_Type(context, (IntType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.JVM_VAR:
//				if(context == grammarAccess.getJvmVarRule()) {
//					sequence_JvmVar(context, (JvmVar) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.MODEL:
//				if(context == grammarAccess.getModelRule()) {
//					sequence_Model(context, (Model) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.MULTI:
//				if(context == grammarAccess.getAdditionRule() ||
//				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0() ||
//				   context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0() ||
//				   context == grammarAccess.getExprRule() ||
//				   context == grammarAccess.getMultiplicationRule() ||
//				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0()) {
//					sequence_Multiplication(context, (Multi) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.NUMBER_LITERAL:
//				if(context == grammarAccess.getAdditionRule() ||
//				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0() ||
//				   context == grammarAccess.getAtomicRule() ||
//				   context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0() ||
//				   context == grammarAccess.getExprRule() ||
//				   context == grammarAccess.getMultiplicationRule() ||
//				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0() ||
//				   context == grammarAccess.getPostfixOperatorsRule() ||
//				   context == grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()) {
//					sequence_Atomic(context, (NumberLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.PARAMETER:
//				if(context == grammarAccess.getParameterRule()) {
//					sequence_Parameter(context, (Parameter) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.PLUS:
//				if(context == grammarAccess.getAdditionRule() ||
//				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0() ||
//				   context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0() ||
//				   context == grammarAccess.getExprRule()) {
//					sequence_Addition(context, (Plus) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.RETURN:
//				if(context == grammarAccess.getElementRule() ||
//				   context == grammarAccess.getReturnRule()) {
//					sequence_Return(context, (Return) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.STRING_LITERAL:
//				if(context == grammarAccess.getAdditionRule() ||
//				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0() ||
//				   context == grammarAccess.getAtomicRule() ||
//				   context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0() ||
//				   context == grammarAccess.getExprRule() ||
//				   context == grammarAccess.getMultiplicationRule() ||
//				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0() ||
//				   context == grammarAccess.getPostfixOperatorsRule() ||
//				   context == grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()) {
//					sequence_Atomic(context, (StringLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.STRING_TYPE:
//				if(context == grammarAccess.getPrimitiveTypeRule() ||
//				   context == grammarAccess.getStringTypeRule() ||
//				   context == grammarAccess.getTypeRule()) {
//					sequence_Type(context, (StringType) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.SYMBOL_REF:
//				if(context == grammarAccess.getAdditionRule() ||
//				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0() ||
//				   context == grammarAccess.getAtomicRule() ||
//				   context == grammarAccess.getComparisonRule() ||
//				   context == grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0() ||
//				   context == grammarAccess.getExprRule() ||
//				   context == grammarAccess.getMultiplicationRule() ||
//				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0() ||
//				   context == grammarAccess.getPostfixOperatorsRule() ||
//				   context == grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0()) {
//					sequence_Atomic(context, (SymbolRef) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.USING:
//				if(context == grammarAccess.getUsingRule()) {
//					sequence_Using(context, (Using) semanticObject); 
//					return; 
//				}
//				else break;
//			case EzDslPackage.VAR_DECL:
//				if(context == grammarAccess.getElementRule() ||
//				   context == grammarAccess.getVarDeclRule()) {
//					sequence_VarDecl(context, (VarDecl) semanticObject); 
//					return; 
//				}
//				else break;
//			}
//		else if(semanticObject.eClass().getEPackage() == TypesPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
//			case TypesPackage.JVM_FORMAL_PARAMETER:
//				if(context == grammarAccess.getFullJvmFormalParameterRule()) {
//					sequence_FullJvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
//					return; 
//				}
//				else if(context == grammarAccess.getJvmFormalParameterRule()) {
//					sequence_JvmFormalParameter(context, (JvmFormalParameter) semanticObject); 
//					return; 
//				}
//				else break;
//			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
//				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
//				   context == grammarAccess.getJvmTypeReferenceRule() ||
//				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
//					sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
//					return; 
//				}
//				else break;
//			case TypesPackage.JVM_LOWER_BOUND:
//				if(context == grammarAccess.getJvmLowerBoundRule()) {
//					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
//					return; 
//				}
//				else break;
//			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
//				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
//				   context == grammarAccess.getJvmParameterizedTypeReferenceRule() ||
//				   context == grammarAccess.getJvmTypeReferenceRule() ||
//				   context == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()) {
//					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
//					return; 
//				}
//				else break;
//			case TypesPackage.JVM_TYPE_PARAMETER:
//				if(context == grammarAccess.getJvmTypeParameterRule()) {
//					sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
//					return; 
//				}
//				else break;
//			case TypesPackage.JVM_UPPER_BOUND:
//				if(context == grammarAccess.getJvmUpperBoundAndedRule()) {
//					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
//					return; 
//				}
//				else if(context == grammarAccess.getJvmUpperBoundRule()) {
//					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
//					return; 
//				}
//				else break;
//			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
//				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
//				   context == grammarAccess.getJvmWildcardTypeReferenceRule()) {
//					sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
//					return; 
//				}
//				else break;
//			}
//		else if(semanticObject.eClass().getEPackage() == XbasePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
//			case XbasePackage.XASSIGNMENT:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XAssignment(context, (XAssignment) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XBINARY_OPERATION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XAdditiveExpression(context, (XBinaryOperation) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XBLOCK_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXBlockExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XBlockExpression(context, (XBlockExpression) semanticObject); 
//					return; 
//				}
//				else if(context == grammarAccess.getXExpressionInClosureRule()) {
//					sequence_XExpressionInClosure(context, (XBlockExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XBOOLEAN_LITERAL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXBooleanLiteralRule() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXLiteralRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XBooleanLiteral(context, (XBooleanLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XCASE_PART:
//				if(context == grammarAccess.getXCasePartRule()) {
//					sequence_XCasePart(context, (XCasePart) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XCASTED_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XCastedExpression(context, (XCastedExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XCATCH_CLAUSE:
//				if(context == grammarAccess.getXCatchClauseRule()) {
//					sequence_XCatchClause(context, (XCatchClause) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XCLOSURE:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXClosureRule() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXLiteralRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XClosure(context, (XClosure) semanticObject); 
//					return; 
//				}
//				else if(context == grammarAccess.getXShortClosureRule()) {
//					sequence_XShortClosure(context, (XClosure) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XCONSTRUCTOR_CALL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXConstructorCallRule() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XConstructorCall(context, (XConstructorCall) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XDO_WHILE_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXDoWhileExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XDoWhileExpression(context, (XDoWhileExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XFEATURE_CALL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XFeatureCall(context, (XFeatureCall) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XFOR_LOOP_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXForLoopExpressionRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XForLoopExpression(context, (XForLoopExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XIF_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXIfExpressionRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XIfExpression(context, (XIfExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XINSTANCE_OF_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XRelationalExpression(context, (XInstanceOfExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XINT_LITERAL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXIntLiteralRule() ||
//				   context == grammarAccess.getXLiteralRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XIntLiteral(context, (XIntLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XMEMBER_FEATURE_CALL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XMemberFeatureCall(context, (XMemberFeatureCall) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XNULL_LITERAL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXLiteralRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXNullLiteralRule() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XExpression(context, (XNullLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XRETURN_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXReturnExpressionRule() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XReturnExpression(context, (XReturnExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XSTRING_LITERAL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXLiteralRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXStringLiteralRule() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XStringLiteral(context, (XStringLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XSWITCH_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXSwitchExpressionRule() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XSwitchExpression(context, (XSwitchExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XTHROW_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXThrowExpressionRule() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XThrowExpression(context, (XThrowExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XTRY_CATCH_FINALLY_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXTryCatchFinallyExpressionRule() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XTryCatchFinallyExpression(context, (XTryCatchFinallyExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XTYPE_LITERAL:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXLiteralRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXTypeLiteralRule() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XTypeLiteral(context, (XTypeLiteral) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XUNARY_OPERATION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule()) {
//					sequence_XUnaryOperation(context, (XUnaryOperation) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XVARIABLE_DECLARATION:
//				if(context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXVariableDeclarationRule()) {
//					sequence_XVariableDeclaration(context, (XVariableDeclaration) semanticObject); 
//					return; 
//				}
//				else break;
//			case XbasePackage.XWHILE_EXPRESSION:
//				if(context == grammarAccess.getXAdditiveExpressionRule() ||
//				   context == grammarAccess.getXAdditiveExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAndExpressionRule() ||
//				   context == grammarAccess.getXAndExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXAssignmentRule() ||
//				   context == grammarAccess.getXAssignmentAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXCastedExpressionRule() ||
//				   context == grammarAccess.getXCastedExpressionAccess().getXCastedExpressionTargetAction_1_0_0_0() ||
//				   context == grammarAccess.getXEqualityExpressionRule() ||
//				   context == grammarAccess.getXEqualityExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXExpressionRule() ||
//				   context == grammarAccess.getXExpressionInsideBlockRule() ||
//				   context == grammarAccess.getXMemberFeatureCallRule() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXAssignmentAssignableAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXMemberFeatureCallAccess().getXMemberFeatureCallMemberCallTargetAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXMultiplicativeExpressionRule() ||
//				   context == grammarAccess.getXMultiplicativeExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOrExpressionRule() ||
//				   context == grammarAccess.getXOrExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXOtherOperatorExpressionRule() ||
//				   context == grammarAccess.getXOtherOperatorExpressionAccess().getXBinaryOperationLeftOperandAction_1_0_0_0() ||
//				   context == grammarAccess.getXParenthesizedExpressionRule() ||
//				   context == grammarAccess.getXPrimaryExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionRule() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXBinaryOperationLeftOperandAction_1_1_0_0_0() ||
//				   context == grammarAccess.getXRelationalExpressionAccess().getXInstanceOfExpressionExpressionAction_1_0_0_0_0() ||
//				   context == grammarAccess.getXUnaryOperationRule() ||
//				   context == grammarAccess.getXWhileExpressionRule()) {
//					sequence_XWhileExpression(context, (XWhileExpression) semanticObject); 
//					return; 
//				}
//				else break;
//			}
//		else if(semanticObject.eClass().getEPackage() == XtypePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
//			case XtypePackage.XFUNCTION_TYPE_REF:
//				if(context == grammarAccess.getJvmArgumentTypeReferenceRule() ||
//				   context == grammarAccess.getJvmTypeReferenceRule() ||
//				   context == grammarAccess.getXFunctionTypeRefRule()) {
//					sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
//					return; 
//				}
//				else break;
//			}
//		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
//	}
//	
//	/**
//	 * Constraint:
//	 *     (left=Addition_Plus_1_0 right=Multiplication)
//	 */
//	protected void sequence_Addition(EObject context, Plus semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.PLUS__LEFT));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.PLUS__RIGHT));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0(), semanticObject.getLeft());
//		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_2_0(), semanticObject.getRight());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     baseType=Type
//	 */
//	protected void sequence_ArrayType(EObject context, ArrayType semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.ARRAY_TYPE__BASE_TYPE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.ARRAY_TYPE__BASE_TYPE));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getArrayTypeAccess().getBaseTypeTypeParserRuleCall_3_0(), semanticObject.getBaseType());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (actual=Expr expected=Expr msg=Expr?)
//	 */
//	protected void sequence_Assert(EObject context, Assert semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     value=FloatType
//	 */
//	protected void sequence_Atomic(EObject context, NumberLiteral semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.NUMBER_LITERAL__VALUE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.NUMBER_LITERAL__VALUE));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getAtomicAccess().getValueFloatTypeParserRuleCall_1_1_0(), semanticObject.getValue());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     value=STRING
//	 */
//	protected void sequence_Atomic(EObject context, StringLiteral semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.STRING_LITERAL__VALUE));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_2_1_0(), semanticObject.getValue());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (symbol=[Symbol|QID] (actuals+=Expr? actuals+=Expr*)?)
//	 */
//	protected void sequence_Atomic(EObject context, SymbolRef semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (left=Comparison_Equals_1_0 right=Addition)
//	 */
//	protected void sequence_Comparison(EObject context, Equals semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.EQUALS__LEFT) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.EQUALS__LEFT));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.EQUALS__RIGHT) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.EQUALS__RIGHT));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getComparisonAccess().getEqualsLeftAction_1_0(), semanticObject.getLeft());
//		feeder.accept(grammarAccess.getComparisonAccess().getRightAdditionParserRuleCall_1_2_0(), semanticObject.getRight());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (name=ID javaType=[JvmType|QualifiedName])
//	 */
//	protected void sequence_DataType(EObject context, DataType semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.DATA_TYPE__NAME) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.DATA_TYPE__NAME));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.DATA_TYPE__JAVA_TYPE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.DATA_TYPE__JAVA_TYPE));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
//		feeder.accept(grammarAccess.getDataTypeAccess().getJavaTypeJvmTypeQualifiedNameParserRuleCall_3_0_1(), semanticObject.getJavaType());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (name=ID literals+=EnumLiteral*)
//	 */
//	protected void sequence_EnumDecl(EObject context, EnumDecl semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     name=ID
//	 */
//	protected void sequence_EnumLiteral(EObject context, EnumLiteral semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.SYMBOL__NAME) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.SYMBOL__NAME));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getEnumLiteralAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     enumRef=[EnumDecl|ID]
//	 */
//	protected void sequence_EnumType(EObject context, EnumType semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.ENUM_TYPE__ENUM_REF) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.ENUM_TYPE__ENUM_REF));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getEnumTypeAccess().getEnumRefEnumDeclIDTerminalRuleCall_0_1(), semanticObject.getEnumRef());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (type=Type name=ID expr=Expr)
//	 */
//	protected void sequence_Formula(EObject context, Formula semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.SYMBOL__NAME) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.SYMBOL__NAME));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.FORMULA__TYPE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.FORMULA__TYPE));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.FORMULA__EXPR) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.FORMULA__EXPR));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getFormulaAccess().getTypeTypeParserRuleCall_2_0(), semanticObject.getType());
//		feeder.accept(grammarAccess.getFormulaAccess().getNameIDTerminalRuleCall_3_0(), semanticObject.getName());
//		feeder.accept(grammarAccess.getFormulaAccess().getExprExprParserRuleCall_5_0(), semanticObject.getExpr());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (parameterType=JvmTypeReference name=ValidID)
//	 */
//	protected void sequence_FullJvmFormalParameter(EObject context, JvmFormalParameter semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (type=Type name=ID (params+=Parameter params+=Parameter*)? elements+=Element*)
//	 */
//	protected void sequence_FunctionDeclaration(EObject context, FunctionDeclaration semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (parameterType=JvmTypeReference? name=ValidID)
//	 */
//	protected void sequence_JvmFormalParameter(EObject context, JvmFormalParameter semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     typeReference=JvmTypeReference
//	 */
//	protected void sequence_JvmLowerBound(EObject context, JvmLowerBound semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (type=[JvmType|QualifiedName] (arguments+=JvmArgumentTypeReference arguments+=JvmArgumentTypeReference*)?)
//	 */
//	protected void sequence_JvmParameterizedTypeReference(EObject context, JvmParameterizedTypeReference semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (name=ValidID ((constraints+=JvmUpperBound constraints+=JvmUpperBoundAnded*) | constraints+=JvmLowerBound)?)
//	 */
//	protected void sequence_JvmTypeParameter(EObject context, JvmTypeParameter semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     componentType=JvmTypeReference_JvmGenericArrayTypeReference_0_1_0_0
//	 */
//	protected void sequence_JvmTypeReference(EObject context, JvmGenericArrayTypeReference semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     typeReference=JvmTypeReference
//	 */
//	protected void sequence_JvmUpperBoundAnded(EObject context, JvmUpperBound semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     typeReference=JvmTypeReference
//	 */
//	protected void sequence_JvmUpperBound(EObject context, JvmUpperBound semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (name=ID javaTypes+=[JvmType|QualifiedName] javaTypes+=[JvmType|QualifiedName]*)
//	 */
//	protected void sequence_JvmVar(EObject context, JvmVar semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     ((constraints+=JvmUpperBound | constraints+=JvmLowerBound)?)
//	 */
//	protected void sequence_JvmWildcardTypeReference(EObject context, JvmWildcardTypeReference semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (isTested?='tested'? name=ID usings+=Using* (elements+=Element | functions+=FunctionDeclaration)*)
//	 */
//	protected void sequence_Model(EObject context, Model semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (left=Multiplication_Multi_1_0 right=PostfixOperators)
//	 */
//	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.MULTI__LEFT));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.MULTI__RIGHT));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0(), semanticObject.getLeft());
//		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPostfixOperatorsParserRuleCall_1_2_0(), semanticObject.getRight());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (type=Type name=ID)
//	 */
//	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.SYMBOL__NAME) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.SYMBOL__NAME));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.PARAMETER__TYPE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.PARAMETER__TYPE));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_1_0(), semanticObject.getType());
//		feeder.accept(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (expr=PostfixOperators_ArrayAccess_1_0 index=Expr)
//	 */
//	protected void sequence_PostfixOperators(EObject context, ArrayAccess semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.ARRAY_ACCESS__EXPR) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.ARRAY_ACCESS__EXPR));
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.ARRAY_ACCESS__INDEX) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.ARRAY_ACCESS__INDEX));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getPostfixOperatorsAccess().getArrayAccessExprAction_1_0(), semanticObject.getExpr());
//		feeder.accept(grammarAccess.getPostfixOperatorsAccess().getIndexExprParserRuleCall_1_2_0(), semanticObject.getIndex());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     expr=Expr
//	 */
//	protected void sequence_Return(EObject context, Return semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.RETURN__EXPR) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.RETURN__EXPR));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getReturnAccess().getExprExprParserRuleCall_1_0(), semanticObject.getExpr());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     {BoolType}
//	 */
//	protected void sequence_Type(EObject context, BoolType semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     {FloatType}
//	 */
//	protected void sequence_Type(EObject context, FloatType semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     {IntType}
//	 */
//	protected void sequence_Type(EObject context, IntType semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     {StringType}
//	 */
//	protected void sequence_Type(EObject context, StringType semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     importedNamespace=ImportID
//	 */
//	protected void sequence_Using(EObject context, Using semanticObject) {
//		if(errorAcceptor != null) {
//			if(transientValues.isValueTransient(semanticObject, EzDslPackage.Literals.USING__IMPORTED_NAMESPACE) == ValueTransient.YES)
//				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EzDslPackage.Literals.USING__IMPORTED_NAMESPACE));
//		}
//		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
//		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
//		feeder.accept(grammarAccess.getUsingAccess().getImportedNamespaceImportIDParserRuleCall_1_0(), semanticObject.getImportedNamespace());
//		feeder.finish();
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (readonly?='readonly'? type=Type name=ID init=Expr?)
//	 */
//	protected void sequence_VarDecl(EObject context, VarDecl semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (
//	 *         (leftOperand=XAdditiveExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpAdd] rightOperand=XMultiplicativeExpression) | 
//	 *         (leftOperand=XMultiplicativeExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpMulti] rightOperand=XUnaryOperation) | 
//	 *         (leftOperand=XOtherOperatorExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpOther] rightOperand=XAdditiveExpression) | 
//	 *         (leftOperand=XRelationalExpression_XBinaryOperation_1_1_0_0_0 feature=[JvmIdentifiableElement|OpCompare] rightOperand=XOtherOperatorExpression) | 
//	 *         (leftOperand=XEqualityExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpEquality] rightOperand=XRelationalExpression) | 
//	 *         (leftOperand=XAndExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpAnd] rightOperand=XEqualityExpression) | 
//	 *         (leftOperand=XOrExpression_XBinaryOperation_1_0_0_0 feature=[JvmIdentifiableElement|OpOr] rightOperand=XAndExpression) | 
//	 *         (leftOperand=XAssignment_XBinaryOperation_1_1_0_0_0 feature=[JvmIdentifiableElement|OpMultiAssign] rightOperand=XAssignment)
//	 *     )
//	 */
//	protected void sequence_XAdditiveExpression(EObject context, XBinaryOperation semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (
//	 *         (feature=[JvmIdentifiableElement|ValidID] value=XAssignment) | 
//	 *         (assignable=XMemberFeatureCall_XAssignment_1_0_0_0_0 feature=[JvmIdentifiableElement|ValidID] value=XAssignment)
//	 *     )
//	 */
//	protected void sequence_XAssignment(EObject context, XAssignment semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (expressions+=XExpressionInsideBlock*)
//	 */
//	protected void sequence_XBlockExpression(EObject context, XBlockExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (isTrue?='true'?)
//	 */
//	protected void sequence_XBooleanLiteral(EObject context, XBooleanLiteral semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (typeGuard=JvmTypeReference? case=XExpression? then=XExpression)
//	 */
//	protected void sequence_XCasePart(EObject context, XCasePart semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (target=XCastedExpression_XCastedExpression_1_0_0_0 type=JvmTypeReference)
//	 */
//	protected void sequence_XCastedExpression(EObject context, XCastedExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (declaredParam=FullJvmFormalParameter expression=XExpression)
//	 */
//	protected void sequence_XCatchClause(EObject context, XCatchClause semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (
//	 *         ((declaredFormalParameters+=JvmFormalParameter declaredFormalParameters+=JvmFormalParameter*)? explicitSyntax?='|')? 
//	 *         expression=XExpressionInClosure
//	 *     )
//	 */
//	protected void sequence_XClosure(EObject context, XClosure semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (
//	 *         constructor=[JvmConstructor|QualifiedName] 
//	 *         (typeArguments+=JvmArgumentTypeReference typeArguments+=JvmArgumentTypeReference*)? 
//	 *         (arguments+=XShortClosure | (arguments+=XExpression arguments+=XExpression*))? 
//	 *         arguments+=XClosure?
//	 *     )
//	 */
//	protected void sequence_XConstructorCall(EObject context, XConstructorCall semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (body=XExpression predicate=XExpression)
//	 */
//	protected void sequence_XDoWhileExpression(EObject context, XDoWhileExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (expressions+=XExpressionInsideBlock*)
//	 */
//	protected void sequence_XExpressionInClosure(EObject context, XBlockExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     {XNullLiteral}
//	 */
//	protected void sequence_XExpression(EObject context, XNullLiteral semanticObject) {
//		genericSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (
//	 *         declaringType=[JvmDeclaredType|StaticQualifier]? 
//	 *         (typeArguments+=JvmArgumentTypeReference typeArguments+=JvmArgumentTypeReference*)? 
//	 *         feature=[JvmIdentifiableElement|IdOrSuper] 
//	 *         (explicitOperationCall?='(' (featureCallArguments+=XShortClosure | (featureCallArguments+=XExpression featureCallArguments+=XExpression*))?)? 
//	 *         featureCallArguments+=XClosure?
//	 *     )
//	 */
//	protected void sequence_XFeatureCall(EObject context, XFeatureCall semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (declaredParam=JvmFormalParameter forExpression=XExpression eachExpression=XExpression)
//	 */
//	protected void sequence_XForLoopExpression(EObject context, XForLoopExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     ((paramTypes+=JvmTypeReference paramTypes+=JvmTypeReference*)? returnType=JvmTypeReference)
//	 */
//	protected void sequence_XFunctionTypeRef(EObject context, XFunctionTypeRef semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (if=XExpression then=XExpression else=XExpression?)
//	 */
//	protected void sequence_XIfExpression(EObject context, XIfExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     value=INT
//	 */
//	protected void sequence_XIntLiteral(EObject context, XIntLiteral semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (
//	 *         memberCallTarget=XMemberFeatureCall_XMemberFeatureCall_1_1_0_0_0 
//	 *         (nullSafe?='?.' | spreading?='*.')? 
//	 *         (typeArguments+=JvmArgumentTypeReference typeArguments+=JvmArgumentTypeReference*)? 
//	 *         feature=[JvmIdentifiableElement|ValidID] 
//	 *         (explicitOperationCall?='(' (memberCallArguments+=XShortClosure | (memberCallArguments+=XExpression memberCallArguments+=XExpression*))?)? 
//	 *         memberCallArguments+=XClosure?
//	 *     )
//	 */
//	protected void sequence_XMemberFeatureCall(EObject context, XMemberFeatureCall semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (expression=XRelationalExpression_XInstanceOfExpression_1_0_0_0_0 type=[JvmType|QualifiedName])
//	 */
//	protected void sequence_XRelationalExpression(EObject context, XInstanceOfExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (expression=XExpression?)
//	 */
//	protected void sequence_XReturnExpression(EObject context, XReturnExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     ((declaredFormalParameters+=JvmFormalParameter declaredFormalParameters+=JvmFormalParameter*)? explicitSyntax?='|' expression=XExpression)
//	 */
//	protected void sequence_XShortClosure(EObject context, XClosure semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     value=STRING
//	 */
//	protected void sequence_XStringLiteral(EObject context, XStringLiteral semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (localVarName=ValidID? switch=XExpression cases+=XCasePart+ default=XExpression?)
//	 */
//	protected void sequence_XSwitchExpression(EObject context, XSwitchExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     expression=XExpression
//	 */
//	protected void sequence_XThrowExpression(EObject context, XThrowExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (expression=XExpression ((catchClauses+=XCatchClause+ finallyExpression=XExpression?) | finallyExpression=XExpression))
//	 */
//	protected void sequence_XTryCatchFinallyExpression(EObject context, XTryCatchFinallyExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     type=[JvmType|QualifiedName]
//	 */
//	protected void sequence_XTypeLiteral(EObject context, XTypeLiteral semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (feature=[JvmIdentifiableElement|OpUnary] operand=XCastedExpression)
//	 */
//	protected void sequence_XUnaryOperation(EObject context, XUnaryOperation semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (writeable?='var'? ((type=JvmTypeReference name=ValidID) | name=ValidID) right=XExpression?)
//	 */
//	protected void sequence_XVariableDeclaration(EObject context, XVariableDeclaration semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
//	
//	
//	/**
//	 * Constraint:
//	 *     (predicate=XExpression body=XExpression)
//	 */
//	protected void sequence_XWhileExpression(EObject context, XWhileExpression semanticObject) {
//		superSequencer.createSequence(context, semanticObject);
//	}
}
