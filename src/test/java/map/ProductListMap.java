package map;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductListMap extends BasePage {
    public ProductListMap(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "Button1")
    WebElement newProduct;

    @FindBy(id = "txt_codigo")
    WebElement txtCode;

    @FindBy(id = "txt_quantidade")
    WebElement txtAmount;

    @FindBy(id = "saida")
    WebElement descrease;

    public void clickNewProduct() {
        newProduct.click();
    }

    public WebElement getListCodProduct() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return txtCode;
    }

    public void clickDecreaseAmount() {
        descrease.click();
    }

    public WebElement getTxtAmount() {
        return txtAmount;
    }
}
