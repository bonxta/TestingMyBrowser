package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {

    WebDriver driver;

    @FindBy(xpath = "//button[@id='signup-toggle']")
    WebElement signUpButton_id;
    @FindBy(css = " input[id='register-firstName']")
    WebElement firstName_id;
    @FindBy(id = "register-lastName")
    WebElement lastName_id;
    @FindBy(css = " input[id='register-email']")
    WebElement email_id;
    @FindBy(css = " input[id='register-password']")
    WebElement password_id;
    @FindBy(css = " input[id='register-confirmPassword']")
    WebElement confirmPassword_id;
    @FindBy(css = " button[id='register-submit']")
    WebElement registerButton_id;
  /*  @FindBy(css="input[id='login-email']")
    WebElement input[id='login-email'];*/

    public SignUp(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignUpButton() throws InterruptedException {
        signUpButton_id.click();

    }

    public void enterFirstName(String firstName) {
        firstName_id.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastName_id.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        email_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        password_id.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPassword_id.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton_id.click();
    }


}
