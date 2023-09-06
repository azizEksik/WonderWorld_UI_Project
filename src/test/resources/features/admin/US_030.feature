Feature: As an administrator (admin), I want a page related to school bus routes to update the routes as needed.

  Scenario: US_01 It should be verified that when the Routes page link is clicked on the sidebar in the admin panel, it redirects to the route page and the Route Title textBox and Save button are active and visible in the Create Route window.
    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Enter the correct username that is "vahdeddinAdminUserName"
    * Enter the correct password that is "vahdeddinPassword"
    * Click the admin panel Sign In button
    * Click on the Transport menu title on the admin homepage
    * Click on Routes page link
    * In the Create Route window on the Route page, verify that the Route Title textBox is visible and active
    * Verify that the Save button is visible and active
    * The browser is closed

  Scenario: US_02 In the Create Route window on the Route page in the Admin panel, data should be entered in the Route Title textBox and when the Save button is clicked, it should be verified that the route registration is made.
    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Enter the correct username that is "vahdeddinAdminUserName"
    * Enter the correct password that is "vahdeddinPassword"
    * Click the admin panel Sign In button
    * Click on the Transport menu title on the admin homepage
    * Click on Routes page link
    * Enter the text in the Route Tittle textBox
    * Click on the Save button
    * Verifies that test route is among the records in the route list
    * The browser is closed

  Scenario: US_03 Verify that Route List, Route Title and Action titles are displayed on the Route page
    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Enter the correct username that is "vahdeddinAdminUserName"
    * Enter the correct password that is "vahdeddinPassword"
    * Click the admin panel Sign In button
    * Click on the Transport menu title on the admin homepage
    * Click on Routes page link
    * Route List header is verified to be
    * Route Tittle header is verified to be
    * Action header is verified to be
    * The browser is closed

  Scenario: US_04 It should be verified that the necessary update can be made and saved in the Edit Route window that opens when clicking the edit icon under the Action title on the Route page.
    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Enter the correct username that is "vahdeddinAdminUserName"
    * Enter the correct password that is "vahdeddinPassword"
    * Click the admin panel Sign In button
    * Click on the Transport menu title on the admin homepage
    * Click on Routes page link
    * Click the edit button opposite Test-Route in the route list
    * Route Update is written in the Route Tittle textBox
    * Click on the edit Save button
    * Verify that route update is among the records in the route list
    * The browser is closed

  Scenario: US_05 It should be verified that the record can be deleted when clicking the delete icon under the action title on the Route page
    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Enter the correct username that is "vahdeddinAdminUserName"
    * Enter the correct password that is "vahdeddinPassword"
    * Click the admin panel Sign In button
    * Click on the Transport menu title on the admin homepage
    * Click on Routes page link
    * Click the delete button opposite Test_Route_Update in the route list
    * Click OK on the alert text that appears
    * Verifies that Test_Route_Update is not among the records in the route list
    * The browser is closed
