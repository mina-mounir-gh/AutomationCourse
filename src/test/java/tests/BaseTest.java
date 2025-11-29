package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;
import java.lang.reflect.Method;
public class BaseTest {
    RemoteWebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void startDriver(){
        driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
    }
   @AfterMethod(alwaysRun = true)
    public void closeDriver(Method method){
        driver.quit();
    }

}
