Feature: [US_042] As an administrator (teacher), I want a search box in the teacher panel
  where I can search for students by their names for quick access.


  @42
  Scenario: [TC_01->US_042]in TeacherPanel Student boards in Details View List clicked SearchTextBox ,
  should contain StudentName,Class,AdmissionNo,Date Of Birth,Gender,Local Identification-GuardianName,
  Guardian Phone,Current Address. Show icon->student's profile page

    Given Go to Url "teacherLoginUrl"
    And login as teacher
    Then verifies that there should be a visible Search textBox in the top bar of the Teacher panel
    Then verifies that The Search textBox should have the placeholder text 'Search By Student Name, Roll Number, Enroll Number, National Id, Local Id Etc.
    Then verifies that When a student name is entered into the Search textbox and searched, the matching criteria should display a Student List with columns for Admission List, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, and Action.
    Then verifies that Pagination should be enabled in the Student List to navigate between pages.
    Then verifies that When the student's name is entered into the Search textBox, the corresponding Details View List with student boards should be displayed.
    Then verifies that The student boards in the Details View List should contain Student Name, Class, Admission No, Date Of Birth, Gender, Local Identification Number, Guardian Name, Guardian Phone, and Current Address.
    Then verifies that In the Details View List, a visible and active Show icon should direct to the student's profile page.
    Then verifies that In the Student List, a visible and active Show icon should direct to the student's profile page.

    And Close the page


