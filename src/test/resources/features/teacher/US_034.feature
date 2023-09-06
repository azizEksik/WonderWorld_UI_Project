Feature: US_034 As an administrator (teacher), I want to access students' permission information and
         be able to create permissions for students.

  @teacher
  @US_034_TC_01
  Scenario: TC_01 The Approve Leave page and information should be displayed under the Attendance menu on the Teacher panel.
    * Navigate to "teacherLoginUrl".
    * Verify that the Teacher Login page is displayed.
    * Enter the correct "furkanTeacherUserName" in the username textbox.
    * Enter the correct "furkanTeacherPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Teacher Dasboard Page is displayed.
    * Click Attendance in the Teacher Panel Sidebar.
    * Verify that Approve Leave is displayed under the Attendance menu heading.
    * Click Approve Leave in the Teacher Panel Sidebar.
    * Verify that Select Criteria boxes and search button are displayed.
    * Select a class from the class box.
    * Select a section from the section box.
    * Click search button.
    * Verify that information is displayed based on the search result.
    * Close the browser.

  @teacher
  @US_034_TC_02
  Scenario: TC_02 A new permission record should be created on the Add Leave page.
    * Navigate to "teacherLoginUrl".
    * Verify that the Teacher Login page is displayed.
    * Enter the correct "furkanTeacherUserName" in the username textbox.
    * Enter the correct "furkanTeacherPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Teacher Dasboard Page is displayed.
    * Click Attendance in the Teacher Panel Sidebar.
    * Verify that Approve Leave is displayed under the Attendance menu heading.
    * Click Approve Leave in the Teacher Panel Sidebar.
    * Verify that Add button is displayed.
    * Click Add buton.
    * Verify that boxes and buttons are displayed on the add leave page.
    * Enter the information in the relevant boxes.
    * Click save button on the add leave page.
    * Verify that the new attendance is displayed.
    * Close the browser.




  @teacher
  @US_034_TC_03
  Scenario: TC_03 Permission should be able to be edited and deleted on the Approve Leave page.
    * Navigate to "teacherLoginUrl".
    * Verify that the Teacher Login page is displayed.
    * Enter the correct "furkanTeacherUserName" in the username textbox.
    * Enter the correct "furkanTeacherPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Teacher Dasboard Page is displayed.
    * Click Attendance in the Teacher Panel Sidebar.
    * Verify that Approve Leave is displayed under the Attendance menu heading.
    * Click Approve Leave in the Teacher Panel Sidebar.
    * Click edit button under the action.
    * Enter information on the edit leave page.
    * Click save button on the edit leave page.
    * Verify that the attendance was editted.
    * Click delete button under the action.
    * Verify that the attendance was deleted.
    * Close the browser.
