package genericity.xsd;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class EMFUtils {
	static public void registerPackage(String metamodelURI) throws IOException {
		
		EPackage.Registry registry = EPackage.Registry.INSTANCE;

		Map etfm = Resource.Factory.Registry.INSTANCE
				.getExtensionToFactoryMap();
		if (!etfm.containsKey("*")) {
			etfm.put("*", new XMIResourceFactoryImpl());
		}

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(EcorePackage.eINSTANCE.getNsURI(),
				EcorePackage.eINSTANCE);
		Resource metamodel = resourceSet.createResource(URI.createFileURI(metamodelURI));
		metamodel.load(Collections.EMPTY_MAP);

		setDataTypesInstanceClasses(metamodel);

		Iterator it = metamodel.getAllContents();
		while (it.hasNext()) {
			Object next = it.next();
			if (next instanceof EPackage) {
				EPackage p = (EPackage) next;
				if (p.getNsURI() == null) {
					if (p.getESuperPackage() == null) {
						p.setNsURI(p.getName());
					} else {
						p.setNsURI(p.getESuperPackage().getNsURI() + "/"
								+ p.getName());
					}
				}
				if (p.getNsPrefix() == null) {
					if (p.getESuperPackage() != null) {
						if (p.getESuperPackage().getNsPrefix() != null) {
							p.setNsPrefix(p.getESuperPackage().getNsPrefix()
									+ "." + p.getName());
						} else {
							p.setNsPrefix(p.getName());
						}
					}
				}
				registry.put(p.getNsURI(), p);
				metamodel.setURI(URI.createURI(p.getNsURI()));
			}
		}
	}

	static private void setDataTypesInstanceClasses(Resource metamodel) {
		Iterator it = metamodel.getAllContents();
		while (it.hasNext()) {
			EObject eObject = (EObject) it.next();
			if (eObject instanceof EEnum) {
				// ((EEnum) eObject).setInstanceClassName("java.lang.Integer");
			} else if (eObject instanceof EDataType) {
				EDataType eDataType = (EDataType) eObject;
				String instanceClass = "";
				if (eDataType.getName().equals("String")) {
					instanceClass = "java.lang.String";
				} else if (eDataType.getName().equals("Boolean")) {
					instanceClass = "java.lang.Boolean";
				} else if (eDataType.getName().equals("Integer")) {
					instanceClass = "java.lang.Integer";
				} else if (eDataType.getName().equals("Float")) {
					instanceClass = "java.lang.Float";
				} else if (eDataType.getName().equals("Double")) {
					instanceClass = "java.lang.Double";
				}
				eDataType.setInstanceClassName(instanceClass);
			}
		}
	}
}