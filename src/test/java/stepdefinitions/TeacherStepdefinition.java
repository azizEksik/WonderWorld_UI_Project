package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import pages.TeacherPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;




public class TeacherStepdefinition {

  public static   TeacherPage teacherPage = new TeacherPage();


    @Given("Send Email should be displayed under the Communicate heading in the sidebar in the Teacher panel and when clicked it should redirect to the compose page.")
    public void send_email_should_be_displayed_under_the_communicate_heading_in_the_sidebar_in_the_teacher_panel_and_when_clicked_it_should_redirect_to_the_compose_page() {
        teacherPage.usernameTextbox.click();
        teacherPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ahmetTeacherUserName"));
        teacherPage.passwordTextbox.click();
        teacherPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ahmetTeacherPassword"));
        teacherPage.signInButton.click();
        teacherPage.communicateMenu.click();
        teacherPage.sendMailLink.click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "compose";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }

    @Given("Email Template dropdown menu and Title and Message textBoxes should be visible and functional on Send Email page.")
    public void email_template_dropdown_menu_and_title_and_message_text_boxes_should_be_visible_and_functional_on_send_email_page() {


        Select select = new Select(teacherPage.emailTemplateDrop);
        select.selectByValue("1");
        ReusableMethods.waitFor(2);
        teacherPage.emailTemplateDrop.isDisplayed();
        teacherPage.titleTextbox.isDisplayed();
        teacherPage.messageTextbox.isDisplayed();
    }

    @Given("Group should be selected as the recipient of the prepared message.")
    public void group_should_be_selected_as_the_recipient_of_the_prepared_message() {

        teacherPage.selectTeacher.click();
        ReusableMethods.waitFor(1);
    }

    @Given("Individual groups can be selected as the recipient of the prepared message and people from that group can be added among the recipients.")
    public void ındividual_groups_can_be_selected_as_the_recipient_of_the_prepared_message_and_people_from_that_group_can_be_added_among_the_recipients() {
        teacherPage.indivudual.click();
        teacherPage.indivudualSelect.click();
       // teacherPage.messagaTo.click();
        teacherPage.messageToSelect.click();
        teacherPage.addTextbox.sendKeys("ahmet");
        ReusableMethods.waitFor(2);
        teacherPage.selectStudentYigitsoy.click();
        teacherPage.addButton.click();



    }

    @Given("The recipients added in the Individual window should be deleted from the list by clicking the delete icon.")
    public void the_recipients_added_in_the_ındividual_window_should_be_deleted_from_the_list_by_clicking_the_delete_icon() {
        teacherPage.deleteIcon.click();
    }

    @Given("Class options should be selected as the recipient of the prepared message.")
    public void class_options_should_be_selected_as_the_recipient_of_the_prepared_message() {

        teacherPage.selectClass.click();
        teacherPage.messageClassToDropdwn.click();
        Select select = new Select(teacherPage.messageClassToDropdwn);
        select.selectByValue("1");

    }

    @Given("In the Today's Birtday window, people who were born on that date registered in the system should be automatically displayed and selected in the window.")
    public void ın_the_today_s_birtday_window_people_who_were_born_on_that_date_registered_in_the_system_should_be_automatically_displayed_and_selected_in_the_window() {

        teacherPage.todaysBirthday.click();
        ReusableMethods.waitFor(1);
      //  teacherPage.todaysBirthdayAhmet.isDisplayed();
    }

    @Given("On the Send Email page, Send Now or Schedule radio buttons and Submit button should be visible and active.")
    public void on_the_send_email_page_send_now_or_schedule_radio_buttons_and_submit_button_should_be_visible_and_active() {
        teacherPage.indivudual.click();
       // teacherPage.indivudualSelect.click();
        //teacherPage.messageToSelect.click();
        teacherPage.addTextbox.sendKeys("ahmet");
        ReusableMethods.waitFor(2);
        teacherPage.selectStudentYigitsoy.click();
        teacherPage.addButton.click();
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollToElement(Driver.getDriver(),teacherPage.scheduleRadio);
        ReusableMethods.waitFor(1);
        teacherPage.scheduleRadio.click();
        ReusableMethods.scrollToElement(Driver.getDriver(),teacherPage.scheduleDateTime);
        teacherPage.scheduleDateTime.click();
      // teacherPage.scheduleDateTime.clear();
       ReusableMethods.waitFor(60);
        teacherPage.scheduleDateTime.sendKeys("16/08/2023 04:02 pm" + Keys.ENTER);

    }

    @Given("Schedule radio button should be clicked to select a future date when the message can be sent.")
    public void schedule_radio_button_should_be_clicked_to_select_a_future_date_when_the_message_can_be_sent() {

       // teacherPage.scheduleDateTime.click();
        //teacherPage.scheduleDateTime.clear();
       // teacherPage.scheduleDateTime.click();



    }

    @Given("Submit button should be clicked and the prepared message should be sent to the selected recipients at the desired time.")
    public void submit_button_should_be_clicked_and_the_prepared_message_should_be_sent_to_the_selected_recipients_at_the_desired_time() {

      //  ReusableMethods.scrollToElement(Driver.getDriver(),teacherPage.emailTemplateDrop);
        //ReusableMethods.waitFor(1);
       // Select select = new Select(teacherPage.emailTemplateDrop);
        //select.selectByValue("1");
       // teacherPage.emailTemplateDrop.click();
       // Select select = new Select(teacherPage.emailTemplateDrop);
        //select.selectByValue("1");
        ReusableMethods.waitFor(1);
        ReusableMethods.scrollToElement(Driver.getDriver(),teacherPage.submitButton);
        teacherPage.submitButton.click();
    }

