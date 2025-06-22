Feature: Login functionality

  Scenario: Valid user login
    Given I navigate to the login page
    When I enter valid credentials
    Then I should be logged in successfully