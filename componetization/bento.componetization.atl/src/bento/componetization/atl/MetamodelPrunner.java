package bento.componetization.atl;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.UnknownFeature;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class MetamodelPrunner {

	private String slicedURI;
	private BasicEMFModel typing;
	private BasicEMFModel mm;
	private BasicEMFModel atlTransformation;
	private EPackage pkg;
	private EPackage conceptPkg;

	protected HashSet<EClass> directUsedTypes   = new HashSet<EClass>();
	protected HashSet<EClass> indirectUsedTypes = new HashSet<EClass>();
	protected HashSet<EReference> usedReferences = new HashSet<EReference>();
	protected HashSet<EAttribute> usedAttributes = new HashSet<EAttribute>();
	protected HashSet<UnknownFeature> unknownFeatures = new HashSet<UnknownFeature>();
	
	protected HashSet<CallSite> callSites = new HashSet<CallSite>();

	protected HashMap<EClass, EClass> traceClass   = new HashMap<EClass, EClass>();
	protected HashMap<EStructuralFeature, EStructuralFeature> traceFeature = new HashMap<EStructuralFeature, EStructuralFeature>();
	
	
	private Strategy strategy = Strategy.CALLSITES_STRATEGY;
	
	/**
	 * 
	 * @param atlTransformation The transformation under analysis
	 * @param mm The meta-models of the transformation
	 * @param typing The model containing the typing information
	 * @param slicedURI The URI of the meta-model of interest
	 */
	public MetamodelPrunner(BasicEMFModel atlTransformation, BasicEMFModel mm, BasicEMFModel typing, String slicedURI) {
		this.atlTransformation = atlTransformation;
		this.mm = mm;
		this.typing = typing;
		this.slicedURI = slicedURI;
		
		List<EObject> pkgs = mm.allObjectsOf(EPackage.class.getSimpleName());
		for (EObject obj : pkgs) {
			EPackage pkg = (EPackage) obj;
			if ( pkg.getNsURI().equals(slicedURI) ) {
				this.pkg = pkg;
				break;
			}
		}
		if ( pkg == null ) throw new IllegalArgumentException("No package with URI " + slicedURI);
	}

	public EPackage extractSource(String name, String conceptURI, String conceptPrefix) {
		
		// Compute direct used types
		List<EObject> metaclasses = typing.allObjectsOf(Metaclass.class.getSimpleName());
		for (EObject obj : metaclasses) {
			Metaclass m = (Metaclass) obj;
			if ( EcoreUtil.isAncestor(pkg, m.getKlass()) && m.isExplicitOcurrence() ) {
				directUsedTypes.add(m.getKlass());
			}
		}
		
		// Compute indirect used types
		List<EObject> annotations = typing.allObjectsOf(ExpressionAnnotation.class.getSimpleName());
		
		for (EObject eObject : annotations) {
			ExpressionAnnotation ann = (ExpressionAnnotation) eObject;
			if ( ann.getUsedFeature() != null ) {
				EStructuralFeature f = (EStructuralFeature) ann.getUsedFeature();
				if ( f instanceof EReference ) {
					usedReferences.add((EReference) f);
					indirectUsedTypes.add((EClass) f.getEType());
				}
				else if ( f instanceof EAttribute) {  
					usedAttributes.add((EAttribute) f);
				} else {
					// TODO: Unknown features will be replicated if accesed several times!
					unknownFeatures.add((UnknownFeature) f);
				}
				
				if ( ann.getReceptorType() instanceof Metaclass ) {
					Metaclass receptor = (Metaclass) ann.getReceptorType();
					CallSite callSite = new CallSite(receptor.getKlass(), f);
				
					callSites.add(callSite);
				}
			}
		}
		
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


	public HashSet<EStructuralFeature> getUsedFeatures() {
		HashSet<EStructuralFeature> s = new HashSet<EStructuralFeature>();
		s.addAll(usedAttributes);
		s.addAll(usedReferences);
		return s;
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
			copy.setEType( usedFeature.getEType() );
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
			EClass originalTranslated = someInHierarchyTranslated(superType);
			if ( originalTranslated != null ) {
				copied.getESuperTypes().add(traceClass.get(originalTranslated));
			}
		}
	}
	
	
	private EClass someInHierarchyTranslated(EClass superType) {
		if ( traceClass.containsKey(superType) ) return superType;
		for (EClass c : superType.getESuperTypes()) {
			EClass translated = someInHierarchyTranslated(c);
			if ( translated != null ) return translated;
		}
		return null;
	}


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
				
				for(EClass original : extractor.traceClass.keySet() ) {
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
