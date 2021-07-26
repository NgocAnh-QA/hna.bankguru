package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.RegisterPageUI;

public class RegisterPO extends AbstractPage {
    WebDriver driver;

    public RegisterPO(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Input to Email text box with value: {0}")
    public void inputToEmailTextBox(String textValue) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXT_BOX, textValue);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, RegisterPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
    }

    @Step("Get User ID")
    public String getTextUserIDValue() {
        waitForElementVisible(driver, RegisterPageUI.USER_ID_TEXT);
        return getElementText(driver, RegisterPageUI.USER_ID_TEXT);
    }

    @Step("Get Password")
    public String getTextPasswordValue() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
        return getElementText(driver, RegisterPageUI.PASSWORD_TEXT);

    }
}
