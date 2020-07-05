package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='block block-builtin-frontpage-trending-articles']//div[@class='block-content']//div[1]")
    private WebElement welcomeText;

    @FindBy(xpath = "//a[@class='employers']")
    private WebElement postJobButton;

    @FindBy(xpath = "//a[@class='frontpage-sign-up-cta']")
    private WebElement communitySignUpButton;

    public HomePage(WebDriver driver) {
        super(driver);
        driver.get("https://builtin.com/");
    }

    public boolean isAtHomePage() {
        return welcomeText.isDisplayed();
    }

    public void clickPostJobButton() {
        postJobButton.click();
    }

    public void clickCommunitySignUpButton() {
        communitySignUpButton.click();
    }
}