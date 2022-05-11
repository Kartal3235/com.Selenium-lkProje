import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampla4 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com");
        String actualBaslık=driver.getTitle();
        String istenenBaslık="youtube";
        if(actualBaslık.contains(istenenBaslık)){
            System.out.println("istenen baslık testi PASSED");
        }else{
            System.out.println("istenen baslık testi FAİLED "+actualBaslık);
        }
        String actualUrl=driver.getCurrentUrl();
        String istenenUrl="youtube";
        if (actualUrl.contains(istenenUrl)){
            System.out.println("istenen Url testi PASSED");
        }else{
            System.out.println("istenen Url testi FAİLED "+actualUrl);
        }
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
         String actualtitle=driver.getTitle();
         String expectedTitle="Amazon";
         if (actualtitle.contains(expectedTitle)){
             System.out.println("istenen baslık testi PASSED");
         }else{
             System.out.println("istenen baslık testi FAİLED "+actualtitle);
         }

         String actualUrl1=driver.getCurrentUrl();
         String expectedUrl="https://www.amazon.com";
         if (actualUrl1.contains(expectedUrl)){
             System.out.println("istenen Url testi PASSED");
         }else{
             System.out.println("istenen url testi FAİLED "+actualUrl1);
         }

         Thread.sleep(3000);
         driver.close();
    }
}
