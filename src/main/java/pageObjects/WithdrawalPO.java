package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.DepositPageUI;
import pageUIs.WithdrawalPageUI;

public class WithdrawalPO extends AbstractPage {
    WebDriver driver;

    public WithdrawalPO(WebDriver driver){
        this.driver = driver;
    }


    public void inputToAccountIDTextBox(String accountId) {
        waitForElementVisible(driver, WithdrawalPageUI.ACCOUNT_ID_TEXT_BOX);
        sendKeyToElement(driver, WithdrawalPageUI.ACCOUNT_ID_TEXT_BOX, accountId);
    }

    public void inputToAmountTextBox(String amount) {
        waitForElementVisible(driver, WithdrawalPageUI.AMOUNT_TEXT_BOX);
        sendKeyToElement(driver, WithdrawalPageUI.AMOUNT_TEXT_BOX, amount);
    }

    public void inputToDescriptionTextBox(String description) {
        waitForElementVisible(driver, WithdrawalPageUI.DESCRIPTION_TEXT_BOX);
        sendKeyToElement(driver, WithdrawalPageUI.DESCRIPTION_TEXT_BOX, description);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, WithdrawalPageUI.SUBMIT_BUTTON);
        clickToElement(driver, WithdrawalPageUI.SUBMIT_BUTTON);

    }

    public boolean isWithdrawalDetailsMessageDisplayed(String accountId) {
        waitForElementVisible(driver, WithdrawalPageUI.WITHDRAWAL_DETAILS_MESSAGE, accountId);
        return isElementDisplayed(driver, WithdrawalPageUI.WITHDRAWAL_DETAILS_MESSAGE, accountId);

    }

    public String getCurrentBalanceTextAtTableDetails() {
        waitForElementVisible(driver, WithdrawalPageUI.CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, WithdrawalPageUI.CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS);
    }
}
