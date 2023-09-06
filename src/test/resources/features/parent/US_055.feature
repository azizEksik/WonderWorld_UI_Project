Feature: [US_055] As a user, I should be able to change my username from the student page When entering the Parent Panel

@55-1
  Scenario: [TC01->US_055] The user clicking on "Change Username", user's new username should be at least 5 characters
  long. If the user enters an invalid username combination, they should receive an error message "username must contain min 5 characters"

    Given Go to Url "parentLoginUrl"
    Then Login as parent
    Then Verifies that have access to the Change Username button from the Profile Image
    Then Verifies that receive an error message indicating that 'the username must contain a minimum of 5 characters'
    And Close the page

@55-2
  Scenario: [TC02->US_055] The user Clicking on the "Change Username", If the user enters a valid username combination,
  they should receive a success message stating that their 'username has been changed successfully'

    Given Go to Url "parentLoginUrl"
    Then Login as parent
    Then Verifies that have access to the Change Username button from the Profile Image
    Then Verifies that entered a valid username combination,receive a success message 'username has been changed successfully'
    And Close the page