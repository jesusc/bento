package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.compiler.atl.graph.DependencyGraph;
import genericity.compiler.atl.graph.ErrorPathGenerator;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.eclectic.modeling.emf.BasicEMFModel;

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Unit;

public class Analyser {
	private GlobalNamespace	mm;
	private TypingModel	typ;
	private ATLModel	trafo;
	private ErrorModel	errors;
	
	private boolean doDependency = true;
	private DependencyGraph dependencyGraph;
	
	public Analyser(GlobalNamespace mm, BasicEMFModel trafo, BasicEMFModel out) throws IOException {
		this.mm    = mm;
		this.trafo = new ATLModel(trafo.getHandler().getResource());
		this.typ   = new TypingModel(out);
		this.errors = new ErrorModel();
	}
	
	public void setDoDependencyAnalysis(boolean doDependency) {
		this.doDependency = doDependency;
	}

	public void perform() {
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<?> result = executor.submit(new Runnable() {			
			@Override
			public void run() {
				AnalyserContext.setErrorModel(errors);
				AnalyserContext.setTypingModel(typ);				
				
				List<? extends Unit> units = trafo.allObjectsOf(Unit.class);
				for (Unit unit : units) {
					new TypeAnalysisTraversal(trafo, mm, unit, typ, errors).perform();
				}	
				
				if ( doDependency ) 
					dependencyGraph = new ErrorPathGenerator(errors, typ, trafo).perform();
			}
		});

		try {
			// wait;
			result.get();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {			
			executor.shutdown();
		}
		
		
	}
	
	public ErrorModel getErrors() {
		return errors;
	}
	
	public TypingModel getTyping() {
		return typ;
	}

	public DependencyGraph getDependencyGraph() {
		return dependencyGraph;
	}

	public ATLModel getATLModel() {
		return trafo;
	}
}
