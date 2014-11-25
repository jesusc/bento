package genericity.compiler.atl.csp;

import genericity.compiler.atl.analyser.Analyser;
import genericity.compiler.atl.analyser.ErrorUtils;
import genericity.compiler.atl.graph.DependencyNode;
import genericity.compiler.atl.graph.ExecutionNode;
import genericity.compiler.atl.graph.ProblemGraph;
import genericity.compiler.atl.graph.ProblemPath;

import java.util.List;

import atl.metamodel.OCL.IteratorExp;
import atl.metamodel.OCL.OclExpression;
import bento.analyser.util.AtlLoader;
import bento.analysis.atl_analysis.atl_error.LocalProblem;

public class CSPGenerator {
	
	private ProblemGraph	graph;
	private AtlLoader loader;

	public CSPGenerator(ProblemGraph g, AtlLoader loader) {
		this(g);
		this.loader = loader;
	}
	
	public CSPGenerator(ProblemGraph g) {
		this.graph = g;
	}

	public String generate(Analyser analyser) {
		return generateLoc(null, analyser);
	}
	
	public String generateLoc(String location, Analyser analyser) {
		List<ProblemPath> sorted = graph.getSortedPaths();
		
		String s = "";
		for(ProblemPath path : sorted) {
			LocalProblem lp = (LocalProblem) path.getProblem();

			if ( location != null && ! lp.getLocation().equals(location) ) 
				continue;
			
			s += ErrorUtils.getErrorMessage(lp) + " (" + lp.getLocation() +"): \n";
//			System.out.println(lp.getLocation());
			s += generateCSP(path, analyser);
			s += "\n\n";
			// System.out.println(s);
		}
		return s;
	}

	/*
	public String generate(Problem p) {
		for(DependencyNode node : graph.getProblemNodes()) {
			if ( node.getProblem() == p ) {
				return generateCSP(node);
			}
		}
		throw new IllegalArgumentException();
	}
	*/
	
	public String generateCSP(ProblemPath path, Analyser analyser) {
		DependencyNode errorNode = path.getErrorNode();

		if ( path.getExecutionNodes().size() == 0 ) {
			// TODO: Signal this otherwise
			return "Dead code";
		}
		
		// Create the thisModule context at the top level
		CSPModel model = new CSPModel(loader, analyser);

		IteratorExp ctx = model.createThisModuleContext();
		model.setThisModuleVariable(ctx.getIterators().get(0));
		
		OclExpression orOp = null;
		for (ExecutionNode node : path.getExecutionNodes()) {		
			model.resetScope();
			
			OclExpression exp = node.genCSP(model);
			if ( orOp == null ) {
				orOp = exp;
			} else {
				orOp = model.createBinaryOperator(orOp, exp, "or");
			}

			// return OclGenerator.gen(ctx); // Not passing the analyser because it is not an original expression...
			// Only one execution node supported so far
		}
		
		ctx.setBody(orOp);
		
		return OclGenerator.gen(ctx);
		
		// return "Nothing generated";
	}
}
