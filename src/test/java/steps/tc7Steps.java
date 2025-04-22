package steps;

import pages.tc7Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc7Steps {
    tc7Page page = new tc7Page();

    @Given("I perform Action 7")
    public void i_perform_action_7() {
        page.performAction7();
    }

    @Then("I should see Resultado 7")
    public void i_should_see_resultado_7() {
        assertTrue(page.isResultado7Displayed());
    }
}