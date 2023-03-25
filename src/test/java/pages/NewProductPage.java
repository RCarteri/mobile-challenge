package pages;

import io.appium.java_client.AppiumDriver;
import map.NewProductMap;

import java.util.List;
import java.util.Map;

public class NewProductPage extends NewProductMap {
    public NewProductPage(AppiumDriver driver) {
        super(driver);
    }

    public void fillForm(List<Map<String,String>> dataset) {
        getInputCode().sendKeys(dataset.get(0).get("code"));
        getInputDescription().sendKeys(dataset.get(0).get("description"));
        getInputPacking().sendKeys(dataset.get(0).get("packing"));
        getInputAmount().sendKeys(dataset.get(0).get("amount"));
        getInputUnitValue().sendKeys(dataset.get(0).get("unitValue"));
        getInputLot().sendKeys(dataset.get(0).get("lot"));
        clickBtnSave();
    }
}
