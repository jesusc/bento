package bento.sirius.tests;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jdt.annotation.NonNull;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.nodes.Tag;

import bento.sirius.tests.model.AllowCreate;
import bento.sirius.tests.model.PaletteSpec;
import bento.sirius.tests.model.SiriusSpecificationModel;

public class TestUtils {

	/**
	 * Loads a spec YAML using SnakeYAML as described here:
	 *   https://www.baeldung.com/java-snake-yaml
	 */
	@NonNull
	public static SiriusSpecificationModel loadRequirementsAsYaml(@NonNull String fileName) {
		Constructor constructor;
		constructor = new Constructor(SiriusSpecificationModel.class);
		TypeDescription customTypeDescription = new TypeDescription(SiriusSpecificationModel.class);
		customTypeDescription.addPropertyParameters("create", AllowCreate.class);
		customTypeDescription.addPropertyParameters("palette", PaletteSpec.class);
		
		// Constructor palConstructor = new Constructor(PaletteSpec.class);
		//constructor.addTypeDescription(new TypeDescription(PaletteNodeItem.class, new Tag("!node")));
		
		constructor.addTypeDescription(customTypeDescription);
		
		Yaml yaml = new Yaml(constructor);

		try (FileInputStream fis = new FileInputStream(fileName)){
			SiriusSpecificationModel model = yaml.load(fis);
			return model;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			fail("Couldn't read YAML" + fileName);
		} catch (IOException e1) {
			e1.printStackTrace();
			fail("Couldn't read YAML" + fileName);
		}
		
		throw new IllegalStateException();
	}

	public static List<EObject> getAllElements(Resource originalModel) {
		List<EObject> elements = new ArrayList<EObject>();
		originalModel.getAllContents().forEachRemaining(elements::add);
		return elements;
	}
	
	
	
}
