package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc5Page;

public class tc5Steps {

    tc5Page page = new tc5Page();

    @Given("the user is on the initial page")
    public void the_user_is_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("the user performs Action 5")
    public void the_user_performs_action_5() {
        page.performAction5();
    }

    @Then("the user should see Resultado 5")
    public void the_user_should_see_resultado_5() {
        Assert.assertTrue("Resultado 5 is not displayed", page.isResultado5Displayed());
    }
}