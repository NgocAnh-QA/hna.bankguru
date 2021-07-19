package bankguru;

import commons.AbstractPage;
import commons.AbstractTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoJava extends AbstractPage {
    WebDriver driver;
    JavascriptExecutor jsExecutor;

    @Test
    public void TC_01_Test() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://vi-vn.facebook.com/");

        String parentID = getWindowID(driver);
        jsExecutor = (JavascriptExecutor) driver;
        String url = driver.findElement(By.linkText("Quên mật khẩu?")).getAttribute("href");
        String a = "window.open();";
        jsExecutor.executeScript(a);

        String childID = driver.getWindowHandle();
        switchWindowByID(driver, childID);
        navigateToUrlByJS(driver, url);
        closeAllWindowsWithoutParent(driver, parentID);

        System.out.println(driver.getTitle());
    }

}
