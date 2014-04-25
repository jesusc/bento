package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;

public interface GraphNode {
	void   getCSPText(CSPBuffer buf);
	
	void genErrorSlice(ErrorSlice slice);
	void genGraphviz(GraphvizBuffer gv);

}
