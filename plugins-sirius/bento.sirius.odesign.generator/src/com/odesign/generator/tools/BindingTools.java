package com.odesign.generator.tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;

public class BindingTools {

	
   
     
	
	
	/**
	 * @param name
	 * @param isabstract
	 * @param epackage
	 * @return
	 */
	public static EClass createEClass(String name, Boolean isabstract, EPackage epackage,EClass container) {
		EClass eclass = EcoreFactory.eINSTANCE.createEClass();
		eclass.setName(name);
		epackage.getEClassifiers().add(eclass);
		eclass.setAbstract(isabstract);
		
		
		EReference ereference = EcoreFactory.eINSTANCE.createEReference();
		ereference.setContainment(true);
		ereference.setEType(eclass);
		ereference.setName("contains"+eclass.getName());
		ereference.setUpperBound(-1);
		container.getEReferences().add(ereference);
	
		
		return eclass;

	}
	
	
	public static EReference createEReference(String name , Boolean isContainement, EClass etype, int upperbound, int lowerbound, EClass eclass) {
		
		
		EReference ereference = EcoreFactory.eINSTANCE.createEReference();
		ereference.setContainment(isContainement);
		ereference.setEType(etype);
		ereference.setName(name);
		ereference.setUpperBound(upperbound);
		eclass.getEReferences().add(ereference);
		return ereference;
		
	}

	
	
	/**
	 * @param name
	 * @param datatype
	 * @param eclass
	 * @return
	 */
	public static EAttribute createEAttribute(String name, EDataType datatype, EClass eclass) {

		EAttribute eattribute = EcoreFactory.eINSTANCE.createEAttribute();
		eattribute.setName(name);
		eattribute.setEType(datatype);
		eclass.getEAttributes().add(eattribute);

		return eattribute;
	}

	public static EAttribute createEAttribute(String name, EClassifier datatype, EClass eclass) {

		EAttribute eattribute = EcoreFactory.eINSTANCE.createEAttribute();
		eattribute.setName(name);
		eattribute.setEType(datatype);
		eclass.getEAttributes().add(eattribute);

		return eattribute;
	}

	
	
	/**
	 * @param value
	 * @return
	 */
	public static String upperCaseFirst(String value) {

		// Convert String to char array.
		char[] array = value.toCharArray();
		// Modify first element in array.
		array[0] = Character.toUpperCase(array[0]);
		// Return string.
		return new String(array);
	}

	/**
	 * @param epack
	 * @return
	 */
	public static List<EClass> fillContainersList(EPackage epack) {
		List<EClass> containersList = new ArrayList<>();
		EList<EClassifier> list_clasifiers = epack.getEClassifiers();
		Iterator<EClassifier> iterator1 = list_clasifiers.iterator();
		while (iterator1.hasNext()) {
			EClassifier klass = iterator1.next();
			// Adding the classes
			if (klass instanceof EClass) {

				// Filling the list of the classes that are suggested to be the root
				if (BindingTools.isContainerClass((EClass) klass)) {

					containersList.add((EClass) klass);
				}

			}

		}
		return containersList;
	}

	public static EClass findRoot(List<EClass> containersList) {

		EClass root = null;
		Iterator<EClass> itcontainers = containersList.iterator();

		// Searching for the root of the MM
		while (itcontainers.hasNext()) {
			List<EClass> contained_containers = new ArrayList<EClass>();
			EClass container = itcontainers.next();
			EList<EReference> list_content = container.getEAllContainments();

			Iterator<EReference> it_list_content = list_content.iterator();
			while (it_list_content.hasNext()) {
				EClass eklass = (EClass) it_list_content.next().getEType();
				if (!eklass.equals(container)) {
					if (BindingTools.isContainerClass(eklass)) {
						contained_containers.add(eklass);
					}
				}

			}

			if (contained_containers.size() == containersList.size() - 1) {
				System.out.println("--" + container.getName() + "  is the Root");
				root = container;

				break;

			}
		}
		return root;

	}

	public static boolean isContainerClass(EClass eclass) {
		boolean isContainer = false;
		EList<EReference> list = eclass.getEAllContainments();
		Iterator<EReference> it = list.iterator();
		while (it.hasNext()) {
			EReference obj = it.next();
			if (obj.getEContainingClass() != null) {
				isContainer = true;
				break;
			}

		}

		return isContainer;
	}

}
