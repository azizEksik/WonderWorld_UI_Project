Feature: US_026 As an administrator (admin), I want to view and update fee groups in the system.

  @admin
  @US_026_TC_01
  Scenario: TC_01 As an administrator, you should go to the fees group page in the panel,
            view the information and take the necessary steps.
    * Navigate to "adminLoginUrl".
    * Verify that the Admin Login page is displayed.
    * Enter the correct "furkanAdminUserName" in the username textbox.
    * Enter the correct "furkanAdminPassword" in the password textbox.
    * Click the sing in button.
    * Verify that the Admin Dasboard Page is displayed.
    * Click Fees Collection in the Admin Panel Sidebar.
    * Verify that fees group is displayed under the fees collection menu heading.
    * Click fees group in the Admin Panel Sidebar.
    * Verify that add fees group textboxes and save button are displayed.
    * Verify that fees group informations are displayed.
    * Enter add fees group information in the relevant boxes.
    * Click the fees save button.
    * Verify that Record Saved Successfully text is displayed.
    * Click the edit button under the actions row.
    * Edit fees group informations.
    * Click save button.
    * Verify that Record Saved Successfully text is displayed.
    * Click the delete button under the actions row.
    * Accept the warning that appears on the screen.
    * Close the browser.
