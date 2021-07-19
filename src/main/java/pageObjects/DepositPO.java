package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.DepositPageUI;

public class DepositPO extends AbstractPage {
    WebDriver driver;

    public DepositPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToAccountIDTextBox(String accountId) {
        waitForElementVisible(driver, DepositPageUI.ACCOUNT_ID_TEXT_BOX);
        sendKeyToElement(driver, DepositPageUI.ACCOUNT_ID_TEXT_BOX, accountId);
    }

    public void inputToAmountTextBox(int amount) {
        waitForElementVisible(driver, DepositPageUI.AMOUNT_TEXT_BOX);
        sendKeyToElement(driver, DepositPageUI.AMOUNT_TEXT_BOX, String.valueOf(amount));
    }

    public void inputToDescriptionTextBox(String description) {
        waitForElementVisible(driver, DepositPageUI.DESCRIPTION_TEXT_BOX);
        sendKeyToElement(driver, DepositPageUI.DESCRIPTION_TEXT_BOX, description);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, DepositPageUI.SUBMIT_BUTTON);
        clickToElement(driver, DepositPageUI.SUBMIT_BUTTON);

    }

    public boolean isTransactionDetailsMessageDisplayed(String accountId) {
        waitForElementVisible(driver, DepositPageUI.TRANSFER_DETAILS_MESSAGE, accountId);
        return isElementDisplayed(driver, DepositPageUI.TRANSFER_DETAILS_MESSAGE, accountId);

    }

    public int getCurrentBalanceTextAtTableDetails() {
        waitForElementVisible(driver, DepositPageUI.CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS);
        return Integer.parseInt(getElementText(driver, DepositPageUI.CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS));
    }
}
