package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.EmployersPage;
import pages.WebDriverInitiation;

public class HomePageStepDefinitions {

    protected static WebDriver driver;

    WebDriverInitiation webDriverInitiation;
    private HomePage homePage;
    private EmployersPage employersPage;

    @Given("builtin.com is loaded and home page is visible")
    public void initializeDriverAndOpenBuiltIn() {
        webDriverInitiation = new WebDriverInitiation(driver);
        webDriverInitiation.initialize();
        webDriverInitiation.loadWebPage();

        driver = webDriverInitiation.driver;
        homePage = new HomePage(driver);
        Assertions.assertTrue(homePage.isAtHomePage());

        //
    }

    @When("user clicks post job button")
    public void userClicksPostJobButton() {
//        homePage = new HomePage();
        homePage.clickPostJobButton();
    }

    @Then("job post page is displayed")
    public void jobPostPageIsDisplayed() {
        employersPage = new EmployersPage(driver);
        Assertions.assertTrue(employersPage.isAt());

//        webDriverInitiation.cleanUp();
    }
}
