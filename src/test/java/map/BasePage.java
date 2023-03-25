package map;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.PageFactory;
import stepsDefinitions.BaseClass;

public class BasePage extends BaseClass {

    public BasePage(AppiumDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
