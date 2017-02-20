package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by THOODI on 2/16/2017.
 */
public class Firefox_Browser {
    public static void main(String[] args)  {

        WebDriver driver =  new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/" + "/");
        WebElement element= driver.findElement(By.name("q"));
        CharSequence cs1 =  "Cheese";
        element.sendKeys(cs1);
        element.submit();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
