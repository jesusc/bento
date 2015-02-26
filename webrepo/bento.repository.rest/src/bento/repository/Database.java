package bento.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Database {
	public static Database INSTANCE = null;

	public static void configure(String folder) {
		INSTANCE = new Database(folder);
	}

	private String folder;
	private DatabaseIndex index;
	
	public Database(String folder) {
		File file = new File(folder);
		if ( ! file.exists() ) {
			file.mkdir();
		}
		this.folder = folder;
		this.index  = new DatabaseIndex();
		
		File[] files = file.listFiles();
		for(int i = 0; i < files.length; i++) {
			if ( files[i].isDirectory() ) {
				File metadata = getMetadataFile(files[i].getName());
				if ( metadata.exists() ) {
					readMetadata(metadata);
				}
			}
		}
	}

	private void readMetadata(File metadata) {
		Gson gson = new Gson();
		ComponentMetadata cm;
		try {
			cm = gson.fromJson(new FileReader(metadata), ComponentMetadata.class);
			if ( cm != null ) {
				index.add(cm);
			}
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private File getComponentFolder(String name) {
		return new File(folder + File.separator + name);
	}	
	
	// Database API
	
	//
	// Component resource
	//
	
	/**
	 * Checks if the component has already been installed.
	 * 
	 * @param name the component name
	 * @return true if it already exists.
	 */
	public synchronized boolean existsComponent(String name) {
		if ( getComponentFolder(name).exists() )
			return true;
		return false;
	}

	/**
	 * Install the component.
	 * A component cannot be installed if it already exists.
	 * 
	 * @param name
	 * @param copier
	 * @return 
	 */
	public synchronized boolean installComponent(String name, String metadata, Function<File, Boolean> copier) {
		if ( existsComponent(name) ) {
			return false;
		}
		
		getComponentFolder(name).mkdir();
		
		// Try to parse
		Gson gson = new Gson();
		ComponentMetadata cm = gson.fromJson(metadata, ComponentMetadata.class);
		
		FileWriter writer;
		try {
			writer = new FileWriter(getMetadataFile(name));
			gson.toJson(cm, writer);
			writer.close();			
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}

		File f = getDataFile(name);
		copier.apply(f);
		
		index.add(cm);
		
		return true;
	}

	public synchronized boolean retrieveComponent(String name, Function<InputStream, Boolean> copier) {
		if ( ! existsComponent(name) ) {
			return false;
		}
		
		try {
			FileInputStream is = new FileInputStream(getDataFile(name));
			return copier.apply(is);
		} catch (FileNotFoundException e) {
			return false;
		}
	}


	private File getDataFile(String name) {
		File f = getComponentFolder(name);
		String zip = f.getAbsolutePath() + File.separator + "data.zip";
		return new File(zip);
	}

	private File getMetadataFile(String name) {
		File f = getComponentFolder(name);
		String zip = f.getAbsolutePath() + File.separator + "info.json";
		return new File(zip);
	}

	/*
	public List<String> allComponents() {
		LinkedList<String> result = new LinkedList<String>();
		File f = new File(folder);
		for(File x : f.listFiles()) {
			if ( x.isDirectory() ) {
				result.add(x.getName());
			}
		}
		return result;
	}
	*/

	public List<ComponentMetadata> allComponents() {
		Set<ComponentMetadata> result = index.findAll();
		List<ComponentMetadata> comps = new ArrayList<ComponentMetadata>();
		comps.addAll(result);
		return comps;
	}

	public List<ComponentMetadata> findComponents(String[] names, String[] tags) {
		Set<ComponentMetadata> result = new HashSet<ComponentMetadata>();
		if ( tags != null ) {
			result.addAll( index.findByTag(tags) );
		}
		
		if ( names != null ) {
			result.addAll( index.findByName(names) );
		}
		
		List<ComponentMetadata> comps = new ArrayList<ComponentMetadata>();
		result.forEach(c -> comps.add(c));
		return comps;
	}

	
}
