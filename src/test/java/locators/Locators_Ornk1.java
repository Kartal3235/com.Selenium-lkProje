package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators_Ornk1 {
    public static void main(String[] args) {
        /*
 	Ayrıca yarın yapılabilirse tekrar zoomunda 1. Bir class oluşturun :
    AmazonSearchTest
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a
    .google web sayfasına gidin. https:// amazon .
    b. Search(ara) “city bike”
    c.
    Amazon 'da görüntülenen ilgili sonuçların sayısını yazdırın
    d. “Shopping” e tıklayın.
    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın. sorusunu çözelim derim.
         */
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.google.com");
        WebElement aramaKutusu=driver.findElement(By.name("q"));
        aramaKutusu.sendKeys("amazon"+ Keys.ENTER);
        //Amazonun içine girecez
        WebElement aramaKutusu1=driver.findElement(By.className("d8lRkd"));
       aramaKutusu1.click();

    }
}
