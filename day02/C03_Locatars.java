package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locatars {
    public static void main(String[] args) throws InterruptedException {
        /*
        1. Bir class oluşturun: LocatorsIntro
        2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed©gmail.com oldugunu dogrulayin(verify).
        f. "Addresses" ve "Sign Out" textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */


        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com");

        Thread.sleep(3000);

        //linklerde tag elemnt olarak By.linkText ide kollunabiliriz
        WebElement SignIn=driver.findElement(By.linkText("Sign in"));
        SignIn.click();

        Thread.sleep(3000);

        WebElement e_mail=driver.findElement(By.id("session_email"));
        e_mail.sendKeys("testtechproed@gmail.com");

        WebElement password=driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!"+ Keys.ENTER);

        Thread.sleep(3000);

        WebElement expectedUserVerifing=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[2]/span"));
        if(expectedUserVerifing.getText().equals("testtechproed@gmail.com")){
            System.out.println("Expected User is true: "+expectedUserVerifing.getText());
        }else {
            System.out.println("Actual result is not same with Expected User ");
            System.out.println("Actual result is: "+expectedUserVerifing.getText());
        }

        WebElement verifingOfAdresses=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[2]"));
        if (verifingOfAdresses.isDisplayed()){
            System.out.println(verifingOfAdresses.getText()+" is Enable");
        }else {
            System.out.println(verifingOfAdresses.getText()+" is not Enable");
        }

        WebElement verifingOfSignOut=driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]/a[3]"));
        if (verifingOfSignOut.isDisplayed()){
            System.out.println(verifingOfSignOut.getText()+" is Enable");
        }else {
            System.out.println(verifingOfSignOut.getText()+" is not Enable");
        }

        //Sayfada kac tane link oldugunu bul ve neler oldugunu yazdir
        List<WebElement> links =driver.findElements(By.tagName("a"));
        System.out.println("The number of links: "+links.size());



        for (WebElement w:links
             ) {
            System.out.println("The list of links is: "+w.getText().toString());

        }






        Thread.sleep(3000);
        driver.close();

    }
}
