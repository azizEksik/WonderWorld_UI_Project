Feature: US_018 As an administrator (admin), I want an admin panel to be available for performing administrative tasks, and I want to be able to log in to the admin panel with registered email and password.

  Scenario: TC_01 Verification that the Url used to log in to the school panels is accessible and that the admin panel is accessible.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Verify you go to the college login panel
    * Verify that the Admin Login button is visible and functional.
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Close the browser

  Scenario: TC_02 To test the content of the login page to the admin panel.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Verify that the Admin Login button is visible and functional.
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Verify that there is a login window on the left of the admin login page.
    * Verify that the title Whats New is visible on the right on the admin login page
    * Verify that the subheadings for the What's New heading are visible.
    * Quit the browser

  Scenario: TC_03 To test the content of the login window on the admin login page.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Verify that the Admin Login button is visible and functional.
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Verify that the Admin Login text is visible in the login window.
    * Verify that the Username Textbox is visible and functional.
    * Verify that the Password Textbox is visible and functional.
    * Verify that the Sign In button is visible and functional.
    * Quit the browser

  Scenario: TC_04 Confirming that a new password can be received by e-mail if the password is forgotten.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Verify that the Admin Login button is visible and functional.
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Verify that the Forgot Password link is visible and functional
    * Click on the Forgot Password link and verify that you have been to the forgotpassword page
    * Verify that the email textbox is visible and functional on the page
    * Verify that the Submit button is visible and functional
    * Enter a valid email address in the email textbox and click the submit button
    * Verify that the password has been sent to the entered email
    * Quit the browser

  Scenario: TC_05 Redirection to the home page from the school panels(forgot password page) page

    * Open the browser and go to the "collegeLoginPageUrl"
    * Verify that the Admin Login button is visible and functional.
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Verify that the Forgot Password link is visible and functional
    * Click on the Forgot Password link and verify that you have been to the forgotpassword page
    * Verify that the Admin Login link is visible and functional
    * Click on the Admin Login link and verify that you have accessed the admin login page
    * Verify that the User Login link is visible and functional
    * Click on the User Login link and verify that you have accessed the userlogin page
    * Verify that the Front Site link is visible and functional
    * Click on the Front Site link and verify that you have accessed the homepage
    * Quit the browser

  Scenario: TC_06 Verify that the user can log in to the admin panel by entering the information on the Admin Login page (previously registered in the system).

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Enter a valid Username and Password in the relevant boxes and click on the Sign In button
    * Verify that you accessed the admin panel
    * Quit the browser

  Scenario: TC_07 Verify that the user cannot log in to the Admin panel by entering the information on the Admin Login page (wrong, missing or not registered in the system before).

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click the Admin login button and verify that the admin login page has been accessed.
    * Enter an invalid Username and Password in the relevant boxes and click on the Sign In button
    * Verify that you cannot access the admin panel
    * Quit the browser