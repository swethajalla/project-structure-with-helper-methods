package support.automationcore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.systeminfo.model.ProcessInfo;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import support.projectConfig.ConfigProvider;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Context {

    public static  String OS;


    private static List mandatoryArgs;
    private static List platformArgs;
    private static WebDriver _driver;

    //public static final Funtion0 executor;
    public static FluentWait wait;
    public static Actions actions;
    public static DevTools devTools;
    public static ConfigProvider config;

    public static  Logger log;
    public static ProcessInfo driverProcess;

    private static String tempDir;

    public static Context INSTANCE;


    public final static List getMandatoryArgs() {
        return mandatoryArgs;
    }

    public final static void setMandatoryArgs(List mandatoryArgs) {

        Context.mandatoryArgs = mandatoryArgs;
    }

    public static void getDriver$annotations(){

    }

    public static final WebDriver getDriver(){
        WebDriver driver =_driver;
        if (driver== null){

        }
        return driver;
    }

    public static final void setDriver(WebDriver value) {
        //Intrinsics.checkNotNullParameter(value,"value");
        _driver = value;
    }

    public static DevTools getDevTools() {
        return devTools;
    }

    public static void setDevTools(DevTools devTools) {
        Context.devTools = devTools;
    }

    public static String getOS() {
        return OS;
    }

    public static void setOS(String OS) {
        Context.OS = OS;
    }

    public static ProcessInfo getDriverProcess() {
        return driverProcess;
    }

    public static void setDriverProcess(ProcessInfo driverProcess) {
        Context.driverProcess = driverProcess;
    }

    public static ConfigProvider getConfig() {
        return config;
    }

    public static void setConfig(ConfigProvider config) {
        Context.config = config;
    }

    public static Actions getActions() {
        return actions;
    }

    public static void setActions(Actions actions) {
        Context.actions = actions;
    }

    public static FluentWait getWait() {
        return wait;
    }

    public static void setWait(FluentWait wait) {
        Context.wait = wait;
    }

    public static final void createContext(ConfigProvider config){
        tempDir="";
        Context.config =config;
       // log.info("Running on {}",OS);
        int timestamp = LocalTime.now().toSecondOfDay();
        ConfigProvider var10000 = Context.config;

        Map drivers = var10000.getMap("driver-executable");

    }

    public static void closeContext() {
    }
}
