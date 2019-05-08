package bento.component.interpreter;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import bento.component.interpreter.ComponentInterpreter.Adaptation;
import bento.component.model.AdaptationResult;
import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.core.CompositeComponent;
import bento.repository.local.FilePathResolver;

public class TechnologyConfiguration {

	public static final TechnologyConfiguration INSTANCE = new TechnologyConfiguration();
	private HashMap<EClass, TechnologyHandler> map;
	
	private TechnologyConfiguration() {
		this.map = new HashMap<EClass, TechnologyHandler>();
	}
	
	public static interface TechnologyHandler {

		AdaptationResult adapt(Component comp, List<Adaptation> adaptations, CompositeComponent topComposite, FilePathResolver filePathResolver);
		
	}

	public void addHandler(EClass templateKind, TechnologyHandler handler) {
		this.map.put(templateKind, handler);
	}
	
	public TechnologyHandler getHandler(EClass templateKind) {
		return map.get(templateKind);
	}
}
