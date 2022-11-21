package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;

public class RegistrationSteps extends DriverManager {

     RegistrationPage registrationPage = new RegistrationPage();

    @Given("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
    }

    @When("^I enter Firstname \"([^\"]*)\"$")
    public void i_enter_Firstname(String arg1) throws Throwable {
    }

    @When("^I enter Lastname \"([^\"]*)\"$")
    public void i_enter_Lastname(String arg1) throws Throwable {
    }

    @When("^I enter valid email on register page \"([^\"]*)\"$")
    public void i_enter_valid_email_on_register_page(String arg1) throws Throwable {
    }

    @When("^I enter password on register page \"([^\"]*)\"$")
    public void i_enter_password_on_register_page(String arg1) throws Throwable {
    }

    @When("^I enter valid confirm password on register page \"([^\"]*)\"$")
    public void i_enter_valid_confirm_password_on_register_page(String arg1) throws Throwable {
    }

    @When("^I click on REGISTER button on registration page$")
    public void i_click_on_REGISTER_button_on_registration_page() throws Throwable {
    }

    @Then("^I should see \"([^\"]*)\" on registration page$")
    public void i_should_see_on_registration_page(String arg1) throws Throwable {
    }

}
