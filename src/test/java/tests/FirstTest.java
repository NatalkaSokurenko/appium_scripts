package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class FirstTest {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "shell@pplus");
        capabilities.setCapability("udid", "VS99041e1e539");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.0");
        capabilities.setCapability("appPackage", "com.ucontrol.activity");
        capabilities.setCapability("appActivity", "com.webileapps.fragments.MainActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
//        capabilities.setCapability("deviceName", "Pixel 2 API 25");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "7.1.1");
//

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        this.driver = driver;

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Test
    public void testLogin(){

        System.out.println("start");
        MobileElement element = driver.findElement(By.id("loginSettingsButton"));
        System.out.println("found " + element);
        element.click();
        System.out.println(element);

//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id='loginUsername']"))).click();

//        driver.findElement(By.xpath("//*[@resource-id='loginUsername']")).click();
//        driver.findElement(By.xpath("//*[@resource-id='loginUsername']")).sendKeys("Test");
//        driver.findElement(By.xpath("//*[@resource-id='loginUsername']")).click();
//        driver.findElement(By.xpath("//*[@resource-id='loginUsername']")).sendKeys("12345678");
//        driver.findElement(By.xpath("//*[@resource-id='loginPassword']")).click();
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
