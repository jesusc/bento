package com.odesign.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.odesign.generator.tools.Tools;


/**
 * @author souhaila
 *
 */
public class ModelGenerator {

	/**
	 * The source model
	 */
	private Resource resourceSource;
	/**
	 * The target metamodel
	 */
	private EPackage originalMetamodel;

	private EPackage targetMetamodel;

	/**
	 * The new model
	 */
	private Resource resourceTarget;

	@SuppressWarnings("unchecked")
	public ModelGenerator(String modelURI, File file, EPackage originalMetamodel, EPackage targetMetamodel)
			throws FileNotFoundException, IOException {

		// Read the original model
		ResourceSet rs = new ResourceSetImpl();
		this.resourceSource = rs.getResource(URI.createFileURI(modelURI), true);
		TreeIterator<EObject> el = resourceSource.getAllContents();

		// Get the list of the source objects
		List<EObject> listOfSourceObjects = new ArrayList<>();

		while (el.hasNext())

		{
			EObject objModel = el.next();

			listOfSourceObjects.add(objModel);

		}

		this.targetMetamodel = targetMetamodel;
		this.originalMetamodel = originalMetamodel;

		// Create the target resource
		ResourceSet rs2 = new ResourceSetImpl();
		try {
			this.resourceTarget = rs2.createResource(URI
					.createFileURI(file.getAbsolutePath() + "/new-model-" + this.targetMetamodel.getName() + ".xmi"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		EFactory efactory = this.targetMetamodel.getEFactoryInstance();

		List<EClassifier> listEClassifiersTarget = this.targetMetamodel.getEClassifiers();
		List<EClassifier> listEClassifiersSource = this.originalMetamodel.getEClassifiers();

		// HashMap < target EClass, source EClass >

		HashMap<EClass, EClass> corespondingEClasses = new HashMap<EClass, EClass>();

		try {
			for (EClassifier eclassOriginal : listEClassifiersSource) {
				for (EClassifier eclassTarget : listEClassifiersTarget) {
					if (eclassOriginal.getName().equals(eclassTarget.getName())) {
						if (eclassOriginal instanceof EClass && eclassTarget instanceof EClass) {
							corespondingEClasses.put((EClass) eclassTarget, (EClass) eclassOriginal);
						}
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<EObject, EObject> corespondingObjects = new HashMap<EObject, EObject>();

		// Get the target model's root
		List<EClass> containersList = Tools.fillContainersList(this.targetMetamodel);
		EClass rootTarget = Tools.findRoot(containersList);

		// Create the target models root object
		EObject rootObject = efactory.create(rootTarget);
		resourceTarget.getContents().add(rootObject);

		// Get the EReferenvces of the root
		List<EReference> listRootEreferences = rootTarget.getEAllReferences();

		// get the original model's root
		List<EClass> containersList2 = Tools.fillContainersList(this.originalMetamodel);
		EClass rootOriginal = Tools.findRoot(containersList);

		// get the EReferenvces of the root
		List<EReference> listRootOriginalEreferences = rootTarget.getEAllReferences();

		List<String> listNameRootOriginalRef = new ArrayList<>();
		List<EClass> copyList = new ArrayList<EClass>();
		for (EClassifier newTarget1 : listEClassifiersTarget) {
			copyList.add((EClass) newTarget1);
		}

		for (EClassifier newTarget : listEClassifiersTarget) {
			for (EClassifier oldSource : listEClassifiersSource) {

				if ((((EClass) newTarget).getName()).equals(((EClass) oldSource).getName())) {

					copyList.remove(newTarget);
				}
			}

		}
		for (EReference erefOrigRoot : listRootOriginalEreferences) {
			listNameRootOriginalRef.add(erefOrigRoot.getEType().getName());

		}

		for (EStructuralFeature target1 : listRootEreferences) {
			if (target1 instanceof EReference) {
				if (((EReference) target1).isContainment()) {
					String typeName = target1.getEType().getName();

					if (listNameRootOriginalRef.contains(typeName)) {
						copyList.remove(target1.getEType());
					}

				}
			}
		}

		for (EClassifier ec : listEClassifiersTarget) {
			if (!ec.equals(rootTarget)) {

				for (EObject o : listOfSourceObjects) {

					if (o.eClass().equals(corespondingEClasses.get(ec))) {
						System.out.println("The EClass is " + ec.getName() + " and the object is " + o.toString());
						EObject obj = efactory.create((EClass) ec);
						corespondingObjects.put(o, obj);
						for (EReference ref : listRootEreferences) {
							if (ref.getEType().equals(ec)) {
								try {
									if (ref.isMany()) {
										Collection<EObject> col = (Collection<EObject>) rootObject.eGet(ref);
										col.add(obj);
									} else {
										rootObject.eSet(ref, obj);
									}
								} catch (Exception e) {
									e.printStackTrace();
								}

							}
						}

						List<EAttribute> listAttributesTarget = ((EClass) ec).getEAllAttributes();
						List<EAttribute> listAttributeSource = (corespondingEClasses.get(ec)).getEAllAttributes();

						List<EReference> listReferencesesTarget = ((EClass) ec).getEAllReferences();

						List<EReference> listReferencesSource = (corespondingEClasses.get(ec)).getEAllReferences();

						for (EStructuralFeature target : listAttributesTarget) {

							EStructuralFeature sourceOfTarget = null;
							EObject attributeClassObject = null;
							try {

								for (EStructuralFeature source : listAttributeSource) {
									if (target.getName().equals(source.getName())) {
										sourceOfTarget = source;
										obj.eSet(target, o.eGet((EStructuralFeature) source));
									}
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

							for (EClassifier featureEClassifier : listEClassifiersTarget) {
								System.out.println(featureEClassifier.getName() + "==" + target.getName().toLowerCase()
										+ Tools.upperCaseFirst(ec.getName()));
								if (featureEClassifier.getName()
										.equals(target.getName().toLowerCase() + Tools.upperCaseFirst(ec.getName()))) {
									attributeClassObject = efactory.create((EClass) featureEClassifier);
									EAttribute attribute = ((EClass) featureEClassifier).getEAllAttributes().get(0);
									attributeClassObject.eSet(attribute, o.eGet((EStructuralFeature) sourceOfTarget));
									for (EReference erefTarget : listReferencesesTarget) {
										if (erefTarget.getEType().equals((EClass) featureEClassifier)) {
											if (erefTarget.isMany()) {
												Collection<EObject> col = (Collection<EObject>) obj.eGet(erefTarget);

												col.add((EObject) attributeClassObject);
											} else {
												obj.eSet(erefTarget, attributeClassObject);
											}
										}

									}
									break;
								}
							}

						}

					}
				}
			}
		}

		TreeIterator<EObject> createdTargetObjects = this.resourceTarget.getAllContents();

		List<EObject> listCReateObjects = new ArrayList<>();
		while (createdTargetObjects.hasNext()) {
			EObject createdTargetObject = createdTargetObjects.next();
			listCReateObjects.add(createdTargetObject);
		}

		TreeIterator<EObject> createdTargetObjects1 = this.resourceTarget.getAllContents();

//		while (createdTargetObjects1.hasNext()) {
//			EObject createdTargetObject = createdTargetObjects.next();
//			for (EClassifier targetEClass : listEClassifiersTarget) {
//				if (createdTargetObject.eClass().equals(targetEClass)) {
//					for (EReference refTarget:((EClass)targetEClass).getEAllReferences()){
//					if (!copyList.contains(refTarget.getEType())) {
//						
//						for (EReference refSource: corespondingEClasses.get(targetEClass).getEAllReferences()) {
//							if (refSource.getName().equals(refTarget.getName())) {
//								for (EObject sourceObject:listOfSourceObjects ) {
//									
//									
//								}
//									SOMETHING HERE
//							}
//						}
//					}
//						
//					}
//				}
//			}
//
//		}

		for (EObject sourceA:listOfSourceObjects) {
			if(!sourceA.eClass().getName().equals(rootOriginal.getName())) {
		  
			for (EReference erefSource : sourceA.eClass().getEAllReferences()) {
				if(erefSource.isMany()) {
					Collection<EObject> col = (Collection<EObject>) sourceA.eGet(erefSource);
					//List<EObject> listSourceB=new ArrayList<>();
					
					Iterator<EObject> it=col.iterator();
					while(it.hasNext()) {
						EObject sourceB=(EObject) it.next();
						EObject targetA=corespondingObjects.get(sourceA);
					//	listSourceB.add(targetA);
						for (EReference erefTarget:targetA.eClass().getEAllReferences()) {
							
							if(erefSource.getName().equals(erefTarget.getName())) {
								EObject targetB=corespondingObjects.get(sourceB);
								targetA.eSet((EStructuralFeature)erefTarget, targetB);
							}
						}
					}
					
				}
				else {
				EObject sourceB = (EObject) sourceA.eGet((EStructuralFeature)erefSource);
				EObject targetA=corespondingObjects.get(sourceA);
				for (EReference erefTarget:targetA.eClass().getEAllReferences()) {
					
					if(erefSource.getName().equals(erefTarget.getName())) {
						EObject targetB=corespondingObjects.get(sourceB);
						targetA.eSet((EStructuralFeature)erefTarget, targetB);
					}
				}

				}
		}}}

		this.resourceTarget.save(
				new FileOutputStream(
						new File(file.getAbsolutePath() + "/generated-" + this.originalMetamodel.getName() + ".xmi")),
				null);
	}

	public Resource getResource() {
		return resourceSource;
	}

	/**
	 * @param resource
	 */
	public void setResource(Resource resource) {
		this.resourceSource = resource;
	}

	/**
	 * @return
	 */
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

}
