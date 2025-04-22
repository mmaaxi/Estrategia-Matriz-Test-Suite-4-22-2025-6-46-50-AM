package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc10Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc10Steps {
    private WebDriver driver = new ChromeDriver();
    private tc10Page page = new tc10Page(driver);

    @Given("I perform Acción 10")
    public void performAccion10() {
        page.performAccion10();
    }

    @Then("I should see Resultado 10")
    public void verifyResultado10() {
        Assert.assertTrue(page.isResultado10Displayed());
        driver.quit();
    }
}