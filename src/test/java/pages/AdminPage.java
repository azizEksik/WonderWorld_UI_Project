package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;
public class AdminPage {



    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }


    // AdminPage >> Username
    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminLoginUsername;


    // Login Page Admin Login Button
    @FindBy(xpath = "//*[text()='Admin Login ']")
    public WebElement adminLoginButton;

    // Admin Login Page >>> email box
    @FindBy(xpath = "//input[@name='username']")
    public WebElement adminLoginPageEmailBox;

    // Admin Login Page >>> password box
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminLoginPagePasswordBox;

    // Admin Login Page >>> submit button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginPageSingInButton;

    // Admin Page >>> profile icon
    @FindBy(xpath = "//img[@class='topuser-image']")
    public WebElement adminPageProfileIcon;

    // Admin Page >>> profile icon window >>> profile link
    @FindBy(xpath = "(//div[@class='sspass'])[1]/a[1]")
    public WebElement adminPageProfileLink;

    // Admin Page >>> profile icon >>> name
    @FindBy(xpath = "(//div[@class='sstopuser'])/div[2]/h4")
    public WebElement adminPageProfileIconNameText;

    // Admin Page >>> profile icon >>> role
    @FindBy(xpath = "(//div[@class='sstopuser'])/div[2]/h5")
    public WebElement adminPageProfileIconRoleText;

    // Admin Page >>> profile icon >>> profile, password, logout link
    @FindBy(xpath = "(//div[@class='sstopuser'])/div[4]/a")
    public List<WebElement> adminPageProfileIconAllLink;

    // Admin Page >>> profile icon >>> profile page >>> profile button
    @FindBy(xpath = "(//ul[@class='nav nav-tabs'])/li[1]")
    public WebElement adminPageProfileIconProfileLinkProfileButton;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button
    @FindBy(xpath = "(//ul[@class='nav nav-tabs'])/li[2]")
    public WebElement adminPageProfileIconProfileLinkPayrollButton;

    // Admin Page >>> profile icon >>> profile page >>> leaves button
    @FindBy(xpath = "(//ul[@class='nav nav-tabs'])/li[3]")
    public WebElement adminPageProfileIconProfileLinkLeavesButton;

    // Admin Page >>> profile icon >>> profile page >>> Attendance button
    @FindBy(xpath = "(//ul[@class='nav nav-tabs'])/li[4]")
    public WebElement adminPageProfileIconProfileLinkAttendanceButton;

    // Admin Page >>> profile icon >>> profile page >>> Documents button
    @FindBy(xpath = "(//ul[@class='nav nav-tabs'])/li[5]")
    public WebElement adminPageProfileIconProfileLinkDocumentsButton;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> phone text
    @FindBy(xpath = "//td[text()='Phone']")
    public WebElement adminPageProfileIconProfileLinkProfileButtonPhoneText;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Total Net Salary Paid text
    @FindBy(xpath = "//h5[text()='Total Net Salary Paid']")
    public WebElement adminPageProfileIconProfileLinkPayrollButtonTotalNetSalaryPaidText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves button >>> Leave Type text
    @FindBy(xpath = "(//th[text()='Leave Type'])[1]")
    public WebElement adminPageProfileIconProfileLinkLeavesButtonLeaveTypeText;

    // Admin Page >>> profile icon >>> profile page >>> Attendance button >>> Total Present text
    @FindBy(xpath = "//h5[text()='Total Present']")
    public WebElement adminPageProfileIconProfileLinkAttendanceButtonTotalPresentText;

    // Admin Page >>> profile icon >>> profile page >>> Documents button >>> No Record Found text
    @FindBy(xpath = "(//div[text()='No Record Found'])[1]")
    public WebElement adminPageProfileIconProfileLinkDocumentsButtonNoRecordFoundText;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> General Information
    @FindBy(xpath = "(//table[@class='table table-hover table-striped tmb0'])[1]/tbody/tr")
    public List<WebElement> adminPageProfileIconProfilePageProfileButtonAllGeneralInformationRow;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> Address Details
    @FindBy(xpath = "(//table[@class='table table-hover table-striped tmb0'])[2]/tbody/tr")
    public List<WebElement> adminPageProfileIconProfilePageProfileButtonAllAddressDetailsRow;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> Bank Account Details
    @FindBy(xpath = "(//table[@class='table table-hover table-striped tmb0'])[3]/tbody/tr")
    public List<WebElement> adminPageProfileIconProfilePageProfileButtonAllBankAccountDetailsRow;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> Social Media Link >>> Facebook Link
    @FindBy(xpath = "//a[text()='http://facebook.com/aziz.eksik']")
    public WebElement adminPageProfileIconProfilePageProfileButtonFacebookLink;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> Social Media Link >>> twitter Link
    @FindBy(xpath = "//a[@href='http://twitter.com/aziz.eksik']")
    public WebElement adminPageProfileIconProfilePageProfileButtonTwitterLink;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> Social Media Link >>> Linkedin Link
    @FindBy(xpath = "//a[@href='http://linkedin.com/aziz.eksik']")
    public WebElement adminPageProfileIconProfilePageProfileButtonLinkedinLink;

    // Admin Page >>> profile icon >>> profile page >>> profile button >>> Social Media Link >>> Instagram Link
    @FindBy(xpath = "//a[@href='http://instagram.com/aziz.eksik']")
    public WebElement adminPageProfileIconProfilePageProfileButtonInstagramLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Total Net Salary Information Board
    @FindBy(xpath = "(//div[@class='row row-flex'])[1]/div[1]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonTotalNetSalaryInformationBoard;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Total Gross Salary Board
    @FindBy(xpath = "(//div[@class='row row-flex'])[1]/div[2]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonTotalGrossSalaryBoard;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Total Earning Board
    @FindBy(xpath = "(//div[@class='row row-flex'])[1]/div[3]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonTotalEarningBoard;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Total Deduction Board
    @FindBy(xpath = "(//div[@class='row row-flex'])[1]/div[4]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonTotalDeductionBoard;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Month - Year Link
    @FindBy(xpath = "//table[@class='table table-hover table-striped example dataTable no-footer']/thead/tr/th[2]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipMonthYearLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Date Link
    @FindBy(xpath = "//table[@class='table table-hover table-striped example dataTable no-footer']/thead/tr/th[3]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipDateLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Mode Link
    @FindBy(xpath = "//table[@class='table table-hover table-striped example dataTable no-footer']/thead/tr/th[4]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipModeLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Status Link
    @FindBy(xpath = "//table[@class='table table-hover table-striped example dataTable no-footer']/thead/tr/th[5]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipStatusLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Net Salary Link
    @FindBy(xpath = "//table[@class='table table-hover table-striped example dataTable no-footer']/thead/tr/th[6]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipNetSalaryLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Action Link
    @FindBy(xpath = "//table[@class='table table-hover table-striped example dataTable no-footer']/thead/tr/th[7]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipActionLink;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Net Salary >> First Row Salary
    @FindBy(xpath = "//td[text()='45,000.00']")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipNetSalaryFirstRowText;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> SearchTextBox
    @FindBy(xpath = "(//input[@type='search'])[1]")
    public WebElement adminPageProfileIconProfilePagePayrollButtonSearchTextBox;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> View Payslip
    @FindBy(xpath = "(//a[text()='View Payslip'])")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipViewPayslipButton;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> Last row Date Text
    @FindBy(xpath = "//td[text()='05/03/2021']")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipLastRowDateText;

    // Admin Page >>> profile icon >>> profile page >>> Payroll button >>> Payslip >>> View Payslip >>> Payslip Detail
    @FindBy(xpath = "//th[text()='Payment Date: 05/03/2021']")
    public WebElement adminPageProfileIconProfilePagePayrollButtonPayslipPayslipDetailBoardDateText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Leave Type Column Header
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[1]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonLeaveTypeColumnHeaderText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Leave Date Column Header
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[2]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonLeaveDateColumnHeaderText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Days Column Header
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[3]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonDaysColumnHeaderText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Apply Date Column Header
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[4]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonApplyDateColumnHeaderText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Status Column Header
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[5]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonStatusColumnHeaderText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Action Column Header
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[6]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonActionColumnHeaderText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Apply Date last Row
    @FindBy(xpath = "//td[text()='03/07/2023']")
    public WebElement adminPageProfileIconProfilePageLeavesButtonApplyDateLastRowText;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Action last view icon
    @FindBy(xpath = "(//i[@class='fa fa-eye'])[3]")
    public WebElement adminPageProfileIconProfilePageLeavesButtonActionLastViewIcon;

    // Admin Page >>> profile icon >>> profile page >>> Leaves Button >>> Leave Table >>> Action last view icon details board
    @FindBy(xpath = "//span[text()='03/07/2023']")
    public WebElement adminPageProfileIconProfilePageLeavesButtonActionLastViewIconDetailBoardApplyDate;

    // Admin Page >>> profile icon >>> profile page >>> Attendance Button >>> All Information Board
    @FindBy(xpath = "//div[@id='attendance']/div[1]/div")
    public List<WebElement> adminPageProfileIconProfilePageAttendanceButtonAllInformationBoard;

    // Admin Page >>> profile icon >>> profile page >>> Attendance Button >>> All Explain Symbol Text
    @FindBy(xpath = "//div[@class='halfday pull-right']/b")
    public List<WebElement> adminPageProfileIconProfilePageAttendanceButtonAlLExplainSymbolText;

    // Admin Page >>> profile icon >>> profile page >>> Attendance Button >>> Day - Month Table >>> First Row >>> First Title
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover dataTable no-footer']/thead/tr/th[1]")
    public WebElement adminPageProfileIconProfilePageAttendanceButtonDayMonthTitleText;

    // Admin Page >>> profile icon >>> profile page >>> Attendance Button >>> Day - Month Table
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover dataTable no-footer']")
    public WebElement adminPageProfileIconProfilePageAttendanceButtonDayMonthTable;

    // Admin Page >>> profile icon >>> profile page >>> Attendance Button >>> Year Dropdown Menu
    @FindBy(xpath = "//select[@class='form-control']")
    public WebElement adminPageProfileIconProfilePageAttendanceButtonYearDropdownMenu;

    // Admin Page >>> profile icon >>> Password Link
    @FindBy(xpath = "//a[@data-original-title='Change Password']")
    public WebElement adminPageProfileIconPasswordLink;

    // Admin Page >>> profile icon >>> Password Link >>> Change Password Page >>> Current Password TextBox
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement adminPageProfileIconPasswordLinkCurrentPasswordTextBox;

    // Admin Page >>> profile icon >>> Password Link >>> Change Password Page >>> New Password TextBox
    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement adminPageProfileIconPasswordLinkNewPasswordTextBox;

    // Admin Page >>> profile icon >>> Password Link >>> Change Password Page >>> Confirm Password TextBox
    @FindBy(xpath = "//input[@name='confirm_pass']")
    public WebElement adminPageProfileIconPasswordLinkConfirmPasswordTextBox;

    // Admin Page >>> profile icon >>> Password Link >>> Change Password Page >>> Change Password Button
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement adminPageProfileIconPasswordLinkChangePasswordButton;

    // Admin Page >>> profile icon >>> Password Link >>> Change Password Page >>> Successfully Password Text
    @FindBy(xpath = "//div[text()='Password Changed Successfully']")
    public WebElement adminPageProfileIconPasswordLinkSuccessfullyPasswordText;

    // Admin Page >>> profile icon >>> Logout Link
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement adminPageProfileIconLogOutLink;

    // Admin Page >>> Side Bar >>> Fees Collection Link
    @FindBy(xpath = "//span[text()='Fees Collection']")
    public WebElement adminPageSideBarFeesCollectionLink;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master
    @FindBy(xpath = "(//a[text()='Fees Master'])[2]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterLink;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Group Dropdown Menu
    @FindBy(xpath = "//select[@id='fee_groups_id']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesGroupDropdownMenu;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Type Dropdown Menu
    @FindBy(xpath = "//select[@id='feetype_id']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesTypeDropdownMenu;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Due Date dateBox
    @FindBy(xpath = "//input[@id='due_date']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterDueDateDateBox;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Amount TextBox
    @FindBy(xpath = "//input[@id='amount']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterAmountTextBox;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Percentage(%) TextBox
    @FindBy(xpath = "//input[@id='fine_percentage']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterPercentageTextBox;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fix Amount TextBox
    @FindBy(xpath = "//input[@id='fine_amount']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFixAmountTextBox;


    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fine Type Radio Button
    @FindBy(xpath = "//div[@id='input-type']/div")
    public List<WebElement> adminPageSideBarFeesCollectionFeesMasterAllFineTypeRadioButton;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Master List >>> Fees Group Title
    @FindBy(xpath = "//th[text()='Fees Group']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListFeesGroupTitleText;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Master List >>> Fees Code Title
    @FindBy(xpath = "(//div[@class='col-md-6'])[3]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListFeesCodeTitleText;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Master List >>> Amount Title
    @FindBy(xpath = "(//div[@class='col-md-6'])[4]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListAmountTitleText;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Master List >>> Action Title
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListActionTitleText;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fees Master List >>> Search TextBox
    @FindBy(xpath = "//input[@type='search']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListSearchTextBox;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Due Date dateBox >>> random Date
    @FindBy(xpath = "(//table[@class='table table-condensed'])[1]/tbody/tr[1]/td[7]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterDueDateDateBoxRandomDate;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Add Fees Master >>> Save Button
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterAddFeesMasterSaveButton;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Add Fees Master >>> Record Saved SuccessFully Text
    @FindBy(xpath = "//div[text()='Record Saved Successfully']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterAddFeesMasterRecordSavedText;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fess Master List >>> Edit button
    @FindBy(xpath = "(//div[@class='col-md-3'])[2]/a[1]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListEditButton;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Fess Master List >>> Delete button
    @FindBy(xpath = "(//div[@class='col-md-3'])[2]/a[2]")
    public WebElement adminPageSideBarFeesCollectionFeesMasterFeesMasterListDeleteButton;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Add Fees Master >>> Record Update SuccessFully Text
    @FindBy(xpath = "//div[text()='Record Updated Successfully']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterAddFeesMasterRecordUpdateText;

    // Admin Page >>> Side Bar >>> Fees Collection >>> Fees Master >>> Edit Fees Master >>> Edit Title
    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement adminPageSideBarFeesCollectionFeesMasterEditFeesMasterEditTitleText;
/*
    // AdminPage >> Username
    @FindBy(xpath = "//*[@name='username']")
    public WebElement adminLoginUsername;

 */

    // AdminPage >>> Left Panel Menu >>> Student Information
    @FindBy(xpath = "(//*[text()='Student Information'])[2]")
    public WebElement studentInformationMenu;


    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details
    @FindBy(xpath = "(//*[text()='Student Details'])[2]")
    public WebElement studentDetailsButton;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria
    @FindBy(xpath = "//*[@id='class_id']")
    public WebElement classSelectDropDown;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria
    @FindBy(xpath = "//*[@id='section_id']")
    public WebElement sectionSelectDropDown;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> 1.Search button
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement studentDetails1SearchButton;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> 2.Search button
    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement studentDetails2SearchButton;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Admission No']")
    public WebElement studentSearchListHeadersAdmissionNo;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Student Name']")
    public WebElement studentSearchListHeadersStudentName;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "(//*[text()='Class'])[4]")
    public WebElement studentSearchListHeadersClass;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Father Name']")
    public WebElement studentSearchListHeadersFatherName;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Date Of Birth']")
    public WebElement studentSearchListHeadersDateOfBirth;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Gender']")
    public WebElement studentSearchListHeadersGender;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Category']")
    public WebElement studentSearchListHeadersCategory;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Mobile Number']")
    public WebElement studentSearchListHeadersMobileNumber;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> List Headers
    @FindBy(xpath = "//*[text()='Action']")
    public WebElement studentSearchListHeadersAction;

    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria >>> After search >>> First Student on the list
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[2]/a")
    public WebElement firstStudentOnTheSearchList;

    // AdminPage >>> Student Profile >>> Student Profile Name
    @FindBy(xpath = "//*[@*='widget-user-username']")
    public WebElement studentProfileName;

    //Admin>>Income
    @FindBy(xpath = "//*[text()='Income']")
    public WebElement adminIncomeLink;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/admin/income'])[2]")
    public WebElement adminAddIncome;

    //Admin >> Income >> AddIncome >>  Income Head dropdown menu
    @FindBy(xpath="//*[@id='documents']")
    public WebElement adminAddIncomeIncomeHeadDropDownMenu;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[1]/label")
    public WebElement adminAddIncomeIncomeHead;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[2]/label")
    public WebElement adminAddIncomeName;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[3]/label")
    public WebElement adminAddIncomeInvoiceNumber;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[4]/label")
    public WebElement adminAddIncomeDate;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[5]/label")
    public WebElement adminAddIncomeAmount;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[6]/label")
    public WebElement adminAddIncomeAttachDocument;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[@id='form1']/div[1]/div[7]/label")
    public WebElement adminAddIncomeDescription;

       //Admin >> Income >> AddIncome
    @FindBy(xpath="//*[@id='form1']/div[1]/div[6]/div/button")
    public WebElement adminAddIncomeDocumentRemove;

    //Admin >> Income >> AddIncome
    @FindBy(xpath="//*[@id='inc_head_id']")
    public WebElement adminAddIncomeIncomeHeadDropDownMenu2;



    @FindBy(xpath = "//*[@id='documents']")
    public WebElement adminAddIncomeDocument;

    //Admin >> Income >> AddIncome
    @FindBy(xpath = "//*[text()='Record Saved Successfully']")

    public WebElement adminAddIncomeSaveSuccesfully;

    //Admin >> Income >> AddIncome >> IncomeList
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[1]")
    public WebElement adminAddIncomeIncomeListName;

    //Admin >> Income >> AddIncome >> IncomeList
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[2]")
    public WebElement adminAddIncomeIncomeListDescription;

    //Admin >> Income >> AddIncome >> IncomeList
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public WebElement adminAddIncomeIncomeListInvoiceNumber;

    //Admin >> Income >> AddIncome >> IncomeList
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[4]")
    public WebElement adminAddIncomeIncomeListDate;

    //Admin >> Income >> AddIncome >> IncomeList
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[5]")
    public WebElement adminAddIncomeIncomeListIncomeHead;

    //Admin >> Income >> AddIncome >> IncomeList
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[6]")
    public WebElement adminAddIncomeIncomeListAmount;

    //Admin >> Income >> AddIncome >> IncomeList >> SeacrhBox
    @FindBy(xpath = "//*[@id='DataTables_Table_0_filter']/label/input")
    public WebElement adminAddIncomeIncomeListSearchBox;

    //Admin >> Income >> AddIncome >> IncomeList >> DropDownMenu
    @FindBy(xpath = "//*[@id='DataTables_Table_0_length']/label/select")
    public WebElement adminAddIncomeIncomeListDropDown;

/*
    // Login Page Admin Login Button
    @FindBy(xpath = "//*[text()='Admin Login ']")
    public WebElement adminLoginButton;

 */


    //Admin Login page Username TextBox
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextbox;

    //Admin Login page Password TextBox
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextbox;

    //Admin Login page Sign In Button
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    //Admin Page Student Information Locate
    @FindBy(xpath = "//span[text()='Student Information']")
    public WebElement studentInformation;

    //Admin Page Multi Class Student Link Locate
    @FindBy(xpath = "(//*[text()='Multi Class Student'])[2]")
    public WebElement multiClassStdntLink;

    //Multiclass Page Class dropdown
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    //Multiclass Page Section dropdown
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    //Multiclass Page Search Button
    @FindBy(xpath = "//*[text()=' Search']")
    public WebElement searchButton;

    //

    //Multiclass Page (+Plus)Adding Icon
    @FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
    public WebElement addingIcon;

    //Multiclass Page Update Class dropdown
    @FindBy(xpath = "//select[@name='class_id_3']")
    public WebElement multiClassUpdateDropDown;

    //Multiclass Page Update Section dropdown
    @FindBy(xpath = "//select[@name='section_id_3']")
    public WebElement multiSectionUpdateDropDown;

    //Multiclass Page Update Remove Button = (//button[text()='Remove'])[2]
    @FindBy(xpath = "(//button[text()='Remove'])[2]")
    public WebElement multiClassRemoveButton;

    //Multiclass Page Update Remove Button = (//button[text()='Remove'])[2]
    @FindBy(xpath = "(//button[text()='Remove'])[3]")
    public WebElement multiClassAddingRemoveButton;

    //Multiclass Page Update Button
    @FindBy(xpath = "(//button[@class='btn btn-default btn-sm pull-right'])[1]")
    public WebElement multiClassUpdateButton;

    //Multiclass Page Update Successfully Text
    @FindBy(xpath = "//div[text()='Record Saved Successfully']")
    public WebElement updateSuccessText;

    // Admin Panel Fees Collection Menu
    @FindBy(xpath = "//*[text()='Fees Collection']")
    public WebElement feesCollectionMenu;

    // Admin Panel Collect Fees Link
    @FindBy(xpath = "(//*[text()='Collect Fees'])[2]")
    public WebElement collectFeesLink;

    // Studentfee Page Class dropDown  select "Class 1"
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement stdntFeeClassDropDown;

    // Studentfee Page Section dropDown select "A"
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement stdntFeeSectionDropDown;

    // Studentfee Page Search Button
    @FindBy(xpath = "(//*[text()=' Search'])[1]")
    public WebElement stdntFeeSearchButton;

    // Studentfee Page Collect Fees Button
    @FindBy(xpath = "//*[@href='https://qa.wonderworldcollege.com/studentfee/addfee/68']")
    public WebElement stdntFeeCollectFeesButton;

    // Studentfee Page Collect Fees List Headers   ---   //thead[@class='header']   (//th[@rowspan='1'])[2]
    @FindBy(xpath = "//thead[@class='header']")
    public WebElement stdntFeeHeaders;

    // Studentfee Page Money Unit Icon EUR/USD
    @FindBy(xpath = "//button[@data-id='currencySwitcher']")
    public WebElement moneyIcon;

    // Studentfee Page EUR(€) Icon  //span[text()='EUR (€)']   //*[text()='USD ($)']
    @FindBy(xpath = "(//a[@tabindex='0'])[1]")
    public WebElement iconEUR;

    // Studentfee Page USD ($) Icon
    @FindBy(xpath = "(//a[@tabindex='0'])[2]")
    public WebElement iconUSD;

    // Studentfee Page Paid(€) Locate
    @FindBy(xpath = "//*[text()='Grand Total']/following-sibling::td[7]")
    public WebElement paidHeader;

    // Studentfee Page Add Fees Icon(+)
    @FindBy(xpath = "(//i[@class='fa fa-plus'])[3]")
    public WebElement addFeesIcon;

    // Studentfee Page "$ Collect Fees" Button
    @FindBy(xpath = "(//button[@id='load'])[3]")
    public WebElement $CollectFeesButton;

    // Studentfee Page "Revert" Icon
    @FindBy(xpath = "(//i[@class='fa fa-undo'])[2]")
    public WebElement revertIcon;

    // Studentfee Page "Revert" Button
    @FindBy(xpath = "(//a[text()='Revert'])[2]")
    public WebElement revertButton;

    // Studentfee Page Total Paid
    @FindBy(xpath = "(//td[@class='text text-right'])[33]")
    public WebElement totalPaid;

    // Studentfee Page remaining payment(Balance)
    @FindBy(xpath = "(//td[@class='text text-right'])[34]")
    public WebElement totalBalance;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> View Button
    @FindBy(xpath = "//a[@title='View']")
    public WebElement studentSearchListActionViewButton;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button
    @FindBy(xpath = "//a[@title='Edit']")
    public WebElement studentSearchListActionEditButton;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Add Fees Button
    @FindBy(xpath = "//a[@title='Add Fees']")
    public WebElement studentSearchListActionAddFeesButton;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Edit Student
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement studentEditAdmissionNoBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Edit Student
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement studentEditFirstNameBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Transport Details
    @FindBy(xpath = "//select[@id='vehroute_id']")
    public WebElement studentEditTransportDetailsDropDown;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Transport Details
    @FindBy(xpath = "//select[@id='pickup_point']")
    public WebElement studentEditPickupPointDropDown;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Fee Details
    @FindBy(xpath = "(//input[@class='fee_group_chk vertical-middle'])[1]")
    public WebElement studentEditChangeableCheckBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Parent Guardian Details
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement studentEditFatherNameBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Parent Guardian Details
    @FindBy(xpath = "//input[@id='father_phone']")
    public WebElement studentEditFatherPhoneBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Address Details
    @FindBy(xpath = "//*[@id='current_address']")
    public WebElement studentEditCurrentAddressBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Miscellaneous Details
    @FindBy(xpath = "//*[@id='bank_name']")
    public WebElement studentEditBankNameBox;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Save Button
    @FindBy(xpath = "//*[@id='submitbtn']")
    public WebElement studentEditSaveButton;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Edit Button >>> Save Button >>> Success Message
    @FindBy(xpath = "//*[@student='alert alert-success text-left']")
    public WebElement studentEditSuccessMessage;

    // Admin Page >>> Student Information >>> Student Details >>> Action >>> Add Fees Button >>> Student Fees
    @FindBy(xpath = "//*[text()='Student Fees']")
    public WebElement studentAddFeesStudentFees;


    // AdminPage >>> Left Panel Menu >>> Student Information Menu >>> Student Details >>> Select Criteria
    @FindBy(xpath = "//input[@id='search_text']")
    public WebElement studentSearchByKeyword;

    // Admin Login >>> Login Window
    @FindBy(xpath = "//*[@*='post']")
    public WebElement loginWindowBox;

    // Admin Login >>> "What's New In Wonder World College" Title
    @FindBy(xpath = "//h3[@class='h3']")
    public WebElement whatsNewLabel;

    // Admin Login >>> The sub-header-1 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[1]")
    public WebElement whatsNewSubHeader1;

    // Admin Login >>> The sub-header-2 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[2]")
    public WebElement whatsNewSubHeader2;

    // Admin Login >>> The sub-header-3 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[3]")
    public WebElement whatsNewSubHeader3;

    // Admin Login >>> The sub-header-4 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[4]")
    public WebElement whatsNewSubHeader4;

    // Admin Login >>> Scroll Box
    @FindBy(xpath = "//*[@*='mCSB_1']")
    public WebElement adminLoginScrollBox;

    // Admin Login >>> 'Admin Login' Text (above the login window)
    @FindBy(xpath = "//*[text()='Admin Login']")
    public WebElement adminLoginLabel;

    // Admin Login >>> Admin Username Textbox
    @FindBy(xpath = "//*[@*='form-username']")
    public WebElement adminUsernameBox;

    // Admin Login >>> Admin Password Textbox
    @FindBy(xpath = "//*[@*='form-password']")
    public WebElement adminPasswordBox;

    // Admin Login >>> Admin Sign In Button
    @FindBy(xpath = "//*[@*='submit']")
    public WebElement adminSignInButton;

    // Forgot Password Link
    @FindBy(xpath = "//*[@*='forgot']")
    public WebElement forgotPasswordLink;

    // Forgot Password Email Textbox
    @FindBy(xpath = "//*[@*='email']")
    public WebElement forgotPasswordEmailBox;

    // Forgot Password Submit Button
    @FindBy(xpath = "//*[@*='submit']")
    public WebElement forgotPasswordSubmitButton;

    //Forgot Password >> "Please Check Your Email To Recover Your Password" message
    @FindBy(xpath = "//*[@*='alert alert-success']")
    public WebElement passwordSentLabel;

    // Forgot Password page -> Admin Login Link
    @FindBy(xpath = "//*[@*='forgot']")
    public WebElement adminLoginLink;

    // Admin Login -> User Login Link
    @FindBy(xpath = "(//*[@*='_blank'])[1]")
    public WebElement userLoginLink;

    // User Login -> Front Site Link
    @FindBy(xpath = "(//*[@*='_blank'])[1]")
    public WebElement frontSiteLink;

    // Admin Login >>> Invalid Login Label
    @FindBy(xpath = "//*[text()='Invalid Username Or Password']")
    public WebElement adminInvalidLoginLabel;


    // Admin Page >>> Side Bar >>> Academics Menu Link
    @FindBy(xpath = "//span[text()='Academics']")
    public WebElement adminPageSideBarAcademicsMenuLink;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Link
    @FindBy(xpath = "//ul[@class='sidebar-menu verttop']/li[7]/ul/li[3]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherLink;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Dropdown Menu
    @FindBy(xpath = "(//select[@class='form-control'])[1]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassDropdownMenu;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Section Dropdown Menu
    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageSectionDropdownMenu;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Save Button
    @FindBy(xpath = "//button[@class='btn btn-info pull-right']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageSaveButton;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> All Teacher Name
    @FindBy(xpath = "(//div[@class='form-group'])[3]/div")
    public List<WebElement> adminPageSideBarAcademicsMenuAssignClassTeacherPageAllTeacherName;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Teacher Name All checkBox
    @FindBy(xpath = "(//div[@class='form-group'])[3]/div/label/input")
    public List<WebElement> adminPageSideBarAcademicsMenuAssignClassTeacherPageTeacherNameAllCheckBox;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Teacher Name aziz
    @FindBy(xpath = "//input[@value='172']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageAzizCheckBox;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Record Saved Successfully Alert
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageRecordSavedAlert;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> class Column Text
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/tbody/tr/td[1]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListClassColumnText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Section Column Text
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/tbody/tr/td[2]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSectionColumnText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Search TextBox
    @FindBy(xpath = "//input[@type='search']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSearchTextBox;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Class Column Title tex
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[1]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListClassColumnTitleText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Section Column Title tex
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[2]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListSectionColumnTitleText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Class Teacher Column Title tex
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[3]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListClassTeacherColumnTitleText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Action Column Title tex
    @FindBy(xpath = "//table[@class='table table-striped table-bordered table-hover example dataTable no-footer']/thead/tr/th[4]")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListActionColumnTitleText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Edit Icon
    @FindBy(xpath = "//i[@class='fa fa-pencil']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListEdinIcon;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Edit Assign Class Teacher Page
    @FindBy(xpath = "//h3[text()='Edit Assign Class Teacher']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageEditPageTitleText;

    // Admin Page >>> Side Bar >>> Academics Menu >>> Assign Class Teacher Page >>> Class Teacher List >>> Delete icon
    @FindBy(xpath = "//i[@class='fa fa-remove']")
    public WebElement adminPageSideBarAcademicsMenuAssignClassTeacherPageClassTeacherListDeleteIcon;


    @FindBy(xpath = "(//*[@href=\"#\"])[15]")
    public WebElement adminPageTransportDropdown;

    @FindBy(xpath = "(//*[@href=\"https://qa.wonderworldcollege.com/admin/route\"])[2]")
    public WebElement adminPageRoutesLink;

    @FindBy(xpath = "//*[@id=\"route_title\"]")
    public WebElement adminPageRouteTittleTextBox;

    @FindBy(xpath = "(//*[@type=\"submit\"])[3]")
    public WebElement adminPageRouteSaveButton;

    //@FindBy(xpath = "//tbody/tr")
    //public WebElement rotaKayitListesi= Driver.getDriver().findElement(By.xpath("//tbody/tr"));

    @FindBy(xpath = "//*[@class=\"box-title titlefix\"]")
    public WebElement adminPageRouteRouteListLabel;

    @FindBy(xpath = "//*[@class=\"sorting\"]")
    public WebElement adminPageRouteRouteTittleLabel;

    @FindBy(xpath = "(//*[@aria-controls=\"DataTables_Table_0\"])[9]")
    public WebElement adminPageRouteActionLabel;

    @FindBy(xpath = "(//*[@class=\"fa fa-pencil\"])[21]")
    public WebElement adminPageRouteEditButton;

    @FindBy(xpath = "(//*[@class=\"fa fa-remove\"])[21]")
    public WebElement adminPageRouteDeleteButton;

    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement vahdeddinAdminLoginPageEmailBox;








    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[3]/a/span")
    public WebElement adminFeesCollectionButton;



    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[3]/ul/li[4]/a")
    public WebElement adminFeesTypeButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div[1]/div/div/h3")
    public WebElement adminAddFeesTypeLabel;

    @FindBy(xpath = "//*[@id=\"name\"]")
    public WebElement adminAddFeesNameTextbox;

    @FindBy(xpath = "//*[@id=\"code\"]")
    public WebElement adminAddFeesCodeTextbox;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement adminAddFeesDescriptionTextbox;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[2]/button")
    public WebElement adminAddFeesSaveButton;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]/a[1]/i")
    public WebElement adminAddFeesEditIcon;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[3]/a[2]")
    public WebElement adminAddFeesDeleteIcon;


    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div[1]/div/div/h3")
    public WebElement adminAddFeesEditFeesTypeLabel;


    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[1]/div[2]/div/div[1]/h3")
    public WebElement adminAddFeesListLabel;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement adminAddFeesNameColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement adminAddFeesCodeColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    public WebElement adminAddFeesDescriptionColumn;


    @FindBy(xpath = "//form/div/div[contains(text,Successfully) and contains(text,Record) ]")
    public WebElement adminAddFeesSuccessLabel;


    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement adminComplainComplainComplainnoColumnn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement adminComplainComplainComplainTypeColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    public WebElement adminComplainComplainComplainNameColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]")
    public WebElement adminComplainComplainPhoneColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[5]")
    public WebElement adminComplainComplainDateColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[6]")
    public WebElement adminComplainComplainActionColumn;


    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[1]")
    public WebElement adminComplainComplainFirstRowNoLabel;

    @FindBy(xpath = "(//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a)[1]")
    public WebElement adminComplainComplainViewIcon;

    @FindBy(xpath = "(//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a)[2]")
    public WebElement adminComplainComplainEditIcon;

    @FindBy(xpath = "(//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[6]/a)[3]")
    public WebElement adminComplainComplainDeleteIcon;


    @FindBy(xpath = "//*[@id=\"complaintdetails\"]/div/div/div[1]/h4")
    public WebElement adminComplainComplainDetailsLabel;


    @FindBy(xpath = "//*[@id=\"complaintdetails\"]/div/div/div[1]/button")
    public WebElement adminComplainComplainDetailsCloseButton;


    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[1]")
    public WebElement adminComplainComplainSuccessLabel;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/a")
    public WebElement adminFrontOfficeButton;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/ul/li[6]/a")
    public WebElement adminFrontOfficeComplainButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div[1]/div/div/h3")
    public WebElement adminComplainAddLabel;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[3]/input")
    public WebElement adminComplainComplainbyTextbox;


    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[1]/select")
    public WebElement adminComplainTypeDropdown;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[2]/select")
    public WebElement adminComplainComplainSourceDropdown;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[4]/input")
    public WebElement adminComplainComplainPhoneTextbox;

    @FindBy(xpath = "//*[@id=\"date\"]")
    public WebElement adminComplainComplainDateTable;

    @FindBy(xpath = "//*[@id=\"description\"]")
    public WebElement adminComplainComplainDescriptionTextbox;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[7]/input")
    public WebElement adminComplainComplainActionTakenTextbox;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[8]/input")
    public WebElement adminComplainComplainAssignedTextbox;

    @FindBy(xpath = "(//*[@id=\"description\"])[2]")
    public WebElement adminComplainComplainNoteTextbox;

    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[10]")
    public WebElement adminComplainComplainAttachDocumentButton;

    @FindBy(xpath = "//*[@id=\"submitbtn\"]")
    public WebElement adminComplainComplainSaveButton;




    /*
    DEMO
     */

    @FindBy(xpath = "(//*[text()='Online Admission'])[3]")
    public WebElement studentOnlineAdmissionButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement studentListSearch;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[12]/a[3]")
    public WebElement editAndEnrollButton;

    @FindBy(xpath = "(//input[@class='fee_group_chk vertical-middle'])[1]")
    public WebElement feeStudentCheckBox;

    @FindBy(xpath = "//button[@id='enrollbtn']")
    public WebElement saveAndEnrollButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[5]")
    public WebElement loginDetailsButton;

    @FindBy(xpath = "(//a[@title='View'])[1]")
    public WebElement studentSearchListViewButton;

    @FindBy(xpath = "//*[@id=\"scheduleModal\"]/div/div/div[2]/div/div/table/tbody/tr[1]/td[2]")
    public WebElement userIdParentLocate;

    @FindBy(xpath = "//*[@id=\"scheduleModal\"]/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]")
    public WebElement userPassParentLocate;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement adminProfilIcon;

    @FindBy(xpath = "//a[@href='https://qa.wonderworldcollege.com/site/logout']")
    public WebElement adminLogoutLink;

    @FindBy(xpath = "(//button[@class='close'])[4]")
    public WebElement loginDetailsCloseButon;

    // Admin Login Page -> Admin Login Text
    @FindBy (xpath = "//h3[text()='Admin Login']")
    public WebElement adminLoginPageAdminLoginText;

    // Admin Login Page -> Username Text Box
    @FindBy (xpath = "//input[@id='form-username']")
    public WebElement adminLoginPageUsernameTextBox;

    // Admin Login Page -> Password Text Box
    @FindBy (xpath = "//input[@id='form-password']")
    public WebElement adminLoginPagePasswordTextBox;

    // Admin Dasboard Page -> Wonder Logo
    @FindBy (xpath = "//span[@class='logo-lg']")
    public WebElement adminDasboardWonderLogo;

    // Admin Sidebar -> Student Information Menu Heading
    @FindBy (xpath = "//span[text()='Student Information']")
    public WebElement adminSidebarStudentInformation;

    // Admin Sidebar -> Student Information Menu Heading -> Online Admission tab.
    @FindBy (xpath = "(//a[@href='https://qa.wonderworldcollege.com/admin/onlinestudent'])[2]")
    public WebElement adminSidebarStudentInfoOnlineAdmissionTab;

    // Admin Dasboard -> Student Information -> Online Admission -> Student List Text
    @FindBy (xpath = "//h3[text()='Student List']")
    public WebElement onlineAdmissionPageStudentListText;

    // Admin Dasboard -> Student Information -> Online Admission -> Student Information Row
    @FindBy (xpath = "(//tr[@role='row'])[1]")
    public WebElement onlineAdmissionStudentInfoRow;

    // Admin Dasboard -> Student Information -> Online Admission -> Search Box
    @FindBy (xpath = "//input[@type='search']")
    public WebElement onlineAdmissionSearchBox;

    // Admin Dasboard -> Student Information -> Online Admission -> Search Result First Row
    @FindBy (xpath = "(//tr[@role='row'])[2]")
    public WebElement onlineAdmissionSearchResultFirstRow;

    // Admin Dasboard -> Student Information -> Online Admission -> Studend List Element
    @FindBy (xpath = "//tbody/tr")
    public List<WebElement> onlineAdmissionStudentListRow;

    // Admin Dasboard -> Student Information -> Online Admission -> Enrolled
    @FindBy (xpath = "(//i[@class='fa fa-check'])[1]")
    public WebElement onlineAdmissionEnrolled;

    // Admin Dasboard -> Student Information -> Online Admission -> Not Enrolled
    @FindBy (xpath = "(//i[@class='fa fa-minus-circle'])[1]")
    public WebElement onlineAdmissionNotEnrolled;

    // Admin Dasboard -> Student Information -> Online Admission -> Delete Button Under Action
    @FindBy (xpath = "(//i[@class='fa fa-remove'])[1]")
    public WebElement onlineAdmissionDeleteButton;

    // Admin Dasboard -> Student Information -> Online Admission -> Edit And Enroll Button Under Action
    @FindBy (xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement onlineAdmissionEditAndEnrollButton;

    // Admin Dasboard -> Student Information -> Online Admission -> Edit Online Admission Text
    @FindBy (xpath = "//h3[text()=' Edit Online Admission']")
    public WebElement onlineAdmissionEditOnlineAdmissionText;

    // Admin Dasboard -> Student Information -> Online Admission -> Admission No
    @FindBy (xpath = "//input[@name='admission_no']")
    public WebElement editAndEnrollPageAdmissionNo;

    // Admin Dasboard -> Student Information -> Online Admission -> Roll Number
    @FindBy (xpath = "//input[@name='roll_no']")
    public WebElement editAndEnrollPageRollNumber;

    // Admin Dasboard -> Student Information -> Online Admission -> Class
    @FindBy (xpath = "//select[@name='class_id']")
    public WebElement editAndEnrollPageClassSelect;

    // Admin Dasboard -> Student Information -> Online Admission -> Section
    @FindBy (xpath = "//select[@name='section_id']")
    public WebElement editAndEnrollPageSectionSelect;

    // Admin Dasboard -> Student Information -> Online Admission -> First Name
    @FindBy (xpath = "//input[@name='firstname']")
    public WebElement editAndEnrollPageFirstName;

    // Admin Dasboard -> Student Information -> Online Admission -> Last Name
    @FindBy (xpath = "//input[@name='lastname']")
    public WebElement editAndEnrollPageLastName;

    // Admin Dasboard -> Student Information -> Online Admission -> Gender
    @FindBy (xpath = "//select[@name='gender']")
    public WebElement editAndEnrollPageGender;

    // Admin Dasboard -> Student Information -> Online Admission -> Date Of Birth
    @FindBy (xpath = "//input[@name='dob']")
    public WebElement editAndEnrollPageDateOfBirth;

    // Admin Dasboard -> Student Information -> Online Admission -> Category
    @FindBy (xpath = "//select[@name='category_id']")
    public WebElement editAndEnrollPageCategory;

    // Admin Dasboard -> Student Information -> Online Admission -> Religion
    @FindBy (xpath = "//input[@name='religion']")
    public WebElement editAndEnrollPageReligion;

    // Admin Dasboard -> Student Information -> Online Admission -> Mobile Number
    @FindBy (xpath = "//input[@name='mobileno']")
    public WebElement editAndEnrollPageMobileNumber;

    // Admin Dasboard -> Student Information -> Online Admission -> Email
    @FindBy (xpath = "(//input[@name='email'])[1]")
    public WebElement editAndEnrollPageEmail;

    // Admin Dasboard -> Student Information -> Online Admission -> Admission Date
    @FindBy (xpath = "//input[@name='admission_date']")
    public WebElement editAndEnrollPageAdmissionDate;

    // Admin Dasboard -> Student Information -> Online Admission -> Blood Group
    @FindBy (xpath = "//select[@name='blood_group']")
    public WebElement editAndEnrollPageBloodGroup;

    // Admin Dasboard -> Student Information -> Online Admission -> House
    @FindBy (xpath = "//select[@name='house']")
    public WebElement editAndEnrollPageHouse;

    // Admin Dasboard -> Student Information -> Online Admission -> Height
    @FindBy (xpath = "//input[@name='height']")
    public WebElement editAndEnrollPageHeight;

    // Admin Dasboard -> Student Information -> Online Admission -> Weight
    @FindBy (xpath = "//input[@name='weight']")
    public WebElement editAndEnrollPageWeight;

    // Admin Dasboard -> Student Information -> Online Admission -> Measurement Date
    @FindBy (xpath = "//input[@name='measure_date']")
    public WebElement editAndEnrollPageMeasurementDate;

    // Admin Dasboard -> Student Information -> Online Admission -> Student Photo
    @FindBy (xpath = "//input[@name='file']")
    public WebElement editAndEnrollPageStudentPhoto;

    // Admin Dasboard -> Student Information -> Online Admission -> Fees Top
    @FindBy (xpath = "//span[@class='float-right bmedium total_fees_alloted']")
    public WebElement editAndEnrollPageFeesTop;

    // Admin Dasboard -> Student Information -> Online Admission -> Fees Details Check Box
    @FindBy (xpath = "(//input[@name='fee_session_group_id[]'])[2]")
    public WebElement editAndEnrollPageFeesDetailsCheckBox;

    // Admin Dasboard -> Student Information -> Online Admission -> Fees Details Button
    @FindBy (xpath = "//a[@data-toggle='collapse']")
    public WebElement editAndEnrollPageFeesDetailsButton;

    // Admin Dasboard -> Student Information -> Online Admission -> Fees Details
    @FindBy (xpath = "(//li[@class='list-group-item'])[1]")
    public WebElement editAndEnrollPageFeesDetails;

    // Admin Dasboard -> Student Information -> Online Admission -> Route List
    @FindBy (xpath = "//select[@name='vehroute_id']")
    public WebElement editAndEnrollPageRouteList;

    // Admin Dasboard -> Student Information -> Online Admission -> Pickup Point
    @FindBy (xpath = "//select[@name='route_pickup_point_id']")
    public WebElement editAndEnrollPagePickupPoint;

    // Admin Dasboard -> Student Information -> Online Admission -> Fees Month
    @FindBy (xpath = "//*[text()='Select Month']")
    public WebElement editAndEnrollPageFeesMonth;

    // Admin Dasboard -> Student Information -> Online Admission -> Father Name
    @FindBy (xpath = "//input[@name='father_name']")
    public WebElement editAndEnrollPageFatherName;

    // Admin Dasboard -> Student Information -> Online Admission -> Phone Number
    @FindBy (xpath = "//input[@name='father_phone']")
    public WebElement editAndEnrollPagePhoneNumber;

    // Admin Dasboard -> Student Information -> Online Admission -> Father Occupation
    @FindBy (xpath = "//input[@name='father_occupation']")
    public WebElement editAndEnrollPageFatherOccupation;

    // Admin Dasboard -> Student Information -> Online Admission -> Father Photo
    @FindBy (xpath = "//input[@name='father_pic']")
    public WebElement editAndEnrollPageFatherPhoto;

    // Admin Dasboard -> Student Information -> Online Admission -> Mother Name
    @FindBy (xpath = "//input[@name='mother_name']")
    public WebElement editAndEnrollPageMotherName;

    // Admin Dasboard -> Student Information -> Online Admission ->Mother Phone
    @FindBy (xpath = "//input[@name='mother_phone']")
    public WebElement editAndEnrollPageMotherPhone;

    // Admin Dasboard -> Student Information -> Online Admission -> Mother Occupation
    @FindBy (xpath = "//input[@name='mother_occupation']")
    public WebElement editAndEnrollPageMotherOccupation;

    // Admin Dasboard -> Student Information -> Online Admission -> Mother Photo
    @FindBy (xpath = "//input[@name='mother_pic']")
    public WebElement editAndEnrollPageMotherPhoto;

    // Admin Dasboard -> Student Information -> Online Admission -> If Guardian Is Father
    @FindBy (xpath = "(//input[@name='guardian_is'])[1]")
    public WebElement editAndEnrollPageIfGuardianIsFather;

    // Admin Dasboard -> Student Information -> Online Admission -> If Guardian Is Mother
    @FindBy (xpath = "(//input[@name='guardian_is'])[2]")
    public WebElement editAndEnrollPageIfGuardianIsMother;

    // Admin Dasboard -> Student Information -> Online Admission -> If Guardian Is Other
    @FindBy (xpath = "(//input[@name='guardian_is'])[3]")
    public WebElement editAndEnrollPageOther;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Name
    @FindBy (xpath = "//input[@name='guardian_name']")
    public WebElement editAndEnrollPageGuardianName;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Relation
    @FindBy (xpath = "//input[@name='guardian_relation']")
    public WebElement editAndEnrollPageGuardianRelation;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Email
    @FindBy (xpath = "//input[@name='guardian_email']")
    public WebElement editAndEnrollPageGuardianEmail;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Photo
    @FindBy (xpath = "//input[@name='guardian_pic']")
    public WebElement editAndEnrollPageGuardianPhoto;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Phone
    @FindBy (xpath = "//input[@name='guardian_phone']")
    public WebElement editAndEnrollPageGuardianPhone;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Occupation
    @FindBy (xpath = "//input[@name='guardian_occupation']")
    public WebElement editAndEnrollPageGuardianOccupation;

    // Admin Dasboard -> Student Information -> Online Admission -> Guardian Address
    @FindBy (xpath = "//textarea[@name='guardian_address']")
    public WebElement editAndEnrollPageGuardianAddress;

    // Admin Dasboard -> Student Information -> Online Admission -> If Guardian Address
    @FindBy (xpath = "//input[@id='autofill_current_address']")
    public WebElement editAndEnrollPageIfGuardianAddress;

    // Admin Dasboard -> Student Information -> Online Admission ->Current Address
    @FindBy (xpath = "//textarea[@name='current_address']")
    public WebElement editAndEnrollPageCurrentAddress;

    // Admin Dasboard -> Student Information -> Online Admission -> If Permanent Address
    @FindBy (xpath = "//input[@id='autofill_address']")
    public WebElement editAndEnrollPageIfPermanentAddress;

    // Admin Dasboard -> Student Information -> Online Admission -> Permanent Address
    @FindBy (xpath = "//textarea[@name='permanent_address']")
    public WebElement editAndEnrollPagePermanentAddress;

    // Admin Dasboard -> Student Information -> Online Admission -> Bank Account
    @FindBy (xpath = "//input[@name='bank_account_no']")
    public WebElement editAndEnrollPageBankAccount;

    // Admin Dasboard -> Student Information -> Online Admission -> Bank Name
    @FindBy (xpath = "//input[@name='bank_name']")
    public WebElement editAndEnrollPageBankName;

    // Admin Dasboard -> Student Information -> Online Admission -> IFSC Code
    @FindBy (xpath = "//input[@name='ifsc_code']")
    public WebElement editAndEnrollPageIFSCCode;

    // Admin Dasboard -> Student Information -> Online Admission -> National Identification
    @FindBy (xpath = "//input[@name='adhar_no']")
    public WebElement editAndEnrollPageNationalIdentification;

    // Admin Dasboard -> Student Information -> Online Admission -> Local Identification
    @FindBy (xpath = "//input[@name='samagra_id']")
    public WebElement editAndEnrollPageLocalIdentification;

    // Admin Dasboard -> Student Information -> Online Admission -> Previous School
    @FindBy (xpath = "//textarea[@name='previous_school']")
    public WebElement editAndEnrollPagePreviousSchool;

    // Admin Dasboard -> Student Information -> Online Admission -> Note
    @FindBy (xpath = "//textarea[@name='note']")
    public WebElement editAndEnrollPageNote;

    // Admin Dasboard -> Student Information -> Online Admission -> Save Button
    @FindBy (xpath = "//button[@id='submitbtn']")
    public WebElement editAndEnrollPageSaveButton;

    // Admin Dasboard -> Student Information -> Online Admission -> Save And Enroll Button
    @FindBy (xpath = "//button[@id='enrollbtn']")
    public WebElement editAndEnrollPageSaveAndEnrollButton;

    // Admin Dasboard -> Student Information -> Online Admission -> Record Updated Successfully
    @FindBy (xpath = "//div[text()='Record Updated Successfully']")
    public WebElement editAndEnrollPageRecordUpdatedSuccessfullyText;

    // Admin Dasboard -> Fees Collection
    @FindBy (xpath ="//span[text()='Fees Collection']")
    public WebElement adminSidebarFeesCollectionTab;

    // Admin Dasboard -> Fees Collection -> Fees Group Tap
    @FindBy (xpath = "(//a[@href='https://qa.wonderworldcollege.com/admin/feegroup'])[2]")
    public WebElement adminSidebarFeesGroupTab;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Name Box
    @FindBy (xpath = "//input[@name='name']")
    public WebElement feesGroupPageNameBox;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Description Box
    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement feesGroupPageDescriptionBox;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Add Fees Save Button
    @FindBy (xpath = "//button[@class='btn btn-info pull-right']")
    public WebElement feesGroupPageAddFeesSaveButton;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Fees Group List
    @FindBy (xpath = "//tbody/tr")
    public List<WebElement> feesGroupPageFeesGroupList;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Record Saved Successfully Text
    @FindBy (xpath = "//div[text()='Record Saved Successfully']")
    public WebElement feesGroupPageRecordSavedSuccessfullyText;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Fees Edit Button
    @FindBy (xpath = "//i[@class='fa fa-pencil']")
    public WebElement feesGroupPageFeesEditButton;

    // Admin Dasboard -> Fees Collection -> Fees Group Page -> Delete Button
    @FindBy (xpath = "//i[@class='fa fa-remove']")
    public WebElement feesGroupPageFeesDeleteButton;
}



