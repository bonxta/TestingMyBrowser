package Tests;


import Pages.Inventory;
import org.testng.annotations.Test;

public class bonxTest extends baseClass {
    String email ="aeiou@gmail.com";
    String pw = "Password@123";

    @Test
    public void verifyHomePageIsDisplayed(){
        homePage.verifyHomePageIsDisplayed();
    }
    @Test(priority = 1)
    public void clickLearningMaterial(){
        homePage.clickLearningMaterial();
    }
@Test(priority = 2)
     public void clickSignUpToggle(){
        loginPage.clickSignUpToggle();
     }

     @Test(priority = 3)
     public void sigUp() throws InterruptedException {
         String cpw ="Password@123";
        signUp.enterFirstName("Bonx");
        // Wait for the last name field to be visible before interacting
        new org.openqa.selenium.support.ui.WebDriverWait(driver, java.time.Duration.ofSeconds(10));
        signUp.enterLastName("Mthembu");
        signUp.enterEmail(email);
        signUp.enterPassword(pw,cpw);
        signUp.clickRegisterButton();
     }

     @Test(priority = 4)
    public void LoginHere(){
        loginPage.clickLoginHere();
        loginPage.enterEmails(email);
        loginPage.enterPasswords(pw);
        loginPage.clickloginButton();

     }

     @Test(priority = 5)
    public void selectProduct(){
        inventory.clickWebAutoAdvanceButton();
        inventory.CalculatePrice("Tablet","64GB",1);
        inventory.clickNextButton();

     }

}






//
//    @Test(priority = 3)
//    public void selectProduct(){
//        String address = "14a charles crescent";
//        inventory.selectDeviceType();
//        inventory.selectDeviceBrand();
//        inventory.selectStorage();
//        inventory.selectColor();
//        inventory.enterQuantity("1");
//        inventory.enterAddress(address);
//        inventory.displayPriceSummary();
//        inventory.clickNextButton();
//
//    }
//    @Test(priority = 4)
//    public void getExtras(){
//        String discCode = "SAVE20";
//        extrasPage.selectExpressShipping();
//        extrasPage.twoYearWarranty();
//        extrasPage.enterDiscountCode(discCode);
//        extrasPage.clickApplyDiscountButton();
//        extrasPage.discountAppliedVisible();
//        extrasPage.addToCart();}
//
//      @Test(priority= 5)
//        public void selectAnotherDevice(){
//            inventory.selectNewDeviceType();
//            inventory.selectNewDeviceBrand();
//            inventory.selectNewStorage();
//            inventory.selectNewColor();
//            inventory.enterQuantity("2");
//            inventory.enterAddress("Kwazulu Natal");
//            inventory.displayPriceSummary();
//            inventory.clickNextButton();}
//
//    @Test(priority= 6)
//    public void getMoreExtras() {
//        extrasPage.selectExpressShipping();
//        extrasPage.oneYearWarranty();
//        extrasPage.addToCart();
//        //extrasPage.assertDiscountApplied();
//        //extrasPage.removeFromCart();}
//        extrasPage.reviewCart();
//
//    }}
