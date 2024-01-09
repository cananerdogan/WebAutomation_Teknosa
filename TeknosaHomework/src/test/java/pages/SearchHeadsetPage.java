package pages;

import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utilities.Action;
import utilities.Driver;

public class SearchHeadsetPage {

    public SearchHeadsetPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    public final By searchIcon = By.xpath("//button[@class='search-button js_search_button sbx-fake btn-search']");


    public final By searchText = By.xpath("//input[@id='search-input']");

    public final By bluetoothCheckBox = By.xpath("//input[@id='category0']");
    public final By bestSellerRadio = By.xpath("//input[@id='bestSellerPoint-desc']");
    public final By productsGrid = By.xpath("//div[@class='products']");
    public final By cartButton = By.xpath("//button[@id='addToCartButton']");
    public static final By continueShoppingButton = By.xpath("//a[@href='javascript:parent.$.colorbox.close()']");
    public final By basketButton = By.xpath("//a[@href='/sepet']");
    public final By basketItems = By.xpath("//div[@class='cart-rows']");
    public  final By finishShoppingButton = By.xpath("//a[@href=\"/sepet/checkout\"]");
    public  final By continueWithoutLoginButton = By.xpath("//a[@class=\"btn btn-outline-dark button-guestForm\"]");
    public  final By enterEmail = By.xpath("//input[@id='guest.email']");


    public void clickSearchButton() {
        Action.clickElement(searchIcon);
    }
    public void selectBluetoothCategory(){
        Action.selectCheckbox(bluetoothCheckBox);
    }
    public void selectBestSellerCategory(){
        Action.selectCheckbox(bestSellerRadio);
    }
    public void selectItemFromGrid(int index){
        Action.openChildLinkFromGrid(productsGrid,"product-item","prd-link",index);
    }
    public void clickAddToCartButton(){
        Action.scrollUntilVisible(cartButton);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Action.clickElement(cartButton);
    }
    public void continueShopping(){
        Action.clickElement(continueShoppingButton);
    }
    public void selectLastItemFromGrid(){
        Action.openLastChildLinkFromGrid(productsGrid,"product-item","prd-link");
    }
    public void increaseCheaperItemCount(){
        Action.increaseCountOfCheaperBasketItem(basketItems,"cart-row","prd-link");
    }
    public void sendKeysToSearchArea(String key) {
        Action.sendKeysElement(searchText,key);
        Action.pressEnter(searchText);
    }


    public void clickBasketButton(){
        Action.clickElement(basketButton);
    }

    public void clickFinishShopping(){
        Action.clickElement(finishShoppingButton);
    }
    public void clickContinueWithoutLogin(){
        Action.clickElement(continueWithoutLoginButton);
    }
    public void addKeyToEmailAdressArea(String key) {
        Action.sendKeysElement(enterEmail,key);
    }
}
