package genericity.compiler.atl.graph;

import org.eclipse.emf.common.util.EList;

import genericity.compiler.atl.analyser.ErrorModel;
import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.analyser.TypingModel;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.annotations.AtlAnnotation;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.CallExprAnn;
import genericity.typing.atl_types.annotations.ContextHelperAnn;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;
import genericity.typing.atl_types.annotations.HelperAnn;
import genericity.typing.atl_types.annotations.IfExprAnn;
import genericity.typing.atl_types.annotations.ImperativeRuleAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
import genericity.typing.atl_types.annotations.ModuleHelperAnn;
import genericity.typing.atl_types.annotations.OutputPatternAnn;
import genericity.typing.atl_types.annotations.RuleAnn;
import atl.metamodel.ATLModel;
import atl.metamodel.ATLModelBaseObject;
import atl.metamodel.ATLModelBaseObjectInterface;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.Helper;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IterateExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.CollectionOperationOverNoCollectionError;
import bento.analysis.atl_analysis.atl_error.DifferentBranchTypes;
import bento.analysis.atl_analysis.atl_error.FeatureNotFound;
import bento.analysis.atl_analysis.atl_error.FlattenOverNonNestedCollection;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_error.NoBindingForCompulsoryFeature;
import bento.analysis.atl_analysis.atl_error.OperationNotFound;

/**
 * Given an error model, generates the "path" in terms
 * of types that are needed to reach each error.
 * 
 * @author jesus
 *
 */
public class ErrorPathGenerator {
	private ErrorModel	errors;
	private TypingModel	typ;
	private ATLModel	atlModel;

	private DependencyGraph	graph;
	
	public ErrorPathGenerator(ErrorModel model, TypingModel typ, ATLModel atlModel) {
		this.errors = model;
		this.typ    = typ;
		this.atlModel = atlModel;
	}
	
	public DependencyGraph perform() {
		graph = new DependencyGraph();
		
		AnalysisResult r = this.errors.getAnalysis();
		for(Problem p : r.getProblems()) {
			if ( p instanceof LocalProblem ) {
				generatePath((LocalProblem) p);
			} else {
				throw new UnsupportedOperationException();
			}
		}
		
		return graph;
	}

	private void generatePath(LocalProblem p) {
		
		if ( p instanceof NoBindingForCompulsoryFeature ) {
			generatePath_NoBindingForCompulsoryFeature((NoBindingForCompulsoryFeature) p);		
		} else if ( p instanceof BindingExpectedOneAssignedMany ) {
			generatePath_BindingExpectedOneAssignedMany((BindingExpectedOneAssignedMany) p);				
		
		} else if ( p instanceof FeatureNotFound ) {
			generatePath_FeatureNotFound((FeatureNotFound) p);
		} else if ( p instanceof OperationNotFound ) {
			generatePath_OperationNotFound((OperationNotFound) p);			
		} else if ( p instanceof CollectionOperationOverNoCollectionError ) {
			System.err.println("ErrorPathGenerator: Ignored CollectionOperationOverNoCollectionError" );			
		} else if ( p instanceof FlattenOverNonNestedCollection ) {
			System.err.println("ErrorPathGenerator: Ignored FlattenOverNonNestedCollectionImpl" );
		} else if ( p instanceof DifferentBranchTypes ) {
			System.err.println("ErrorPathGenerator: Ignored DifferentBranchTypes" );
		} else {
			throw new UnsupportedOperationException(p.getClass().getName());
		}
		
	}


