package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;
import pageUIs.RegisterPageUI;

public class RegisterPO extends AbstractPage {
    WebDriver driver;

    public RegisterPO(WebDriver driver) {
        this.driver = driver;
    }

    public void inputToEmailTextBox(String textValue) {
        waitForElementVisible(driver, RegisterPageUI.EMAIL_TEXT_BOX);
        sendKeyToElement(driver, RegisterPageUI.EMAIL_TEXT_BOX, textValue);
    }

    public void clickToSubmitButton() {
        waitForElementVisible(driver, RegisterPageUI.SUBMIT_BUTTON);
        clickToElement(driver, RegisterPageUI.SUBMIT_BUTTON);
    }

    public String getTextUserIDValue() {
        waitForElementVisible(driver, RegisterPageUI.USER_ID_TEXT);
        return getElementText(driver, RegisterPageUI.USER_ID_TEXT);
    }

    public String getTextPasswordValue() {
        waitForElementVisible(driver, RegisterPageUI.PASSWORD_TEXT);
        return getElementText(driver, RegisterPageUI.PASSWORD_TEXT);

    }
}
