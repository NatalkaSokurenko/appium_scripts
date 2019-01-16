import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.omg.CORBA.portable.ValueOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "shell@pplus");
        capabilities.setCapability("udid", "VS99041e1e539");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "6.0.0");
        capabilities.setCapability("appPackage", "com.ucontrol.activity");
        capabilities.setCapability("appActivity", "com.webileapps.fragments.MainActivity");
        capabilities.setCapability("automationName", "UiAutomator2");

        AndroidDriver<MobileElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@resource-id='loginUsername']"))).click();
    }
}
