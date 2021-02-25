Feature: Creating,updating and deleting an employee

    Background:
      Given Click on Human Resources
      And   Click on Employees



  Scenario: Create an employee with the min required info

    And   Click ond Add Employee Button
    When Enter "<First Name>"
      | First Name | Mustafa |
    And   Enter "<Last Name>"
      | Last Name | Navriz |
    And   Enter "<Employee ID>"
      | Employee ID | 112233 |
    And   Choose Document Type
    And   Enter "<Document Number>"
      | Document Number | 445566 |
    Then  Click on save button
    And   Verify <status>
      |status|Employee successfully created|



  Scenario Outline: Update the employee who just created

      And   Enter "Mustafa"
      And   Click on Status
      And   Click on update button
      Then  Update "<First Name>"
      And   Update "<Last Name>"
      And   Update "<Employee ID>"
      Then  Click on save button
      And   Confirm
      And   Verify "<status>"

      Examples:
        | First Name | Last Name | Employee ID | status                        |
        | Afatsum    |           |             | Employee successfully updated |
        |            | Zirvan    |             | Employee successfully updated |
        |            |           | 332211      | Employee successfully updated |




  Scenario Outline: Delete the employee we have updated

      And   Enter "Afatsum"
      And   Click on Status
      Then  Click on delete button
      And   Confirm
      And   Verify "<status>"

      Examples:
        | status                        |
        | Employee successfully deleted |



