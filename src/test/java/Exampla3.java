import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampla3 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        String baslık=driver.getTitle();
        String istenenBaslık="facebook";
        if(baslık.contains(istenenBaslık)){
            System.out.println("istenen baslık PASSED");
        }else{
            System.out.println("istenen baslık FAİLED "+baslık);
        }
        String actualUrl=driver.getCurrentUrl();
        String istenenUrl="facebook";
        if (actualUrl.contains(istenenUrl)){
            System.out.println("istenen url PASSED");
        }else{
            System.out.println("istenen Url FAİLED "+actualUrl);
        }
        driver.get("https://www.walmart.com");
        String actualbaslık=driver.getTitle();
        String istenenBaslık1="Walmart.com";
        if (actualbaslık.contains(istenenBaslık1)){
            System.out.println("istenenBaslık1 testi PASSED");
        }else{
            System.out.println("istenenbaslık1 testi FAİLED");
        }
        driver.navigate().back();
      Thread.sleep(3000);
      driver.navigate().refresh();
      driver.manage().window().maximize();
      Thread.sleep(3000);
      driver.close();
    }
}
