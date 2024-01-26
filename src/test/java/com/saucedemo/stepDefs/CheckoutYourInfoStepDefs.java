package com.saucedemo.stepDefs;

import com.saucedemo.pages.CheckOutYourInfoPage;
import io.cucumber.java.en.When;

public class CheckoutYourInfoStepDefs {
    CheckOutYourInfoPage checkOutYourInfoPage = new CheckOutYourInfoPage();
    @When("The user fills the form with : {string}, {string} and {string}")
    public void the_user_fills_the_form_with_and(String name, String surname, String zipCode) {
        checkOutYourInfoPage.fillForm(name, surname, zipCode);
    }
}