    @Given("Browser is closed.")
    public void browser_is_closed() {
        Driver.closeDriver();

    }

    Actions actions = new Actions(Driver.getDriver());

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    @Then("verifies that there should be a visible Search textBox in the top bar of the Teacher panel")
    public void verifies_that_there_should_be_a_visible_search_text_box_in_the_top_bar_of_the_teacher_panel() {
        teacherPage.teacherLoginUserName.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinTeacherUserName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinTeacherPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

    }

    @Then("verifies that The Search textBox should have the placeholder text 'Search By Student Name, Roll Number, Enroll Number, National Id, Local Id Etc.")
    public void verifies_that_the_search_text_box_should_have_the_placeholder_text_search_by_student_name_roll_number_enroll_number_national_id_local_id_etc() {

        String searchBoxPlaceHolder = teacherPage.teacherSearchBox.getAttribute("placeholder");

        String actualData = searchBoxPlaceHolder;
        String expectedData = "Search By Student Name, Roll Number, Enroll Number, National Id, Local Id Etc.";
        Assert.assertEquals(expectedData, actualData);

    }

        @Then("verifies that When a student name is entered into the Search textbox and searched, the matching criteria should display a Student List with columns for Admission List, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, and Action.")
        public void verifies_that_when_a_student_name_is_entered_into_the_search_textbox_and_searched_the_matching_criteria_should_display_a_student_list_with_columns_for_admission_list_student_name_class_father_name_date_of_birth_gender_category_mobile_number_and_action() {
            teacherPage.teacherSearchBox.click();
            actions.sendKeys("Ali")
                    .sendKeys(Keys.ENTER)
                    .perform();

            teacherPage.teacherStudentListAdmissionNo.isDisplayed();
            teacherPage.teacherStudentListStudenName.isDisplayed();
            teacherPage.teacherStudentListClass.isDisplayed();
            teacherPage.teacherStudentListFatherName.isDisplayed();
            teacherPage.teacherStudentListDateofBirth.isDisplayed();
            teacherPage.teacherStudentListGender.isDisplayed();
            teacherPage.teacherStudentListCategory.isDisplayed();
            teacherPage.teacherStudentListMobileNumber.isDisplayed();
            teacherPage.teacherStudentListAction.isDisplayed();

        }

        @Then("verifies that When the student's name is entered into the Search textBox, the corresponding Details View List with student boards should be displayed.")
        public void verifies_that_when_the_student_s_name_is_entered_into_the_search_text_box_the_corresponding_details_view_list_with_student_boards_should_be_displayed() {
            teacherPage.teacherDetailsViewTab.click();



        }

        @Then("verifies that The student boards in the Details View List should contain Student Name, Class, Admission No, Date Of Birth, Gender, Local Identification Number, Guardian Name, Guardian Phone, and Current Address.")
        public void verifies_that_the_student_boards_in_the_details_view_list_should_contain_student_name_class_admission_no_date_of_birth_gender_local_identification_number_guardian_name_guardian_phone_and_current_address() {
            for (WebElement each : teacherPage.teacherDetailsViewList
            ) {
                Assert.assertTrue(each.getText().contains("Class"));
                Assert.assertTrue(each.getText().contains("Admission No"));
                Assert.assertTrue(each.getText().contains("Date Of Birth"));
                Assert.assertTrue(each.getText().contains("Gender"));
                Assert.assertTrue(each.getText().contains("Local Identification Number"));
                Assert.assertTrue(each.getText().contains("Guardian Name"));
                Assert.assertTrue(each.getText().contains("Guardian Phone"));
                Assert.assertTrue(each.getText().contains("Current Address"));

            }
        }

        @Then("verifies that In the Details View List, a visible and active Show icon should direct to the student's profile page.")
        public void verifies_that_in_the_details_view_list_a_visible_and_active_show_icon_should_direct_to_the_student_s_profile_page() {

        }

        @Then("verifies that In the Student List, a visible and active Show icon should direct to the student's profile page.")
        public void verifies_that_in_the_student_list_a_visible_and_active_show_icon_should_direct_to_the_student_s_profile_page() {
            teacherPage.teacherDetailsViewShowIcon.click();
            Assert.assertTrue(teacherPage.teacherDetailsViewShowIconClickProfile.isDisplayed());

        }

        @Then("verifies that Pagination should be enabled in the Student List to navigate between pages.")
        public void verifies_that_pagination_should_be_enabled_in_the_student_list_to_navigate_between_pages() {
            Assert.assertTrue(teacherPage.teacherStudentListPegination.isDisplayed());
            teacherPage.teacherStudentListPegination.click();

        }





    @Given("login as teacher")
    public void login_as_teacher() {

        Faker faker = new Faker();

        String examName = faker.gameOfThrones().character();
        String examDescription = faker.harryPotter().quote();
        int flag = 1;
    }

    @Given("Verify Exam Group link under Examination menu redirects correctly")
    public void verify_exam_group_link_under_examination_menu_redirects_correctly() {
        ReusableMethods.wait(2);
        teacherPage.teacherExaminationsButton.click();
        Assert.assertTrue(teacherPage.teacherExamGroupButton.isDisplayed());
        teacherPage.teacherExamGroupButton.click();
    }

