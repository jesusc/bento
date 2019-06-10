package com.odesign.generator.ui.common;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import com.odesign.generator.ModelGenerator;

public class GenerateAllModel {

	private String modelURI;
	private IContainer targetFolder;


	public GenerateAllModel(String modelURI, IContainer targetFolder) {
		this.modelURI = modelURI;
		this.targetFolder = targetFolder;

	}

	

	public void doGenerateModel(IProgressMonitor monitor, EPackage ep,EPackage ep1)
			throws IOException, InstantiationException, IllegalAccessException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}

		monitor.subTask("Loading Model...");
		System.out.println("\"generated-model\"");
		System.out.println(this.targetFolder.getLocation().toFile());
		new ModelGenerator(this.modelURI, targetFolder.getLocation().toFile(),ep,ep1);
		monitor.worked(1);

	}
}