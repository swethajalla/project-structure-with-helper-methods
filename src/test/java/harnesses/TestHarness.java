package harnesses;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import support.automationcore.Context;
import support.projectConfig.ConfigProvider;

public abstract class TestHarness {
    /***
     * Sets up the test context initially
     */
    @BeforeAll
    public void setUpContext(){
        //log().info("Starting execution);
        if (this.getConfigProvider() == null) {
            //log().error("Config provider not set.Can't create context, aborting!");
            throw new NullPointerException("ConfigProvider for %s is null.".formatted(this.getClass().getName()));
        }
        Context.createContext(this.getConfigProvider());
    }

    /***
     * Performs final tear down of the test context
     */
    @AfterAll
    public void tearDownContext() {
        Context.closeContext();
        //log().info("Execution finished");
    }

    public abstract void setConfigProvider();

    public abstract void setConfigProvider(ConfigProvider provider);

    public abstract ConfigProvider getConfigProvider() ;



}
