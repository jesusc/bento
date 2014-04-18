package genericity.compiler.atl.graph;

import genericity.compiler.atl.csp.ErrorSlice;
import genericity.compiler.atl.csp.GraphvizBuffer;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import bento.analysis.atl_analysis.Problem;

public abstract class AbstractDependencyNode implements DependencyNode {

	public LinkedList<DependencyNode> dependencies = new LinkedList<DependencyNode>();
	public LinkedList<DependencyNode> depending    = new LinkedList<DependencyNode>();
	public LinkedList<ConstraintNode> constraints = new LinkedList<ConstraintNode>();
	
	private DependencyGraph	graph;
	private Problem	problem;
	
	@Override
	public void addDependency(DependencyNode node) {
		if ( node == this )
			throw new IllegalArgumentException();
		dependencies.add(node);
		node.addDepending(this);
	}

	public DependencyNode getDependency() {
		if 		( dependencies.size() == 0 ) return null;
		else if ( dependencies.size() == 1 ) return dependencies.get(0);
		
		throw new IllegalStateException("Only one dependency per node supported");
	}

	public ConstraintNode getConstraint() {
		if 		( constraints.size() == 0 ) return null;
		else if ( constraints.size() == 1 ) return constraints.get(0);
		
		throw new IllegalStateException("Only one constraint per node supported");
	}
	
	@Override
	public void addDepending(DependencyNode node) {
		depending.add(node);
	}
	
	
	
	@Override
	public void addConstraint(ConstraintNode constraint) {
		this.constraints.add(constraint);
	}
	
	protected void generatedDependencies(ErrorSlice slice) {
		for(DependencyNode n : dependencies) {
			n.genErrorSlice(slice);
		}					
		for(ConstraintNode c : constraints) {
			c.genErrorSlice(slice);
		}					
		
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
		
		for (ConstraintNode c : constraints) {
			c.genGraphviz(gv);
			gv.addEdge(this, c);
		}
		
	}
	
}
