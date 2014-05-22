package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import atl.metamodel.OCL.OclExpression;
import atl.metamodel.OCL.PropertyCallExp;
import bento.analysis.atl_analysis.atl_error.LocalProblem;
import bento.analysis.atl_analysis.atl_recovery.FeatureFoundInSubclass;

public class FeatureOrOperationNotFoundNode<P extends LocalProblem> extends ExpressionProblemNode<P> {

	public FeatureOrOperationNotFoundNode(P p, OclExpression expr) {
		super(p, expr);
	}
	
	@Override
	public void genErrorSlice(ErrorSlice slice) {
		super.genErrorSlice(slice);
		if ( problem.getRecovery() instanceof FeatureFoundInSubclass ) {
			FeatureFoundInSubclass recovery = (FeatureFoundInSubclass) problem.getRecovery();
			slice.addMetaclassNeededInError(recovery.getSubclass());
		}
	}
	
	@Override
	public OclExpression genCSP(CSPModel model) {
		if ( problem.getRecovery() instanceof FeatureFoundInSubclass ) {
			FeatureFoundInSubclass recovery = (FeatureFoundInSubclass) problem.getRecovery();
			PropertyCallExp pc = (PropertyCallExp) expr;
			return model.negateExpression(model.createKindOf_AllInstancesStyle(model.gen(pc.getSource()), null, recovery.getSubclassName()));
		} else {
			return super.genCSP(model);
		}
	}
	
	@Override
	public boolean isStraightforward() {
		return ! ( problem.getRecovery() instanceof FeatureFoundInSubclass );
	}

}
