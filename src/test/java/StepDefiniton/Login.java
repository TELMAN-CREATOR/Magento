package StepDefiniton;

import Pages.LoginPage;
import Utility.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Login {

    LoginPage page = new LoginPage();

    @Given("Navigate to Magento")
    public void navigate_to_magento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/customer/account/login/");
    }

    @When("Enter email and password")
    public void enterEmailAndPassword() {
        page.email.sendKeys("admin1123@gmail.com");
        page.password.sendKeys("Admin1123.");
    }

    @And("Click the Sign In button")
    public void clickSignTheInButton() {
        page.signInButton.click();
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        Assert.assertTrue(page.myAccount.isDisplayed());
    }

    @When("Enter invalid email or password")
    public void enterInvalidEmailOrPassword() {
        page.email.sendKeys("Bayburt@sehir.com");
        page.password.sendKeys("6556.");
    }

    @Then("The user should see an error message")
    public void theUserShouldSeeAnErrorMessage() {
        String errorMessage = page.errorMessage.getText();
        Assert.assertTrue(page.errorMessage.getText().contains(errorMessage));
    }

    @When("Enter empty email and password")
    public void enterNullEmailAndPassword() {
        page.email.sendKeys("");
        page.password.sendKeys("");
    }

    @Then("The user should see a required field error message")
    public void requiredFieldErrorMessagesShouldBeDisplayed() {
        Assert.assertTrue(page.requiredFieldMessage.isDisplayed());
    }

    @When("Click the Forgot Your Password link")
    public void clickTheForgotYourPasswordLink() {
        page.forgotPassword.click();
    }

    @And("Enter email address and click Reset My Password button")
    public void enterEmailAddressAndClickResetMyPasswordButton() {
        page.emailAddress.sendKeys("admin1123@gmail.com");
        page.resetMyPassword.click();
    }

    @Then("The user should see a password reset confirmation message")
    public void theUserShouldSeeAPasswordResetConfirmationMessage() {
        Assert.assertTrue(page.resetSuccessMessage.isDisplayed());
    }
}
