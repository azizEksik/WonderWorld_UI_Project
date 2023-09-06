Feature: US_49  As a user, I should be able to access the "Apply Leave" page, make changes, and view the leave details  When entering the Student Panel

  Scenario: TC_01 Verify that the Apply Leave link and the Leave List are visible and can be updated on the Student panel

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click on the Student Login button
    * Enter the valid username and password in the related text box and click on the Sign In button
    * Click the Apply Leave link in the sidebar of the Student panel
    * Verify that the Leave List title is visible on the page that opens
    * Verify that the Class, Section, Apply Date, From Date, To Date, Reason, Status and Action columns on the Leave List page are visible
    * Verify that the Edit button is visible and active under the Action column
    * Click the Edit button and verify that the Edit Leave window opens
    * Verify that Apply Date, From Date, To Date and Reason are visible and functional
    * Verify that the informations are updateable in the Edit Leave window
    * Quit the browser

  Scenario: TC_02 Verify that new permission can be added by clicking the "Add" button and verify that the "added successfully" message is visible.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click on the Student Login button
    * Enter the valid username and password in the related text box and click on the Sign In button
    * Click the Apply Leave link in the sidebar of the Student panel
    * Verify that the Delete button is visible and active under the Action column
    * Click on the Delete button and verify that the left detail has been deleted and the "succesfully deleted" message is visible
    * Click the Add button on the left of the page that opens and confirm that the Add Leave window is opened.
    * From Date, To Date, Reason information is entered in the Add Leave window and the Save button is clicked.
    * Verifies that a new leave can be added to the table and the message "suceffly added" is displayed.
    * Quit the browser