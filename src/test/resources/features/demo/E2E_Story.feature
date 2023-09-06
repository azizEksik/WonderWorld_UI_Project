Feature: E2E Story

  @demo
  Scenario: TC_01
    # Online Admission
    * Open the browser and go to the "homePageUrl"
    * Click on the Online Admission menu title (demo)
    * Relevant data are entered into the textBoxes on the Online Admission page (demo)
    * Student photo uploaded (demo)
    * Guardian Photo uploaded (demo)
    * Upload documents related to the registration to the Upload Documents window (demo)
    * Click on Submit Button (demo)

    # Admin Submits the student
    * Go to the "adminLoginUrl"
    * Login as admin "berkeAdminUserName" and "berkePassword"
    * Click Student Information Menu than Online Admission button
    * Search student
    * Click Edit and Enroll Button
    * Enter Admission No and Fee Details than click Save and Enroll Button
    * Take parents username and password of this student

    # Payment
    * Go to the "parentLoginUrl"
    * Enter parent username
    * Enter the parent password
    * Click the parent Sign In button (demo)
    * Click on the Fees link on the Parent homepage (demo)
    * Click the pay button in the Unpaid student row (demo)
    * Click on the online payment link (demo)
    * Click on the Pay With One Pay button (demo)
    * Click Credit Bank checkbox (demo)
    * Enter tester credit card number in the Card number textbox (demo)
    * Enter the tester expiration date in the Expiration Date textbox (demo)
    * Enter tester CSC information in CSC textbox (demo)
    * Click on the Pay Now button (demo)
    * Close the browser.





