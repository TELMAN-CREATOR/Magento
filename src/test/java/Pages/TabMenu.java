package Pages;

import Utility.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class TabMenu extends ParentPage {
        public WebElement women;
        public WebElement men;
        public WebElement gear;
        public WebElement training;

        public TabMenu() {
            PageFactory.initElements(GWD.getDriver(), this);
        }
    }

