package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // HomePage >> WhatPeopleSaysText
    @FindBy(xpath="//*[text()='WHAT PEOPLE SAYS']")
    public WebElement whatPeapleSaysText;

    // HomePage >> WhatPeopleSays
    @FindBy(xpath="/html/body/div[6]/div/div/section[6]/div/div/div[2]/div[1]/div/div/div/div")
    public List<WebElement> whatPeapleSaysList;




    //HomePage >>> Header >>> Latest News Scrolling Text
    @FindBy(xpath = "//div[@class='newscontent']")
    public WebElement latestNewsInformation;

    //HomePage >>> Header >>> Site Logo
    @FindBy(xpath = "//*[@class=\"logo\"]/img")
    public WebElement siteLogo;

    //HomePage >>> Nav Bar >>> Home Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[1]/a")
    public WebElement homeButton;

    //HomePage >>> Nav Bar >>> Online Admission Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[2]/a")
    public WebElement onlineAdmissionButton;

    //HomePage >>> Nav Bar >>> Exam Result Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[3]/a")
    public WebElement examResultButton;

    //HomePage >>> Nav Bar >>> About Us Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[4]/a")
    public WebElement aboutUsButton;

    //HomePage >>> Nav Bar >>> Academics Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/a")
    public WebElement academicsButton;

    //HomePage >>> Nav Bar >>> Course Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[6]/a")
    public WebElement courseButton;

    //HomePage >>> Nav Bar >>> Gallery Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[7]/a")
    public WebElement galleryButton;

    //HomePage >>> Nav Bar >>> News Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[8]/a")
    public WebElement newsButton;

    //HomePage >>> Nav Bar >>> Contact Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[9]/a")
    public WebElement contactButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Facilities Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[1]/a")
    public WebElement academicsFacilitiesButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> School Uniform Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[2]/a")
    public WebElement academicsSchoolUniformButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Principal Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[3]/a")
    public WebElement academicsPrincipalMessageButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Know us Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[4]/a")
    public WebElement academicsKnowUsButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Approach Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[5]/a")
    public WebElement academicsApproachButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Teacher Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[6]/a")
    public WebElement academicsTeacherButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Houses And Mentoring Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[7]/a")
    public WebElement academicsHousesAndMentoringButton;

    //HomePage >>> Nav Bar >>> Academics Drop Down >>> Student Council Button
    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/ul/li[8]/a")
    public WebElement academicsStudentCouncilButton;

    //US_003-------------------------------------------------------------------------
    // Homepage -> Online Admission Menu Title
    @FindBy(xpath = "//*[text()='Online Admission']")
    public WebElement onlineAdmissionMenuTitle;

    // Online Admission Page ->  The School Admission Criteria
    @FindBy (xpath = "//*[text()='In order to enroll in our school, it is necessary to have completed the age of 6 and reside in Brooklyn.']")
    public WebElement schoolAdmissionCriteriaLabel;

    // Online Admission Page -> Class Dropdown
    @FindBy (xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Online Admission Page -> Class Required Field Icon (*)
    @FindBy (xpath = "(//small[text()=' *'])[8]")
    public WebElement classRequiredFieldIcon;

    // Online Admission Page -> First Name Text Box
    @FindBy(xpath = "//*[@id='firstname']")
    public WebElement firstNameTextBox;

    // Online Admission Page -> First Name Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[10]")
    public WebElement firstNameRequiredFieldIcon;

    // Online Admission Page -> Last Name Text Box
    @FindBy(id = "lastname")
    public WebElement lastNameTextBox;

    // Online Admission Page -> Gender Drop Down
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    // Online Admission Page -> Gender Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[11]")
    public WebElement genderRequiredFieldIcon;

    // Online Admission Page -> Date Of Birthday Date Box
    @FindBy(xpath = "//input[@id='dob']")
    public WebElement dateOfBirthDateBox;

    // Online Admission Page -> July 2023 Label
    @FindBy(xpath = "(//table/thead/tr/th[2])[1]")
    public WebElement july2023Label;

    // Online Admission Page -> Back Button <<
    @FindBy(xpath = "(//table/thead/tr/th[1])[4]")
    public WebElement backToButton;

    // Online Admission Page -> 2014 Year from Date Of Birth Web Table
    @FindBy(xpath = "(//table/tbody/tr/td/span[6])[2]")
    public WebElement dateOf2014YearWebTable;

    // Online Admission Page -> 2023 Year from Date Of Birth Web Table
    @FindBy(xpath = "(//table/thead/tr/th[2])[3]")
    public WebElement dateOf2023YearWebTable;

    // Online Admission Page -> June Month from Date Of Birth Web Table
    @FindBy(xpath = "(//table/tbody/tr/td/span[6])[1]")
    public WebElement dateOfMonthWebTable;

    // Online Admission Page -> 5. Day from Date Of Birth Web Table
    @FindBy(xpath = "//table/tbody/tr[2]/td[5]")
    public WebElement dateOfDayWebTable;

    // Online Admission Page -> Date Of Birthday Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[12]")
    public WebElement dateOfBirthRequiredFieldIcon;

    // Online Admission Page -> Mobile Number Text Box
    @FindBy(xpath = "//input[@id='mobileno']")
    public WebElement mobileNumberTextBox;

    // Online Admission Page -> Email Text Box
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailTextBox;

    // Online Admission Page -> Email Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[13]")
    public WebElement emailRequiredFieldIcon;

    // Online Admission Page -> Student Photo Upload Button
    @FindBy(xpath = "//input[@name='file']")
    public WebElement studentPhotoUploadButton;

    // Online Admission Page -> Father Name Text Box
    @FindBy(xpath = "//input[@id='father_name']")
    public WebElement fatherNameTextBox;

    // Online Admission Page -> Mother Name Text Box
    @FindBy(xpath = "//input[@id='mother_name']")
    public WebElement motherNameTextBox;

    // Online Admission Page -> Guardian Name Text Box
    @FindBy(xpath = "//input[@id='guardian_name']")
    public WebElement guardianNameTextBox;

    // Online Admission Page -> Guardian Name Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[15]")
    public WebElement guardianNameRequiredFieldIcon;

    // Online Admission Page -> If Guardian Is Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[14]")
    public WebElement ifGuardianIsRequiredFieldIcon;

    // Online Admission Page -> Guardian Relation Text Box
    @FindBy(xpath = "//input[@id='guardian_relation']")
    public WebElement guardianRelationTextBox;

    // Online Admission Page -> Guardian Relation Required Field Icon (*)
    @FindBy(xpath = "(//small[text()=' *'])[16]")
    public WebElement guardianRelationRequiredFieldIcon;

    // Online Admission Page -> Guardian Email Text Box
    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement guardianEmailTextBox;

    // Online Admission Page -> Guardian Photo Upload Button
    @FindBy(xpath = "//input[@name='guardian_pic']")
    public WebElement guardianPhotoUploadButton;

    // Online Admission Page -> Guardian Phone Text Box
    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    // Online Admission Page -> Guardian Occupation Text Box
    @FindBy(xpath = "//input[@id='guardian_occupation']")
    public WebElement guardianOccupationTextBox;

    // Online Admission Page -> Guardian Address Text Box
    @FindBy(xpath = "//*[@id='guardian_address']")
    public WebElement guardianAddressTextBox;

    // Online Admission Page -> If Guardian Is Father Radio Button
    @FindBy(xpath = "//input[@value='father']")
    public WebElement fatherRadioButton;

    // Online Admission Page -> If Guardian Is Mother Radio Button
    @FindBy(xpath = "//input[@value='mother']")
    public WebElement motherRadioButton;

    // Online Admission Page -> If Guardian Is Other Radio Button
    @FindBy(xpath = "//input[@value='other']")
    public WebElement otherRadioButton;

    // Online Admission Page -> National Identification Number Text Box
    @FindBy (xpath = "//input[@id='adhar_no']")
    public WebElement nationalIdentificationNumberTextBox;

    // Online Admission Page -> Previous School Details Text Box
    @FindBy(xpath = "//*[@name='previous_school']")
    public WebElement previousSchoolDetailsTextBox;

    // Online Admission Page -> Guardian Photo Upload Button
    @FindBy(xpath = "//input[@name='document']")
    public WebElement uploadDocumentsUploadButton;

    // Online Admission Page -> Submit Button
    @FindBy(xpath = "//*[@class='onlineformbtn mt10']")
    public WebElement submitButton;

    // Review Entered Details and Status Page -> Review Entered Details and Status Label
    @FindBy(xpath = "//*[text()='Review Entered Details and Status']")
    public WebElement reviewEnteredDetailsAndStatusLabel;

    // Review Entered Details and Status Page -> Reference No Label
    @FindBy(xpath = "(//ul[@class='reflist'])[1]/li[1]/span")
    public WebElement referenceNoLabel;

    // Review Entered Details and Status Page -> Not Submitted Label
    @FindBy(xpath = "//*[text()='Not Submitted']")
    public WebElement notSubmittedLabel;

    // Review Entered Details and Status Page -> Application Date Label
    @FindBy (xpath = "(//ul[@class='reflist'])[1]/li[3]/span")
    public WebElement applicationDateLabel;

    // Review Entered Details and Status Page -> I Agree To The Terms And Conditions checkBox
    @FindBy(xpath = "//*[@id='checkterm']")
    public WebElement iAgreeToTheTermsAndConditionscheckBox;

    // Review Entered Details and Status Page -> Actual Class Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[1]/div[1]/p")
    public WebElement actualClassLabel;

    // Review Entered Details and Status Page -> Actual First Name Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[2]/div[1]/p")
    public WebElement actualFirstNameLabel;

    // Review Entered Details and Status Page -> Actual Last Name Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[3]/div[1]/p")
    public WebElement actualLastNameLabel;

    // Review Entered Details and Status Page -> Actual Gender Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[4]/div[1]/p")
    public WebElement actualGenderLabel;

    // Review Entered Details and Status Page -> Actual Date Of Birth Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[5]/div[1]/p")
    public WebElement actualDateOfBirthLabel;


    // Review Entered Details and Status Page -> Actual Email Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[7]/div[1]/p")
    public WebElement actualEmailLabel;


    // Review Entered Details and Status Page -> Actual If Guardian Is Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[10]/div[1]/p")
    public WebElement actualIfGuardianIsLabel;

    // Review Entered Details and Status Page -> Actual Guardian Name Label
    @FindBy(xpath = "(//div[@class='col-md-3 col-lg-3 col-sm-3'])[11]/div[1]/p")
    public WebElement actualGuardianNameLabel;

    // Review Entered Details and Status Page -> Form Has Been Submitted Successfully..!! Label
    @FindBy(xpath = "//div[@class='col-md-12 spacet60 pt-0-mobile']/div[2]")
    public WebElement formHasBeenSubmittedSuccessfullyLabel;

    // Review Entered Details and Status Page -> Submitted Label
    @FindBy(xpath = "//div[@class='col-md-7 col-lg-7 col-sm-8']/ul/li[2]/span")
    public WebElement formStatus;

    // Review Entered Details and Status Page -> Student Image Box
    @FindBy(xpath = "//div[@class='col-md-5 col-lg-5 col-sm-4']/ul/li/img[1]")
    public WebElement imageStudent;

    // Review Entered Details and Status Page -> Guardian Image Box
    @FindBy(xpath = "//div[@class='col-md-5 col-lg-5 col-sm-4']/ul/li[2]")
    public WebElement imageGuardian;

    // Review Entered Details and Status Page -> Submit Button
    @FindBy(xpath = "//button[@id='submitbtn']")
    public WebElement secondSubmitButton;

    // Review Entered Details and Status Page -> Submitted Label
    @FindBy(xpath = "//span[text()='Submitted']")
    public WebElement submittedFormStatusLabel;

    //----------------------------------------------------------------

    //HomePage >>> Scroll Down >>> Achievements Section
    @FindBy(xpath = "//div[6]/div/div/section[4]")
    public WebElement achievementsSection;

    //HomePage >>> Scroll Down >>> Achievements Section >>> GRADUATES Number
    @FindBy(xpath = "//section[4]//div[2]//div[1]//h3")
    public WebElement achievementsGraduatesNumber;

    //HomePage >>> Scroll Down >>> Achievements Section >>> CERTIFIED TEACHERS Number
    @FindBy(xpath = "//section[4]//div[2]//div[2]//h3")
    public WebElement achievementsCertifiedTeachersNumber;

    //HomePage >>> Scroll Down >>> Achievements Section >>> STUDENT CAMPUSES Number
    @FindBy(xpath = "//section[4]//div[2]//div[3]//h3")
    public WebElement achievementsStudentCampusesNumber;

    //HomePage >>> Scroll Down >>> Achievements Section >>> STUDENTS Number
    @FindBy(xpath = "//section[4]//div[2]//div[4]//h3")
    public WebElement achievementsStudentsNumber;


    //HomePage >>> Nav Bar >>> Social Media Links >>> FACEBOOK
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[2]/a")
    public WebElement navBarFacebookIcon;

    //HomePage >>> Nav Bar >>> Social Media Links >>> TWITTER
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[3]/a")
    public WebElement navBarTwitterIcon;

    //HomePage >>> Nav Bar >>> Social Media Links >>> GOOGLE+
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[4]/a")
    public WebElement navBarGooglePlusIcon;

    //HomePage >>> Nav Bar >>> Social Media Links >>> YOUTUBE
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[5]/a")
    public WebElement navBarYoutubeIcon;

    //HomePage >>> Nav Bar >>> Social Media Links >>> LINKEDIN
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[6]/a")
    public WebElement navBarLinkedinIcon;

    //HomePage >>> Nav Bar >>> Social Media Links >>> INSTAGRAM
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[7]/a")
    public WebElement navBarInstagramIcon;

    //HomePage >>> Nav Bar >>> Social Media Links >>> PINTEREST
    @FindBy(xpath = "//*[@id=\"alert\"]//div[2]/ul/li[8]/a")
    public WebElement navBarPinterestIcon;

    //HomePage >>> Footer >>> Social Media Links >>> FACEBOOK
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[1]/a")
    public WebElement footerFacebookIcon;

    //HomePage >>> Footer >>> Social Media Links >>> TWITTER
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[2]/a")
    public WebElement footerTwitterIcon;

    //HomePage >>> Footer >>> Social Media Links >>> GOOGLE+
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[3]/a")
    public WebElement footerGooglePlusIcon;

    //HomePage >>> Footer >>> Social Media Links >>> YOUTUBE
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[4]/a")
    public WebElement footerYoutubeIcon;

    //HomePage >>> Footer >>> Social Media Links >>> LINKEDIN
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[5]/a")
    public WebElement footerLinkedinIcon;

    //HomePage >>> Footer >>> Social Media Links >>> INSTAGRAM
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[6]/a")
    public WebElement footerInstagramIcon;

    //HomePage >>> Footer >>> Social Media Links >>> PINTEREST
    @FindBy(xpath = "//footer/div[1]/div[1]/div[2]/ul/li[7]/a")
    public WebElement footerPinterestIcon;

    //Academics Page Locate
    @FindBy(xpath = "//a[@data-toggle='dropdown']")
    public WebElement academicsMenuLocate;
    //Teacher Page Link
    @FindBy(xpath = "//a[@href='https://qa.wonderworldcollege.com/page/teacher']")
    public WebElement teacherPageLink;
    //Teachers List
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3']")
    public WebElement teachersList;


    //HomePage >>> Scroll Down >>> Complain Icon
    @FindBy (xpath = "/html/body/footer/div[1]/div[1]/div[3]/div/a/i")
    public WebElement homepageComplainIcon  ;

    //HomePage >>> Scroll Down >>> Complain Link
    @FindBy (xpath = "/html/body/footer/div[1]/div[1]/div[3]/div/a")
    public WebElement  homepageComplainLink ;

    //HomePage >>> Scroll Down >>> Complain >>> Name Textbox
    @FindBy (xpath = " //input[@name='name']")
    public WebElement  complainNameBox ;
    //HomePage >>> Scroll Down >>> Complain >>> Email Textbox
    @FindBy (xpath = " //label[@name='email']")
    public WebElement  complainEmailBox ;

    //HomePage >>> Scroll Down >>> Complain >>> Contact No Textbox
    @FindBy (xpath = "//label[@name='contact_no']")
    public WebElement  complainContactnoBox ;

    //HomePage >>> Scroll Down >>> Complain >>> Description Textbox
    @FindBy (xpath = "//textarea[@name='description']")
    public WebElement  complainDescriptionBox ;

    //HomePage >>> Scroll Down >>> Complain >>> Submit Button
    @FindBy (xpath = "//*[@id=\"open\"]/div[5]/div/input")
    public WebElement complainSubmitButton  ;


    //HomePage >>> Scroll Down >>> Complain >>> Success Message
    @FindBy (xpath = "//div[@class=\"alert alert-success\"]")
    public WebElement complainSuccessLabel  ;


    // Course Page -> Course link in the header
    @FindBy(xpath = "(//a[text()='Course'])[1]")
    public WebElement courseHeaderLink;

    // Course Page >>> English and Literature Label
    @FindBy(xpath = "//*[text()='English and Literature']")
    public WebElement englishAndLiteratureLabel;

    // Course Page >>> Mathematics Label
    @FindBy(xpath = "//*[text()='Mathematics']")
    public WebElement mathematicsLabel;

    // Course Page >>> Sciences Label
    @FindBy(xpath = "//*[text()='Sciences']")
    public WebElement sciencesLabel;

    // Course Page >>> Social Sciences Label
    @FindBy(xpath = "//*[text()='Social Sciences']")
    public WebElement socialSciencesLabel;

    // Course Page >>> History Label
    @FindBy(xpath = "//*[text()='History']")
    public WebElement historyLabel;

    // Course Page >>> Mathematics Label
    @FindBy(xpath = "//*[text()='Mathematics']")
    public WebElement artsAndMusicLabel;

    // Course Page >>> Health and Exercise Sciences Label
    @FindBy(xpath = "//*[text()='Health and Exercise Sciences']")
    public WebElement healthAndExerciseLabel;

    // Course Page >>> Mathematics Label
    @FindBy(xpath = "//*[text()='Foreign Language']")
    public WebElement foreignLanguageLabel;

    // Course Page >>> Computer Science Label
    @FindBy(xpath = "//*[text()='Computer Science']")
    public WebElement computerScienceLabel;

    // Course Page >>> English and Literature Details Button
    @FindBy(xpath = "(//*[text()='details'])[1]")
    public WebElement englishDetailsButton;

    // Course Page >>> Mathematics Details Button
    @FindBy(xpath = "(//*[text()='details'])[2]")
    public WebElement mathematicsDetailsButton;

    // Course Page >>> Sciences Details Button
    @FindBy(xpath = "(//*[text()='details'])[3]")
    public WebElement sciencesDetailsButton;

    // Course Page >>> Social Sciences Details Button
    @FindBy(xpath = "(//*[text()='details'])[4]")
    public WebElement socialDetailsButton;

    // Course Page >>> History Details Button
    @FindBy(xpath = "(//*[text()='details'])[5]")
    public WebElement historyDetailsButton;

    // Course Page >>> Arts and Music Details Button
    @FindBy(xpath = "(//*[text()='details'])[6]")
    public WebElement artsMusicDetailsButton;

    // Course Page >>> Health and Exercise Sciences Details Button
    @FindBy(xpath = "(//*[text()='details'])[7]")
    public WebElement healthsDetailsButton;

    // Course Page >>> Foreign Language Details Button
    @FindBy(xpath = "(//*[text()='details'])[8]")
    public WebElement foreignDetailsButton;

    // Course Page >>> Computer Science Details Button
    @FindBy(xpath = "(//*[text()='details'])[9]")
    public WebElement computerDetailsButton;

    // Course Page >>> English and Literature Content Label
    @FindBy(xpath = "//h2[text()='English and Literature']")
    public WebElement englishContentLabel;

    // Course Page >>> Mathematics Content Label
    @FindBy(xpath = "//h2[text()='Mathematics']")
    public WebElement mathematicsContentLabel;

    // Course Page >>> Sciences Content Label
    @FindBy(xpath = "//h2[text()='Sciences']")
    public WebElement sciencesContentLabel;

    // Course Page >>> English and Literature Content Label
    @FindBy(xpath = "//h2[text()='Social Sciences']")
    public WebElement socialContentLabel;

    // Course Page >>> History Content Label
    @FindBy(xpath = "//h2[text()='History']")
    public WebElement historyContentLabel;

    // Course Page >>> Arts and Music Content Label
    @FindBy(xpath = "//h2[text()='Arts and Music']")
    public WebElement artsMusicContentLabel;

    // Course Page >>> Health and Exercise Sciences Content Label
    @FindBy(xpath = "//h2[text()='Health and Exercise Sciences']")
    public WebElement healthContentLabel;

    // Course Page >>> English and Literature Content Label
    @FindBy(xpath = "//h2[text()='Foreign Language']")
    public WebElement foreignContentLabel;

    // Course Page >>> English and Literature Content Label
    @FindBy(xpath = "//h2[text()='Computer Science']")
    public WebElement computerContentLabel;


    // Home Page >>> Body >>> First Slider
    @FindBy(xpath = "//div[@id='bootstrap-touch-slider']")
    public WebElement homePageBodyFirstSlider;

    // Home Page >>> Body >>> First Slider >>> First Image
    @FindBy(xpath = "//div[@id='bootstrap-touch-slider']/div/div[1]/img")
    public WebElement homePageBodyFirstSliderFirstImage;

    // Home Page >>> Body >>> First Slider >>> Second Image
    @FindBy(xpath = "//div[@id='bootstrap-touch-slider']/div/div[2]/img")
    public WebElement homePageBodyFirstSliderSecondImage;

    // Home Page >>> Body >>> First Slider >>> Third Image
    @FindBy(xpath = "//div[@id='bootstrap-touch-slider']/div/div[3]/img")
    public WebElement homePageBodyFirstSliderThirdImage;

    // Home Page >>> Body >>> First Slider >>> Fourth Image
    @FindBy(xpath = "//div[@id='bootstrap-touch-slider']/div/div[4]/img")
    public WebElement homePageBodyFirstSliderFourthImage;

    // Home Page >>> Body >>> First Slider >>> Fifth Image
    @FindBy(xpath = "//div[@id='bootstrap-touch-slider']/div/div[5]/img")
    public WebElement homePageBodyFirstSliderFifthImage;

    // Home Page >>> Body >>> First Slider >>> Left Button
    @FindBy(xpath = "//span[@class='fa fa-angle-left']")
    public WebElement homePageBodyFirstSliderLeftButton;

    // Home Page >>> Body >>> First Slider >>> Right Button
    @FindBy(xpath = "//span[@class='fa fa-angle-right']")
    public WebElement homePageBodyFirstSliderRightButton;

    // Home Page >>> Gallery Page >>> Art Music
    @FindBy(xpath = "//h3[text()='Art & Music']")
    public WebElement homePageGalleryArtMusicButton;

    // Home Page >>> Gallery Page >>> Campus
    @FindBy(xpath = "//h3[text()='Campus']")
    public WebElement homePageGalleryCampusButton;

    // Home Page >>> Gallery Page >>> Activities
    @FindBy(xpath = "//h3[text()='Activities']")
    public WebElement homePageGalleryActivitiesButton;

    // Home Page >>> Gallery Page >>> Pre Primary
    @FindBy(xpath = "//h3[text()='Pre Primary']")
    public WebElement homePageGalleryPrePrimaryButton;

    // Home Page >>> Gallery Page >>> Classrooms
    @FindBy(xpath = "//h3[text()='Classrooms']")
    public WebElement homePageGalleryClassroomsButton;

    // Home Page >>> Gallery Page >>> Sports
    @FindBy(xpath = "//h3[text()='Sports']")
    public WebElement homePageGallerySportsButton;


    //US_004---------------------------------------------------------------------------------------------------------

    // Homepage -> Exam Result Menu Title
    @FindBy(xpath = "(//*[text()='Exam Result'])[1]")
    public WebElement examResultMenuTitle;

    //ExamresultPage -> Exam Result Title
    @FindBy(xpath = "//*[@class='entered mt0']")
    public WebElement examResultTitle;

    //ExamresultPage -> Admission No Text Box
    @FindBy(xpath = "//input[@id='admission_no']")
    public WebElement admissionNoTextBox;

    //ExamresultPage -> Exam Drop Down
    @FindBy(xpath = "//select[@id='exam_id']")
    public WebElement examDropDown;

    //ExamresultPage -> Exam Tarih Drop Down
    @FindBy(xpath = "//option[text()='Tarih']")
    public WebElement examTarihDropDown;

    //ExamresultPage -> Search Button
    @FindBy(xpath = "//button[@id='search_btn']")
    public WebElement searchButton;

    // ExamresultPage -> Admission No Required Field Icon (*)
    @FindBy(xpath = "(//small[@class='req'])[8]")
    public WebElement admissionNoRequiredFieldIcon;

    // ExamresultPage -> Exam Required Field Icon (*)
    @FindBy(xpath = "(//small[@class='req'])[9]")
    public WebElement examRequiredFieldIcon;

    // ExamresultPage -> Average Passing Title
    @FindBy(xpath = "//*[@class='pagetitleh pt10']")
    public WebElement averagePassingTitle;

    // ExamresultPage -> Subject Label
    @FindBy(xpath = "//*[text()='Subject']")
    public WebElement subjectLabel;

    // ExamresultPage -> Max Marks Label
    @FindBy(xpath = "//*[text()='Max Marks']")
    public WebElement maxMarksLabel;

    // ExamresultPage -> Min Marks Label
    @FindBy(xpath = "//*[text()='Min Marks']")
    public WebElement minMarksLabel;

    // ExamresultPage -> Marks Obtained Label
    @FindBy(xpath = "//*[text()='Marks Obtained']")
    public WebElement marksObtainedLabel;

    // ExamresultPage -> Note Label
    @FindBy(xpath = "//*[text()='Note']")
    public WebElement noteLabel;

    // ExamresultPage -> Percentage Label
    @FindBy(xpath = "//*[text()='Percentage :  ']")
    public WebElement percentageLabel;

    // ExamresultPage -> Rank Label
    @FindBy(xpath = "//*[text()='Rank :  ']")
    public WebElement rankLabel;

    // ExamresultPage -> Result Pass Label
    @FindBy(xpath = "(//span[@style='margin-right: 5px;'])[1]")
    public WebElement resultPassLabel;

    // ExamresultPage -> Division Label
    @FindBy(xpath = "(//span[@style='margin-right: 5px;'])[2]")
    public WebElement divisionLabel;

    // ExamresultPage -> Grand Total Label
    @FindBy(xpath = "//*[text()='Grand Total : ']")
    public WebElement grandTotalLabel;

    // ExamresultPage -> Total Obtain Label
    @FindBy(xpath = "//*[text()='Total Obtain Marks :  ']")
    public WebElement totalObtainMarksLabel;

    // ExamresultPage -> Marks Obtained Value
    @FindBy(xpath = "//*[@id='headerTable']/tbody/tr[2]/td[4]")
    public WebElement marksObtainedValue;

    // ExamresultPage -> Min Marks Value
    @FindBy(xpath = "//*[@id='headerTable']/tbody/tr[2]/td[3]")
    public WebElement minMarksValue;

    // Home Page -> OUR EXPERIENCED STAFFS part
    @FindBy(xpath = "(//section[@class='spaceb40 spacet40'])[2]")
    public WebElement ourExperiencedStaffsPart;

    @FindBy(xpath = "(//*[text()='Anthony Carter'])[2]")
    public WebElement anthonyCarter;

    @FindBy(xpath = "(//*[text()='Ava Turner'])[2]")
    public WebElement avaTurner;

    @FindBy(xpath = "(//h3[text()='David Morgan'])[2]")
    public WebElement davidMorgan;

    @FindBy(xpath = "(//*[text()='Lily Peterson'])[2]")
    public WebElement lilyPeterson;




    /*
    FOR DEMO
     */

    @FindBy(xpath = "(//button[@type='submit'])[6]")
    public WebElement onlineAdmissionSubmitButton;

    // Homepage -> Home Tab
    @FindBy (xpath = "(//a[@href='https://qa.wonderworldcollege.com/page/home'])[1]")
    public WebElement homePageButton;

    // Homepage -> Contact Tab
    @FindBy (xpath = "(//a[@href='https://qa.wonderworldcollege.com/page/contact-us'])[1]")
    public WebElement homePageContactButton;

    // Contact Page -> Send In (text)
    @FindBy (xpath = "//h2[@class='col-md-12 col-sm-12']")
    public WebElement contactPageSendInLabel;

    // Contact Page -> Name TextBox
    @FindBy (xpath = "(//input[@id='name'])[2]")
    public WebElement contactPageNameTextBox;

    // Contact Page -> Email TextBox
    @FindBy (xpath = "(//input[@id='email'])[3]")
    public WebElement contactPageEmailTextBox;

    // Contact Page -> Subject TextBox
    @FindBy (xpath = "//input[@id='subject']")
    public WebElement contactPageSubjectTextBox;

    // Contact Page -> Description TextBox
    @FindBy (xpath = "//textarea[@id='description']")
    public WebElement contactPageDescriptionTextBox;

    // Contact Page -> Submit Button
    @FindBy (xpath = "//input[@name='submit']")
    public WebElement contactPageSubmitButton;

    // Contact Page -> Our Location
    @FindBy (xpath = "(//div[@class='contact-item'])[1]")
    public WebElement contactPageOurLocationBox;

    // Contact Page -> Call Us
    @FindBy (xpath = "(//div[@class='contact-item'])[2]")
    public WebElement contactPageCallUsBox;

    // Contact Page -> Working Hours
    @FindBy (xpath = "(//div[@class='contact-item'])[3]")
    public WebElement contactPageWorkingHoursBox;

    // Contact Page -> "Record Saved Successfully" text
    @FindBy (xpath = "//div[@class='alert alert-success']")
    public WebElement contactPageRecordText;

    // Home Page -> Navbar email adress
    @FindBy (xpath = "(//a[@href='mailto:info@wonderworldcollege.com'])[1]")
    public WebElement homePageNavbarEmailAdress;

    // Home Page -> Header Call Us Box
    @FindBy (xpath = "//div[@class='he-text']")
    public WebElement homePageHeaderCallUsBox;

    // Home Page -> Footer Contact Box
    @FindBy (xpath = "(//div[@class='cright'])[1]")
    public WebElement homePageFooterContactBox;

    // Home Page -> Footer Email Us Box
    @FindBy (xpath = "(//div[@class='cright'])[2]")
    public WebElement homePageFooterEmailUsBox;

    // Home Page -> Footer Adress Box
    @FindBy (xpath = "(//div[@class='cright'])[3]")
    public WebElement homePageFooterAdressBox;

    @FindBy(xpath = "//input[@id='guardian_phone']")
    public WebElement homePageGuardianPhone;

    @FindBy(xpath = "//input[@id='guardian_email']")
    public WebElement homePageGuardianEmail;

}
