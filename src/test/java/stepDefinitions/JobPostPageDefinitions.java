package stepDefinitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EmployersPage;
import pages.BasePage;

public class JobPostPageDefinitions {

    private WebDriver driver;
    private EmployersPage employersPage;

    @When("get started button is pressed")
    public void userClickGetStartedButton() {

        employersPage = new EmployersPage(driver);

        employersPage.pressGetStartedButton();
    }
}
