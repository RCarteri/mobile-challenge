package map;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import stepsDefinitions.BaseClass;

import java.util.List;

public class ProductListMap extends BaseClass {
    public void clickNewProduct() {
        driver.findElement(By.id("Button1")).click();
    }

    public List<MobileElement> getListCodProduct() {
        return driver.findElements(By.id("txt_codigo"));
    }
}
