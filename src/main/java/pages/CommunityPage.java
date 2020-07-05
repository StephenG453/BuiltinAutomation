package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommunityPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Join Us')]")
    private WebElement pageHeader;

    public CommunityPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAt() {
        return pageHeader.isDisplayed();
    }
}
