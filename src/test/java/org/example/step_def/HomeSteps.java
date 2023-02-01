package org.example.step_def;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.HomePage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HomeSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    HomePage homePage = new HomePage(); // creating object of homepage, so we can use homepage method and variables in home steps

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        String actualUrl = getURL();  // by using extend keyword
        System.out.println(actualUrl);
        assertThat(actualUrl, is(endsWith("nopcommerce.com/")));

        //        validation through title
        String actualTitle = driverManager.getTitle();  // by creating object of driverManager
        System.out.println(actualTitle);
        assertThat(actualTitle, is(equalToIgnoringCase("nopCommerce demo store")));

       // validation through text from home page
        String actualTextOnHomePage = homePage.getTextFromHomePage();
        System.out.println(actualTextOnHomePage);
        assertThat(actualTextOnHomePage, is(equalToIgnoringCase("Welcome to our store")));
    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        homePage.clickOnLoginButtonOnHomePage();

    }

    @When("^I click on  contact us button on home page$")
    public void i_click_on_contact_us_button_on_home_page() throws Throwable {
        homePage.clickOnContactUsButtonOnHomePage();
    }
}
