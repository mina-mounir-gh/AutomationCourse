package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.lang.reflect.Method;
public class BaseTest {
    RemoteWebDriver driver;

    @Parameters({"browser"})
    @BeforeMethod(alwaysRun = true)
    public void startDriver(@Optional("chrome") String browserName){
        if(browserName.equals("firefox")) {
            driver = new FirefoxDriver();
        }else if (browserName.equals("chrome")) {
            driver = new ChromeDriver();
        }
        driver.get("https://duckduckgo.com/");
    }
   @AfterMethod(alwaysRun = true)
    public void closeDriver(Method method){
        driver.quit();
    }

}
