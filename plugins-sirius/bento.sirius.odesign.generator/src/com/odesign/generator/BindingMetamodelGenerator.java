package com.odesign.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.odesign.generator.tools.BindingTools;
import com.odesign.generator.values.Datatypes;

public class BindingMetamodelGenerator {

	private EClass virtualAttribute;
	private EClass noneElement;
	private EPackage ep;
	private EClass FeatureCLass;
	private EClass root;
	private EClass intermediateElement;
	private EClass metamodelElement;
	private EClass metamodelElementFeature;
	private EClass bindingElement;
	private EClass siriusTag;
	private List<EClass> oriClassifiers = new ArrayList<EClass>();
	private List<EClass> oriClassifiers1 = new ArrayList<EClass>();
	private HashMap<EClass, List<EClass>> newClassifiers = new HashMap<EClass, List<EClass>>();
	private HashMap<EClass, List<EClass>> tagsEReferences = new HashMap<EClass, List<EClass>>();
	private List<EClass> newEClass = new ArrayList<>();
	private File generatedFile;

	public HashMap<EClass, List<EClass>> getNewClassifiers() {
		return newClassifiers;
	}

	public HashMap<EClass, List<EClass>> getTagsEReferences() {
		return tagsEReferences;
	}

	public void setNewClassifiers(HashMap<EClass, List<EClass>> newClassifiers) {
		this.newClassifiers = newClassifiers;
	}

	public EClass getFeatureCLass() {
		return FeatureCLass;
	}

	public void setFeatureCLass(EClass featureCLass) {
		FeatureCLass = featureCLass;
	}

	public EClass getRoot() {
		return root;
	}

	public void setRoot(EClass root) {

		this.root = root;
	}

	public EClass getIntermediateElement() {
		return intermediateElement;
	}

	public void setIntermediateElement(EClass intermediateElement) {
		this.intermediateElement = intermediateElement;
	}

	public EClass getMetamodelElement() {
		return metamodelElement;
	}

	public void setMetamodelElement(EClass metamodelElement) {
		this.metamodelElement = metamodelElement;
	}

	public EClass getMetamodelElementFeature() {
		return metamodelElementFeature;
	}

	public void setMetamodelElementFeature(EClass metamodelElementFeature) {
		this.metamodelElementFeature = metamodelElementFeature;
	}

	public EClass getBindingElement() {
		return bindingElement;
	}

	public void setBindingElement(EClass bindingElement) {
		this.bindingElement = bindingElement;
	}

	public List<EClass> getNewEClass() {
		return newEClass;
	}

	public void setNewEClass(List<EClass> newEClass) {
		this.newEClass = newEClass;
	}

	public List<EClass> getOriClassifiers() {
		return oriClassifiers;
	}

	public void setOriClassifiers(List<EClass> oriClassifiers) {
		for (EClassifier eclassifier : this.ep.getEClassifiers()) {
			this.oriClassifiers.add((EClass) eclassifier);
		}

	}

	public void createFeatureCLasses() {
		if (this.root == null) {
			this.root = (EClass) this.ep.getEClassifiers().get(0);
		}
//		for (EClassifier eclassifier : this.ep.getEClassifiers()) {
//			if ((eclassifier instanceof EClass) && !((EClass) eclassifier).getName().isEmpty()
//					&& !((EClass) eclassifier).isAbstract()
//					&& !((EClass) eclassifier).getName().equals(this.root.getName()))
//				this.oriClassifiers.add((EClass) eclassifier);
//		}

		for (EClass eklass : this.oriClassifiers)

			if (!eklass.isAbstract()) {

				List<EClass> listFeatures = new ArrayList<EClass>();
				listFeatures.clear();
				EList<EAttribute> attributesList = (eklass).getEAllAttributes();

				for (EAttribute eattribute : attributesList) {

					EClass klass = BindingTools.createEClass(eattribute.getName() + (eklass).getName(), false, this.ep,
							eklass);

					this.newEClass.add(klass);

					listFeatures.add(klass);

					BindingTools.createEAttribute("value", eattribute.getEType(), klass);

				}
				newClassifiers.put(eklass, listFeatures);

			}

	}

	public void createEReferencesClasses() {
		if (this.root == null) {
			this.root = (EClass) this.ep.getEClassifiers().get(0);
		}
		for (EClassifier eclassifier : this.ep.getEClassifiers()) {
			if ((eclassifier instanceof EClass) && !((EClass) eclassifier).getName().isEmpty()
					&& !((EClass) eclassifier).isAbstract()
					&& !((EClass) eclassifier).getName().equals(this.root.getName()))
				this.oriClassifiers1.add((EClass) eclassifier);
		}
		
		for (EClassifier eclassifier : this.ep.getEClassifiers()) {
			if ((eclassifier instanceof EClass) && !((EClass) eclassifier).getName().isEmpty()
					&& !((EClass) eclassifier).isAbstract()
					&& !((EClass) eclassifier).getName().equals(this.root.getName()))
				this.oriClassifiers.add((EClass) eclassifier);
		}
		int j = 0;
		for (EClass eklass : this.oriClassifiers1)
			
		if (!eklass.isAbstract()) {
			j = j + 1;
			List<EClass> listEReferences = new ArrayList<EClass>();
			listEReferences.clear();
			EList<EReference> referencesList = (eklass).getEAllReferences();
			int i=0;
			for (EReference ereference : referencesList) {
				i=i+1;

				EClass klass = EcoreFactory.eINSTANCE.createEClass();
				klass.setName(ereference.getName() + (eklass).getName()+j+i);
				ep.getEClassifiers().add(klass);
				klass.setAbstract(false);

				EReference eref = EcoreFactory.eINSTANCE.createEReference();
				eref.setContainment(true);
				eref.setEType(klass);
				eref.setName("eref_" + klass.getName());
				eref.setUpperBound(1);
				eklass.getEReferences().add(eref);

				this.newEClass.add(klass);

				listEReferences.add(klass);

				BindingTools.createEAttribute("name", Datatypes.get_string(), klass);

			}
			tagsEReferences.put(eklass, listEReferences);

		}

	}

