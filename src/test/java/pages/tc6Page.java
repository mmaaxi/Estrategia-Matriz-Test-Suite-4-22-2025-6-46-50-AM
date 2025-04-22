package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc6Page {
    WebDriver driver;

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    public void accion6() {
        // Implementación específica de Acción 6
        WebElement elemento = driver.findElement(By.id("acción6"));
        elemento.click();
    }

    public boolean esResultado6Visible() {
        // Verificar que el resultado 6 es visible
        WebElement resultado = driver.findElement(By.id("resultado6"));
        return resultado.isDisplayed();
    }
}