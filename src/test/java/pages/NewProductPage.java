package pages;

import io.appium.java_client.AppiumDriver;
import map.NewProductMap;

import java.util.Map;

public class NewProductPage extends NewProductMap {
    public NewProductPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void fillForm(Map<String, String> dataset) {
        getInput_code().sendKeys(dataset.get("code"));
        getInput_description().sendKeys(dataset.get("description"));
        getInput_packing().sendKeys(dataset.get("packing"));
        getInput_amount().sendKeys(dataset.get("codigo"));
        getInput_unitValue().sendKeys(dataset.get("unitValue"));
        getInput_lot().sendKeys(dataset.get("lot"));
        clickBtn_save();
    }
}