	private void generatePath_FeatureNotFound(FeatureNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		ExpressionProblemNode node = new ExpressionProblemNode(p, atlExpr);
		graph.linkProblemToNode(p, node);
		
		pathFromErrorExpression(atlExpr.getSource(), 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.getSource().original_()), node);
	}

	private void generatePath_OperationNotFound(OperationNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		ExpressionProblemNode node = new ExpressionProblemNode(p, atlExpr);
		graph.linkProblemToNode(p, node);
		
		pathFromErrorExpression(atlExpr.getSource(), 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.getSource().original_()), node);		
	}
	

	private void pathFromErrorExpression(OclExpression start, ExpressionAnnotation startAnn, DependencyNode depNode) {
		// Try to find an iterator
		ATLModelBaseObject parent = start.container_(); // TODO: Iterate
		while ( ! (parent instanceof IteratorExp || (parent instanceof IterateExp) ) ) {
			if ( (parent instanceof Rule) || (parent instanceof Helper) ) {
				parent = null;
				break;
			}
			parent = parent.container_();
		}

		// It is an iterator
		if ( parent != null ) {
			start = ((IteratorExp) parent).getSource();
			startAnn = (ExpressionAnnotation) typ.getAnnotation(start.original_());
		}

		DelimitedExpressionNode node = new DelimitedExpressionNode(start, startAnn);
		depNode.addDependency(node);
	
		pathToControlFlow(start, node);
		
		/*
		OclExpression start = expr;
		ExpressionAnnotation startAnn = (ExpressionAnnotation) typ.getAnnotation(start.original_());
		
		// TODO: Merge with the other branch if needed...
		// TODO: Take into account that the container maybe a rule or a helper...
		//       For the moment assume a rule...
		ATLModelBaseObject parent = start.container_(); // TODO: Iterate
		while ( ! ( (parent instanceof Rule) || (parent instanceof Helper) || 
				    (parent instanceof IteratorExp || (parent instanceof IterateExp) ))) {

			if ( parent instanceof IfExp ) {
				pathToIfExpr((IfExp) parent, depNode);
				return;
				//	throw new UnsupportedOperationException();
			}
			
			parent = parent.container_();
		}
		
		DelimitedExpressionNode node = null;

		if ( parent instanceof IteratorExp ) {
			start = ((IteratorExp) parent).getSource();
			startAnn = (ExpressionAnnotation) typ.getAnnotation(start.original_());
		}
		
		node = new DelimitedExpressionNode(start, startAnn);
		depNode.addDependency(node);

		pathToSomewhere(parent, node);
		*/
	}

	private void pathForCall(OclExpression call, DependencyNode depNode) {
		// pathToControlFlow(expr, hNode);

		/*
		System.out.println("pathForCall: " +  OclGenerator.gen(call) );
		OclExpression lastParent  = call;
		ATLModelBaseObject parent = call.container_(); 
		while ( parent instanceof OclExpression) {
			if ( parent instanceof IfExp ) {
				break;
			}
			lastParent = (OclExpression) parent;
			parent = parent.container_();
		}
		
		ExpressionAnnotation lastParentAnn = (ExpressionAnnotation) typ.getAnnotation(lastParent.original_());
		
		
		DelimitedExpressionNode node = new DelimitedExpressionNode(lastParent, lastParentAnn);
		depNode.addDependency(node);
	
		pathToControlFlow(lastParent, node);
		*/
		
		ExpressionAnnotation ann = (ExpressionAnnotation) typ.getAnnotation(call.original_());
		
		DelimitedExpressionNode node = new DelimitedExpressionNode(call, ann);
		depNode.addDependency(node);
		
		pathToControlFlow(call, node);
	}

	private void pathToControlFlow(OclExpression start, DependencyNode node) {
		ATLModelBaseObject lastParent = (ATLModelBaseObject) start; 
		ATLModelBaseObject parent = start.container_(); 
		while ( ! ( (parent instanceof Rule) || (parent instanceof Helper) ||
				    (parent instanceof IfExp ))) {
			lastParent = parent;
			parent = parent.container_();
		}
		
	    AtlAnnotation ann = typ.getAnnotation(parent.original_());
			
		// QUITAR ESTE IF Y PONERLO EN PATH_TO_SOMEWHERE
		if ( parent instanceof Rule ) {
			pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node);
		} else if ( parent instanceof Helper ){
			pathFromHelper((HelperAnn) typ.getAnnotation(parent.original_()), node);			
		//} else if ( parent instanceof IteratorExp ) {
		//	pathToSomewhere(parent, node);
		} else if ( parent instanceof IfExp ) {
			pathFromIfExpr((IfExp) parent, (OclExpression) lastParent, node);
		/*} else if ( parent instanceof Binding ) {
			Rule r = parent.container_().container_().container(Rule.class);
			pathToRule((RuleAnn) typ.getAnnotation(r.original_()), node);
		} else if ( parent instanceof OclExpression ) {
			pathToControlFlow((OclExpression) parent, node);
		*/} else {
			throw new UnsupportedOperationException();
		}
	}


	private void pathFromIfExpr(IfExp expr, OclExpression directChild, DependencyNode node) {
		boolean branch;
		if ( expr.getThenExpression() == directChild ) {
			branch = ConditionalNode.TRUE_BRANCH;
		} else {
			branch = ConditionalNode.FALSE_BRANCH;
		}
		
		IfExprAnn ann = (IfExprAnn) typ.getAnnotation(expr.original_());
		ConditionalNode newNode = new ConditionalNode(expr, branch);
		node.addDependency(newNode);
		
		pathToControlFlow(expr, newNode);
	}



	private void generatePath_BindingExpectedOneAssignedMany(BindingExpectedOneAssignedMany p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );

		ProblemNode node = new BindingExpectedOneAssignedManyNode(p, atlBinding);
		graph.linkProblemToNode(p, node);
		
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node);	
		
		pathToBinding(atlBinding, b, node);
	}
	
	private void pathToBinding(Binding atlBinding , BindingAnn b, ProblemNode node) {
		RuleResolutionNode resolutionNode = new RuleResolutionNode(atlBinding, b);
		node.addDependency(resolutionNode);
		for(MatchedRuleAnn mr : b.getResolvedBy()) {
			pathToRule(mr, resolutionNode);
		}
	}

	private void generatePath_NoBindingForCompulsoryFeature(NoBindingForCompulsoryFeature p) {
		ProblemNode node = new NoBindingAssignmentNode(p);
		graph.linkProblemToNode(p, node);
		
		OutputPatternAnn op = (OutputPatternAnn) typ.getAnnotation(p.getElement());
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node);	
	}
	
	private void pathToRule(RuleAnn rule, DependencyNode dependent) {
		if ( rule instanceof MatchedRuleAnn ) {
			pathToMatchedRuleOne((MatchedRuleAnn) rule, dependent);
		} else if ( rule instanceof LazyRuleAnn ) {
			pathToLazyRule((LazyRuleAnn) rule, dependent);
		} else {
			throw new UnsupportedOperationException(rule.getClass().getName());
		}
	}
	
	private void pathToLazyRule(LazyRuleAnn rule, DependencyNode dependent) {
		Rule r =  (Rule) atlModel.findWrapper( rule.getRule() );
		ImperativeRuleExecution node = new ImperativeRuleExecution(rule, r);
		dependent.addDependency(node);
		for(CallExprAnn callExprAnn : rule.getCalledBy()) {
			 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
			 pathForCall(expr, node);				 			
		}
	}

	private void pathFromHelper(HelperAnn helperAnn, DependencyNode depNode) {
		Helper h =  (Helper) atlModel.findWrapper( helperAnn.getHelper() );
		HelperInvocationNode hNode = new HelperInvocationNode(h, helperAnn);
		depNode.addDependency(hNode);
		
		if ( helperAnn instanceof ModuleHelperAnn ) {
			throw new UnsupportedOperationException();			
		} else if ( helperAnn instanceof ContextHelperAnn ) {
			EList<CallExprAnn> callers = ((ContextHelperAnn) helperAnn).getPolymorphicCalledBy();
			for (CallExprAnn callExprAnn : callers) {
				 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
				 pathForCall(expr, hNode);				 
			}
			//pathToExpression(expr, annotation, depNode)
			//System.out.println(callers.size());
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void pathToMatchedRuleOne(MatchedRuleAnn rule, DependencyNode dependent) {		
		MatchedRule r = (MatchedRule) atlModel.findWrapper( rule.getRule() );
		// VariableDeclaration v = r.getInPattern().getElements().get(0);
		
		MatchedRuleExecution newNode = new MatchedRuleExecution(rule, r);
		dependent.addDependency(newNode);
		
		if ( rule.getFilter() != null ) {
			DependencyNode constraint = pathToFilterExpression(rule.getFilter());
			newNode.setConstraint(constraint);
		}
		
		graph.addRule(newNode);
	}

	private DependencyNode pathToFilterExpression(ExpressionAnnotation expr) {
		OclExpression atlOcl = (OclExpression) atlModel.findWrapper( expr.getExpr() );

		SatisfiesConstraintNode node = new SatisfiesConstraintNode(atlOcl);
		
		return node;
	}
	
	/*
	private void generatePath_NoBindingForCompulsoryFeature(NoBindingForCompulsoryFeature p) {
		
		ErrorPath path = new ErrorPath();
		
		OutputPatternAnn op = (OutputPatternAnn) typ.getAnnotation(p.getElement());
		RuleAnn rule = (RuleAnn) op.eContainer();
		
		pathToRule(rule, path);
		
		System.out.println(op);
		System.out.println(rule.getName());
	}

	private void pathToRule(RuleAnn rule, ErrorPath path) {
		if ( rule instanceof MatchedRuleOneAnn ) {
			pathToMatchedRuleOne((MatchedRuleOneAnn) rule, path);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private void pathToMatchedRuleOne(MatchedRuleOneAnn rule, ErrorPath path) {		
		MatchedRule r = (MatchedRule) atlModel.findWrapper( rule.getRule() );
		VariableDeclaration v = r.getInPattern().getElements().get(0);
		
		ObjectPath objectPath = new ObjectPath(rule.getInPatternType(),  v);
		
		if ( rule.getFilter() != null ) {
			objectPath.addConstraint(rule.getFilter());
		}

		
		path.addMatchedRule(rule);		
	}
	*/
	
	
}
