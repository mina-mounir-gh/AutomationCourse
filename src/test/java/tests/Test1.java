package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HomePage;
import page.SearchPage;

public class Test1 extends BaseTest{

    @Test
    public void test1(){
        driver.get("https://duckduckgo.com/");
        Assert.assertEquals(driver.getTitle(), "Google", "Page title does not match!");
    }
    @Test
    public void test2(){
        driver.get("https://duckduckgo.com/");
        HomePage homePage = new HomePage(driver);
        homePage.checkLogo();
    }
    @Test
    public void test3(){
        driver.get("https://duckduckgo.com/");
        SearchPage searchPage = new SearchPage(driver);
        searchPage.checkFirstResult("Selenium WebDriver","https://www.selenium.dev/documentation/webdriver/");
    }
}
