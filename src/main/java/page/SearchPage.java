package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPage extends BasePage{

    private By search = By.xpath("//*[@id='searchbox_input']");
    private By firstResult = By.xpath("//span[text()='WebDriver - Selenium']//ancestor::a");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void search(String txt) {
        setText(search,txt);

    }
    public void checkFirstResult(String txt, String url) {
        setText(search,txt);
        keyPressEnter(search);
        Assert.assertEquals(getElement(firstResult).getAttribute("href"),url);
    }

}
