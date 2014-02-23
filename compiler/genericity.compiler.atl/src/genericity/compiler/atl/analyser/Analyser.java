package genericity.compiler.atl.analyser;

import genericity.compiler.atl.analyser.namespaces.GlobalNamespace;
import genericity.typecheck.atl.AtlTransformationMetamodelsModel;

import java.io.IOException;
import java.util.List;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IModel;

import atl.metamodel.ATLModel;
import atl.metamodel.ATL.Module;
import atl.metamodel.ATL.Unit;

public class Analyser {
	private GlobalNamespace	mm;
	private TypingModel	typ;
	private ATLModel	trafo;
	private ErrorModel	errors;

	public Analyser(GlobalNamespace mm, BasicEMFModel trafo, BasicEMFModel out) throws IOException {
		this.mm    = mm;
		this.trafo = new ATLModel(trafo.getHandler().getResource());
		this.typ   = new TypingModel(out);
		this.errors = new ErrorModel();
	
		AnalyserContext.setErrorModel(errors);
		AnalyserContext.setTypingModel(typ);
	}

	public void perform() {
		List<? extends Unit> units = trafo.allObjectsOf(Unit.class);
		for (Unit unit : units) {
			new BottomUpTraversal(trafo, mm, unit, typ, errors).perform();
		}
	}

	
}
