package genericity.compiler.atl.graph;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import bento.analysis.atl_analysis.Problem;

public class DependencyGraph {
	public LinkedList<DependencyNode> leaves = new LinkedList<DependencyNode>();
	public LinkedList<MatchedRuleExecution> rules = new LinkedList<MatchedRuleExecution>();
	
	public void addLeaf(DependencyNode node) {
		node.setGraph(this);
		leaves.add(node);
	}


	public void addRule(MatchedRuleExecution ruleNode) {
		rules.add(ruleNode);
	}


	public List<MatchedRuleExecution> getRules() {
		return Collections.unmodifiableList(rules);
	}


	private HashMap<Problem, DependencyNode> problemsToNodes = new HashMap<Problem, DependencyNode>();
	public void linkProblemToNode(Problem p, DependencyNode node) {
		node.setProblem(p);
		problemsToNodes.put(p, node);
	}
	
	public DependencyNode getNodeFromProblem(Problem p) {
		return problemsToNodes.get(p);
	}
	
	public Collection<DependencyNode> getProblemNodes() {
		return problemsToNodes.values();
	}
	
}
