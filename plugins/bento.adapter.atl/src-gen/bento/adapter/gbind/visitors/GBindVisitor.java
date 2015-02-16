package bento.adapter.gbind.visitors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

@SuppressWarnings("unchecked")
public class GBindVisitor {
	protected boolean _debug = false;
	protected EObject current;
	
	public VisitingActions preBindingOptions(gbind.dsl.BindingOptions self) { return new VisitingActions(); } 
	public void inBindingOptions(gbind.dsl.BindingOptions self) { if ( _debug ) System.out.println("Visiting BindingOptions"); }
	public void beforeBindingOptions(gbind.dsl.BindingOptions self) { }
	public void afterBindingOptions(gbind.dsl.BindingOptions self) { }
	public VisitingActions preImport(gbind.simpleocl.Import self) { return new VisitingActions(); } 
	public void inImport(gbind.simpleocl.Import self) { if ( _debug ) System.out.println("Visiting Import"); }
	public void beforeImport(gbind.simpleocl.Import self) { }
	public void afterImport(gbind.simpleocl.Import self) { }
	public VisitingActions preVariableDeclaration(gbind.simpleocl.VariableDeclaration self) { return new VisitingActions("type"); } 
	public void inVariableDeclaration(gbind.simpleocl.VariableDeclaration self) { if ( _debug ) System.out.println("Visiting VariableDeclaration"); }
	public void beforeVariableDeclaration(gbind.simpleocl.VariableDeclaration self) { }
	public void afterVariableDeclaration(gbind.simpleocl.VariableDeclaration self) { }
	public VisitingActions prePrimitive(gbind.simpleocl.Primitive self) { return new VisitingActions(); } 
	public void inPrimitive(gbind.simpleocl.Primitive self) { if ( _debug ) System.out.println("Visiting Primitive"); }
	public void beforePrimitive(gbind.simpleocl.Primitive self) { }
	public void afterPrimitive(gbind.simpleocl.Primitive self) { }
	public VisitingActions preMapType(gbind.simpleocl.MapType self) { return new VisitingActions("valueType" , "keyType"); } 
	public void inMapType(gbind.simpleocl.MapType self) { if ( _debug ) System.out.println("Visiting MapType"); }
	public void beforeMapType(gbind.simpleocl.MapType self) { }
	public void afterMapType(gbind.simpleocl.MapType self) { }
	public VisitingActions preSequenceType(gbind.simpleocl.SequenceType self) { return new VisitingActions("elementType"); } 
	public void inSequenceType(gbind.simpleocl.SequenceType self) { if ( _debug ) System.out.println("Visiting SequenceType"); }
	public void beforeSequenceType(gbind.simpleocl.SequenceType self) { }
	public void afterSequenceType(gbind.simpleocl.SequenceType self) { }
	public VisitingActions preMapElement(gbind.simpleocl.MapElement self) { return new VisitingActions("key" , "value"); } 
	public void inMapElement(gbind.simpleocl.MapElement self) { if ( _debug ) System.out.println("Visiting MapElement"); }
	public void beforeMapElement(gbind.simpleocl.MapElement self) { }
	public void afterMapElement(gbind.simpleocl.MapElement self) { }
	public VisitingActions preOclMetamodel(gbind.simpleocl.OclMetamodel self) { return new VisitingActions(); } 
	public void inOclMetamodel(gbind.simpleocl.OclMetamodel self) { if ( _debug ) System.out.println("Visiting OclMetamodel"); }
	public void beforeOclMetamodel(gbind.simpleocl.OclMetamodel self) { }
	public void afterOclMetamodel(gbind.simpleocl.OclMetamodel self) { }
	public VisitingActions preAddOpCallExp(gbind.simpleocl.AddOpCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inAddOpCallExp(gbind.simpleocl.AddOpCallExp self) { if ( _debug ) System.out.println("Visiting AddOpCallExp"); }
	public void beforeAddOpCallExp(gbind.simpleocl.AddOpCallExp self) { }
	public void afterAddOpCallExp(gbind.simpleocl.AddOpCallExp self) { }
	public VisitingActions preConceptBinding(gbind.dsl.ConceptBinding self) { return new VisitingActions(); } 
	public void inConceptBinding(gbind.dsl.ConceptBinding self) { if ( _debug ) System.out.println("Visiting ConceptBinding"); }
	public void beforeConceptBinding(gbind.dsl.ConceptBinding self) { }
	public void afterConceptBinding(gbind.dsl.ConceptBinding self) { }
	public VisitingActions preEnvType(gbind.simpleocl.EnvType self) { return new VisitingActions(); } 
	public void inEnvType(gbind.simpleocl.EnvType self) { if ( _debug ) System.out.println("Visiting EnvType"); }
	public void beforeEnvType(gbind.simpleocl.EnvType self) { }
	public void afterEnvType(gbind.simpleocl.EnvType self) { }
	public VisitingActions preMetaclass(gbind.dsl.Metaclass self) { return new VisitingActions(); } 
	public void inMetaclass(gbind.dsl.Metaclass self) { if ( _debug ) System.out.println("Visiting Metaclass"); }
	public void beforeMetaclass(gbind.dsl.Metaclass self) { }
	public void afterMetaclass(gbind.dsl.Metaclass self) { }
	public VisitingActions preTupleExp(gbind.simpleocl.TupleExp self) { return new VisitingActions("type" , "tuplePart"); } 
	public void inTupleExp(gbind.simpleocl.TupleExp self) { if ( _debug ) System.out.println("Visiting TupleExp"); }
	public void beforeTupleExp(gbind.simpleocl.TupleExp self) { }
	public void afterTupleExp(gbind.simpleocl.TupleExp self) { }
	public VisitingActions preRelOpCallExp(gbind.simpleocl.RelOpCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inRelOpCallExp(gbind.simpleocl.RelOpCallExp self) { if ( _debug ) System.out.println("Visiting RelOpCallExp"); }
	public void beforeRelOpCallExp(gbind.simpleocl.RelOpCallExp self) { }
	public void afterRelOpCallExp(gbind.simpleocl.RelOpCallExp self) { }
	public VisitingActions preMulOpCallExp(gbind.simpleocl.MulOpCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inMulOpCallExp(gbind.simpleocl.MulOpCallExp self) { if ( _debug ) System.out.println("Visiting MulOpCallExp"); }
	public void beforeMulOpCallExp(gbind.simpleocl.MulOpCallExp self) { }
	public void afterMulOpCallExp(gbind.simpleocl.MulOpCallExp self) { }
	public VisitingActions preBagExp(gbind.simpleocl.BagExp self) { return new VisitingActions("type" , "elements"); } 
	public void inBagExp(gbind.simpleocl.BagExp self) { if ( _debug ) System.out.println("Visiting BagExp"); }
	public void beforeBagExp(gbind.simpleocl.BagExp self) { }
	public void afterBagExp(gbind.simpleocl.BagExp self) { }
	public VisitingActions preRealType(gbind.simpleocl.RealType self) { return new VisitingActions(); } 
	public void inRealType(gbind.simpleocl.RealType self) { if ( _debug ) System.out.println("Visiting RealType"); }
	public void beforeRealType(gbind.simpleocl.RealType self) { }
	public void afterRealType(gbind.simpleocl.RealType self) { }
	public VisitingActions preConcreteMetaclass(gbind.dsl.ConcreteMetaclass self) { return new VisitingActions(); } 
	public void inConcreteMetaclass(gbind.dsl.ConcreteMetaclass self) { if ( _debug ) System.out.println("Visiting ConcreteMetaclass"); }
	public void beforeConcreteMetaclass(gbind.dsl.ConcreteMetaclass self) { }
	public void afterConcreteMetaclass(gbind.dsl.ConcreteMetaclass self) { }
	public VisitingActions preHelperParameter(gbind.dsl.HelperParameter self) { return new VisitingActions("type"); } 
	public void inHelperParameter(gbind.dsl.HelperParameter self) { if ( _debug ) System.out.println("Visiting HelperParameter"); }
	public void beforeHelperParameter(gbind.dsl.HelperParameter self) { }
	public void afterHelperParameter(gbind.dsl.HelperParameter self) { }
	public VisitingActions preSetType(gbind.simpleocl.SetType self) { return new VisitingActions("elementType"); } 
	public void inSetType(gbind.simpleocl.SetType self) { if ( _debug ) System.out.println("Visiting SetType"); }
	public void beforeSetType(gbind.simpleocl.SetType self) { }
	public void afterSetType(gbind.simpleocl.SetType self) { }
	public VisitingActions preConceptMetaclass(gbind.dsl.ConceptMetaclass self) { return new VisitingActions(); } 
	public void inConceptMetaclass(gbind.dsl.ConceptMetaclass self) { if ( _debug ) System.out.println("Visiting ConceptMetaclass"); }
	public void beforeConceptMetaclass(gbind.dsl.ConceptMetaclass self) { }
	public void afterConceptMetaclass(gbind.dsl.ConceptMetaclass self) { }
	public VisitingActions preLambdaType(gbind.simpleocl.LambdaType self) { return new VisitingActions("returnType" , "argumentTypes"); } 
	public void inLambdaType(gbind.simpleocl.LambdaType self) { if ( _debug ) System.out.println("Visiting LambdaType"); }
	public void beforeLambdaType(gbind.simpleocl.LambdaType self) { }
	public void afterLambdaType(gbind.simpleocl.LambdaType self) { }
	public VisitingActions preStaticPropertyCallExp(gbind.simpleocl.StaticPropertyCallExp self) { return new VisitingActions("type" , "source" , "staticCall"); } 
	public void inStaticPropertyCallExp(gbind.simpleocl.StaticPropertyCallExp self) { if ( _debug ) System.out.println("Visiting StaticPropertyCallExp"); }
	public void beforeStaticPropertyCallExp(gbind.simpleocl.StaticPropertyCallExp self) { }
	public void afterStaticPropertyCallExp(gbind.simpleocl.StaticPropertyCallExp self) { }
	public VisitingActions preAttribute(gbind.simpleocl.Attribute self) { return new VisitingActions("initExpression" , "type"); } 
	public void inAttribute(gbind.simpleocl.Attribute self) { if ( _debug ) System.out.println("Visiting Attribute"); }
	public void beforeAttribute(gbind.simpleocl.Attribute self) { }
	public void afterAttribute(gbind.simpleocl.Attribute self) { }
	public VisitingActions preCollectionExp(gbind.simpleocl.CollectionExp self) { return new VisitingActions("type" , "elements"); } 
	public void inCollectionExp(gbind.simpleocl.CollectionExp self) { if ( _debug ) System.out.println("Visiting CollectionExp"); }
	public void beforeCollectionExp(gbind.simpleocl.CollectionExp self) { }
	public void afterCollectionExp(gbind.simpleocl.CollectionExp self) { }
	public VisitingActions preOclFeatureDefinition(gbind.simpleocl.OclFeatureDefinition self) { return new VisitingActions("feature" , "context_"); } 
	public void inOclFeatureDefinition(gbind.simpleocl.OclFeatureDefinition self) { if ( _debug ) System.out.println("Visiting OclFeatureDefinition"); }
	public void beforeOclFeatureDefinition(gbind.simpleocl.OclFeatureDefinition self) { }
	public void afterOclFeatureDefinition(gbind.simpleocl.OclFeatureDefinition self) { }
	public VisitingActions preClassBinding(gbind.dsl.ClassBinding self) { return new VisitingActions("whenClause"); } 
	public void inClassBinding(gbind.dsl.ClassBinding self) { if ( _debug ) System.out.println("Visiting ClassBinding"); }
	public void beforeClassBinding(gbind.dsl.ClassBinding self) { }
	public void afterClassBinding(gbind.dsl.ClassBinding self) { }
	public VisitingActions preLoopExp(gbind.simpleocl.LoopExp self) { return new VisitingActions("body" , "iterators"); } 
	public void inLoopExp(gbind.simpleocl.LoopExp self) { if ( _debug ) System.out.println("Visiting LoopExp"); }
	public void beforeLoopExp(gbind.simpleocl.LoopExp self) { }
	public void afterLoopExp(gbind.simpleocl.LoopExp self) { }
	public VisitingActions preNamedElement(gbind.simpleocl.NamedElement self) { return new VisitingActions(); } 
	public void inNamedElement(gbind.simpleocl.NamedElement self) { if ( _debug ) System.out.println("Visiting NamedElement"); }
	public void beforeNamedElement(gbind.simpleocl.NamedElement self) { }
	public void afterNamedElement(gbind.simpleocl.NamedElement self) { }
	public VisitingActions preIntOpCallExp(gbind.simpleocl.IntOpCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inIntOpCallExp(gbind.simpleocl.IntOpCallExp self) { if ( _debug ) System.out.println("Visiting IntOpCallExp"); }
	public void beforeIntOpCallExp(gbind.simpleocl.IntOpCallExp self) { }
	public void afterIntOpCallExp(gbind.simpleocl.IntOpCallExp self) { }
	public VisitingActions preOclContextDefinition(gbind.simpleocl.OclContextDefinition self) { return new VisitingActions("context_"); } 
	public void inOclContextDefinition(gbind.simpleocl.OclContextDefinition self) { if ( _debug ) System.out.println("Visiting OclContextDefinition"); }
	public void beforeOclContextDefinition(gbind.simpleocl.OclContextDefinition self) { }
	public void afterOclContextDefinition(gbind.simpleocl.OclContextDefinition self) { }
	public VisitingActions preOclType(gbind.simpleocl.OclType self) { return new VisitingActions(); } 
	public void inOclType(gbind.simpleocl.OclType self) { if ( _debug ) System.out.println("Visiting OclType"); }
	public void beforeOclType(gbind.simpleocl.OclType self) { }
	public void afterOclType(gbind.simpleocl.OclType self) { }
	public VisitingActions preNumericExp(gbind.simpleocl.NumericExp self) { return new VisitingActions("type"); } 
	public void inNumericExp(gbind.simpleocl.NumericExp self) { if ( _debug ) System.out.println("Visiting NumericExp"); }
	public void beforeNumericExp(gbind.simpleocl.NumericExp self) { }
	public void afterNumericExp(gbind.simpleocl.NumericExp self) { }
	public VisitingActions preConceptHelper(gbind.dsl.ConceptHelper self) { return new VisitingActions("body" , "type"); } 
	public void inConceptHelper(gbind.dsl.ConceptHelper self) { if ( _debug ) System.out.println("Visiting ConceptHelper"); }
	public void beforeConceptHelper(gbind.dsl.ConceptHelper self) { }
	public void afterConceptHelper(gbind.dsl.ConceptHelper self) { }
	public VisitingActions preMetamodelDeclaration(gbind.dsl.MetamodelDeclaration self) { return new VisitingActions(); } 
	public void inMetamodelDeclaration(gbind.dsl.MetamodelDeclaration self) { if ( _debug ) System.out.println("Visiting MetamodelDeclaration"); }
	public void beforeMetamodelDeclaration(gbind.dsl.MetamodelDeclaration self) { }
	public void afterMetamodelDeclaration(gbind.dsl.MetamodelDeclaration self) { }
	public VisitingActions preModuleElement(gbind.simpleocl.ModuleElement self) { return new VisitingActions(); } 
	public void inModuleElement(gbind.simpleocl.ModuleElement self) { if ( _debug ) System.out.println("Visiting ModuleElement"); }
	public void beforeModuleElement(gbind.simpleocl.ModuleElement self) { }
	public void afterModuleElement(gbind.simpleocl.ModuleElement self) { }
	public VisitingActions preSelfExp(gbind.simpleocl.SelfExp self) { return new VisitingActions("type"); } 
	public void inSelfExp(gbind.simpleocl.SelfExp self) { if ( _debug ) System.out.println("Visiting SelfExp"); }
	public void beforeSelfExp(gbind.simpleocl.SelfExp self) { }
	public void afterSelfExp(gbind.simpleocl.SelfExp self) { }
	public VisitingActions preVirtualFeature(gbind.dsl.VirtualFeature self) { return new VisitingActions(); } 
	public void inVirtualFeature(gbind.dsl.VirtualFeature self) { if ( _debug ) System.out.println("Visiting VirtualFeature"); }
	public void beforeVirtualFeature(gbind.dsl.VirtualFeature self) { }
	public void afterVirtualFeature(gbind.dsl.VirtualFeature self) { }
	public VisitingActions preIntegerExp(gbind.simpleocl.IntegerExp self) { return new VisitingActions("type"); } 
	public void inIntegerExp(gbind.simpleocl.IntegerExp self) { if ( _debug ) System.out.println("Visiting IntegerExp"); }
	public void beforeIntegerExp(gbind.simpleocl.IntegerExp self) { }
	public void afterIntegerExp(gbind.simpleocl.IntegerExp self) { }
	public VisitingActions preMapExp(gbind.simpleocl.MapExp self) { return new VisitingActions("type" , "elements"); } 
	public void inMapExp(gbind.simpleocl.MapExp self) { if ( _debug ) System.out.println("Visiting MapExp"); }
	public void beforeMapExp(gbind.simpleocl.MapExp self) { }
	public void afterMapExp(gbind.simpleocl.MapExp self) { }
	public VisitingActions preBraceExp(gbind.simpleocl.BraceExp self) { return new VisitingActions("type" , "exp"); } 
	public void inBraceExp(gbind.simpleocl.BraceExp self) { if ( _debug ) System.out.println("Visiting BraceExp"); }
	public void beforeBraceExp(gbind.simpleocl.BraceExp self) { }
	public void afterBraceExp(gbind.simpleocl.BraceExp self) { }
	public VisitingActions preNotOpCallExp(gbind.simpleocl.NotOpCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inNotOpCallExp(gbind.simpleocl.NotOpCallExp self) { if ( _debug ) System.out.println("Visiting NotOpCallExp"); }
	public void beforeNotOpCallExp(gbind.simpleocl.NotOpCallExp self) { }
	public void afterNotOpCallExp(gbind.simpleocl.NotOpCallExp self) { }
	public VisitingActions preBaseFeatureBinding(gbind.dsl.BaseFeatureBinding self) { return new VisitingActions(); } 
	public void inBaseFeatureBinding(gbind.dsl.BaseFeatureBinding self) { if ( _debug ) System.out.println("Visiting BaseFeatureBinding"); }
	public void beforeBaseFeatureBinding(gbind.dsl.BaseFeatureBinding self) { }
	public void afterBaseFeatureBinding(gbind.dsl.BaseFeatureBinding self) { }
	public VisitingActions preEqOpCallExp(gbind.simpleocl.EqOpCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inEqOpCallExp(gbind.simpleocl.EqOpCallExp self) { if ( _debug ) System.out.println("Visiting EqOpCallExp"); }
	public void beforeEqOpCallExp(gbind.simpleocl.EqOpCallExp self) { }
	public void afterEqOpCallExp(gbind.simpleocl.EqOpCallExp self) { }
	public VisitingActions preRenamingFeatureBinding(gbind.dsl.RenamingFeatureBinding self) { return new VisitingActions(); } 
	public void inRenamingFeatureBinding(gbind.dsl.RenamingFeatureBinding self) { if ( _debug ) System.out.println("Visiting RenamingFeatureBinding"); }
	public void beforeRenamingFeatureBinding(gbind.dsl.RenamingFeatureBinding self) { }
	public void afterRenamingFeatureBinding(gbind.dsl.RenamingFeatureBinding self) { }
	public VisitingActions preSequenceExp(gbind.simpleocl.SequenceExp self) { return new VisitingActions("type" , "elements"); } 
	public void inSequenceExp(gbind.simpleocl.SequenceExp self) { if ( _debug ) System.out.println("Visiting SequenceExp"); }
	public void beforeSequenceExp(gbind.simpleocl.SequenceExp self) { }
	public void afterSequenceExp(gbind.simpleocl.SequenceExp self) { }
	public VisitingActions preOclModelElement(gbind.simpleocl.OclModelElement self) { return new VisitingActions(); } 
	public void inOclModelElement(gbind.simpleocl.OclModelElement self) { if ( _debug ) System.out.println("Visiting OclModelElement"); }
	public void beforeOclModelElement(gbind.simpleocl.OclModelElement self) { }
	public void afterOclModelElement(gbind.simpleocl.OclModelElement self) { }
	public VisitingActions preSetExp(gbind.simpleocl.SetExp self) { return new VisitingActions("type" , "elements"); } 
	public void inSetExp(gbind.simpleocl.SetExp self) { if ( _debug ) System.out.println("Visiting SetExp"); }
	public void beforeSetExp(gbind.simpleocl.SetExp self) { }
	public void afterSetExp(gbind.simpleocl.SetExp self) { }
	public VisitingActions preTuplePart(gbind.simpleocl.TuplePart self) { return new VisitingActions("type" , "initExpression"); } 
	public void inTuplePart(gbind.simpleocl.TuplePart self) { if ( _debug ) System.out.println("Visiting TuplePart"); }
	public void beforeTuplePart(gbind.simpleocl.TuplePart self) { }
	public void afterTuplePart(gbind.simpleocl.TuplePart self) { }
	public VisitingActions preVirtualReference(gbind.dsl.VirtualReference self) { return new VisitingActions(); } 
	public void inVirtualReference(gbind.dsl.VirtualReference self) { if ( _debug ) System.out.println("Visiting VirtualReference"); }
	public void beforeVirtualReference(gbind.dsl.VirtualReference self) { }
	public void afterVirtualReference(gbind.dsl.VirtualReference self) { }
	public VisitingActions preOperatorCallExp(gbind.simpleocl.OperatorCallExp self) { return new VisitingActions("type" , "argument" , "source"); } 
	public void inOperatorCallExp(gbind.simpleocl.OperatorCallExp self) { if ( _debug ) System.out.println("Visiting OperatorCallExp"); }
	public void beforeOperatorCallExp(gbind.simpleocl.OperatorCallExp self) { }
	public void afterOperatorCallExp(gbind.simpleocl.OperatorCallExp self) { }
	public VisitingActions preLocalVariable(gbind.simpleocl.LocalVariable self) { return new VisitingActions("type" , "initExpression"); } 
	public void inLocalVariable(gbind.simpleocl.LocalVariable self) { if ( _debug ) System.out.println("Visiting LocalVariable"); }
	public void beforeLocalVariable(gbind.simpleocl.LocalVariable self) { }
	public void afterLocalVariable(gbind.simpleocl.LocalVariable self) { }
	public VisitingActions preIterator(gbind.simpleocl.Iterator self) { return new VisitingActions("type"); } 
	public void inIterator(gbind.simpleocl.Iterator self) { if ( _debug ) System.out.println("Visiting Iterator"); }
	public void beforeIterator(gbind.simpleocl.Iterator self) { }
	public void afterIterator(gbind.simpleocl.Iterator self) { }
	public VisitingActions prePropertyCall(gbind.simpleocl.PropertyCall self) { return new VisitingActions(); } 
	public void inPropertyCall(gbind.simpleocl.PropertyCall self) { if ( _debug ) System.out.println("Visiting PropertyCall"); }
	public void beforePropertyCall(gbind.simpleocl.PropertyCall self) { }
	public void afterPropertyCall(gbind.simpleocl.PropertyCall self) { }
	public VisitingActions preOclExpression(gbind.simpleocl.OclExpression self) { return new VisitingActions("type"); } 
	public void inOclExpression(gbind.simpleocl.OclExpression self) { if ( _debug ) System.out.println("Visiting OclExpression"); }
	public void beforeOclExpression(gbind.simpleocl.OclExpression self) { }
	public void afterOclExpression(gbind.simpleocl.OclExpression self) { }
	public VisitingActions preConcreteReferencDeclaringVar(gbind.dsl.ConcreteReferencDeclaringVar self) { return new VisitingActions("type"); } 
	public void inConcreteReferencDeclaringVar(gbind.dsl.ConcreteReferencDeclaringVar self) { if ( _debug ) System.out.println("Visiting ConcreteReferencDeclaringVar"); }
	public void beforeConcreteReferencDeclaringVar(gbind.dsl.ConcreteReferencDeclaringVar self) { }
	public void afterConcreteReferencDeclaringVar(gbind.dsl.ConcreteReferencDeclaringVar self) { }
	public VisitingActions preBooleanExp(gbind.simpleocl.BooleanExp self) { return new VisitingActions("type"); } 
	public void inBooleanExp(gbind.simpleocl.BooleanExp self) { if ( _debug ) System.out.println("Visiting BooleanExp"); }
	public void beforeBooleanExp(gbind.simpleocl.BooleanExp self) { }
	public void afterBooleanExp(gbind.simpleocl.BooleanExp self) { }
	public VisitingActions preStaticPropertyCall(gbind.simpleocl.StaticPropertyCall self) { return new VisitingActions(); } 
	public void inStaticPropertyCall(gbind.simpleocl.StaticPropertyCall self) { if ( _debug ) System.out.println("Visiting StaticPropertyCall"); }
	public void beforeStaticPropertyCall(gbind.simpleocl.StaticPropertyCall self) { }
	public void afterStaticPropertyCall(gbind.simpleocl.StaticPropertyCall self) { }
	public VisitingActions preOclModel(gbind.simpleocl.OclModel self) { return new VisitingActions(); } 
	public void inOclModel(gbind.simpleocl.OclModel self) { if ( _debug ) System.out.println("Visiting OclModel"); }
	public void beforeOclModel(gbind.simpleocl.OclModel self) { }
	public void afterOclModel(gbind.simpleocl.OclModel self) { }
	public VisitingActions preIfExp(gbind.simpleocl.IfExp self) { return new VisitingActions("type" , "thenExpression" , "condition" , "elseExpression"); } 
	public void inIfExp(gbind.simpleocl.IfExp self) { if ( _debug ) System.out.println("Visiting IfExp"); }
	public void beforeIfExp(gbind.simpleocl.IfExp self) { }
	public void afterIfExp(gbind.simpleocl.IfExp self) { }
	public VisitingActions preOperation(gbind.simpleocl.Operation self) { return new VisitingActions("parameters" , "returnType" , "body"); } 
	public void inOperation(gbind.simpleocl.Operation self) { if ( _debug ) System.out.println("Visiting Operation"); }
	public void beforeOperation(gbind.simpleocl.Operation self) { }
	public void afterOperation(gbind.simpleocl.Operation self) { }
	public VisitingActions preNavigationOrAttributeCall(gbind.simpleocl.NavigationOrAttributeCall self) { return new VisitingActions(); } 
	public void inNavigationOrAttributeCall(gbind.simpleocl.NavigationOrAttributeCall self) { if ( _debug ) System.out.println("Visiting NavigationOrAttributeCall"); }
	public void beforeNavigationOrAttributeCall(gbind.simpleocl.NavigationOrAttributeCall self) { }
	public void afterNavigationOrAttributeCall(gbind.simpleocl.NavigationOrAttributeCall self) { }
	public VisitingActions preCollectionType(gbind.simpleocl.CollectionType self) { return new VisitingActions("elementType"); } 
	public void inCollectionType(gbind.simpleocl.CollectionType self) { if ( _debug ) System.out.println("Visiting CollectionType"); }
	public void beforeCollectionType(gbind.simpleocl.CollectionType self) { }
	public void afterCollectionType(gbind.simpleocl.CollectionType self) { }
	public VisitingActions preOrderedSetExp(gbind.simpleocl.OrderedSetExp self) { return new VisitingActions("type" , "elements"); } 
	public void inOrderedSetExp(gbind.simpleocl.OrderedSetExp self) { if ( _debug ) System.out.println("Visiting OrderedSetExp"); }
	public void beforeOrderedSetExp(gbind.simpleocl.OrderedSetExp self) { }
	public void afterOrderedSetExp(gbind.simpleocl.OrderedSetExp self) { }
	public VisitingActions preIntermediateClassBinding(gbind.dsl.IntermediateClassBinding self) { return new VisitingActions("concreteReference" , "featureBindings"); } 
	public void inIntermediateClassBinding(gbind.dsl.IntermediateClassBinding self) { if ( _debug ) System.out.println("Visiting IntermediateClassBinding"); }
	public void beforeIntermediateClassBinding(gbind.dsl.IntermediateClassBinding self) { }
	public void afterIntermediateClassBinding(gbind.dsl.IntermediateClassBinding self) { }
	public VisitingActions preOclFeatureBinding(gbind.dsl.OclFeatureBinding self) { return new VisitingActions("concrete"); } 
	public void inOclFeatureBinding(gbind.dsl.OclFeatureBinding self) { if ( _debug ) System.out.println("Visiting OclFeatureBinding"); }
	public void beforeOclFeatureBinding(gbind.dsl.OclFeatureBinding self) { }
	public void afterOclFeatureBinding(gbind.dsl.OclFeatureBinding self) { }
	public VisitingActions preIterateExp(gbind.simpleocl.IterateExp self) { return new VisitingActions("body" , "iterators" , "result"); } 
	public void inIterateExp(gbind.simpleocl.IterateExp self) { if ( _debug ) System.out.println("Visiting IterateExp"); }
	public void beforeIterateExp(gbind.simpleocl.IterateExp self) { }
	public void afterIterateExp(gbind.simpleocl.IterateExp self) { }
	public VisitingActions preLetExp(gbind.simpleocl.LetExp self) { return new VisitingActions("type" , "variable" , "in_"); } 
	public void inLetExp(gbind.simpleocl.LetExp self) { if ( _debug ) System.out.println("Visiting LetExp"); }
	public void beforeLetExp(gbind.simpleocl.LetExp self) { }
	public void afterLetExp(gbind.simpleocl.LetExp self) { }
	public VisitingActions preVirtualClassBinding(gbind.dsl.VirtualClassBinding self) { return new VisitingActions("refFeatures"); } 
	public void inVirtualClassBinding(gbind.dsl.VirtualClassBinding self) { if ( _debug ) System.out.println("Visiting VirtualClassBinding"); }
	public void beforeVirtualClassBinding(gbind.dsl.VirtualClassBinding self) { }
	public void afterVirtualClassBinding(gbind.dsl.VirtualClassBinding self) { }
	public VisitingActions preEnumLiteralExp(gbind.simpleocl.EnumLiteralExp self) { return new VisitingActions("type"); } 
	public void inEnumLiteralExp(gbind.simpleocl.EnumLiteralExp self) { if ( _debug ) System.out.println("Visiting EnumLiteralExp"); }
	public void beforeEnumLiteralExp(gbind.simpleocl.EnumLiteralExp self) { }
	public void afterEnumLiteralExp(gbind.simpleocl.EnumLiteralExp self) { }
	public VisitingActions preNumericType(gbind.simpleocl.NumericType self) { return new VisitingActions(); } 
	public void inNumericType(gbind.simpleocl.NumericType self) { if ( _debug ) System.out.println("Visiting NumericType"); }
	public void beforeNumericType(gbind.simpleocl.NumericType self) { }
	public void afterNumericType(gbind.simpleocl.NumericType self) { }
	public VisitingActions preStringType(gbind.simpleocl.StringType self) { return new VisitingActions(); } 
	public void inStringType(gbind.simpleocl.StringType self) { if ( _debug ) System.out.println("Visiting StringType"); }
	public void beforeStringType(gbind.simpleocl.StringType self) { }
	public void afterStringType(gbind.simpleocl.StringType self) { }
	public VisitingActions preParameter(gbind.simpleocl.Parameter self) { return new VisitingActions("type"); } 
	public void inParameter(gbind.simpleocl.Parameter self) { if ( _debug ) System.out.println("Visiting Parameter"); }
	public void beforeParameter(gbind.simpleocl.Parameter self) { }
	public void afterParameter(gbind.simpleocl.Parameter self) { }
	public VisitingActions preConceptFeatureRef(gbind.dsl.ConceptFeatureRef self) { return new VisitingActions(); } 
	public void inConceptFeatureRef(gbind.dsl.ConceptFeatureRef self) { if ( _debug ) System.out.println("Visiting ConceptFeatureRef"); }
	public void beforeConceptFeatureRef(gbind.dsl.ConceptFeatureRef self) { }
	public void afterConceptFeatureRef(gbind.dsl.ConceptFeatureRef self) { }
	public VisitingActions preSuperExp(gbind.simpleocl.SuperExp self) { return new VisitingActions("type"); } 
	public void inSuperExp(gbind.simpleocl.SuperExp self) { if ( _debug ) System.out.println("Visiting SuperExp"); }
	public void beforeSuperExp(gbind.simpleocl.SuperExp self) { }
	public void afterSuperExp(gbind.simpleocl.SuperExp self) { }
	public VisitingActions preStaticNavigationOrAttributeCall(gbind.simpleocl.StaticNavigationOrAttributeCall self) { return new VisitingActions(); } 
	public void inStaticNavigationOrAttributeCall(gbind.simpleocl.StaticNavigationOrAttributeCall self) { if ( _debug ) System.out.println("Visiting StaticNavigationOrAttributeCall"); }
	public void beforeStaticNavigationOrAttributeCall(gbind.simpleocl.StaticNavigationOrAttributeCall self) { }
	public void afterStaticNavigationOrAttributeCall(gbind.simpleocl.StaticNavigationOrAttributeCall self) { }
	public VisitingActions preOclUndefinedExp(gbind.simpleocl.OclUndefinedExp self) { return new VisitingActions("type"); } 
	public void inOclUndefinedExp(gbind.simpleocl.OclUndefinedExp self) { if ( _debug ) System.out.println("Visiting OclUndefinedExp"); }
	public void beforeOclUndefinedExp(gbind.simpleocl.OclUndefinedExp self) { }
	public void afterOclUndefinedExp(gbind.simpleocl.OclUndefinedExp self) { }
	public VisitingActions preTupleType(gbind.simpleocl.TupleType self) { return new VisitingActions("attributes"); } 
	public void inTupleType(gbind.simpleocl.TupleType self) { if ( _debug ) System.out.println("Visiting TupleType"); }
	public void beforeTupleType(gbind.simpleocl.TupleType self) { }
	public void afterTupleType(gbind.simpleocl.TupleType self) { }
	public VisitingActions prePropertyCallExp(gbind.simpleocl.PropertyCallExp self) { return new VisitingActions("type" , "calls" , "source"); } 
	public void inPropertyCallExp(gbind.simpleocl.PropertyCallExp self) { if ( _debug ) System.out.println("Visiting PropertyCallExp"); }
	public void beforePropertyCallExp(gbind.simpleocl.PropertyCallExp self) { }
	public void afterPropertyCallExp(gbind.simpleocl.PropertyCallExp self) { }
	public VisitingActions preEnvExp(gbind.simpleocl.EnvExp self) { return new VisitingActions("type"); } 
	public void inEnvExp(gbind.simpleocl.EnvExp self) { if ( _debug ) System.out.println("Visiting EnvExp"); }
	public void beforeEnvExp(gbind.simpleocl.EnvExp self) { }
	public void afterEnvExp(gbind.simpleocl.EnvExp self) { }
	public VisitingActions preLocatedElement(gbind.simpleocl.LocatedElement self) { return new VisitingActions(); } 
	public void inLocatedElement(gbind.simpleocl.LocatedElement self) { if ( _debug ) System.out.println("Visiting LocatedElement"); }
	public void beforeLocatedElement(gbind.simpleocl.LocatedElement self) { }
	public void afterLocatedElement(gbind.simpleocl.LocatedElement self) { }
	public VisitingActions preOclInstanceModel(gbind.simpleocl.OclInstanceModel self) { return new VisitingActions(); } 
	public void inOclInstanceModel(gbind.simpleocl.OclInstanceModel self) { if ( _debug ) System.out.println("Visiting OclInstanceModel"); }
	public void beforeOclInstanceModel(gbind.simpleocl.OclInstanceModel self) { }
	public void afterOclInstanceModel(gbind.simpleocl.OclInstanceModel self) { }
	public VisitingActions preLambdaCallExp(gbind.simpleocl.LambdaCallExp self) { return new VisitingActions("type" , "arguments"); } 
	public void inLambdaCallExp(gbind.simpleocl.LambdaCallExp self) { if ( _debug ) System.out.println("Visiting LambdaCallExp"); }
	public void beforeLambdaCallExp(gbind.simpleocl.LambdaCallExp self) { }
	public void afterLambdaCallExp(gbind.simpleocl.LambdaCallExp self) { }
	public VisitingActions preOrderedSetType(gbind.simpleocl.OrderedSetType self) { return new VisitingActions("elementType"); } 
	public void inOrderedSetType(gbind.simpleocl.OrderedSetType self) { if ( _debug ) System.out.println("Visiting OrderedSetType"); }
	public void beforeOrderedSetType(gbind.simpleocl.OrderedSetType self) { }
	public void afterOrderedSetType(gbind.simpleocl.OrderedSetType self) { }
	public VisitingActions preOclFeature(gbind.simpleocl.OclFeature self) { return new VisitingActions(); } 
	public void inOclFeature(gbind.simpleocl.OclFeature self) { if ( _debug ) System.out.println("Visiting OclFeature"); }
	public void beforeOclFeature(gbind.simpleocl.OclFeature self) { }
	public void afterOclFeature(gbind.simpleocl.OclFeature self) { }
	public VisitingActions preOclAnyType(gbind.simpleocl.OclAnyType self) { return new VisitingActions(); } 
	public void inOclAnyType(gbind.simpleocl.OclAnyType self) { if ( _debug ) System.out.println("Visiting OclAnyType"); }
	public void beforeOclAnyType(gbind.simpleocl.OclAnyType self) { }
	public void afterOclAnyType(gbind.simpleocl.OclAnyType self) { }
	public VisitingActions preVariableExp(gbind.simpleocl.VariableExp self) { return new VisitingActions("type"); } 
	public void inVariableExp(gbind.simpleocl.VariableExp self) { if ( _debug ) System.out.println("Visiting VariableExp"); }
	public void beforeVariableExp(gbind.simpleocl.VariableExp self) { }
	public void afterVariableExp(gbind.simpleocl.VariableExp self) { }
	public VisitingActions preStaticOperationCall(gbind.simpleocl.StaticOperationCall self) { return new VisitingActions("arguments"); } 
	public void inStaticOperationCall(gbind.simpleocl.StaticOperationCall self) { if ( _debug ) System.out.println("Visiting StaticOperationCall"); }
	public void beforeStaticOperationCall(gbind.simpleocl.StaticOperationCall self) { }
	public void afterStaticOperationCall(gbind.simpleocl.StaticOperationCall self) { }
	public VisitingActions preIntegerType(gbind.simpleocl.IntegerType self) { return new VisitingActions(); } 
	public void inIntegerType(gbind.simpleocl.IntegerType self) { if ( _debug ) System.out.println("Visiting IntegerType"); }
	public void beforeIntegerType(gbind.simpleocl.IntegerType self) { }
	public void afterIntegerType(gbind.simpleocl.IntegerType self) { }
	public VisitingActions preStringExp(gbind.simpleocl.StringExp self) { return new VisitingActions("type"); } 
	public void inStringExp(gbind.simpleocl.StringExp self) { if ( _debug ) System.out.println("Visiting StringExp"); }
	public void beforeStringExp(gbind.simpleocl.StringExp self) { }
	public void afterStringExp(gbind.simpleocl.StringExp self) { }
	public VisitingActions preLocalHelper(gbind.dsl.LocalHelper self) { return new VisitingActions("body" , "type" , "parameters"); } 
	public void inLocalHelper(gbind.dsl.LocalHelper self) { if ( _debug ) System.out.println("Visiting LocalHelper"); }
	public void beforeLocalHelper(gbind.dsl.LocalHelper self) { }
	public void afterLocalHelper(gbind.dsl.LocalHelper self) { }
	public VisitingActions preVirtualTupleExp(gbind.dsl.VirtualTupleExp self) { return new VisitingActions("type" , "tuplePart"); } 
	public void inVirtualTupleExp(gbind.dsl.VirtualTupleExp self) { if ( _debug ) System.out.println("Visiting VirtualTupleExp"); }
	public void beforeVirtualTupleExp(gbind.dsl.VirtualTupleExp self) { }
	public void afterVirtualTupleExp(gbind.dsl.VirtualTupleExp self) { }
	public VisitingActions preRealExp(gbind.simpleocl.RealExp self) { return new VisitingActions("type"); } 
	public void inRealExp(gbind.simpleocl.RealExp self) { if ( _debug ) System.out.println("Visiting RealExp"); }
	public void beforeRealExp(gbind.simpleocl.RealExp self) { }
	public void afterRealExp(gbind.simpleocl.RealExp self) { }
	public VisitingActions prePrimitiveExp(gbind.simpleocl.PrimitiveExp self) { return new VisitingActions("type"); } 
	public void inPrimitiveExp(gbind.simpleocl.PrimitiveExp self) { if ( _debug ) System.out.println("Visiting PrimitiveExp"); }
	public void beforePrimitiveExp(gbind.simpleocl.PrimitiveExp self) { }
	public void afterPrimitiveExp(gbind.simpleocl.PrimitiveExp self) { }
	public VisitingActions preVirtualMetaclass(gbind.dsl.VirtualMetaclass self) { return new VisitingActions("references" , "attributes" , "init"); } 
	public void inVirtualMetaclass(gbind.dsl.VirtualMetaclass self) { if ( _debug ) System.out.println("Visiting VirtualMetaclass"); }
	public void beforeVirtualMetaclass(gbind.dsl.VirtualMetaclass self) { }
	public void afterVirtualMetaclass(gbind.dsl.VirtualMetaclass self) { }
	public VisitingActions preVirtualAttribute(gbind.dsl.VirtualAttribute self) { return new VisitingActions("type_"); } 
	public void inVirtualAttribute(gbind.dsl.VirtualAttribute self) { if ( _debug ) System.out.println("Visiting VirtualAttribute"); }
	public void beforeVirtualAttribute(gbind.dsl.VirtualAttribute self) { }
	public void afterVirtualAttribute(gbind.dsl.VirtualAttribute self) { }
	public VisitingActions preBooleanType(gbind.simpleocl.BooleanType self) { return new VisitingActions(); } 
	public void inBooleanType(gbind.simpleocl.BooleanType self) { if ( _debug ) System.out.println("Visiting BooleanType"); }
	public void beforeBooleanType(gbind.simpleocl.BooleanType self) { }
	public void afterBooleanType(gbind.simpleocl.BooleanType self) { }
	public VisitingActions preTupleTypeAttribute(gbind.simpleocl.TupleTypeAttribute self) { return new VisitingActions("type"); } 
	public void inTupleTypeAttribute(gbind.simpleocl.TupleTypeAttribute self) { if ( _debug ) System.out.println("Visiting TupleTypeAttribute"); }
	public void beforeTupleTypeAttribute(gbind.simpleocl.TupleTypeAttribute self) { }
	public void afterTupleTypeAttribute(gbind.simpleocl.TupleTypeAttribute self) { }
	public VisitingActions preBaseHelper(gbind.dsl.BaseHelper self) { return new VisitingActions("body" , "type"); } 
	public void inBaseHelper(gbind.dsl.BaseHelper self) { if ( _debug ) System.out.println("Visiting BaseHelper"); }
	public void beforeBaseHelper(gbind.dsl.BaseHelper self) { }
	public void afterBaseHelper(gbind.dsl.BaseHelper self) { }
	public VisitingActions preModule(gbind.simpleocl.Module self) { return new VisitingActions("metamodels" , "imports" , "elements"); } 
	public void inModule(gbind.simpleocl.Module self) { if ( _debug ) System.out.println("Visiting Module"); }
	public void beforeModule(gbind.simpleocl.Module self) { }
	public void afterModule(gbind.simpleocl.Module self) { }
	public VisitingActions preCollectionOperationCall(gbind.simpleocl.CollectionOperationCall self) { return new VisitingActions("arguments"); } 
	public void inCollectionOperationCall(gbind.simpleocl.CollectionOperationCall self) { if ( _debug ) System.out.println("Visiting CollectionOperationCall"); }
	public void beforeCollectionOperationCall(gbind.simpleocl.CollectionOperationCall self) { }
	public void afterCollectionOperationCall(gbind.simpleocl.CollectionOperationCall self) { }
	public VisitingActions preBagType(gbind.simpleocl.BagType self) { return new VisitingActions("elementType"); } 
	public void inBagType(gbind.simpleocl.BagType self) { if ( _debug ) System.out.println("Visiting BagType"); }
	public void beforeBagType(gbind.simpleocl.BagType self) { }
	public void afterBagType(gbind.simpleocl.BagType self) { }
	public VisitingActions preOperationCall(gbind.simpleocl.OperationCall self) { return new VisitingActions("arguments"); } 
	public void inOperationCall(gbind.simpleocl.OperationCall self) { if ( _debug ) System.out.println("Visiting OperationCall"); }
	public void beforeOperationCall(gbind.simpleocl.OperationCall self) { }
	public void afterOperationCall(gbind.simpleocl.OperationCall self) { }
	public VisitingActions preIteratorExp(gbind.simpleocl.IteratorExp self) { return new VisitingActions("body" , "iterators"); } 
	public void inIteratorExp(gbind.simpleocl.IteratorExp self) { if ( _debug ) System.out.println("Visiting IteratorExp"); }
	public void beforeIteratorExp(gbind.simpleocl.IteratorExp self) { }
	public void afterIteratorExp(gbind.simpleocl.IteratorExp self) { }
	public VisitingActions preOclModelElementExp(gbind.simpleocl.OclModelElementExp self) { return new VisitingActions("type"); } 
	public void inOclModelElementExp(gbind.simpleocl.OclModelElementExp self) { if ( _debug ) System.out.println("Visiting OclModelElementExp"); }
	public void beforeOclModelElementExp(gbind.simpleocl.OclModelElementExp self) { }
	public void afterOclModelElementExp(gbind.simpleocl.OclModelElementExp self) { }
	public VisitingActions preBindingModel(gbind.dsl.BindingModel self) { return new VisitingActions("bindings" , "helpers" , "conceptMetaclasses" , "concreteMetaclasses" , "virtualMetaclasses" , "boundConcept" , "boundMetamodel" , "options"); } 
	public void inBindingModel(gbind.dsl.BindingModel self) { if ( _debug ) System.out.println("Visiting BindingModel"); }
	public void beforeBindingModel(gbind.dsl.BindingModel self) { }
	public void afterBindingModel(gbind.dsl.BindingModel self) { }
		
	protected VisitingActions actions(Object... things) {
		return new VisitingActions(things);
	}

	public void startVisiting(EObject init) {
		visit(init);
	}	
	
	public EObject getCurrent() { return current; }
	protected void setCurrent(EObject o) { current = o; }
	
	protected void visitBindingOptions(gbind.dsl.BindingOptions this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBindingOptions(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBindingOptions(this_);
		
		visitActions(v, this_);		
					
		visitor.inBindingOptions(this_);
		visitor.afterBindingOptions(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitImport(gbind.simpleocl.Import this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preImport(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeImport(this_);
		
		visitActions(v, this_);		
					
		visitor.inImport(this_);
		visitor.afterImport(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMapType(gbind.simpleocl.MapType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preMapType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMapType(this_);
		
		visitActions(v, this_);		
					
		visitor.inMapType(this_);
		visitor.afterMapType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSequenceType(gbind.simpleocl.SequenceType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preSequenceType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSequenceType(this_);
		
		visitActions(v, this_);		
					
		visitor.inSequenceType(this_);
		visitor.afterSequenceType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMapElement(gbind.simpleocl.MapElement this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preMapElement(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMapElement(this_);
		
		visitActions(v, this_);		
					
		visitor.inMapElement(this_);
		visitor.afterMapElement(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclMetamodel(gbind.simpleocl.OclMetamodel this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclMetamodel(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclMetamodel(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclMetamodel(this_);
		visitor.afterOclMetamodel(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitAddOpCallExp(gbind.simpleocl.AddOpCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preAddOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeAddOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inAddOpCallExp(this_);
		visitor.afterAddOpCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitEnvType(gbind.simpleocl.EnvType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preEnvType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeEnvType(this_);
		
		visitActions(v, this_);		
					
		visitor.inEnvType(this_);
		visitor.afterEnvType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitTupleExp(gbind.simpleocl.TupleExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preTupleExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTupleExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inTupleExp(this_);
		visitor.afterTupleExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitRelOpCallExp(gbind.simpleocl.RelOpCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preRelOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRelOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inRelOpCallExp(this_);
		visitor.afterRelOpCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMulOpCallExp(gbind.simpleocl.MulOpCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preMulOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMulOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inMulOpCallExp(this_);
		visitor.afterMulOpCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBagExp(gbind.simpleocl.BagExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBagExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBagExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inBagExp(this_);
		visitor.afterBagExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitRealType(gbind.simpleocl.RealType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preRealType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRealType(this_);
		
		visitActions(v, this_);		
					
		visitor.inRealType(this_);
		visitor.afterRealType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitConcreteMetaclass(gbind.dsl.ConcreteMetaclass this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preConcreteMetaclass(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeConcreteMetaclass(this_);
		
		visitActions(v, this_);		
					
		visitor.inConcreteMetaclass(this_);
		visitor.afterConcreteMetaclass(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitHelperParameter(gbind.dsl.HelperParameter this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preHelperParameter(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeHelperParameter(this_);
		
		visitActions(v, this_);		
					
		visitor.inHelperParameter(this_);
		visitor.afterHelperParameter(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSetType(gbind.simpleocl.SetType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preSetType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSetType(this_);
		
		visitActions(v, this_);		
					
		visitor.inSetType(this_);
		visitor.afterSetType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitConceptMetaclass(gbind.dsl.ConceptMetaclass this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preConceptMetaclass(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeConceptMetaclass(this_);
		
		visitActions(v, this_);		
					
		visitor.inConceptMetaclass(this_);
		visitor.afterConceptMetaclass(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitLambdaType(gbind.simpleocl.LambdaType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preLambdaType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeLambdaType(this_);
		
		visitActions(v, this_);		
					
		visitor.inLambdaType(this_);
		visitor.afterLambdaType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitStaticPropertyCallExp(gbind.simpleocl.StaticPropertyCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preStaticPropertyCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStaticPropertyCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inStaticPropertyCallExp(this_);
		visitor.afterStaticPropertyCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitAttribute(gbind.simpleocl.Attribute this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preAttribute(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeAttribute(this_);
		
		visitActions(v, this_);		
					
		visitor.inAttribute(this_);
		visitor.afterAttribute(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclFeatureDefinition(gbind.simpleocl.OclFeatureDefinition this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclFeatureDefinition(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclFeatureDefinition(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclFeatureDefinition(this_);
		visitor.afterOclFeatureDefinition(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitClassBinding(gbind.dsl.ClassBinding this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preClassBinding(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeClassBinding(this_);
		
		visitActions(v, this_);		
					
		visitor.inClassBinding(this_);
		visitor.afterClassBinding(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIntOpCallExp(gbind.simpleocl.IntOpCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIntOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntOpCallExp(this_);
		visitor.afterIntOpCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclContextDefinition(gbind.simpleocl.OclContextDefinition this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclContextDefinition(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclContextDefinition(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclContextDefinition(this_);
		visitor.afterOclContextDefinition(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclType(gbind.simpleocl.OclType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclType(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclType(this_);
		visitor.afterOclType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitConceptHelper(gbind.dsl.ConceptHelper this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preConceptHelper(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeConceptHelper(this_);
		
		visitActions(v, this_);		
					
		visitor.inConceptHelper(this_);
		visitor.afterConceptHelper(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMetamodelDeclaration(gbind.dsl.MetamodelDeclaration this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preMetamodelDeclaration(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMetamodelDeclaration(this_);
		
		visitActions(v, this_);		
					
		visitor.inMetamodelDeclaration(this_);
		visitor.afterMetamodelDeclaration(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSelfExp(gbind.simpleocl.SelfExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preSelfExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSelfExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSelfExp(this_);
		visitor.afterSelfExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVirtualFeature(gbind.dsl.VirtualFeature this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVirtualFeature(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVirtualFeature(this_);
		
		visitActions(v, this_);		
					
		visitor.inVirtualFeature(this_);
		visitor.afterVirtualFeature(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIntegerExp(gbind.simpleocl.IntegerExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIntegerExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntegerExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntegerExp(this_);
		visitor.afterIntegerExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitMapExp(gbind.simpleocl.MapExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preMapExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeMapExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inMapExp(this_);
		visitor.afterMapExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBraceExp(gbind.simpleocl.BraceExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBraceExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBraceExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inBraceExp(this_);
		visitor.afterBraceExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitNotOpCallExp(gbind.simpleocl.NotOpCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preNotOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeNotOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inNotOpCallExp(this_);
		visitor.afterNotOpCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBaseFeatureBinding(gbind.dsl.BaseFeatureBinding this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBaseFeatureBinding(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBaseFeatureBinding(this_);
		
		visitActions(v, this_);		
					
		visitor.inBaseFeatureBinding(this_);
		visitor.afterBaseFeatureBinding(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitEqOpCallExp(gbind.simpleocl.EqOpCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preEqOpCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeEqOpCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inEqOpCallExp(this_);
		visitor.afterEqOpCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitRenamingFeatureBinding(gbind.dsl.RenamingFeatureBinding this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preRenamingFeatureBinding(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRenamingFeatureBinding(this_);
		
		visitActions(v, this_);		
					
		visitor.inRenamingFeatureBinding(this_);
		visitor.afterRenamingFeatureBinding(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSequenceExp(gbind.simpleocl.SequenceExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preSequenceExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSequenceExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSequenceExp(this_);
		visitor.afterSequenceExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclModelElement(gbind.simpleocl.OclModelElement this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclModelElement(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclModelElement(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclModelElement(this_);
		visitor.afterOclModelElement(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSetExp(gbind.simpleocl.SetExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preSetExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSetExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSetExp(this_);
		visitor.afterSetExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitTuplePart(gbind.simpleocl.TuplePart this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preTuplePart(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTuplePart(this_);
		
		visitActions(v, this_);		
					
		visitor.inTuplePart(this_);
		visitor.afterTuplePart(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVirtualReference(gbind.dsl.VirtualReference this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVirtualReference(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVirtualReference(this_);
		
		visitActions(v, this_);		
					
		visitor.inVirtualReference(this_);
		visitor.afterVirtualReference(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOperatorCallExp(gbind.simpleocl.OperatorCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOperatorCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOperatorCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOperatorCallExp(this_);
		visitor.afterOperatorCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitLocalVariable(gbind.simpleocl.LocalVariable this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preLocalVariable(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeLocalVariable(this_);
		
		visitActions(v, this_);		
					
		visitor.inLocalVariable(this_);
		visitor.afterLocalVariable(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIterator(gbind.simpleocl.Iterator this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIterator(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIterator(this_);
		
		visitActions(v, this_);		
					
		visitor.inIterator(this_);
		visitor.afterIterator(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitConcreteReferencDeclaringVar(gbind.dsl.ConcreteReferencDeclaringVar this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preConcreteReferencDeclaringVar(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeConcreteReferencDeclaringVar(this_);
		
		visitActions(v, this_);		
					
		visitor.inConcreteReferencDeclaringVar(this_);
		visitor.afterConcreteReferencDeclaringVar(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBooleanExp(gbind.simpleocl.BooleanExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBooleanExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBooleanExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inBooleanExp(this_);
		visitor.afterBooleanExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIfExp(gbind.simpleocl.IfExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIfExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIfExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIfExp(this_);
		visitor.afterIfExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOperation(gbind.simpleocl.Operation this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOperation(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOperation(this_);
		
		visitActions(v, this_);		
					
		visitor.inOperation(this_);
		visitor.afterOperation(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitNavigationOrAttributeCall(gbind.simpleocl.NavigationOrAttributeCall this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preNavigationOrAttributeCall(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeNavigationOrAttributeCall(this_);
		
		visitActions(v, this_);		
					
		visitor.inNavigationOrAttributeCall(this_);
		visitor.afterNavigationOrAttributeCall(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitCollectionType(gbind.simpleocl.CollectionType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preCollectionType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeCollectionType(this_);
		
		visitActions(v, this_);		
					
		visitor.inCollectionType(this_);
		visitor.afterCollectionType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOrderedSetExp(gbind.simpleocl.OrderedSetExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOrderedSetExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOrderedSetExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOrderedSetExp(this_);
		visitor.afterOrderedSetExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIntermediateClassBinding(gbind.dsl.IntermediateClassBinding this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIntermediateClassBinding(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntermediateClassBinding(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntermediateClassBinding(this_);
		visitor.afterIntermediateClassBinding(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclFeatureBinding(gbind.dsl.OclFeatureBinding this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclFeatureBinding(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclFeatureBinding(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclFeatureBinding(this_);
		visitor.afterOclFeatureBinding(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIterateExp(gbind.simpleocl.IterateExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIterateExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIterateExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIterateExp(this_);
		visitor.afterIterateExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitLetExp(gbind.simpleocl.LetExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preLetExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeLetExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inLetExp(this_);
		visitor.afterLetExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVirtualClassBinding(gbind.dsl.VirtualClassBinding this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVirtualClassBinding(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVirtualClassBinding(this_);
		
		visitActions(v, this_);		
					
		visitor.inVirtualClassBinding(this_);
		visitor.afterVirtualClassBinding(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitEnumLiteralExp(gbind.simpleocl.EnumLiteralExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preEnumLiteralExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeEnumLiteralExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inEnumLiteralExp(this_);
		visitor.afterEnumLiteralExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitStringType(gbind.simpleocl.StringType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preStringType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStringType(this_);
		
		visitActions(v, this_);		
					
		visitor.inStringType(this_);
		visitor.afterStringType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitParameter(gbind.simpleocl.Parameter this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preParameter(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeParameter(this_);
		
		visitActions(v, this_);		
					
		visitor.inParameter(this_);
		visitor.afterParameter(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitConceptFeatureRef(gbind.dsl.ConceptFeatureRef this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preConceptFeatureRef(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeConceptFeatureRef(this_);
		
		visitActions(v, this_);		
					
		visitor.inConceptFeatureRef(this_);
		visitor.afterConceptFeatureRef(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitSuperExp(gbind.simpleocl.SuperExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preSuperExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeSuperExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inSuperExp(this_);
		visitor.afterSuperExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitStaticNavigationOrAttributeCall(gbind.simpleocl.StaticNavigationOrAttributeCall this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preStaticNavigationOrAttributeCall(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStaticNavigationOrAttributeCall(this_);
		
		visitActions(v, this_);		
					
		visitor.inStaticNavigationOrAttributeCall(this_);
		visitor.afterStaticNavigationOrAttributeCall(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclUndefinedExp(gbind.simpleocl.OclUndefinedExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclUndefinedExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclUndefinedExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclUndefinedExp(this_);
		visitor.afterOclUndefinedExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitTupleType(gbind.simpleocl.TupleType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preTupleType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTupleType(this_);
		
		visitActions(v, this_);		
					
		visitor.inTupleType(this_);
		visitor.afterTupleType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitPropertyCallExp(gbind.simpleocl.PropertyCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.prePropertyCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforePropertyCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inPropertyCallExp(this_);
		visitor.afterPropertyCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitEnvExp(gbind.simpleocl.EnvExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preEnvExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeEnvExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inEnvExp(this_);
		visitor.afterEnvExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclInstanceModel(gbind.simpleocl.OclInstanceModel this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclInstanceModel(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclInstanceModel(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclInstanceModel(this_);
		visitor.afterOclInstanceModel(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitLambdaCallExp(gbind.simpleocl.LambdaCallExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preLambdaCallExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeLambdaCallExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inLambdaCallExp(this_);
		visitor.afterLambdaCallExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOrderedSetType(gbind.simpleocl.OrderedSetType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOrderedSetType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOrderedSetType(this_);
		
		visitActions(v, this_);		
					
		visitor.inOrderedSetType(this_);
		visitor.afterOrderedSetType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclAnyType(gbind.simpleocl.OclAnyType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclAnyType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclAnyType(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclAnyType(this_);
		visitor.afterOclAnyType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVariableExp(gbind.simpleocl.VariableExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVariableExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVariableExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inVariableExp(this_);
		visitor.afterVariableExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitStaticOperationCall(gbind.simpleocl.StaticOperationCall this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preStaticOperationCall(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStaticOperationCall(this_);
		
		visitActions(v, this_);		
					
		visitor.inStaticOperationCall(this_);
		visitor.afterStaticOperationCall(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIntegerType(gbind.simpleocl.IntegerType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIntegerType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIntegerType(this_);
		
		visitActions(v, this_);		
					
		visitor.inIntegerType(this_);
		visitor.afterIntegerType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitStringExp(gbind.simpleocl.StringExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preStringExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeStringExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inStringExp(this_);
		visitor.afterStringExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitLocalHelper(gbind.dsl.LocalHelper this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preLocalHelper(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeLocalHelper(this_);
		
		visitActions(v, this_);		
					
		visitor.inLocalHelper(this_);
		visitor.afterLocalHelper(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVirtualTupleExp(gbind.dsl.VirtualTupleExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVirtualTupleExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVirtualTupleExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inVirtualTupleExp(this_);
		visitor.afterVirtualTupleExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitRealExp(gbind.simpleocl.RealExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preRealExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeRealExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inRealExp(this_);
		visitor.afterRealExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVirtualMetaclass(gbind.dsl.VirtualMetaclass this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVirtualMetaclass(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVirtualMetaclass(this_);
		
		visitActions(v, this_);		
					
		visitor.inVirtualMetaclass(this_);
		visitor.afterVirtualMetaclass(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitVirtualAttribute(gbind.dsl.VirtualAttribute this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preVirtualAttribute(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeVirtualAttribute(this_);
		
		visitActions(v, this_);		
					
		visitor.inVirtualAttribute(this_);
		visitor.afterVirtualAttribute(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBooleanType(gbind.simpleocl.BooleanType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBooleanType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBooleanType(this_);
		
		visitActions(v, this_);		
					
		visitor.inBooleanType(this_);
		visitor.afterBooleanType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitTupleTypeAttribute(gbind.simpleocl.TupleTypeAttribute this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preTupleTypeAttribute(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeTupleTypeAttribute(this_);
		
		visitActions(v, this_);		
					
		visitor.inTupleTypeAttribute(this_);
		visitor.afterTupleTypeAttribute(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBaseHelper(gbind.dsl.BaseHelper this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBaseHelper(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBaseHelper(this_);
		
		visitActions(v, this_);		
					
		visitor.inBaseHelper(this_);
		visitor.afterBaseHelper(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitModule(gbind.simpleocl.Module this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preModule(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeModule(this_);
		
		visitActions(v, this_);		
					
		visitor.inModule(this_);
		visitor.afterModule(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitCollectionOperationCall(gbind.simpleocl.CollectionOperationCall this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preCollectionOperationCall(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeCollectionOperationCall(this_);
		
		visitActions(v, this_);		
					
		visitor.inCollectionOperationCall(this_);
		visitor.afterCollectionOperationCall(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBagType(gbind.simpleocl.BagType this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBagType(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBagType(this_);
		
		visitActions(v, this_);		
					
		visitor.inBagType(this_);
		visitor.afterBagType(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOperationCall(gbind.simpleocl.OperationCall this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOperationCall(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOperationCall(this_);
		
		visitActions(v, this_);		
					
		visitor.inOperationCall(this_);
		visitor.afterOperationCall(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitIteratorExp(gbind.simpleocl.IteratorExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preIteratorExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeIteratorExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inIteratorExp(this_);
		visitor.afterIteratorExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitOclModelElementExp(gbind.simpleocl.OclModelElementExp this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preOclModelElementExp(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeOclModelElementExp(this_);
		
		visitActions(v, this_);		
					
		visitor.inOclModelElementExp(this_);
		visitor.afterOclModelElementExp(this_);
		visitor.setCurrent(pop);	
	} 
	protected void visitBindingModel(gbind.dsl.BindingModel this_) {
		GBindVisitor visitor = this;
		VisitingActions v = visitor.preBindingModel(this_);
		if ( v == null ) {
			return;
		}
	
		EObject pop = visitor.getCurrent();
		visitor.setCurrent(this_);
		visitor.beforeBindingModel(this_);
		
		visitActions(v, this_);		
					
		visitor.inBindingModel(this_);
		visitor.afterBindingModel(this_);
		visitor.setCurrent(pop);	
	} 
		
	private void visitActions(VisitingActions v, EObject this_) {
		GBindVisitor visitor = this;
		
		for(VisitingAction va : v.getActions(this_)) {
			if ( va.isMethodCall() ) {
				va.performMethodCall();		
			} else if ( va.isFilter() ) {
				Object res = va.performMethodCall();
				if ( res instanceof java.util.Collection ) {
					for(Object o : (java.util.Collection<?>) res) {
						visit((EObject) o);
					}
				} else {
					visit((EObject) res);
				}
			} else if ( va.isReference() ) {
				EReference r = va.getEReference();
				
				Object refObj   = this_.eGet(r);
				if ( refObj == null ) continue;
				if ( refObj instanceof java.util.Collection ) {
					for(Object o : (java.util.Collection<?>) refObj) {
						visit((EObject) o);
					}
				} else {
					visit((EObject) refObj);
				}
			}
		}
	
	}
	
	private void visit(EObject obj) {	
	if ( obj.eClass().getName().equals("BindingOptions") ) { visitBindingOptions((gbind.dsl.BindingOptions) obj); return; }
	if ( obj.eClass().getName().equals("Import") ) { visitImport((gbind.simpleocl.Import) obj); return; }
	if ( obj.eClass().getName().equals("MapType") ) { visitMapType((gbind.simpleocl.MapType) obj); return; }
	if ( obj.eClass().getName().equals("SequenceType") ) { visitSequenceType((gbind.simpleocl.SequenceType) obj); return; }
	if ( obj.eClass().getName().equals("MapElement") ) { visitMapElement((gbind.simpleocl.MapElement) obj); return; }
	if ( obj.eClass().getName().equals("OclMetamodel") ) { visitOclMetamodel((gbind.simpleocl.OclMetamodel) obj); return; }
	if ( obj.eClass().getName().equals("AddOpCallExp") ) { visitAddOpCallExp((gbind.simpleocl.AddOpCallExp) obj); return; }
	if ( obj.eClass().getName().equals("EnvType") ) { visitEnvType((gbind.simpleocl.EnvType) obj); return; }
	if ( obj.eClass().getName().equals("TupleExp") ) { visitTupleExp((gbind.simpleocl.TupleExp) obj); return; }
	if ( obj.eClass().getName().equals("RelOpCallExp") ) { visitRelOpCallExp((gbind.simpleocl.RelOpCallExp) obj); return; }
	if ( obj.eClass().getName().equals("MulOpCallExp") ) { visitMulOpCallExp((gbind.simpleocl.MulOpCallExp) obj); return; }
	if ( obj.eClass().getName().equals("BagExp") ) { visitBagExp((gbind.simpleocl.BagExp) obj); return; }
	if ( obj.eClass().getName().equals("RealType") ) { visitRealType((gbind.simpleocl.RealType) obj); return; }
	if ( obj.eClass().getName().equals("ConcreteMetaclass") ) { visitConcreteMetaclass((gbind.dsl.ConcreteMetaclass) obj); return; }
	if ( obj.eClass().getName().equals("HelperParameter") ) { visitHelperParameter((gbind.dsl.HelperParameter) obj); return; }
	if ( obj.eClass().getName().equals("SetType") ) { visitSetType((gbind.simpleocl.SetType) obj); return; }
	if ( obj.eClass().getName().equals("ConceptMetaclass") ) { visitConceptMetaclass((gbind.dsl.ConceptMetaclass) obj); return; }
	if ( obj.eClass().getName().equals("LambdaType") ) { visitLambdaType((gbind.simpleocl.LambdaType) obj); return; }
	if ( obj.eClass().getName().equals("StaticPropertyCallExp") ) { visitStaticPropertyCallExp((gbind.simpleocl.StaticPropertyCallExp) obj); return; }
	if ( obj.eClass().getName().equals("Attribute") ) { visitAttribute((gbind.simpleocl.Attribute) obj); return; }
	if ( obj.eClass().getName().equals("OclFeatureDefinition") ) { visitOclFeatureDefinition((gbind.simpleocl.OclFeatureDefinition) obj); return; }
	if ( obj.eClass().getName().equals("ClassBinding") ) { visitClassBinding((gbind.dsl.ClassBinding) obj); return; }
	if ( obj.eClass().getName().equals("IntOpCallExp") ) { visitIntOpCallExp((gbind.simpleocl.IntOpCallExp) obj); return; }
	if ( obj.eClass().getName().equals("OclContextDefinition") ) { visitOclContextDefinition((gbind.simpleocl.OclContextDefinition) obj); return; }
	if ( obj.eClass().getName().equals("OclType") ) { visitOclType((gbind.simpleocl.OclType) obj); return; }
	if ( obj.eClass().getName().equals("ConceptHelper") ) { visitConceptHelper((gbind.dsl.ConceptHelper) obj); return; }
	if ( obj.eClass().getName().equals("MetamodelDeclaration") ) { visitMetamodelDeclaration((gbind.dsl.MetamodelDeclaration) obj); return; }
	if ( obj.eClass().getName().equals("SelfExp") ) { visitSelfExp((gbind.simpleocl.SelfExp) obj); return; }
	if ( obj.eClass().getName().equals("VirtualFeature") ) { visitVirtualFeature((gbind.dsl.VirtualFeature) obj); return; }
	if ( obj.eClass().getName().equals("IntegerExp") ) { visitIntegerExp((gbind.simpleocl.IntegerExp) obj); return; }
	if ( obj.eClass().getName().equals("MapExp") ) { visitMapExp((gbind.simpleocl.MapExp) obj); return; }
	if ( obj.eClass().getName().equals("BraceExp") ) { visitBraceExp((gbind.simpleocl.BraceExp) obj); return; }
	if ( obj.eClass().getName().equals("NotOpCallExp") ) { visitNotOpCallExp((gbind.simpleocl.NotOpCallExp) obj); return; }
	if ( obj.eClass().getName().equals("BaseFeatureBinding") ) { visitBaseFeatureBinding((gbind.dsl.BaseFeatureBinding) obj); return; }
	if ( obj.eClass().getName().equals("EqOpCallExp") ) { visitEqOpCallExp((gbind.simpleocl.EqOpCallExp) obj); return; }
	if ( obj.eClass().getName().equals("RenamingFeatureBinding") ) { visitRenamingFeatureBinding((gbind.dsl.RenamingFeatureBinding) obj); return; }
	if ( obj.eClass().getName().equals("SequenceExp") ) { visitSequenceExp((gbind.simpleocl.SequenceExp) obj); return; }
	if ( obj.eClass().getName().equals("OclModelElement") ) { visitOclModelElement((gbind.simpleocl.OclModelElement) obj); return; }
	if ( obj.eClass().getName().equals("SetExp") ) { visitSetExp((gbind.simpleocl.SetExp) obj); return; }
	if ( obj.eClass().getName().equals("TuplePart") ) { visitTuplePart((gbind.simpleocl.TuplePart) obj); return; }
	if ( obj.eClass().getName().equals("VirtualReference") ) { visitVirtualReference((gbind.dsl.VirtualReference) obj); return; }
	if ( obj.eClass().getName().equals("OperatorCallExp") ) { visitOperatorCallExp((gbind.simpleocl.OperatorCallExp) obj); return; }
	if ( obj.eClass().getName().equals("LocalVariable") ) { visitLocalVariable((gbind.simpleocl.LocalVariable) obj); return; }
	if ( obj.eClass().getName().equals("Iterator") ) { visitIterator((gbind.simpleocl.Iterator) obj); return; }
	if ( obj.eClass().getName().equals("ConcreteReferencDeclaringVar") ) { visitConcreteReferencDeclaringVar((gbind.dsl.ConcreteReferencDeclaringVar) obj); return; }
	if ( obj.eClass().getName().equals("BooleanExp") ) { visitBooleanExp((gbind.simpleocl.BooleanExp) obj); return; }
	if ( obj.eClass().getName().equals("IfExp") ) { visitIfExp((gbind.simpleocl.IfExp) obj); return; }
	if ( obj.eClass().getName().equals("Operation") ) { visitOperation((gbind.simpleocl.Operation) obj); return; }
	if ( obj.eClass().getName().equals("NavigationOrAttributeCall") ) { visitNavigationOrAttributeCall((gbind.simpleocl.NavigationOrAttributeCall) obj); return; }
	if ( obj.eClass().getName().equals("CollectionType") ) { visitCollectionType((gbind.simpleocl.CollectionType) obj); return; }
	if ( obj.eClass().getName().equals("OrderedSetExp") ) { visitOrderedSetExp((gbind.simpleocl.OrderedSetExp) obj); return; }
	if ( obj.eClass().getName().equals("IntermediateClassBinding") ) { visitIntermediateClassBinding((gbind.dsl.IntermediateClassBinding) obj); return; }
	if ( obj.eClass().getName().equals("OclFeatureBinding") ) { visitOclFeatureBinding((gbind.dsl.OclFeatureBinding) obj); return; }
	if ( obj.eClass().getName().equals("IterateExp") ) { visitIterateExp((gbind.simpleocl.IterateExp) obj); return; }
	if ( obj.eClass().getName().equals("LetExp") ) { visitLetExp((gbind.simpleocl.LetExp) obj); return; }
	if ( obj.eClass().getName().equals("VirtualClassBinding") ) { visitVirtualClassBinding((gbind.dsl.VirtualClassBinding) obj); return; }
	if ( obj.eClass().getName().equals("EnumLiteralExp") ) { visitEnumLiteralExp((gbind.simpleocl.EnumLiteralExp) obj); return; }
	if ( obj.eClass().getName().equals("StringType") ) { visitStringType((gbind.simpleocl.StringType) obj); return; }
	if ( obj.eClass().getName().equals("Parameter") ) { visitParameter((gbind.simpleocl.Parameter) obj); return; }
	if ( obj.eClass().getName().equals("ConceptFeatureRef") ) { visitConceptFeatureRef((gbind.dsl.ConceptFeatureRef) obj); return; }
	if ( obj.eClass().getName().equals("SuperExp") ) { visitSuperExp((gbind.simpleocl.SuperExp) obj); return; }
	if ( obj.eClass().getName().equals("StaticNavigationOrAttributeCall") ) { visitStaticNavigationOrAttributeCall((gbind.simpleocl.StaticNavigationOrAttributeCall) obj); return; }
	if ( obj.eClass().getName().equals("OclUndefinedExp") ) { visitOclUndefinedExp((gbind.simpleocl.OclUndefinedExp) obj); return; }
	if ( obj.eClass().getName().equals("TupleType") ) { visitTupleType((gbind.simpleocl.TupleType) obj); return; }
	if ( obj.eClass().getName().equals("PropertyCallExp") ) { visitPropertyCallExp((gbind.simpleocl.PropertyCallExp) obj); return; }
	if ( obj.eClass().getName().equals("EnvExp") ) { visitEnvExp((gbind.simpleocl.EnvExp) obj); return; }
	if ( obj.eClass().getName().equals("OclInstanceModel") ) { visitOclInstanceModel((gbind.simpleocl.OclInstanceModel) obj); return; }
	if ( obj.eClass().getName().equals("LambdaCallExp") ) { visitLambdaCallExp((gbind.simpleocl.LambdaCallExp) obj); return; }
	if ( obj.eClass().getName().equals("OrderedSetType") ) { visitOrderedSetType((gbind.simpleocl.OrderedSetType) obj); return; }
	if ( obj.eClass().getName().equals("OclAnyType") ) { visitOclAnyType((gbind.simpleocl.OclAnyType) obj); return; }
	if ( obj.eClass().getName().equals("VariableExp") ) { visitVariableExp((gbind.simpleocl.VariableExp) obj); return; }
	if ( obj.eClass().getName().equals("StaticOperationCall") ) { visitStaticOperationCall((gbind.simpleocl.StaticOperationCall) obj); return; }
	if ( obj.eClass().getName().equals("IntegerType") ) { visitIntegerType((gbind.simpleocl.IntegerType) obj); return; }
	if ( obj.eClass().getName().equals("StringExp") ) { visitStringExp((gbind.simpleocl.StringExp) obj); return; }
	if ( obj.eClass().getName().equals("LocalHelper") ) { visitLocalHelper((gbind.dsl.LocalHelper) obj); return; }
	if ( obj.eClass().getName().equals("VirtualTupleExp") ) { visitVirtualTupleExp((gbind.dsl.VirtualTupleExp) obj); return; }
	if ( obj.eClass().getName().equals("RealExp") ) { visitRealExp((gbind.simpleocl.RealExp) obj); return; }
	if ( obj.eClass().getName().equals("VirtualMetaclass") ) { visitVirtualMetaclass((gbind.dsl.VirtualMetaclass) obj); return; }
	if ( obj.eClass().getName().equals("VirtualAttribute") ) { visitVirtualAttribute((gbind.dsl.VirtualAttribute) obj); return; }
	if ( obj.eClass().getName().equals("BooleanType") ) { visitBooleanType((gbind.simpleocl.BooleanType) obj); return; }
	if ( obj.eClass().getName().equals("TupleTypeAttribute") ) { visitTupleTypeAttribute((gbind.simpleocl.TupleTypeAttribute) obj); return; }
	if ( obj.eClass().getName().equals("BaseHelper") ) { visitBaseHelper((gbind.dsl.BaseHelper) obj); return; }
	if ( obj.eClass().getName().equals("Module") ) { visitModule((gbind.simpleocl.Module) obj); return; }
	if ( obj.eClass().getName().equals("CollectionOperationCall") ) { visitCollectionOperationCall((gbind.simpleocl.CollectionOperationCall) obj); return; }
	if ( obj.eClass().getName().equals("BagType") ) { visitBagType((gbind.simpleocl.BagType) obj); return; }
	if ( obj.eClass().getName().equals("OperationCall") ) { visitOperationCall((gbind.simpleocl.OperationCall) obj); return; }
	if ( obj.eClass().getName().equals("IteratorExp") ) { visitIteratorExp((gbind.simpleocl.IteratorExp) obj); return; }
	if ( obj.eClass().getName().equals("OclModelElementExp") ) { visitOclModelElementExp((gbind.simpleocl.OclModelElementExp) obj); return; }
	if ( obj.eClass().getName().equals("BindingModel") ) { visitBindingModel((gbind.dsl.BindingModel) obj); return; }
		throw new IllegalStateException("Cannot handle class: " + obj.eClass().getName());
	}
	
	//
	// Framework code inlined as a template
	//
	
	public static class VisitingActions {
		private Object[] actions;
		public VisitingActions(Object... actions) {
			this.actions = actions;
		}
		
		public VisitingAction[] getActions(EObject obj) {
			VisitingAction[] result = new VisitingAction[actions.length];
			EClass  eclass      = obj.eClass();
			
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
		private GBindVisitor receptor;
		
		public VisitingAction(GBindVisitor receptor, java.lang.reflect.Method method, Object[] arguments) {
			actionType = METHOD_CALL;
			this.receptor = receptor;
			this.method = method;
			this.arguments = arguments;
		}

		public static VisitingAction createFilter(GBindVisitor  receptor, java.lang.reflect.Method method, Object[] arguments) {
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
