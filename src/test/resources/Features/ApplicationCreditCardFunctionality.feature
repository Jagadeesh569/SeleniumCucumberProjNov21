Feature: This feature file is for credit card functionality

  @creditcard
  Scenario: Verify member can access credit card functions
    Given I am on the login page
    When I enter login credentials
    And I click on submit
    Then I am on the homepage