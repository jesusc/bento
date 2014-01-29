package bento.componetization.ui.viewers;

import java.util.ArrayList;

import metamodel.metrics.Measure.DoubleMeasure;
import metamodel.metrics.Measure.IntegerMeasure;
import metamodel.metrics.Measure.Measure;
import metamodel.metrics.Measure.MeasureSet;
import metamodel.metrics.Measure.PercentageMeasure;
import metamodel.metrics.Measure.RootMeasureSet;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;

import bento.componetization.ui.Activator;

public class MetricsTreeProvider  implements ITreeContentProvider, ITableLabelProvider {

	private RootMeasureSet measureSet;

	@Override
	public void dispose() {
		
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		this.measureSet = (RootMeasureSet) newInput;
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
		if ( parentElement instanceof RootMeasureSet ) {
			RootMeasureSet rms = ((RootMeasureSet) parentElement);
			ArrayList<MeasureSet> list = new ArrayList<MeasureSet>();
			TreeIterator<EObject> it = rms.eAllContents();
			while ( it.hasNext() ) {
				EObject obj = it.next();
				if ( obj instanceof MeasureSet ) list.add((MeasureSet) obj);
			}
			return list.toArray();
		}
		if ( parentElement instanceof MeasureSet ) return ((MeasureSet) parentElement).getMeasures().toArray(); 
		if ( parentElement instanceof Measure) return new Object[0];
		
		return new Object[0];
	}

	@Override
	public Object getParent(Object element) {
		return ((EObject) element).eContainer();
	}

	@Override
	public boolean hasChildren(Object element) {
		return getChildren(element).length > 0;
	}

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		if ( element instanceof MeasureSet && columnIndex == 0 ) {
			MeasureSet ms = (MeasureSet) element;
			if ( ms.eContainer() instanceof RootMeasureSet ) return Activator.getImageDescriptor("/icons/full/obj16/EPackage.gif").createImage();
			else return Activator.getImageDescriptor("/icons/full/obj16/EClass.gif").createImage();
		}

		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if ( element instanceof MeasureSet && columnIndex == 0 ) {
			MeasureSet ms = (MeasureSet) element;
			return ms.getElementName();
		}
		
		if ( element instanceof Measure) {
			Measure m = (Measure) element;
			if ( columnIndex == 0 ) return m.getMetric().getName();
			if ( columnIndex == 1 ) return m.getMetric().getDesc();
			if ( columnIndex == 2 ) {
				if ( element instanceof IntegerMeasure    ) return ((IntegerMeasure) element).getValue() + "";
				if ( element instanceof DoubleMeasure     ) return ((DoubleMeasure) element).getValue() + "";
				if ( element instanceof PercentageMeasure ) return ((PercentageMeasure) element).getValue() + "";				
			}
		}
		return "-";
	}

}
