package pages;

import map.ProductListMap;

import java.util.List;
import java.util.Map;

public class ProductListPage extends ProductListMap {
    public void accessNewProductPage() {
        clickNewProduct();
    }

    public boolean isItemDisplayed(List<Map<String, String>> dataset) {
        return getListCodProduct().stream()
                .anyMatch(codProd -> codProd.getText().equals(dataset.get(0).get("code")));
    }
}
