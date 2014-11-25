package genericity.compiler.atl.graph;

import bento.analyser.util.Pair;
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

public class MatchedRuleAbstract extends MatchedRuleBase {


	public MatchedRuleAbstract(MatchedRuleAnn rule, MatchedRule atlRule) {
		super(rule, atlRule);
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
		// For target variables a new variable is generated, which is not a problem because they are
		// set to undefined anyway. If not, a binding to overriding variables should be done instead.
		Pair<LetExp, LetExp> letPair = genLocalVarsLet(model);
		
		LetExp letUsingDeclaration = letPair._1;
		LetExp letUsingDeclarationInnerLet = letPair._2;
		
		OclExpression result = null;
		
		if ( atlRule.getInPattern().getFilter() != null ) {
			OclExpression condition = this.getConstraint().genCSP(model);
			IfExp ifExp = model.createIfExpression(condition, null, model.createBooleanLiteral(false) );
			OclExpression whenFilterExpr = getDepending().genCSP(model);
			
			
			ifExp.setThenExpression(whenFilterExpr);
			result = ifExp;
		} else {
			OclExpression dep = getDepending().genCSP(model);
			result = dep;			
		}
		
		if ( letUsingDeclaration != null ) {
			letUsingDeclarationInnerLet.setIn_(result);
			result = letUsingDeclaration;
		}
		
		return result;		
	}
		
	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		slice.addRule(this.atlRule);
		for(DependencyNode d : getDependencies()) {
			d.genTransformationSlice(slice);
		}
	}
	
}
