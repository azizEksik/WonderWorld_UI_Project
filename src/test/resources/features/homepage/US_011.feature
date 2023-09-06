Feature: As a user, I want a "Complaints" section on the website where I can submit my requests and complaints.

@batu1
  Scenario: TC_01 Verifying visibility of "Complain" heading and icon; and their functions


   * Go to Url "homePageUrl"
   * Press the Pagedown key to move to the bottom of the page
   * Verify “Complain” heading in the footer is visible
   * Verify “Complain” icon in the footer is visible
   * Click on the “Complain” heading
   * Verify if page title equals "Complain"
   * Go to Url "homePageUrl"
  * Press the Pagedown key to move to the bottom of the page
   * Click on the “Complain” icon
   * Verify if page title equals "Complain"
   * Close the browser



 @batu2
  Scenario: TC_02 Verifying textboxes on the complaing page and function of the submit button


   * Go to Url "homePageUrl"
   * Press the Pagedown key to move to the bottom of the page
   * Click on the “Complain” heading
   * Verify that there is textboxes named; ComplainTextBox1, ComplainTextBox2 , ComplainTextBox3, ComplainTextBox4
   * Enter data in the textboxes
   * Click “Submit” button
   * Verify that there is a success message for submitting the complaint



