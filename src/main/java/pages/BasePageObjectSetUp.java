package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/*

Page Object class. Initializing Page Objects. Others classes need to inherite this class and call constructor via "super"

*/

public class BasePageObjectSetUp {

    private WebDriver driver;

    public BasePageObjectSetUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
