Feature: This feature file is for application dashboard functionality

  @dashboard
  Scenario: Verify member can access dashboard of application
    Given I am on the login page
    When I enter login credentials
    And I click on submit
    Then I am on the homepage