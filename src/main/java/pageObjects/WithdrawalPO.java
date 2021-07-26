package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.DepositPageUI;
import pageUIs.WithdrawalPageUI;

public class WithdrawalPO extends AbstractPage {
    WebDriver driver;

    public WithdrawalPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Input to Account ID: {0}")
    public void inputToAccountIDTextBox(String accountId) {
        waitForElementVisible(driver, WithdrawalPageUI.ACCOUNT_ID_TEXT_BOX);
        sendKeyToElement(driver, WithdrawalPageUI.ACCOUNT_ID_TEXT_BOX, accountId);
    }

    @Step("Input to amount with value: {0}")
    public void inputToAmountTextBox(int amount) {
        waitForElementVisible(driver, WithdrawalPageUI.AMOUNT_TEXT_BOX);
        sendKeyToElement(driver, WithdrawalPageUI.AMOUNT_TEXT_BOX, String.valueOf(amount));
    }

    @Step("Input to description with value: {0}")
    public void inputToDescriptionTextBox(String description) {
        waitForElementVisible(driver, WithdrawalPageUI.DESCRIPTION_TEXT_BOX);
        sendKeyToElement(driver, WithdrawalPageUI.DESCRIPTION_TEXT_BOX, description);
    }

    @Step("Click to submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, WithdrawalPageUI.SUBMIT_BUTTON);
        clickToElement(driver, WithdrawalPageUI.SUBMIT_BUTTON);
    }

    @Step("Verify withdrawal details message is displayed")
    public boolean isWithdrawalDetailsMessageDisplayed(String accountId) {
        waitForElementVisible(driver, WithdrawalPageUI.WITHDRAWAL_DETAILS_MESSAGE, accountId);
        return isElementDisplayed(driver, WithdrawalPageUI.WITHDRAWAL_DETAILS_MESSAGE, accountId);
    }

    @Step("Get value of Current balance at table details")
    public int getCurrentBalanceTextAtTableDetails() {
        waitForElementVisible(driver, WithdrawalPageUI.CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS);
        return Integer.parseInt(getElementText(driver, WithdrawalPageUI.CURRENT_BALANCE_TEXT_AT_TABLE_DETAILS));
    }
}
