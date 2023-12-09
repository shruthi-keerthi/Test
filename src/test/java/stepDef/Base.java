package stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.BasePage;

public class Base extends BasePage {
    @Given("user navigates to tkmaxx website")
    public void user_navigates_to_tkmaxx_website() {
        basePage();
    }
    @When("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        click_signUp();
    }

}
