package map;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewProductMap extends BasePage {
    public NewProductMap(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "txt_codigo")
    WebElement inputCode;

    @FindBy(id = "txt_descricao")
    WebElement inputDescription;

    @FindBy(id = "txt_unidade")
    WebElement inputPacking;

    @FindBy(id = "txt_quantidade")
    WebElement inputAmount;
    
    @FindBy(id = "txt_valunit")
    WebElement inputUnitValue;

    @FindBy(id = "txt_lote")
    WebElement inputLot;

    @FindBy(id = "btn_gravar_assunto")
    WebElement btnSave;

    public WebElement getInputCode() {
        return inputCode;
    }

    public WebElement getInputDescription() {
        return inputDescription;
    }

    public WebElement getInputPacking() {
        return inputPacking;
    }

    public WebElement getInputAmount() {
        return inputAmount;
    }

    public WebElement getInputUnitValue() {
        return inputUnitValue;
    }

    public WebElement getInputLot() {
        return inputLot;
    }

    public void clickBtnSave() {
         btnSave.click();
    }
}
