package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class C02_SssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement eMail=  driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input"));
        eMail.sendKeys("ali");

        Thread.sleep(2000);

        //css selector ile bulmak bazen imkansiz bazen hatali oldugundan pek tercih edilmiyor
        WebElement password=driver.findElement(By.cssSelector("#session_password"));
        password.sendKeys("veli"+ Keys.ENTER);








        Thread.sleep(3000);
        driver.close();

    }
}
