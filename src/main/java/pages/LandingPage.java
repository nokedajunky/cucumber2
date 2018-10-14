package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends BasePageObjectSetUp {


    @FindBy(xpath = ".//*[@class='login-wrapper custom-margin']")
    private WebElement buttonLogowanie;

    @FindBy(xpath = ".//*[@class='register-wrapper']")
    private WebElement buttonRejestracja;


    // calling the inherited construtor from PageObject class
    public LandingPage(WebDriver driver){
        super(driver);
    }


    public RegisterPageOne clickButtonRejestracja() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        //wait.until(ExpectedConditions.elementToBeClickable(buttonRejestracja));
        Thread.sleep(5000);
        buttonRejestracja.click();
        return new RegisterPageOne(getDriver());
    }

    public void clickButtonLogowanie() throws InterruptedException {
        //WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        //wait.until(ExpectedConditions.elementToBeClickable(buttonRejestracja));
        Thread.sleep(5000);
        buttonLogowanie.click();
    }

}
