package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import page.CheckboxesPag;

import java.lang.reflect.Method;

public class Tests2 {
    RemoteWebDriver driver;
    CheckboxesPag checkboxesPag ;
    @BeforeMethod(alwaysRun = true)
    public void startDriver(){
        driver = new ChromeDriver();
        checkboxesPag = new CheckboxesPag(driver);
    }
    @AfterMethod(alwaysRun = false)
    public void closeDriver(Method method){
        driver.quit();
    }
    @Test(alwaysRun = true, enabled = false)
    public void asserCheckboxesAreChecked(){
        driver.navigate().to("http://the-internet.herokuapp.com/checkboxes");
        checkboxesPag.checkTheFirstCheckBox();
    }
    @Test(alwaysRun = true, enabled = true)
    public void asserCountryForTheCompany(){
        driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
        checkboxesPag.checkTheFirstCheckBox();
    }

}
