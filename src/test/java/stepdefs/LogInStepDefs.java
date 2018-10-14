package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import pages.LandingPage;
import pages.RegisterPageOne;

public class LogInStepDefs {

    private WebDriver driver;
    private LandingPage landingPage;


    // made a constructor so the @After and @Before can stay in other class
    public LogInStepDefs() {
        driver = BaseSetUp.getDriver();
    }

    @Given("^User navigates to the LogInPage$")
    public void userNavigatesToTheLogInPage() throws InterruptedException {
        landingPage = new LandingPage(driver);
        landingPage.clickButtonLogowanie();

    }

    @When("^User submits valid credentials in LogInPage$")
    public void userSubmitsValidCredentialsInLogInPage() {
    }

    @Then("^User panel is available$")
    public void userPanelIsAvailable() {

    }
}
