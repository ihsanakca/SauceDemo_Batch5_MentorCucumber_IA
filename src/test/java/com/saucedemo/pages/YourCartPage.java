package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage{
    @FindBy (css = ".inventory_item_name")
    List<WebElement> addedItemList;

    public void verifyCartItems(List<String> expectedList){
        List<String> actualList = BrowserUtils.getElementsText(addedItemList);
        Assert.assertEquals(expectedList,actualList);
    }

    public void clickButton(String buttonName){
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.name(buttonName)).click();
    }
}
