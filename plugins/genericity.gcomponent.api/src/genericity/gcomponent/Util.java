package genericity.gcomponent;

import genericity.language.gcomponent.dsl.DefinitionRoot;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Util {

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
