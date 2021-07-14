package bankguru;

import commons.AbstractTest;
import commons.Environment;
import commons.GlobalConstants;
import commons.PageGeneratorManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.*;
import testdata.CustomerInfoData;

import java.io.File;

public class Payment extends AbstractTest {
    int randomNumber = getRandomNumber();
    String postEmail = randomNumber + "@hotmail.com";
    WebDriver driver;
    Environment evn;
    private LoginPO loginPage;
    private ManagerPO managerPage;
    private NewCustomerPO newCustomerPage;
    private EditCustomerPO editCustomerPage;
    private DeleteCustomerPO deleteCustomerPage;
    private NewAccountPO newAccountPage;
    private EditAccountPO editAccountPage;
    private DepositPO depositPage;
    private WithdrawalPO withdrawalPage;
    private FundTransferPO fundTransferPage;
    CustomerInfoData customerData;
    static String CUSTOMER_ID;
    static String ACCOUNT_ID;
    String accountType_Saving, accountType_Current, initialDeposit, amount, description;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {
        String environment = System.getProperty("evn");
        ConfigFactory.setProperty("environment", environment);
        evn = ConfigFactory.create(Environment.class);
        driver = getBrowserDriver(browserName, evn.url());

        customerData = CustomerInfoData.getFiles(GlobalConstants.ROOT_FOLDER + File.separator + "src/test/java" + File.separator + "testdata" + File.separator + "CustomerInfoData.json");
        accountType_Saving = "Savings";
        accountType_Current = "Current";
        initialDeposit = "50000";
        amount = "5000";
        description = "Deposit";

        log.info("Payment - Pre condition: Step 01: Open Login page");
        loginPage = PageGeneratorManager.getLoginPage(driver);

        log.info("Payment - Pre condition: Step 02: Login to system");
        managerPage = loginPage.loginToSystem(RegisterToSystem.USERID, RegisterToSystem.PASSWORD);

    }

