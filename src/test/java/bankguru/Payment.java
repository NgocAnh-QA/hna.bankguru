package bankguru;

import commons.AbstractTest;
import commons.Environment;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.HomePO;
import pageObjects.LoginPO;
import pageObjects.NewCustomerPO;
import testdata.CustomerInfoData;

import java.io.File;

public class Payment extends AbstractTest {
    int randomNumber = getRandomNumber();
    String postEmail = randomNumber + "@hotmail.com";
    WebDriver driver;
    Environment evn;
    private LoginPO loginPage;
    private HomePO homePage;
    private NewCustomerPO newCustomerPage;
    CustomerInfoData customerData;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        String environment = System.getProperty("evn");
        ConfigFactory.setProperty("environment", environment);
        evn = ConfigFactory.create(Environment.class);
        driver = getBrowserDriver(browserName, evn.url());

        customerData = CustomerInfoData.getFiles(GlobalConstants.ROOT_FOLDER + File.separator + "src/test/java" + File.separator + "testdata" + File.separator + "CustomerInfoData.json");


        log.info("Payment - Pre condition: Step 01: Open Login page");
        loginPage = PageGeneratorManager.getLoginPage(driver);

        log.info("Payment - Pre condition: Step 02: Login to system");
        homePage = loginPage.loginToSystem(RegisterToSystem.EMAIL, RegisterToSystem.PASSWORD);

    }

    @Test
    public void TC_01_Create_New_Customer() {
        log.info("Payment - Create new customer: Step 01: Open New Customer link");
        newCustomerPage = (NewCustomerPO) homePage.openNavLinkByText(driver, "New Customer");

        log.info("Payment - Create new customer: Step 01: Input to Customer Name text box with value: " + customerData.getCustomerName_01());
        newCustomerPage.inputToCustomerNameTextBox(customerData.getCustomerName_01());

        log.info("Payment - Create new customer: Step 01: Click to Gender radio button with value: " + customerData.getGender_01());
        newCustomerPage.clickToGenderRadioButton(customerData.getGender_01());

        log.info("Payment - Create new customer: Step 01: Input to Date of birth text box with value: " + customerData.getDateOfBirth_01());
        newCustomerPage.inputToDateOfBirthTextBox(customerData.getDateOfBirth_01());

        log.info("Payment - Create new customer: Step 01: Input to Address text box with value: ");
        newCustomerPage.inputToAddressTextBox("");

        log.info("Payment - Create new customer: Step 01: Input to City text box with value: ");
        newCustomerPage.inputToCityTextBox("");

        log.info("Payment - Create new customer: Step 01: Input to State text box with value: ");
        newCustomerPage.inputToStateTextBox("");

        log.info("Payment - Create new customer: Step 01: Input to PIN text box with value: ");
        newCustomerPage.inputToPINTextBox("");

        log.info("Payment - Create new customer: Step 01: Input to Mobile Number text box with value: ");
        newCustomerPage.inputToMobileNumberTextBox("");

        log.info("Payment - Create new customer: Step 01: Input to Email text box with value: ");
        newCustomerPage.inputToEmailTextBox("");

        log.info("Payment - Create new customer: Step 01: Input to Password text box with value: ");
        newCustomerPage.inputToPasswordTextBox("");

        log.info("Payment - Create new customer: Step 01: Click to Submit button");
        newCustomerPage.clickToSubmitButton();

        log.info("Payment - Create new customer: Step 01: Verify success message displays");
        verifyTrue(newCustomerPage.isSuccessMessageDisplayed());

        log.info("Payment - Create new customer: Step 01: Verify Customer Name displayed correctly");
        verifyEquals(newCustomerPage.getCustomerNameText(), "");

        log.info("Payment - Create new customer: Step 01: Verify Gender Female  displayed correctly");
        verifyEquals(newCustomerPage.getGenderText(), "");

        log.info("Payment - Create new customer: Step 01: Verify Date of birth displayed correctly");
        verifyEquals(newCustomerPage.getDateOfBirthText(), "");

        log.info("Payment - Create new customer: Step 01: Verify Address displayed correctly");
        verifyEquals(newCustomerPage.getAddressText(), "");

        log.info("Payment - Create new customer: Step 01: Verify City displayed correctly");
        verifyEquals(newCustomerPage.getCityText(), "");

        log.info("Payment - Create new customer: Step 01: Verify State displayed correctly");
        verifyEquals(newCustomerPage.getStateText(), "");

        log.info("Payment - Create new customer: Step 01: Verify PIN displayed correctly");
        verifyEquals(newCustomerPage.getPinText(), "");

        log.info("Payment - Create new customer: Step 01: Verify Mobile Number displayed correctly");
        verifyEquals(newCustomerPage.getMobileNumberText(), "");

        log.info("Payment - Create new customer: Step 01: Verify Email displayed correctly");
        verifyEquals(newCustomerPage.getEmailText(), "");



    }

    @Test
    public void TC_02_Edit_Customer() {
        System.out.println("TC_02_Edit_Customer");

    }

    @Test
    public void TC_03_Add_New_Account_And_Verify_Current_Amount_Equals_Initial_Deposit() {
        System.out.println("TC_03_Add_New_Account_And_Verify_Current_Amount_Equals_Initial_Deposit");

    }

    @Test
    public void TC_04_Edit_Account_And_Check_Type_Of_Account() {
        System.out.println("TC_04_Edit_Account_And_Check_Type_Of_Account");

    }

    @AfterClass
    public void afterClass() {
    }

}
