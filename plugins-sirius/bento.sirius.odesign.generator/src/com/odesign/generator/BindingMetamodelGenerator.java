package com.odesign.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.print.attribute.standard.Copies;

import org.eclipse.emf.common.util.EList;
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
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class BindingMetamodelGenerator {

	private EPackage ep;
	private EClass FeatureCLass;
	private EClass root;
	private EClass intermediateElement;
	private EClass metamodelElement;
	private EClass metamodelElementFeature;
	private EClass bindingElement;
	private List<EClass> oriClassifiers = new ArrayList<EClass>();
	private HashMap<EClass, List<EClass>> newClassifiers = new HashMap<EClass, List<EClass>>();
	private List<EClass> newEClass = new ArrayList<>();
	private File generatedFile;
//	private EPackage newepack=EcoreFactory.eINSTANCE.createEPackage();

	public HashMap<EClass, List<EClass>> getNewClassifiers() {
		return newClassifiers;
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
//		Copier copier= new Copier();
//		this.root = EcoreFactory.eINSTANCE.createEClass();
//		this.root=(EClass) copier.copy(root);
//		copier.copyReferences();
//		this.newepack.getEClassifiers().add(this.root);

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

//	public EPackage getNewepack() {
//		return newepack;
//	}
//
//	public void setNewepack(EPackage newepack) {
//		this.newepack = newepack;
//	}

	public List<EClass> getOriClassifiers() {
		return oriClassifiers;
	}

	public void setOriClassifiers(List<EClass> oriClassifiers) {
		for (EClassifier eclassifier : this.ep.getEClassifiers()) {
			this.oriClassifiers.add((EClass) eclassifier);
		}

	}

	public void createFeatureCLasses() {
		for (EClassifier eclassifier : this.ep.getEClassifiers()) {
			if ((eclassifier instanceof EClass) && !((EClass) eclassifier).getName().isEmpty()
					&& !((EClass) eclassifier).isAbstract()
					&& !((EClass) eclassifier).getName().equals(this.root.getName()))
				this.oriClassifiers.add((EClass) eclassifier);
		}

		for (EClass eklass : this.oriClassifiers)

			if (!eklass.isAbstract()) {

				List<EClass> listFeatures = new ArrayList<EClass>();
				listFeatures.clear();
				EList<EAttribute> attributesList = (eklass).getEAllAttributes();
				int i = 0;
				for (EAttribute eattribute : attributesList) {

					EClass klass = EcoreFactory.eINSTANCE.createEClass();

					klass.setName(eattribute.getName() + (eklass).getName());// WordUtils.capitalize(eattribute.getName())
					this.ep.getEClassifiers().add(klass);
					this.newEClass.add(klass);
					// oriClassifiers.add((EClass) klass);
					listFeatures.add(klass);

//				newClassifiers.put((EClass)obj,klass);
					EReference containement = EcoreFactory.eINSTANCE.createEReference();
					containement.setName("contains" + klass.getName());

					containement.setContainment(true);
					containement.setEType(klass);
					eklass.getEReferences().add(containement);

					EAttribute attri = EcoreFactory.eINSTANCE.createEAttribute();
					attri.setName("value");
					// attri=eattribute;
//					attri.setDefaultValue(eattribute.getDefaultValue());

					attri.setEType(eattribute.getEType());
					attri.setDefaultValue(eattribute.getDefaultValue());
					klass.getEAttributes().add(attri);

				}
				newClassifiers.put(eklass, listFeatures);

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

	public void createBindingClass() {

		// Biding Element Class
		this.bindingElement = EcoreFactory.eINSTANCE.createEClass();
		this.bindingElement.setName("BindingElement");
		((EClass) this.bindingElement).setAbstract(true);
		this.ep.getEClassifiers().add(bindingElement);

		// MetamodelElement Class
		this.metamodelElement = EcoreFactory.eINSTANCE.createEClass();
		this.metamodelElement.setName("MetamodelElement");
		this.ep.getEClassifiers().add(this.metamodelElement);

		// IntermediateElement Class
		this.intermediateElement = EcoreFactory.eINSTANCE.createEClass();
		this.intermediateElement.setName("IntemediateElement");
		this.ep.getEClassifiers().add(this.intermediateElement);
		// ((EClass) this.intermediateElement).setAbstract(true);

		// MetamodelElementFeature Class
		this.metamodelElementFeature = EcoreFactory.eINSTANCE.createEClass();
		this.metamodelElementFeature.setName("MetamodelElementFeature");
		// ((EClass) this.metamodelElementFeature).setAbstract(true);
		this.ep.getEClassifiers().add(this.metamodelElementFeature);

		EAttribute nameMetamodelElementFeature = EcoreFactory.eINSTANCE.createEAttribute();
		nameMetamodelElementFeature.setName("name");
		nameMetamodelElementFeature.setEType(EcorePackage.eINSTANCE.getEString());
		metamodelElementFeature.getEAttributes().add(nameMetamodelElementFeature);

		this.FeatureCLass = EcoreFactory.eINSTANCE.createEClass();
		this.FeatureCLass.setName("FeatureClass");
		this.FeatureCLass.setAbstract(true);

		this.ep.getEClassifiers().add(this.FeatureCLass);

		for (EClass eclass : this.newEClass) {
			eclass.getESuperTypes().add(this.FeatureCLass);
		}

		EReference feature = EcoreFactory.eINSTANCE.createEReference();
		feature.setName("featureClass");
		feature.setEType(this.FeatureCLass);
		feature.setUpperBound(-1);
		feature.setLowerBound(0);

		EReference metamodelElementFeatureRef = EcoreFactory.eINSTANCE.createEReference();
		metamodelElementFeatureRef.setName("metamodelElementFeature");
		metamodelElementFeatureRef.setEType(this.metamodelElementFeature);
		metamodelElementFeatureRef.setLowerBound(0);
		metamodelElementFeatureRef.setUpperBound(-1);
		metamodelElementFeatureRef.setContainment(true);

//		EReference intemediateAttribute = EcoreFactory.eINSTANCE.createEReference();
//		intemediateAttribute.setName("intermediateElement");
//		intemediateAttribute.setEType(this.intermediateElement);
//		intemediateAttribute.setLowerBound(0);
//		intemediateAttribute.setUpperBound(-1);

		EReference bindingAttribute = EcoreFactory.eINSTANCE.createEReference();
		bindingAttribute.setName("bindingElement");
		bindingAttribute.setEType(this.bindingElement);
		bindingAttribute.setLowerBound(1);
		bindingAttribute.setUpperBound(1);

		EReference metamodelAttribute = EcoreFactory.eINSTANCE.createEReference();
		metamodelAttribute.setName("metamodElelement");
		metamodelAttribute.setEType(this.metamodelElement);
		metamodelAttribute.setLowerBound(1);
		metamodelAttribute.setUpperBound(1);

		EReference intemediateAttribute2 = EcoreFactory.eINSTANCE.createEReference();
		intemediateAttribute2.setName("intermediateElement");
		intemediateAttribute2.setEType(this.intermediateElement);
		intemediateAttribute2.setLowerBound(0);
		intemediateAttribute2.setUpperBound(-1);

//		this.bindingElement.getEReferences().add(intemediateAttribute);
		this.intermediateElement.getEReferences().add(bindingAttribute);
		this.intermediateElement.getEReferences().add(metamodelAttribute);
//		this.metamodelElement.getEReferences().add(intemediateAttribute2);

		EAttribute nameElement = EcoreFactory.eINSTANCE.createEAttribute();
		nameElement.setName("name");
		nameElement.setEType(EcorePackage.eINSTANCE.getEString());
		metamodelElement.getEAttributes().add(nameElement);

		EReference cont1 = EcoreFactory.eINSTANCE.createEReference();
		cont1.setContainment(true);
		cont1.setName("containsMetamodelElement");
		cont1.setEType(this.metamodelElement);
		cont1.setUpperBound(-1);

		EReference cont2 = EcoreFactory.eINSTANCE.createEReference();
		cont2.setContainment(true);
		cont2.setEType(this.intermediateElement);
		cont2.setName("containsIntermediateElement");
		cont2.setUpperBound(-1);

		EReference cont3 = EcoreFactory.eINSTANCE.createEReference();
		cont3.setContainment(true);
		cont3.setEType(this.FeatureCLass);
		cont3.setName("containsFeatureClass");
		cont3.setUpperBound(-1);

		EReference cont4 = EcoreFactory.eINSTANCE.createEReference();
		cont4.setContainment(true);
		cont4.setEType(this.FeatureCLass);
		cont4.setName("containsMetamodelElementFeature");
		cont4.setUpperBound(-1);
		this.metamodelElement.getEReferences().add(metamodelElementFeatureRef);
		this.metamodelElementFeature.getEReferences().add(feature);
		this.root.getEReferences().add(cont1);
		this.root.getEReferences().add(cont2);
		this.root.getEReferences().add(cont3);
		this.root.getEReferences().add(cont4);
		System.out.println("BINDING CLASS CREATED");
	}

	public void save(File file) {
		System.out.println("Savingthe new metamodel ...");
		try {
//			
//			newepack.setName(ep.getName() + "_new");
//			newepack.setNsPrefix(ep.getNsPrefix() + "_new");
//			newepack.setNsURI(ep.getNsURI() + "_new");
//			ResourceSet rs = new ResourceSetImpl();
//			Resource resource = rs.createResource(URI.createFileURI(file.getAbsolutePath() + "/GENERATED-" + this.newepack.getName() + ".ecore"));
//			resource.getContents().add(this.newepack);

			// EPackage.Registry.INSTANCE.put(ep.getNsURI()+"_gen", ep);

			ResourceSet rs = new ResourceSetImpl();
//			final Copier copier = new Copier();
//			final List<EObject> eObjects = new ArrayList<EObject>(copier.copyAll(ep.eContents()));
//			copier.copyReferences();
			
			generatedFile = new File(file.getAbsolutePath() + "/" + ep.getName() + ".ecore");
			final Resource resource = rs
					.createResource(URI.createFileURI(generatedFile.getAbsolutePath()));

			resource.getContents().add(ep);

			resource.setURI(URI.createFileURI(generatedFile.getAbsolutePath()));

			resource.save(
					new FileOutputStream(new File(generatedFile.getAbsolutePath())),
					null);

//			ep.eResource().save(new FileOutputStream(
//					new File(file.getAbsolutePath() + "/GENERATED-" + this.ep.getName() + ".ecore")), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Saved !");
	}

	public File getGeneratedFile() {
		return generatedFile;
	}

}
