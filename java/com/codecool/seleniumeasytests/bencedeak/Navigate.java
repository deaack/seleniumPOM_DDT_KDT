package com.codecool.seleniumeasytests.bencedeak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigate {

    WebDriver driver;
    String baseURL;
    WebDriverWait webDriverWait;

    public Navigate(WebDriver driver, String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
        webDriverWait = new WebDriverWait(driver,5);
    }

    public String navigateToBaseURL(){
        driver.get(baseURL);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a"));
        return element.getText();
    }

    public String navigateToInputForms(){
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[1]")));
        return driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[1]")).getText();
    }

    public void navigateToCheckboxes(){
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a")).click();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("isAgeSelected")));
    }


}
