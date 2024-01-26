Feature: Success Shopping E2E Test

  Background:
    * The user is on the login page
    * The user type in valid credentials "standard_user" and "secret_sauce"
    * The user should be able to see page title : "Products"

  @wip
  Scenario: Positive Success Shopping E2E Test_1
    When The user should be able to sort items with order type : "Price (high to low)"
    Then The user verifies the correct sort with first item name : "Sauce Labs Fleece Jacket"
    When The user should be able to add item with item name : "Sauce Labs Fleece Jacket"
    When The user should be able to add item with item name : "Sauce Labs Bike Light"
    When The user should be able to add item with item name : "Test.allTheThings() T-Shirt (Red)"
    Then The number on the basket icon should show added item quantity
    When The user navigate to your cart page
    Then The user should be able to see page title : "Your Cart"
    And The user should be able to see the items on the page that added before
      | Sauce Labs Fleece Jacket          |
      | Sauce Labs Bike Light             |
      | Test.allTheThings() T-Shirt (Red) |
    When The user navigate to page with related button : "checkout"
    Then The user should be able to see page title : "Checkout: Your Information"
    When The user fills the form with : "Selim", "Gezer" and "35920"
    When The user navigate to page with related button : "continue"
    Then The user should be able to see page title : "Checkout: Overview"