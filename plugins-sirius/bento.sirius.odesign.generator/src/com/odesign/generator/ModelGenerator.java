package com.odesign.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;

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
	public ModelGenerator(String modelURI, File outputFile, EPackage originalMetamodel, EPackage targetMetamodel)
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
					.createFileURI(outputFile.getAbsolutePath()));

		} catch (Exception e) {
			e.printStackTrace();
		}

		EFactory efactory = this.targetMetamodel.getEFactoryInstance();

		List<EClassifier> listEClassifiersTarget = this.targetMetamodel.getEClassifiers();
		List<EClassifier> listEClassifiersSource = this.originalMetamodel.getEClassifiers();
		List<EEnum> listEEnumSource =new ArrayList<>();		
		List<EEnum> listEEnumTarget =new ArrayList<>();
		// HashMap < target EClass, source EClass >

		HashMap<EClass, EClass> corespondingEClasses = new HashMap<EClass, EClass>();
		HashMap<EEnum, EEnum> corespondingEEnums=new HashMap<>();
		try {
			for (EClassifier eclassOriginal : listEClassifiersSource) {
				if(eclassOriginal instanceof EEnum) {
					listEEnumSource.add((EEnum) eclassOriginal);
				}
				for (EClassifier eclassTarget : listEClassifiersTarget) {
					if(eclassTarget instanceof EEnum) {
						listEEnumTarget.add((EEnum) eclassTarget);
					}
					if (eclassOriginal.getName().equals(eclassTarget.getName())) {
						if (eclassOriginal instanceof EClass && eclassTarget instanceof EClass) {
							corespondingEClasses.put((EClass) eclassTarget, (EClass) eclassOriginal);
						}
					}
					
					if (eclassOriginal.getName().equals(eclassTarget.getName())) {
						if (eclassOriginal instanceof EEnum && eclassTarget instanceof EEnum) {
							
							corespondingEEnums.put((EEnum) eclassOriginal, (EEnum) eclassTarget);
						}
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		HashMap<EObject, EObject> corespondingObjects = new HashMap<EObject, EObject>();

		// Get the target model's root
//		List<EClass> containersList = Tools.fillContainersList(this.targetMetamodel);
//		EClass rootTarget = Tools.findRoot(containersList);

		List<EClass> containersList = Tools.fillContainersList(this.originalMetamodel);
		EClass rootOriginal = Tools.findRoot(containersList);
		EClass rootTarget = null;
		for (EClassifier eclassifier : listEClassifiersTarget) {
			if (rootOriginal.getName().equals(eclassifier.getName())) {
				rootTarget = (EClass) eclassifier;
			}
		}
		// Create the target models root object
		EObject rootObject = efactory.create(rootTarget);
		resourceTarget.getContents().add(rootObject);

		// Get the EReferenvces of the root
		List<EReference> listRootEreferences = rootTarget.getEAllReferences();

		// get the EReferenvces of the root
		List<EReference> listRootOriginalEreferences = rootTarget.getEAllReferences();

		List<String> listNameRootOriginalRef = new ArrayList<>();
		List<EClass> copyList = new ArrayList<EClass>();
		for (EClassifier newTarget1 : listEClassifiersTarget) {
			if (newTarget1 instanceof EClass)
				copyList.add((EClass) newTarget1);
		}

		for (EClassifier newTarget : listEClassifiersTarget) {
			for (EClassifier oldSource : listEClassifiersSource) {
				if (newTarget instanceof EClass && oldSource instanceof EClass)
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
										break;
									} else {
										rootObject.eSet(ref, obj);
										break;
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
										//System.out.println(source.getEType().getName());
										if (source.getEType() instanceof EDataType) {
											
											if (!(source.getEType() instanceof EEnum))
											obj.eSet(target, o.eGet((EStructuralFeature) source));
											break;}
										if (source.getEType() instanceof EEnum){
											if (!source.getEType().getName().equals("EString")) {
											

										
											
											org.eclipse.emf.common.util.Enumerator enumeration= (Enumerator) (o.eGet((EStructuralFeature) source));
											String literal=enumeration.getLiteral();
											EEnum targetEnum=corespondingEEnums.get(source.getEType());
											
								
											obj.eSet(target, targetEnum.getEEnumLiteral(literal));
											break;
										}
										}
										
									}
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

							for (EClassifier featureEClassifier : listEClassifiersTarget) {
//								System.out.println(featureEClassifier.getName() + "==" + target.getName().toLowerCase()
//										+ Tools.upperCaseFirst(ec.getName()));
								if (featureEClassifier.getName()
										.equals(target.getName().toLowerCase() + Tools.upperCaseFirst(ec.getName()))) {
									if (featureEClassifier instanceof EClass) {
									attributeClassObject = efactory.create((EClass) featureEClassifier);
									EAttribute attribute = ((EClass) featureEClassifier).getEAllAttributes().get(0);
								
									//PROBLEM HERE !
									
									if (sourceOfTarget.getEType() instanceof EEnum){
										if (!sourceOfTarget.getEType().getName().equals("EString")) {
									org.eclipse.emf.common.util.Enumerator enumeration= (Enumerator) (o.eGet((EStructuralFeature) sourceOfTarget));
									String literal=enumeration.getLiteral();
									EEnum targetEnum=corespondingEEnums.get(sourceOfTarget.getEType());
									
						
									attributeClassObject.eSet(attribute, targetEnum.getEEnumLiteral(literal));
									}}
									
									else {attributeClassObject.eSet(attribute, o.eGet((EStructuralFeature) sourceOfTarget));}
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
									break;}
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

		for (EObject sourceA : listOfSourceObjects) {
			if (!sourceA.eClass().getName().equals(rootOriginal.getName())) {

				for (EReference erefSource : sourceA.eClass().getEAllReferences()) {
					if (erefSource.isMany()) {
						Collection<EObject> col = (Collection<EObject>) sourceA.eGet(erefSource);
						// List<EObject> listSourceB=new ArrayList<>();

						Iterator<EObject> it = col.iterator();
						while (it.hasNext()) {
							EObject sourceB = (EObject) it.next();
							EObject targetA = corespondingObjects.get(sourceA);
							// listSourceB.add(targetA);
							for (EReference erefTarget : targetA.eClass().getEAllReferences()) {

								if (erefSource.getName().equals(erefTarget.getName())) {
									EObject targetB = corespondingObjects.get(sourceB);
									if (erefTarget.isMany()) {
										Collection<EObject> col1 = (Collection<EObject>) targetA.eGet(erefTarget);
										col1.add(targetB);
									
									}
									
									else {targetA.eSet((EStructuralFeature) erefTarget, targetB);}
								
								break;
								}
							}
						}

					} else {
						EObject sourceB = (EObject) sourceA.eGet((EStructuralFeature) erefSource);
						EObject targetA = corespondingObjects.get(sourceA);
						for (EReference erefTarget : targetA.eClass().getEAllReferences()) {

							if (erefSource.getName().equals(erefTarget.getName())) {
								EObject targetB = corespondingObjects.get(sourceB);
								targetA.eSet((EStructuralFeature) erefTarget, targetB);
							}
						}

					}
				}
			}
		}

		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
		this.resourceTarget.save(
				new FileOutputStream(
						new File(outputFile.getAbsolutePath())),
				options);
	}

	public Resource getGeneratedModel() {
		return resourceTarget;
	}

	public ModelGenerator(String modelURI, File file, EPackage originalMetamodel, EPackage targetMetamodel,
			String output) throws FileNotFoundException, IOException {
		/**
		 * Read the original model
		 */
		ResourceSet rs = new ResourceSetImpl();
		this.resourceSource = rs.getResource(URI.createFileURI(modelURI), true);

		this.targetMetamodel = targetMetamodel;
		this.originalMetamodel = originalMetamodel;

		ResourceSet rs2 = new ResourceSetImpl();
		try {
			this.resourceTarget = rs2.createResource(URI
					.createFileURI(file.getAbsolutePath() + "/new-model-" + this.targetMetamodel.getName() + ".xmi"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		TreeIterator<EObject> el = resourceSource.getAllContents();

		List<EObject> listOfObjects = new ArrayList<>();

		while (el.hasNext())

		{
			EObject objModel = el.next();

			listOfObjects.add(objModel);

		}

		EFactory efactory = this.targetMetamodel.getEFactoryInstance();

		List<EClassifier> listEClassifiersTarget = this.targetMetamodel.getEClassifiers();
		List<EClassifier> listOriginalEClassifiers = this.originalMetamodel.getEClassifiers();
		HashMap<EClass, EClass> corespondingEClasses = new HashMap<EClass, EClass>();

		try {
			for (EClassifier eclassOriginal : listOriginalEClassifiers) {
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

		// get the target model's root
		List<EClass> containersList = Tools.fillContainersList(this.targetMetamodel);
		EClass rootTarget = Tools.findRoot(containersList);

		// create the target models root
		EObject rootObject = efactory.create(rootTarget);
		resourceTarget.getContents().add(rootObject);

		// get the EReferenvces of the root
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
			for (EClassifier oldSource : listOriginalEClassifiers) {

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

				for (EObject o : listOfObjects) {

					if (o.eClass().equals(corespondingEClasses.get(ec))) {
						System.out.println("The EClass is " + ec.getName() + " and the object is " + o.toString());
						EObject obj = efactory.create((EClass) ec);

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
//
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

		this.resourceSource.save(new FileOutputStream(output + this.originalMetamodel.getName() + ".xmi"), null);
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
