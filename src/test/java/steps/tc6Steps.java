package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc6Page;

public class tc6Steps {
    WebDriver driver = new ChromeDriver();
    tc6Page page = new tc6Page(driver);

    @Given("el usuario realiza Acción 6")
    public void el_usuario_realiza_Accion_6() {
        driver.get("URL_DE_LA_APLICACIÓN");
        page.accion6();
    }

    @Then("debería ver Resultado 6")
    public void deberia_ver_Resultado_6() {
        Assert.assertTrue(page.esResultado6Visible());
        driver.quit();
    }
}