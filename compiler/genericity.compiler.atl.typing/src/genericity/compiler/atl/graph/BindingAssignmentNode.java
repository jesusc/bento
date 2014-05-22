package genericity.compiler.atl.graph;

import atl.metamodel.OCL.OclExpression;
import bento.analysis.atl_analysis.Problem;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;

public class BindingAssignmentNode extends AbstractBindingAssignmentNode {

	public BindingAssignmentNode(Problem p) {
		super(p);
	}

	public String genCSP(String dependent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		throw new UnsupportedOperationException();		
	}

	/*
	@Override
	public void  getCSPText(CSPBuffer buf) {
		throw new UnsupportedOperationException();
	}
	*/

	@Override
	public boolean isStraightforward() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		throw new UnsupportedOperationException();
	}
}
