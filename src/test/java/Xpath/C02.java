package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        //Browseri tam sayfa yapin

        //Sayfayi “refresh” yapin
       driver.navigate().refresh();
        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
       WebElement spendLess=driver.findElement(By.xpath("//*[text()='Amazon.com. Spend less. Smile more.']"));
       if(spendLess.isDisplayed()){
           System.out.println("spend less testi PASSED");
       }else {
           System.out.println("spend less testi FAİLED");
       }

        //Gift Cards sekmesine basin
        driver.findElement(By.xpath("//*[text()='Gift Cards']")).click();

        //Birthday butonuna basin
        driver.findElement(By.xpath("//*[text()='Birthday']")).click();
        //Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("//*[text()='Tinggly']")).click();

        //Gift card details’den 25 $’i secin
        driver.findElement(By.xpath("//a[@class='a-link-normal sp_short_strip_adlink a-text-normal'")).click();
        //Urun ucretinin 25$ oldugunu test edin

        //Sayfayi kapatin



    }
}
