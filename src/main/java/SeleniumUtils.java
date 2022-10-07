import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.Logger;

import static support.automationcore.Context.getDriver;
import static support.automationcore.Context.wait;

public class SeleniumUtils implements Loggable {


    public static boolean ELEMENT_NO_WAIT = true;
    public static boolean ELEMENT_DO_WAIT = false;

    /**
     * Open the Url of the page to start the method chain
     * Example: thePage.open(myUrl).getElement(button).click();
     * @param url URL to be opened
     ** @param <T> Class to return, descending from page
     * @return Instance of page or derived class for method chaining
     */
    public<T extends SeleniumUtils> T openUrl(String url){
        log().debug("Going to page at '{}'",url);
        getDriver().get(url);
        return (T) this;
    }

    /**
     * Wait for the element of the page to be visible
     * Example: thePage.waitForVisible(the locator).click();
     * Explicit wait of Selenium
     * @param locator Selenium locator
     * @param <T> Class to return, descending from page
     * @return Instance of page or derived class for method chaining
     */
    public <T extends SeleniumUtils> T waitForVisible(By locator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
        log().debug("Waiting for element located bt {} to be visible",locator);
        return (T) this;
    }

    public <T extends SeleniumUtils> T clickViaJs(By locator) {
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].click()",this.getElement(locator));

        return (T) this;
    }

    public WebElement getElement(By locator, boolean... dontWait) {
            if((dontWait.length > 0) && dontWait[0])
                this.waitForVisible(locator);
        return getDriver().findElement(locator);
    }


    }



