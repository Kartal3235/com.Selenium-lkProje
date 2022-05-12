package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class Locators {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // Amazona gidip nutella aratalım

        driver.get("https://www.amazon.com");
        // findElement==> istediğimiz wwebelemnti bize döndürür.
      WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));// Sürücü arama kutusunu bulup getirecek bize
                                                         // Ama bizde bunu bir yere atayalım

        // Eğer yanlış id locate edilirse;NoSuchElementException hatası oluşur.


        //WebElement aramaKutusu=driver.findElement(By.className("nav-search-field "));//bu locators çalışmadı
        // Locator alırken gözümüzden kaçan detaylat olabilir.
        // aldığımız locator çalışmazsa alternatif locatorlar denemeliyiz

        // Webelementine istediğimiz bir yazıyı göndermek istersek;
        aramaKutusu.sendKeys("Nutella"+Keys.ENTER);



        /*<input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto"
        tabindex="0" aria-label="Search">
         */


    }
}
