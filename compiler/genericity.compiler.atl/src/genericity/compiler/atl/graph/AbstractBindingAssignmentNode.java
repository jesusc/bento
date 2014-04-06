package genericity.compiler.atl.graph;

import bento.analysis.atl_analysis.Problem;

public abstract class AbstractBindingAssignmentNode<P extends Problem> extends AbstractProblemNode<P> {

	public AbstractBindingAssignmentNode(P p) {
		super(p);
	}

}
