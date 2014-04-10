package genericity.compiler.atl.graph;

import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.VariableDeclaration;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.ImperativeRuleAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;

/**
 * Covers both lazy rule and called rule.
 */
public class ImperativeRuleExecution extends AbstractDependencyNode {

	private ImperativeRuleAnn rule;
	private Rule	atlRule;

	public ImperativeRuleExecution(ImperativeRuleAnn rule, Rule atlRule) {
		this.rule = rule;
		this.atlRule = atlRule;
	}
		
	public String genCSP(String dependent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		if ( atlRule instanceof LazyMatchedRule ) {
			slice.addExplicitMetaclass(((LazyRuleAnn) rule).getInPatternType());
		} else {
			throw new UnsupportedOperationException();		
		}
		generatedDependencies(slice);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		String fromPart = "";
		if ( atlRule instanceof LazyMatchedRule ) {
			LazyMatchedRule r = (LazyMatchedRule) atlRule;
			VariableDeclaration varDcl = r.getInPattern().getElements().get(0);
			fromPart = "\\nfrom: " + varDcl.getType().getName();
		}
		gv.addNode(this, rule.getName() + fromPart ); //+ "\\n" + OclGenerator.gen(constraint) );
	}
}
