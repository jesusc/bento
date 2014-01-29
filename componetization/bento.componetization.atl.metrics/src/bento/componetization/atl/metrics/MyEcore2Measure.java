package bento.componetization.atl.metrics;

import java.io.IOException;
import java.util.Map;

import javax.management.RuntimeErrorException;

import metamodel.metrics.Measure.MeasureSet;
import metamodel.metrics.Measure.RootMeasureSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import bento.componetization.atl.metrics.files.Ecore2measure;

public class MyEcore2Measure extends Ecore2measure {

	public MyEcore2Measure() throws IOException {
		super();
	}

	public void loadFromResource(Resource r) {
		try {
			ModelFactory factory = new EMFModelFactory();
			EMFInjector injector = new EMFInjector();
			IReferenceModel measureMetamodel = factory.newReferenceModel();
			injector.inject(measureMetamodel, getMetamodelUri("Measure"));
			IReferenceModel ecoreMetamodel = factory.getMetametamodel();
			this.inModel = factory.newModel(ecoreMetamodel);
			injector.inject(inModel, r);
			this.outModel = factory.newModel(measureMetamodel);
		} catch (ATLCoreException e) {
			throw new RuntimeException(e);
		}
	}

	public RootMeasureSet getOutputModel() {
		// To have a common root object...
		RootMeasureSet rms = (RootMeasureSet) ((EMFModel) this.outModel).getResource().getContents().get(0);
		MeasureSet ms = (MeasureSet) ((EMFModel) this.outModel).getResource().getContents().get(1);
		rms.getMeasureSets().add(ms);
		
		return  rms;
	}
	
	public Object wrappedEcore2measure(NullProgressMonitor monitor) {
		try {
			return doEcore2measure(monitor);
		} catch ( Exception e ) {
			throw new RuntimeException(e);
		}		
	}

}
