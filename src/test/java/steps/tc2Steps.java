import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc2Steps {

    WebDriver driver;
    tc2Page page;

    public tc2Steps() {
        // Inicializar el WebDriver y el Page Object
        this.driver = new WebDriverSetup().getDriver();
        page = PageFactory.initElements(driver, tc2Page.class);
    }

    @Given("el usuario está en la página inicial")
    public void el_usuario_está_en_la_página_inicial() {
        // Lógica para asegurarse que el usuario esté en la página inicial
        driver.get("URL_DE_LA_PAGINA_INICIAL");
    }

    @When("el usuario realiza Acción 2")
    public void el_usuario_realiza_acci_n_2() {
        // Lógica para realizar Acción 2
        page.realizarAccion2();
    }

    @Then("el Resultado 2 es mostrado")
    public void el_resultado_2_es_mostrado() {
        // Lógica para verificar que el Resultado 2 es mostrado
        assert(page.verificarResultado2());
    }
}