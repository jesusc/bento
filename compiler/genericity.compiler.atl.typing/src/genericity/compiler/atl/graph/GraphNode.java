package genericity.compiler.atl.graph;

import atl.metamodel.OCL.OclExpression;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;

public interface GraphNode {
	void   getCSPText(CSPBuffer buf);
	
	OclExpression   genCSP(CSPModel model);
	
	void genErrorSlice(ErrorSlice slice);
	void genGraphviz(GraphvizBuffer gv);

}
