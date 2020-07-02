package stepDefinitions;

import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.EmployersPage;
import pages.WebDriverInitiation;

public class JobPostPageDefinitions {

    private WebDriver driver;
    private WebDriverInitiation webDriverInitiation;
    private EmployersPage employersPage;

    @When("get started button is pressed")
    public void userClickGetStartedButton() {
//        this.driver = super.driver;   //wont work cause webDriverInitiation is null

//        webDriverInitiation = new WebDriverInitiation(driver);
//        webDriverInitiation.initialize();

        this.driver = HomePageStepDefinitions.driver;

        employersPage = new EmployersPage(driver);
//        driver = webDriverInitiation.driver;

//        jobPostPage = new JobPostPage(driver);
        employersPage.pressGetStartedButton();
    }

}
