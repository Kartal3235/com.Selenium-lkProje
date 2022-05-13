package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath_Ornk {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);

        //Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String baslık=driver.getTitle();
        String istenenbaslık="Spend less";
        if(baslık.contains(istenenbaslık)){
            System.out.println("istenen baslık PASSED");
        }else {
            System.out.println("istenen baslık failed"+baslık);
        }
        //Gift Cards sekmesine basin
        driver.findElement(By.xpath("//a[@tabindex='0'][4]")).click();
        //Birthday butonuna basin
        driver.findElement(By.xpath("//span[text()='Birthday']")).click();
        //Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]")).click();
        driver.findElement(By.xpath("(//img[@alt='Amazon.com eGift Card'])[1]")).click();
        //Gift card details’den 25 $’i secin
        WebElement secilenILkUrun=driver.findElement(By.xpath("(//button[@id='gc-mini-picker-amount-1'])[1]"));

        //Urun ucretinin 25$ oldugunu test edin
      

        //Sayfayi kapatin

        /*
       <img alt="Amazon.com eGift Card" src="https://images-na.ssl-images-amazon.com/images/I/41zRJ1VZdYL._AC_UL604_SR604,400_.jpg"
       class="a-dynamic-image p13n-sc-dynamic-image p13n-product-image" height="200px"
       data-a-dynamic-image="{&quot;https://images-na.ssl-images-amazon.com/images/I/41zRJ1VZdYL._AC_UL302_SR302,200_.jpg&quot;:[302,200],&quot;https://images-na.ssl-images-amazon.com/images/I/41zRJ1VZdYL._AC_UL604_SR604,400_.jpg&quot;:[604,400],&quot;https://images-na.ssl-images-amazon.com/images/I/41zRJ1VZdYL._AC_UL906_SR906,600_.jpg&quot;:[906,600]}"
       style="max-width:302px;max-height:200px">
         */

    }
}
