package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class find_Elements {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon sayfasında kaçtane link olduğunu yazdıralım(Linkler olduğu için List oluşturacağız)
      driver.get("https://trendyol.com");
        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));// linklerin tag'ı "a" olduğu için
                                                                         // tagName==>"a" yazılır.
        System.out.println("Sayfadki link sayısı: "+linkListesi.size());
    }
}
