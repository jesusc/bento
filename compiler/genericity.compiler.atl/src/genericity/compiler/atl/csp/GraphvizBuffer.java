package genericity.compiler.atl.csp;

import genericity.compiler.atl.graph.DependencyNode;

import java.util.ArrayList;
import java.util.List;

public class GraphvizBuffer {
	private List<DependencyNode> allNodes = new ArrayList<DependencyNode>();

	private List<DependencyNode> subraphList = new ArrayList<DependencyNode>();
	private String nodes = "";
	private String edges = "";
	private ArrayList<String> subgraphs = new ArrayList<String>();

	public void addNode(DependencyNode node, String label) {
		int i = addNodeAux(node);
		
		nodes = nodes + "\n" + (genNodeName(i) + "[label=\"" + label + "\"];"); 
	}
	
	private int addNodeAux(DependencyNode node) {
		// System.out.println("GrapvizBuffer: " + node.getClass().getSimpleName());
		int i = allNodes.indexOf(node);
		if ( i == -1 ) {
			subraphList.add(node);
			allNodes.add(node);
			i = allNodes.size() - 1;
		}
		return i;
	}

	private String genNodeName(int i) {
		return "node_" + i;
	}

	public void addEdge(DependencyNode start, DependencyNode end) {
		int i = addNodeAux(start);
		int j = addNodeAux(end);;
		if ( i == -1 || j == -1 ) 
			throw new IllegalArgumentException();
		
		edges += "\n" + genNodeName(i) + " -> " + genNodeName(j) + ";";
	}
	
	protected String getText() {
		String body = null;
		if ( subgraphs.size() == 0 ) body = genBody();
		else {
			body = "";
			for (String s : subgraphs) {
				body += s + "\n";
			}
		}

		return "digraph G {\n" +
			body +
			"}";
	}

	protected String genBody() {
	    return "    node [ shape = box ];\n" +
		"    " + nodes + "\n" + edges + "\n";
	}
	
	public void packSubgraph() {
		subgraphs.add("subgraph " + "cluster_" + subgraphs.size() + "{\n" + genBody() + "\n}"); 
		subraphList = new ArrayList<DependencyNode>();
		nodes = "";
		edges = "";
	}
	
}
