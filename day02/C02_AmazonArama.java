package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) throws InterruptedException {

        //Amazon web sayfasina girip java icin arama yap ve bulunan sonuclari yazdir

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
 //       driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java");
 //       driver.findElement(By.id("nav-search-submit-button")).click();


        //Yada Java yazdirdiktan sonra enter codunu girebiliriz
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Java"+ Keys.ENTER);

        WebElement sonuclar=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonuclar.getText());//Web elemntler obje oldugu icin direkt yazdirilamazlar.
        // Bunu string olarak yazdirabilmemiz icin getText() methodu kullanilir


        Thread.sleep(3000);
        driver.close();
    }
}
