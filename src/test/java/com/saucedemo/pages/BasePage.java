package com.saucedemo.pages;

import com.saucedemo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    public String getPageTitle(String pageTitle){
        return Driver.get().findElement(By.xpath("//span[text()='"+pageTitle+"']")).getText();
    }
}
