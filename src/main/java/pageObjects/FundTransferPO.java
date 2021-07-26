package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.FundTransferPageUI;

public class FundTransferPO extends AbstractPage {
    WebDriver driver;

    public FundTransferPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Input to payers account no: {0}")
    public void inputToPayersAccountNoTextBox(String accountIdPayers) {
        waitForElementVisible(driver, FundTransferPageUI.PAYERS_ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.PAYERS_ACCOUNT_NO_TEXT_BOX, accountIdPayers);
    }

    @Step("Input to payees account no: {0}")
    public void inputToPayeesAccountNoTextBox(String accountIdPayees) {
        waitForElementVisible(driver, FundTransferPageUI.PAYEES_ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.PAYEES_ACCOUNT_NO_TEXT_BOX, accountIdPayees);
    }

    @Step("Input to amount text box with value: {0}")
    public void inputToAmountTextBox(int amount) {
        waitForElementVisible(driver, FundTransferPageUI.AMOUNT_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.AMOUNT_TEXT_BOX, String.valueOf(amount));
    }

    @Step("Input to description text box with value: {0}")
    public void inputToDescriptionTextBox(String description) {
        waitForElementVisible(driver, FundTransferPageUI.DESCRIPTION_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.DESCRIPTION_TEXT_BOX, description);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, FundTransferPageUI.SUBMIT_BUTTON);
        clickToElement(driver, FundTransferPageUI.SUBMIT_BUTTON);

    }

    @Step("Verify fund transfer details is displayed")
    public boolean isFundTransferDetailsDisplayed() {
        waitForElementVisible(driver, FundTransferPageUI.FUN_TRANSFER_MESSAGE);
        return isElementDisplayed(driver, FundTransferPageUI.FUN_TRANSFER_MESSAGE);

    }

    @Step("Get value of amount")
    public int getAmountTextDetails() {
        waitForElementVisible(driver, FundTransferPageUI.AMOUNT_TEXT_AT_TABLE);
        return Integer.parseInt(getElementText(driver, FundTransferPageUI.AMOUNT_TEXT_AT_TABLE));

    }
}
