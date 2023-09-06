Feature: As an administrator (admin), I want to be able to view and update school fees to keep them up to date.


  Scenario: TC_01 >> In the admin panel, under the 'Fees Collection' menu heading in the sidebar, the link to the 'Fees Master' page should be displayed, and when clicked, it should redirect to the feemaster page

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Fees Collection menu heading in the admin panel's sidebar
    * Verify that the Fees Master page link is visible
    * Click on the Fees Master page link and confirm that the redirected page is indeed the feemaster page
    * The browser is closed


  Scenario: TC_02 >> In the Feemaster page, display 'Add Fees Master' with textBoxes for Fees Group, Fees Type, Due Date, Amount Percentage(%), Fix Amount, and radio buttons for Fine Type. Also, show 'Fees Master List' with headers: Fees Group, Fees Code, Amount, Action

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Fees Collection menu heading in the admin panel's sidebar
    * Click on the Fees Master page link
    * Verify that the Fees Group textBox is visible in the Add Fees Master section
    * Confirm that the Fees Type textBox is visible in the Add Fees Master section
    * Ensure that the Due Date textBox is visible in the Add Fees Master section
    * Validate that the Amount Percentage(%) textBox is visible in the Add Fees Master section
    * Verify that the Fix Amount textBox is visible in the Add Fees Master section
    * Confirm that the Fine Type radio buttons are visible in the Add Fees Master section
    * Verify that the headers in the Fees Master List section are "adminPageFeesMasterFeesListFeesGroupTitle", "adminPageFeesMasterFeesCodeTitle", "adminPageFeesMasterAmountTitle", and "adminPageFeesMasterActionTitle", and they are visible
    * The browser is closed


  Scenario: TC_03 >> The search TextBox within the 'Fees Master List' should be displayed

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Fees Collection menu heading in the admin panel's sidebar
    * Click on the Fees Master page link
    * Verify that the search TextBox in the Fees Master List section is visible and accessible
    * The browser is closed


  Scenario: TC_04 >> When valid values are entered in 'Add Fees Master,' clicking Save creates a new record. In 'Fees Master List,' clicking edit opens 'Edit Fees Master' to update data and Save updates existing fees. Delete icon allows registered fees deletion

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Fees Collection menu heading in the admin panel's sidebar
    * Click on the Fees Master page link
    * Enter valid values in Add Fees Master, upon clicking Save, verify a new Fees Master record is created
    * Click the edit icon of the newly created Fees Master record in Fees Master List
    * Confirm that the Edit Fees Master window appears
    * Enter valid values in Edit Fees Master and click Save
    * Verify that the registered fees are updated
    * Click the delete icon next to the registered Fees in the Fees Master List section to confirm its deletion
    * The browser is closed
