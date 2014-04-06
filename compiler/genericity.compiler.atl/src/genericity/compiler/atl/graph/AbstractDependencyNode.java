package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.GraphvizBuffer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import bento.analysis.atl_analysis.Problem;

public abstract class AbstractDependencyNode implements DependencyNode {

	public LinkedList<DependencyNode> dependencies = new LinkedList<DependencyNode>();
	public LinkedList<DependencyNode> depending    = new LinkedList<DependencyNode>();
	
	private DependencyGraph	graph;
	private Problem	problem;
	
	@Override
	public void addDependency(DependencyNode node) {
		if ( node == this )
			throw new IllegalArgumentException();
		dependencies.add(node);
		node.addDepending(this);
	}
	
	@Override
	public void addDepending(DependencyNode node) {
		depending.add(node);
	}
	

	@Override
	public void setGraph(DependencyGraph dependencyGraph) {
		this.graph = dependencyGraph;
	}

	public void setProblem(Problem p) {
		this.problem = p;
	}
	
	public Problem getProblem() {
		return problem;
	}
	
	protected List<DependencyNode> getDependencies() {
		return Collections.unmodifiableList(dependencies);
	}
	
	@Override
	public void genGraphviz(GraphvizBuffer gv) {
		for (DependencyNode n : dependencies) {
			n.genGraphviz(gv);
			gv.addEdge(this, n);
		}
	}
	
}
