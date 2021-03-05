Feature: Creating,updating and deleting an employee


    Scenario:Login to the page
      Given Open Campus homepage
      And User clicks in "loginPage"
        |GotItButton|
      And User sends key in "loginPage"
        |usernameElement|daulet2030@gmail.com|
        |passwordElement|TechnoStudy123@     |
      And User clicks in "loginPage"
        |loginButton|
      Then Verify login






  Scenario: Create an employee with the min required info

    Given User clicks in "leftMenu"
      |HumanResourcesMenu|
      |Employees|
    And User waits "2" seconds
    And User clicks in "employees"
      |addEmployeeButton|
    When User sends key in "employee"
     | FirstName  | Mustafa |
     | LastName   | Navriz  |
     | EmployeeID | 112233  |
     | DocumentNumber | 445566  |
    And User clicks in "employee"
    |DocumentType|
    And User selects randomly from list of WebElements in "employee"
    |ListDocumentType|
    Then User clicks in "employee"
      |SaveButton|
    And Verify in "employee"
   |Message |Employee successfully created |




  Scenario: Update the employee who just created
      Given User clicks in "leftMenu"
        |HumanResourcesMenu|
        |Employees|
    And User clicks in "employee"
    |ItemPerPage|
    And User selects Max Value from dropdown in "employee"
    |ItemsPerPageOption|
    And User handles table in "employee"
      |namelist|Mustafa|Edit|
    When User sends key in "employee"
      | FirstName  | afatsum |
      | LastName   | Zirvan  |
      | EmployeeID | 55555 |
    Then User clicks in "employee"
      |SaveButton|
    And Verify in "employee"
      |Message |Employee successfully updated |







  Scenario: Delete the employee we have updated

    Given User clicks in "leftMenu"
      | HumanResourcesMenu |
      | Employees          |
    And   User sends key in "employees"
      | FirstNameSearch | Afatsum |
    And User clicks in "employees"
      | SearchButton         |
      | DeleteEmployeeButton |
      |confirmYesButton      |
    And Verify in "employee"
      |Message |Employee successfully deleted |










