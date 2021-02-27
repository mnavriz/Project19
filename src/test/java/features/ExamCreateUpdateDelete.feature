Feature: Creating, updating and deleting an Entrance Exam

  Background:
    Given Click on Entrance Exam
    And   Click on Setup submenu
    And   Click on Entrance Exam under Setup

  Scenario: Create an Entrance Exam
    When Click on Add on Exam button
    And  Enter Name "XYExam"
    And  Click and Choose Academic Period
    And  Click and Choose Grade Level
    Then Click on save button
    And Verify <status>
      |status|Exam successfully created|

    Scenario Outline: Update just created Exam
      When Search for "XYExam" and search
      And  Click on update button
      And Update Name "<Name>"
      And Click and Update Academic Period
      And Click and Update Grade Level
      Then Click on save button
      And Verify "<status>"
      Examples:
        | Name | status |
        |XXExam|Exam successfully updated|

      Scenario: Delete juts updated Exam
        When Search for "XXExam" and search
        And  Click on delete button and Confirm
        And Verify <status>
          |status|Exam successfully deleted|








