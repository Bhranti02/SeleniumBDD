@regression
Feature: Login feature
  As a customer
  I want to login to the login functionality to check my login details

  Background:
    Given I am on the home page


  @validation
  Scenario: Validate login page
    And I click on register button
    When I enter Firstname "abc"
    And I enter Lastname "xyz"
    And I enter valid email on register page "bpp@yahoo.co.uk"
    And I enter password on register page "abc123"
    And  I enter valid confirm password on register page "abc123"
    And I click on REGISTER button on registration page
    And I should see text "/register" in url
    And I click on login button
    Then I should see "Welcome, Please Sign In!" text on the login page
    And I should see text "/login" in url

  @login
  Scenario Outline: Login with valid credential
    When I click on login button
    And I enter valid email "<emailid>"
    And I enter valid password "<password>"
    And I click on login button on login page
    Then I should see Log out button displayed
    Then I should see My Account button displayed
    Examples:
      | emailid          | password |
      | bpp@yahoo.co.uk  | abc123   |
      | bpp1@yahoo.co.uk | 123456   |
      | bpp2@yahoo.co.uk | 123abc   |
      | bpp3@yahoo.co.uk | abcxyz   |


#  Scenario: Validate my account details after login

#  Scenario: Login with empty credential


#  Scenario: Login with invalid credential


