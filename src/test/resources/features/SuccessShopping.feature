Feature: Success Shopping E2E Tests

  Background:
    Given The user is on the login page
    When The user type in valid credentials "standard_user" and "secret_sauce"
    Then The user should be able to see page title : "Products"

  @wip
  Scenario: Positive Success Shopping E2E Test
    When The user should be able to sort items with order type : "Price (high to low)"
    And The user should be able to add items to cart with item name : "Sauce Labs Onesie"
    And The user should be able to add items to cart with item name : "Sauce Labs Backpack"
    And The user should be able to add items to cart with item name : "Sauce Labs Fleece Jacket"
    Then The number on the basket icon should show added item number
    When The user navigate to your cart page
    Then The user should be able to see page title : "Your Cart"
    And The user should see the items on the page that added before
      | Sauce Labs Onesie        |
      | Sauce Labs Backpack      |
      | Sauce Labs Fleece Jacket |
    When The user should be able to delete items from cart with item name :"Sauce Labs Fleece Jacket"
    When The user should be able to delete items from cart with item name :"Sauce Labs Backpack"
    Then The number on the basket icon should show added item number
    When The user navigate to page with related button: "checkout"
    Then The user should be able to see page title : "Checkout: Your Information"
    When The user should be able to fill form with: "Selim", "Gezer" and "35400"
    And  The user navigate to page with related button: "continue"
    Then The user should be able to see page title : "Checkout: Overview"
    And  The user navigate to page with related button: "finish"
    Then The user should be able to see page title : "Checkout: Complete!"
    And The user should take success shopping message: "Thank you for your order!"
