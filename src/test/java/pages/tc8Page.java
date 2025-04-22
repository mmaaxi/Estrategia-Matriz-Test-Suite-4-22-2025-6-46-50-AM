package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc8Page {
    WebDriver driver;

    @FindBy(id = "action8Button")
    WebElement action8Button;

    @FindBy(id = "result8")
    WebElement result8;

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction8() {
        action8Button.click();
    }

    public boolean isResult8Displayed() {
        return result8.isDisplayed();
    }
}