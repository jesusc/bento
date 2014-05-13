package genericity.compiler.atl.graph;

import java.util.HashSet;
import java.util.Set;

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
import atl.metamodel.OCL.LoopExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.PropertyCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;
import bento.analysis.atl_analysis.AnalysisResult;
import bento.analysis.atl_analysis.Problem;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved;
import bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule;
import bento.analysis.atl_analysis.atl_error.BindingWithoutRule;
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


	public DependencyGraph perform(Problem p) {
		graph = new DependencyGraph();
		generatePath((LocalProblem) p);
		return graph;
	}

	private void generatePath(LocalProblem p) {
		// System.out.println(p.getClass().getName() + " " + p.getDescription() + " " + p.getLocation()) ;
		if ( p instanceof NoBindingForCompulsoryFeature ) {
			generatePath_NoBindingForCompulsoryFeature((NoBindingForCompulsoryFeature) p);		
		
		// These two are very similar
		} else if ( p instanceof BindingExpectedOneAssignedMany ) {
			generatePath_BindingExpectedOneAssignedMany((BindingExpectedOneAssignedMany) p);				
		} else if ( p instanceof BindingWithResolvedByIncompatibleRule ) {
			generatePath_BindingWithResolvedByIncompatibleRule((BindingWithResolvedByIncompatibleRule) p);
				
		} else if ( p instanceof FeatureNotFound ) {
			generatePath_FeatureNotFound((FeatureNotFound) p);
		} else if ( p instanceof OperationNotFound ) {
			generatePath_OperationNotFound((OperationNotFound) p);			
			/*
		} else if ( p instanceof CollectionOperationOverNoCollectionError ) {
			System.err.println("ErrorPathGenerator: Ignored CollectionOperationOverNoCollectionError" );			
		} else if ( p instanceof FlattenOverNonNestedCollection ) {
			System.err.println("ErrorPathGenerator: Ignored FlattenOverNonNestedCollectionImpl" );
		} else if ( p instanceof DifferentBranchTypes ) {
			System.err.println("ErrorPathGenerator: Ignored DifferentBranchTypes" );
		} else if ( p instanceof BindingPossiblyUnresolved ) {
			System.err.println("ErrorPathGenerator: Ignored BindingPossiblyUnresolved" );
		} else if ( p instanceof BindingWithoutRule ) {
			System.err.println("ErrorPathGenerator: Ignored BindingWithoutRule" );
		*/
		} else {
			System.err.println("ErrorPathGenerator: Ignored " + p.getClass().getSimpleName());
		}
		
	}


	private void generatePath_FeatureNotFound(FeatureNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		ExpressionProblemNode node = new ExpressionProblemNode(p, atlExpr);
		graph.linkProblemToNode(p, node);
		// System.out.println(p);
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
	
	public ATLModelBaseObject findControlFlowConstruct(ATLModelBaseObject element) {
		ATLModelBaseObject parent = element.container_();
		while ( ! isControlFlowElement(parent) ) {
			if ( isIteration(parent) ) {
				return parent;
			}
			parent = parent.container_();
		}
		
		return parent;
	}
	
	private void pathFromErrorExpression(OclExpression start, ExpressionAnnotation startAnn, DependencyNode depNode) {		
		TraversedSet traversed = new TraversedSet();
		
		// Handle the special case "varName.error", to avoid generating a node with just "varName" which
		// is redundant (variable names represents objects that must exist)
		if ( start instanceof VariableExp ) {
			VariableExp v = (VariableExp) start;
			if ( v.getReferredVariable().getVarName().equals("thisModule") ) throw new UnsupportedOperationException();

			pathToControlFlow(start.container_(), depNode, traversed);
		} else {
			DelimitedExpressionNode node = new DelimitedExpressionNode(start, startAnn);
			depNode.addDependency(node);
	
			pathToControlFlow(start, node, traversed);
		}
		
	}

	private void pathForCall(OclExpression call, DependencyNode depNode, TraversedSet traversed) {
		CallExprAnn ann = (CallExprAnn) typ.getAnnotation(call.original_());
		
		CallExprNode node = new CallExprNode((PropertyCallExp) call, ann);
		depNode.addDependency(node);
		
		// This used to work, but seems redundant
		/*
		ATLModelBaseObject parent = call.container_();
		while ( ! isControlFlowElement(parent) ) {
			if ( isIteration(parent) ) {
				LoopExp exp = (LoopExp) parent;
				LoopNode loop = new LoopNode(exp.getSource(), exp.getIterators().get(0));
				node.addDependency(loop);
				
				// pathToControlFlow(exp.getSource(), loop);
				pathToControlFlow(parent, loop); 
				return;
			}
			parent = parent.container_();
		}
		*/
		
		pathToControlFlow(call, node, traversed);
	}

	private boolean isIteration(ATLModelBaseObject element) {
		return element instanceof LoopExp;
	}

	public boolean isControlFlowElement(ATLModelBaseObject element) {
		return (element instanceof Rule) || (element instanceof Helper) ||
			    (element instanceof IfExp );
	}
	
	private void pathToControlFlow(ATLModelBaseObjectInterface start, DependencyNode node, TraversedSet traversed) {
		ATLModelBaseObject lastParent = (ATLModelBaseObject) start; 
		ATLModelBaseObject parent = start.container_(); 
		while ( ! isControlFlowElement(parent) ) {
			if ( isIteration(parent) ) {
				LoopExp exp = (LoopExp) parent;
				LoopNode loop = new LoopNode(exp.getSource(), exp.getIterators().get(0));
				node.addDependency(loop);
				
				// ?? Different from the pathToCall
				pathToControlFlow((OclExpression) parent, loop, traversed);
				return;
			}
			
			lastParent = parent;
			parent = parent.container_();
		}
		
	    AtlAnnotation ann = typ.getAnnotation(parent.original_());
			
		// QUITAR ESTE IF Y PONERLO EN PATH_TO_SOMEWHERE
		if ( parent instanceof Rule ) {
			pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node, traversed);
		} else if ( parent instanceof Helper ){
			pathToHelper((HelperAnn) typ.getAnnotation(parent.original_()), node, traversed);			
		//} else if ( parent instanceof IteratorExp ) {
		//	pathToSomewhere(parent, node);
		} else if ( parent instanceof IfExp ) {
			pathFromIfExpr((IfExp) parent, (OclExpression) lastParent, node, traversed);
		/*} else if ( parent instanceof Binding ) {
			Rule r = parent.container_().container_().container(Rule.class);
			pathToRule((RuleAnn) typ.getAnnotation(r.original_()), node);
		} else if ( parent instanceof OclExpression ) {
			pathToControlFlow((OclExpression) parent, node);
		*/} else {
			throw new UnsupportedOperationException();
		}
	}


	private void pathFromIfExpr(IfExp expr, OclExpression directChild, DependencyNode node, TraversedSet traversed) {
		boolean branch;
		if ( expr.getThenExpression() == directChild ) {
			branch = ConditionalNode.TRUE_BRANCH;
		} else {
			branch = ConditionalNode.FALSE_BRANCH;
		}
		
		IfExprAnn ann = (IfExprAnn) typ.getAnnotation(expr.original_());
		ConditionalNode newNode = new ConditionalNode(expr, branch);
		node.addDependency(newNode);
		
		pathToControlFlow(expr, newNode, traversed);
	}



	private void generatePath_BindingExpectedOneAssignedMany(BindingExpectedOneAssignedMany p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );

		ProblemNode node = new BindingExpectedOneAssignedManyNode(p, atlBinding);
		graph.linkProblemToNode(p, node);
		
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
		
		pathToBinding(atlBinding, b, node, new TraversedSet());
	}
	
	private void generatePath_BindingWithResolvedByIncompatibleRule(BindingWithResolvedByIncompatibleRule p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );

		ProblemNode node = new BindingWithResolvedByIncompatibleRuleNode(p, atlBinding);
		graph.linkProblemToNode(p, node);
		
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
		
		pathToBinding(atlBinding, b, node, new TraversedSet());
	}
	
	private void pathToBinding(Binding atlBinding , BindingAnn b, ProblemNode node, TraversedSet traversed) {
		RuleResolutionNode resolutionNode = new RuleResolutionNode(atlBinding, b);
		node.addConstraint(resolutionNode);
		for(MatchedRuleAnn mr : b.getResolvedBy()) {
			pathToRule(mr, resolutionNode, traversed);
		}
	}

	private void generatePath_NoBindingForCompulsoryFeature(NoBindingForCompulsoryFeature p) {
		ProblemNode node = new NoBindingAssignmentNode(p);
		graph.linkProblemToNode(p, node);
		
		OutputPatternAnn op = (OutputPatternAnn) typ.getAnnotation(p.getElement());
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
	}
	
	private void pathToRule(RuleAnn rule, DependencyNode dependent, TraversedSet traversed) {
		if ( rule instanceof MatchedRuleAnn ) {
			pathToMatchedRuleOne((MatchedRuleAnn) rule, dependent);
		} else if ( rule instanceof ImperativeRuleAnn ) {
			pathToImperativeRule((ImperativeRuleAnn) rule, dependent, traversed);
		} else {
			throw new UnsupportedOperationException(rule.getClass().getName());
		}
	}
	
	private void pathToImperativeRule(ImperativeRuleAnn rule, DependencyNode dependent, TraversedSet traversed) {
		Rule r =  (Rule) atlModel.findWrapper( rule.getRule() );
		
		if ( ! traversed.addImperativeRule(r) ) {
			return;
		}
		
		ImperativeRuleExecution node = new ImperativeRuleExecution(rule, r);
		dependent.addDependency(node);
		for(CallExprAnn callExprAnn : rule.getCalledBy()) {
			 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
			 pathForCall(expr, node, traversed);				 			
		}
	}

	private void pathToHelper(HelperAnn helperAnn, DependencyNode depNode, TraversedSet traversed) {
		Helper h =  (Helper) atlModel.findWrapper( helperAnn.getHelper() );
		
		if ( ! traversed.addHelper(h) ) 
			return;
		
		HelperInvocationNode hNode = new HelperInvocationNode(h, helperAnn);
		depNode.addDependency(hNode);
		
		if ( helperAnn instanceof ModuleHelperAnn ) {
			throw new UnsupportedOperationException();			
		} else if ( helperAnn instanceof ContextHelperAnn ) {
			EList<CallExprAnn> callers = ((ContextHelperAnn) helperAnn).getPolymorphicCalledBy();
			for (CallExprAnn callExprAnn : callers) {
				 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
				 pathForCall(expr, hNode, traversed);				 
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
			ConstraintNode constraint = pathToFilterExpression(rule.getFilter());
			newNode.addConstraint(constraint);
		}
		
		graph.addRule(newNode);
	}

	private ConstraintNode pathToFilterExpression(ExpressionAnnotation expr) {
		OclExpression atlOcl = (OclExpression) atlModel.findWrapper( expr.getExpr() );

		RuleFilterNode node = new RuleFilterNode(atlOcl);
		
		return node;
	}
	

	
	private class TraversedSet {
		private Set<Helper> helpers = new HashSet<Helper>();
		private Set<Rule> imperative = new HashSet<Rule>();
		
		public boolean addHelper(Helper h) {
			return helpers.add(h);
		}
		
		public boolean addImperativeRule(Rule r) {
			return imperative.add(r);
		}
		
	}
	
}