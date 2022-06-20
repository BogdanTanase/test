package com.text.util;

import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverUtil {
    private static FirefoxDriver driver;

    private DriverUtil(){
    }

    public static FirefoxDriver getInstance(){
        if (driver == null){
            driver= new FirefoxDriver();
        }

        return driver;
    }
}
