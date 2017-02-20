package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

/**
 * Created by THOODI on 2/18/2017.
 */
public class Google_Cheese {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com/" + "/");
        driver.findElement(By.id("lst-ib")).clear();
        driver.findElement(By.id("lst-ib")).sendKeys("cheese");
        driver.findElement(By.id("_fZl")).click();
        int i = 0;
        do {
           WebElement x = driver.findElement(By.xpath("//span[text()='Next']"));
            Actions Act = new Actions(driver);
            Act.moveToElement(x).build().perform();
            x.click();
            i++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                  System.out.println("Running "+ i);
        }while(i<5);
        }
    }

