package bento.tasks;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tinytools.metamodel.visitor.VisitorCreator;
import tinytools.metamodel.visitor.VisitorOptions;

public class GenerateVisitor {


	public static void main(String[] args) throws Exception {
		ResourceSet rs = new ResourceSetImpl();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("genmodel", new EcoreResourceFactoryImpl());
		// GenModelPackage.eINSTANCE
		rs.getPackageRegistry().put(GenModelPackage.eINSTANCE.getNsURI(), GenModelPackage.eINSTANCE);
		
		Resource r3 = rs.getResource(URI.createURI("file:///home/jesus/projects/genericity/plugins/genericity.language.gbind/metamodel/gbind.genmodel"), true);
		
		VisitorOptions options = new VisitorOptions ();
		// options.setBaseDir("tmp_");
		options.setBaseDir("/home/jesus/projects/genericity/plugins/bento.adapter.atl/src-gen");
		options.setPackagePrefix("bento.adapter.gbind.visitors");
		options.setVisitorClass("GBindVisitor");
		
		VisitorCreator compiler = new VisitorCreator();
		compiler.compile(r3, options);
	}

}
