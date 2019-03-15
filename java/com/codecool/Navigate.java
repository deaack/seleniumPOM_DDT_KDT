package com.codecool;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigate {

    WebDriver driver;
    String baseURL;

    public Navigate(WebDriver driver, String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
    }

    public String navigateToBaseURL(){
        driver.get(baseURL);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")));
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a"));
        return element.getText();
    }

    public String navigateToAllExamples(){
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[1]/a")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[1]")));
        return driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[1]")).getText();
    }

}
