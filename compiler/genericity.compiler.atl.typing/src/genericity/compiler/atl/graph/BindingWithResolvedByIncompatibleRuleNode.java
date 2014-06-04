package genericity.compiler.atl.graph;

import org.eclipse.emf.common.util.EList;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.typing.atl_types.annotations.BindingAnn;
import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.OperatorCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;
import bento.analysis.atl_analysis.atl_error.BindingExpectedOneAssignedMany;
import bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule;
import bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo;

public class BindingWithResolvedByIncompatibleRuleNode extends AbstractBindingAssignmentNode<BindingWithResolvedByIncompatibleRule> implements ProblemNode {

	private Binding	binding;
	private BindingAnn bindingAnn;
	private ATLModel atlModel;

	public BindingWithResolvedByIncompatibleRuleNode(BindingWithResolvedByIncompatibleRule p, Binding binding, BindingAnn bindingAnn, ATLModel model) {
		super(p);
		this.binding = binding;
		this.bindingAnn = bindingAnn;
		this.atlModel   = model;
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}		
		
		for(ConstraintNode n : constraints) {
			n.genErrorSlice(slice);
		}		
		
		OclSlice.slice(slice, binding.getValue());
		
		// Needed for the error
		for(ResolvedRuleInfo r : problem.getRules()) {
			MatchedRule mr = (MatchedRule) atlModel.findWrapper(r.getElement());
			if ( mr.getInPattern().getFilter() != null ) {
				OclSlice.slice(slice, mr.getInPattern().getFilter());
			}
		}
		
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "Problem with binding:\\n" + binding.getPropertyName() + " - incompatible rules" + "\\n" + binding.getLocation(), leadsToExecution);
	}

	/*
	@Override
	public void getCSPText(CSPBuffer buf) {
		getDependency().getCSPText(buf);
		
		buf.generateIf(binding.getValue(), "->size() > 0", true);
		
		// CSPBuffer buf2 = new CSPBuffer();
		getConstraint().getCSPText(buf);
		// System.out.println(buf2.getText());
	}
	*/

	@Override
	public OclExpression genCSP(CSPModel model) {
		OclExpression result = null;
		EList<ResolvedRuleInfo> rules = problem.getRules();
		assert(rules.size() > 0);
		
		OclExpression value = genBindingRightPart(model, binding, bindingAnn);		
		if ( TypeUtils.isReference(bindingAnn.getSourceType()) ) {
			result = createReferenceConstraint(model, rules, value);
		} else if ( TypeUtils.isCollection(bindingAnn.getSourceType()) ) {
			IteratorExp exists = model.createExists(value, "_problem_");
			VariableDeclaration varDcl = exists.getIterators().get(0);
			
			OclExpression lastExpr = genOrRules(model, rules, varDcl);
			
			// lastIf.setElseExpression(model.createBooleanLiteral(false));
			// exists.setBody(lastIf);
			
			exists.setBody(lastExpr);
			
			result = exists;
		} else if ( TypeUtils.isUnionWithReferences(bindingAnn.getSourceType())) {
			result = createReferenceConstraint(model, rules, value);	
		} else {
			throw new IllegalStateException();
		}
		
		return result;
	}

	private LetExp createReferenceConstraint(CSPModel model,
			EList<ResolvedRuleInfo> rules, OclExpression value) {
		LetExp let = model.createLetScope(value, null, "_problem_");
		VariableDeclaration varDcl = let.getVariable();
		let.setIn_( genOrRules(model, rules, varDcl));
		return let;
	}

	private OclExpression genOrRules(CSPModel model, EList<ResolvedRuleInfo> rules, VariableDeclaration varDcl) {
		OclExpression lastExpr = null;
		for (ResolvedRuleInfo rule : rules) {
			MatchedRule r = (MatchedRule) atlModel.findWrapper(rule.getElement());				
			IfExp ifexpr = genCondition(model, varDcl, rule, r);
			if ( lastExpr == null ) {
				lastExpr = ifexpr;
			} else {
				lastExpr = model.createBinaryOperator(lastExpr, ifexpr, "or");
			}

			/*
			if ( lastIf == null ) {
				lastIf = ifexpr;
			} else {
				ifexpr.setElseExpression(lastIf);
				lastIf = ifexpr;
			}
			*/
		}
		return lastExpr;
	}

	private IfExp genCondition(CSPModel model, VariableDeclaration varDcl,
			ResolvedRuleInfo rule, MatchedRule r) {
		// => _problem_.oclIsKindOf(ruleFrom)
		VariableExp v = model.create(VariableExp.class);
		v.setReferredVariable(varDcl);				
		OclExpression kindOfCondition = model.createKindOf_AllInstancesStyle(v, null, rule.getInputType().getName());
		
		// Generate the filter
		OclExpression filter = null;
		if ( r.getInPattern().getFilter() != null ) {
			model.openEmptyScope();
			
			SimpleInPatternElement simpleElement = (SimpleInPatternElement) r.getInPattern().getElements().get(0);
			
			// => let newVar = _problem_.oclAsType(RuleFrom) in <filter>				
			OperationCallExp casting = model.createCastTo(varDcl, simpleElement.getType().getName());				
			LetExp let = model.createLetScope(casting, null, simpleElement.getVarName());
				
			// Map the iterator var to the rule variable
			model.addToScope(simpleElement, let.getVariable());
			let.setIn_(model.gen(r.getInPattern().getFilter()));
			
			filter = let;
			
			/*
			// Map the iterator var to the rule variable
			model.addToScope((SimpleInPatternElement) r.getInPattern().getElements().get(0), varDcl);
			
			filter = model.gen(r.getInPattern().getFilter());
			*/
			
			model.closeScope();
		} else {
			filter = model.createBooleanLiteral(true);
		}
		
		IfExp ifexpr = model.createIfExpression(kindOfCondition, filter, model.createBooleanLiteral(false));
		return ifexpr;
	}

	@Override
	public boolean isStraightforward() {
		return false;
	}

}
