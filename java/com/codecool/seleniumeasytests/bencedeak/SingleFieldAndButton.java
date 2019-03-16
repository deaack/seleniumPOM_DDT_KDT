package com.codecool.seleniumeasytests.bencedeak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleFieldAndButton {

    WebDriver driver;

    public SingleFieldAndButton(WebDriver driver) {
        this.driver = driver;
    }

    public String enterMessageIntoSingleInputForm(String inputMessage){
        driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys(inputMessage);
        driver.findElement(By.xpath("//*[@id=\"get-input\"]/button")).click();
        String expectedMessage = driver.findElement(By.id("display")).getText();
        return expectedMessage;
    }
}
