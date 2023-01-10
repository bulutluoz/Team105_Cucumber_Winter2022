package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /* Driver class'indan driver'i getDriver() ile kullaniyoruz
       Sonradan projeye katilan insanlarin Driver class'indan obje olusturarak
       driver kullanmaya calismalarini engellemek icin

       Driver class'ini SINGLETON PATERN ile duzenleyebiliriz

       Bunun icin Driver class'inin parametresiz constructor'ini olusturup
       access modifier'ini PRIVATE yapmamiz yeterli olur.
     */

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){

        String browser= ConfigReader.getProperty("browser");
        if(driver==null) {

            switch (browser) {

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;

                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver= new SafariDriver();
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }


            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;

    }

    public static void closeDriver(){

        if (driver != null){
            driver.close();
            driver=null;
        }

    }

    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }
}
