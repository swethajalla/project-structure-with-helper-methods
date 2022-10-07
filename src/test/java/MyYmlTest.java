import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import config.ApiConfig;
import config.ConfigReader;
import config.Order;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class MyYmlTest {

    @Test
    public void ymlTest(){


        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

        mapper.findAndRegisterModules();

        try {
            ApiConfig config = mapper.readValue(new File("src/main/resources/sample.yml"), ApiConfig.class);
            System.out.println(config.getRequestType());
            System.out.println(config.getEndpoint());
            System.out.println(config.getUrls());

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();


    }
}
