package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;
import genericity.compiler.atl.csp.TransformationSlice;
import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.LetExp;
import atl.metamodel.OCL.OclExpression;

public class LetScopeNode extends AbstractDependencyNode {

	private LetExp let;

	public LetScopeNode(LetExp let) {
		this.let = let;
	}


	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, let.getVariable().getInitExpression());
		OclSlice.slice(slice, let.getIn_());
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "let " + let.getVariable().getVarName() + " = ...", leadsToExecution);
	}

	@Override
	public OclExpression genCSP(CSPModel model) {
		return model.gen(let);
	}

	@Override
	public void genTransformationSlice(TransformationSlice slice) {
		throw new UnsupportedOperationException();
	}
	
	
}
