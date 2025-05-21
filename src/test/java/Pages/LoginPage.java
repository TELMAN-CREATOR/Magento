package Pages;

import Utility.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String email, String password) {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("pass")).sendKeys(password);
        driver.findElement(By.id("send2")).click();
    }
    public LoginPage() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[id='email']")
    public WebElement email;

    @FindBy(css = "[id='pass']")
    public WebElement password;

    @FindBy(css = "[id='send2']")
    public WebElement signInButton;

    @FindBy(xpath = "//span[contains(text(), 'My Account')]")
    public WebElement myAccount;

    @FindBy(css = "[class='page messages']")
    public WebElement errorMessage;

    @FindBy(css = "[class='page messages']")
    public WebElement requiredFieldMessage;

    @FindBy(linkText = "Forgot Your Password?")
    public WebElement forgotPassword;

    @FindBy(css = "[id='email_address']")
    public WebElement emailAddress;

    @FindBy(css = "[class='primary']")
    public WebElement resetMyPassword;

    @FindBy(css = "[class='page messages']")
    public WebElement resetSuccessMessage;
}

