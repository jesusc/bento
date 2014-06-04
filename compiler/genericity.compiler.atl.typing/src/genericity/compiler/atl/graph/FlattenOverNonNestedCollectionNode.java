package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.PropertyCallExp;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass;

public class FlattenOverNonNestedCollectionNode<P extends LocalProblem> extends ExpressionProblemNode<P> {

	public FlattenOverNonNestedCollectionNode(P p, OclExpression expr) {
		super(p, expr);
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		super.genErrorSlice(slice);
	}
	
	@Override
	public OclExpression genCSP(CSPModel model) {
		return super.genCSP(model);
	}
	
	@Override
	public boolean isStraightforward() {
		return true;
	}

}
