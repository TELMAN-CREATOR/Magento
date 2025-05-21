package StepDefiniton;

import Pages.LoginPage;
import Pages.AddressPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAddress {
        WebDriver driver;
        LoginPage loginPage;
        AddressPage addressPage;

        @Given("Kullanıcı magento sitesine giriş yapar")
        public void kullanıcı_magento_sitesine_giriş_yapar() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://magento.softwaretestingboard.com/customer/account/login");

            loginPage = new LoginPage(driver);
            loginPage.login("john@example.com", "Passw0rd");
        }

        @When("My Account sayfasına gider")
        public void my_account_sayfasına_gider() {
            driver.get("https://magento.softwaretestingboard.com/customer/address/");
        }

        @And("Manage Address bağlantısına tıklar")
        public void manage_address_bağlantısına_tıklar() {
            addressPage = new AddressPage(driver);
            addressPage.clickAddNewAddress();
        }

        @And("Yeni adres ekler: {string}, {string}, {string}, {string}, {string}, {string}, {string}")
        public void yeni_adres_ekler(String ad, String soyad, String adres, String şehir, String postaKodu, String ülke, String telefon) {
            addressPage.fillAddressForm(ad, soyad, adres, şehir, postaKodu, ülke, telefon);
            addressPage.saveAddress();
        }

        @Then("Adres başarıyla eklenmiş olmalıdır")
        public void adres_başarıyla_eklenmiş_olmalıdır() {
            addressPage.verifySuccessMessage();
            driver.quit();
        }
    }

