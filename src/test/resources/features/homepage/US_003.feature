
Feature: [US_003] As a user, I want an Online Admission page on the homepage so that I can enroll in the school online

  @US003_TC01
  Scenario: [TC_01 -> US_003] Clicking on the Online Admission menu title at the top of the home page confirms that it
  leads to the 'Online Admission' page and that the school registration criteria are visible in the Instructions
  window on the Online Admission page.

    Given  Launch browser and Navigate to "homePageUrl"
    Then  It is verified that the Online Admission menu title on the homepage is visible and functional.
    When  Click on the Online Admission menu title.
    When It is verified that the school enrollment criteria are visible in the Instructions window on the Online Admission page.
    Given  Close the browser

  @US003_TC02
  Scenario: [TC_02 -> US_003] It is verified that Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number,
  Email TextBoxes can be entered, photos can be uploaded for Student, and Class, First Name, Gender, Date Of Birth
  TextBoxes are mandatory fields.

    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    Then Verify that Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email TextBoxes are visible and data can be entered
    When It is verified that Class, First Name, Gender, Date Of Birth TextBoxes are required fields.
    Given Close the browser

  @US003_TC03
  Scenario: [TC_03 -> US_003] In the Parent Detail window on the Online Admission page, it is verified that
  the Father Name and Mother Name TextBoxes are visible and data can be entered.

    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    Then Getting Parent Detail Verifies that Father Name, Mother Name TextBoxes are visible and data can be entered
    Given  Close the browser

  @US003_TC04
  Scenario: [TC_04 -> US_003]Verifies that the P. Name, P. Relationship, P. Email, P. Phone, P. Profession, P. Address
  TextBoxes are visible, if Guardian, P. Name, P. Relationship, TextBoxes are It is verified that If Guardian
  Is, Guardian Name, Guardian Relation, and TextBoxes are mandatory fields. fields, photo can be
  uploaded,and radio button can be selected

    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    When Verify that the Guardian: Name, Relation, Email, Phone, Occupation, Address TextBoxes are visible.
    When It is verified that If Guardian Is, Guardian: Name, Relation, and TextBoxes are required fields.
    When Verify that the Father, Mother, Other radio buttons are visible and selectable.
    Given  Close the browser

  @US003_TC05
  Scenario: [TC_05 -> US_003] In the Miscellaneous Details window on the Online Admission page, it is verified that
  the National Identification Number, Previous School Details TextBoxes are visible and data can be entered.

    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    Then Verify that National Identification Number, Previous School Details TextBoxes are visible and data-enterable
    Given  Close the browser

  @US003_TC06
  Scenario:[TC_06 -> US_003] The Upload Documents window on the Online Admission page verifies that various documents
  related to the registration can be uploaded.

    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    When Relevant data are entered into the textBoxes on the Online Admission page
    When Student photo uploaded
    When Guardian Photo uploaded
    When Upload documents related to the registration to the Upload Documents window.
    When Click on Submit Button
    When Verify photo upload for Student
    When Verify photo upload for Guardian
    Given Close the browser


  @US003_TC07
  Scenario: [TC_07->US_003]When data is entered in the textBoxes and Submit is clicked, it is verified that it is
  directed to the Review Entered Details and Status page, Reference No is created, Form Status is Not Submitted
  and Application Date is 'registration date'

    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    When Relevant data are entered into the textBoxes on the Online Admission page
    When Local saves the date.
    When Click on Submit Button
    When Verifies that it is redirected to the Review Entered Details and Status page
    Then Verifies that a Reference Number has been created on behalf of the student
    Then Verifies that Form Status is "Not Submitted"
    When Verify that Application Date In is The date the registration was created on the Online Admission page
    Given  Close the browser

  @US003_TC08
  Scenario: [TC_08->US_003] Verify that the information on the Review Entered Details and Status page is the
  information entered on the Online Admission page.
    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    When Relevant data are entered into the textBoxes on the Online Admission page
    When Click on Submit Button
    When Verify that the information on the Review Entered Details and Status page is the information entered on the Online Admission page.
    Given  Close the browser

  @US003_TC09
  Scenario: [TC_09->US_003]I Agree To The Terms And Conditions can be clicked when I Agree To The Terms And Conditions
  is checked and Submit is clicked it is confirmed that the message Form Has Been Submitted Successfully...!!
  appears and the Form Status is Submitted
    Given Launch browser and Navigate to "homePageUrl"
    Then Click on the Online Admission menu title.
    When Relevant data are entered into the textBoxes on the Online Admission page
    When Click on Submit Button
    Then Verify that the I Agree To The Terms And Conditions checkBox is visible and clickable.
    Then I accept the Terms and Conditions checkBox is ticked.
    When Click on Second Submit Button
    When Form Has Been Submitted Successfully..!! Confirmation that the message appears.
    Then Verifies that Form Status is "Submitted" Label.
    Given Close the browser