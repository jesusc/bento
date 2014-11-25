package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;

import java.util.ArrayList;

import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.VariableExp;
import bento.analyser.util.Pair;

abstract public class MatchedRuleBase extends AbstractDependencyNode {
	protected MatchedRuleAnn rule;
	protected MatchedRule	atlRule;

	public MatchedRuleBase(MatchedRuleAnn rule, MatchedRule atlRule) {
		this.rule = rule;
		this.atlRule = atlRule;		
	}

	protected Pair<LetExp, LetExp> genLocalVarsLet(CSPModel model) {
		LetExp letUsingDeclarations  = null;
		LetExp letUsingDeclarationInnerLet  = null;
		if ( atlRule.getVariables().size() > 0 ) {
			for(RuleVariableDeclaration v : atlRule.getVariables()) {
				LetExp let = model.createLetScope(model.gen(v.getInitExpression()), null, v.getVarName());
				model.addToScope(v, let.getVariable());
				if ( letUsingDeclarations  != null ) {
					letUsingDeclarationInnerLet.setIn_(let);
				} else {
					letUsingDeclarations = let; // the first let
				}
				letUsingDeclarationInnerLet  = let;
			}
		}
		
		// For each target pattern element, a new local variable is introduced with
		// value OclUndefined. This is needed because the output pattern variable needs
		// to be in the scope when the parameter passing is done.
		// Nevertheless, this is actually only needed for those output pattern elements used as
		// parameters of helpers / lazy or called rules.
		ArrayList<OutPatternElement> passedAsParameters = new ArrayList<OutPatternElement>();
		for(OutPatternElement out : atlRule.getOutPattern().getElements()) {
			for(VariableExp vexp : out.getVariableExp()) {
				if ( vexp.container_() instanceof OperationCallExp ) {
					// This indicates and usage of the variable
					passedAsParameters.add(out);
					break;
				}
			}
		}

		if ( passedAsParameters.size() > 0 ) {
			for(OutPatternElement v : passedAsParameters) {
				OclUndefinedExp undefined = model.create(OclUndefinedExp.class);
				LetExp let = model.createLetScope(undefined, null, v.getVarName());

				model.addToScope(v, let.getVariable());

				if ( letUsingDeclarations  != null ) {
					letUsingDeclarationInnerLet.setIn_(let);
				} else {
					letUsingDeclarations = let; // the first let
				}
				letUsingDeclarationInnerLet  = let;
			}
		}

		Pair<LetExp, LetExp> letPair = new Pair<LetExp, LetExp>(letUsingDeclarations, letUsingDeclarationInnerLet);
		return letPair;
	}

}
