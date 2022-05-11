import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class manageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        /*
        **-implicitlywait-** bize sayfanın yuklenmesi ve sayfadaki elementlere ulaşım için beklenecek
        MAXİMUM süreyi belirleme olanagı tanır.
         */
        driver.manage().window().maximize();
        driver.get("https://www.primevideo.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
