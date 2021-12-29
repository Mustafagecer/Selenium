package com.myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_Verify_page_Title {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.de/");
        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("The title and actual result are same, Test passed");
        }else {
            System.out.println("The title and actual result are not same, Test failed");
            System.out.println("Actual title is: "+driver.getTitle());
        }

        driver.close();
    }
}
