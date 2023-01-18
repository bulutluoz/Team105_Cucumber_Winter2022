package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.Guru99Page;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Guru99Stepdefinitions {

    Guru99Page guru99Page=new Guru99Page();
    List<String> companyListStr;

    @Given("guru99 cookies kabul eder")
    public void guru99_cookies_kabul_eder() {

        Driver.getDriver().switchTo().frame(guru99Page.cookiesIframe);
        guru99Page.acceptCookies.click();
    }
    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        List<WebElement> companyElementList = guru99Page.companyElementList;
        companyListStr = ReusableMethods.getElementsText(companyElementList);
        System.out.println(companyListStr);
    }
    @Then("{string} in listede oldugunu test eder")
    public void in_listede_oldugunu_test_eder(String istenenCompany) {

        Assert.assertTrue(companyListStr.contains(istenenCompany));
    }

}
