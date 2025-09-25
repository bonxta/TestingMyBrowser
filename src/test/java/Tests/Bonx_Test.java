package Tests;

import org.testng.annotations.Test;

import static Utils.FakerDataGenerator.firstname;

public class Bonx_Test extends Base {

    @Test
    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        takesScreenshots.takesSnapShot(driver, "Home Page");
    }

    @Test(priority = 1)
    public void clickLearningMaterial() {
        homePage.clickLearningMaterial();
    }

    @Test(priority = 2)
    public void clickSignUpButton() throws InterruptedException {
        signUp.clickSignUpButton();
        //Thread.sleep(2000);
    }

    @Test(priority = 3)
    public void enterFirstname() {
        signUp.enterFirstName(firstname);

    }

    @Test(priority = 4)
    public void enterLastName() {
        signUp.enterLastName("Phewa");
    }

    @Test(priority = 5)
    public void enterEmail() {
        signUp.enterEmail("bpbp@gmail.com");
    }

    @Test(priority = 6)
    public void enterPassword() {
        signUp.enterPassword("Password@123");
    }

    @Test(priority = 7)
    public void confirmPassword() {
        signUp.enterConfirmPassword("Password@123");
    }

    @Test(priority = 8)
    public void createAccount() throws InterruptedException {
        signUp.clickRegisterButton();
        Thread.sleep(2000);
    }


}
