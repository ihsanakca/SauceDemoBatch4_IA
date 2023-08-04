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
    Then The number on the basket icon should show added item number
