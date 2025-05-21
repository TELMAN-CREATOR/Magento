package StepDefiniton;

import Pages.RegisterPage;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Register {
RegisterPage registerPage=new RegisterPage();
    @Given("Navigate to Magento main")
    public void navigateToMagentoMain() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Given("Click the Create an account link")
    public void click_the_create_an_account_link() {
        registerPage.myClick(registerPage.createAccount);
    }
    @When("Enter the all information")
    public void enter_the_all_information() {
       registerPage.mySendKeys(registerPage.firstName, "Adminka");
       registerPage.mySendKeys(registerPage.lastName, "Adminoviçka");
       registerPage.mySendKeys(registerPage.email_address, "admin1212@gmail.com");
       registerPage.mySendKeys(registerPage.password, "Admin1212.");
       registerPage.mySendKeys(registerPage.passwordConfirmation, "Admin1212.");
       registerPage.myClick(registerPage.createAccountButton);
    }
    @Then("User should create an account successfully")
    public void user_should_create_an_account_successfully() {
        System.out.println(registerPage.success.getText());
        Assert.assertTrue(registerPage.success.getText().contains("Thank you"));
    }

}
