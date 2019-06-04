package com.odesign.generator;

import java.io.File;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class ModelGenerator {

	private Resource resource;
	private EPackage originalMetamodel;
	private EPackage targetMetamodel;
	private Resource resource2;
	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public EPackage getOriginalMetamodel() {
		return originalMetamodel;
	}

	public void setOriginalMetamodel(EPackage originalMetamodel) {
		this.originalMetamodel = originalMetamodel;
	}

	public EPackage getTargetMetamodel() {
		return targetMetamodel;
	}

	public void setTargetMetamodel(EPackage targetMetamodel) {
		this.targetMetamodel = targetMetamodel;
	}

	public ModelGenerator(String modelURI, File file, EPackage ep) {
		ResourceSet rs = new ResourceSetImpl();
		this.resource = rs.getResource(URI.createFileURI(modelURI), true);
	//	System.out.println(file.getAbsolutePath() + "/new-model-" + ep.getName() + ".xmi");
		ResourceSet rs2 = new ResourceSetImpl();
		
		try {
		this.resource2 = rs2
				.createResource(URI.createFileURI(file.getAbsolutePath() + "/new-model-" + ep.getName() + ".xmi"));}
		catch(Exception e){e.printStackTrace();}

		TreeIterator<EObject> content = resource.getAllContents();
		EFactory efactory = ep.getEFactoryInstance();
		while (content.hasNext()) {
			// Reading my model
			EObject obj = content.next();
			String originalEClassName = obj.eClass().getName();
			for (EObject eclass : ep.eContents()) {
				if (eclass instanceof EClass && ((EClass) eclass).getName().equals(originalEClassName)) {
					EObject obj1 = efactory.create((EClass) eclass);
//					this.resource2.;
				}

			}

		}

	}

}
