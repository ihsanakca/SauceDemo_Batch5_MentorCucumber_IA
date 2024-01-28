package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckoutOverviewPage extends BasePage{

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    public List<WebElement> listOfTotalItems;


    public void verifyNumberOfItems(){
        int actualNumber=listOfTotalItems.size();
        int expectedNumber=ProductsPage.count;
        Assert.assertEquals(expectedNumber,actualNumber);
    }
}

