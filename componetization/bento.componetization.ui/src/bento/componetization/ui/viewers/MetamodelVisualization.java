package bento.componetization.ui.viewers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

import bento.componetization.ui.Activator;

public class MetamodelVisualization implements ITreeContentProvider, ILabelProvider  {

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Image getImage(Object element) {
		if ( element instanceof EPackage ) 	return Activator.getImageDescriptor("/icons/full/obj16/EPackage.gif").createImage();
		if ( element instanceof EClass )	return Activator.getImageDescriptor("/icons/full/obj16/EClass.gif").createImage();
		if ( element instanceof EReference)	return Activator.getImageDescriptor("/icons/full/obj16/EReference.gif").createImage();
		if ( element instanceof EAttribute)	return Activator.getImageDescriptor("/icons/full/obj16/EAttribute.gif").createImage();

		return null;
	}

	@Override
	public String getText(Object element) {
		if ( element instanceof EPackage ) 	return ((EPackage) element).getName();
		if ( element instanceof EClass )	return getClassText((EClass) element);
		if ( element instanceof EReference)	return ((EReference) element).getName() + " : " + getFeatureTypeText((EStructuralFeature) element);
		if ( element instanceof EAttribute)	return ((EAttribute) element).getName() + " : " + getFeatureTypeText((EStructuralFeature) element);
		
		return element.toString();
	}


	private String getFeatureTypeText(EStructuralFeature element) {
		if ( element.getEType() == null ) return "<no-type-defined>";
		return element.getEType().getName();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if ( parentElement instanceof Resource) return ((Resource) parentElement).getContents().toArray();

		EObject obj = (EObject) parentElement;
		return filterContents(obj.eContents()).toArray();
	}

	private List<EObject> filterContents(EList<EObject> eContents) {
		ArrayList<EObject> result = new ArrayList<EObject>();
		for (EObject eObject : eContents) {
			if ( eObject instanceof EGenericType ) { } // skip
			else {
				result.add(eObject);
			}
		}
		return result;
	}

	@Override
	public Object getParent(Object element) {
		if ( element instanceof Resource) return null;
		
		EObject obj = (EObject) element;
		return obj.eContainer();
	}

	@Override
	public boolean hasChildren(Object element) {
		if ( element instanceof Resource) return ((Resource) element).getContents().size() > 0;

		EObject obj = (EObject) element;
		return obj.eContents().size() > 0;
	}

	///
	/// Utility methods
	///
	
	private String getClassText(EClass element) {
		String r = element.getName();
		if ( element.getESuperTypes().size() > 0 ) {
			r += " -> ";
		}
		for(int i = 0; i < element.getESuperTypes().size(); i++) {
			EClass c = element.getESuperTypes().get(i);
			r += c.getName();
			if ( i + 1 != element.getESuperTypes().size() ) 
				r += ", ";
		}
		
		return r;
	}
}