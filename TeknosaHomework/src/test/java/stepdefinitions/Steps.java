package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.ChooseStorePage;
import pages.HomePage;

public class Steps {

    HomePage page = new HomePage();

    @Given("Bildirim kabul edilir")
    public void bildirimKabulEdilir(){
        page.kabulEdilir();
    }

    @When("Sayfa asagiya kaydirilir")
    public void sayfaAsagiyaKaydirilir() {
        page.sayfaScrollYapilir();
    }

    @And("Magazalarimiz butonuna basilir")
    public void magazalarimizButonunaBasilir() {
        page.magazalarimizaTiklanir();
    }

}



