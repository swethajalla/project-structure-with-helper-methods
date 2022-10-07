import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySecretsAppTest {
    @Test
    public void secretTest(){
        MySecretsApp app = new MySecretsApp();
        System.out.println(app.getSecret("PASSWORD"));

    }

}