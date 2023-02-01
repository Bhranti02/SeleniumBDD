package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.ContactUsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ContactUsSteps extends DriverManager {

    ContactUsPage contactUsPage = new ContactUsPage();


    @Then("^I should see \"([^\"]*)\" is visible on contact us page$")
    public void i_should_see_is_visible_on_contact_us_page(String expectedContactUsConfirmText) throws Throwable {
        String actualText = contactUsPage.getContactUsTextOnContactUsPage();
        System.out.println(actualText);
        assertThat(actualText, is(equalToIgnoringCase(expectedContactUsConfirmText)));
        System.out.println(expectedContactUsConfirmText);

    }





}
