package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.FundTransferPageUI;

public class FundTransferPO extends AbstractPage {
    WebDriver driver;

    public FundTransferPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToPayersAccountNoTextBox(String accountIdPayers) {
        waitForElementVisible(driver, FundTransferPageUI.PAYERS_ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.PAYERS_ACCOUNT_NO_TEXT_BOX, accountIdPayers);
    }

    public void inputToPayeesAccountNoTextBox(String accountIdPayees) {
        waitForElementVisible(driver, FundTransferPageUI.PAYEES_ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.PAYEES_ACCOUNT_NO_TEXT_BOX, accountIdPayees);
    }

    public void inputToAmountTextBox(int amount) {
        waitForElementVisible(driver, FundTransferPageUI.AMOUNT_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.AMOUNT_TEXT_BOX, String.valueOf(amount));
    }

    public void inputToDescriptionTextBox(String description) {
        waitForElementVisible(driver, FundTransferPageUI.DESCRIPTION_TEXT_BOX);
        sendKeyToElement(driver, FundTransferPageUI.DESCRIPTION_TEXT_BOX, description);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, FundTransferPageUI.SUBMIT_BUTTON);
        clickToElement(driver, FundTransferPageUI.SUBMIT_BUTTON);

    }

    public boolean isFundTransferDetailsDisplayed() {
        waitForElementVisible(driver, FundTransferPageUI.FUN_TRANSFER_MESSAGE);
        return isElementDisplayed(driver, FundTransferPageUI.FUN_TRANSFER_MESSAGE);

    }

    public int getAmountTextDetails() {
        waitForElementVisible(driver, FundTransferPageUI.AMOUNT_TEXT_AT_TABLE);
        return Integer.parseInt(getElementText(driver, FundTransferPageUI.AMOUNT_TEXT_AT_TABLE));

    }
}
