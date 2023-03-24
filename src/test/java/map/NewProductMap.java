package map;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class NewProductMap extends BasePage {
    public NewProductMap(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "txt_codigo")
    WebElement input_code;

    @AndroidFindBy(id = "txt_descricao")
    WebElement input_description;

    @AndroidFindBy(id = "txt_unidade")
    WebElement input_packing;

    @AndroidFindBy(id = "txt_quantidade")
    WebElement input_amount;

    @AndroidFindBy(id = "txt_valunit")
    WebElement input_unitValue;

    @AndroidFindBy(id = "txt_lote")
    WebElement input_lot;

    @AndroidFindBy(id = "btn_gravar_assunto")
    WebElement btn_save;

    public WebElement getInput_code() {
        return input_code;
    }

    public WebElement getInput_description() {
        return input_description;
    }

    public WebElement getInput_packing() {
        return input_packing;
    }

    public WebElement getInput_amount() {
        return input_amount;
    }

    public WebElement getInput_unitValue() {
        return input_unitValue;
    }

    public WebElement getInput_lot() {
        return input_lot;
    }

    public void clickBtn_save() {
        btn_save.click();
    }
}
