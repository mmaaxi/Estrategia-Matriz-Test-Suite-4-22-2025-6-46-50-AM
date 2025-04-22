package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc4Page {
    WebDriver driver;

    By action4Element = By.id("action4ElementId");
    By resultado4Element = By.id("resultado4ElementId");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction4() {
        WebElement element = driver.findElement(action4Element);
        element.click();
    }

    public void verifyResultado4() {
        WebElement element = driver.findElement(resultado4Element);
        if (!element.isDisplayed()) {
            throw new AssertionError("Resultado 4 is not displayed");
        }
    }
}