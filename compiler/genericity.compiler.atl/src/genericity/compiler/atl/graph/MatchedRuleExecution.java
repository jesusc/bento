package genericity.compiler.atl.graph;

import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.OCL.VariableDeclaration;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;

public class MatchedRuleExecution extends AbstractDependencyNode {

	private MatchedRuleAnn rule;
	private MatchedRule	atlRule;
	private DependencyNode	constraint;

	public MatchedRuleExecution(MatchedRuleAnn rule, MatchedRule atlRule) {
		this.rule = rule;
		this.atlRule = atlRule;
	}
	
	public void setConstraint(DependencyNode constraint) {
		this.constraint = constraint;
		this.addDependency(constraint);		
	}
	
	public String genCSP(String dependent) {
		Metaclass metaclass = null;
		VariableDeclaration varDcl = atlRule.getInPattern().getElements().get(0);
		
		if ( rule instanceof MatchedRuleOneAnn ) metaclass = ((MatchedRuleOneAnn) rule).getInPatternType();
		else metaclass = ((MatchedRuleManyAnn) rule).getInPatternTypes().get(0);
		
		String s = metaclass.getName() + "::allInstances()"; 
		
		boolean withExists = true;
		
		String depStr = "";
		if ( rule.getFilter() != null ) {
			if ( dependent != null ) 
				depStr = " and \n\t " + dependent; 
			s += "->exists(" + varDcl.getVarName() + "| " + constraint.genCSP(null) + depStr + ")";
		} else if ( dependent != null ) {
			s += "->exists(" + varDcl.getVarName() + "| " + dependent + ")";			
		} else {
			withExists = false;
		}
		
		if ( rule instanceof MatchedRuleManyAnn ) {
			for(int i = 1; i < ((MatchedRuleManyAnn) rule).getInPatternTypes().size(); i++) {
				metaclass = ((MatchedRuleManyAnn) rule).getInPatternTypes().get(i);
				varDcl    = atlRule.getInPattern().getElements().get(i);
				
				if ( ! withExists ) {
					s += "->size() > 0";
				}

				s = metaclass.getName() + "::allInstances()->exists(" + varDcl.getVarName() + "| " + s + ")"; 
				
			}
			withExists = true;
		}
		
		if ( ! withExists ) {
			s += "->size() > 0";
		}

		return s;
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
		
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		
		VariableDeclaration varDcl = atlRule.getInPattern().getElements().get(0);
		gv.addNode(this, rule.getName() + "\\nfrom: " + varDcl.getType().getName() ); //+ "\\n" + OclGenerator.gen(constraint) );
	}
}
