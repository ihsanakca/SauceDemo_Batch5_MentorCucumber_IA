package com.saucedemo.stepDefs;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductsStepDefs {
    ProductsPage productsPage =new ProductsPage();
    @Then("The user should be able to see page title : {string}")
    public void the_user_should_be_able_to_see_page_title(String pageTitle) {
        String actualTitle = productsPage.getPageTitle(pageTitle);
        Assert.assertEquals(pageTitle,actualTitle);
    }

    @When("The user should be able to sort items with order type : {string}")
    public void the_user_should_be_able_to_sort_items_with_order_type(String orderType) {
        productsPage.orderItem(orderType);
    }
    @Then("The user verifies the correct sort with first item name : {string}")
    public void the_user_verifies_the_correct_sort_with_first_item_name(String expectedFirstItem) {
        String actualFirstItem = productsPage.getFirstItemText();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(expectedFirstItem,actualFirstItem);
    }
    @When("The user should be able to add item with item name : {string}")
    public void the_user_should_be_able_to_add_item_with_item_name(String itemName) {
        productsPage.addItem(itemName);
    }

    @Then("The number on the basket icon should show added item quantity")
    public void the_number_on_the_basket_icon_should_show_added_item_quantity() {
        productsPage.verifyBasketQuantity();
    }

    @When("The user navigate to your cart page")
    public void the_user_navigate_to_your_cart_page() {
       productsPage.cartLink.click();
    }

}
