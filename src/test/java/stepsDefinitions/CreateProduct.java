package stepsDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.NewProductPage;
import pages.ProductListPage;

import java.util.Map;

public class CreateProduct extends BaseClass {
    ProductListPage plp;
    Map<String, String> dataset;

    @Given("I access the new product page")
    public void iAccessTheNewProductPage() {
        plp = new ProductListPage(driver);
        plp.accessNewProductPage();
    }

    @When("I fill in the new product form with the dataset")
    public void iFillInTheNewProductFormWithTheDataset(Map<String, String> dataset) {
        this.dataset = dataset;
        NewProductPage npp = new NewProductPage(driver);
        npp.fillForm(dataset);
    }

    @Then("the item should appear in the list")
    public void theItemShouldAppearInTheList() {
        Assert.assertTrue(plp.isItemDisplayed(dataset));
    }
}
