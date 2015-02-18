package bento.adapter.atl.visitors;

import java.util.LinkedList;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;

import anatlyzer.atl.model.ATLModel;
import anatlyzer.atlext.OCL.OclModel;
import anatlyzer.atlext.OCL.OclModelElement;
import anatlyzer.atlext.processing.AbstractVisitor;
import bento.adapter.atl.BindingModel;
import bento.adapter.atl.IComponentInfoForBinding;

public class BaseAdapterVisitor extends AbstractVisitor {

	protected ATLModel atlModel;
	protected BindingModel bindingModel;
	protected IComponentInfoForBinding info;

	public BaseAdapterVisitor(ATLModel atlModel, BindingModel bindingModel, IComponentInfoForBinding info) {
		this.atlModel = atlModel;
		this.bindingModel = bindingModel;
		this.info = info;
	}

	private static int uniqueId = 0;
	public String genUniqueId() {
		uniqueId++;
		return "aVar" + uniqueId;
	}

	private LinkedList<RewriteCommand0> pending = new LinkedList<RewriteCommand0>();
	protected void delay(RewriteCommand0 rw) {
		pending.add(rw);
	}

	protected void applyPending() {
		pending.forEach(c -> c.perform());
	}
	
	protected void replaceContaining(EObject original, EObject replacement) {
		EcoreUtil.replace(original, replacement);
	}
	
	protected void replace(EObject original, EObject replacement) {
		EcoreUtil.replace(original, replacement);		
	}

	public void deattach(EObject eobj) {
		EcoreUtil.remove(eobj);
	}
	
	protected boolean belongsToCurrentMetamodel(OclModelElement me) {
		return me.getModel() != null && me.getModel().getName().equals(info.getConceptMetamodelName());
	}
	
	@SuppressWarnings("unchecked")
	protected <T extends EObject> T addToResource(EObject obj) {
		atlModel.getResource().getContents().add(obj);
		return (T) obj;
	}

	public static class MyCopier extends EcoreUtil.Copier {
		private EObject root;

		public MyCopier(EObject object) {
			super();
			this.root = object;
		}

		protected void copyReference(EReference eReference, EObject eObject,
				EObject copyEObject) {
			super.copyReference(eReference, eObject, copyEObject);

			if (eObject.eIsSet(eReference)) {
				if (eReference.isMany()) {
				} else {
					Object referencedEObject = eObject.eGet(eReference,
							resolveProxies);
					if (referencedEObject == null) {
					} else {
						Object copyReferencedEObject = get(referencedEObject);
						if (copyReferencedEObject == null) {
							if (useOriginalReferences
									&& eReference.getEOpposite() == null) {
							}
							// added to make a cross-reference to objects
							// outside the copy
							else {
								boolean isContained = EcoreUtil.isAncestor(
										root, (EObject) referencedEObject);
								if (useOriginalReferences && !isContained) {
									copyEObject.eSet(eReference,
											referencedEObject);
								}
							}
						} else {
						}
					}
				}
			}
		}
	}

}
