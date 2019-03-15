package com.codecool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwoInputFields {

    WebDriver driver;

    public TwoInputFields(WebDriver driver) {
        this.driver = driver;
    }

    public int getTotalOfTwoInputFields(int sum1, int sum2){
        driver.findElement(By.id("sum1")).sendKeys(String.valueOf(sum1));
        driver.findElement(By.id("sum2")).sendKeys(String.valueOf(sum2));
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        String result = driver.findElement(By.id("displayvalue")).getText();
        return Integer.parseInt(result);
    }
}
