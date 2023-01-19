package pages;

import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;

    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public List<WebElement>  sonucUrunIsimElementleriList;

    @FindBy(xpath = "//span[@class='a-price']")
    public List<WebElement> aramaSonucDetayliIsimElementleriList;

}
