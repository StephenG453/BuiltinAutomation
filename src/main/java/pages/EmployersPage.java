package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployersPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'Top talent can go anywhere.')]")
    private WebElement pageHeader;

    @FindBy(xpath = "//a[contains(text(),'Get Started')]")
    private WebElement getStartedButton;

    public EmployersPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return pageHeader.isDisplayed();
    }

    public void pressGetStartedButton() {
        getStartedButton.click();
    }
}
