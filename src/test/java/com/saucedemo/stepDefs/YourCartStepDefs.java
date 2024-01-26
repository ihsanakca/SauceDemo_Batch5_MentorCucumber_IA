package com.saucedemo.stepDefs;

import com.saucedemo.pages.YourCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class YourCartStepDefs {
    YourCartPage yourCartPage=new YourCartPage();
    @Then("The user should be able to see the items on the page that added before")
    public void the_user_should_be_able_to_see_the_items_on_the_page_that_added_before(List<String> expectedItems) {
        yourCartPage.verifyCartItems(expectedItems);
    }

    @When("The user navigate to page with related button : {string}")
    public void the_user_navigate_to_page_with_related_button(String buttonName) {
        yourCartPage.clickButton(buttonName);
    }
}
