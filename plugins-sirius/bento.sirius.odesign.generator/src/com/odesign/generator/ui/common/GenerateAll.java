/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package com.odesign.generator.ui.common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

import com.odesign.generator.Generate;





public class GenerateAll {

	private EPackage epacakge;
	private EPackage originalEPackage;


	public GenerateAll() {

	}

	
	public void doGenerate(String modelURI, IProgressMonitor monitor, IContainer targetFolder,
			List<? extends Object> arguments) throws IOException, InstantiationException, IllegalAccessException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}

		monitor.subTask("Loading odesign...");
		System.out.println("\"generated-metamodel-and-odesign\"");

		
		Generate generate=new Generate();
		File outputFolder = targetFolder.getLocation().toFile();
		generate.GenerateOdesignMM(modelURI, outputFolder, outputFolder);
		monitor.worked(1);

		this.epacakge = generate.getEpack();
		this.originalEPackage = generate.getOriginaleEPakage();

	}

	public EPackage getEPacakeg() {
		return this.epacakge;
	}
	
	public EPackage getOriginalEPackage() {
		return this.originalEPackage;
	}
	

}

