package com.saucedemo.stepDefs;

import com.saucedemo.pages.CheckoutCompletePage;
import io.cucumber.java.en.Then;

public class CheckoutCompleteStepDefs {

    CheckoutCompletePage checkoutCompletePage =new CheckoutCompletePage();
    @Then("The user should take success shopping message: {string}")
    public void the_user_should_take_success_shopping_message(String expectedMessage) {
       checkoutCompletePage.verifySuccessShoppingWithMessage(expectedMessage);
    }
}
