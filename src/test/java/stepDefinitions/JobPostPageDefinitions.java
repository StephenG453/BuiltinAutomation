package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.JobPostPage;
import pages.WebDriverInitiation;

public class JobPostPageDefinitions {

    private WebDriver driver;
    private WebDriverInitiation webDriverInitiation;
    private JobPostPage jobPostPage;

    @When("get started button is pressed")
    public void userClickGetStartedButton() {
//        this.driver = super.driver;   //wont work cause webDriverInitiation is null

//        webDriverInitiation = new WebDriverInitiation(driver);
//        webDriverInitiation.initialize();

        this.driver = HomePageStepDefinitions.driver;

        jobPostPage = new JobPostPage(driver);
//        driver = webDriverInitiation.driver;

//        jobPostPage = new JobPostPage(driver);
        jobPostPage.pressGetStartedButton();
    }

}
