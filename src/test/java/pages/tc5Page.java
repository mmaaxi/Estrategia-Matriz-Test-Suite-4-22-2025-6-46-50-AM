package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tc5Page {

    WebDriver driver;
    WebDriverWait wait;

    By action5Button = By.id("action5Button");
    By resultado5 = By.id("resultado5Text");

    public tc5Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    public void navigateToInitialPage() {
        driver.get("http://example.com/initialPage");
    }

    public void performAction5() {
        WebElement button = wait.until(ExpectedConditions.elementToBeClickable(action5Button));
        button.click();
    }

    public boolean isResultado5Displayed() {
        WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(resultado5));
        return result.isDisplayed();
    }
}