package stepDef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RegistrationPage;

public class Register extends RegistrationPage {
    @When("user clicks on register link")
    public void user_clicks_on_register_link() {
        click_register_link();
    }

//    @When("user enters email address, title, firstname, lastname, password, confirm password")
//    public void user_enters_email_address_title_firstname_lastname_password_confirm_password() {
//
//    }
//
//    @When("user clicks on register button")
//    public void user_clicks_on_register_button() {
//
//    }
//
//    @Then("user successfully able to login to the website")
//    public void user_successfully_able_to_login_to_the_website() {
//
//    }
}
