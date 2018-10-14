package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.windows.ThemeReader;

public class RegisterPageOne extends BasePageObjectSetUp {

    @FindBy (name ="acceptances.00000000-0000-0000-0000-000000000007")
    private WebElement checkboxAcceptanceOne;

    @FindBy (name ="acceptances.00000000-0000-0000-0000-000000000002")
    private WebElement checkboxAcceptanceTwo;

    @FindBy (name ="acceptances.00000000-0000-0000-0000-000000000003")
    private WebElement checkboxAcceptanceThree;

    @FindBy (className = "btn btn-default")
    private WebElement buttonDalej;


    public RegisterPageOne(WebDriver driver) {
        super(driver);
    }

    public void clickRequiredAcceptances() throws InterruptedException {
        Thread.sleep(7000);
        checkboxAcceptanceOne.click();
        checkboxAcceptanceTwo.click();
        checkboxAcceptanceThree.click();
    }
}
