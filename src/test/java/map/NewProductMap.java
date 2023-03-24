package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepsDefinitions.BaseClass;

public class NewProductMap extends BaseClass {
        public WebElement getInput_code() {
        return driver.findElement(By.id("txt_codigo"));
    }

    public WebElement getInput_description() {
        return driver.findElement(By.id("txt_descricao"));
    }

    public WebElement getInput_packing() {
        return driver.findElement(By.id("txt_unidade"));
    }

    public WebElement getInput_amount() {
        return driver.findElement(By.id("txt_quantidade"));
    }

    public WebElement getInput_unitValue() {
        return driver.findElement(By.id("txt_valunit"));
    }

    public WebElement getInput_lot() {
        return driver.findElement(By.id("txt_lote"));
    }

    public void clickBtn_save() {
        driver.findElement(By.id("btn_gravar_assunto")).click();
    }
}
