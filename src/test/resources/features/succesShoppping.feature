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