	public BindingMetamodelGenerator() {
		super();

	}

	public EPackage getEp() {
		return ep;
	}

	public void setEp(EPackage ep) {
		this.ep = ep;
	}

	// Add the binding elements
	public void addBindingElementEsuperType() {

		int i = 0;
		Iterator<EClassifier> it = this.ep.getEClassifiers().iterator();
		while (it.hasNext()) {

			EClass klass = (EClass) it.next();
			if (klass instanceof EClass) {
				if (!((EClass) klass).getName().isEmpty() && !((EClass) klass).isAbstract()
						&& !((EClass) klass).getName().equals(this.root.getName())) {
					if (!(((EClass) klass).getName().equals("ClassElement"))
							&& !(((EClass) klass).getName().equals("ClassElement"))
							&& !(((EClass) klass).getName().equals("MetamodelElement"))
							&& !(((EClass) klass).getName().equals("BindingElement"))) {
						i = i + 1;
						((EClass) klass).getESuperTypes().add(bindingElement);
						if (i == this.oriClassifiers.size()) {
							break;
						}

					}
				}
			}
		}
	}

	/**
	 * Creating the Binding classes
	 */
	public void createBindingClass() {

		this.noneElement = BindingTools.createEClass("NoneElement", false, this.ep, this.root);
		this.bindingElement = BindingTools.createEClass("BindingElement", true, this.ep, this.root);
		this.intermediateElement = BindingTools.createEClass("IntermediateElement", false, this.ep, this.root);
		this.metamodelElement = BindingTools.createEClass("MetamodelElement", false, this.ep, this.root);
		this.metamodelElementFeature = BindingTools.createEClass("MetamodelElementFeature", false, this.ep, this.root);
		this.FeatureCLass = BindingTools.createEClass("BindingAttribute", true, this.ep, this.root);
		this.virtualAttribute = BindingTools.createEClass("VirtualAttribute", false, this.ep, this.root);
		this.siriusTag = BindingTools.createEClass("SiriusTag", false, this.ep, this.bindingElement);

		for (EClass eclass : this.newEClass) {
			eclass.getESuperTypes().add(this.FeatureCLass);
		}

		BindingTools.createEReference("virtualAttribute", true, this.virtualAttribute, -1, 0, this.metamodelElement);
		BindingTools.createEReference("noneElement", false, this.noneElement, -1, 0, this.bindingElement);
		BindingTools.createEReference("featureClass", false, this.FeatureCLass, -1, 0, this.metamodelElementFeature);
		BindingTools.createEReference("metamodelElementFeature", true, this.metamodelElementFeature, -1, 0,
				this.metamodelElement);
		BindingTools.createEReference("bindingElement", false, this.bindingElement, 1, 1, this.intermediateElement);
		BindingTools.createEReference("metamodelElement", false, this.metamodelElement, -1, 0,
				this.intermediateElement);
		BindingTools.createEReference("to_virtualAttribute", false, this.FeatureCLass, 1, 0, this.virtualAttribute);
		//BindingTools.createEReference("siriusTag", true, this.siriusTag, 1, 0, this.bindingElement);

		BindingTools.createEAttribute("name", Datatypes.get_string(), this.metamodelElement);
		BindingTools.createEAttribute("name", Datatypes.get_string(), this.metamodelElementFeature);
		BindingTools.createEAttribute("name", Datatypes.get_string(), this.virtualAttribute);
		BindingTools.createEAttribute("Expression", Datatypes.get_string(), this.virtualAttribute);
		BindingTools.createEAttribute("tag", Datatypes.get_string(), this.siriusTag);

		EAttribute sourceMetamodelTag = BindingTools.createEAttribute("SourceMM", Datatypes.get_string(), this.root);
		sourceMetamodelTag.setDefaultValueLiteral(ep.getNsURI());

	}

	public void save(File file) {
		System.out.println("Saving the new metamodel ...");
		try {

			ResourceSet rs = new ResourceSetImpl();

			generatedFile = new File(file.getAbsolutePath() + "/" + ep.getName() + ".ecore");
			final Resource resource = rs.createResource(URI.createFileURI(generatedFile.getAbsolutePath()));

			resource.getContents().add(ep);

			resource.setURI(URI.createFileURI(generatedFile.getAbsolutePath()));

			resource.save(new FileOutputStream(new File(generatedFile.getAbsolutePath())), null);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("Saved! " + generatedFile.getAbsolutePath());
	}

	public File getGeneratedFile() {
		return generatedFile;
	}

}