    @Given("Name and Description textBoxes, Exam Type dropdown menu and Save button are displayed in the Add Exam Group window")
    public void name_and_description_text_boxes_exam_type_dropdown_menu_and_save_button_are_displayed_in_the_add_exam_group_window() {
        Assert.assertTrue(teacherPage.teacherExamGroupNameBox.isDisplayed());
        Assert.assertTrue(teacherPage.teacherExamGroupExamTypeDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.teacherExamGroupDescriptionBox.isDisplayed());
        Assert.assertTrue(teacherPage.teacherExamGroupSaveButton.isDisplayed());
    }

    @When("Click the Examinations button on the sidebar.")
    public void clickTheExaminationsButtonOnTheSidebar() {
        teacherPage.teacherExaminationsButton.click();
    }
    @When("The visibility of the Exam Result page link is verified and clicked.")
    public void theVisibilityOfTheExamResultPageLinkIsVerifiedAndClicked() {

        jse.executeScript("arguments[0].scrollIntoView();",teacherPage.examResultButton);
        jse.executeScript("arguments[0].click();",teacherPage.examResultButton);

    }
    @When("The visibility of Exam Group, Exam, Session, Class, Section and Search button is verified.")
    public void theVisibilityOfExamGroupExamSessionClassSectionAndSearchButtonIsVerified() {
        Assert.assertTrue(teacherPage.examGrupDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.examDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.sessionDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.classDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.sectionDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.searchButton.isDisplayed());
    }
    @When("Select data from Exam Group, Exam, Session, Class, Section and click the Search button")
    public void selectDataFromExamGroupExamSessionClassSectionAndClickTheSearchButton() {

        teacherPage.examGrupDropDown.click();
        teacherPage.examGroupTextBox.sendKeys(ConfigReader.getProperty("examGroup")+ Keys.ENTER);
        ReusableMethods.wait(5);
        teacherPage.examDropDown.click();
        teacherPage.examTextBox.sendKeys(ConfigReader.getProperty("hilalSelectExam")+ Keys.ENTER);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.sessionDropDown,ConfigReader.getProperty("examSession"));
        ReusableMethods.selectAnItemFromDropdown(teacherPage.classDropDown,ConfigReader.getProperty("selectClass"));
        ReusableMethods.selectAnItemFromDropdown(teacherPage.sectionDropDown,ConfigReader.getProperty("selectSection"));
        teacherPage.searchButton.click();
    }
    @Then("It is verified that Admission No, Roll Number, Student Name, Grand Total, Percent\\(%), Rank, Result are displayed")
    public void ıtIsVerifiedThatAdmissionNoRollNumberStudentNameGrandTotalPercentRankResultAreDisplayed() {

        String expectedAdmissionNo = "Admission No";
        String actualAdmissionNo = teacherPage.admissionNoColumn.getText();
        Assert.assertEquals(expectedAdmissionNo,actualAdmissionNo);

        String expectedRollNumber = "Roll Number";
        String actualRollNumber = teacherPage.rollNumberColumn.getText();
        Assert.assertEquals(expectedRollNumber,actualRollNumber);

        String expectedStudentName = "Student Name";
        String actualStudentName = teacherPage.studentNameColumn.getText();
        Assert.assertEquals(expectedStudentName,actualStudentName);

        String expectedGrandTotal = "Grand Total";
        String actualAGrandTotal = teacherPage.grandTotalColumn.getText();
        Assert.assertEquals(expectedGrandTotal,actualAGrandTotal);

        String expectedPercent = "Percent (%)";
        String actualPercent = teacherPage.pergentColumn.getText();
        Assert.assertEquals(expectedPercent,actualPercent);

        String expectedRank = "Rank";
        String actualRank = teacherPage.rankColumn.getText();
        Assert.assertEquals(expectedRank,actualRank);

        String expectedResult = "Result";
        String actualResult = teacherPage.resultColumn.getText();
        Assert.assertEquals(expectedResult,actualResult);
    }
    @Then("It is verified that the relevant data is entered in the search textbox and filtering is done.")
    public void ıtIsVerifiedThatTheRelevantDataIsEnteredInTheSearchTextboxAndFilteringIsDone() {

        teacherPage.searchTextBox.sendKeys(ConfigReader.getProperty("examGroup"));
        ReusableMethods.wait(3);

        String expectedStudentName = ConfigReader.getProperty("examGroup");
        String actualStudentName = teacherPage.studentSearchName.getText();
        Assert.assertTrue(actualStudentName.contains(expectedStudentName));

    }
    @Then("From the listed student names, the relevant student is clicked.")
    public void fromTheListedStudentNamesTheRelevantStudentIsClicked() {
        teacherPage.studentSearchName.click();
    }
    @Then("It is verified that the relevant student is redirected to their profile page.")
    public void ıtIsVerifiedThatTheRelevantStudentIsRedirectedToTheirProfilePage() {

        String expectedStudentName = ConfigReader.getProperty("expectedStudentName");
        String studentNameClickPage = teacherPage.studentPageView.getText();
        Assert.assertEquals(expectedStudentName,studentNameClickPage);
    }
    @When("Click the Homework Button on the sidebar and Add Homework link")
    public void clickTheHomeworkButtonOnTheSidebarAndAddHomeworkLink() {
        teacherPage.homeworkButton.click();
        jse.executeScript("arguments[0].click();",teacherPage.addHomeworkLink);

    }
    @When("Class, Section, Subject Group, Subject dropdown menus and Search button visibility are verified.")
    public void classSectionSubjectGroupSubjectDropdownMenusAndSearchButtonVisibilityAreVerified() {

        Assert.assertTrue(teacherPage.selectClassDrapdown.isDisplayed());
        Assert.assertTrue(teacherPage.selectSectionDrapdown.isDisplayed());
        Assert.assertTrue(teacherPage.selectSubjectGroup.isDisplayed());
        Assert.assertTrue(teacherPage.selectSubjectDrapdown.isDisplayed());
        Assert.assertTrue(teacherPage.homeworkSearchButton.isDisplayed());
    }

    @When("Search is made according to the selected criteria in the Select Criteria section.")
    public void searchIsMadeAccordingToTheSelectedCriteriaInTheSelectCriteriaSection() {


        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectClassDrapdown,ConfigReader.getProperty("selectClass"));
        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectSectionDrapdown,ConfigReader.getProperty("selectSection"));
        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectSubjectGroup,ConfigReader.getProperty("subjectGroup"));
        ReusableMethods.wait(3);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectSubjectDrapdown,ConfigReader.getProperty("selectSubject"));
        teacherPage.homeworkSearchButton.click();
    }

    @When("Verify that the titles Class, Section, Subject Group, Subject, Homework Date, Submission Date, Evaluation Date, Created By, Action are displayed.")
    public void verifyThatTheTitlesClassSectionSubjectGroupSubjectHomeworkDateSubmissionDateEvaluationDateCreatedByActionAreDisplayed() {

        String expectedClassTableName = "Class";
        String actualClassTableName = teacherPage.classTableName.getText();
        Assert.assertEquals(expectedClassTableName,actualClassTableName);

        String expectedSectionTableName = "Section";
        String actualSectionTableName = teacherPage.sectionTableName.getText();
        Assert.assertEquals(expectedSectionTableName,actualSectionTableName);

        String expectedSubjectGroupTableName = "Subject Group";
        String actualSubjectGroupTableName = teacherPage.subjectGroupTableName.getText();
        Assert.assertEquals(expectedSubjectGroupTableName,actualSubjectGroupTableName);

        String expectedSubjectTableName = "Subject";
        String actualSubjectTableName = teacherPage.subjectTableName.getText();
        Assert.assertEquals(expectedSubjectTableName,actualSubjectTableName);

        String expectedHomeworkDateTableName = "Homework Date";
        String actualHomeworkDateTableName = teacherPage.homeworkDateTableName.getText();
        Assert.assertEquals(expectedHomeworkDateTableName,actualHomeworkDateTableName);

        String expectedSubmissionDateTableName = "Submission Date";
        String actualSubmissionDateTableName = teacherPage.submissionDateTableName.getText();
        Assert.assertEquals(expectedSubmissionDateTableName,actualSubmissionDateTableName);

        String expectedEvaluationDateTableName = "Evaluation Date";
        String actualEvaluationDateTableName = teacherPage.evaluationDateTableName.getText();
        Assert.assertEquals(expectedEvaluationDateTableName,actualEvaluationDateTableName);

        String expectedCreatedByTableName = "Created By";
        String actualCreatedByTableName = teacherPage.createdByTableName.getText();
        Assert.assertEquals(expectedCreatedByTableName,actualCreatedByTableName);

        String expectedActionTableName = "Action";
        String actualActionTableName = teacherPage.actionTableName.getText();
        Assert.assertEquals(expectedActionTableName,actualActionTableName);


    }

    @When("Click on the evaluation icon under the Action heading in the Homework List.")
    public void clickOnTheEvaluationIconUnderTheActionHeadingInTheHomeworkList() {
        teacherPage.evaluationIcon.click();
    }

    @When("Confirmation that the Evaluate Homework window opens.")
    public void confirmationThatTheEvaluateHomeworkWindowOpens() {
            String expecedEvaluteHomework = "Evaluate Homework";
            ReusableMethods.waitForVisibility(teacherPage.evaluateHomeworkLabel,5);
            String actualEvaluateHomeworkTitle = teacherPage.evaluateHomeworkLabel.getText();
            Assert.assertTrue(actualEvaluateHomeworkTitle.contains(expecedEvaluteHomework));

    }

    @When("Write a note to the student and click the Save button.")
    public void writeANoteToTheStudentAndClickTheSaveButton() {

        ReusableMethods.waitForVisibility(teacherPage.checkBoxStudent,3);
        ReusableMethods.selectCheckBox(teacherPage.checkBoxStudent,false);
        teacherPage.checkBoxStudent.click();
        teacherPage.homeworkNoteTextBox.sendKeys(ConfigReader.getProperty("teacherMessage"));
        teacherPage.homeworkSaveButton.click();
        Assert.assertTrue(teacherPage.homeworkListTitle.isDisplayed());
    }

    @When("Click the edit icon under the Action title in the Homework List.")
    public void clickTheEditIconUnderTheActionTitleInTheHomeworkList() {

        ReusableMethods.waitForVisibility(teacherPage.editIcon,3);
        jse.executeScript("arguments[0].click();",teacherPage.editIcon);

        ReusableMethods.wait(5);
        Driver.getDriver().switchTo().frame(teacherPage.iframeElement);
        teacherPage.descriptionTextBox.sendKeys(ConfigReader.getProperty("teacherMessage"));
        Driver.getDriver().switchTo().defaultContent();

        jse.executeScript("arguments[0].click();",teacherPage.saveButtonForEdit);

        Assert.assertTrue(teacherPage.homeworkListTitle.isDisplayed());

    }

    @When("Click on the delete icon and confirm that the Homework record has been deleted.")
    public void clickOnTheDeleteIconAndConfirmThatTheHomeworkRecordHasBeenDeleted() {

        ReusableMethods.waitForVisibility(teacherPage.homeworkDeleteIcon,3);
        jse.executeScript("arguments[0].click();",teacherPage.homeworkDeleteIcon);
        Driver.getDriver().switchTo().alert().accept();

        Assert.assertTrue(teacherPage.noDataImg.isDisplayed());

    }

    @When("Confirming that the Add button is visible and active, the Add button is clicked.")
    public void confirmingThatTheAddButtonIsVisibleAndActiveTheAddButtonIsClicked() {
        Assert.assertTrue(teacherPage.addButtonForHomework.isDisplayed());
        Assert.assertTrue(teacherPage.addButtonForHomework.isEnabled());
        teacherPage.addButtonForHomework.click();
    }

    @When("Verify that Class, Section, Subject Group, Subject, Homework Date, Submission Date, Max Marks, Description Boxes, and Save button are visible and functional.")
    public void verifyThatClassSectionSubjectGroupSubjectHomeworkDateSubmissionDateMaxMarksDescriptionBoxesAndSaveButtonAreVisibleAndFunctional() {

        ReusableMethods.waitForVisibility(teacherPage.addHomeworkClassDropdown,3);
        Assert.assertTrue(teacherPage.addHomeworkClassDropdown.isDisplayed());
        ReusableMethods.waitForVisibility(teacherPage.addHomeworkSectionDropdown,3);
        Assert.assertTrue(teacherPage.addHomeworkSectionDropdown.isDisplayed());
        ReusableMethods.waitForVisibility(teacherPage.addHomeworkSubjectGroupDropdown,3);
        Assert.assertTrue(teacherPage.addHomeworkSubjectGroupDropdown.isDisplayed());
        ReusableMethods.waitForVisibility(teacherPage.addHomeworkSubjectDropdown,3);
        Assert.assertTrue(teacherPage.addHomeworkSubjectDropdown.isDisplayed());
        ReusableMethods.waitForVisibility(teacherPage.homeworkDateText,5);
        Assert.assertTrue(teacherPage.homeworkDateText.isDisplayed());
        ReusableMethods.waitForVisibility(teacherPage.submissionDateBox,5);
        Assert.assertTrue(teacherPage.submissionDateBox.isDisplayed());
        Driver.getDriver().switchTo().frame(teacherPage.iframeElement);
        Assert.assertTrue(teacherPage.addHomeworkDescriptionTextBox.isDisplayed());
        Driver.getDriver().switchTo().defaultContent();
        ReusableMethods.waitForVisibility(teacherPage.saveButtonForAddHomework,5);
        Assert.assertTrue(teacherPage.saveButtonForAddHomework.isDisplayed());
    }

    @When("A new assignment record is created and it is verified that the record has been opened.")
    public void aNewAssignmentRecordIsCreatedAndItIsVerifiedThatTheRecordHasBeenOpened() {

        ReusableMethods.waitForVisibility(teacherPage.addHomeworkClassDropdown,3);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.addHomeworkClassDropdown,ConfigReader.getProperty("selectClass"));

        ReusableMethods.waitForVisibility(teacherPage.addHomeworkSectionDropdown,3);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.addHomeworkSectionDropdown, ConfigReader.getProperty("selectSection"));

        ReusableMethods.waitForVisibility(teacherPage.addHomeworkSubjectGroupDropdown,3);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.addHomeworkSubjectGroupDropdown, ConfigReader.getProperty("subjectGroup"));

        ReusableMethods.waitForVisibility(teacherPage.addHomeworkSubjectDropdown,3);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.addHomeworkSubjectDropdown, ConfigReader.getProperty("selectSubject"));

        Driver.getDriver().switchTo().frame(teacherPage.iframeElement);
        teacherPage.addHomeworkDescriptionTextBox.sendKeys("basarilar");
        Driver.getDriver().switchTo().defaultContent();

        ReusableMethods.wait(5);
        teacherPage.saveButtonForAddHomework.click();
        ReusableMethods.wait(40);
        Assert.assertTrue(teacherPage.homeworkToasterMessage.isDisplayed());

    }

    @When("It is verified that two separate lists, Upcoming Homework and Closed Homework, are displayed in the Homework List.")
    public void ıtIsVerifiedThatTwoSeparateListsUpcomingHomeworkAndClosedHomeworkAreDisplayedInTheHomeworkList() {

        Assert.assertTrue(teacherPage.upcomingHomeworkButton.isEnabled());
        Assert.assertTrue(teacherPage.closedHomeworkButton.isEnabled());

    }
    @When("Click on Closed Homework Button.")
    public void clickOnClosedHomeworkButton() {
        jse.executeScript("arguments[0].click();",teacherPage.closedHomeworkButton);
    }

    @When("Select All button is marked")
    public void selectAllButtonIsMarked() {

        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectClassDrapdown,ConfigReader.getProperty("selectClass"));
        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectSectionDrapdown,ConfigReader.getProperty("selectSection"));
        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectSubjectGroup,ConfigReader.getProperty("subjectGroup"));
        ReusableMethods.wait(3);
        ReusableMethods.selectAnItemFromDropdown(teacherPage.selectSubjectDrapdown,ConfigReader.getProperty("selectSubject"));
        teacherPage.searchButtonForHomework.click();
        ReusableMethods.wait(3);
        ReusableMethods.selectCheckBox(teacherPage.selectAllBox,true);
        teacherPage.deleteButton.click();
        Driver.getDriver().switchTo().alert().accept();

    }

    @When("It is verified that bulk deletion is done in the list.")
    public void ıtIsVerifiedThatBulkDeletionIsDoneInTheList() {

        Assert.assertTrue(teacherPage.noDataImg.isDisplayed());
    }


    @Then("Login as teacher")
    public void loginAsTeacher() {
        teacherPage.teacherLoginUserName.click();
        actions.sendKeys(ConfigReader.getProperty("nurettinTeacherUserName"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("nurettinTeacherPassword"))
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

    }
    @Then("Verifies that under the Attendance menu, the Period Attendance By Date page link should be displayed, and when clicked, it should redirect to the reportbydate page")
    public void verifies_that_under_the_attendance_menu_the_period_attendance_by_date_page_link_should_be_displayed_and_when_clicked_it_should_redirect_to_the_reportbydate_page() {
        teacherPage.teacherAttendanceLink.click();
        ReusableMethods.wait(1);
        teacherPage.teacherPeriodAttendanceByDateLink.click();
        Assert.assertTrue(teacherPage.teacherPeriodAttendanceByDateLink.isDisplayed());
        Assert.assertTrue(teacherPage.teacherPeriodAttendanceByDateReportByDate.isDisplayed());


    }
    @Then("Verifies that on the reportbydate page, there should be a Select Criteria section with Class, Section dropdown menus, a Date box, and a Search button visible and active.")
    public void verifies_that_on_the_reportbydate_page_there_should_be_a_section_with_class_section_dropdown_menus_a_date_box_and_a_search_button_visible_and_active() {
        teacherPage.teacherAttendanceSelectCriteria.isDisplayed();
        teacherPage.teacherAttendanceSelectCriteriaClass.isDisplayed();
        teacherPage.teacherAttendanceSelectCriteriaSection.isDisplayed();
        teacherPage.teacherAttendanceSelectCriteriaDateText.isDisplayed();
        teacherPage.teacherAttendanceSelectCriteriaSearch.isDisplayed();
        teacherPage.teacherAttendanceSelectCriteriaSearch.isEnabled();





    }
    @Then("Verifies that a Student List should be generated with columns for each student and their respective subjects")
    public void verifies_that_a_student_list_should_be_generated_with_columns_for_each_student_and_their_respective_subjects() {

       //    teacherPage.getTeacherAttendanceSelectCriteriaClassDropDown.click();
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .perform();
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.TAB)
                .perform();
       /* teacherPage.teacherAttendanceSelectCriteriaSectionBox.click();
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER)
                        .perform();*/
        teacherPage.teacherAttendanceSelectCriteriaDateSelect.click();
        teacherPage.teacherAttendanceSelectCriteriaSearch.click();


    }
    @Then("The Student List should display the attendance records of all students in the selected class for the specified date")
    public void the_student_list_should_display_the_attendance_records_of_all_students_in_the_selected_class_for_the_specified_date() {
        int flag=0;
        for (WebElement each: teacherPage.teacherAttendanceSelectCriteriaStudentList
             ) {       if (each.getText().contains("N/A")) {
                            flag++;
        }

        }
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertTrue(flag==0, "Attendance records should not contains N/A");
        softAssert.assertAll();

    }

    @Given("Verify that the Teacher Login page is displayed.")
    public void verify_that_the_teacher_login_page_is_displayed() {
        Assert.assertTrue(teacherPage.teacherLoginPageAdminLoginText.isDisplayed());
    }
    @Given("Verify that the Teacher Dasboard Page is displayed.")
    public void verify_that_the_teacher_dasboard_page_is_displayed() {
        Assert.assertTrue(teacherPage.teacherDasboardWonderLogo.isDisplayed());
    }
    @Given("Click Attendance in the Teacher Panel Sidebar.")
    public void click_attendance_in_the_teacher_panel_sidebar() {
        teacherPage.teacherDasboardAttendanceTab.click();
    }
    @Given("Verify that Approve Leave is displayed under the Attendance menu heading.")
    public void verify_that_approve_leave_is_displayed_under_the_attendance_menu_heading() {
        Assert.assertTrue(teacherPage.teacherSidebarApproveLeaveTab.isDisplayed());
    }
    @Given("Click Approve Leave in the Teacher Panel Sidebar.")
    public void click_approve_leave_in_the_teacher_panel_sidebar() {
        teacherPage.teacherSidebarApproveLeaveTab.click();
    }
    @Given("Verify that Select Criteria boxes and search button are displayed.")
    public void verify_that_select_criteria_boxes_and_search_button_are_displayed() {
        Assert.assertTrue(teacherPage.approveLeavePageClassSelect.isDisplayed());
        Assert.assertTrue(teacherPage.approveLeavePageSectionSelect.isDisplayed());
        Assert.assertTrue(teacherPage.approveLeavePageSearchButton.isDisplayed());
    }
    @Given("Select a class from the class box.")
    public void select_a_class_from_the_class_box() {
        teacherPage.approveLeavePageClassSelect.sendKeys("Class 1");
    }
    @Given("Select a section from the section box.")
    public void select_a_section_from_the_section_box() {
        ReusableMethods.wait(3);
        teacherPage.approveLeavePageSectionSelect.sendKeys("A");
    }
    @Given("Click search button.")
    public void click_search_button() {
        teacherPage.approveLeavePageSearchButton.click();
    }
    @Given("Verify that information is displayed based on the search result.")
    public void verify_that_information_is_displayed_based_on_the_search_result() {
        Assert.assertTrue(teacherPage.approveLeavePageApproveLeaveList.isDisplayed());
    }

    @Given("Verify that Add button is displayed.")
    public void verify_that_add_button_is_displayed() {
        Assert.assertTrue(teacherPage.approveLeavePageAddButton.isDisplayed());
    }

    @Given("Click Add buton.")
    public void click_add_buton() {
        teacherPage.approveLeavePageAddButton.click();
    }
    @Given("Verify that boxes and buttons are displayed on the add leave page.")
    public void verify_that_boxes_and_buttons_are_displayed_on_the_add_leave_page() {

        // buraya bak
        ReusableMethods.wait(3);
        Assert.assertTrue(teacherPage.addLeavePageClassSelect.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageSectionSelect.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageStudentSelect.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageApplyDateInput.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageFromDateInput.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageToDateInput.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageReasonTextBox.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePagePendingRadioButton.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageDisapproveRadioButton.isDisplayed());
        Assert.assertTrue(teacherPage.addLeavePageApproveRadioButton.isDisplayed());
        //Assert.assertTrue(teacherPage.addLeavePageAttachDocument.isDisplayed());
    }
    @Given("Enter the information in the relevant boxes.")
    public void enter_the_information_in_the_relevant_boxes() {

        // buraya bak
        teacherPage.addLeavePageClassSelect.sendKeys("Class 1");
        ReusableMethods.wait(2);
        teacherPage.addLeavePageSectionSelect.sendKeys("A");
        ReusableMethods.wait(2);
        teacherPage.addLeavePageStudentSelect.sendKeys("Furkan");
        teacherPage.addLeavePageApplyDateInput.sendKeys("01/08/2023");
        teacherPage.addLeavePageFromDateInput.sendKeys("02/08/2023");
        teacherPage.addLeavePageToDateInput.sendKeys("03/08/2023");
        teacherPage.addLeavePageReasonTextBox.sendKeys("Reason");
        teacherPage.addLeavePageSectionText.click();
        teacherPage.addLeavePagePendingRadioButton.click();
    }
    @Given("Click save button on the add leave page.")
    public void click_save_button_on_the_add_leave_page() {
        teacherPage.addLeavePageSaveButton.click();
    }
    @Given("Verify that the new attendance is displayed.")
    public void verify_that_the_new_attendance_is_displayed() {
        List<String> studentList = new ArrayList<>();

        int approveList = teacherPage.approveLeavePageApproveNewLeaveList.size();
        String studentInfo="";

        for (int i = 1; i < approveList; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            //System.out.println(studentInfo);

            if (studentInfo.contains("Furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                Assert.assertTrue(studentInfo.contains("Furkan"));
                //String edit = "(//i[@class='fa fa-pencil'])["+ --i +"]";
                //WebElement editElement = Driver.getDriver().findElement(By.xpath(edit));
                //System.out.println(edit);
                //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                //jse.executeScript("arguments[0].click();",editElement);
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }

    }

    @Given("Click edit button under the action.")
    public void click_edit_button_under_the_action() {
        List<String> studentList = new ArrayList<>();

        int approveList = teacherPage.approveLeavePageApproveNewLeaveList.size();
        String studentInfo="";

        for (int i = 1; i < approveList; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            //System.out.println(studentInfo);

            if (studentInfo.contains("Furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                String edit = "(//i[@class='fa fa-pencil'])["+ --i +"]";
                WebElement editElement = Driver.getDriver().findElement(By.xpath(edit));
                System.out.println(edit);
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                jse.executeScript("arguments[0].click();",editElement);
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }
        // teacherPage.approveLeavePageEditButton.click();
    }
    @Given("Enter information on the edit leave page.")
    public void enter_information_on_the_edit_leave_page() {
        teacherPage.addLeavePageClassSelect.sendKeys("Select");
        ReusableMethods.wait(2);
        teacherPage.addLeavePageClassSelect.sendKeys("Class 1");
        ReusableMethods.wait(2);
        teacherPage.addLeavePageSectionSelect.sendKeys("A");
        ReusableMethods.wait(2);
        teacherPage.addLeavePageStudentSelect.sendKeys("Furkan");
        teacherPage.addLeavePageApplyDateInput.sendKeys("01/08/2023");
        teacherPage.addLeavePageFromDateInput.sendKeys("02/08/2023");
        teacherPage.addLeavePageToDateInput.sendKeys("03/08/2023");
        teacherPage.addLeavePageReasonTextBox.clear();
        teacherPage.addLeavePageReasonTextBox.sendKeys("Given Reason");
        teacherPage.addLeavePageSectionText.click();
        teacherPage.addLeavePageDisapproveRadioButton.click();
    }
    @Given("Click save button on the edit leave page.")
    public void click_save_button_on_the_edit_leave_page() {
        teacherPage.editLeavePageSaveButton.click();
        ReusableMethods.wait(2);
    }
    @Given("Verify that the attendance was editted.")
    public void verify_that_the_attendance_was_editted() {
        List<String> studentList = new ArrayList<>();

        int approveList = teacherPage.approveLeavePageApproveNewLeaveList.size();
        String studentInfo="";

        for (int i = 1; i < approveList; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            //System.out.println(studentInfo);

            if (studentInfo.contains("Furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                Assert.assertTrue(studentInfo.contains("Disapprove"));
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }
    }
    @Given("Click delete button under the action.")
    public void click_delete_button_under_the_action() {
        List<String> studentList = new ArrayList<>();

        int approveList = teacherPage.approveLeavePageApproveNewLeaveList.size();
        String studentInfo="";

        for (int i = 1; i < approveList; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            //System.out.println(studentInfo);

            if (studentInfo.contains("Furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                String delete = "(//i[@class='fa fa-trash'])["+ --i +"]";
                WebElement deleteElement = Driver.getDriver().findElement(By.xpath(delete));
                System.out.println(delete);
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                jse.executeScript("arguments[0].click();",deleteElement);
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }
        ReusableMethods.wait(2);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }
    @Given("Verify that the attendance was deleted.")
    public void verify_that_the_attendance_was_deleted() {
        ReusableMethods.wait(2);
        List<String> studentList = new ArrayList<>();

        int approveList = teacherPage.approveLeavePageApproveNewLeaveList.size();
        String studentInfo="";

        for (int i = 1; i < approveList; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            //System.out.println(studentInfo);

            if (studentInfo.contains("Furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                Assert.assertFalse(studentInfo.contains("Furkan"));
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }
    }
    @Given("Click the Teacher Login button")
    public void click_the_teacher_login_button() {
        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        teacherPage.teacherLoginButton.click();
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
    @Given("Enter the Username and Password in the related boxes")
    public void enter_the_username_and_password_in_the_related_boxes() {
        teacherPage.teacherUsernameBox.sendKeys(ConfigReader.getProperty("zehraTeacherUserName"));
        teacherPage.teacherPasswordBox.sendKeys(ConfigReader.getProperty("zehraPassword"));
    }
    @Given("Click the Teacher Sign In button")
    public void click_the_sign_in_button() {
        teacherPage.teacherSignInButton.click();
    }
    @Given("Click the Attendance menu in the sidebar of the Teacher panel")
    public void click_the_attendance_menu_in_the_sidebar_of_the_teacher_panel() {
        teacherPage.attendanceButton.click();
    }
    @Given("Click the Period Attendance page link under Attendance and verify that you have been to the subjectattence page")
    public void click_the_period_attendance_page_link_under_attendance_and_verify_that_you_have_been_to_the_subjectattence_page() {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",teacherPage.periodAttendanceLink);
        String expectedUrl = "https://qa.wonderworldcollege.com/admin/subjectattendence/index";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the Class, Section and Subject Dropdown menus and Date box are visible in the Select Criteria section")
    public void verify_that_the_class_section_and_subject_dropdown_menus_and_date_box_are_visible_in_the_select_criteria_section() {
        Assert.assertTrue(teacherPage.periodClassDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.periodSectionDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.periodSubjectDropDown.isDisplayed());
        Assert.assertTrue(teacherPage.periodDateBox.isDisplayed());
    }
    @Given("Verify that the Search button is visible and active")
    public void verify_that_the_search_button_is_visible_and_active() {
        Assert.assertTrue(teacherPage.searchButton.isDisplayed());
        Assert.assertTrue(teacherPage.searchButton.isEnabled());
    }
    @Given("In the Select Criteria section, necessary information is entered into the textboxes and click the search button.")
    public void in_the_select_criteria_section_necessary_information_is_entered_into_the_textboxes_and_click_the_search_button() {
        Select classMenu = new Select(teacherPage.periodClassDropDown);
        classMenu.selectByIndex(2);
        ReusableMethods.wait(1);
        Select sectionMenu = new Select(teacherPage.periodSectionDropDown);
        sectionMenu.selectByIndex(1);
        ReusableMethods.wait(1);

        teacherPage.periodDateBox.click();
        Driver.getDriver().findElement(By.xpath("//table/tbody/tr[6]/td[1]")).click();


        ReusableMethods.wait(1);
        Select subjectMenu = new Select(teacherPage.periodSubjectDropDown);
        subjectMenu.selectByVisibleText("Mathematics (5:50 AM- 06:15 AM) By Shivam Verma (9002)");
        ReusableMethods.wait(1);

        teacherPage.searchButton.click();

    }
    @Given("Verify that the Student List heading and the Admission No, Roll Number, Name, Attendance, and Note headings below are visible in the search result")
    public void verify_that_the_student_list_heading_and_the_admission_no_roll_number_name_attendance_and_note_headings_below_are_visible_in_the_search_result() {
        for (WebElement column : teacherPage.tableHeadersList){
            Assert.assertTrue(column.isDisplayed());
        }
    }
    @Given("Student status \\(Present, Late, Absent, Half Day) is selected and click the Save Attendance button")
    public void student_status_present_late_absent_half_day_is_selected_and_click_the_save_attendance_button() {
        // for (int i = 0; i < 15; i++) {
        //     System.out.println(teacherPage.absentRadioButtonColumn.get(i));
        // }

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",teacherPage.absentRadioButton);
        jse.executeScript("arguments[0].click();",teacherPage.lateRadioButton);
        jse.executeScript("arguments[0].click();",teacherPage.halfDayRadioButton);
    }
    @Given("In the Student List section, it is verified that the desired grade can be entered under the Note Title.")
    public void ın_the_student_list_section_it_is_verified_that_the_desired_grade_can_be_entered_under_the_note_title() {
        for (int i = 0; i < 14; i++) {
            teacherPage.periodNoteInputs.get(i).sendKeys("Enjoy Studying");
        }

    }
    @Given("Verify that student status has been successfully saved in the system")
    public void verify_that_student_status_has_been_successfully_saved_in_the_system() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",teacherPage.saveAttendanceButton);
        String expectedMessage = "Record Saved Successfully";
        String actualMessage = teacherPage.recordSavedSuccessfullyMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }
    @Given("The Mark As Holiday button should be visible and functional.")
    public void the_mark_as_holiday_button_should_be_visible_and_functional() {
        Assert.assertTrue(teacherPage.markAsHolidayButton.isDisplayed());
        Assert.assertTrue(teacherPage.markAsHolidayButton.isEnabled());
    }





}
