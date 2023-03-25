package map;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAmountMap extends BasePage {
    public EditAmountMap(AppiumDriver driver) {
        super(driver);
    }

    @FindBy(id = "txt_qtdsaida")
    WebElement inputAmount;

    @FindBy(id = "txt_motivo")
    WebElement inputReason;

    @FindBy(id = "txt_referencia")
    WebElement inputRef;

    @FindBy(id = "btn_salvar")
    WebElement btnSave;

    @FindBy(id = "txt_qtdatual")
    WebElement txtOldAmount;

    public String getTxtOldAmount() {
        return txtOldAmount.getText();
    }

    public WebElement getInputAmount() {
        return inputAmount;
    }

    public WebElement getInputReason() {
        return inputReason;
    }

    public WebElement getInputRef() {
        return inputRef;
    }

    public void clickBtnSave() {
        btnSave.click();
    }
}
