Feature: US_051 As a user, I should be able to access the Examinations page and view the relevant exams  When entering the Student Panel

  Scenario: Verify that the table elements are visible on the Exam Schedule page in the Student Panel and that the exams are filtered through the search box and displayed in the table.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click on the Student Login button
    * Enter the valid username and password in the related text box and click on the Sign In button
    * Verify that the Examination menu is visible and functional in the student panel sidebar
    * Click on the Examination link
    * Verify that the Exam Schedule link is visible and functional
    * Click on the Exam Schedule link
    * Verify that the table headers S.No., Exam, Description and Action are visible on the Exam Schedule page
    * Verify that the Search text box is visible and functional and should be able to filter exams
    * Verify that the View button in the Action column is visible and functional
    * Click on the View button and verify that opened the exam detail
    * Verify that the column headings Subject, Date From, Start Time, Duration, Credit Hours, Room No.,Marks (Max..), Marks,(Min..) in the Exam Detail window are visible
    * Close the page