@regression
Feature: Registration feature
  As a customer
  I want to register on demoNopCommerce

  @register
  Scenario: Registration with valid data once
    Given I am on the home page
    And I click on register button
    When I enter Firstname "abc"
    And I enter Lastname "xyz"
    And I enter valid email on register page "bpp@yahoo.co.uk"
    And I enter password on register page "abc123"
    And  I enter valid confirm password on register page "abc123"
    And I click on REGISTER button on registration page
#    Then I should see "Your registration completed" on registration page
    And I should see text "/register" in url

  @123
  Scenario:  Registration with valid data table
    Given I am on the home page
    And I click on register button
    When I enter following data for registration
      | FirstName | LastName | email            | Password | ConfirmPassWord |
      | abc       | xyz      | abce@yahoo.co.uk | ABC123   | ABC123          |
#      When I enter Firstname "abc"
#      And I enter Lastname "xyz"
#      And I enter valid email on register page "bpp@yahoo.co.uk"
#      And I enter password on register page "abc123"
#      And  I enter valid confirm password on register page "abc123"
    And I click on REGISTER button on registration page
#    Then I should see "Your registration completed" on registration page
    And I should see text "/register" in url

    @456
  Scenario Outline:  Registration with valid data table and outline
    Given I am on the home page
    And I click on register button
    When I enter following data for registration
      | FirstName   | LastName   | email   | Password   | ConfirmPassWord   |
      | <1stName> | <lastName> | <myEmail> | <myPassword> | <myConfirmPassWord> |
#      When I enter Firstname "abc"
#      And I enter Lastname "xyz"
#      And I enter valid email on register page "bpp@yahoo.co.uk"
#      And I enter password on register page "abc123"
#      And  I enter valid confirm password on register page "abc123"
    And I click on REGISTER button on registration page
#    Then I should see "Your registration completed" on registration page
    And I should see text "/register" in url
    Examples:
      | 1stName | lastName | myEmail          | myPassword | myConfirmPassWord |
      | abc     | xyz      | abc@yahoo.co.uk  | ABC123     | ABC123            |
      | abc1    | xyz1     | abc1@yahoo.co.uk | ABC123     | ABC123            |
      | abc2    | xyz2     | abc2@yahoo.co.uk | ABC123     | ABC123            |
      | abc3    | xyz3     | abc3@yahoo.co.uk | ABC123     | ABC123            |
      | abc4    | xyz4     | abc4@yahoo.co.uk | ABC123     | ABC123            |