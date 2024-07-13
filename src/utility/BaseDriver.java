package utility;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static final org.apache.logging.log4j.Logger logger4j= LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void startupOperations() {
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));

        loginTest();
    }



    @AfterClass
    public static void endOperations(){
        OptionalWait(5);
        driver.quit();
    }

    public static void OptionalWait(int sec){
        try {
            Thread.sleep(sec*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void loginTest(){
        driver.get("https://demo.openmrs.org/");
        OptionalWait(2);
    }

}
//TODO BURAYA SONRA BEFOREMETHOD VE AFTERMETHOD ILE LOGLAMA ISLEMLERINI YAP

/*
Kullanacağımız environment https://openmrs.org adresidir. Bu environmentin alt alanı
olan https://demo.openmrs.org/ ‘ta çalışmış olacağız.
 */