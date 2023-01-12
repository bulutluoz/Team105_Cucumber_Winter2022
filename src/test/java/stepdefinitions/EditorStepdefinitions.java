package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepdefinitions {
    EditorPage editorPage= new EditorPage();
    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();
    }
    @Then("First name kutusuna {string} yazar")
    public void first_name_kutusuna_yazar(String firstName) {
        editorPage.firstName.sendKeys(firstName);
    }
    @Then("Last name kutusuna {string} yazar")
    public void last_name_kutusuna_yazar(String lastName) {
        editorPage.lastName.sendKeys(lastName);
    }
    @Then("position kutusuna {string} yazar")
    public void position_kutusuna_yazar(String position) {

        editorPage.position.sendKeys(position);
    }
    @Then("Office kutusuna {string} yazar")
    public void office_kutusuna_yazar(String office) {
        editorPage.office.sendKeys(office);
    }
    @Then("Extension kutusuna {string} yazar")
    public void extension_kutusuna_yazar(String extension) {
        editorPage.extension.sendKeys(extension);
    }
    @Then("Start date kutusuna {string} yazar")
    public void start_date_kutusuna_yazar(String startDate) {
        editorPage.startDate.sendKeys(startDate);
    }
    @Then("Salary kutusuna {string} yazar")
    public void salary_kutusuna_yazar(String salary) {
        editorPage.salary.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButonu.click();
    }
    @When("kullanici {string} ile arama yapar")
    public void kullanici_ile_arama_yapar(String firstName) {
        editorPage.searchKutusu.sendKeys(firstName+ Keys.ENTER);

    }
    @Then("isim bolumunde {string} oldugunu dogrular")
    public void isim_bolumunde_oldugunu_dogrular(String firstName) {
        String actualIlkIsimStr= editorPage.ilkIsimElementi.getText();

        Assert.assertTrue(actualIlkIsimStr.contains(firstName));
    }
}
