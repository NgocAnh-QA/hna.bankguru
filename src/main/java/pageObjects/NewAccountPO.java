package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.NewAccountPageUI;

public class NewAccountPO extends AbstractPage {
    WebDriver driver;

    public NewAccountPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToCustomerIDTextBox(String customerId) {
        waitForElementVisible(driver, NewAccountPageUI.CUSTOMER_ID_TEXT_BOX);
        sendKeyToElement(driver, NewAccountPageUI.CUSTOMER_ID_TEXT_BOX, customerId);
    }

    public void selectAccountTypeDropdown(String accountType) {
        waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_TYPE_DROPDOWN);
        selectItemByVisible(driver, accountType, NewAccountPageUI.ACCOUNT_TYPE_DROPDOWN);
    }

    public void inputToInitialDepositTextBox(String initialDeposit) {
        waitForElementVisible(driver, NewAccountPageUI.INITIAL_DEPOSIT_TEXT_BOX);
        sendKeyToElement(driver, NewAccountPageUI.INITIAL_DEPOSIT_TEXT_BOX, initialDeposit);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, NewAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, NewAccountPageUI.SUBMIT_BUTTON);

    }

    public boolean isAccountGeneratedSuccessMessageDisplayed() {
        waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_GENERATED_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, NewAccountPageUI.ACCOUNT_GENERATED_SUCCESS_MESSAGE);
    }

    public String getCurrentAmount() {
        waitForElementVisible(driver, NewAccountPageUI.CURRENT_AMOUNT_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, NewAccountPageUI.CURRENT_AMOUNT_TEXT_AT_TABLE_DETAILS);

    }

    public String getAccountIDText() {
        waitForElementVisible(driver, NewAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, NewAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);

    }
}
