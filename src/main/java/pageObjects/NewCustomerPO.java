package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageUIs.NewCustomerPageUI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NewCustomerPO extends AbstractPage {
    WebDriver driver;

    public NewCustomerPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Input to customer name with value: {0}")
    public void inputToCustomerNameTextBox(String customerName) {
        waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXT_BOX, customerName);
    }

    @Step("Click to gender radio button with value: {0}")
    public void clickToGenderRadioButton(String genderValue) {
        if (genderValue.equals("female")) {
            waitForElementVisible(driver, NewCustomerPageUI.FEMALE_GENDER_RADIO_BUTTON);
            clickToElement(driver, NewCustomerPageUI.FEMALE_GENDER_RADIO_BUTTON);
        } else {
            waitForElementVisible(driver, NewCustomerPageUI.MALE_GENDER_RADIO_BUTTON);
            clickToElement(driver, NewCustomerPageUI.MALE_GENDER_RADIO_BUTTON);
        }
    }

    @Step("Input to date of birth with value: {0}")
    public void inputToDateOfBirthTextBox(String dateOfBirth) {
        waitForElementVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX);
        String[] formatBirthday = dateOfBirth.split("-");
        sendKeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, formatBirthday[2]);
        sendKeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, formatBirthday[1]);
        sendKeyBoardToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, Keys.ARROW_RIGHT);
        sendKeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, formatBirthday[0]);
    }

    @Step("Input to address with value: {0}")
    public void inputToAddressTextBox(String address) {
        waitForElementVisible(driver, NewCustomerPageUI.ADDRESS_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.ADDRESS_TEXT_BOX, address);
    }

    @Step("Input to city with value: {0}")
    public void inputToCityTextBox(String city) {
        waitForElementVisible(driver, NewCustomerPageUI.CITY_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.CITY_TEXT_BOX, city);
    }

    @Step("Input to state with value: {0}")
    public void inputToStateTextBox(String state) {
        waitForElementVisible(driver, NewCustomerPageUI.STATE_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.STATE_TEXT_BOX, state);
    }

    @Step("Input to pin with value: {0}")
    public void inputToPINTextBox(String pin) {
        waitForElementVisible(driver, NewCustomerPageUI.PIN_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.PIN_TEXT_BOX, pin);
    }

    @Step("Input to mobile number with value: {0}")
    public void inputToMobileNumberTextBox(String mobileNumber) {
        waitForElementVisible(driver, NewCustomerPageUI.MOBILE_NUMBER_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.MOBILE_NUMBER_TEXT_BOX, mobileNumber);
    }

    @Step("Input to email with value: {0}")
    public void inputToEmailTextBox(String email) {
        waitForElementVisible(driver, NewCustomerPageUI.EMAIL_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.EMAIL_TEXT_BOX, email);
    }

    @Step("Input to password with value: {0}")
    public void inputToPasswordTextBox(String password) {
        waitForElementVisible(driver, NewCustomerPageUI.PASSWORD_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.PASSWORD_TEXT_BOX, password);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, NewCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);
    }

    @Step("Verify success message is displayed")
    public boolean isSuccessMessageDisplayed() {
        waitForElementVisible(driver, NewCustomerPageUI.SUCCESS_MESSAGE);
        return isElementDisplayed(driver, NewCustomerPageUI.SUCCESS_MESSAGE);
    }

    @Step("Get value of Customer name")
    public String getCustomerNameText() {
        waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);
    }

    @Step("Get value of Gender")
    public String getGenderText() {
        waitForElementVisible(driver, NewCustomerPageUI.GENDER_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.GENDER_AT_TABLE_DETAILS);
    }

    @Step("Get value of Date of birth")
    public String getDateOfBirthText() {
        waitForElementVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);
    }

    @Step("Get value of Address")
    public String getAddressText() {
        waitForElementVisible(driver, NewCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);
    }

    @Step("Get value of City")
    public String getCityText() {
        waitForElementVisible(driver, NewCustomerPageUI.CITY_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.CITY_AT_TABLE_DETAILS);
    }

    @Step("Get value of State")
    public String getStateText() {
        waitForElementVisible(driver, NewCustomerPageUI.STATE_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.STATE_AT_TABLE_DETAILS);
    }

    @Step("Get value of Pin")
    public String getPinText() {
        waitForElementVisible(driver, NewCustomerPageUI.PIN_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.PIN_AT_TABLE_DETAILS);
    }

    @Step("Get value of Mobile number")
    public String getMobileNumberText() {
        waitForElementVisible(driver, NewCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
    }

    @Step("Get value of Email")
    public String getEmailText() {
        waitForElementVisible(driver, NewCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
    }

    @Step("Get Customer ID")
    public String getCustomerIDText() {
        waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_ID_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.CUSTOMER_ID_AT_TABLE_DETAILS);
    }
}
