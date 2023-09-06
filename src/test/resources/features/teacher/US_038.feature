@teacher
Feature: As an administrator (teacher), I want a feature that allows me to send notification emails to everyone registered in the school system.

  Scenario: TC_01 As an administrator (teacher), I would like to have a feature where I can send notification e-mails to everyone registered in the school system.

    * Open the browser and go to the "teacherLoginUrl"
    * Send Email should be displayed under the Communicate heading in the sidebar in the Teacher panel and when clicked it should redirect to the compose page.
    * Email Template dropdown menu and Title and Message textBoxes should be visible and functional on Send Email page.
    * Group should be selected as the recipient of the prepared message.
    * Individual groups can be selected as the recipient of the prepared message and people from that group can be added among the recipients.
    * The recipients added in the Individual window should be deleted from the list by clicking the delete icon.
    * Class options should be selected as the recipient of the prepared message.
    * In the Today's Birtday window, people who were born on that date registered in the system should be automatically displayed and selected in the window.
    * On the Send Email page, Send Now or Schedule radio buttons and Submit button should be visible and active.
    * Schedule radio button should be clicked to select a future date when the message can be sent.
    * Submit button should be clicked and the prepared message should be sent to the selected recipients at the desired time.
    * Browser is closed.