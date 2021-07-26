package pageObjects;

import commons.AbstractPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pageUIs.DeleteCustomerPageUI;

public class DeleteCustomerPO extends AbstractPage {
    WebDriver driver;

    public DeleteCustomerPO(WebDriver driver){
        this.driver = driver;
    }

    @Step("Input to Customer ID: {0}")
    public void inputToCustomerIDTextBox(String customerId) {
        waitForElementVisible(driver, DeleteCustomerPageUI.CUSTOMER_ID_TEXT_BOX);
        sendKeyToElement(driver, DeleteCustomerPageUI.CUSTOMER_ID_TEXT_BOX, customerId);
    }

    @Step("Click to Submit button")
    public void clickToSubmitButton() {
        waitForElementVisible(driver, DeleteCustomerPageUI.SUBMIT_BUTTON);
        clickToElement(driver, DeleteCustomerPageUI.SUBMIT_BUTTON);

    }
}
