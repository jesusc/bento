package genericity.compiler.atl.graph;

import java.util.ArrayList;

import atl.metamodel.ATL.InPatternElement;
import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.ATL.OutPatternElement;
import atl.metamodel.ATL.RuleVariableDeclaration;
import atl.metamodel.ATL.SimpleInPatternElement;
import atl.metamodel.ATL.SimpleOutPatternElement;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OclUndefinedExp;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import atl.metamodel.OCL.VariableExp;
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

public class MatchedRuleExecution extends AbstractDependencyNode implements ExecutionNode {

	protected MatchedRuleAnn rule;
	protected MatchedRule	atlRule;
	//private DependencyNode	constraint;

	public MatchedRuleExecution(MatchedRuleAnn rule, MatchedRule atlRule) {
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
		gv.addNode(this, rule.getName() + "\\nfrom: " + varDcl.getType().getName(), leadsToExecution ); //+ "\\n" + OclGenerator.gen(constraint) );
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		Metaclass metaclass = null;
		VariableDeclaration varDcl = atlRule.getInPattern().getElements().get(0);
		
		if ( rule instanceof MatchedRuleOneAnn ) metaclass = ((MatchedRuleOneAnn) rule).getInPatternType();
		else {
			metaclass = ((MatchedRuleManyAnn) rule).getInPatternTypes().get(0);
		}

		if ( rule instanceof MatchedRuleManyAnn ) {
			System.err.println("MatchedRuleExecution: rules with several input types not supported yet");
			// throw new IllegalArgumentException();
			
			/*
			for(int i = 1; i < ((MatchedRuleManyAnn) rule).getInPatternTypes().size(); i++) {
				metaclass = ((MatchedRuleManyAnn) rule).getInPatternTypes().get(i);
				varDcl    = atlRule.getInPattern().getElements().get(i);

				String s = metaclass.getName() + ".allInstances()"; 
				buf.generateLoop(s, "exists", varDcl.getVarName());
			}
			*/
		}

		// T::allInstances->exists(t | <? : allInstancesBody> )
		OperationCallExp allInstancesCall = model.createAllInstances(metaclass);
		IteratorExp exists = model.createExists(allInstancesCall, varDcl.getVarName());
		
		VariableDeclaration varDclMappedVar = exists.getIterators().get(0);
		model.addToScope(varDcl, varDclMappedVar);
			
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

		if ( atlRule.getVariables().size() > 0 || passedAsParameters.size() > 0 ) {			
			exists.setBody(letUsingDeclarations);			
		}
		
		// 
		
		
		
		if ( rule.getFilter() != null ) {
			// => if ( filterCondition ) then <? : whenFilter> else false endif
			OclExpression condition = this.getConstraint().genCSP(model);
			IfExp ifExp = model.createIfExpression(condition, null, model.createBooleanLiteral(false) );
			
			// set <? : allInstancesBody>
			if ( letUsingDeclarations == null )
				exists.setBody(ifExp);
			else 
				letUsingDeclarationInnerLet.setIn_(ifExp);
			
			// => set <? : whenFilter>
			mapSuperRuleVariables(varDclMappedVar, atlRule.getSuperRule(), model);
			OclExpression whenFilterExpr = getDepending().genCSP(model);
			ifExp.setThenExpression(whenFilterExpr);
		} else {
			// set <? : allInstancesBody>
			mapSuperRuleVariables(varDclMappedVar, atlRule.getSuperRule(), model);
			OclExpression whenFilterExpr = getDepending().genCSP(model);

			// set <? : allInstancesBody>
			if ( letUsingDeclarations  == null )
				exists.setBody(whenFilterExpr);
			else 
				letUsingDeclarationInnerLet.setIn_(whenFilterExpr);
		}
		
		return exists;
	}

	private void mapSuperRuleVariables(VariableDeclaration varDclMappedVar, MatchedRule superRule, CSPModel model) {
		if ( superRule == null )
			return;
		
		if ( superRule.getInPattern().getElements().size() > 1 )
			throw new UnsupportedOperationException("Only super rules with one input elements supported");
		
		
		SimpleInPatternElement e = (SimpleInPatternElement) superRule.getInPattern().getElements().get(0);
		model.addToScope(e, varDclMappedVar);
		
		mapSuperRuleVariables(varDclMappedVar, superRule.getSuperRule(), model);
		
	}
		
	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		slice.addRule(this.atlRule);
	}
	
}
