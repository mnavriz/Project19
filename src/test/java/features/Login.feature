Feature: Login

  Scenario: Login
    Given Open Campus homepage
    And Enter username
    And Enter password
    When Click on login button
    Then Verify login