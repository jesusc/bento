package genericity.xsd;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xsd.util.XSDResourceFactoryImpl;
import org.plcopen.xml.tc60201.Tc60201Package;
import org.plcopen.xml.tc60201.impl.Tc60201FactoryImpl;
import org.plcopen.xml.tc60201.util.Tc60201ResourceFactoryImpl;
import org.plcopen.xml.tc60201.util.Tc60201ResourceImpl;

public class LoadXML {
	public static void main(String[] args) throws IOException {
		  // Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xsd", new XSDResourceFactoryImpl());

		ResourceSet rsSource = new Tc60201ResourceSetImpl();
		// EMFUtils.registerPackage(args[0]);
		//EPackage.Registry.INSTANCE.put(Tc60201Package.eINSTANCE.getNsURI(), arg1)
		EPackage.Registry.INSTANCE.put("http://www.plcopen.org/xml/tc6.xsd", Tc60201Package.eINSTANCE.getNsURI());
		rsSource.getPackageRegistry().put("http://www.plcopen.org/xml/tc6.xsd", Tc60201Package.eINSTANCE.getNsURI());
		
		//Creación del resource para el formulario
		HashMap options = new HashMap();
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resSource = rsSource.getResource(URI.createFileURI(args[0]), true);
		resSource.load(options);
		
		//Almacenamiento en disco
		ResourceSet rsTarget = new Tc60201ResourceSetImpl();
		rsTarget.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new EcoreResourceFactoryImpl());
			
		URI uri = URI.createFileURI(args[1]);
		Resource resTarget = rsTarget.createResource(uri);

		try {		
			resTarget.getContents().add(resSource.getContents().get(0));			
			options = new HashMap();
			// options.put(XMLResource.OPTION_SCHEMA_LOCATION, "http://xmlns.oracle.com/Forms " + args[0]);
			resTarget.save(options);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public static class Tc60201ResourceSetImpl extends ResourceSetImpl {
		public Tc60201ResourceSetImpl() {
			this.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xml", new Tc60201ResourceFactoryImpl());		
		}
	}		
	
}
