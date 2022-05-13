package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //1 ) Bir class oluşturun : Locators_css
        //2
        //Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");
        //b. Locate email textbox
        WebElement emailBox=driver.findElement(By.id("session_email"));

        //c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        //d. Locate signin button
        WebElement signInButon=driver.findElement(By.name("commit"));
        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini
        //tıklayın
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailBox.sendKeys("testtechproed@gmail.com"+ Keys.ENTER);
        passwordTextBox.sendKeys("Test1234!"+Keys.ENTER);
        signInButon.click();
        //NOT: cssSelector





    }
}
