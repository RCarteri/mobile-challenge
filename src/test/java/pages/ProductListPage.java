package pages;

import io.appium.java_client.AppiumDriver;
import map.ProductListMap;

import java.util.Map;

public class ProductListPage extends ProductListMap {
    public ProductListPage(AppiumDriver driver) {
        super(driver);
    }

    public void accessNewProductPage() {
        clickNewProduct();
    }

    public boolean isItemDisplayed(Map<String, String> dataset) {
        return getListCodProduct().stream()
                .anyMatch(codProd -> codProd.getText().equals(dataset.get("code")));
    }
}
