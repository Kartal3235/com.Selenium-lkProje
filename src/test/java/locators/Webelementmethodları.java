package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Webelementmethodları {
    public static void main(String[] args) {

        /*
        Amazon.com'a gidip arama kutusunu locate edin
        arama kutusunun tagname'inin input olduğunu test edin
        arama kutusunun nameattribute'nun değerini.....olduğunu test edin
         */

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        //        arama kutusunun tagname'inin input olduğunu test edin
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();
        if (expectedTagName.equals(actualTagName)){
            System.out.println("istenen tagname testi PASSED");
        }else{
            System.out.println("istenen tagname testi FAİLED");
        }
        //        arama kutusunun nameattribute'nun değerini.....olduğunu test edin
        String expectedNameAttribute="field-keywords";
        String actualNameAttribute=aramaKutusu.getAttribute("name");
        if (expectedNameAttribute.equals(actualNameAttribute)){
            System.out.println("nameAttribute testi PASSED");
        }else{
            System.out.println("nameattribute testi FAİLED");
        }

    }
}
