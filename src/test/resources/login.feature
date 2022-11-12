@login
Feature: login feature
  As a customer
  I want to login to the login functionality to check my login details

  Scenario: Login with valid credential
    Given I am on the home page
    When I click on login button
    Then i should see "Welcome, Please Sign In!" text on the login page

