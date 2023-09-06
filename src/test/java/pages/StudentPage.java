package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class StudentPage {


    public StudentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Student Login page Username TextBox
    @FindBy(xpath = "//input[@id='email']")
    public WebElement usernameTextbox;

    // Student page Password TextBox
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextbox;

    //Student Login page Sign In Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;


    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement usernameBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordBox;

    /*
    @FindBy(xpath = "//*[@class=\"btn\"]")
    public WebElement signInButton;

     */

    @FindBy(xpath = "//*[@class=\"alert alert-danger\"]")
    public WebElement invalidUsernameOrPasswordLabel;

    @FindBy(xpath = "//*[@class=\"forgot\"]")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//*[@type=\"text\"]")
    public WebElement forgetPasswordBox;

    @FindBy(xpath = "(//*[@class=\"text-danger\"])[2]")
    public WebElement minSixCharAlertLabel;


    // Login Page Student Login Button
    @FindBy(xpath = "//*[text()=' Student Login']")
    public WebElement studentLoginButton;

    //  Student Panel Page Teacher Reviews Menu
    @FindBy(xpath = "//*[text()='Teachers Reviews']")
    public WebElement teacherReviewsMenu;

    //  Student Panel Teacher Reviews Header Text
    @FindBy(xpath = "//*[text()=' Teachers Reviews']")
    public WebElement teacherReviewsText;

    //  Student Panel Teacher Reviews Add(+) Icon
    @FindBy(xpath = "(//a[@data-toggle='tooltip'])[4]")
    public WebElement addIconStudentPanel;

    //  Student Panel Teacher Reviews Rating(*)
    @FindBy(xpath = "//span[@id='rate5']")
    public WebElement studentPnlRating;

    // Student Panel Teacher Reviews Rating Comment Textbox
    @FindBy(xpath = "//input[@type='text']")
    public WebElement commentTextboxRating;

    // Student Panel Teacher Reviews Rating Save Button
    @FindBy(xpath = "//button[@id='submit']")
    public WebElement ratingSaveButton;

    // Student Panel Teacher Reviews 5 Rating Point
    @FindBy(xpath = "(//span[@class='fa fa-star'])[5]")
    public WebElement fiveRatingPoint;

    // Student Panel Teacher Reviews locate the comment made
    @FindBy(xpath = "//table/tbody/tr[1]/td[8]")
    public WebElement commentMade;


    // Student Login >>> Student Username Box
    @FindBy(id = "email")
    public WebElement studentUsernameBox;

    // Student Login >>> Student Password Box
    @FindBy(id = "password")
    public WebElement studentPasswordBox;

    // Student Login >>> Student Sign In Button
    @FindBy(xpath = "//*[@*='submit']")
    public WebElement studentSignInButton;

    // Student Login >>> Examinations Button
    @FindBy(xpath = "//*[text()='Examinations']")
    public WebElement examinationsButton;

    // Student Login >>> Exam Schedule Link
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/li[8]/ul/li[1]/a")
    public WebElement examScheduleLink;

    // Exam Schedule >>> S.No. Column
    @FindBy(xpath = "//*[text()='S.No.']")
    public WebElement sNoColumn;

    // Exam Schedule >>> Exam Column
    @FindBy(xpath = "//*[text()='Exam']")
    public WebElement examColumn;

    // Exam Schedule >>> Description Column
    @FindBy(xpath = "//*[text()='Description']")
    public WebElement descriptionColumn;

    // Exam Schedule >>> Action Column
    @FindBy(xpath = "//*[text()='Action']")
    public WebElement actionColumn;

    // Exam Schedule >>> Search filter Box
    @FindBy(xpath = "//*[@*='search']")
    public WebElement searchFilterBox;

    // Exam Schedule >>> filtered Exam
    @FindBy(xpath = "//tr/td[2]")
    public WebElement filteredExam;

    // Exam Schedule >>> View Button
    @FindBy(xpath = "//tr/td[4]/a")
    public WebElement examScheduleViewButton;

    // Exam Detail window >>> Exam Detail Label
    @FindBy(xpath = "//*[text()='Edit Leave']")
    public WebElement examDetailLabel;

    // Exam Schedule >>> Subject Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[1]")
    public WebElement subjectColumn;

    // Exam Schedule >>> Date From Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[2]")
    public WebElement dateFromColumn;

    // Exam Schedule >>> Start Time Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[3]")
    public WebElement startTimeColumn;

    // Exam Schedule >>> Duration Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[4]")
    public WebElement durationColumn;

    // Exam Schedule >>> Credit Hours Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[5]")
    public WebElement creditHoursColumn;

    // Exam Schedule >>> Room No Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[6]")
    public WebElement roomNoColumn;

    // Exam Schedule >>> Marks(min) Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[7]")
    public WebElement maxMarksColumn;

    // Exam Schedule >>> Marks(min) Column;
    @FindBy(xpath = "((//table/thead/tr[1])[2])/th[8]")
    public WebElement minMarksColumn;

  // Student Panel >>> Apply Leave Link
  @FindBy(xpath = "//*[text()='Apply Leave']")
  public WebElement applyLeaveLink;

  // Student Panel >>> Apply Leave page "Leave List" Label
  @FindBy(xpath = "(//*[@*='box-title'])[1]")
  public WebElement leaveListLabel;

  // Student Panel >>> Apply Leave page the "Leave Details" List
  @FindBy(xpath = "//thead/tr/th")
  public List<WebElement> leaveDetailsList;

  // Student Panel >>> Apply Leave page, "Edit" Icon
  @FindBy(xpath = "(//a[@class='btn btn-default btn-xs'])[1]")
  public WebElement applyLeaveEditIcon;

  // Student Panel >>> Apply Leave page, the "Edit Leave" Label
  @FindBy(xpath = "//*[text()='Edit Leave']")
  public WebElement editLeaveLabel;

  // Student Panel >>> Apply Leave page, in the Edit Leave Window the "From Date" Box
  @FindBy(xpath = "//*[@id='from_date']")
  public  WebElement editLeaveFromDateBox;

  // Student Panel >>> Apply Leave page, in the Edit Leave Window select From Date
  @FindBy(xpath = "//div[5]/div[1]/table/tbody/tr[1]/td[5]")
  public WebElement selectFromDate;

  // Student Panel >>> Apply Leave page, in the Edit Leave Window the "To Date" Box
  @FindBy(xpath = "//*[@id='to_date']")
  public WebElement editLeaveToDateBox;

  // Student Panel >>> Apply Leave page, in the Edit Leave Window select To Date
  @FindBy(xpath = "//div[5]/div[1]/table/tbody/tr[2]/td[3]")
  public WebElement selectToDate;

  // Student Panel >>> Apply Leave page, in the Edit Leave Window the "Reason" Box
  @FindBy(xpath = "//*[@*='message']")
  public WebElement editLeaveReasonBox;

  // Student Panel >>> Apply Leave page, in the Edit Leave Window the Save Button
  @FindBy(xpath = "(//*[@*='submit'])[1]")
  public WebElement editLeaveSaveButton;

  // Student Panel >>> on the Apply Leave page the last edited Reason
  @FindBy(xpath = "//table/tbody/tr[1]/td[6]")
  public WebElement editedReason;

  // Student Panel >>> Apply Leave page, "Delete" Icon
  @FindBy(xpath = "//*[@*='fa fa-remove']")
  public WebElement applyLeaveDeleteIcon;

  // Student Panel >>> Apply Leave page, Add Button
  @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/button")
  public WebElement applyLeaveAddButton;

  // Student Panel >>> Apply Leave page, Add Leave Window
  @FindBy(xpath = "//h4[@id='title']")
  public WebElement addLeaveLabel;

  // Student Panel >>> Apply Leave page, in the Add Leave Window the "From Date" Box
  @FindBy(xpath = "//*[@id='from_date']")
  public WebElement addLeaveFromDate;

  // Student Panel >>> Apply Leave page, in the Add Leave Window the "To Date" Box
  @FindBy(xpath = "//*[@id='to_date']")
  public WebElement addLeaveToDate;

  // Student Panel >>> Apply Leave page, in the Add Leave Window the "Reason" Box
  @FindBy(xpath = "//*[@*='message']")
  public WebElement addLeaveReasonBox;


    // Student Panel >>> MY Profile Link
    @FindBy(xpath = "//a[@href='https://qa.wonderworldcollege.com/user/user/profile']")
    public WebElement studentPanelMyProfileLink;

    // Student Panel >>> MY Profile >>> Student Name
    @FindBy(xpath = "//h3[@class='widget-user-username']")
    public WebElement studentPanelMyProfileStudentNameField;

    // Student Panel >>> MY Profile >>> Admission No
    @FindBy(xpath = "//h5[@class='widget-user-desc mb5']")
    public WebElement studentPanelMyProfileAdmissionNoField;

    // Student Panel >>> MY Profile >>> Class, Section, Gender, Barcode Field
    @FindBy(xpath = "//ul[@class='list-group list-group-unbordered']/li")
    public List<WebElement> studentPanelMyProfileClassSectionGenderBarcodeField;

    // Student Panel >>> MY Profile >>> Profile Button
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[1]")
    public WebElement studentPanelMyProfileProfileButton;

    // Student Panel >>> MY Profile >>> Exam Button
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[2]")
    public WebElement studentPanelMyProfileExamButton;

    // Student Panel >>> MY Profile >>> Documents Button
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[3]")
    public WebElement studentPanelMyProfileDocumentsButton;

    // Student Panel >>> MY Profile >>> Fees Button
    @FindBy(xpath = "//ul[@class='nav nav-tabs']/li[4]")
    public WebElement studentPanelMyProfileFeesButton;


    // StudentPage >> LoginUserName
    @FindBy(xpath = "//*[@id='email']")
    public WebElement studentLoginUserName;


    // StudentPage >> Attendance Link
    @FindBy(xpath = "//*[@id='sibe-box']/li[7]/a/span")
    public WebElement studentAttendance;

    // StudentPage >> Attendance Page >> DateTextBox
    @FindBy(xpath = "//*[@id='dob']")
    public WebElement studentAttendanceDateTextBox;

    @FindBy(xpath = "/html/body/div[4]/div[1]/table/tbody/tr[1]/td[2]")
    public WebElement studentAttendanceDateSelect;

    // StudentPage >> Attendance Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th[1]")
    public WebElement studentAttendanceSubject;

    // StudentPage >> Attendance Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th[2]")
    public WebElement studentAttendanceTimeFrom;

    // StudentPage >> Attendance Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th[3]")
    public WebElement studentAttendanceTimeTo;

    // StudentPage >> Attendance Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th[4]")
    public WebElement studentAttendanceRoomNo;

    // StudentPage >> Attendance Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th[5]")
    public WebElement studentAttendanceAttendance;

    // StudentPage >> Attendance Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[2]/table/thead/tr/th[6]")
    public WebElement studentAttendanceNote;


    @FindBy(xpath = "//*[@id=\"sibe-box\"]/li[6]/a/span")
    public WebElement studentOnlineExamButton;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement studentOnlineExamColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement studentOnlineExamQuizColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    public WebElement studentOnlineExamDateFromColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]")
    public WebElement studentOnlineExamDateToColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[5]")
    public WebElement studentOnlineExamDurationColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[6]")
    public WebElement studentOnlineExamTotalAttemptColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[7]")
    public WebElement studentOnlineExamAttemptedColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[8]")
    public WebElement studentOnlineExamStatusColumn;

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[9]")
    public WebElement studentOnlineExamActionColumn;


    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]/td[9]/a/i")
    public WebElement studentOnlineExamViewIcon;


    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/div[2]/ul/li[2]/a")
    public WebElement studentOnlineExamViewClosedExamButton;


    //

    // Student Page >>> Header >>> User Image
    @FindBy(xpath = "(//img[@alt='User Image'])[1]")
    public WebElement studentUserImage;

    // Student Page >>> Header >>> User Image >>> Change Password Button
    @FindBy(xpath = "//*[text()=' Change Password']")
    public WebElement studentUserChangePasswordButton;

    // Student Page >>> Change Password Page >>> Current Password Box
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement studentUserCurrentPasswordBox;

    // Student Page >>> Change Password Page >>> New Password Box
    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement studentUserNewPasswordBox;

    // Student Page >>> Change Password Page >>> Current Password Box
    @FindBy(xpath = "//input[@name='confirm_pass']")
    public WebElement studentUserConfirmPasswordBox;

    // Student Page >>> Change Password Page >>> Save Button
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement studentUserPasswordSaveButton;




    /*
    DEMO
     */

    @FindBy(xpath = "(//*[text()='Class Timetable'])[1]")
    public WebElement classTimeTableButton;

    // Student Login Page -> User Login Text
    @FindBy (xpath = "//h3[text()='User Login']")
    public WebElement studentLoginPageUserLoginText;

    // Student Login Page -> Username Textbox
    @FindBy (xpath = "//input[@name='username']")
    public WebElement studentLoginUsernameBox;

    // Student Login Page -> Password Textbox
    @FindBy (xpath = "//input[@name='password']")
    public WebElement studentLoginPasswordBox;

    // Student Login Page -> Student Dasboard
    @FindBy (xpath = "//span[text()=' Dashboard']")
    public WebElement studentLoginPageStudentDasboardText;

    // Student Dasboard -> Student Sidebar -> Homework Tab
    @FindBy (xpath = "//span[text()='Homework']")
    public WebElement studentSidebarHomeworkTab;

    // Student Dasboard -> Homework Page -> Upcoming Homework Text
    @FindBy (xpath = "//a[text()='Upcoming Homework']")
    public WebElement studentHomeworkPageUpcomingHomeworkText;

    // Student Dasboard -> Homework Page -> Upcoming Homework List
    @FindBy (xpath = "//tbody/tr")
    public List<WebElement> studentHomeworkPageUpcomingHomeworkList;

    // Student Dasboard -> Homework Page -> First Homework Details Button
    @FindBy (xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement studentHomeworkPageFirstHomeworkDetailsButton;

    // Student Dasboard -> Homework Page -> Homework Details Text
    @FindBy (xpath = "//h4[text()='Homework Details']")
    public WebElement homeworkDetailPageHomeworkDetailsText;

    // Student Dasboard -> Homework Details Page -> Message Box
    @FindBy (xpath = "//textarea[@name='message']")
    public WebElement homeworkDetailPageMessageBox;

    // Student Dasboard -> Homework Details Page -> Attach Document
    @FindBy (xpath = "//input[@name='file']")
    public WebElement homeworkDetailPageAttachDocument;

    // Student Dasboard -> Homework Details Page -> Save Button
    @FindBy (xpath = "//button[@id='submit']")
    public WebElement homeworkDetailPageSaveButton;

    // Student Dasboard -> Homework Page -> First Row
    @FindBy (xpath = "(//tbody/tr[@role='row'])[1]")
    public WebElement homeworkPageFirstrow;

    // Student Dasboard -> Homework Page -> Closed Homework Tab
    @FindBy (xpath = "//a[@href='#tab_2']")
    public WebElement homeworkPageClosedHomeworkTab;

    // Student Dasboard -> Homework Page -> View Edit Button
    @FindBy (xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement homeworkPageViewEditButton;

    // Student Dasboard -> Homework Page -> Submitted Text
    @FindBy (xpath = "//*[@id='DataTables_Table_1']/tbody/tr[1]/td[10]/label")
    public WebElement homeworkPageSubmittedText;

    // Student Dasboard -> Homework Page -> Daily Assigment Button
    @FindBy (xpath = "//a[@href='https://qa.wonderworldcollege.com/user/homework/dailyassignment']")
    public WebElement homeworkPageDailyAssigmentButton;

    // Student Dasboard -> Homework Page -> Daily Assigment Text
    @FindBy (xpath = "//h3[text()=' Daily Assignment List']")
    public WebElement dailyAssigmentPageDailyListText;

    // Student Dasboard -> Daily Assigment Page -> Add Daily Assigment Button
    @FindBy (xpath = "//*[text()=' Daily Assignment']")
    public WebElement dailyAssigmentPageAddDailyAssigmentButton;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> Subject Select Box
    @FindBy (xpath = "//select[@name='subject']")
    public WebElement addDailyAssigmentPageSubjectSelectBox;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> Title Box
    @FindBy (xpath = "//input[@name='title']")
    public WebElement addDailyAssigmentPageTitleBox;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> Description Box
    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement addDailyAssigmentPageDescriptionBox;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> Attach Document Box
    @FindBy (xpath = "//input[@name='file']")
    public WebElement addDailyAssigmentPageAttachDocumentBox;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> Save Button
    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement addDailyAssigmentPageSaveButton;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> New Assigment Displayed
    @FindBy (xpath = "//*[@id='DataTables_Table_0']/tbody/tr[1]/td[2]")
    public WebElement dailyAssigmentPageNewAssigmentDisplayed;

    // Student Dasboard -> Homework Page -> Add Daily Assigment Page -> Edit Button
    @FindBy (xpath = "(//i[@class='fa fa-pencil'])[1]")
    public WebElement dailyAssigmentPageEditButton;

    // Student Dasboard -> Homework Page -> Edit Daily Assigment Page -> Save Button
    @FindBy (xpath = "(//button[@type='submit'])[2]")
    public WebElement editDailyAssigmentPageSaveButton;

    // Student Dasboard -> Homework Page -> Daily Assigment Page -> Delete Button
    @FindBy (xpath = "(//i[@class='fa fa-remove'])[2]")
    public WebElement dailyAssigmentPageDeleteButton;


  // Student Panel >>> Apply Leave page, in the Add Leave Window the Save Button
  @FindBy(xpath = "(//*[@*='submit'])[1]")
  public WebElement addLeaveSaveButton;
}
