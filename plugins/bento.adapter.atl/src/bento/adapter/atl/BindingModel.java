package bento.adapter.atl;

import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.OclFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * This class is a wrapper for a Resource populated by with a model
 * conforming to the binding language. It provides navigation services.
 *  
 * @author jesus
 *
 */
public class BindingModel {
	private Resource resource;

	private List<ClassBinding> classBindings = new ArrayList<ClassBinding>();
	private List<BaseFeatureBinding> featureBindings = new ArrayList<BaseFeatureBinding>();
	
	public BindingModel(Resource r) {
		this.resource = r;
		TreeIterator<EObject> it = r.getAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			if ( obj instanceof ClassBinding ) {
				classBindings.add((ClassBinding) obj);
			} else if ( obj instanceof BaseFeatureBinding ) {
				featureBindings.add((BaseFeatureBinding) obj);
			}
		}
	}


	public gbind.dsl.BindingModel getRoot() {
		return ( gbind.dsl.BindingModel) resource.getContents().get(0);
	}
	
	/**
	 * Find those class bindings whose concept class name is equal to the
	 * given one.
	 * 
	 * @param name
	 * @return 
	 */
	public Optional<ClassBinding> findClassBindingForConcept(String className) {
		return classBindings.stream().filter(cb -> cb.getConcept().getName().equals(className)).findFirst();
	}

	public Stream<ClassBinding> findWhenClauseBindings() {
		return classBindings.stream().filter(cb -> cb.getWhenClause() != null);
	}

	public Stream<RenamingFeatureBinding> findAllRenamingFeatureBindings() {
		return featureBindings.stream().
				filter(fb -> (fb instanceof RenamingFeatureBinding)).
				map(fb -> (RenamingFeatureBinding) fb);		
	}

	public Stream<OclFeatureBinding> findAllOclFeatureBindings() {
		return featureBindings.stream().
				filter(fb -> (fb instanceof OclFeatureBinding)).
				map(fb -> (OclFeatureBinding) fb);		
	}

	public boolean isNoneBinding(ClassBinding cb) {
		return cb.getConcrete().get(0).getName().toUpperCase().equals("NONE");
	}

	public boolean isMultiBinding(ClassBinding cb) {
		return cb.getConcrete().size() > 1;
	}


}
