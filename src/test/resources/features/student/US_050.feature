Feature: [US_050] As a user, I should be able to access the "Attendance" page and view the attendance details  When entering the Student Panel


  @50
  Scenario: [TC_01->US_050] User should be able to see "Attendance" header text,
  select a date and list the attendances for that date,view column fields.

    Given Go to Url "studentLoginUrl"
    Then Login as student
    And Verifies that Attendance is visible anc click
    And Verifies that select a date and list the attendances for that date
    And Verifies that view column fields
    Then Close the page

