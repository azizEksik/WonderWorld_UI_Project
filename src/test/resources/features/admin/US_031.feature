Feature: As an administrator (admin), I want a page where I can make teacher assignments to classes and make relevant adjustments.


  Scenario: TC_01 >> The Assign Class Teacher page link should be displayed under the Academics menu heading in the admin panel's sidebar, and when clicked, it should redirect to the assign class teacher page

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Academics menu heading in the admin panel's sidebar
    * Verify that the Assign Class Teacher link is visible
    * Click on the Assign Class Teacher link and confirm that it redirects to the assign class teacher page
    * The browser is closed


  Scenario: TC_02 >> In the Assign Class Teacher page, the Class and Section dropdown menus should be visible in the Assign Class Teacher window. All teachers under the Class Teacher heading should be displayed with checkboxes next to their names. The Save button should also be visible in the same window

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Academics menu heading in the admin panel's sidebar
    * Click on the Assign Class Teacher link
    * Verify that the Class and Section dropdown menus are visible in the Assign Class Teacher window
    * Confirm that the names of all teachers under the Class Teacher heading are visible, along with checkboxes next to their names
    * Verify that the Save button is visible
    * The browser is closed


  Scenario: TC_03 >> In the Assign Class Teacher window, when the relevant class is selected, and the desired teacher is marked, clicking the Save button should allow the teacher to be assigned to the chosen class

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Academics menu heading in the admin panel's sidebar
    * Click on the Assign Class Teacher link
    * Select a class from the Class dropdown menu in the Assign Class Teacher window
    * Choose a class number from the Section dropdown menu in the Assign Class Teacher window
    * Select one of the teachers listed under the Class Teacher heading in the Assign Class Teacher window
    * Click on the Save button in the Assign Class Teacher window
    * Verify that the assignment is successful
    * Confirm that the assigned teacher is listed in the Class Teacher List page with the assigned class and class number
    * The browser is closed


  Scenario: TC_04 >> The Assign Class Teacher page should display in the Class Teacher List with the headings (Class, Section, Class Teacher, Action)

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Academics menu heading in the admin panel's sidebar
    * Click on the Assign Class Teacher link
    * Verify that the first column's heading in the Class Teacher List table is "adminPageAssignClassTeacherTeacherListClassColumnTitle" and it is visible
    * Confirm that the second column's heading in the Class Teacher List table is "adminPageAssignClassTeacherTeacherListSectionColumnTitle" and it is visible
    * Ensure that the third column's heading in the Class Teacher List table is "adminPageAssignClassTeacherTeacherListClassTeacherColumnTitle" and it is visible
    * Validate that the fourth column's heading in the Class Teacher List table is "adminPageAssignClassTeacherTeacherListActionColumnTitle" and it is visible
    * The browser is closed


  Scenario: TC_05 >> The assignment of class-teacher can be updated by clicking on the edit icon under the 'Action' heading in the Class Teacher List, which opens the 'Edit Assign Class Teacher' window

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Academics menu heading in the admin panel's sidebar
    * Click on the Assign Class Teacher link
    * Click on the edit icon in the Class Teacher List table
    * Verify that the Update Class Teacher page is opened
    * Change the Class and Section in the Edit Assign Class Teacher window, then click on the Save button
    * Confirm that the update process is successful
    * The browser is closed


  Scenario: TC_06 >> The assignment of class-teacher should be deletable by clicking on the delete icon under the 'Action' heading in the Class Teacher List

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the Academics menu heading in the admin panel's sidebar
    * Click on the Assign Class Teacher link
    * Click on the delete icon under the Action heading in the Class Teacher List table.
    * Confirm that the delete operation is successfully completed
    * The browser is closed
