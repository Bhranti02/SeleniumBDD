package org.example.step_def;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.RegistrationPage;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RegistrationSteps extends DriverManager {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("^I click on register button$")
    public void i_click_on_register_button() throws Throwable {
        registrationPage.clickOnRegisterButtonOnHomePage();
    }

    @When("^I enter Firstname \"([^\"]*)\"$")
    public void i_enter_Firstname(String firstName) throws Throwable {
        registrationPage.enterFirstName(firstName);
    }

    @When("^I enter Lastname \"([^\"]*)\"$")
    public void i_enter_Lastname(String lastName) throws Throwable {
        registrationPage.enterLastName(lastName);
    }

    @When("^I enter valid email on register page \"([^\"]*)\"$")
    public void i_enter_valid_email_on_register_page(String email) throws Throwable {
        registrationPage.enterEmail(email);
    }

    @When("^I enter password on register page \"([^\"]*)\"$")
    public void i_enter_password_on_register_page(String password) throws Throwable {
        registrationPage.enterPassword(password);
    }

    @When("^I enter valid confirm password on register page \"([^\"]*)\"$")
    public void i_enter_valid_confirm_password_on_register_page(String password) throws Throwable {
        registrationPage.enterConfirmPassword(password);
    }

    @When("^I click on REGISTER button on registration page$")
    public void i_click_on_REGISTER_button_on_registration_page() throws Throwable {
        registrationPage.clickOnRegister();
    }

    @Then("^I should see \"([^\"]*)\" on registration page$")
    public void i_should_see_on_registration_page(String expectedRegistrationConfirmText) throws Throwable {
        String actualText = registrationPage.getRegistrationConfirmText();
        System.out.println(actualText);
        assertThat(actualText, is(equalToIgnoringCase(expectedRegistrationConfirmText)));
        System.out.println(expectedRegistrationConfirmText);
    }

    @When("^I enter following data for registration$")
    public void i_enter_following_data_for_registration(@NotNull DataTable dataTable) throws Throwable {
        // converting dataTable into map
        List<Map<String,String>> data = dataTable.asMaps(String.class, String.class);
        // To store data into map, we need to declare map using listOfMap
        System.out.println(data);
        System.out.println(dataTable);
        registrationPage.enterRegistrationDetails(
                data.get(0).get("FirstName"),
                data.get(0).get("LastName"),
                data.get(0).get("email"),
                data.get(0).get("Password"),
                data.get(0).get("ConfirmPassword")
        );
    }
}
