package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.SearchPage;

public class TestCase extends BaseTest{

    @Test(alwaysRun = true, enabled = true)
    public void getTitle(){
       // driver.get("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(), "Google", "Page title does not match!");
    }
    @Test(alwaysRun = true, enabled = true)
    public void checkLogo(){
       // driver.get("https://duckduckgo.com/");
        HomePage homePage = new HomePage(driver);
        homePage.checkLogo();
    }
    @Test(alwaysRun = true, enabled = true)
    public void findFirstResult(){
       // driver.get("https://duckduckgo.com/");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkFirstResult("Selenium WebDriver","https://www.selenium.dev/documentation/webdriver/");
    }
    @Test(alwaysRun = true, enabled = true)
    public void findForthResult(){
        // driver.get("https://duckduckgo.com/");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkForthResult("TestNG","TestNG Tutorial");
    }
}
