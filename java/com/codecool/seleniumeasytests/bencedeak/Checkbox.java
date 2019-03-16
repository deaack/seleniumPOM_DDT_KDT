package com.codecool.seleniumeasytests.bencedeak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkbox {

    WebDriver driver;

    public Checkbox(WebDriver driver) {
        this.driver = driver;
    }

    public boolean tickInCheckboxes(){
        driver.findElement(By.id("isAgeSelected")).click();
        boolean isCheckboxMessagePresent = driver.findElement(By.id("txtAge")).isDisplayed();
        return isCheckboxMessagePresent;
    }
}
