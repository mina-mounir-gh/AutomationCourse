package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckboxesPag extends BasePage{
    private By firstCheckBox = By.xpath("//*[@id='checkboxes']/input[1]");

    public CheckboxesPag(WebDriver driver) {
        super(driver);
    }

    public void checkTheFirstCheckBox() {
        getElement(firstCheckBox).click();

        Assert.assertTrue(getElement(firstCheckBox).getDomProperty("checked").equals("true"), "Element not checked");
    }
}
