package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

public class startBrowser {


    WebDriver driver;
    @Test
    public  void startBrowser(){

        driver = new ChromeDriver();
    }


}


