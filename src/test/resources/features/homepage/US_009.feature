Feature: US_009 As a user, I want a "Contact" page on the website with contact information so that
         I can get in touch with the school administration.

  @homePage
  @US_009_TC_01
  Scenario: TC_01 Click on the Contact tab on the top bar of the homepage, go to the Contact page and display the necessary data.

    * Navigate to "homePageUrl".
    * Verify that the homepage page is displayed.
    * Click on the contact tab.
    * Verify contact page.
    * Verify that the name textbox on the contact page is available.
    * Verify that the email textbox on the contact page is available.
    * Verify that the subject textbox on the contact page is available.
    * Verify that the Description textbox on the contact page is available.
    * Verify that the submit button on the contact page is available.
    * Verify that OUR LOCATION on the contact page is visible.
    * Verify that CALL US on the contact page is visible.
    * Verify that WORKING HOURS on the contact page is visible.
    * Close the browser.

  @homePage
  @US_009_TC_02
  Scenario: TC_02 Necessary data must be entered on the contact page and the submit button can be clicked.

    * Navigate to "homePageUrl".
    * Verify that the homepage page is displayed.
    * Click on the contact tab.
    * Verify contact page.
    * Enter a "furkan" in the name textbox on the contact page.
    * Enter your "frk@gmail.com" into the email textbox on the contact page.
    * Enter a "Subject" in the subject textbox on the contact page.
    * Enter a "Description" in the Description textbox on the contact page.
    * Click the submit button on the contact page.
    * Verify that Record Saved Successfully is displayed.
    * Close the browser.
