
Feature: [US_023] As an administrator, I want to access all information about enrolled students to gather more details about them.
  

  Scenario: [TC_01] Admin login, click Student Details in the sidebar, redirect to search page, search students, view profiles by clicking names.
    * Open the browser and go to the "adminLoginUrl"
    * Login as admin "berkeAdminUserName" and "berkePassword"
    * Verify student name click redirects to relevant profile page.
    * Verify active Class, Section dropdowns, Search By Keyword textBox, and search buttons on Search page
    * Search according to the criteria selected in Class and Section dropdowns
    * Verify List with headings: Admission No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, Action on Search page
    * Clicking on the student's name from the resulting list verifies that it redirects to the relevant student's profile page
    * Close the browser


  Scenario: [TC_02] Clicking on the view icon under the Action heading should redirect to the profile page of the relevant student.
    * Open the browser and go to the "adminLoginUrl"
    * Login as admin "berkeAdminUserName" and "berkePassword"
    * Verify student name click redirects to relevant profile page.
    * Verify active Class, Section dropdowns, Search By Keyword textBox, and search buttons on Search page
    * Search according to the criteria selected in Class and Section dropdowns
    * In the list created, click on the view button under the Action heading
    * It is verified that the student is redirected to the profile page
    * Close the browser


  Scenario: [TC_03] Click edit icon to redirect to relevant student's edit page. Edit various student information, save changes with Save button.
    * Open the browser and go to the "adminLoginUrl"
    * Login as admin "berkeAdminUserName" and "berkePassword"
    * Verify student name click redirects to relevant profile page.
    * Verify active Class, Section dropdowns, Search By Keyword textBox, and search buttons on Search page
    * Search according to the criteria selected in Class and Section dropdowns
    * In the list created, click on the edit button under the Action heading
    * On the edit page, Student, Transportation Details, Fee Details, Parent_Guardian Details, Address Details, Miscellaneous Details information is edited
    * The edited information is saved and confirmed with the Save button
    * Close the browser


  Scenario: [TC_04] Clicking on the add fees icon under the Action heading should redirect to the addfee page of the relevant student.
    * Open the browser and go to the "adminLoginUrl"
    * Login as admin "berkeAdminUserName" and "berkePassword"
    * Verify student name click redirects to relevant profile page.
    * Verify active Class, Section dropdowns, Search By Keyword textBox, and search buttons on Search page
    * Search according to the criteria selected in Class and Section dropdowns
    * In the list created, click on the add fees button under the Action heading
    * Verified redirect to the Student fees page
    * Close the browser


