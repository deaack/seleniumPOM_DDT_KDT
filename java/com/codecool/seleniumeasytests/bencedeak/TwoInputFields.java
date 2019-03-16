package com.codecool.seleniumeasytests.bencedeak;

import com.codecool.seleniumeasytests.bencedeak.excelreader.ExcelReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TwoInputFields {

    WebDriver driver;
    ExcelReader excelReader;

    public TwoInputFields(WebDriver driver) {
        this.driver = driver;
    }

    public double getTotalOfTwoInputFields(double sum1, double sum2){
        driver.findElement(By.id("sum1")).sendKeys(String.valueOf(sum1));
        driver.findElement(By.id("sum2")).sendKeys(String.valueOf(sum2));
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        String result = driver.findElement(By.id("displayvalue")).getText();
        return Double.parseDouble(result);
    }
}
