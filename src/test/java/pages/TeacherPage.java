package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class TeacherPage {

    public TeacherPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }








    //Teacher Login page Username TextBox
    @FindBy(xpath = "//input[@id='form-username']")
    public WebElement usernameTextbox;

    // Teacher page Password TextBox
    @FindBy(xpath = "//input[@id='form-password']")
    public WebElement passwordTextbox;

    //Teacher Login page Sign In Button
    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;


    // Login Page Teacher Login Button

    // Login Page Teacher Login Button   //span[text()='Communicate']

    @FindBy(xpath = "//*[text()='Teacher Login ']")
    public WebElement teacherLoginButton;

    // Teacher Page Communicate Menu Locate
    @FindBy(xpath = "//span[text()='Communicate']")
    public WebElement communicateMenu;

    // Teacher Page Send Mail Link
    @FindBy(xpath = "(//*[text()='Send Email'])[2]")
    public WebElement sendMailLink;

    // Teacher Page Email Template Dropdown
    @FindBy(xpath = "//select[@id='template_id']")
    public WebElement emailTemplateDrop;

    // Teacher Page Title Textbox
    @FindBy(xpath = "//input[@id='group_title']")
    public WebElement titleTextbox;

    // Teacher Page Message Textbox
    @FindBy(xpath = "//input[@id='search-query']")
    public WebElement messageTextbox;

    // Teacher Page Send Mail Group Select Teacher
    @FindBy(xpath = "(//div[@class='checkbox'])[3]")
    public WebElement selectTeacher;

    // Teacher Page Send Mail Individual
    @FindBy(xpath = "(//a[@data-toggle='tab'])[3]")
    public WebElement indivudual;

    // Teacher Page Send Mail Individual Select
    @FindBy(xpath = "//span[text()='Select']")
    public WebElement indivudualSelect;

    // Teacher Page Send Mail Message to select
    @FindBy(xpath = "(//button[@type='button'])[4]")
    public WebElement messagaTo;

    // Teacher Page Send Mail message to select students
    @FindBy(xpath = "//a[text()='Students']")
    public WebElement messageToSelect;


    // Teacher Page Send Mail Individual  Add Textbox
    @FindBy(xpath = "//input[@id='search-query']")
    public WebElement addTextbox;

    // Teacher Page Send Mail Individual  Add Textbox Select Student
    @FindBy(xpath = "//*[text()='Ahmet YİGİTSOY(07352)']")
    public WebElement selectStudentYigitsoy;

    // Teacher Page Send Mail Individual  Add Button
    @FindBy(xpath = "//button[text()='Add']")
    public WebElement addButton;

    // Teacher Page Send Mail Individual  Delete Icon
    @FindBy(xpath = "//i[@class='fa fa-trash pull-right text-danger']")
    public WebElement deleteIcon;

    // Teacher Page Send Mail Individual Class Window
    @FindBy(xpath = "(//a[text()='Class'])[3]")
    public WebElement selectClass;

    // Teacher Page Send Mail Class Message To Dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement messageToDropdwn;

    // Teacher Page Send Mail Class Message To Dropdown  (//li[@class='active'])[2]
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement messageClassToDropdwn;

    // Teacher Page Today's Birthday Window
    @FindBy(xpath = "(//li[@class='active'])[2]")
    public WebElement todaysBirthday;

    // Teacher Page Today's Birthday Ahmet
    @FindBy(xpath = "//*[text()='ahmet.yigitsoy (16029) ']")
    public WebElement todaysBirthdayAhmet;


    // Teacher Page Send Mail Send Now Schedule
    @FindBy(xpath = "//div[@class='pull-lg-right pull-sm-left']")
    public WebElement sendNowScheduleRadio;

    // Teacher Page Send Mail Schedule Radio Button
    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement scheduleRadio;


    // Teacher Page Send Mail Submit Button
    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement submitButton;

    // Teacher Page Send Mail Schedule Date Time
    @FindBy(xpath = "//input[@id='schedule_date_time']")
    public WebElement scheduleDateTime;




    // Teacher >> LoginUserName
    @FindBy(xpath = "//*[@id='form-username']")
    public WebElement teacherLoginUserName;


    @FindBy(xpath = "//*[@id='search_text1']")
    public WebElement teacherSearchBox;



    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[1]")
    public WebElement teacherStudentListAdmissionNo;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[2]")
    public WebElement teacherStudentListStudenName;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[3]")
    public WebElement teacherStudentListClass;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[4]")
    public WebElement teacherStudentListFatherName;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[5]")
    public WebElement teacherStudentListDateofBirth;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[6]")
    public WebElement teacherStudentListGender;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[7]")
    public WebElement teacherStudentListCategory;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[8]")
    public WebElement teacherStudentListMobileNumber;

    // Teacher >> Student List
    @FindBy(xpath = "//*[@id='DataTables_Table_0']/thead/tr/th[9]")
    public WebElement teacherStudentListAction;


    // Teacher >> Student List Pagination
    @FindBy(xpath = "//*[@id='DataTables_Table_0_next']/i")
    public WebElement teacherStudentListPegination;


    // Teacher >> Details View Tab
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/ul/li[2]/a")
    public WebElement teacherDetailsViewTab;

    // Teacher >> Details View Page
    @FindBy(xpath = "//*[@id='tab_2']/div[1]/div/div[2]/div")
    public List<WebElement> teacherDetailsViewList;


    // Teacher >> Details View Page
    @FindBy(xpath = "//*[@id='tab_2']/div[1]/div/div[3]/span/a/i")
    public WebElement teacherDetailsViewShowIcon;

    // Teacher >> Details View Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/ul/li[1]/a")
    public WebElement teacherDetailsViewShowIconClickProfile;


    // Teacher Page >>> Examinations
    @FindBy(xpath = "(//*[text()='Examinations'])[2]")
    public WebElement teacherExaminationsButton;

    // Teacher Page >>> Examinations >>> Exam Group
    @FindBy(xpath = "(//*[text()='Exam Group'])[2]")
    public WebElement teacherExamGroupButton;

    // Teacher Page >>> Examinations >>> Exam Group >>> Name
    @FindBy(xpath = "//input[@id='name']")
    public WebElement teacherExamGroupNameBox;

    // Teacher Page >>> Examinations >>> Exam Group >>> Exam Type
    @FindBy(xpath = "//select[@id='name']")
    public WebElement teacherExamGroupExamTypeDropDown;

    // Teacher Page >>> Examinations >>> Exam Group >>> Description
    @FindBy(xpath = "//textarea[@id='description']")
    public WebElement teacherExamGroupDescriptionBox;

    // Teacher Page >>> Examinations >>> Exam Group >>> Save Button
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement teacherExamGroupSaveButton;

    // Teacher Page >>> Examinations >>> Exam Group List Headers
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement examGroupListName;

    // Teacher Page >>> Examinations >>> Exam Group List Headers
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    public WebElement examGroupListNoOFExams;

    // Teacher Page >>> Examinations >>> Exam Group List Headers
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    public WebElement examGroupListExamType;

    // Teacher Page >>> Examinations >>> Exam Group List Headers
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]")
    public WebElement examGroupListAction;

    // Teacher Page >>> Examinations >>> Exam Group List of Names
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[1]/a")
    public List<WebElement> examGroupListNamesList;

    // Teacher Page >>> Examinations >>> Exam Group >>> Add Exam Page >>> Exam Name
    @FindBy(xpath = "//section//div[2]/div[1]/div[1]/p")
    public WebElement addExamPageExamName;

    // Teacher Page >>> Examinations >>> Exam Group >>> After Save Confirmation
    @FindBy(xpath = "//*[@id=\"form1\"]/div[1]/div[1]")
    public WebElement recordSavedSuccessfullyMessage;


    // Teacher Login Page >>> Teacher Username Box
    @FindBy(id = "form-username")
    public WebElement teacherUsernameBox;

    // Teacher Login Page >>> Teacher Password Box
    @FindBy(xpath = "//*[@*='password']")
    public WebElement teacherPasswordBox;

    // Teacher Login Page >>> Teacher Sign In Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement teacherSignInButton;

    // Teacher Panel >>> Attendance Menu
    @FindBy(xpath = "//span[text()='Attendance']")
    public WebElement attendanceButton;

    // Teacher Panel >>> Period Attendance Page Link
    @FindBy(xpath = "(//i[@class='fa fa-angle-double-right'])[7]")
    public  WebElement periodAttendanceLink;

    // Teacher Panel >>> Period Attendance page Class DropDown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement periodClassDropDown;

    // Teacher Panel >>> Period Attendance page Section DropDown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement periodSectionDropDown;

    // Teacher Panel >>> Period Attendance page Date DropDown
    @FindBy(xpath = "//input[@name='date']")
    public WebElement periodDateBox;

    // Teacher Panel >>> Period Attendance page Subject DropDown
    @FindBy(xpath = "//select[@id='subject_timetable_id']")
    public WebElement periodSubjectDropDown;

    // Teacher Panel >>> Period Attendance page Search Button
    @FindBy(xpath = "(//*[@name='search'])[3]")
    public WebElement searchButton;

    // Teacher Panel >>> Period Attendance page Student List Text
    @FindBy(xpath = "(//*[@class='box-title'])[2]")
    public WebElement studentListLabel;

    // Teacher Panel >>> Period Attendance page Table Headers List
    @FindBy(xpath = "//th[@class='sorting']")
    public List<WebElement> tableHeadersList;

    // Teacher Panel >>> Period Attendance page Present Radio Button
    @FindBy(xpath = "//table/tbody/tr[1]/td[5]/div[1]/input")
    public WebElement presentRadioButton;

    // Teacher Panel >>> Period Attendance page Late Radio Button
    @FindBy(xpath = "//table/tbody/tr[3]/td[5]/div[2]/input")
    public WebElement lateRadioButton;

    // Teacher Panel >>> Period Attendance page Absent Radio Button
    @FindBy(xpath = "//table/tbody/tr[1]/td[5]/div[3]/input")
    public WebElement absentRadioButton;

    // Teacher Panel >>> Period Attendance page Half Day Radio Button
    @FindBy(xpath = "//table/tbody/tr[8]/td[5]/div[4]/input")
    public WebElement halfDayRadioButton;

    // Teacher Panel >>> Period Attendance page Save Attendance Button
    @FindBy(xpath = "//button[@value='saveattendence']")
    public WebElement saveAttendanceButton;

    // Teacher Panel >>> Period Attendance page Record Saved Successfully Message
    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    public WebElement savedSuccesfullyLabel;

    ////////////////////////////////////////////////

    // Teacher Panel >>> Period Attendance page Present Radio Button Column
    @FindBy(id = "//tr/td/div[1]")
    public List<WebElement> presentRadioButtonColumn;

    // Teacher Panel >>> Period Attendance page Late Radio Button Column
    @FindBy(id = "//tr/td/div[2]")
    public List<WebElement> lateRadioButtonColumn;

    // Teacher Panel >>> Period Attendance page Absent Radio Button Column
    @FindBy(id = "//tr/td/div[3]")
    public List<WebElement> absentRadioButtonColumn;

    // Teacher Panel >>> Period Attendance page Half Day Radio Button Column
    @FindBy(id = "//tr/td/div[4]")
    public List<WebElement> halfDayRadioButtonColumn;

    // Teacher Panel >>> Period Attendance page Note Column
    @FindBy(xpath = "//tbody/tr/td[6]/input")
    public List<WebElement> periodNoteInputs;

    // Teacher Panel >>> Period Attendance page Mark As Holiday Button
    @FindBy(xpath = "(//*[@type='button'])[2]")
    public WebElement markAsHolidayButton;


    //US_33--------------------------------------------------------------------------------
    // Teacher Page >>> Examinations >>> Exam Result Button
    @FindBy(xpath = "(//*[text()='Exam Result'])[2]")
    public WebElement examResultButton;

    // Teacher Exam Result Page >>> Exam Grup Dropdown
    @FindBy(xpath = "//span[@id='select2-exam_group_id-container']")
    public WebElement examGrupDropDown;

    // Teacher Exam Result Page >>> Exam Group Text Box;
    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement examGroupTextBox;

    // Teacher Exam Result Page >>> Exam Dropdown
    @FindBy(xpath = "//span[@id='select2-exam_id-container']")
    public WebElement examDropDown;

    // Teacher Exam Result Page >>> Exam Text Box;
    @FindBy(xpath = "//*[@class='select2-search__field']")
    public WebElement examTextBox;

    // Teacher Exam Result Page >>> Session Dropdown
    @FindBy(xpath = "//select[@id='session_id']")
    public WebElement sessionDropDown;


    // Teacher Exam Result Page >>> Class Dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Teacher Exam Result Page >>> Section Dropdown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // Teacher Exam Result Page >>> Search Button
    @FindBy(xpath = "//button[@value='search_filter']")
    public WebElement searchExamButton;

    // Teacher Exam Result Page >>> Admission No
    @FindBy(xpath = "//*[text()='Admission No']")
    public WebElement admissionNoColumn;

    // Teacher Exam Result Page >>> Roll Number
    @FindBy(xpath = "//*[text()='Roll Number']")
    public WebElement rollNumberColumn;

    // Teacher Exam Result Page >>> Student Name
    @FindBy(xpath = "//*[text()='Student Name']")
    public WebElement studentNameColumn;

    // Teacher Exam Result Page >>> Grand Total
    @FindBy(xpath = "//*[text()='Grand Total']")
    public WebElement grandTotalColumn;

    // Teacher Exam Result Page >>> Pergent(%)
    @FindBy(xpath = "//*[text()='Percent (%)']")
    public WebElement pergentColumn;

    // Teacher Exam Result Page >>> Rank
    @FindBy(xpath = "//*[text()='Rank']")
    public WebElement rankColumn;

    // Teacher Exam Result Page >>> Result
    @FindBy(xpath = "//*[text()='Result']")
    public WebElement resultColumn;

    // Teacher Exam Result Page >>> Search Text Box
    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchTextBox;

    // Teacher Exam Result Page >>> Before Student Name
    @FindBy(xpath = "//*[text()='zeynep.akagunduz                                                                ']")
    public WebElement studentSearchName;

    // Student View Page -> Student Name Label
    @FindBy(xpath = "//h3[text()='zeynep.akagunduz']")
    public WebElement studentPageView;

    //US_39--------------------------------------------------------------------------------------
    // Teacher Page >>> Homework Button
    @FindBy(xpath = "//span[text()='Homework']")
    public WebElement homeworkButton;

    // Teacher Page >>> Add Homework Link
    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/homework'])[2]")
    public WebElement addHomeworkLink;


    // Teacher Page -> Homework -> Class Drapdown
    @FindBy(xpath = "//select[@id='searchclassid']")
    public WebElement selectClassDrapdown;

    // Teacher Page -> Homework -> Section Drapdown
    @FindBy(xpath = "//select[@id='secid']")
    public WebElement selectSectionDrapdown;

    // Teacher Page -> Homework -> Subject Group Drapdown
    @FindBy(xpath = "//select[@id='subject_group_id']")
    public WebElement selectSubjectGroup;

    // Teacher Page -> Homework -> Subject Drapdown
    @FindBy(xpath = "//select[@id='subid']")
    public WebElement selectSubjectDrapdown;

    // Teacher Page -> Homework -> Search Button
    @FindBy(xpath = "//button[@id='search_filter']")
    public WebElement homeworkSearchButton;

    // Teacher Page -> Homework -> Class Column
    @FindBy(xpath = "(//th[text()='Class'])[1]")
    public WebElement classTableName;

    // Teacher Page -> Homework -> Section Column
    @FindBy(xpath = "(//th[text()='Section'])[1]")
    public WebElement sectionTableName;

    // Teacher Page -> Homework -> Subject Group Column
    @FindBy(xpath = "(//th[text()='Subject Group'])[1]")
    public WebElement subjectGroupTableName;

    // Teacher Page -> Homework -> Subject Column
    @FindBy(xpath = "(//th[text()='Subject'])[1]")
    public WebElement subjectTableName;

    // Teacher Page -> Homework -> Homework Date Column
    @FindBy(xpath = "(//th[text()='Homework Date'])[1]")
    public WebElement homeworkDateTableName;

    // Teacher Page -> Homework -> Submission Date Column
    @FindBy(xpath = "(//th[text()='Submission Date'])[1]")
    public WebElement submissionDateTableName;

    // Teacher Page -> Homework -> Evaluation Date Column
    @FindBy(xpath = "(//th[text()='Evaluation Date'])[1]")
    public WebElement evaluationDateTableName;

    // Teacher Page -> Homework -> Created By Column
    @FindBy(xpath = "(//th[text()='Created By'])[1]")
    public WebElement createdByTableName;

    // Teacher Page -> Homework -> Action Column
    @FindBy(xpath = "(//th[text()='Action'])[1]")
    public WebElement actionTableName;

    // Teacher Page -> Homework -> Evaluation Icon
    @FindBy (xpath = "(//a[@class='btn btn-default btn-xs'])[1]")
    public WebElement evaluationIcon;

    // Teacher Page -> Homework -> Evaluation Homework Label
    @FindBy(xpath = "(//div[@class='modal-header modal-media-header'])[2]")
    public WebElement evaluateHomeworkLabel;

    //Teacher Page -> Homework -> Evaluation Homework Note Textbox
    @FindBy(xpath = "//*[@placeholder='Note']")
    public WebElement homeworkNoteTextBox;

    //Teacher Page -> Homework -> Evaluation Homework Save Button
    @FindBy(xpath = "(//*[text()='Save'])[2]")
    public WebElement homeworkSaveButton;

    //Teacher Page -> Homework -> Evaluation Homework Edit Icon
    @FindBy(xpath = "(//*[@class='fa fa-pencil'])[1]")
    public WebElement editIcon;

    //Teacher Page -> Homework -> Evaluation Homework Desciription Text Box
    @FindBy(xpath = "//body[@class='form-control wysihtml5-editor']")
    public WebElement descriptionTextBox;

    //Teacher Page -> Homework -> Evaluation Homework Description Text Box Save Button
    @FindBy(xpath = "(//button[@class='btn btn-info pull-right'])[1]")
    public WebElement saveButtonForEdit;

    //Teacher Page -> Homework -> Evaluation Homework Evaluation Check Box
    @FindBy(xpath ="//input[@type='checkBox']")
    public WebElement checkBoxStudent;

    //Teacher Page -> Homework -> Edit Homework Descriptions iframe
    @FindBy(xpath = "//iframe[@class='wysihtml5-sandbox']")
    public WebElement iframeElement;

    //Teacher Page -> Homework -> Homework List Title
    @FindBy(xpath = "//h3[text()=' Homework List']")
    public WebElement homeworkListTitle;

    //Teacher Page -> Homework -> Homework Delete Icon
    @FindBy(xpath = "(//a[@class='btn btn-default btn-xs'])[2]")
    public WebElement homeworkDeleteIcon;

    //Teacher Page -> Homework -> No Data Available In Table Label
    @FindBy(xpath = "(//*[text()='No data available in table '])[1]")
    public WebElement noDataAvailableInTable;

    //Teacher Page -> Homework -> No Data Available In Table Image
    @FindBy(xpath = "(//img[@src='https://smart-school.in/ssappresource/images/addnewitem.svg'])[1]")
    public WebElement noDataImg;

    //Teacher Page -> Homework -> Add Button
    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary modal_form']")
    public WebElement addButtonForHomework;


    //Teacher Page -> Homework -> Add Button -> Homework Date Label
    @FindBy(xpath = "(//div[@class='col-sm-4'])[4]/div/label")
    public WebElement homeworkDateText;

    //Teacher Page -> Homework -> Add Button -> Submission Date Dropdown
    @FindBy(xpath = "//label[text()='Submission Date']")
    public WebElement submissionDateBox;

    @FindBy(xpath = "//select[@id='modal_class_id']")
    public WebElement addHomeworkClassDropdown;

    @FindBy(xpath = "//select[@id='modal_section_id']")
    public WebElement addHomeworkSectionDropdown;

    @FindBy(xpath = "//select[@id='modal_subject_group_id']")
    public WebElement addHomeworkSubjectGroupDropdown;

    @FindBy(xpath = "//select[@id='modal_subject_id']")
    public WebElement addHomeworkSubjectDropdown;

    //Teacher Page -> Homework -> Add Button -> Max Marks TextBox
    @FindBy(xpath ="//*[text()='Max Marks']" )
    public WebElement maxMarksTextBox;

    //Teacher Page -> Homework -> Add Button -> Description TextBox
    @FindBy(xpath = "//*[@class='form-control wysihtml5-editor']" )
    public WebElement addHomeworkDescriptionTextBox;

    @FindBy(xpath = "//button[@id='submit']")
    public WebElement saveButtonForAddHomework;

    // Teacher Page -> Homework -> Upcoming Homework Button
    @FindBy(xpath = "//a[text()='Upcoming Homework']")
    public WebElement upcomingHomeworkButton;

    // Teacher Page -> Homework -> Closed Homework Button
    @FindBy(xpath = "//a[text()='Closed Homework']")
    public WebElement closedHomeworkButton;

    // Teacher Page -> Homework -> toaster message
    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    public WebElement homeworkToasterMessage;

    // Teacher Page -> Homework -> Select All Check Box
    @FindBy(xpath = "//input[@name='checkAll']")
    public WebElement selectAllBox;

    // Teacher Page -> Homework -> Delete Button
    @FindBy(xpath = "//button[@id='delete_btn_id']")
    public WebElement deleteButton;

    // Teacher Page -> Homework -> Search Button
    @FindBy(xpath = "//button[@id='search_filter']")
    public WebElement searchButtonForHomework;







    // Teacher >> Attendance Link
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[3]/a/span")
    public WebElement teacherAttendanceLink;

    // Teacher >> Attendance >> Period Attendance By Date Link
    @FindBy(xpath = "//*[@id='sibe-box']/ul[2]/li[3]/ul/li[3]/a")
    public WebElement teacherPeriodAttendanceByDateLink;

    // Teacher >> Attendance >> Period Attendance By Date >> ReportByDate
    @FindBy(xpath = "//*[@id='form1']/div/div")
    public WebElement teacherPeriodAttendanceByDateReportByDate;

    // Teacher >> Attendance >> Select Criteria Text
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div/h3")
    public WebElement teacherAttendanceSelectCriteria;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='class_id']")
    public WebElement getTeacherAttendanceSelectCriteriaClassDropDown;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='section_id']")
    public WebElement teacherAttendanceSelectCriteriaSectionBox;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='section_id']")
    public WebElement teacherAttendanceSelectCriteriaClass;


    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='class_id']/option[2]")
    public WebElement teacherAttendanceSelectCriteriaClassDropDown1;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='form1']/div/div/div[2]/div/label")
    public WebElement teacherAttendanceSelectCriteriaSection;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='form1']/div/div/div[3]/div/label")
    public WebElement teacherAttendanceSelectCriteriaDateText;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "//*[@id='form1']/div/div/div[4]/div/button/i")
    public WebElement teacherAttendanceSelectCriteriaSearch;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "/html/body/div[5]/div[1]/table/tbody/tr[1]/td[2]")
    public WebElement teacherAttendanceSelectCriteriaDateSelect;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/div/table/thead/tr/th[1]")
    public WebElement teacherAttendanceSelectCriteriaStudent;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/div/table/thead/tr/th[2]")
    public WebElement teacherAttendanceSelectCriteriaEnglish;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/div/table/thead/tr/th[3]")
    public WebElement teacherAttendanceSelectCriteriaMathematics;

    // Teacher >> Attendance SelectCriteria Page
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/div/table/thead/tr/th[4]")
    public WebElement teacherAttendanceSelectCriteriaScience;

    // Teacher >> Attendance SelectCriteria Page Table List
    @FindBy(xpath = "/html/body/div[1]/div[1]/section[2]/div/div/div/div[2]/div[3]/div/table")
    public List<WebElement> teacherAttendanceSelectCriteriaStudentList;

    // Teacher Login Page -> Admin Login Text
    @FindBy (xpath = "//h3[text()='Admin Login']")
    public WebElement teacherLoginPageAdminLoginText;

    // Teacher Dasboard Page -> Wonder World Logo
    @FindBy (xpath = "//span[@class='logo-lg']")
    public WebElement teacherDasboardWonderLogo;

    // Teacher Dasboard Page -> Teacher Sidebar -> Attendance Tab
    @FindBy (xpath = "//span[text()='Attendance']")
    public WebElement teacherDasboardAttendanceTab;

    // Teacher Dasboard Page -> Teacher Sidebar -> Attendance Tab -> Approve Leave Tab
    @FindBy (xpath = "(//*[text()='Approve Leave'])[2]")
    public WebElement teacherSidebarApproveLeaveTab;

    // Teacher Dasboard Page -> Approve Leave Page -> Class Select Box
    @FindBy (xpath = "//select[@name='class_id']")
    public WebElement approveLeavePageClassSelect;

    // Teacher Dasboard Page -> Approve Leave Page -> Section Select Box
    @FindBy (xpath = "//select[@name='section_id']")
    public WebElement approveLeavePageSectionSelect;

    // Teacher Dasboard Page -> Approve Leave Page -> Search Button
    @FindBy (xpath = "(//button[@name='search'])[3]")
    public WebElement approveLeavePageSearchButton;

    // Teacher Dasboard Page -> Approve Leave Page -> Approve Leave List
    @FindBy (xpath = "//tbody")
    public WebElement approveLeavePageApproveLeaveList;

    // Teacher Dasboard Page -> Approve Leave Page -> Add Button
    @FindBy (xpath = "//button[@onclick='add_leave()']")
    public WebElement approveLeavePageAddButton;

    // Teacher Dasboard Page -> Add Leave Page -> Class Select
    @FindBy (xpath = "//select[@name='class']")
    public WebElement addLeavePageClassSelect;

    // Teacher Dasboard Page -> Add Leave Page -> Section Select
    @FindBy (xpath = "//select[@name='section']")
    public WebElement addLeavePageSectionSelect;

    // Teacher Dasboard Page -> Add Leave Page -> // Student Select
    @FindBy (xpath = "//select[@name='student']")
    public WebElement addLeavePageStudentSelect;

    // Teacher Dasboard Page -> Add Leave Page -> Apply Date Input
    @FindBy (xpath = "//input[@name='apply_date']")
    public WebElement addLeavePageApplyDateInput;

    // Teacher Dasboard Page -> Add Leave Page -> From Date Input
    @FindBy (xpath = "//input[@name='from_date']")
    public WebElement addLeavePageFromDateInput;

    // Teacher Dasboard Page -> Add Leave Page -> To Date Input
    @FindBy (xpath = "//input[@name='to_date']")
    public WebElement addLeavePageToDateInput;

    // Teacher Dasboard Page -> Add Leave Page -> Section Text
    @FindBy (xpath = "(//label[text()='Section'])[2]")
    public WebElement addLeavePageSectionText;

    // Teacher Dasboard Page -> Add Leave Page -> Reason TextBox
    @FindBy (xpath = "//textarea[@name='message']")
    public WebElement addLeavePageReasonTextBox;

    // Teacher Dasboard Page -> Add Leave Page -> Pending Radio Button
    @FindBy (xpath = "(//input[@name='leave_status'])[1]")
    public WebElement addLeavePagePendingRadioButton;

    // Teacher Dasboard Page -> Add Leave Page -> Disapprove Radio Button
    @FindBy (xpath = "(//input[@name='leave_status'])[2]")
    public WebElement addLeavePageDisapproveRadioButton;

    // Teacher Dasboard Page -> Add Leave Page -> Approve Radio Button
    @FindBy (xpath = "(//input[@name='leave_status'])[3]")
    public WebElement addLeavePageApproveRadioButton;

    // Teacher Dasboard Page -> Add Leave Page -> Attach Document
    @FindBy (xpath = "//input[@name='userfile']")
    public WebElement addLeavePageAttachDocument;

    // Teacher Dasboard Page -> Add Leave Page -> Save Button
    @FindBy (xpath = "//button[@class='btn btn-info pull-right']")
    public WebElement addLeavePageSaveButton;

    // Teacher Dasboard Page -> Add Leave Page -> Approve Leave List
    @FindBy (xpath = "//tbody/tr")
    public List<WebElement> approveLeavePageApproveNewLeaveList;

    // Teacher Dasboard Page -> Approve Leave Page -> Save Button
    @FindBy (xpath = "//button[@class='btn btn-info pull-right']")
    public WebElement editLeavePageSaveButton;

    // Teacher Dasboard Page -> Approve Leave Page -> Delete Button
    @FindBy (xpath = "(//i[@class='fa fa-trash'])[1]")
    public WebElement approveLeavePageDeleteButton;


}
