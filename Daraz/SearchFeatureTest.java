package Daraz;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class SearchFeatureTest {

    @Test
    public void searchDigitalWatch() {
        WebDriver driver = Base.getDriver();
        driver.get("https://www.daraz.com.bd/#");
        driver.findElement(By.id("q")).sendKeys("digital watch");
        driver.findElement(By.className("search-box__button--1oH7")).click();

        //verify product displays 40 or not
        int productImageCount = driver.findElements(By.xpath("//img[@type='product']")).size();
        //System.out.println("Total number of product images: " + productImageCount);
        
        Assert.assertEquals(40, productImageCount);
        driver.quit();
    }
}
