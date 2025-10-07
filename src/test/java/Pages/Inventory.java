package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class Inventory {

    WebDriver driver;

    public Inventory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "deviceType")
    WebElement deviceTypyeDropdown_id;
    WebElement deviceBrandDropdown_id;
    @FindBy(id = "storage-256GB")
    WebElement storageradioButton_id;
    @FindBy(id = "storage-64GB")
    WebElement newstorageradioButton_id;
    @FindBy(id = "color")
    WebElement colorradioButton_id;
    @FindBy(id = "quantity")
    WebElement quantityTextbox_id;
    @FindBy(id = "address")
    WebElement addressTextbox_id;
    @FindBy(id = "step1-pricing-summary")
    WebElement pricing_id;
    @FindBy(id = "inventory-next-btn")
    WebElement nextButton_id;
    @FindBy(id = "tab-btn-web")
    WebElement webAutoAdvanceButton_id;


    public void clickWebAutoAdvanceButton(){
        webAutoAdvanceButton_id.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));}


    public void  CalculatePrice(String deviceType,String storageOption,int quantity){
        Select deviceTypeDropDown = new Select(deviceTypyeDropdown_id);
        deviceTypeDropDown.selectByVisibleText(deviceType);

        double price =0.0;
        double totalPrice =0.0;

        if(deviceType.equalsIgnoreCase("Phone")){
            switch(storageOption){
                case "64GB":
                    price = 800.00;
                    break;
                case "128GB":
                    price = 960.00;
                    break;
                case "256":
                    price = 1120.00;
                    break;
                default:
                    System.out.println("lol.");
                    return;
            }}
            else if (deviceType.equalsIgnoreCase("Tablet")) {
                switch (storageOption) {
                    case "64GB":
                        price = 1200.00;
                        break;
                    case "128GB":
                        price = 1360.00;
                        break;
                    case "256GB":
                        price = 1520.00;
                        break;
                    default:
                        System.out.println("hahaha.");
                        return;
                }
            } else if (deviceType.equalsIgnoreCase("Laptop")) {
                switch (storageOption) {
                    case "64GB":
                        price = 1200.00;
                        break;
                    case "128GB":
                        price = 1400.00;
                        break;
                    case "256":
                        price = 1600.00;
                        break;
                    default:
                        System.out.println("what were you thinking ,champ?.");
                        return;
                }
            } else {
                System.out.println("daar syn jy nou.");
                return;
            }

            //capturing how many devices
            quantityTextbox_id.clear();
            quantityTextbox_id.sendKeys(String.valueOf(quantity));


            //total price calculation based on selections
            totalPrice = price * quantity;
            System.out.println("Total Price: $" + totalPrice);

        }


    public void clickNextButton(){
        nextButton_id.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }



    }




