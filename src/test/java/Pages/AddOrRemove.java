package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddOrRemove {

    public AddOrRemove() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='search']")
    public WebElement search;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement call;

    @FindBy(xpath = "//form[@data-role='tocart-form']")
    public WebElement add;

    @FindBy(css = "[class='swatch-option text'][id='option-label-size-143-item-175']")
    public WebElement body;

    @FindBy(css = "[id='option-label-color-93-item-50']")
    public WebElement colour;

    @FindBy(css = "[id='product-addtocart-button']")
    public WebElement add2;

    @FindBy(css = "[class='action showcart']")
    public WebElement mycart;

    @FindBy(css = "[class='action delete']")
    public WebElement delete;

    @FindBy(css = "[class='action-primary action-accept']")
    public WebElement ok;

    @FindBy(css = "[class='subtitle empty']")
    public WebElement message;















}
