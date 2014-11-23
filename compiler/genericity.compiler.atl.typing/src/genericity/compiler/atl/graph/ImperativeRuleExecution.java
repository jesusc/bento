package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.TransformationSlice;
import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.Type;
import genericity.typing.atl_types.annotations.CalledRuleAnn;
import genericity.typing.atl_types.annotations.ImperativeRuleAnn;
import genericity.typing.atl_types.annotations.LazyRuleAnn;

import org.eclipse.emf.common.util.EList;

import atl.metamodel.ATL.CalledRule;
import atl.metamodel.ATL.LazyMatchedRule;
import atl.metamodel.ATL.Rule;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.VariableDeclaration;

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
	public void genTransformationSlice(TransformationSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genTransformationSlice(slice);
		}					

		// throw new UnsupportedOperationException();
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		if ( atlRule instanceof LazyMatchedRule ) {
			slice.addExplicitMetaclass(((LazyRuleAnn) rule).getInPatternType());
		} else if ( atlRule instanceof CalledRule ) {
			EList<Type> args = ((CalledRuleAnn) rule).getArguments();
			for (Type type : args) {
				if ( type instanceof Metaclass ) {
					slice.addExplicitMetaclass((Metaclass) type);				
				}
			}
		} else {
			throw new UnsupportedOperationException(atlRule.getClass().getName());		
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
		gv.addNode(this, "<<lazy>>\\n" + rule.getName() + fromPart, leadsToExecution ); //+ "\\n" + OclGenerator.gen(constraint) );
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		return getDepending().genCSP(model);
	}
	

		
}
