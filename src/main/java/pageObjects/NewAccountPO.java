package pageObjects;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.NewAccountPageUI;

import java.util.Set;

public class NewAccountPO extends AbstractPage {
    WebDriver driver;
    static String parentIDTab;
    public NewAccountPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Input to Customer ID: {0}")
    public void inputToCustomerIDTextBox(String customerId) {
        waitForElementVisible(driver, NewAccountPageUI.CUSTOMER_ID_TEXT_BOX);
        sendKeyToElement(driver, NewAccountPageUI.CUSTOMER_ID_TEXT_BOX, customerId);
    }

    @Step("Select account of type: {0}")
    public void selectAccountTypeDropdown(String accountType) {
        waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_TYPE_DROPDOWN);
        selectItemByVisible(driver, accountType, NewAccountPageUI.ACCOUNT_TYPE_DROPDOWN);
    }

    @Step("Input to initial deposit with value: {0}")
    public void inputToInitialDepositTextBox(int initialDeposit) {
        waitForElementVisible(driver, NewAccountPageUI.INITIAL_DEPOSIT_TEXT_BOX);
        sendKeyToElement(driver, NewAccountPageUI.INITIAL_DEPOSIT_TEXT_BOX, String.valueOf(initialDeposit));
    }

    @Step("Click to submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, NewAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, NewAccountPageUI.SUBMIT_BUTTON);
    }

    @Step("Verify Account generated success message is displayed")
    public boolean isAccountGeneratedSuccessMessageDisplayed() {
        waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_GENERATED_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, NewAccountPageUI.ACCOUNT_GENERATED_SUCCESS_MESSAGE);
    }

    @Step("Get value of current amount")
    public int getCurrentAmount() {
        waitForElementVisible(driver, NewAccountPageUI.CURRENT_AMOUNT_TEXT_AT_TABLE_DETAILS);
        return Integer.parseInt(getElementText(driver, NewAccountPageUI.CURRENT_AMOUNT_TEXT_AT_TABLE_DETAILS));
    }

    @Step("Get Account id")
    public String getAccountIDText() {
        waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, NewAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);
    }

    @Step("Switch to fund transfer tab")
    public FundTransferPO switchToFundTransferTab(WebDriver driver) {
        driver.close();
        parentIDTab = getWindowID(driver);
        switchWindowByID(driver, parentIDTab);
        return PageGeneratorManager.getFundTransferPage(driver);
    }
}
