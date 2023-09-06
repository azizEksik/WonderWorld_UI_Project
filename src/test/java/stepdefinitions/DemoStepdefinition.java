package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Random;

public class DemoStepdefinition {

    WebDriver driver = Driver.getDriver();
    HomePage homePage = new HomePage();
    ParentPage parentPage = new ParentPage();
    AdminPage adminPage = new AdminPage();
    StudentPage studentPage = new StudentPage();

    TeacherPage teacherPage = new TeacherPage();
    Faker faker = new Faker();
    Actions actions = new Actions(driver);
    String fakerFirstName  = faker.name().firstName();
    String fakerLastName = faker.name().lastName();
    String fakerEmail= faker.internet().emailAddress();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    String fakerGuardianName = faker.name().firstName();
    String fakerGuardianEmail = faker.internet().emailAddress();
    String fakerGuardianPhoneNumber = faker.phoneNumber().cellPhone();
    String parentUserIdStr;
    String parentPassStr;

    @Given("Click on the Online Admission menu title \\(demo)")
    public void click_on_the_online_admission_menu_title_demo() {
        ReusableMethods.wait(1);
        homePage.onlineAdmissionMenuTitle.click();
        ReusableMethods.wait(2);
    }
    @Given("Relevant data are entered into the textBoxes on the Online Admission page \\(demo)")
    public void relevant_data_are_entered_into_the_text_boxes_on_the_online_admission_page_demo() {
        ReusableMethods.wait(1);

        Select select = new Select(homePage.classDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("selectClass"));
        ReusableMethods.wait(1);

        homePage.firstNameTextBox.sendKeys(fakerFirstName);
        ReusableMethods.wait(1);
        homePage.lastNameTextBox.sendKeys(fakerLastName);

        ReusableMethods.wait(1);
        Select select2 =new Select(homePage.genderDropDown);
        select2.selectByVisibleText(ConfigReader.getProperty("selectGender"));

        ReusableMethods.wait(2);
        ReusableMethods.jsScrollBy(200);
        ReusableMethods.waitForVisibility(homePage.dateOfBirthDateBox,5);
        ReusableMethods.wait(1);
        homePage.dateOfBirthDateBox.click();
        ReusableMethods.wait(1);
        homePage.july2023Label.click();
        ReusableMethods.wait(1);
        homePage.dateOf2023YearWebTable.click();
        ReusableMethods.wait(1);
        homePage.backToButton.click();
        ReusableMethods.wait(1);
        homePage.dateOf2014YearWebTable.click();
        ReusableMethods.wait(1);
        homePage.dateOfMonthWebTable.click();
        ReusableMethods.wait(1);
        homePage.dateOfDayWebTable.click();


        homePage.emailTextBox.sendKeys(fakerEmail);

    }

    @Given("Student photo uploaded \\(demo)")
    public void student_photo_uploaded_demo() {
        ReusableMethods.wait(1);
        // jse.executeScript("arguments[0].scrollIntoView();",homePage.studentPhotoUploadButton);

        String studentFilePathVariablePart = System.getProperty("user.dir");
        String studentFilePathSamePart = "\\src\\test\\java\\utilities\\attachments\\student.png";
        String studentFilePath = studentFilePathVariablePart + studentFilePathSamePart ;
        homePage.studentPhotoUploadButton.sendKeys(studentFilePath);
        ReusableMethods.wait(1);
    }

    @Given("Guardian Photo uploaded \\(demo)")
    public void guardian_photo_uploaded_demo() {
        ReusableMethods.wait(1);
        jse.executeScript("arguments[0].scrollIntoView();",homePage.fatherRadioButton);

        jse.executeScript("arguments[0].click();",homePage.fatherRadioButton);
        homePage.guardianNameTextBox.sendKeys(fakerGuardianName);
        ReusableMethods.wait(1);
        homePage.homePageGuardianEmail.sendKeys(fakerGuardianEmail);
        ReusableMethods.wait(1);
        homePage.homePageGuardianPhone.sendKeys(fakerGuardianPhoneNumber);

        ReusableMethods.wait(1);


        String guardianFilePathVariablePart = System.getProperty("user.dir");
        String guardianFilePathSamePart = "/src/test/java/utilities/attachments/father.jpg";
        String guardianFilePath = guardianFilePathVariablePart + guardianFilePathSamePart ;
        homePage.guardianPhotoUploadButton.sendKeys(guardianFilePath);
        ReusableMethods.wait(1);
    }

