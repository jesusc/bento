package genericity.compiler.atl.graph;

import atl.metamodel.OCL.IfExp;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;

public class ConditionalNode extends AbstractDependencyNode {

	private IfExp	ifExpr;
	private boolean	branch;
	public final static boolean TRUE_BRANCH = true;
	public final static boolean FALSE_BRANCH = false;
	
	public ConditionalNode(IfExp ifExpr, boolean branch) {
		this.ifExpr = ifExpr;
		this.branch = branch;
	}
	
	@Override
	public String genCSP(String dependent) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		OclSlice.slice(slice, ifExpr.getCondition());
		if ( branch == TRUE_BRANCH ) {
			OclSlice.slice(slice, ifExpr.getThenExpression());
		} else {
			OclSlice.slice(slice, ifExpr.getElseExpression());			
		}
		generatedDependencies(slice);
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		super.genGraphviz(gv);
		gv.addNode(this, "if: " + OclGenerator.gen(ifExpr.getCondition()) + " / " + (branch + "").toUpperCase());
	}
	
}
