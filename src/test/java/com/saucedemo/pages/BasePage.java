package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import com.saucedemo.utilities.Driver;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = ".shopping_cart_badge")
    public WebElement basketQuantity;

    @FindBy(css = ".shopping_cart_link")
    public WebElement cartLink;


    public String getPageTitle(String pageTitle){
        return Driver.get().findElement(By.xpath("//span[text()='"+pageTitle+"']")).getText();
    }

    public void verifyBasketQuantity(){
        String actualQuantity = basketQuantity.getText();
        int expectedQuantity = ProductsPage.count;
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedQuantity,Integer.parseInt(actualQuantity));
    }


}
