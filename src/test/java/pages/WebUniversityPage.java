package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h1[text() ='LOGIN PORTAL']")
    public WebElement loginPortalButonu;


    @FindBy(id = "text")
    public WebElement userNameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id = "login-button")
    public WebElement loginButonu;

    @FindBy(xpath = "//h1[text()='CONTACT US']")
    public WebElement contactUsLinki;
}
