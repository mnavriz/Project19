Feature: Creating, updating and deleting an Entrance Exam

  Scenario:Login to the page
    Given Open Campus homepage
    And User clicks in "loginPage"
      | GotItButton |
    And User sends key in "loginPage"
      | usernameElement | daulet2030@gmail.com |
      | passwordElement | TechnoStudy123@      |
    And User clicks in "loginPage"
      | loginButton |
    Then Verify login

  Scenario: Create an Entrance Exam
    Given User clicks in "leftMenu"
      | EntranceExams    |
      | SetupSubMenu     |
      | EntranceExamsSub |
    And User waits "2" seconds
    And User clicks in "exam"
      | addExamButton |
    And User hoverover and send keys in "exam"
      | Name | XYExam |
    And User clicks in "exam"
      | AcademicPeriod |
    And User selects randomly from list of WebElements in "exam"
      | DropDownOptions |
    And User clicks in "exam"
      | GradeLevel |
    And User selects randomly from list of WebElements in "exam"
      | DropDownOptions |
    And User clicks in "exam"
      | SaveButton |
    Then Verify in "exam"
      | Message | Exam successfully created |


  Scenario: Update just created Exam
    Given User clicks in "leftMenu"
      | EntranceExams    |
      | SetupSubMenu     |
      | EntranceExamsSub |

    And User handles table in "exam"
    |ExamNameList|TargetWebelementList|XYExam|Edit|

    #And User sends key in "exam"
     # | FirstNameSearch | XYExam |
    #And User clicks in "exam"
    #  | SearchButton |
   # And User clicks in "exam"
   #   | EditEmployeeButton |
    And User clicks in "exam"
      | AcademicPeriod |
    And User selects randomly from list of WebElements in "exam"
      | DropDownOptions |
    And User clicks in "exam"
      | GradeLevel |
    And User selects randomly from list of WebElements in "exam"
      | DropDownOptions |
    And User hoverover and send keys in "exam"
      | Name | YYExam |
    And User clicks in "exam"
      | SaveButton |


#      When Search for "XYExam" and search
 #     And  Click on update button
  #    And Update Name "<Name>"
   #   And Click and Update Academic Period
    #  And Click and Update Grade Level
     # Then Click on save button
      #And Verify in "Exam"
      #Examples:
       # | Name | status |
        #|XXExam|Exam successfully updated|

     # Scenario: Delete juts updated Exam
      #  When Search for "XXExam" and search
       # And  Click on delete button and Confirm
        #And Verify <status>
         # |status|Exam successfully deleted|








