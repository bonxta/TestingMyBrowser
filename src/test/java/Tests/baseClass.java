package Tests;

import Pages.*;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

@Test
public class baseClass {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = BrowserFactory.startBrowser("chrome","https://www.ndosiautomation.co.za/");
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    Pages.signUp signUp = PageFactory.initElements(driver, Pages.signUp.class);
    Pages.loginPage loginPage = PageFactory.initElements(driver, Pages.loginPage.class);
    Inventory inventory = PageFactory.initElements(driver,Inventory.class);
    Pages.extrasPage extrasPage = PageFactory.initElements(driver, Pages.extrasPage.class);
    TakesScreenshots takesScreenshots = new TakesScreenshots();
}
