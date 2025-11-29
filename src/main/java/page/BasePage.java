package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    protected WebDriver driver ;
    public int timeOut = 4;


    // create constructor
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    protected WebElement getElement(By by){
        waitUntilVisible(by);
        return driver.findElement(by);
    }
    protected  void waitUntilVisible(By by){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        wait.until(d -> driver.findElement(by).isDisplayed());
    }
    protected  void setText(By by, String value) {
        waitUntilVisible(by);
        getElement(by).sendKeys(value);
    }
    protected void keyPressEnter(By by) {
        getElement(by).sendKeys(Keys.ENTER);
    }
    protected WebElement getElementByText(String text) {
        By by = By.xpath("//*[contains(text(), '" + text + "')]");
        waitUntilVisible(by);
        return getElement(by);
    }
}
