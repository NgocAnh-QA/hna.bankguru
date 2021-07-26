package commons;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageGeneratorManager {

    @Step("Open Login page")
    public static LoginPO getLoginPage(WebDriver driver) {
        return new LoginPO(driver);
    }

    @Step("Open Register page")
    public static RegisterPO getRegisterPage(WebDriver driver) {
        return new RegisterPO(driver);
    }

    @Step("Open Manager page")
    public static ManagerPO getManagerPage(WebDriver driver) {
        return new ManagerPO(driver);
    }

    @Step("Open New Customer page")
    public static NewCustomerPO getNewCustomerPage(WebDriver driver) {
        return new NewCustomerPO(driver);
    }

    @Step("Open Edit Customer page")
    public static EditCustomerPO getEditCustomerPage(WebDriver driver) {
        return new EditCustomerPO(driver);
    }

    @Step("Open Delete Customer page")
    public static DeleteCustomerPO getDeleteCustomerPage(WebDriver driver) {
        return new DeleteCustomerPO(driver);
    }

    @Step("Open New Account page")
    public static NewAccountPO getNewAccountPage(WebDriver driver) {
        return new NewAccountPO(driver);
    }

    @Step("Open Edit Account page")
    public static EditAccountPO getEditAccountPage(WebDriver driver) {
        return new EditAccountPO(driver);
    }

    @Step("Open Deposit page")
    public static DepositPO getDepositPage(WebDriver driver) {
        return new DepositPO(driver);
    }

    @Step("Open Withdrawal page")
    public static WithdrawalPO getWithdrawalPage(WebDriver driver) {
        return new WithdrawalPO(driver);
    }

    @Step("Open Fund Transfer page")
    public static FundTransferPO getFundTransferPage(WebDriver driver) {
        return new FundTransferPO(driver);
    }

    @Step("Open Balance Enquiry page")
    public static BalanceEnquiryPO getBalanceEnquiry(WebDriver driver) {
        return new BalanceEnquiryPO(driver);
    }

    @Step("Open Delete Account page")
    public static DeleteAccountPO getDeleteAccountPage(WebDriver driver) {
        return new DeleteAccountPO(driver);
    }
}
