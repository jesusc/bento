package genericity.typecheck.atl;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;

public class AtlTransformationMetamodelsModel implements IModel<EObject, EClass>{
	HashSet<Resource> resources = new HashSet<Resource>();
	private Object methodHandler;
	private Map<String, Resource>	logicalNamesToMetamodels;
	
	public AtlTransformationMetamodelsModel(Collection<Resource> r, Map<String, Resource> logicalNamesToMetamodels) {
		for (Resource resource : r) {
			resources.add(resource);
		}
		this.logicalNamesToMetamodels = logicalNamesToMetamodels;
	}
	
	public HashMap<String, Resource> getLogicalNamesToMetamodels() {
		return new HashMap<String, Resource>(logicalNamesToMetamodels);
	}
	
	@Override
	public List<EObject> allObjectsOf(String metaclass) {
		EClass c = getMetaclass(metaclass);
		ArrayList<EObject> all = new ArrayList<EObject>();
		for (Resource r : resources) {
			TreeIterator<EObject> it = r.getAllContents();
			while ( it.hasNext() ) {
				EObject obj = it.next();
				if ( c.isInstance( obj ) ) {
					all.add(obj);
				}
			}
		}
		return all;
	}

	@Override
	public List<EObject> allObjectsOf(String metaclass, boolean noSubtypes) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject createObject(String metaclass) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteObject(EObject o) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public EClass getMetaclass(String metaclass) {
		return (EClass) EcorePackage.eINSTANCE.getEClassifier(metaclass);
	}

	@Override
	public void setFeature(EObject receptor, String featureName, Object value) {
		throw new UnsupportedOperationException();				
	}

	@Override
	public Object getFeature(EObject receptor, String featureName) {
		return receptor.eGet(receptor.eClass().getEStructuralFeature(featureName));
	}

	@Override
	public boolean hasFeature(EObject receptor, String featureName) {
		return receptor.eClass().getEStructuralFeature(featureName) != null;
	}

	@Override
	public boolean contains(Object obj) {
		if ( obj instanceof EObject ) {
			return resources.contains( ((EObject) obj).eResource() );
		}
		return false;
	}

	@Override
	public boolean isKindOf(Object o, String metaclass) {
		return getMetaclass(metaclass).isInstance(o);
	}

	@Override
	public void registerMethodHandler(Object handler) {
		this.methodHandler = handler;
	}

	@Override
	public Object getMethodHandler() {
		return methodHandler;
	}

	@Override
	public Object getContainer(Object object) {
		return ((EObject) object).eContainer();
	}


}
