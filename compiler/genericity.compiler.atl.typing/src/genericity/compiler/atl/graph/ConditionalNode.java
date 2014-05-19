package genericity.compiler.atl.graph;

import atl.metamodel.OCL.IfExp;
import atl.metamodel.OCL.OclExpression;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.CSPModel;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclGeneratorAST;
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
		gv.addNode(this, "if: " + OclGenerator.gen(ifExpr.getCondition()) + " / " + (branch + "").toUpperCase(), leadsToExecution);
	}

	@Override
	public void getCSPText(CSPBuffer buf) {
		this.getDependency().getCSPText(buf);

		if ( branch == TRUE_BRANCH ) {
			buf.generateIf(ifExpr.getCondition(), true);
		} else {
			buf.generateIf(ifExpr.getCondition(), false);
		}
		
	}


	@Override
	public OclExpression genCSP(CSPModel model) {
		IfExp exp = null;
		OclExpression copied = model.gen(ifExpr.getCondition());
		OclExpression dep    = getDepending().genCSP(model);
		if ( branch == TRUE_BRANCH ) {
			exp = model.createIfExpression(copied, dep, model.createBooleanLiteral(false) );
		} else {
			exp = model.createIfExpression(copied, model.createBooleanLiteral(false), dep );
		}
		return exp;
	}

	
}
