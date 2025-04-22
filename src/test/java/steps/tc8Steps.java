package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc8Page;

import static org.junit.Assert.assertTrue;

public class tc8Steps {
    WebDriver driver;
    tc8Page action8Page;

    public tc8Steps() {
        this.driver = Hooks.driver;
        action8Page = PageFactory.initElements(driver, tc8Page.class);
    }
    
    @Given("I am on the Action 8 page")
    public void iAmOnTheAction8Page() {
        driver.get("http://example.com/action8");
    }

    @When("I perform Action 8")
    public void iPerformAction8() {
        action8Page.performAction8();
    }

    @Then("I should see the Result 8")
    public void iShouldSeeTheResult8() {
        assertTrue(action8Page.isResult8Displayed());
    }
}