package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators_Yahoo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");
        WebElement sigInButon=driver.findElement(By.linkText("Sign in"));
        sigInButon.click();
        WebElement hesapOlustur=driver.findElement(By.linkText("Create an account"));
        hesapOlustur.click();
        WebElement fullName=driver.findElement(By.id("usernamereg-firstName"));
        fullName.sendKeys("bahadır"+Keys.ENTER);
        WebElement lastName=driver.findElement(By.id("usernamereg-lastName"));
        lastName.sendKeys("korkmaz");
        lastName.click();
        WebElement emailTextBox=driver.findElement(By.id("usernamereg-userId"));
        emailTextBox.sendKeys("baha_korkmaz@yahoo.com");
        emailTextBox.click();
        WebElement passwordtexBox=driver.findElement(By.id("login-body"));
        passwordtexBox.sendKeys("123456");
        passwordtexBox.click();
        WebElement birthYear=driver.findElement(By.id("usernamereg-birthYear"));
        birthYear.sendKeys("1984");
        birthYear.click();
        WebElement contınueButon=driver.findElement(By.id("reg-submit-button"));
        contınueButon.click();

    }
}
