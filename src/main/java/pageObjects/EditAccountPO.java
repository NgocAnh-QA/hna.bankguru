package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.EditAccountPageUI;

public class EditAccountPO extends AbstractPage {
    WebDriver driver;

    public EditAccountPO(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToAccountIDTextbox(String accountId) {
        waitForElementVisible(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_BOX);
        sendKeyToElement(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_BOX, accountId);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, EditAccountPageUI.SUBMIT_BUTTON);
        clickToElement(driver, EditAccountPageUI.SUBMIT_BUTTON);

    }

    public void selectTypeOfAccountDropdown(String typeOfAccount) {
        waitForElementVisible(driver, EditAccountPageUI.TYPE_OF_ACCOUNT_DROPDOWN);
        selectItemByVisible(driver, typeOfAccount, EditAccountPageUI.TYPE_OF_ACCOUNT_DROPDOWN);

    }

    public void clickToSubmitButtonAtEditForm() {
        waitForElementVisible(driver, EditAccountPageUI.SUBMIT_BUTTON_AT_EDIT_FORM);
        clickToElement(driver, EditAccountPageUI.SUBMIT_BUTTON_AT_EDIT_FORM);

    }

    public boolean isUpdatedSuccessDisplayed() {
        waitForElementVisible(driver, EditAccountPageUI.UPDATE_ACCOUNT_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, EditAccountPageUI.UPDATE_ACCOUNT_SUCCESS_MESSAGE);
    }

    public String getAccountIDAtTableDetails() {
        waitForElementVisible(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, EditAccountPageUI.ACCOUNT_ID_TEXT_AT_TABLE_DETAILS);

    }

    public String getTypeOfAccountAtTableDetails() {
        waitForElementVisible(driver, EditAccountPageUI.TYPE_OF_ACCOUNT_TEXT_AT_TABLE_DETAILS);
        return getElementText(driver, EditAccountPageUI.TYPE_OF_ACCOUNT_TEXT_AT_TABLE_DETAILS);

    }
}
