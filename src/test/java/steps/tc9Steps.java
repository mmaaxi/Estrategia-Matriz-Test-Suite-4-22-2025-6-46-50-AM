package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.tc9Page;

public class tc9Steps {

    tc9Page page;

    public tc9Steps() {
        page = new tc9Page();
    }

    @Given("^I perform Action 9$")
    public void performAction9() {
        page.action9();
    }

    @Then("^I should see the Result 9$")
    public void verifyResult9() {
        Assert.assertTrue("Result 9 is not displayed", page.isResult9Displayed());
    }
}