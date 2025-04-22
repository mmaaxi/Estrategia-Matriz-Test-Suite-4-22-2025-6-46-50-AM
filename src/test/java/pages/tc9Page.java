package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc9Page {
    
    WebDriver driver;

    public tc9Page(WebDriver driver) {
        this.driver = driver;
    }

    public void action9() {
        // Implement code to perform Action 9
        WebElement actionElement = driver.findElement(By.id("action9"));
        actionElement.click();
    }

    public boolean isResult9Displayed() {
        // Implement code to verify Result 9
        WebElement resultElement = driver.findElement(By.id("result9"));
        return resultElement.isDisplayed();
    }
}