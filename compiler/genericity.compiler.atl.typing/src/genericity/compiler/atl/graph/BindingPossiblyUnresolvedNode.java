package genericity.compiler.atl.graph;

import org.eclipse.emf.common.util.EList;

import genericity.compiler.atl.analyser.TypeUtils;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.typing.atl_types.annotations.BindingAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;
import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Binding;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IteratorExp;
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
		
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "Problem with binding:\\n" + binding.getPropertyName() + " - incompatible rules" + "\\n" + binding.getLocation(), leadsToExecution);
	}


	@Override
	public void getCSPText(CSPBuffer buf) {
		getDependency().getCSPText(buf);
		
		buf.generateIf(binding.getValue(), "->size() > 0", true);
		
		// CSPBuffer buf2 = new CSPBuffer();
		getConstraint().getCSPText(buf);
		// System.out.println(buf2.getText());
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		OclExpression result = null;
		EList<MatchedRuleOneAnn> rules = bindingAnn.getResolvedBy();
		assert(rules.size() > 0);
		
		OclExpression value = model.gen(binding.getValue());		
		if ( TypeUtils.isReference(bindingAnn.getSourceType()) ) {
			throw new UnsupportedOperationException();
		} else if ( TypeUtils.isCollection(bindingAnn.getSourceType()) ) {
			IteratorExp exists = model.createExists(value, "_problem_");
			VariableDeclaration varDcl = exists.getIterators().get(0);
			
			OclExpression lastExpr = null;
			
			// This strategy favours the last rule
			for (MatchedRuleOneAnn rule : rules) {
				MatchedRule r = (MatchedRule) atlModel.findWrapper(rule.getRule());
				
				// => _problem_.oclIsKindOf(ruleFrom)
				VariableExp v = model.create(VariableExp.class);
				v.setReferredVariable(varDcl);				
				OperationCallExp kindOfCondition = model.createKindOf(v, null, rule.getInPatternType().getName());
				
				// Generate the filter
				OclExpression filter = null;
				if ( r.getInPattern().getFilter() != null ) {
					// Map the iterator var to the rule variable
					model.addToScope((SimpleInPatternElement) r.getInPattern().getElements().get(0), varDcl);
					
					filter = model.gen(r.getInPattern().getFilter());
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
			
			// lastIf.setElseExpression(model.createBooleanLiteral(false));
			
			exists.setBody(lastExpr);
			
			result = exists;
		} else {
			throw new IllegalStateException();
		}
		
		return result;
	}

	@Override
	public boolean isStraightforward() {
		return false;
	}

}