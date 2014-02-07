package bento.componetization.ui.viewers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

import bento.componetization.ui.Activator;

public class MetamodelVisualization implements ITreeContentProvider, ILabelProvider  {

	private Resource resource;
	private List<EClass> allClasses;

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.resource = (Resource) newInput;
		this.allClasses  = new ArrayList<EClass>();
		TreeIterator<EObject> it = resource.getAllContents();
		while ( it.hasNext() ) {
			Object o = it.next();
			if ( o instanceof EClass ) 
				allClasses.add((EClass) o);
		}
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
		if ( element instanceof EClass )	{
			if ( ((EClass) element).isAbstract() )
				return Activator.getImageDescriptor("/icons/full/obj16/EClass_abstract.gif").createImage();
			return Activator.getImageDescriptor("/icons/full/obj16/EClass.gif").createImage();
		}
		if ( element instanceof EReference)	return Activator.getImageDescriptor("/icons/full/obj16/EReference.gif").createImage();
		if ( element instanceof EAttribute)	return Activator.getImageDescriptor("/icons/full/obj16/EAttribute.gif").createImage();
		if ( element instanceof EDataType)	return Activator.getImageDescriptor("/icons/full/obj16/EDataType.gif").createImage();

		if ( element instanceof AllSubtypesNode )	return Activator.getImageDescriptor("/icons/full/custom/subtypes.gif").createImage();

		return null;
	}

	@Override
	public String getText(Object element) {
		if ( element instanceof EPackage ) 	return ((EPackage) element).getName();
		if ( element instanceof EClass )	return getClassText((EClass) element);
		if ( element instanceof EReference)	return ((EReference) element).getName() + " : " + getFeatureTypeText((EStructuralFeature) element);
		if ( element instanceof EAttribute)	return ((EAttribute) element).getName() + " : " + getFeatureTypeText((EStructuralFeature) element);

		if ( element instanceof AllSubtypesNode) return "Subclasses : " + ((AllSubtypesNode) element).getSize();
		if ( element instanceof EDataType ) return ((EDataType) element).getName();
		return element.toString();
	}


	private String getFeatureTypeText(EStructuralFeature element) {
		if ( element.getEType() == null ) return "<no-type-defined>";
		return element.getEType().getName();
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if ( parentElement instanceof Resource) return ((Resource) parentElement).getContents().toArray();
		if ( parentElement instanceof AllSubtypesNode ) return ((AllSubtypesNode) parentElement).getSubclasses().toArray();
		
		EObject obj = (EObject) parentElement;
		return appendExtraNodes(obj, filterContents(obj.eContents())).toArray();
	}

	private List<Object> appendExtraNodes(EObject obj, List<Object> contents) {
		if ( obj instanceof EClass ) {
			contents.add(new AllSubtypesNode((EClass) obj));
		}
		return contents;
	}

	private List<Object> filterContents(EList<EObject> eContents) {
		ArrayList<Object> result = new ArrayList<Object>();
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
		if ( element instanceof AllSubtypesNode ) return ((AllSubtypesNode) element).getSize() > 0;
		
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
	
	public class AllSubtypesNode {
		private EClass eClass;
		private List<EClass> subclasses;
		
		public AllSubtypesNode(EClass c) {
			this.eClass = c;
		}

		public List<EClass> getSubclasses() {
			if ( subclasses != null ) return subclasses;
			
			subclasses = new ArrayList<EClass>();
			for (EClass c : allClasses) {
				if ( c.getESuperTypes().contains(eClass) ) {
					subclasses.add(c);
				}
			}
			
			return subclasses;
		} 
		
		
		public int getSize() {
			return getSubclasses().size();
		}
	}
	
}