package bento.componetization.ui.viewers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

import anatlyzer.footprint.CallSite;
import bento.componetization.atl.IStaticAnalysisInfo;
import bento.componetization.ui.Activator;

public class MetamodelUsageProvider  implements ITreeContentProvider, ITableLabelProvider {

	private IStaticAnalysisInfo info;

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.info = (IStaticAnalysisInfo) newInput;
	}

	@Override
	public void addListener(ILabelProviderListener listener) {
	}

	@Override
	public boolean isLabelProperty(Object element, String property) {
		return false;
	}

	@Override
	public void removeListener(ILabelProviderListener listener) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if ( parentElement instanceof IStaticAnalysisInfo ) {
			IStaticAnalysisInfo info = (IStaticAnalysisInfo) parentElement;
			return new Object[] { new ExplicitSet(), new CallSitesSet() };
		} else if ( parentElement instanceof ExplicitSet ) {
			ExplicitSet s = (ExplicitSet) parentElement;
			return s.createExplicitSet().toArray();			
		} else if ( parentElement instanceof CallSitesSet ) {
			CallSitesSet s = (CallSitesSet) parentElement;
			return s.createCallSitesSet().toArray();
		}
		
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		if ( element instanceof ExplicitClass ) return info;
		if ( element instanceof CallSitesSet  ) return info;
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if ( element instanceof ExplicitClass && columnIndex == 0 ) {
			return Activator.getImageDescriptor("/icons/full/obj16/EClass.gif").createImage();
		}
		if ( element instanceof CallSite && columnIndex == 0 ) {
			return Activator.getImageDescriptor("/icons/full/custom/callsite.gif").createImage();
		}
	
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if ( element instanceof ExplicitSet && columnIndex == 0 ) {
			return "Explicit uses";
		} else if ( element instanceof CallSitesSet && columnIndex == 0 ) {
			return "Call sites";
		}
		
		if ( element instanceof ExplicitClass) {
			ExplicitClass c = (ExplicitClass) element;
			if ( columnIndex == 0 ) return c.eClass.getName();
		} else if ( element instanceof CallSite ) {
			CallSite site = (CallSite) element;
			if ( columnIndex == 0 ) return site.getReceptor().getName() + "." + site.getFeature().getName();
			if ( columnIndex == 1 && site.getFeature().getEContainingClass() != null ) 
				return site.getFeature().getEContainingClass().getName() + "." + site.getFeature().getName();
		}

		return "-";
	}

	private class ExplicitSet {
		public Set<ExplicitClass> createExplicitSet() {
			Set<EClass> explicitlyUsedTypes = info.getExplicitlyUsedTypes();
			HashSet<ExplicitClass> result = new HashSet<ExplicitClass>();
			for (EClass eClass : explicitlyUsedTypes) {
				result.add(new ExplicitClass(eClass));
			}
			return result;
		}		
	}
	

	private class CallSitesSet {
		public Set<CallSite> createCallSitesSet() {
			TreeSet<CallSite> s = new TreeSet<CallSite>(new Comparator<CallSite>() {
				@Override
				public int compare(CallSite s0, CallSite s1) {
					return s0.getReceptor().getName().compareTo(s1.getReceptor().getName());
				}
			});
			s.addAll(info.getCallSites());
			return s;
		}		
	}
	
	private class ExplicitClass {
		private EClass eClass;

		public ExplicitClass(EClass c) {
			this.eClass = c;
		}

	}

}
