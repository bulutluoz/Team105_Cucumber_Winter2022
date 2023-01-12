package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

public class WebUniversityStepdefinitions {
    WebUniversityPage webUniversityPage= new WebUniversityPage();
    String ilkSayfaHandleDegeri;

    @Then("Login Portal elementine kadar asagi iner")
    public void login_portal_elementine_kadar_asagi_iner() {
        // asagi inmeye gerek kalmadi
    }
    @Then("Login Portal a tiklar")
    public void login_portal_a_tiklar() {
        ilkSayfaHandleDegeri= Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalButonu.click();
    }
    @Then("Acilan yeni window a gecer")
    public void acilan_yeni_window_a_gecer() {
        // eger yeni window'a geciyorsa , yeni window acilmadan
        // ilk sayfanin window handle degerini kaydetmeliyiz

        Set<String> windowHandlesSeti= Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri="";

        for (String each : windowHandlesSeti) {
            if (!each.equals(ilkSayfaHandleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);

    }
    @Then("username kutusuna deger yazar")
    public void username_kutusuna_deger_yazar() {

    }
    @Then("password kutusuna deger yazar")
    public void password_kutusuna_deger_yazar() {

    }
    @Then("webunuversity login butonuna basar")
    public void webunuversity_login_butonuna_basar() {

    }
    @Then("Popup ta cikan yazinin validation failed oldugunu test eder")
    public void popup_ta_cikan_yazinin_validation_failed_oldugunu_test_eder() {

    }
    @Then("OK diyerek popup i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

    }
    @Then("ilk sayfaya geri doner")
    public void ilk_sayfaya_geri_doner() {

    }
    @Then("ilk sayfaya dondugunu test eder")
    public void ilk_sayfaya_dondugunu_test_eder() {

    }
}
