package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc4Page;

public class tc4Steps {
    WebDriver driver = new ChromeDriver();
    tc4Page page = new tc4Page(driver);

    @Given("I am on the initial page")
    public void iAmOnTheInitialPage() {
        driver.get("https://example.com");
    }

    @When("I execute Action 4")
    public void iExecuteAction4() {
        page.performAction4();
    }

    @Then("I should see Resultado 4")
    public void iShouldSeeResultado4() {
        page.verifyResultado4();
        driver.quit();
    }
}