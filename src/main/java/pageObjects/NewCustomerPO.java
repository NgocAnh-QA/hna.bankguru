package pageObjects;

import commons.AbstractPage;
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

    public void inputToCustomerNameTextBox(String customerName) {
        waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.CUSTOMER_NAME_TEXT_BOX, customerName);
    }

    public void clickToGenderRadioButton(String genderValue) {
        if (genderValue.equals("female")) {
            waitForElementVisible(driver, NewCustomerPageUI.FEMALE_GENDER_RADIO_BUTTON);
            clickToElement(driver, NewCustomerPageUI.FEMALE_GENDER_RADIO_BUTTON);
        } else {
            waitForElementVisible(driver, NewCustomerPageUI.MALE_GENDER_RADIO_BUTTON);
            clickToElement(driver, NewCustomerPageUI.MALE_GENDER_RADIO_BUTTON);
        }

    }

    public void inputToDateOfBirthTextBox(String dateOfBirth) {
        waitForElementVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX);
        String[] formatBirthday = dateOfBirth.split("-");
        sendKeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, formatBirthday[2]);
        sendKeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, formatBirthday[1]);
        sendKeyBoardToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, Keys.ARROW_RIGHT);
        sendKeyToElement(driver, NewCustomerPageUI.DATE_OF_BIRTH_TEXT_BOX, formatBirthday[0]);
    }

    public void inputToAddressTextBox(String address) {
        waitForElementVisible(driver, NewCustomerPageUI.ADDRESS_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.ADDRESS_TEXT_BOX, address);
    }

    public void inputToCityTextBox(String city) {
        waitForElementVisible(driver, NewCustomerPageUI.CITY_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.CITY_TEXT_BOX, city);
    }

    public void inputToStateTextBox(String state) {
        waitForElementVisible(driver, NewCustomerPageUI.STATE_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.STATE_TEXT_BOX, state);
    }

    public void inputToPINTextBox(String pin) {
        waitForElementVisible(driver, NewCustomerPageUI.PIN_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.PIN_TEXT_BOX, pin);
    }

    public void inputToMobileNumberTextBox(String mobileNumber) {
        waitForElementVisible(driver, NewCustomerPageUI.MOBILE_NUMBER_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.MOBILE_NUMBER_TEXT_BOX, mobileNumber);
    }

    public void inputToEmailTextBox(String email) {
        waitForElementVisible(driver, NewCustomerPageUI.EMAIL_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.EMAIL_TEXT_BOX, email);
    }

    public void inputToPasswordTextBox(String password) {
        waitForElementVisible(driver, NewCustomerPageUI.PASSWORD_TEXT_BOX);
        sendKeyToElement(driver, NewCustomerPageUI.PASSWORD_TEXT_BOX, password);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, NewCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, NewCustomerPageUI.SUBMIT_BUTTON);

    }

    public boolean isSuccessMessageDisplayed() {
        waitForElementVisible(driver, NewCustomerPageUI.SUCCESS_MESSAGE);
        return isElementDisplayed(driver, NewCustomerPageUI.SUCCESS_MESSAGE);
    }

    public String getCustomerNameText() {
        waitForElementVisible(driver, NewCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.CUSTOMER_NAME_AT_TABLE_DETAILS);

    }

    public String getGenderText() {
        waitForElementVisible(driver, NewCustomerPageUI.GENDER_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.GENDER_AT_TABLE_DETAILS);

    }

    public String getDateOfBirthText() {
        waitForElementVisible(driver, NewCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.DATE_OF_BIRTH_AT_TABLE_DETAILS);

    }

    public String getAddressText() {
        waitForElementVisible(driver, NewCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.ADDRESS_AT_TABLE_DETAILS);

    }

    public String getCityText() {
        waitForElementVisible(driver, NewCustomerPageUI.CITY_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.CITY_AT_TABLE_DETAILS);
    }

    public String getStateText() {
        waitForElementVisible(driver, NewCustomerPageUI.STATE_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.STATE_AT_TABLE_DETAILS);
    }

    public String getPinText() {
        waitForElementVisible(driver, NewCustomerPageUI.PIN_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.PIN_AT_TABLE_DETAILS);

    }

    public String getMobileNumberText() {
        waitForElementVisible(driver, NewCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.MOBILE_NUMBER_AT_TABLE_DETAILS);
    }

    public String getEmailText() {
        waitForElementVisible(driver, NewCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
        return getElementText(driver, NewCustomerPageUI.EMAIL_AT_TABLE_DETAILS);
    }
}
