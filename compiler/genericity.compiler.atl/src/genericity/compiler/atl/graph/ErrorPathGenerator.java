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
		} else {
			throw new UnsupportedOperationException(p.getClass().getName());
		}
		
	}


	private void generatePath_FeatureNotFound(FeatureNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		ExpressionProblemNode node = new ExpressionProblemNode(p, atlExpr);
		graph.linkProblemToNode(p, node);
		
		pathToExpression(atlExpr.getSource(), 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.getSource().original_()), node);
	}

	private void generatePath_OperationNotFound(OperationNotFound p) {
		PropertyCallExp atlExpr = (PropertyCallExp) atlModel.findWrapper( p.getElement() );
		ExpressionProblemNode node = new ExpressionProblemNode(p, atlExpr);
		graph.linkProblemToNode(p, node);
		
		pathToExpression2(atlExpr.getSource(), 
				(ExpressionAnnotation) typ.getAnnotation(atlExpr.getSource().original_()), node);		
	}
	

	private void pathToExpression2(OclExpression expr, ExpressionAnnotation annotation, DependencyNode depNode) {
		OclExpression start = expr;
		ExpressionAnnotation startAnn = (ExpressionAnnotation) typ.getAnnotation(start.original_());
		
		// TODO: Merge with the other branch if needed...
		// TODO: Take into account that the container maybe a rule or a helper...
		//       For the moment assume a rule...
		ATLModelBaseObject parent = start.container_(); // TODO: Iterate
		while ( ! ( (parent instanceof Rule) || (parent instanceof Helper) || 
				    (parent instanceof IteratorExp || (parent instanceof IterateExp) ))) {
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
		/*
		// QUITAR ESTE IF Y PONERLO EN PATH_TO_SOMEWHERE
		if ( parent instanceof Rule ) {
			pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node);
		} else if ( parent instanceof Helper ){
			pathToHelper((HelperAnn) typ.getAnnotation(parent.original_()), node);			
		} else if ( parent instanceof IteratorExp ) {
			pathToSomewhere(parent, node);
		} else {
			throw new UnsupportedOperationException();
		}
		*/
	
	}


	private void pathToControlFlow(OclExpression start, ExpressionAnnotation ann, DelimitedExpressionNode node) {
		ATLModelBaseObject parent = start.container_(); 
		while ( ! ( (parent instanceof Rule) || (parent instanceof Helper) )) {
			parent = parent.container_();
		}
		
		pathToSomewhere(parent, node);
	}
	
	private void pathToSomewhere(ATLModelBaseObject parent, DelimitedExpressionNode node) {
		 AtlAnnotation ann = typ.getAnnotation(parent.original_());
		
		// QUITAR ESTE IF Y PONERLO EN PATH_TO_SOMEWHERE
		if ( parent instanceof Rule ) {
			pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node);
		} else if ( parent instanceof Helper ){
			pathToHelper((HelperAnn) typ.getAnnotation(parent.original_()), node);			
		//} else if ( parent instanceof IteratorExp ) {
		//	pathToSomewhere(parent, node);
		} else if ( parent instanceof Binding ) {
			Rule r = parent.container_().container(Rule.class);
			pathToRule((RuleAnn) typ.getAnnotation(r.original_()), node);
		} else if ( parent instanceof OclExpression ) {
			pathToControlFlow((OclExpression) parent, (ExpressionAnnotation) ann, node);
		} else {
			throw new UnsupportedOperationException();
		}

	}


	private void pathToExpression(OclExpression expr, ExpressionAnnotation annotation, DependencyNode depNode) {
		/*
		 * Is this needed??
		if ( ! ( expr.container_() instanceof OclExpression) )
			throw new IllegalArgumentException();
		*/
		
		// I MADE THE MISTAKE OF TRAVERSING THROUGH THE CONTAINER, NOT THE SOURCE
		// BUT MAY BE THERE IS SOMETHING HERE WORTH LOOKING AGAIN : START - END...
		/*
		OclExpression start       		= expr.container(OclExpression.class);
		ATLModelBaseObjectInterface end = start;
		ATLModelBaseObject parent       = end.container_(); 
				
		while ( end instanceof OclExpression && ! (end instanceof OperationCallExp)  ) {
			end = parent;
			parent = start.container_();
		}
		// TODO: THIS IS NOT FINE IF IT IS WITHIN AN ITERATOR...		
		
		System.out.println(start);
		System.out.println(end);
		
		DelimitedExpressionNode node = new DelimitedExpressionNode(start, (OclExpression) end);
		depNode.addDependency(node);
		*/
		
		
		OclExpression start = expr;
		ExpressionAnnotation startAnn = (ExpressionAnnotation) typ.getAnnotation(start.original_());
		
		/*// NOT NEEDED
		ATLModelBaseObjectInterface end = start;		
		while ( end instanceof PropertyCallExp ) {
			end = ((PropertyCallExp) end).getSource();
		}
		System.out.println(start);
		System.out.println(end);
		*/
		
		DelimitedExpressionNode node = new DelimitedExpressionNode(start, startAnn);
		depNode.addDependency(node);
		
		// TODO: Merge with the other branch if needed...
		// TODO: Take into account that the container maybe a rule or a helper...
		//       For the moment assume a rule...
		ATLModelBaseObject parent = start.container_();
		while ( ! ( (parent instanceof Rule) || (parent instanceof Helper) )) {
			parent = parent.container_();
		}
		
		if ( parent instanceof Rule ) {
			pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node);
		} else if ( parent instanceof Helper ){
			pathToHelper((HelperAnn) typ.getAnnotation(parent.original_()), node);			
		}
		
		/*
		parent = end.container_();
		while ( ! ( parent instanceof Rule ) ) parent = parent.container_();
		
		pathToRule((RuleAnn) typ.getAnnotation(parent.original_()), node);
		*/
		
		// System.out.println(start);
		// System.out.println(end);
		// System.out.println(annotation);
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
		} else {
			throw new UnsupportedOperationException();
		}
	}
	
	private void pathToHelper(HelperAnn helperAnn, DependencyNode depNode) {
		Helper h =  (Helper) atlModel.findWrapper( helperAnn.getHelper() );
		HelperInvocationNode hNode = new HelperInvocationNode(h, helperAnn);
		depNode.addDependency(hNode);
		
		if ( helperAnn instanceof ModuleHelperAnn ) {
			throw new UnsupportedOperationException();			
		} else if ( helperAnn instanceof ContextHelperAnn ) {
			EList<CallExprAnn> callers = ((ContextHelperAnn) helperAnn).getCalledBy();
			for (CallExprAnn callExprAnn : callers) {
				 OclExpression expr = (OclExpression) atlModel.findWrapper( callExprAnn.getExpr() ); 
				 System.out.println(expr.getLocation());
				 pathToExpression(expr, callExprAnn, hNode);
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
