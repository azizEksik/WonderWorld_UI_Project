Feature: As a user, I should be able to log into the Student Panel with a username and password

  Scenario: TC_01 Kullanıcının, Student Panelde User Login sayfasında hatalı username veya hatalı password girildiğinde "Your password or username invalid"  hata mesajı verdiği doğrulanmalı
    * Open Browser and enter the "studentLoginUrl"
    * "std164Error" incorrect user name is entered
    * Enter the password "wonderworld123False"
    * Click the Sign In button
    * It is verified that the error message "Your password or username invalid" is displayed
    * The browser is closed

  Scenario: TC_02 It should be verified that when the user clicks on the "forgot password" tab on the User Login page in the Student Panel, it redirects to the forgot password page
    * Open Browser and enter the "studentLoginUrl"
    * Click on the Forgot Password link and open the page
    * Type "123" in the Password textBox
    * Click Submit button
    * The error message "Your password should be min 6 char" is displayed
    * The browser is closed