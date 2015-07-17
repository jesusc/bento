package bento.glib.table2chart;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Util {
	public static Resource load(String fileName){
        ResourceSet rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
        
        Resource mr = rs.getResource(URI.createURI("metamodels/Table.ecore"), true);
        EPackage pkg = (EPackage) mr.getContents().get(0);
        rs.getPackageRegistry().put(pkg.getNsURI(), pkg);
        
        Resource r = rs.getResource(URI.createURI(fileName), true);
        return r;
	}
}
