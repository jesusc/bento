package genericity.compiler.atl.graph;

import atl.metamodel.ATL.MatchedRule;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.OperationCallExp;
import atl.metamodel.OCL.VariableDeclaration;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.annotations.MatchedRuleAnn;
import genericity.typing.atl_types.annotations.MatchedRuleManyAnn;
import genericity.typing.atl_types.annotations.MatchedRuleOneAnn;

public class MatchedRuleExecution extends AbstractDependencyNode implements ExecutionNode {

	private MatchedRuleAnn rule;
	private MatchedRule	atlRule;
	//private DependencyNode	constraint;

	public MatchedRuleExecution(MatchedRuleAnn rule, MatchedRule atlRule) {
		this.rule = rule;
		this.atlRule = atlRule;
	}
	
	/*
	@Override
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
	*/

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		if ( rule instanceof MatchedRuleOneAnn ) {
			slice.addExplicitMetaclass(((MatchedRuleOneAnn) rule).getInPatternType());
		} else {
			for(Metaclass m : ((MatchedRuleManyAnn) rule).getInPatternTypes()) {
				slice.addExplicitMetaclass(m);
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
	/*
	@Override
	public void getCSPText(CSPBuffer buf) {
		Metaclass metaclass = null;
		VariableDeclaration varDcl = atlRule.getInPattern().getElements().get(0);
		
		if ( rule instanceof MatchedRuleOneAnn ) metaclass = ((MatchedRuleOneAnn) rule).getInPatternType();
		else {
			metaclass = ((MatchedRuleManyAnn) rule).getInPatternTypes().get(0);
		}

		if ( rule instanceof MatchedRuleManyAnn ) {
			for(int i = 1; i < ((MatchedRuleManyAnn) rule).getInPatternTypes().size(); i++) {
				metaclass = ((MatchedRuleManyAnn) rule).getInPatternTypes().get(i);
				varDcl    = atlRule.getInPattern().getElements().get(i);

				String s = metaclass.getName() + ".allInstances()"; 
				buf.generateLoop(s, "exists", varDcl.getVarName());
			}
		}

		String s = metaclass.getName() + ".allInstances()"; 
		
		if ( rule.getFilter() != null ) {
			buf.generateLoop(s, "exists", varDcl.getVarName());
			this.getConstraint().getCSPText(buf);
			// buf.generateIf(rule.getFilter(), true);
		} else {
			buf.generateLoop(s, "exists", varDcl.getVarName());
		}

	}
	*/

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
		
		model.addToScope(varDcl, exists.getIterators().get(0));
		
		
		if ( rule.getFilter() != null ) {
			// => if ( filterCondition ) then <? : whenFilter> else false endif
			OclExpression condition = this.getConstraint().genCSP(model);
			IfExp ifExp = model.createIfExpression(condition, null, model.createBooleanLiteral(false) );
			
			// set <? : allInstancesBody>
			exists.setBody(ifExp);
			
			// => set <? : whenFilter>
			OclExpression whenFilterExpr = getDepending().genCSP(model);
			ifExp.setThenExpression(whenFilterExpr);
		} else {
			// set <? : allInstancesBody>
			OclExpression whenFilterExpr = getDepending().genCSP(model);
			exists.setBody(whenFilterExpr);
		}
		
		return exists;
	}
		
}
