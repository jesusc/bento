package com.odesign.generator;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.odesign.generator.tools.Tools;

/**
 * 
 * @author Souhaila
 *
 */

public class Generate {

	private EPackage epack;
	private EPackage originalEPack;
	private File odesignGeneratedFile;
	private File metamodelGeneratedFile;

	public void GenerateOdesignMM(String modelURI, File odesignOutputFolder, File metamodelOutputFolder) throws IOException {

		OdesignGenerator odesigngenerator = new OdesignGenerator(modelURI, odesignOutputFolder);
		EPackage ep = odesigngenerator.getEpackage();

		ResourceSet rs = new ResourceSetImpl();
		this.originalEPack = ep;
		EPackage copy = EcoreUtil.copy(ep);

		final Resource resource = rs
				.createResource(URI.createFileURI(odesignOutputFolder.getAbsolutePath() + "/new-" + ep.getName() + ".ecore"));

		resource.getContents().add(copy);

		Resource resource1 = resource;

		this.epack = (EPackage) resource1.getContents().get(0);

		List<EClass> containerslist = Tools.fillContainersList(this.epack);

		EClass root = Tools.findRoot(containerslist);

		BindingMetamodelGenerator metamodelGenerator = new BindingMetamodelGenerator();

		metamodelGenerator.setRoot(root);

		metamodelGenerator.setEp(this.epack);

		this.epack.setName(ep.getName() + "_bdsl");
		this.epack.setNsPrefix(ep.getNsPrefix() + "_bdsl");
		this.epack.setNsURI(ep.getNsURI() + "_bdsl");

		metamodelGenerator.createFeatureCLasses();
		metamodelGenerator.createBindingClass();
		metamodelGenerator.addBindingElementEsuperType();
		metamodelGenerator.save(metamodelOutputFolder);
		odesigngenerator.GenerateNodesVersion(metamodelGenerator.getNewClassifiers(), odesignOutputFolder, this.epack,
				metamodelGenerator.getMetamodelElement(), metamodelGenerator.getIntermediateElement());

		this.odesignGeneratedFile = odesigngenerator.getGeneratedFile();
		this.metamodelGeneratedFile = metamodelGenerator.getGeneratedFile();
	}

	public EPackage getEpack() {
		return this.epack;
	}

	public EPackage getOriginaleEPakage() {

		return this.originalEPack;
	}

	public File getOdesignGeneratedFile() {
		return odesignGeneratedFile;
	}

	public File getMetamodelGeneratedFile() {
		return metamodelGeneratedFile;
	}

}
