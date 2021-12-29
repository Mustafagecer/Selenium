package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
        /*<input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt"
         name="email" id="email" tabindex="0" placeholder="E-Mail-Adresse oder Telefonnummer"
          value="" autofocus="1" autocomplete="username" aria-label="E-Mail-Adresse oder Telefonnummer">
         */

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Find Email box Write to Ali

        WebElement mailTextBox=driver.findElement(By.id("email"));
        mailTextBox.sendKeys("alicancan@gmail.com");

        Thread.sleep(3000);
        mailTextBox.clear();

   //     WebElement mailKutusuTagNameIle=driver.findElement(By.tagName("Input"));
     //   mailKutusuTagNameIle.sendKeys("veli@gmail.com");//Input Unique elemnt olmadigi icin buraya birsey yazmadi
//Input tagname 6 tane bulundugu icin hangisine veri girecegini bilemiyor.

        //YAnlis elemanla islem yapiyoruz
//        WebElement yanlisElement=driver.findElement(By.id("emailYanlis"));
  //      yanlisElement.sendKeys("yanlis eleman");

        //NoSuchElementException gordugumuzde hata veren satirdaki lacator gozden gecirilmeli

        WebElement girisButonu= driver.findElement(By.tagName("button"));

        //isDisplayed() ve isEnable=>Bir Webelementinin gorunur olup olmadigini kontrol eder
        System.out.println(girisButonu.isDisplayed());


        //--------------->Giris yap butonuna tiklayalim
        girisButonu.click();










        Thread.sleep(3000);
        driver.close();



    }
}
