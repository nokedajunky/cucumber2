package stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BaseSetUp {

    //made it static so @before and @After can stay in this class
    private static WebDriver driver;

    //static constructor to make it work
    public static WebDriver getDriver() {
        return driver;
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://127.0.0.1/modules/prestashop/en");
    }

    @After
    public void cleanCookies() {
        driver.manage().deleteAllCookies();
        driver.close();
    }

}
