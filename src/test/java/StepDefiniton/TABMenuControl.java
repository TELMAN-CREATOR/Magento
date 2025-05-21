package StepDefiniton;

import Pages.TabMenu;
import Utility.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;


public class TABMenuControl {

    TabMenu tabMenu = new TabMenu();

    @Given("Navigate to Magento and Login Page")
    public void navigate_to_magento_and_login_page() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Given("In the user tab menu, navigate to Women branches")
    public void in_the_user_tab_menu_navigate_to_women_branches() {
        tabMenu.myClick(tabMenu.women);
        GWD.getDriver().navigate().back();
    }

    @Then("In the user tab menu, navigate to Men branches")
    public void in_the_user_tab_menu_navigate_to_men_branches() {
        tabMenu.myClick(tabMenu.men);
        GWD.getDriver().navigate().back();
    }

    @Then("In the user tab menu, navigate to Gear")
    public void in_the_user_tab_menu_navigate_to_gear() {
        tabMenu.myClick(tabMenu.gear);
        GWD.getDriver().navigate().back();
    }

    @Then("In the user tab menu, hover over Training")
    public void in_the_user_tab_menu_hover_over_training() {
        Actions actions = new Actions(GWD.getDriver());
        actions.moveToElement(tabMenu.training).perform();
    }

    @When("Enter E-mail and and password and click on the login button")
    public void enterEMailAndAndPasswordAndClickOnTheLoginButton() {
    }
}
