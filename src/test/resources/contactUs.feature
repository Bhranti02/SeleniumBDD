Feature: Contact Us
  As a customer
  I want to use contact us feature

  @contactUs
  Scenario: Validate contact us button
    Given I am on the home page
    When I click on  contact us button on home page
    Then I should see "Contact Us" is visible on contact us page
    And I should see text "/contactus" in url
