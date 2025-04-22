package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc3Page;

public class tc3Steps {
    WebDriver driver;
    WebDriverWait wait;
    tc3Page page;

    public tc3Steps() {
        // Initialize WebDriver and WebDriverWait here
        // driver = ...
        // wait = ...
        page = new tc3Page(driver, wait);
    }

    @Given("I perform Action 3")
    public void iPerformAction3() {
        page.performAction3();
    }

    @Then("I should see Result 3")
    public void iShouldSeeResult3() {
        page.verifyResult3();
    }
}