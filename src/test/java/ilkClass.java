import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ilkClass {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        /*
        1-https://www.amazon.com url'ine gidin
        2-Baslığın Amazon kelimesi içerdiğini test edin
        3-Url'nin "https://www.amazon.com" a esit olduğunu test edin
        4-Sayfayı kapatın.
         */

        //1-https://www.amazon.com url'ine gidin

        driver.get("https://www.amazon.com");

        // 2-Baslığın Amazon kelimesi içerdiğini test edin

        String baslık=driver.getTitle();
        String istenenKelime="Amazon";
        if(baslık.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAİLED");
        }

        //3-Url'nin "https://www.amazon.com" a esit olduğunu test edin

        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com/";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url testi FAİLED");
        }
        //4-Sayfayı kapatın.
        driver.close();





    }

}
