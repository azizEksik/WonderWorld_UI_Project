Feature: US_047  As a user, I should be able to access the "Homework" page and
         make changes to my assignments  When entering the Student Panel

  @Student
  @US_047_TC_01
  Scenario: TC_01 The homework page and action details in the Student panel should be displayed.
    * Navigate to "studentLoginUrl".
    * Verify that the Student Login page is displayed.
    * Enter the correct "furkanStudentUserName" in the Username textbox.
    * Enter the correct "furkanStudentPassword" in the Password textbox.
    * Click the sing in button.
    * Verify that the Student Dasboard Page is displayed.
    * Click Homework in the Student Panel Sidebar.
    * Verify that Upcoming Homework is displayed on the Homework page.
    * Click view and edit button under the action.
    * Verify that homework details page is displayed.
    * Enter message in the message textbox.
    * Click save button on the homework details page.
    * Verify that the message was sent.
    * Close the browser.

  @Student
  @US_047_TC_02
  Scenario: TC_02 It should be able to send a message under action on the closed homework page.
    * Navigate to "studentLoginUrl".
    * Verify that the Student Login page is displayed.
    * Enter the correct "furkanStudentUserName" in the username textbox.
    * Enter the correct "furkanStudentPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Student Dasboard Page is displayed.
    * Click Homework in the Student Panel Sidebar.
    * Click Closed Homework on the Homework page.
    * Click view and edit button under the action on closed homework page .
    * Enter message in the message textbox.
    * Click save button under the page.
    * Verify that the message was sent on page.
    * Click daily assigment button.
    * Verify that Daily Assigment Page is displayed.
    * Click add daily assigment button.
    * Verify that relevant boxes is displayed.
    * Enter information on the Add Daily Assignment page.
    * Click save button under add daily page.
    * Verify that new assigment is displayed.
    * Click edit button under the action on daily page.
    * Edit information on the Edit Daily Assignment page.
    * Click save button on edit daily page.
    * Verify that new assigment was editted.
    * Click delete button under the action on daily page.
    * Verify that Succesfully deleted is displayed.
    * Close the browser.

  @Student
  @US_047_TC_03
  Scenario: TC_03 They should be able to add, edit and delete new items on the Daily Assignment page.