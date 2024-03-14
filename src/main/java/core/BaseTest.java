package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    WebDriver driver;
    @BeforeSuite
    public void beforeSuite(){
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void afterSuite(){
        if(null != driver){
            driver.close();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
