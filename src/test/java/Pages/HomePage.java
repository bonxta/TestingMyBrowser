package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


     public class HomePage {
        WebDriver driver;

        @FindBy(id = "overview-section")
        WebElement homePageTitle_id;

        @FindBy(id = "nav-btn-practice")
        WebElement learningMaterialButton_id;

        @FindBy(css="button[id='signup-toggle']")
         WebElement signUpButton_id;


        public HomePage(WebDriver driver) {
            this.driver = driver;
        }

        public void verifyHomePageIsDisplayed() {
            homePageTitle_id.isDisplayed();
        }

        public void clickLearningMaterial() {
            learningMaterialButton_id.click();
        }






     }
