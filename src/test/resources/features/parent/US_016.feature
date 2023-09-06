Feature: US_016 As a registered user (student/parent), I want to have access to the login page from the homepage so that I can log in to my personal panel.

  Scenario: TC_01 Access to the login page for the personal panel(student/parent) and the content of the login page.

    * Open the browser and go to the "homePageUrl"
    * Verify that the Login button in the home top bar is visible and functional
    * Click on the Login button and verify that you have accessed the user login page
    * Verify that the User Login text, username and password textboxes and the Sign In button are visible and functional on the left of the User login page.
    * Verify that the title Whats New is visible on the right on the user login page
    * Verify that the subheadings for the What's New heading are visible
    * Close the browser

  Scenario: TC_02 To be verified that the user can log in to the user panels by entering the information on the User Login page (previously registered in the system)

    * Open the browser and go to the "homePageUrl"
    * Click the Login button on the top bar of the homepage
    * Enter a valid Username and Password in the relevant boxes and click on the Sign In button.
    * Verify login to the user panel
    * Close the browser

  Scenario: TC_03 To verify that the user cannot log in to the user panels by entering the information on the User Login page (wrong, missing or not registered in the system before)

    * Open the browser and go to the "homePageUrl"
    * Click the Login button on the top bar of the homepage
    * Enter invalid Username and Password in the login window
    * Click the Sign In button and verify that the "Invalid Username Or Password" warning is visible (unable to login to the panel)
    * Close the browser

  Scenario: TC_04 Sending a password by email when the user forgets the password.

    * Open the browser and go to the "homePageUrl"
    * Click the Login button on the top bar of the homepage
    * Verify that the Forgot Password link is visible and functional on the user login page that opens
    * Click on the Forgot Password link and verify that the Forgot Password page has been entered
    * Verify that the Email textbox, student and Parent radio buttons are enabled
    * Enter your email in the textbox, select the panel and click the Submit button
    * Verify that mail was sent to the email
    * Close the browser

  Scenario: TC_05 Returning to the user login page from the Forgot Password page, then returning to the homepage from the user login page.

    * Open the browser and go to the "homePageUrl"
    * Click the Login button on the top bar of the homepage
    * Click on the Forgot Password link and verify that the Forgot Password page has been entered
    * Verify that the User Login link is visible and functional.
    * Click on the User Login link and verify that you have accessed the userlogin page.
    * Verify that the Front Site link is visible and functional.
    * Click on the Front Site link and verify that you have accessed the homepage.
    * Close the browser