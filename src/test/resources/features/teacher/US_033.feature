
Feature: [US_033] As an administrator (teacher), I want to access students' exam results.

  Scenario: [TC_01->US_033] It is verified that students can access exam results from the Teacher panel.

    Given Open the browser and go to the "teacherLoginUrl"
    * Login as admin "teacherUserNameHilal" and "teacherPassword"
    When Click the Examinations button on the sidebar.
    When The visibility of the Exam Result page link is verified and clicked.
    When The visibility of Exam Group, Exam, Session, Class, Section and Search button is verified.
    When Select data from Exam Group, Exam, Session, Class, Section and click the Search button
    Then It is verified that Admission No, Roll Number, Student Name, Grand Total, Percent(%), Rank, Result are displayed
    Then It is verified that the relevant data is entered in the search textbox and filtering is done.
    Then From the listed student names, the relevant student is clicked.
    Then It is verified that the relevant student is redirected to their profile page.
    * Close the browser