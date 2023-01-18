package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationExercisePage;
import utilities.Driver;

public class AutomationExerciseStepdefinitions {

    AutomationExercisePage automationExercisePage= new AutomationExercisePage();
    String kullaniciEmail;
    String kullaniciIsim;
    String password;
    Faker faker= new Faker();
    Actions actions;

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
        actions= new Actions(Driver.getDriver());
        password=faker.internet().password();

        actions.click(automationExercisePage.mrRadioButonu)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(password)
                .sendKeys(Keys.TAB)
                .sendKeys("10")
                .sendKeys(Keys.TAB)
                .sendKeys("January")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(kullaniciIsim)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.company().name())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("United States")
                .sendKeys(Keys.TAB)
                .sendKeys("Texas")
                .sendKeys(Keys.TAB)
                .sendKeys("Dallas")
                .sendKeys(Keys.TAB)
                .sendKeys("06123")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();




    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        automationExercisePage.createAccountButonu.click();
    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {

        Assert.assertTrue(automationExercisePage.accountCreatedYaziElementi.isDisplayed());


    }

}
