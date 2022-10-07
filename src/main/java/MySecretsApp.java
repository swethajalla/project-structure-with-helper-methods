import io.github.cdimascio.dotenv.Dotenv;

public class MySecretsApp {

    Dotenv dotenv= Dotenv.load();

    private String secret;

    public String getSecret(String key) {
        secret=dotenv.get(key);
        return this.secret;
    }



}
