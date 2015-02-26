package bento.repository.common;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import bento.language.bentocomp.core.Component;

public class BentoURIResolver {
	private static final String BENTO_SCHEME = "bento:/";
	
	private static final String LOCAL_REPO      = "/bento.local.repo/download/";
	private static final String LOCAL_REPO_URI  = "platform:/resource" + LOCAL_REPO;
	
	private static final String TRAFO_FOLDER = "transformation";
	private static final String BINDING_FOLDER = "bindings";
	private static final String METAMODELS_FOLDER = "metamodels";
	
	public static String getNonQualifiedName(Component c) {
		String[] parts = c.getName().split("\\.");
		return parts[parts.length - 1];
	}
	
	public static IProject getProject(Resource r) {
		if ( r.getURI().isPlatformResource() ) {
			String projectName = r.getURI().segment(1);				
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			return p;
		} else {
			return null;
		}			
	}

	private static boolean checkResourceExists(String identifier, String defaultFolder, Resource r) {
		if ( identifier.startsWith(BENTO_SCHEME) ) {
			String path = identifier.replaceFirst(BENTO_SCHEME, "");
			
			String[] parts = path.split("/");
			String qualifiedName = parts[0];
			String resourcePath = path.replaceFirst(qualifiedName, "");
			
			identifier = LOCAL_REPO + qualifiedName + "/" + defaultFolder + "/" + resourcePath;			
			IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(identifier));
			return f.exists();
		} else if ( ! identifier.startsWith("platform:/resource") && r.getURI().isPlatformResource() ) {
			String projectName = r.getURI().segment(1);				
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			
			String prefix = "";
			if ( p.getName().equals("bento.local.repo") ) {
				IFile resourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(r.getURI().toPlatformString(true)));
				IContainer c = resourceFile.getParent().getParent(); // Skip META-INF -> componentName
				prefix = c.getFullPath().toPortableString() + "/";
				// remove the reference to the project name...
				prefix = prefix.replaceFirst("bento.local.repo", "");
			}
			
			IFile file = p.getFile(prefix + defaultFolder + "/" + identifier);
			return file.exists();
		} else if ( identifier.startsWith("platform:/resource") ) {
			identifier = identifier.replaceFirst("platform:/resource", "");
			IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(identifier));
			return f.exists();
		} else {
			return new File(identifier).exists();
		}	
	}

	// Very similar as checkResourceExists... 
	public static String tryResolveResource(String identifier, String defaultFolder, Resource r) {
		if ( identifier.startsWith(BENTO_SCHEME) ) {
			String path = identifier.replaceFirst(BENTO_SCHEME, "");
			
			String[] parts = path.split("/");
			String qualifiedName = parts[0];
			String resourcePath = path.replaceFirst(qualifiedName, "");
			
			identifier = LOCAL_REPO_URI + qualifiedName + "/" + defaultFolder + "/" + resourcePath;			
			return identifier;
		
		} else if ( ! identifier.startsWith("platform:/resource") && r.getURI().isPlatformResource() ) {
			String projectName = r.getURI().segment(1);				
			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			
			String prefix = "";
			if ( p.getName().equals("bento.local.repo") ) {
				IFile resourceFile = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(r.getURI().toPlatformString(true)));
				IContainer c = resourceFile.getParent().getParent(); // Skip META-INF -> componentName
				prefix = c.getFullPath().toPortableString() + "/";
				// remove the reference to the project name...
				prefix = prefix.replaceFirst("bento.local.repo", "");
			}
			
			IFile file = p.getFile(prefix + defaultFolder + "/" + identifier);
			return "platform:/resource/" + file.getFullPath().toPortableString();
		} else if ( identifier.startsWith("platform:/resource") ) {
			return identifier;
		} else {
			return identifier;
		}	
	}

	public static String tryResolveBinding(String identifier, Resource r) {
		return tryResolveResource(identifier, BINDING_FOLDER, r);
	}
	
	public static String tryResolveTransformation(String identifier, Resource r) {
		return tryResolveResource(identifier, TRAFO_FOLDER, r);
	}

	public static boolean transformationExists(String identifier, Resource r) {
		return checkResourceExists(identifier, TRAFO_FOLDER, r);
	}
	
	public static boolean bindingExists(String identifier, Resource r) {
		return checkResourceExists(identifier, BINDING_FOLDER, r);
	}
	
	
	public static String tryResolveMetamodel(String identifier, Resource r) {
		if ( identifier.startsWith("http:/") ) 
			return identifier;
		if ( identifier.startsWith("uri:") )
			return identifier.replaceFirst("uri:", "");
		
		
		/*
		if ( identifier.startsWith(BENTO_SCHEME) ) {
			String original = identifier;
			String path = identifier.replaceFirst(BENTO_SCHEME, "");
			
			String[] parts = path.split("/");
			String qualifiedName = parts[0];
			String metamodelPath = path.replaceFirst(qualifiedName, "");
			
			identifier = LOCAL_REPO + qualifiedName + "/metamodels/" + metamodelPath; // + ".ecore";
			System.out.println(original + " => " + identifier);
		} else {
			if ( r.getURI().isPlatformResource() ) {
				String projectName = r.getURI().segment(1);				
				IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
				IFile file = p.getFile("metamodels/" + identifier);
				if ( file.exists() ) {
					return "platform:/resource" + file.getFullPath().toPortableString();
				}
			}
			
		}
		return identifier;
		*/
		return tryResolveResource(identifier, METAMODELS_FOLDER, r);
	}

	public static String tryResolveComponent(String identifier) {
		if ( identifier.startsWith(BENTO_SCHEME) ) {
			String original = identifier;
			String name = identifier.replaceFirst("bento:/", "");
			
			String[] parts = name.split("\\.");
			String nonQualified = parts[parts.length - 1];
			
			identifier = LOCAL_REPO_URI + name + "/META-INF/" + nonQualified + ".bento";
			System.out.println(original + " => " + identifier);
		}
		return identifier;
	}

	public static Resource loadMetamodel(String identifier) {
		ResourceSet rs = new ResourceSetImpl();
		if ( identifier.startsWith("platform:") ) {
			try {
				return rs.getResource(URI.createURI(identifier), true);
			} catch ( org.eclipse.emf.common.util.WrappedException e ) {
				return null;
			}
		} else {
			return rs.getResource(URI.createURI(identifier), false);			
		}
	}

	
}
