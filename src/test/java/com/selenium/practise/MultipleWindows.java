package com.selenium.practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.Set;

/**
 * Created by THOODI on 2/21/2017.
 */
public class MultipleWindows {
    public static WebDriver driver;

    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.get("http://www.naukri.com/");
        System.out.println("CurrentWindowTitle:" + driver.getTitle());
        // To get the main window handle
        String mainWindowHandle = driver.getWindowHandle();
        Assert.assertTrue(closeAllOtherWindows(mainWindowHandle));
    }
    public String getMainWindowHandle(WebDriver driver) {
        return driver.getWindowHandle();
    }

    public static boolean closeAllOtherWindows(String mainWindowHandle) {
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println("Number of windows:" + allWindowHandles.size());
        for (String currentWindowHandle : allWindowHandles) {
            if (!currentWindowHandle.equals(mainWindowHandle)) {
                driver.switchTo().window(currentWindowHandle);
                driver.close();
            }
        }
        driver.switchTo().window(mainWindowHandle);
        if (driver.getWindowHandles().size() == 1) {
            System.out.println("Only main window left");
            return true;
        }
            else
            {
                return false;
            }
        }
}



