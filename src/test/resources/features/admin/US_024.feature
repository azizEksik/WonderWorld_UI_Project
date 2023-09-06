
Feature: As an administrator (admin), I want to view students' payments, receive payments, or cancel payments if necessary.
  Scenario: TC_01 As an administrator, I should be able to view, receive or cancel payments made by students.

    * Open the browser and go to the "adminLoginUrl"
    * In the sidebar in the admin panel, the Collect Fees page link should be displayed under the Fees Collection menu title and when clicked, it should redirect to the studentfee page.
    * Select the Class section and click Search and Collect Fees. Student Fess list titles should be displayed.
    * USD EUR is exchanged in the top bar of the admin panel, it should be seen that the fees in the Student Fees list change according to the selection.
    * Payment should be entered from the window opened by clicking under the Action title of the payment whose Status in the Student Fees list is Unpaid.
    * The payment made can be reversed by clicking the Revert icon under the Action heading of the payment whose Status in the Student Fees list is Paid.
    * The payment made and the remaining payment total in the Student Fees list should be displayed.
    * Browser is closed