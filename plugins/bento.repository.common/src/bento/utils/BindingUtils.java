package bento.utils;

import gbind.dsl.MetamodelDeclaration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import bento.binding.utils.BindingModel;
import bento.language.bentocomp.core.BindingDeclaration;
import bento.repository.common.BentoURIResolver;

public class BindingUtils {

	public static BindingModel readBindingDescription(String fileName) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createURI(fileName, true), true);
		
		return new BindingModel(r);
	}

	public static BindingModel readBindingDescription(BindingDeclaration b) {
		Resource r = b.eResource();
		String identifier = BentoURIResolver.tryResolveBinding(b.getFileName(), r);
		return readBindingDescription(identifier);
	}

	public static void loadMetamodels(gbind.dsl.BindingModel m) {
		Consumer<MetamodelDeclaration> load = (md) -> {
			if ( md != null && md.getResource() == null ) {
				String newId = BentoURIResolver.tryResolveMetamodel(md.getMetamodelURI(), m.eResource());
				Resource mmResource = BentoURIResolver.loadMetamodel(newId);
				if ( mmResource != null ) {
					md.setResource(mmResource);
				}
			}			
		};
		
		load.accept(m.getBoundConcept());
		load.accept(m.getBoundMetamodel());		
	}
	
	public static Collection<EClass> getAvailableConcreteClasses(gbind.dsl.BindingModel model) {
		loadMetamodels(model);
		bento.binding.utils.BindingModel util = new bento.binding.utils.BindingModel(model.eResource());
		return util.getConcreteClasses().values();
	}
	
	public static Collection<EClass> getAvailableConceptClasses(gbind.dsl.BindingModel model) {
		loadMetamodels(model);
		bento.binding.utils.BindingModel util = new bento.binding.utils.BindingModel(model.eResource());
		return util.getConceptClasses().values();
	}

	
	
}
