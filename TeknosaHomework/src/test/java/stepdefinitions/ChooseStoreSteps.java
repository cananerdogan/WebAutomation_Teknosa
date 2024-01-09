package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import pages.ChooseStorePage;
import utilities.Driver;

public class ChooseStoreSteps {

    ChooseStorePage chooseStorePage = new ChooseStorePage();


    @And("Magaza Bulucudan <il> secimi yapilir")
    public void ilsecimiYapilir() {
        ChooseStorePage.ilSecilir();
    }

    @And("Magaza Bulucudan <ilce> secimi yapilir")
    public void ilcesecimiYapilir() {
        ChooseStorePage.ilceSecilir();
    }



}
