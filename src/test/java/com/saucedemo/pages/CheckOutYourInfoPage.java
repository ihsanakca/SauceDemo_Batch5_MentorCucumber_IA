package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckOutYourInfoPage extends BasePage{

    @FindBy (css = ".input_error.form_input")
    public List<WebElement>  formBoxes;


    public void fillForm(String name, String surname, String zip){
        formBoxes.get(0).sendKeys(name);
        formBoxes.get(1).sendKeys(surname);
        formBoxes.get(2).sendKeys(zip);

    }

}
