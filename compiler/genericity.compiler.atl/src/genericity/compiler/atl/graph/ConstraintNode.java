package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;

public interface ConstraintNode extends GraphNode {
	
	public void genErrorSlice(ErrorSlice slice);
	public void genGraphviz(GraphvizBuffer gv);
}
