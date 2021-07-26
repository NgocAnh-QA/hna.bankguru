package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.DeleteAccountPageUI;

public class DeleteAccountPO extends AbstractPage {
    WebDriver driver;

    public DeleteAccountPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Input to Account no: {0}")
    public void inputToAccountNoTextBox(String accountId) {
        waitForElementVisible(driver, DeleteAccountPageUI.ACCOUNT_NO_TEXT_BOX);
        sendKeyToElement(driver, DeleteAccountPageUI.ACCOUNT_NO_TEXT_BOX, accountId);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, DeleteAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, DeleteAccountPageUI.SUBMIT_BUTTON);

    }
}
