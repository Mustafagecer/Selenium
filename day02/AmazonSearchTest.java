package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Bir class oluşturun : AmazonSearchTest
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a.Amazon web sayfasına gidin. https://www. amazon.com/
        b. Search(ara) "city bike"
         c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        d. "Shopping" e tıklayın.
         e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();

        Thread.sleep(1000);
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("city bike"+ Keys.ENTER);

        Thread.sleep(3000);
        //WebElement numberOfResult=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div"));
        //System.out.println("Number Of Result is: "+numberOfResult.getText());

        Thread.sleep(3000);
        WebElement theFirstResult=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img"));
        theFirstResult.click();

        Thread.sleep(3000);
        driver.close();




    }
}
