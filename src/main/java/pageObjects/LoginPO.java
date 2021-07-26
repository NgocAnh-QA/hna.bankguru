package pageObjects;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class LoginPO extends AbstractPage {
    WebDriver driver;

    public LoginPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Click to Here register link")
    public RegisterPO clickToHereRegisterLink() {
        waitForElementClickable(driver, LoginPageUI.HERE_REGISTER_LINK);
        clickToElement(driver, LoginPageUI.HERE_REGISTER_LINK);
        return PageGeneratorManager.getRegisterPage(driver);
    }

    @Step("Input to email text box with value: {0}")
    public void inputToEmailTextBox(String emailValue) {
        waitForElementVisible(driver, LoginPageUI.USER_ID_TEXT_BOX);
        sendKeyToElement(driver, LoginPageUI.USER_ID_TEXT_BOX, emailValue);
    }

    @Step("Input to password text box with value: {0}")
    public void inputToPasswordTextBox(String passwordValue) {
        waitForElementVisible(driver, LoginPageUI.PASSWORD_TEXT_BOX);
        sendKeyToElement(driver, LoginPageUI.PASSWORD_TEXT_BOX, passwordValue);
    }

    @Step("Login to system with email: {0} and password: {1}")
    public ManagerPO loginToSystem(String emailValue, String passwordValue) {
        inputToEmailTextBox(emailValue);
        inputToPasswordTextBox(passwordValue);
        waitForElementVisible(driver, LoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, LoginPageUI.LOGIN_BUTTON);
        return PageGeneratorManager.getManagerPage(driver);
    }
}
