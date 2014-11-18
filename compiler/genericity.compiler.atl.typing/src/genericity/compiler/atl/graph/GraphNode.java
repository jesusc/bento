package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.TransformationSlice;
import atl.metamodel.OCL.OclExpression;

public interface GraphNode {
	OclExpression   genCSP(CSPModel model);
	
	void genErrorSlice(ErrorSlice slice);
	void genTransformationSlice(TransformationSlice slice);
	void genGraphviz(GraphvizBuffer gv);

}
