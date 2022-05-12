package locatorsWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01 {
    /*
    Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //    b. Sign in butonuna basin
        WebElement signInButon=driver.findElement(By.id("sign-in"));
        signInButon.click();
        //    c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInBotton=driver.findElement(By.name("commit"));

        //    d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInBotton.click();
        //    e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        String expectedKullanıcıAdı="testtechproed@gmail.com";
        WebElement actualKullanıcıAdı=driver.findElement(By.className("navbar-text"));
        System.out.println(actualKullanıcıAdı.getText());

        if(expectedKullanıcıAdı.equals(actualKullanıcıAdı.getText())){
            System.out.println("istenen kullanıcı adı PASSED");
        }else{
            System.out.println("istenen kullanıcı adı FAİLED");
        }


        //    f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressestext=driver.findElement(By.linkText("Addresses"));
        WebElement signOuttext=driver.findElement(By.linkText("Sign out"));

        if(adressestext.isDisplayed()){
            System.out.println("adresses testi PASSED");
        }else {
            System.out.println("adresses testi FAİLED");
        }
        if(signOuttext.isDisplayed()){
            System.out.println("signout testi PASSED");
        }else{
            System.out.println("signout testi FAİLED");
        }


        //    3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println(linklerListesi.size());

        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());
        }

    }
}
