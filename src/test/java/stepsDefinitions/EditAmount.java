package stepsDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.EditAmountPage;
import pages.ProductListPage;

import java.util.List;
import java.util.Map;

public class EditAmount extends BaseClass{
    EditAmountPage eap;

    @When("I remove a quantity item from this product")
    public void iRemoveAQuantityItemFromThisProduct(DataTable dataTable) {
        List<Map<String, String>> dataset = dataTable.asMaps(String.class, String.class);
        ProductListPage plp = new ProductListPage(driver);
        plp.accessEditAmountPage();
        eap = new EditAmountPage(driver);
        eap.decreaseAmount(dataset);
    }

    @Then("stock must have less stock")
    public void stockMustHaveLessStock() {
        ProductListPage plp = new ProductListPage(driver);
        double currentAmount = Double.parseDouble(plp.getTxtAmount().getText());
        Assert.assertTrue(eap.hasLessStock(currentAmount));
    }
}
