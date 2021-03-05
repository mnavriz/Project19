Feature: Login

  Scenario: Login
    Given Open Campus homepage
    And User clicks in "loginPage"
    |GotItButton|
    And User sends key in "loginPage"
    |usernameElement|daulet2030@gmail.com|
    |passwordElement|TechnoStudy123@     |
    And User clicks in "loginPage"
    |loginButton|
    Then Verify login