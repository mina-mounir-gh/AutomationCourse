package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.SearchPage;

public class TestCase extends BaseTest{

    @Test(alwaysRun = true)
    public void test1(){
       // driver.get("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(), "Google", "Page title does not match!");
    }
    @Test(alwaysRun = true)
    public void test2(){
       // driver.get("https://duckduckgo.com/");
        HomePage homePage = new HomePage(driver);
        homePage.checkLogo();
    }
    @Test(alwaysRun = true)
    public void test3(){
       // driver.get("https://duckduckgo.com/");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkFirstResult("Selenium WebDriver","https://www.selenium.dev/documentation/webdriver/");
    }
}
