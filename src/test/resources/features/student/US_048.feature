Feature: As a user, I should be able to access the "Online Exam" page and make changes and view the Exam details  When entering the Student Panel

  @batu20
  Scenario: TC_001 Verifying visibility of column fields and accesing “Exam view”  on the “Online Exam” segment


  * Go to url "studentLoginUrl"
  * Enter the related data and click “Sign In” button
  * Click “Online Exam” button
  * Verify that “Exam”, “Quiz”, “Date From”, “Date To”, “Duration”, “Total Attempt”, “Attempted”, “Status”, “Action" columns are visible
  * Click “Exam view” button
  * Verify that exam details show up
  * Close the browser

  @batu2
  Scenario: TC_002 Verifying visibility of column fields and accesing “Exam view”  on the “Closed Exam” segment


  * Go to url "studentLoginUrl"
  * Enter the related data and click “Sign In” button
  * Click “Online Exam” button
  * Click “Closed Exam” button
  * Verify that “Exam”, “Quiz”, “Date From”, “Date To”, “Duration”, “Total Attempt”, “Attempted”, “Status”, “Action" columns are visible
  * Click “Exam view” button
  * Verify that exam details show up
  * Close the browser

