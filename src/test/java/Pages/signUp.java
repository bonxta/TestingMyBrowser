package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class signUp {

    WebDriver driver;


    @FindBy(id = "overview-section")
    WebElement homePageTitle_id;
    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterialButton_id;
    @FindBy(xpath = "//button[@id='signup-toggle']")
    WebElement signUpButton_id;
    @FindBy(xpath = "//input[@id='register-firstName']")
    WebElement txtfirstName_id;
    @FindBy(id = "register-lastName")
    WebElement txtlastName_id;
    @FindBy(css = " input[id='register-email']")
    WebElement txtemail_id;
    @FindBy(css = " input[id='register-password']")
    WebElement txtpassword_id;
    @FindBy(css = " input[id='register-confirmPassword']")
    WebElement txtconfirmPassword_id;
    @FindBy(xpath = "//button[@id='register-submit']")
    WebElement ClickregisterButton;

    public signUp(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickSignUpButton() throws InterruptedException {
        signUpButton_id.click();
        Thread.sleep(2000);
    }

    public void enterFirstName(String firstName) {
        txtfirstName_id.clear();
        txtfirstName_id.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        txtlastName_id.clear();
        txtlastName_id.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        if (isValidEmail(email)) {
            txtemail_id.clear();
            txtemail_id.sendKeys(email);
        } else {
            throw new IllegalArgumentException("Invalid email format: " + email);

        }
    }

    //Entering password with validation for length and match
    public void enterPassword(String password, String confirmPassword) {
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }
        if (!password.equals(confirmPassword)) {
            throw new IllegalArgumentException("Password and Confirm Password do not match.");
        }
        txtpassword_id.clear();
        txtpassword_id.sendKeys(password);
        txtconfirmPassword_id.clear();
        txtconfirmPassword_id.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() throws InterruptedException {
        ClickregisterButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
// Print the alert text (optional)
        System.out.println("Alert message: " + alert.getText());
// Accept (click OK)
        alert.accept();
    }

    //this is simply to validate email format
    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(emailRegex);
    }

}
