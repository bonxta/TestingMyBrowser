package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    WebDriver driver;

    @FindBy(id="overview-section")
    WebElement homePageTitle_id;

    // Constructor to initialize the WebDriver will help to capture the session held by Webdriver driver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
      public void verifyHomePageTitle() {
          homePageTitle_id.isDisplayed();


}}
