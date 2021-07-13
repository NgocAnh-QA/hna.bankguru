package pageObjects;

import commons.AbstractPage;
import commons.PageGeneratorManager;
import org.openqa.selenium.WebDriver;
import pageUIs.LoginPageUI;

public class HomePO extends AbstractPage {
    WebDriver driver;

    public HomePO(WebDriver driver){
        this.driver = driver;
    }

}
