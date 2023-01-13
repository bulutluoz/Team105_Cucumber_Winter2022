package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
      plugin={"html:target/cucumber-reports-p2.html",
                "json:target/json-reports/cucumberp2.json",
                "junit:target/xml-report/cucumberp2.xml"
      },
      features = "src/test/resources/features" ,
      glue = "stepdefinitions" ,
      tags= "@p2",
      dryRun = false
)

public class ParalelRunner2 {
    /*
        Cucumber'da Runner class'i bos bir class'tir
        Runner class'ini diger class'lardan farkli kilan
        ve TestNG'deki xml dosyalari gibi calismasini saglayan
        2 adet notasyon mevcuttur

        @RunWith notasyonu projemize cucumber junit dependency eklememizin sebebibidir
        bu sayede runner class'larimiz cucumber ile calisir

        @CucumberOptions notasyonu ile istedigimiz ozellikleri Runner class'ina ekleyebiliriz
        Raporlama gibi ekstra option'lari da ileride ekleyecegiz
        Ancak
        oncelikli gorevi features dosyalari ile stepdefinitions'da bulunan
        Java method'larini ilisiklendirmektir

        tags : features classoru icerisinde yazilan tag(lari) aratip
        buldugu tum feature veya scenario'lari calistirir

        dryRun : iki deger alabilir
        true : secilirse, verilen tag ile isaretli olan Feature veya Scenario'daki
                eksik stepdefinitions'lari bulup
                ilgili method'lari olusturur
                Hic bir sekilde testimizi calistirmaz
                eksik adim yoksa test passed olarak isaretler

        false : secilirse, verilen tag ile isaretlenen
                Feature veya Scenario'lari calistirir
     */
}
