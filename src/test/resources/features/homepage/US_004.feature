
  Feature: [US_004] As a student, I want a page on the website where I can view my exam results.

    @US004_TC01
    Scenario: [TC_01->US_004]When the Exam Result menu title on the top bar of the home page is clicked it redirects to
    the Exam Result page and on the Exam Result page, the Admission No and Exam textBoxes are visible and it is verified
    that the data entry is mandatory

      Given  Launch browser and Navigate to "homePageUrl"
      Then Click on Exam Result menu title.
      Then It is verified that it redirects to the Exam Result page.
      When Verify that Admission No and Exam textBox are visible on Exam Result page
      When It is verified that the Admission No and Exam textBoxes are mandatory fields for data entry.
      And  Browser is closed.

    @US004_TC02
    Scenario: [TC_02->US_004] By verifying that there is a Search button that searches according to the data entered
    in the Admission No and Exam textBoxes, when Admission No is written, Exam is selected and Search is clicked,
    the exam results are displayed.

      Given  Launch browser and Navigate to "homePageUrl"
      Then Click on Exam Result menu title.
      When Verifies that the Search button is visible
      When Student Admission No "hilalAdmissionNo" is entered into the Admission No textBox
      When Exam data is selected from Exam "hilalSelectExam" dropdown.
      When Click the Search button
      When Confirmation that the student's exam results are displayed
      And  Browser is closed.

    @US004_TC03
    Scenario: [TC_03->US_004] Display Student Info: Name, Roll No, Admission No, Subject, Max/Min Marks, Obtained Marks,
    Note. Calculate Percentage, Rank, Result, Division, Grand Total.

      Given  Launch browser and Navigate to "homePageUrl"
      Then Click on Exam Result menu title.
      When Verifies that the Search button is visible
      When Student Admission No "hilalAdmissionNo" is entered into the Admission No textBox
      When Exam data is selected from Exam "hilalSelectExam" dropdown.
      When Click the Search button
      Then Verify that the topic is listed with Max Marks, Min Marks, Points Received, Grade headings.
      Then Verifies that Percentage, Rank, Result, Division, Grand Total, Total Obtained Marks are displayed
      Then If the Received Signals data is greater than the Min Signals data, the Result information is verified as Passed, if less than Failed.
      And  Browser is closed.