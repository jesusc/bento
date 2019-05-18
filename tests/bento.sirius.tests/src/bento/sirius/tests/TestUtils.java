package bento.sirius.tests;

import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.jdt.annotation.NonNull;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import bento.sirius.tests.model.AllowCreate;
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
	
}
