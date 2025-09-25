package Tests;

import Pages.HomePage;
import Pages.SignUp;
import Utils.BrowserFactory;
import Utils.TakesScreenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome","https://www.ndosiautomation.co.za/");
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    SignUp signUp = PageFactory.initElements(driver,SignUp.class);

    TakesScreenshots takesScreenshots = new TakesScreenshots();
}
