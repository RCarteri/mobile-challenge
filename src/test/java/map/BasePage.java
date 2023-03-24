package map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import stepsDefinitions.BaseClass;

public class BasePage extends BaseClass {
    public BasePage(AppiumDriver appiumDriver) {
        PageFactory.initElements(new AppiumFieldDecorator(appiumDriver), this);
        driver = appiumDriver;
    }
}
