package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class ParentPage {

    public ParentPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Parent >> Login page
    @FindBy(xpath="//*[@id='email']")
    public WebElement parentLoginUsername;

    //Parent >> Profile image
    @FindBy(xpath="//*[@id='alert']/nav/div[2]/div/div/ul/li[5]/a/img")
    public WebElement parentProfileImage;

    //Parent >> Profile image >> Change Password
    @FindBy(xpath="//*[@id='alert']/nav/div[2]/div/div/ul/li[5]/ul/li/div/div[4]/a[1]")
    public WebElement parentProfileImageChangePassword;


    //Parent >> Profil Picture >> Change Username
    @FindBy(xpath="/html/body/div[1]/div[1]/section[2]/div/div/div/ul/li[2]/a")
    public WebElement parentChangeUsernameTab;

    //Parent >> Profil Picture >> Change Username Tab
    @FindBy(xpath="//*[@id='passwordform']/div[1]/div/input")
    public WebElement parentCurrentUsername;

    //Parent >> body
    @FindBy(xpath="/html/body")
    public WebElement parentBody;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passwordBox;
    /*
    @FindBy(xpath = "//*[@class=\"btn\"]")
    public WebElement signInButton;
    */
    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/user/profile\"]")
    public WebElement myProfileLink;
    @FindBy(xpath = "//*[@class=\"widget-user-username\"]")
    public WebElement studentsNameLabel;
    @FindBy(xpath = "(//*[@class=\"text-aqua\"])[1]")
    public WebElement admissionNoLabel;
    @FindBy(xpath = "(//*[@class=\"pull-right text-aqua\"])[1]")
    public WebElement classLabel;
    @FindBy(xpath = "(//*[@class=\"pull-right text-aqua\"])[2]")
    public WebElement sectionLabel;
    @FindBy(xpath = "(//*[@class=\"pull-right text-aqua\"])[3]")
    public WebElement genderLabel;
    @FindBy(xpath = "//*[@href=\"#activity\"]")
    public WebElement profileLabel;
    @FindBy(xpath = "//*[@href=\"#fee\"]")
    public WebElement feesLabel;
    @FindBy(xpath = "//*[@href=\"#exam\"]")
    public WebElement examLabel;
    @FindBy(xpath = "//*[@href=\"#documents\"]")
    public WebElement documentsLabel;
    @FindBy(xpath = "(//*[@class=\"col-md-5\"])[1]")
    public WebElement admissionDateLabel;
    @FindBy(xpath = "//*[@id=\"feetable\"]/thead/tr/th[1]")
    public WebElement feesGroupLabel;
    @FindBy(xpath = "//*[@class=\"pagetitleh\"]")
    public WebElement examTarihLabel;
    @FindBy(xpath = "(//*[@class=\"table-responsive\"])[2]")
    public WebElement noRecordFoundLabel;
    @FindBy(xpath = "//*[@href=\"https://qa.wonderworldcollege.com/user/user/getfees\"]")
    public WebElement parentPageFeesLink;
    @FindBy(xpath = "//*[@class=\"box-title\"]")
    public WebElement studentFeesLabel;
    @FindBy(xpath = "(//*[@class=\"bozero\"])[1]")
    public WebElement feesPageNameLabel;
    @FindBy(xpath = "//tbody/tr[2]/th[1]")
    public WebElement feesPageFatherNameLabel;
    @FindBy(xpath = "//tbody/tr[3]/th[1]")
    public WebElement feesPageMobileNumberLabel;
    @FindBy(xpath = "//tbody/tr[4]/th[1]")
    public WebElement feesPageCategoryLabel;
    @FindBy(xpath = "//tbody/tr[1]/th[2]")
    public WebElement feesPageClassLabel;
    @FindBy(xpath = "//tbody/tr[2]/th[2]")
    public WebElement feesPageAdmissionNoLabel;
    @FindBy(xpath = "//tbody/tr[3]/th[2]")
    public WebElement feesPageRollNumberLabel;
    @FindBy(xpath = "//thead/tr[1]/th[2]")
    public WebElement feesPageFeesGroupLabel;
    @FindBy(xpath = "//thead/tr[1]/th[3]")
    public WebElement feesPageFeesCodeLabel;
    @FindBy(xpath = "//thead/tr[1]/th[4]")
    public WebElement feesPageDueDateLabel;
    @FindBy(xpath = "//thead/tr[1]/th[5]")
    public WebElement feesPageStatusLabel;
    @FindBy(xpath = "//thead/tr[1]/th[6]")
    public WebElement feesPageAmountLabel;
    @FindBy(xpath = "//thead/tr[1]/th[7]")
    public WebElement feesPagePaymentLabel;
    @FindBy(xpath = "//thead/tr[1]/th[8]")
    public WebElement feesPageModeLabel;
    @FindBy(xpath = "//thead/tr[1]/th[9]")
    public WebElement feesPageDateLabel;
    @FindBy(xpath = "//thead/tr[1]/th[10]")
    public WebElement feesPageDiscountLabel;
    @FindBy(xpath = "//thead/tr[1]/th[11]")
    public WebElement feesPageFineLabel;
    @FindBy(xpath = "//thead/tr[1]/th[12]")
    public WebElement feesPagePaidLabel;
    @FindBy(xpath = "//thead/tr[1]/th[13]")
    public WebElement feesPageBalanceLabel;
    @FindBy(xpath = "//thead/tr[1]/th[14]")
    public WebElement feesPageActionLabel;
    @FindBy(xpath = "//*[@class=\"btn btn-sm btn-info printSelected\"]")
    public WebElement feesPagePrintSelectedButton;
    @FindBy(xpath = "//*[@id=\"load\"]")
    public WebElement feesPaySelectedButton;
    @FindBy(xpath = "//*[@class=\"btn btn-sm btn-info getBankPayments\"]")
    public WebElement feesPageOfflineBankPaymentButton;
    @FindBy(xpath = "//*[@role=\"row\"]")
    public WebElement offlineBankPaymentRow;

    //Parent Login page Username TextBox
    @FindBy(xpath = "//input[@id='email']")
    public WebElement usernameTextbox;

    // Parent page Password TextBox
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordTextbox;

    //Parent Login page Sign In Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInButton;

    //Parent Login page "Invalid Username Or Password" Text
    @FindBy(xpath = "//div[text()='Invalid Username Or Password']")
    public WebElement invalidText;

    //Parent Login page Forgot Password Link
    @FindBy(xpath = "//a[text()=' Forgot Password']")
    public WebElement forgotPasswordLink;

    // Homepage >>> Login Buton
    @FindBy(xpath = "//*[@*='complainbtn']")
    public WebElement homeLoginButon;

    // User Login >>> Parent Username Box
    @FindBy(xpath ="//*[@*='email']")
    public WebElement parentUsernameBox;

    // User Login >>> Parent Password Box
    @FindBy(xpath = "//*[@*='password']")
    public WebElement parentPasswordBox;

    // User Login >>> Parent Sign In Button
    @FindBy(xpath = "//*[@*='submit']")
    public WebElement parentSignInButton;

    // User Login >>> Parent User Login Label
    @FindBy(xpath ="//*[@*='font-white']")
    public WebElement parentUserLoginLabel;

    // User Login >>> "What's New In Wonder World College" Title
    @FindBy(xpath = "//h3[@class='h3']")
    public WebElement whatsNewLabel;

    // User Login >>> The sub-header-1 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[1]")
    public WebElement whatsNewSubHeader1;

    // User Login >>> The sub-header-2 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[2]")
    public WebElement whatsNewSubHeader2;

    // User Login >>> The sub-header-3 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[3]")
    public WebElement whatsNewSubHeader3;

    // User Login >>> The sub-header-4 under the "What's New In Wonder World College"
    @FindBy(xpath = "//h4[4]")
    public WebElement whatsNewSubHeader4;

    // User Login >>> Scroll Box
    @FindBy(xpath = "//*[@*='mCSB_1']")
    public WebElement parentLoginScrollBox;

    // User Login >>> Invalid Login Label
    @FindBy(xpath = "//*[text()='Invalid Username Or Password']")
    public WebElement parentInvalidLoginLabel;

    // User Login >>> Forgot Password Link
    @FindBy(xpath = "//*[@*='forgot']")
    public WebElement forgtPasswordLink;

    // Forgot Password Email Textbox
    @FindBy(xpath = "//input[@name='username']")
    public WebElement forgotPasswordEmailBox;

    // Forgot Password Submit Button
    @FindBy(xpath = "//*[@*='submit']")
    public WebElement forgotPasswordSubmitButton;

    // Forgot Password >>> Student Radio Button
    @FindBy(xpath = "//*[@*='student']")
    public WebElement forgotPasswordStudentRadioButton;

    // Forgot Password >>> Parent Radio Button
    @FindBy(xpath = "//*[@*='//*[@*='parent']']")
    public WebElement forgotPasswordParentRadioButton;

    // Forgot Password >> "Please Check Your Email To Recover Your Password" message
    @FindBy(xpath = "//*[@*='alert alert-danger']")
    public WebElement passwordSentLabel;

    // Forgot Password >>> User Login Link
    @FindBy(xpath = "//*[@*='forgot']")
    public WebElement userLoginLink;

    // User Login >>> Front Site Link
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    public WebElement frontSiteLink;


    @FindBy(xpath = "(//*[@data-toggle=\"dropdown\"])[5]")
    public WebElement parentPageFeesPayDropdown;

    @FindBy(xpath = "//*[@onclick=\"submitform('online_payment',this)\"]")
    public WebElement parentPageFeesPayDropdownOnlinePayment;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement parentPageOnlinePaymentPayWithOnePayButton;

    @FindBy(xpath = "(//*[@class=\"checkmark\"])[1]")
    public WebElement parentPageOnlinePaymentCreditCardCheckbox;

    @FindBy(xpath = "//*[@name=\"card_number\"]")
    public WebElement parentPageOnlinePaymentCardNumberTextBox;

    @FindBy(xpath = "//*[@name=\"exp_date\"]")
    public WebElement parentPageOnlinePaymentExpDataTextBox;

    @FindBy(xpath = "//*[@name=\"csc\"]")
    public WebElement parentPageOnlinePaymentCSCTextBox;

    @FindBy(xpath = "(//*[@type=\"submit\"])[1]")
    public WebElement parentPageOnlinePaymentPayNowButton;

    @FindBy(xpath = "//*[@class=\"alert alert-success alert-dismissible\"]")
    public WebElement parentPageOnlinePaymentSuccesAlert;

    @FindBy(xpath = "//*[@onclick=\"submitform('offline_payment',this)\"]")
    public WebElement parentPageFeesPayDropdownOfflinePayment;

    @FindBy(xpath = "//*[@id=\"payment_date\"]")
    public WebElement parentPageFeesPaymentDateTextbox;

    @FindBy(xpath = "//*[@id=\"bank_account_transferred\"]")
    public WebElement parentPageFeesPaymentFromTextbox;

    @FindBy(xpath = "//*[@id=\"amount\"]")
    public WebElement parentPageFeesAmountTextbox;

    @FindBy(xpath = "//*[@id=\"bank_from\"]")
    public WebElement parentPagePaymentModeTextbox;

    @FindBy(xpath = "(//*[@type=\"submit\"])[1]")
    public WebElement parentPageSaveButton;

    @FindBy(xpath = "//*[@class=\"alert alert-success text-left\"]")
    public WebElement parentPageOfflinePaymentThankYouAlert;









    @FindBy(xpath="//*[@id=\"passwordform\"]/div[1]/div/input")
    public WebElement parentChangePasswordCurrentPassTextbox;

    @FindBy(xpath="//*[@id=\"passwordform\"]/div[2]/div/input")
    public WebElement parentChangePasswordNewPassTextbox;

    @FindBy(xpath="//*[@id=\"confirm_pass\"]")
    public WebElement parentChangePasswordConfirmPassTextbox;

    @FindBy(xpath="//*[contains,(text,'invalid')]")
    public WebElement parentChangePasswordErrorLabel;

    @FindBy(xpath="//*[contains,(text,'success')]")
    public WebElement parentChangePasswordSuccessLabel;







    /*
    DEMO
     */


    @FindBy(xpath = "//div/div/div/div/form/div[1]/div/label")
    public WebElement choosingChild;

    @FindBy(xpath = "//div/div/div/div/form/div[2]/input")
    public WebElement selectAndProceedButton;

}
