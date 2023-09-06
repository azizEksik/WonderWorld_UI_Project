Feature: [US_036] As an administrator (teacher), I want to access the attendance record of a class for a specific day.

  @36
  Scenario: TC_01 --> US_036 In teacher panel's sidebar,under "Attendance", when "Period Attendance By Date"is clicked,
  should redirect to"reportbydate" page, Class, Section Date box,,Search button visible and active
  and Student List" should display attendance records.

    Given Go to Url "teacherLoginUrl"
    Then Login as teacher
    Then Verifies that under the Attendance menu, the Period Attendance By Date page link should be displayed, and when clicked, it should redirect to the reportbydate page
    And Verifies that on the reportbydate page, there should be a Select Criteria section with Class, Section dropdown menus, a Date box, and a Search button visible and active.
    And Verifies that a Student List should be generated with columns for each student and their respective subjects
    And The Student List should display the attendance records of all students in the selected class for the specified date
    Then Close the page