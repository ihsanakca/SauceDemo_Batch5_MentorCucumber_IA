package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage{
   static int count=0;

    @FindBy(css = ".product_sort_container")
    public WebElement sortItemDropDown;

    @FindBy(xpath = "(//div[@class='inventory_item_name '])[1]")
    public WebElement firstItem;




    public void orderItem(String orderType){
        Select select=new Select(sortItemDropDown);
        select.selectByVisibleText(orderType);
    }

    public String getFirstItemText(){
        return firstItem.getText();
    }
    public void addItem(String itemName){
        Driver.get().findElement(By
                .xpath("//div[text()='"+itemName+"']/ancestor::*[@*='inventory_item_description']//button")).click();
        count++;
    }
}
