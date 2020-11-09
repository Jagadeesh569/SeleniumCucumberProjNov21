Feature: This feature file is for application profile functionality

  @profile
  Scenario: Verify member can update profile on the application
    Given I am on the login page
    When I enter login credentials
    And I click on submit
    Then I am on the homepage