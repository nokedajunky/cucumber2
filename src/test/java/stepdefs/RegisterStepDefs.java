package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;

public class RegisterStepDefs {

    private LandingPage landingPage = new LandingPage(driver);

    @Given("^User navigates to the register page one$")
    public void userNavigatesToTheRegisterPageOne() throws InterruptedException {
        landingPage.clickButtonRejestracja();
    }

    @When("^User submits valid credentials in register page one$")
    public void userSubmitsValidCredentialsInRegisterPageOne() {
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
