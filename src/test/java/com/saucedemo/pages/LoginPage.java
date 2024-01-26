package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy (tagName = "input")
    private List <WebElement> loginPageInputs;

    public void login(String username, String password){
        loginPageInputs.get(0).sendKeys(username);
        loginPageInputs.get(1).sendKeys(password);
        loginPageInputs.get(2).click();
    }
}
