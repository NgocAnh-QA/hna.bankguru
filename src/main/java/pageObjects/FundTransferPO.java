package pageObjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

public class FundTransferPO extends AbstractPage {
    WebDriver driver;

    public FundTransferPO(WebDriver driver){
        this.driver = driver;
    }

}
