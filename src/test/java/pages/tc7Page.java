package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc7Page {
    WebDriver driver;

    By action7Element = By.id("action7");
    By resultado7Element = By.id("resultado7");

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction7() {
        WebElement element = driver.findElement(action7Element);
        element.click();
    }

    public boolean isResultado7Displayed() {
        return driver.findElement(resultado7Element).isDisplayed();
    }
}