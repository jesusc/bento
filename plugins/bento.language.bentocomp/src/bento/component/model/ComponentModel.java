package bento.component.model;

import org.eclipse.emf.ecore.resource.Resource;

import bento.language.bentocomp.core.Component;
import bento.language.bentocomp.dsl.DefinitionRoot;

/**
 * This class wraps the a bento component, providing some
 * basic access capabilities.
 * 
 * @author jesus
 *
 */
public class ComponentModel {

	private DefinitionRoot root;

	public ComponentModel(Resource r) {
		this.root = (DefinitionRoot) r.getContents().get(0);
	}

	public Component getComponent() {
		return root.getComponent();
	}

}