    @Test
    public void TC_01_Create_New_Customer() {
        log.info("Payment - Create new customer: Step 01: Open New Customer link");
        newCustomerPage = (NewCustomerPO) managerPage.openNavLinkByText(driver, "New Customer");

        log.info("Payment - Create new customer: Step 01: Input to Customer Name text box with value: " + customerData.getCustomerName_01());
        newCustomerPage.inputToCustomerNameTextBox(customerData.getCustomerName_01());

        log.info("Payment - Create new customer: Step 01: Click to Gender radio button with value: " + customerData.getGender_01());
        newCustomerPage.clickToGenderRadioButton(customerData.getGender_01());

        log.info("Payment - Create new customer: Step 01: Input to Date of birth text box with value: " + customerData.getDateOfBirth_01());
        newCustomerPage.inputToDateOfBirthTextBox(customerData.getDateOfBirth_01());

        log.info("Payment - Create new customer: Step 01: Input to Address text box with value: " + customerData.getAddress_01());
        newCustomerPage.inputToAddressTextBox(customerData.getAddress_01());

        log.info("Payment - Create new customer: Step 01: Input to City text box with value: " + customerData.getCity_01());
        newCustomerPage.inputToCityTextBox(customerData.getCity_01());

        log.info("Payment - Create new customer: Step 01: Input to State text box with value: " + customerData.getState_01());
        newCustomerPage.inputToStateTextBox(customerData.getState_01());

        log.info("Payment - Create new customer: Step 01: Input to PIN text box with value: " + customerData.getPin_01());
        newCustomerPage.inputToPINTextBox(customerData.getPin_01());

        log.info("Payment - Create new customer: Step 01: Input to Mobile Number text box with value: "+ customerData.getMobileNumber_01());
        newCustomerPage.inputToMobileNumberTextBox(customerData.getMobileNumber_01());

        log.info("Payment - Create new customer: Step 01: Input to Email text box with value: " + RegisterToSystem.EMAIL);
        newCustomerPage.inputToEmailTextBox(RegisterToSystem.EMAIL);

        log.info("Payment - Create new customer: Step 01: Input to Password text box with value: " + customerData.getPassword_01());
        newCustomerPage.inputToPasswordTextBox(customerData.getPassword_01());

        log.info("Payment - Create new customer: Step 01: Click to Submit button");
        newCustomerPage.clickToSubmitButton();

        log.info("Payment - Create new customer: Step 01: Verify success message displays");
        verifyTrue(newCustomerPage.isSuccessMessageDisplayed());

        log.info("Payment - Create new customer: Step 01: Get Customer ID");
        CUSTOMER_ID = newCustomerPage.getCustomerIDText();

        log.info("Payment - Create new customer: Step 01: Verify Customer Name displayed correctly");
        verifyEquals(newCustomerPage.getCustomerNameText(), customerData.getCustomerName_01());

        log.info("Payment - Create new customer: Step 01: Verify Gender Female  displayed correctly");
        verifyEquals(newCustomerPage.getGenderText(), customerData.getGender_01());

        log.info("Payment - Create new customer: Step 01: Verify Date of birth displayed correctly");
        verifyEquals(newCustomerPage.getDateOfBirthText(), customerData.getDateOfBirth_01());

        log.info("Payment - Create new customer: Step 01: Verify Address displayed correctly");
        verifyEquals(newCustomerPage.getAddressText(), customerData.getAddress_01());

        log.info("Payment - Create new customer: Step 01: Verify City displayed correctly");
        verifyEquals(newCustomerPage.getCityText(), customerData.getCity_01());

        log.info("Payment - Create new customer: Step 01: Verify State displayed correctly");
        verifyEquals(newCustomerPage.getStateText(), customerData.getState_01());

        log.info("Payment - Create new customer: Step 01: Verify PIN displayed correctly");
        verifyEquals(newCustomerPage.getPinText(), customerData.getPin_01());

        log.info("Payment - Create new customer: Step 01: Verify Mobile Number displayed correctly");
        verifyEquals(newCustomerPage.getMobileNumberText(), customerData.getMobileNumber_01());

        log.info("Payment - Create new customer: Step 01: Verify Email displayed correctly");
        verifyEquals(newCustomerPage.getEmailText(), RegisterToSystem.EMAIL);

        log.info("Payment - Create new customer: Step 01: Back to Manager page");
        managerPage = (ManagerPO) newCustomerPage.openNavLinkByText(driver, "Manager");

    }

