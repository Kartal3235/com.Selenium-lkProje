package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Locators_Ornk {
    /*
    1. Bir class oluşturun: LoginTest
    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    a. http://a.testaddressbook.com adresine gidiniz.
    b. Sign in butonuna basin
    c
    . email textbox,password textbox, and signin button elementlerini locate
    d
    . Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
    i. Username :
    testtechproed@gmail.com
    ii. Password : Test1234!
    e. Expected user id nin
    testtechproed@gmail.com oldugunu dogrulayin(verify).
    f
    . “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
    3. Sayfada kac tane link oldugunu bulun.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Bir class oluşturun: LoginTest
        //    2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        //    b. Sign in butonuna basin
        WebElement signinLinki=driver.findElement(By.linkText("Sign in"));
        signinLinki.click();
        //    c
        //    . email textbox,password textbox, and signin button elementlerini locate
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signinButton=driver.findElement(By.name("commit"));
        //    d
        //    . Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign i n)buttonunu tıklayın:
        //    i. Username :
        //    testtechproed@gmail.com
        emailTextBox.sendKeys("testtechproed@gmail.com");
        //    ii. Password : Test1234!
        passwordTextBox.sendKeys("Test1234!");
        signinButton.click();
        //    e. Expected user id nin
        //    testtechproed@gmail.com oldugunu dogrulayin(verify).
    WebElement actualKullanıcıAdiElementi=driver.findElement(By.className("navbar-text"));

    //**actualKullanıcıElementinin data türü webelement'tir.
    // Bunu yazdırmak istediğimiz de getText() demek zorundayız.

        System.out.println(actualKullanıcıAdiElementi.getText());// webelementin uzerinde ne yazdığını görmek istersek
                                                                // webElementIsmi.getText() kullanırız
        String expectedKullanıcıAdıElementi="testtechproed@gmail.com";
    if(expectedKullanıcıAdıElementi.equals(actualKullanıcıAdiElementi.getText())){
        // expectedKullanıcıElemntinin data türü String'tir.
        // webElemnti ile Stringi karşılaştırma yapamayız
        // onun için webelementini getText() yapmak zorundayız
        System.out.println("İstenen Kullanıcı Adı testi PASSED");
    }else{
        System.out.println("istenen kullanıcı adı testi FAİLED");
    }
        //    f
        //    . “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adresseselemnti=driver.findElement(By.linkText("Addresses"));
        WebElement signOutelement=driver.findElement(By.linkText("Sign out"));
        if (adresseselemnti.isDisplayed()){
            System.out.println("adersses testi PASSED");
        }else{
            System.out.println("adresses testi FAİLED");
        }

        if (signOutelement.isDisplayed()){
            System.out.println("sign out testi PASSED");
        }else {
            System.out.println("sign out testi FAİLED");
        }

        //    3. Sayfada kac tane link oldugunu bulun.
       List< WebElement> linklerListesi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada linkler sayısı: "+linklerListesi.size());

        // Linkleri yazdıralım
        // direk sout yaparsak referansları verir.
        // Onun yerine foreach yapıp her bir link elementinin üzerindeki yazıyı yazdırmalıyız
        for (WebElement each:linklerListesi
             ) {
            System.out.println(each.getText());//bunların üzerindeki yazdırmak için getText() yaptık
        }
    }
}
