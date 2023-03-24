package map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class ProductListMap extends BasePage {
    public ProductListMap(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "Button1")
    MobileElement newProduct;

    @AndroidFindBy(id = "txt_codigo")
    List<MobileElement> listCodProduct;

    public void clickNewProduct() {
        newProduct.click();
    }

    public List<MobileElement> getListCodProduct() {
        return listCodProduct;
    }
}
