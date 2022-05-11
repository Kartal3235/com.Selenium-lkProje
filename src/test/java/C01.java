import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.trendyol.com/");
       String sayfaKaynağı=driver.getPageSource();
       String istenenKelime="Homepage";

       if(sayfaKaynağı.contains("Homepage")){
           System.out.println("kaynak kod PASSED");
       }else{
           System.out.println("kaynak kod FAİLED");
       }

       Thread.sleep(3000);
       driver.close();

    }
}
