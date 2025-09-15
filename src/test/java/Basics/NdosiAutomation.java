package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NdosiAutomation {


//        WebDriverManager.edgedriver().setup();
//        EdgeDriver driver = new EdgeDriver();
//        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.get("https://ndosiautomation.vercel.app/");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("nav-btn-practice")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[@name='signupToggle']")).click();
//        driver.findElement(By.cssSelector("input[id='register-firstName']")).sendKeys("Boyza");
//        driver.findElement(By.cssSelector("input[id='register-lastName']")).sendKeys("Mvelase");
//        driver.findElement(By.cssSelector("input[id='register-email']")).sendKeys("bonx@gmail.com");
//        driver.findElement(By.xpath("//input[@type='password'][1]")).sendKeys("Password@123");
//        driver.findElement(By.xpath("//input[@type='password'][2]")).sendKeys("Password@123");
//        driver.findElement(By.cssSelector("button[name='registerSubmit']")).click();

WebDriver driver;
@BeforeTest
public void launchBrowser(){
    driver= new ChromeDriver();
}
    @Test(priority = 1)
    public void startBrowser(){

    driver.get("https://www.ndosiautomation.co.za//");
    driver.manage().window().maximize();
    }
@Test(priority = 2)
    public void verifyLandingPageTitle(){
    driver.findElement(By.xpath("//*[contains(text(), 'Learn Automation the Right Way')] ")).isDisplayed();
    }

    @Test(priority = 3)
    public void clickOnLearningMaterial() throws InterruptedException {
        driver.findElement(By.cssSelector("button[id='nav-btn-practice']")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
public void enterLoginDetails() throws InterruptedException {
    driver.findElement(By.xpath("//input[@id='login-email']")).sendKeys("bonx@gmail.com");
    driver.findElement(By.cssSelector("input[id='login-password']")).sendKeys("Password@123");
    driver.findElement(By.xpath("//button[@id='login-submit']")).click();
}
  /*  @AfterTest
    public void closeBrowser(){
        driver.quit();
    }*/
    
}

