package org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_FindByLinkText {

    public static void main(String[] args) throws Exception {
        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String baseURL = "https://letskodeit.teachable.com/";
        driver.get(baseURL);

        driver.findElement(By.linkText("Login")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Pract")).click();
    }
}
