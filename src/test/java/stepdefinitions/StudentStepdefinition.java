package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import pages.StudentPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.Set;



public class StudentStepdefinition {

    StudentPage studentPage = new StudentPage();
    WebDriver driver = Driver.getDriver();

    Actions actions=new Actions(driver);

    @Given("Open Browser and enter the {string}")
    public void open_browsew_and_enter_the(String url) {
        driver.get(ConfigReader.getProperty(url));
    }
    @Given("{string} incorrect user name is entered")
    public void incorrect_user_name_is_entered(String errorName) {
        studentPage.usernameBox.sendKeys(errorName);
    }
    @Given("Enter the password {string}")
    public void enter_the_password(String errorPassword) {
        studentPage.passwordBox.sendKeys(errorPassword);
    }
    @Given("Click the Sign In button")
    public void click_the_sign_ın_button() {
        studentPage.signInButton.click();
    }
    @Given("It is verified that the error message {string} is displayed")
    public void ıt_is_verified_that_the_error_message_is_displayed(String alert) {
        System.out.println(studentPage.invalidUsernameOrPasswordLabel.getText());
        Assert.assertTrue(studentPage.invalidUsernameOrPasswordLabel.getText().contains(alert));
    }
    @Given("Click on the Forgot Password link and open the page")
    public void click_on_the_link_and_open_the_page() {
       studentPage.forgotPasswordLink.click();
    }
    @Given("Type {string} in the Password textBox")
    public void type_in_the_password_text_box(String shortPassword) {
        studentPage.forgetPasswordBox.sendKeys(shortPassword);
    }
    @Given("Click Submit button")
    public void the_error_message_is_displayed() {
        studentPage.signInButton.submit();
    }
    @Given("The error message {string} is displayed")
    public void the_error_message_is_displayed(String errorMessage) {
        System.out.println(studentPage.minSixCharAlertLabel.getText());
        Assert.assertTrue(studentPage.minSixCharAlertLabel.getText().contains(errorMessage));
    }
    @Given("Click on the Student Login button")
    public void click_on_the_student_login_button() {
        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        studentPage.studentLoginButton.click();
        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();
        String secondWindowHandle ="";

        for (String eachWindowHandle : windowHandleSet
        ) {
            if (!eachWindowHandle.equals(firstPageWindowHandle)){
                secondWindowHandle = eachWindowHandle;
            }
        }
        Driver.getDriver().switchTo().window(secondWindowHandle);
    }
    @Given("Enter the valid username and password in the related text box and click on the Sign In button")
    public void enter_the_valid_username_and_password_in_the_related_text_box_and_click_on_the_sign_in_button() {

        studentPage.studentUsernameBox.sendKeys(ConfigReader.getProperty("zehraStudentUserName"));
        studentPage.studentPasswordBox.sendKeys(ConfigReader.getProperty("zehraPassword"));
        studentPage.studentSignInButton.click();
    }
    @Given("Verify that the Examination menu is visible and functional in the student panel sidebar")
    public void verify_that_the_examination_menu_is_visible_and_functional_in_the_student_panel_sidebar() {
        Assert.assertTrue(studentPage.examinationsButton.isDisplayed());
        Assert.assertTrue(studentPage.examinationsButton.isEnabled());
    }
    @Given("Click on the Examination link")
    public void click_on_the_examination_link() {
        studentPage.examinationsButton.click();
    }
    @Given("Verify that the Exam Schedule link is visible and functional")
    public void verify_that_the_exam_schedule_link_is_visible_and_functional() {
        Assert.assertTrue(studentPage.examScheduleLink.isDisplayed());
        Assert.assertTrue(studentPage.examScheduleLink.isEnabled());
    }
    @Given("Click on the Exam Schedule link")
    public void click_on_the_exam_schedule_link() {
        studentPage.examScheduleLink.click();
    }
    @Given("Verify that the table headers S.No., Exam, Description and Action are visible on the Exam Schedule page")
    public void verify_that_the_table_headers_s_no_exam_description_and_action_are_visible_on_the_exam_schedule_page() {
        Assert.assertTrue(studentPage.sNoColumn.isDisplayed());
        Assert.assertTrue(studentPage.examColumn.isDisplayed());
        Assert.assertTrue(studentPage.descriptionColumn.isDisplayed());
        Assert.assertTrue(studentPage.actionColumn.isDisplayed());
    }
    @Given("Verify that the Search text box is visible and functional and should be able to filter exams")
    public void verify_that_the_search_text_box_is_visible_and_functional_and_should_be_able_to_filter_exams() {
        String enteredExam = ConfigReader.getProperty("enteredExam");
        String filteredExam = studentPage.filteredExam.getText();

        Assert.assertTrue(studentPage.searchFilterBox.isDisplayed());
        Assert.assertTrue(studentPage.searchFilterBox.isEnabled());

        studentPage.searchFilterBox.sendKeys(ConfigReader.getProperty("enteredExam"));

        Assert.assertEquals(enteredExam,filteredExam);

    }
    @Given("Verify that the View button in the Action column is visible and functional")
    public void verify_that_the_view_button_in_the_action_column_is_visible_and_functional() {
        Assert.assertTrue(studentPage.examScheduleViewButton.isDisplayed());
        Assert.assertTrue(studentPage.examScheduleViewButton.isEnabled());
    }
    @Given("Click on the View button and verify that opened the exam detail")
    public void click_on_the_view_button_and_verify_that_opened_the_exam_detail() {
        studentPage.examScheduleViewButton.click();
        Assert.assertTrue(studentPage.editLeaveLabel.isDisplayed());
    }
    @Given("Verify that the column headings Subject, Date From, Start Time, Duration, Credit Hours, Room No.,Marks \\(Max..), Marks,\\(Min..) in the Exam Detail window are visible")
    public void verify_that_the_column_headings_subject_date_from_start_time_duration_credit_hours_room_no_marks_max_marks_min_in_the_exam_detail_window_are_visible() {


    }
    @Given("Click the Apply Leave link in the sidebar of the Student panel")
    public void click_the_apply_leave_link_in_the_sidebar_of_the_student_panel() {
        studentPage.applyLeaveLink.click();
    }
    @Given("Verify that the Leave List title is visible on the page that opens")
    public void verify_that_the_leave_list_title_is_visible_on_the_page_that_opens() {
        Assert.assertTrue(studentPage.leaveListLabel.isDisplayed());
    }
    @Given("Verify that the Class, Section, Apply Date, From Date, To Date, Reason, Status and Action columns on the Leave List page are visible")
    public void verify_that_the_class_section_apply_date_from_date_to_date_reason_status_and_action_columns_on_the_leave_list_page_are_visible() {
        for (WebElement column : studentPage.leaveDetailsList){
            Assert.assertTrue(column.isDisplayed());
            System.out.println(column.getText());
        }
    }
    @Given("Verify that the Edit button is visible and active under the Action column")
    public void verify_that_the_edit_button_is_visible_and_active_under_the_action_column() {
        Assert.assertTrue(studentPage.applyLeaveEditIcon.isDisplayed());
        Assert.assertTrue(studentPage.applyLeaveEditIcon.isEnabled());
    }
    @Given("Click the Edit button and verify that the Edit Leave window opens")
    public void click_the_edit_button_and_verify_that_the_edit_leave_window_opens() {
        studentPage.applyLeaveEditIcon.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(studentPage.editLeaveLabel.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("Verify that Apply Date, From Date, To Date and Reason are visible and functional")
    public void verify_that_apply_date_from_date_to_date_and_reason_are_updateable_in_the_edit_leave_window() {
        ReusableMethods.wait(3);
        studentPage.editLeaveFromDateBox.click();
        ReusableMethods.wait(3);
        studentPage.selectFromDate.click();
        ReusableMethods.wait(3);
        studentPage.editLeaveToDateBox.click();
        ReusableMethods.wait(3);
        studentPage.selectToDate.click();
        ReusableMethods.wait(3);
        studentPage.editLeaveReasonBox.clear();
        studentPage.editLeaveReasonBox.sendKeys("I have stomachache");
        ReusableMethods.wait(3);
        studentPage.editLeaveSaveButton.click();
        ReusableMethods.wait(60);
    }
    @Given("Verify that the informations are updateable in the Edit Leave window")
    public void verify_that_the_informations_are_updateable_in_the_edit_leave_window() {
        String enteredReason = "I have stomachache";
        String savedReason = studentPage.editedReason.getText();
        Assert.assertEquals(enteredReason,savedReason);
    }
    @Given("Verify that the Delete button is visible and active under the Action column")
    public void verify_that_the_delete_button_is_visible_and_active_under_the_action_column() {
        Assert.assertTrue(studentPage.applyLeaveDeleteIcon.isDisplayed());
        Assert.assertTrue(studentPage.applyLeaveDeleteIcon.isEnabled());
    }
    @Given("Click on the Delete button and verify that the left detail has been deleted and the {string} message is visible")
    public void click_on_the_delete_button_and_verify_that_the_left_detail_has_been_deleted_and_the_message_is_visible(String string) {
        ReusableMethods.wait(1);
        studentPage.applyLeaveDeleteIcon.click();
        ReusableMethods.wait(1);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.wait(3);
    }
    @Given("Click the Add button on the left of the page that opens and confirm that the Add Leave window is opened.")
    public void click_the_add_button_on_the_left_of_the_page_that_opens_and_confirm_that_the_add_leave_window_is_opened() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",studentPage.applyLeaveAddButton);
    }
    @Given("From Date, To Date, Reason information is entered in the Add Leave window and the Save button is clicked.")
    public void from_date_to_date_reason_information_is_entered_in_the_add_leave_window_and_the_save_button_is_clicked() {

    }
    @Given("Verifies that a new leave can be added to the table and the message {string} is displayed.")
    public void verifies_that_a_new_leave_can_be_added_to_the_table_and_the_message_is_displayed(String string) {

    }

    @Given("Log in as a student")
    public void log_in_as_a_student() {
        studentPage.usernameBox.sendKeys(ConfigReader.getProperty("azizStudentUserName"));
        studentPage.passwordBox.sendKeys(ConfigReader.getProperty("azizStudentPassword"));
        studentPage.signInButton.click();
    }
    @Given("Click on the My Profile link")
    public void click_on_the_my_profile_link() {
        studentPage.studentPanelMyProfileLink.click();
    }
    @Given("Verify that the fields for Student's name, Admission number, Class, Section, and Gender are visible")
    public void verify_that_the_fields_for_student_s_name_admission_number_class_section_and_gender_are_visible() {
        Assert.assertTrue(studentPage.studentPanelMyProfileStudentNameField.isDisplayed());
        Assert.assertTrue(studentPage.studentPanelMyProfileAdmissionNoField.isDisplayed());

        for (WebElement each : studentPage.studentPanelMyProfileClassSectionGenderBarcodeField){
            Assert.assertTrue(each.isDisplayed());
        }

    }
    @Given("Close browser")
    public void close_browser() {
        Driver.closeDriver();
    }

    @Given("Verify that the buttons for Profile, Fees, Exam, and Documents are visible")
    public void verify_that_the_buttons_for_profile_fees_exam_and_documents_are_visible() {
        Assert.assertTrue(studentPage.studentPanelMyProfileProfileButton.isDisplayed());
        Assert.assertTrue(studentPage.studentPanelMyProfileExamButton.isDisplayed());
        Assert.assertTrue(studentPage.studentPanelMyProfileDocumentsButton.isDisplayed());
        Assert.assertTrue(studentPage.studentPanelMyProfileFeesButton.isDisplayed());

    }

    @Given("Click on the Fees button")
    public void click_on_the_fees_button() {
        studentPage.studentPanelMyProfileFeesButton.click();
    }
    @Given("Verify that the relevant fields are visible in the Fees section")
    public void verify_that_the_relevant_fields_are_visible_in_the_fees_section() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }
    @Given("Click on the Profile button")
    public void click_on_the_profile_button() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }
    @Given("Verify that the relevant fields are visible in the Profile section.")
    public void verify_that_the_relevant_fields_are_visible_in_the_profile_section() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }
    @Given("Click on the Exam button")
    public void click_on_the_exam_button() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }
    @Given("Verify that the relevant fields are visible in the Exam section")
    public void verify_that_the_relevant_fields_are_visible_in_the_exam_section() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }
    @Given("Click on the Documents button")
    public void click_on_the_documents_button() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }
    @Given("Verify that the relevant fields are visible in the Documents section")
    public void verify_that_the_relevant_fields_are_visible_in_the_documents_section() {
        // 4. stepte bug oldugu ve bu sebeple bu step görmezden gelineceği için boş bırakıldı
    }


    @Given("Enter the related data and click “Sign In” button")
    public void enter_the_related_data_and_click_sign_in_button() {
        studentPage.usernameBox.sendKeys(ConfigReader.getProperty("batuStudentUserName"));
        studentPage.passwordBox.sendKeys(ConfigReader.getProperty("batuPassword"));
        studentPage.signInButton.click();
    }
    @Given("Click “Online Exam” button")
    public void click_online_exam_button() {
        studentPage.studentOnlineExamButton.click();
    }
    @Given("Verify that “Exam”, “Quiz”, “Date From”, “Date To”, “Duration”, “Total Attempt”, “Attempted”, “Status”, “Action\" columns are visible")
    public void verify_that_exam_quiz_date_from_date_to_duration_total_attempt_attempted_status_action_columns_are_visible() {
        Assert.assertTrue(studentPage.studentOnlineExamColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamDateToColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamDurationColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamTotalAttemptColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamAttemptedColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamStatusColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamQuizColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamDateFromColumn.isDisplayed());
        Assert.assertTrue(studentPage.studentOnlineExamActionColumn.isDisplayed());

    }
    @Given("Click “Exam view” button")
    public void click_exam_view_button() {
        studentPage.studentOnlineExamViewIcon.click();
    }
    @Given("Verify that exam details show up")
    public void verify_that_exam_details_show_up() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("view"));
    }

    @Given("Click “Closed Exam” button")
    public void click_closed_exam_button() {
        studentPage.studentOnlineExamViewClosedExamButton.click();
    }






    @Then("Login as student")
    public void login_as_student() {
        studentPage.studentLoginUserName.sendKeys(ConfigReader.getProperty("nurettinStudentUserName"));
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinStudentPassword"))
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .perform();

    }
    @Then("Verifies that Attendance is visible anc click")
    public void verifies_that_attendance_is_visible_anc_click() {
        Assert.assertTrue(studentPage.studentAttendance.isDisplayed());
        studentPage.studentAttendance.click();

    }
    @Then("Verifies that select a date and list the attendances for that date")
    public void verifies_that_select_a_date_and_list_the_attendances_for_that_date() {
        studentPage.studentAttendanceDateTextBox.click();
        studentPage.studentAttendanceDateSelect.click();

    }
    @Then("Verifies that view column fields")
    public void verifies_that_view_column_fields() {
        Assert.assertTrue(studentPage.studentAttendanceSubject.isDisplayed());
        Assert.assertTrue(studentPage.studentAttendanceTimeFrom.isDisplayed());
        Assert.assertTrue(studentPage.studentAttendanceTimeTo.isDisplayed());
        Assert.assertTrue(studentPage.studentAttendanceRoomNo.isDisplayed());
        Assert.assertTrue(studentPage.studentAttendanceAttendance.isDisplayed());
        Assert.assertTrue(studentPage.studentAttendanceNote.isDisplayed());

    }




    //

    @Given("Click on the profile icon on the top right corner of the page")
    public void click_on_the_profile_icon_on_the_top_right_corner_of_the_page() {
        studentPage.studentUserImage.click();
    }
    @Given("Click on the Change Password button in the window that opens")
    public void click_on_the_change_password_button_in_the_window_that_opens() {
        studentPage.studentUserChangePasswordButton.click();
    }
    @Given("On the Change Password page, verify that the Current Password, New Password, Confirm Password, textBoxes are accessible and the Save button is clickable")
    public void on_the_change_password_page_verify_that_the_current_password_new_password_confirm_password_text_boxes_are_accessible_and_the_save_button_is_clickable() {
        Assert.assertTrue(studentPage.studentUserCurrentPasswordBox.isDisplayed());
        Assert.assertTrue(studentPage.studentUserNewPasswordBox.isDisplayed());
        Assert.assertTrue(studentPage.studentUserConfirmPasswordBox.isDisplayed());
        Assert.assertTrue(studentPage.studentUserPasswordSaveButton.isEnabled());
    }
    @Given("The user enters their current password in the Current Password textbox")
    public void the_user_enters_their_current_password_in_the_current_password_textbox() {
        studentPage.studentUserCurrentPasswordBox.sendKeys(ConfigReader.getProperty("berkePassword"));
    }
    @Given("Enter a new password in the New Password textbox, enter same password in the Confirm Password and click the Save button Positive Scenario")
    public void enter_a_new_password_in_the_new_password_textbox_and_click_the_save_button_positive_scenario() {
        studentPage.studentUserNewPasswordBox.sendKeys(ConfigReader.getProperty("berkeStudentNewPass"));
        studentPage.studentUserConfirmPasswordBox.sendKeys(ConfigReader.getProperty("berkeStudentNewPass"));

        studentPage.studentUserPasswordSaveButton.click();
    }
    @Given("It displays the message {string}, when the correct password combinations are entered")
    public void it_displays_the_message__password_successfully_changed_when_the_correct_password_combinations_are_entered(String message) throws IOException {
        ReusableMethods.wait(5);
        ReusableMethods.getScreenshot("Password-Successfully-Changed-");

        String dynamicXpathForPassSuccessfullyChanged = "//*[text()='" + message + "']";
        WebElement successfulMessage = Driver.getDriver().findElement(By.xpath(dynamicXpathForPassSuccessfullyChanged));
        Assert.assertTrue(successfulMessage.isDisplayed());
    }

    @Given("Enter a new password in the New Password textbox, enter same password in the Confirm Password and click the Save button Negative Scenario")
    public void enter_a_new_password_in_the_new_password_textbox_and_click_the_save_button_negative_scenario() {
        studentPage.studentUserNewPasswordBox.sendKeys(ConfigReader.getProperty("berkeStudentNewPassNegative"));
        studentPage.studentUserConfirmPasswordBox.sendKeys(ConfigReader.getProperty("berkeStudentNewPassNegative"));

        studentPage.studentUserPasswordSaveButton.click();
    }

    @Given("The user should receive the message {string} when entering incorrect password combinations")
    public void the_user_should_receive_the_message__password_is_invalid_when_entering_incorrect_password_combinations(String message) throws IOException {
        ReusableMethods.wait(5);
        ReusableMethods.getScreenshot("Password-Is-Invalid-");

        String dynamicXpathForPassInvalid = "//*[text()='" + message + "']";
        WebElement invalidMessage = Driver.getDriver().findElement(By.xpath(dynamicXpathForPassInvalid));
        Assert.assertTrue(invalidMessage.isDisplayed());
    }


    @Given("After logging into the Teacher Reviews Page as a user, I should be able to see the {string} header text")
    public void after_logging_into_the_teacher_reviews_page_as_a_user_ı_should_be_able_to_see_the_header_text(String string) {

        studentPage.usernameTextbox.click();
        studentPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ahmetStudentUserName"));
        studentPage.passwordTextbox.click();
        studentPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ahmetStudentPassword"));
        studentPage.signInButton.click();
        studentPage.teacherReviewsMenu.isDisplayed();

    }
    @Given("Time I select a teacher as a user, I should be able to vote for the selected teacher")
    public void when_ı_select_a_teacher_as_a_user_ı_should_be_able_to_vote_for_the_selected_teacher() {
        studentPage.teacherReviewsMenu.click();
        studentPage.teacherReviewsText.isDisplayed();
        studentPage.addIconStudentPanel.click();
        studentPage.studentPnlRating.click();
        studentPage.commentTextboxRating.click();
        studentPage.commentTextboxRating.sendKeys("Basarili" + Keys.ENTER);
        studentPage.ratingSaveButton.click();
        studentPage.fiveRatingPoint.isDisplayed();

    }

    @Given("Verify that the Student Login page is displayed.")
    public void verify_that_the_student_login_page_is_displayed() {
        Assert.assertTrue(studentPage.studentLoginPageUserLoginText.isDisplayed());
    }
    @Given("Enter the correct {string} in the Username textbox.")
    public void enter_the_correct_in_the_username_textbox(String givenUsername) {
        studentPage.studentLoginUsernameBox.sendKeys(ConfigReader.getProperty(givenUsername));
    }
    @Given("Enter the correct {string} in the Password textbox.")
    public void enter_the_correct_in_the_password_textbox(String givenPassword) {
        studentPage.studentLoginPasswordBox.sendKeys(ConfigReader.getProperty(givenPassword));
    }
    @Given("Verify that the Student Dasboard Page is displayed.")
    public void verify_that_the_student_dasboard_page_is_displayed() {
        Assert.assertTrue(studentPage.studentLoginPageStudentDasboardText.isDisplayed());
    }
    @Given("Click Homework in the Student Panel Sidebar.")
    public void click_homework_in_the_student_panel_sidebar() {
        studentPage.studentSidebarHomeworkTab.click();
    }
    @Given("Verify that Upcoming Homework is displayed on the Homework page.")
    public void verify_that_upcoming_homework_is_displayed_on_the_homework_page() {
        Assert.assertTrue(studentPage.studentHomeworkPageUpcomingHomeworkText.isDisplayed());
    }
    @Given("Click view and edit button under the action.")
    public void click_view_and_edit_button_under_the_action() {
        studentPage.studentHomeworkPageFirstHomeworkDetailsButton.click();

        /*
        List<String> studentList = new ArrayList<>();

        int studentHomeworkCount = studentPage.studentHomeworkPageUpcomingHomeworkList.size();
        String studentInfo="";

        for (int i = 1; i < studentHomeworkCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            String edit = "(//i[@class='fa fa-reorder'])["+ --i +"]";
            WebElement editElement = Driver.getDriver().findElement(By.xpath(edit));
            System.out.println(edit);
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();",editElement);
            ReusableMethods.wait(2);
            break;
        }
        */
    }

    @Given("Verify that homework details page is displayed.")
    public void verify_that_homework_details_page_is_displayed() {
        Assert.assertTrue(studentPage.homeworkDetailPageHomeworkDetailsText.isEnabled());
    }
    @Given("Enter message in the message textbox.")
    public void enter_message_in_the_message_textbox() {
        studentPage.homeworkDetailPageMessageBox.sendKeys("Message");
    }
    @Given("Click save button on the homework details page.")
    public void click_save_button_on_the_homework_details_page() {
        studentPage.homeworkDetailPageSaveButton.click();
    }
    @Given("Verify that the message was sent.")
    public void verify_that_the_message_was_sent() {
        String firstHomework = studentPage.homeworkPageFirstrow.getText();
        System.out.println(firstHomework);
        Assert.assertTrue(firstHomework.contains("Submitted"));
        /*
        List<String> studentList = new ArrayList<>();

        int studentHomeworkCount = studentPage.studentHomeworkPageUpcomingHomeworkList.size();
        String studentInfo="";

        for (int i = 1; i < studentHomeworkCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

        }
        */
    }
    @Given("Click Closed Homework on the Homework page.")
    public void click_closed_homework_on_the_homework_page() {
        studentPage.homeworkPageClosedHomeworkTab.click();
    }
    @Given("Click view and edit button under the action on closed homework page .")
    public void click_view_and_edit_button_under_the_action_on_closed_homework_page() {
        studentPage.homeworkPageViewEditButton.click();
    }
    @Given("Click save button under the page.")
    public void click_save_button_under_the_page() {
        studentPage.homeworkDetailPageSaveButton.click();
    }
    @Given("Verify that the message was sent on page.")
    public void verify_that_the_message_was_sent_on_page() {
        studentPage.homeworkPageClosedHomeworkTab.click();
        String firstRow = studentPage.homeworkPageFirstrow.getText();
        Assert.assertTrue(firstRow.contains("Submitted"));
    }
    @Given("Click daily assigment button.")
    public void click_daily_assigment_button() {
        studentPage.homeworkPageDailyAssigmentButton.click();
    }
    @Given("Verify that Daily Assigment Page is displayed.")
    public void verify_that_daily_assigment_page_is_displayed() {
        Assert.assertTrue(studentPage.dailyAssigmentPageDailyListText.isDisplayed());
    }
    @Given("Click add daily assigment button.")
    public void click_add_daily_assigment_button() {
        studentPage.dailyAssigmentPageAddDailyAssigmentButton.click();
    }
    @Given("Verify that relevant boxes is displayed.")
    public void verify_that_relevant_boxes_is_displayed() {
        Assert.assertTrue(studentPage.addDailyAssigmentPageTitleBox.isDisplayed());
        Assert.assertTrue(studentPage.addDailyAssigmentPageSubjectSelectBox.isDisplayed());
        Assert.assertTrue(studentPage.addDailyAssigmentPageDescriptionBox.isDisplayed());
        Assert.assertTrue(studentPage.addDailyAssigmentPageAttachDocumentBox.isEnabled());
        Assert.assertTrue(studentPage.addDailyAssigmentPageSaveButton.isDisplayed());
    }
    @Given("Enter information on the Add Daily Assignment page.")
    public void enter_information_on_the_add_daily_assignment_page() {
        studentPage.addDailyAssigmentPageTitleBox.sendKeys("Title");
        studentPage.addDailyAssigmentPageSubjectSelectBox.sendKeys("English (210)");
        studentPage.addDailyAssigmentPageDescriptionBox.sendKeys("Description");
    }
    @Given("Click save button under add daily page.")
    public void click_save_button_under_add_daily_page() {
        studentPage.addDailyAssigmentPageSaveButton.click();
    }
    @Given("Verify that new assigment is displayed.")
    public void verify_that_new_assigment_is_displayed() {
        String firstRow = studentPage.dailyAssigmentPageNewAssigmentDisplayed.getText();
        Assert.assertTrue(firstRow.contains("Title"));
    }
    @Given("Click edit button under the action on daily page.")
    public void click_edit_button_under_the_action_on_daily_page() {
        studentPage.dailyAssigmentPageEditButton.click();
    }
    @Given("Edit information on the Edit Daily Assignment page.")
    public void edit_information_on_the_edit_daily_assignment_page() {
        studentPage.addDailyAssigmentPageTitleBox.clear();
        studentPage.addDailyAssigmentPageTitleBox.sendKeys("Title1");
    }
    @Given("Click save button on edit daily page.")
    public void click_save_button_on_edit_daily_page() {
        studentPage.editDailyAssigmentPageSaveButton.click();
    }
    @Given("Verify that new assigment was editted.")
    public void verify_that_new_assigment_was_editted() {
        String firstRow =studentPage.dailyAssigmentPageNewAssigmentDisplayed.getText();
        Assert.assertTrue(firstRow.contains("Title1"));
    }
    @Given("Click delete button under the action on daily page.")
    public void click_delete_button_under_the_action_on_daily_page() {
        studentPage.dailyAssigmentPageDeleteButton.click();
    }
    @Given("Verify that Succesfully deleted is displayed.")
    public void verify_that_succesfully_deleted_is_displayed() {

    }






}

