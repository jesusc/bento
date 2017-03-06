package bento.adapter.atl.visitors;

import gbind.dsl.HelperParameter;
import gbind.dsl.LocalHelper;
import gbind.dsl.MetamodelDeclaration;
import gbind.dsl.VirtualTupleExp;
import gbind.simpleocl.AddOpCallExp;
import gbind.simpleocl.BooleanExp;
import gbind.simpleocl.BooleanType;
import gbind.simpleocl.CollectionOperationCall;
import gbind.simpleocl.EnumLiteralExp;
import gbind.simpleocl.EqOpCallExp;
import gbind.simpleocl.IfExp;
import gbind.simpleocl.IntOpCallExp;
import gbind.simpleocl.IntegerExp;
import gbind.simpleocl.IntegerType;
import gbind.simpleocl.IterateExp;
import gbind.simpleocl.Iterator;
import gbind.simpleocl.IteratorExp;
import gbind.simpleocl.LetExp;
import gbind.simpleocl.LocalVariable;
import gbind.simpleocl.MulOpCallExp;
import gbind.simpleocl.NavigationOrAttributeCall;
import gbind.simpleocl.NotOpCallExp;
import gbind.simpleocl.OclAnyType;
import gbind.simpleocl.OclExpression;
import gbind.simpleocl.OclModelElementExp;
import gbind.simpleocl.OclUndefinedExp;
import gbind.simpleocl.OperationCall;
import gbind.simpleocl.OperatorCallExp;
import gbind.simpleocl.PropertyCall;
import gbind.simpleocl.PropertyCallExp;
import gbind.simpleocl.RealExp;
import gbind.simpleocl.RealType;
import gbind.simpleocl.RelOpCallExp;
import gbind.simpleocl.SelfExp;
import gbind.simpleocl.SequenceExp;
import gbind.simpleocl.SetExp;
import gbind.simpleocl.StringExp;
import gbind.simpleocl.StringType;
import gbind.simpleocl.TupleExp;
import gbind.simpleocl.VariableExp;

import java.util.HashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.ATL.ATLFactory;
import anatlyzer.atlext.ATL.ContextHelper;
import anatlyzer.atlext.ATL.Helper;
import anatlyzer.atlext.OCL.CollectionOperationCallExp;
import anatlyzer.atlext.OCL.NavigationOrAttributeCallExp;
import anatlyzer.atlext.OCL.OCLFactory;
import anatlyzer.atlext.OCL.OclContextDefinition;
import anatlyzer.atlext.OCL.OclFeatureDefinition;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.OCL.OclType;
import anatlyzer.atlext.OCL.Operation;
import anatlyzer.atlext.OCL.OperationCallExp;
import anatlyzer.atlext.OCL.Parameter;
import anatlyzer.atlext.OCL.TuplePart;
import anatlyzer.atlext.OCL.VariableDeclaration;
import bento.adapter.atl.IComponentInfoForBinding;
import bento.adapter.atl.util.TPat;
import bento.adapter.gbind.visitors.GBindVisitor;


/**
 * This visitor transforms an OCL expression in the GBind format to the
 * ATL format. 
 * 
 * @author jesus
 *
 */
public class GbindToATL extends GBindVisitor {

	public HashMap<EObject, EObject> trace = new HashMap<EObject, EObject>();
	private ExternalContext ctx;
	private ATLModel atlModel;
	private IComponentInfoForBinding info;

	public static interface ExternalContext {
		OclModel getTraceFor(MetamodelDeclaration mm);
	}

	public GbindToATL(ATLModel atlModel, IComponentInfoForBinding info) {
		this.atlModel = atlModel;
		this.info = info;
	}
	
	public Helper transform(LocalHelper self) { //, ExternalContext ctx) {
		this.ctx = ctx;
		startVisiting(self);
		return (Helper) g(self);
	}

	public anatlyzer.atlext.OCL.OclExpression transform(OclExpression oclExpr) { //, ExternalContext ctx) {
		this.ctx = ctx;
		startVisiting(oclExpr);
		
		return expr(oclExpr);
	}

