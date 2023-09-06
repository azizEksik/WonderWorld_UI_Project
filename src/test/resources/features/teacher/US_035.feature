Feature: US_035 As an administrator (teacher), I want a page to record attendance for students.

  Scenario: TC_ 02 Testing the content of the Period Attendance page

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click the Teacher Login button
    * Enter the Username and Password in the related boxes
    * Click the Sign In button
    * Click the Attendance menu in the sidebar of the Teacher panel
    * Click the Period Attendance page link under Attendance and verify that you have been to the subjectattence page
    * Verify that the Class, Section and Subject Dropdown menus and Date box are visible in the Select Criteria section
    * Verify that the Search button is visible and active
    * Quit the browser

  Scenario: TC_02 Accessing and updating attendance records by entering the necessary information from the Select Criteria section.
    
    * Open the browser and go to the "collegeLoginPageUrl"
    * Click the Teacher Login button
    * Enter the Username and Password in the related boxes
    * Click the Teacher Sign In button
    * Click the Attendance menu in the sidebar of the Teacher panel
    * Click the Period Attendance page link under Attendance and verify that you have been to the subjectattence page
    * In the Select Criteria section, necessary information is entered into the textboxes and click the search button.
    * Verify that the Student List heading and the Admission No, Roll Number, Name, Attendance, and Note headings below are visible in the search result
    * Student status (Present, Late, Absent, Half Day) is selected and click the Save Attendance button
    * In the Student List section, it is verified that the desired grade can be entered under the Note Title.
    * Verify that student status has been successfully saved in the system
    * Quit the browser

  Scenario: TC_03 Verify that notes can be written in the boxes under the Notes heading in the Student List.  Verify the functionality of the Mark as Holiday button.

    * Open the browser and go to the "collegeLoginPageUrl"
    * Click the Teacher Login button
    * Enter the Username and Password in the related boxes
    * Click the Teacher Sign In button
    * Click the Attendance menu in the sidebar of the Teacher panel
    * Click the Period Attendance page link under Attendance and verify that you have been to the subjectattence page
    * In the Select Criteria section, necessary information is entered into the textboxes and click the search button.
    * The Mark As Holiday button should be visible and functional.
    * Quit the browser

