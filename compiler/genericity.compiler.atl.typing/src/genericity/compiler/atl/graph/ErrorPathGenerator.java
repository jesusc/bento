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
import atl.metamodel.OCL.LetExp;
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

	private ProblemGraph graph;
	private ProblemPath	currentPath;
	
	public ErrorPathGenerator(ErrorModel model, TypingModel typ, ATLModel atlModel) {
		this.errors = model;
		this.typ    = typ;
		this.atlModel = atlModel;
	}
	
	public ProblemGraph perform() {
		ProblemGraph graph = new ProblemGraph();
		AnalysisResult r = this.errors.getAnalysis();
		for(Problem p : r.getProblems()) {
			if ( p instanceof LocalProblem ) {
				ProblemPath path = generatePath((LocalProblem) p);
				if ( path != null )
					graph.addProblemPath(path);
				else 
					System.err.println("ErrorPathGenerator: Ignored " + p.getClass().getSimpleName());
			} else {
				throw new UnsupportedOperationException();
			}
		}
		
		return graph;
	}

	/*
	public ProblemPath perform(Problem p) {
		currentGraph = new ProblemPath();
		generatePath((LocalProblem) p);
		return currentGraph;
	}
	*/

	public ProblemPath generatePath(LocalProblem p) {
		currentPath = null;
		
		if ( p instanceof NoBindingForCompulsoryFeature ) {
			generatePath_NoBindingForCompulsoryFeature((NoBindingForCompulsoryFeature) p);		
		
		// These two are very similar
		} else if ( p instanceof BindingExpectedOneAssignedMany ) {
			generatePath_BindingExpectedOneAssignedMany((BindingExpectedOneAssignedMany) p);				
		} else if ( p instanceof BindingWithoutRule ) {
			generatePath_BindingWithoutRule((BindingWithoutRule) p);
		} else if ( p instanceof BindingWithResolvedByIncompatibleRule ) {
			generatePath_BindingWithResolvedByIncompatibleRule((BindingWithResolvedByIncompatibleRule) p);				
		} else if ( p instanceof BindingPossiblyUnresolved ) {
			generatePath_BindingPossiblyUnresolved((BindingPossiblyUnresolved) p);				
		} else if ( p instanceof FeatureNotFound ) {
			generatePath_FeatureNotFound((FeatureNotFound) p);
		} else if ( p instanceof OperationNotFound ) {
			generatePath_OperationNotFound((OperationNotFound) p);			
		} else if ( p instanceof FlattenOverNonNestedCollection ) {
			generatePath_FlattenOverNonNestedCollection((FlattenOverNonNestedCollection) p);					
		}
	
		return currentPath;
	}

	private void generatePath_FeatureNotFound(FeatureNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		FeatureOrOperationNotFoundNode node = new FeatureOrOperationNotFoundNode(p, atlExpr);
		currentPath = new ProblemPath(p, node);
		
		// System.out.println(p);
		pathFromErrorExpression(atlExpr.getSource(), 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.getSource().original_()), node);
	}

	private void generatePath_OperationNotFound(OperationNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		FeatureOrOperationNotFoundNode node = new FeatureOrOperationNotFoundNode(p, atlExpr);
		currentPath = new ProblemPath(p, node);
		
		pathFromErrorExpression(atlExpr.getSource(), 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.getSource().original_()), node);		
	}		


	private void generatePath_FlattenOverNonNestedCollection(FlattenOverNonNestedCollection p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		FlattenOverNonNestedCollectionNode node = new FlattenOverNonNestedCollectionNode(p, atlExpr);
		currentPath = new ProblemPath(p, node);
		
		pathFromErrorExpression(atlExpr, 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.original_()), node);		
	}


	private void generatePath_BindingWithoutRule(BindingWithoutRule p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());

		ProblemNode node = new BindingWithoutRuleNode(p, atlBinding, b, atlModel);
		currentPath = new ProblemPath(p, node);
			
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
		
		pathToBinding(atlBinding, b, node, new TraversedSet());		
	}
	
	private void generatePath_BindingExpectedOneAssignedMany(BindingExpectedOneAssignedMany p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );

		ProblemNode node = new BindingExpectedOneAssignedManyNode(p, atlBinding);
		currentPath = new ProblemPath(p, node);
			
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
		
		pathToBinding(atlBinding, b, node, new TraversedSet());
	}

	private void generatePath_BindingPossiblyUnresolved(BindingPossiblyUnresolved p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());

		ProblemNode node = new BindingPossiblyUnresolvedNode(p, atlBinding, b, atlModel);
		currentPath = new ProblemPath(p, node);
		
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
		
		pathToBinding(atlBinding, b, node, new TraversedSet());
	}

	private void generatePath_BindingWithResolvedByIncompatibleRule(BindingWithResolvedByIncompatibleRule p) {
		Binding atlBinding = (Binding) atlModel.findWrapper( p.getElement() );
		BindingAnn b = (BindingAnn) typ.getAnnotation(p.getElement());

		ProblemNode node = new BindingWithResolvedByIncompatibleRuleNode(p, atlBinding, b, atlModel);
		currentPath = new ProblemPath(p, node);
		
		OutputPatternAnn op = (OutputPatternAnn) b.eContainer();
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
		
		pathToBinding(atlBinding, b, node, new TraversedSet());
	}

	private void generatePath_NoBindingForCompulsoryFeature(NoBindingForCompulsoryFeature p) {
		ProblemNode node = new NoBindingAssignmentNode(p);
		currentPath = new ProblemPath(p, node);
		
		OutputPatternAnn op = (OutputPatternAnn) typ.getAnnotation(p.getElement());
		RuleAnn rule = (RuleAnn) op.eContainer();
		pathToRule(rule, node, new TraversedSet());	
	}


	//
	// End-of errors
	//

	private boolean pathToControlFlow(ATLModelBaseObjectInterface start, DependencyNode node, TraversedSet traversed) {
		ATLModelBaseObject lastParent = (ATLModelBaseObject) start; 
		ATLModelBaseObject parent = start.container_(); 
		while ( ! isControlFlowElement(parent) ) {
			if ( isIteration(parent) ) {
				LoopExp exp = (LoopExp) parent;
				LoopNode loop = new LoopNode(exp.getSource(), exp.getIterators().get(0));
				node.addDependency(loop);
				
				// ?? Different from the pathToCall
				return checkReachesExecution(pathToControlFlow((OclExpression) parent, loop, traversed), loop);
			}
			
			lastParent = parent;
			parent = parent.container_();
		}
		
		if ( parent instanceof Rule ) {
			return pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node, traversed);
		} else if ( parent instanceof Helper ){
			return pathToHelper((HelperAnn) typ.getAnnotation(parent.original_()), node, traversed);			
		} else if ( parent instanceof IfExp ) {
			return pathToIfExpr((IfExp) parent, (OclExpression) lastParent, node, traversed);
		} else if ( parent instanceof LetExp ) {
			return pathToLetExpr((LetExp) parent, lastParent, node, traversed);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private boolean checkReachesExecution(boolean depReachability, DependencyNode current) {
		current.setLeadsToExecution(depReachability);
		return depReachability;
	}
	
	private boolean isIteration(ATLModelBaseObject element) {
		return element instanceof LoopExp;
	}

	public boolean isControlFlowElement(ATLModelBaseObject element) {
		return (element instanceof Rule) || (element instanceof Helper) ||
			    (element instanceof IfExp || (element instanceof LetExp ));
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

	private boolean pathForCall(OclExpression call, DependencyNode depNode, TraversedSet traversed) {
		CallExprAnn ann = (CallExprAnn) typ.getAnnotation(call.original_());
		
		CallExprNode node = new CallExprNode((PropertyCallExp) call, ann, atlModel);
		depNode.addDependency(node);
		
		return checkReachesExecution(pathToControlFlow(call, node, traversed), node);
	}


	private boolean pathToLetExpr(LetExp start, ATLModelBaseObject childToLet, DependencyNode node, TraversedSet traversed) {
		// The error comes to the variable declaration
		if ( start.getVariable() == childToLet ) {
			// ExpressionAnnotation ann = (ExpressionAnnotation) typ.getAnnotation(childToLet.original_());
			// DelimitedExpressionNode newNode = new DelimitedExpressionNode(start.getVariable().getInitExpression(), ann);

			// return checkReachesExecution(pathToControlFlow(childToLet, newNode, traversed), newNode);
			return checkReachesExecution(pathToControlFlow(start, node, traversed), node);
		}
		
		ATLModelBaseObject lastParent = (ATLModelBaseObject) start; 
		ATLModelBaseObject parent = start.container_(); 
		while ( parent instanceof LetExp ) {
			lastParent = parent;
			parent = parent.container_();
		}
		
		LetScopeNode newNode = new LetScopeNode((LetExp) lastParent);
		node.addDependency(newNode);

		return checkReachesExecution(pathToControlFlow(lastParent.container_(), newNode, traversed), newNode);
	}
	
	private boolean pathToIfExpr(IfExp expr, OclExpression directChild, DependencyNode node, TraversedSet traversed) {
		boolean branch;
		if ( expr.getThenExpression() == directChild ) {
			branch = ConditionalNode.TRUE_BRANCH;
		} else if ( expr.getElseExpression() == directChild ){
			branch = ConditionalNode.FALSE_BRANCH;
		} else {
			// must be the condition
			return pathToControlFlow(expr, node, traversed);
		}
		
		IfExprAnn ann = (IfExprAnn) typ.getAnnotation(expr.original_());
		ConditionalNode newNode = new ConditionalNode(expr, branch);
		node.addDependency(newNode);
		
		return checkReachesExecution(pathToControlFlow(expr, newNode, traversed), newNode);
	}

	private void pathToBinding(Binding atlBinding , BindingAnn b, ProblemNode node, TraversedSet traversed) {
		RuleResolutionNode resolutionNode = new RuleResolutionNode(atlBinding, b);
		node.addConstraint(resolutionNode);
		for(MatchedRuleAnn mr : b.getResolvedBy()) {
			pathToRule(mr, resolutionNode, traversed);
		}
	}
	
	private boolean pathToRule(RuleAnn rule, DependencyNode dependent, TraversedSet traversed) {
		if ( rule instanceof MatchedRuleAnn ) {
			return pathToMatchedRuleOne((MatchedRuleAnn) rule, dependent);
		} else if ( rule instanceof ImperativeRuleAnn ) {
			return pathToImperativeRule((ImperativeRuleAnn) rule, dependent, traversed);
		} else {
			throw new UnsupportedOperationException(rule.getClass().getName());
		}
	}
	
	private boolean pathToImperativeRule(ImperativeRuleAnn rule, DependencyNode dependent, TraversedSet traversed) {
		Rule r =  (Rule) atlModel.findWrapper( rule.getRule() );
		
		if ( ! traversed.addImperativeRule(r) ) {
			return false;
		}
		
		boolean leadsToExecution = false;
		
		ImperativeRuleExecution node = new ImperativeRuleExecution(rule, r);
		dependent.addDependency(node);
		for(CallExprAnn callExprAnn : rule.getCalledBy()) {
			 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
			 if ( pathForCall(expr, node, traversed) ) {
				 leadsToExecution = true;
			 }
		}
		
		node.setLeadsToExecution(leadsToExecution);
		return leadsToExecution;
	}

	private boolean pathToHelper(HelperAnn helperAnn, DependencyNode depNode, TraversedSet traversed) {
		Helper h =  (Helper) atlModel.findWrapper( helperAnn.getHelper() );
		
		if ( ! traversed.addHelper(h) ) 
			return false;
		
		HelperInvocationNode hNode = new HelperInvocationNode(h, helperAnn);
		depNode.addDependency(hNode);
		
		boolean leadsToExecution = false;
		
		if ( helperAnn instanceof ModuleHelperAnn ) {
			EList<CallExprAnn> callers = helperAnn.getCalledBy();
			for (CallExprAnn callExprAnn : callers) {
				 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
				 if ( pathForCall(expr, hNode, traversed) ) {
					 leadsToExecution = true;
				 }
			}			
			// throw new UnsupportedOperationException(h.getLocation());			
		} else if ( helperAnn instanceof ContextHelperAnn ) {
			EList<CallExprAnn> callers = ((ContextHelperAnn) helperAnn).getPolymorphicCalledBy();
			for (CallExprAnn callExprAnn : callers) {
				 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
				 if ( pathForCall(expr, hNode, traversed) ) {
					 leadsToExecution = true;
				 }
			}
			//pathToExpression(expr, annotation, depNode)
			//System.out.println(callers.size());
		} else {
			throw new UnsupportedOperationException();
		}
		
		hNode.setLeadsToExecution(leadsToExecution);
		return leadsToExecution;
	}

	private boolean pathToMatchedRuleOne(MatchedRuleAnn rule, DependencyNode dependent) {
		MatchedRule r = (MatchedRule) atlModel.findWrapper( rule.getRule() );
		if ( r.getIsAbstract() ) {
			for(MatchedRule cr : r.getChildren()) {
				MatchedRuleAnn crann = (MatchedRuleAnn) typ.getAnnotation(cr.original_());
				pathToMatchedRuleOne(crann, dependent);
			}
			return true;
		}
		
		MatchedRuleExecution newNode = new MatchedRuleExecution(rule, r);
		dependent.addDependency(newNode);
		
		if ( rule.getFilter() != null ) {
			ConstraintNode constraint = pathToFilterExpression(rule.getFilter());
			newNode.addConstraint(constraint);
		}
		
		currentPath.addRule(newNode);
		
		newNode.setLeadsToExecution(true);
		return true;
	}

	private ConstraintNode pathToFilterExpression(ExpressionAnnotation expr) {
		OclExpression atlOcl = (OclExpression) atlModel.findWrapper( expr.getExpr() );

		RuleFilterNode node = new RuleFilterNode(atlOcl);
		
		return node;
	}
	
	/*
	private ATLModelBaseObject findControlFlowConstruct(ATLModelBaseObject element) {
		ATLModelBaseObject parent = element.container_();
		while ( ! isControlFlowElement(parent) ) {
			if ( isIteration(parent) ) {
				return parent;
			}
			parent = parent.container_();
		}
		
		return parent;
	}
	*/

	
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
