Feature:

  @batu50
  Scenario: TC_001 Verifying visibility and enability and function of “Change Password” button from Profile Image


  * Go to url "parentLoginUrl"
  * Enter related data(parent) and click to “Sign In” button
  * Click to profile image
  * Verify that “Change Password” button is visible
  * Click “Change Password” button
  * Verify that the link contains “changepass”
  * Close the browser

  @batu5
  Scenario: TC_002 Verifying when the user enters an invalid password combination; if they receive an error message

    *  Go to url "parentLoginUrl"

  * Enter related data(parent) and click to “Sign In” button
  * Click to profile image
  * Click “Change Password” button
  * Enter Password to “Current Password” textbox
  * Enter invalidPass to “New Password” and “Confirm Password”
  * Click “Save” button
  * Verify that an error message shows up
  * Close the browser

  @batu5
  Scenario: TC_003 Verifying when the user enters an valid password combination; if they receive a succes message


    * Go to url "parentLoginUrl"

  * Enter related data and click to “Sign In” button
  * Click to profile image
  * Click “Change Password” button
  * Enter Password to “Current Password” textbox
  * Enter validPass to “New Password” and “Confirm Password”
  * Click “Save” button
  * Verify that a succcess message shows up
  * Close the browser
