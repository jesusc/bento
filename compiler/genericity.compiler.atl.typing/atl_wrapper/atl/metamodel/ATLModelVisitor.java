
package atl.metamodel;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

public abstract class ATLModelVisitor {
	protected boolean _debug = false;
	// protected boolean _passAll = 
	protected ATLModelBaseObject current;

	public VisitingActions preOclExpression(atl.metamodel.OCL.OclExpression self) { return new VisitingActions("type"); } 
	public void inOclExpression(atl.metamodel.OCL.OclExpression self) { if ( _debug ) System.out.println("Visiting OclExpression"); }
	public void beforeOclExpression(atl.metamodel.OCL.OclExpression self) { }
	public VisitingActions prePropertyCallExp(atl.metamodel.OCL.PropertyCallExp self) { return new VisitingActions("type" , "source"); } 
	public void inPropertyCallExp(atl.metamodel.OCL.PropertyCallExp self) { if ( _debug ) System.out.println("Visiting PropertyCallExp"); }
	public void beforePropertyCallExp(atl.metamodel.OCL.PropertyCallExp self) { }
	public VisitingActions preExpressionStat(atl.metamodel.ATL.ExpressionStat self) { return new VisitingActions("expression"); } 
	public void inExpressionStat(atl.metamodel.ATL.ExpressionStat self) { if ( _debug ) System.out.println("Visiting ExpressionStat"); }
	public void beforeExpressionStat(atl.metamodel.ATL.ExpressionStat self) { }
	public VisitingActions preForStat(atl.metamodel.ATL.ForStat self) { return new VisitingActions("iterator" , "collection" , "statements"); } 
	public void inForStat(atl.metamodel.ATL.ForStat self) { if ( _debug ) System.out.println("Visiting ForStat"); }
	public void beforeForStat(atl.metamodel.ATL.ForStat self) { }
	public VisitingActions preLoopExp(atl.metamodel.OCL.LoopExp self) { return new VisitingActions("type" , "source" , "body" , "iterators"); } 
	public void inLoopExp(atl.metamodel.OCL.LoopExp self) { if ( _debug ) System.out.println("Visiting LoopExp"); }
	public void beforeLoopExp(atl.metamodel.OCL.LoopExp self) { }
	public VisitingActions preOrderedSetType(atl.metamodel.OCL.OrderedSetType self) { return new VisitingActions("type" , "elementType"); } 
	public void inOrderedSetType(atl.metamodel.OCL.OrderedSetType self) { if ( _debug ) System.out.println("Visiting OrderedSetType"); }
	public void beforeOrderedSetType(atl.metamodel.OCL.OrderedSetType self) { }
	public VisitingActions preRealType(atl.metamodel.OCL.RealType self) { return new VisitingActions("type"); } 
	public void inRealType(atl.metamodel.OCL.RealType self) { if ( _debug ) System.out.println("Visiting RealType"); }
	public void beforeRealType(atl.metamodel.OCL.RealType self) { }
	public VisitingActions preIterator(atl.metamodel.OCL.Iterator self) { return new VisitingActions("type" , "initExpression"); } 
	public void inIterator(atl.metamodel.OCL.Iterator self) { if ( _debug ) System.out.println("Visiting Iterator"); }
	public void beforeIterator(atl.metamodel.OCL.Iterator self) { }
	public VisitingActions prePrimitive(atl.metamodel.OCL.Primitive self) { return new VisitingActions("type"); } 
	public void inPrimitive(atl.metamodel.OCL.Primitive self) { if ( _debug ) System.out.println("Visiting Primitive"); }
	public void beforePrimitive(atl.metamodel.OCL.Primitive self) { }
	public VisitingActions preMapType(atl.metamodel.OCL.MapType self) { return new VisitingActions("type" , "valueType" , "keyType"); } 
	public void inMapType(atl.metamodel.OCL.MapType self) { if ( _debug ) System.out.println("Visiting MapType"); }
	public void beforeMapType(atl.metamodel.OCL.MapType self) { }
	public VisitingActions preOclType(atl.metamodel.OCL.OclType self) { return new VisitingActions("type"); } 
	public void inOclType(atl.metamodel.OCL.OclType self) { if ( _debug ) System.out.println("Visiting OclType"); }
	public void beforeOclType(atl.metamodel.OCL.OclType self) { }
	public VisitingActions preInPattern(atl.metamodel.ATL.InPattern self) { return new VisitingActions("elements" , "filter"); } 
	public void inInPattern(atl.metamodel.ATL.InPattern self) { if ( _debug ) System.out.println("Visiting InPattern"); }
	public void beforeInPattern(atl.metamodel.ATL.InPattern self) { }
	public VisitingActions preIteratorExp(atl.metamodel.OCL.IteratorExp self) { return new VisitingActions("type" , "source" , "body" , "iterators"); } 
	public void inIteratorExp(atl.metamodel.OCL.IteratorExp self) { if ( _debug ) System.out.println("Visiting IteratorExp"); }
	public void beforeIteratorExp(atl.metamodel.OCL.IteratorExp self) { }
	public VisitingActions preSimpleInPatternElement(atl.metamodel.ATL.SimpleInPatternElement self) { return new VisitingActions("type" , "initExpression"); } 
	public void inSimpleInPatternElement(atl.metamodel.ATL.SimpleInPatternElement self) { if ( _debug ) System.out.println("Visiting SimpleInPatternElement"); }
	public void beforeSimpleInPatternElement(atl.metamodel.ATL.SimpleInPatternElement self) { }
	public VisitingActions preOperatorCallExp(atl.metamodel.OCL.OperatorCallExp self) { return new VisitingActions("type" , "source" , "arguments"); } 
	public void inOperatorCallExp(atl.metamodel.OCL.OperatorCallExp self) { if ( _debug ) System.out.println("Visiting OperatorCallExp"); }
	public void beforeOperatorCallExp(atl.metamodel.OCL.OperatorCallExp self) { }
	public VisitingActions preVariableExp(atl.metamodel.OCL.VariableExp self) { return new VisitingActions("type"); } 
	public void inVariableExp(atl.metamodel.OCL.VariableExp self) { if ( _debug ) System.out.println("Visiting VariableExp"); }
	public void beforeVariableExp(atl.metamodel.OCL.VariableExp self) { }
	public VisitingActions preOrderedSetExp(atl.metamodel.OCL.OrderedSetExp self) { return new VisitingActions("type" , "elements"); } 
	public void inOrderedSetExp(atl.metamodel.OCL.OrderedSetExp self) { if ( _debug ) System.out.println("Visiting OrderedSetExp"); }
	public void beforeOrderedSetExp(atl.metamodel.OCL.OrderedSetExp self) { }
	public VisitingActions preOclContextDefinition(atl.metamodel.OCL.OclContextDefinition self) { return new VisitingActions("context_"); } 
	public void inOclContextDefinition(atl.metamodel.OCL.OclContextDefinition self) { if ( _debug ) System.out.println("Visiting OclContextDefinition"); }
	public void beforeOclContextDefinition(atl.metamodel.OCL.OclContextDefinition self) { }
	public VisitingActions preVariableDeclaration(atl.metamodel.OCL.VariableDeclaration self) { return new VisitingActions("type" , "initExpression"); } 
	public void inVariableDeclaration(atl.metamodel.OCL.VariableDeclaration self) { if ( _debug ) System.out.println("Visiting VariableDeclaration"); }
	public void beforeVariableDeclaration(atl.metamodel.OCL.VariableDeclaration self) { }
	public VisitingActions preOclFeature(atl.metamodel.OCL.OclFeature self) { return new VisitingActions(); } 
	public void inOclFeature(atl.metamodel.OCL.OclFeature self) { if ( _debug ) System.out.println("Visiting OclFeature"); }
	public void beforeOclFeature(atl.metamodel.OCL.OclFeature self) { }
	public VisitingActions preRuleVariableDeclaration(atl.metamodel.ATL.RuleVariableDeclaration self) { return new VisitingActions("type" , "initExpression"); } 
	public void inRuleVariableDeclaration(atl.metamodel.ATL.RuleVariableDeclaration self) { if ( _debug ) System.out.println("Visiting RuleVariableDeclaration"); }
	public void beforeRuleVariableDeclaration(atl.metamodel.ATL.RuleVariableDeclaration self) { }
	public VisitingActions preMapExp(atl.metamodel.OCL.MapExp self) { return new VisitingActions("type" , "elements"); } 
	public void inMapExp(atl.metamodel.OCL.MapExp self) { if ( _debug ) System.out.println("Visiting MapExp"); }
	public void beforeMapExp(atl.metamodel.OCL.MapExp self) { }
	public VisitingActions preBindingStat(atl.metamodel.ATL.BindingStat self) { return new VisitingActions("source" , "value"); } 
	public void inBindingStat(atl.metamodel.ATL.BindingStat self) { if ( _debug ) System.out.println("Visiting BindingStat"); }
	public void beforeBindingStat(atl.metamodel.ATL.BindingStat self) { }
	public VisitingActions preSuperExp(atl.metamodel.OCL.SuperExp self) { return new VisitingActions("type"); } 
	public void inSuperExp(atl.metamodel.OCL.SuperExp self) { if ( _debug ) System.out.println("Visiting SuperExp"); }
	public void beforeSuperExp(atl.metamodel.OCL.SuperExp self) { }
	public VisitingActions preForEachOutPatternElement(atl.metamodel.ATL.ForEachOutPatternElement self) { return new VisitingActions("type" , "initExpression" , "bindings" , "collection" , "iterator"); } 
	public void inForEachOutPatternElement(atl.metamodel.ATL.ForEachOutPatternElement self) { if ( _debug ) System.out.println("Visiting ForEachOutPatternElement"); }
	public void beforeForEachOutPatternElement(atl.metamodel.ATL.ForEachOutPatternElement self) { }
	public VisitingActions preIntegerExp(atl.metamodel.OCL.IntegerExp self) { return new VisitingActions("type"); } 
	public void inIntegerExp(atl.metamodel.OCL.IntegerExp self) { if ( _debug ) System.out.println("Visiting IntegerExp"); }
	public void beforeIntegerExp(atl.metamodel.OCL.IntegerExp self) { }
	public VisitingActions preOclModel(atl.metamodel.OCL.OclModel self) { return new VisitingActions(); } 
	public void inOclModel(atl.metamodel.OCL.OclModel self) { if ( _debug ) System.out.println("Visiting OclModel"); }
	public void beforeOclModel(atl.metamodel.OCL.OclModel self) { }
	public VisitingActions preLocatedElement(atl.metamodel.ATL.LocatedElement self) { return new VisitingActions(); } 
	public void inLocatedElement(atl.metamodel.ATL.LocatedElement self) { if ( _debug ) System.out.println("Visiting LocatedElement"); }
	public void beforeLocatedElement(atl.metamodel.ATL.LocatedElement self) { }
	public VisitingActions preOperation(atl.metamodel.OCL.Operation self) { return new VisitingActions("parameters" , "returnType" , "body"); } 
	public void inOperation(atl.metamodel.OCL.Operation self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeOperation(atl.metamodel.OCL.Operation self) { }
	public VisitingActions preBagType(atl.metamodel.OCL.BagType self) { return new VisitingActions("type" , "elementType"); } 
	public void inBagType(atl.metamodel.OCL.BagType self) { if ( _debug ) System.out.println("Visiting BagType"); }
	public void beforeBagType(atl.metamodel.OCL.BagType self) { }
	public VisitingActions preIntegerType(atl.metamodel.OCL.IntegerType self) { return new VisitingActions("type"); } 
	public void inIntegerType(atl.metamodel.OCL.IntegerType self) { if ( _debug ) System.out.println("Visiting IntegerType"); }
	public void beforeIntegerType(atl.metamodel.OCL.IntegerType self) { }
	public VisitingActions preBooleanExp(atl.metamodel.OCL.BooleanExp self) { return new VisitingActions("type"); } 
	public void inBooleanExp(atl.metamodel.OCL.BooleanExp self) { if ( _debug ) System.out.println("Visiting BooleanExp"); }
	public void beforeBooleanExp(atl.metamodel.OCL.BooleanExp self) { }
	public VisitingActions preOclAnyType(atl.metamodel.OCL.OclAnyType self) { return new VisitingActions("type"); } 
	public void inOclAnyType(atl.metamodel.OCL.OclAnyType self) { if ( _debug ) System.out.println("Visiting OclAnyType"); }
	public void beforeOclAnyType(atl.metamodel.OCL.OclAnyType self) { }
	public VisitingActions preIfExp(atl.metamodel.OCL.IfExp self) { return new VisitingActions("type" , "thenExpression" , "condition" , "elseExpression"); } 
	public void inIfExp(atl.metamodel.OCL.IfExp self) { if ( _debug ) System.out.println("Visiting IfExp"); }
	public void beforeIfExp(atl.metamodel.OCL.IfExp self) { }
	public VisitingActions preCollectionType(atl.metamodel.OCL.CollectionType self) { return new VisitingActions("type" , "elementType"); } 
	public void inCollectionType(atl.metamodel.OCL.CollectionType self) { if ( _debug ) System.out.println("Visiting CollectionType"); }
	public void beforeCollectionType(atl.metamodel.OCL.CollectionType self) { }
	public VisitingActions preStringExp(atl.metamodel.OCL.StringExp self) { return new VisitingActions("type"); } 
	public void inStringExp(atl.metamodel.OCL.StringExp self) { if ( _debug ) System.out.println("Visiting StringExp"); }
	public void beforeStringExp(atl.metamodel.OCL.StringExp self) { }
	public VisitingActions preTupleExp(atl.metamodel.OCL.TupleExp self) { return new VisitingActions("type" , "tuplePart"); } 
	public void inTupleExp(atl.metamodel.OCL.TupleExp self) { if ( _debug ) System.out.println("Visiting TupleExp"); }
	public void beforeTupleExp(atl.metamodel.OCL.TupleExp self) { }
	public VisitingActions preBinding(atl.metamodel.ATL.Binding self) { return new VisitingActions("value"); } 
	public void inBinding(atl.metamodel.ATL.Binding self) { if ( _debug ) System.out.println("Visiting Binding"); }
	public void beforeBinding(atl.metamodel.ATL.Binding self) { }
	public VisitingActions preOperationCallExp(atl.metamodel.OCL.OperationCallExp self) { return new VisitingActions("type" , "source" , "arguments"); } 
	public void inOperationCallExp(atl.metamodel.OCL.OperationCallExp self) { if ( _debug ) System.out.println("Visiting OperationCallExp"); }
	public void beforeOperationCallExp(atl.metamodel.OCL.OperationCallExp self) { }
	public VisitingActions preStatement(atl.metamodel.ATL.Statement self) { return new VisitingActions(); } 
	public void inStatement(atl.metamodel.ATL.Statement self) { if ( _debug ) System.out.println("Visiting Statement"); }
	public void beforeStatement(atl.metamodel.ATL.Statement self) { }
	public VisitingActions preLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { return new VisitingActions("outPattern" , "actionBlock" , "variables" , "inPattern"); } 
	public void inLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { if ( _debug ) System.out.println("Visiting LazyMatchedRule"); }
	public void beforeLazyMatchedRule(atl.metamodel.ATL.LazyMatchedRule self) { }
	public VisitingActions preRule(atl.metamodel.ATL.Rule self) { return new VisitingActions("outPattern" , "actionBlock" , "variables"); } 
	public void inRule(atl.metamodel.ATL.Rule self) { if ( _debug ) System.out.println("Visiting Rule"); }
	public void beforeRule(atl.metamodel.ATL.Rule self) { }
	public VisitingActions preBooleanType(atl.metamodel.OCL.BooleanType self) { return new VisitingActions("type"); } 
	public void inBooleanType(atl.metamodel.OCL.BooleanType self) { if ( _debug ) System.out.println("Visiting BooleanType"); }
	public void beforeBooleanType(atl.metamodel.OCL.BooleanType self) { }
	public VisitingActions preMatchedRule(atl.metamodel.ATL.MatchedRule self) { return new VisitingActions("outPattern" , "actionBlock" , "variables" , "inPattern"); } 
	public void inMatchedRule(atl.metamodel.ATL.MatchedRule self) { if ( _debug ) System.out.println("Visiting MatchedRule"); }
	public void beforeMatchedRule(atl.metamodel.ATL.MatchedRule self) { }
	public VisitingActions preIterateExp(atl.metamodel.OCL.IterateExp self) { return new VisitingActions("type" , "source" , "body" , "iterators" , "result"); } 
	public void inIterateExp(atl.metamodel.OCL.IterateExp self) { if ( _debug ) System.out.println("Visiting IterateExp"); }
	public void beforeIterateExp(atl.metamodel.OCL.IterateExp self) { }
	public VisitingActions preAttribute(atl.metamodel.OCL.Attribute self) { return new VisitingActions("initExpression" , "type"); } 
	public void inAttribute(atl.metamodel.OCL.Attribute self) { if ( _debug ) System.out.println("Visiting Attribute"); }
	public void beforeAttribute(atl.metamodel.OCL.Attribute self) { }
	public VisitingActions preActionBlock(atl.metamodel.ATL.ActionBlock self) { return new VisitingActions("statements"); } 
	public void inActionBlock(atl.metamodel.ATL.ActionBlock self) { if ( _debug ) System.out.println("Visiting ActionBlock"); }
	public void beforeActionBlock(atl.metamodel.ATL.ActionBlock self) { }
	public VisitingActions preSetExp(atl.metamodel.OCL.SetExp self) { return new VisitingActions("type" , "elements"); } 
	public void inSetExp(atl.metamodel.OCL.SetExp self) { if ( _debug ) System.out.println("Visiting SetExp"); }
	public void beforeSetExp(atl.metamodel.OCL.SetExp self) { }
	public VisitingActions preSetType(atl.metamodel.OCL.SetType self) { return new VisitingActions("type" , "elementType"); } 
	public void inSetType(atl.metamodel.OCL.SetType self) { if ( _debug ) System.out.println("Visiting SetType"); }
	public void beforeSetType(atl.metamodel.OCL.SetType self) { }
	public VisitingActions preOutPatternElement(atl.metamodel.ATL.OutPatternElement self) { return new VisitingActions("type" , "initExpression" , "bindings"); } 
	public void inOutPatternElement(atl.metamodel.ATL.OutPatternElement self) { if ( _debug ) System.out.println("Visiting OutPatternElement"); }
	public void beforeOutPatternElement(atl.metamodel.ATL.OutPatternElement self) { }
	public VisitingActions preQuery(atl.metamodel.ATL.Query self) { return new VisitingActions("libraries" , "body" , "helpers"); } 
	public void inQuery(atl.metamodel.ATL.Query self) { if ( _debug ) System.out.println("Visiting Query"); }
	public void beforeQuery(atl.metamodel.ATL.Query self) { }
	public VisitingActions preParameter(atl.metamodel.OCL.Parameter self) { return new VisitingActions("type" , "initExpression"); } 
	public void inParameter(atl.metamodel.OCL.Parameter self) { if ( _debug ) System.out.println("Visiting Parameter"); }
	public void beforeParameter(atl.metamodel.OCL.Parameter self) { }
	public VisitingActions preModuleElement(atl.metamodel.ATL.ModuleElement self) { return new VisitingActions(); } 
	public void inModuleElement(atl.metamodel.ATL.ModuleElement self) { if ( _debug ) System.out.println("Visiting ModuleElement"); }
	public void beforeModuleElement(atl.metamodel.ATL.ModuleElement self) { }
	public VisitingActions preOutPattern(atl.metamodel.ATL.OutPattern self) { return new VisitingActions("elements"); } 
	public void inOutPattern(atl.metamodel.ATL.OutPattern self) { if ( _debug ) System.out.println("Visiting OutPattern"); }
	public void beforeOutPattern(atl.metamodel.ATL.OutPattern self) { }
	public VisitingActions preHelper(atl.metamodel.ATL.Helper self) { return new VisitingActions("definition"); } 
	public void inHelper(atl.metamodel.ATL.Helper self) { if ( _debug ) System.out.println("Visiting Helper"); }
	public void beforeHelper(atl.metamodel.ATL.Helper self) { }
	public VisitingActions prePrimitiveExp(atl.metamodel.OCL.PrimitiveExp self) { return new VisitingActions("type"); } 
	public void inPrimitiveExp(atl.metamodel.OCL.PrimitiveExp self) { if ( _debug ) System.out.println("Visiting PrimitiveExp"); }
	public void beforePrimitiveExp(atl.metamodel.OCL.PrimitiveExp self) { }
	public VisitingActions preRealExp(atl.metamodel.OCL.RealExp self) { return new VisitingActions("type"); } 
	public void inRealExp(atl.metamodel.OCL.RealExp self) { if ( _debug ) System.out.println("Visiting RealExp"); }
	public void beforeRealExp(atl.metamodel.OCL.RealExp self) { }
	public VisitingActions preCollectionOperationCallExp(atl.metamodel.OCL.CollectionOperationCallExp self) { return new VisitingActions("type" , "source" , "arguments"); } 
	public void inCollectionOperationCallExp(atl.metamodel.OCL.CollectionOperationCallExp self) { if ( _debug ) System.out.println("Visiting CollectionOperationCallExp"); }
	public void beforeCollectionOperationCallExp(atl.metamodel.OCL.CollectionOperationCallExp self) { }
	public VisitingActions prePatternElement(atl.metamodel.ATL.PatternElement self) { return new VisitingActions("type" , "initExpression"); } 
	public void inPatternElement(atl.metamodel.ATL.PatternElement self) { if ( _debug ) System.out.println("Visiting PatternElement"); }
	public void beforePatternElement(atl.metamodel.ATL.PatternElement self) { }
	public VisitingActions preMapElement(atl.metamodel.OCL.MapElement self) { return new VisitingActions("key" , "value"); } 
	public void inMapElement(atl.metamodel.OCL.MapElement self) { if ( _debug ) System.out.println("Visiting MapElement"); }
	public void beforeMapElement(atl.metamodel.OCL.MapElement self) { }
	public VisitingActions preOclModelElement(atl.metamodel.OCL.OclModelElement self) { return new VisitingActions("type"); } 
	public void inOclModelElement(atl.metamodel.OCL.OclModelElement self) { if ( _debug ) System.out.println("Visiting OclModelElement"); }
	public void beforeOclModelElement(atl.metamodel.OCL.OclModelElement self) { }
	public VisitingActions preLibrary(atl.metamodel.ATL.Library self) { return new VisitingActions("libraries" , "helpers"); } 
	public void inLibrary(atl.metamodel.ATL.Library self) { if ( _debug ) System.out.println("Visiting Library"); }
	public void beforeLibrary(atl.metamodel.ATL.Library self) { }
	public VisitingActions preBagExp(atl.metamodel.OCL.BagExp self) { return new VisitingActions("type" , "elements"); } 
	public void inBagExp(atl.metamodel.OCL.BagExp self) { if ( _debug ) System.out.println("Visiting BagExp"); }
	public void beforeBagExp(atl.metamodel.OCL.BagExp self) { }
	public VisitingActions preCalledRule(atl.metamodel.ATL.CalledRule self) { return new VisitingActions("outPattern" , "actionBlock" , "variables" , "parameters"); } 
	public void inCalledRule(atl.metamodel.ATL.CalledRule self) { if ( _debug ) System.out.println("Visiting CalledRule"); }
	public void beforeCalledRule(atl.metamodel.ATL.CalledRule self) { }
	public VisitingActions preTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute self) { return new VisitingActions("type"); } 
	public void inTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute self) { if ( _debug ) System.out.println("Visiting TupleTypeAttribute"); }
	public void beforeTupleTypeAttribute(atl.metamodel.OCL.TupleTypeAttribute self) { }
	public VisitingActions preNumericExp(atl.metamodel.OCL.NumericExp self) { return new VisitingActions("type"); } 
	public void inNumericExp(atl.metamodel.OCL.NumericExp self) { if ( _debug ) System.out.println("Visiting NumericExp"); }
	public void beforeNumericExp(atl.metamodel.OCL.NumericExp self) { }
	public VisitingActions preOclFeatureDefinition(atl.metamodel.OCL.OclFeatureDefinition self) { return new VisitingActions("feature" , "context_"); } 
	public void inOclFeatureDefinition(atl.metamodel.OCL.OclFeatureDefinition self) { if ( _debug ) System.out.println("Visiting OclFeatureDefinition"); }
	public void beforeOclFeatureDefinition(atl.metamodel.OCL.OclFeatureDefinition self) { }
	public VisitingActions preTupleType(atl.metamodel.OCL.TupleType self) { return new VisitingActions("type" , "attributes"); } 
	public void inTupleType(atl.metamodel.OCL.TupleType self) { if ( _debug ) System.out.println("Visiting TupleType"); }
	public void beforeTupleType(atl.metamodel.OCL.TupleType self) { }
	public VisitingActions preLibraryRef(atl.metamodel.ATL.LibraryRef self) { return new VisitingActions(); } 
	public void inLibraryRef(atl.metamodel.ATL.LibraryRef self) { if ( _debug ) System.out.println("Visiting LibraryRef"); }
	public void beforeLibraryRef(atl.metamodel.ATL.LibraryRef self) { }
	public VisitingActions preUnit(atl.metamodel.ATL.Unit self) { return new VisitingActions("libraries"); } 
	public void inUnit(atl.metamodel.ATL.Unit self) { if ( _debug ) System.out.println("Visiting Unit"); }
	public void beforeUnit(atl.metamodel.ATL.Unit self) { }
	public VisitingActions preOclUndefinedExp(atl.metamodel.OCL.OclUndefinedExp self) { return new VisitingActions("type"); } 
	public void inOclUndefinedExp(atl.metamodel.OCL.OclUndefinedExp self) { if ( _debug ) System.out.println("Visiting OclUndefinedExp"); }
	public void beforeOclUndefinedExp(atl.metamodel.OCL.OclUndefinedExp self) { }
	public VisitingActions preModule(atl.metamodel.ATL.Module self) { return new VisitingActions("libraries" , "inModels" , "outModels" , "elements"); } 
	public void inModule(atl.metamodel.ATL.Module self) { if ( _debug ) System.out.println("Visiting Module"); }
	public void beforeModule(atl.metamodel.ATL.Module self) { }
	public VisitingActions preTuplePart(atl.metamodel.OCL.TuplePart self) { return new VisitingActions("type" , "initExpression"); } 
	public void inTuplePart(atl.metamodel.OCL.TuplePart self) { if ( _debug ) System.out.println("Visiting TuplePart"); }
	public void beforeTuplePart(atl.metamodel.OCL.TuplePart self) { }
	public VisitingActions preLetExp(atl.metamodel.OCL.LetExp self) { return new VisitingActions("type" , "variable" , "in_"); } 
	public void inLetExp(atl.metamodel.OCL.LetExp self) { if ( _debug ) System.out.println("Visiting LetExp"); }
	public void beforeLetExp(atl.metamodel.OCL.LetExp self) { }
	public VisitingActions preStringType(atl.metamodel.OCL.StringType self) { return new VisitingActions("type"); } 
	public void inStringType(atl.metamodel.OCL.StringType self) { if ( _debug ) System.out.println("Visiting StringType"); }
	public void beforeStringType(atl.metamodel.OCL.StringType self) { }
	public VisitingActions preNavigationOrAttributeCallExp(atl.metamodel.OCL.NavigationOrAttributeCallExp self) { return new VisitingActions("type" , "source"); } 
	public void inNavigationOrAttributeCallExp(atl.metamodel.OCL.NavigationOrAttributeCallExp self) { if ( _debug ) System.out.println("Visiting NavigationOrAttributeCallExp"); }
	public void beforeNavigationOrAttributeCallExp(atl.metamodel.OCL.NavigationOrAttributeCallExp self) { }
	public VisitingActions preNumericType(atl.metamodel.OCL.NumericType self) { return new VisitingActions("type"); } 
	public void inNumericType(atl.metamodel.OCL.NumericType self) { if ( _debug ) System.out.println("Visiting NumericType"); }
	public void beforeNumericType(atl.metamodel.OCL.NumericType self) { }
	public VisitingActions preInPatternElement(atl.metamodel.ATL.InPatternElement self) { return new VisitingActions("type" , "initExpression"); } 
	public void inInPatternElement(atl.metamodel.ATL.InPatternElement self) { if ( _debug ) System.out.println("Visiting InPatternElement"); }
	public void beforeInPatternElement(atl.metamodel.ATL.InPatternElement self) { }
	public VisitingActions preSimpleOutPatternElement(atl.metamodel.ATL.SimpleOutPatternElement self) { return new VisitingActions("type" , "initExpression" , "bindings" , "reverseBindings"); } 
	public void inSimpleOutPatternElement(atl.metamodel.ATL.SimpleOutPatternElement self) { if ( _debug ) System.out.println("Visiting SimpleOutPatternElement"); }
	public void beforeSimpleOutPatternElement(atl.metamodel.ATL.SimpleOutPatternElement self) { }
	public VisitingActions preCollectionExp(atl.metamodel.OCL.CollectionExp self) { return new VisitingActions("type" , "elements"); } 
	public void inCollectionExp(atl.metamodel.OCL.CollectionExp self) { if ( _debug ) System.out.println("Visiting CollectionExp"); }
	public void beforeCollectionExp(atl.metamodel.OCL.CollectionExp self) { }
	public VisitingActions preEnumLiteralExp(atl.metamodel.OCL.EnumLiteralExp self) { return new VisitingActions("type"); } 
	public void inEnumLiteralExp(atl.metamodel.OCL.EnumLiteralExp self) { if ( _debug ) System.out.println("Visiting EnumLiteralExp"); }
	public void beforeEnumLiteralExp(atl.metamodel.OCL.EnumLiteralExp self) { }
	public VisitingActions preSequenceExp(atl.metamodel.OCL.SequenceExp self) { return new VisitingActions("type" , "elements"); } 
	public void inSequenceExp(atl.metamodel.OCL.SequenceExp self) { if ( _debug ) System.out.println("Visiting SequenceExp"); }
	public void beforeSequenceExp(atl.metamodel.OCL.SequenceExp self) { }
	public VisitingActions preSequenceType(atl.metamodel.OCL.SequenceType self) { return new VisitingActions("type" , "elementType"); } 
	public void inSequenceType(atl.metamodel.OCL.SequenceType self) { if ( _debug ) System.out.println("Visiting SequenceType"); }
	public void beforeSequenceType(atl.metamodel.OCL.SequenceType self) { }
	public VisitingActions preIfStat(atl.metamodel.ATL.IfStat self) { return new VisitingActions("condition" , "thenStatements" , "elseStatements"); } 
	public void inIfStat(atl.metamodel.ATL.IfStat self) { if ( _debug ) System.out.println("Visiting IfStat"); }
	public void beforeIfStat(atl.metamodel.ATL.IfStat self) { }
	
	protected VisitingActions actions(Object... things) {
		return new VisitingActions(things);
	}

	public void startVisiting(atl.metamodel.ATLModelVisitable init) {
		init.visit(this);
	}	
	
	public ATLModelBaseObject getCurrent() { return current; }
	public void setCurrent(ATLModelBaseObject o) { current = o; }

	public static class VisitingActions {
		private Object[] actions;
		public VisitingActions(Object... actions) {
			this.actions = actions;
		}
		
		public VisitingAction[] getActions(ATLModelBaseObject obj) {
			VisitingAction[] result = new VisitingAction[actions.length];
			EClass  eclass      = obj.original_().eClass();
			
			for(int i = 0; i < actions.length; i++) {
				if ( actions[i] instanceof String ) {
					String refName = (String) actions[i];
					result[i] = new VisitingAction((EReference) eclass.getEStructuralFeature(refName));
				} else if ( actions[i] instanceof VisitingAction ) {
					result[i] = (VisitingAction) actions[i];
				}
			}
			return result;
		}
	}
	
	public static class VisitingAction {
		public static final int REFERENCE = 0;
		public static final int METHOD_CALL = 1;
		public static final int FILTER_CALL = 2;
		
		private int actionType = -1;

		// For references
		private EReference	reference;
		
		// For method calls
		private Object[]	arguments;
		private java.lang.reflect.Method	method;
		private ATLModelVisitor receptor;
		
		public VisitingAction(ATLModelVisitor receptor, java.lang.reflect.Method method, Object[] arguments) {
			actionType = METHOD_CALL;
			this.receptor = receptor;
			this.method = method;
			this.arguments = arguments;
		}

		public static VisitingAction createFilter(ATLModelVisitor receptor, java.lang.reflect.Method method, Object[] arguments) {
			VisitingAction va = new VisitingAction(receptor, method, arguments);
			va.actionType = FILTER_CALL;
			return va;
		}
		
		public VisitingAction(EReference r) {
			actionType = REFERENCE;
			this.reference = r;
		}

		public int getActionType() {
			return actionType;
		}
		
		public boolean isReference() {
			return getActionType() == REFERENCE;
		}
		
		public EReference getEReference() {
			return this.reference;
		}
		
		public boolean isMethodCall() {
			return getActionType() == METHOD_CALL;
		}
		
		public boolean isFilter() {
			return getActionType() == FILTER_CALL;
		}
		
		public Object performMethodCall() {
			try {
				return method.invoke(receptor, arguments);
			} catch ( Exception e ) {
				throw new RuntimeException(e);
			}	
		}
	}
	
	
	
	public VisitingAction method(String methodName, Object... arguments) {
		// Does not work fine because getMethod does not check for compatible types
		/*
		Class<?>[] argTypes = new Class<?>[arguments.length];
		for(int i = 0; i < arguments.length; i++) {
			argTypes[i] = arguments[i].getClass();
		}
		
		java.lang.reflect.Method method = null;
		try {
			
			method = this.getClass().getMethod(methodName, argTypes);
		} catch (SecurityException e) {
			throw new RuntimeException(e);
		} catch (NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
		*/
		
		for(java.lang.reflect.Method m : this.getClass().getDeclaredMethods()) {
			if ( m.getName().equals(methodName) ) {
				return new VisitingAction(this, m, arguments);
			}
		}
		
		throw new RuntimeException("No method " + methodName + " found in " + this.getClass().getName());
	}

	public VisitingAction filter(String methodName, Object... arguments) {
		for(java.lang.reflect.Method m : this.getClass().getDeclaredMethods()) {
			if ( m.getName().equals(methodName) ) {
				return VisitingAction.createFilter(this, m, arguments);
			}
		}
		
		throw new RuntimeException("No method " + methodName + " found in " + this.getClass().getName());
	}
	

}
