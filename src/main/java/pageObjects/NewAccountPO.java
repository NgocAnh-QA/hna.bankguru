package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class NewAccountPO extends AbstractPage {
    WebDriver driver;

    public NewAccountPO(WebDriver driver){
        this.driver = driver;
    }

}
