
@std
  Feature: As a user, I should be able to access the Teacher Reviews page and view the relevant fields,
           make changes, and provide ratings  When entering the Student Panel

    Scenario: TC_01 After logging into the Student Panel as a user, I should be able to access the Teacher Reviews Page,
              see the relevant fields, and make changes.

      * Open the browser and go to the "parentLoginUrl"
      * After logging into the Teacher Reviews Page as a user, I should be able to see the "Teacher Reviews" header text
      * Time I select a teacher as a user, I should be able to vote for the selected teacher
      * Browser is closed