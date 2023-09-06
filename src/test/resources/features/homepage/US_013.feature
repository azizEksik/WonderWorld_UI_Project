Feature: As a user, I want the contact information of the school to be available on the homepage for easy access.

  @homePage
  @US_013_TC_01
  Scenario: TC_01 The home page should contain contact information.

    * Navigate to "homePageUrl".
    * Verify that the homepage page is displayed.
    * Verify that email is displayed in the Navbar on the Home Page.
    * Verify that call us is displayed in the top bar of the Home Page.
    * Verify that phone information is displayed in the footer on the Home Page.
    * Verify that your email address is displayed in the footer on the Home Page.
    * Verify that the school address is displayed in the footer on the Home Page.
    * Close the browser.
