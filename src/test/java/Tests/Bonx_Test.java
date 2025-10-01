package Tests;

import Pages.Inventory;
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
    public void loginValidCredentials()  {
        String email="Bonx@gmail.com";
        String passW = "Password@123";
        loginPage.enterPassword(passW);
        loginPage.enterEmail(email);
        loginPage.submitDetails();
        loginPage.clickWebButton();
    }

  /*  @Test(priority = 3)
    public void logout(){
        loginPage.clickLogoutButton();

    }*/
    public void selectProduct(){
        inventory.selectDevice();
    }


}



