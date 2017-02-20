package com.selenium.practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by THOODI on 2/18/2017.
 */
public class AmazonTests {
    private static WebDriver driver = null;
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Selenium");
        driver.findElement(By.xpath("//input[@type = \"submit\"]")).click();
        WebElement x = driver.findElement(By.xpath("//h2[@id='s-result-count']"));
        String [] res = x.getText().split(" ");
        System.out.println(res[2]);
        driver.close();
}
}

