package genericity.compiler.atl.graph;

import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;

public class MatchedRuleAbstract extends AbstractDependencyNode {

	private MatchedRuleAnn rule;
	private MatchedRule	atlRule;
	//private DependencyNode	constraint;

	public MatchedRuleAbstract(MatchedRuleAnn rule, MatchedRule atlRule) {
		this.rule = rule;
		this.atlRule = atlRule;
	}
	

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		if ( rule instanceof MatchedRuleOneAnn ) {
			slice.addExplicitMetaclass(((MatchedRuleOneAnn) rule).getInPatternType());
		} else {
			for(Metaclass m : ((MatchedRuleManyAnn) rule).getInPatternTypes()) {
				slice.addExplicitMetaclass(m);
			}
		}

		// TODO: Slice only the required ones!
		if ( atlRule.getVariables().size() > 0 ) {
			for (RuleVariableDeclaration v : atlRule.getVariables()) {
				OclSlice.slice(slice, v.getInitExpression());
			}
		}
		
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		
		VariableDeclaration varDcl = atlRule.getInPattern().getElements().get(0);
		gv.addNode(this, "<<abstract>>\\n" + rule.getName() + "\\nfrom: " + varDcl.getType().getName(), leadsToExecution ); //+ "\\n" + OclGenerator.gen(constraint) );
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		Metaclass metaclass = null;
		VariableDeclaration varDcl = atlRule.getInPattern().getElements().get(0);
		
		if ( ! (rule instanceof MatchedRuleOneAnn) ) {
			throw new UnsupportedOperationException();
		}

		OclExpression orOp = null;
		for(DependencyNode d : getDependencies()) {
			// TODO: So far assuming only non-abstract subrules
			// MatchedRuleExecution ex = (MatchedRuleExecution) d;
			
			if ( orOp == null ) {
				orOp = d.genCSP(model);
			} else {
				orOp = model.createBinaryOperator(orOp, d.genCSP(model), "or");
			}
		}
		
		return orOp;
	}
		
	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new UnsupportedOperationException();
	}
	
}
