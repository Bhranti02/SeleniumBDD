Feature: Registration feature
  As a customer
  I want to register on demoNopCommerce

  @register
  Scenario: Registration with valid data
    Given I am on the home page
    And I click on register button
    When I enter Firstname "abc"
    And I enter Lastname "xyz"
    And I enter valid email on register page "bpp@yahoo.co.uk"
    And I enter password on register page "abc123"
    And  I enter valid confirm password on register page "abc123"
    And I click on REGISTER button on registration page
    Then I should see "Your registration completed" on registration page
    And I should see Log out button displayed
    And I should see text "/registerresult" in url
    

