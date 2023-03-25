package pages;

import io.appium.java_client.AppiumDriver;
import map.EditAmountMap;

import java.util.List;
import java.util.Map;

public class EditAmountPage extends EditAmountMap {
    String oldAmount;

    public EditAmountPage(AppiumDriver driver) {
        super(driver);
    }

    public void decreaseAmount(List<Map<String, String>> table) {
        oldAmount = getTxtOldAmount();
        getInputAmount().sendKeys(table.get(0).get("amount"));
        getInputReason().sendKeys(table.get(0).get("reason"));
        getInputRef().sendKeys(table.get(0).get("reference"));
        clickBtnSave();
    }

    public boolean hasLessStock(double currentAmount) {
        return currentAmount < Double.parseDouble(oldAmount);
    }
}
