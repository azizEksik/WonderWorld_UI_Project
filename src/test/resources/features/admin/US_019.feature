Feature: As an administrator (admin), I want to access and update my profile information.

  @aziz
  Scenario: TC_01 >> Profile icon must be visible in the top bar of the admin panel. Clicking the icon should display account owner's name, role, and links to Profile, Password, and Logout

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * It is verified that the profile icon is visible in the top-left corner of the admin panel
    * When the profile icon is clicked, it is confirmed that the opened window displays the account owner's name, role, and visible links to Profile, Password, and Logout
    * The browser is closed

  @aziz
  Scenario: TC_02 >> When clicking on the Profile link, it should be possible to navigate to the Profile, Payroll, Leaves, Attendance, and Documents pages on the opened page.

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon and profile link in the top-left bar of the admin panel
    * Verify that the Profile page is accessed
    * Confirm that it is possible to navigate to the Profile, Payroll, Leaves, Attendance, and Documents pages on the opened Profile page
    * The browser is closed

  @aziz
  Scenario: TC_03 >> In the Profile page, General Information, Address Details, Bank Account Details, and Social Media Link should be displayed

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon and profile link in the top-left bar of the admin panel
    * Verify that the Profile page is accessed
    * Click on the Profile link on the Profile page
    * Verify that General Information is visible
    * Confirm that Address Details are visible
    * Validate that Bank Account Details are visible
    * Ensure that Social Media Links are visible and clicking on them provides access to the respective social media pages
    * The browser is closed

  @aziz
  Scenario: TC_04 >> Confirmation of information boards (Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction) on the Payroll page, and display of Payslip List (with headers Mont-Year, Date, Mode, Status, Net Salary, Action).

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon and profile link in the top-left bar of the admin panel
    * Verify that the Profile page is accessed
    * Click on the Payroll link
    * Verify that the Total Net Salary Paid information board is visible
    * Confirm that the Total Gross Salary information board is visible
    * Validate that the Total Earning information board is visible
    * Ensure that the Total Deduction information board is visible
    * Confirm that the first column header of the Payslip List is "payslipFirstRowTitle" and it is visible
    * Verify that the second column header of the Payslip List is "payslipSecondRowTitle" and it is visible
    * Validate that the third column header of the Payslip List is "payslipThirdRowTitle" and it is visible
    * Ensure that the fourth column header of the Payslip List is "payslipFourthRowTitle" and it is visible
    * Confirm that the fifth column header of the Payslip List is "payslipFifthRowTitle" and it is visible
    * Verify that the sixth column header of the Payslip List is "payslipSixthRowTitle" and it is visible
    * The browser is closed

  @aziz
  Scenario: TC_05 >> Filtering should be possible within the Paylist on the Payroll page. A search textBox must exist for searching within the Paylist. Clicking on the 'View Payslip' link under the Action heading in the Paylist should display the relevant payslip for that period.

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon and profile link in the top-left bar of the admin panel
    * Verify that the Profile page is accessed
    * Click on the Payroll link
    * Click on the Paylist headers and verify that filtering is applied.
    * Confirm that the search textBox within the Paylist is visible, active, and performs searches when information is entered.
    * Verify that clicking on the View Payslip link under the Action heading displays the corresponding payslip for the relevant period
    * The browser is closed

  @aziz
  Scenario: TC_06 >> On the Leaves page, the Leave List should display menu headers as 'Leave Type, Leave Date, Days, Apply Date, Status, Action,' and they must be visible. Clicking on the view icon under the Action heading on the Leave List should display the relevant leave details.

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon and profile link in the top-left bar of the admin panel
    * Verify that the Profile page is accessed
    * Click on the Leaves link
    * Verify that the Leave List displays menu headers as Leave Type, Leave Date, Days, Apply Date, Status, Action
    * Click on the view icon under the Action heading on the Leave List to display the relevant leave details
    * The browser is closed

  @aziz
  Scenario: TC_07 >> On Attendance page: display info boards (Total Present, Total Late, Total Absent, Total Half Day, Total Holiday). Show symbols' meanings (P, L, A, F, H) for attendance. List staff's monthly and daily attendance. Visible and selectable attendance year

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon and profile link in the top-left bar of the admin panel
    * Verify that the Profile page is accessed
    * Click on the Attendance link.
    * Verify that the information boards display Total Present, Total Late, Total Absent, Total Half Day, Total Holiday
    * Confirm that the explanation of symbols (P, L, A, F, H) used for attendance is visible.
    * Ensure that the attendance list on the Attendance page is visible and listed as Day-Month format.
    * Validate that the attendance year to be displayed is visible and selectable on the Attendance page
    * The browser is closed

  @BuTestiCalistirmayin
  Scenario: TC_08 >> Password" link. Clicking the link must display a page with "Current Password," "New Password," "Confirm Password" textboxes, and a "Change Password" button. Changing the password should be possible by entering valid values in the textboxes and clicking the button

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon in the top left bar of the Admin panel and then click on the Password link
    * Verify that the Current Password textBox is visible
    * Confirm that the New Password textBox is visible
    * Ensure that the Confirm Password textBox is visible
    * Validate that the Change Password button is visible
    * Enter a valid value in the "currentPasswordValidValue" Current Password textBox
    * Enter a valid value in the "newPasswordValidValue" New Password textBox
    * Enter a valid value in the "confirmPasswordValidValue" Confirm Password textBox
    * Click on the Change Password button
    * Confirm that the password has been successfully changed
    * The browser is closed

  @aziz
  Scenario: TC_09 >> When clicking on the profile icon in the top bar of the Admin panel, and then clicking on the "Logout" link in the opened window, the admin account should be logged out from the Admin panel

    * The browser is opened, and the "adminLoginUrl" is navigated to
    * Login is performed as an admin
    * Click on the profile icon in the top left bar of the Admin panel, and then click on the Logout link
    * Verify that the logout is successful
    * The browser is closed