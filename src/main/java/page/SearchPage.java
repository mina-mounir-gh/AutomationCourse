package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchPage extends BasePage{

    private By search = By.xpath("//*[@id='searchbox_input']");
    private By firstResult = By.xpath("//span[text()='WebDriver - Selenium']//ancestor::a");
    private By forthResult = By.xpath("//*[@id='r1-3']//span[contains(text(),'TestNG')]");
    private By secondResult = By.xpath("//article[@id='r1-1']//span[contains(text(),'cucumber')]/ancestor::a");
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
    public void checkForthResult(String txt, String resultTxt) {
        setText(search,txt);
        keyPressEnter(search);
        Assert.assertTrue(getElement(forthResult).getText().contains(resultTxt), "Text does not match");
    }
    public void checkSecondResult(String txt, String url) {
        setText(search,txt);
        keyPressEnter(search);
        Assert.assertEquals(getElement(secondResult).getAttribute("href"),url);
    }
}
