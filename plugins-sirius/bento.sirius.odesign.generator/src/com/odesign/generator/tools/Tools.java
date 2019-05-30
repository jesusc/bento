package com.odesign.generator.tools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

public class Tools {
	
	 public static String upperCaseFirst(String value) {

	        // Convert String to char array.
	        char[] array = value.toCharArray();
	        // Modify first element in array.
	        array[0] = Character.toUpperCase(array[0]);
	        // Return string.
	        return new String(array);
	    }
	public static List<EClass> fillContainersList(EPackage epack) {
		List<EClass> containersList = new ArrayList<>();
		EList<EClassifier> list_clasifiers = epack.getEClassifiers();
		Iterator<EClassifier> iterator1 = list_clasifiers.iterator();
		while (iterator1.hasNext()) {
			EClassifier klass = iterator1.next();
			// Adding the classes
			if (klass instanceof EClass) {

				// Filling the list of the classes that are suggested to be the root
				if (Tools.isContainerClass((EClass) klass)) {

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
					if (Tools.isContainerClass(eklass)) {
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
		System.err.println(isContainer);
		return isContainer;
	}

}
