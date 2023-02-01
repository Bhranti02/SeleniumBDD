package org.example.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.LoginPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class LoginSteps extends DriverManager {
    LoginPage loginPage = new LoginPage();

    @Then("^I should see \"([^\"]*)\" text on the login page$")
    public void i_should_see_text_on_the_login_page(String expectedWelcomeTextOnLoginPage) throws Throwable { //expected text from feature file
        String actualWelcomeText = loginPage.getWelcomeTextFromLoginPage();  //we will get actual text via selenium
        System.out.println(actualWelcomeText);
        System.out.println(expectedWelcomeTextOnLoginPage);
        assertThat(actualWelcomeText, is(equalToIgnoringCase(expectedWelcomeTextOnLoginPage)));  // comparw both text

    }

    @And("^I should see text \"([^\"]*)\" in url$")
    public void iShouldSeeTextInUrl(String expectedUrlText) throws Throwable {   //expected Url from feature file
        String actualUrl = getURL();   // via selenium
        System.out.println(actualUrl);
        assertThat(actualUrl, containsString(expectedUrlText));
    }

    @When("^I enter valid email \"([^\"]*)\"$")
    public void i_enter_valid_email(String email) throws Throwable {
        loginPage.enterEmail(email);
    }


    @When("^I enter valid password \"([^\"]*)\"$")
    public void i_enter_valid_password(String password) throws Throwable {
        loginPage.enterPassword(password);
    }


    @When("^I click on login button on login page$")
    public void i_click_on_login_button_on_login_page() throws Throwable {
        loginPage.clickOnLoginButtonOnLoginPage();
    }

    @Then("^I should see Log out button displayed$")
    public void i_should_see_Log_out_button_displayed() throws Throwable {
      boolean logoutButtonIsDisplayed = loginPage.checkLogoutButtonIsDisplayed();
      assertThat(logoutButtonIsDisplayed,is(true));
    }

    @Then("^I should see My Account button displayed$")
    public void i_should_see_My_Account_button_displayed() throws Throwable {
        boolean myAccountButtonIsDisplayed = loginPage.checkMyAccountButtonIsDisplayed();
        assertThat(myAccountButtonIsDisplayed, is(true));
    }
}

