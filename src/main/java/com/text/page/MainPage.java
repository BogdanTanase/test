package com.text.page;

import com.text.util.DriverUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainPage {
    FirefoxDriver driver = DriverUtil.getInstance();

    public void openMainPage() {
        driver.get("https://altex.ro/");
    }

    public void search(String input) {
        WebElement search = driver.findElement(By.cssSelector("input.jsx-941926444"));
        search.sendKeys(input);
    }

    public void pressSearchButton() {
        WebElement searchButton = driver.findElement(By.cssSelector("button.jsx-941926444:nth-child(4)"));
        searchButton.click();
    }

    public void searchPageWorked() {
        WebElement foundItem = driver.findElement(By.cssSelector("h1.font-normal"));
        Assert.assertTrue(foundItem.isDisplayed());

        driver.close();
    }
}
