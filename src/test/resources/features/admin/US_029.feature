Feature: As an administrator (admin), I want a "Complaints" page to see user complaints and assign them for resolution.

@batu
  Scenario: TC_001 Verifying visibility and function of “Complain” link


  * Go to url "adminLoginUrl"
  * Enter related data and click to “Sign In” button
  * Click to “Front Office” Button
  * Verify that there is a “Complain” button
  * Click to “Complain” button
  * Verify that the directed page’s link contains “complaint”
  * Close the browser


  @batu00
  Scenario: TC_002 Verifying visibility of “Add complain” section, visibility and functionality of its fields, verifying succes on uploading document, visibility, enability and functionality of the “Save” button

    * Go to url "adminLoginUrl"
  * Enter related data and click to “Sign In” button
  * Click to “Front Office” Button
  * Click to “Complain” button
  * Verify that visibility of “Add Complain” section; visibility and function of “Complain Type” dropdown, “Source” dropdown”, “Complain By” textbox, “Phone” textbox, “Date” table, “Description” textbox, “Action Taken” textbox, “Assigned” textbox, “Note” textbox, “Attach Document” button, “Save” button
  * Enter related data to related fields
  * Click save button
  * Verify that a success message shows up
  * Close the browser

  @batu
  Scenario: TC_003 Verifying, on the “Complain List Section”; visibility of columns, filtering function, function of “View” button, function of “Edit” icon, function of “Delete” icon

    * Go to url "adminLoginUrl"
  * Enter related data and click to “Sign In” button
  * Click to “Front Office” Button
  * Click to “Complain” button
  * Verify visibility of “Complain #”, “Complain Type”, “Name, “Phone”, “Date”,”Actions” columns

    * Click to ““Complain #”
  * Verify that first complaints number is 1
  * Click “View” icon
  * Verify that “Details” page is opened
  * Close “Details” page
  * Click to “Edit” button
  * Verify that page’s lin contains “edit”
  * Return to previous page
  * Click Delete button
  * Verify that a succes message appears
  * Close the browser
