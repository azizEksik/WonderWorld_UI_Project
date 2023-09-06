
@teacher
  Feature:  As a user, I want a page that introduces the teachers working at the school.
  Background:
    * Open the browser and go to the "homePageUrl"
    * Click on Academics in the top bar of the homepage and verify that the Teacher link is visible and clickable.
    * Verify that the navigated page is the teacher page.

    Scenario: TC_01 Under the Academics dropdown on the homepage top bar, verify that the teachers page link is visible
              and clickable, and verify that the page you go to is the teachers page when clicked.


      * Close the browser.


    Scenario: TC_02 It should be verified that 40 teachers (with name, surname and branch information)
    can be viewed on the Teachers page.

      * *It should be verified that 40 teachers (with name, surname and branch information) are displayed on the Teachers page.
      * Close the browser.