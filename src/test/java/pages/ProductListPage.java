package pages;

import io.appium.java_client.AppiumDriver;
import map.ProductListMap;

import java.util.List;
import java.util.Map;

public class ProductListPage extends ProductListMap {
    public ProductListPage(AppiumDriver driver) {
        super(driver);
    }

    public void accessNewProductPage() {
        clickNewProduct();
    }

    public boolean isItemDisplayed(List<Map<String, String>> dataset) {
        return getListCodProduct().getText().equals(dataset.get(0).get("code"));
    }

    public void accessEditAmountPage() {
        clickDecreaseAmount();
    }
}
