package genericity.compiler.atl.graph;

import atl.metamodel.OCL.Iterator;
import atl.metamodel.OCL.OclExpression;
import genericity.compiler.atl.csp.CSPBuffer;
import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;
import genericity.compiler.atl.csp.OclGenerator;
import genericity.compiler.atl.csp.OclSlice;

public class LoopNode extends AbstractDependencyNode {

	private OclExpression	receptor;
	private Iterator	iteratorVar;

	public LoopNode(OclExpression receptor, Iterator iterator) {
		this.receptor = receptor;
		this.iteratorVar = iterator;
	}

	@Override
	public void getCSPText(CSPBuffer buf) {
		this.getDependency().getCSPText(buf);
		buf.generateLoop(receptor, "exists", iteratorVar.getVarName());
		//throw new UnsupportedOperationException();		
		
	}

	@Override
	public void genErrorSlice(ErrorSlice slice) {
		// TODO: Slice only until the end of the loop (to avoid slicing part of the body of an iterator, not included in the path)
		OclSlice.slice(slice, receptor);
		super.generatedDependencies(slice);
	}

	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		gv.addNode(this, "Loop: " + OclGenerator.gen(receptor));
		super.genGraphviz(gv);
	}
	
}
