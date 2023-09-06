Feature: As a user, I should be able to view all fields when I access "My Profile", When entering the Student Panel


  Scenario: TC_01 >> As a user, I should be able to see the fields for Student's name, Admission No, Class, Section, and Gender

    * Open Browser and enter the "studentLoginUrl"
    * Log in as a student
    * Click on the My Profile link
    * Verify that the fields for Student's name, Admission number, Class, Section, and Gender are visible
    * Close browser





  Scenario: TC_02 >> As a user, I should be able to see the buttons for Profile, Fees, Exam, and Documents segments

    * Open Browser and enter the "studentLoginUrl"
    * Log in as a student
    * Click on the My Profile link
    * Verify that the buttons for Profile, Fees, Exam, and Documents are visible
    * Close browser




  Scenario: TC_03 >> As a user, when I select the Profile, Fees, Exam, and Documents sections, I should be able to see the relevant fields

    * Open Browser and enter the "studentLoginUrl"
    * Log in as a student
    * Click on the My Profile link
    * Click on the Fees button
    * Verify that the relevant fields are visible in the Fees section
    * Click on the Profile button
    * Verify that the relevant fields are visible in the Profile section.
    * Click on the Exam button
    * Verify that the relevant fields are visible in the Exam section
    * Click on the Documents button
    * Verify that the relevant fields are visible in the Documents section
    * Close browser