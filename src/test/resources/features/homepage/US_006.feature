Feature: US_006 As a user, I want a "Course" page on the website where I can access detailed information about the courses offered at the school.

  Scenario: Access test to the "Course" page.

    * Open the browser and go to the "homePageUrl"
    * Verify that Course link in home header is visible and functional
    * Click on the course link and verify that it redirects to the Course page
    * Close the browser

  Scenario: Content testing of the "Course" page.

    * Open the browser and go to the "homePageUrl"
    * Click on the Course link in the home header
    * Verify that the English and Literature title is visible on the page that opens
    * Verify that the Mathematics  title is visible
    * Verify that the Sciences title is visible
    * Verify that the Social Science title is visible
    * Verify that the History  title is visible
    * Verify that the Arts and Music title is visible
    * Verify that the Health and Exercise Science title is visible
    * Verify that the Foreign Language title is visible
    * Verify that the Computer Science title is visible
    * Close the browser

  Scenario: Access test to "Course" page content.

    * Open the browser and go to the "homePageUrl"
    * Click on the Course link in the home header
    * Click the DETAILS button under English and Literature and verify that it redirects to the relevant page.
    * Click the DETAILS button under Mathematics and verify that it redirects to the relevant page.
    * Click the DETAILS button under Sciences and verify that it redirects to the relevant page.
    * Click the DETAILS button under Social Science and verify that it redirects to the relevant page.
    * Click the DETAILS button under History and verify that it redirects to the relevant page.
    * Click the DETAILS button under Arts and Music and verify that it redirects to the relevant page.
    * Click the DETAILS button under Health and Exercise and verify that it redirects to the relevant page.
    * Click the DETAILS button under Foreign Language and verify that it redirects to the relevant page.
    * Click the DETAILS button under Computer Science and verify that it redirects to the relevant page.
    * Close the browser