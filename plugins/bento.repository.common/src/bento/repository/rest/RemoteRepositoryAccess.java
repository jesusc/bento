package bento.repository.rest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

import bento.component.model.ComponentModel;
import bento.repository.ComponentMetadata;
import bento.repository.local.LocalRepository;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.body.MultipartBody;

public class RemoteRepositoryAccess {
	public static List<ComponentMetadata> getAllComponents(String url) {
		return searchComponents(url, null, null);
	}

	public static List<ComponentMetadata> searchComponents(String url, String componentName, String tags) {
		HttpResponse<String> str;
		try {
			Map<String, Object> queryMap = new HashMap<String, Object>();
			if ( componentName != null ) queryMap.put("name", componentName);
			if ( tags != null ) queryMap.put("tag", tags);
			
			str = Unirest.get(url + "/component/all").queryString(queryMap).asString();
						
			Gson gson = new Gson();
			System.out.println(str.getBody());
		
			Type collectionType = new TypeToken<List<ComponentMetadata>>(){}.getType();
			
			List<ComponentMetadata> x = gson.fromJson(str.getBody(), collectionType);
			return x;
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return new ArrayList<ComponentMetadata>();
	}

	public static boolean downloadAndInstall(String url, String name) {
		try {
			IFolder componentFolder = LocalRepository.makeComponentFolder(name);
			if ( componentFolder == null )
				return false;
			
			HttpResponse<InputStream> r = Unirest.get(url + "/component/" + name).asBinary();
			if ( r.getStatus() != 200 ) 
				return false;
			
			File f = File.createTempFile("bento", ".zip");
			IOUtils.copy(r.getBody(), new FileOutputStream(f));
			
			System.out.println(f.getAbsolutePath());
			f.deleteOnExit();
			
			ZipFile zip = new ZipFile(f);
			
			zip.extractAll(componentFolder.getLocation().toPortableString());
			componentFolder.refreshLocal(2, null);
			// TODO: Check the entries to ensure that everything is alright
			/*
			List fileHeaderList = zip.getFileHeaders();
			
			// Loop through the file headers
			for (int i = 0; i < fileHeaderList.size(); i++) {
				FileHeader fileHeader = (FileHeader)fileHeaderList.get(i);
				// FileHeader contains all the properties of the file
				System.out.println("****File Details for: " + fileHeader.getFileName() + "*****");
				System.out.println("Name: " + fileHeader.getFileName());
				System.out.println("Compressed Size: " + fileHeader.getCompressedSize());
				System.out.println("Uncompressed Size: " + fileHeader.getUncompressedSize());
				System.out.println("CRC: " + fileHeader.getCrc32());
				System.out.println("************************************************************");
				
				// Various other properties are available in FileHeader. Please have a look at FileHeader
				// class to see all the properties
			}
			*/
			// r.getBody()
		} catch (UnirestException | IOException | ZipException | CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}

	public static boolean uploadComponent(String url, ComponentModel c, IProject project) {
		try {
			String name = c.getComponent().getName();
			File temp = File.createTempFile("bento." + name, ".zip");

			/*
			java.util.zip.ZipOutputStream zos = new java.util.zip.ZipOutputStream(new FileOutputStream(temp));
			ZipEntry entry = new ZipEntry("metamodels");
			
			zos.a
			zos.putNextEntry(entry);
			*/
			
			temp.delete();
			/*
			ZipOutputStream outputStream = new ZipOutputStream(new FileOutputStream(temp));
			ZipParameters parameters = new ZipParameters();
			
			// set compression method to store compression
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			
			// Set the compression level. This value has to be in between 0 to 9
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
	
			outputStream.putNextEntry(project.getFolder("META-INF").getLocation().toFile(), parameters);
			outputStream.closeEntry();
			
			outputStream.finish();
			
			outputStream.close();
			*/
			
			
			ZipFile zipFile = new ZipFile(temp);
			ZipParameters parameters = new ZipParameters();
		
			// set compression method to store compression
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			
			// Set the compression level. This value has to be in between 0 to 9
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
	
			ArrayList<File> filesToAdd = new ArrayList<File>();
			
			// To add something, that seems to be compulsory!
			filesToAdd.add(project.getFile(".project").getLocation().toFile());
			
			zipFile.createZipFile(filesToAdd, parameters);
			
			// Assume certain structure for the moment!
			zipFile.addFolder(project.getFolder("META-INF").getLocation().toPortableString(), parameters);
			zipFile.addFolder(project.getFolder("metamodels").getLocation().toPortableString(), parameters);
			zipFile.addFolder(project.getFolder("transformation").getLocation().toPortableString(), parameters);
			if ( project.getFolder("bindings").exists() )
				zipFile.addFolder(project.getFolder("bindings").getLocation().toPortableString(), parameters);
			
			temp.deleteOnExit();
		
			
			MultipartBody mpart = Unirest.put(url + "/component/" + name).
					field("zipped", temp).
					field("metadata", asJson(c));
			HttpResponse<String> x = mpart.asString();
			System.out.println(x.getStatus());
			
		} catch (IOException | ZipException | UnirestException e) {
			// showError(e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private static String asJson(ComponentModel c) {
		String tagList = c.getComponent().getTags().stream().
				map(t -> q(t.getValue()) ).
				collect(Collectors.joining(", "));
		
		return "{" + 
			q("name") + ":" + q(c.getComponent().getName()) + "," +
			q("version") + ":" + q(c.getComponent().getVersion() == null ? "0" : c.getComponent().getVersion()) + "," +
			q("tags") + ":" + "[" + tagList + "]" +	
		"}";
	}

	private static String q(String str) {
		return '"' + str + '"';
	}
	


}