	@Override
	public void inLocalHelper(LocalHelper self) {
		ContextHelper atl = link(self, ATLFactory.eINSTANCE.createContextHelper());
		OclFeatureDefinition def = OCLFactory.eINSTANCE.createOclFeatureDefinition();
	
		Operation op = OCLFactory.eINSTANCE.createOperation();
		def.setFeature( op );
		atl.setDefinition( def );
				
		op.setName( self.getFeature() );
		self.getParameters().forEach(p -> op.getParameters().add((Parameter) g(p)));
		op.setBody( expr(self.getBody() ));
		op.setReturnType( (OclType) g(self.getType() ));
		
		OclContextDefinition context_ = OCLFactory.eINSTANCE.createOclContextDefinition();
		OclModelElement contextType   = OCLFactory.eINSTANCE.createOclModelElement();
		contextType.setName( self.getContext().getName() );

		// Due to rewriting steps, in principle it doesn't matter to map this to the bound meta-model
		// or to the concept meta-model
		OclModel metamodel = AdaptationUtils.getMetamodel(atlModel, info.getConceptMetamodelName());
		contextType.setModel( metamodel );
		
		context_.setContext_( contextType );
		
		def.setContext_(context_);
	}

	@Override
	public VisitingActions preLocalHelper(LocalHelper self) {
		return actions("type" , "parameters", "body");
	}	
	
	@Override
	public void inHelperParameter(HelperParameter self) {
		Parameter atl = link(self, OCLFactory.eINSTANCE.createParameter());
		atl.setVarName( self.getVarName() );
		atl.setType( (OclType) g(self.getType()) );
	}
	
	@Override
	public VisitingActions preIteratorExp(IteratorExp self) {
		return actions("iterators", "body");
	}
	
	@Override
	public VisitingActions preIterateExp(IterateExp self) {
		return actions("iterators", "result", "body");
	}
	
	@Override
	public void inIteratorExp(IteratorExp self) {
		anatlyzer.atlext.OCL.IteratorExp atl = link(self, OCLFactory.eINSTANCE.createIteratorExp());
		atl.setName( self.getName() );
		atl.setBody( expr(self.getBody()) );
		
		self.getIterators().forEach(it -> {  			
			atl.getIterators().add( (anatlyzer.atlext.OCL.Iterator) g(it) );		
		});
	}
	
	@Override
	public void inIterateExp(IterateExp self) {
		// Similar toiterator
		anatlyzer.atlext.OCL.IterateExp atl = link(self, OCLFactory.eINSTANCE.createIterateExp());
		atl.setBody( expr(self.getBody()) );
		atl.setResult( (VariableDeclaration) g(self.getResult() ) );
		self.getIterators().forEach(it -> {  			
			atl.getIterators().add( (anatlyzer.atlext.OCL.Iterator) g(it) );		
		});
	}
	
	@Override
	public void inIterator(Iterator self) {
		anatlyzer.atlext.OCL.Iterator it2 = link(self, OCLFactory.eINSTANCE.createIterator());
		it2.setVarName( self.getVarName() );
	}
	
	@Override
	public void inOperatorCallExp(OperatorCallExp self) {
		anatlyzer.atlext.OCL.OperatorCallExp atl = link(self, OCLFactory.eINSTANCE.createOperatorCallExp());
		if ( self.getOperationName() == null )
			throw new IllegalStateException();
		atl.setOperationName( self.getOperationName() );
		atl.setSource( expr(self.getSource() ));
		atl.getArguments().add( expr(self.getArgument()) );
	}
	
	@Override
	public void inAddOpCallExp(AddOpCallExp self) { inOperatorCallExp(self); }
	@Override
	public void inEqOpCallExp(EqOpCallExp self) { inOperatorCallExp(self); }
	@Override
	public void inIntOpCallExp(IntOpCallExp self) { inOperatorCallExp(self); }
	@Override
	public void inMulOpCallExp(MulOpCallExp self) { inOperatorCallExp(self); }
	@Override
	public void inNotOpCallExp(NotOpCallExp self) { inOperatorCallExp(self); }
	@Override
	public void inRelOpCallExp(RelOpCallExp self) { inOperatorCallExp(self); }

	@Override
	public void inPropertyCallExp(PropertyCallExp self) {
		// Contrary to ATL, ProperyCallExp is a concrete class, containing
		// a list of PropertyCall objects, with subclasses: NavigationOrAttributeCall, CollectionOperationCall, OperationCall
		
		Function<PropertyCall, anatlyzer.atlext.OCL.PropertyCallExp> mapFunction = (pc) -> {
			return (anatlyzer.atlext.OCL.PropertyCallExp) g(pc);
		};
		
		BiFunction<	anatlyzer.atlext.OCL.PropertyCallExp, 
					anatlyzer.atlext.OCL.PropertyCallExp, 
					anatlyzer.atlext.OCL.PropertyCallExp> joinFunction = (pc1, pc2) -> {						
			pc2.setSource(pc1);
			return pc2;
		};
		
		anatlyzer.atlext.OCL.PropertyCallExp treeForm = TPat.listToTree(self.getCalls(), mapFunction, joinFunction);
		link(self, treeForm);

		// The first call is the inner one in the tree, so set it manually
		anatlyzer.atlext.OCL.PropertyCallExp firstCall = (anatlyzer.atlext.OCL.PropertyCallExp) g(self.getCalls().get(0));
		firstCall.setSource( expr(self.getSource() ));
	}
	
