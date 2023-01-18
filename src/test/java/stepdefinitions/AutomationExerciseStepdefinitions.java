package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.AutomationExercisePage;

public class AutomationExerciseStepdefinitions {

    AutomationExercisePage automationExercisePage= new AutomationExercisePage();
    String kullaniciEmail;
    String kullaniciIsim;
    Faker faker= new Faker();

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
       automationExercisePage.signUpLinki.click();
    }
    @Given("user Create and account bolumune email adresi girer")
    public void user_create_and_account_bolumune_email_adresi_girer() {
        kullaniciEmail= faker.internet().emailAddress();
        kullaniciIsim=faker.name().firstName();

        automationExercisePage.isimKutusu.sendKeys(kullaniciIsim);
        automationExercisePage.emailKutusu.sendKeys(kullaniciEmail);

    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        automationExercisePage.signUpButonu.click();
    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {

    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {

    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {

    }

}
