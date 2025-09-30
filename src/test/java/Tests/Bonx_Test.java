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
    public void enterUsername() {
        String email="Bonx@gmail.com";
        loginPage.enterEmail(email);
    }

    @Test(priority = 3)
    public void enterPassword() {
        String passW = "Password@123";
        loginPage.enterPassword(passW);
    }

    @Test(priority = 4)
    public void submitDetails() throws InterruptedException {
        loginPage.submitDetails();
    }
    @Test(priority = 5)
    public void clickWebButton() throws InterruptedException {
        loginPage.clickWebButton();
    }

}



