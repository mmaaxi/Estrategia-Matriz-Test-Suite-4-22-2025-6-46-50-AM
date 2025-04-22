package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.tc1Page;

import static org.junit.Assert.assertTrue;

public class tc1Steps {
    WebDriver driver;
    tc1Page page;

    @Given("I perform Action 1")
    public void i_perform_action_1() {
        // Initialize browser
        driver = new ChromeDriver();
        driver.get("http://example.com");

        // Initialize Page Object
        page = new tc1Page(driver);

        // Perform Action 1
        page.performAction1();
    }

    @Then("I should see Resultado 1")
    public void i_should_see_resultado_1() {
        // Validate Resultado 1
        assertTrue(page.isResultado1Displayed());

        // Close the browser
        driver.quit();
    }
}