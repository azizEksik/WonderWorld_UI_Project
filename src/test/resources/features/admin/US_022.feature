

Feature: As an administrator (admin), I want a chat section in my panel to be able to communicate with company employees.

 Scenario: TC_01 As an administrator (admin), it should be verified that it is possible to view multi-class students
           and add or delete multi-class students.

  * Open the browser and go to the "adminLoginUrl"
  * In the sidebar in the admin panel, the Multi Class Student page link should be displayed under the Student Information menu title.
  * Time the Multi Class Student page link is clicked, the multiclass page should be displayed.
  * On the multiclass page, the Class and Section textBoxes that can be searched among the students in the school and the Search button should be displayed and it should be seen that students can be searched and students are listed.
  * A new class can be added by clicking the (+) icon in the window of the student selected for update among the listed students.
  * The class can be deleted by clicking the remove button in the window of the student selected for update among the listed students.
  * Save the changes made by clicking the update button.
  * Browser must be closed.