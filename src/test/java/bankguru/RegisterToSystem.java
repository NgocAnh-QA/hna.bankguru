package bankguru;

import commons.AbstractTest;
import commons.Environment;
import commons.PageGeneratorManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pageObjects.LoginPO;
import pageObjects.RegisterPO;

public class RegisterToSystem extends AbstractTest {
    public static String EMAIL, PASSWORD;
    int randomNumber = getRandomNumber();
    String postEmail = randomNumber + "@hotmail.com";
    WebDriver driver;
    Environment evn;
    private LoginPO loginPage;
    private RegisterPO registerPage;

    @Parameters("browser")
    @BeforeTest
    public void beforeClass(String browserName) {
        String environment = System.getProperty("evn");
        ConfigFactory.setProperty("environment", environment);
        evn = ConfigFactory.create(Environment.class);
        driver = getBrowserDriver(browserName, evn.url());

        log.info("Register to system - Step 01: Open Login Page");
        loginPage = PageGeneratorManager.getLoginPage(driver);

        log.info("Register to system - Step 01: Open Register Page");
        registerPage = loginPage.clickToHereRegisterLink();

        log.info("Register to system - Step 01: Input to Email text box");
        registerPage.inputToEmailTextBox("simon.test" + postEmail);

        log.info("Register to system - Step 01: Click to Submit button");
        registerPage.clickToSubmitButton();

        log.info("Register to system - Step 01: Get User ID value");
        EMAIL = registerPage.getTextUserIDValue();

        log.info("Register to system - Step 01: Get Password value");
        PASSWORD = registerPage.getTextPasswordValue();

        log.info("Register to system - Step 01: Close browser and driver");
        closeBrowserAndDriver(driver);

    }



}
