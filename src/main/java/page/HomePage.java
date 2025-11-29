package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class HomePage extends BasePage{

    private By logo = By.xpath("//div[contains(@class, 'header_headerWrapDesktop')]//img");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void checkLogo() {
        Assert.assertTrue(getElement(logo).isDisplayed(), "DuckDuckGo logo is not displayed!");
    }
}
