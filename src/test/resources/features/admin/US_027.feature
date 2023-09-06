Feature: As an administrator (admin), I want to view and update fee types in the system.


  @batu500
  Scenario: TC_001 Verifying visibility and function of “Fees Type” page link; visibility of “Add Fees Type” section, its fields and a save button; visibility of “Fees Type List” section and its columns

  * Go to url "adminLoginUrl"
  * Enter related data and click to “Sign In” button
  * Click “Fees Collection” button
  * Verify that “Fees Type” button is visible
  * Click “Fees Type” button
  * Verify that page’s link contains “feetype”
  * Verify that “Add Fees Type” section, “Name” texbox, “Fees Code” textbox, “Description” textbox, “Save” button; “Fees Type List” section, “Name” column, “Fees Code” column, “Action” column are visible
  * Close the browser

  @batu500
  Scenario: TC_002 Verifying functions of textboxes and “Save” button in the “Add Fees Type” section


  * Go to url "adminLoginUrl"
    * Enter related data and click to “Sign In” button
  * Click “Fees Collection” button
  * Click “Fees Type” button
  * Ented related data into “Add Fees Type” section
  * Click to “Save” button
  * Verify that a succes message shows up
  * Close the browser

  @batu500
  Scenario: TC_003 Verifying to access to “Edit Fees Type” window, function of the save button and function of the delete icon in the “Fees Type List”


  * Go to url "adminLoginUrl"
  * Enter related data and click to “Sign In” button
  * Click “Fees Collection” button
  * Click “Fees Type” button
  * Click “Edit” icon
  * Verify that “Edit Fees Type” section is visible
  * Enter related data
  * Click to “Save” button
  * Verify that a succes message shows up
  * Return to previous page
  * Click to “Delete” button
  * Verify that a succes message shows up
  * Close the browser
