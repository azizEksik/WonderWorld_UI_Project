@parent
  Feature: As a user, I should be able to log into the Parent Panel with a username and password.

    Scenario: TC_01 As a User, I should be able to login to the Parent Panel page and be able to login with username and password.

      * Open the browser and go to the "parentLoginUrl"
     * The user should see the username and password form on the login page
     * Login form should have username and password boxes and data entry should be possible.
     * Login form should have login submit button
     * If the user logs in with incorrect data, they should see the warning message "The username or password incorrect"
     * When the user forgets his password, he should be directed to the forgot password page
     *  Close the browser.