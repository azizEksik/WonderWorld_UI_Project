package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AdminStepdefinition {

    AdminPage adminPage = new AdminPage();

    Actions actions = new Actions(Driver.getDriver());

    WebDriver driver = Driver.getDriver();




    @Given("Enter the correct username that is {string}")
    public void enter_the_correct_username_that_is(String correctUsername) {
        adminPage.vahdeddinAdminLoginPageEmailBox.sendKeys(ConfigReader.getProperty(correctUsername));
    }
    @Given("Enter the correct password that is {string}")
    public void enter_the_correct_password_that_is(String correctPasasword) {
        adminPage.adminLoginPagePasswordBox.sendKeys(ConfigReader.getProperty(correctPasasword));
    }
    @Given("Click the admin panel Sign In button")
    public void click_the_admin_panel_sign_in_button() {
        adminPage.adminSignInButton.click();
    }
    @Given("Click on the Transport menu title on the admin homepage")
    public void click_on_the_transport_menu_title_on_the_admin_homepage() {
        adminPage.adminPageTransportDropdown.click();
    }
    @Given("Click on Routes page link")
    public void click_on_routes_page_link() {
        adminPage.adminPageRoutesLink.click();
    }
    @Given("In the Create Route window on the Route page, verify that the Route Title textBox is visible and active")
    public void in_the_create_route_window_on_the_route_page_verify_that_the_route_title_text_box_is_visible_and_active() {
        Assert.assertTrue(adminPage.adminPageRouteTittleTextBox.isEnabled());
    }
    @Given("Verify that the Save button is visible and active")
    public void verify_that_the_save_button_is_visible_and_active() {
        Assert.assertTrue(adminPage.adminPageRouteSaveButton.isEnabled());
    }

    @Given("Enter the text in the Route Tittle textBox")
    public void enter_the_text_test_route_in_the_route_tittle_text_box() {
        adminPage.adminPageRouteTittleTextBox.sendKeys(ConfigReader.getProperty("vahdeddinRouteTestKaydi"));
    }

    @Given("Click on the Save button")
    public void click_on_the_save_button() {
        adminPage.adminPageRouteSaveButton.click();
    }

    @Given("Verifies that test route is among the records in the route list")
    public void verifies_that_test_route_is_among_the_records_in_the_route_list() {
        List<WebElement> rotaKayitListesi = driver.findElements(By.xpath("//tbody/tr"));
        List<String> rotaKayitListesiStr=ReusableMethods.getElementsText(rotaKayitListesi);

        /*
        int flag=0;
        for (int i = 0; i <rotaKayitListesiStr.size() ; i++) {
            if(rotaKayitListesiStr.get(i).contains(ConfigReader.getProperty("vahdeddinRouteTestKaydi"))){
                flag=i+1;
                Assert.assertTrue(rotaKayitListesiStr.get(i).contains(ConfigReader.getProperty("vahdeddinRouteTestKaydi")));
            }
        }
        String eklenenElemanLocater="//tbody/tr["+flag+"]";

         */

        for (String each:rotaKayitListesiStr) {
            if (each.contains(ConfigReader.getProperty("vahdeddinRouteTestKaydi"))) {
                Assert.assertTrue(each.contains(ConfigReader.getProperty("vahdeddinRouteTestKaydi")));
                System.out.println(each);
            }
        }


    }

    @Given("Route List header is verified to be")
    public void route_list_header_is_verified_to_be() {
        Assert.assertTrue(adminPage.adminPageRouteRouteListLabel.isDisplayed());
    }

    @Given("Route Tittle header is verified to be")
    public void route_tittle_header_is_verified_to_be() {
        Assert.assertTrue(adminPage.adminPageRouteRouteTittleLabel.isDisplayed());
    }

    @Given("Action header is verified to be")
    public void action_header_is_verified_to_be() {
        Assert.assertTrue(adminPage.adminPageRouteActionLabel.isDisplayed());
    }
    @Given("Click the edit button opposite Test-Route in the route list")
    public void click_the_edit_button_opposite_test_route_in_the_route_list() {
        List<WebElement> rotaKayitListesi = driver.findElements(By.xpath("//tbody/tr"));
        List<String> rotaKayitListesiStr=ReusableMethods.getElementsText(rotaKayitListesi);
        int flag=0;

        for (int i = 0; i <rotaKayitListesiStr.size() ; i++) {
            System.out.println(rotaKayitListesiStr.get(i));
            if(rotaKayitListesiStr.get(i).contains(ConfigReader.getProperty("vahdeddinRouteTestKaydi"))){
                flag=i+1;
                Assert.assertTrue(rotaKayitListesiStr.get(i).contains(ConfigReader.getProperty("vahdeddinRouteTestKaydi")));

            }
        }

        WebElement editButon = driver.findElement(By.xpath("(//*[@class=\"fa fa-pencil\"])["+flag+"]"));
        editButon.click();
    }
    @Given("Route Update is written in the Route Tittle textBox")
    public void is_written_in_the_route_tittle_text_box() {
        adminPage.adminPageRouteTittleTextBox.sendKeys(ConfigReader.getProperty("vahdeddinRouteTestKaydiUpdate"));
    }

    @Given("Verify that route update is among the records in the route list")
    public void verify_that_is_among_the_records_in_the_route_list() {
        List<WebElement> rotaKayitListesi = driver.findElements(By.xpath("//tbody/tr"));
        List<String> rotaKayitListesiStr=ReusableMethods.getElementsText(rotaKayitListesi);
        for (String each:rotaKayitListesiStr) {
            if (each.contains(ConfigReader.getProperty("vahdeddinRouteTestKaydiUpdate"))) {
                Assert.assertTrue(each.contains(ConfigReader.getProperty("vahdeddinRouteTestKaydiUpdate")));
                System.out.println(each);
            }
        }
    }
    @Given("Click on the edit Save button")
    public void click_on_the_edit_save_button() {
        adminPage.adminPageRouteSaveButton.click();
    }


    @Given("Click the delete button opposite Test_Route_Update in the route list")
    public void click_the_delete_button_opposite_in_the_route_list() {
        List<WebElement> rotaKayitListesi = driver.findElements(By.xpath("//tbody/tr"));
        List<String> rotaKayitListesiStr=ReusableMethods.getElementsText(rotaKayitListesi);
        int flag=0;

        for (int i = 0; i <rotaKayitListesiStr.size() ; i++) {
            if(rotaKayitListesiStr.get(i).contains(ConfigReader.getProperty("vahdeddinRouteTestKaydiUpdate"))){
                flag=i+1;
                Assert.assertTrue(rotaKayitListesiStr.get(i).contains(ConfigReader.getProperty("vahdeddinRouteTestKaydiUpdate")));
            }
        }

        WebElement deleteButon = driver.findElement(By.xpath("(//*[@class=\"fa fa-remove\"])["+flag+"]"));
        deleteButon.click();
    }
    @Given("Click OK on the alert text that appears")
    public void click_ok_on_the_alert_text_that_appears() {
        driver.switchTo().alert().accept();
    }
    @Given("Verifies that Test_Route_Update is not among the records in the route list")
    public void verifies_that_is_not_among_the_records_in_the_route_list() {
        List<WebElement> rotaKayitListesi = driver.findElements(By.xpath("//tbody/tr"));
        List<String> rotaKayitListesiStr=ReusableMethods.getElementsText(rotaKayitListesi);
        for (String each:rotaKayitListesiStr) {
                Assert.assertFalse(each.contains(ConfigReader.getProperty("vahdeddinRouteTestKaydiUpdate")));

        }
    }







    @Given("The browser is opened, and the {string} is navigated to")
    public void the_browser_is_opened_and_the_is_navigated_to(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @Then("Login is performed as an admin")
    public void login_is_performed_as_an_admin() {
        adminPage.adminLoginPageEmailBox.sendKeys(ConfigReader.getProperty("azizAdminUserName"));
        adminPage.adminLoginPagePasswordBox.sendKeys(ConfigReader.getProperty("azizAdminPassword"));
        adminPage.adminLoginPageSingInButton.click();
    }
    @Then("It is verified that the profile icon is visible in the top-left corner of the admin panel")
    public void it_is_verified_that_the_profile_icon_is_visible_in_the_top_left_corner_of_the_admin_panel() {
        Assert.assertTrue(adminPage.adminPageProfileIcon.isDisplayed());

    }
    @Then("When the profile icon is clicked, it is confirmed that the opened window displays the account owner's name, role, and visible links to Profile, Password, and Logout")
    public void when_the_profile_icon_is_clicked_it_is_confirmed_that_the_opened_window_displays_the_account_owner_s_name_role_and_visible_links_to_profile_password_and_logout() {
        adminPage.adminPageProfileIcon.click();
        Assert.assertTrue(adminPage.adminPageProfileIconNameText.isDisplayed());
        Assert.assertTrue(adminPage.adminPageProfileIconRoleText.isDisplayed());

        for (WebElement link : adminPage.adminPageProfileIconAllLink){
            Assert.assertTrue(link.isDisplayed());
        }

    }
    @Then("The browser is closed")
    public void the_browser_is_closed() {
        Driver.quitDriver();
    }

    @Then("Click on the profile icon and profile link in the top-left bar of the admin panel")
    public void click_on_the_profile_icon_and_profile_link_in_the_top_left_bar_of_the_admin_panel() {
        adminPage.adminPageProfileIcon.click();
        adminPage.adminPageProfileLink.click();
    }
    @Then("Verify that the Profile page is accessed")
    public void verify_that_the_profile_page_is_accessed() {
        String expectedUrl = ConfigReader.getProperty("adminProfileUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Then("Confirm that it is possible to navigate to the Profile, Payroll, Leaves, Attendance, and Documents pages on the opened Profile page")
    public void confirm_that_it_is_possible_to_navigate_to_the_profile_payroll_leaves_attendance_and_documents_pages_on_the_opened_profile_page() {
        adminPage.adminPageProfileIconProfileLinkProfileButton.click();
        Assert.assertTrue(adminPage.adminPageProfileIconProfileLinkProfileButtonPhoneText.isDisplayed());

        adminPage.adminPageProfileIconProfileLinkPayrollButton.click();
        Assert.assertTrue(adminPage.adminPageProfileIconProfileLinkPayrollButtonTotalNetSalaryPaidText.isDisplayed());

        adminPage.adminPageProfileIconProfileLinkLeavesButton.click();
        Assert.assertTrue(adminPage.adminPageProfileIconProfileLinkLeavesButtonLeaveTypeText.isDisplayed());

        adminPage.adminPageProfileIconProfileLinkAttendanceButton.click();
        Assert.assertTrue(adminPage.adminPageProfileIconProfileLinkAttendanceButtonTotalPresentText.isDisplayed());

        adminPage.adminPageProfileIconProfileLinkDocumentsButton.click();
        Assert.assertTrue(adminPage.adminPageProfileIconProfileLinkDocumentsButtonNoRecordFoundText.isDisplayed());

    }

    @Then("Click on the Profile link on the Profile page")
    public void click_on_the_profile_link_on_the_profile_page() {
        adminPage.adminPageProfileIconProfileLinkProfileButton.click();
    }
    @Then("Verify that General Information is visible")
    public void verify_that_general_information_is_visible() {
        for (WebElement generalInformation : adminPage.adminPageProfileIconProfilePageProfileButtonAllGeneralInformationRow){
            Assert.assertTrue(generalInformation.isDisplayed());
        }
    }
    @Then("Confirm that Address Details are visible")
    public void confirm_that_address_details_are_visible() {
        for (WebElement addressDetails : adminPage.adminPageProfileIconProfilePageProfileButtonAllAddressDetailsRow){
            Assert.assertTrue(addressDetails.isDisplayed());
        }
    }
    @Then("Validate that Bank Account Details are visible")
    public void validate_that_bank_account_details_are_visible() {
        for (WebElement bankAccountDetails : adminPage.adminPageProfileIconProfilePageProfileButtonAllBankAccountDetailsRow){
            Assert.assertTrue(bankAccountDetails.isDisplayed());
        }

    }
    @Then("Ensure that Social Media Links are visible and clicking on them provides access to the respective social media pages")
    public void ensure_that_social_media_links_are_visible_and_clicking_on_them_provides_access_to_the_respective_social_media_pages() {
        for (int i = 0; i < 5; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }

        ReusableMethods.wait(3);

        String firstWindowHandle = Driver.getDriver().getWindowHandle();

        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageProfileButtonFacebookLink.isDisplayed());
        adminPage.adminPageProfileIconProfilePageProfileButtonFacebookLink.click();

        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();

        String facebookWindowHandle = "";

        for (String eachWh : windowHandleSet){
            if (!eachWh.equals(firstWindowHandle)){
                facebookWindowHandle = eachWh;
            }
        }

        Driver.getDriver().switchTo().window(facebookWindowHandle);

        String expectedFacebookLink = ConfigReader.getProperty("facebook");
        String actualFacebookLink = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualFacebookLink.contains(expectedFacebookLink));

        Driver.getDriver().switchTo().window(firstWindowHandle);

        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageProfileButtonTwitterLink.isDisplayed());
        adminPage.adminPageProfileIconProfilePageProfileButtonTwitterLink.click();

        windowHandleSet = Driver.getDriver().getWindowHandles();
        String twitterWindowHandle = "";
        for (String eachWh : windowHandleSet){
            if (!firstWindowHandle.equals(eachWh) && !facebookWindowHandle.equals(eachWh)){
                twitterWindowHandle = eachWh;
            }
        }

        Driver.getDriver().switchTo().window(twitterWindowHandle);

        String expectedTwitterLink = ConfigReader.getProperty("Twitter");
        String actualTwitterLink = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualTwitterLink.contains(expectedTwitterLink));

        Driver.getDriver().switchTo().window(firstWindowHandle);

        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageProfileButtonLinkedinLink.isDisplayed());
        adminPage.adminPageProfileIconProfilePageProfileButtonLinkedinLink.click();

        windowHandleSet = Driver.getDriver().getWindowHandles();
        String linkedinWindowHandle = "";
        for (String eachWh : windowHandleSet){
            if (!firstWindowHandle.equals(eachWh)
                    && !facebookWindowHandle.equals(eachWh)
                    && !twitterWindowHandle.equals(eachWh)){

                linkedinWindowHandle = eachWh;

            }
        }

        Driver.getDriver().switchTo().window(linkedinWindowHandle);

        String expectedLinkedinLink = ConfigReader.getProperty("Linkedin");
        String actualLinkedinLink = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualLinkedinLink.contains(expectedLinkedinLink));

        Driver.getDriver().switchTo().window(firstWindowHandle);

        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageProfileButtonInstagramLink.isDisplayed());
        adminPage.adminPageProfileIconProfilePageProfileButtonInstagramLink.click();

        windowHandleSet = Driver.getDriver().getWindowHandles();
        String instagramWindowHandle = "";
        for (String eachWh : windowHandleSet ){
            if (!firstWindowHandle.equals(eachWh)
                    && !facebookWindowHandle.equals(eachWh)
                    && !twitterWindowHandle.equals(eachWh)
                    && !linkedinWindowHandle.equals(eachWh)){

                instagramWindowHandle = eachWh;

            }
        }

        Driver.getDriver().switchTo().window(instagramWindowHandle);

        String expectedInstagramLink = ConfigReader.getProperty("Instagram");
        String actualInstagramLink = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualInstagramLink.contains(expectedInstagramLink));

        Driver.getDriver().switchTo().window(firstWindowHandle);

        Driver.quitDriver();

    }

    @Then("Click on the Payroll link")
    public void click_on_the_payroll_link() {
        adminPage.adminPageProfileIconProfileLinkPayrollButton.click();
    }
    @Then("Verify that the Total Net Salary Paid information board is visible")
    public void verify_that_the_total_net_salary_paid_information_board_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonTotalNetSalaryInformationBoard.isDisplayed());
    }
    @Then("Confirm that the Total Gross Salary information board is visible")
    public void confirm_that_the_total_gross_salary_information_board_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonTotalGrossSalaryBoard.isDisplayed());
    }
    @Then("Validate that the Total Earning information board is visible")
    public void validate_that_the_total_earning_information_board_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonTotalEarningBoard.isDisplayed());
    }
    @Then("Ensure that the Total Deduction information board is visible")
    public void ensure_that_the_total_deduction_information_board_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonTotalDeductionBoard.isDisplayed());
    }
    @Then("Confirm that the first column header of the Payslip List is {string} and it is visible")
    public void confirm_that_the_first_column_header_of_the_payslip_list_is_and_it_is_visible(String title) {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipMonthYearLink.isDisplayed());

        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipMonthYearLink.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Verify that the second column header of the Payslip List is {string} and it is visible")
    public void verify_that_the_second_column_header_of_the_payslip_list_is_and_it_is_visible(String title) {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipDateLink.isDisplayed());

        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipDateLink.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Validate that the third column header of the Payslip List is {string} and it is visible")
    public void validate_that_the_third_column_header_of_the_payslip_list_is_and_it_is_visible(String title) {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipModeLink.isDisplayed());

        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipModeLink.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Ensure that the fourth column header of the Payslip List is {string} and it is visible")
    public void ensure_that_the_fourth_column_header_of_the_payslip_list_is_and_it_is_visible(String title) {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipStatusLink.isDisplayed());

        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipStatusLink.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Confirm that the fifth column header of the Payslip List is {string} and it is visible")
    public void confirm_that_the_fifth_column_header_of_the_payslip_list_is_and_it_is_visible(String title) {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipNetSalaryLink.isDisplayed());

        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipNetSalaryLink.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Then("Verify that the sixth column header of the Payslip List is {string} and it is visible")
    public void verify_that_the_sixth_column_header_of_the_payslip_list_is_and_it_is_visible(String title) {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipActionLink.isDisplayed());

        String expectedTitle = ConfigReader.getProperty(title);
        String actualTitle = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipActionLink.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Then("Click on the Paylist headers and verify that filtering is applied.")
    public void click_on_the_paylist_headers_and_verify_that_filtering_is_applied() {
        adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipMonthYearLink.click();

        String expectedSalaryRow = ConfigReader.getProperty("payslipNetSalaryColumnFirstRow");
        String actualSalaryRow = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipNetSalaryFirstRowText.getText();

        Assert.assertEquals(expectedSalaryRow,actualSalaryRow);

    }
    @Then("Confirm that the search textBox within the Paylist is visible, active, and performs searches when information is entered.")
    public void confirm_that_the_search_text_box_within_the_paylist_is_visible_active_and_performs_searches_when_information_is_entered() {
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonSearchTextBox.isDisplayed());
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePagePayrollButtonSearchTextBox.isEnabled());
        adminPage.adminPageProfileIconProfilePagePayrollButtonSearchTextBox.sendKeys(ConfigReader.getProperty("payslipNetSalaryColumnFirstRow"));

        String expectedRow = ConfigReader.getProperty("payslipNetSalaryColumnFirstRow");
        String actualRow = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipNetSalaryFirstRowText.getText();

        Assert.assertEquals(expectedRow,actualRow);

    }

    @Then("Verify that clicking on the View Payslip link under the Action heading displays the corresponding payslip for the relevant period")
    public void verify_that_clicking_on_the_link_under_the_action_heading_displays_the_corresponding_payslip_for_the_relevant_period() {

        adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipViewPayslipButton.click();

        String expectedDate = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipLastRowDateText.getText();
        String actualDate = adminPage.adminPageProfileIconProfilePagePayrollButtonPayslipPayslipDetailBoardDateText.getText();

        Assert.assertTrue(actualDate.contains(expectedDate));

    }


    @Then("Click on the Leaves link")
    public void click_on_the_leaves_link() {
        adminPage.adminPageProfileIconProfileLinkLeavesButton.click();
    }
    @Then("Verify that the Leave List displays menu headers as Leave Type, Leave Date, Days, Apply Date, Status, Action")
    public void verify_that_the_leave_list_displays_menu_headers_as_leave_type_leave_date_days_apply_date_status_action() {
        String expectedLeaveTypeTitle = ConfigReader.getProperty("LeavesFirstColumnTitle");
        String actualLeaveTypeTitle = adminPage.adminPageProfileIconProfilePageLeavesButtonLeaveTypeColumnHeaderText.getText();

        Assert.assertEquals(expectedLeaveTypeTitle,actualLeaveTypeTitle);

        String expectedLeaveDateTitle = ConfigReader.getProperty("LeavesSecondColumnTitle");
        String actualLeaveDateTitle = adminPage.adminPageProfileIconProfilePageLeavesButtonLeaveDateColumnHeaderText.getText();

        Assert.assertEquals(expectedLeaveDateTitle,actualLeaveDateTitle);

        String expectedDaysTitle = ConfigReader.getProperty("LeavesThirdColumnTitle");
        String actualDaysTitle = adminPage.adminPageProfileIconProfilePageLeavesButtonDaysColumnHeaderText.getText();

        Assert.assertEquals(expectedDaysTitle,actualDaysTitle);

        String expectedApplyDateTitle = ConfigReader.getProperty("LeavesFourthColumnTitle");
        String actualApplyDateTitle = adminPage.adminPageProfileIconProfilePageLeavesButtonApplyDateColumnHeaderText.getText();

        Assert.assertEquals(expectedApplyDateTitle,actualApplyDateTitle);

        String expectedStatusTitle = ConfigReader.getProperty("LeavesFifthColumnTitle");
        String actualStatusTitle = adminPage.adminPageProfileIconProfilePageLeavesButtonStatusColumnHeaderText.getText();

        Assert.assertEquals(expectedStatusTitle,actualStatusTitle);

        String expectedActionTitle = ConfigReader.getProperty("LeavesSixthColumnTitle");
        String actualActionTitle = adminPage.adminPageProfileIconProfilePageLeavesButtonActionColumnHeaderText.getText();

        Assert.assertEquals(expectedActionTitle,actualActionTitle);

    }
    @Then("Click on the view icon under the Action heading on the Leave List to display the relevant leave details")
    public void click_on_the_view_icon_under_the_action_heading_on_the_leave_list_to_display_the_relevant_leave_details() {
        String expectedApplyDateDetail = adminPage.adminPageProfileIconProfilePageLeavesButtonApplyDateLastRowText.getText();
        adminPage.adminPageProfileIconProfilePageLeavesButtonActionLastViewIcon.click();
        String actualApplyDateDetail =
                adminPage.adminPageProfileIconProfilePageLeavesButtonActionLastViewIconDetailBoardApplyDate.getText();

        Assert.assertEquals(expectedApplyDateDetail,actualApplyDateDetail);
    }


    @Then("Click on the Attendance link.")
    public void click_on_the_attendance_link() {
        adminPage.adminPageProfileIconProfileLinkAttendanceButton.click();
    }
    @Then("Verify that the information boards display Total Present, Total Late, Total Absent, Total Half Day, Total Holiday")
    public void verify_that_the_information_boards_display() {

        int expectedSize = 5;
        int actualSize = 0;

        for (WebElement eachWb : adminPage.adminPageProfileIconProfilePageAttendanceButtonAllInformationBoard){
            Assert.assertTrue(eachWb.isDisplayed());
            actualSize++;
        }

        Assert.assertEquals(expectedSize,actualSize);
    }
    @Then("Confirm that the explanation of symbols \\(P, L, A, F, H) used for attendance is visible.")
    public void confirm_that_the_explanation_of_symbols_p_l_a_f_h_used_for_attendance_is_visible() {

        int expectedSize = 5;
        int actualSize = 0;

        for (WebElement eachWb : adminPage.adminPageProfileIconProfilePageAttendanceButtonAlLExplainSymbolText){
            Assert.assertTrue(eachWb.isDisplayed());
            actualSize++;
        }

        Assert.assertEquals(expectedSize,actualSize);
    }
    @Then("Ensure that the attendance list on the Attendance page is visible and listed as Day-Month format.")
    public void ensure_that_the_attendance_list_on_the_attendance_page_is_visible_and_listed_as_day_month_format() {

        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageAttendanceButtonDayMonthTable.isDisplayed());

        String expectedTitle1 = "Date";
        String expectedTitle2 = "Month";
        String actualTitle = adminPage.adminPageProfileIconProfilePageAttendanceButtonDayMonthTitleText.getText();

        Assert.assertTrue(actualTitle.contains(expectedTitle1));
        Assert.assertTrue(actualTitle.contains(expectedTitle2));

    }
    @Then("Validate that the attendance year to be displayed is visible and selectable on the Attendance page")
    public void validate_that_the_attendance_year_to_be_displayed_is_visible_and_selectable_on_the_attendance_page() {

        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageAttendanceButtonYearDropdownMenu.isDisplayed());
        Assert.assertTrue(adminPage.adminPageProfileIconProfilePageAttendanceButtonYearDropdownMenu.isEnabled());

        Select select = new Select(adminPage.adminPageProfileIconProfilePageAttendanceButtonYearDropdownMenu);

        List<WebElement> dropdownOptions = select.getAllSelectedOptions();

        for (WebElement each : dropdownOptions){

            Assert.assertTrue(each.isDisplayed());
            Assert.assertTrue(each.isEnabled());

        }
    }

    @Then("Click on the profile icon in the top left bar of the Admin panel and then click on the Password link")
    public void click_on_the_profile_icon_in_the_top_left_bar_of_the_admin_panel_and_then_click_on_the_password_link() {

        adminPage.adminPageProfileIcon.click();
        adminPage.adminPageProfileIconPasswordLink.click();
    }
    @Then("Verify that the Current Password textBox is visible")
    public void verify_that_the_current_password_text_box_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconPasswordLinkCurrentPasswordTextBox.isDisplayed());
    }
    @Then("Confirm that the New Password textBox is visible")
    public void confirm_that_the_new_password_text_box_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconPasswordLinkNewPasswordTextBox.isDisplayed());
    }
    @Then("Ensure that the Confirm Password textBox is visible")
    public void ensure_that_the_confirm_password_text_box_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconPasswordLinkConfirmPasswordTextBox.isDisplayed());
    }
    @Then("Validate that the Change Password button is visible")
    public void validate_that_the_change_password_button_is_visible() {
        Assert.assertTrue(adminPage.adminPageProfileIconPasswordLinkChangePasswordButton.isDisplayed());
    }
    @Then("Enter a valid value in the {string} Current Password textBox")
    public void enter_a_valid_value_in_the_current_password_text_box(String currentPassword) {
        adminPage.adminPageProfileIconPasswordLinkCurrentPasswordTextBox.sendKeys(ConfigReader.getProperty(currentPassword));
    }
    @Then("Enter a valid value in the {string} New Password textBox")
    public void enter_a_valid_value_in_the_new_password_text_box(String newPassword) {
        adminPage.adminPageProfileIconPasswordLinkNewPasswordTextBox.sendKeys(ConfigReader.getProperty(newPassword));
    }
    @Then("Enter a valid value in the {string} Confirm Password textBox")
    public void enter_a_valid_value_in_the_confirm_password_text_box(String confirmPassword) {
        adminPage.adminPageProfileIconPasswordLinkConfirmPasswordTextBox.sendKeys(ConfigReader.getProperty(confirmPassword));
    }
    @Then("Click on the Change Password button")
    public void click_on_the_change_password_button() {
        adminPage.adminPageProfileIconPasswordLinkChangePasswordButton.click();
    }
    @Then("Confirm that the password has been successfully changed")
    public void confirm_that_the_password_has_been_successfully_changed() {
        String expectedText = ConfigReader.getProperty("successfullyPasswordChange");
        String actualText = adminPage.adminPageProfileIconPasswordLinkSuccessfullyPasswordText.getText();

        Assert.assertEquals(expectedText,actualText);
    }

    @Then("Click on the profile icon in the top left bar of the Admin panel, and then click on the Logout link")
    public void click_on_the_profile_icon_in_the_top_left_bar_of_the_admin_panel_and_then_click_on_the_logout_link() {
        adminPage.adminPageProfileIcon.click();
        adminPage.adminPageProfileIconLogOutLink.click();
    }
    @Then("Verify that the logout is successful")
    public void verify_that_the_logout_is_successful() {
        String expectedUrl = ConfigReader.getProperty("adminLoginUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Given("Click on the Fees Collection menu heading in the admin panel's sidebar")
    public void click_on_the_fees_collection_menu_heading_in_the_admin_panel_s_sidebar() {
        adminPage.adminPageSideBarFeesCollectionLink.click();
    }
    @Given("Verify that the Fees Master page link is visible")
    public void verify_that_the_fees_master_page_link_is_visible() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterLink.isDisplayed());
    }
    @Given("Click on the Fees Master page link and confirm that the redirected page is indeed the feemaster page")
    public void click_on_the_fees_master_page_link_and_confirm_that_the_redirected_page_is_indeed_the_feemaster_page() {
        adminPage.adminPageSideBarFeesCollectionFeesMasterLink.click();

        String expectedUrl = ConfigReader.getProperty("adminPageFeeMasterPageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Given("Click on the Fees Master page link")
    public void click_on_the_fees_master_page_link() {
        adminPage.adminPageSideBarFeesCollectionFeesMasterLink.click();
    }
    @Given("Verify that the Fees Group textBox is visible in the Add Fees Master section")
    public void verify_that_the_fees_group_text_box_is_visible_in_the_add_fees_master_section() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterFeesGroupDropdownMenu.isDisplayed());
    }
    @Given("Confirm that the Fees Type textBox is visible in the Add Fees Master section")
    public void confirm_that_the_fees_type_text_box_is_visible_in_the_add_fees_master_section() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterFeesTypeDropdownMenu.isDisplayed());
    }
    @Given("Ensure that the Due Date textBox is visible in the Add Fees Master section")
    public void ensure_that_the_due_date_text_box_is_visible_in_the_add_fees_master_section() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterDueDateDateBox.isDisplayed());
    }
    @Given("Validate that the Amount Percentage\\(%) textBox is visible in the Add Fees Master section")
    public void validate_that_the_amount_percentage_text_box_is_visible_in_the_add_fees_master_section() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterAmountTextBox.isDisplayed());
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterPercentageTextBox.isDisplayed());
    }
    @Given("Verify that the Fix Amount textBox is visible in the Add Fees Master section")
    public void verify_that_the_fix_amount_text_box_is_visible_in_the_add_fees_master_section() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterFixAmountTextBox.isDisplayed());
    }
    @Given("Confirm that the Fine Type radio buttons are visible in the Add Fees Master section")
    public void confirm_that_the_fine_type_radio_buttons_are_visible_in_the_add_fees_master_section() {
        int expectedSize = 3;
        int actualSize = 0;

        for (WebElement each : adminPage.adminPageSideBarFeesCollectionFeesMasterAllFineTypeRadioButton){
            Assert.assertTrue(each.isDisplayed());
            actualSize++;
        }

        Assert.assertEquals(expectedSize,actualSize);

    }
    @Given("Verify that the headers in the Fees Master List section are " +
            "{string}, {string}, {string}, and {string}, and they are visible")
    public void verify_that_the_headers_in_the_fees_master_list_section_are_and_and_they_are_visible(
            String feesGroupTitle, String feesCodeTitle, String amountTitle, String actionTitle) {

        String expectedFeesGroupTitle = ConfigReader.getProperty(feesGroupTitle);
        String actualFeesGroupTitle = adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListFeesGroupTitleText.getText();

        Assert.assertEquals(expectedFeesGroupTitle,actualFeesGroupTitle);

        String expectedFeesCodeTitle = ConfigReader.getProperty(feesCodeTitle);
        String actualFeesCodeTitle = adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListFeesCodeTitleText.getText();

        Assert.assertEquals(expectedFeesCodeTitle,actualFeesCodeTitle);

        String expectedAmountTitle = ConfigReader.getProperty(amountTitle);
        String actualAmountTitle = adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListAmountTitleText.getText();

        Assert.assertEquals(expectedAmountTitle,actualAmountTitle);

        String expectedActionTitle = ConfigReader.getProperty(actionTitle);
        String actualActionTitle = adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListActionTitleText.getText();

        Assert.assertEquals(expectedActionTitle,actualActionTitle);

    }

    @Given("Verify that the search TextBox in the Fees Master List section is visible and accessible")
    public void verify_that_the_search_text_box_in_the_fees_master_list_section_is_visible_and_accessible() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListSearchTextBox.isDisplayed());
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListSearchTextBox.isEnabled());
    }

    @Given("Enter valid values in Add Fees Master, upon clicking Save, verify a new Fees Master record is created")
    public void enter_valid_values_in_add_fees_master_upon_clicking_save_verify_a_new_fees_master_record_is_created() {
        Select select1 = new Select(adminPage.adminPageSideBarFeesCollectionFeesMasterFeesGroupDropdownMenu);

        select1.selectByVisibleText("Transportation Extra");

        Select select2 = new Select(adminPage.adminPageSideBarFeesCollectionFeesMasterFeesTypeDropdownMenu);

        select2.selectByVisibleText("5th Installment Fees");

        adminPage.adminPageSideBarFeesCollectionFeesMasterDueDateDateBox.click();

        adminPage.adminPageSideBarFeesCollectionFeesMasterDueDateDateBoxRandomDate.click();

        adminPage.adminPageSideBarFeesCollectionFeesMasterAmountTextBox.sendKeys(ConfigReader.getProperty("adminPageFeesMasterAddFeesMasterPaid"));

        int counter = 0;

        for (WebElement each : adminPage.adminPageSideBarFeesCollectionFeesMasterAllFineTypeRadioButton){
            counter++;
            if (3 == counter){
                each.click();
            }
        }

        adminPage.adminPageSideBarFeesCollectionFeesMasterFixAmountTextBox
                .sendKeys(ConfigReader.getProperty("adminPageFeesMasterAddFeesMasterPaid"));

        adminPage.adminPageSideBarFeesCollectionFeesMasterAddFeesMasterSaveButton.click();

        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterAddFeesMasterRecordSavedText.isDisplayed());

    }

    @Given("Click the edit icon of the newly created Fees Master record in Fees Master List")
    public void click_the_edit_icon_of_the_newly_created_fees_master_record_in_fees_master_list() {
        adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListSearchTextBox
                .sendKeys(ConfigReader.getProperty("adminPageFeesMasterFeesMasterListAmountPaid"));

        adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListEditButton.click();

    }
    @Given("Confirm that the Edit Fees Master window appears")
    public void confirm_that_the_edit_fees_master_window_appears() {

        String expectedTitle = "Edit";
        String actualTitle = adminPage.adminPageSideBarFeesCollectionFeesMasterEditFeesMasterEditTitleText.getText();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    @Given("Enter valid values in Edit Fees Master and click Save")
    public void enter_valid_values_in_edit_fees_master_and_click_save() {

        adminPage.adminPageSideBarFeesCollectionFeesMasterAmountTextBox.click();

        for (int i = 0; i < 30; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }

        adminPage.adminPageSideBarFeesCollectionFeesMasterAmountTextBox
                .sendKeys(ConfigReader.getProperty("adminPageFeesMasterAddFeesMasterPaid2"));

        adminPage.adminPageSideBarFeesCollectionFeesMasterFixAmountTextBox.click();

        for (int i = 0; i < 30; i++) {
            actions.sendKeys(Keys.BACK_SPACE).perform();
        }

        adminPage.adminPageSideBarFeesCollectionFeesMasterFixAmountTextBox
                .sendKeys(ConfigReader.getProperty("adminPageFeesMasterAddFeesMasterPaid2"));

        adminPage.adminPageSideBarFeesCollectionFeesMasterAddFeesMasterSaveButton.click();

        //Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterAddFeesMasterRecordUpdateText.isDisplayed());

    }
    @Given("Verify that the registered fees are updated")
    public void verify_that_the_registered_fees_are_updated() {
        Assert.assertTrue(adminPage.adminPageSideBarFeesCollectionFeesMasterAddFeesMasterRecordUpdateText.isDisplayed());
    }
    @Given("Click the delete icon next to the registered Fees in the Fees Master List section to confirm its deletion")
    public void click_the_delete_icon_next_to_the_registered_fees_in_the_fees_master_list_section_to_confirm_its_deletion() {
        adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListSearchTextBox
                .sendKeys(ConfigReader.getProperty("adminPageFeesMasterFeesMasterListAmountPaid2"));

        adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListDeleteButton.click();

        Driver.getDriver().switchTo().alert().accept();

        adminPage.adminPageSideBarFeesCollectionFeesMasterFeesMasterListSearchTextBox
                .sendKeys(ConfigReader.getProperty("adminPageFeesMasterFeesMasterListAmountPaid2"));

        int counter = 0;

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='col-md-3'])[2]/a[2]")));

            counter++;

        }catch (Exception e){

        }

        Assert.assertEquals(0,counter);

    }



    @Then("Login as admin")
    public void loginAsAdmin() {
        adminPage.adminLoginUsername.click();
        adminPage.adminLoginUsername.sendKeys(ConfigReader.getProperty("nurettinAdminUserName"));

        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB);


                actions.sendKeys(ConfigReader.getProperty("nurettinAdminPassword"))
                .sendKeys(Keys.ENTER)
                .click().perform();
    }

    @Then("In the admin panel's sidebar,click Income link")
    public void ın_the_admin_panel_s_sidebar_click_ıncome_link() {
        adminPage.adminIncomeLink.click();

    }

    @Then("verifies that Add Income link is displayed and Click Add Income link")
    public void verifies_that_add_ıncome_link_is_displayed_and_click_add_ıncome_link() {
        Assert.assertTrue(adminPage.adminIncomeLink.isDisplayed());
        adminPage.adminAddIncome.click();
    }

    @And("Verifies that Income Head dropdown menu, Name, Invoice Number, Date, Amount, and Description are displayed")
    public void verifiesThatIncomeHeadDropdownMenuNameInvoiceNumberDateAmountAndDescriptionAreDisplayed() {
        Assert.assertTrue(adminPage.adminAddIncomeIncomeHead.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeName.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeInvoiceNumber.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeDate.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeAmount.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeAttachDocument.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeDescription.isDisplayed());

    }

    @Then("Verifies that the allowed the uploading of documents")
    public void verifies_that_the_allowed_the_uploading_of_documents() {

        String projectPath = System.getProperty("user.dir");
        String filePathInJava = "/src/test/java/utilities/attachments/sunset.jpg";
        String filePathFull= projectPath+filePathInJava;

       adminPage.adminAddIncomeDocument.sendKeys(filePathFull);
       actions.moveToElement(adminPage.adminAddIncomeDocument).perform();
       Assert.assertTrue(adminPage.adminAddIncomeDocumentRemove.isDisplayed());


    }


    @Then("Verifies that when clicking the Save button, a new Income record should be created")
    public void verifies_that_when_clicking_the_button_a_new_ıncome_record_should_be_created() {

       adminPage.adminAddIncomeIncomeHeadDropDownMenu2.click();
       ReusableMethods.wait(2);

        actions.sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("Ali")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("100")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        ReusableMethods.wait(2);
        String actualData="Record Saved Successfully";
        String expectedData=adminPage.adminAddIncomeSaveSuccesfully.getText();
        Assert.assertEquals(expectedData, actualData);


    }

    @Given("In the sidebar in the admin panel, the Multi Class Student page link should be displayed under the Student Information menu title.")
    public void in_the_sidebar_in_the_admin_panel_the_multi_class_student_page_link_should_be_displayed_under_the_student_information_menu_title() {
        //  adminPage.adminLoginButton.click();
        adminPage.usernameTextbox.click();
        adminPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ahmetAdminUserName"));
        adminPage.passwordTextbox.click();
        adminPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ahmetAdminPassword"));
        adminPage.signInButton.click();
        ReusableMethods.waitFor(1);
        adminPage.studentInformation.click();
        adminPage.multiClassStdntLink.click();


    }

    @Given("Time the Multi Class Student page link is clicked, the multiclass page should be displayed.")
    public void time_the_multi_class_student_page_link_is_clicked_the_multiclass_page_should_be_displayed() {

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "multiclass";
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }

    @Given("On the multiclass page, the Class and Section textBoxes that can be searched among the students in the school and the Search button should be displayed and it should be seen that students can be searched and students are listed.")
    public void on_the_multiclass_page_the_class_and_section_text_boxes_that_can_be_searched_among_the_students_in_the_school_and_the_search_button_should_be_displayed_and_it_should_be_seen_that_students_can_be_searched_and_students_are_listed() {
        adminPage.classDropDown.isDisplayed();
        adminPage.sectionDropDown.isDisplayed();
        adminPage.searchButton.isDisplayed();

        Select select = new Select(adminPage.classDropDown);
        select.selectByVisibleText("Class 1");

        Select select1 = new Select(adminPage.sectionDropDown);
        select1.selectByValue("1");

        adminPage.searchButton.click();


    }

    @Given("A new class can be added by clicking the \\(+) icon in the window of the student selected for update among the listed students.")
    public void a_new_class_can_be_added_by_clicking_the_icon_in_the_window_of_the_student_selected_for_update_among_the_listed_students() {

        adminPage.addingIcon.click();
        Assert.assertTrue(adminPage.multiClassAddingRemoveButton.isDisplayed());

    }

    @Given("The class can be deleted by clicking the remove button in the window of the student selected for update among the listed students.")
    public void the_class_can_be_deleted_by_clicking_the_remove_button_in_the_window_of_the_student_selected_for_update_among_the_listed_students() {
        adminPage.multiClassAddingRemoveButton.click();
    }

    @Given("Save the changes made by clicking the update button.")
    public void save_the_changes_made_by_clicking_the_update_button() {

        adminPage.multiClassUpdateButton.click();
        Assert.assertTrue(adminPage.updateSuccessText.isDisplayed());
    }

    @Given("Browser must be closed.")
    public void browser_must_be_closed() {
        Driver.closeDriver();
    }


    @Given("In the sidebar in the admin panel, the Collect Fees page link should be displayed under the Fees Collection menu title and when clicked, it should redirect to the studentfee page.")
    public void ın_the_sidebar_in_the_admin_panel_the_collect_fees_page_link_should_be_displayed_under_the_fees_collection_menu_title_and_when_clicked_it_should_redirect_to_the_studentfee_page() {
        adminPage.usernameTextbox.click();
        adminPage.usernameTextbox.sendKeys(ConfigReader.getProperty("ahmetAdminUserName"));
        adminPage.passwordTextbox.click();
        adminPage.passwordTextbox.sendKeys(ConfigReader.getProperty("ahmetAdminPassword"));
        adminPage.signInButton.click();
        adminPage.feesCollectionMenu.click();
        adminPage.collectFeesLink.click();
        String actauUrl = Driver.getDriver().getCurrentUrl();
        String expectedContents = "studentfee";
        Assert.assertTrue(actauUrl.contains(expectedContents));
    }
    @Given("Select the Class section and click Search and Collect Fees. Student Fess list titles should be displayed.")
    public void select_the_class_section_and_click_search_and_collect_fees_student_fess_list_titles_should_be_displayed() {
        Select select = new Select(adminPage.stdntFeeClassDropDown);
        select.selectByVisibleText("Class 1");
        Select select1 = new Select(adminPage.stdntFeeSectionDropDown);
        select1.selectByValue("1");
        adminPage.stdntFeeSearchButton.click();
        adminPage.stdntFeeCollectFeesButton.click();
        adminPage.stdntFeeHeaders.isDisplayed();
    }
    @Given("USD EUR is exchanged in the top bar of the admin panel, it should be seen that the fees in the Student Fees list change according to the selection.")
    public void usd_eur_is_exchanged_in_the_top_bar_of_the_admin_panel_it_should_be_seen_that_the_fees_in_the_student_fees_list_change_according_to_the_selection() {
        adminPage.moneyIcon.click();
        ReusableMethods.waitFor(1);
        adminPage.iconEUR.click();
        ReusableMethods.waitFor(1);
        String actualMoney = adminPage.paidHeader.getText();
        String expectedIcon = "€";
        Assert.assertTrue(actualMoney.contains(expectedIcon));
        adminPage.moneyIcon.click();
        ReusableMethods.waitFor(1);
        adminPage.iconUSD.click();
        ReusableMethods.waitFor(1);
        String actualMoney1 = adminPage.paidHeader.getText();
        String expectedIcon1 = "$";
        Assert.assertTrue(actualMoney1.contains(expectedIcon1));
    }
    @Given("Payment should be entered from the window opened by clicking under the Action title of the payment whose Status in the Student Fees list is Unpaid.")
    public void payment_should_be_entered_from_the_window_opened_by_clicking_under_the_action_title_of_the_payment_whose_status_in_the_student_fees_list_is_unpaid() {

    }
    @Given("The payment made can be reversed by clicking the Revert icon under the Action heading of the payment whose Status in the Student Fees list is Paid.")
    public void the_payment_made_can_be_reversed_by_clicking_the_revert_icon_under_the_action_heading_of_the_payment_whose_status_in_the_student_fees_list_is_paid() {
        adminPage.addFeesIcon.click();
        ReusableMethods.waitFor(1);
        adminPage.$CollectFeesButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(adminPage.revertIcon.isDisplayed());
    }
    @Given("The payment made and the remaining payment total in the Student Fees list should be displayed.")
    public void the_payment_made_and_the_remaining_payment_total_in_the_student_fees_list_should_be_displayed() {
        adminPage.totalPaid.isDisplayed();
        adminPage.totalBalance.isDisplayed();
        System.out.println("Total Paid : " + adminPage.totalPaid.getText());
        System.out.println("Total Balance : " + adminPage.totalBalance.getText());
    }
    @Given("Browser is closed")
    public void browser_is_closed() {
        Driver.closeDriver();
    }





    @Given("Login as admin {string} and {string}")
    public void login_as_admin_and(String username, String password) {
        adminPage.adminLoginUsername.click();
        ReusableMethods.wait(1);
        adminPage.adminLoginUsername.sendKeys(ConfigReader.getProperty(username));
        ReusableMethods.wait(1);
        actions.sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty(password))
                .sendKeys(Keys.ENTER)
                .click().perform();
    }

    // US_023 Steps
    @Given("Verify student name click redirects to relevant profile page.")
    public void verify_student_name_click_redirects_to_relevant_profile_page() {
        ReusableMethods.wait(2);
        adminPage.studentInformationMenu.click();
        Assert.assertTrue(adminPage.studentDetailsButton.isDisplayed());
        adminPage.studentDetailsButton.click();
    }
    // US_023 Steps
    @Given("Verify active Class, Section dropdowns, Search By Keyword textBox, and search buttons on Search page")
    public void verify_active_class_section_dropdowns_search_by_keyword_text_box_and_search_buttons_on_search_page() {
        Assert.assertTrue(adminPage.classSelectDropDown.isDisplayed() && adminPage.classSelectDropDown.isEnabled());
        Assert.assertTrue(adminPage.sectionSelectDropDown.isDisplayed() && adminPage.sectionSelectDropDown.isEnabled());
        Assert.assertTrue(adminPage.studentDetails1SearchButton.isDisplayed() && adminPage.studentDetails1SearchButton.isEnabled());
        Assert.assertTrue(adminPage.studentDetails2SearchButton.isDisplayed() && adminPage.studentDetails2SearchButton.isEnabled());
    }
    // US_023 Steps
    @Given("Search according to the criteria selected in Class and Section dropdowns")
    public void search_according_to_the_criteria_selected_in_class_and_section_dropdowns() {
        Select select = new Select(adminPage.classSelectDropDown);
        select.selectByIndex(2);

        select = new Select(adminPage.sectionSelectDropDown);
        select.selectByIndex(1);

        adminPage.studentDetails1SearchButton.click();
    }
    // US_023 Steps
    @Given("Verify List with headings: Admission No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, Action on Search page")
    public void verify_list_with_headings_admission_no_student_name_class_father_name_date_of_birth_gender_category_mobile_number_action_on_search_page() {
        ReusableMethods.wait(2);

        Assert.assertTrue(adminPage.studentSearchListHeadersAdmissionNo.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersStudentName.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersClass.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersFatherName.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersDateOfBirth.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersGender.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersCategory.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersMobileNumber.isDisplayed());
        Assert.assertTrue(adminPage.studentSearchListHeadersAction.isDisplayed());
    }
    // US_023 Steps
    @Given("Clicking on the student's name from the resulting list verifies that it redirects to the relevant student's profile page")
    public void clicking_on_the_student_s_name_from_the_resulting_list_verifies_that_it_redirects_to_the_relevant_student_s_profile_page() {
        ReusableMethods.waitForClickablility(adminPage.firstStudentOnTheSearchList, 15);
        adminPage.firstStudentOnTheSearchList.click();

        Assert.assertTrue(adminPage.studentProfileName.isDisplayed());
    }

    @Then("Verifies that the Income List section should display columns: Name, Description, Invoice Number, Date, Income Head, and Amount")
    public void verifies_that_the_income_list_section_should_display_columns_name_description_invoice_number_date_income_head_and_amount() {
        Assert.assertTrue(adminPage.adminAddIncomeIncomeListName.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeIncomeListDescription.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeIncomeListInvoiceNumber.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeIncomeListDate.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeIncomeListIncomeHead.isDisplayed());
        Assert.assertTrue(adminPage.adminAddIncomeIncomeListAmount.isDisplayed());


    }
    @Then("Verifies that The Income List section should have a search box to enable searching for specific data")
    public void verifies_that_the_section_should_have_a_search_box_to_enable_searching_for_specific_data() {
        adminPage.adminAddIncomeIncomeListSearchBox.click();
        actions.sendKeys("Ali"+Keys.ENTER).perform();

    }
    @Then("Verifies that The number of records displayed on one page in the Income List section should be changeable")
    public void verifies_that_the_number_of_records_displayed_on_one_page_in_the_section_should_be_changeable() {

        Select select= new Select(adminPage.adminAddIncomeIncomeListDropDown);
        int actualOptions =select.getOptions().size();

        Assert.assertTrue(actualOptions>1);


    }

    @Given("In the list created, click on the view button under the Action heading")
    public void in_the_list_created_click_on_the_view_button_under_the_action_heading() {
        adminPage.studentSearchListActionViewButton.click();
    }
    @Given("It is verified that the student is redirected to the profile page")
    public void it_is_verified_that_the_student_is_redirected_to_the_profile_page() {
        Assert.assertTrue(adminPage.studentProfileName.isDisplayed());
    }

    @Given("In the list created, click on the edit button under the Action heading")
    public void in_the_list_created_click_on_the_edit_button_under_the_action_heading() {
        adminPage.studentSearchByKeyword.sendKeys("berke.baramuk");
        adminPage.studentDetails2SearchButton.click();
        ReusableMethods.wait(2);

        adminPage.studentSearchListActionEditButton.click();
    }
    @Given("On the edit page, Student, Transportation Details, Fee Details, Parent_Guardian Details, Address Details, Miscellaneous Details information is edited")
    public void on_the_edit_page_student_transportation_details_fee_details_parent_guardian_details_address_details_miscellaneous_details_information_is_edited() {
        ReusableMethods.wait(2);

        Faker faker = new Faker();

        adminPage.studentEditAdmissionNoBox.clear();
        adminPage.studentEditAdmissionNoBox.sendKeys(faker.number().toString());

        adminPage.studentEditFirstNameBox.clear();
        adminPage.studentEditFirstNameBox.sendKeys(faker.name().firstName());

        ReusableMethods.selectAnItemFromDropdown(adminPage.studentEditTransportDetailsDropDown, "VH1001");

        Select select = new Select(adminPage.studentEditPickupPointDropDown);
        ReusableMethods.selectRandomTextFromDropdown(select);

        adminPage.studentEditChangeableCheckBox.click();

        adminPage.studentEditFatherNameBox.clear();
        adminPage.studentEditFatherNameBox.sendKeys(faker.name().firstName());

        adminPage.studentEditFatherPhoneBox.clear();
        adminPage.studentEditFatherPhoneBox.sendKeys(faker.phoneNumber().cellPhone());

        adminPage.studentEditCurrentAddressBox.clear();
        adminPage.studentEditCurrentAddressBox.sendKeys(faker.address().fullAddress());

        adminPage.studentEditBankNameBox.clear();
        adminPage.studentEditBankNameBox.sendKeys(faker.funnyName().name());

    }
    @Given("The edited information is saved and confirmed with the Save button")
    public void the_edited_information_is_saved_and_confirmed_with_the_save_button() {
        adminPage.studentEditSaveButton.click();

        ReusableMethods.waitForVisibility(adminPage.studentEditSuccessMessage, 10);
        Assert.assertTrue(adminPage.studentEditSuccessMessage.isDisplayed());
    }

    @Given("In the list created, click on the add fees button under the Action heading")
    public void in_the_list_created_click_on_the_add_fees_button_under_the_action_heading() {
        adminPage.studentSearchListActionAddFeesButton.click();
    }
    @Given("Verified redirect to the Student fees page")
    public void verified_redirect_to_the_student_fees_page() {
        Assert.assertTrue(adminPage.studentAddFeesStudentFees.isDisplayed());
    }

    @Given("Verify you go to the college login panel")
    public void verify_you_go_to_the_college_login_panel() {
        String expectedTitle = ConfigReader.getProperty("collegeLoginPageTitle");
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Verify that the Admin Login button is visible and functional.")
    public void verify_that_the_admin_login_button_is_visible_and_functional() {
        Assert.assertTrue(adminPage.adminLoginButton.isDisplayed());
        Assert.assertTrue(adminPage.adminLoginButton.isEnabled());
    }
    @Given("Click the Admin login button and verify that the admin login page has been accessed.")
    public void click_the_admin_login_button_and_verify_that_the_page_has_been_accessed() {
        adminPage.adminLoginButton.click();
        String expectedTitle = ConfigReader.getProperty("adminLoginPageTitle");
        ReusableMethods.switchToWindow(expectedTitle);
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Verify that there is a login window on the left of the admin login page.")
    public void verify_that_there_is_a_login_window_on_the_left_of_the_admin_login_page() {
        Assert.assertTrue(adminPage.loginWindowBox.isDisplayed());
    }
    @Given("Verify that the title Whats New is visible on the right on the admin login page")
    public void verify_that_the_title_whats_new_is_visible_on_the_right_on_the_admin_login_page() {
        Assert.assertTrue(adminPage.whatsNewLabel.isDisplayed());
    }
    @Given("Verify that the subheadings for the What's New heading are visible.")
    public void verify_that_the_subheadings_for_the_what_s_new_heading_are_visible() {
        Actions actions = new Actions(Driver.getDriver());

        Assert.assertTrue(adminPage.whatsNewSubHeader1.isDisplayed());
        Assert.assertTrue(adminPage.whatsNewSubHeader2.isDisplayed());

        actions.moveToElement(adminPage.adminLoginScrollBox)
                .scrollToElement(adminPage.whatsNewSubHeader4)
                .perform();

        Assert.assertTrue(adminPage.whatsNewSubHeader3.isDisplayed());
        Assert.assertTrue(adminPage.whatsNewSubHeader4.isDisplayed());
    }
    @Given("Verify that the Admin Login text is visible in the login window.")
    public void verify_that_the_admin_login_text_is_visible_in_the_login_window() {
        Assert.assertTrue(adminPage.adminLoginLabel.isDisplayed());
        Assert.assertTrue(adminPage.adminLoginLabel.isEnabled());
    }
    @Given("Verify that the Username Textbox is visible and functional.")
    public void verify_that_the_username_textbox_is_visible_and_functional() {
        Assert.assertTrue(adminPage.adminUsernameBox.isDisplayed());
        Assert.assertTrue(adminPage.adminUsernameBox.isEnabled());
    }
    @Given("Verify that the Password Textbox is visible and functional.")
    public void verify_that_the_password_textbox_is_visible_and_functional() {
        Assert.assertTrue(adminPage.adminPasswordBox.isDisplayed());
        Assert.assertTrue(adminPage.adminPasswordBox.isEnabled());
    }
    @Given("Verify that the Sign In button is visible and functional.")
    public void verify_that_the_sign_ın_button_is_visible_and_functional() {
        Assert.assertTrue(adminPage.adminSignInButton.isDisplayed());
        Assert.assertTrue(adminPage.adminSignInButton.isEnabled());
    }
    @Given("Verify that the Forgot Password link is visible and functional")
    public void verify_that_the_forgot_password_link_is_visible_and_functional() {
        Assert.assertTrue(adminPage.forgotPasswordLink.isDisplayed());
        Assert.assertTrue(adminPage.forgotPasswordLink.isEnabled());
    }
    @Given("Click on the Forgot Password link and verify that you have been to the forgotpassword page")
    public void click_on_the_forgot_password_link_and_verify_that_you_have_been_to_the_forgotpassword_page() {
        adminPage.forgotPasswordLink.click();
        String expectedUrl = ConfigReader.getProperty("forgotpasswordPageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the email textbox is visible and functional on the page")
    public void verify_that_the_email_textbox_is_visible_and_functional_on_the_page() {
        Assert.assertTrue(adminPage.forgotPasswordEmailBox.isDisplayed());
        Assert.assertTrue(adminPage.forgotPasswordEmailBox.isEnabled());
    }
    @Given("Verify that the Submit button is visible and functional")
    public void verify_that_the_submit_button_is_visible_and_functional() {
        Assert.assertTrue(adminPage.forgotPasswordSubmitButton.isDisplayed());
        Assert.assertTrue(adminPage.forgotPasswordSubmitButton.isEnabled());
    }
    @Given("Enter a valid email address in the email textbox and click the submit button")
    public void enter_a_valid_email_address_in_the_email_textbox_and_click_the_submit_button() {
        adminPage.forgotPasswordEmailBox.sendKeys(ConfigReader.getProperty("zehraAdminUserName"));
        adminPage.forgotPasswordSubmitButton.click();
    }
    @Given("Verify that the password has been sent to the entered email")
    public void verify_that_the_password_has_been_sent_to_the_entered_email() {
        Assert.assertTrue(adminPage.passwordSentLabel.isDisplayed());
        System.out.println(adminPage.passwordSentLabel.getText());
    }
    @Given("Verify that the Admin Login link is visible and functional")
    public void verify_that_the_admin_login_link_is_visible_and_functional() {
        Assert.assertTrue(adminPage.adminLoginLink.isDisplayed());
        Assert.assertTrue(adminPage.adminLoginLink.isEnabled());
    }
    @Given("Click on the Admin Login link and verify that you have accessed the admin login page")
    public void click_on_the_admin_login_link_and_verify_that_you_have_accessed_the_admin_login_page() {
        adminPage.adminLoginLink.click();
        Assert.assertTrue(adminPage.adminLoginLabel.isDisplayed());
    }
    @Given("Verify that the User Login link is visible and functional")
    public void verify_that_the_user_login_link_is_visible_and_functional() {
        Assert.assertTrue(adminPage.userLoginLink.isDisplayed());
        Assert.assertTrue(adminPage.userLoginLink.isEnabled());
    }
    @Given("Click on the User Login link and verify that you have accessed the userlogin page")
    public void click_on_the_user_login_link_and_verify_that_you_have_accessed_the_userlogin_page() {

        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        adminPage.userLoginLink.click();
        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();
        String secondWindowHandle ="";

        for (String eachWindowHandle : windowHandleSet
        ) {
            if (!eachWindowHandle.equals(firstPageWindowHandle)){
                secondWindowHandle = eachWindowHandle;
            }
        }
        Driver.getDriver().switchTo().window(secondWindowHandle);
        String expectedUrl = ConfigReader.getProperty("userLoginUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Verify that the Front Site link is visible and functional")
    public void verify_that_the_front_site_link_is_visible_and_functional() {
        Assert.assertTrue(adminPage.frontSiteLink.isDisplayed());
        Assert.assertTrue(adminPage.frontSiteLink.isEnabled());
    }
    @Given("Click on the Front Site link and verify that you have accessed the homepage")
    public void click_on_the_front_site_link_and_verify_that_you_have_accessed_the_homepage() {
        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        adminPage.frontSiteLink.click();
        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();
        String secondWindowHandle ="";


        for (String eachWindowHandle : windowHandleSet
        ) {
            if (!eachWindowHandle.equals(firstPageWindowHandle)){
                secondWindowHandle = eachWindowHandle;
            }
        }
        Driver.getDriver().switchTo().window(secondWindowHandle);
        String expectedUrl = ConfigReader.getProperty("homePageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Enter a valid Username and Password in the relevant boxes and click on the Sign In button")
    public void enter_a_valid_username_and_password_in_the_relevant_boxes_and_click_on_the_sign_in_button() {
        adminPage.adminUsernameBox.sendKeys(ConfigReader.getProperty("zehraAdminUserName"));
        adminPage.adminPasswordBox.sendKeys(ConfigReader.getProperty("zehraPassword"));
        adminPage.adminSignInButton.click();
    }
    @Given("Verify that you accessed the admin panel")
    public void verify_that_you_accessed_the_admin_panel() {
        String expectedUrl = ConfigReader.getProperty("adminPanelUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Enter an invalid Username and Password in the relevant boxes and click on the Sign In button")
    public void enter_an_invalid_username_and_password_in_the_relevant_boxes_and_click_on_the_sign_ın_button() {
        adminPage.adminUsernameBox.sendKeys(ConfigReader.getProperty("zehraInvalidUserName"));
        adminPage.adminPasswordBox.sendKeys(ConfigReader.getProperty("zehraInvalidPassword"));
        adminPage.adminSignInButton.click();
    }
    @Given("Verify that you cannot access the admin panel")
    public void verify_that_you_cannot_access_the_admin_panel() {
        Assert.assertTrue(adminPage.adminInvalidLoginLabel.isDisplayed());
        System.out.println(adminPage.adminInvalidLoginLabel.getText());
    }
    @Given("Quit the browser")
    public void quit_the_browser() {
        Driver.quitDriver();
    }


    @Given("Click on the Academics menu heading in the admin panel's sidebar")
    public void click_on_the_academics_menu_heading_in_the_admin_panel_s_sidebar() {
        adminPage.adminPageSideBarAcademicsMenuLink.click();
    }
    @Given("Verify that the Assign Class Teacher link is visible")
    public void verify_that_the_assign_class_teacher_link_is_visible() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherLink.isDisplayed());
    }
    @Given("Click on the Assign Class Teacher link and confirm that it redirects to the assign class teacher page")
    public void click_on_the_assign_class_teacher_link_and_confirm_that_it_redirects_to_the_assign_class_teacher_page() {
        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherLink.click();

        String expectedUrl = ConfigReader.getProperty("adminPageAssignClassTeacherLinkTitle");
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @Given("Click on the Assign Class Teacher link")
    public void click_on_the_assign_class_teacher_link() {
        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherLink.click();
    }
    @Given("Verify that the Class and Section dropdown menus are visible in the Assign Class Teacher window")
    public void verify_that_the_class_and_section_dropdown_menus_are_visible_in_the_assign_class_teacher_window() {

        Assert.assertTrue(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassDropdownMenu.isDisplayed());
        Assert.assertTrue(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageSectionDropdownMenu.isDisplayed());
    }
    @Given("Confirm that the names of all teachers under the Class Teacher heading are visible, along with checkboxes next to their names")
    public void confirm_that_the_names_of_all_teachers_under_the_class_teacher_heading_are_visible_along_with_checkboxes_next_to_their_names() {
        for (WebElement each : adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageAllTeacherName){
            Assert.assertTrue(each.isDisplayed());
        }
        for (WebElement each : adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageTeacherNameAllCheckBox){
            Assert.assertTrue(each.isDisplayed());
        }

    }
    @Given("Verify that the Save button is visible")
    public void verify_that_the_save_button_is_visible() {
        for (int i = 0; i < 300; i++) {
            actions.sendKeys(Keys.ARROW_DOWN).perform();
        }

        Assert.assertTrue(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageSaveButton.isDisplayed());
    }

    @Given("Select a class from the Class dropdown menu in the Assign Class Teacher window")
    public void select_a_class_from_the_class_dropdown_menu_in_the_assign_class_teacher_window() {
        Select select = new Select(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassDropdownMenu);

        select.selectByIndex(1);
    }
    @Given("Choose a class number from the Section dropdown menu in the Assign Class Teacher window")
    public void choose_a_class_number_from_the_section_dropdown_menu_in_the_assign_class_teacher_window() {
        Select select = new Select(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageSectionDropdownMenu);

        select.selectByIndex(1);
    }
    @Given("Select one of the teachers listed under the Class Teacher heading in the Assign Class Teacher window")
    public void select_one_of_the_teachers_listed_under_the_class_teacher_heading_in_the_assign_class_teacher_window() {
        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageAzizCheckBox.click();
    }
    @Given("Click on the Save button in the Assign Class Teacher window")
    public void click_on_the_save_button_in_the_assign_class_teacher_window() {
        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageSaveButton.click();
    }
    @Given("Verify that the assignment is successful")
    public void verify_that_the_assignment_is_successful() {
        Assert.assertTrue(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageRecordSavedAlert.isDisplayed());
    }
    @Given("Confirm that the assigned teacher is listed in the Class Teacher List page with the assigned class and class number")
    public void confirm_that_the_assigned_teacher_is_listed_in_the_class_teacher_list_page_with_the_assigned_class_and_class_number() {

        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSearchTextBox.sendKeys("aziz");

        String expectedClass = "Class 1";
        String actualClass = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListClassColumnText.getText();

        Assert.assertEquals(expectedClass,actualClass);

        String expectedSection = "A";
        String actualSection = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSectionColumnText.getText();

        Assert.assertEquals(expectedSection,actualSection);

    }

    @Given("Verify that the first column's heading in the Class Teacher List table is {string} and it is visible")
    public void verify_that_the_first_column_s_heading_in_the_class_teacher_list_table_is_and_it_is_visible(String classColumn) {

        String expectedTitle = ConfigReader.getProperty(classColumn);
        String actualTitle = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListClassColumnTitleText.getText();

        Assert.assertEquals(expectedTitle,actualTitle);

    }
    @Given("Confirm that the second column's heading in the Class Teacher List table is {string} and it is visible")
    public void confirm_that_the_second_column_s_heading_in_the_class_teacher_list_table_is_and_it_is_visible(String section) {
        String expectedTitle = ConfigReader.getProperty(section);
        String actualTitle = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSectionColumnTitleText.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Ensure that the third column's heading in the Class Teacher List table is {string} and it is visible")
    public void ensure_that_the_third_column_s_heading_in_the_class_teacher_list_table_is_and_it_is_visible(String classTeacher) {
        String expectedTitle = ConfigReader.getProperty(classTeacher);
        String actualTitle = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListClassTeacherColumnTitleText.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Validate that the fourth column's heading in the Class Teacher List table is {string} and it is visible")
    public void validate_that_the_fourth_column_s_heading_in_the_class_teacher_list_table_is_and_it_is_visible(String action) {
        String expectedTitle = ConfigReader.getProperty(action);
        String actualTitle = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListActionColumnTitleText.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @Given("Click on the edit icon in the Class Teacher List table")
    public void click_on_the_edit_icon_in_the_class_teacher_list_table() {
        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSearchTextBox.sendKeys("aziz");

        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListEdinIcon.click();
    }
    @Given("Verify that the Update Class Teacher page is opened")
    public void verify_that_the_update_class_teacher_page_is_opened() {
        String expectedTitle = ConfigReader.getProperty("adminPageAssignClassTeacherEditPage");
        String actualTitle = adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageEditPageTitleText.getText();

        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @Given("Change the Class and Section in the Edit Assign Class Teacher window, then click on the Save button")
    public void change_the_class_and_section_in_the_edit_assign_class_teacher_window_then_click_on_the_save_button() {
        Select select = new Select(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassDropdownMenu);

        select.selectByIndex(1);

        Select select2 = new Select(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageSectionDropdownMenu);

        select2.selectByIndex(2);

        ReusableMethods.wait(3);

        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageSaveButton.click();
    }
    @Given("Confirm that the update process is successful")
    public void confirm_that_the_update_process_is_successful() {

        Assert.assertTrue(adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageRecordSavedAlert.isDisplayed());
    }

    @Given("Click on the delete icon under the Action heading in the Class Teacher List table.")
    public void click_on_the_delete_icon_under_the_action_heading_in_the_class_teacher_list_table() {
        adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListDeleteIcon.click();

        Driver.getDriver().switchTo().alert().accept();
    }
    @Given("Confirm that the delete operation is successfully completed")
    public void confirm_that_the_delete_operation_is_successfully_completed() {

        int counter = 0;

        try {

            adminPage.adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSearchTextBox.sendKeys("aziz");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fa fa-remove']")));
            counter++;

        } catch (Exception e) {

        }

        Assert.assertEquals(counter, 0);
    }

    @Given("Click “Fees Collection” button")
    public void click_fees_collection_button() {
        adminPage.adminFeesCollectionButton.click();
    }
    @Given("Verify that “Fees Type” button is visible")
    public void verify_that_fees_type_button_is_visible() {
        Assert.assertTrue(adminPage.adminFeesTypeButton.isDisplayed());
    }
    @Given("Click “Fees Type” button")
    public void click_fees_type_button() {
        adminPage.adminFeesTypeButton.click();
    }
    @Given("Verify that page’s link contains “feetype”")
    public void verify_that_page_s_link_contains_feetype() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("feetype"));
    }
    @Given("Verify that “Add Fees Type” section, “Name” texbox, “Fees Code” textbox, “Description” textbox, “Save” button; “Fees Type List” section, “Name” column, “Fees Code” column, “Action” column are visible")
    public void verify_that_add_fees_type_section_name_texbox_fees_code_textbox_description_textbox_save_button_fees_type_list_section_name_column_fees_code_column_action_column_are_visible() {
        Assert.assertTrue(adminPage.adminAddFeesTypeLabel.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesNameTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesCodeTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesDescriptionTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesListLabel.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesSaveButton.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesNameColumn.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesCodeColumn.isDisplayed());
        Assert.assertTrue(adminPage.adminAddFeesDescriptionColumn.isDisplayed());
    }





    @Given("Ented related data into “Add Fees Type” section")
    public void ented_related_data_into_add_fees_type_section() {
        adminPage.adminAddFeesNameTextbox.sendKeys("Mike");
        adminPage.adminAddFeesCodeTextbox.sendKeys("7482");
        adminPage.adminAddFeesDescriptionTextbox.sendKeys("Description");
    }




    @Given("Click “Edit” icon")
    public void click_edit_icon() {
        adminPage.adminAddFeesEditIcon.click();
    }
    @Given("Verify that “Edit Fees Type” section is visible")
    public void verify_that_edit_fees_type_section_is_visible() {
        Assert.assertTrue(adminPage.adminAddFeesEditFeesTypeLabel.isDisplayed());

    }
    @Given("Enter related data")
    public void enter_related_data() {

        adminPage.adminAddFeesNameTextbox.sendKeys("Mehmet");
        adminPage.adminAddFeesCodeTextbox.sendKeys("4325");
        adminPage.adminAddFeesDescriptionTextbox.sendKeys("Descr");
    }
    @Given("Click to “Save” button")
    public void click_to_save_button() {
        adminPage.adminAddFeesSaveButton.click();
    }
    @Given("Verify that a succes message shows up")
    public void verify_that_a_succes_message_shows_up() {
        Assert.assertTrue(adminPage.adminAddFeesSuccessLabel.isDisplayed());

    }
    @Given("Click to “Delete” button")
    public void click_to_delete_button() {
        adminPage.adminAddFeesDeleteIcon.click();
    }

    @Given("Go to url {string}")
    public void go_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));
    }


    //************

    @Given("Enter related data and click to “Sign In” button")
    public void enter_related_data_and_click_to_sign_in_button() {
        adminPage.usernameTextbox.sendKeys(ConfigReader.getProperty("batuAdminUserName"));
        adminPage.passwordTextbox.sendKeys(ConfigReader.getProperty("batuPassword"));
        adminPage.signInButton.click();

    }
    @Given("Click to “Front Office” Button")
    public void click_to_front_office_button() {
        adminPage.adminFrontOfficeButton.click();
    }
    @Given("Verify that there is a “Complain” button")
    public void verify_that_there_is_a_complain_button() {

        ReusableMethods.waitForVisibility(adminPage.adminFrontOfficeComplainButton,5);
        Assert.assertTrue(adminPage.adminFrontOfficeComplainButton.isDisplayed());
    }
    @Given("Click to “Complain” button")
    public void click_to_complain_button() {
        adminPage.adminFrontOfficeComplainButton.click();
    }
    @Given("Verify that the directed page’s link contains “complaint”")
    public void verify_that_the_directed_page_s_link_contains_complaint() {

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("complaint"));

    }


    @Given("Verify that visibility of “Add Complain” section; visibility and function of “Complain Type” dropdown, “Source” dropdown”, “Complain By” textbox, “Phone” textbox, “Date” table, “Description” textbox, “Action Taken” textbox, “Assigned” textbox, “Note” textbox, “Attach Document” button, “Save” button")
    public void verify_that_visibility_of_add_complain_section_visibility_and_function_of_complain_type_dropdown_source_dropdown_complain_by_textbox_phone_textbox_date_table_description_textbox_action_taken_textbox_assigned_textbox_note_textbox_attach_document_button_save_button() {


        Assert.assertTrue(adminPage.adminComplainAddLabel.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainTypeDropdown.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainSourceDropdown.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainbyTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainPhoneTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainDateTable.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainDescriptionTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainActionTakenTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainAssignedTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainNoteTextbox.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainAttachDocumentButton.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainSaveButton.isDisplayed());

    }
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    @Given("Enter related data to related fields")
    public void enter_related_data_to_related_fields() {
        Select select= new Select(adminPage.adminComplainTypeDropdown);
        select.selectByIndex(2);
        select=new Select(adminPage.adminComplainComplainSourceDropdown);
        select.selectByIndex(2);
        adminPage.adminComplainComplainbyTextbox.sendKeys("Something");
        adminPage.adminComplainComplainPhoneTextbox.sendKeys("Something");
        //tarih
        adminPage.adminComplainComplainDescriptionTextbox.sendKeys("Something");
        adminPage.adminComplainComplainActionTakenTextbox.sendKeys("Something");
        adminPage.adminComplainComplainAssignedTextbox.sendKeys("Something");
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", adminPage.adminComplainComplainNoteTextbox);
        adminPage.adminComplainComplainNoteTextbox.sendKeys("Something");

/*
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.adminComplainComplainAttachDocumentButton);
        String FilePath = System.getProperty("user.dir") + "src/test/java/utilities/attachments/i-am-a-document.zip" ;
        adminPage.adminComplainComplainAttachDocumentButton.sendKeys(FilePath);

 */
    }


    @Given("Click save button")
    public void click_save_button() {
        adminPage.adminComplainComplainSaveButton.click();
    }
    @Given("Verify that a success message shows up")
    public void verify_that_a_success_message_shows_up() {
        ReusableMethods.waitForVisibility(adminPage.adminComplainComplainSuccessLabel,5);
        Assert.assertTrue(adminPage.adminComplainComplainSuccessLabel.isDisplayed());
    }







    @Given("Verify visibility of “Complain #”, “Complain Type”, “Name, “Phone”, “Date”,”Actions” columns")
    public void verify_visibility_of_complain_complain_type_name_phone_date_actions_columns() {
        Assert.assertTrue(adminPage.adminComplainComplainComplainnoColumnn.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainComplainTypeColumn.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainComplainNameColumn.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainPhoneColumn.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainDateColumn.isDisplayed());
        Assert.assertTrue(adminPage.adminComplainComplainActionColumn.isDisplayed());
    }
    @Given("Click to ““Complain #”")
    public void click_to_complain() {
        adminPage.adminComplainComplainComplainnoColumnn.click();

    }
    @Given("Verify that first complaints number is {int}")
    public void verify_that_first_complaints_number_is(Integer int1) {


        Assert.assertEquals("1",adminPage.adminComplainComplainFirstRowNoLabel);
    }
    @Given("Click “View” icon")
    public void click_view_icon() {
        adminPage.adminComplainComplainViewIcon.click();
    }
    @Given("Verify that “Details” page is opened")
    public void verify_that_details_page_is_opened() {
        ReusableMethods.waitForVisibility(adminPage.adminComplainComplainDetailsLabel,5);
        Assert.assertTrue(adminPage.adminComplainComplainDetailsLabel.isDisplayed());
    }
    @Given("Close “Details” page")
    public void close_details_page() {
        adminPage.adminComplainComplainDetailsCloseButton.click();
    }
    @Given("Click to “Edit” button")
    public void click_to_edit_button() {
        adminPage.adminComplainComplainEditIcon.click();
    }
    @Given("Verify that page’s lin contains “edit”")
    public void verify_that_page_s_lin_contains_edit() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("edit"));
    }
    @Given("Return to previous page")
    public void return_to_previous_page() {
        Driver.getDriver().navigate().back();
    }
    @Given("Click Delete button")
    public void click_delete_button() {
        adminPage.adminComplainComplainDeleteIcon.click();
    }
    @Given("Verify that a succes message appears")
    public void verify_that_a_succes_message_appears() {
        Assert.assertTrue(adminPage.adminAddFeesSuccessLabel.isDisplayed());
        Driver.getDriver().switchTo().alert().accept();


    }
    String AdmissionNo;


    @Given("Verify that the Admin Login page is displayed.")
    public void verify_that_the_admin_login_page_is_displayed() {
        Assert.assertTrue(adminPage.adminLoginPageAdminLoginText.isDisplayed());
    }
    @Given("Enter the correct {string} in the username textbox.")
    public void enter_the_correct_in_the_username_textbox(String givenUsername) {
        adminPage.adminLoginPageUsernameTextBox.sendKeys(ConfigReader.getProperty(givenUsername));
    }
    @Given("Enter the correct {string} in the password textbox.")
    public void enter_the_correct_in_the_password_textbox(String givenPassword) {
        adminPage.adminLoginPagePasswordTextBox.sendKeys(ConfigReader.getProperty(givenPassword));
    }
    @Given("Click the sing in button.")
    public void click_the_sing_in_button() {
        adminPage.adminLoginPageSingInButton.click();
    }
    @Given("Verify that the Admin Dasboard Page is displayed.")
    public void verify_that_the_admin_dasboard_page_is_displayed() {
        Assert.assertTrue(adminPage.adminDasboardWonderLogo.isDisplayed());
    }
    @Given("Click Student Information in the Admin Panel Sidebar.")
    public void click_student_information_in_the_admin_panel_sidebar() {
        adminPage.adminSidebarStudentInformation.click();
    }
    @Given("Verify that online admission is displayed under the student information menu heading.")
    public void verify_that_online_admission_is_displayed_under_the_student_information_menu_heading() {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assert.assertTrue(adminPage.adminSidebarStudentInfoOnlineAdmissionTab.isEnabled());
    }
    @Given("Click online admission in the Admin Panel Sidebar.")
    public void click_online_admission_in_the_admin_panel_sidebar() {
        adminPage.adminSidebarStudentInfoOnlineAdmissionTab.click();
    }
    @Given("Verify that student list and information about student is displayed.")
    public void verify_that_student_list_and_information_about_student_is_displayed() {
        Assert.assertTrue(adminPage.onlineAdmissionPageStudentListText.isDisplayed());
        Assert.assertTrue(adminPage.onlineAdmissionStudentInfoRow.isDisplayed());
    }
    @Given("Enter the {string} in the search box.")
    public void enter_the_in_the_search_box(String givenName) {
        adminPage.onlineAdmissionSearchBox.sendKeys(givenName);
    }
    @Given("Verify that {string} is displayed.")
    public void verify_that_is_displayed(String givenName) {
        String actualIcerik = adminPage.onlineAdmissionSearchResultFirstRow.getText();
        String expectedIcerik = givenName;
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        System.out.println(actualIcerik);
        System.out.println(expectedIcerik);
    }

    @Given("Verify that students who have submitted a registration form is displayed as submitted.")
    public void verify_that_students_who_have_submitted_a_registration_form_is_displayed_as_submitted() {
        List<String> studentList = new ArrayList<>();

        int studentCount = adminPage.onlineAdmissionStudentListRow.size();
        String studentInfo="";

        for (int i = 1; i < studentCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

        }
        Assert.assertTrue(studentInfo.contains("Submitted"));

    }
    @Given("Verify that students who have not submitted a registration form is displayed as not submitted.")
    public void verify_that_students_who_have_not_submitted_a_registration_form_is_displayed_as_not_submitted() {
        List<String> studentList = new ArrayList<>();

        int studentCount = adminPage.onlineAdmissionStudentListRow.size();
        String studentInfo="";

        for (int i = 1; i < studentCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

        }
        Assert.assertTrue(studentInfo.contains("Not Submitted"));

    }
    @Given("Verify that the check icon is displayed for students whose online application has been evaluated and registered to the school.")
    public void verify_that_the_check_icon_is_displayed_for_students_whose_online_application_has_been_evaluated_and_registered_to_the_school() {
        List<String> studentList = new ArrayList<>();

        int studentCount = adminPage.onlineAdmissionStudentListRow.size();
        String studentInfo="";

        for (int i = 1; i < studentCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
        }
        Assert.assertTrue(studentInfo.contains("Not Submitted"));
    }
    @Given("Verify that the \\(-) icon is displayed for students whose not registered to the school.")
    public void verify_that_the_icon_is_displayed_for_students_whose_not_registered_to_the_school() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.onlineAdmissionEnrolled);
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.onlineAdmissionNotEnrolled);

        Assert.assertTrue(adminPage.onlineAdmissionEnrolled.isDisplayed());
        Assert.assertTrue(adminPage.onlineAdmissionNotEnrolled.isDisplayed());
    }
    @Given("Click the delete button under actions.")
    public void click_the_delete_button_under_actions() {
        List<String> studentList = new ArrayList<>();

        int studentCount = adminPage.onlineAdmissionStudentListRow.size();
        String studentInfo="";

        for (int i = 1; i < studentCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

            if (studentInfo.contains("furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                String delete = "//*[@id='DataTables_Table_0']/tbody/tr["+ --i + "]/td[12]/a[3]/i";
                WebElement deleteElement = Driver.getDriver().findElement(By.xpath(delete));
                System.out.println(delete);
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                ReusableMethods.wait(3);
                ReusableMethods.hover(deleteElement);
                jse.executeScript("arguments[0].scrollIntoView();",deleteElement);
                deleteElement.click();
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }

    }
    @Given("Accept the alert.")
    public void accept_the_alert() {
        ReusableMethods.wait(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();
    }

    @Given("Click the edit and enroll button under actions.")
    public void click_the_edit_and_enroll_button_under_actions() {
        List<String> studentList = new ArrayList<>();

        int studentCount = adminPage.onlineAdmissionStudentListRow.size();
        String studentInfo="";

        for (int i = 1; i < studentCount-1; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();

            if (studentInfo.contains("furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                String edit = "(//i[@class='fa fa-pencil'])["+ --i +"]";
                String AdmissionNoElement = "//*[@id='DataTables_Table_0']/tbody/tr["+ i + "]/td["+ i + "]";
                AdmissionNo = Driver.getDriver().findElement(By.xpath(AdmissionNoElement)).getText();
                WebElement editElement = Driver.getDriver().findElement(By.xpath(edit));
                System.out.println(edit);
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                jse.executeScript("arguments[0].click();",editElement);
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }
        ReusableMethods.wait(3);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();



    }
    @Given("Verify that edit and enroll page is displayed.")
    public void verify_that_edit_and_enroll_page_is_displayed() {
        adminPage.onlineAdmissionEditOnlineAdmissionText.isDisplayed();
    }
    @Given("Verify that required fields and save and save enroll button are displayed in the edit and enroll page.")
    public void verify_that_required_fields_and_save_and_save_enroll_button_are_displayed_in_the_edit_and_enroll_page() {
        Assert.assertTrue(adminPage.editAndEnrollPageAdmissionNo.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageRollNumber.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageClassSelect.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageSectionSelect.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageFirstName.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageLastName.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageGender.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageDateOfBirth.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageCategory.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageReligion.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageMobileNumber.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageEmail.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageAdmissionDate.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageBloodGroup.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageHouse.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageHeight.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageWeight.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageMeasurementDate.isDisplayed());
        ReusableMethods.wait(2);
        //Assert.assertTrue(adminPage.editAndEnrollPageStudentPhoto.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageFeesDetailsCheckBox.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageRouteList.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPagePickupPoint.isDisplayed());

        ReusableMethods.wait(2);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.editAndEnrollPageFeesMonth);


        Assert.assertTrue(adminPage.editAndEnrollPageFeesMonth.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageFatherName.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPagePhoneNumber.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageFatherOccupation.isDisplayed());
        //Assert.assertTrue(adminPage.editAndEnrollPageFatherPhoto.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageMotherName.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageMotherPhone.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageMotherOccupation.isDisplayed());
        //Assert.assertTrue(adminPage.editAndEnrollPageMotherPhoto.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageIfGuardianIsFather.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageGuardianName.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageGuardianRelation.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageGuardianEmail.isDisplayed());
        //Assert.assertTrue(adminPage.editAndEnrollPageGuardianPhoto.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageGuardianPhone.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageGuardianOccupation.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.editAndEnrollPageGuardianAddress.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageIfGuardianAddress.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageCurrentAddress.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageIfPermanentAddress.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPagePermanentAddress.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageBankAccount.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageBankName.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageIFSCCode.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageNationalIdentification.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.editAndEnrollPageLocalIdentification.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPagePreviousSchool.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageNote.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageSaveButton.isDisplayed());
        Assert.assertTrue(adminPage.editAndEnrollPageSaveAndEnrollButton.isDisplayed());

    }
    @Given("Click on fees details checkbox buttons.")
    public void click_on_fees_details_checkbox_buttons() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.editAndEnrollPageFeesDetailsCheckBox);
        jse.executeScript("arguments[0].click();",adminPage.editAndEnrollPageFeesDetailsCheckBox);


    }
    @Given("Verify that the total calculated amount is displayed.")
    public void verify_that_the_total_calculated_amount_is_displayed() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.editAndEnrollPageFeesTop);
        Assert.assertTrue(adminPage.editAndEnrollPageFeesTop.isDisplayed());

    }
    @Given("Click the icon next to fees details.")
    public void click_the_icon_next_to_fees_details() {
        adminPage.editAndEnrollPageFeesDetailsButton.click();

    }

    @Given("Verify that the fees details is displayed.")
    public void verify_that_the_fees_details_is_displayed() {
        Assert.assertTrue(adminPage.editAndEnrollPageFeesDetails.isDisplayed());
    }
    @Given("Enter student information in the relevant boxes.")
    public void enter_student_information_in_the_relevant_boxes() {
        adminPage.editAndEnrollPageAdmissionNo.clear();
        adminPage.editAndEnrollPageAdmissionNo.sendKeys(AdmissionNo);
        adminPage.editAndEnrollPageRollNumber.clear();
        adminPage.editAndEnrollPageRollNumber.sendKeys("12345");
        adminPage.editAndEnrollPageClassSelect.sendKeys("Class 2");

        ReusableMethods.wait(2);

        adminPage.editAndEnrollPageSectionSelect.sendKeys("B");
        adminPage.editAndEnrollPageFirstName.clear();
        adminPage.editAndEnrollPageFirstName.sendKeys("Furkan");
        adminPage.editAndEnrollPageLastName.clear();
        adminPage.editAndEnrollPageLastName.sendKeys("Cırık");

        adminPage.editAndEnrollPageGender.sendKeys("Male");
        // adminPage.editAndEnrollPageDateOfBirth.clear();
        adminPage.editAndEnrollPageDateOfBirth.sendKeys("02/02/2010");
        // adminPage.editAndEnrollPageCategory.clear();
        adminPage.editAndEnrollPageCategory.sendKeys("Special");
        adminPage.editAndEnrollPageReligion.clear();
        adminPage.editAndEnrollPageReligion.sendKeys("Religion");
        adminPage.editAndEnrollPageMobileNumber.clear();
        adminPage.editAndEnrollPageMobileNumber.sendKeys("5555555555");
        adminPage.editAndEnrollPageEmail.clear();
        adminPage.editAndEnrollPageEmail.sendKeys("frkas@gmail.com");
        // adminPage.editAndEnrollPageAdmissionDate.clear();
        adminPage.editAndEnrollPageAdmissionDate.sendKeys("05/07/2023");
        // adminPage.editAndEnrollPageBloodGroup.clear();
        adminPage.editAndEnrollPageBloodGroup.sendKeys("A+");
        // adminPage.editAndEnrollPageHouse.clear();
        adminPage.editAndEnrollPageHouse.sendKeys("Blue");
        adminPage.editAndEnrollPageHeight.clear();
        adminPage.editAndEnrollPageHeight.sendKeys("1.30");
        adminPage.editAndEnrollPageWeight.clear();
        adminPage.editAndEnrollPageWeight.sendKeys("60");
        // adminPage.editAndEnrollPageMeasurementDate.clear();
        adminPage.editAndEnrollPageMeasurementDate.sendKeys("05/07/2023");

        // adminPage.editAndEnrollPageStudentPhoto.isDisplayed();
        adminPage.editAndEnrollPageFeesDetailsCheckBox.click();
        // adminPage.editAndEnrollPageRouteList.clear();
        adminPage.editAndEnrollPageRouteList.sendKeys("VH4584");
        // adminPage.editAndEnrollPagePickupPoint.clear();
        adminPage.editAndEnrollPagePickupPoint.sendKeys("Brooklyn Central");
        // adminPage.editAndEnrollPageFeesMonth.clear();
        adminPage.editAndEnrollPageFeesMonth.sendKeys("April");
        adminPage.editAndEnrollPageFatherName.clear();
        adminPage.editAndEnrollPageFatherName.sendKeys("Father");
        adminPage.editAndEnrollPagePhoneNumber.clear();
        adminPage.editAndEnrollPagePhoneNumber.sendKeys("5555555555");
        adminPage.editAndEnrollPageFatherOccupation.clear();
        adminPage.editAndEnrollPageFatherOccupation.sendKeys("Occupation");


        // adminPage.editAndEnrollPageFatherPhoto.isDisplayed();
        adminPage.editAndEnrollPageMotherName.clear();
        adminPage.editAndEnrollPageMotherName.sendKeys("Mother");
        adminPage.editAndEnrollPageMotherPhone.clear();
        adminPage.editAndEnrollPageMotherPhone.sendKeys("5555555555");
        adminPage.editAndEnrollPageMotherOccupation.clear();
        adminPage.editAndEnrollPageMotherOccupation.sendKeys("Occupation");

        // adminPage.editAndEnrollPageMotherPhoto.isDisplayed();
        adminPage.editAndEnrollPageIfGuardianIsFather.click();
        adminPage.editAndEnrollPageGuardianName.clear();
        adminPage.editAndEnrollPageGuardianName.sendKeys("Father");
        adminPage.editAndEnrollPageGuardianRelation.clear();
        adminPage.editAndEnrollPageGuardianRelation.sendKeys("Father");
        adminPage.editAndEnrollPageGuardianEmail.clear();
        adminPage.editAndEnrollPageGuardianEmail.sendKeys("fthth@gmail.com");
        adminPage.editAndEnrollPageGuardianPhone.clear();

        // adminPage.editAndEnrollPageGuardianPhoto.isDisplayed();
        adminPage.editAndEnrollPageGuardianPhone.clear();
        adminPage.editAndEnrollPageGuardianPhone.sendKeys("5555555555");
        adminPage.editAndEnrollPageGuardianOccupation.clear();
        adminPage.editAndEnrollPageGuardianOccupation.sendKeys("Occupation");
        adminPage.editAndEnrollPageGuardianAddress.clear();
        adminPage.editAndEnrollPageGuardianAddress.sendKeys("Adress");
        // adminPage.editAndEnrollPageIfGuardianAddress.clear();
        adminPage.editAndEnrollPageIfGuardianAddress.sendKeys("Adress");
        adminPage.editAndEnrollPageCurrentAddress.clear();
        adminPage.editAndEnrollPageCurrentAddress.sendKeys("Adress");
        // adminPage.editAndEnrollPageIfPermanentAddress.clear();
        adminPage.editAndEnrollPageIfPermanentAddress.sendKeys("Adress");
        adminPage.editAndEnrollPagePermanentAddress.clear();
        adminPage.editAndEnrollPagePermanentAddress.sendKeys("Adress");
        adminPage.editAndEnrollPageBankAccount.clear();
        adminPage.editAndEnrollPageBankAccount.sendKeys("12345667899654");
        adminPage.editAndEnrollPageBankName.clear();
        adminPage.editAndEnrollPageBankName.sendKeys("BankName");
        adminPage.editAndEnrollPageIFSCCode.clear();
        adminPage.editAndEnrollPageIFSCCode.sendKeys("1234566789");
        adminPage.editAndEnrollPageNationalIdentification.clear();
        adminPage.editAndEnrollPageNationalIdentification.sendKeys("123456");
        adminPage.editAndEnrollPageLocalIdentification.clear();
        adminPage.editAndEnrollPageLocalIdentification.sendKeys("123456");
        adminPage.editAndEnrollPagePreviousSchool.clear();
        adminPage.editAndEnrollPagePreviousSchool.sendKeys("PreSchool");
        adminPage.editAndEnrollPageNote.clear();
        adminPage.editAndEnrollPageNote.sendKeys("Note");

    }
    @Given("Click the save button.")
    public void click_the_save_button() {
        adminPage.editAndEnrollPageSaveButton.click();
    }

    @Given("Verify that Record Updated Successfully is displayed.")
    public void verify_that_record_updated_successfully_is_displayed() {
        Assert.assertTrue(adminPage.editAndEnrollPageRecordUpdatedSuccessfullyText.isDisplayed());
    }

    @Given("Click the save and enroll button.")
    public void click_the_save_and_enroll_button() {
        adminPage.editAndEnrollPageSaveAndEnrollButton.click();
    }
    @Given("Verify that registration is complete.")
    public void verify_that_registration_is_complete() {
        Assert.assertTrue(adminPage.editAndEnrollPageRecordUpdatedSuccessfullyText.isDisplayed());

    }

    @Given("Click Fees Collection in the Admin Panel Sidebar.")
    public void click_fees_collection_in_the_admin_panel_sidebar() {
        adminPage.adminSidebarFeesCollectionTab.click();
    }
    @Given("Verify that fees group is displayed under the fees collection menu heading.")
    public void verify_that_fees_group_is_displayed_under_the_fees_collection_menu_heading() {
        Assert.assertTrue(adminPage.adminSidebarFeesGroupTab.isEnabled());
    }
    @Given("Click fees group in the Admin Panel Sidebar.")
    public void click_fees_group_in_the_admin_panel_sidebar() {
        adminPage.adminSidebarFeesGroupTab.click();
    }
    @Given("Verify that add fees group textboxes and save button are displayed.")
    public void verify_that_add_fees_group_textboxes_and_save_button_are_displayed() {
        Assert.assertTrue(adminPage.feesGroupPageNameBox.isDisplayed());
        Assert.assertTrue(adminPage.feesGroupPageDescriptionBox.isDisplayed());
        Assert.assertTrue(adminPage.feesGroupPageAddFeesSaveButton.isDisplayed());
    }
    @Given("Verify that fees group informations are displayed.")
    public void verify_that_fees_group_informations_are_displayed() {
        // Assert.assertTrue(adminPage.feesGroupPageFeesGroupList.isDisplayed());
    }
    @Given("Enter add fees group information in the relevant boxes.")
    public void enter_add_fees_group_information_in_the_relevant_boxes() {
        adminPage.feesGroupPageNameBox.sendKeys("Furkan");
        adminPage.feesGroupPageDescriptionBox.sendKeys("Description");
    }
    @Given("Click the fees save button.")
    public void click_the_fees_save_button() {
        adminPage.feesGroupPageAddFeesSaveButton.click();
    }
    @Given("Verify that Record Saved Successfully text is displayed.")
    public void verify_that_record_saved_successfully_text_is_displayed() {
        Assert.assertTrue(adminPage.feesGroupPageRecordSavedSuccessfullyText.isDisplayed());
    }
    @Given("Click the edit button under the actions row.")
    public void click_the_edit_button_under_the_actions_row() {
        List<String> studentList = new ArrayList<>();

        int feesCount = adminPage.feesGroupPageFeesGroupList.size();
        String studentInfo="";

        for (int i = 1; i < feesCount+2; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            // System.out.println(studentInfo);

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

        // adminPage.feesGroupPageFeesEditButton.click();
    }
    @Given("Edit fees group informations.")
    public void edit_fees_group_informations() {
        adminPage.feesGroupPageDescriptionBox.clear();
        adminPage.feesGroupPageDescriptionBox.sendKeys("Description");
    }

    @Given("Click the delete button under the actions row.")
    public void click_the_delete_button_under_the_actions_row() {
        List<String> studentList = new ArrayList<>();

        int feesCount = adminPage.feesGroupPageFeesGroupList.size();
        String studentInfo="";

        for (int i = 1; i < feesCount+2; i++) {
            String dinamikXpath= "(//tr[@role='row'])["+ i +"]";
            studentInfo = Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            // System.out.println(studentInfo);

            if (studentInfo.contains("Furkan")){
                System.out.println(studentInfo);
                System.out.println(dinamikXpath);
                String delete = "(//i[@class='fa fa-remove'])["+ --i +"]";
                WebElement DeleteElement = Driver.getDriver().findElement(By.xpath(delete));
                System.out.println(delete);
                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
                jse.executeScript("arguments[0].click();",DeleteElement);
                ReusableMethods.wait(2);
                break;
            }else {
            }

        }

        // adminPage.feesGroupPageFeesDeleteButton.click();
    }
    @Given("Accept the warning that appears on the screen.")
    public void accept_the_warning_that_appears_on_the_screen() {
        ReusableMethods.wait(2);
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }


}
