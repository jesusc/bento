package bento.component.utils;

import java.io.File;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import bento.component.model.ComponentModel;
import bento.language.bentocomp.dsl.DefinitionRoot;

public class ComponentUtils {
	public static ComponentModel readComponentDescription(IFile f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createPlatformResourceURI(f.getFullPath().toPortableString(), true), true);
		
		return new ComponentModel(r);
	}
	
	public static ComponentModel readComponentDescription(File f) {
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI(f.getAbsolutePath()), true);
		
		return new ComponentModel(r);
	}
	
	
	public static Resource copyResolvingCrossReferences(Resource r, URI uri) {
		ResourceSet rs  = new ResourceSetImpl();
		Resource target = rs.createResource(uri);

		DefinitionRoot mainRoot = (DefinitionRoot) r.getContents().get(0);
		
		TreeIterator<Object> it = EcoreUtil.getAllContents(r.getResourceSet(), true);
		while ( it.hasNext() ) {
			Object obj = it.next();
			// In addition to EObject, the iterator returns Resource's...
			if ( obj instanceof EObject ) {
				EObject o = (EObject) obj;
				if ( o.eContainer() instanceof DefinitionRoot && o.eContainer() != mainRoot ) {
					target.getContents().add(o);
				}
			}
		}

		target.getContents().add(EcoreUtil.copy(mainRoot));
		
		return target;
	}

}