    @Test
    public void TC_02_Edit_Customer() {
        log.info("Payment - Edit customer: Step 01: Open Edit Customer link");
        editCustomerPage = (EditCustomerPO) managerPage.openNavLinkByText(driver, "Edit Customer");

        log.info("Payment - Edit customer: Step 01: Input to Customer ID with value: " + CUSTOMER_ID);
        editCustomerPage.inputToCustomerIDTextBox(CUSTOMER_ID);

        log.info("Payment - Edit customer: Step 01: Click to Submit button");
        editCustomerPage.clickToSubmitButton();

        log.info("Payment - Edit customer: Step 01: Input to Address text area with value: " + customerData.getAddress_02());
        editCustomerPage.inputToAddressTextArea(customerData.getAddress_02());

        log.info("Payment - Edit customer: Step 01: Input to City text box with value: " + customerData.getCity_02());
        editCustomerPage.inputToCityTextBox(customerData.getCity_02());

        log.info("Payment - Edit customer: Step 01: Input to State text box with value: " + customerData.getState_02());
        editCustomerPage.inputToStateTextBox(customerData.getState_02());

        log.info("Payment - Edit customer: Step 01: Input to Pin text box with value: " + customerData.getPin_02());
        editCustomerPage.inputToPinTextBox(customerData.getPin_02());

        log.info("Payment - Edit customer: Step 01: Click to Submit button");
        editCustomerPage.clickToSubmitButtonAtEditForm();

        log.info("Payment - Edit customer: Step 01: Verify Update successfully displays");
        verifyTrue(editCustomerPage.isUpdatedSuccessDisplayed());

        log.info("Payment - Edit Customer: Step 02: Verify Customer Name displayed correctly");
        verifyEquals(editCustomerPage.getCustomerNameText(), customerData.getCustomerName_02());

        log.info("Payment - Edit Customer: Step 02: Verify Gender Female  displayed correctly");
        verifyEquals(editCustomerPage.getGenderText(), customerData.getGender_02());

        log.info("Payment - Edit Customer: Step 02: Verify Date of birth displayed correctly");
        verifyEquals(editCustomerPage.getDateOfBirthText(), customerData.getDateOfBirth_02());

        log.info("Payment - Edit Customer: Step 02: Verify Address displayed correctly");
        verifyEquals(editCustomerPage.getAddressText(), customerData.getAddress_02());

        log.info("Payment - Edit Customer: Step 02: Verify City displayed correctly");
        verifyEquals(editCustomerPage.getCityText(), customerData.getCity_02());

        log.info("Payment - Edit Customer: Step 02: Verify State displayed correctly");
        verifyEquals(editCustomerPage.getStateText(), customerData.getState_02());

        log.info("Payment - Edit Customer: Step 02: Verify PIN displayed correctly");
        verifyEquals(editCustomerPage.getPinText(), customerData.getPin_02());

        log.info("Payment - Edit Customer: Step 02: Verify Mobile Number displayed correctly");
        verifyEquals(editCustomerPage.getMobileNumberText(), customerData.getMobileNumber_02());

        log.info("Payment - Edit Customer: Step 01: Verify Email displayed correctly");
        verifyEquals(editCustomerPage.getEmailText(), RegisterToSystem.EMAIL);

        log.info("Payment - Edit Customer: Step 01: Back to Manager page");
        managerPage = (ManagerPO) editCustomerPage.openNavLinkByText(driver, "Manager");


    }

    @Test
    public void TC_03_Add_New_Account_And_Verify_Current_Amount_Equals_Initial_Deposit() {
        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Open New Account link");
        newAccountPage = (NewAccountPO) managerPage.openNavLinkByText(driver, "New Account");

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Input to Customer ID text box with value: " + CUSTOMER_ID);
        newAccountPage.inputToCustomerIDTextBox(CUSTOMER_ID);

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Select Account type dropdown with value: " + accountType_Saving);
        newAccountPage.selectAccountTypeDropdown(accountType_Saving);

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Input to Initial deposit text box with value: " + initialDeposit);
        newAccountPage.inputToInitialDepositTextBox(initialDeposit);

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Click to Submit button");
        newAccountPage.clickToSubmitButton();

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Verify Account Generated Successfully displays");
        verifyTrue(newAccountPage.isAccountGeneratedSuccessMessageDisplayed());

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Verify Current Amount");
        verifyEquals(newAccountPage.getCurrentAmount(), initialDeposit);

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Get Account ID");
        ACCOUNT_ID = newAccountPage.getAccountIDText();

        log.info("Payment - Add new account and verify current amount equals initial deposit: Step 01: Back to Manager page");
        managerPage = (ManagerPO) newAccountPage.openNavLinkByText(driver, "Manager");


    }

