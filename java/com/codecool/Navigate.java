package com.codecool;

import org.openqa.selenium.WebDriver;

public class Navigate {

    WebDriver driver;
    String baseURL;

    public Navigate(WebDriver driver, String baseURL) {
        this.driver = driver;
        this.baseURL = baseURL;
    }

    public void navigateToBaseURL(){
        driver.get(baseURL);
    }

}
