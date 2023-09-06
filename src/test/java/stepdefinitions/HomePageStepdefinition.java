package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePageStepdefinition {

    HomePage homePage = new HomePage();
    WebDriver driver = Driver.getDriver();


    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    String savedDate;
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    String fakerFirstName  = faker.name().firstName();
    String fakerLastName = faker.name().lastName();
    String fakerGuardianName = faker.name().firstName();
    String fakerEmail= faker.internet().emailAddress();


    @Given("Launch browser and Navigate to Url")
    public void launch_browser_and_navigate_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("homePageUrl"));
    }
    @Then("It is verified that the Online Admission menu title on the homepage is visible and functional.")
    public void ıt_is_verified_that_the_online_admission_menu_title_on_the_homepage_is_visible_and_functional() {
        Assert.assertTrue(homePage.onlineAdmissionMenuTitle.isDisplayed());
        Assert.assertTrue(homePage.onlineAdmissionMenuTitle.isEnabled());
    }
    @When("Click on the Online Admission menu title.")
    public void click_on_the_online_admission_menu_title() {
        homePage.onlineAdmissionMenuTitle.click();

    }
    @When("It is verified that the school enrollment criteria are visible in the Instructions window on the Online Admission page.")
    public void ıt_is_verified_that_the_school_enrollment_criteria_are_visible_in_the_ınstructions_window_on_the_online_admission_page() {
        Assert.assertTrue(homePage.schoolAdmissionCriteriaLabel.isDisplayed());
    }

    @Given("Launch browser and Navigate to {string}")
    public void launchBrowserAndNavigateTo(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }


    @Then("Verify that Class, First Name, Last Name, Gender, Date Of Birth, Mobile Number, Email TextBoxes are visible " +
            "and data can be entered")
    public void verify_that_class_first_name_last_name_gender_date_of_birth_mobile_number_email_text_boxes_are_visible_and_data_can_be_entered() {

        Assert.assertTrue(homePage.classDropDown.isDisplayed());
        Assert.assertTrue(homePage.firstNameTextBox.isDisplayed());
        Assert.assertTrue(homePage.lastNameTextBox.isDisplayed());
        Assert.assertTrue(homePage.genderDropDown.isDisplayed());
        Assert.assertTrue(homePage.dateOfBirthDateBox.isDisplayed());
        Assert.assertTrue(homePage.mobileNumberTextBox.isDisplayed());
        Assert.assertTrue(homePage.emailTextBox.isDisplayed());

        Assert.assertTrue(homePage.classDropDown.isEnabled());
        Assert.assertTrue(homePage.firstNameTextBox.isEnabled());
        Assert.assertTrue(homePage.lastNameTextBox.isEnabled());
        Assert.assertTrue(homePage.genderDropDown.isEnabled());
        Assert.assertTrue(homePage.dateOfBirthDateBox.isEnabled());
        Assert.assertTrue(homePage.mobileNumberTextBox.isEnabled());
        Assert.assertTrue(homePage.emailTextBox.isEnabled());

    }
    @Then("It is verified that the photo can be uploaded for the student.")
    public void ıt_is_verified_that_the_photo_can_be_uploaded_for_the_student() {

        Assert.assertTrue(homePage.studentPhotoUploadButton.isEnabled());
    }
    @When("It is verified that Class, First Name, Gender, Date Of Birth TextBoxes are required fields.")
    public void ıt_is_verified_that_class_first_name_gender_date_of_birth_text_boxes_are_required_fields() {
        Assert.assertTrue(homePage.classRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.firstNameRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.genderRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.dateOfBirthRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.emailRequiredFieldIcon.isDisplayed());
    }
    @Then("Getting Parent Detail Verifies that Father Name, Mother Name TextBoxes are visible and data can be entered")
    public void gettingParentDetailVerifiesThatFatherNameMotherNameTextBoxesAreVisibleAndDataCanBeEntered() {
        Assert.assertTrue(homePage.fatherNameTextBox.isDisplayed());
        Assert.assertTrue(homePage.motherNameTextBox.isDisplayed());

        Assert.assertTrue(homePage.fatherNameTextBox.isEnabled());
        Assert.assertTrue(homePage.motherNameTextBox.isEnabled());

    }


    @When("Verify that the Guardian: Name, Relation, Email, Phone, Occupation, Address TextBoxes are visible.")
    public void verifyThatTheGuardianNameRelationEmailPhoneOccupationAddressTextBoxesAreVisible() {

        Assert.assertTrue(homePage.guardianNameTextBox.isDisplayed());
        Assert.assertTrue(homePage.guardianRelationTextBox.isDisplayed());
        Assert.assertTrue(homePage.guardianEmailTextBox.isDisplayed());
        Assert.assertTrue(homePage.guardianPhoneTextBox.isDisplayed());
        Assert.assertTrue(homePage.guardianOccupationTextBox.isDisplayed());
        Assert.assertTrue(homePage.guardianAddressTextBox.isDisplayed());
    }


    @When("It is verified that If Guardian Is, Guardian: Name, Relation, and TextBoxes are required fields.")
    public void ıtIsVerifiedThatIfGuardianIsGuardianNameRelationAndTextBoxesAreRequiredFields() {

        Assert.assertTrue(homePage.ifGuardianIsRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.guardianNameRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.guardianRelationRequiredFieldIcon.isDisplayed());
    }

    @When("Verify that photos can be uploaded for parent")
    public void verifyThatPhotosCanBeUploadedForParent() {
        Assert.assertTrue(homePage.guardianPhotoUploadButton.isEnabled());
    }

    @When("Verify that the Father, Mother, Other radio buttons are visible and selectable.")
    public void verifyThatTheFatherMotherOtherRadioButtonsAreVisibleAndSelectable() {
        Assert.assertTrue(homePage.fatherRadioButton.isDisplayed());
        Assert.assertTrue(homePage.motherRadioButton.isDisplayed());
        Assert.assertTrue(homePage.otherRadioButton.isDisplayed());

        Assert.assertTrue(homePage.fatherRadioButton.isEnabled());
        Assert.assertTrue(homePage.motherRadioButton.isEnabled());
        Assert.assertTrue(homePage.otherRadioButton.isEnabled());

    }

    @Then("Verify that National Identification Number, Previous School Details TextBoxes are visible and data-enterable")
    public void verifyThatNationalIdentificationNumberPreviousSchoolDetailsTextBoxesAreVisibleAndDataEnterable() {
        Assert.assertTrue(homePage.nationalIdentificationNumberTextBox.isDisplayed());
        Assert.assertTrue(homePage.previousSchoolDetailsTextBox.isDisplayed());

        Assert.assertTrue(homePage.nationalIdentificationNumberTextBox.isEnabled());
        Assert.assertTrue(homePage.previousSchoolDetailsTextBox.isEnabled());
    }

    @Then("The Upload Documents window verifies that the document can be uploaded")
    public void theUploadDocumentsWindowVerifiesThatTheDocumentCanBeUploaded() {
        Assert.assertTrue(homePage.uploadDocumentsUploadButton.isEnabled());
    }

    @When("Relevant data are entered into the textBoxes on the Online Admission page")
    public void relevantDataAreEnteredIntoTheTextBoxesOnTheOnlineAdmissionPage() {

        Select select = new Select(homePage.classDropDown);
        select.selectByVisibleText(ConfigReader.getProperty("selectClass"));

        homePage.firstNameTextBox.sendKeys(fakerFirstName);
        homePage.lastNameTextBox.sendKeys(fakerLastName);

        Select select2 =new Select(homePage.genderDropDown);
        select2.selectByVisibleText(ConfigReader.getProperty("selectGender"));

        ReusableMethods.jsScrollBy(200);
        ReusableMethods.waitForVisibility(homePage.dateOfBirthDateBox,5);
        homePage.dateOfBirthDateBox.click();
        homePage.july2023Label.click();
        homePage.dateOf2023YearWebTable.click();
        homePage.backToButton.click();
        homePage.dateOf2014YearWebTable.click();
        homePage.dateOfMonthWebTable.click();
        homePage.dateOfDayWebTable.click();


        homePage.emailTextBox.sendKeys(fakerEmail);

        jse.executeScript("arguments[0].click();",homePage.fatherRadioButton);
        homePage.guardianNameTextBox.sendKeys(fakerGuardianName);

    }

    @When("Click on Submit Button")
    public void clickOnSubmitButton() {
        jse.executeScript("arguments[0].scrollIntoView();",homePage.submitButton);
        jse.executeScript("arguments[0].click();",homePage.submitButton);

    }

    @When("Verifies that it is redirected to the Review Entered Details and Status page")
    public void verifiesThatItIsRedirectedToTheReviewEnteredDetailsAndStatusPage() {
        Assert.assertTrue(homePage.reviewEnteredDetailsAndStatusLabel.isDisplayed());
    }

    @Then("Verifies that a Reference Number has been created on behalf of the student")
    public void verifiesThatAReferenceNumberHasBeenCreatedOnBehalfOfTheStudent() {
        Assert.assertTrue(homePage.referenceNoLabel.isDisplayed());
    }

    @Then("Verifies that Form Status is Not Submitted")
    public void verifiesThatFormStatusIsNotSubmitted() {
        String actualFormStatus = homePage.notSubmittedLabel.getText();
        String expectedFormStatus= "Not Submitted";
        Assert.assertTrue(expectedFormStatus.contains(actualFormStatus));
    }

    @When("Verify that Application Date In is The date the registration was created on the Online Admission page")
    public void verifyThatApplicationDateInIsTheDateTheRegistrationWasCreatedOnTheOnlineAdmissionPage() {
        String actualDate = homePage.applicationDateLabel.getText();
        Assert.assertEquals(savedDate,actualDate);
    }

    @When("Local saves the date.")
    public void localSavesTheDate() {
        savedDate= ReusableMethods.localDate();
    }

    @When("Verify that the information on the Review Entered Details and Status page is the information entered on the " +
            "Online Admission page.")
    public void verifyThatTheInformationOnTheReviewEnteredDetailsAndStatusPageIsTheInformationEnteredOnTheOnlineAdmissionPage() {
        String expectedClass= "Class 2";
        String actualClass = homePage.actualClassLabel.getText();
        Assert.assertEquals(expectedClass,actualClass);

        String expectedFirstName= fakerFirstName;
        String actualFirstName = homePage.actualFirstNameLabel.getText();
        Assert.assertEquals(expectedFirstName,actualFirstName);

        String expectedLastName= fakerLastName;
        String actualLastName = homePage.actualLastNameLabel.getText();
        Assert.assertEquals(expectedLastName,actualLastName);

        String expectedGender = "Male";
        String actualGender = homePage.actualGenderLabel.getText();
        Assert.assertEquals(expectedGender,actualGender);

        String expectedDateOfBirth = "05/06/2014";
        String actualDateOfBirth= homePage.actualDateOfBirthLabel.getText();
        Assert.assertEquals(expectedDateOfBirth,actualDateOfBirth);

        String expectedEmail = fakerEmail;
        String actualEmail = homePage.actualEmailLabel.getText();
        Assert.assertEquals(expectedEmail,actualEmail);

        String expectedIfGuardianIs= "Father";
        String actualIfGuardianIs =homePage.actualIfGuardianIsLabel.getText();
        Assert.assertEquals(expectedIfGuardianIs,actualIfGuardianIs);

        String expectedGuardianName = fakerGuardianName;
        String actualGuardianName= homePage.actualGuardianNameLabel.getText();
        Assert.assertEquals(expectedGuardianName,actualGuardianName);

    }

    @Then("Verify that the I Agree To The Terms And Conditions checkBox is visible and clickable.")
    public void verifyThatTheIAgreeToTheTermsAndConditionsCheckBoxIsVisibleAndClickable() {
        Assert.assertTrue(homePage.iAgreeToTheTermsAndConditionscheckBox.isDisplayed());
        Assert.assertTrue(homePage.iAgreeToTheTermsAndConditionscheckBox.isEnabled());
    }

    @Then("I accept the Terms and Conditions checkBox is ticked.")
    public void ıAcceptTheTermsAndConditionsCheckBoxIsTicked() {
        homePage.iAgreeToTheTermsAndConditionscheckBox.click();
    }

    @When("Form Has Been Submitted Successfully..!! Confirmation that the message appears.")
    public void formHasBeenSubmittedSuccessfullyConfirmationThatTheMessageAppears() {
        Assert.assertTrue(homePage.formHasBeenSubmittedSuccessfullyLabel.isDisplayed());
    }


    @Then("Verifies that Form Status is {string}")
    public void verifiesThatFormStatusIs(String expectedFormStatus) {
        String actualFormStatus = homePage.formStatus.getText();
        Assert.assertEquals(expectedFormStatus,actualFormStatus);
    }


    @When("Student photo uploaded")
    public void studentPhotoUploaded() {

        // src/test/java/stepdefinitions/student.png

        jse.executeScript("arguments[0].scrollIntoView();",homePage.studentPhotoUploadButton);

        String studentFilePathVariablePart = System.getProperty("user.dir");
        String studentFilePathSamePart = "/src/test/java/utilities/attachments/student.png";
        String studentFilePath = studentFilePathVariablePart + studentFilePathSamePart ;
        homePage.studentPhotoUploadButton.sendKeys(studentFilePath);


    }

    @When("Guardian Photo uploaded")
    public void guardianPhotoUploaded() {
        jse.executeScript("arguments[0].scrollIntoView();",homePage.guardianPhotoUploadButton);

        // "src/test/java/stepdefinitions/father.jpg"
        String guardianFilePathVariablePart = System.getProperty("user.dir");
        String guardianFilePathSamePart = "/src/test/java/utilities/attachments/father.jpg";
        String guardianFilePath = guardianFilePathVariablePart + guardianFilePathSamePart ;
        homePage.guardianPhotoUploadButton.sendKeys(guardianFilePath);

    }

    @When("Upload documents related to the registration to the Upload Documents window.")
    public void uploadDocumentsRelatedToTheRegistrationToTheUploadDocumentsWindow() {

        jse.executeScript("arguments[0].scrollIntoView();",homePage.uploadDocumentsUploadButton);

        //"src/test/java/stepdefinitions/Document.docx"
        String documentFilePathVariablePart = System.getProperty("user.dir");
        String documentFilePathSamePart = "/src/test/java/utilities/attachments/Document.docx";
        String documentFilePath = documentFilePathVariablePart + documentFilePathSamePart ;

        homePage.uploadDocumentsUploadButton.sendKeys(documentFilePath);

    }

    @When("Verify photo upload for Student")
    public void verifyPhotoUploadForStudent() {
        Assert.assertTrue(homePage.imageStudent.isDisplayed());
    }

    @When("Verify photo upload for Guardian")
    public void verifyPhotoUploadForGuardian() {
        Assert.assertTrue(homePage.imageGuardian.isDisplayed());
    }

    @When("Click on Second Submit Button")
    public void clickOnSecondSubmitButton() {
        homePage.secondSubmitButton.click();
    }

    @Then("Verifies that Form Status is {string} Label.")
    public void verifiesThatFormStatusIsLabel(String expectedSubmittedLabel) {
        String actualFormStatusLabel = homePage.submittedFormStatusLabel.getText();
        Assert.assertEquals(expectedSubmittedLabel,actualFormStatusLabel);
    }


    SoftAssert softAssert = new SoftAssert();

    @Given("Go to Url {string}")
    public void goToUrl(String goUrl) {

          Driver.getDriver().get(ConfigReader.getProperty(goUrl));
    }
    @Then("Press the Pagedown key to move to the bottom of the page")
    public void press_the_pagedown_key_to_move_to_the_bottom_of_the_page() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("Verifies that the text whatPeapleSays is visible")
    public void verifies_that_the_text_what_peaple_says_is_visible() {
        Assert.assertTrue(homePage.whatPeapleSaysText.isDisplayed());
    }
    @Then("Verifies that there are different reviews from different users")
    public void verifies_that_there_are_different_reviews_from_different_users() {
       /* List<WebElement> elementsByXPath = driver.findElements(By.xpath("/html/body/div[6]/div/div/section[6]/div/div/div[2]/div[1]/div/div/div/div"));
        for (WebElement element : elementsByXPath) {
            System.out.println("XPath ile locate edilen kayan yazı: " + element.getText());*/

       List<String> commentList=new ArrayList<>();
        commentList=ReusableMethods.getElementsText(homePage.whatPeapleSaysList);

        Assert.assertNotEquals(commentList.get(0),commentList.get(1));
        }

    @Then("Close the page")
    public void close_page() {
        Driver.closeDriver();
    }

    @Given("Open the browser and go to the {string}")
    public void open_the_browser_and_go_to_the_url(String url) {
        driver.get(ConfigReader.getProperty(url));
    }
    @Given("It is verified that Latest News information is visible in the form of scrolling text on the top bar of the homepage.")
    public void it_is_verified_that_latest_news_information_is_visible_in_the_form_of_scrolling_text_on_the_top_bar_of_the_homepage() {
        Assert.assertTrue(homePage.latestNewsInformation.isDisplayed());
    }
    @Given("It is verified that the site logo and menu titles are visible on the top bar")
    public void it_is_verified_that_the_site_logo_and_menu_titles_are_visible_on_the_top_bar() {
        Assert.assertTrue(homePage.siteLogo.isDisplayed());
        Assert.assertTrue(homePage.homeButton.isDisplayed());
        Assert.assertTrue(homePage.onlineAdmissionButton.isDisplayed());
        Assert.assertTrue(homePage.examResultButton.isDisplayed());
        Assert.assertTrue(homePage.aboutUsButton.isDisplayed());
        Assert.assertTrue(homePage.academicsButton.isDisplayed());
        Assert.assertTrue(homePage.courseButton.isDisplayed());
        Assert.assertTrue(homePage.galleryButton.isDisplayed());
        Assert.assertTrue(homePage.newsButton.isDisplayed());
        Assert.assertTrue(homePage.contactButton.isDisplayed());
    }
    @Given("Clicking on the site logo verifies that the home page refreshes")
    public void clicking_on_the_site_logo_verifies_that_the_home_page_refreshes() {
        String initialUrl = driver.getCurrentUrl();
        homePage.siteLogo.click();
        String afterClickingUrl = driver.getCurrentUrl();

        Assert.assertEquals(initialUrl, afterClickingUrl);
    }
    @Given("Click on the Home button and verify that it redirects to the relevant page")
    public void click_on_the_home_button_and_verify_that_it_redirects_to_the_relevant_page() {
        String initialTitle = driver.getTitle();
        homePage.homeButton.click();
        String afterClickingButton = driver.getTitle();

        Assert.assertEquals(initialTitle, afterClickingButton);
    }
    @Given("Click on the Online Admission button and verify that it redirects to the relevant page")
    public void click_on_the_online_admission_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.onlineAdmissionButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Online Admission Form";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }
    @Given("Click on the Exam Result button and verify that it redirects to the relevant page")
    public void click_on_the_exam_result_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.examResultButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Student Exam Result";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }
    @Given("Click the About Us button and verify that it redirects to the relevant page")
    public void click_the_about_us_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.aboutUsButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "About Us";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }
    @Given("Click on the Course button and verify that it redirects to the relevant page")
    public void click_on_the_course_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.courseButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Course";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }
    @Given("Click the Gallery button and verify that it redirects to the relevant page")
    public void click_the_gallery_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.galleryButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Gallery";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }
    @Given("Click on the News button and verify that it redirects to the relevant page")
    public void click_on_the_news_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.newsButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "News";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }
    @Given("Click the Contact button and verify that it redirects to the relevant page")
    public void click_the_contact_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.contactButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Contact us";

        Assert.assertEquals(initialTitle, afterClickingButton);

        driver.navigate().back();
    }

    @Given("Close the browser")
    public void browser_is_closed() {
        driver.close();
        if (softAssert != null){
            softAssert.assertAll();
        }
    }


    @Given("Academics drop down menu opens in the headings on the top bar of the homepage")
    public void academics_drop_down_menu_opens_in_the_headings_on_the_top_bar_of_the_homepage() {
        homePage.academicsButton.click();
    }
    @Given("Verify that the menu contains Facilities, School Uniform, Principal Message, Know Us, Approach, Teacher, Houses & Mentoring, Student Council pages")
    public void verify_that_the_menu_contains_facilities_school_uniform_principal_message_know_us_approach_teacher_houses_mentoring_student_council_pages() {
        ReusableMethods.waitForVisibility(homePage.academicsFacilitiesButton, 5);
        Assert.assertTrue(homePage.academicsFacilitiesButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsSchoolUniformButton, 5);
        Assert.assertTrue(homePage.academicsSchoolUniformButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsPrincipalMessageButton, 5);
        Assert.assertTrue(homePage.academicsPrincipalMessageButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsKnowUsButton, 5);
        Assert.assertTrue(homePage.academicsKnowUsButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsApproachButton, 5);
        Assert.assertTrue(homePage.academicsApproachButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsTeacherButton, 5);
        Assert.assertTrue(homePage.academicsTeacherButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsHousesAndMentoringButton, 5);
        Assert.assertTrue(homePage.academicsHousesAndMentoringButton.isDisplayed());
        ReusableMethods.waitForVisibility(homePage.academicsStudentCouncilButton, 5);
        Assert.assertTrue(homePage.academicsStudentCouncilButton.isDisplayed());
    }
    @Given("Click on the Facilities button and verify that it redirects to the relevant page")
    public void click_on_the_facilities_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsFacilitiesButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Facilities";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click on the School Uniform button and verify that it redirects to the relevant page")
    public void click_on_the_school_uniform_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsSchoolUniformButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "School Uniform";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click on the Principal Message button and verify that it redirects to the relevant page")
    public void click_on_the_principal_message_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsPrincipalMessageButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Principal Message";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click on the Know Us button and verify that it redirects to the relevant page")
    public void click_on_the_know_us_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsKnowUsButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Know Us";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click the Approach button and verify that it redirects to the relevant page")
    public void click_the_approach_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsApproachButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Approach";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click on the Teacher button and verify that it redirects to the relevant page")
    public void click_on_the_teacher_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsTeacherButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Teacher";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click on the Houses & Mentoring button and verify that it redirects to the relevant page")
    public void click_on_the_houses_mentoring_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsHousesAndMentoringButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Houses & Mentoring";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }
    @Given("Click on the Student Council button and verify that it redirects to the relevant page")
    public void click_on_the_student_council_button_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.academicsStudentCouncilButton.click();
        String initialTitle = driver.getTitle();
        String afterClickingButton = "Student Council";

        Assert.assertEquals(initialTitle, afterClickingButton);

        homePage.academicsButton.click();
    }

    @Given("It is tested that there is a logo with the text Wonder World College on the homepage of the URL")
    public void it_is_tested_that_there_is_a_logo_with_the_text_on_the_homepage_of_the_url() {
        Assert.assertTrue(homePage.siteLogo.isDisplayed());
    }

    @Given("Scroll to the section with Achievements text title on the homepage")
    public void scroll_to_the_section_with_achievements_text_title_on_the_homepage() {
        ReusableMethods.scrollToElement(driver, homePage.achievementsSection);
        ReusableMethods.waitFor(3);
    }
    @Given("The information {string}, {string}, {string}, {string} is displayed here")
    public void the_information_is_displayed_here(String graduatesNumber, String certifiedTeachersNumber, String studentCampusesNumber, String studentsNumber) {
        Assert.assertEquals(ConfigReader.getProperty(graduatesNumber), homePage.achievementsGraduatesNumber.getText());
        Assert.assertEquals(ConfigReader.getProperty(certifiedTeachersNumber), homePage.achievementsCertifiedTeachersNumber.getText());
        Assert.assertEquals(ConfigReader.getProperty(studentCampusesNumber), homePage.achievementsStudentCampusesNumber.getText());
        Assert.assertEquals(ConfigReader.getProperty(studentsNumber), homePage.achievementsStudentsNumber.getText());
    }
    @Given("Verify that the icons of the social networks Facebook, Twitter, Google, Youtube, Linkedin, Instagram, Pinterest are visible in the Follow Us section in the navbar on the homepage")
    public void verify_that_the_icons_of_the_social_networks_facebook_twitter_google_youtube_linkedin_instagram_pinterest_are_visible_in_the_follow_us_section_in_the_navbar_on_the_homepage() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.navBarFacebookIcon.isDisplayed());
        Assert.assertTrue(homePage.navBarTwitterIcon.isDisplayed());
        Assert.assertTrue(homePage.navBarGooglePlusIcon.isDisplayed());
        Assert.assertTrue(homePage.navBarYoutubeIcon.isDisplayed());
        Assert.assertTrue(homePage.navBarLinkedinIcon.isDisplayed());
        Assert.assertTrue(homePage.navBarInstagramIcon.isDisplayed());
        Assert.assertTrue(homePage.navBarPinterestIcon.isDisplayed());
    }
    @Given("Click on the Facebook icon and verify that it redirects to the Facebook homepage")
    public void click_on_the_facebook_icon_and_verify_that_it_redirects_to_the_facebook_homepage() {
        homePage.navBarFacebookIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("facebookUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("facebookUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Twitter icon and verify that it redirects to the Twitter homepage")
    public void click_on_the_twitter_icon_and_verify_that_it_redirects_to_the_twitter_homepage() {
        homePage.navBarTwitterIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Google+ icon and verify that it redirects to the Google+ homepage")
    public void click_on_the_google_icon_and_verify_that_it_redirects_to_the_google_homepage() throws IOException {
        homePage.navBarGooglePlusIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        ReusableMethods.wait(5);
        ReusableMethods.getScreenshot("GooglePlus-NavBar");

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        softAssert.assertEquals(driver.getTitle(), ConfigReader.getProperty("googleplusTitle"));

        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Youtube icon and verify that it redirects to the Youtube homepage")
    public void click_on_the_youtube_icon_and_verify_that_it_redirects_to_the_youtube_homepage() {
        homePage.navBarYoutubeIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("youtubeUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("youtubeUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Linkedin icon and verify that it redirects to the Linkedin homepage")
    public void click_on_the_linkedin_icon_and_verify_that_it_redirects_to_the_linkedin_homepage() {
        homePage.navBarLinkedinIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("linkedinUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("linkedinUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Instagram icon and verify that it redirects to the Instagram homepage")
    public void click_on_the_instagram_icon_and_verify_that_it_redirects_to_the_instagram_homepage() {
        homePage.navBarInstagramIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("instagramUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("instagramUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Pinterest icon and verify that it redirects to the Pinterest homepage")
    public void click_on_the_pinterest_icon_and_verify_that_it_redirects_to_the_pinterest_homepage() throws IOException {
        homePage.navBarPinterestIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        ReusableMethods.wait(5);
        ReusableMethods.getScreenshot("Pinterest-NavBar-");

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        softAssert.assertEquals(driver.getTitle(), ConfigReader.getProperty("pinterestTitle"));

        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Verify that the icons of the social networks Facebook, Twitter, Google, Youtube, Linkedin, Instagram, Pinterest are visible in the Follow Us section in the footer on the homepage")
    public void verify_that_the_icons_of_the_social_networks_facebook_twitter_google_youtube_linkedin_instagram_pinterest_are_visible_in_the_follow_us_section_in_the_footer_on_the_homepage() {
        ReusableMethods.wait(1);
        ReusableMethods.scrollToElement(driver, homePage.footerFacebookIcon);
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.footerFacebookIcon.isDisplayed());
        Assert.assertTrue(homePage.footerTwitterIcon.isDisplayed());
        Assert.assertTrue(homePage.footerGooglePlusIcon.isDisplayed());
        Assert.assertTrue(homePage.footerYoutubeIcon.isDisplayed());
        Assert.assertTrue(homePage.footerLinkedinIcon.isDisplayed());
        Assert.assertTrue(homePage.footerInstagramIcon.isDisplayed());
        Assert.assertTrue(homePage.footerPinterestIcon.isDisplayed());
    }
    @Given("Click on the Facebook icon and verify that it redirects to the Facebook homepage for footer")
    public void click_on_the_facebook_icon_and_verify_that_it_redirects_to_the_facebook_homepage_for_footer() {
        homePage.footerFacebookIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("facebookUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("facebookUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Twitter icon and verify that it redirects to the Twitter homepage for footer")
    public void click_on_the_twitter_icon_and_verify_that_it_redirects_to_the_twitter_homepage_for_footer() {
        homePage.footerTwitterIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Google+ icon and verify that it redirects to the Google+ homepage for footer")
    public void click_on_the_google_icon_and_verify_that_it_redirects_to_the_google_homepage_for_footer() throws IOException {
        homePage.footerGooglePlusIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        ReusableMethods.wait(5);
        ReusableMethods.getScreenshot("GooglePlus-Footer-");

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        softAssert.assertEquals(driver.getTitle(), ConfigReader.getProperty("googleplusTitle"));

        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Youtube icon and verify that it redirects to the Youtube homepage for footer")
    public void click_on_the_youtube_icon_and_verify_that_it_redirects_to_the_youtube_homepage_for_footer() {
        homePage.footerYoutubeIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("youtubeUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("youtubeUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Linkedin icon and verify that it redirects to the Linkedin homepage for footer")
    public void click_on_the_linkedin_icon_and_verify_that_it_redirects_to_the_linkedin_homepage_for_footer() {
        homePage.footerLinkedinIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("linkedinUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("linkedinUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Instagram icon and verify that it redirects to the Instagram homepage for footer")
    public void click_on_the_instagram_icon_and_verify_that_it_redirects_to_the_instagram_homepage_for_footer() {
        homePage.footerInstagramIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("instagramUrl"));
        softAssert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("instagramUrl"));
        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }
    @Given("Click on the Pinterest icon and verify that it redirects to the Pinterest homepage for footer")
    public void click_on_the_pinterest_icon_and_verify_that_it_redirects_to_the_pinterest_homepage_for_footer() throws IOException {
        homePage.footerPinterestIcon.click();
        List<String> windowHandles = ReusableMethods.getAllWindowHandles();
        ReusableMethods.switchToWindowWHD(windowHandles.get(1));

        ReusableMethods.wait(5);
        ReusableMethods.getScreenshot("Pinterest-Footer-");

        //Assert.assertEquals(driver.getCurrentUrl(), ConfigReader.getProperty("twitterUrl"));
        softAssert.assertEquals(driver.getTitle(), ConfigReader.getProperty("pinterestTitle"));

        driver.close();
        ReusableMethods.switchToWindowWHD(windowHandles.get(0));
    }

    @Given("Verify “Complain” heading in the footer is visible")
    public void verify_complain_heading_in_the_footer_is_visible() {

        Assert.assertTrue(homePage.homepageComplainLink.isDisplayed());
    }
    @Given("Verify “Complain” icon in the footer is visible")
    public void verify_complain_icon_in_the_footer_is_visible() {
        Assert.assertTrue(homePage.homepageComplainIcon.isDisplayed());
    }
    @Given("Click on the “Complain” heading")
    public void click_on_the_complain_heading() {
        homePage.homepageComplainLink.click();
    }
    @Given("Verify if page title equals {string}")
    public void verify_if_page_title_equals_complain_title(String title) {
        ReusableMethods.wait(5);
        Assert.assertEquals(title,driver.getTitle());

    }

    @Given("Click on the “Complain” icon")
    public void click_on_the_complain_icon() {
        homePage.homepageComplainIcon.click();

    }

    @Given("Verify that there is textboxes named; ComplainTextBox1, ComplainTextBox2 , ComplainTextBox3, ComplainTextBox4")
    public void verify_that_there_is_textboxes_named_complain_text_box1_complain_text_box2_complain_text_box3_complain_text_box4() {
        ReusableMethods.wait(5);
        Assert.assertTrue(homePage.complainNameBox.isDisplayed());
        Assert.assertTrue(homePage.complainEmailBox.isDisplayed());
        Assert.assertTrue(homePage.complainContactnoBox.isDisplayed());
        Assert.assertTrue(homePage.complainDescriptionBox.isDisplayed());

    }
    @Given("Enter data in the textboxes")
    public void enter_data_in_the_textboxes() {
        homePage.complainNameBox.sendKeys(ConfigReader.getProperty("complaintName"));
        homePage.complainEmailBox.sendKeys("complaintEmail");
        homePage.complainContactnoBox.sendKeys("complaintContactno");
        homePage.complainDescriptionBox.sendKeys("complaintDescription");
    }
    @Given("Click “Submit” button")
    public void click_submit_button() {

        homePage.complainSubmitButton.click();
    }
    @Given("Verify that there is a success message for submitting the complaint")
    public void verify_that_there_is_a_success_message_for_submitting_the_complaint() {

        ReusableMethods.wait(5);
        Assert.assertTrue(homePage.complainSuccessLabel.isDisplayed());

    }

    @Given("Verify that Course link in home header is visible and functional")
    public void verify_that_course_link_in_home_header_is_visible_and_functional() {
        Assert.assertTrue(homePage.courseButton.isDisplayed());
        Assert.assertTrue(homePage.courseButton.isDisplayed());
    }
    @Given("Click on the course link and verify that it redirects to the Course page")
    public void click_on_the_course_link_and_verify_that_it_redirects_to_the_course_page() {
        homePage.courseButton.click();
        homePage.courseButton.click();
        String expectedTitle = driver.getTitle();
        String actualTitle = "Course";

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("Click on the Course link in the home header")
    public void click_on_the_course_link_in_the_home_header() {
        homePage.courseButton.click();
    }
    @Given("Verify that the English and Literature title is visible on the page that opens")
    public void verify_that_the_english_and_literature_title_is_visible_on_the_page_that_opens() {
        Assert.assertTrue(homePage.englishAndLiteratureLabel.isDisplayed());
    }
    @Given("Verify that the Mathematics  title is visible")
    public void verify_that_the_mathematics_title_is_visible() {
        Assert.assertTrue(homePage.mathematicsLabel.isDisplayed());
    }
    @Given("Verify that the Sciences title is visible")
    public void verify_that_the_sciences_title_is_visible() {
        Assert.assertTrue(homePage.sciencesLabel.isDisplayed());
    }
    @Given("Verify that the Social Science title is visible")
    public void verify_that_the_social_science_title_is_visible() {
        Assert.assertTrue(homePage.socialSciencesLabel.isDisplayed());
    }
    @Given("Verify that the History  title is visible")
    public void verify_that_the_history_title_is_visible() {
        Assert.assertTrue(homePage.historyLabel.isDisplayed());
    }
    @Given("Verify that the Arts and Music title is visible")
    public void verify_that_the_arts_and_music_title_is_visible() {
        Assert.assertTrue(homePage.artsAndMusicLabel.isDisplayed());
    }
    @Given("Verify that the Health and Exercise Science title is visible")
    public void verify_that_the_health_and_exercise_science_title_is_visible() {
        Assert.assertTrue(homePage.healthAndExerciseLabel.isDisplayed());
    }
    @Given("Verify that the Foreign Language title is visible")
    public void verify_that_the_foreign_language_title_is_visible() {
        Assert.assertTrue(homePage.foreignLanguageLabel.isDisplayed());
    }
    @Given("Verify that the Computer Science title is visible")
    public void verify_that_the_computer_science_title_is_visible() {
        Assert.assertTrue(homePage.computerScienceLabel.isDisplayed());
    }
    @Given("Click the DETAILS button under English and Literature and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_english_and_literature_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.englishDetailsButton.click();
        Assert.assertTrue(homePage.englishContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();

    }
    @Given("Click the DETAILS button under Mathematics and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_mathematics_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.mathematicsDetailsButton.click();
        Assert.assertTrue(homePage.mathematicsContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under Sciences and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_sciences_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.sciencesDetailsButton.click();
        Assert.assertTrue(homePage.sciencesContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under Social Science and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_social_science_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.socialDetailsButton.click();
        Assert.assertTrue(homePage.socialContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under History and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_history_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.historyDetailsButton.click();
        Assert.assertTrue(homePage.historyContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under Arts and Music and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_arts_and_music_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.artsMusicDetailsButton.click();
        Assert.assertTrue(homePage.artsMusicContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under Health and Exercise and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_health_and_exercise_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.healthsDetailsButton.click();
        Assert.assertTrue(homePage.healthContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under Foreign Language and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_foreign_language_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.foreignDetailsButton.click();
        Assert.assertTrue(homePage.foreignContentLabel.isDisplayed());
        Driver.getDriver().navigate().back();
    }
    @Given("Click the DETAILS button under Computer Science and verify that it redirects to the relevant page.")
    public void click_the_details_button_under_computer_science_and_verify_that_it_redirects_to_the_relevant_page() {
        homePage.computerDetailsButton.click();
        Assert.assertTrue(homePage.computerContentLabel.isDisplayed());
    }


    @Given("Verify that the slider is visible in the Home Page body section")
    public void verify_that_the_slider_is_visible_in_the_home_page_body_section() {
        Assert.assertTrue(homePage.homePageBodyFirstSlider.isDisplayed());
    }
    @Given("Confirm that the images in the slider are visible")
    public void confirm_that_the_images_in_the_slider_are_visible() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOf(homePage.homePageBodyFirstSliderFirstImage));
        Assert.assertTrue(homePage.homePageBodyFirstSliderFirstImage.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(homePage.homePageBodyFirstSliderSecondImage));
        Assert.assertTrue(homePage.homePageBodyFirstSliderSecondImage.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(homePage.homePageBodyFirstSliderThirdImage));
        Assert.assertTrue(homePage.homePageBodyFirstSliderThirdImage.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(homePage.homePageBodyFirstSliderFourthImage));
        Assert.assertTrue(homePage.homePageBodyFirstSliderFourthImage.isDisplayed());

        wait.until(ExpectedConditions.visibilityOf(homePage.homePageBodyFirstSliderFifthImage));
        Assert.assertTrue(homePage.homePageBodyFirstSliderFifthImage.isDisplayed());
    }
    @Given("Ensure that the left scroll button is visible and active")
    public void ensure_that_the_left_scroll_button_is_visible_and_active() {
        Assert.assertTrue(homePage.homePageBodyFirstSliderLeftButton.isDisplayed());
        Assert.assertTrue(homePage.homePageBodyFirstSliderLeftButton.isEnabled());
    }
    @Given("Click on the left scroll button and confirm that the 5th image is visible")
    public void click_on_the_left_scroll_button_and_confirm_that_the_5th_image_is_visible() {
        Driver.getDriver().navigate().refresh();

        homePage.homePageBodyFirstSliderLeftButton.click();
        Assert.assertTrue(homePage.homePageBodyFirstSliderFifthImage.isDisplayed());
    }
    @Given("Ensure that the right scroll button is visible and active")
    public void ensure_that_the_right_scroll_button_is_visible_and_active() {
        Assert.assertTrue(homePage.homePageBodyFirstSliderRightButton.isDisplayed());
        Assert.assertTrue(homePage.homePageBodyFirstSliderRightButton.isEnabled());
    }
    @Given("Click on the right scroll button and confirm that the first image is visible")
    public void click_on_the_right_scroll_button_and_confirm_that_the_first_image_is_visible() {
        homePage.homePageBodyFirstSliderRightButton.click();

        Assert.assertTrue(homePage.homePageBodyFirstSliderFirstImage.isDisplayed());
    }

    @Given("Click on the Gallery link in the top bar of the homepage")
    public void click_on_the_gallery_link_in_the_top_bar_of_the_homepage() {
        homePage.galleryButton.click();
    }
    @Given("Confirm that the page title is {string}")
    public void confirm_that_the_page_title_is(String galleryPageTitle) {
        String expectedTitle = ConfigReader.getProperty(galleryPageTitle);
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Verify that the first image's title is {string} and when clicked, it redirects to a page with the title {string}")
    public void verify_that_the_first_image_s_title_is_and_when_clicked_it_redirects_to_a_page_with_the_title
            (String galleryPageFirstImageTitle, String artMusicPageTitle) {

        String expectedFirstImageTitle = ConfigReader.getProperty(galleryPageFirstImageTitle);
        String actualFirstImageTitle = homePage.homePageGalleryArtMusicButton.getText();

        Assert.assertEquals(expectedFirstImageTitle,actualFirstImageTitle);

        homePage.homePageGalleryArtMusicButton.click();

        String expectedPageTitle = ConfigReader.getProperty(artMusicPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

        Driver.getDriver().navigate().back();
    }
    @Given("Confirm that the second image's title is {string} and when clicked, it redirects to a page with the title {string}")
    public void confirm_that_the_second_image_s_title_is_and_when_clicked_it_redirects_to_a_page_with_the_title
            (String galleryPageSecondImageTitle, String campusPageTitle) {

        String expectedSecondImageTitle = ConfigReader.getProperty(galleryPageSecondImageTitle);
        String actualSecondImageTitle = homePage.homePageGalleryCampusButton.getText();

        Assert.assertEquals(expectedSecondImageTitle,actualSecondImageTitle);

        homePage.homePageGalleryCampusButton.click();

        String expectedPageTitle = ConfigReader.getProperty(campusPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

        Driver.getDriver().navigate().back();
    }
    @Given("Verify that the third image's title is {string} and when clicked, it redirects to a page with the title {string}")
    public void verify_that_the_third_image_s_title_is_and_when_clicked_it_redirects_to_a_page_with_the_title
            (String galleryPageThirdImageTitle, String activitiesPageTitle) {

        String expectedThirdImageTitle = ConfigReader.getProperty(galleryPageThirdImageTitle);
        String actualThirdImageTitle = homePage.homePageGalleryActivitiesButton.getText();

        Assert.assertEquals(expectedThirdImageTitle,actualThirdImageTitle);

        homePage.homePageGalleryActivitiesButton.click();

        String expectedPageTitle = ConfigReader.getProperty(activitiesPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

        Driver.getDriver().navigate().back();
    }
    @Given("Confirm that the fourth image's title is {string} and when clicked, it redirects to a page with the title {string}")
    public void confirm_that_the_fourth_image_s_title_is_and_when_clicked_it_redirects_to_a_page_with_the_title
            (String galleryPageFourthImageTitle, String prePrimaryPageTitle) {

        String expectedFourthImageTitle = ConfigReader.getProperty(galleryPageFourthImageTitle);
        String actualFourthImageTitle = homePage.homePageGalleryPrePrimaryButton.getText();

        Assert.assertEquals(expectedFourthImageTitle,actualFourthImageTitle);

        homePage.homePageGalleryPrePrimaryButton.click();

        String expectedPageTitle = ConfigReader.getProperty(prePrimaryPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

        Driver.getDriver().navigate().back();
    }
    @Given("Verify that the fifth image's title is {string} and when clicked, it redirects to a page with the title {string}")
    public void verify_that_the_fifth_image_s_title_is_and_when_clicked_it_redirects_to_a_page_with_the_title
            (String galleryPageFifthImageTitle, String classroomsPageTitle) {

        String expectedFifthImageTitle = ConfigReader.getProperty(galleryPageFifthImageTitle);
        String actualFifthImageTitle = homePage.homePageGalleryClassroomsButton.getText();

        Assert.assertEquals(expectedFifthImageTitle,actualFifthImageTitle);

        homePage.homePageGalleryClassroomsButton.click();

        String expectedPageTitle = ConfigReader.getProperty(classroomsPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle,actualPageTitle);

        Driver.getDriver().navigate().back();
    }
    @Given("Confirm that the sixth image's title is {string} and when clicked, it redirects to a page with the title {string}")
    public void confirm_that_the_sixth_image_s_title_is_and_when_clicked_it_redirects_to_a_page_with_the_title
            (String galleryPageSixthImageTitle, String sportsPageTitle) {

        String expectedSixthImageTitle = ConfigReader.getProperty(galleryPageSixthImageTitle);
        String actualSixthImageTitle = homePage.homePageGallerySportsButton.getText();

        Assert.assertEquals(expectedSixthImageTitle, actualSixthImageTitle);

        homePage.homePageGallerySportsButton.click();

        String expectedPageTitle = ConfigReader.getProperty(sportsPageTitle);
        String actualPageTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedPageTitle, actualPageTitle);

        Driver.getDriver().navigate().back();
    }
    //US_004--------------------------------------------------------------------------------------------
    @Then("Click on Exam Result menu title.")
    public void clickOnExamResultMenuTitle() {
        homePage.examResultMenuTitle.click();
    }

    @Then("It is verified that it redirects to the Exam Result page.")
    public void ıtIsVerifiedThatItRedirectsToTheExamResultPage() {
        Assert.assertTrue(homePage.examResultTitle.isDisplayed());
    }

    @When("Verify that Admission No and Exam textBox are visible on Exam Result page")
    public void verifyThatAdmissionNoAndExamTextBoxAreVisibleOnExamResultPage() {
        Assert.assertTrue(homePage.admissionNoTextBox.isDisplayed());
        Assert.assertTrue(homePage.examDropDown.isDisplayed());
    }

    @When("It is verified that the Admission No and Exam textBoxes are mandatory fields for data entry.")
    public void ıtIsVerifiedThatTheAdmissionNoAndExamTextBoxesAreMandatoryFieldsForDataEntry() {
        Assert.assertTrue(homePage.admissionNoRequiredFieldIcon.isDisplayed());
        Assert.assertTrue(homePage.examRequiredFieldIcon.isDisplayed());
    }

    @When("Verifies that the Search button is visible")
    public void verifiesThatTheSearchButtonIsVisible() {
        Assert.assertTrue(homePage.searchButton.isDisplayed());
    }

    @When("Student Admission No {string} is entered into the Admission No textBox")
    public void studentAdmissionNoIsEnteredIntoTheAdmissionNoTextBox(String admissionNo) {
        homePage.admissionNoTextBox.sendKeys(ConfigReader.getProperty("hilalAdmissionNo"));
    }

    @When("Exam data is selected from Exam {string} dropdown.")
    public void examDataIsSelectedFromExamDropdown(String exam) {
        ReusableMethods.selectAnItemFromDropdown(homePage.examDropDown,ConfigReader.getProperty("hilalSelectExam"));
    }

    @When("Click the Search button")
    public void clickTheSearchButton() {
        homePage.searchButton.click();
    }

    @When("Confirmation that the student's exam results are displayed")
    public void confirmationThatTheStudentSExamResultsAreDisplayed() {

        Assert.assertTrue(homePage.noteLabel.isDisplayed());
    }

    @Then("Verify that the topic is listed with Max Marks, Min Marks, Points Received, Grade headings.")
    public void verifyThatTheTopicIsListedWithMaxMarksMinMarksPointsReceivedGradeHeadings() {
        Assert.assertTrue(homePage.subjectLabel.isDisplayed());
        Assert.assertTrue(homePage.maxMarksLabel.isDisplayed());
        Assert.assertTrue(homePage.minMarksLabel.isDisplayed());
        Assert.assertTrue(homePage.marksObtainedLabel.isDisplayed());
        Assert.assertTrue(homePage.noteLabel.isDisplayed());
    }

    @Then("Verifies that Percentage, Rank, Result, Division, Grand Total, Total Obtained Marks are displayed")
    public void verifiesThatPercentageRankResultDivisionGrandTotalTotalObtainedMarksAreDisplayed() {
        Assert.assertTrue(homePage.percentageLabel.isDisplayed());
        Assert.assertTrue(homePage.rankLabel.isDisplayed());
        Assert.assertTrue(homePage.resultPassLabel.isDisplayed());
        Assert.assertTrue(homePage.divisionLabel.isDisplayed());
        Assert.assertTrue(homePage.grandTotalLabel.isDisplayed());
        Assert.assertTrue(homePage.totalObtainMarksLabel.isDisplayed());
    }

    @Then("If the Received Signals data is greater than the Min Signals data, the Result information is verified as Passed, if less than Failed.")
    public void ıfTheReceivedSignalsDataIsGreaterThanTheMinSignalsDataTheResultInformationIsVerifiedAsPassedIfLessThanFailed() {

        List<String> valueMarksObtained = ReusableMethods.getElementsText(By.xpath("//*[@id='headerTable']/tbody/tr[2]/td[4]"));

        double valueMarksObtained1 = Double.parseDouble(valueMarksObtained.get(0));
        System.out.println(valueMarksObtained1);

        List<String> valueMinMarks = ReusableMethods.getElementsText(By.xpath("//*[@id='headerTable']/tbody/tr[2]/td[3]"));
        double valueMinMarks2 =Double.parseDouble(valueMinMarks.get(0));
        System.out.println(valueMinMarks2);

        if (valueMarksObtained1>valueMinMarks2){
            String passOrFail= homePage.resultPassLabel.getText();
            Assert.assertEquals("Pass",passOrFail);
        }else {
            String passOrFail= homePage.resultPassLabel.getText();
            Assert.assertNotEquals("Pass",passOrFail);
        }

    }

    @Then("The visibility of the OUR EXPERIENCED STAFFS section is verified")
    public void theVisibilityOfTheOUREXPERIENCEDSTAFFSSectionIsVerified() {

        jse.executeScript("arguments[0].scrollIntoView();",homePage.ourExperiencedStaffsPart);
        Assert.assertTrue(homePage.ourExperiencedStaffsPart.isDisplayed());
    }

    @Then("Confirmed to be named {string}, {string}, {string}, {string}")
    public void confirmedToBeNamed(String parameter1, String parameter2, String parameter3, String parameter4) {

        jse.executeScript("arguments[0].scrollIntoView();",homePage.ourExperiencedStaffsPart);
        String actualparameter1 = homePage.anthonyCarter.getText();
        Assert.assertEquals(parameter1,actualparameter1);

        String actualParameter2 = homePage.avaTurner.getText();
        Assert.assertEquals(parameter2,actualParameter2);

        String actualParameter3 = homePage.davidMorgan.getText();
        Assert.assertEquals(parameter3,actualParameter3);

        String actualParameter4 = homePage.lilyPeterson.getText();
        Assert.assertEquals(parameter4,actualParameter4);


    }


    @Given("Click on Academics in the top bar of the homepage and verify that the Teacher link is visible and clickable.")
    public void click_on_academics_in_the_top_bar_of_the_homepage_and_verify_that_the_teacher_link_is_visible_and_clickable() {
       homePage.academicsButton.click();
       homePage.teacherPageLink.isDisplayed();
       homePage.teacherPageLink.click();
    }
    @Given("Verify that the navigated page is the teacher page.")
    public void verify_that_the_navigated_page_is_the_teacher_page() {
    String actualUrl=Driver.getDriver().getCurrentUrl();
    String expectedIcerik="teacher";
    Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }

    @Given("*It should be verified that {int} teachers \\(with name, surname and branch information) are displayed on the Teachers page.")
    public void it_should_be_verified_that_teachers_with_name_surname_and_branch_information_are_displayed_on_the_teachers_page(Integer int1) {
        homePage.teachersList.isDisplayed();

    }


    @Given("Close the browser.")
    public void close_the_browser() {
        Driver.closeDriver();


    }

    @Given("Navigate to {string}.")
    public void navigate_to(String givenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(givenUrl));
    }

    @Given("Verify that the homepage page is displayed.")
    public void verify_that_the_homepage_page_is_displayed() {
        Assert.assertTrue(homePage.homePageButton.isDisplayed());
    }

    @Given("Click on the contact tab.")
    public void click_on_the_contact_tab() {
        homePage.homePageContactButton.click();
    }
    @Given("Verify contact page.")
    public void verify_contact_page() {
        Assert.assertTrue(homePage.contactPageSendInLabel.isDisplayed());
    }
    @Given("Verify that the name textbox on the contact page is available.")
    public void verify_that_the_name_textbox_on_the_contact_page_is_available() {
        Assert.assertTrue(homePage.contactPageNameTextBox.isEnabled());
    }
    @Given("Verify that the email textbox on the contact page is available.")
    public void verify_that_the_email_textbox_on_the_contact_page_is_available() {
        Assert.assertTrue(homePage.contactPageEmailTextBox.isEnabled());
    }
    @Given("Verify that the subject textbox on the contact page is available.")
    public void verify_that_the_subject_textbox_on_the_contact_page_is_available() {
        Assert.assertTrue(homePage.contactPageSubjectTextBox.isEnabled());
    }
    @Given("Verify that the Description textbox on the contact page is available.")
    public void verify_that_the_description_textbox_on_the_contact_page_is_available() {
        Assert.assertTrue(homePage.contactPageDescriptionTextBox.isEnabled());
    }
    @Given("Verify that the submit button on the contact page is available.")
    public void verify_that_the_submit_button_on_the_contact_page_is_available() {
        Assert.assertTrue(homePage.contactPageSubmitButton.isEnabled());
    }
    @Given("Verify that OUR LOCATION on the contact page is visible.")
    public void verify_that_our_location_on_the_contact_page_is_visible() {
        Assert.assertTrue(homePage.contactPageOurLocationBox.isDisplayed());
    }
    @Given("Verify that CALL US on the contact page is visible.")
    public void verify_that_call_us_on_the_contact_page_is_visible() {
        Assert.assertTrue(homePage.contactPageCallUsBox.isDisplayed());
    }
    @Given("Verify that WORKING HOURS on the contact page is visible.")
    public void verify_that_working_hours_on_the_contact_page_is_visible() {
        Assert.assertTrue(homePage.contactPageWorkingHoursBox.isDisplayed());
    }

    @Given("Enter a {string} in the name textbox on the contact page.")
    public void enter_a_in_the_name_textbox_on_the_contact_page(String givenName) {
        homePage.contactPageNameTextBox.sendKeys(givenName);
    }
    @Given("Enter your {string} into the email textbox on the contact page.")
    public void enter_your_into_the_email_textbox_on_the_contact_page(String givenEmail) {
        homePage.contactPageEmailTextBox.sendKeys(givenEmail);
    }
    @Given("Enter a {string} in the subject textbox on the contact page.")
    public void enter_a_in_the_subject_textbox_on_the_contact_page(String givenSub) {
        homePage.contactPageSubjectTextBox.sendKeys(givenSub);
    }
    @Given("Enter a {string} in the Description textbox on the contact page.")
    public void enter_a_in_the_description_textbox_on_the_contact_page(String givenDesc) {
        homePage.contactPageDescriptionTextBox.sendKeys(givenDesc);
    }
    @Given("Click the submit button on the contact page.")
    public void click_the_submit_button_on_the_contact_page() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();",homePage.contactPageSubmitButton);
    }
    @Given("Verify that Record Saved Successfully is displayed.")
    public void verify_that_record_saved_successfully_is_displayed() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(homePage.contactPageRecordText.isDisplayed());
    }

    @Given("Verify that email is displayed in the Navbar on the Home Page.")
    public void verify_that_email_is_displayed_in_the_navbar_on_the_home_page() {
        Assert.assertTrue(homePage.homePageNavbarEmailAdress.isDisplayed());
    }
    @Given("Verify that call us is displayed in the top bar of the Home Page.")
    public void verify_that_call_us_is_displayed_in_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.homePageHeaderCallUsBox.isDisplayed());
    }
    @Given("Verify that phone information is displayed in the footer on the Home Page.")
    public void verify_that_phone_information_is_displayed_in_the_footer_on_the_home_page() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",homePage.homePageFooterContactBox);
        Assert.assertTrue(homePage.homePageFooterContactBox.isDisplayed());
    }
    @Given("Verify that your email address is displayed in the footer on the Home Page.")
    public void verify_that_your_email_address_is_displayed_in_the_footer_on_the_home_page() {
        Assert.assertTrue(homePage.homePageFooterEmailUsBox.isDisplayed());
    }
    @Given("Verify that the school address is displayed in the footer on the Home Page.")
    public void verify_that_the_school_address_is_displayed_in_the_footer_on_the_home_page() {
        Assert.assertTrue(homePage.homePageFooterAdressBox.isDisplayed());
    }

}
