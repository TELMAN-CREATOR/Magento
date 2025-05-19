package StepDefiniton;

import Pages.AddOrRemove;
import Pages.LoginPage;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class AddOrRemoveProductToOrFromChart extends GWD {

    AddOrRemove page = new AddOrRemove();

    @Given("The user goes to the product selection page")
    public void theUserGoesToTheProductSelectionPage() {
        page.search.sendKeys("MSH11");
        page.call.click();
    }
    @When("User adds the product to the cart")
    public void userAddsTheProductToTheCart() {
        Actions ActionDriver1=new Actions(driver);
        Action Action1=ActionDriver1.moveToElement(page.add).click().build();
        Action1.perform();
    }
    @Then("Fills in the required information for the product")
    public void fillsInTheRequiredInformationForTheProduct() {
        page.body.click();
        page.colour.click();
        page.add2.click();
    }
    @Given("User goes to the cart page")
    public void userGoesToTheCartPage() {
        page.mycart.click();
    }
    @When("User deletes the product")
    public void userDeletesTheProduct() {
        page.delete.click();
        page.ok.click();
    }
    @Then("The user receives a confirmation message that the product is not available")
    public void theUserReceivesAConfirmationMessageThatTheProductIsNotAvailable() {
        Assert.assertTrue(page.message.getText().contains("You have no items in your shopping cart."));
    }
}
