
package atl.metamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public abstract class ATLModelVisitor {
	protected boolean _debug = false;
	// protected boolean _passAll = 
	protected ATLModelBaseObject current;

	public VisitedReferences prePrimitiveExp(atl.metamodel.OCL.PrimitiveExp self) { return new VisitedReferences("type"); } 
	public void inPrimitiveExp(atl.metamodel.OCL.PrimitiveExp self) { if ( _debug ) System.out.println("Visiting PrimitiveExp"); }
	public void beforePrimitiveExp(atl.metamodel.OCL.PrimitiveExp self) { }
	public VisitedReferences preOperatorCallExp(atl.metamodel.OCL.OperatorCallExp self) { return new VisitedReferences("type" , "source" , "arguments"); } 
	public void inOperatorCallExp(atl.metamodel.OCL.OperatorCallExp self) { if ( _debug ) System.out.println("Visiting OperatorCallExp"); }
	public void beforeOperatorCallExp(atl.metamodel.OCL.OperatorCallExp self) { }
	public VisitedReferences preForStat(atl.metamodel.ATL.ForStat self) { return new VisitedReferences("iterator" , "collection" , "statements"); } 
	public void inForStat(atl.metamodel.ATL.ForStat self) { if ( _debug ) System.out.println("Visiting ForStat"); }
	public void beforeForStat(atl.metamodel.ATL.ForStat self) { }
	public VisitedReferences preSuperExp(atl.metamodel.OCL.SuperExp self) { return new VisitedReferences("type"); } 
	public void inSuperExp(atl.metamodel.OCL.SuperExp self) { if ( _debug ) System.out.println("Visiting SuperExp"); }
	public void beforeSuperExp(atl.metamodel.OCL.SuperExp self) { }
	public VisitedReferences preLetExp(atl.metamodel.OCL.LetExp self) { return new VisitedReferences("type" , "variable" , "in_"); } 
	public void inLetExp(atl.metamodel.OCL.LetExp self) { if ( _debug ) System.out.println("Visiting LetExp"); }
	public void beforeLetExp(atl.metamodel.OCL.LetExp self) { }
	public VisitedReferences preOclAnyType(atl.metamodel.OCL.OclAnyType self) { return new VisitedReferences("type"); } 
	public void inOclAnyType(atl.metamodel.OCL.OclAnyType self) { if ( _debug ) System.out.println("Visiting OclAnyType"); }
	public void beforeOclAnyType(atl.metamodel.OCL.OclAnyType self) { }
	public VisitedReferences preSequenceType(atl.metamodel.OCL.SequenceType self) { return new VisitedReferences("type" , "elementType"); } 
	public void inSequenceType(atl.metamodel.OCL.SequenceType self) { if ( _debug ) System.out.println("Visiting SequenceType"); }
	public void beforeSequenceType(atl.metamodel.OCL.SequenceType self) { }
	public VisitedReferences preOclType(atl.metamodel.OCL.OclType self) { return new VisitedReferences("type"); } 
	public void inOclType(atl.metamodel.OCL.OclType self) { if ( _debug ) System.out.println("Visiting OclType"); }
	public void beforeOclType(atl.metamodel.OCL.OclType self) { }
	public VisitedReferences preNumericType(atl.metamodel.OCL.NumericType self) { return new VisitedReferences("type"); } 
	public void inNumericType(atl.metamodel.OCL.NumericType self) { if ( _debug ) System.out.println("Visiting NumericType"); }
	public void beforeNumericType(atl.metamodel.OCL.NumericType self) { }
	public VisitedReferences preOclFeature(atl.metamodel.OCL.OclFeature self) { return new VisitedReferences(); } 
	public void inOclFeature(atl.metamodel.OCL.OclFeature self) { if ( _debug ) System.out.println("Visiting OclFeature"); }
	public void beforeOclFeature(atl.metamodel.OCL.OclFeature self) { }
	public VisitedReferences preBooleanType(atl.metamodel.OCL.BooleanType self) { return new VisitedReferences("type"); } 
	public void inBooleanType(atl.metamodel.OCL.BooleanType self) { if ( _debug ) System.out.println("Visiting BooleanType"); }
	public void beforeBooleanType(atl.metamodel.OCL.BooleanType self) { }
	public VisitedReferences preInPatternElement(atl.metamodel.ATL.InPatternElement self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inInPatternElement(atl.metamodel.ATL.InPatternElement self) { if ( _debug ) System.out.println("Visiting InPatternElement"); }
	public void beforeInPatternElement(atl.metamodel.ATL.InPatternElement self) { }
	public VisitedReferences preVariableDeclaration(atl.metamodel.OCL.VariableDeclaration self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inVariableDeclaration(atl.metamodel.OCL.VariableDeclaration self) { if ( _debug ) System.out.println("Visiting VariableDeclaration"); }
	public void beforeVariableDeclaration(atl.metamodel.OCL.VariableDeclaration self) { }
	public VisitedReferences preForEachOutPatternElement(atl.metamodel.ATL.ForEachOutPatternElement self) { return new VisitedReferences("type" , "initExpression" , "bindings" , "collection" , "iterator"); } 
	public void inForEachOutPatternElement(atl.metamodel.ATL.ForEachOutPatternElement self) { if ( _debug ) System.out.println("Visiting ForEachOutPatternElement"); }
	public void beforeForEachOutPatternElement(atl.metamodel.ATL.ForEachOutPatternElement self) { }
	public VisitedReferences preIterateExp(atl.metamodel.OCL.IterateExp self) { return new VisitedReferences("type" , "source" , "body" , "iterators" , "result"); } 
	public void inIterateExp(atl.metamodel.OCL.IterateExp self) { if ( _debug ) System.out.println("Visiting IterateExp"); }
	public void beforeIterateExp(atl.metamodel.OCL.IterateExp self) { }
	public VisitedReferences preStringExp(atl.metamodel.OCL.StringExp self) { return new VisitedReferences("type"); } 
	public void inStringExp(atl.metamodel.OCL.StringExp self) { if ( _debug ) System.out.println("Visiting StringExp"); }
	public void beforeStringExp(atl.metamodel.OCL.StringExp self) { }
	public VisitedReferences preTupleExp(atl.metamodel.OCL.TupleExp self) { return new VisitedReferences("type" , "tuplePart"); } 
	public void inTupleExp(atl.metamodel.OCL.TupleExp self) { if ( _debug ) System.out.println("Visiting TupleExp"); }
	public void beforeTupleExp(atl.metamodel.OCL.TupleExp self) { }
	public VisitedReferences preOperation(atl.metamodel.OCL.Operation self) { return new VisitedReferences("parameters" , "returnType" , "body"); } 
	public void inOperation(atl.metamodel.OCL.Operation self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeOperation(atl.metamodel.OCL.Operation self) { }
	public VisitedReferences preCollectionType(atl.metamodel.OCL.CollectionType self) { return new VisitedReferences("type" , "elementType"); } 
	public void inCollectionType(atl.metamodel.OCL.CollectionType self) { if ( _debug ) System.out.println("Visiting CollectionType"); }
	public void beforeCollectionType(atl.metamodel.OCL.CollectionType self) { }
	public VisitedReferences preOclModel(atl.metamodel.OCL.OclModel self) { return new VisitedReferences(); } 
	public void inOclModel(atl.metamodel.OCL.OclModel self) { if ( _debug ) System.out.println("Visiting OclModel"); }
	public void beforeOclModel(atl.metamodel.OCL.OclModel self) { }
	public VisitedReferences preStatement(atl.metamodel.ATL.Statement self) { return new VisitedReferences(); } 
	public void inStatement(atl.metamodel.ATL.Statement self) { if ( _debug ) System.out.println("Visiting Statement"); }
	public void beforeStatement(atl.metamodel.ATL.Statement self) { }
	public VisitedReferences preOclUndefinedExp(atl.metamodel.OCL.OclUndefinedExp self) { return new VisitedReferences("type"); } 
	public void inOclUndefinedExp(atl.metamodel.OCL.OclUndefinedExp self) { if ( _debug ) System.out.println("Visiting OclUndefinedExp"); }
	public void beforeOclUndefinedExp(atl.metamodel.OCL.OclUndefinedExp self) { }
	public VisitedReferences preUnit(atl.metamodel.ATL.Unit self) { return new VisitedReferences("libraries"); } 
	public void inUnit(atl.metamodel.ATL.Unit self) { if ( _debug ) System.out.println("Visiting Unit"); }
	public void beforeUnit(atl.metamodel.ATL.Unit self) { }
	public VisitedReferences preOclExpression(atl.metamodel.OCL.OclExpression self) { return new VisitedReferences("type"); } 
	public void inOclExpression(atl.metamodel.OCL.OclExpression self) { if ( _debug ) System.out.println("Visiting OclExpression"); }
	public void beforeOclExpression(atl.metamodel.OCL.OclExpression self) { }
	public VisitedReferences preBooleanExp(atl.metamodel.OCL.BooleanExp self) { return new VisitedReferences("type"); } 
	public void inBooleanExp(atl.metamodel.OCL.BooleanExp self) { if ( _debug ) System.out.println("Visiting BooleanExp"); }
	public void beforeBooleanExp(atl.metamodel.OCL.BooleanExp self) { }
	public VisitedReferences preLibraryRef(atl.metamodel.ATL.LibraryRef self) { return new VisitedReferences(); } 
	public void inLibraryRef(atl.metamodel.ATL.LibraryRef self) { if ( _debug ) System.out.println("Visiting LibraryRef"); }
	public void beforeLibraryRef(atl.metamodel.ATL.LibraryRef self) { }
	public VisitedReferences preOrderedSetExp(atl.metamodel.OCL.OrderedSetExp self) { return new VisitedReferences("type" , "elements"); } 
	public void inOrderedSetExp(atl.metamodel.OCL.OrderedSetExp self) { if ( _debug ) System.out.println("Visiting OrderedSetExp"); }
	public void beforeOrderedSetExp(atl.metamodel.OCL.OrderedSetExp self) { }
	public VisitedReferences preQuery(atl.metamodel.ATL.Query self) { return new VisitedReferences("libraries" , "body" , "helpers"); } 
	public void inQuery(atl.metamodel.ATL.Query self) { if ( _debug ) System.out.println("Visiting Query"); }
	public void beforeQuery(atl.metamodel.ATL.Query self) { }
	public VisitedReferences preSetType(atl.metamodel.OCL.SetType self) { return new VisitedReferences("type" , "elementType"); } 
	public void inSetType(atl.metamodel.OCL.SetType self) { if ( _debug ) System.out.println("Visiting SetType"); }
	public void beforeSetType(atl.metamodel.OCL.SetType self) { }
	public VisitedReferences preOrderedSetType(atl.metamodel.OCL.OrderedSetType self) { return new VisitedReferences("type" , "elementType"); } 
	public void inOrderedSetType(atl.metamodel.OCL.OrderedSetType self) { if ( _debug ) System.out.println("Visiting OrderedSetType"); }
	public void beforeOrderedSetType(atl.metamodel.OCL.OrderedSetType self) { }
	public VisitedReferences preIntegerExp(atl.metamodel.OCL.IntegerExp self) { return new VisitedReferences("type"); } 
	public void inIntegerExp(atl.metamodel.OCL.IntegerExp self) { if ( _debug ) System.out.println("Visiting IntegerExp"); }
	public void beforeIntegerExp(atl.metamodel.OCL.IntegerExp self) { }
	public VisitedReferences preOclModelElement(atl.metamodel.OCL.OclModelElement self) { return new VisitedReferences("type"); } 
	public void inOclModelElement(atl.metamodel.OCL.OclModelElement self) { if ( _debug ) System.out.println("Visiting OclModelElement"); }
	public void beforeOclModelElement(atl.metamodel.OCL.OclModelElement self) { }
	public VisitedReferences preParameter(atl.metamodel.OCL.Parameter self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inParameter(atl.metamodel.OCL.Parameter self) { if ( _debug ) System.out.println("Visiting Parameter"); }
	public void beforeParameter(atl.metamodel.OCL.Parameter self) { }
	public VisitedReferences preStringType(atl.metamodel.OCL.StringType self) { return new VisitedReferences("type"); } 
	public void inStringType(atl.metamodel.OCL.StringType self) { if ( _debug ) System.out.println("Visiting StringType"); }
	public void beforeStringType(atl.metamodel.OCL.StringType self) { }
	public VisitedReferences preLibrary(atl.metamodel.ATL.Library self) { return new VisitedReferences("libraries" , "helpers"); } 
	public void inLibrary(atl.metamodel.ATL.Library self) { if ( _debug ) System.out.println("Visiting Library"); }
	public void beforeLibrary(atl.metamodel.ATL.Library self) { }
	public VisitedReferences preRealExp(atl.metamodel.OCL.RealExp self) { return new VisitedReferences("type"); } 
	public void inRealExp(atl.metamodel.OCL.RealExp self) { if ( _debug ) System.out.println("Visiting RealExp"); }
	public void beforeRealExp(atl.metamodel.OCL.RealExp self) { }
	public VisitedReferences preMapElement(atl.metamodel.OCL.MapElement self) { return new VisitedReferences("key" , "value"); } 
	public void inMapElement(atl.metamodel.OCL.MapElement self) { if ( _debug ) System.out.println("Visiting MapElement"); }
	public void beforeMapElement(atl.metamodel.OCL.MapElement self) { }
	public VisitedReferences preActionBlock(atl.metamodel.ATL.ActionBlock self) { return new VisitedReferences("statements"); } 
	public void inActionBlock(atl.metamodel.ATL.ActionBlock self) { if ( _debug ) System.out.println("Visiting ActionBlock"); }
	public void beforeActionBlock(atl.metamodel.ATL.ActionBlock self) { }
	public VisitedReferences preLoopExp(atl.metamodel.OCL.LoopExp self) { return new VisitedReferences("type" , "source" , "body" , "iterators"); } 
	public void inLoopExp(atl.metamodel.OCL.LoopExp self) { if ( _debug ) System.out.println("Visiting LoopExp"); }
	public void beforeLoopExp(atl.metamodel.OCL.LoopExp self) { }
	public VisitedReferences preIfStat(atl.metamodel.ATL.IfStat self) { return new VisitedReferences("condition" , "thenStatements" , "elseStatements"); } 
	public void inIfStat(atl.metamodel.ATL.IfStat self) { if ( _debug ) System.out.println("Visiting IfStat"); }
	public void beforeIfStat(atl.metamodel.ATL.IfStat self) { }
	public VisitedReferences preOutPattern(atl.metamodel.ATL.OutPattern self) { return new VisitedReferences("elements"); } 
	public void inOutPattern(atl.metamodel.ATL.OutPattern self) { if ( _debug ) System.out.println("Visiting OutPattern"); }
	public void beforeOutPattern(atl.metamodel.ATL.OutPattern self) { }
	public VisitedReferences preCalledRule(atl.metamodel.ATL.CalledRule self) { return new VisitedReferences("outPattern" , "actionBlock" , "variables" , "parameters"); } 
	public void inCalledRule(atl.metamodel.ATL.CalledRule self) { if ( _debug ) System.out.println("Visiting CalledRule"); }
	public void beforeCalledRule(atl.metamodel.ATL.CalledRule self) { }
	public VisitedReferences preRealType(atl.metamodel.OCL.RealType self) { return new VisitedReferences("type"); } 
	public void inRealType(atl.metamodel.OCL.RealType self) { if ( _debug ) System.out.println("Visiting RealType"); }
	public void beforeRealType(atl.metamodel.OCL.RealType self) { }
	public VisitedReferences preInPattern(atl.metamodel.ATL.InPattern self) { return new VisitedReferences("elements" , "filter"); } 
	public void inInPattern(atl.metamodel.ATL.InPattern self) { if ( _debug ) System.out.println("Visiting InPattern"); }
	public void beforeInPattern(atl.metamodel.ATL.InPattern self) { }
	public VisitedReferences preIfExp(atl.metamodel.OCL.IfExp self) { return new VisitedReferences("type" , "thenExpression" , "condition" , "elseExpression"); } 
	public void inIfExp(atl.metamodel.OCL.IfExp self) { if ( _debug ) System.out.println("Visiting IfExp"); }
	public void beforeIfExp(atl.metamodel.OCL.IfExp self) { }
	public VisitedReferences preBindingStat(atl.metamodel.ATL.BindingStat self) { return new VisitedReferences("source" , "value"); } 
	public void inBindingStat(atl.metamodel.ATL.BindingStat self) { if ( _debug ) System.out.println("Visiting BindingStat"); }
	public void beforeBindingStat(atl.metamodel.ATL.BindingStat self) { }
	public VisitedReferences preMapExp(atl.metamodel.OCL.MapExp self) { return new VisitedReferences("type" , "elements"); } 
	public void inMapExp(atl.metamodel.OCL.MapExp self) { if ( _debug ) System.out.println("Visiting MapExp"); }
	public void beforeMapExp(atl.metamodel.OCL.MapExp self) { }
	public VisitedReferences preTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute self) { return new VisitedReferences("type"); } 
	public void inTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute self) { if ( _debug ) System.out.println("Visiting TupleTypeAttribute"); }
	public void beforeTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute self) { }
	public VisitedReferences preBinding(atl.metamodel.ATL.Binding self) { return new VisitedReferences("value"); } 
	public void inBinding(atl.metamodel.ATL.Binding self) { if ( _debug ) System.out.println("Visiting Binding"); }
	public void beforeBinding(atl.metamodel.ATL.Binding self) { }
	public VisitedReferences preHelper(atl.metamodel.ATL.Helper self) { return new VisitedReferences("definition"); } 
	public void inHelper(atl.metamodel.ATL.Helper self) { if ( _debug ) System.out.println("Visiting Helper"); }
	public void beforeHelper(atl.metamodel.ATL.Helper self) { }
	public VisitedReferences prePrimitive(atl.metamodel.OCL.Primitive self) { return new VisitedReferences("type"); } 
	public void inPrimitive(atl.metamodel.OCL.Primitive self) { if ( _debug ) System.out.println("Visiting Primitive"); }
	public void beforePrimitive(atl.metamodel.OCL.Primitive self) { }
	public VisitedReferences preMatchedRule(atl.metamodel.ATL.MatchedRule self) { return new VisitedReferences("outPattern" , "actionBlock" , "variables" , "inPattern"); } 
	public void inMatchedRule(atl.metamodel.ATL.MatchedRule self) { if ( _debug ) System.out.println("Visiting MatchedRule"); }
	public void beforeMatchedRule(atl.metamodel.ATL.MatchedRule self) { }
	public VisitedReferences preSimpleInPatternElement(atl.metamodel.ATL.SimpleInPatternElement self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inSimpleInPatternElement(atl.metamodel.ATL.SimpleInPatternElement self) { if ( _debug ) System.out.println("Visiting SimpleInPatternElement"); }
	public void beforeSimpleInPatternElement(atl.metamodel.ATL.SimpleInPatternElement self) { }
	public VisitedReferences preLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { return new VisitedReferences("outPattern" , "actionBlock" , "variables" , "inPattern"); } 
	public void inLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { if ( _debug ) System.out.println("Visiting LazyMatchedRule"); }
	public void beforeLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { }
	public VisitedReferences preNumericExp(atl.metamodel.OCL.NumericExp self) { return new VisitedReferences("type"); } 
	public void inNumericExp(atl.metamodel.OCL.NumericExp self) { if ( _debug ) System.out.println("Visiting NumericExp"); }
	public void beforeNumericExp(atl.metamodel.OCL.NumericExp self) { }
	public VisitedReferences preBagExp(atl.metamodel.OCL.BagExp self) { return new VisitedReferences("type" , "elements"); } 
	public void inBagExp(atl.metamodel.OCL.BagExp self) { if ( _debug ) System.out.println("Visiting BagExp"); }
	public void beforeBagExp(atl.metamodel.OCL.BagExp self) { }
	public VisitedReferences preIteratorExp(atl.metamodel.OCL.IteratorExp self) { return new VisitedReferences("type" , "source" , "body" , "iterators"); } 
	public void inIteratorExp(atl.metamodel.OCL.IteratorExp self) { if ( _debug ) System.out.println("Visiting IteratorExp"); }
	public void beforeIteratorExp(atl.metamodel.OCL.IteratorExp self) { }
	public VisitedReferences preOutPatternElement(atl.metamodel.ATL.OutPatternElement self) { return new VisitedReferences("type" , "initExpression" , "bindings"); } 
	public void inOutPatternElement(atl.metamodel.ATL.OutPatternElement self) { if ( _debug ) System.out.println("Visiting OutPatternElement"); }
	public void beforeOutPatternElement(atl.metamodel.ATL.OutPatternElement self) { }
	public VisitedReferences prePropertyCallExp(atl.metamodel.OCL.PropertyCallExp self) { return new VisitedReferences("type" , "source"); } 
	public void inPropertyCallExp(atl.metamodel.OCL.PropertyCallExp self) { if ( _debug ) System.out.println("Visiting PropertyCallExp"); }
	public void beforePropertyCallExp(atl.metamodel.OCL.PropertyCallExp self) { }
	public VisitedReferences preOclContextDefinition(atl.metamodel.OCL.OclContextDefinition self) { return new VisitedReferences("context_"); } 
	public void inOclContextDefinition(atl.metamodel.OCL.OclContextDefinition self) { if ( _debug ) System.out.println("Visiting OclContextDefinition"); }
	public void beforeOclContextDefinition(atl.metamodel.OCL.OclContextDefinition self) { }
	public VisitedReferences preModuleElement(atl.metamodel.ATL.ModuleElement self) { return new VisitedReferences(); } 
	public void inModuleElement(atl.metamodel.ATL.ModuleElement self) { if ( _debug ) System.out.println("Visiting ModuleElement"); }
	public void beforeModuleElement(atl.metamodel.ATL.ModuleElement self) { }
	public VisitedReferences preSetExp(atl.metamodel.OCL.SetExp self) { return new VisitedReferences("type" , "elements"); } 
	public void inSetExp(atl.metamodel.OCL.SetExp self) { if ( _debug ) System.out.println("Visiting SetExp"); }
	public void beforeSetExp(atl.metamodel.OCL.SetExp self) { }
	public VisitedReferences prePatternElement(atl.metamodel.ATL.PatternElement self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inPatternElement(atl.metamodel.ATL.PatternElement self) { if ( _debug ) System.out.println("Visiting PatternElement"); }
	public void beforePatternElement(atl.metamodel.ATL.PatternElement self) { }
	public VisitedReferences preOclFeatureDefinition(atl.metamodel.OCL.OclFeatureDefinition self) { return new VisitedReferences("feature" , "context_"); } 
	public void inOclFeatureDefinition(atl.metamodel.OCL.OclFeatureDefinition self) { if ( _debug ) System.out.println("Visiting OclFeatureDefinition"); }
	public void beforeOclFeatureDefinition(atl.metamodel.OCL.OclFeatureDefinition self) { }
	public VisitedReferences preCollectionExp(atl.metamodel.OCL.CollectionExp self) { return new VisitedReferences("type" , "elements"); } 
	public void inCollectionExp(atl.metamodel.OCL.CollectionExp self) { if ( _debug ) System.out.println("Visiting CollectionExp"); }
	public void beforeCollectionExp(atl.metamodel.OCL.CollectionExp self) { }
	public VisitedReferences preAttribute(atl.metamodel.OCL.Attribute self) { return new VisitedReferences("initExpression" , "type"); } 
	public void inAttribute(atl.metamodel.OCL.Attribute self) { if ( _debug ) System.out.println("Visiting Attribute"); }
	public void beforeAttribute(atl.metamodel.OCL.Attribute self) { }
	public VisitedReferences preMapType(atl.metamodel.OCL.MapType self) { return new VisitedReferences("type" , "valueType" , "keyType"); } 
	public void inMapType(atl.metamodel.OCL.MapType self) { if ( _debug ) System.out.println("Visiting MapType"); }
	public void beforeMapType(atl.metamodel.OCL.MapType self) { }
	public VisitedReferences preOperationCallExp(atl.metamodel.OCL.OperationCallExp self) { return new VisitedReferences("type" , "source" , "arguments"); } 
	public void inOperationCallExp(atl.metamodel.OCL.OperationCallExp self) { if ( _debug ) System.out.println("Visiting OperationCallExp"); }
	public void beforeOperationCallExp(atl.metamodel.OCL.OperationCallExp self) { }
	public VisitedReferences preExpressionStat(atl.metamodel.ATL.ExpressionStat self) { return new VisitedReferences("expression"); } 
	public void inExpressionStat(atl.metamodel.ATL.ExpressionStat self) { if ( _debug ) System.out.println("Visiting ExpressionStat"); }
	public void beforeExpressionStat(atl.metamodel.ATL.ExpressionStat self) { }
	public VisitedReferences preModule(atl.metamodel.ATL.Module self) { return new VisitedReferences("libraries" , "inModels" , "outModels" , "elements"); } 
	public void inModule(atl.metamodel.ATL.Module self) { if ( _debug ) System.out.println("Visiting Module"); }
	public void beforeModule(atl.metamodel.ATL.Module self) { }
	public VisitedReferences preRule(atl.metamodel.ATL.Rule self) { return new VisitedReferences("outPattern" , "actionBlock" , "variables"); } 
	public void inRule(atl.metamodel.ATL.Rule self) { if ( _debug ) System.out.println("Visiting Rule"); }
	public void beforeRule(atl.metamodel.ATL.Rule self) { }
	public VisitedReferences preEnumLiteralExp(atl.metamodel.OCL.EnumLiteralExp self) { return new VisitedReferences("type"); } 
	public void inEnumLiteralExp(atl.metamodel.OCL.EnumLiteralExp self) { if ( _debug ) System.out.println("Visiting EnumLiteralExp"); }
	public void beforeEnumLiteralExp(atl.metamodel.OCL.EnumLiteralExp self) { }
	public VisitedReferences preIterator(atl.metamodel.OCL.Iterator self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inIterator(atl.metamodel.OCL.Iterator self) { if ( _debug ) System.out.println("Visiting Iterator"); }
	public void beforeIterator(atl.metamodel.OCL.Iterator self) { }
	public VisitedReferences preIntegerType(atl.metamodel.OCL.IntegerType self) { return new VisitedReferences("type"); } 
	public void inIntegerType(atl.metamodel.OCL.IntegerType self) { if ( _debug ) System.out.println("Visiting IntegerType"); }
	public void beforeIntegerType(atl.metamodel.OCL.IntegerType self) { }
	public VisitedReferences preCollectionOperationCallExp(atl.metamodel.OCL.CollectionOperationCallExp self) { return new VisitedReferences("type" , "source" , "arguments"); } 
	public void inCollectionOperationCallExp(atl.metamodel.OCL.CollectionOperationCallExp self) { if ( _debug ) System.out.println("Visiting CollectionOperationCallExp"); }
	public void beforeCollectionOperationCallExp(atl.metamodel.OCL.CollectionOperationCallExp self) { }
	public VisitedReferences preBagType(atl.metamodel.OCL.BagType self) { return new VisitedReferences("type" , "elementType"); } 
	public void inBagType(atl.metamodel.OCL.BagType self) { if ( _debug ) System.out.println("Visiting BagType"); }
	public void beforeBagType(atl.metamodel.OCL.BagType self) { }
	public VisitedReferences preSimpleOutPatternElement(atl.metamodel.ATL.SimpleOutPatternElement self) { return new VisitedReferences("type" , "initExpression" , "bindings" , "reverseBindings"); } 
	public void inSimpleOutPatternElement(atl.metamodel.ATL.SimpleOutPatternElement self) { if ( _debug ) System.out.println("Visiting SimpleOutPatternElement"); }
	public void beforeSimpleOutPatternElement(atl.metamodel.ATL.SimpleOutPatternElement self) { }
	public VisitedReferences preNavigationOrAttributeCallExp(atl.metamodel.OCL.NavigationOrAttributeCallExp self) { return new VisitedReferences("type" , "source"); } 
	public void inNavigationOrAttributeCallExp(atl.metamodel.OCL.NavigationOrAttributeCallExp self) { if ( _debug ) System.out.println("Visiting NavigationOrAttributeCallExp"); }
	public void beforeNavigationOrAttributeCallExp(atl.metamodel.OCL.NavigationOrAttributeCallExp self) { }
	public VisitedReferences preRuleVariableDeclaration(atl.metamodel.ATL.RuleVariableDeclaration self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inRuleVariableDeclaration(atl.metamodel.ATL.RuleVariableDeclaration self) { if ( _debug ) System.out.println("Visiting RuleVariableDeclaration"); }
	public void beforeRuleVariableDeclaration(atl.metamodel.ATL.RuleVariableDeclaration self) { }
	public VisitedReferences preSequenceExp(atl.metamodel.OCL.SequenceExp self) { return new VisitedReferences("type" , "elements"); } 
	public void inSequenceExp(atl.metamodel.OCL.SequenceExp self) { if ( _debug ) System.out.println("Visiting SequenceExp"); }
	public void beforeSequenceExp(atl.metamodel.OCL.SequenceExp self) { }
	public VisitedReferences preTuplePart(atl.metamodel.OCL.TuplePart self) { return new VisitedReferences("type" , "initExpression"); } 
	public void inTuplePart(atl.metamodel.OCL.TuplePart self) { if ( _debug ) System.out.println("Visiting TuplePart"); }
	public void beforeTuplePart(atl.metamodel.OCL.TuplePart self) { }
	public VisitedReferences preTupleType(atl.metamodel.OCL.TupleType self) { return new VisitedReferences("type" , "attributes"); } 
	public void inTupleType(atl.metamodel.OCL.TupleType self) { if ( _debug ) System.out.println("Visiting TupleType"); }
	public void beforeTupleType(atl.metamodel.OCL.TupleType self) { }
	public VisitedReferences preLocatedElement(atl.metamodel.ATL.LocatedElement self) { return new VisitedReferences(); } 
	public void inLocatedElement(atl.metamodel.ATL.LocatedElement self) { if ( _debug ) System.out.println("Visiting LocatedElement"); }
	public void beforeLocatedElement(atl.metamodel.ATL.LocatedElement self) { }
	public VisitedReferences preVariableExp(atl.metamodel.OCL.VariableExp self) { return new VisitedReferences("type"); } 
	public void inVariableExp(atl.metamodel.OCL.VariableExp self) { if ( _debug ) System.out.println("Visiting VariableExp"); }
	public void beforeVariableExp(atl.metamodel.OCL.VariableExp self) { }
	
	protected VisitedReferences refs(String... names) {
		return new VisitedReferences(names);
	}

	public void startVisiting(atl.metamodel.ATLModelVisitable init) {
		init.visit(this);
	}	
	
	public ATLModelBaseObject getCurrent() { return current; }
	public void setCurrent(ATLModelBaseObject o) { current = o; }

	public static class VisitedReferences {
		private String[] names;
		public VisitedReferences(String... names) {
			this.names = names;
		}
		
		public EReference[] getReferences(ATLModelBaseObject obj) {
			EReference[] result = new EReference[names.length];
			EClass  eclass      = obj.original_().eClass();
			for(int i = 0; i < names.length; i++) {
				result[i] = (EReference) eclass.getEStructuralFeature(names[i]);
			}
			return result;
		}
	}
}
