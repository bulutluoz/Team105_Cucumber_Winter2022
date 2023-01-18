package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {

    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-lock']")
    public WebElement signUpLinki;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement isimKutusu;

    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailKutusu;

    @FindBy(xpath = "//button[text()='Signup']")
    public WebElement signUpButonu;

    @FindBy(xpath = "//input[@id='id_gender1']")
    public WebElement mrRadioButonu;

    @FindBy(xpath = "//*[text()='Create Account']")
    public WebElement createAccountButonu;

    @FindBy(xpath = "//b[text()='Account Created!']")
    public WebElement accountCreatedYaziElementi;
}
