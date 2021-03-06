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




  Scenario Outline: Update the employee who just created
      Given User clicks in "leftMenu"
        |HumanResourcesMenu|
        |Employees|
  And   User sends key in "employees"
        | FirstNameSearch  | <Name to search> |


    And User clicks in "employees"
      |SearchButton|
      |EditEmployeeButton|
    When User sends key in "employee"
      | FirstName  | <First Name> |
      | LastName   | <Last Name>  |
      | EmployeeID | <Employee ID>  |
    Then User clicks in "employee"
      |SaveButton|
    And Verify in "employee"
      |Message |Employee successfully updated |

    Examples:
      | Name to search | First Name | Last Name | Employee ID |
      | Mustafa        | Afatsum    | Zirva     | 009988      |
      #| Afatsum        | First Name | Zirvan    | Employee ID |
     # | First Name     | First Name | Last Name | 445566      |

      #And   Verify





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










