package pages;

import map.NewProductMap;

import java.util.List;
import java.util.Map;

public class NewProductPage extends NewProductMap {
    public void fillForm(List<Map<String,String>> dataset) {
        getInput_code().sendKeys(dataset.get(0).get("code"));
        getInput_description().sendKeys(dataset.get(0).get("description"));
        getInput_packing().sendKeys(dataset.get(0).get("packing"));
        getInput_amount().sendKeys(dataset.get(0).get("amount"));
        getInput_unitValue().sendKeys(dataset.get(0).get("unitValue"));
        getInput_lot().sendKeys(dataset.get(0).get("lot"));
        clickBtn_save();
    }
}
