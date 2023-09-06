
  Feature: [US_039] As an administrator (teacher), I want a page where I can prepare homework for students and assign it to them.

    Scenario: [TC_01->US_039] Homework is prepared for the students from the teacher panel and assigned to the students.

      Given Open the browser and go to the "teacherLoginUrl"
      * Login as admin "teacherUserNameHilal" and "teacherPassword"
      When Click the Homework Button on the sidebar and Add Homework link
      When Class, Section, Subject Group, Subject dropdown menus and Search button visibility are verified.
      When Search is made according to the selected criteria in the Select Criteria section.
      When Verify that the titles Class, Section, Subject Group, Subject, Homework Date, Submission Date, Evaluation Date, Created By, Action are displayed.
      When Click on the evaluation icon under the Action heading in the Homework List.
      When Confirmation that the Evaluate Homework window opens.
      When Write a note to the student and click the Save button.
      When Click the edit icon under the Action title in the Homework List.
      When Click on the delete icon and confirm that the Homework record has been deleted.
      When Confirming that the Add button is visible and active, the Add button is clicked.
      When Verify that Class, Section, Subject Group, Subject, Homework Date, Submission Date, Max Marks, Description Boxes, and Save button are visible and functional.
      When A new assignment record is created and it is verified that the record has been opened.
      When It is verified that two separate lists, Upcoming Homework and Closed Homework, are displayed in the Homework List.
      When Click on Closed Homework Button.
      When Select All button is marked
      When It is verified that bulk deletion is done in the list.
      * Close the browser

