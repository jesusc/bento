package genericity.compiler.atl.graph;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class ProblemPath {
	public LinkedList<MatchedRuleExecution> rules = new LinkedList<MatchedRuleExecution>();
	private LocalProblem problem;
	private ProblemNode errorNode;
	
	public ProblemPath(LocalProblem p, ProblemNode errorNode) {
		this.problem = p;
		this.errorNode = errorNode;
	}
	
	public ProblemNode getErrorNode() {
		return errorNode;
	}
	
	public LocalProblem getProblem() {
		return problem;
	}
	
	public void addRule(MatchedRuleExecution ruleNode) {
		rules.add(ruleNode);
	}


	public List<MatchedRuleExecution> getRules() {
		return Collections.unmodifiableList(rules);
	}

	public List<? extends ExecutionNode> getExecutionNodes() {
		return rules;
	}

	
	
}
