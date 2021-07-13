package commons;

import org.openqa.selenium.WebDriver;
import pageObjects.*;

public class PageGeneratorManager {

    public static LoginPO getLoginPage(WebDriver driver) {
        return new LoginPO(driver);
    }

    public static RegisterPO getRegisterPage(WebDriver driver) {
        return new RegisterPO(driver);
    }

    public static HomePO getHomePage(WebDriver driver) {
        return new HomePO(driver);
    }

    public static NewCustomerPO getNewCustomerPage(WebDriver driver) {
        return new NewCustomerPO(driver);
    }

    public static EditCustomerPO getEditCustomerPage(WebDriver driver) {
        return new EditCustomerPO(driver);
    }

    public static DeleteCustomerPO getDeleteCustomerPage(WebDriver driver) {
        return new DeleteCustomerPO(driver);
    }

}
