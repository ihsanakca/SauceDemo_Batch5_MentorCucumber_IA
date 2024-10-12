package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    @FindBy (tagName = "input")
    private List <WebElement> loginPageInputs;

    public void login(String username, String password){
        BrowserUtils.waitFor(2);
        loginPageInputs.get(0).sendKeys(username);
        BrowserUtils.waitFor(2);
        loginPageInputs.get(1).sendKeys(password);
        BrowserUtils.waitFor(2);
        loginPageInputs.get(2).click();
    }
}