    @Test
    public void TC_04_Edit_Account_And_Check_Type_Of_Account() {
        log.info("Payment - Edit account and check type of account: Step 01: Open Edit Account link");
        editAccountPage = (EditAccountPO) managerPage.openNavLinkByText(driver, "Edit Account");

        log.info("Payment - Edit account and check type of account: Step 01: Input to Account No text box with value: " + ACCOUNT_ID);
        editAccountPage.inputToAccountIDTextbox(ACCOUNT_ID);

        log.info("Payment - Edit account and check type of account: Step 01: Click to submit button");
        editAccountPage.clickToSubmitButton();

        log.info("Payment - Edit account and check type of account: Step 01: Change Type of account to " + accountType_Current);
        editAccountPage.selectTypeOfAccountDropdown(accountType_Current);

        log.info("Payment - Edit account and check type of account: Step 01: Click to Submit button");
        editAccountPage.clickToSubmitButtonAtEditForm();

        log.info("Payment - Edit account and check type of account: Step 01: Verify Account updated successfully");
        verifyTrue(editAccountPage.isUpdatedSuccessDisplayed());

        log.info("Payment - Edit account and check type of account: Step 01: Verify Account ID displayed correctly");
        verifyEquals(editAccountPage.getAccountIDAtTableDetails(), ACCOUNT_ID);

        log.info("Payment - Edit account and check type of account: Step 01: Verify Type of Account is " + accountType_Current);
        verifyEquals(editAccountPage.getTypeOfAccountAtTableDetails(), accountType_Current);

        log.info("Payment - Edit account and check type of account: Back to Manager page");
        managerPage = (ManagerPO) editAccountPage.openNavLinkByText(driver, "Manager");
    }

    @Test
    public void TC_05_Transfer_Money_Into_A_Current_Account_And_Check_Account_Balance() {
        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Open Deposit");
        depositPage = (DepositPO) managerPage.openNavLinkByText(driver, "Deposit");

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Input to Account No text box with value: " + ACCOUNT_ID);
        depositPage.inputToAccountIDTextBox(ACCOUNT_ID);

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Input to Amount text box with value: " + amount);
        depositPage.inputToAmountTextBox(amount);

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Input to Description text box with value: " + description);
        depositPage.inputToDescriptionTextBox(description);

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Click to Submit button");
        depositPage.clickToSubmitButton();

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Verify Transaction details message displays");
        verifyTrue(depositPage.isTransactionDetailsMessageDisplayed(ACCOUNT_ID));

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Verify Current Balance text displayed with value: 55000");
        verifyEquals(depositPage.getCurrentBalanceTextAtTableDetails(), "55000");

        log.info("Payment - Transfer money into a current account and check account balance: Step 01: Back to Manager page");
        managerPage = (ManagerPO) depositPage.openNavLinkByText(driver, "Manager");
    }

    @Test
    public void TC_06_Withdrawal_Money_From_Current_Account_And_Check_Account_Balance() {
        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Open Withdrawal");
        withdrawalPage = (WithdrawalPO) managerPage.openNavLinkByText(driver, "Withdrawal");

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Input to Account No text box with value: " + ACCOUNT_ID);
        withdrawalPage.inputToAccountIDTextBox(ACCOUNT_ID);

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Input to Amount text box with value: 15000");
        withdrawalPage.inputToAmountTextBox("15000");

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Input to Description text box with value: Withdrawal");
        withdrawalPage.inputToDescriptionTextBox("Withdrawal");

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Click to Submit button");
        withdrawalPage.clickToSubmitButton();

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Verify Withdrawal details message displays");
        verifyTrue(withdrawalPage.isWithdrawalDetailsMessageDisplayed(ACCOUNT_ID));

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Verify Current Balance text displayed with value: 40000");
        verifyEquals(withdrawalPage.getCurrentBalanceTextAtTableDetails(), "40000");

        log.info("Payment - Withdrawal money from current account and check account balance: Step 01: Back to Manager page");
        managerPage = (ManagerPO) withdrawalPage.openNavLinkByText(driver, "Manager");
    }

    @Test
    public void TC_07_Transfer_Money_Into_Another_Account_And_Check_Account_Balance() {
        fundTransferPage = (FundTransferPO) managerPage.openNavLinkByText(driver, "Fund Transfer");

    }
    @AfterClass
    public void afterClass() {
    }

}
