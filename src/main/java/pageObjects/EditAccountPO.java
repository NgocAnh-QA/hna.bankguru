package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.EditAccountPageUI;

public class EditAccountPO extends AbstractPage {
    WebDriver driver;

    public EditAccountPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Input to Account ID: {0}")
    public void inputToAccountIDTextBox(String accountId) {
        waitForElementVisible(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_BOX);
        sendKeyToElement(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_BOX, accountId);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, EditAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, EditAccountPageUI.SUBMIT_BUTTON);
    }

    @Step("Select type of account: {0}")
    public void selectTypeOfAccountDropdown(String typeOfAccount) {
        waitForElementVisible(driver, EditAccountPageUI.TYPE_OF_ACCOUNT_DROPDOWN);
        selectItemByVisible(driver, typeOfAccount, EditAccountPageUI.TYPE_OF_ACCOUNT_DROPDOWN);
    }

    @Step("Click to Submit button at edit form")
    public void clickToSubmitButtonAtEditForm() {
        waitForElementVisible(driver, EditAccountPageUI.SUBMIT_BUTTON_AT_EDIT_FORM);
        clickToElement(driver, EditAccountPageUI.SUBMIT_BUTTON_AT_EDIT_FORM);
    }

    @Step("Verify Updated success message is displayed")
    public boolean isUpdatedSuccessDisplayed() {
        waitForElementVisible(driver, EditAccountPageUI.UPDATE_ACCOUNT_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, EditAccountPageUI.UPDATE_ACCOUNT_SUCCESS_MESSAGE);
    }

    @Step("Get value of Account ID at table details")
    public String getAccountIDAtTableDetails() {
        waitForElementVisible(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);
    }

    @Step("Get value of Type of account at table details")
    public String getTypeOfAccountAtTableDetails() {
        waitForElementVisible(driver, EditAccountPageUI.TYPE_OF_ACCOUNT_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, EditAccountPageUI.TYPE_OF_ACCOUNT_TEXT_AT_TABLE_DETAILS);
    }
}
