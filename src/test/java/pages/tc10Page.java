package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc10Page {
    private WebDriver driver;
    private By accion10Element = By.id("accion10ElementId");
    private By resultado10Element = By.id("resultado10ElementId");

    public tc10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAccion10() {
        driver.get("http://example.com");
        driver.findElement(accion10Element).click();
    }

    public boolean isResultado10Displayed() {
        return driver.findElement(resultado10Element).isDisplayed();
    }
}