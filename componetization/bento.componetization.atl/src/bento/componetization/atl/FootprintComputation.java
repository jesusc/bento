package bento.componetization.atl;

import genericity.typing.atl_types.Metaclass;
import genericity.typing.atl_types.UnknownFeature;
import genericity.typing.atl_types.annotations.ExpressionAnnotation;

import java.util.HashSet;
import java.util.List;

import org.eclectic.modeling.emf.BasicEMFModel;
import org.eclectic.modeling.emf.IModel;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class FootprintComputation {
	protected String slicedURI;
	protected BasicEMFModel typing;
	protected IModel mm;
	protected BasicEMFModel atlTransformation;
	protected EPackage pkg;

	protected HashSet<EClass> directUsedTypes   = new HashSet<EClass>();
	protected HashSet<EClass> indirectUsedTypes = new HashSet<EClass>();
	protected HashSet<EReference> usedReferences = new HashSet<EReference>();
	protected HashSet<EAttribute> usedAttributes = new HashSet<EAttribute>();
	protected HashSet<UnknownFeature> unknownFeatures = new HashSet<UnknownFeature>();
	
	protected HashSet<CallSite> callSites = new HashSet<CallSite>();

	public FootprintComputation(BasicEMFModel atlTransformation, IModel mm, BasicEMFModel typing, String slicedURI) {
		this.atlTransformation = atlTransformation;
		this.mm = mm;
		this.typing = typing;
		this.slicedURI = slicedURI;
		
		
		List<EObject> pkgs = mm.allObjectsOf(EPackage.class.getSimpleName());
		for (EObject obj : pkgs) {
			EPackage pkg = (EPackage) obj;
			if ( pkg.getNsURI() != null && pkg.getNsURI().equals(slicedURI) ) {
				this.pkg = pkg;
				break;
			}
		}
		if ( pkg == null ) throw new IllegalArgumentException("No package with URI " + slicedURI);		
	}
	
	protected void computeFootprint() {
		// Compute direct used types
		List<EObject> metaclasses = typing.allObjectsOf(Metaclass.class.getSimpleName());
		for (EObject obj : metaclasses) {
			Metaclass m = (Metaclass) obj;
			if ( EcoreUtil.isAncestor(pkg, m.getKlass()) && m.isExplicitOcurrence() ) {
				directUsedTypes.add(m.getKlass());
			} else {
				// System.out.println("Not ancestor");
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
	}
	


	public HashSet<EStructuralFeature> getUsedFeatures() {
		HashSet<EStructuralFeature> s = new HashSet<EStructuralFeature>();
		s.addAll(usedAttributes);
		s.addAll(usedReferences);
		return s;
	}	
}
