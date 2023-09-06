
Feature: [US_044] As a user, I should be able to change my password from the student page When entering the Student Panel


  Scenario: [TC_01] Student login, change password on Change Password page. Display "Password changed successfully" message for correct combinations
    * Open the browser and go to the "studentLoginUrl"
    * Login as admin "berkeStudentUserName" and "berkePassword"
    * Click on the profile icon on the top right corner of the page
    * Click on the Change Password button in the window that opens
    * On the Change Password page, verify that the Current Password, New Password, Confirm Password, textBoxes are accessible and the Save button is clickable
    * The user enters their current password in the Current Password textbox
    * Enter a new password in the New Password textbox, enter same password in the Confirm Password and click the Save button Positive Scenario
    * It displays the message "Password successfully changed", when the correct password combinations are entered
    * Close the browser


  Scenario: [TC_02] Student login, change password on Change Password page. Display "Password is invalid" message for incorrect combinations
    * Open the browser and go to the "studentLoginUrl"
    * Login as admin "berkeStudentUserName" and "berkePassword"
    * Click on the profile icon on the top right corner of the page
    * Click on the Change Password button in the window that opens
    * The user enters their current password in the Current Password textbox
    * Enter a new password in the New Password textbox, enter same password in the Confirm Password and click the Save button Negative Scenario
    * The user should receive the message "Password is invalid" when entering incorrect password combinations
    * Close the browser