    @Given("Upload documents related to the registration to the Upload Documents window \\(demo)")
    public void upload_documents_related_to_the_registration_to_the_upload_documents_window_demo() {
        ReusableMethods.wait(1);
        jse.executeScript("arguments[0].scrollIntoView();",homePage.uploadDocumentsUploadButton);

        String documentFilePathVariablePart = System.getProperty("user.dir");
        String documentFilePathSamePart = "/src/test/java/utilities/attachments/Document.docx";
        String documentFilePath = documentFilePathVariablePart + documentFilePathSamePart ;

        homePage.uploadDocumentsUploadButton.sendKeys(documentFilePath);

        ReusableMethods.wait(1);
    }
    @Given("Click on Submit Button \\(demo)")
    public void click_on_submit_button_demo() {
        ReusableMethods.wait(1);
        jse.executeScript("arguments[0].scrollIntoView();",homePage.submitButton);
        jse.executeScript("arguments[0].click();",homePage.submitButton);
        ReusableMethods.wait(3);

        jse.executeScript("arguments[0].scrollIntoView();",homePage.iAgreeToTheTermsAndConditionscheckBox);
        homePage.iAgreeToTheTermsAndConditionscheckBox.click();
        ReusableMethods.wait(1);
        homePage.onlineAdmissionSubmitButton.click();
        ReusableMethods.wait(2);
    }

    @Given("Go to the {string}")
    public void open_new_tab_and_go_to_the(String string) {
        ReusableMethods.wait(1);
//        ((JavascriptExecutor) driver).executeScript("window.open();");
//
//        String firstTab = driver.getWindowHandle();
//        for (String handle : driver.getWindowHandles()) {
//            if (!handle.equals(firstTab)) {
//                driver.switchTo().window(handle);
//                break;
//            }
//        }

        driver.get(ConfigReader.getProperty(string));

    }

