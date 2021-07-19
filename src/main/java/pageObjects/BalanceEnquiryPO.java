package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.BalanceEnquiryPageUI;

public class BalanceEnquiryPO extends AbstractPage {
    WebDriver driver;

    public BalanceEnquiryPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToAccountNoTextBox(String accountId) {
        waitForElementVisible(driver, BalanceEnquiryPageUI.ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, BalanceEnquiryPageUI.ACCOUNT_NO_TEXT_BOX, accountId);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, BalanceEnquiryPageUI.SUBMIT_BUTTON);
        clickToElement(driver, BalanceEnquiryPageUI.SUBMIT_BUTTON);

    }

    public boolean isBalanceDetailsDisplayed(String accountID) {
        waitForElementVisible(driver, BalanceEnquiryPageUI.BALANCE_ENQUIRY_DETAILS, accountID);
        return isElementDisplayed(driver, BalanceEnquiryPageUI.BALANCE_ENQUIRY_DETAILS, accountID);
    }

    public int getBalanceTextAtTable() {
        waitForElementVisible(driver, BalanceEnquiryPageUI.AMOUNT_TEXT_AT_TABLE);
        return Integer.parseInt(getElementText(driver, BalanceEnquiryPageUI.AMOUNT_TEXT_AT_TABLE));

    }
}
