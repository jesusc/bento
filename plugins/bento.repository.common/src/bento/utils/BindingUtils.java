package bento.utils;

import org.eclipse.emf.common.util.URI;
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
}
