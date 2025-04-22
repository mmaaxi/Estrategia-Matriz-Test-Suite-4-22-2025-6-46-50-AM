package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc1Page {
    WebDriver driver;

    By resultado1 = By.id("resultado1");

    public tc1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction1() {
        // Implement the logic to perform Action 1
        WebElement actionElement = driver.findElement(By.id("action1"));
        actionElement.click();
    }

    public boolean isResultado1Displayed() {
        // Verify the expected result
        WebElement resultadoElement = driver.findElement(resultado1);
        return resultadoElement.isDisplayed();
    }
}