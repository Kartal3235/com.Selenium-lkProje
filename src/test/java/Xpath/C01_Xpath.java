package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
       // 2-Add Element butonuna basin
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
       // 3-Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteGorunur=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
        if (deleteGorunur.isDisplayed()){
            System.out.println("delete testi PASSED");
        }else {
            System.out.println("delete testi FAİLED");
        }
        Thread.sleep(3000);
        //4-Delete tusuna basin
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();

        //5-Add/Remove Elements ” yazisinin gorunur oldugunu test edin

        WebElement addRemoveYazısı=driver.findElement(By.xpath("//h3"));
        if (addRemoveYazısı.isDisplayed()){
            System.out.println("addRemove testi PASSED");
        }else {
            System.out.println("addRemove testi FAİLED");
        }

    }
}