	@Override
	public void inOperationCall(OperationCall self) {
		OperationCallExp atl = link(self, OCLFactory.eINSTANCE.createOperationCallExp());
		atl.setOperationName( self.getOperationName() );
		self.getArguments().forEach(a -> atl.getArguments().add(expr(a)) );
	}	
	
	@Override
	public void inCollectionOperationCall(CollectionOperationCall self) {
		CollectionOperationCallExp atl = link(self, OCLFactory.eINSTANCE.createCollectionOperationCallExp());
		atl.setOperationName( self.getOperationName() );
		self.getArguments().forEach(a -> atl.getArguments().add(expr(a)) );		
	}
	
	@Override
	public void inNavigationOrAttributeCall(NavigationOrAttributeCall self) {
		NavigationOrAttributeCallExp atl = link(self, OCLFactory.eINSTANCE.createNavigationOrAttributeCallExp());
		atl.setName( self.getName() );
	}
	
	@Override
	public void inOclModelElementExp(OclModelElementExp self) {
		OclModelElement atl = link(self, OCLFactory.eINSTANCE.createOclModelElement());
		atl.setName( self.getName() );
		atl.setModel( (OclModel) g(self.getModel() ));
	}

	@Override
	public void inIfExp(IfExp self) {
		anatlyzer.atlext.OCL.IfExp atl = link(self, OCLFactory.eINSTANCE.createIfExp());
		atl.setCondition( expr(self.getCondition() ));
		atl.setThenExpression( expr(self.getThenExpression() ));
		atl.setElseExpression( expr(self.getElseExpression() ));
	}
	
	@Override
	public void inLetExp(LetExp self) {
		anatlyzer.atlext.OCL.LetExp atl = link(self, OCLFactory.eINSTANCE.createLetExp());
		atl.setIn_( expr(self.getIn_() ));
		atl.setVariable( (VariableDeclaration) g(self.getVariable() ));
	}
	
	@Override
	public void inLocalVariable(LocalVariable self) {
		VariableDeclaration varDcl = link(self, OCLFactory.eINSTANCE.createVariableDeclaration());
		varDcl.setVarName( self.getVarName() );
		varDcl.setInitExpression( (anatlyzer.atlext.OCL.OclExpression) g0(self.getInitExpression() ));
		varDcl.setType( (OclType) g0(self.getType() ));
	}
	
	@Override
	public void inVariableExp(VariableExp self) {
		anatlyzer.atlext.OCL.VariableExp atl = link(self, OCLFactory.eINSTANCE.createVariableExp());
		atl.setReferredVariable( (VariableDeclaration) g(self.getReferredVariable() ));
	}

	@Override
	public void inSelfExp(SelfExp self) {
		anatlyzer.atlext.OCL.VariableExp atl = link(self, OCLFactory.eINSTANCE.createVariableExp());
		VariableDeclaration varDcl = OCLFactory.eINSTANCE.createVariableDeclaration();
		varDcl.setVarName("self"); // TODO: This gets hanging nowhere... may provoke problems when serializing
		atl.setReferredVariable(varDcl);
	}

	//
	// Simple expressions
	//
	
	@Override
	public void inRealExp(RealExp self) {
		anatlyzer.atlext.OCL.RealExp atl = link(self, OCLFactory.eINSTANCE.createRealExp());
		atl.setRealSymbol( self.getRealSymbol() );		
	}
	
	@Override
	public void inStringExp(StringExp self) {
		anatlyzer.atlext.OCL.StringExp atl = link(self, OCLFactory.eINSTANCE.createStringExp());
		atl.setStringSymbol( self.getStringSymbol() );		
	}
	
	@Override
	public void inIntegerExp(IntegerExp self) {
		anatlyzer.atlext.OCL.IntegerExp atl = link(self, OCLFactory.eINSTANCE.createIntegerExp());
		atl.setIntegerSymbol( self.getIntegerSymbol() );		
	}
	
	@Override
	public void inBooleanExp(BooleanExp self) {
		anatlyzer.atlext.OCL.BooleanExp atl = link(self, OCLFactory.eINSTANCE.createBooleanExp());
		atl.setBooleanSymbol( self.isBooleanSymbol() );		
	}
	
	@Override
	public void inSequenceExp(SequenceExp self) {
		anatlyzer.atlext.OCL.SequenceExp atl = link(self, OCLFactory.eINSTANCE.createSequenceExp());
		self.getElements().forEach(e -> atl.getElements().add(expr(e)));
	}
	
