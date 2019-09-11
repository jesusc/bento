package com.odesign.generator;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.odesign.generator.tools.BindingTools;


/**
 * @author souhaila
 *
 */
public class GbindGenerator {

	public class MetamodelInfo {
		Resource resource;
		String uri;
		String name;

		public MetamodelInfo() {

		}
	}

	private MetamodelInfo concept = new MetamodelInfo();
	private MetamodelInfo metamodel = new MetamodelInfo();
	private MetamodelInfo bindingMetamodel = new MetamodelInfo();
	private StringBuilder bindings = new StringBuilder();
	private Resource model;

	public GbindGenerator(String bindingMetamodel, String modelURI, String targetmm, String sourcemm, String outputURI)
			throws FileNotFoundException, IOException {
		// the binding metamodel
		this.bindingMetamodel.resource = loadMetamodel(bindingMetamodel);

		// the source metamodel
		this.concept.resource = loadMetamodel(sourcemm);
		this.concept = getMeteamodelInfo(this.concept);

		// the source target
		this.metamodel.resource = loadMetamodel(targetmm);
		this.metamodel = getMeteamodelInfo(this.metamodel);

		createHeader(this.bindings, this.concept, this.metamodel);
		createRootBinding(this.bindings, this.concept, this.metamodel);

		// Read the binding model
		this.model = loadMetamodel(modelURI);
		TreeIterator<EObject> el = model.getAllContents();

		// Get the list of the source objects
		List<EObject> listOfSourceObjects = new ArrayList<>();

		while (el.hasNext())

		{
			EObject objModel = el.next();
			listOfSourceObjects.add(objModel);

		}

		createBodyBinding(this.bindings, this.model, this.concept, this.metamodel);
		saveGbindFile(outputURI, metamodel.name + "2" + concept.name, this.bindings);

	}

	public Resource loadMetamodel(String uri) {
		ResourceSet rsource = new ResourceSetImpl();
		return rsource.getResource(URI.createFileURI(uri), true);
	}

	public void createHeader(StringBuilder header, MetamodelInfo source, MetamodelInfo target) {
		header.append("binding " + target.name + "2" + source.name + " {");

		header.append(System.getProperty("line.separator"));
		header.append("\t concept " + source.name.toUpperCase() + " : " + "\"" + source.uri + "\"");

		header.append(System.getProperty("line.separator"));
		header.append("\t metamodel " + target.name.toUpperCase() + " : " + "\"" + target.uri + "\"");
		header.append(System.getProperty("line.separator"));
		header.append(System.getProperty("line.separator"));

	}

	public void createRootBinding(StringBuilder binding, MetamodelInfo concept, MetamodelInfo metamodel) {

		EPackage sourceEP = BindingTools.getEPackage(concept.resource);
		String sourceRootName = (BindingTools.findRoot(BindingTools.fillContainersList(sourceEP))).getName();

		EPackage targetEP = BindingTools.getEPackage(metamodel.resource);
		String targetRootName = "TasksFlow";//(BindingTools.findRoot(BindingTools.fillContainersList(targetEP))).getName();

		binding.append("\t class " + sourceRootName + " to " + targetRootName);
		binding.append(System.getProperty("line.separator"));

	}

	public void createBodyBinding(StringBuilder sb, Resource model, MetamodelInfo concept, MetamodelInfo metamodel) {

		TreeIterator<EObject> content = model.getAllContents();
		while (content.hasNext()) {
			EObject obj = content.next();
			EObject sourceObj;
			EObject targetObj;

			EList<EObject> listRefs = obj.eCrossReferences();
			for (EObject eobject : listRefs) {
				if (eobject.eClass().getName().equals("NoneElement")) {
					sb.append("\t class " + obj.eClass().getName() + " to NONE");
				}
			}
			System.out.println();

			if (obj.eClass().getName().equals("IntermediateElement")) {

				EList<EObject> refs = obj.eCrossReferences();
				sourceObj = refs.get(0);
				targetObj = refs.get(1);

				EList<EAttribute> attributes = targetObj.eClass().getEAllAttributes();
				for (EAttribute attr : attributes) {
					if (attr.getName().equals("name")) {
						sb.append("\t class " + sourceObj.eClass().getName() + " to "
								+ targetObj.eGet((EStructuralFeature) attr));
						sb.append(System.getProperty("line.separator"));
					}
				}

			}

			sb.append(System.getProperty("line.separator"));
			if (obj.eClass().getName().equals("MetamodelElementFeature")) {

				EList<EObject> list = obj.eCrossReferences();
				EObject feature = list.get(0);

				String containerOfFeature = feature.eContainer().eClass().getName();
				String nameOfFeature = feature.eClass().getName().replace(containerOfFeature, "");

				EObject container = obj.eContainer();

				for (EStructuralFeature estructural : obj.eClass().getEAllAttributes()) {
					if (estructural.getName().equals("name")) {

						EList<EAttribute> attributes = container.eClass().getEAllAttributes();
						for (EAttribute attr : attributes) {
							if (attr.getName().equals("name")) {

								sb.append("\t feature " + containerOfFeature + "." + nameOfFeature + "  to  "
										+ container.eGet((EStructuralFeature) attr) + "."
										+ obj.eGet((EStructuralFeature) estructural));
							}
						}
					}
				}
				sb.append(System.getProperty("line.separator"));
				System.out.println();
			}

			if (obj.eClass().getName().equals("VirtualAttribute")) {
				EList<EObject> references = obj.eCrossReferences();

				EObject targetFeature = references.get(0);
				EList<EAttribute> listAttributes = obj.eClass().getEAllAttributes();
				for (EAttribute attribute : listAttributes) {
					if (attribute.getName().equals("Expression")) {

						String containerOfTargetFeature = targetFeature.eContainer().eClass().getName();
						String targetFeatureName = targetFeature.eClass().getName().replace(containerOfTargetFeature,
								"");

						sb.append("\t feature " + containerOfTargetFeature + "." + targetFeatureName + " = "
								+ obj.eGet((EStructuralFeature) attribute));
					}
				}

			}

		}
	}

	public void saveGbindFile(String outputURI, String filename, StringBuilder sb) {
		try {
			sb.append("\n }");
			BufferedWriter br = new BufferedWriter(new FileWriter(outputURI + "/" + filename + ".gbind"));
			String st = sb.toString();
			System.out.println(st);
			br.write(st);
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MetamodelInfo getMeteamodelInfo(MetamodelInfo metamodelInfo) {

		EPackage ep = BindingTools.getEPackage(metamodelInfo.resource);
		metamodelInfo.name = ep.getName();
		metamodelInfo.uri = ep.getNsURI();

		return metamodelInfo;
	}

	public StringBuilder getBindings() {
		return bindings;
	}

	public void setBindings(StringBuilder bindings) {
		this.bindings = bindings;
	}

}
