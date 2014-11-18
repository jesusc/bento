package genericity.compiler.atl.graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
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
import bento.analysis.atl_analysis.atl_error.BindingPossiblyUnresolved;
import bento.analysis.atl_analysis.atl_error.BindingWithResolvedByIncompatibleRule;
import bento.analysis.atl_analysis.atl_error.ResolvedRuleInfo;

public class BindingPossiblyUnresolvedNode extends AbstractBindingAssignmentNode<BindingPossiblyUnresolved> implements ProblemNode {

	private Binding	binding;
	private BindingAnn bindingAnn;
	private ATLModel atlModel;

	public BindingPossiblyUnresolvedNode(BindingPossiblyUnresolved p, Binding binding, BindingAnn bindingAnn, ATLModel model) {
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
		for (EClass c : problem.getProblematicClasses()) {
			slice.addMetaclassNeededInError(c);
		}
		
		EList<MatchedRuleOneAnn> resolved = bindingAnn.getResolvedBy();
		for (MatchedRuleOneAnn matchedRuleOneAnn : resolved) {
			MatchedRule mr = (MatchedRule) atlModel.findWrapper(matchedRuleOneAnn.getRule());
			if ( mr.getInPattern().getFilter() != null ) {
				OclSlice.slice(slice, mr.getInPattern().getFilter());
			}
		}
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "Problem with binding:\\n" + binding.getPropertyName() + " - possibly unresolved" + "\\n" + binding.getLocation(), leadsToExecution);
	}


	@Override
	public OclExpression genCSP(CSPModel model) {
		OclExpression result = null;
		EList<MatchedRuleOneAnn> rules = bindingAnn.getResolvedBy();
		assert(rules.size() > 0);
		
		OclExpression value = genBindingRightPart(model, binding, bindingAnn);		
		if ( TypeUtils.isReference(bindingAnn.getSourceType()) ) {
			result = createReferenceConstraint(model, rules, value);
		} else if ( TypeUtils.isCollection(bindingAnn.getSourceType()) ) {
			IteratorExp exists = model.createExists(value, "_problem_");
			VariableDeclaration varDcl = exists.getIterators().get(0);
			
			OclExpression lastExpr = genAndRules(model, rules, varDcl);
			
			// lastIf.setElseExpression(model.createBooleanLiteral(false));
			
			exists.setBody(lastExpr);
			
			result = exists;
		} else if ( TypeUtils.isUnionWithReferences(bindingAnn.getSourceType())) {
			result = createReferenceConstraint(model, rules, value);
		} else {
			// TODO: For union types with mixed collections and mono-valued elements, Sequence { value }->flatten()
			throw new IllegalStateException(this.binding.getLocation() + " " + TypeUtils.typeToString(bindingAnn.getSourceType()));
		}
		
		return result;
	}

	private LetExp createReferenceConstraint(CSPModel model,
			EList<MatchedRuleOneAnn> rules, OclExpression value) {
		LetExp let = model.createLetScope(value, null, "_problem_");
		VariableDeclaration varDcl = let.getVariable();
		
		OclExpression andRules = genAndRules(model, rules, varDcl);
		
		// => not varDcl.oclIsUndefined()
		VariableExp varRef = model.create(VariableExp.class);
		varRef.setReferredVariable(varDcl);
		OperatorCallExp notUndefined = model.negateExpression(model.createOperationCall(varRef, "oclIsUndefined"));
		
		let.setIn_( model.createBinaryOperator(notUndefined, andRules, "and") );
		return let;
	}

	private OclExpression genAndRules(CSPModel model,
			EList<MatchedRuleOneAnn> rules, VariableDeclaration varDcl) {
		
		OclExpression lastExpr = null;
		for (MatchedRuleOneAnn rule : rules) {
			MatchedRule r = (MatchedRule) atlModel.findWrapper(rule.getRule());
			
			// => _problem_.oclIsKindOf(ruleFrom)
			VariableExp v = model.create(VariableExp.class);
			v.setReferredVariable(varDcl);				
			OclExpression kindOfCondition = model.createKindOf_AllInstancesStyle(v, null, rule.getInPatternType().getName());			
			
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

				model.closeScope();
			} else {
				filter = model.createBooleanLiteral(true);
			}
			
			IfExp ifexpr = model.createIfExpression(kindOfCondition, filter, model.createBooleanLiteral(false));
			OperatorCallExp negatedIf = model.negateExpression(ifexpr);
			
			if ( lastExpr == null ) {
				lastExpr = negatedIf;
			} else {
				lastExpr = model.createBinaryOperator(lastExpr, negatedIf, "and");
			}
		}
		return lastExpr;
	}

	@Override
	public boolean isStraightforward() {
		return false;
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new UnsupportedOperationException();
	}
	
}
