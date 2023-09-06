Feature: US_021 As an administrator (admin), I want to be able to view online admission applications and
         complete the enrollment process for the applying students from the admin panel.

  @admin
  @US_021_TC_01
  Scenario: TC_01 The Online Admission page in the admin panel should be displayed and necessary actions should be taken.

    * Navigate to "adminLoginUrl".
    * Verify that the Admin Login page is displayed.
    * Enter the correct "furkanAdminUserName" in the username textbox.
    * Enter the correct "furkanAdminPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Admin Dasboard Page is displayed.
    * Click Student Information in the Admin Panel Sidebar.
    * Verify that online admission is displayed under the student information menu heading.
    * Click online admission in the Admin Panel Sidebar.
    * Verify that student list and information about student is displayed.
    * Enter the "ahmet" in the search box.
    * Verify that "ahmet" is displayed.
    * Close the browser.

  @admin
  @US_021_TC_02
  Scenario: TC_02 Student List's Form status, Enrolled and action sections should be displayed and deleted.
    * Navigate to "adminLoginUrl".
    * Verify that the Admin Login page is displayed.
    * Enter the correct "furkanAdminUserName" in the username textbox.
    * Enter the correct "furkanAdminPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Admin Dasboard Page is displayed.
    * Click Student Information in the Admin Panel Sidebar.
    * Verify that online admission is displayed under the student information menu heading.
    * Click online admission in the Admin Panel Sidebar.
    * Verify that student list and information about student is displayed.
    * Verify that students who have submitted a registration form is displayed as submitted.
    * Verify that students who have not submitted a registration form is displayed as not submitted.
    * Verify that the check icon is displayed for students whose online application has been evaluated and registered to the school.
    * Verify that the (-) icon is displayed for students whose not registered to the school.
    * Click the delete button under actions.
    * Accept the alert.
    * Close the browser.

  @admin
  @US_021_TC_03
  Scenario: TC_03 Student information should be displayed on the Edit and Enroll page, edits should be made and the save button should be clicked.
    * Navigate to "adminLoginUrl".
    * Verify that the Admin Login page is displayed.
    * Enter the correct "furkanAdminUserName" in the username textbox.
    * Enter the correct "furkanAdminPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Admin Dasboard Page is displayed.
    * Click Student Information in the Admin Panel Sidebar.
    * Verify that online admission is displayed under the student information menu heading.
    * Click online admission in the Admin Panel Sidebar.
    * Verify that student list and information about student is displayed.
    * Click the edit and enroll button under actions.
    * Verify that edit and enroll page is displayed.
    * Verify that required fields and save and save enroll button are displayed in the edit and enroll page.
    * Click on fees details checkbox buttons.
    * Verify that the total calculated amount is displayed.
    * Click the icon next to fees details.
    * Verify that the fees details is displayed.
    * Enter student information in the relevant boxes.
    * Click the save button.
    * Verify that Record Updated Successfully is displayed.
    * Close the browser.

  @admin
  @US_021_TC_04
  Scenario: TC_04 Admission number and other information should be entered and the save and enroll button should be clicked.
    * Navigate to "adminLoginUrl".
    * Verify that the Admin Login page is displayed.
    * Enter the correct "furkanAdminUserName" in the username textbox.
    * Enter the correct "furkanAdminPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Admin Dasboard Page is displayed.
    * Click Student Information in the Admin Panel Sidebar.
    * Verify that online admission is displayed under the student information menu heading.
    * Click online admission in the Admin Panel Sidebar.
    * Verify that student list and information about student is displayed.
    * Click the edit and enroll button under actions.
    * Verify that edit and enroll page is displayed.
    * Enter student information in the relevant boxes.
    * Click the save and enroll button.
    * Verify that registration is complete.
    * Close the browser.




