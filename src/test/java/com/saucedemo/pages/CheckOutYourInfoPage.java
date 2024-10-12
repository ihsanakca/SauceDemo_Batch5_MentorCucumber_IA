package com.saucedemo.pages;

import com.saucedemo.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutYourInfoPage extends BasePage{

    @FindBy (css = ".input_error.form_input")
    public List<WebElement>  formBoxes;


    public void fillForm(String name, String surname, String zip){
        BrowserUtils.waitFor(2);
        formBoxes.get(0).sendKeys(name);
        BrowserUtils.waitFor(2);
        formBoxes.get(1).sendKeys(surname);
        BrowserUtils.waitFor(2);
        formBoxes.get(2).sendKeys(zip);
        BrowserUtils.waitFor(2);

    }

}
