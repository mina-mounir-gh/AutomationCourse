package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.SearchPage;

public class TestCase extends BaseTest{

    @Test(alwaysRun = true, enabled = true)
    public void getTitle(){
        Assert.assertEquals(driver.getTitle(), "Google", "Page title does not match!");
    }
    @Test(alwaysRun = true, enabled = true)
    public void checkLogo(){
        HomePage homePage = new HomePage(driver);
        homePage.checkLogo();
    }
    @Test(alwaysRun = true, enabled = true)
    public void findFirstResult(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkFirstResult("Selenium WebDriver","https://www.selenium.dev/documentation/webdriver/");
    }
    @Test(alwaysRun = true, enabled = true)
    public void findForthResult(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkForthResult("TestNG Tutorial");
    }
    @Test(alwaysRun = true, enabled = true)
    public void findSecondResult(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkSecondResult("Cucumber IO","https://www.linkedin.com");
    }
}
