Feature: Login feature
  As a customer
  I want to login to the login functionality to check my login details

  Background:
    Given I am on the home page
    When I click on login button

  @validation
  Scenario: Validate login page
    Then I should see "Welcome, Please Sign In!" text on the login page
    And I should see text "/login" in url

  @login
  Scenario: Login with valid credential
    And I enter valid email "bpp@yahoo.co.uk"
    And I enter valid password "abc123"
    And I click on login button on login page
    Then I should see Log out button displayed
    Then I should see My Account button displayed

  Scenario: Validate my account details after login


  Scenario: Login with empty credential


  Scenario: Login with invalid credential


