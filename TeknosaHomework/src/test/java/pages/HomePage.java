package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public final By acceptNotifications = By.xpath("//div[@id='ins-editable-button-1580496494']");
    public final By storeIcon = By.xpath("(//a[@href='/magaza-bul'])[3]");


    public void kabulEdilir(){
        Action.clickElement(acceptNotifications);
    }

    public void sayfaScrollYapilir() {
        Action.scrollUntilVisible(storeIcon);
    }

    public void magazalarimizaTiklanir() {
        Action.pressEnter(storeIcon);
    }


}