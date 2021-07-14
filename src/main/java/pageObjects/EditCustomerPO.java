package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.EditCustomerPageUI;

public class EditCustomerPO extends AbstractPage {
    WebDriver driver;

    public EditCustomerPO(WebDriver driver){
        this.driver = driver;
    }

    public void inputToCustomerIDTextBox(String customerId) {
        waitForElementVisible(driver, EditCustomerPageUI.CUSTOMER_ID_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.CUSTOMER_ID_TEXT_BOX, customerId);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, EditCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON);

    }

    public void inputToAddressTextArea(String address) {
        waitForElementVisible(driver, EditCustomerPageUI.ADDRESS_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.ADDRESS_TEXT_BOX, address);
    }

    public void inputToCityTextBox(String city) {
        waitForElementVisible(driver, EditCustomerPageUI.CITY_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.CITY_TEXT_BOX, city);
    }

    public void inputToStateTextBox(String state) {
        waitForElementVisible(driver, EditCustomerPageUI.STATE_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.STATE_TEXT_BOX, state);
    }

    public void inputToPinTextBox(String pin) {
        waitForElementVisible(driver, EditCustomerPageUI.PIN_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.PIN_TEXT_BOX, pin);

    }

    public boolean isUpdatedSuccessDisplayed() {
        waitForElementVisible(driver, EditCustomerPageUI.UPDATED_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, EditCustomerPageUI.UPDATED_SUCCESS_MESSAGE);
    }
    public String getCustomerNameText() {
        waitForElementVisible(driver, EditCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);

    }

    public String getGenderText() {
        waitForElementVisible(driver, EditCustomerPageUI.GENDER_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.GENDER_AT_TABLE_DETAILS);

    }

    public String getDateOfBirthText() {
        waitForElementVisible(driver, EditCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);

    }

    public String getAddressText() {
        waitForElementVisible(driver, EditCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);

    }

    public String getCityText() {
        waitForElementVisible(driver, EditCustomerPageUI.CITY_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.CITY_AT_TABLE_DETAILS);
    }

    public String getStateText() {
        waitForElementVisible(driver, EditCustomerPageUI.STATE_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.STATE_AT_TABLE_DETAILS);
    }

    public String getPinText() {
        waitForElementVisible(driver, EditCustomerPageUI.PIN_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.PIN_AT_TABLE_DETAILS);

    }

    public String getMobileNumberText() {
        waitForElementVisible(driver, EditCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
    }

    public String getEmailText() {
        waitForElementVisible(driver, EditCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
    }

    public void clickToSubmitButtonAtEditForm() {
        waitForElementVisible(driver, EditCustomerPageUI.SUBMIT_BUTTON_AT_EDIT_FROM);
        clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON_AT_EDIT_FROM);
    }
}
