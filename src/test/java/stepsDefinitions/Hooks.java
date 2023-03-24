package stepsDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Hooks extends BaseClass{
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("deviceName", "device");
        caps.setCapability("app", System.getProperty("user.dir") + "/apps/product_registration.apk");
        caps.setCapability("platformName", "Android");
        caps.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}



















