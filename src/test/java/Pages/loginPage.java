package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;


public class loginPage {


    WebDriver driver;
    @FindBy(id="signup-toggle")
    WebElement toggle_id;
    @FindBy(id ="nav-btn-practice")
    WebElement learningMaterialButton_id;
    @FindBy(css="button[id='login-toggle']")
    WebElement loginToggle_id;
    @FindBy(id ="login-email")
    WebElement email_id;
    @FindBy(id ="login-password")
    WebElement password_idd;
    @FindBy(css ="button[name='loginSubmit']")
    WebElement submitbutton_id;
    @FindBy(xpath ="//button[@id='tab-btn-web']")
    WebElement webButton_id;
    @FindBy(xpath ="//button[@name='logoutButton']")
    WebElement logoutButton_id;
    @FindBy(id ="tab-btn-web")
    WebElement webTabButton_id;

    public loginPage(WebDriver driver) {
        this.driver = driver;}


public void clickSignUpToggle(){
    toggle_id.click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}

    public void clickLoginHere(){
        loginToggle_id.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}

    public void enterEmails(String email){
        email_id.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}

    public void enterPasswords(String password){
        password_idd.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}

    public void clickloginButton(){
        submitbutton_id.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}

    }










