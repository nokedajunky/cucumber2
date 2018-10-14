package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.RegisterPageOne;

public class RegisterStepDefs {

    private WebDriver driver;
    private LandingPage landingPage;
    private RegisterPageOne registerPageOne;

    // made a constructor so the @After and @Before can stay in other class
    public RegisterStepDefs() {
        driver = BaseSetUp.getDriver();
    }

    @Given("^User navigates to the register page one$")
    public void userNavigatesToTheRegisterPageOne() throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.clickButtonRejestracja();
    }

    @When("^User submits valid credentials in register page one$")
    public void userSubmitsValidCredentialsInRegisterPageOne() throws InterruptedException {
        registerPageOne = new RegisterPageOne(driver);
        registerPageOne.clickRequiredAcceptances();
    }

    @And("^User submits valid credentials in register page two$")
    public void userSubmitsValidCredentialsInRegisterPageTwo() {
    }

    @And("^User submits valid credentials in register page three$")
    public void userSubmitsValidCredentialsInRegisterPageThree() {
    }

    @And("^User submits valid credentials in register page four$")
    public void userSubmitsValidCredentialsInRegisterPageFour() {
    }

    @Then("^confirmation message is displayed$")
    public void confirmationMessageIsDisplayed() {
    }

}
