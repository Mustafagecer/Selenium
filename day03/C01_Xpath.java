package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Xpath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        //<button onclick="addElement()">Add Element</button>  Bu elementten sadece bir tane var onun icin
        //bircok yolla lacate edebiliriz
        //WebElement addButton=driver.findElement(By.tagName("button"));
        //WebElement addButton=driver.findElement(By.xpath("button"));
        //WebElement addButton=driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButton=driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButton=driver.findElement(By.xpath("//button[@onclick='addElement()']"));

        addButton.click();

        WebElement deteteButonu=driver.findElement(By.xpath("//button[@onclick=\"deleteElement()\"]"));
        if (deteteButonu.isEnabled()){
            deteteButonu.click();
        }else {
            System.out.println("There is no Delete Element");
        }
        /*
        //Delete tusu kaybolduktan sonra onunla ilgili islem yapmaya calisirsak hata verir. StaleElementReferenceException hatasi vardi ama artik yok hatasidir
        Thread.sleep(2000);
        if (deteteButonu.isEnabled()){
            System.out.println("There is Delete Element");
        }else {
            System.out.println("There is no Delete Element");
        }*/



        Thread.sleep(3000);
        driver.close();
    }
}
