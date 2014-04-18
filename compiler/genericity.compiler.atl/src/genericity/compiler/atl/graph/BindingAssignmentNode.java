package genericity.compiler.atl.graph;

import bento.analysis.atl_analysis.Problem;
import genericity.compiler.atl.csp.CSPBuffer;
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

	@Override
	public void  getCSPText(CSPBuffer buf) {
		throw new UnsupportedOperationException();
	}
}
