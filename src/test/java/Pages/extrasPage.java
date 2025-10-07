package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class extrasPage {

    WebDriver driver;

    @FindBy(id = "shipping-standard")
    WebElement standardShipping_id;  //this is the standard shipping radio button
    @FindBy(id = "shipping-express")
    WebElement expressShipping_id;   //this is the express shipping radio button
    @FindBy(id = "warranty-none")
    WebElement noWarranty_id;         //this is the no warranty radio button
    @FindBy(id = "warranty-1yr")
    WebElement oneYearWarranty_id;   //this is the 1-year warranty radio button
    @FindBy(id = "warranty-2yr")
    WebElement twoYearWarranty_id;   //this is the 2-year warranty radio button
    @FindBy(id = "discount-code")
    WebElement discountCode_id;     //this is the discount code text field
    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton_id; //this is the apply discount button
    @FindBy(id = "discount-feedback")
    WebElement discountFeedback_id; //this is the discount applied
    @FindBy(id = "add-to-cart-btn")
    WebElement addToCartButton_id; //this is the add to cart button
    @FindBy(xpath = "//*[contains(@id,'cart-item-remove-1759734225816.404')]")
    WebElement removeFromCart_id; //this is the remove from cart button
    @FindBy(id ="review-cart-btn")
    WebElement reviewCartButton_id; //this is the review cart button



}