	@Override
	public void inEnumLiteralExp(EnumLiteralExp self) {
		anatlyzer.atlext.OCL.EnumLiteralExp atl = link(self, OCLFactory.eINSTANCE.createEnumLiteralExp());
		atl.setName( self.getName() );
	}
	
	@Override
	public void inTupleExp(TupleExp self) {
		anatlyzer.atlext.OCL.TupleExp atl = link(self, OCLFactory.eINSTANCE.createTupleExp() );
		self.getTuplePart().forEach(p -> atl.getTuplePart().add( (TuplePart) g(p) ));
	}

	@Override
	public void inVirtualTupleExp(VirtualTupleExp self) {
		inTupleExp(self);
		
		TuplePart typePart = OCLFactory.eINSTANCE.createTuplePart();
		typePart.setVarName( "type__" );
		anatlyzer.atlext.OCL.StringExp stringLit = OCLFactory.eINSTANCE.createStringExp();
		stringLit.setStringSymbol(self.getTypeName());
		typePart.setInitExpression( stringLit );
		
		anatlyzer.atlext.OCL.TupleExp tuple = (anatlyzer.atlext.OCL.TupleExp) g(self);
		tuple.getTuplePart().add(typePart);
	}
	
	@Override
	public void inTuplePart(gbind.simpleocl.TuplePart self) {
		TuplePart atl = link(self, OCLFactory.eINSTANCE.createTuplePart());
		atl.setVarName( self.getVarName() );
		atl.setInitExpression( (anatlyzer.atlext.OCL.OclExpression) g0(self.getInitExpression() ));
	}
	
	@Override
	public void inOclModel(gbind.simpleocl.OclModel self) {
		OclModel atl = link(self, OCLFactory.eINSTANCE.createOclModel());
		atl.setName( self.getName() );
	}

	@Override
	public void inOclModelElement(gbind.simpleocl.OclModelElement self) {
		OclModelElement atl = link(self, OCLFactory.eINSTANCE.createOclModelElement());
		atl.setName( self.getName() );
		atl.setModel( (OclModel) g0(self.getModel() ));
	}
	
	@Override
	public void inOclAnyType(OclAnyType self) {
		link(self, OCLFactory.eINSTANCE.createOclAnyType());		
	}
	
	@Override
	public void inIntegerType(IntegerType self) {
		link(self, OCLFactory.eINSTANCE.createIntegerType());
	}
	
	@Override
	public void inRealType(RealType self) {
		link(self, OCLFactory.eINSTANCE.createRealType());
	}
	
	@Override
	public void inBooleanType(BooleanType self) {
		link(self, OCLFactory.eINSTANCE.createBooleanType());
	}
	
	@Override
	public void inStringType(StringType self) {
		link(self, OCLFactory.eINSTANCE.createStringType());
	}
		
	@Override
	public void inSetExp(SetExp self) {
		anatlyzer.atlext.OCL.SetExp atl = OCLFactory.eINSTANCE.createSetExp();
		self.getElements().forEach(e -> atl.getElements().add(expr(e)) );
		link(self, atl);
	}
	
	
	
	///
	
	@Override
	public void inOclUndefinedExp(OclUndefinedExp self) {
		link(self, OCLFactory.eINSTANCE.createOclUndefinedExp());
	}
	
	protected EObject g0(EObject e) {
		if ( e == null ) return null;
		return g(e);
	}

	protected <T extends EObject> T link(EObject s, T t) {
		if ( trace.containsKey(s) ) 
			throw new IllegalStateException("Object " + s + " already registered in the trace");
		trace.put(s, t);
		return (T) t;
	}
	
	// This generate an ocl model element each time... not the most efficient approach, but works
	public OclModel createMetamodelDeclaration(MetamodelDeclaration self) {
		OclModel atl = link(self, OCLFactory.eINSTANCE.createOclModel());
		atl.setName(self.getName());		
		return atl;
	}
	
	protected EObject g(EObject e) {
		EObject r = trace.get(e);
		if ( r == null ) {
			if ( e instanceof MetamodelDeclaration ) {
				return createMetamodelDeclaration((MetamodelDeclaration) e);
				// return ctx.getTraceFor((MetamodelDeclaration) e);
			}
			
			String location = "";
			if ( e instanceof gbind.simpleocl.LocatedElement ) {
				// location = "at " + ((gbind.simpleocl.LocatedElement) e).getLine();
			}
			throw new IllegalStateException("No trace for " + e + location);
		}
		return r;
	}
	
	protected anatlyzer.atlext.OCL.OclExpression expr(OclExpression e) {
		return (anatlyzer.atlext.OCL.OclExpression) g(e);
	}
	
}
