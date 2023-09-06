Feature: As a user, I should be able to access the Fees page and make necessary changes When entering the Parent Panel

  Scenario:TC_01 After logging into the Parent Panel as a user, it should be verified that the "Students Fees" header text appears on the fees page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the Fees link on the Parent homepage
    * It is verified that Student Fees appears
    * The browser is closed

  Scenario: TC_02 After logging into the Parent Panel as a user, it should be verified that Name, Father Name, Mobile Number, Category, Class, Admission No, and Roll Number appear on the Fees page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the Fees link on the Parent homepage
    * Name information is verified to appear
    * Verifies that the Father Name information appears
    * Verifies that Mobile Number information appears
    * Verifies that Category information appears
    * Verifies that the class information appears
    * Verifies that the Admission No appears
    * Verifies that Roll Number information appears
    * The browser is closed

  Scenario: TC_03 After logging into the Parent Panel as a user, it should be verified that the Fees Group, Fees Code, Due Date, Status, Amount, Payment Id, Mode, Date, Discount, Fine, Paid, Balanced fields appear on the Fees page.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the Fees link on the Parent homepage
    * Verifies that Fees Group information appears
    * Verifies that Fees Code information appears
    * Verifies that Due Date information appears
    * Verifies that status information appears
    * Verifies that the Amount information appears
    * Verifies that Payment Id information appears
    * Verifies that Mode information appears
    * Verifies that the datafile appears
    * Verifies that Discount information appears
    * It is verified that Fine information appears
    * Paid information is verified to appear
    * Verifies that Balanced information appears
    * The browser is closed

  Scenario:TC_04 As a user, after selecting Online Paymen from the Pay segment on the Fees page in the Parent Panel and performing the payment transactions, the message "Success! Thank You For Yor Payment." message should be confirmed to appear
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the Fees link on the Parent homepage
    * Click the pay button in the Unpaid student row
    * Click on the online payment link
    * Click on the Pay With One Pay button
    * Click Credit Bank checkbox
    * Enter tester credit card number in the Card number textbox
    * Enter the tester expiration date in the Expiration Date textbox
    * Enter tester CSC information in CSC textbox
    * Click on the Pay Now button
    * Success it is verified that the message Thank You For Yor Payment appears
    * The browser is closed

  Scenario: TC_05 After logging into the Parent Panel as a user, you should be able to select unpaid student on the Fees page, and it should be verified that you can select Offline Bank Payment from the Pay segment and perform payment transactions.
    * Open Browser and enter the "parentLoginUrl"
    * Enter parent username "parent164"
    * Enter the true password "wonderworld123"
    * Click the parent Sign In button
    * Click on the Fees link on the Parent homepage
    * Click the pay button in the Unpaid student row
    * Click on the ofline payment link
    * Enter the date information in the Date of payment text box
    * Enter the payment type in the payment mode text box
    * Enter the card number in the payment from text box
    * Enter the amount to be paid in the amount paid text box
    * Click on the offline page Save button
    * Confirmed that the thank you for payment popped up alerts
    * The browser is closed
