package bento.sirius.odesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;

public class ModelCopierByName {

	private EPackage originalMetamodel;
	private EPackage targetMetamodel;
	
	private Map<EClassifier, EClassifier> typeMapping;
	private HashMap<EObject, EObject> objectMapping;

	public ModelCopierByName(EPackage originalMetamodel, EPackage targetMetamodel) {
		this.originalMetamodel = originalMetamodel;
		this.targetMetamodel = targetMetamodel;
	}
	
	public void copy(Resource r, Resource target) {
		List<? extends EObject> sourceElements = getAllElements(r);
		sanityCheck(originalMetamodel, sourceElements);
		
		createMapping(originalMetamodel, targetMetamodel);
		copyObjects(sourceElements);
		copyStructuralFeatures();
		
		for (EObject tgt : objectMapping.values()) {
			if (tgt.eContainer() == null) {
				target.getContents().add(tgt);
			}
		}
	}
	
	private void createMapping(EPackage originalMetamodel, EPackage targetMetamodel) {
		this.typeMapping = new HashMap<EClassifier, EClassifier>();
		
		for (EClassifier original : originalMetamodel.getEClassifiers()) {
			for (EClassifier target : targetMetamodel.getEClassifiers()) {
				if (original.getName().equals(target.getName())) {
					typeMapping.put(original, target);
				}
			}	
		}	
	}
	
	private void copyObjects(List<? extends EObject> sourceElements) {
		this.objectMapping = new HashMap<EObject, EObject>();
		for (EObject sourceObject : sourceElements) {
			EClassifier targetType = typeMapping.get(sourceObject.eClass());
			if (targetType instanceof EClass) {			
				EObject targetObject = EcoreUtil.create((EClass) targetType);
				objectMapping.put(sourceObject, targetObject);
			}
		}
	}

	private void copyStructuralFeatures() {
		for (Entry<EObject, EObject> entry : objectMapping.entrySet()) {
			EObject src = entry.getKey();
			EObject tgt = entry.getValue();
			
			copyStructuralFeatures(src, tgt);			
		}
	}

	private void copyStructuralFeatures(EObject src, EObject tgt) {
		EClass klass = src.eClass();
		for (EStructuralFeature feature : klass.getEAllStructuralFeatures()) {
			EStructuralFeature tgtFeature = tgt.eClass().getEStructuralFeature(feature.getName());
			
			Preconditions.checkNotNull(tgtFeature);
			Preconditions.checkState(feature.getClass() == tgtFeature.getClass());
			
			Object srcValue = src.eGet(feature);
			if (srcValue == null)
				continue; // This happen when the reference is empty
			
			if (feature instanceof EAttribute) {
				setAttribute(tgt, (EAttribute) tgtFeature, srcValue);
			} else {
				setReference(tgt, (EReference) tgtFeature, srcValue);
			}
		}
	}

	private void setAttribute(EObject tgt, EAttribute tgtFeature, Object srcValue) {
		if (tgtFeature.isMany()) {
			throw new UnsupportedOperationException("Multivalued attributes not handled yet");
		}
		
		if (tgtFeature.getEType() instanceof EEnum) {			
			srcValue = mapEEnum(tgt, tgtFeature, (EEnum) tgtFeature.getEType(), srcValue);
		} 
		
		tgt.eSet(tgtFeature, srcValue);
		
		// Also set the lifted attribute
		String liftedAttributeClassName = tgtFeature.getName() + tgt.eClass().getName();
		String attributeName = "contains" + liftedAttributeClassName;
		
		EClassifier liftedAttributeClass = this.targetMetamodel.getEClassifier(liftedAttributeClassName);
		
		// This happens when it is a root element, according to OdesignGenerator
		if (liftedAttributeClass == null) 
			return;
		
		Object obj = EcoreUtil.create((EClass) liftedAttributeClass);		
		((Collection<Object>) tgt.eGet(tgt.eClass().getEStructuralFeature(attributeName))).add(obj);
	}
	
	private EEnumLiteral mapEEnum(EObject tgt, EAttribute tgtFeature, EEnum eEnum, Object srcValue) {
		if (srcValue instanceof Collection) {
			throw new UnsupportedOperationException("Not yet implemented");
		}
		
		Enumerator enumerator = (Enumerator) srcValue;
		EEnumLiteral tgtLiteral = eEnum.getEEnumLiteral(enumerator.getLiteral());

		return tgtLiteral;
	}

	@SuppressWarnings("unchecked")
	private void setReference(EObject tgt, EReference tgtFeature, Object srcValue) {
		if (tgtFeature.isMany()) {
			Collection<Object> targetCollection = (Collection<Object>) tgt.eGet(tgtFeature);
			Collection<Object> sourceCollection = (Collection<Object>) srcValue;
			for (Object object : sourceCollection) {
				EObject tgtValue = objectMapping.get(object);
				Preconditions.checkNotNull(tgtValue);
				
				targetCollection.add(tgtValue);
			}
		} else {
			EObject tgtValue = objectMapping.get(srcValue);
			Preconditions.checkNotNull(tgtValue);
			
			tgt.eSet(tgtFeature, tgtValue);
		}
	}
	
	private static List<EObject> getAllElements(Resource originalModel) {
		List<EObject> elements = new ArrayList<EObject>();
		originalModel.getAllContents().forEachRemaining(elements::add);
		return elements;
	}
	
	private void sanityCheck(EPackage metamodel, List<? extends EObject> objects) {
		EOBJECT: 
		for (EObject eObject : objects) {
			for (EClassifier eClassifier : metamodel.getEClassifiers()) {
				//System.out.println(eClassifier);
				if (eObject.eClass() == eClassifier) {
					break EOBJECT;
				}
			}
			//System.out.println("---");
			//System.out.println(eObject.eClass());
			throw new IllegalStateException("Object " + eObject + " not found in package " + metamodel.getNsURI());
		}
	}
	
}
