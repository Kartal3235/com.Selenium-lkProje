import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exampla2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        System.out.println("Sayfanın konum: "+driver.manage().window().getPosition());
        System.out.println("Sayfanın boyut: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        System.out.println("maximize konumu: "+driver.manage().window().getPosition());
        System.out.println("maximize boyutları: "+driver.manage().window().getSize());
        Thread.sleep(3000);

        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.com");
        System.out.println("Fullscreen boyutları: "+driver.manage().window().getPosition());
        System.out.println("Fullscreen boyutları: "+driver.manage().window().getSize());

        driver.close();

    }
}
