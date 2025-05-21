package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddressPage {
    WebDriver driver;

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddNewAddress() {
        driver.findElement(By.linkText("Add New Address")).click();
    }

    public void fillAddressForm(String firstname, String lastname, String street, String city, String postcode, String country, String phone) {
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys(firstname);

        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys(lastname);

        driver.findElement(By.name("street[0]")).sendKeys(street);
        driver.findElement(By.id("city")).sendKeys(city);

        Select countryDropdown = new Select(driver.findElement(By.id("country")));
        countryDropdown.selectByVisibleText(country);

        driver.findElement(By.id("zip")).sendKeys(postcode);
        driver.findElement(By.id("telephone")).sendKeys(phone);
    }

    public void saveAddress() {
        driver.findElement(By.cssSelector("button.save")).click();
    }

    public void verifySuccessMessage() {
        Assert.assertTrue(driver.getPageSource().contains("You saved the address."));
    }
}


