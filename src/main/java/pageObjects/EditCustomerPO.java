package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class EditCustomerPO extends AbstractPage {
    WebDriver driver;

    public EditCustomerPO(WebDriver driver){
        this.driver = driver;
    }

}
