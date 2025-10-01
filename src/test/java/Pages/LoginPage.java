package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage {


    WebDriver driver;
    @FindBy(id ="nav-btn-practice")
    WebElement learningMaterialButton_id;
    @FindBy(id ="login-email")
    WebElement username;
    @FindBy(id ="login-password")
    WebElement password_idd;
    @FindBy(css ="button[name='loginSubmit']")
    WebElement submit_id;
    @FindBy(xpath="//button[@id='tab-btn-web']")
    WebElement webButton_id;
    @FindBy(xpath ="//button[@name='logoutButton']")
    WebElement logoutButton_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterEmail(String email){
        username.sendKeys(email);
    }
    public void enterPassword(String passW){
        password_idd.sendKeys(passW);
    }
    public void submitDetails()  {
     submit_id.click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void clickWebButton() {
        webButton_id.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    public void clickLogoutButton() {
        logoutButton_id.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
}