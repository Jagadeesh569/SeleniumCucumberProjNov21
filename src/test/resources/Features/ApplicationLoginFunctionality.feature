Feature: This feature file is for application login functionality
  
  @login
  Scenario: Verify member can login to application
    Given I am on the login page
    When I enter login credentials
    And I click on submit
    Then I am on the homepage