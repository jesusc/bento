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

	/**
	 * Constructor.
	 * 
	 * @param modelURI2    is the URI of the model.
	 * @param targetFolder is the output folder
	 * @param arguments    are the other arguments
	 * @throws IOException Thrown when the output cannot be saved.
	 * @generated
	 */
	public GenerateAll() {

	}

	/**
	 * Launches the generation.
	 *
	 * @param monitor This will be used to display progress information to the user.
	 * @throws IOException            Thrown when the output cannot be saved.
	 * @throws IllegalAccessException
	 * @throws InstantiationException
	 * @generated
	 */
	public void doGenerate(String modelURI, IProgressMonitor monitor, IContainer targetFolder,
			List<? extends Object> arguments) throws IOException, InstantiationException, IllegalAccessException {
		if (!targetFolder.getLocation().toFile().exists()) {
			targetFolder.getLocation().toFile().mkdirs();
		}

		monitor.subTask("Loading odesign...");
		System.out.println("\"generated-metamodel-and-odesign\"");

		
		Generate generate=new Generate();
		generate.GenerateOdesignMM(modelURI, targetFolder.getLocation().toFile());
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

