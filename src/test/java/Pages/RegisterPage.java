package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends ParentPage {
    public RegisterPage() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Create an Account']")
    public WebElement createAccount;

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement email_address;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement passwordConfirmation;

    @FindBy(xpath = "//span[text()='Create an Account']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//div[text()='Thank you for registering with Main Website Store.']")
    public WebElement success;

}
