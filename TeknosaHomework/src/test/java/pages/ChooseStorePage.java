package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class ChooseStorePage {

    public ChooseStorePage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public static final By il = By.xpath("//select[@id='cities1']");
    public static final By ilce = By.xpath("//select[@id='towns']");


    public static void ilSecilir()  {
        Action.clickElement(il);
        Action.sendKeysElement(il, "Ankara");
        Action.pressEnter(il);
    }

    public static void ilceSecilir() {
        Action.clickElement(ilce);
        Action.sendKeysElement(ilce, "Yenimahalle");
        Action.pressEnter(ilce);
    }


}
