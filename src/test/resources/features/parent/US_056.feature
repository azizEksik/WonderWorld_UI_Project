Feature: As a user, I should be able to view all fields when I access "My Profile" When entering the Parent Panel

  Scenario: US_01 After logging into the Parent Panel as a user, it must be verified that the user sees the Student's name, Admission No, Class, Section, and Gender sections on the "My Profile" page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the My Profile link on the Parent homepage
    * Scroll down the page
    * It is verified that Student's Name appears
    * It is verified that Admission No appears
    * It is confirmed that Clas appears
    * Section's appearance is confirmed
    * Gender is confirmed to appear
    * Browser is closed

  Scenario: US_02 After logging in to the Parent Panel as a user, it must be verified that the user sees the Profile, Fees, Exam, and Documents segments on the "My Profile" page
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the My Profile link on the Parent homepage
    * Scroll down the page
    * It is verified that Profile appears
    * It is verified that Fees appear
    * It is verified that the Exam section appears
    * It is verified that the Document appears
    * Browser is closed

  Scenario: US_03 After logging into the Parent Panel as a user, it must be verified that the user sees the relevant section when clicking on the Profile link on the "My Profile" page
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the My Profile link on the Parent homepage
    * Scroll down the page
    * Click on the Profile tab
    * It is verified that the Admission Date appears
    * Browser is closed

  Scenario: US_04 After logging into the Parent Panel as a user, it must be verified that the user sees the relevant section when the Fees link is clicked on the My Profile page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the My Profile link on the Parent homepage
    * Scroll down the page
    * Click on Fees tab
    * It is verified that the Fees Group appears
    * Browser is closed

  Scenario: US_05 After logging into the Parent Panel as a user, it must be verified that the user sees the relevant section when the Exam link is clicked on the My Profile page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the My Profile link on the Parent homepage
    * Scroll down the page
    * Click on the Exam tab
    * It is verified that History appears
    * Browser is closed

  Scenario: US_06 After logging into the Parent Panel as a user, it should be verified that the user sees the relevant section when the Documents link is clicked on the My Profile page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the My Profile link on the Parent homepage
    * Scroll down the page
    * Click on the Documents tab
    * Verifies that No Record Found appears
    * Browser is closed