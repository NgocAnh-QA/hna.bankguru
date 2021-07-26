package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.EditCustomerPageUI;

public class EditCustomerPO extends AbstractPage {
    WebDriver driver;

    public EditCustomerPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Input to Customer ID: {0}")
    public void inputToCustomerIDTextBox(String customerId) {
        waitForElementVisible(driver, EditCustomerPageUI.CUSTOMER_ID_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.CUSTOMER_ID_TEXT_BOX, customerId);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, EditCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON);
    }

    @Step("Input to address text area with value: {0}")
    public void inputToAddressTextArea(String address) {
        waitForElementVisible(driver, EditCustomerPageUI.ADDRESS_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.ADDRESS_TEXT_BOX, address);
    }

    @Step("Input to city text box with value: {0}")
    public void inputToCityTextBox(String city) {
        waitForElementVisible(driver, EditCustomerPageUI.CITY_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.CITY_TEXT_BOX, city);
    }

    @Step("Input to state text box with value: {0}")
    public void inputToStateTextBox(String state) {
        waitForElementVisible(driver, EditCustomerPageUI.STATE_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.STATE_TEXT_BOX, state);
    }

    @Step("Input to pin text box with value: {0}")
    public void inputToPinTextBox(String pin) {
        waitForElementVisible(driver, EditCustomerPageUI.PIN_TEXT_BOX);
        sendKeyToElement(driver, EditCustomerPageUI.PIN_TEXT_BOX, pin);
    }

    @Step("Verify updated success is displayed")
    public boolean isUpdatedSuccessDisplayed() {
        waitForElementVisible(driver, EditCustomerPageUI.UPDATED_SUCCESS_MESSAGE);
        return isElementDisplayed(driver, EditCustomerPageUI.UPDATED_SUCCESS_MESSAGE);
    }

    @Step("Get value of Customer name")
    public String getCustomerNameText() {
        waitForElementVisible(driver, EditCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);
    }

    @Step("Get value of Gender")
    public String getGenderText() {
        waitForElementVisible(driver, EditCustomerPageUI.GENDER_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.GENDER_AT_TABLE_DETAILS);
    }

    @Step("Get value of Date of birth")
    public String getDateOfBirthText() {
        waitForElementVisible(driver, EditCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);
    }

    @Step("Get value of Address")
    public String getAddressText() {
        waitForElementVisible(driver, EditCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);
    }

    @Step("Get value of City")
    public String getCityText() {
        waitForElementVisible(driver, EditCustomerPageUI.CITY_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.CITY_AT_TABLE_DETAILS);
    }

    @Step("Get value of State")
    public String getStateText() {
        waitForElementVisible(driver, EditCustomerPageUI.STATE_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.STATE_AT_TABLE_DETAILS);
    }

    @Step("Get value of Pin")
    public String getPinText() {
        waitForElementVisible(driver, EditCustomerPageUI.PIN_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.PIN_AT_TABLE_DETAILS);
    }

    @Step("Get value of Mobile number")
    public String getMobileNumberText() {
        waitForElementVisible(driver, EditCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
    }

    @Step("Get value of Email")
    public String getEmailText() {
        waitForElementVisible(driver, EditCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
        return getElementText(driver, EditCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
    }

    @Step("Click to Submit button at edit form")
    public void clickToSubmitButtonAtEditForm() {
        waitForElementVisible(driver, EditCustomerPageUI.SUBMIT_BUTTON_AT_EDIT_FROM);
        clickToElement(driver, EditCustomerPageUI.SUBMIT_BUTTON_AT_EDIT_FROM);
    }
}
