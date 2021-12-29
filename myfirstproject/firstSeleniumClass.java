package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        System.out.println("suandaki url: "+driver.getCurrentUrl());
        System.out.println("Title: "+driver.getTitle());
        Thread.sleep(3000);

        driver.navigate().to("https://www.youtube.com/watch?v=UCzZg5IFz30");
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);

        //driver.quit(); seklemelerin hepsini kapat
        driver.close();//mevcut sekmeyi kapatir



    }
}
