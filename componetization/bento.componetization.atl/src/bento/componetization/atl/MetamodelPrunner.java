package bento.componetization.atl;

import genericity.typing.atl_types.UnknownFeature;

import java.util.HashMap;
import java.util.HashSet;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class MetamodelPrunner extends FootprintComputation {


	private EPackage conceptPkg;

	protected HashMap<EClass, EClass> traceClass   = new HashMap<EClass, EClass>();
	protected HashMap<EDataType, EDataType> traceDataType   = new HashMap<EDataType, EDataType>();

	protected HashMap<EStructuralFeature, EStructuralFeature> traceFeature = new HashMap<EStructuralFeature, EStructuralFeature>();
		
	private Strategy strategy = Strategy.REALFEATURE_STRATEGY;
	
	/**
	 * 
	 * @param atlTransformation The transformation under analysis
	 * @param mm The meta-models of the transformation
	 * @param typing The model containing the typing information
	 * @param slicedURI The URI of the meta-model of interest
	 */
	public MetamodelPrunner(BasicEMFModel atlTransformation, IModel mm, BasicEMFModel typing, String slicedURI) {
		super(atlTransformation, mm, typing, slicedURI);
	}

	public EPackage extractSource(String name, String conceptURI, String conceptPrefix) {
		computeFootprint();
		
		conceptPkg = EcoreFactory.eINSTANCE.createEPackage();
		conceptPkg.setName(name);
		conceptPkg.setNsURI(conceptURI);
		conceptPkg.setNsPrefix(conceptPrefix);
		
		//copyClasses(directUsedTypes);
		//copyClasses(indirectUsedTypes);
		
		strategy.transform(this);
		
		// fillFeatures(directUsedTypes);
		
		return conceptPkg;
	}
	
	private void copyReferences(HashSet<EClass> usedTypes) {
		for (EClass eClass : usedTypes) {
			EClass copy = EcoreFactory.eINSTANCE.createEClass();
			copy.setName(eClass.getName());
		
			conceptPkg.getEClassifiers().add(copy);
			traceClass.put(eClass, copy);
		}
	}

	private void copyFeature(EClass klass, EStructuralFeature usedFeature) {
		if ( traceFeature.containsKey(usedFeature) ) {
			throw new IllegalStateException("Feature " + usedFeature.getName() + " already translated");
		}
		
		EClass conceptClass = traceClass.get(klass);
		EStructuralFeature copy = null;
		
		if ( usedFeature instanceof EAttribute ) {
			copy = EcoreFactory.eINSTANCE.createEAttribute();
			
			copy.setEType( copyDataTypeIfNeeded((EDataType) usedFeature.getEType()) );
			
		} else if ( usedFeature instanceof EReference )  {
			copy = EcoreFactory.eINSTANCE.createEReference();
			EClass tgtType = traceClass.get( usedFeature.getEType() );
			
			if ( usedFeature.getEType() == null ) throw new IllegalStateException("No type for feature " + usedFeature.getName());
			if ( tgtType == null ) throw new IllegalStateException("Not found target type " + usedFeature.getEType().getName() + " of reference " + usedFeature.getName());
			
			((EReference) copy).setContainment( ((EReference) usedFeature).isContainment() );
			copy.setEType( tgtType );
		}
	
		copy.setName( usedFeature.getName() );
		copy.setLowerBound( usedFeature.getLowerBound() );
		copy.setUpperBound( usedFeature.getUpperBound() );
		
		
		if ( conceptClass == null ) {
			throw new IllegalStateException("No class " + klass.getName() + ". Copying feature " + usedFeature.getName());
		}
		
		traceFeature.put(usedFeature, copy);
		
		conceptClass.getEStructuralFeatures().add(copy);
	}

	private EClassifier copyDataTypeIfNeeded(EDataType type) {
		if (traceDataType.containsKey(type) )
			return traceDataType.get(type);
		
		if ( EcoreUtil.isAncestor(pkg, type) ) {
			EDataType copied = EcoreUtil.copy(type);

			traceDataType.put(type, copied);
			conceptPkg.getEClassifiers().add( copied );
		
			return copied;
		}
		
		return type;
	}

	private void copyClasses(HashSet<EClass> usedTypes) {
		for (EClass eClass : usedTypes) {
			copyClass(eClass);
		}
	}

	private EClass copyClass(EClass eClass) {
		if ( traceClass.containsKey(eClass) )
			return traceClass.get(eClass);
		
		EClass copy = EcoreFactory.eINSTANCE.createEClass();
		copy.setName(eClass.getName());
	
		conceptPkg.getEClassifiers().add(copy);
		traceClass.put(eClass, copy);
		
		return copy;
	}
	
	private boolean classInMetamodel(EClass eclass) {
		return EcoreUtil.isAncestor(pkg, eclass);
	}
	
	/**
	 * Takes an original EClass and the copied version and sets the
	 * inheritance links of the copied version by following the
	 * inheritance hierarchy of the original one, but taking into
	 * account the classes that have been copied.
	 * @param eclass
	 */
	private void setInheritanceLinks(EClass eclass, EClass copied) {
		EList<EClass> supertypes = eclass.getESuperTypes();
		for (EClass superType : supertypes) {
			// Not sure why proxies are not resolved...
			if ( superType.eIsProxy() ) {
				
				System.out.println( ((InternalEObject) superType).eProxyURI() );
				System.out.println("Proxy not resolved: MetamodelPrunner");
				continue;
			}
			
			EClass copiedSuperType = traceClass.get(superType);
			if ( copiedSuperType == null ) {
				copiedSuperType = copyClass(superType);
			}
			
			copied.getESuperTypes().add(copiedSuperType);
			setInheritanceLinks(superType, copiedSuperType);
				
			/*
			EClass originalTranslated = someInHierarchyTranslated(superType);
			if ( originalTranslated != null ) {
				copied.getESuperTypes().add(traceClass.get(originalTranslated));
			}
			*/
		}
	}
	
	
	/*
	private EClass someInHierarchyTranslated(EClass superType) {
		if ( traceClass.containsKey(superType) ) return superType;
		for (EClass c : superType.getESuperTypes()) {
			EClass translated = someInHierarchyTranslated(c);
			if ( translated != null ) return translated;
		}
		return null;
	}
	*/

	// Very compact way of implementing the state / strategy pattern!
	// But the enclosing type does not seem to be available :-(
	public enum Strategy {
		
		REALFEATURE_STRATEGY() {
			public void transform(MetamodelPrunner extractor) {
				for(EClass c : extractor.directUsedTypes) {
					extractor.copyClass(c);
				}
				
				for(EStructuralFeature f : extractor.getUsedFeatures()) {
					// This is to rule out classes that belongs to other meta-models of the transformation
					if ( ! extractor.classInMetamodel(f.getEContainingClass() ) ) continue;
					
					extractor.copyClass( f.getEContainingClass() );
					if ( f instanceof EReference ) {
						// This creates the target type even if it is not used effectively in the transformation
						// TODO: Another strategy: Use the "implicitly used types" to restrict this...??
						extractor.copyClass( ((EReference) f).getEReferenceType() );
					}
					extractor.copyFeature( f.getEContainingClass(), f);
				}
				
				for(EClass original : new HashSet<EClass>(extractor.traceClass.keySet()) ) {
					extractor.setInheritanceLinks(original, extractor.traceClass.get(original));
				}
			}
		},

		CALLSITES_STRATEGY() {

			/**
			 * This version uses the call sites...
			 */
			public void transform(MetamodelPrunner extractor) {
				for(EClass c : extractor.directUsedTypes) {
					extractor.copyClass(c);
				}
				
				for(CallSite site : extractor.callSites ) {
					// System.out.println(site);
					if ( ! extractor.classInMetamodel( site.getReceptor() ) ) continue;
					
					extractor.copyClass( site.getReceptor() );
					if ( site.getFeature() instanceof EReference ) {
						// This creates the target type even if it is not used effectively in the transformation
						// TODO: Another strategy: Use the "implicitly used types" to restrict this...??
						extractor.copyClass( ((EReference) site.getFeature()).getEReferenceType() );
					} else if ( site.getFeature() instanceof UnknownFeature ) 
						continue;
					
					extractor.copyFeature( site.getReceptor(), site.getFeature() );
				}
				
				for(EClass original : extractor.traceClass.keySet() ) {
					extractor.setInheritanceLinks(original, extractor.traceClass.get(original));
				}
			}
		};

		public abstract void transform(MetamodelPrunner extractor);
	}


	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	
}
