package config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.common.annotations.VisibleForTesting;

import java.io.File;
import java.io.IOException;

public class ConfigReader {

    // Loading the YAML file from the /resources folder
   // ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
   // File file = new File(classLoader.getResource("sample.yml").getFile());

    // Instantiating a new ObjectMapper as a YAMLFactory
    ObjectMapper om = new ObjectMapper(new YAMLFactory());


    ApiConfig config;

    {
        try {
            config = om.readValue(new File("src/main/java/resources/sample.yml"),ApiConfig.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
