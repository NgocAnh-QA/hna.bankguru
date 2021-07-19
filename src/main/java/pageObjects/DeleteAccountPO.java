package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.DeleteAccountPageUI;

public class DeleteAccountPO extends AbstractPage {
    WebDriver driver;

    public DeleteAccountPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToAccountNoTextBox(String accountId) {
        waitForElementVisible(driver, DeleteAccountPageUI.ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, DeleteAccountPageUI.ACCOUNT_NO_TEXT_BOX, accountId);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, DeleteAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, DeleteAccountPageUI.SUBMIT_BUTTON);

    }
}
