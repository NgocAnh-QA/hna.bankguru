package pageObjects;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class ManagerPO extends AbstractPage {
    WebDriver driver;

    public ManagerPO(WebDriver driver){
        this.driver = driver;
    }

}