    @Given("Click the parent Sign In button \\(demo)")
    public void click_the_parent_sign_in_button_demo() {
        ReusableMethods.wait(1);
        parentPage.signInButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Click on the Fees link on the Parent homepage \\(demo)")
    public void click_on_the_fees_link_on_the_parent_homepage_demo() {
        ReusableMethods.wait(1);
        parentPage.choosingChild.click();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        parentPage.selectAndProceedButton.click();
        ReusableMethods.wait(3);

        ReusableMethods.wait(1);
        parentPage.parentPageFeesLink.click();
        ReusableMethods.wait(1);
    }
    @Given("Click the pay button in the Unpaid student row \\(demo)")
    public void click_the_pay_button_in_the_unpaid_student_row_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageFeesPayDropdown.click();
        ReusableMethods.wait(1);
    }
    @Given("Click on the online payment link \\(demo)")
    public void click_on_the_online_payment_link_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageFeesPayDropdownOnlinePayment.click();
        ReusableMethods.wait(1);
    }
    @Given("Click on the Pay With One Pay button \\(demo)")
    public void click_on_the_pay_with_one_pay_button_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageOnlinePaymentPayWithOnePayButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Click Credit Bank checkbox \\(demo)")
    public void click_credit_bank_checkbox_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageOnlinePaymentCreditCardCheckbox.click();
        ReusableMethods.wait(1);
    }
    @Given("Enter tester credit card number in the Card number textbox \\(demo)")
    public void enter_tester_credit_card_number_in_the_card_number_textbox_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageOnlinePaymentCardNumberTextBox.sendKeys(ConfigReader.getProperty("vahdeddinCreditCardNumber"));
        ReusableMethods.wait(1);
    }
    @Given("Enter the tester expiration date in the Expiration Date textbox \\(demo)")
    public void enter_the_tester_expiration_date_in_the_expiration_date_textbox_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageOnlinePaymentExpDataTextBox.sendKeys(ConfigReader.getProperty("vahdeddinCreditCardExpirationDate"));
        ReusableMethods.wait(1);
    }
    @Given("Enter tester CSC information in CSC textbox \\(demo)")
    public void enter_tester_csc_information_in_csc_textbox_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageOnlinePaymentCSCTextBox.sendKeys(ConfigReader.getProperty("vahdeddinCreditCardCSC"));
        ReusableMethods.wait(1);
    }
    @Given("Click on the Pay Now button \\(demo)")
    public void click_on_the_pay_now_button_demo() {
        ReusableMethods.wait(1);
        parentPage.parentPageOnlinePaymentPayNowButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Login as student {string} and {string}")
    public void login_as_student_and(String username, String password) {
        adminPage.adminLoginUsername.click();
        ReusableMethods.wait(2);
        adminPage.adminLoginUsername.sendKeys(ConfigReader.getProperty(username));
        ReusableMethods.wait(2);
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty(password))
                .sendKeys(Keys.ENTER)
                .click().perform();
    }
    @Given("Click student Class Time Table")
    public void click_student_class_time_table() {
        ReusableMethods.wait(1);
        studentPage.classTimeTableButton.click();
        ReusableMethods.wait(10);
    }

    @Given("Click Student Information Menu than Online Admission button")
    public void click_student_information_menu_than_online_admission_button() {
        ReusableMethods.wait(1);
        adminPage.studentInformationMenu.click();
        ReusableMethods.wait(1);
        adminPage.studentOnlineAdmissionButton.click();
    }
    @Given("Search student")
    public void search_student() {
        ReusableMethods.wait(1);
        adminPage.studentListSearch.sendKeys(fakerFirstName);
        ReusableMethods.wait(1);
    }
    @Given("Click Edit and Enroll Button")
    public void click_edit_and_enroll_button() {
        ReusableMethods.wait(1);
        adminPage.editAndEnrollButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Enter Admission No and Fee Details than click Save and Enroll Button")
    public void enter_admission_no_and_fee_details_than_click_save_and_enroll_button() {
        ReusableMethods.wait(1);
        Random random = new Random();
        int randomNumber = 100000 + random.nextInt(900000);
        String randomString = String.valueOf(randomNumber);
        adminPage.studentEditAdmissionNoBox.sendKeys(randomString);

        ReusableMethods.wait(1);
        jse.executeScript("arguments[0].scrollIntoView();", adminPage.feeStudentCheckBox);
        ReusableMethods.wait(1);
        jse.executeScript("arguments[0].click();",adminPage.feeStudentCheckBox);

        //actions.moveToElement(adminPage.feeStudentCheckBox)
                //.click(adminPage.feeStudentCheckBox).perform();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        jse.executeScript("arguments[0].scrollIntoView();", adminPage.saveAndEnrollButton);
        ReusableMethods.wait(1);
        adminPage.saveAndEnrollButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Take parents username and password of this student")
    public void take_parents_username_and_password_of_this_student() {
        ReusableMethods.wait(1);
        adminPage.studentDetailsButton.click();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        adminPage.studentSearchByKeyword.sendKeys(fakerFirstName);
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        adminPage.studentDetails2SearchButton.click();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        adminPage.studentSearchListViewButton.click();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        adminPage.loginDetailsButton.click();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        parentUserIdStr = adminPage.userIdParentLocate.getText();
        parentPassStr = adminPage.userPassParentLocate.getText();
        ReusableMethods.wait(1);

        ReusableMethods.wait(1);
        adminPage.loginDetailsCloseButon.click();
        adminPage.adminProfilIcon.click();
        adminPage.adminLogoutLink.click();
        ReusableMethods.wait(1);




    }

    @Given("Enter parent username")
    public void enter_parent_username() {
        ReusableMethods.wait(1);
        parentPage.usernameBox.sendKeys(parentUserIdStr);
        ReusableMethods.wait(1);
    }
    @Given("Enter the parent password")
    public void enter_the_parent_password() {
        ReusableMethods.wait(1);
        parentPage.passwordBox.sendKeys(parentPassStr);
        ReusableMethods.wait(1);
    }

    @Given("The teacher enters the day's attendance")
    public void the_teacher_enters_the_day_s_attendance() {
        teacherPage.attendanceButton.click();

        jse.executeScript("arguments[0].click();",teacherPage.periodAttendanceLink);

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

        jse.executeScript("arguments[0].click();",teacherPage.absentRadioButton);
        jse.executeScript("arguments[0].click();",teacherPage.lateRadioButton);
        jse.executeScript("arguments[0].click();",teacherPage.halfDayRadioButton);

        for (int i = 0; i < 14; i++) {
            ReusableMethods.wait(1);
            teacherPage.periodNoteInputs.clear();
            teacherPage.periodNoteInputs.get(i).sendKeys("Enjoy Studying");
        }

        jse.executeScript("arguments[0].click();",teacherPage.saveAttendanceButton);






    }

}
