package com.odesign.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.sirius.diagram.description.ContainerMapping;
import org.eclipse.sirius.diagram.description.DescriptionFactory;
import org.eclipse.sirius.diagram.description.DiagramDescription;
import org.eclipse.sirius.viewpoint.description.Viewpoint;

import com.odesign.generator.tools.Tools;

/**
 * 
 * @author Souhaila
 *
 */

public class Generate {
	
	private File generatedMetamodel;
	private File generatedOdesign;
	
	
	/**
	 * @param modelURI
	 * @param file
	 * @param arguments
	 * @throws IOException
	 */
	public Generate(String modelURI, File file, List<? extends Object> arguments) throws IOException {
		OdesignGenerator odesigngenerator = new OdesignGenerator(modelURI, file);
		EPackage ep=odesigngenerator.getEpackage();
	
		ResourceSet rs = new ResourceSetImpl();
		final Copier copier = new Copier();
	//	final List<EObject> eObjects = new ArrayList<EObject>(copier.copy(ep));
		EPackage copy = EcoreUtil.copy(ep);
		
		//copier.copyReferences();
		final Resource resource = rs.createResource(URI.createFileURI(file.getAbsolutePath() + "/new-" + ep.getName() + ".ecore"));
	
		resource.getContents().add(copy);

		//resource.save(new FileOutputStream(
		//		new File(file.getAbsolutePath() + "/new-" + ep.getName() + ".ecore")), null);
		
		ResourceSet rs1 = new ResourceSetImpl();
		//Resource resource1 = rs1.getResource(URI.createFileURI(file.getAbsolutePath() + "/new-" + ep.getName() + ".ecore"),true);
		Resource resource1 = resource;
		
		EPackage epack = (EPackage) resource1.getContents().get(0); 
		
//		EPackage epack=EcoreFactory.eINSTANCE.createEPackage();
//		for (EObject obj:resource1.getContents())
//		{	epack.getEClassifiers().add((EClassifier) obj);}
//		ep.eResource().save(new FileOutputStream(
//				new File(file.getAbsolutePath() + "/Resource-" + ep.getName() + ".ecore")), null);
		List<EClass> containerslist = Tools.fillContainersList(epack);		
		
//		ResourceSet rs = new ResourceSetImpl();
//		Resource resource = rs.getResource(URI.createFileURI(file.getAbsolutePath() + "/Resource-" + ep.getName() + ".ecore"), true);

//	
		EClass root=Tools.findRoot(containerslist);
		BindingMetamodelGenerator metamodelGenerator=new BindingMetamodelGenerator();
		
		
		metamodelGenerator.setRoot(root);
		
		metamodelGenerator.setEp(epack);

		epack.setName(ep.getName() + "_new");
		epack.setNsPrefix(ep.getNsPrefix() + "_new");
		epack.setNsURI(ep.getNsURI() + "_new");
		
		metamodelGenerator.createFeatureCLasses();
		metamodelGenerator.createBindingClass();
		metamodelGenerator.addBindingElementEsuperType();
		metamodelGenerator.save(file);
		
		this.generatedMetamodel = metamodelGenerator.getGeneratedFile();		
		
		//this.generatedSiriusFile = file.getAbsolutePath();
		
		odesigngenerator.GenerateNodesVersion(metamodelGenerator.getNewClassifiers(),
				file,epack, metamodelGenerator.getMetamodelElement(), metamodelGenerator.getIntermediateElement());

		this.generatedOdesign = odesigngenerator.getGeneratedFile();
		
		
	//	odesigngenerator.GenerateContainersVersion(ep,file, metamodelGenerator.getNewClassifiers(),
	//			metamodelGenerator.getMetamodelElement() , metamodelGenerator.getIntermediateElement());
	
	}
	
	public File getGeneratedMetamodel() {
		return generatedMetamodel;
	}
	
	public File getGeneratedOdesign() {
		return generatedOdesign;
	}
	
}
