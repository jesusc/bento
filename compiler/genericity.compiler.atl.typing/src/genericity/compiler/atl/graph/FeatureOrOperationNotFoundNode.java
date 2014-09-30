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
		// Do not call super, it may make a problematic helper call be included in the path, leading
		// to dependent errors to be included as well, when do not need to, example:
		// * No problematic case (CHIN found in subtype):
		//    helper context KM3!Classifier
		//       def : NOC() : Integer = self.CHIN();
		// * Problematic case (CHIN found in subtype too):
		//    helper context KM3!Classifier
		//       def : NOC() : Integer = self.CHIN() + self.operation_with_problems_inside();
		// 
		//  This is because operation_with_problems_inside will be included in the USE file, 
		//  being problematic and unnecesary for the witness.
		//
		// super.genErrorSlice(slice);
		generatedDependencies(slice);
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
