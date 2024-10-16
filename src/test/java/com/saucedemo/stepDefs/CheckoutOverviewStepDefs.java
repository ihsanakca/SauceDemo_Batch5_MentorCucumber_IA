package com.saucedemo.stepDefs;

import com.saucedemo.pages.CheckoutOverviewPage;
import com.saucedemo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;

public class CheckoutOverviewStepDefs {

    CheckoutOverviewPage checkoutOverviewPage =new CheckoutOverviewPage();
    @Then("The user should be able to verify number of items on the bill")
    public void the_user_should_be_able_to_verify_number_of_items_on_the_bill() {
        BrowserUtils.waitFor(2);
       checkoutOverviewPage.verifyNumberOfItems();
        BrowserUtils.waitFor(2);
    }
}
