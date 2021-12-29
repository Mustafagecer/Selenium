package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Homework {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.youtube.com/");
        String expectedTitle="Youtube";
        String actualTitle=driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Expected Result and Actual Result are same");
        }else {
            System.out.println("Expected Result and Actual Result are not same");
            System.out.println("Actual Result is: "+driver.getTitle());
        }
        String expectedPart="youtube";
        String actualUrl=driver.getCurrentUrl();

        if (actualTitle.contains("youtube")){
            System.out.println("Url contains 'youtube'"+driver.getCurrentUrl());

        }else{
            System.out.println(driver.getCurrentUrl());
        }

        driver.navigate().to("https://www.linkedin.com/");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        String ExpectedTitle="Linkedin";

        if (expectedPart.equals(driver.getTitle())){
            System.out.println("The title is "+expectedPart);
        }else {
            System.out.println("The Title does not cointain 'Linkedin'");
            System.out.println("The Title is: "+driver.getTitle());
        }

        String expectedUrl1="https://www.linkedin.com/";

        if (expectedUrl1.equals(driver.getCurrentUrl())){
            System.out.println("The expected Url and Actual Url are same");
        }else {
            System.out.println("The expected Url and Actual Url are not same");
            System.out.println("The actual Url is: "+driver.getCurrentUrl());
        }
        driver.quit();

    }
}
