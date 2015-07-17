package bento.binding.utils;

import gbind.dsl.BaseFeatureBinding;
import gbind.dsl.ClassBinding;
import gbind.dsl.LocalHelper;
import gbind.dsl.MetamodelDeclaration;
import gbind.dsl.OclFeatureBinding;
import gbind.dsl.RenamingFeatureBinding;
import gbind.dsl.VirtualClassBinding;
import gbind.dsl.VirtualMetaclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
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
	private List<VirtualClassBinding> virtualClassBindings = new ArrayList<VirtualClassBinding>();
	private List<VirtualMetaclass> virtualMetaclasses = new ArrayList<VirtualMetaclass>();
	private List<LocalHelper> localHelpers = new ArrayList<LocalHelper>();
	
	public BindingModel(Resource r) {
		this.resource = r;
		TreeIterator<EObject> it = r.getAllContents();
		while ( it.hasNext() ) {
			EObject obj = it.next();
			if ( obj instanceof ClassBinding ) {
				classBindings.add((ClassBinding) obj);
			} else if ( obj instanceof BaseFeatureBinding ) {
				featureBindings.add((BaseFeatureBinding) obj);
			} else if ( obj instanceof VirtualClassBinding ) {
				virtualClassBindings.add((VirtualClassBinding) obj);
			} else if ( obj instanceof VirtualMetaclass ) {
				virtualMetaclasses.add((VirtualMetaclass) obj);
			} else if ( obj instanceof LocalHelper ) {
				localHelpers.add((LocalHelper) obj);
			}
		}
	}

	public Resource getResource() {
		return resource;
	}

	public gbind.dsl.BindingModel getRoot() {
		return ( gbind.dsl.BindingModel) resource.getContents().get(0);
	}

	public List<LocalHelper> getLocalHelpers() {
		return localHelpers;
	}


	/**
	 * Find those class bindings whose concept class name is equal to the
	 * given one.
	 * 
	 * @param name
	 * @return 
	 */
	public Optional<ClassBinding> findClassBindingForConcept(String className) {
		return classBindings.stream().filter(cb -> {
			// System.out.println(cb.getConcept().getName());
			return cb.getConcept().getName().equals(className);
		}).findFirst();
	}


	public Optional<VirtualClassBinding> findVirtualClassBindingForConcept(String className) {
		return virtualClassBindings.stream().filter(cb -> cb.getConcept().getName().equals(className)).findFirst();
	}
	
	public Stream<VirtualClassBinding> findVirtualClassBindingsForConcept(String className) {
		return virtualClassBindings.stream().filter(cb -> cb.getConcept().getName().equals(className));
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


	public List<VirtualMetaclass> getVirtualClasses() {
		return virtualMetaclasses;
	}

	public List<VirtualClassBinding> getVirtualClassBinding() {
		return virtualClassBindings;
	}


	public boolean hasVirtualClasses() {
		return virtualClassBindings.size() > 0;
	}

	public HashMap<String, EEnum> getConceptEnumerations() {
		return computeClassifiers(getRoot().getBoundConcept(), EEnum.class);
	}
	
	public HashMap<String, EClass> getConceptClasses() {
		return computeClassifiers(getRoot().getBoundConcept(), EClass.class);
	}

	public HashMap<String, EClass> getConcreteClasses() {
		return computeClassifiers(getRoot().getBoundMetamodel(), EClass.class);
	}

	private <T extends EClassifier> HashMap<String, T> computeClassifiers(MetamodelDeclaration m, Class<T> klass) {
		HashMap<String, T> result = new HashMap<String, T>();
		if (m == null)
			return result;

		TreeIterator<EObject> it = m.getResource().getAllContents();
		while (it.hasNext()) {
			EObject obj = it.next();
			if (klass.isInstance(obj)) {
				result.put(((EClassifier) obj).getName(), klass.cast(obj));
			}
		}
		return result;
	}


	


}
