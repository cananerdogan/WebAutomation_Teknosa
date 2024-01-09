package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchHeadsetPage;

import static utilities.Driver.driver;

public class SearchHeadsetSteps {

    SearchHeadsetPage searchHeadsetPage = new SearchHeadsetPage();


    @When("Arama ikonuna basilir")
    public void aramaIkonunaBasilir() {
        searchHeadsetPage.clickSearchButton();
    }

    @Then("Arama kutusuna {string} yazilir")
    public void aramaKutusunaYazilir(String data) {
        searchHeadsetPage.sendKeysToSearchArea(data);
    }


    @Then("Bluetooth Kulaklika tiklanir")
    public void bluetoothKulaklikaTiklanir() {
        searchHeadsetPage.selectBluetoothCategory();
    }

    @Then("Favori Kategorisine tiklanir")
    public void favoriSecilir() {
        searchHeadsetPage.selectBestSellerCategory();
    }

    @Then("Ilk Urun Secilir ve Sepete Eklenir")
    public void ilkUrunSecilirveSepeteEklenir() {
        searchHeadsetPage.selectItemFromGrid(0);
        searchHeadsetPage.clickAddToCartButton();
    }

    @Then("Alisverise Devam Edilir")
    public void alisveriseDevamEdilir() {
        searchHeadsetPage.continueShopping();
        driver.navigate().back();
    }

    @Then("Son Urun Secilir ve Sepete Eklenir")
    public void sonUrunSecilirveSepeteEklenir() {
        searchHeadsetPage.selectLastItemFromGrid();
        searchHeadsetPage.clickAddToCartButton();
    }

    @Then("Sepete Gidilir")
    public void sepeteGidilir() {
        searchHeadsetPage.clickBasketButton();
            }

    @Then("Ucuz urunun sayisi arttirilir")
    public void ucuzUrununSayisiniArttir() {
        searchHeadsetPage.increaseCheaperItemCount();
    }

    @Then("Alisveris Bitirilir")
    public void alisverisBitirilir() {
        searchHeadsetPage.clickFinishShopping();
    }
    @Then("Uye Olmadan Devam Edilir")
    public void uyeOlmadanDevamEdilir() {
        searchHeadsetPage.clickContinueWithoutLogin();
    }
    @Then("Eposta Adresi {string} Girilir")
    public void epostaAdresiGirilir(String data) {
        searchHeadsetPage.addKeyToEmailAdressArea(data);
    }
}