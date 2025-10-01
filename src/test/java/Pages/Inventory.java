package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Inventory {

    //WebElement staticDropDown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
    //Select dropdown = new Select(staticDropDown);
    WebDriver driver;
    @FindBy(id = "deviceType")
     WebElement staticDropDown;
    //Select dropdown = new Select(staticDropDown);

    public Inventory(WebDriver driver) {
        this.driver = driver;
    }
    public void selectDevice(){
        staticDropDown.click();
        Select dropdown = new Select(staticDropDown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }



}
