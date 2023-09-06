package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.ParentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;
public class ParentStepdefinition {

    ParentPage parentPage = new ParentPage();
    SoftAssert softAssert;
    Actions actions=new Actions(Driver.getDriver());
    WebDriver driver = Driver.getDriver();

    @Given("Enter parent username {string}")
    public void enter_username(String userName) {
        parentPage.usernameBox.sendKeys(userName);
    }
    @Given("Enter the true password {string}")
    public void enter_the_password(String Password) {
        parentPage.passwordBox.sendKeys(Password);
    }
    @Given("Click the parent Sign In button")
    public void click_the_sign_in_button() {
        parentPage.signInButton.click();
    }
    @Given("Click on the My Profile link on the Parent homepage")
    public void click_on_the_my_profile_link_on_the_parent_homepage() {
        parentPage.myProfileLink.click();
    }
    @Given("Scroll down the page")
    public void scroll_down_the_page() {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,250)");
    }
    @Given("It is verified that Student's Name appears")
    public void it_is_verified_that_student_s_name_appears() {
        Assert.assertTrue(parentPage.studentsNameLabel.isDisplayed());
    }
    @Given("It is verified that Admission No appears")
    public void it_is_verified_that_admission_no_appears() {
        Assert.assertTrue(parentPage.admissionNoLabel.isDisplayed());
    }
    @Given("It is confirmed that Clas appears")
    public void it_is_confirmed_that_clas_appears() {
        Assert.assertTrue(parentPage.classLabel.isDisplayed());
    }
    @Given("Section's appearance is confirmed")
    public void section_s_appearance_is_confirmed() {
        Assert.assertTrue(parentPage.sectionLabel.isDisplayed());
    }
    @Given("Gender is confirmed to appear")
    public void gender_is_confirmed_to_appear() {
        Assert.assertTrue(parentPage.genderLabel.isDisplayed());
    }
    @Given("It is verified that Profile appears")
    public void it_is_verified_that_profile_appears() {
        Assert.assertTrue(parentPage.profileLabel.isDisplayed());
    }
    @Given("It is verified that Fees appear")
    public void it_is_verified_that_fees_appear() {
        Assert.assertTrue(parentPage.feesLabel.isDisplayed());
    }
    @Given("It is verified that the Exam section appears")
    public void it_is_verified_that_the_exam_section_appears() {
        Assert.assertTrue(parentPage.examLabel.isDisplayed());
    }
    @Given("It is verified that the Document appears")
    public void it_is_verified_that_the_document_appears() {
        Assert.assertTrue(parentPage.documentsLabel.isDisplayed());
    }
    @Given("Click on the Profile tab")
    public void click_on_the_profile_tab() {
      parentPage.profileLabel.click();
    }
    @Given("It is verified that the Admission Date appears")
    public void it_is_verified_that_the_appears() {
        Assert.assertTrue(parentPage.admissionDateLabel.isDisplayed());
    }
    @Given("Click on Fees tab")
    public void click_on_fees_tab() {
       parentPage.feesLabel.click();
    }
    @Given("It is verified that the Fees Group appears")
    public void it_is_verified_that_the_fees_group_appears() {
        Assert.assertTrue(parentPage.feesGroupLabel.isDisplayed());
    }
    @Given("Click on the Exam tab")
    public void click_on_the_exam_tab() {
       parentPage.examLabel.click();
    }
    @Given("It is verified that History appears")
    public void it_is_verified_that_appears() {
        Assert.assertTrue(parentPage.examTarihLabel.isDisplayed());
    }
    @Given("Click on the Documents tab")
    public void click_on_the_documents_tab() {
      parentPage.documentsLabel.click();
    }
    @Given("Verifies that No Record Found appears")
    public void verifies_that_no_record_found_appears() {
        String expectedDocumentAlert ="No Record Found";
        System.out.println(parentPage.noRecordFoundLabel.getText());
        Assert.assertTrue(parentPage.noRecordFoundLabel.getText().contains(expectedDocumentAlert));
    }
    @Given("Click on the Fees link on the Parent homepage")
    public void click_on_the_fees_link_on_the_parent_homepage() {
        parentPage.parentPageFeesLink.click();
    }
    @Given("It is verified that Student Fees appears")
    public void it_is_verified_that_student_fees_appears() {
        Assert.assertTrue(parentPage.studentFeesLabel.isDisplayed());
    }
    @Given("Name information is verified to appear")
    public void name_information_is_verified_to_appear() {
        Assert.assertTrue(parentPage.feesPageNameLabel.isDisplayed());
    }
    @Given("Verifies that the Father Name information appears")
    public void verifies_that_the_father_name_information_appears() {
        Assert.assertTrue(parentPage.feesPageFatherNameLabel.isDisplayed());
    }
    @Given("Verifies that Mobile Number information appears")
    public void verifies_that_mobile_number_information_appears() {
        Assert.assertTrue(parentPage.feesPageMobileNumberLabel.isDisplayed());
    }
    @Given("Verifies that Category information appears")
    public void verifies_that_category_information_appears() {
        Assert.assertTrue(parentPage.feesPageCategoryLabel.isDisplayed());
    }
    @Given("Verifies that the class information appears")
    public void verifies_that_the_class_information_appears() {
        Assert.assertTrue(parentPage.feesPageClassLabel.isDisplayed());
    }
    @Given("Verifies that the Admission No appears")
    public void verifies_that_the_admission_no_appears() {
        Assert.assertTrue(parentPage.feesPageAdmissionNoLabel.isDisplayed());
    }
    @Given("Verifies that Roll Number information appears")
    public void verifies_that_roll_number_information_appears() {
        Assert.assertTrue(parentPage.feesPageRollNumberLabel.isDisplayed());
    }
    @Given("Verifies that Fees Group information appears")
    public void verifies_that_fees_group_information_appears() {
        Assert.assertTrue(parentPage.feesPageFeesGroupLabel.isDisplayed());
    }
    @Given("Verifies that Fees Code information appears")
    public void verifies_that_fees_code_information_appears() {
        Assert.assertTrue(parentPage.feesPageFeesCodeLabel.isDisplayed());
    }
    @Given("Verifies that Due Date information appears")
    public void verifies_that_due_date_information_appears() {
        Assert.assertTrue(parentPage.feesPageDueDateLabel.isDisplayed());
    }
    @Given("Verifies that status information appears")
    public void verifies_that_status_information_appears() {
        Assert.assertTrue(parentPage.feesPageStatusLabel.isDisplayed());
    }
    @Given("Verifies that the Amount information appears")
    public void verifies_that_the_amount_information_appears() {
        Assert.assertTrue(parentPage.feesPageAmountLabel.isDisplayed());
    }
    @Given("Verifies that Payment Id information appears")
    public void verifies_that_payment_id_information_appears() {
        Assert.assertTrue(parentPage.feesPagePaymentLabel.isDisplayed());
    }
    @Given("Verifies that Mode information appears")
    public void verifies_that_mode_information_appears() {
        Assert.assertTrue(parentPage.feesPageModeLabel.isDisplayed());
    }
    @Given("Verifies that the datafile appears")
    public void verifies_that_the_datafile_appears() {
        Assert.assertTrue(parentPage.feesPageDateLabel.isDisplayed());
    }
    @Given("Verifies that Discount information appears")
    public void verifies_that_discount_information_appears() {
        Assert.assertTrue(parentPage.feesPageDiscountLabel.isDisplayed());
    }
    @Given("It is verified that Fine information appears")
    public void it_is_verified_that_fine_information_appears() {
        Assert.assertTrue(parentPage.feesPageFineLabel.isDisplayed());
    }
    @Given("Paid information is verified to appear")
    public void paid_information_is_verified_to_appear() {
        Assert.assertTrue(parentPage.feesPagePaidLabel.isDisplayed());
    }
    @Given("Verifies that Balanced information appears")
    public void verifies_that_balanced_information_appears() {
        Assert.assertTrue(parentPage.feesPageBalanceLabel.isDisplayed());
    }
    @Given("Click on the online payment link")
    public void click_on_the_online_payment_link() {
        parentPage.parentPageFeesPayDropdownOnlinePayment.click();
    }
    @Given("Click on Offline Bank Payment button")
    public void click_on_offline_bank_payment_button() {
      parentPage.feesPageOfflineBankPaymentButton.click();
    }

    @Given("Success it is verified that the message Thank You For Yor Payment appears")
    public void success_it_is_verified_that_the_message_thank() {
        Assert.assertTrue(parentPage.parentPageOnlinePaymentSuccesAlert.getText().contains("Thank"));
    }


    @Given("Click on the ofline payment link")
    public void click_on_the_ofline_payment_link() {
     parentPage.parentPageFeesPayDropdownOfflinePayment.click();
    }

    @Given("Enter the date information in the Date of payment text box")
    public void enter_the_date_information_in_the_date_of_payment_text_box() {
        parentPage.parentPageFeesPaymentDateTextbox.sendKeys("04/08/2023");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click();",parentPage.parentPagePaymentModeTextbox);
    }

    @Given("Enter the card number in the payment from text box")
    public void enter_the_card_number_in_the_payment_from_text_box() {
        parentPage.parentPageFeesPaymentFromTextbox.sendKeys("4242424242424242");
    }

    @Given("Enter the amount to be paid in the amount paid text box")
    public void enter_the_amount_to_be_paid_in_the_amount_paid_text_box() {
       parentPage.parentPageFeesAmountTextbox.sendKeys("50");
    }

    @Given("Enter the payment type in the payment mode text box")
    public void enter_the_payment_type_in_the_payment_mode_text_box() {
       parentPage.parentPagePaymentModeTextbox.sendKeys("TestBank");
    }

    @Given("Click on the offline page Save button")
    public void click_on_the_offline_page_save_button() {
       parentPage.parentPageSaveButton.click();
    }

    @Given("Confirmed that the thank you for payment popped up alerts")
    public void confirmed_that_the_thank_you_for_payment_popped_up_alerts() {
     Assert.assertTrue(parentPage.parentPageOfflinePaymentThankYouAlert.getText().contains("Thank"));
    }




    @Then("Login as parent")
    public void login_as_parent() {
        parentPage.parentLoginUsername.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinParentUserName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();


    }
    @Then("Verifies that have access to the Change Username button from the Profile Image")
    public void verifies_that_have_access_to_the_change_username_button_from_the_profile_image() {
        parentPage.parentProfileImage.click();
        parentPage.parentProfileImageChangePassword.click();
        parentPage.parentChangeUsernameTab.click();


    }
    @Then("Verifies that receive an error message indicating that 'the username must contain a minimum of 5 characters'")
    public void verifies_that_receive_an_error_message_indicating_that_the_username_must_contain_a_minimum_of_characters() {
       parentPage.parentCurrentUsername.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinParentUserName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentUserNameInvalid")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentUserNameInvalid")).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        String expectedData="username must contain a minimum of 5 characters";
        String allData=parentPage.parentBody.getText();

        softAssert =new SoftAssert();
        softAssert.assertTrue(allData.contains(expectedData),"username must contain a minimum of 5 characters is Not DISPLAYED");


        //    Assert.assertTrue("username must contain a minimum of 5 characters is Not DISPLAYED",allData.contains(expectedData));

        // Back to origin username:
        parentPage.parentCurrentUsername.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinParentUserNameInvalid"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentUserName")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentUserName")).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        softAssert.assertAll();
    }

    //55-02
    @Then("Verifies that entered a valid username combination,receive a success message 'username has been changed successfully'")
    public void verifiesThatEnteredAValidUsernameCombinationReceiveASuccessMessageUsernameHasBeenChangedSuccessfully() {

        parentPage.parentCurrentUsername.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinParentUserName"))
                .sendKeys(Keys.TAB)
                .sendKeys("nurettinParentUserNameValid").sendKeys(Keys.TAB)
                .sendKeys("nurettinParentUserNameValid").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        String expectedData="username has been changed successfully.";
        String allData=parentPage.parentBody.getText();

        softAssert =new SoftAssert();
        softAssert.assertTrue(allData.contains(expectedData),"username has been changed successfully. is Not DISPLAYED");


        // Back to origin username:
        parentPage.parentCurrentUsername.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinParentUserNameValid"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentUserName")).sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinParentUserName")).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();
        softAssert.assertAll();
    }
    @Given("Verify that the Login button in the home top bar is visible and functional")
    public void verify_that_the_login_button_in_the_home_top_bar_is_visible_and_functional() {
        Assert.assertTrue(parentPage.homeLoginButon.isDisplayed());
        Assert.assertTrue(parentPage.homeLoginButon.isEnabled());
    }
    @Given("Click on the Login button and verify that you have accessed the user login page")
    public void click_on_the_login_button_and_verify_that_you_have_accessed_the_user_login_page() {

        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        parentPage.homeLoginButon.click();
        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();
        String secondWindowHandle ="";

        for (String eachWindowHandle : windowHandleSet
        ) {
            if (!eachWindowHandle.equals(firstPageWindowHandle)){
                secondWindowHandle = eachWindowHandle;
            }
        }
        Driver.getDriver().switchTo().window(secondWindowHandle);
        String expectedUrl = ConfigReader.getProperty("parentLoginUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the User Login text, username and password textboxes and the Sign In button are visible and functional on the left of the User login page.")
    public void verify_that_the_user_login_text_username_and_password_textboxes_and_the_sign_in_button_are_visible_and_functional_on_the_left_of_the_user_login_page() {

        Assert.assertTrue(parentPage.parentUserLoginLabel.isDisplayed());
        Assert.assertTrue(parentPage.parentUsernameBox.isDisplayed());
        Assert.assertTrue(parentPage.parentUsernameBox.isEnabled());
        Assert.assertTrue(parentPage.parentPasswordBox.isDisplayed());
        Assert.assertTrue(parentPage.parentPasswordBox.isEnabled());
        Assert.assertTrue(parentPage.parentSignInButton.isDisplayed());
        Assert.assertTrue(parentPage.parentSignInButton.isEnabled());
    }
    @Given("Verify that the title Whats New is visible on the right on the user login page")
    public void verify_that_the_title_whats_new_is_visible_on_the_right_on_the_user_login_page() {
        Assert.assertTrue(parentPage.whatsNewLabel.isDisplayed());
    }
    @Given("Verify that the subheadings for the What's New heading are visible")
    public void verify_that_the_subheadings_for_the_what_s_new_heading_are_visible() {
        Actions actions = new Actions(Driver.getDriver());

        Assert.assertTrue(parentPage.whatsNewSubHeader1.isDisplayed());
        Assert.assertTrue(parentPage.whatsNewSubHeader2.isDisplayed());

        actions.moveToElement(parentPage.parentLoginScrollBox)
                .scrollToElement(parentPage.whatsNewSubHeader4)
                .perform();

        Assert.assertTrue(parentPage.whatsNewSubHeader3.isDisplayed());
        Assert.assertTrue(parentPage.whatsNewSubHeader4.isDisplayed());
    }

    @Given("Click the Login button on the top bar of the homepage")
    public void click_the_login_button_on_the_top_bar_of_the_homepage() {
        parentPage.homeLoginButon.click();
    }
    @Given("Enter a valid Username and Password in the relevant boxes and click on the Sign In button.")
    public void enter_a_valid_username_and_password_in_the_relevant_boxes_and_click_on_the_sign_ın_button() {
        parentPage.parentUsernameBox.sendKeys(ConfigReader.getProperty("zehraParentUserName"));
        parentPage.parentPasswordBox.sendKeys(ConfigReader.getProperty("zehraPassword"));
        parentPage.parentSignInButton.click();
    }
    @Given("Verify login to the user panel")
    public void click_the_sign_in_button_and_verify_login_to_the_user_panel() {
        String expectedUrl = ConfigReader.getProperty("parentPanelUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Given("Enter invalid Username and Password in the login window")
    public void enter_invalid_username_and_password_in_the_login_window() {
        parentPage.parentUsernameBox.sendKeys(ConfigReader.getProperty("zehraInvalidUserName"));
        parentPage.parentPasswordBox.sendKeys(ConfigReader.getProperty("zehraInvalidPassword"));
    }
    @Given("Click the Sign In button and verify that the {string} warning is visible \\(unable to login to the panel)")
    public void click_the_sign_in_button_and_verify_that_the_warning_is_visible_unable_to_login_to_the_panel(String string) {
        parentPage.parentSignInButton.click();
        Assert.assertTrue(parentPage.parentInvalidLoginLabel.isDisplayed());
        System.out.println(parentPage.parentInvalidLoginLabel.getText());
    }

    @Given("Verify that the Forgot Password link is visible and functional on the user login page that opens")
    public void verify_that_the_forgot_password_link_is_visible_and_functional_on_the_user_login_page_that_opens() {
        Assert.assertTrue(parentPage.forgotPasswordLink.isDisplayed());
        Assert.assertTrue(parentPage.forgotPasswordLink.isEnabled());
    }
    @Given("Click on the Forgot Password link and verify that the Forgot Password page has been entered")
    public void click_on_the_forgot_password_link_and_verify_that_the_forgot_password_page_has_been_entered() {
        parentPage.forgotPasswordLink.click();
        String expectedUrl = ConfigReader.getProperty("ufpaswordUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the Email textbox, student and Parent radio buttons are enabled")
    public void verify_that_the_email_textbox_student_and_parent_radio_buttons_are_enabled() {
        Assert.assertTrue(parentPage.forgotPasswordEmailBox.isEnabled());
    }
    @Given("Enter your email in the textbox, select the panel and click the Submit button")
    public void enter_your_email_in_the_textbox_and_click_the_submit_button() {
        parentPage.forgotPasswordEmailBox.sendKeys(ConfigReader.getProperty("forgotPasswordMail"));
        parentPage.forgotPasswordStudentRadioButton.click();
        parentPage.forgotPasswordSubmitButton.click();
    }
    @Given("Verify that mail was sent to the email")
    public void verify_that_mail_was_sent_to_the_email() {

        String expectedMessage = "Please Check Your Email To Recover Your Password";
        String actualMessage = parentPage.passwordSentLabel.getText();
        System.out.println(actualMessage);
        Assert.assertEquals(expectedMessage,actualMessage);
    }
    @Given("Verify that the User Login link is visible and functional.")
    public void verify_that_the_user_login_link_is_visible_and_functional() {
        Assert.assertTrue(parentPage.userLoginLink.isDisplayed());
        Assert.assertTrue(parentPage.userLoginLink.isEnabled());
    }
    @Given("Click on the User Login link and verify that you have accessed the userlogin page.")
    public void click_on_the_user_login_link_and_verify_that_you_have_accessed_the_userlogin_page() {
        parentPage.userLoginLink.click();
        Assert.assertTrue(parentPage.parentUserLoginLabel.isDisplayed());
    }
    @Given("Verify that the Front Site link is visible and functional.")
    public void verify_that_the_front_site_link_is_visible_and_functional() {
        Assert.assertTrue(parentPage.frontSiteLink.isDisplayed());
        Assert.assertTrue(parentPage.frontSiteLink.isEnabled());
    }
    @Given("Click on the Front Site link and verify that you have accessed the homepage.")
    public void click_on_the_front_site_link_and_verify_that_you_have_accessed_the_homepage() {
        parentPage.frontSiteLink.click();
        String expectedTitle = "Home";
        ReusableMethods.switchToWindow(expectedTitle);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("Click the pay button in the Unpaid student row")
    public void click_the_pay_button_in_the_unpaid_student_row() {
        parentPage.parentPageFeesPayDropdown.click();
    }
    @Given("Click on the Pay With One Pay button")
    public void click_on_the_pay_with_one_pay_button() {
        parentPage.parentPageOnlinePaymentPayWithOnePayButton.click();
    }
    @Given("Click Credit Bank checkbox")
    public void click_credit_bank_checkbox() {
        parentPage.parentPageOnlinePaymentCreditCardCheckbox.click();
    }
    @Given("Enter tester credit card number in the Card number textbox")
    public void enter_tester_credit_card_number_in_the_card_number_textbox() {
        parentPage.parentPageOnlinePaymentCardNumberTextBox.sendKeys(ConfigReader.getProperty("vahdeddinCreditCardNumber"));
    }
    @Given("Enter the tester expiration date in the Expiration Date textbox")
    public void enter_the_tester_expiration_date_in_the_expiration_date_textbox() {
        parentPage.parentPageOnlinePaymentExpDataTextBox.sendKeys(ConfigReader.getProperty("vahdeddinCreditCardExpirationDate"));
    }
    @Given("Enter tester CSC information in CSC textbox")
    public void enter_tester_csc_information_in_csc_textbox() {
        parentPage.parentPageOnlinePaymentCSCTextBox.sendKeys(ConfigReader.getProperty("vahdeddinCreditCardCSC"));
    }
    @Given("Click on the Pay Now button")
    public void click_on_the_pay_now_button() {
        parentPage.parentPageOnlinePaymentPayNowButton.click();
    }




    @Given("Enter related data\\(parent) and click to “Sign In” button")
    public void enter_related_data_parent_and_click_to_sign_in_button() {
        parentPage.usernameBox.sendKeys(ConfigReader.getProperty("batuParentUserName"));
        parentPage.passwordBox.sendKeys(ConfigReader.getProperty("batuPassword"));
        parentPage.signInButton.click();
    }

    @Given("Click to profile image")
    public void click_to_profile_image() {
        parentPage.parentProfileImage.click();
    }
    @Given("Verify that “Change Password” button is visible")
    public void verify_that_change_password_button_is_visible() {

        Assert.assertTrue(parentPage.parentProfileImageChangePassword.isDisplayed());
    }
    @Given("Click “Change Password” button")
    public void click_change_password_button() {
        parentPage.parentProfileImageChangePassword.click();
    }
    @Given("Verify that the link contains “changepass”")
    public void verify_that_the_link_contains_changepass() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("changepass"));
    }





    @Given("Enter Password to “Current Password” textbox")
    public void enter_password_to_current_password_textbox() {
        parentPage.parentChangePasswordCurrentPassTextbox.sendKeys(ConfigReader.getProperty("batuPassword"));
    }
    @Given("Enter invalidPass to “New Password” and “Confirm Password”")
    public void enter_invalid_pass_to_new_password_and_confirm_password() {
        parentPage.parentChangePasswordNewPassTextbox.sendKeys(ConfigReader.getProperty("batuPassword3"));
    }
    @Given("Click “Save” button")
    public void click_save_button() {
        parentPage.parentSignInButton.click();
    }
    @Given("Verify that an error message shows up")
    public void verify_that_an_error_message_shows_up() {
        try {
            Assert.assertTrue(parentPage.parentChangePasswordErrorLabel.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }





    @Given("Enter validPass to “New Password” and “Confirm Password”")
    public void enter_valid_pass_to_new_password_and_confirm_password() {

        parentPage.parentChangePasswordNewPassTextbox.sendKeys(ConfigReader.getProperty("batuPassword2"));


    }



    @Given("The user should see the username and password form on the login page")
    public void the_user_should_see_the_username_and_password_form_on_the_login_page() {

        parentPage.usernameTextbox.isDisplayed();
        parentPage.passwordTextbox.isDisplayed();

    }
    @Given("Login form should have username and password boxes and data entry should be possible.")
    public void login_form_should_have_username_and_password_boxes_and_data_entry_should_be_possible() {

        parentPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ahmetParentUserName"));
        parentPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ahmetParentPassword"));
    }
    @Given("Login form should have login submit button")
    public void login_form_should_have_login_submit_button() {

        parentPage.signInButton.isDisplayed();
    }
    @Given("If the user logs in with incorrect data, they should see the warning message {string}")
    public void ıf_the_user_logs_in_with_incorrect_data_they_should_see_the_warning_message(String string) {

        parentPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ParentLoginWrongUsername"));
        parentPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ahmetParentPassword"));
        parentPage.signInButton.click();
        Assert.assertTrue(parentPage.invalidText.isDisplayed());

        parentPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ahmetParentUserName"));
        parentPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ParentLoginWrongPassword"));
        parentPage.signInButton.click();
        Assert.assertTrue(parentPage.invalidText.isDisplayed());
    }
    @Given("When the user forgets his password, he should be directed to the forgot password page")
    public void when_the_user_forgets_his_password_he_should_be_directed_to_the_forgot_password_page() {

        parentPage.forgotPasswordLink.click();
        String actualurl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "ufpassword";
        Assert.assertTrue(actualurl.contains(expectedUrl));
    }


    @Given("Verify that a succcess message shows up")
    public void verify_that_a_succcess_message_shows_up() {
        try {
            Assert.assertTrue(parentPage.parentChangePasswordSuccessLabel.isDisplayed());
        } catch (Exception e) {
            Assert.assertTrue(false);
        }
    }


}
